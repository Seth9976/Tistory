package com.kakao.tistory.presentation.screen.blog.main.contract;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000E\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000B¨\u0006\f"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsType;", "", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "TREND", "REFERER_LOG", "REFERER_KEYWORD", "REVENUE", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum StatisticsType {
    TREND("blogstat"),
    REFERER_LOG("ref_log"),
    REFERER_KEYWORD("keyword"),
    REVENUE("revenue");

    public final String a;
    public static final StatisticsType[] b;
    public static final EnumEntries c;

    static {
        StatisticsType.b = arr_statisticsType;
        Intrinsics.checkNotNullParameter(arr_statisticsType, "entries");
        StatisticsType.c = new a(arr_statisticsType);
    }

    public StatisticsType(String s1) {
        this.a = s1;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return StatisticsType.c;
    }

    @NotNull
    public final String getValue() {
        return this.a;
    }
}

