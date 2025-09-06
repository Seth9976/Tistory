package kotlinx.serialization.json;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.StringFormat;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.internal.DescriptorSchemaCache;
import kotlinx.serialization.json.internal.JsonStreamsKt;
import kotlinx.serialization.json.internal.JsonToStringWriter;
import kotlinx.serialization.json.internal.StreamingJsonDecoder;
import kotlinx.serialization.json.internal.StringJsonLexer;
import kotlinx.serialization.json.internal.TreeJsonDecoderKt;
import kotlinx.serialization.json.internal.TreeJsonEncoderKt;
import kotlinx.serialization.json.internal.WriteMode;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;
import org.intellij.lang.annotations.Language;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 +2\u00020\u0001:\u0001+J)\u0010\u0007\u001A\u00020\u0006\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001A\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\n\u001A\u00028\u0000\"\u0006\b\u0000\u0010\u0002\u0018\u00012\b\b\u0001\u0010\t\u001A\u00020\u0006H\u0086\b¢\u0006\u0004\b\n\u0010\u000BJ+\u0010\n\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\r\u001A\b\u0012\u0004\u0012\u00028\u00000\f2\b\b\u0001\u0010\t\u001A\u00020\u0006¢\u0006\u0004\b\n\u0010\u000EJ)\u0010\u0010\u001A\u00020\u000F\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001A\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0013\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\r\u001A\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u0012\u001A\u00020\u000F¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001A\u00020\u000F2\b\b\u0001\u0010\t\u001A\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001C\u001A\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001BR\u001A\u0010\"\u001A\u00020\u001D8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!R \u0010*\u001A\u00020#8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b(\u0010)\u001A\u0004\b&\u0010\'\u0082\u0001\u0002,-¨\u0006."}, d2 = {"Lkotlinx/serialization/json/Json;", "Lkotlinx/serialization/StringFormat;", "T", "Lkotlinx/serialization/SerializationStrategy;", "serializer", "value", "", "encodeToString", "(Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;", "string", "decodeFromString", "(Ljava/lang/String;)Ljava/lang/Object;", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "(Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;", "Lkotlinx/serialization/json/JsonElement;", "encodeToJsonElement", "(Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;", "element", "decodeFromJsonElement", "(Lkotlinx/serialization/DeserializationStrategy;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;", "parseToJsonElement", "(Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;", "Lkotlinx/serialization/json/JsonConfiguration;", "a", "Lkotlinx/serialization/json/JsonConfiguration;", "getConfiguration", "()Lkotlinx/serialization/json/JsonConfiguration;", "configuration", "Lkotlinx/serialization/modules/SerializersModule;", "b", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "serializersModule", "Lkotlinx/serialization/json/internal/DescriptorSchemaCache;", "c", "Lkotlinx/serialization/json/internal/DescriptorSchemaCache;", "get_schemaCache$kotlinx_serialization_json", "()Lkotlinx/serialization/json/internal/DescriptorSchemaCache;", "get_schemaCache$kotlinx_serialization_json$annotations", "()V", "_schemaCache", "Default", "Lkotlinx/serialization/json/Json$Default;", "Lig/d;", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class Json implements StringFormat {
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/Json$Default;", "Lkotlinx/serialization/json/Json;", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Default extends Json {
        public Default(DefaultConstructorMarker defaultConstructorMarker0) {
            super(new JsonConfiguration(false, false, false, false, false, false, null, false, false, null, false, false, null, false, false, null, 0xFFFF, null), SerializersModuleBuildersKt.EmptySerializersModule(), null);
        }
    }

    @NotNull
    public static final Default Default;
    public final JsonConfiguration a;
    public final SerializersModule b;
    public final DescriptorSchemaCache c;

    static {
        Json.Default = new Default(null);
    }

    public Json(JsonConfiguration jsonConfiguration0, SerializersModule serializersModule0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = jsonConfiguration0;
        this.b = serializersModule0;
        this.c = new DescriptorSchemaCache();
    }

    public final Object decodeFromJsonElement(@NotNull DeserializationStrategy deserializationStrategy0, @NotNull JsonElement jsonElement0) {
        Intrinsics.checkNotNullParameter(deserializationStrategy0, "deserializer");
        Intrinsics.checkNotNullParameter(jsonElement0, "element");
        return TreeJsonDecoderKt.readJson(this, jsonElement0, deserializationStrategy0);
    }

    public final Object decodeFromString(@Language(prefix = "", suffix = "", value = "json") String s) {
        Intrinsics.checkNotNullParameter(s, "string");
        Intrinsics.reifiedOperationMarker(6, "T");
        return this.decodeFromString(SerializersKt.serializer(this.getSerializersModule(), null), s);
    }

    @Override  // kotlinx.serialization.StringFormat
    public final Object decodeFromString(@NotNull DeserializationStrategy deserializationStrategy0, @Language(prefix = "", suffix = "", value = "json") @NotNull String s) {
        Intrinsics.checkNotNullParameter(deserializationStrategy0, "deserializer");
        Intrinsics.checkNotNullParameter(s, "string");
        StringJsonLexer stringJsonLexer0 = new StringJsonLexer(s);
        SerialDescriptor serialDescriptor0 = deserializationStrategy0.getDescriptor();
        Object object0 = new StreamingJsonDecoder(this, WriteMode.OBJ, stringJsonLexer0, serialDescriptor0, null).decodeSerializableValue(deserializationStrategy0);
        stringJsonLexer0.expectEof();
        return object0;
    }

    @NotNull
    public final JsonElement encodeToJsonElement(@NotNull SerializationStrategy serializationStrategy0, Object object0) {
        Intrinsics.checkNotNullParameter(serializationStrategy0, "serializer");
        return TreeJsonEncoderKt.writeJson(this, object0, serializationStrategy0);
    }

    @Override  // kotlinx.serialization.StringFormat
    @NotNull
    public final String encodeToString(@NotNull SerializationStrategy serializationStrategy0, Object object0) {
        Intrinsics.checkNotNullParameter(serializationStrategy0, "serializer");
        JsonToStringWriter jsonToStringWriter0 = new JsonToStringWriter();
        try {
            JsonStreamsKt.encodeByWriter(this, jsonToStringWriter0, serializationStrategy0, object0);
            return "";
        }
        finally {
            jsonToStringWriter0.release();
        }
    }

    @NotNull
    public final JsonConfiguration getConfiguration() {
        return this.a;
    }

    @Override  // kotlinx.serialization.SerialFormat
    @NotNull
    public SerializersModule getSerializersModule() {
        return this.b;
    }

    @NotNull
    public final DescriptorSchemaCache get_schemaCache$kotlinx_serialization_json() {
        return this.c;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Should not be accessed directly, use Json.schemaCache accessor instead", replaceWith = @ReplaceWith(expression = "schemaCache", imports = {}))
    public static void get_schemaCache$kotlinx_serialization_json$annotations() {
    }

    @NotNull
    public final JsonElement parseToJsonElement(@Language(prefix = "", suffix = "", value = "json") @NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "string");
        return (JsonElement)this.decodeFromString(JsonElementSerializer.INSTANCE, s);
    }
}

