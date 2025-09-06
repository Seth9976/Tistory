package com.kakao.tistory.data.common;

import androidx.paging.PagingSource.LoadParams;
import androidx.paging.PagingSource.LoadResult.Error;
import androidx.paging.PagingSource.LoadResult.Page;
import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import com.kakao.tistory.domain.ErrorModelThrowable;
import com.kakao.tistory.domain.common.PagingModel;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003B[\u0012R\u0010\r\u001AN\b\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u000B0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005¢\u0006\u0004\b\u000E\u0010\u000FJ*\u0010\u0013\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00122\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u00040\u0010H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0017\u001A\u0004\u0018\u00010\u00042\u0012\u0010\u0016\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/kakao/tistory/data/common/SimplePagingSource;", "", "T", "Landroidx/paging/PagingSource;", "", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "key", "pageSize", "Lkotlin/coroutines/Continuation;", "Lcom/kakao/tistory/domain/entity/common/Result;", "Lcom/kakao/tistory/domain/common/PagingModel;", "invoke", "<init>", "(Lkotlin/jvm/functions/Function3;)V", "Landroidx/paging/PagingSource$LoadParams;", "params", "Landroidx/paging/PagingSource$LoadResult;", "load", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/paging/PagingState;", "state", "getRefreshKey", "(Landroidx/paging/PagingState;)Ljava/lang/Integer;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class SimplePagingSource extends PagingSource {
    public final Function3 a;

    public SimplePagingSource(@NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(function30, "invoke");
        super();
        this.a = function30;
    }

    @Nullable
    public Integer getRefreshKey(@NotNull PagingState pagingState0) {
        Intrinsics.checkNotNullParameter(pagingState0, "state");
        Integer integer0 = pagingState0.getAnchorPosition();
        if(integer0 != null) {
            Page pagingSource$LoadResult$Page0 = pagingState0.closestPageToPosition(integer0.intValue());
            if(pagingSource$LoadResult$Page0 != null) {
                Integer integer1 = (Integer)pagingSource$LoadResult$Page0.getPrevKey();
                if(integer1 != null) {
                    return (int)(((int)integer1) + 1);
                }
            }
            if(pagingSource$LoadResult$Page0 != null) {
                Integer integer2 = (Integer)pagingSource$LoadResult$Page0.getNextKey();
                return integer2 == null ? null : ((int)(((int)integer2) - 1));
            }
        }
        return null;
    }

    @Override  // androidx.paging.PagingSource
    public Object getRefreshKey(PagingState pagingState0) {
        return this.getRefreshKey(pagingState0);
    }

    @Override  // androidx.paging.PagingSource
    @Nullable
    public Object load(@NotNull LoadParams pagingSource$LoadParams0, @NotNull Continuation continuation0) {
        b b0;
        if(continuation0 instanceof b) {
            b0 = (b)continuation0;
            int v = b0.d;
            if((v & 0x80000000) == 0) {
                b0 = new b(this, continuation0);
            }
            else {
                b0.d = v ^ 0x80000000;
            }
        }
        else {
            b0 = new b(this, continuation0);
        }
        Object object0 = b0.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(b0.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Integer integer0 = (Integer)pagingSource$LoadParams0.getKey();
                b0.a = pagingSource$LoadParams0;
                b0.d = 1;
                object0 = this.a.invoke(Boxing.boxInt((integer0 == null ? 1 : ((int)integer0))), Boxing.boxInt(pagingSource$LoadParams0.getLoadSize()), b0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                pagingSource$LoadParams0 = b0.a;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((Result)object0) instanceof Fail) {
            return new Error(new ErrorModelThrowable(((Fail)(((Result)object0))).getErrorModel()));
        }
        if(!(((Result)object0) instanceof Success)) {
            throw new NoWhenBranchMatchedException();
        }
        PagingModel pagingModel0 = (PagingModel)((Success)(((Result)object0))).getData();
        Integer integer1 = pagingModel0.getPrevPage();
        int v1 = c.coerceAtLeast((integer1 == null ? 0 : ((int)integer1)), 0);
        int v2 = pagingSource$LoadParams0.getLoadSize();
        return new Page(pagingModel0.getItems(), pagingModel0.getPrevPage(), pagingModel0.getNextPage(), v2 * v1, pagingModel0.getTotalCount() - pagingModel0.getItems().size() - v2 * v1);
    }
}

