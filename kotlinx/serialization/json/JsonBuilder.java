package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u001C\n\u0002\u0010\u000E\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\t\u001A\u00020\u0006H\u0000\u00A2\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001A\u00020\n8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b\u000B\u0010\f\u001A\u0004\b\r\u0010\u000E\"\u0004\b\u000F\u0010\u0010R(\u0010\u0017\u001A\u00020\n8\u0006@\u0006X\u0087\u000E\u00A2\u0006\u0018\n\u0004\b\u0012\u0010\f\u0012\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0013\u0010\u000E\"\u0004\b\u0014\u0010\u0010R\"\u0010\u001B\u001A\u00020\n8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b\u0018\u0010\f\u001A\u0004\b\u0019\u0010\u000E\"\u0004\b\u001A\u0010\u0010R\"\u0010\u001D\u001A\u00020\n8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b\u001C\u0010\f\u001A\u0004\b\u001D\u0010\u000E\"\u0004\b\u001E\u0010\u0010R\"\u0010\"\u001A\u00020\n8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b\u001F\u0010\f\u001A\u0004\b \u0010\u000E\"\u0004\b!\u0010\u0010R\"\u0010&\u001A\u00020\n8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b#\u0010\f\u001A\u0004\b$\u0010\u000E\"\u0004\b%\u0010\u0010R(\u0010/\u001A\u00020\'8\u0006@\u0006X\u0087\u000E\u00A2\u0006\u0018\n\u0004\b(\u0010)\u0012\u0004\b.\u0010\u0016\u001A\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00103\u001A\u00020\n8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b0\u0010\f\u001A\u0004\b1\u0010\u000E\"\u0004\b2\u0010\u0010R\"\u00107\u001A\u00020\n8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b4\u0010\f\u001A\u0004\b5\u0010\u000E\"\u0004\b6\u0010\u0010R\"\u0010;\u001A\u00020\'8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b8\u0010)\u001A\u0004\b9\u0010+\"\u0004\b:\u0010-R\"\u0010C\u001A\u00020<8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b=\u0010>\u001A\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010G\u001A\u00020\n8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bD\u0010\f\u001A\u0004\bE\u0010\u000E\"\u0004\bF\u0010\u0010R\"\u0010K\u001A\u00020\n8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bH\u0010\f\u001A\u0004\bI\u0010\u000E\"\u0004\bJ\u0010\u0010R*\u0010T\u001A\u0004\u0018\u00010L8\u0006@\u0006X\u0087\u000E\u00A2\u0006\u0018\n\u0004\bM\u0010N\u0012\u0004\bS\u0010\u0016\u001A\u0004\bO\u0010P\"\u0004\bQ\u0010RR(\u0010Y\u001A\u00020\n8\u0006@\u0006X\u0087\u000E\u00A2\u0006\u0018\n\u0004\bU\u0010\f\u0012\u0004\bX\u0010\u0016\u001A\u0004\bV\u0010\u000E\"\u0004\bW\u0010\u0010R(\u0010^\u001A\u00020\n8\u0006@\u0006X\u0087\u000E\u00A2\u0006\u0018\n\u0004\bZ\u0010\f\u0012\u0004\b]\u0010\u0016\u001A\u0004\b[\u0010\u000E\"\u0004\b\\\u0010\u0010R\"\u0010f\u001A\u00020_8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b`\u0010a\u001A\u0004\bb\u0010c\"\u0004\bd\u0010e\u00A8\u0006g"}, d2 = {"Lkotlinx/serialization/json/JsonBuilder;", "", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lkotlinx/serialization/json/Json;)V", "Lkotlinx/serialization/json/JsonConfiguration;", "build$kotlinx_serialization_json", "()Lkotlinx/serialization/json/JsonConfiguration;", "build", "", "a", "Z", "getEncodeDefaults", "()Z", "setEncodeDefaults", "(Z)V", "encodeDefaults", "b", "getExplicitNulls", "setExplicitNulls", "getExplicitNulls$annotations", "()V", "explicitNulls", "c", "getIgnoreUnknownKeys", "setIgnoreUnknownKeys", "ignoreUnknownKeys", "d", "isLenient", "setLenient", "e", "getAllowStructuredMapKeys", "setAllowStructuredMapKeys", "allowStructuredMapKeys", "f", "getPrettyPrint", "setPrettyPrint", "prettyPrint", "", "g", "Ljava/lang/String;", "getPrettyPrintIndent", "()Ljava/lang/String;", "setPrettyPrintIndent", "(Ljava/lang/String;)V", "getPrettyPrintIndent$annotations", "prettyPrintIndent", "h", "getCoerceInputValues", "setCoerceInputValues", "coerceInputValues", "i", "getUseArrayPolymorphism", "setUseArrayPolymorphism", "useArrayPolymorphism", "j", "getClassDiscriminator", "setClassDiscriminator", "classDiscriminator", "Lkotlinx/serialization/json/ClassDiscriminatorMode;", "k", "Lkotlinx/serialization/json/ClassDiscriminatorMode;", "getClassDiscriminatorMode", "()Lkotlinx/serialization/json/ClassDiscriminatorMode;", "setClassDiscriminatorMode", "(Lkotlinx/serialization/json/ClassDiscriminatorMode;)V", "classDiscriminatorMode", "l", "getAllowSpecialFloatingPointValues", "setAllowSpecialFloatingPointValues", "allowSpecialFloatingPointValues", "m", "getUseAlternativeNames", "setUseAlternativeNames", "useAlternativeNames", "Lkotlinx/serialization/json/JsonNamingStrategy;", "n", "Lkotlinx/serialization/json/JsonNamingStrategy;", "getNamingStrategy", "()Lkotlinx/serialization/json/JsonNamingStrategy;", "setNamingStrategy", "(Lkotlinx/serialization/json/JsonNamingStrategy;)V", "getNamingStrategy$annotations", "namingStrategy", "o", "getDecodeEnumsCaseInsensitive", "setDecodeEnumsCaseInsensitive", "getDecodeEnumsCaseInsensitive$annotations", "decodeEnumsCaseInsensitive", "p", "getAllowTrailingComma", "setAllowTrailingComma", "getAllowTrailingComma$annotations", "allowTrailingComma", "Lkotlinx/serialization/modules/SerializersModule;", "q", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "setSerializersModule", "(Lkotlinx/serialization/modules/SerializersModule;)V", "serializersModule", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nJson.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Json.kt\nkotlinx/serialization/json/JsonBuilder\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,451:1\n1064#2,2:452\n*S KotlinDebug\n*F\n+ 1 Json.kt\nkotlinx/serialization/json/JsonBuilder\n*L\n414#1:452,2\n*E\n"})
public final class JsonBuilder {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public String g;
    public boolean h;
    public boolean i;
    public String j;
    public ClassDiscriminatorMode k;
    public boolean l;
    public boolean m;
    public JsonNamingStrategy n;
    public boolean o;
    public boolean p;
    public SerializersModule q;

