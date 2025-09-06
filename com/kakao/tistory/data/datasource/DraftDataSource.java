package com.kakao.tistory.data.datasource;

import androidx.paging.PagingSource.LoadParams;
import androidx.paging.PagingSource.LoadResult.Error;
import androidx.paging.PagingSource.LoadResult.Page;
import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import com.kakao.tistory.domain.entity.DraftListModel;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.domain.repository.AccountRepository;
import com.kakao.tistory.domain.repository.EntryRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ*\u0010\r\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\f2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00020\nH\u0096@¢\u0006\u0004\b\r\u0010\u000EJ#\u0010\u0011\u001A\u00020\u00022\u0012\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000FH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/kakao/tistory/data/datasource/DraftDataSource;", "Landroidx/paging/PagingSource;", "", "Lcom/kakao/tistory/domain/entity/entry/DraftItem;", "Lcom/kakao/tistory/domain/repository/AccountRepository;", "accountRepository", "Lcom/kakao/tistory/domain/repository/EntryRepository;", "entryRepository", "<init>", "(Lcom/kakao/tistory/domain/repository/AccountRepository;Lcom/kakao/tistory/domain/repository/EntryRepository;)V", "Landroidx/paging/PagingSource$LoadParams;", "params", "Landroidx/paging/PagingSource$LoadResult;", "load", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/paging/PagingState;", "state", "getRefreshKey", "(Landroidx/paging/PagingState;)Ljava/lang/Integer;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDraftDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DraftDataSource.kt\ncom/kakao/tistory/data/datasource/DraftDataSource\n+ 2 Result.kt\ncom/kakao/tistory/domain/entity/common/ResultKt\n*L\n1#1,38:1\n15#2,5:39\n*S KotlinDebug\n*F\n+ 1 DraftDataSource.kt\ncom/kakao/tistory/data/datasource/DraftDataSource\n*L\n22#1:39,5\n*E\n"})
public final class DraftDataSource extends PagingSource {
    public final AccountRepository a;
    public final EntryRepository b;

    public DraftDataSource(@NotNull AccountRepository accountRepository0, @NotNull EntryRepository entryRepository0) {
        Intrinsics.checkNotNullParameter(accountRepository0, "accountRepository");
        Intrinsics.checkNotNullParameter(entryRepository0, "entryRepository");
        super();
        this.a = accountRepository0;
        this.b = entryRepository0;
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
        f f0;
        if(continuation0 instanceof f) {
            f0 = (f)continuation0;
            int v = f0.c;
            if((v & 0x80000000) == 0) {
                f0 = new f(this, continuation0);
            }
            else {
                f0.c = v ^ 0x80000000;
            }
        }
        else {
            f0 = new f(this, continuation0);
        }
        Object object0 = f0.a;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(f0.c) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                String s = (String)this.a.getOldCurrentBlogName().getValue();
                if(s == null) {
                    return new Error(new Throwable("Paging Error"));
                }
                Integer integer0 = (Integer)pagingSource$LoadParams0.getKey();
                f0.c = 1;
                object0 = this.b.getDraftList(s, Boxing.boxInt((integer0 == null ? 1 : ((int)integer0))), f0);
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
            List list0 = ((DraftListModel)((Success)(((Result)object0))).getData()).getItems();
            if(list0 == null) {
                list0 = CollectionsKt__CollectionsKt.emptyList();
            }
            return new Page(list0, ((DraftListModel)((Success)(((Result)object0))).getData()).getPrevPage(), ((DraftListModel)((Success)(((Result)object0))).getData()).getNextPage());
        }
        return ((Result)object0) instanceof Fail ? new Error(new Throwable("Paging Error")) : new Error(new Throwable("Paging Error"));
    }
}

