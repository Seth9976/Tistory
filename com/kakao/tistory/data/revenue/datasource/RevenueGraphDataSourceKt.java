package com.kakao.tistory.data.revenue.datasource;

import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A^\u0010\u000E\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0001\u001A\u00020\u000029\u0010\u000B\u001A5\b\u0001\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0010\u0012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0002¢\u0006\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"", "pageSize", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "key", "Lkotlin/coroutines/Continuation;", "Lcom/kakao/tistory/domain/entity/common/Result;", "Lcom/kakao/tistory/domain/revenue/entity/RevenueTrendGraph;", "", "invoke", "Landroidx/paging/Pager;", "Lcom/kakao/tistory/domain/revenue/entity/RevenueGraph;", "revenuePager", "(ILkotlin/jvm/functions/Function2;)Landroidx/paging/Pager;", "data_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class RevenueGraphDataSourceKt {
    public static final String access$yesterday(String s) {
        LocalDate localDate0 = LocalDate.parse(s).minusDays(1L);
        Intrinsics.checkNotNullExpressionValue(localDate0, "minusDays(...)");
        String s1 = localDate0.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        Intrinsics.checkNotNullExpressionValue(s1, "format(...)");
        return s1;
    }

    public static final String access$yyyyMMddFormat(LocalDate localDate0) {
        String s = localDate0.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        Intrinsics.checkNotNullExpressionValue(s, "format(...)");
        return s;
    }

    @NotNull
    public static final Pager revenuePager(int v, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "invoke");
        return new Pager(new PagingConfig(v, 2, false, v, 0, 0, 52, null), null, new b(function20), 2, null);
    }

    public static Pager revenuePager$default(int v, Function2 function20, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = 20;
        }
        return RevenueGraphDataSourceKt.revenuePager(v, function20);
    }
}

