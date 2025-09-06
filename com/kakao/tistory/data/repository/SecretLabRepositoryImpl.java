package com.kakao.tistory.data.repository;

import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.data.service.SecretLabService;
import com.kakao.tistory.domain.ErrorStatusKt;
import com.kakao.tistory.domain.entity.common.ItemModel;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.repository.SecretLabRepository;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001C\u0010\n\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H\u0096@¢\u0006\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"Lcom/kakao/tistory/data/repository/SecretLabRepositoryImpl;", "Lcom/kakao/tistory/data/repository/BaseRepository;", "Lcom/kakao/tistory/domain/repository/SecretLabRepository;", "Lcom/kakao/tistory/data/service/SecretLabService;", "secretLabService", "<init>", "(Lcom/kakao/tistory/data/service/SecretLabService;)V", "Lcom/kakao/tistory/domain/entity/common/Result;", "", "Lcom/kakao/tistory/domain/entity/ServerHost;", "getServerHostList", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSecretLabRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SecretLabRepositoryImpl.kt\ncom/kakao/tistory/data/repository/SecretLabRepositoryImpl\n+ 2 BaseRepository.kt\ncom/kakao/tistory/data/repository/BaseRepository\n+ 3 BaseRepository.kt\ncom/kakao/tistory/data/repository/BaseRepository$checkError$2\n*L\n1#1,16:1\n26#2,27:17\n53#2:45\n39#3:44\n*S KotlinDebug\n*F\n+ 1 SecretLabRepositoryImpl.kt\ncom/kakao/tistory/data/repository/SecretLabRepositoryImpl\n*L\n14#1:17,27\n14#1:45\n14#1:44\n*E\n"})
public final class SecretLabRepositoryImpl extends BaseRepository implements SecretLabRepository {
    public final SecretLabService a;

    @Inject
    public SecretLabRepositoryImpl(@NotNull SecretLabService secretLabService0) {
        Intrinsics.checkNotNullParameter(secretLabService0, "secretLabService");
        super();
        this.a = secretLabService0;
    }

    @Override  // com.kakao.tistory.domain.repository.SecretLabRepository
    @Nullable
    public Object getServerHostList(@NotNull Continuation continuation0) {
        BaseRepository baseRepository1;
        t3 t30;
        if(continuation0 instanceof t3) {
            t30 = (t3)continuation0;
            int v = t30.d;
            if((v & 0x80000000) == 0) {
                t30 = new t3(this, continuation0);
            }
            else {
                t30.d = v ^ 0x80000000;
            }
        }
        else {
            t30 = new t3(this, continuation0);
        }
        Object object0 = t30.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(t30.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    t30.a = this;
                    t30.d = 1;
                    object0 = this.a.getServerHostList(t30);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    t30.a = baseRepository1;
                    t30.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, t30) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
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
                baseRepository1 = (BaseRepository)t30.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    t30.a = baseRepository1;
                    t30.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, t30) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                BaseRepository baseRepository0 = (BaseRepository)t30.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository1 = (BaseRepository)t30.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)t30.a;
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
            t30.a = baseRepository1;
            t30.d = 2;
            return baseRepository1.sendError("coroutine cancel", cancellationException0, t30) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        t30.a = baseRepository1;
        t30.d = 3;
        object0 = baseRepository1.createErrorModel(throwable0, t30);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            t30.a = (ErrorModel)object0;
            t30.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), t30) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            t30.a = (ErrorModel)object0;
            t30.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), t30) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }
}

