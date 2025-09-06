package com.kakao.tistory.data.repository;

import com.google.gson.Gson;
import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.data.service.MemberService;
import com.kakao.tistory.domain.ErrorStatusKt;
import com.kakao.tistory.domain.entity.common.ItemModel;
import com.kakao.tistory.domain.entity.common.MemberErrorModel;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.repository.MemberRepository;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableSharedFlow;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import retrofit2.HttpException;
import retrofit2.Response;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001A\u00020\t2\u0006\u0010\b\u001A\u00020\u0007H\u0094@¢\u0006\u0004\b\n\u0010\u000BJ\u001E\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u000F0\u000E2\u0006\u0010\r\u001A\u00020\fH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0014\u001A\b\u0012\u0004\u0012\u00020\u000F0\u000E2\u0006\u0010\u0012\u001A\u00020\f2\u0006\u0010\u0013\u001A\u00020\fH\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\u00160\u000EH\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J.\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u000F0\u000E2\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u0012\u001A\u00020\f2\u0006\u0010\u001A\u001A\u00020\u0019H\u0096@¢\u0006\u0004\b\u001B\u0010\u001CJ\u0016\u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\u000F0\u000EH\u0096@¢\u0006\u0004\b\u001D\u0010\u0018¨\u0006\u001E"}, d2 = {"Lcom/kakao/tistory/data/repository/MemberRepositoryImpl;", "Lcom/kakao/tistory/data/repository/BaseRepository;", "Lcom/kakao/tistory/domain/repository/MemberRepository;", "Lcom/kakao/tistory/data/service/MemberService;", "memberService", "<init>", "(Lcom/kakao/tistory/data/service/MemberService;)V", "", "throwable", "Lcom/kakao/android/base/model/ErrorModel;", "createErrorModel", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "token", "Lcom/kakao/tistory/domain/entity/common/Result;", "", "checkDuplicateEmail", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "blogName", "prevRecommendations", "checkVerifyBlogName", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/kakao/tistory/domain/entity/common/RecommendedBlogNameInfo;", "getInitRecommendedBlogName", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "agreeTalkChannel", "postMemberJoin", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "joinTalkChannel", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMemberRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemberRepositoryImpl.kt\ncom/kakao/tistory/data/repository/MemberRepositoryImpl\n+ 2 BaseRepository.kt\ncom/kakao/tistory/data/repository/BaseRepository\n+ 3 BaseRepository.kt\ncom/kakao/tistory/data/repository/BaseRepository$checkError$2\n*L\n1#1,54:1\n26#2,27:55\n53#2:83\n26#2,27:84\n53#2:112\n35#2:113\n26#2,27:114\n53#2:142\n35#2:143\n26#2,27:144\n53#2:172\n35#2:173\n26#2,27:174\n53#2:202\n35#2:203\n39#3:82\n39#3:111\n39#3:141\n39#3:171\n39#3:201\n*S KotlinDebug\n*F\n+ 1 MemberRepositoryImpl.kt\ncom/kakao/tistory/data/repository/MemberRepositoryImpl\n*L\n32#1:55,27\n32#1:83\n36#1:84,27\n36#1:112\n36#1:113\n40#1:114,27\n40#1:142\n40#1:143\n48#1:144,27\n48#1:172\n48#1:173\n52#1:174,27\n52#1:202\n52#1:203\n32#1:82\n36#1:111\n40#1:141\n48#1:171\n52#1:201\n*E\n"})
public final class MemberRepositoryImpl extends BaseRepository implements MemberRepository {
    public final MemberService a;

    @Inject
    public MemberRepositoryImpl(@NotNull MemberService memberService0) {
        Intrinsics.checkNotNullParameter(memberService0, "memberService");
        super();
        this.a = memberService0;
    }

