package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nRenderingUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderingUtils.kt\norg/jetbrains/kotlin/renderer/RenderingUtilsKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,75:1\n1083#2,2:76\n*S KotlinDebug\n*F\n+ 1 RenderingUtils.kt\norg/jetbrains/kotlin/renderer/RenderingUtilsKt\n*L\n29#1:76,2\n*E\n"})
public final class RenderingUtilsKt {
    @NotNull
    public static final String render(@NotNull FqNameUnsafe fqNameUnsafe0) {
        Intrinsics.checkNotNullParameter(fqNameUnsafe0, "<this>");
        List list0 = fqNameUnsafe0.pathSegments();
        Intrinsics.checkNotNullExpressionValue(list0, "pathSegments()");
        return RenderingUtilsKt.renderFqName(list0);
    }

    @NotNull
    public static final String render(@NotNull Name name0) {
        Intrinsics.checkNotNullParameter(name0, "<this>");
        String s = name0.asString();
        Intrinsics.checkNotNullExpressionValue(s, "asString()");
        if(!KeywordStringsGenerated.KEYWORDS.contains(s)) {
            int v = 0;
            while(v < s.length()) {
                int v1 = s.charAt(v);
                if(!Character.isLetterOrDigit(((char)v1)) && v1 != 0x5F) {
                    goto label_13;
                }
                ++v;
            }
            String s1 = name0.asString();
            Intrinsics.checkNotNullExpressionValue(s1, "asString()");
            return s1;
        }
    label_13:
        String s2 = name0.asString();
        Intrinsics.checkNotNullExpressionValue(s2, "asString()");
        return "`" + s2 + '`';
    }

    @NotNull
    public static final String renderFqName(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "pathSegments");
        StringBuilder stringBuilder0 = new StringBuilder();
        for(Object object0: list0) {
            if(stringBuilder0.length() > 0) {
                stringBuilder0.append(".");
            }
            stringBuilder0.append(RenderingUtilsKt.render(((Name)object0)));
        }
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    @Nullable
    public static final String replacePrefixesInTypeRepresentations(@NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull String s3, @NotNull String s4) {
        Intrinsics.checkNotNullParameter(s, "lowerRendered");
        Intrinsics.checkNotNullParameter(s1, "lowerPrefix");
        Intrinsics.checkNotNullParameter(s2, "upperRendered");
        Intrinsics.checkNotNullParameter(s3, "upperPrefix");
        Intrinsics.checkNotNullParameter(s4, "foldedPrefix");
        if(p.startsWith$default(s, s1, false, 2, null) && p.startsWith$default(s2, s3, false, 2, null)) {
            String s5 = s.substring(s1.length());
            Intrinsics.checkNotNullExpressionValue(s5, "this as java.lang.String).substring(startIndex)");
            String s6 = s2.substring(s3.length());
            Intrinsics.checkNotNullExpressionValue(s6, "this as java.lang.String).substring(startIndex)");
            String s7 = s4 + s5;
            if(Intrinsics.areEqual(s5, s6)) {
                return s7;
            }
            return RenderingUtilsKt.typeStringsDifferOnlyInNullability(s5, s6) ? s7 + '!' : null;
        }
        return null;
    }

    public static final boolean typeStringsDifferOnlyInNullability(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "lower");
        Intrinsics.checkNotNullParameter(s1, "upper");
        return Intrinsics.areEqual(s, p.replace$default(s1, "?", "", false, 4, null)) || p.endsWith$default(s1, "?", false, 2, null) && Intrinsics.areEqual((s + '?'), s1) || Intrinsics.areEqual(("(" + s + ")?"), s1);
    }
}

