package com.kakao.tistory.data.repository;

import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.data.model.WebSession;
import com.kakao.tistory.data.preference.AppSessionPreference;
import com.kakao.tistory.data.service.AccountService;
import com.kakao.tistory.domain.ErrorStatusKt;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.repository.SessionRepository;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001A\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u0016\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\r0\fH\u0096@¢\u0006\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"Lcom/kakao/tistory/data/repository/SessionRepositoryImpl;", "Lcom/kakao/tistory/data/repository/BaseRepository;", "Lcom/kakao/tistory/domain/repository/SessionRepository;", "Lcom/kakao/tistory/data/preference/AppSessionPreference;", "appSessionPreference", "Lcom/kakao/tistory/data/service/AccountService;", "accountService", "<init>", "(Lcom/kakao/tistory/data/preference/AppSessionPreference;Lcom/kakao/tistory/data/service/AccountService;)V", "", "getWebSessionCookie", "()Ljava/lang/String;", "Lcom/kakao/tistory/domain/entity/common/Result;", "", "postWebSession", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSessionRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionRepositoryImpl.kt\ncom/kakao/tistory/data/repository/SessionRepositoryImpl\n+ 2 BaseRepository.kt\ncom/kakao/tistory/data/repository/BaseRepository\n+ 3 BaseRepository.kt\ncom/kakao/tistory/data/repository/BaseRepository$checkError$2\n+ 4 Result.kt\ncom/kakao/tistory/domain/entity/common/ResultKt\n*L\n1#1,37:1\n26#2,27:38\n53#2:66\n39#3:65\n15#4,5:67\n*S KotlinDebug\n*F\n+ 1 SessionRepositoryImpl.kt\ncom/kakao/tistory/data/repository/SessionRepositoryImpl\n*L\n26#1:38,27\n26#1:66\n26#1:65\n28#1:67,5\n*E\n"})
public final class SessionRepositoryImpl extends BaseRepository implements SessionRepository {
    public final AppSessionPreference a;
    public final AccountService b;

    @Inject
    public SessionRepositoryImpl(@NotNull AppSessionPreference appSessionPreference0, @NotNull AccountService accountService0) {
        Intrinsics.checkNotNullParameter(appSessionPreference0, "appSessionPreference");
        Intrinsics.checkNotNullParameter(accountService0, "accountService");
        super();
        this.a = appSessionPreference0;
        this.b = accountService0;
    }

    @Override  // com.kakao.tistory.domain.repository.SessionRepository
    @Nullable
    public String getWebSessionCookie() {
        WebSession webSession0 = this.a.getWebSession();
        return webSession0 == null ? null : webSession0.getSessionName() + "=" + webSession0.getSessionValue() + ";";
    }

    @Override  // com.kakao.tistory.domain.repository.SessionRepository
    @Nullable
    public Object postWebSession(@NotNull Continuation continuation0) {
        Fail result$Fail0;
        BaseRepository baseRepository0;
        ErrorModel errorModel0;
        BaseRepository baseRepository2;
        BaseRepository baseRepository1;
        BaseRepository baseRepository3;
        BaseRepository baseRepository4;
        u3 u30;
        if(continuation0 instanceof u3) {
            u30 = (u3)continuation0;
            int v = u30.e;
            if((v & 0x80000000) == 0) {
                u30 = new u3(this, continuation0);
            }
            else {
                u30.e = v ^ 0x80000000;
            }
        }
        else {
            u30 = new u3(this, continuation0);
        }
        Object object0 = u30.c;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(u30.e) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    WebSession webSession0 = this.a.getWebSession();
                    u30.a = this;
                    u30.b = this;
                    u30.e = 1;
                    object0 = this.b.postWebSession((webSession0 == null ? null : webSession0.getSessionValue()), u30);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    baseRepository4 = baseRepository1;
                    goto label_51;
                }
                catch(Throwable throwable0) {
                    baseRepository1 = this;
                    baseRepository4 = baseRepository1;
                    goto label_61;
                }
                if(object0 == object1) {
                    return object1;
                }
                baseRepository1 = this;
                baseRepository4 = baseRepository1;
                break;
            }
            case 1: {
                baseRepository1 = (BaseRepository)u30.b;
                baseRepository4 = u30.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    goto label_51;
                }
                catch(Throwable throwable0) {
                    goto label_61;
                }
            }
            case 2: {
                baseRepository3 = (BaseRepository)u30.b;
                baseRepository0 = u30.a;
                ResultKt.throwOnFailure(object0);
                result$Fail0 = new Fail(baseRepository3.createCoroutineCancelErrorModel());
                goto label_85;
            }
            case 3: {
                baseRepository1 = (BaseRepository)u30.b;
                baseRepository2 = u30.a;
                ResultKt.throwOnFailure(object0);
                goto label_68;
            }
            case 4: 
            case 5: {
                errorModel0 = (ErrorModel)u30.b;
                baseRepository0 = u30.a;
                ResultKt.throwOnFailure(object0);
                goto label_84;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            result$Fail0 = new Success(object0);
            goto label_86;
        }
        catch(CancellationException cancellationException0) {
        label_51:
            u30.a = baseRepository4;
            u30.b = baseRepository1;
            u30.e = 2;
            if(baseRepository1.sendError("coroutine cancel", cancellationException0, u30) == object1) {
                return object1;
            }
            baseRepository3 = baseRepository1;
            baseRepository0 = baseRepository4;
            result$Fail0 = new Fail(baseRepository3.createCoroutineCancelErrorModel());
            goto label_85;
        }
        catch(Throwable throwable0) {
        }
    label_61:
        u30.a = baseRepository4;
        u30.b = baseRepository1;
        u30.e = 3;
        object0 = baseRepository1.createErrorModel(throwable0, u30);
        if(object0 == object1) {
            return object1;
        }
        baseRepository2 = baseRepository4;
    label_68:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            u30.a = baseRepository2;
            u30.b = (ErrorModel)object0;
            u30.e = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), u30) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            u30.a = baseRepository2;
            u30.b = (ErrorModel)object0;
            u30.e = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), u30) == object1) {
                return object1;
            }
        }
        errorModel0 = (ErrorModel)object0;
        baseRepository0 = baseRepository2;
    label_84:
        result$Fail0 = new Fail(errorModel0);
    label_85:
        baseRepository4 = baseRepository0;
    label_86:
        if(result$Fail0 instanceof Success) {
            WebSession webSession1 = (WebSession)((Success)result$Fail0).getData();
            baseRepository4.a.setWebSession(webSession1);
            return new Success(Unit.INSTANCE);
        }
        return result$Fail0 instanceof Fail ? new Fail(result$Fail0.getErrorModel()) : new Fail(baseRepository4.createUnknownErrorModel());
    }
}

