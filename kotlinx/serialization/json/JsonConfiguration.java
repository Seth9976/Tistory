package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b5\u0018\u00002\u00020\u0001B\u00AB\u0001\b\u0000\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0002\u0012\b\b\u0002\u0010\b\u001A\u00020\u0002\u0012\b\b\u0002\u0010\n\u001A\u00020\t\u0012\b\b\u0002\u0010\u000B\u001A\u00020\u0002\u0012\b\b\u0002\u0010\f\u001A\u00020\u0002\u0012\b\b\u0002\u0010\r\u001A\u00020\t\u0012\b\b\u0002\u0010\u000E\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u000F\u001A\u00020\u0002\u0012\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001A\u00020\u0014\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u000F\u0010\u0018\u001A\u00020\tH\u0016\u00A2\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001DR\u0017\u0010\u0004\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u001E\u0010\u001B\u001A\u0004\b\u001F\u0010\u001DR\u0017\u0010\u0005\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b \u0010\u001B\u001A\u0004\b\u0005\u0010\u001DR\u0017\u0010\u0006\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b!\u0010\u001B\u001A\u0004\b\"\u0010\u001DR\u0017\u0010\u0007\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b#\u0010\u001B\u001A\u0004\b$\u0010\u001DR \u0010\b\u001A\u00020\u00028\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b%\u0010\u001B\u0012\u0004\b\'\u0010(\u001A\u0004\b&\u0010\u001DR \u0010\n\u001A\u00020\t8\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b,\u0010(\u001A\u0004\b+\u0010\u0019R\u0017\u0010\u000B\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b-\u0010\u001B\u001A\u0004\b.\u0010\u001DR\u0017\u0010\f\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b/\u0010\u001B\u001A\u0004\b0\u0010\u001DR\u0017\u0010\r\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\b1\u0010*\u001A\u0004\b2\u0010\u0019R\u0017\u0010\u000E\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b3\u0010\u001B\u001A\u0004\b4\u0010\u001DR\u0017\u0010\u000F\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b5\u0010\u001B\u001A\u0004\b6\u0010\u001DR\"\u0010\u0011\u001A\u0004\u0018\u00010\u00108\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b7\u00108\u0012\u0004\b;\u0010(\u001A\u0004\b9\u0010:R \u0010\u0012\u001A\u00020\u00028\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b<\u0010\u001B\u0012\u0004\b>\u0010(\u001A\u0004\b=\u0010\u001DR \u0010\u0013\u001A\u00020\u00028\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b?\u0010\u001B\u0012\u0004\bA\u0010(\u001A\u0004\b@\u0010\u001DR(\u0010\u0015\u001A\u00020\u00148\u0006@\u0006X\u0087\u000E\u00A2\u0006\u0018\n\u0004\bB\u0010C\u0012\u0004\bH\u0010(\u001A\u0004\bD\u0010E\"\u0004\bF\u0010G\u00A8\u0006I"}, d2 = {"Lkotlinx/serialization/json/JsonConfiguration;", "", "", "encodeDefaults", "ignoreUnknownKeys", "isLenient", "allowStructuredMapKeys", "prettyPrint", "explicitNulls", "", "prettyPrintIndent", "coerceInputValues", "useArrayPolymorphism", "classDiscriminator", "allowSpecialFloatingPointValues", "useAlternativeNames", "Lkotlinx/serialization/json/JsonNamingStrategy;", "namingStrategy", "decodeEnumsCaseInsensitive", "allowTrailingComma", "Lkotlinx/serialization/json/ClassDiscriminatorMode;", "classDiscriminatorMode", "<init>", "(ZZZZZZLjava/lang/String;ZZLjava/lang/String;ZZLkotlinx/serialization/json/JsonNamingStrategy;ZZLkotlinx/serialization/json/ClassDiscriminatorMode;)V", "toString", "()Ljava/lang/String;", "a", "Z", "getEncodeDefaults", "()Z", "b", "getIgnoreUnknownKeys", "c", "d", "getAllowStructuredMapKeys", "e", "getPrettyPrint", "f", "getExplicitNulls", "getExplicitNulls$annotations", "()V", "g", "Ljava/lang/String;", "getPrettyPrintIndent", "getPrettyPrintIndent$annotations", "h", "getCoerceInputValues", "i", "getUseArrayPolymorphism", "j", "getClassDiscriminator", "k", "getAllowSpecialFloatingPointValues", "l", "getUseAlternativeNames", "m", "Lkotlinx/serialization/json/JsonNamingStrategy;", "getNamingStrategy", "()Lkotlinx/serialization/json/JsonNamingStrategy;", "getNamingStrategy$annotations", "n", "getDecodeEnumsCaseInsensitive", "getDecodeEnumsCaseInsensitive$annotations", "o", "getAllowTrailingComma", "getAllowTrailingComma$annotations", "p", "Lkotlinx/serialization/json/ClassDiscriminatorMode;", "getClassDiscriminatorMode", "()Lkotlinx/serialization/json/ClassDiscriminatorMode;", "setClassDiscriminatorMode", "(Lkotlinx/serialization/json/ClassDiscriminatorMode;)V", "getClassDiscriminatorMode$annotations", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class JsonConfiguration {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final boolean k;
    public final boolean l;
    public final JsonNamingStrategy m;
    public final boolean n;
    public final boolean o;
    public ClassDiscriminatorMode p;

    public JsonConfiguration() {
        this(false, false, false, false, false, false, null, false, false, null, false, false, null, false, false, null, 0xFFFF, null);
    }

    public JsonConfiguration(boolean z, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5, @NotNull String s, boolean z6, boolean z7, @NotNull String s1, boolean z8, boolean z9, @Nullable JsonNamingStrategy jsonNamingStrategy0, boolean z10, boolean z11, @NotNull ClassDiscriminatorMode classDiscriminatorMode0) {
        Intrinsics.checkNotNullParameter(s, "prettyPrintIndent");
        Intrinsics.checkNotNullParameter(s1, "classDiscriminator");
        Intrinsics.checkNotNullParameter(classDiscriminatorMode0, "classDiscriminatorMode");
        super();
        this.a = z;
        this.b = z1;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = s;
        this.h = z6;
        this.i = z7;
        this.j = s1;
        this.k = z8;
        this.l = z9;
        this.m = jsonNamingStrategy0;
        this.n = z10;
        this.o = z11;
        this.p = classDiscriminatorMode0;
    }

    public JsonConfiguration(boolean z, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5, String s, boolean z6, boolean z7, String s1, boolean z8, boolean z9, JsonNamingStrategy jsonNamingStrategy0, boolean z10, boolean z11, ClassDiscriminatorMode classDiscriminatorMode0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        this(((v & 1) == 0 ? z : false), ((v & 2) == 0 ? z1 : false), ((v & 4) == 0 ? z2 : false), ((v & 8) == 0 ? z3 : false), ((v & 16) == 0 ? z4 : false), ((v & 0x20) == 0 ? z5 : true), ((v & 0x40) == 0 ? s : "    "), ((v & 0x80) == 0 ? z6 : false), ((v & 0x100) == 0 ? z7 : false), ((v & 0x200) == 0 ? s1 : "type"), ((v & 0x400) == 0 ? z8 : false), ((v & 0x800) == 0 ? z9 : true), ((v & 0x1000) == 0 ? jsonNamingStrategy0 : null), ((v & 0x2000) == 0 ? z10 : false), ((v & 0x4000) == 0 ? z11 : false), ((v & 0x8000) == 0 ? classDiscriminatorMode0 : ClassDiscriminatorMode.POLYMORPHIC));
    }

    public final boolean getAllowSpecialFloatingPointValues() {
        return this.k;
    }

    public final boolean getAllowStructuredMapKeys() {
        return this.d;
    }

    public final boolean getAllowTrailingComma() {
        return this.o;
    }

    @ExperimentalSerializationApi
    public static void getAllowTrailingComma$annotations() {
    }

    @NotNull
    public final String getClassDiscriminator() {
        return this.j;
    }

    @NotNull
    public final ClassDiscriminatorMode getClassDiscriminatorMode() {
        return this.p;
    }

    @ExperimentalSerializationApi
    public static void getClassDiscriminatorMode$annotations() {
    }

    public final boolean getCoerceInputValues() {
        return this.h;
    }

    public final boolean getDecodeEnumsCaseInsensitive() {
        return this.n;
    }

    @ExperimentalSerializationApi
    public static void getDecodeEnumsCaseInsensitive$annotations() {
    }

    public final boolean getEncodeDefaults() {
        return this.a;
    }

    public final boolean getExplicitNulls() {
        return this.f;
    }

    @ExperimentalSerializationApi
    public static void getExplicitNulls$annotations() {
    }

    public final boolean getIgnoreUnknownKeys() {
        return this.b;
    }

    @Nullable
    public final JsonNamingStrategy getNamingStrategy() {
        return this.m;
    }

    @ExperimentalSerializationApi
    public static void getNamingStrategy$annotations() {
    }

    public final boolean getPrettyPrint() {
        return this.e;
    }

    @NotNull
    public final String getPrettyPrintIndent() {
        return this.g;
    }

    @ExperimentalSerializationApi
    public static void getPrettyPrintIndent$annotations() {
    }

    public final boolean getUseAlternativeNames() {
        return this.l;
    }

    public final boolean getUseArrayPolymorphism() {
        return this.i;
    }

    public final boolean isLenient() {
        return this.c;
    }

    public final void setClassDiscriminatorMode(@NotNull ClassDiscriminatorMode classDiscriminatorMode0) {
        Intrinsics.checkNotNullParameter(classDiscriminatorMode0, "<set-?>");
        this.p = classDiscriminatorMode0;
    }

    @Override
    @NotNull
    public String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.a + ", ignoreUnknownKeys=" + this.b + ", isLenient=" + this.c + ", allowStructuredMapKeys=" + this.d + ", prettyPrint=" + this.e + ", explicitNulls=" + this.f + ", prettyPrintIndent=\'" + this.g + "\', coerceInputValues=" + this.h + ", useArrayPolymorphism=" + this.i + ", classDiscriminator=\'" + this.j + "\', allowSpecialFloatingPointValues=" + this.k + ", useAlternativeNames=" + this.l + ", namingStrategy=" + this.m + ", decodeEnumsCaseInsensitive=" + this.n + ", allowTrailingComma=" + this.o + ", classDiscriminatorMode=" + this.p + ')';
    }
}

