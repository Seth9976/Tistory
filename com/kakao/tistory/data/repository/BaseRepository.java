package com.kakao.tistory.data.repository;

import com.google.gson.Gson;
import com.kakao.android.base.exception.ConstsKt;
import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.domain.ErrorStatus;
import com.kakao.tistory.domain.ErrorStatusKt;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.repository.ThrowableRepository;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableSharedFlow;
import okhttp3.Headers;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import retrofit2.HttpException;
import retrofit2.Response;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\f2\u000E\b\u0002\u0010\r\u001A\b\u0012\u0004\u0012\u00020\u000F0\u000EH\u0086H¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001A\u00020\fH\u0004J\u0016\u0010\u0012\u001A\u00020\f2\u0006\u0010\u0013\u001A\u00020\u0014H\u0094@¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001A\u00020\fH\u0004J\u0010\u0010\u0017\u001A\u00020\f2\u0006\u0010\u0018\u001A\u00020\u0019H\u0016J<\u0010\u001A\u001A\b\u0012\u0004\u0012\u0002H\u001C0\u001B\"\u0006\b\u0000\u0010\u001C\u0018\u00012\u001E\b\u0004\u0010\u001D\u001A\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001C0\u001F\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001EH\u0084H¢\u0006\u0002\u0010 J \u0010!\u001A\u00020\u000F2\b\u0010\"\u001A\u0004\u0018\u00010\u00192\u0006\u0010\u0013\u001A\u00020\u0014H\u0084@¢\u0006\u0002\u0010#R\u001E\u0010\u0003\u001A\u00020\u00048\u0006@\u0006X\u0087.¢\u0006\u000E\n\u0000\u001A\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006$"}, d2 = {"Lcom/kakao/tistory/data/repository/BaseRepository;", "", "()V", "throwableRepository", "Lcom/kakao/tistory/domain/repository/ThrowableRepository;", "getThrowableRepository", "()Lcom/kakao/tistory/domain/repository/ThrowableRepository;", "setThrowableRepository", "(Lcom/kakao/tistory/domain/repository/ThrowableRepository;)V", "checkError", "", "errorModel", "Lcom/kakao/android/base/model/ErrorModel;", "onError", "Lkotlin/Function0;", "", "(Lcom/kakao/android/base/model/ErrorModel;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createCoroutineCancelErrorModel", "createErrorModel", "throwable", "", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createUnknownErrorModel", "parseErrorModel", "errorString", "", "requestApi", "Lcom/kakao/tistory/domain/entity/common/Result;", "T", "api", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendError", "message", "(Ljava/lang/String;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBaseRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseRepository.kt\ncom/kakao/tistory/data/repository/BaseRepository\n+ 2 BaseRepository.kt\ncom/kakao/tistory/data/repository/BaseRepository$checkError$2\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n39#1,14:103\n53#1:118\n39#2:117\n1#3:119\n*S KotlinDebug\n*F\n+ 1 BaseRepository.kt\ncom/kakao/tistory/data/repository/BaseRepository\n*L\n34#1:103,14\n34#1:118\n34#1:117\n*E\n"})
public abstract class BaseRepository {
    @Inject
    public ThrowableRepository throwableRepository;

