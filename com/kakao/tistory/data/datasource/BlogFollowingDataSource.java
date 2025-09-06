package com.kakao.tistory.data.datasource;

import androidx.paging.PagingSource.LoadParams;
import androidx.paging.PagingSource.LoadResult.Page;
import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.domain.entity.common.ItemListModel;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.domain.repository.OldBlogRepository;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001B\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\f\u001A\u00020\u00022\u0012\u0010\u000B\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\nH\u0016¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0011\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00102\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00020\u000EH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u001A\u001A\u00020\u00138\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001B"}, d2 = {"Lcom/kakao/tistory/data/datasource/BlogFollowingDataSource;", "Landroidx/paging/PagingSource;", "", "Lcom/kakao/tistory/domain/entity/Blog;", "Lcom/kakao/tistory/domain/repository/OldBlogRepository;", "oldBlogRepository", "", "sortType", "<init>", "(Lcom/kakao/tistory/domain/repository/OldBlogRepository;Ljava/lang/String;)V", "Landroidx/paging/PagingState;", "state", "getRefreshKey", "(Landroidx/paging/PagingState;)Ljava/lang/Integer;", "Landroidx/paging/PagingSource$LoadParams;", "params", "Landroidx/paging/PagingSource$LoadResult;", "load", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "d", "J", "getTotalCount", "()J", "setTotalCount", "(J)V", "totalCount", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBlogFollowingDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogFollowingDataSource.kt\ncom/kakao/tistory/data/datasource/BlogFollowingDataSource\n+ 2 Result.kt\ncom/kakao/tistory/domain/entity/common/ResultKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,43:1\n25#2,2:44\n27#2:63\n819#3:46\n847#3,2:47\n1603#3,9:50\n1855#3:59\n1856#3:61\n1612#3:62\n1#4:49\n1#4:60\n*S KotlinDebug\n*F\n+ 1 BlogFollowingDataSource.kt\ncom/kakao/tistory/data/datasource/BlogFollowingDataSource\n*L\n31#1:44,2\n31#1:63\n33#1:46\n33#1:47,2\n37#1:50,9\n37#1:59\n37#1:61\n37#1:62\n37#1:60\n*E\n"})
public final class BlogFollowingDataSource extends PagingSource {
    public final OldBlogRepository a;
    public final String b;
    public final LinkedHashSet c;
    public long d;

    public BlogFollowingDataSource(@NotNull OldBlogRepository oldBlogRepository0, @Nullable String s) {
        Intrinsics.checkNotNullParameter(oldBlogRepository0, "oldBlogRepository");
        super();
        this.a = oldBlogRepository0;
        this.b = s;
        this.c = new LinkedHashSet();
    }

    public BlogFollowingDataSource(OldBlogRepository oldBlogRepository0, String s, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            s = null;
        }
        this(oldBlogRepository0, s);
    }

    @NotNull
    public Integer getRefreshKey(@NotNull PagingState pagingState0) {
        Intrinsics.checkNotNullParameter(pagingState0, "state");
        this.c.clear();
        return 1;
    }

    @Override  // androidx.paging.PagingSource
    public Object getRefreshKey(PagingState pagingState0) {
        return this.getRefreshKey(pagingState0);
    }

    public final long getTotalCount() {
        return this.d;
    }

    @Override  // androidx.paging.PagingSource
    @Nullable
    public Object load(@NotNull LoadParams pagingSource$LoadParams0, @NotNull Continuation continuation0) {
        BlogFollowingDataSource blogFollowingDataSource0;
        e e0;
        if(continuation0 instanceof e) {
            e0 = (e)continuation0;
            int v = e0.d;
            if((v & 0x80000000) == 0) {
                e0 = new e(this, continuation0);
            }
            else {
                e0.d = v ^ 0x80000000;
            }
        }
        else {
            e0 = new e(this, continuation0);
        }
        Object object0 = e0.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(e0.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Integer integer0 = (Integer)pagingSource$LoadParams0.getKey();
                e0.a = this;
                e0.d = 1;
                object0 = this.a.getBlogFollowings((integer0 == null ? 1 : ((int)integer0)), this.b, e0);
                if(object0 == object1) {
                    return object1;
                }
                blogFollowingDataSource0 = this;
                break;
            }
            case 1: {
                blogFollowingDataSource0 = e0.a;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((Result)object0) instanceof Success) {
            ArrayList arrayList0 = new ArrayList();
            List list0 = ((ItemListModel)((Success)(((Result)object0))).getData()).getItems();
            if(list0 != null) {
                ArrayList arrayList1 = new ArrayList();
                for(Object object2: list0) {
                    Long long0 = ((Blog)object2).getId();
                    if(!blogFollowingDataSource0.c.contains(Boxing.boxLong((long0 == null ? 0L : ((long)long0))))) {
                        arrayList1.add(object2);
                    }
                }
                arrayList0.addAll(arrayList1);
            }
            Long long1 = ((ItemListModel)((Success)(((Result)object0))).getData()).getTotalCount();
            blogFollowingDataSource0.d = long1 == null ? blogFollowingDataSource0.d : ((long)long1);
            LinkedHashSet linkedHashSet0 = blogFollowingDataSource0.c;
            ArrayList arrayList2 = new ArrayList();
            for(Object object3: arrayList0) {
                Long long2 = ((Blog)object3).getId();
                if(long2 != null) {
                    arrayList2.add(long2);
                }
            }
            linkedHashSet0.addAll(arrayList2);
            return new Page(arrayList0, null, ((ItemListModel)((Success)(((Result)object0))).getData()).getNextPage());
        }
        if(!(((Result)object0) instanceof Fail)) {
            throw new NoWhenBranchMatchedException();
        }
        return new Page(CollectionsKt__CollectionsKt.emptyList(), null, null);
    }

    public final void setTotalCount(long v) {
        this.d = v;
    }
}

