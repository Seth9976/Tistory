package com.kakao.tistory.presentation.view.comment;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.paging.PagingSource.LoadParams;
import androidx.paging.PagingSource.LoadResult.Page;
import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import com.kakao.tistory.domain.entity.PinComment;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.k;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B-\u0012$\u0010\u0007\u001A \b\u0001\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ%\u0010\f\u001A\u0004\u0018\u00010\u00022\u0012\u0010\u000B\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\nH\u0016¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0011\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00102\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00020\u000EH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/SimplePagingSource;", "Landroidx/paging/PagingSource;", "", "Lcom/kakao/tistory/domain/entity/PinComment;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lcom/kakao/tistory/domain/entity/common/Result;", "invoke", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/paging/PagingState;", "state", "getRefreshKey", "(Landroidx/paging/PagingState;)Ljava/lang/Object;", "Landroidx/paging/PagingSource$LoadParams;", "params", "Landroidx/paging/PagingSource$LoadResult;", "load", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSimplePager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimplePager.kt\ncom/kakao/tistory/presentation/view/comment/SimplePagingSource\n+ 2 Result.kt\ncom/kakao/tistory/domain/entity/common/ResultKt\n*L\n1#1,37:1\n25#2,3:38\n*S KotlinDebug\n*F\n+ 1 SimplePager.kt\ncom/kakao/tistory/presentation/view/comment/SimplePagingSource\n*L\n27#1:38,3\n*E\n"})
public final class SimplePagingSource extends PagingSource {
    public static final int $stable = 8;
    public final Function1 a;

    public SimplePagingSource(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "invoke");
        super();
        this.a = function10;
    }

    @Override  // androidx.paging.PagingSource
    @Nullable
    public Object getRefreshKey(@NotNull PagingState pagingState0) {
        Intrinsics.checkNotNullParameter(pagingState0, "state");
        return null;
    }

    @Override  // androidx.paging.PagingSource
    @Nullable
    public Object load(@NotNull LoadParams pagingSource$LoadParams0, @NotNull Continuation continuation0) {
        h2 h20;
        if(continuation0 instanceof h2) {
            h20 = (h2)continuation0;
            int v = h20.c;
            if((v & 0x80000000) == 0) {
                h20 = new h2(this, continuation0);
            }
            else {
                h20.c = v ^ 0x80000000;
            }
        }
        else {
            h20 = new h2(this, continuation0);
        }
        Object object0 = h20.a;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(h20.c) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                h20.c = 1;
                object0 = this.a.invoke(h20);
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
            PinComment pinComment0 = (PinComment)((Success)(((Result)object0))).getData();
            return pinComment0 == null ? new Page(CollectionsKt__CollectionsKt.emptyList(), null, null) : new Page(k.listOf(pinComment0), null, null);
        }
        if(!(((Result)object0) instanceof Fail)) {
            throw new NoWhenBranchMatchedException();
        }
        return new Page(CollectionsKt__CollectionsKt.emptyList(), null, null);
    }
}

