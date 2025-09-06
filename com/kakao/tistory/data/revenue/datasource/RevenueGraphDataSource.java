package com.kakao.tistory.data.revenue.datasource;

import androidx.paging.PagingSource.LoadParams;
import androidx.paging.PagingSource.LoadResult.Error;
import androidx.paging.PagingSource.LoadResult.Page;
import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.domain.revenue.entity.RevenueGraph;
import com.kakao.tistory.domain.revenue.entity.RevenueTrendGraph;
import java.time.LocalDate;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BB\u00129\u0010\f\u001A5\b\u0001\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0010\u0012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u000B0\u0004¢\u0006\u0004\b\r\u0010\u000EJ%\u0010\u0011\u001A\u0004\u0018\u00010\u00022\u0012\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000FH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0016\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00152\f\u0010\u0014\u001A\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/data/revenue/datasource/RevenueGraphDataSource;", "Landroidx/paging/PagingSource;", "", "Lcom/kakao/tistory/domain/revenue/entity/RevenueGraph;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "key", "Lkotlin/coroutines/Continuation;", "Lcom/kakao/tistory/domain/entity/common/Result;", "Lcom/kakao/tistory/domain/revenue/entity/RevenueTrendGraph;", "", "invoke", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "Landroidx/paging/PagingState;", "state", "getRefreshKey", "(Landroidx/paging/PagingState;)Ljava/lang/String;", "Landroidx/paging/PagingSource$LoadParams;", "params", "Landroidx/paging/PagingSource$LoadResult;", "load", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRevenueGraphDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RevenueGraphDataSource.kt\ncom/kakao/tistory/data/revenue/datasource/RevenueGraphDataSource\n+ 2 Result.kt\ncom/kakao/tistory/domain/entity/common/ResultKt\n*L\n1#1,56:1\n25#2,3:57\n*S KotlinDebug\n*F\n+ 1 RevenueGraphDataSource.kt\ncom/kakao/tistory/data/revenue/datasource/RevenueGraphDataSource\n*L\n30#1:57,3\n*E\n"})
public final class RevenueGraphDataSource extends PagingSource {
    public final Function2 a;

    public RevenueGraphDataSource(@NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "invoke");
        super();
        this.a = function20;
    }

    @Override  // androidx.paging.PagingSource
    public Object getRefreshKey(PagingState pagingState0) {
        return this.getRefreshKey(pagingState0);
    }

    @Nullable
    public String getRefreshKey(@NotNull PagingState pagingState0) {
        Intrinsics.checkNotNullParameter(pagingState0, "state");
        LocalDate localDate0 = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDate0, "now(...)");
        return RevenueGraphDataSourceKt.access$yyyyMMddFormat(localDate0);
    }

    @Override  // androidx.paging.PagingSource
    @Nullable
    public Object load(@NotNull LoadParams pagingSource$LoadParams0, @NotNull Continuation continuation0) {
        a a0;
        if(continuation0 instanceof a) {
            a0 = (a)continuation0;
            int v = a0.c;
            if((v & 0x80000000) == 0) {
                a0 = new a(this, continuation0);
            }
            else {
                a0.c = v ^ 0x80000000;
            }
        }
        else {
            a0 = new a(this, continuation0);
        }
        Object object0 = a0.a;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(a0.c) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                String s = (String)pagingSource$LoadParams0.getKey();
                a0.c = 1;
                object0 = this.a.invoke(s, a0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((Result)object0) instanceof Success) {
            List list0 = CollectionsKt___CollectionsKt.reversed(((RevenueTrendGraph)((Success)(((Result)object0))).getData()).getRevenueGraphList());
            return list0.isEmpty() || ((RevenueGraph)CollectionsKt___CollectionsKt.lastOrNull(list0)) == null ? new Page(list0, null, null) : new Page(list0, null, RevenueGraphDataSourceKt.access$yesterday(""));
        }
        if(!(((Result)object0) instanceof Fail)) {
            throw new NoWhenBranchMatchedException();
        }
        return new Error(new Throwable());
    }
}

