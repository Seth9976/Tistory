package com.kakao.tistory.presentation.screen.blog.main.ui;

import com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsType;
import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
public final class BlogMainStatisticsKt.BlogMainStatistics.3.3.2.WhenMappings {
    public static final int[] $EnumSwitchMapping$0;

    static {
        int[] arr_v = new int[StatisticsType.values().length];
        try {
            arr_v[StatisticsType.TREND.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[StatisticsType.REFERER_LOG.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[StatisticsType.REFERER_KEYWORD.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[StatisticsType.REVENUE.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        BlogMainStatisticsKt.BlogMainStatistics.3.3.2.WhenMappings.$EnumSwitchMapping$0 = arr_v;
    }
}

