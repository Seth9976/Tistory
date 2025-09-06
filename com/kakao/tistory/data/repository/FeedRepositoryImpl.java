package com.kakao.tistory.data.repository;

import androidx.lifecycle.MutableLiveData;
import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.data.service.FeedService.DefaultImpls;
import com.kakao.tistory.data.service.FeedService;
import com.kakao.tistory.domain.ErrorStatusKt;
import com.kakao.tistory.domain.entity.common.Count;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.repository.FeedRepository;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J:\u0010\u000F\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000E0\r0\f2\b\u0010\b\u001A\u0004\u0018\u00010\u00072\b\u0010\t\u001A\u0004\u0018\u00010\u00072\b\u0010\u000B\u001A\u0004\u0018\u00010\nH\u0096@¢\u0006\u0004\b\u000F\u0010\u0010J\u0016\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u00110\fH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u001E\u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\u00110\f2\u0006\u0010\u0014\u001A\u00020\u0007H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\u00180\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001CR \u0010 \u001A\b\u0012\u0004\u0012\u00020\u00180\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001E\u0010\u001A\u001A\u0004\b\u001F\u0010\u001C¨\u0006!"}, d2 = {"Lcom/kakao/tistory/data/repository/FeedRepositoryImpl;", "Lcom/kakao/tistory/data/repository/BaseRepository;", "Lcom/kakao/tistory/domain/repository/FeedRepository;", "Lcom/kakao/tistory/data/service/FeedService;", "feedService", "<init>", "(Lcom/kakao/tistory/data/service/FeedService;)V", "", "fromDateTime", "toDateTime", "", "pivot", "Lcom/kakao/tistory/domain/entity/common/Result;", "Lcom/kakao/tistory/domain/entity/common/EntryItemListModel;", "Lcom/kakao/tistory/domain/entity/entry/EntryItem;", "getFeed", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/kakao/tistory/domain/entity/common/Count;", "getBlogFollowingCount", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "blogName", "getBlogFollowerCount", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/MutableLiveData;", "", "b", "Landroidx/lifecycle/MutableLiveData;", "getFollowingCount", "()Landroidx/lifecycle/MutableLiveData;", "followingCount", "c", "getFollowerCount", "followerCount", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFeedRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeedRepositoryImpl.kt\ncom/kakao/tistory/data/repository/FeedRepositoryImpl\n+ 2 BaseRepository.kt\ncom/kakao/tistory/data/repository/BaseRepository\n+ 3 BaseRepository.kt\ncom/kakao/tistory/data/repository/BaseRepository$checkError$2\n+ 4 Result.kt\ncom/kakao/tistory/domain/entity/common/ResultKt\n*L\n1#1,44:1\n26#2,27:45\n53#2:73\n26#2,27:74\n53#2:102\n35#2:103\n26#2,27:109\n53#2:137\n35#2:138\n39#3:72\n39#3:101\n39#3:136\n15#4,5:104\n15#4,5:139\n*S KotlinDebug\n*F\n+ 1 FeedRepositoryImpl.kt\ncom/kakao/tistory/data/repository/FeedRepositoryImpl\n*L\n27#1:45,27\n27#1:73\n31#1:74,27\n31#1:102\n31#1:103\n38#1:109,27\n38#1:137\n38#1:138\n27#1:72\n31#1:101\n38#1:136\n32#1:104,5\n39#1:139,5\n*E\n"})
public final class FeedRepositoryImpl extends BaseRepository implements FeedRepository {
    public final FeedService a;
    public final MutableLiveData b;
    public final MutableLiveData c;

    @Inject
    public FeedRepositoryImpl(@NotNull FeedService feedService0) {
        Intrinsics.checkNotNullParameter(feedService0, "feedService");
        super();
        this.a = feedService0;
        this.b = new MutableLiveData();
        this.c = new MutableLiveData();
    }