    public static Object a(BaseRepository baseRepository0, Throwable throwable0, Continuation continuation0) {
        String s1;
        Response response0;
        t t0;
        if(continuation0 instanceof t) {
            t0 = (t)continuation0;
            int v = t0.f;
            if((v & 0x80000000) == 0) {
                t0 = new t(baseRepository0, continuation0);
            }
            else {
                t0.f = v ^ 0x80000000;
            }
        }
        else {
            t0 = new t(baseRepository0, continuation0);
        }
        Object object0 = t0.d;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(t0.f) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                u u0 = new u(baseRepository0, throwable0, null);
                HttpException httpException0 = throwable0 instanceof HttpException ? ((HttpException)throwable0) : null;
                if(httpException0 != null) {
                    Response response1 = httpException0.response();
                    if(response1 != null) {
                        ResponseBody responseBody0 = response1.errorBody();
                        if(responseBody0 != null) {
                            s1 = responseBody0.string();
                            if(s1 != null) {
                                Headers headers0 = response1.headers();
                                t0.a = baseRepository0;
                                t0.b = response1;
                                t0.c = s1;
                                t0.f = 3;
                                if(baseRepository0.sendError("!!api call fail " + response1 + "\n!!header-" + headers0 + "\n!!body-" + response1.body() + "\n!!errorBody-" + s1, throwable0, t0) == object1) {
                                    return object1;
                                }
                                response0 = response1;
                                try {
                                label_45:
                                    ErrorModel errorModel0 = baseRepository0.parseErrorModel(s1);
                                    errorModel0.setCode(response0.code());
                                    return errorModel0;
                                }
                                catch(Throwable throwable1) {
                                    t0.a = baseRepository0;
                                    t0.b = null;
                                    t0.c = null;
                                    t0.f = 4;
                                    return baseRepository0.sendError("parse fail: " + response0, throwable1, t0) == object1 ? object1 : baseRepository0.createUnknownErrorModel();
                                }
                            }
                        }
                        t0.f = 2;
                        object0 = u0.invoke(t0);
                        return object0 == object1 ? object1 : object0;
                    }
                }
                t0.f = 1;
                object0 = u0.invoke(t0);
                return object0 == object1 ? object1 : object0;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return object0;
            }
            case 2: {
                ResultKt.throwOnFailure(object0);
                return object0;
            }
            case 3: {
                String s = t0.c;
                response0 = t0.b;
                BaseRepository baseRepository1 = t0.a;
                ResultKt.throwOnFailure(object0);
                s1 = s;
                baseRepository0 = baseRepository1;
                goto label_45;
            }
            case 4: {
                baseRepository0 = t0.a;
                ResultKt.throwOnFailure(object0);
                return baseRepository0.createUnknownErrorModel();
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @Nullable
    public final Object checkError(@NotNull ErrorModel errorModel0, @NotNull Function0 function00, @NotNull Continuation continuation0) {
        s s0;
        if(continuation0 instanceof s) {
            s0 = (s)continuation0;
            int v = s0.c;
            if((v & 0x80000000) == 0) {
                s0 = new s(this, continuation0);
            }
            else {
                s0.c = v ^ 0x80000000;
            }
        }
        else {
            s0 = new s(this, continuation0);
        }
        Object object0 = s0.a;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(s0.c) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(ErrorStatusKt.checkAuthTokenError(errorModel0.getStatus())) {
                    MutableSharedFlow mutableSharedFlow0 = this.getThrowableRepository().getSessionThrowable();
                    s0.c = 1;
                    return mutableSharedFlow0.emit(errorModel0, s0) == object1 ? object1 : Boxing.boxBoolean(true);
                }
                if(ErrorStatusKt.checkInspectionError(errorModel0.getCode())) {
                    MutableSharedFlow mutableSharedFlow1 = this.getThrowableRepository().getInspectionThrowable();
                    s0.c = 2;
                    if(mutableSharedFlow1.emit(errorModel0, s0) == object1) {
                        return object1;
                    }
                }
                else {
                    function00.invoke();
                }
                return Boxing.boxBoolean(false);
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return Boxing.boxBoolean(true);
            }
            case 2: {
                ResultKt.throwOnFailure(object0);
                return Boxing.boxBoolean(false);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public static Object checkError$default(BaseRepository baseRepository0, ErrorModel errorModel0, Function0 function00, Continuation continuation0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkError");
        }
        if((v & 2) != 0) {
            function00 = com.kakao.tistory.data.repository.BaseRepository.checkError.2.INSTANCE;
        }
        if(ErrorStatusKt.checkAuthTokenError(errorModel0.getStatus())) {
            baseRepository0.getThrowableRepository().getSessionThrowable().emit(errorModel0, continuation0);
            return true;
        }
        if(ErrorStatusKt.checkInspectionError(errorModel0.getCode())) {
            baseRepository0.getThrowableRepository().getInspectionThrowable().emit(errorModel0, continuation0);
            return false;
        }
        function00.invoke();
        return false;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001A\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 0xB0)
        @SourceDebugExtension({"SMAP\nBaseRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseRepository.kt\ncom/kakao/tistory/data/repository/BaseRepository$checkError$2\n*L\n1#1,102:1\n*E\n"})
        public final class com.kakao.tistory.data.repository.BaseRepository.checkError.2 extends Lambda implements Function0 {
            public static final com.kakao.tistory.data.repository.BaseRepository.checkError.2 INSTANCE;

            static {
                com.kakao.tistory.data.repository.BaseRepository.checkError.2.INSTANCE = new com.kakao.tistory.data.repository.BaseRepository.checkError.2();
            }

            public com.kakao.tistory.data.repository.BaseRepository.checkError.2() {
                super(0);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return Unit.INSTANCE;
            }

            public final void invoke() {
            }
        }

    }

