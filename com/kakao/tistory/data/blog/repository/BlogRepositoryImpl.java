package com.kakao.tistory.data.blog.repository;

import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.data.blog.api.BlogService;
import com.kakao.tistory.data.common.PagingKt;
import com.kakao.tistory.data.preference.BlogPreference;
import com.kakao.tistory.data.repository.BaseRepository;
import com.kakao.tistory.domain.ErrorStatusKt;
import com.kakao.tistory.domain.blog.entity.RefererKeywordResponse;
import com.kakao.tistory.domain.blog.entity.RefererLogResponse;
import com.kakao.tistory.domain.blog.entity.TrendResponse;
import com.kakao.tistory.domain.blog.repository.BlogRepository;
import com.kakao.tistory.domain.common.ItemListModel;
import com.kakao.tistory.domain.entity.common.ItemModel;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u008A\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u00A2\u0006\u0004\b\u0007\u0010\bJ\u001E\u0010\r\u001A\b\u0012\u0004\u0012\u00020\f0\u000B2\u0006\u0010\n\u001A\u00020\tH\u0096@\u00A2\u0006\u0004\b\r\u0010\u000EJ$\u0010\u0011\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000F0\u000B2\u0006\u0010\n\u001A\u00020\tH\u0096@\u00A2\u0006\u0004\b\u0011\u0010\u000EJ$\u0010\u0015\u001A\u000E\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\n\u001A\u00020\tH\u0096@\u00A2\u0006\u0004\b\u0015\u0010\u000EJ$\u0010\u0017\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00160\u000B2\u0006\u0010\n\u001A\u00020\tH\u0096@\u00A2\u0006\u0004\b\u0017\u0010\u000EJ.\u0010\u001A\u001A\u000E\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00190\u00122\u0006\u0010\n\u001A\u00020\t2\b\u0010\u0018\u001A\u0004\u0018\u00010\u0013H\u0096@\u00A2\u0006\u0004\b\u001A\u0010\u001BJ$\u0010\u001D\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001C0\u000F0\u000B2\u0006\u0010\n\u001A\u00020\tH\u0096@\u00A2\u0006\u0004\b\u001D\u0010\u000EJ$\u0010\u001F\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001E0\u000F0\u000B2\u0006\u0010\n\u001A\u00020\tH\u0096@\u00A2\u0006\u0004\b\u001F\u0010\u000EJ$\u0010!\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u000F0\u000B2\u0006\u0010\n\u001A\u00020\tH\u0096@\u00A2\u0006\u0004\b!\u0010\u000EJ\u0016\u0010$\u001A\b\u0012\u0004\u0012\u00020#0\"H\u0096@\u00A2\u0006\u0004\b$\u0010%J\u0016\u0010\'\u001A\b\u0012\u0004\u0012\u00020&0\u000BH\u0096@\u00A2\u0006\u0004\b\'\u0010%J%\u0010)\u001A\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010(\u001A\u00020\tH\u0016\u00A2\u0006\u0004\b)\u0010*J&\u0010+\u001A\b\u0012\u0004\u0012\u00020&0\u000B2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010(\u001A\u00020\tH\u0096@\u00A2\u0006\u0004\b+\u0010,J\u001E\u0010/\u001A\b\u0012\u0004\u0012\u00020&0\u000B2\u0006\u0010.\u001A\u00020-H\u0096@\u00A2\u0006\u0004\b/\u00100J\u001E\u00101\u001A\b\u0012\u0004\u0012\u00020&0\u000B2\u0006\u0010.\u001A\u00020-H\u0096@\u00A2\u0006\u0004\b1\u00100J$\u00103\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u0002020\u000F0\u000B2\u0006\u0010\n\u001A\u00020\tH\u0096@\u00A2\u0006\u0004\b3\u0010\u000E\u00A8\u00064"}, d2 = {"Lcom/kakao/tistory/data/blog/repository/BlogRepositoryImpl;", "Lcom/kakao/tistory/data/repository/BaseRepository;", "Lcom/kakao/tistory/domain/blog/repository/BlogRepository;", "Lcom/kakao/tistory/data/blog/api/BlogService;", "blogService", "Lcom/kakao/tistory/data/preference/BlogPreference;", "blogPreference", "<init>", "(Lcom/kakao/tistory/data/blog/api/BlogService;Lcom/kakao/tistory/data/preference/BlogPreference;)V", "", "blogName", "Lcom/kakao/tistory/domain/entity/common/Result;", "Lcom/kakao/tistory/domain/blog/entity/BlogInfo;", "getBlogInfo", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/kakao/tistory/domain/blog/entity/Category;", "getCategories", "Landroidx/paging/Pager;", "", "Lcom/kakao/tistory/domain/blog/entity/Notice;", "getNoticeList", "Lcom/kakao/tistory/domain/common/PagingModel;", "getRecentNoticeList", "category", "Lcom/kakao/tistory/domain/blog/entity/Entry;", "getEntryList", "(Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/kakao/tistory/domain/blog/entity/Trend;", "getTrend", "Lcom/kakao/tistory/domain/blog/entity/RefererLog;", "getRefererLog", "Lcom/kakao/tistory/domain/blog/entity/RefererKeyword;", "getRefererKeywords", "Lkotlinx/coroutines/flow/Flow;", "", "getFirstOpen", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "setFirstOpened", "challengeCode", "getShowChallengeAuth", "(Ljava/lang/String;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "setShowChallengeAuth", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "targetUserId", "postBlockUser", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteBlockUser", "Lcom/kakao/tistory/domain/blog/entity/Challenge;", "getChallenge", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBlogRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogRepositoryImpl.kt\ncom/kakao/tistory/data/blog/repository/BlogRepositoryImpl\n+ 2 BaseRepository.kt\ncom/kakao/tistory/data/repository/BaseRepository\n+ 3 BaseRepository.kt\ncom/kakao/tistory/data/repository/BaseRepository$checkError$2\n*L\n1#1,79:1\n26#2,27:80\n53#2:108\n26#2,27:109\n53#2:137\n35#2:138\n26#2,27:139\n53#2:167\n35#2:168\n26#2,27:169\n53#2:197\n35#2:198\n26#2,27:199\n53#2:227\n35#2:228\n26#2,27:229\n53#2:257\n35#2:258\n26#2,27:259\n53#2:287\n35#2:288\n26#2,27:289\n53#2:317\n35#2:318\n26#2,27:319\n53#2:347\n35#2:348\n26#2,27:349\n53#2:377\n35#2:378\n26#2,27:379\n53#2:407\n35#2:408\n39#3:107\n39#3:136\n39#3:166\n39#3:196\n39#3:226\n39#3:256\n39#3:286\n39#3:316\n39#3:346\n39#3:376\n39#3:406\n*S KotlinDebug\n*F\n+ 1 BlogRepositoryImpl.kt\ncom/kakao/tistory/data/blog/repository/BlogRepositoryImpl\n*L\n21#1:80,27\n21#1:108\n25#1:109,27\n25#1:137\n25#1:138\n33#1:139,27\n33#1:167\n33#1:168\n41#1:169,27\n41#1:197\n41#1:198\n45#1:199,27\n45#1:227\n45#1:228\n49#1:229,27\n49#1:257\n49#1:258\n57#1:259,27\n57#1:287\n57#1:288\n65#1:289,27\n65#1:317\n65#1:318\n69#1:319,27\n69#1:347\n69#1:348\n73#1:349,27\n73#1:377\n73#1:378\n77#1:379,27\n77#1:407\n77#1:408\n21#1:107\n25#1:136\n33#1:166\n41#1:196\n45#1:226\n49#1:256\n57#1:286\n65#1:316\n69#1:346\n73#1:376\n77#1:406\n*E\n"})
public final class BlogRepositoryImpl extends BaseRepository implements BlogRepository {
    public final BlogService a;
    public final BlogPreference b;

