package com.kakao.tistory.data.repository;

import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.data.database.SearchDatabase;
import com.kakao.tistory.data.database.dao.SearchDao;
import com.kakao.tistory.data.database.entity.SearchKeyword;
import com.kakao.tistory.data.preference.SearchPreference;
import com.kakao.tistory.data.service.SearchService.DefaultImpls;
import com.kakao.tistory.data.service.SearchService;
import com.kakao.tistory.domain.ErrorStatusKt;
import com.kakao.tistory.domain.entity.SearchKeywordItem;
import com.kakao.tistory.domain.entity.common.ItemListModel;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.repository.SearchRepository;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.l;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u00A2\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\tH\u0016\u00A2\u0006\u0004\b\u000B\u0010\fJ%\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0010\u001A\u00020\u000FH\u0016\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u001F\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0013\u001A\u00020\u000FH\u0016\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001A\u00020\u00142\u0006\u0010\u000E\u001A\u00020\rH\u0016\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u000F\u0010\u0019\u001A\u00020\u0014H\u0016\u00A2\u0006\u0004\b\u0019\u0010\u001AJ&\u0010\u001E\u001A\b\u0012\u0004\u0012\u00020\u001D0\u001C2\u0006\u0010\u001B\u001A\u00020\r2\u0006\u0010\u0010\u001A\u00020\u000FH\u0096@\u00A2\u0006\u0004\b\u001E\u0010\u001FJF\u0010&\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0\u001C2\b\u0010 \u001A\u0004\u0018\u00010\r2\u0006\u0010\u001B\u001A\u00020\r2\u0006\u0010!\u001A\u00020\u000F2\u0006\u0010\"\u001A\u00020\u000F2\u0006\u0010#\u001A\u00020\rH\u0096@\u00A2\u0006\u0004\b&\u0010\'JD\u0010(\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0\u001C2\u0006\u0010 \u001A\u00020\r2\u0006\u0010\u001B\u001A\u00020\r2\u0006\u0010!\u001A\u00020\u000F2\u0006\u0010\"\u001A\u00020\u000F2\u0006\u0010#\u001A\u00020\rH\u0096@\u00A2\u0006\u0004\b(\u0010\'J4\u0010*\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0$0\u001C2\u0006\u0010\u001B\u001A\u00020\r2\u0006\u0010!\u001A\u00020\u000F2\u0006\u0010\"\u001A\u00020\u000FH\u0096@\u00A2\u0006\u0004\b*\u0010+R$\u00102\u001A\u00020,2\u0006\u0010-\u001A\u00020,8V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\b.\u0010/\"\u0004\b0\u00101R$\u00105\u001A\u00020,2\u0006\u0010-\u001A\u00020,8V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\b3\u0010/\"\u0004\b4\u00101\u00A8\u00066"}, d2 = {"Lcom/kakao/tistory/data/repository/SearchRepositoryImpl;", "Lcom/kakao/tistory/data/repository/BaseRepository;", "Lcom/kakao/tistory/domain/repository/SearchRepository;", "Lcom/kakao/tistory/data/preference/SearchPreference;", "searchPreference", "Lcom/kakao/tistory/data/service/SearchService;", "searchService", "<init>", "(Lcom/kakao/tistory/data/preference/SearchPreference;Lcom/kakao/tistory/data/service/SearchService;)V", "", "Lcom/kakao/tistory/domain/entity/SearchKeywordItem;", "getAllRecentSearch", "()Ljava/util/List;", "", "keyword", "", "limit", "getRecentSearch", "(Ljava/lang/String;I)Ljava/util/List;", "maxSavingCount", "", "addRecentSearch", "(Ljava/lang/String;I)V", "removeRecentSearch", "(Ljava/lang/String;)V", "clearRecentSearch", "()V", "query", "Lcom/kakao/tistory/domain/entity/common/Result;", "Lcom/kakao/tistory/domain/entity/SearchKeywordList;", "getSuggestKeyword", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "blogName", "perPage", "page", "sort", "Lcom/kakao/tistory/domain/entity/common/ItemListModel;", "Lcom/kakao/tistory/domain/entity/entry/EntryItem;", "getPosts", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPostsFromTags", "Lcom/kakao/tistory/domain/entity/Blog;", "getBlog", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "value", "getRecentKeywordEnabled", "()Z", "setRecentKeywordEnabled", "(Z)V", "recentKeywordEnabled", "getRecommendKeywordEnabled", "setRecommendKeywordEnabled", "recommendKeywordEnabled", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSearchRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchRepositoryImpl.kt\ncom/kakao/tistory/data/repository/SearchRepositoryImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 BaseRepository.kt\ncom/kakao/tistory/data/repository/BaseRepository\n+ 4 BaseRepository.kt\ncom/kakao/tistory/data/repository/BaseRepository$checkError$2\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,113:1\n1549#2:114\n1620#2,3:115\n1549#2:118\n1620#2,3:119\n26#3,27:122\n53#3:150\n26#3,2:151\n28#3,25:154\n53#3:180\n35#3:181\n26#3,27:182\n53#3:210\n35#3:211\n26#3,27:212\n53#3:240\n35#3:241\n39#4:149\n39#4:179\n39#4:209\n39#4:239\n1#5:153\n*S KotlinDebug\n*F\n+ 1 SearchRepositoryImpl.kt\ncom/kakao/tistory/data/repository/SearchRepositoryImpl\n*L\n37#1:114\n37#1:115,3\n43#1:118\n43#1:119,3\n71#1:122,27\n71#1:150\n81#1:151,2\n81#1:154,25\n81#1:180\n81#1:181\n94#1:182,27\n94#1:210\n94#1:211\n111#1:212,27\n111#1:240\n111#1:241\n71#1:149\n81#1:179\n94#1:209\n111#1:239\n*E\n"})
public final class SearchRepositoryImpl extends BaseRepository implements SearchRepository {
    public final SearchPreference a;
    public final SearchService b;
    public final SearchDao c;

