package com.kakao.tistory.data.datasource;

import androidx.paging.PagingSource.LoadParams;
import androidx.paging.PagingSource.LoadResult.Error;
import androidx.paging.PagingSource.LoadResult.Page;
import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import com.kakao.tistory.domain.ErrorModelThrowable;
import com.kakao.tistory.domain.entity.common.EntryItemListModel;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.domain.repository.FeedRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002&\u0012\u001C\u0012\u001A\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002\u0012\u0004\u0012\u00020\u00050\u0001B\u000F\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJU\u0010\f\u001A\u001C\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00022*\u0010\u000B\u001A&\u0012\u001C\u0012\u001A\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002\u0012\u0004\u0012\u00020\u00050\nH\u0016¢\u0006\u0004\b\f\u0010\rJZ\u0010\u0011\u001A&\u0012\u001C\u0012\u001A\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002\u0012\u0004\u0012\u00020\u00050\u00102$\u0010\u000F\u001A \u0012\u001C\u0012\u001A\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00020\u000EH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/kakao/tistory/data/datasource/FeedDataSource;", "Landroidx/paging/PagingSource;", "Lkotlin/Triple;", "", "", "Lcom/kakao/tistory/domain/entity/entry/EntryItem;", "Lcom/kakao/tistory/domain/repository/FeedRepository;", "feedRepository", "<init>", "(Lcom/kakao/tistory/domain/repository/FeedRepository;)V", "Landroidx/paging/PagingState;", "state", "getRefreshKey", "(Landroidx/paging/PagingState;)Lkotlin/Triple;", "Landroidx/paging/PagingSource$LoadParams;", "params", "Landroidx/paging/PagingSource$LoadResult;", "load", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFeedDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeedDataSource.kt\ncom/kakao/tistory/data/datasource/FeedDataSource\n+ 2 Result.kt\ncom/kakao/tistory/domain/entity/common/ResultKt\n*L\n1#1,32:1\n25#2,3:33\n*S KotlinDebug\n*F\n+ 1 FeedDataSource.kt\ncom/kakao/tistory/data/datasource/FeedDataSource\n*L\n23#1:33,3\n*E\n"})
public final class FeedDataSource extends PagingSource {
    public final FeedRepository a;

    public FeedDataSource(@NotNull FeedRepository feedRepository0) {
        Intrinsics.checkNotNullParameter(feedRepository0, "feedRepository");
        super();
        this.a = feedRepository0;
    }

    @Override  // androidx.paging.PagingSource
    public Object getRefreshKey(PagingState pagingState0) {
        return this.getRefreshKey(pagingState0);
    }

    @Nullable
    public Triple getRefreshKey(@NotNull PagingState pagingState0) {
        Intrinsics.checkNotNullParameter(pagingState0, "state");
        return null;
    }

    @Override  // androidx.paging.PagingSource
    @Nullable
    public Object load(@NotNull LoadParams pagingSource$LoadParams0, @NotNull Continuation continuation0) {
        g g0;
        if(continuation0 instanceof g) {
            g0 = (g)continuation0;
            int v = g0.c;
            if((v & 0x80000000) == 0) {
                g0 = new g(this, continuation0);
            }
            else {
                g0.c = v ^ 0x80000000;
            }
        }
        else {
            g0 = new g(this, continuation0);
        }
        Object object0 = g0.a;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(g0.c) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Triple triple0 = (Triple)pagingSource$LoadParams0.getKey();
                if(triple0 == null) {
                    triple0 = new Triple(null, null, null);
                }
                g0.c = 1;
                object0 = this.a.getFeed(((String)triple0.getFirst()), ((String)triple0.getSecond()), ((Integer)triple0.getThird()), g0);
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
            List list0 = ((EntryItemListModel)((Success)(((Result)object0))).getData()).getItems();
            if(list0 == null) {
                list0 = CollectionsKt__CollectionsKt.emptyList();
            }
            List list1 = CollectionsKt___CollectionsKt.toMutableList(list0);
            return list1.isEmpty() ? new Page(list1, null, null) : new Page(list1, null, new Triple(((EntryItemListModel)((Success)(((Result)object0))).getData()).getFrom(), ((EntryItemListModel)((Success)(((Result)object0))).getData()).getTo(), ((EntryItemListModel)((Success)(((Result)object0))).getData()).getPivot()));
        }
        if(!(((Result)object0) instanceof Fail)) {
            throw new NoWhenBranchMatchedException();
        }
        return new Error(new ErrorModelThrowable(((Fail)(((Result)object0))).getErrorModel()));
    }
}