    public JsonBuilder(@NotNull Json json0) {
        Intrinsics.checkNotNullParameter(json0, "json");
        super();
        this.a = json0.getConfiguration().getEncodeDefaults();
        this.b = json0.getConfiguration().getExplicitNulls();
        this.c = json0.getConfiguration().getIgnoreUnknownKeys();
        this.d = json0.getConfiguration().isLenient();
        this.e = json0.getConfiguration().getAllowStructuredMapKeys();
        this.f = json0.getConfiguration().getPrettyPrint();
        this.g = json0.getConfiguration().getPrettyPrintIndent();
        this.h = json0.getConfiguration().getCoerceInputValues();
        this.i = json0.getConfiguration().getUseArrayPolymorphism();
        this.j = json0.getConfiguration().getClassDiscriminator();
        this.k = json0.getConfiguration().getClassDiscriminatorMode();
        this.l = json0.getConfiguration().getAllowSpecialFloatingPointValues();
        this.m = json0.getConfiguration().getUseAlternativeNames();
        this.n = json0.getConfiguration().getNamingStrategy();
        this.o = json0.getConfiguration().getDecodeEnumsCaseInsensitive();
        this.p = json0.getConfiguration().getAllowTrailingComma();
        this.q = json0.getSerializersModule();
    }

