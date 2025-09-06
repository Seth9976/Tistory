package kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\ncapitalizeDecapitalize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 capitalizeDecapitalize.kt\norg/jetbrains/kotlin/util/capitalizeDecapitalize/CapitalizeDecapitalizeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,144:1\n1#2:145\n288#3,2:146\n288#3,2:148\n766#3:150\n857#3,2:151\n1864#3,3:153\n*S KotlinDebug\n*F\n+ 1 capitalizeDecapitalize.kt\norg/jetbrains/kotlin/util/capitalizeDecapitalize/CapitalizeDecapitalizeKt\n*L\n34#1:146,2\n57#1:148,2\n72#1:150\n72#1:151,2\n78#1:153,3\n*E\n"})
public final class CapitalizeDecapitalizeKt {
    public static final boolean a(String s, int v, boolean z) {
        int v1 = s.charAt(v);
        return z ? 65 <= v1 && v1 < 91 : Character.isUpperCase(((char)v1));
    }

    @NotNull
    public static final String capitalizeAsciiOnly(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        if(s.length() == 0) {
            return s;
        }
        int v = s.charAt(0);
        if(97 <= v && v < 0x7B) {
            String s1 = s.substring(1);
            Intrinsics.checkNotNullExpressionValue(s1, "this as java.lang.String).substring(startIndex)");
            return Character.toUpperCase(((char)v)) + s1;
        }
        return s;
    }

    @NotNull
    public static final String decapitalizeAsciiOnly(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        if(s.length() == 0) {
            return s;
        }
        int v = s.charAt(0);
        if(65 <= v && v < 91) {
            String s1 = s.substring(1);
            Intrinsics.checkNotNullExpressionValue(s1, "this as java.lang.String).substring(startIndex)");
            return Character.toLowerCase(((char)v)) + s1;
        }
        return s;
    }

    @NotNull
    public static final String decapitalizeSmartForCompiler(@NotNull String s, boolean z) {
        String s2;
        Intrinsics.checkNotNullParameter(s, "<this>");
        if(s.length() == 0 || !CapitalizeDecapitalizeKt.a(s, 0, z)) {
            return s;
        }
        if(s.length() != 1 && CapitalizeDecapitalizeKt.a(s, 1, z)) {
            Object object0 = null;
            for(Object object1: StringsKt__StringsKt.getIndices(s)) {
                if(!CapitalizeDecapitalizeKt.a(s, ((Number)object1).intValue(), z)) {
                    object0 = object1;
                    break;
                }
            }
            if(((Integer)object0) != null) {
                int v = (int)(((Integer)object0));
                StringBuilder stringBuilder0 = new StringBuilder();
                String s1 = s.substring(0, v - 1);
                Intrinsics.checkNotNullExpressionValue(s1, "this as java.lang.String…ing(startIndex, endIndex)");
                if(z) {
                    s2 = CapitalizeDecapitalizeKt.toLowerCaseAsciiOnly(s1);
                }
                else {
                    s2 = s1.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(s2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                }
                stringBuilder0.append(s2);
                String s3 = s.substring(v - 1);
                Intrinsics.checkNotNullExpressionValue(s3, "this as java.lang.String).substring(startIndex)");
                stringBuilder0.append(s3);
                return stringBuilder0.toString();
            }
            if(z) {
                return CapitalizeDecapitalizeKt.toLowerCaseAsciiOnly(s);
            }
            String s4 = s.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(s4, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            return s4;
        }
        if(z) {
            return CapitalizeDecapitalizeKt.decapitalizeAsciiOnly(s);
        }
        if(s.length() > 0) {
            String s5 = s.substring(1);
            Intrinsics.checkNotNullExpressionValue(s5, "this as java.lang.String).substring(startIndex)");
            return Character.toLowerCase(s.charAt(0)) + s5;
        }
        return s;
    }

    @NotNull
    public static final String toLowerCaseAsciiOnly(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        StringBuilder stringBuilder0 = new StringBuilder(s.length());
        int v = s.length();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = s.charAt(v1);
            stringBuilder0.append(((char)(65 > v2 || v2 >= 91 ? s.charAt(v1) : Character.toLowerCase(((char)v2)))));
        }
        String s1 = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s1, "builder.toString()");
        return s1;
    }
}

