package com.kakao.tistory.data.repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.data.service.AppInfoService;
import com.kakao.tistory.domain.ErrorStatusKt;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.repository.AppInfoRepository;
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

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u0096@¢\u0006\u0004\b\t\u0010\nR \u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\b0\u000B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\t\u0010\u000ER\"\u0010\u0016\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/kakao/tistory/data/repository/AppInfoRepositoryImpl;", "Lcom/kakao/tistory/data/repository/BaseRepository;", "Lcom/kakao/tistory/domain/repository/AppInfoRepository;", "Lcom/kakao/tistory/data/service/AppInfoService;", "appInfoService", "<init>", "(Lcom/kakao/tistory/data/service/AppInfoService;)V", "Lcom/kakao/tistory/domain/entity/common/Result;", "Lcom/kakao/tistory/domain/entity/appinfo/AppInfo;", "getAppInfo", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/MutableLiveData;", "b", "Landroidx/lifecycle/MutableLiveData;", "()Landroidx/lifecycle/MutableLiveData;", "appInfo", "Landroidx/lifecycle/LiveData;", "Lcom/kakao/tistory/domain/entity/appinfo/Step1;", "c", "Landroidx/lifecycle/LiveData;", "getStep1", "()Landroidx/lifecycle/LiveData;", "step1", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAppInfoRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppInfoRepositoryImpl.kt\ncom/kakao/tistory/data/repository/AppInfoRepositoryImpl\n+ 2 BaseRepository.kt\ncom/kakao/tistory/data/repository/BaseRepository\n+ 3 BaseRepository.kt\ncom/kakao/tistory/data/repository/BaseRepository$checkError$2\n*L\n1#1,29:1\n26#2,27:30\n53#2:58\n39#3:57\n*S KotlinDebug\n*F\n+ 1 AppInfoRepositoryImpl.kt\ncom/kakao/tistory/data/repository/AppInfoRepositoryImpl\n*L\n23#1:30,27\n23#1:58\n23#1:57\n*E\n"})
public final class AppInfoRepositoryImpl extends BaseRepository implements AppInfoRepository {
    public final AppInfoService a;
    public final MutableLiveData b;
    public final LiveData c;

    @Inject
    public AppInfoRepositoryImpl(@NotNull AppInfoService appInfoService0) {
        Intrinsics.checkNotNullParameter(appInfoService0, "appInfoService");
        super();
        this.a = appInfoService0;
        this.b = new MutableLiveData();
        this.c = Transformations.map(this.getAppInfo(), q.a);
    }

    @Override  // com.kakao.tistory.domain.repository.AppInfoRepository
    @NotNull
    public MutableLiveData getAppInfo() {
        return this.b;
    }

    @Override  // com.kakao.tistory.domain.repository.AppInfoRepository
    @Nullable
    public Object getAppInfo(@NotNull Continuation continuation0) {
        Object object2;
        BaseRepository baseRepository0;
        ErrorModel errorModel0;
        BaseRepository baseRepository2;
        BaseRepository baseRepository1;
        BaseRepository baseRepository3;
        BaseRepository baseRepository4;
        p p0;
        if(continuation0 instanceof p) {
            p0 = (p)continuation0;
            int v = p0.e;
            if((v & 0x80000000) == 0) {
                p0 = new p(this, continuation0);
            }
            else {
                p0.e = v ^ 0x80000000;
            }
        }
        else {
            p0 = new p(this, continuation0);
        }
        Object object0 = p0.c;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(p0.e) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    p0.a = this;
                    p0.b = this;
                    p0.e = 1;
                    object0 = this.a.getAppInfo(p0);
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
                baseRepository1 = (BaseRepository)p0.b;
                baseRepository4 = p0.a;
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
                baseRepository3 = (BaseRepository)p0.b;
                baseRepository0 = p0.a;
                ResultKt.throwOnFailure(object0);
                object2 = new Fail(baseRepository3.createCoroutineCancelErrorModel());
                goto label_84;
            }
            case 3: {
                baseRepository1 = (BaseRepository)p0.b;
                baseRepository2 = p0.a;
                ResultKt.throwOnFailure(object0);
                goto label_67;
            }
            case 4: 
            case 5: {
                errorModel0 = (ErrorModel)p0.b;
                baseRepository0 = p0.a;
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
            p0.a = baseRepository4;
            p0.b = baseRepository1;
            p0.e = 2;
            if(baseRepository1.sendError("coroutine cancel", cancellationException0, p0) == object1) {
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
        p0.a = baseRepository4;
        p0.b = baseRepository1;
        p0.e = 3;
        object0 = baseRepository1.createErrorModel(throwable0, p0);
        if(object0 == object1) {
            return object1;
        }
        baseRepository2 = baseRepository4;
    label_67:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            p0.a = baseRepository2;
            p0.b = (ErrorModel)object0;
            p0.e = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), p0) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            p0.a = baseRepository2;
            p0.b = (ErrorModel)object0;
            p0.e = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), p0) == object1) {
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
            ((AppInfoRepositoryImpl)baseRepository4).getAppInfo().postValue(((Success)object2).getData());
        }
        return object2;
    }

    @Override  // com.kakao.tistory.domain.repository.AppInfoRepository
    @NotNull
    public LiveData getStep1() {
        return this.c;
    }
}

