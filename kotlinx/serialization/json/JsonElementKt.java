package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.n;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.InlineClassDescriptorKt;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;
import kotlinx.serialization.json.internal.StringJsonLexer;
import kotlinx.serialization.json.internal.StringOpsKt;
import kotlinx.serialization.json.internal.SuppressAnimalSniffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0010\u001A\u0017\u0010\u0003\u001A\u00020\u00022\b\u0010\u0001\u001A\u0004\u0018\u00010\u0000\u00A2\u0006\u0004\b\u0003\u0010\u0004\u001A\u0017\u0010\u0003\u001A\u00020\u00022\b\u0010\u0001\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\u0004\b\u0003\u0010\u0006\u001A\u001A\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0007H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\b\u0010\t\u001A\u001A\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\nH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u000B\u0010\f\u001A\u001A\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\rH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u000E\u0010\u000F\u001A\u001A\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0010H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0011\u0010\u0012\u001A\u0017\u0010\u0003\u001A\u00020\u00022\b\u0010\u0001\u001A\u0004\u0018\u00010\u0013\u00A2\u0006\u0004\b\u0003\u0010\u0014\u001A\u0019\u0010\u0003\u001A\u00020\u00162\b\u0010\u0001\u001A\u0004\u0018\u00010\u0015H\u0007\u00A2\u0006\u0004\b\u0003\u0010\u0017\u001A\u0019\u0010\u0018\u001A\u00020\u00022\b\u0010\u0001\u001A\u0004\u0018\u00010\u0013H\u0007\u00A2\u0006\u0004\b\u0018\u0010\u0014\u001A\u001F\u0010\u001B\u001A\u00020\u00152\u0006\u0010\u0019\u001A\u00020\u00132\u0006\u0010\u001A\u001A\u00020\u0013H\u0001\u00A2\u0006\u0004\b\u001B\u0010\u001C\"\u001A\u0010\"\u001A\u00020\u001D8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!\"\u0015\u0010&\u001A\u00020\u0002*\u00020#8F\u00A2\u0006\u0006\u001A\u0004\b$\u0010%\"\u0015\u0010*\u001A\u00020\'*\u00020#8F\u00A2\u0006\u0006\u001A\u0004\b(\u0010)\"\u0015\u0010.\u001A\u00020+*\u00020#8F\u00A2\u0006\u0006\u001A\u0004\b,\u0010-\"\u0015\u00101\u001A\u00020\u0016*\u00020#8F\u00A2\u0006\u0006\u001A\u0004\b/\u00100\"\u0015\u00105\u001A\u000202*\u00020\u00028F\u00A2\u0006\u0006\u001A\u0004\b3\u00104\"\u0017\u00108\u001A\u0004\u0018\u000102*\u00020\u00028F\u00A2\u0006\u0006\u001A\u0004\b6\u00107\"\u0015\u0010<\u001A\u000209*\u00020\u00028F\u00A2\u0006\u0006\u001A\u0004\b:\u0010;\"\u0017\u0010?\u001A\u0004\u0018\u000109*\u00020\u00028F\u00A2\u0006\u0006\u001A\u0004\b=\u0010>\"\u0015\u0010C\u001A\u00020@*\u00020\u00028F\u00A2\u0006\u0006\u001A\u0004\bA\u0010B\"\u0017\u0010F\u001A\u0004\u0018\u00010@*\u00020\u00028F\u00A2\u0006\u0006\u001A\u0004\bD\u0010E\"\u0015\u0010J\u001A\u00020G*\u00020\u00028F\u00A2\u0006\u0006\u001A\u0004\bH\u0010I\"\u0017\u0010M\u001A\u0004\u0018\u00010G*\u00020\u00028F\u00A2\u0006\u0006\u001A\u0004\bK\u0010L\"\u0015\u0010P\u001A\u00020\u0000*\u00020\u00028F\u00A2\u0006\u0006\u001A\u0004\bN\u0010O\"\u0017\u0010S\u001A\u0004\u0018\u00010\u0000*\u00020\u00028F\u00A2\u0006\u0006\u001A\u0004\bQ\u0010R\"\u0017\u0010V\u001A\u0004\u0018\u00010\u0013*\u00020\u00028F\u00A2\u0006\u0006\u001A\u0004\bT\u0010U\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006W"}, d2 = {"", "value", "Lkotlinx/serialization/json/JsonPrimitive;", "JsonPrimitive", "(Ljava/lang/Boolean;)Lkotlinx/serialization/json/JsonPrimitive;", "", "(Ljava/lang/Number;)Lkotlinx/serialization/json/JsonPrimitive;", "Lkotlin/UByte;", "JsonPrimitive-7apg3OU", "(B)Lkotlinx/serialization/json/JsonPrimitive;", "Lkotlin/UShort;", "JsonPrimitive-xj2QHRw", "(S)Lkotlinx/serialization/json/JsonPrimitive;", "Lkotlin/UInt;", "JsonPrimitive-WZ4Q5Ns", "(I)Lkotlinx/serialization/json/JsonPrimitive;", "Lkotlin/ULong;", "JsonPrimitive-VKZWuLQ", "(J)Lkotlinx/serialization/json/JsonPrimitive;", "", "(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;", "", "Lkotlinx/serialization/json/JsonNull;", "(Ljava/lang/Void;)Lkotlinx/serialization/json/JsonNull;", "JsonUnquotedLiteral", "key", "expected", "unexpectedJson", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Void;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "a", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getJsonUnquotedLiteralDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "jsonUnquotedLiteralDescriptor", "Lkotlinx/serialization/json/JsonElement;", "getJsonPrimitive", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;", "jsonPrimitive", "Lkotlinx/serialization/json/JsonObject;", "getJsonObject", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;", "jsonObject", "Lkotlinx/serialization/json/JsonArray;", "getJsonArray", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonArray;", "jsonArray", "getJsonNull", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonNull;", "jsonNull", "", "getInt", "(Lkotlinx/serialization/json/JsonPrimitive;)I", "int", "getIntOrNull", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Integer;", "intOrNull", "", "getLong", "(Lkotlinx/serialization/json/JsonPrimitive;)J", "long", "getLongOrNull", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Long;", "longOrNull", "", "getDouble", "(Lkotlinx/serialization/json/JsonPrimitive;)D", "double", "getDoubleOrNull", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Double;", "doubleOrNull", "", "getFloat", "(Lkotlinx/serialization/json/JsonPrimitive;)F", "float", "getFloatOrNull", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Float;", "floatOrNull", "getBoolean", "(Lkotlinx/serialization/json/JsonPrimitive;)Z", "boolean", "getBooleanOrNull", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Boolean;", "booleanOrNull", "getContentOrNull", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;", "contentOrNull", "kotlinx-serialization-json"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nJsonElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonElement.kt\nkotlinx/serialization/json/JsonElementKt\n*L\n1#1,347:1\n337#1,4:348\n329#1,4:352\n337#1,4:356\n329#1,4:360\n*S KotlinDebug\n*F\n+ 1 JsonElement.kt\nkotlinx/serialization/json/JsonElementKt\n*L\n258#1:348,4\n268#1:352,4\n277#1:356,4\n284#1:360,4\n*E\n"})
public final class JsonElementKt {
    public static final SerialDescriptor a;

    static {
        JsonElementKt.a = InlineClassDescriptorKt.InlinePrimitiveDescriptor("kotlinx.serialization.json.JsonUnquotedLiteral", BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE));
    }

    @ExperimentalSerializationApi
    @NotNull
    public static final JsonNull JsonPrimitive(@Nullable Void void0) {
        return JsonNull.INSTANCE;
    }

    @NotNull
    public static final JsonPrimitive JsonPrimitive(@Nullable Boolean boolean0) {
        return boolean0 == null ? JsonNull.INSTANCE : new JsonLiteral(boolean0, false, null, 4, null);
    }

    @NotNull
    public static final JsonPrimitive JsonPrimitive(@Nullable Number number0) {
        return number0 == null ? JsonNull.INSTANCE : new JsonLiteral(number0, false, null, 4, null);
    }

    @NotNull
    public static final JsonPrimitive JsonPrimitive(@Nullable String s) {
        return s == null ? JsonNull.INSTANCE : new JsonLiteral(s, true, null, 4, null);
    }

    @ExperimentalSerializationApi
    @NotNull
    public static final JsonPrimitive JsonPrimitive-7apg3OU(byte b) {
        return JsonElementKt.JsonPrimitive-VKZWuLQ(((long)b) & 0xFFL);
    }

    @ExperimentalSerializationApi
    @SuppressAnimalSniffer
    @NotNull
    public static final JsonPrimitive JsonPrimitive-VKZWuLQ(long v) {
        return JsonElementKt.JsonUnquotedLiteral(Long.toUnsignedString(v));
    }

    @ExperimentalSerializationApi
    @NotNull
    public static final JsonPrimitive JsonPrimitive-WZ4Q5Ns(int v) {
        return JsonElementKt.JsonPrimitive-VKZWuLQ(((long)v) & 0xFFFFFFFFL);
    }

    @ExperimentalSerializationApi
    @NotNull
    public static final JsonPrimitive JsonPrimitive-xj2QHRw(short v) {
        return JsonElementKt.JsonPrimitive-VKZWuLQ(((long)v) & 0xFFFFL);
    }

    @ExperimentalSerializationApi
    @NotNull
    public static final JsonPrimitive JsonUnquotedLiteral(@Nullable String s) {
        if(s == null) {
            return JsonNull.INSTANCE;
        }
        if(Intrinsics.areEqual(s, "null")) {
            throw new JsonEncodingException("Creating a literal unquoted value of \'null\' is forbidden. If you want to create JSON null literal, use JsonNull object, otherwise, use JsonPrimitive");
        }
        return new JsonLiteral(s, false, JsonElementKt.a);
    }

    public static final void a(String s, JsonElement jsonElement0) {
        throw new IllegalArgumentException("Element " + Reflection.getOrCreateKotlinClass(jsonElement0.getClass()) + " is not a " + s);
    }

    public static final boolean getBoolean(@NotNull JsonPrimitive jsonPrimitive0) {
        Intrinsics.checkNotNullParameter(jsonPrimitive0, "<this>");
        Boolean boolean0 = StringOpsKt.toBooleanStrictOrNull(jsonPrimitive0.getContent());
        if(boolean0 == null) {
            throw new IllegalStateException(jsonPrimitive0 + " does not represent a Boolean");
        }
        return boolean0.booleanValue();
    }

    @Nullable
    public static final Boolean getBooleanOrNull(@NotNull JsonPrimitive jsonPrimitive0) {
        Intrinsics.checkNotNullParameter(jsonPrimitive0, "<this>");
        return StringOpsKt.toBooleanStrictOrNull(jsonPrimitive0.getContent());
    }

    @Nullable
    public static final String getContentOrNull(@NotNull JsonPrimitive jsonPrimitive0) {
        Intrinsics.checkNotNullParameter(jsonPrimitive0, "<this>");
        return jsonPrimitive0 instanceof JsonNull ? null : jsonPrimitive0.getContent();
    }

    public static final double getDouble(@NotNull JsonPrimitive jsonPrimitive0) {
        Intrinsics.checkNotNullParameter(jsonPrimitive0, "<this>");
        return Double.parseDouble(jsonPrimitive0.getContent());
    }

    @Nullable
    public static final Double getDoubleOrNull(@NotNull JsonPrimitive jsonPrimitive0) {
        Intrinsics.checkNotNullParameter(jsonPrimitive0, "<this>");
        return n.toDoubleOrNull(jsonPrimitive0.getContent());
    }

    public static final float getFloat(@NotNull JsonPrimitive jsonPrimitive0) {
        Intrinsics.checkNotNullParameter(jsonPrimitive0, "<this>");
        return Float.parseFloat(jsonPrimitive0.getContent());
    }

    @Nullable
    public static final Float getFloatOrNull(@NotNull JsonPrimitive jsonPrimitive0) {
        Intrinsics.checkNotNullParameter(jsonPrimitive0, "<this>");
        return n.toFloatOrNull(jsonPrimitive0.getContent());
    }

    public static final int getInt(@NotNull JsonPrimitive jsonPrimitive0) {
        long v;
        Intrinsics.checkNotNullParameter(jsonPrimitive0, "<this>");
        try {
            v = new StringJsonLexer(jsonPrimitive0.getContent()).consumeNumericLiteral();
        }
        catch(JsonDecodingException jsonDecodingException0) {
            throw new NumberFormatException(jsonDecodingException0.getMessage());
        }
        if(0xFFFFFFFF80000000L > v || v > 0x7FFFFFFFL) {
            throw new NumberFormatException(jsonPrimitive0.getContent() + " is not an Int");
        }
        return (int)v;
    }

    @Nullable
    public static final Integer getIntOrNull(@NotNull JsonPrimitive jsonPrimitive0) {
        Long long0;
        Intrinsics.checkNotNullParameter(jsonPrimitive0, "<this>");
        try {
            long0 = null;
            long0 = new StringJsonLexer(jsonPrimitive0.getContent()).consumeNumericLiteral();
        }
        catch(JsonDecodingException unused_ex) {
        }
        if(long0 != null) {
            long v = (long)long0;
            return 0xFFFFFFFF80000000L > v || v > 0x7FFFFFFFL ? null : ((int)v);
        }
        return null;
    }

    @NotNull
    public static final JsonArray getJsonArray(@NotNull JsonElement jsonElement0) {
        Intrinsics.checkNotNullParameter(jsonElement0, "<this>");
        JsonArray jsonArray0 = jsonElement0 instanceof JsonArray ? ((JsonArray)jsonElement0) : null;
        if(jsonArray0 != null) {
            return jsonArray0;
        }
        JsonElementKt.a("JsonArray", jsonElement0);
        throw null;
    }

    @NotNull
    public static final JsonNull getJsonNull(@NotNull JsonElement jsonElement0) {
        Intrinsics.checkNotNullParameter(jsonElement0, "<this>");
        JsonNull jsonNull0 = jsonElement0 instanceof JsonNull ? ((JsonNull)jsonElement0) : null;
        if(jsonNull0 != null) {
            return jsonNull0;
        }
        JsonElementKt.a("JsonNull", jsonElement0);
        throw null;
    }

    @NotNull
    public static final JsonObject getJsonObject(@NotNull JsonElement jsonElement0) {
        Intrinsics.checkNotNullParameter(jsonElement0, "<this>");
        JsonObject jsonObject0 = jsonElement0 instanceof JsonObject ? ((JsonObject)jsonElement0) : null;
        if(jsonObject0 != null) {
            return jsonObject0;
        }
        JsonElementKt.a("JsonObject", jsonElement0);
        throw null;
    }

    @NotNull
    public static final JsonPrimitive getJsonPrimitive(@NotNull JsonElement jsonElement0) {
        Intrinsics.checkNotNullParameter(jsonElement0, "<this>");
        JsonPrimitive jsonPrimitive0 = jsonElement0 instanceof JsonPrimitive ? ((JsonPrimitive)jsonElement0) : null;
        if(jsonPrimitive0 != null) {
            return jsonPrimitive0;
        }
        JsonElementKt.a("JsonPrimitive", jsonElement0);
        throw null;
    }

    @NotNull
    public static final SerialDescriptor getJsonUnquotedLiteralDescriptor() {
        return JsonElementKt.a;
    }

    public static final long getLong(@NotNull JsonPrimitive jsonPrimitive0) {
        Intrinsics.checkNotNullParameter(jsonPrimitive0, "<this>");
        try {
            return new StringJsonLexer(jsonPrimitive0.getContent()).consumeNumericLiteral();
        }
        catch(JsonDecodingException jsonDecodingException0) {
            throw new NumberFormatException(jsonDecodingException0.getMessage());
        }
    }

    @Nullable
    public static final Long getLongOrNull(@NotNull JsonPrimitive jsonPrimitive0) {
        Intrinsics.checkNotNullParameter(jsonPrimitive0, "<this>");
        try {
            return new StringJsonLexer(jsonPrimitive0.getContent()).consumeNumericLiteral();
        }
        catch(JsonDecodingException unused_ex) {
            return null;
        }
    }

    @PublishedApi
    @NotNull
    public static final Void unexpectedJson(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "key");
        Intrinsics.checkNotNullParameter(s1, "expected");
        throw new IllegalArgumentException("Element " + s + " is not a " + s1);
    }
}

