package com.kakao.tistory.data.datasource;

import com.kakao.tistory.domain.entity.common.ItemListModel;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.domain.repository.SearchRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J^\u0010\u0015\u001A\u00020\u00102\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\f\u001A\u00020\b2 \u0010\u0011\u001A\u001C\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000F0\u000E\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00100\r2\u0012\u0010\u0014\u001A\u000E\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00100\u0012H\u0094@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/kakao/tistory/data/datasource/SearchBlogDataSource;", "Lcom/kakao/tistory/data/datasource/BaseSearchDataSource;", "Lcom/kakao/tistory/domain/repository/SearchRepository;", "searchRepository", "", "query", "<init>", "(Lcom/kakao/tistory/domain/repository/SearchRepository;Ljava/lang/String;)V", "", "key", "", "isInit", "loadSize", "Lkotlin/Function2;", "", "Lcom/kakao/tistory/domain/entity/SearchResultItem;", "", "onSuccess", "Lkotlin/Function1;", "Lcom/kakao/android/base/model/ErrorModel;", "onError", "loadItems", "(IZILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSearchBlogDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBlogDataSource.kt\ncom/kakao/tistory/data/datasource/SearchBlogDataSource\n+ 2 Result.kt\ncom/kakao/tistory/domain/entity/common/ResultKt\n*L\n1#1,27:1\n15#2,5:28\n*S KotlinDebug\n*F\n+ 1 SearchBlogDataSource.kt\ncom/kakao/tistory/data/datasource/SearchBlogDataSource\n*L\n20#1:28,5\n*E\n"})
public final class SearchBlogDataSource extends BaseSearchDataSource {
    public final SearchRepository b;
    public final String c;

    public SearchBlogDataSource(@NotNull SearchRepository searchRepository0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(searchRepository0, "searchRepository");
        Intrinsics.checkNotNullParameter(s, "query");
        super(null, 1, null);
        this.b = searchRepository0;
        this.c = s;
    }

    @Override  // com.kakao.tistory.data.datasource.BaseSearchDataSource
    @Nullable
    public Object loadItems(int v, boolean z, int v1, @NotNull Function2 function20, @NotNull Function1 function10, @NotNull Continuation continuation0) {
        SearchBlogDataSource searchBlogDataSource0;
        j j0;
        if(continuation0 instanceof j) {
            j0 = (j)continuation0;
            int v2 = j0.g;
            if((v2 & 0x80000000) == 0) {
                j0 = new j(this, continuation0);
            }
            else {
                j0.g = v2 ^ 0x80000000;
            }
        }
        else {
            j0 = new j(this, continuation0);
        }
        Object object0 = j0.e;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(j0.g) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                j0.a = this;
                j0.b = function20;
                j0.c = function10;
                j0.d = z;
                j0.g = 1;
                object0 = this.b.getBlog(this.c, v1, v, j0);
                if(object0 == object1) {
                    return object1;
                }
                searchBlogDataSource0 = this;
                break;
            }
            case 1: {
                z = j0.d;
                function10 = j0.c;
                function20 = j0.b;
                searchBlogDataSource0 = j0.a;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((Result)object0) instanceof Success) {
            function20.invoke(searchBlogDataSource0.convertBlogItems(((ItemListModel)((Success)(((Result)object0))).getData()), z), ((ItemListModel)((Success)(((Result)object0))).getData()).getNextPage());
            return Unit.INSTANCE;
        }
        if(((Result)object0) instanceof Fail) {
            function10.invoke(((Fail)(((Result)object0))).getErrorModel());
        }
        return Unit.INSTANCE;
    }
}

