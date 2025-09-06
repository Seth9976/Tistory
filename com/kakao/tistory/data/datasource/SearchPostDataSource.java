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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0004\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ^\u0010\u0017\u001A\u00020\u00122\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000E\u001A\u00020\n2 \u0010\u0013\u001A\u001C\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00120\u000F2\u0012\u0010\u0016\u001A\u000E\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00120\u0014H\u0094@¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/kakao/tistory/data/datasource/SearchPostDataSource;", "Lcom/kakao/tistory/data/datasource/BaseSearchDataSource;", "Lcom/kakao/tistory/domain/repository/SearchRepository;", "searchRepository", "", "blogName", "query", "sortType", "<init>", "(Lcom/kakao/tistory/domain/repository/SearchRepository;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "key", "", "isInit", "loadSize", "Lkotlin/Function2;", "", "Lcom/kakao/tistory/domain/entity/SearchResultItem;", "", "onSuccess", "Lkotlin/Function1;", "Lcom/kakao/android/base/model/ErrorModel;", "onError", "loadItems", "(IZILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSearchPostDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchPostDataSource.kt\ncom/kakao/tistory/data/datasource/SearchPostDataSource\n+ 2 Result.kt\ncom/kakao/tistory/domain/entity/common/ResultKt\n*L\n1#1,30:1\n15#2,5:31\n*S KotlinDebug\n*F\n+ 1 SearchPostDataSource.kt\ncom/kakao/tistory/data/datasource/SearchPostDataSource\n*L\n23#1:31,5\n*E\n"})
public final class SearchPostDataSource extends BaseSearchDataSource {
    public final SearchRepository b;
    public final String c;
    public final String d;
    public final String e;

    public SearchPostDataSource(@NotNull SearchRepository searchRepository0, @Nullable String s, @NotNull String s1, @Nullable String s2) {
        Intrinsics.checkNotNullParameter(searchRepository0, "searchRepository");
        Intrinsics.checkNotNullParameter(s1, "query");
        super(s);
        this.b = searchRepository0;
        this.c = s;
        this.d = s1;
        this.e = s2;
    }

    public SearchPostDataSource(SearchRepository searchRepository0, String s, String s1, String s2, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            s = null;
        }
        this(searchRepository0, s, s1, s2);
    }

    @Override  // com.kakao.tistory.data.datasource.BaseSearchDataSource
    @Nullable
    public Object loadItems(int v, boolean z, int v1, @NotNull Function2 function20, @NotNull Function1 function10, @NotNull Continuation continuation0) {
        SearchPostDataSource searchPostDataSource0;
        k k0;
        if(continuation0 instanceof k) {
            k0 = (k)continuation0;
            int v2 = k0.g;
            if((v2 & 0x80000000) == 0) {
                k0 = new k(this, continuation0);
            }
            else {
                k0.g = v2 ^ 0x80000000;
            }
        }
        else {
            k0 = new k(this, continuation0);
        }
        Object object0 = k0.e;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(k0.g) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                k0.a = this;
                k0.b = function20;
                k0.c = function10;
                k0.d = z;
                k0.g = 1;
                object0 = this.b.getPosts(this.c, this.d, v1, v, (this.e == null ? "accuracy" : this.e), k0);
                if(object0 == object1) {
                    return object1;
                }
                searchPostDataSource0 = this;
                break;
            }
            case 1: {
                z = k0.d;
                function10 = k0.c;
                function20 = k0.b;
                searchPostDataSource0 = k0.a;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((Result)object0) instanceof Success) {
            function20.invoke(searchPostDataSource0.convertEntryItems(((ItemListModel)((Success)(((Result)object0))).getData()), z), ((ItemListModel)((Success)(((Result)object0))).getData()).getNextPage());
            return Unit.INSTANCE;
        }
        if(((Result)object0) instanceof Fail) {
            function10.invoke(((Fail)(((Result)object0))).getErrorModel());
        }
        return Unit.INSTANCE;
    }
}

