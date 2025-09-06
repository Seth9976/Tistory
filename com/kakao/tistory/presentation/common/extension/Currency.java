package com.kakao.tistory.presentation.common.extension;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000E\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/kakao/tistory/presentation/common/extension/Currency;", "", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "DOLLAR", "WON", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum Currency {
    DOLLAR("$"),
    WON("₩");

    public final String a;
    public static final Currency[] b;
    public static final EnumEntries c;

    static {
        Currency.b = arr_currency;
        Intrinsics.checkNotNullParameter(arr_currency, "entries");
        Currency.c = new a(arr_currency);
    }

    public Currency(String s1) {
        this.a = s1;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return Currency.c;
    }

    @NotNull
    public final String getValue() {
        return this.a;
    }
}