    @Inject
    public SearchRepositoryImpl(@NotNull SearchPreference searchPreference0, @NotNull SearchService searchService0) {
        Intrinsics.checkNotNullParameter(searchPreference0, "searchPreference");
        Intrinsics.checkNotNullParameter(searchService0, "searchService");
        super();
        this.a = searchPreference0;
        this.b = searchService0;
        this.c = SearchDatabase.Companion.getInstance().getSearchDao();
    }

    @Override  // com.kakao.tistory.domain.repository.SearchRepository
    public void addRecentSearch(@NotNull String s, int v) {
        Unit unit0;
        Intrinsics.checkNotNullParameter(s, "keyword");
        Integer integer0 = this.c.getTargetId(s);
        if(integer0 == null) {
            unit0 = null;
        }
        else {
            SearchKeyword searchKeyword0 = new SearchKeyword(integer0.intValue(), s, Calendar.getInstance().getTime());
            this.c.updateKeyword(searchKeyword0);
            unit0 = Unit.INSTANCE;
        }
        if(unit0 == null) {
            SearchKeyword searchKeyword1 = new SearchKeyword(null, s, Calendar.getInstance().getTime());
            this.c.insertKeyword(searchKeyword1);
            this.c.clearOldKeywords(v);
        }
    }

    @Override  // com.kakao.tistory.domain.repository.SearchRepository
    public void clearRecentSearch() {
        this.c.clearAll();
    }

    @Override  // com.kakao.tistory.domain.repository.SearchRepository
    @NotNull
    public List getAllRecentSearch() {
        List list0 = this.c.getAll();
        List list1 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
        for(Object object0: list0) {
            String s = ((SearchKeyword)object0).getKeyword();
            if(s == null) {
                s = "";
            }
            ((ArrayList)list1).add(new SearchKeywordItem(s, ((SearchKeyword)object0).getDate()));
        }
        return list1;
    }

