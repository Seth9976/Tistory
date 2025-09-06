package com.kakao.tistory.data.repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.data.preference.DeviceInfoPreference;
import com.kakao.tistory.data.service.PushService.DefaultImpls;
import com.kakao.tistory.data.service.PushService;
import com.kakao.tistory.domain.ErrorStatusKt;
import com.kakao.tistory.domain.entity.PushSetting;
import com.kakao.tistory.domain.entity.common.ItemModel;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.repository.PushRepository;
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

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001E\u0010\r\u001A\b\u0012\u0004\u0012\u00020\f0\u000B2\u0006\u0010\n\u001A\u00020\tH\u0096@¢\u0006\u0004\b\r\u0010\u000EJ\u0016\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\f0\u000BH\u0096@¢\u0006\u0004\b\u000F\u0010\u0010J\u001E\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u00110\u000B2\u0006\u0010\n\u001A\u00020\tH\u0096@¢\u0006\u0004\b\u0012\u0010\u000EJj\u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\u00110\u000B2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0015\u001A\u00020\u00132\u0006\u0010\u0016\u001A\u00020\u00132\u0006\u0010\u0017\u001A\u00020\u00132\u0006\u0010\u0018\u001A\u00020\u00132\u0006\u0010\u0019\u001A\u00020\u00132\u0006\u0010\u001A\u001A\u00020\u00132\b\u0010\u001B\u001A\u0004\u0018\u00010\t2\b\u0010\u001C\u001A\u0004\u0018\u00010\tH\u0096@¢\u0006\u0004\b\u001D\u0010\u001EJ\u0019\u0010 \u001A\u00020\f2\b\u0010\u001F\u001A\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b \u0010!R \u0010\u001F\u001A\b\u0012\u0004\u0012\u00020\u00110\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b\u0012\u0010%R \u0010+\u001A\b\u0012\u0004\u0012\u00020\u00130&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\'\u0010(\u001A\u0004\b)\u0010*R \u0010.\u001A\b\u0012\u0004\u0012\u00020\u00130&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010(\u001A\u0004\b-\u0010*¨\u0006/"}, d2 = {"Lcom/kakao/tistory/data/repository/PushRepositoryImpl;", "Lcom/kakao/tistory/data/repository/BaseRepository;", "Lcom/kakao/tistory/domain/repository/PushRepository;", "Lcom/kakao/tistory/data/preference/DeviceInfoPreference;", "deviceInfoPreference", "Lcom/kakao/tistory/data/service/PushService;", "pushService", "<init>", "(Lcom/kakao/tistory/data/preference/DeviceInfoPreference;Lcom/kakao/tistory/data/service/PushService;)V", "", "token", "Lcom/kakao/tistory/domain/entity/common/Result;", "", "postPushToken", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deletePushToken", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/kakao/tistory/domain/entity/PushSetting;", "getPushSetting", "", "enable", "comment", "invite", "subscription", "newEntry", "challenge", "etiquette", "etiquetteStart", "etiquetteFinish", "putPushSetting", "(Ljava/lang/String;ZZZZZZZLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pushSetting", "savePushSetting", "(Lcom/kakao/tistory/domain/entity/PushSetting;)V", "Landroidx/lifecycle/MutableLiveData;", "c", "Landroidx/lifecycle/MutableLiveData;", "()Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/LiveData;", "d", "Landroidx/lifecycle/LiveData;", "getPushEnabled", "()Landroidx/lifecycle/LiveData;", "pushEnabled", "e", "getEtiquetteEnabled", "etiquetteEnabled", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPushRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PushRepositoryImpl.kt\ncom/kakao/tistory/data/repository/PushRepositoryImpl\n+ 2 BaseRepository.kt\ncom/kakao/tistory/data/repository/BaseRepository\n+ 3 BaseRepository.kt\ncom/kakao/tistory/data/repository/BaseRepository$checkError$2\n+ 4 Result.kt\ncom/kakao/tistory/domain/entity/common/ResultKt\n*L\n1#1,103:1\n26#2,27:104\n53#2:132\n26#2,27:138\n53#2:166\n35#2:167\n26#2,27:168\n53#2:196\n35#2:197\n26#2,27:203\n53#2:231\n35#2:232\n39#3:131\n39#3:165\n39#3:195\n39#3:230\n15#4,5:133\n15#4,5:198\n15#4,5:233\n*S KotlinDebug\n*F\n+ 1 PushRepositoryImpl.kt\ncom/kakao/tistory/data/repository/PushRepositoryImpl\n*L\n30#1:104,27\n30#1:132\n44#1:138,27\n44#1:166\n44#1:167\n53#1:168,27\n53#1:196\n53#1:197\n72#1:203,27\n72#1:231\n72#1:232\n30#1:131\n44#1:165\n53#1:195\n72#1:230\n36#1:133,5\n54#1:198,5\n87#1:233,5\n*E\n"})
public final class PushRepositoryImpl extends BaseRepository implements PushRepository {
    public final DeviceInfoPreference a;
    public final PushService b;
    public final MutableLiveData c;
    public final LiveData d;
    public final LiveData e;

