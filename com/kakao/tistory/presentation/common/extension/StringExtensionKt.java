package com.kakao.tistory.presentation.common.extension;

import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import r0.a;

@Metadata(d1 = {"\u0000\u001E\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\u001A\n\u0010\u0000\u001A\u00020\u0001*\u00020\u0001\u001A\u0012\u0010\u0002\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001A\u00020\u0001\u001A\n\u0010\u0004\u001A\u00020\u0005*\u00020\u0001\u001A\n\u0010\u0006\u001A\u00020\u0001*\u00020\u0001\u001A\u0014\u0010\u0007\u001A\u00020\u0001*\u00020\b2\b\b\u0002\u0010\t\u001A\u00020\n¨\u0006\u000B"}, d2 = {"getStringExcludeBold", "", "getStringIncludeBold", "boldTarget", "hasBoldTag", "", "newLineToSpace", "toFormattedString", "", "maxDigit", "", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class StringExtensionKt {
    @NotNull
    public static final String getStringExcludeBold(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        return StringExtensionKt.hasBoldTag(s) ? p.replace$default(p.replace$default(s, "<b>", "", false, 4, null), "</b>", "", false, 4, null) : s;
    }

    @NotNull
    public static final String getStringIncludeBold(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(s1, "boldTarget");
        return p.replace$default(s, s1, a.o(new StringBuilder("<b>"), s1, "</b>"), false, 4, null);
    }

    public static final boolean hasBoldTag(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Locale locale0 = Locale.ROOT;
        String s1 = s.toLowerCase(locale0);
        Intrinsics.checkNotNullExpressionValue(s1, "toLowerCase(...)");
        if(StringsKt__StringsKt.contains$default(s1, "<b>", false, 2, null)) {
            String s2 = s.toLowerCase(locale0);
            Intrinsics.checkNotNullExpressionValue(s2, "toLowerCase(...)");
            return StringsKt__StringsKt.contains$default(s2, "</b>", false, 2, null);
        }
        return false;
    }

    @NotNull
    public static final String newLineToSpace(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        return p.replace$default(s, "\n", " ", false, 4, null);
    }

    @NotNull
    public static final String toFormattedString(long v, int v1) {
        if(v == 0L) {
            return "0";
        }
        if(v1 == 0) {
            String s = String.format(Locale.KOREA, "%,d", Arrays.copyOf(new Object[]{v}, 1));
            Intrinsics.checkNotNullExpressionValue(s, "format(...)");
            return s;
        }
        long v2 = (long)(Math.pow(10.0, v1) - 1.0);
        String s1 = String.format(Locale.KOREA, "%,d", Arrays.copyOf(new Object[]{c.coerceAtMost(v, v2)}, 1));
        Intrinsics.checkNotNullExpressionValue(s1, "format(...)");
        return v <= v2 ? s1 : s1 + "+";
    }

    public static String toFormattedString$default(long v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v1 = 0;
        }
        return StringExtensionKt.toFormattedString(v, v1);
    }
}

