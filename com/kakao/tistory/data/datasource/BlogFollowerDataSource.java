package com.kakao.tistory.data.datasource;

import androidx.paging.PagingSource.LoadParams;
import androidx.paging.PagingSource.LoadResult.Error;
import androidx.paging.PagingSource.LoadResult.Page;
import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import com.kakao.tistory.domain.entity.User;
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

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B%\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001A\u00020\u00022\u0012\u0010\f\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000BH\u0016¢\u0006\u0004\b\r\u0010\u000EJ*\u0010\u0012\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00112\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u00020\u000FH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u001B\u001A\u00020\u00148\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001A¨\u0006\u001C"}, d2 = {"Lcom/kakao/tistory/data/datasource/BlogFollowerDataSource;", "Landroidx/paging/PagingSource;", "", "Lcom/kakao/tistory/domain/entity/User;", "Lcom/kakao/tistory/domain/repository/OldBlogRepository;", "oldBlogRepository", "", "blogName", "sortType", "<init>", "(Lcom/kakao/tistory/domain/repository/OldBlogRepository;Ljava/lang/String;Ljava/lang/String;)V", "Landroidx/paging/PagingState;", "state", "getRefreshKey", "(Landroidx/paging/PagingState;)Ljava/lang/Integer;", "Landroidx/paging/PagingSource$LoadParams;", "params", "Landroidx/paging/PagingSource$LoadResult;", "load", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "e", "J", "getTotalCount", "()J", "setTotalCount", "(J)V", "totalCount", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBlogFollowerDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogFollowerDataSource.kt\ncom/kakao/tistory/data/datasource/BlogFollowerDataSource\n+ 2 Result.kt\ncom/kakao/tistory/domain/entity/common/ResultKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,50:1\n25#2,2:51\n27#2:70\n819#3:53\n847#3,2:54\n1603#3,9:57\n1855#3:66\n1856#3:68\n1612#3:69\n1#4:56\n1#4:67\n*S KotlinDebug\n*F\n+ 1 BlogFollowerDataSource.kt\ncom/kakao/tistory/data/datasource/BlogFollowerDataSource\n*L\n38#1:51,2\n38#1:70\n40#1:53\n40#1:54,2\n44#1:57,9\n44#1:66\n44#1:68\n44#1:69\n44#1:67\n*E\n"})
public final class BlogFollowerDataSource extends PagingSource {
    public final OldBlogRepository a;
    public final String b;
    public final String c;
    public final LinkedHashSet d;
    public long e;

    public BlogFollowerDataSource(@NotNull OldBlogRepository oldBlogRepository0, @Nullable String s, @Nullable String s1) {
        Intrinsics.checkNotNullParameter(oldBlogRepository0, "oldBlogRepository");
        super();
        this.a = oldBlogRepository0;
        this.b = s;
        this.c = s1;
        this.d = new LinkedHashSet();
    }

    public BlogFollowerDataSource(OldBlogRepository oldBlogRepository0, String s, String s1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 4) != 0) {
            s1 = null;
        }
        this(oldBlogRepository0, s, s1);
    }

    @NotNull
    public Integer getRefreshKey(@NotNull PagingState pagingState0) {
        Intrinsics.checkNotNullParameter(pagingState0, "state");
        this.d.clear();
        return 1;
    }

    @Override  // androidx.paging.PagingSource
    public Object getRefreshKey(PagingState pagingState0) {
        return this.getRefreshKey(pagingState0);
    }

    public final long getTotalCount() {
        return this.e;
    }

    @Override  // androidx.paging.PagingSource
    @Nullable
    public Object load(@NotNull LoadParams pagingSource$LoadParams0, @NotNull Continuation continuation0) {
        BlogFollowerDataSource blogFollowerDataSource0;
        d d0;
        if(continuation0 instanceof d) {
            d0 = (d)continuation0;
            int v = d0.d;
            if((v & 0x80000000) == 0) {
                d0 = new d(this, continuation0);
            }
            else {
                d0.d = v ^ 0x80000000;
            }
        }
        else {
            d0 = new d(this, continuation0);
        }
        Object object0 = d0.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(d0.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(this.b == null) {
                    return new Error(new Throwable());
                }
                Integer integer0 = (Integer)pagingSource$LoadParams0.getKey();
                d0.a = this;
                d0.d = 1;
                object0 = this.a.getBlogFollowers(this.b, (integer0 == null ? 1 : ((int)integer0)), this.c, d0);
                if(object0 == object1) {
                    return object1;
                }
                blogFollowerDataSource0 = this;
                break;
            }
            case 1: {
                blogFollowerDataSource0 = d0.a;
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
                    Long long0 = ((User)object2).getId();
                    if(!blogFollowerDataSource0.d.contains(Boxing.boxLong((long0 == null ? 0L : ((long)long0))))) {
                        arrayList1.add(object2);
                    }
                }
                arrayList0.addAll(arrayList1);
            }
            Long long1 = ((ItemListModel)((Success)(((Result)object0))).getData()).getTotalCount();
            blogFollowerDataSource0.e = long1 == null ? blogFollowerDataSource0.e : ((long)long1);
            LinkedHashSet linkedHashSet0 = blogFollowerDataSource0.d;
            ArrayList arrayList2 = new ArrayList();
            for(Object object3: arrayList0) {
                Long long2 = ((User)object3).getId();
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
        this.e = v;
    }
}