    @NotNull
    public final ErrorModel createCoroutineCancelErrorModel() {
        ErrorModel errorModel0 = new ErrorModel();
        errorModel0.setCode(ErrorStatus.ERROR_BY_COROUTINE_CANCEL.getCode());
        errorModel0.setTitle("ERROR_BY_COROUTINE_CANCEL");
        return errorModel0;
    }

    @Nullable
    public Object createErrorModel(@NotNull Throwable throwable0, @NotNull Continuation continuation0) {
        return BaseRepository.a(this, throwable0, continuation0);
    }

    @NotNull
    public final ErrorModel createUnknownErrorModel() {
        ErrorModel errorModel0 = new ErrorModel();
        errorModel0.setCode(-1);
        errorModel0.setStatus("EXCEPTION_UNKNOWN_STATUS");
        errorModel0.setTitle(ConstsKt.getEXCEPTION_UNKNOWN_TITLE());
        return errorModel0;
    }

    @NotNull
    public final ThrowableRepository getThrowableRepository() {
        ThrowableRepository throwableRepository0 = this.throwableRepository;
        if(throwableRepository0 != null) {
            return throwableRepository0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("throwableRepository");
        return null;
    }

    @NotNull
    public ErrorModel parseErrorModel(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "errorString");
        Object object0 = new Gson().fromJson(s, ErrorModel.class);
        Intrinsics.checkNotNullExpressionValue(object0, "fromJson(...)");
        return (ErrorModel)object0;
    }

    public final Object requestApi(Function1 function10, Continuation continuation0) {
        try {
            return new Success(function10.invoke(continuation0));
        }
        catch(CancellationException cancellationException0) {
            this.sendError("coroutine cancel", cancellationException0, continuation0);
            return new Fail(this.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
            ErrorModel errorModel0 = (ErrorModel)this.createErrorModel(throwable0, continuation0);
            if(ErrorStatusKt.checkAuthTokenError(errorModel0.getStatus())) {
                this.getThrowableRepository().getSessionThrowable().emit(errorModel0, continuation0);
                return new Fail(errorModel0);
            }
            if(ErrorStatusKt.checkInspectionError(errorModel0.getCode())) {
                this.getThrowableRepository().getInspectionThrowable().emit(errorModel0, continuation0);
            }
            return new Fail(errorModel0);
        }
    }

    @Nullable
    public final Object sendError(@Nullable String s, @NotNull Throwable throwable0, @NotNull Continuation continuation0) {
        ErrorModel errorModel0 = new ErrorModel();
        errorModel0.setMessage(s);
        Pair pair0 = new Pair(errorModel0, throwable0);
        Object object0 = this.getThrowableRepository().getCreateErrorModelThrowable().emit(pair0, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public final void setThrowableRepository(@NotNull ThrowableRepository throwableRepository0) {
        Intrinsics.checkNotNullParameter(throwableRepository0, "<set-?>");
        this.throwableRepository = throwableRepository0;
    }
}