    @Override  // com.kakao.tistory.domain.repository.MemberRepository
    @Nullable
    public Object checkDuplicateEmail(@NotNull String s, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        b2 b20;
        if(continuation0 instanceof b2) {
            b20 = (b2)continuation0;
            int v = b20.d;
            if((v & 0x80000000) == 0) {
                b20 = new b2(this, continuation0);
            }
            else {
                b20.d = v ^ 0x80000000;
            }
        }
        else {
            b20 = new b2(this, continuation0);
        }
        Object object0 = b20.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(b20.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    b20.a = this;
                    b20.d = 1;
                    if(this.a.checkDuplicateEmail(s, b20) == object1) {
                        return object1;
                    }
                    baseRepository0 = this;
                    break;
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    b20.a = baseRepository0;
                    b20.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, b20) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository0 = this;
                    goto label_46;
                }
                return object1;
            }
            case 1: {
                baseRepository0 = (BaseRepository)b20.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    b20.a = baseRepository0;
                    b20.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, b20) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_46;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)b20.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository0 = (BaseRepository)b20.a;
                ResultKt.throwOnFailure(object0);
                goto label_51;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)b20.a;
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
            b20.a = baseRepository0;
            b20.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, b20) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_46:
        b20.a = baseRepository0;
        b20.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, b20);
        if(object0 == object1) {
            return object1;
        }
    label_51:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            b20.a = (ErrorModel)object0;
            b20.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), b20) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            b20.a = (ErrorModel)object0;
            b20.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), b20) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.MemberRepository
    @Nullable
    public Object checkVerifyBlogName(@NotNull String s, @NotNull String s1, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        c2 c20;
        if(continuation0 instanceof c2) {
            c20 = (c2)continuation0;
            int v = c20.d;
            if((v & 0x80000000) == 0) {
                c20 = new c2(this, continuation0);
            }
            else {
                c20.d = v ^ 0x80000000;
            }
        }
        else {
            c20 = new c2(this, continuation0);
        }
        Object object0 = c20.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(c20.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    c20.a = this;
                    c20.d = 1;
                    if(this.a.checkVerifyBlogName(s, s1, c20) == object1) {
                        return object1;
                    }
                    baseRepository0 = this;
                    break;
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    c20.a = baseRepository0;
                    c20.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, c20) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository0 = this;
                    goto label_46;
                }
                return object1;
            }
            case 1: {
                baseRepository0 = (BaseRepository)c20.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    c20.a = baseRepository0;
                    c20.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, c20) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_46;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)c20.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository0 = (BaseRepository)c20.a;
                ResultKt.throwOnFailure(object0);
                goto label_51;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)c20.a;
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
            c20.a = baseRepository0;
            c20.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, c20) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_46:
        c20.a = baseRepository0;
        c20.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, c20);
        if(object0 == object1) {
            return object1;
        }
    label_51:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            c20.a = (ErrorModel)object0;
            c20.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), c20) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            c20.a = (ErrorModel)object0;
            c20.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), c20) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.data.repository.BaseRepository
    @Nullable
    public Object createErrorModel(@NotNull Throwable throwable0, @NotNull Continuation continuation0) {
        if(throwable0 instanceof HttpException) {
            Response response0 = ((HttpException)throwable0).response();
            if(response0 != null) {
                ResponseBody responseBody0 = response0.errorBody();
                if(responseBody0 != null) {
                    String s = responseBody0.string();
                    if(s != null) {
                        ErrorModel errorModel0 = (MemberErrorModel)new Gson().fromJson(s, MemberErrorModel.class);
                        errorModel0.setCode(response0.code());
                        return errorModel0 == null ? this.createUnknownErrorModel() : errorModel0;
                    }
                }
                return this.createUnknownErrorModel();
            }
            return this.createUnknownErrorModel();
        }
        return this.createUnknownErrorModel();
    }

    @Override  // com.kakao.tistory.domain.repository.MemberRepository
    @Nullable
    public Object getInitRecommendedBlogName(@NotNull Continuation continuation0) {
        BaseRepository baseRepository1;
        d2 d20;
        if(continuation0 instanceof d2) {
            d20 = (d2)continuation0;
            int v = d20.d;
            if((v & 0x80000000) == 0) {
                d20 = new d2(this, continuation0);
            }
            else {
                d20.d = v ^ 0x80000000;
            }
        }
        else {
            d20 = new d2(this, continuation0);
        }
        Object object0 = d20.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(d20.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    d20.a = this;
                    d20.d = 1;
                    object0 = this.a.getRecommendedBlogName(d20);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    d20.a = baseRepository1;
                    d20.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, d20) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
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
                baseRepository1 = (BaseRepository)d20.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    d20.a = baseRepository1;
                    d20.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, d20) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                BaseRepository baseRepository0 = (BaseRepository)d20.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository1 = (BaseRepository)d20.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)d20.a;
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
            d20.a = baseRepository1;
            d20.d = 2;
            return baseRepository1.sendError("coroutine cancel", cancellationException0, d20) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        d20.a = baseRepository1;
        d20.d = 3;
        object0 = baseRepository1.createErrorModel(throwable0, d20);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            d20.a = (ErrorModel)object0;
            d20.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), d20) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            d20.a = (ErrorModel)object0;
            d20.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), d20) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.MemberRepository
    @Nullable
    public Object joinTalkChannel(@NotNull Continuation continuation0) {
        BaseRepository baseRepository1;
        e2 e20;
        if(continuation0 instanceof e2) {
            e20 = (e2)continuation0;
            int v = e20.d;
            if((v & 0x80000000) == 0) {
                e20 = new e2(this, continuation0);
            }
            else {
                e20.d = v ^ 0x80000000;
            }
        }
        else {
            e20 = new e2(this, continuation0);
        }
        Object object0 = e20.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(e20.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    e20.a = this;
                    e20.d = 1;
                    if(this.a.joinTalkChannel(e20) == object1) {
                        return object1;
                    }
                    baseRepository1 = this;
                    break;
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    e20.a = baseRepository1;
                    e20.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, e20) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository1 = this;
                    goto label_46;
                }
                return object1;
            }
            case 1: {
                baseRepository1 = (BaseRepository)e20.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    e20.a = baseRepository1;
                    e20.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, e20) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_46;
                }
            }
            case 2: {
                BaseRepository baseRepository0 = (BaseRepository)e20.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository1 = (BaseRepository)e20.a;
                ResultKt.throwOnFailure(object0);
                goto label_51;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)e20.a;
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
            e20.a = baseRepository1;
            e20.d = 2;
            return baseRepository1.sendError("coroutine cancel", cancellationException0, e20) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_46:
        e20.a = baseRepository1;
        e20.d = 3;
        object0 = baseRepository1.createErrorModel(throwable0, e20);
        if(object0 == object1) {
            return object1;
        }
    label_51:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            e20.a = (ErrorModel)object0;
            e20.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), e20) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            e20.a = (ErrorModel)object0;
            e20.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), e20) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.MemberRepository
    @Nullable
    public Object postMemberJoin(@NotNull String s, @NotNull String s1, boolean z, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        f2 f20;
        if(continuation0 instanceof f2) {
            f20 = (f2)continuation0;
            int v = f20.d;
            if((v & 0x80000000) == 0) {
                f20 = new f2(this, continuation0);
            }
            else {
                f20.d = v ^ 0x80000000;
            }
        }
        else {
            f20 = new f2(this, continuation0);
        }
        Object object0 = f20.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(f20.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    f20.a = this;
                    f20.d = 1;
                    if(this.a.postMemberJoin(s, s1, z, f20) == object1) {
                        return object1;
                    }
                    baseRepository0 = this;
                    break;
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    f20.a = baseRepository0;
                    f20.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, f20) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository0 = this;
                    goto label_46;
                }
                return object1;
            }
            case 1: {
                baseRepository0 = (BaseRepository)f20.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    f20.a = baseRepository0;
                    f20.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, f20) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_46;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)f20.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository0 = (BaseRepository)f20.a;
                ResultKt.throwOnFailure(object0);
                goto label_51;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)f20.a;
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
            f20.a = baseRepository0;
            f20.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, f20) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_46:
        f20.a = baseRepository0;
        f20.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, f20);
        if(object0 == object1) {
            return object1;
        }
    label_51:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            f20.a = (ErrorModel)object0;
            f20.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), f20) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            f20.a = (ErrorModel)object0;
            f20.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), f20) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }
}

