package kotlinx.serialization.json.internal;

import a5.b;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000B\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u001A\u001F\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001A\'\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007H\u0000¢\u0006\u0004\b\u0005\u0010\t\u001A\u001F\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\f\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u000E\u0010\u000F\u001A\u001B\u0010\u0013\u001A\u00020\u0012*\u00020\u00102\u0006\u0010\u0011\u001A\u00020\nH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001A\u001D\u0010\u0016\u001A\u00020\u0012*\u00020\u00102\b\b\u0002\u0010\u0015\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001A\u0017\u0010\u001A\u001A\u00020\r2\u0006\u0010\u0019\u001A\u00020\u0018H\u0000¢\u0006\u0004\b\u001A\u0010\u001B\u001A\'\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\u001C\u001A\u00020\u00022\u0006\u0010\f\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u000E\u0010\u001D\u001A\'\u0010\u001E\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\u001C\u001A\u00020\u00022\u0006\u0010\f\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u001E\u0010\u001F\u001A\u001F\u0010 \u001A\u00020\u00042\u0006\u0010\u001C\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0002H\u0000¢\u0006\u0004\b \u0010!\u001A\u001D\u0010\"\u001A\u00020\u0007*\u00020\u00072\b\b\u0002\u0010\u0001\u001A\u00020\u0000H\u0000¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"", "offset", "", "message", "Lkotlinx/serialization/json/internal/JsonDecodingException;", "JsonDecodingException", "(ILjava/lang/String;)Lkotlinx/serialization/json/internal/JsonDecodingException;", "", "input", "(ILjava/lang/String;Ljava/lang/CharSequence;)Lkotlinx/serialization/json/internal/JsonDecodingException;", "", "value", "output", "Lkotlinx/serialization/json/internal/JsonEncodingException;", "InvalidFloatingPointEncoded", "(Ljava/lang/Number;Ljava/lang/String;)Lkotlinx/serialization/json/internal/JsonEncodingException;", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "result", "", "throwInvalidFloatingPointDecoded", "(Lkotlinx/serialization/json/internal/AbstractJsonLexer;Ljava/lang/Number;)Ljava/lang/Void;", "entity", "invalidTrailingComma", "(Lkotlinx/serialization/json/internal/AbstractJsonLexer;Ljava/lang/String;)Ljava/lang/Void;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "keyDescriptor", "InvalidKeyKindException", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/json/internal/JsonEncodingException;", "key", "(Ljava/lang/Number;Ljava/lang/String;Ljava/lang/String;)Lkotlinx/serialization/json/internal/JsonEncodingException;", "InvalidFloatingPointDecoded", "(Ljava/lang/Number;Ljava/lang/String;Ljava/lang/String;)Lkotlinx/serialization/json/internal/JsonDecodingException;", "UnknownKeyException", "(Ljava/lang/String;Ljava/lang/String;)Lkotlinx/serialization/json/internal/JsonDecodingException;", "minify", "(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;", "kotlinx-serialization-json"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class JsonExceptionsKt {
    @NotNull
    public static final JsonDecodingException InvalidFloatingPointDecoded(@NotNull Number number0, @NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(number0, "value");
        Intrinsics.checkNotNullParameter(s, "key");
        Intrinsics.checkNotNullParameter(s1, "output");
        return JsonExceptionsKt.JsonDecodingException(-1, JsonExceptionsKt.a(number0, s, s1));
    }

    @NotNull
    public static final JsonEncodingException InvalidFloatingPointEncoded(@NotNull Number number0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(number0, "value");
        Intrinsics.checkNotNullParameter(s, "output");
        return new JsonEncodingException("Unexpected special floating-point value " + number0 + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using \'JsonBuilder.allowSpecialFloatingPointValues = true\'\nCurrent output: " + JsonExceptionsKt.minify$default(s, 0, 1, null));
    }

    @NotNull
    public static final JsonEncodingException InvalidFloatingPointEncoded(@NotNull Number number0, @NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(number0, "value");
        Intrinsics.checkNotNullParameter(s, "key");
        Intrinsics.checkNotNullParameter(s1, "output");
        return new JsonEncodingException(JsonExceptionsKt.a(number0, s, s1));
    }

    @NotNull
    public static final JsonEncodingException InvalidKeyKindException(@NotNull SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "keyDescriptor");
        return new JsonEncodingException("Value of type \'" + serialDescriptor0.getSerialName() + "\' can\'t be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is \'" + serialDescriptor0.getKind() + "\'.\nUse \'allowStructuredMapKeys = true\' in \'Json {}\' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    @NotNull
    public static final JsonDecodingException JsonDecodingException(int v, @NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "message");
        if(v >= 0) {
            s = "Unexpected JSON token at offset " + v + ": " + s;
        }
        return new JsonDecodingException(s);
    }

    @NotNull
    public static final JsonDecodingException JsonDecodingException(int v, @NotNull String s, @NotNull CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(s, "message");
        Intrinsics.checkNotNullParameter(charSequence0, "input");
        return JsonExceptionsKt.JsonDecodingException(v, s + "\nJSON input: " + JsonExceptionsKt.minify(charSequence0, v));
    }

    @NotNull
    public static final JsonDecodingException UnknownKeyException(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "key");
        Intrinsics.checkNotNullParameter(s1, "input");
        return JsonExceptionsKt.JsonDecodingException(-1, "Encountered an unknown key \'" + s + "\'.\nUse \'ignoreUnknownKeys = true\' in \'Json {}\' builder to ignore unknown keys.\nCurrent input: " + JsonExceptionsKt.minify$default(s1, 0, 1, null));
    }

    public static final String a(Number number0, String s, String s1) {
        return "Unexpected special floating-point value " + number0 + " with key " + s + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using \'JsonBuilder.allowSpecialFloatingPointValues = true\'\nCurrent output: " + JsonExceptionsKt.minify$default(s1, 0, 1, null);
    }

    @NotNull
    public static final Void invalidTrailingComma(@NotNull AbstractJsonLexer abstractJsonLexer0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(abstractJsonLexer0, "<this>");
        Intrinsics.checkNotNullParameter(s, "entity");
        abstractJsonLexer0.fail("Trailing comma before the end of JSON " + s, abstractJsonLexer0.currentPosition - 1, "Trailing commas are non-complaint JSON and not allowed by default. Use \'allowTrailingCommas = true\' in \'Json {}\' builder to support them.");
        throw new KotlinNothingValueException();
    }

    public static Void invalidTrailingComma$default(AbstractJsonLexer abstractJsonLexer0, String s, int v, Object object0) {
        if((v & 1) != 0) {
            s = "object";
        }
        return JsonExceptionsKt.invalidTrailingComma(abstractJsonLexer0, s);
    }

    @NotNull
    public static final CharSequence minify(@NotNull CharSequence charSequence0, int v) {
        String s = ".....";
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        if(charSequence0.length() < 200) {
            return charSequence0;
        }
        if(v == -1) {
            int v1 = charSequence0.length();
            return v1 - 60 <= 0 ? charSequence0 : "....." + charSequence0.subSequence(v1 - 60, charSequence0.length()).toString();
        }
        if(v + 30 >= charSequence0.length()) {
            s = "";
        }
        StringBuilder stringBuilder0 = b.t((v - 30 > 0 ? "....." : ""));
        stringBuilder0.append(charSequence0.subSequence(c.coerceAtLeast(v - 30, 0), c.coerceAtMost(v + 30, charSequence0.length())).toString());
        stringBuilder0.append(s);
        return stringBuilder0.toString();
    }

    public static CharSequence minify$default(CharSequence charSequence0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = -1;
        }
        return JsonExceptionsKt.minify(charSequence0, v);
    }

    @NotNull
    public static final Void throwInvalidFloatingPointDecoded(@NotNull AbstractJsonLexer abstractJsonLexer0, @NotNull Number number0) {
        Intrinsics.checkNotNullParameter(abstractJsonLexer0, "<this>");
        Intrinsics.checkNotNullParameter(number0, "result");
        AbstractJsonLexer.fail$default(abstractJsonLexer0, "Unexpected special floating-point value " + number0 + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using \'JsonBuilder.allowSpecialFloatingPointValues = true\'", 2, null);
        throw new KotlinNothingValueException();
    }
}