    @NotNull
    public final JsonConfiguration build$kotlinx_serialization_json() {
        if(this.i) {
            if(!Intrinsics.areEqual(this.j, "type")) {
                throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified");
            }
            if(this.k != ClassDiscriminatorMode.POLYMORPHIC) {
                throw new IllegalArgumentException("useArrayPolymorphism option can only be used if classDiscriminatorMode in a default POLYMORPHIC state.");
            }
        }
        if(!this.f) {
            if(!Intrinsics.areEqual(this.g, "    ")) {
                throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
            }
        }
        else if(!Intrinsics.areEqual(this.g, "    ")) {
            String s = this.g;
            int v = 0;
            while(v < s.length()) {
                switch(s.charAt(v)) {
                    case 9: 
                    case 10: 
                    case 13: 
                    case 0x20: {
                        ++v;
                        continue;
                    }
                    default: {
                        throw new IllegalArgumentException(("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had " + this.g).toString());
                    }
                }
            }
        }
        return new JsonConfiguration(this.a, this.c, this.d, this.e, this.f, this.b, this.g, this.h, this.i, this.j, this.l, this.m, this.n, this.o, this.p, this.k);
    }

    public final boolean getAllowSpecialFloatingPointValues() {
        return this.l;
    }

    public final boolean getAllowStructuredMapKeys() {
        return this.e;
    }

    public final boolean getAllowTrailingComma() {
        return this.p;
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
        return this.k;
    }

    public final boolean getCoerceInputValues() {
        return this.h;
    }

    public final boolean getDecodeEnumsCaseInsensitive() {
        return this.o;
    }

    @ExperimentalSerializationApi
    public static void getDecodeEnumsCaseInsensitive$annotations() {
    }

    public final boolean getEncodeDefaults() {
        return this.a;
    }

    public final boolean getExplicitNulls() {
        return this.b;
    }

    @ExperimentalSerializationApi
    public static void getExplicitNulls$annotations() {
    }

    public final boolean getIgnoreUnknownKeys() {
        return this.c;
    }

    @Nullable
    public final JsonNamingStrategy getNamingStrategy() {
        return this.n;
    }

    @ExperimentalSerializationApi
    public static void getNamingStrategy$annotations() {
    }

    public final boolean getPrettyPrint() {
        return this.f;
    }

    @NotNull
    public final String getPrettyPrintIndent() {
        return this.g;
    }

    @ExperimentalSerializationApi
    public static void getPrettyPrintIndent$annotations() {
    }

    @NotNull
    public final SerializersModule getSerializersModule() {
        return this.q;
    }

    public final boolean getUseAlternativeNames() {
        return this.m;
    }

    public final boolean getUseArrayPolymorphism() {
        return this.i;
    }

    public final boolean isLenient() {
        return this.d;
    }

    public final void setAllowSpecialFloatingPointValues(boolean z) {
        this.l = z;
    }

    public final void setAllowStructuredMapKeys(boolean z) {
        this.e = z;
    }

    public final void setAllowTrailingComma(boolean z) {
        this.p = z;
    }

    public final void setClassDiscriminator(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.j = s;
    }

    public final void setClassDiscriminatorMode(@NotNull ClassDiscriminatorMode classDiscriminatorMode0) {
        Intrinsics.checkNotNullParameter(classDiscriminatorMode0, "<set-?>");
        this.k = classDiscriminatorMode0;
    }

    public final void setCoerceInputValues(boolean z) {
        this.h = z;
    }

    public final void setDecodeEnumsCaseInsensitive(boolean z) {
        this.o = z;
    }

    public final void setEncodeDefaults(boolean z) {
        this.a = z;
    }

    public final void setExplicitNulls(boolean z) {
        this.b = z;
    }

    public final void setIgnoreUnknownKeys(boolean z) {
        this.c = z;
    }

    public final void setLenient(boolean z) {
        this.d = z;
    }

    public final void setNamingStrategy(@Nullable JsonNamingStrategy jsonNamingStrategy0) {
        this.n = jsonNamingStrategy0;
    }

    public final void setPrettyPrint(boolean z) {
        this.f = z;
    }

    public final void setPrettyPrintIndent(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.g = s;
    }

    public final void setSerializersModule(@NotNull SerializersModule serializersModule0) {
        Intrinsics.checkNotNullParameter(serializersModule0, "<set-?>");
        this.q = serializersModule0;
    }

    public final void setUseAlternativeNames(boolean z) {
        this.m = z;
    }

    public final void setUseArrayPolymorphism(boolean z) {
        this.i = z;
    }
}