    @Override  // com.kakao.tistory.domain.repository.SearchRepository
    @Nullable
    public Object getBlog(@NotNull String s, int v, int v1, @NotNull Continuation continuation0) {
        BaseRepository baseRepository1;
        p3 p30;
        if(continuation0 instanceof p3) {
            p30 = (p3)continuation0;
            int v2 = p30.d;
            if((v2 & 0x80000000) == 0) {
                p30 = new p3(this, continuation0);
            }
            else {
                p30.d = v2 ^ 0x80000000;
            }
        }
        else {
            p30 = new p3(this, continuation0);
        }
        Object object0 = p30.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(p30.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    p30.a = this;
                    p30.d = 1;
                    object0 = DefaultImpls.getBlog$default(this.b, s, v, v1, null, p30, 8, null);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    p30.a = baseRepository1;
                    p30.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, p30) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository1 = this;
                    goto label_47;
                }
                if(object0 == object1) {
                    return object1;
                }
                baseRepository1 = this;
                break;
            }
            case 1: {
                baseRepository1 = (BaseRepository)p30.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    p30.a = baseRepository1;
                    p30.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, p30) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                BaseRepository baseRepository0 = (BaseRepository)p30.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository1 = (BaseRepository)p30.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)p30.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(errorModel0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            return new Success(object0);
        }
        catch(CancellationException cancellationException0) {
            p30.a = baseRepository1;
            p30.d = 2;
            return baseRepository1.sendError("coroutine cancel", cancellationException0, p30) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        p30.a = baseRepository1;
        p30.d = 3;
        object0 = baseRepository1.createErrorModel(throwable0, p30);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            p30.a = (ErrorModel)object0;
            p30.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), p30) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            p30.a = (ErrorModel)object0;
            p30.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), p30) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.SearchRepository
    @Nullable
    public Object getPosts(@Nullable String s, @NotNull String s1, int v, int v1, @NotNull String s2, @NotNull Continuation continuation0) {
        BaseRepository baseRepository2;
        ItemListModel itemListModel0;
        int v4;
        SearchRepositoryImpl searchRepositoryImpl1;
        SearchRepositoryImpl searchRepositoryImpl0;
        String s4;
        int v3;
        BaseRepository baseRepository1;
        Object object2;
        String s3;
        SearchRepositoryImpl searchRepositoryImpl2;
        String s6;
        String s5;
        int v6;
        int v5;
        q3 q30;
        if(continuation0 instanceof q3) {
            q30 = (q3)continuation0;
            int v2 = q30.i;
            if((v2 & 0x80000000) == 0) {
                q30 = new q3(this, continuation0);
            }
            else {
                q30.i = v2 ^ 0x80000000;
            }
        }
        else {
            q30 = new q3(this, continuation0);
        }
        Object object0 = q30.g;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(q30.i) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(s == null) {
                    v5 = v;
                    v6 = v1;
                    s5 = s2;
                    s6 = s1;
                    searchRepositoryImpl1 = this;
                    searchRepositoryImpl2 = searchRepositoryImpl1;
                    goto label_81;
                }
                else {
                    try {
                        q30.a = this;
                        s3 = s1;
                        q30.b = s3;
                        q30.c = s2;
                        q30.d = this;
                        q30.e = v;
                        q30.f = v1;
                        q30.i = 1;
                        object2 = DefaultImpls.getPostsInBlog$default(this.b, s, s1, v, v1, s2, null, null, q30, 0x60, null);
                    }
                    catch(CancellationException cancellationException0) {
                        baseRepository1 = this;
                        goto label_107;
                    }
                    catch(Throwable throwable0) {
                        baseRepository1 = this;
                        goto label_117;
                    }
                    if(object2 == object1) {
                        return object1;
                    }
                    try {
                        v3 = v;
                        s4 = s2;
                        searchRepositoryImpl0 = this;
                        searchRepositoryImpl1 = searchRepositoryImpl0;
                        v4 = v1;
                        itemListModel0 = (ItemListModel)object2;
                        goto label_75;
                    }
                    catch(CancellationException cancellationException0) {
                        baseRepository2 = searchRepositoryImpl0;
                        goto label_108;
                    }
                    catch(Throwable throwable0) {
                        baseRepository1 = searchRepositoryImpl0;
                        goto label_117;
                    }
                }
                return new Success(itemListModel0);
            }
            case 1: {
                v4 = q30.f;
                v3 = q30.e;
                SearchRepositoryImpl searchRepositoryImpl3 = q30.d;
                s4 = q30.c;
                String s7 = q30.b;
                searchRepositoryImpl1 = (SearchRepositoryImpl)q30.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    s3 = s7;
                    searchRepositoryImpl0 = searchRepositoryImpl3;
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = searchRepositoryImpl3;
                    goto label_107;
                }
                catch(Throwable throwable0) {
                    baseRepository1 = searchRepositoryImpl3;
                    goto label_117;
                }
                try {
                    itemListModel0 = (ItemListModel)object0;
                }
                catch(CancellationException cancellationException0) {
                    baseRepository2 = searchRepositoryImpl0;
                    goto label_108;
                }
                catch(Throwable throwable0) {
                    baseRepository1 = searchRepositoryImpl0;
                    goto label_117;
                }
            label_75:
                if(itemListModel0 == null) {
                    v5 = v3;
                    searchRepositoryImpl2 = searchRepositoryImpl0;
                    s6 = s3;
                    s5 = s4;
                    v6 = v4;
                    try {
                    label_81:
                        q30.a = searchRepositoryImpl2;
                        q30.b = null;
                        q30.c = null;
                        q30.d = null;
                        q30.i = 2;
                        object0 = DefaultImpls.getPosts$default(searchRepositoryImpl1.b, s6, v5, v6, s5, null, q30, 16, null);
                        goto label_96;
                    }
                    catch(CancellationException cancellationException0) {
                        searchRepositoryImpl0 = searchRepositoryImpl2;
                        baseRepository2 = searchRepositoryImpl0;
                        goto label_108;
                    }
                    catch(Throwable throwable0) {
                        searchRepositoryImpl0 = searchRepositoryImpl2;
                    }
                    baseRepository1 = searchRepositoryImpl0;
                    goto label_117;
                label_96:
                    if(object0 == object1) {
                        return object1;
                    }
                    baseRepository1 = searchRepositoryImpl2;
                    itemListModel0 = (ItemListModel)object0;
                    return new Success(itemListModel0);
                }
                else {
                    baseRepository1 = searchRepositoryImpl0;
                }
                return new Success(itemListModel0);
            }
            case 2: {
                baseRepository1 = (BaseRepository)q30.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    itemListModel0 = (ItemListModel)object0;
                    return new Success(itemListModel0);
                }
                catch(CancellationException cancellationException0) {
                label_107:
                    baseRepository2 = baseRepository1;
                label_108:
                    q30.a = baseRepository2;
                    q30.b = null;
                    q30.c = null;
                    q30.d = null;
                    q30.i = 3;
                    return baseRepository2.sendError("coroutine cancel", cancellationException0, q30) == object1 ? object1 : new Fail(baseRepository2.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                }
            label_117:
                q30.a = baseRepository1;
                q30.b = null;
                q30.c = null;
                q30.d = null;
                q30.i = 4;
                object0 = baseRepository1.createErrorModel(throwable0, q30);
                if(object0 == object1) {
                    return object1;
                }
                goto label_127;
            }
            case 3: {
                BaseRepository baseRepository0 = (BaseRepository)q30.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 4: {
                break;
            }
            case 5: 
            case 6: {
                ErrorModel errorModel0 = (ErrorModel)q30.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(errorModel0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        baseRepository1 = (BaseRepository)q30.a;
        ResultKt.throwOnFailure(object0);
    label_127:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            q30.a = (ErrorModel)object0;
            q30.i = 5;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), q30) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            q30.a = (ErrorModel)object0;
            q30.i = 6;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), q30) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.SearchRepository
    @Nullable
    public Object getPostsFromTags(@NotNull String s, @NotNull String s1, int v, int v1, @NotNull String s2, @NotNull Continuation continuation0) {
        BaseRepository baseRepository1;
        r3 r30;
        if(continuation0 instanceof r3) {
            r30 = (r3)continuation0;
            int v2 = r30.d;
            if((v2 & 0x80000000) == 0) {
                r30 = new r3(this, continuation0);
            }
            else {
                r30.d = v2 ^ 0x80000000;
            }
        }
        else {
            r30 = new r3(this, continuation0);
        }
        Object object0 = r30.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(r30.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    r30.a = this;
                    r30.d = 1;
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    r30.a = baseRepository1;
                    r30.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, r30) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                try {
                    object0 = DefaultImpls.getPostsInBlog$default(this.b, s, s1, v, v1, s2, "tag", null, r30, 0x40, null);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    r30.a = baseRepository1;
                    r30.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, r30) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository1 = this;
                    goto label_47;
                }
                if(object0 == object1) {
                    return object1;
                }
                baseRepository1 = this;
                break;
            }
            case 1: {
                baseRepository1 = (BaseRepository)r30.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    r30.a = baseRepository1;
                    r30.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, r30) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                BaseRepository baseRepository0 = (BaseRepository)r30.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository1 = (BaseRepository)r30.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)r30.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(errorModel0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            return new Success(object0);
        }
        catch(CancellationException cancellationException0) {
            r30.a = baseRepository1;
            r30.d = 2;
            return baseRepository1.sendError("coroutine cancel", cancellationException0, r30) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        r30.a = baseRepository1;
        r30.d = 3;
        object0 = baseRepository1.createErrorModel(throwable0, r30);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            r30.a = (ErrorModel)object0;
            r30.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), r30) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            r30.a = (ErrorModel)object0;
            r30.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), r30) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.SearchRepository
    public boolean getRecentKeywordEnabled() {
        return this.a.getRecentKeywordEnabled();
    }

    @Override  // com.kakao.tistory.domain.repository.SearchRepository
    @NotNull
    public List getRecentSearch(@NotNull String s, int v) {
        Intrinsics.checkNotNullParameter(s, "keyword");
        List list0 = this.c.getItems(s, v);
        List list1 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
        for(Object object0: list0) {
            String s1 = ((SearchKeyword)object0).getKeyword();
            if(s1 == null) {
                s1 = "";
            }
            ((ArrayList)list1).add(new SearchKeywordItem(s1, ((SearchKeyword)object0).getDate()));
        }
        return list1;
    }

    @Override  // com.kakao.tistory.domain.repository.SearchRepository
    public boolean getRecommendKeywordEnabled() {
        return this.a.getRecommendKeywordEnabled();
    }

    @Override  // com.kakao.tistory.domain.repository.SearchRepository
    @Nullable
    public Object getSuggestKeyword(@NotNull String s, int v, @NotNull Continuation continuation0) {
        BaseRepository baseRepository1;
        s3 s30;
        if(continuation0 instanceof s3) {
            s30 = (s3)continuation0;
            int v1 = s30.d;
            if((v1 & 0x80000000) == 0) {
                s30 = new s3(this, continuation0);
            }
            else {
                s30.d = v1 ^ 0x80000000;
            }
        }
        else {
            s30 = new s3(this, continuation0);
        }
        Object object0 = s30.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(s30.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    s30.a = this;
                    s30.d = 1;
                    object0 = DefaultImpls.getSuggestKeyword$default(this.b, s, v, null, s30, 4, null);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    s30.a = baseRepository1;
                    s30.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, s30) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository1 = this;
                    goto label_47;
                }
                if(object0 == object1) {
                    return object1;
                }
                baseRepository1 = this;
                break;
            }
            case 1: {
                baseRepository1 = (BaseRepository)s30.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    s30.a = baseRepository1;
                    s30.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, s30) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                BaseRepository baseRepository0 = (BaseRepository)s30.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository1 = (BaseRepository)s30.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)s30.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(errorModel0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            return new Success(object0);
        }
        catch(CancellationException cancellationException0) {
            s30.a = baseRepository1;
            s30.d = 2;
            return baseRepository1.sendError("coroutine cancel", cancellationException0, s30) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        s30.a = baseRepository1;
        s30.d = 3;
        object0 = baseRepository1.createErrorModel(throwable0, s30);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            s30.a = (ErrorModel)object0;
            s30.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), s30) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            s30.a = (ErrorModel)object0;
            s30.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), s30) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.SearchRepository
    public void removeRecentSearch(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "keyword");
        this.c.removeKeyword(s);
    }

    @Override  // com.kakao.tistory.domain.repository.SearchRepository
    public void setRecentKeywordEnabled(boolean z) {
        this.a.setRecentKeywordEnabled(z);
    }

    @Override  // com.kakao.tistory.domain.repository.SearchRepository
    public void setRecommendKeywordEnabled(boolean z) {
        this.a.setRecommendKeywordEnabled(z);
    }
}

