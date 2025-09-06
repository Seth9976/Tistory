package com.kakao.tistory.presentation.common.extension;

import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0004\n\u0002\u0010\u000E\n\u0002\b\u0007\u001A\u0011\u0010\u0002\u001A\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001A\u0011\u0010\u0004\u001A\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001A\u0019\u0010\u0006\u001A\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "", "numberFormat", "(Ljava/lang/Number;)Ljava/lang/String;", "numberFormatWithDecimal", "currency", "numberFormatOfCurrency", "(Ljava/lang/Number;Ljava/lang/String;)Ljava/lang/String;", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class NumberExtensionKt {
    @NotNull
    public static final String numberFormat(@NotNull Number number0) {
        Intrinsics.checkNotNullParameter(number0, "<this>");
        String s = new DecimalFormat("###,###").format(number0);
        Intrinsics.checkNotNullExpressionValue(s, "format(...)");
        return s;
    }

    @NotNull
    public static final String numberFormatOfCurrency(@NotNull Number number0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(number0, "<this>");
        Intrinsics.checkNotNullParameter(s, "currency");
        return Intrinsics.areEqual(s, "$") ? NumberExtensionKt.numberFormatWithDecimal(number0) : NumberExtensionKt.numberFormat(number0);
    }

    @NotNull
    public static final String numberFormatWithDecimal(@NotNull Number number0) {
        Intrinsics.checkNotNullParameter(number0, "<this>");
        String s = new DecimalFormat("#,##0.00").format(number0);
        Regex regex0 = new Regex("0\\.0+");
        Intrinsics.checkNotNull(s);
        return regex0.matches(s) ? "0" : s;
    }
}

