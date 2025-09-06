package com.kakao.tistory.data.model.viewtype;

import androidx.annotation.StringRes;
import com.kakao.tistory.data.R.string;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.a;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\'\b\u0002\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006R\u0015\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001A\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001A\u0004\b\n\u0010\bR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fj\u0002\b\rj\u0002\b\u000Ej\u0002\b\u000Fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/kakao/tistory/data/model/viewtype/StatisticsViewType;", "", "viewType", "", "titleResourceId", "emptyResourceId", "(Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;)V", "getEmptyResourceId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTitleResourceId", "getViewType", "()I", "TITLE", "TREND", "REFERER_CHANNEL", "REFERER_RANK", "TOP_POST", "REFERER_KEYWORD", "EMPTY", "NOTHING", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum StatisticsViewType {
    TITLE(0, null, null, 6, null),
    TREND(1, null, null, 6, null),
    REFERER_CHANNEL(2, string.label_statistics_referer_channel, null, 4, null),
    REFERER_RANK(3, string.label_statistics_referer_rank, string.label_statistics_referer_rank_empty),
    TOP_POST(4, string.label_statistics_top_post, string.label_statistics_top_post_empty),
    REFERER_KEYWORD(5, string.label_statistics_referer_keyword, string.label_statistics_referer_keyword_empty),
    EMPTY(6, null, null, 6, null),
    NOTHING(7, null, null, 6, null);

    private static final EnumEntries $ENTRIES;
    private static final StatisticsViewType[] $VALUES;
    @Nullable
    private final Integer emptyResourceId;
    @Nullable
    private final Integer titleResourceId;
    private final int viewType;

    private static final StatisticsViewType[] $values() [...] // Inlined contents

    static {
        StatisticsViewType.$VALUES = arr_statisticsViewType;
        Intrinsics.checkNotNullParameter(arr_statisticsViewType, "entries");
        StatisticsViewType.$ENTRIES = new a(arr_statisticsViewType);
    }

    private StatisticsViewType(int v1, @StringRes Integer integer0, @StringRes Integer integer1) {
        this.viewType = v1;
        this.titleResourceId = integer0;
        this.emptyResourceId = integer1;
    }

    public StatisticsViewType(int v1, Integer integer0, Integer integer1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        this(v1, ((v2 & 2) == 0 ? integer0 : null), ((v2 & 4) == 0 ? integer1 : null));
    }

    @Nullable
    public final Integer getEmptyResourceId() {
        return this.emptyResourceId;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return StatisticsViewType.$ENTRIES;
    }

    @Nullable
    public final Integer getTitleResourceId() {
        return this.titleResourceId;
    }

    public final int getViewType() {
        return this.viewType;
    }
}