    @Inject
    public BlogRepositoryImpl(@NotNull BlogService blogService0, @NotNull BlogPreference blogPreference0) {
        Intrinsics.checkNotNullParameter(blogService0, "blogService");
        Intrinsics.checkNotNullParameter(blogPreference0, "blogPreference");
        super();
        this.a = blogService0;
        this.b = blogPreference0;
    }

    @Override  // com.kakao.tistory.domain.blog.repository.BlogRepository
    @Nullable
    public Object deleteBlockUser(long v, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        a a0;
        if(continuation0 instanceof a) {
            a0 = (a)continuation0;
            int v1 = a0.d;
            if((v1 & 0x80000000) == 0) {
                a0 = new a(this, continuation0);
            }
            else {
                a0.d = v1 ^ 0x80000000;
            }
        }
        else {
            a0 = new a(this, continuation0);
        }
        Object object0 = a0.b;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(a0.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    a0.a = this;
                    a0.d = 1;
                    if(this.a.deleteBlockUser(v, a0) == object1) {
                        return object1;
                    }
                    baseRepository0 = this;
                    break;
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    a0.a = baseRepository0;
                    a0.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, a0) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository0 = this;
                    goto label_46;
                }
                return object1;
            }
            case 1: {
                baseRepository0 = (BaseRepository)a0.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    a0.a = baseRepository0;
                    a0.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, a0) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_46;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)a0.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository0 = (BaseRepository)a0.a;
                ResultKt.throwOnFailure(object0);
                goto label_51;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)a0.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(errorModel0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            return new Success(Unit.INSTANCE);
        }
        catch(CancellationException cancellationException0) {
            a0.a = baseRepository0;
            a0.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, a0) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_46:
        a0.a = baseRepository0;
        a0.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, a0);
        if(object0 == object1) {
            return object1;
        }
    label_51:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            a0.a = (ErrorModel)object0;
            a0.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), a0) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            a0.a = (ErrorModel)object0;
            a0.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), a0) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.blog.repository.BlogRepository
    @Nullable
    public Object getBlogInfo(@NotNull String s, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
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
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(b0.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    b0.a = this;
                    b0.d = 1;
                    object0 = this.a.getBlogInfo(s, b0);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    b0.a = baseRepository0;
                    b0.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, b0) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository0 = this;
                    goto label_47;
                }
                if(object0 == object1) {
                    return object1;
                }
                baseRepository0 = this;
                break;
            }
            case 1: {
                baseRepository0 = (BaseRepository)b0.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    b0.a = baseRepository0;
                    b0.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, b0) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)b0.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository0 = (BaseRepository)b0.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)b0.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(errorModel0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            return new Success(((ItemModel)object0).getData());
        }
        catch(CancellationException cancellationException0) {
            b0.a = baseRepository0;
            b0.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, b0) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        b0.a = baseRepository0;
        b0.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, b0);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            b0.a = (ErrorModel)object0;
            b0.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), b0) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            b0.a = (ErrorModel)object0;
            b0.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), b0) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.blog.repository.BlogRepository
    @Nullable
    public Object getCategories(@NotNull String s, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        c c0;
        if(continuation0 instanceof c) {
            c0 = (c)continuation0;
            int v = c0.d;
            if((v & 0x80000000) == 0) {
                c0 = new c(this, continuation0);
            }
            else {
                c0.d = v ^ 0x80000000;
            }
        }
        else {
            c0 = new c(this, continuation0);
        }
        Object object0 = c0.b;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(c0.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    c0.a = this;
                    c0.d = 1;
                    object0 = this.a.getCategories(s, c0);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    c0.a = baseRepository0;
                    c0.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, c0) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository0 = this;
                    goto label_47;
                }
                if(object0 == object1) {
                    return object1;
                }
                baseRepository0 = this;
                break;
            }
            case 1: {
                baseRepository0 = (BaseRepository)c0.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    c0.a = baseRepository0;
                    c0.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, c0) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)c0.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository0 = (BaseRepository)c0.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)c0.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(errorModel0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            return new Success(((ItemListModel)object0).getItems());
        }
        catch(CancellationException cancellationException0) {
            c0.a = baseRepository0;
            c0.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, c0) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        c0.a = baseRepository0;
        c0.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, c0);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            c0.a = (ErrorModel)object0;
            c0.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), c0) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            c0.a = (ErrorModel)object0;
            c0.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), c0) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.blog.repository.BlogRepository
    @Nullable
    public Object getChallenge(@NotNull String s, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
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
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(d0.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    d0.a = this;
                    d0.d = 1;
                    object0 = this.a.getChallenge(s, d0);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    d0.a = baseRepository0;
                    d0.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, d0) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository0 = this;
                    goto label_47;
                }
                if(object0 == object1) {
                    return object1;
                }
                baseRepository0 = this;
                break;
            }
            case 1: {
                baseRepository0 = (BaseRepository)d0.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    d0.a = baseRepository0;
                    d0.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, d0) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)d0.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository0 = (BaseRepository)d0.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)d0.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(errorModel0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            return new Success(((ItemModel)object0).getData());
        }
        catch(CancellationException cancellationException0) {
            d0.a = baseRepository0;
            d0.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, d0) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        d0.a = baseRepository0;
        d0.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, d0);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            d0.a = (ErrorModel)object0;
            d0.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), d0) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            d0.a = (ErrorModel)object0;
            d0.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), d0) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.blog.repository.BlogRepository
    @Nullable
    public Object getEntryList(@NotNull String s, @Nullable Integer integer0, @NotNull Continuation continuation0) {
        return PagingKt.simplePager$default(0, new e(this, s, integer0, null), 1, null);
    }

    @Override  // com.kakao.tistory.domain.blog.repository.BlogRepository
    @Nullable
    public Object getFirstOpen(@NotNull Continuation continuation0) {
        return this.b.getIsFirstOpen();
    }

    @Override  // com.kakao.tistory.domain.blog.repository.BlogRepository
    @Nullable
    public Object getNoticeList(@NotNull String s, @NotNull Continuation continuation0) {
        return PagingKt.simplePager$default(0, new f(this, s, null), 1, null);
    }

    @Override  // com.kakao.tistory.domain.blog.repository.BlogRepository
    @Nullable
    public Object getRecentNoticeList(@NotNull String s, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        g g0;
        if(continuation0 instanceof g) {
            g0 = (g)continuation0;
            int v = g0.d;
            if((v & 0x80000000) == 0) {
                g0 = new g(this, continuation0);
            }
            else {
                g0.d = v ^ 0x80000000;
            }
        }
        else {
            g0 = new g(this, continuation0);
        }
        Object object0 = g0.b;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(g0.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    g0.a = this;
                    g0.d = 1;
                    object0 = this.a.getNoticeList(s, 1, 3, g0);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    g0.a = baseRepository0;
                    g0.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, g0) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository0 = this;
                    goto label_47;
                }
                if(object0 == object1) {
                    return object1;
                }
                baseRepository0 = this;
                break;
            }
            case 1: {
                baseRepository0 = (BaseRepository)g0.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    g0.a = baseRepository0;
                    g0.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, g0) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)g0.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository0 = (BaseRepository)g0.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)g0.a;
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
            g0.a = baseRepository0;
            g0.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, g0) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        g0.a = baseRepository0;
        g0.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, g0);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            g0.a = (ErrorModel)object0;
            g0.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), g0) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            g0.a = (ErrorModel)object0;
            g0.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), g0) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.blog.repository.BlogRepository
    @Nullable
    public Object getRefererKeywords(@NotNull String s, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        h h0;
        if(continuation0 instanceof h) {
            h0 = (h)continuation0;
            int v = h0.d;
            if((v & 0x80000000) == 0) {
                h0 = new h(this, continuation0);
            }
            else {
                h0.d = v ^ 0x80000000;
            }
        }
        else {
            h0 = new h(this, continuation0);
        }
        Object object0 = h0.b;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(h0.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    h0.a = this;
                    h0.d = 1;
                    object0 = this.a.getRefererKeywords(s, h0);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    h0.a = baseRepository0;
                    h0.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, h0) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository0 = this;
                    goto label_47;
                }
                if(object0 == object1) {
                    return object1;
                }
                baseRepository0 = this;
                break;
            }
            case 1: {
                baseRepository0 = (BaseRepository)h0.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    h0.a = baseRepository0;
                    h0.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, h0) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)h0.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository0 = (BaseRepository)h0.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)h0.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(errorModel0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            return new Success(((RefererKeywordResponse)object0).getItems());
        }
        catch(CancellationException cancellationException0) {
            h0.a = baseRepository0;
            h0.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, h0) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        h0.a = baseRepository0;
        h0.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, h0);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            h0.a = (ErrorModel)object0;
            h0.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), h0) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            h0.a = (ErrorModel)object0;
            h0.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), h0) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.blog.repository.BlogRepository
    @Nullable
    public Object getRefererLog(@NotNull String s, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        i i0;
        if(continuation0 instanceof i) {
            i0 = (i)continuation0;
            int v = i0.d;
            if((v & 0x80000000) == 0) {
                i0 = new i(this, continuation0);
            }
            else {
                i0.d = v ^ 0x80000000;
            }
        }
        else {
            i0 = new i(this, continuation0);
        }
        Object object0 = i0.b;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(i0.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    i0.a = this;
                    i0.d = 1;
                    object0 = this.a.getRefererLog(s, i0);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    i0.a = baseRepository0;
                    i0.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, i0) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository0 = this;
                    goto label_47;
                }
                if(object0 == object1) {
                    return object1;
                }
                baseRepository0 = this;
                break;
            }
            case 1: {
                baseRepository0 = (BaseRepository)i0.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    i0.a = baseRepository0;
                    i0.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, i0) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)i0.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository0 = (BaseRepository)i0.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)i0.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(errorModel0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            return new Success(((RefererLogResponse)object0).getItems());
        }
        catch(CancellationException cancellationException0) {
            i0.a = baseRepository0;
            i0.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, i0) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        i0.a = baseRepository0;
        i0.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, i0);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            i0.a = (ErrorModel)object0;
            i0.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), i0) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            i0.a = (ErrorModel)object0;
            i0.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), i0) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.blog.repository.BlogRepository
    @NotNull
    public Flow getShowChallengeAuth(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        Intrinsics.checkNotNullParameter(s1, "challengeCode");
        return this.b.getIsShowChallengeAuth(s, s1);
    }

    @Override  // com.kakao.tistory.domain.blog.repository.BlogRepository
    @Nullable
    public Object getTrend(@NotNull String s, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        j j0;
        if(continuation0 instanceof j) {
            j0 = (j)continuation0;
            int v = j0.d;
            if((v & 0x80000000) == 0) {
                j0 = new j(this, continuation0);
            }
            else {
                j0.d = v ^ 0x80000000;
            }
        }
        else {
            j0 = new j(this, continuation0);
        }
        Object object0 = j0.b;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(j0.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    j0.a = this;
                    j0.d = 1;
                    object0 = this.a.getTrend(s, j0);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    j0.a = baseRepository0;
                    j0.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, j0) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository0 = this;
                    goto label_47;
                }
                if(object0 == object1) {
                    return object1;
                }
                baseRepository0 = this;
                break;
            }
            case 1: {
                baseRepository0 = (BaseRepository)j0.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    j0.a = baseRepository0;
                    j0.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, j0) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)j0.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository0 = (BaseRepository)j0.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)j0.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(errorModel0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            return new Success(((TrendResponse)((ItemModel)object0).getData()).getItems());
        }
        catch(CancellationException cancellationException0) {
            j0.a = baseRepository0;
            j0.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, j0) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        j0.a = baseRepository0;
        j0.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, j0);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            j0.a = (ErrorModel)object0;
            j0.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), j0) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            j0.a = (ErrorModel)object0;
            j0.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), j0) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.blog.repository.BlogRepository
    @Nullable
    public Object postBlockUser(long v, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        k k0;
        if(continuation0 instanceof k) {
            k0 = (k)continuation0;
            int v1 = k0.d;
            if((v1 & 0x80000000) == 0) {
                k0 = new k(this, continuation0);
            }
            else {
                k0.d = v1 ^ 0x80000000;
            }
        }
        else {
            k0 = new k(this, continuation0);
        }
        Object object0 = k0.b;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(k0.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    k0.a = this;
                    k0.d = 1;
                    if(this.a.postBlockUser(v, k0) == object1) {
                        return object1;
                    }
                    baseRepository0 = this;
                    break;
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    k0.a = baseRepository0;
                    k0.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, k0) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository0 = this;
                    goto label_46;
                }
                return object1;
            }
            case 1: {
                baseRepository0 = (BaseRepository)k0.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    k0.a = baseRepository0;
                    k0.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, k0) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_46;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)k0.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository0 = (BaseRepository)k0.a;
                ResultKt.throwOnFailure(object0);
                goto label_51;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)k0.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(errorModel0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            return new Success(Unit.INSTANCE);
        }
        catch(CancellationException cancellationException0) {
            k0.a = baseRepository0;
            k0.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, k0) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_46:
        k0.a = baseRepository0;
        k0.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, k0);
        if(object0 == object1) {
            return object1;
        }
    label_51:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            k0.a = (ErrorModel)object0;
            k0.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), k0) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            k0.a = (ErrorModel)object0;
            k0.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), k0) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.blog.repository.BlogRepository
    @Nullable
    public Object setFirstOpened(@NotNull Continuation continuation0) {
        BaseRepository baseRepository1;
        l l0;
        if(continuation0 instanceof l) {
            l0 = (l)continuation0;
            int v = l0.d;
            if((v & 0x80000000) == 0) {
                l0 = new l(this, continuation0);
            }
            else {
                l0.d = v ^ 0x80000000;
            }
        }
        else {
            l0 = new l(this, continuation0);
        }
        Object object0 = l0.b;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(l0.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    l0.a = this;
                    l0.d = 1;
                    if(this.b.setIsOpened(l0) == object1) {
                        return object1;
                    }
                    baseRepository1 = this;
                    break;
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    l0.a = baseRepository1;
                    l0.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, l0) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository1 = this;
                    goto label_46;
                }
                return object1;
            }
            case 1: {
                baseRepository1 = (BaseRepository)l0.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    l0.a = baseRepository1;
                    l0.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, l0) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_46;
                }
            }
            case 2: {
                BaseRepository baseRepository0 = (BaseRepository)l0.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository1 = (BaseRepository)l0.a;
                ResultKt.throwOnFailure(object0);
                goto label_51;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)l0.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(errorModel0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            return new Success(Unit.INSTANCE);
        }
        catch(CancellationException cancellationException0) {
            l0.a = baseRepository1;
            l0.d = 2;
            return baseRepository1.sendError("coroutine cancel", cancellationException0, l0) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_46:
        l0.a = baseRepository1;
        l0.d = 3;
        object0 = baseRepository1.createErrorModel(throwable0, l0);
        if(object0 == object1) {
            return object1;
        }
    label_51:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            l0.a = (ErrorModel)object0;
            l0.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), l0) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            l0.a = (ErrorModel)object0;
            l0.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), l0) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.blog.repository.BlogRepository
    @Nullable
    public Object setShowChallengeAuth(@NotNull String s, @NotNull String s1, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        m m0;
        if(continuation0 instanceof m) {
            m0 = (m)continuation0;
            int v = m0.d;
            if((v & 0x80000000) == 0) {
                m0 = new m(this, continuation0);
            }
            else {
                m0.d = v ^ 0x80000000;
            }
        }
        else {
            m0 = new m(this, continuation0);
        }
        Object object0 = m0.b;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(m0.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    m0.a = this;
                    m0.d = 1;
                    if(this.b.setIsShowChallengeAuth(s, s1, m0) == object1) {
                        return object1;
                    }
                    baseRepository0 = this;
                    break;
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    m0.a = baseRepository0;
                    m0.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, m0) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository0 = this;
                    goto label_46;
                }
                return object1;
            }
            case 1: {
                baseRepository0 = (BaseRepository)m0.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    m0.a = baseRepository0;
                    m0.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, m0) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_46;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)m0.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository0 = (BaseRepository)m0.a;
                ResultKt.throwOnFailure(object0);
                goto label_51;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)m0.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(errorModel0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            return new Success(Unit.INSTANCE);
        }
        catch(CancellationException cancellationException0) {
            m0.a = baseRepository0;
            m0.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, m0) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_46:
        m0.a = baseRepository0;
        m0.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, m0);
        if(object0 == object1) {
            return object1;
        }
    label_51:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            m0.a = (ErrorModel)object0;
            m0.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), m0) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            m0.a = (ErrorModel)object0;
            m0.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), m0) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }
}