    @Inject
    public PushRepositoryImpl(@NotNull DeviceInfoPreference deviceInfoPreference0, @NotNull PushService pushService0) {
        Intrinsics.checkNotNullParameter(deviceInfoPreference0, "deviceInfoPreference");
        Intrinsics.checkNotNullParameter(pushService0, "pushService");
        super();
        this.a = deviceInfoPreference0;
        this.b = pushService0;
        this.c = new MutableLiveData();
        this.d = Transformations.map(this.getPushSetting(), n3.a);
        this.e = Transformations.map(this.getPushSetting(), k3.a);
    }

    @Override  // com.kakao.tistory.domain.repository.PushRepository
    @Nullable
    public Object deletePushToken(@NotNull Continuation continuation0) {
        BaseRepository baseRepository1;
        j3 j30;
        if(continuation0 instanceof j3) {
            j30 = (j3)continuation0;
            int v = j30.d;
            if((v & 0x80000000) == 0) {
                j30 = new j3(this, continuation0);
            }
            else {
                j30.d = v ^ 0x80000000;
            }
        }
        else {
            j30 = new j3(this, continuation0);
        }
        Object object0 = j30.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(j30.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                String s = this.a.getFcmToken();
                if(s == null) {
                    return new Fail(new ErrorModel());
                }
                try {
                    String s1 = this.a.getGuid();
                    j30.a = this;
                    j30.d = 1;
                    if(this.b.deletePushToken(s1, s, j30) == object1) {
                        return object1;
                    }
                    baseRepository1 = this;
                    break;
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    j30.a = baseRepository1;
                    j30.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, j30) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository1 = this;
                    goto label_50;
                }
                return object1;
            }
            case 1: {
                baseRepository1 = (BaseRepository)j30.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    j30.a = baseRepository1;
                    j30.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, j30) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_50;
                }
            }
            case 2: {
                BaseRepository baseRepository0 = (BaseRepository)j30.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository1 = (BaseRepository)j30.a;
                ResultKt.throwOnFailure(object0);
                goto label_55;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)j30.a;
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
            j30.a = baseRepository1;
            j30.d = 2;
            return baseRepository1.sendError("coroutine cancel", cancellationException0, j30) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_50:
        j30.a = baseRepository1;
        j30.d = 3;
        object0 = baseRepository1.createErrorModel(throwable0, j30);
        if(object0 == object1) {
            return object1;
        }
    label_55:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            j30.a = (ErrorModel)object0;
            j30.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), j30) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            j30.a = (ErrorModel)object0;
            j30.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), j30) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.PushRepository
    @NotNull
    public LiveData getEtiquetteEnabled() {
        return this.e;
    }

    @Override  // com.kakao.tistory.domain.repository.PushRepository
    @NotNull
    public LiveData getPushEnabled() {
        return this.d;
    }

    @Override  // com.kakao.tistory.domain.repository.PushRepository
    @NotNull
    public MutableLiveData getPushSetting() {
        return this.c;
    }

    @Override  // com.kakao.tistory.domain.repository.PushRepository
    @Nullable
    public Object getPushSetting(@NotNull String s, @NotNull Continuation continuation0) {
        Object object2;
        BaseRepository baseRepository0;
        ErrorModel errorModel0;
        BaseRepository baseRepository2;
        BaseRepository baseRepository1;
        l3 l30;
        if(continuation0 instanceof l3) {
            l30 = (l3)continuation0;
            int v = l30.e;
            if((v & 0x80000000) == 0) {
                l30 = new l3(this, continuation0);
            }
            else {
                l30.e = v ^ 0x80000000;
            }
        }
        else {
            l30 = new l3(this, continuation0);
        }
        Object object0 = l30.c;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(l30.e) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    l30.a = this;
                    l30.b = this;
                    l30.e = 1;
                    object0 = this.b.getPushSetting(s, l30);
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
                baseRepository1 = (BaseRepository)l30.b;
                baseRepository2 = l30.a;
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
                baseRepository1 = (BaseRepository)l30.b;
                baseRepository0 = l30.a;
                ResultKt.throwOnFailure(object0);
                object2 = new Fail(baseRepository1.createCoroutineCancelErrorModel());
                goto label_84;
            }
            case 3: {
                baseRepository1 = (BaseRepository)l30.b;
                baseRepository2 = l30.a;
                ResultKt.throwOnFailure(object0);
                goto label_67;
            }
            case 4: 
            case 5: {
                errorModel0 = (ErrorModel)l30.b;
                baseRepository0 = l30.a;
                ResultKt.throwOnFailure(object0);
                goto label_83;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            object2 = new Success(((ItemModel)object0).getData());
            goto label_85;
        }
        catch(CancellationException cancellationException0) {
        label_52:
            l30.a = baseRepository2;
            l30.b = baseRepository1;
            l30.e = 2;
            if(baseRepository1.sendError("coroutine cancel", cancellationException0, l30) == object1) {
                return object1;
            }
            baseRepository0 = baseRepository2;
            object2 = new Fail(baseRepository1.createCoroutineCancelErrorModel());
            goto label_84;
        }
        catch(Throwable throwable0) {
        }
    label_61:
        l30.a = baseRepository2;
        l30.b = baseRepository1;
        l30.e = 3;
        object0 = baseRepository1.createErrorModel(throwable0, l30);
        if(object0 == object1) {
            return object1;
        }
    label_67:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            l30.a = baseRepository2;
            l30.b = (ErrorModel)object0;
            l30.e = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), l30) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            l30.a = baseRepository2;
            l30.b = (ErrorModel)object0;
            l30.e = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), l30) == object1) {
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
            ((PushRepositoryImpl)baseRepository2).savePushSetting(((PushSetting)((Success)object2).getData()));
        }
        return object2;
    }

    @Override  // com.kakao.tistory.domain.repository.PushRepository
    @Nullable
    public Object postPushToken(@NotNull String s, @NotNull Continuation continuation0) {
        Object object2;
        PushRepositoryImpl pushRepositoryImpl0;
        String s1;
        ErrorModel errorModel0;
        PushRepositoryImpl pushRepositoryImpl1;
        BaseRepository baseRepository0;
        m3 m30;
        if(continuation0 instanceof m3) {
            m30 = (m3)continuation0;
            int v = m30.f;
            if((v & 0x80000000) == 0) {
                m30 = new m3(this, continuation0);
            }
            else {
                m30.f = v ^ 0x80000000;
            }
        }
        else {
            m30 = new m3(this, continuation0);
        }
        Object object0 = m30.d;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(m30.f) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    String s2 = this.a.getGuid();
                    m30.a = this;
                    m30.b = s;
                    m30.c = this;
                    m30.f = 1;
                    if(DefaultImpls.postPushToken$default(this.b, s2, s, 0, m30, 4, null) == object1) {
                        return object1;
                    }
                    pushRepositoryImpl1 = this;
                    s1 = s;
                    baseRepository0 = pushRepositoryImpl1;
                    break;
                }
                catch(CancellationException cancellationException0) {
                    pushRepositoryImpl1 = this;
                    s1 = s;
                    baseRepository0 = pushRepositoryImpl1;
                    goto label_58;
                }
                catch(Throwable throwable0) {
                    pushRepositoryImpl1 = this;
                    s1 = s;
                    baseRepository0 = pushRepositoryImpl1;
                    goto label_68;
                }
                return object1;
            }
            case 1: {
                baseRepository0 = (BaseRepository)m30.c;
                s1 = m30.b;
                pushRepositoryImpl1 = m30.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    goto label_58;
                }
                catch(Throwable throwable0) {
                    goto label_68;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)m30.c;
                s1 = m30.b;
                pushRepositoryImpl0 = m30.a;
                ResultKt.throwOnFailure(object0);
                object2 = new Fail(baseRepository0.createCoroutineCancelErrorModel());
                goto label_94;
            }
            case 3: {
                baseRepository0 = (BaseRepository)m30.c;
                s1 = m30.b;
                pushRepositoryImpl1 = m30.a;
                ResultKt.throwOnFailure(object0);
                goto label_75;
            }
            case 4: 
            case 5: {
                errorModel0 = (ErrorModel)m30.c;
                s1 = m30.b;
                pushRepositoryImpl0 = m30.a;
                ResultKt.throwOnFailure(object0);
                goto label_93;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            object2 = new Success(Unit.INSTANCE);
            goto label_95;
        }
        catch(CancellationException cancellationException0) {
        label_58:
            m30.a = pushRepositoryImpl1;
            m30.b = s1;
            m30.c = baseRepository0;
            m30.f = 2;
            if(baseRepository0.sendError("coroutine cancel", cancellationException0, m30) == object1) {
                return object1;
            }
            pushRepositoryImpl0 = pushRepositoryImpl1;
            object2 = new Fail(baseRepository0.createCoroutineCancelErrorModel());
            goto label_94;
        }
        catch(Throwable throwable0) {
        }
    label_68:
        m30.a = pushRepositoryImpl1;
        m30.b = s1;
        m30.c = baseRepository0;
        m30.f = 3;
        object0 = baseRepository0.createErrorModel(throwable0, m30);
        if(object0 == object1) {
            return object1;
        }
    label_75:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            m30.a = pushRepositoryImpl1;
            m30.b = s1;
            m30.c = (ErrorModel)object0;
            m30.f = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), m30) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            m30.a = pushRepositoryImpl1;
            m30.b = s1;
            m30.c = (ErrorModel)object0;
            m30.f = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), m30) == object1) {
                return object1;
            }
        }
        errorModel0 = (ErrorModel)object0;
        pushRepositoryImpl0 = pushRepositoryImpl1;
    label_93:
        object2 = new Fail(errorModel0);
    label_94:
        pushRepositoryImpl1 = pushRepositoryImpl0;
    label_95:
        if(object2 instanceof Success) {
            pushRepositoryImpl1.a.setFcmToken(s1);
        }
        return object2;
    }

    @Override  // com.kakao.tistory.domain.repository.PushRepository
    @Nullable
    public Object putPushSetting(@NotNull String s, boolean z, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, @Nullable String s1, @Nullable String s2, @NotNull Continuation continuation0) {
        Object object3;
        BaseRepository baseRepository0;
        ErrorModel errorModel0;
        Object object2;
        BaseRepository baseRepository2;
        BaseRepository baseRepository1;
        String s3;
        o3 o30;
        if(continuation0 instanceof o3) {
            o30 = (o3)continuation0;
            int v = o30.e;
            if((v & 0x80000000) == 0) {
                o30 = new o3(this, continuation0);
            }
            else {
                o30.e = v ^ 0x80000000;
            }
        }
        else {
            o30 = new o3(this, continuation0);
        }
        Object object0 = o30.c;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(o30.e) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    object2 = object1;
                    s3 = this.a.getGuid();
                    o30.a = this;
                    o30.b = this;
                    o30.e = 1;
                    object2 = object1;
                    object0 = this.b.putPushSetting(s3, s, z, z1, z2, z3, z4, z5, z6, (s1 == null ? "0000" : s1), (s2 == null ? "0700" : s2), o30);
                }
                catch(CancellationException cancellationException0) {
                    object2 = object1;
                    baseRepository1 = this;
                    baseRepository2 = baseRepository1;
                    goto label_63;
                }
                catch(Throwable throwable0) {
                    baseRepository1 = this;
                    baseRepository2 = baseRepository1;
                    goto label_72;
                }
                if(object0 == object2) {
                    return object2;
                }
                baseRepository1 = this;
                baseRepository2 = baseRepository1;
                break;
            }
            case 1: {
                baseRepository1 = (BaseRepository)o30.b;
                baseRepository2 = o30.a;
                try {
                    object2 = object1;
                    ResultKt.throwOnFailure(object0);
                    object2 = object1;
                    break;
                }
                catch(CancellationException cancellationException0) {
                }
                catch(Throwable throwable0) {
                    goto label_72;
                }
                object2 = object1;
                goto label_63;
            }
            case 2: {
                baseRepository1 = (BaseRepository)o30.b;
                baseRepository0 = o30.a;
                ResultKt.throwOnFailure(object0);
                object3 = new Fail(baseRepository1.createCoroutineCancelErrorModel());
                goto label_95;
            }
            case 3: {
                baseRepository1 = (BaseRepository)o30.b;
                baseRepository2 = o30.a;
                ResultKt.throwOnFailure(object0);
                object2 = object1;
                goto label_78;
            }
            case 4: 
            case 5: {
                errorModel0 = (ErrorModel)o30.b;
                baseRepository0 = o30.a;
                ResultKt.throwOnFailure(object0);
                goto label_94;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            object3 = new Success(((ItemModel)object0).getData());
            goto label_96;
        }
        catch(CancellationException cancellationException0) {
        label_63:
            o30.a = baseRepository2;
            o30.b = baseRepository1;
            o30.e = 2;
            if(baseRepository1.sendError("coroutine cancel", cancellationException0, o30) == object2) {
                return object2;
            }
            baseRepository0 = baseRepository2;
            object3 = new Fail(baseRepository1.createCoroutineCancelErrorModel());
            goto label_95;
        }
        catch(Throwable throwable0) {
        }
    label_72:
        o30.a = baseRepository2;
        o30.b = baseRepository1;
        o30.e = 3;
        object0 = baseRepository1.createErrorModel(throwable0, o30);
        if(object0 == object2) {
            return object2;
        }
    label_78:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            o30.a = baseRepository2;
            o30.b = (ErrorModel)object0;
            o30.e = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), o30) == object2) {
                return object2;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            o30.a = baseRepository2;
            o30.b = (ErrorModel)object0;
            o30.e = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), o30) == object2) {
                return object2;
            }
        }
        errorModel0 = (ErrorModel)object0;
        baseRepository0 = baseRepository2;
    label_94:
        object3 = new Fail(errorModel0);
    label_95:
        baseRepository2 = baseRepository0;
    label_96:
        if(object3 instanceof Success) {
            ((PushRepositoryImpl)baseRepository2).savePushSetting(((PushSetting)((Success)object3).getData()));
        }
        return object3;
    }

    @Override  // com.kakao.tistory.domain.repository.PushRepository
    public void savePushSetting(@Nullable PushSetting pushSetting0) {
        if(pushSetting0 == null) {
            pushSetting0 = new PushSetting(false, null, null, null, null, null, null, 0x7F, null);
        }
        this.getPushSetting().setValue(pushSetting0);
        this.a.setPushEnabled(pushSetting0.getEnable());
        boolean z = pushSetting0.getEtiquette().getEnable();
        this.a.setPushEtiquetteEnabled(z);
        String s = pushSetting0.getEtiquette().getStart();
        this.a.setPushEtiquetteStartTime(s);
        String s1 = pushSetting0.getEtiquette().getFinish();
        this.a.setPushEtiquetteFinishTime(s1);
    }
}

