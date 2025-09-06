package com.kakao.tistory.data.datasource;

import androidx.paging.PagingSource.LoadParams;
import androidx.paging.PagingSource.LoadResult.Error;
import androidx.paging.PagingSource.LoadResult.Page;
import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import com.kakao.tistory.domain.entity.common.EntryItemListModel;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.domain.repository.OldBlogRepository.DefaultImpls;
import com.kakao.tistory.domain.repository.OldBlogRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0002\u0010\b\u001A\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001A\u00020\u00022\u0012\u0010\f\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000BH\u0016¢\u0006\u0004\b\r\u0010\u000EJ*\u0010\u0012\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00112\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u00020\u000FH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/kakao/tistory/data/datasource/PostDataSource;", "Landroidx/paging/PagingSource;", "", "Lcom/kakao/tistory/domain/entity/entry/EntryItem;", "Lcom/kakao/tistory/domain/repository/OldBlogRepository;", "oldBlogRepository", "", "blogName", "category", "<init>", "(Lcom/kakao/tistory/domain/repository/OldBlogRepository;Ljava/lang/String;I)V", "Landroidx/paging/PagingState;", "state", "getRefreshKey", "(Landroidx/paging/PagingState;)Ljava/lang/Integer;", "Landroidx/paging/PagingSource$LoadParams;", "params", "Landroidx/paging/PagingSource$LoadResult;", "load", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPostDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostDataSource.kt\ncom/kakao/tistory/data/datasource/PostDataSource\n+ 2 Result.kt\ncom/kakao/tistory/domain/entity/common/ResultKt\n*L\n1#1,30:1\n15#2,5:31\n*S KotlinDebug\n*F\n+ 1 PostDataSource.kt\ncom/kakao/tistory/data/datasource/PostDataSource\n*L\n20#1:31,5\n*E\n"})
public final class PostDataSource extends PagingSource {
    public final OldBlogRepository a;
    public final String b;
    public final int c;

    public PostDataSource(@NotNull OldBlogRepository oldBlogRepository0, @NotNull String s, int v) {
        Intrinsics.checkNotNullParameter(oldBlogRepository0, "oldBlogRepository");
        Intrinsics.checkNotNullParameter(s, "blogName");
        super();
        this.a = oldBlogRepository0;
        this.b = s;
        this.c = v;
    }

    public PostDataSource(OldBlogRepository oldBlogRepository0, String s, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 4) != 0) {
            v = -3;
        }
        this(oldBlogRepository0, s, v);
    }

    @NotNull
    public Integer getRefreshKey(@NotNull PagingState pagingState0) {
        Intrinsics.checkNotNullParameter(pagingState0, "state");
        return 1;
    }

    @Override  // androidx.paging.PagingSource
    public Object getRefreshKey(PagingState pagingState0) {
        return this.getRefreshKey(pagingState0);
    }

    @Override  // androidx.paging.PagingSource
    @Nullable
    public Object load(@NotNull LoadParams pagingSource$LoadParams0, @NotNull Continuation continuation0) {
        i i0;
        if(continuation0 instanceof i) {
            i0 = (i)continuation0;
            int v = i0.c;
            if((v & 0x80000000) == 0) {
                i0 = new i(this, continuation0);
            }
            else {
                i0.c = v ^ 0x80000000;
            }
        }
        else {
            i0 = new i(this, continuation0);
        }
        Object object0 = i0.a;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(i0.c) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Integer integer0 = (Integer)pagingSource$LoadParams0.getKey();
                i0.c = 1;
                object0 = DefaultImpls.getPosts$default(this.a, this.b, this.c, (integer0 == null ? 1 : ((int)integer0)), 0, i0, 8, null);
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
            EntryItemListModel entryItemListModel0 = (EntryItemListModel)((Success)(((Result)object0))).getData();
            List list0 = entryItemListModel0.getItems();
            if(list0 == null) {
                list0 = CollectionsKt__CollectionsKt.emptyList();
            }
            return new Page(list0, null, entryItemListModel0.getNextPage());
        }
        return ((Result)object0) instanceof Fail ? new Error(new Throwable(((Fail)(((Result)object0))).getErrorModel().getMessage())) : new Error(new Throwable());
    }
}

