package com.kakao.tistory.presentation.screen.revenue.ui;

import com.kakao.tistory.presentation.R.string;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000B"}, d2 = {"Lcom/kakao/tistory/presentation/screen/revenue/ui/GraphPeriodType;", "", "", "a", "I", "getTitleRes", "()I", "titleRes", "DAY", "WEEK", "MONTH", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum GraphPeriodType {
    DAY(string.revenue_graph_period_type_day),
    WEEK(string.revenue_graph_period_type_week),
    MONTH(string.revenue_graph_period_type_month);

    public final int a;
    public static final GraphPeriodType[] b;
    public static final EnumEntries c;

    static {
        GraphPeriodType.b = arr_graphPeriodType;
        Intrinsics.checkNotNullParameter(arr_graphPeriodType, "entries");
        GraphPeriodType.c = new a(arr_graphPeriodType);
    }

    public GraphPeriodType(int v1) {
        this.a = v1;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return GraphPeriodType.c;
    }

    public final int getTitleRes() {
        return this.a;
    }
}