    @Override  // com.kakao.tistory.domain.repository.FeedRepository
    @Nullable
    public Object getBlogFollowerCount(@NotNull String s, @NotNull Continuation continuation0) {
        Object object2;
        BaseRepository baseRepository0;
        ErrorModel errorModel0;
        BaseRepository baseRepository2;
        BaseRepository baseRepository1;
        n1 n10;
        if(continuation0 instanceof n1) {
            n10 = (n1)continuation0;
            int v = n10.e;
            if((v & 0x80000000) == 0) {
                n10 = new n1(this, continuation0);
            }
            else {
                n10.e = v ^ 0x80000000;
            }
        }
        else {
            n10 = new n1(this, continuation0);
        }
        Object object0 = n10.c;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(n10.e) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    n10.a = this;
                    n10.b = this;
                    n10.e = 1;
                    object0 = this.a.getBlogFollowerCount(s, n10);
                }
                catch(CancellationException cancellationException1) {
                    cancellationException0 = cancellationException1;
                    baseRepository1 = this;
                    baseRepository2 = baseRepository1;
                    goto label_52;
                }
                catch(Throwable throwable1) {
                    throwable0 = throwable1;
                    baseRepository1 = this;
                    baseRepository2 = baseRepository1;
                    goto label_61;
                }
                if(object0 == object1) {
                    return object1;
                }
                baseRepository1 = this;
                baseRepository2 = baseRepository1;
                break;
            }
            case 1: {
                baseRepository1 = (BaseRepository)n10.b;
                baseRepository2 = n10.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    goto label_52;
                }
                catch(Throwable throwable0) {
                    goto label_61;
                }
            }
            case 2: {
                baseRepository1 = (BaseRepository)n10.b;
                baseRepository0 = n10.a;
                ResultKt.throwOnFailure(object0);
                object2 = new Fail(baseRepository1.createCoroutineCancelErrorModel());
                goto label_84;
            }
            case 3: {
                baseRepository1 = (BaseRepository)n10.b;
                baseRepository2 = n10.a;
                ResultKt.throwOnFailure(object0);
                goto label_67;
            }
            case 4: 
            case 5: {
                errorModel0 = (ErrorModel)n10.b;
                baseRepository0 = n10.a;
                ResultKt.throwOnFailure(object0);
                goto label_83;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            object2 = new Success(object0);
            goto label_85;
        }
        catch(CancellationException cancellationException0) {
        label_52:
            n10.a = baseRepository2;
            n10.b = baseRepository1;
            n10.e = 2;
            if(baseRepository1.sendError("coroutine cancel", cancellationException0, n10) == object1) {
                return object1;
            }
            baseRepository0 = baseRepository2;
            object2 = new Fail(baseRepository1.createCoroutineCancelErrorModel());
            goto label_84;
        }
        catch(Throwable throwable0) {
        }
    label_61:
        n10.a = baseRepository2;
        n10.b = baseRepository1;
        n10.e = 3;
        object0 = baseRepository1.createErrorModel(throwable0, n10);
        if(object0 == object1) {
            return object1;
        }
    label_67:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            n10.a = baseRepository2;
            n10.b = (ErrorModel)object0;
            n10.e = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), n10) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            n10.a = baseRepository2;
            n10.b = (ErrorModel)object0;
            n10.e = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), n10) == object1) {
                return object1;
            }
        }
        errorModel0 = (ErrorModel)object0;
        baseRepository0 = baseRepository2;
    label_83:
        object2 = new Fail(errorModel0);
    label_84:
        baseRepository2 = baseRepository0;
    label_85:
        if(object2 instanceof Success) {
            ((FeedRepositoryImpl)baseRepository2).getFollowerCount().setValue(Boxing.boxLong(((Count)((Success)object2).getData()).getCount()));
        }
        return object2;
    }

    @Override  // com.kakao.tistory.domain.repository.FeedRepository
    @Nullable
    public Object getBlogFollowingCount(@NotNull Continuation continuation0) {
        Object object2;
        BaseRepository baseRepository0;
        ErrorModel errorModel0;
        BaseRepository baseRepository2;
        BaseRepository baseRepository1;
        BaseRepository baseRepository3;
        BaseRepository baseRepository4;
        o1 o10;
        if(continuation0 instanceof o1) {
            o10 = (o1)continuation0;
            int v = o10.e;
            if((v & 0x80000000) == 0) {
                o10 = new o1(this, continuation0);
            }
            else {
                o10.e = v ^ 0x80000000;
            }
        }
        else {
            o10 = new o1(this, continuation0);
        }
        Object object0 = o10.c;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(o10.e) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    o10.a = this;
                    o10.b = this;
                    o10.e = 1;
                    object0 = this.a.getBlogFollowingCount(o10);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    baseRepository4 = baseRepository1;
                    goto label_50;
                }
                catch(Throwable throwable0) {
                    baseRepository1 = this;
                    baseRepository4 = baseRepository1;
                    goto label_60;
                }
                if(object0 == object1) {
                    return object1;
                }
                baseRepository1 = this;
                baseRepository4 = baseRepository1;
                break;
            }
            case 1: {
                baseRepository1 = (BaseRepository)o10.b;
                baseRepository4 = o10.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    goto label_50;
                }
                catch(Throwable throwable0) {
                    goto label_60;
                }
            }
            case 2: {
                baseRepository3 = (BaseRepository)o10.b;
                baseRepository0 = o10.a;
                ResultKt.throwOnFailure(object0);
                object2 = new Fail(baseRepository3.createCoroutineCancelErrorModel());
                goto label_84;
            }
            case 3: {
                baseRepository1 = (BaseRepository)o10.b;
                baseRepository2 = o10.a;
                ResultKt.throwOnFailure(object0);
                goto label_67;
            }
            case 4: 
            case 5: {
                errorModel0 = (ErrorModel)o10.b;
                baseRepository0 = o10.a;
                ResultKt.throwOnFailure(object0);
                goto label_83;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            object2 = new Success(object0);
            goto label_85;
        }
        catch(CancellationException cancellationException0) {
        label_50:
            o10.a = baseRepository4;
            o10.b = baseRepository1;
            o10.e = 2;
            if(baseRepository1.sendError("coroutine cancel", cancellationException0, o10) == object1) {
                return object1;
            }
            baseRepository3 = baseRepository1;
            baseRepository0 = baseRepository4;
            object2 = new Fail(baseRepository3.createCoroutineCancelErrorModel());
            goto label_84;
        }
        catch(Throwable throwable0) {
        }
    label_60:
        o10.a = baseRepository4;
        o10.b = baseRepository1;
        o10.e = 3;
        object0 = baseRepository1.createErrorModel(throwable0, o10);
        if(object0 == object1) {
            return object1;
        }
        baseRepository2 = baseRepository4;
    label_67:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            o10.a = baseRepository2;
            o10.b = (ErrorModel)object0;
            o10.e = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), o10) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            o10.a = baseRepository2;
            o10.b = (ErrorModel)object0;
            o10.e = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), o10) == object1) {
                return object1;
            }
        }
        errorModel0 = (ErrorModel)object0;
        baseRepository0 = baseRepository2;
    label_83:
        object2 = new Fail(errorModel0);
    label_84:
        baseRepository4 = baseRepository0;
    label_85:
        if(object2 instanceof Success) {
            ((FeedRepositoryImpl)baseRepository4).getFollowingCount().setValue(Boxing.boxLong(((Count)((Success)object2).getData()).getCount()));
        }
        return object2;
    }

    @Override  // com.kakao.tistory.domain.repository.FeedRepository
    @Nullable
    public Object getFeed(@Nullable String s, @Nullable String s1, @Nullable Integer integer0, @NotNull Continuation continuation0) {
        BaseRepository baseRepository1;
        p1 p10;
        if(continuation0 instanceof p1) {
            p10 = (p1)continuation0;
            int v = p10.d;
            if((v & 0x80000000) == 0) {
                p10 = new p1(this, continuation0);
            }
            else {
                p10.d = v ^ 0x80000000;
            }
        }
        else {
            p10 = new p1(this, continuation0);
        }
        Object object0 = p10.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(p10.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    p10.a = this;
                    p10.d = 1;
                    object0 = DefaultImpls.getFeed$default(this.a, s, s1, integer0, 0, p10, 8, null);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    p10.a = baseRepository1;
                    p10.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, p10) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
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
                baseRepository1 = (BaseRepository)p10.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    p10.a = baseRepository1;
                    p10.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, p10) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                BaseRepository baseRepository0 = (BaseRepository)p10.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository1 = (BaseRepository)p10.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)p10.a;
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
            p10.a = baseRepository1;
            p10.d = 2;
            return baseRepository1.sendError("coroutine cancel", cancellationException0, p10) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        p10.a = baseRepository1;
        p10.d = 3;
        object0 = baseRepository1.createErrorModel(throwable0, p10);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            p10.a = (ErrorModel)object0;
            p10.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), p10) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            p10.a = (ErrorModel)object0;
            p10.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), p10) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.FeedRepository
    @NotNull
    public MutableLiveData getFollowerCount() {
        return this.c;
    }

    @Override  // com.kakao.tistory.domain.repository.FeedRepository
    @NotNull
    public MutableLiveData getFollowingCount() {
        return this.b;
    }
}

