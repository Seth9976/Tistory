package com.kakao.tistory.data.repository;

import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.data.service.NotificationService;
import com.kakao.tistory.domain.ErrorStatusKt;
import com.kakao.tistory.domain.entity.common.Count;
import com.kakao.tistory.domain.entity.common.ItemModel;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.domain.repository.NotificationRepository;
import java.util.List;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.k;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001C\u0010\n\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H\u0096@¢\u0006\u0004\b\n\u0010\u000BJ.\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u00110\u00072\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000E\u001A\u00020\f2\u0006\u0010\u0010\u001A\u00020\u000FH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u001E\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\u00160\u00072\u0006\u0010\u0015\u001A\u00020\u0014H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\u00190\u0007H\u0096@¢\u0006\u0004\b\u001A\u0010\u000BJ\u001E\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u00160\u00072\u0006\u0010\u0015\u001A\u00020\u0014H\u0096@¢\u0006\u0004\b\u001B\u0010\u0018R \u0010!\u001A\b\u0012\u0004\u0012\u00020\u00140\u001C8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010 ¨\u0006\""}, d2 = {"Lcom/kakao/tistory/data/repository/NotificationRepositoryImpl;", "Lcom/kakao/tistory/data/repository/BaseRepository;", "Lcom/kakao/tistory/domain/repository/NotificationRepository;", "Lcom/kakao/tistory/data/service/NotificationService;", "notificationService", "<init>", "(Lcom/kakao/tistory/data/service/NotificationService;)V", "Lcom/kakao/tistory/domain/entity/common/Result;", "", "Lcom/kakao/tistory/domain/entity/SortItem$NotificationSortItem;", "getNotificationGroups", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "nextPage", "resultSize", "", "sortType", "Lcom/kakao/tistory/domain/entity/common/NotificationItemListModel;", "getNotifications", "(IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "notificationId", "", "putNotificationRead", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/kakao/tistory/domain/entity/common/Count;", "getNotificationNewCount", "deleteNotification", "Lkotlinx/coroutines/flow/StateFlow;", "c", "Lkotlinx/coroutines/flow/StateFlow;", "getNewCount", "()Lkotlinx/coroutines/flow/StateFlow;", "newCount", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNotificationRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationRepositoryImpl.kt\ncom/kakao/tistory/data/repository/NotificationRepositoryImpl\n+ 2 BaseRepository.kt\ncom/kakao/tistory/data/repository/BaseRepository\n+ 3 BaseRepository.kt\ncom/kakao/tistory/data/repository/BaseRepository$checkError$2\n+ 4 Result.kt\ncom/kakao/tistory/domain/entity/common/ResultKt\n+ 5 Result.kt\ncom/kakao/tistory/domain/entity/common/ResultKt$process$2\n*L\n1#1,55:1\n26#2,27:56\n53#2:84\n26#2,27:85\n53#2:113\n35#2:114\n26#2,27:124\n53#2:152\n35#2:153\n26#2,27:154\n53#2:182\n35#2:183\n26#2,27:193\n53#2:221\n35#2:222\n39#3:83\n39#3:112\n39#3:151\n39#3:181\n39#3:220\n11#4,7:115\n19#4:123\n11#4,7:184\n19#4:192\n13#5:122\n13#5:191\n*S KotlinDebug\n*F\n+ 1 NotificationRepositoryImpl.kt\ncom/kakao/tistory/data/repository/NotificationRepositoryImpl\n*L\n25#1:56,27\n25#1:84\n33#1:85,27\n33#1:113\n33#1:114\n41#1:124,27\n41#1:152\n41#1:153\n45#1:154,27\n45#1:182\n45#1:183\n53#1:193,27\n53#1:221\n53#1:222\n25#1:83\n33#1:112\n41#1:151\n45#1:181\n53#1:220\n36#1:115,7\n36#1:123\n48#1:184,7\n48#1:192\n36#1:122\n48#1:191\n*E\n"})
public final class NotificationRepositoryImpl extends BaseRepository implements NotificationRepository {
    public final NotificationService a;
    public final MutableStateFlow b;
    public final StateFlow c;

    @Inject
    public NotificationRepositoryImpl(@NotNull NotificationService notificationService0) {
        Intrinsics.checkNotNullParameter(notificationService0, "notificationService");
        super();
        this.a = notificationService0;
        MutableStateFlow mutableStateFlow0 = StateFlowKt.MutableStateFlow(0L);
        this.b = mutableStateFlow0;
        this.c = FlowKt.asStateFlow(mutableStateFlow0);
    }

    @Override  // com.kakao.tistory.domain.repository.NotificationRepository
    @Nullable
    public Object deleteNotification(long v, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        g2 g20;
        if(continuation0 instanceof g2) {
            g20 = (g2)continuation0;
            int v1 = g20.d;
            if((v1 & 0x80000000) == 0) {
                g20 = new g2(this, continuation0);
            }
            else {
                g20.d = v1 ^ 0x80000000;
            }
        }
        else {
            g20 = new g2(this, continuation0);
        }
        Object object0 = g20.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(g20.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    List list0 = k.listOf(Boxing.boxLong(v));
                    g20.a = this;
                    g20.d = 1;
                    if(this.a.deleteNotification(list0, g20) == object1) {
                        return object1;
                    }
                    baseRepository0 = this;
                    break;
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    g20.a = baseRepository0;
                    g20.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, g20) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository0 = this;
                    goto label_47;
                }
                return object1;
            }
            case 1: {
                baseRepository0 = (BaseRepository)g20.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    g20.a = baseRepository0;
                    g20.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, g20) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)g20.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository0 = (BaseRepository)g20.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)g20.a;
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
            g20.a = baseRepository0;
            g20.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, g20) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        g20.a = baseRepository0;
        g20.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, g20);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            g20.a = (ErrorModel)object0;
            g20.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), g20) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            g20.a = (ErrorModel)object0;
            g20.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), g20) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.NotificationRepository
    @NotNull
    public StateFlow getNewCount() {
        return this.c;
    }

    @Override  // com.kakao.tistory.domain.repository.NotificationRepository
    @Nullable
    public Object getNotificationGroups(@NotNull Continuation continuation0) {
        BaseRepository baseRepository1;
        h2 h20;
        if(continuation0 instanceof h2) {
            h20 = (h2)continuation0;
            int v = h20.d;
            if((v & 0x80000000) == 0) {
                h20 = new h2(this, continuation0);
            }
            else {
                h20.d = v ^ 0x80000000;
            }
        }
        else {
            h20 = new h2(this, continuation0);
        }
        Object object0 = h20.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(h20.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    h20.a = this;
                    h20.d = 1;
                    object0 = this.a.getNotificationGroups(h20);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    h20.a = baseRepository1;
                    h20.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, h20) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
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
                baseRepository1 = (BaseRepository)h20.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    h20.a = baseRepository1;
                    h20.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, h20) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                BaseRepository baseRepository0 = (BaseRepository)h20.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository1 = (BaseRepository)h20.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)h20.a;
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
            h20.a = baseRepository1;
            h20.d = 2;
            return baseRepository1.sendError("coroutine cancel", cancellationException0, h20) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        h20.a = baseRepository1;
        h20.d = 3;
        object0 = baseRepository1.createErrorModel(throwable0, h20);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            h20.a = (ErrorModel)object0;
            h20.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), h20) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            h20.a = (ErrorModel)object0;
            h20.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), h20) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.NotificationRepository
    @Nullable
    public Object getNotificationNewCount(@NotNull Continuation continuation0) {
        Fail result$Fail0;
        BaseRepository baseRepository1;
        BaseRepository baseRepository0;
        i2 i20;
        if(continuation0 instanceof i2) {
            i20 = (i2)continuation0;
            int v = i20.e;
            if((v & 0x80000000) == 0) {
                i20 = new i2(this, continuation0);
            }
            else {
                i20.e = v ^ 0x80000000;
            }
        }
        else {
            i20 = new i2(this, continuation0);
        }
        Object object0 = i20.c;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(i20.e) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    i20.a = this;
                    i20.b = this;
                    i20.e = 1;
                    object0 = this.a.getNotificationNewCount(i20);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    baseRepository1 = baseRepository0;
                    goto label_41;
                }
                catch(Throwable throwable0) {
                    baseRepository0 = this;
                    baseRepository1 = baseRepository0;
                    goto label_49;
                }
                if(object0 == object1) {
                    return object1;
                }
                baseRepository0 = this;
                baseRepository1 = baseRepository0;
                result$Fail0 = new Success(((ItemModel)object0).getData());
                break;
            }
            case 1: {
                baseRepository0 = (BaseRepository)i20.b;
                baseRepository1 = (NotificationRepositoryImpl)i20.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    result$Fail0 = new Success(((ItemModel)object0).getData());
                    break;
                }
                catch(CancellationException cancellationException0) {
                label_41:
                    i20.a = baseRepository1;
                    i20.b = baseRepository0;
                    i20.e = 2;
                    if(baseRepository0.sendError("coroutine cancel", cancellationException0, i20) == object1) {
                        return object1;
                    }
                    result$Fail0 = new Fail(baseRepository0.createCoroutineCancelErrorModel());
                    break;
                }
                catch(Throwable throwable0) {
                }
            label_49:
                i20.a = baseRepository1;
                i20.b = baseRepository0;
                i20.e = 3;
                object0 = baseRepository0.createErrorModel(throwable0, i20);
                if(object0 == object1) {
                    return object1;
                }
                goto label_63;
            }
            case 2: {
                baseRepository0 = (BaseRepository)i20.b;
                baseRepository1 = (NotificationRepositoryImpl)i20.a;
                ResultKt.throwOnFailure(object0);
                result$Fail0 = new Fail(baseRepository0.createCoroutineCancelErrorModel());
                break;
            }
            case 3: {
                baseRepository0 = (BaseRepository)i20.b;
                baseRepository1 = (NotificationRepositoryImpl)i20.a;
                ResultKt.throwOnFailure(object0);
            label_63:
                if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
                    MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
                    i20.a = baseRepository1;
                    i20.b = (ErrorModel)object0;
                    i20.e = 4;
                    if(mutableSharedFlow0.emit(((ErrorModel)object0), i20) == object1) {
                        return object1;
                    }
                }
                else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
                    MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
                    i20.a = baseRepository1;
                    i20.b = (ErrorModel)object0;
                    i20.e = 5;
                    if(mutableSharedFlow1.emit(((ErrorModel)object0), i20) == object1) {
                        return object1;
                    }
                }
                result$Fail0 = new Fail(((ErrorModel)object0));
                break;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)i20.b;
                baseRepository1 = (NotificationRepositoryImpl)i20.a;
                ResultKt.throwOnFailure(object0);
                result$Fail0 = new Fail(errorModel0);
                break;
            }
            case 6: {
                Result result0 = (Result)i20.a;
                ResultKt.throwOnFailure(object0);
                return result0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(result$Fail0 instanceof Success) {
            Long long0 = Boxing.boxLong(((Count)((Success)result$Fail0).getData()).getCount());
            i20.a = result$Fail0;
            i20.b = null;
            i20.e = 6;
            if(baseRepository1.b.emit(long0, i20) == object1) {
                return object1;
            }
        }
        return result$Fail0;
    }

    @Override  // com.kakao.tistory.domain.repository.NotificationRepository
    @Nullable
    public Object getNotifications(int v, int v1, @NotNull String s, @NotNull Continuation continuation0) {
        Result result0;
        Fail result$Fail0;
        Throwable throwable1;
        BaseRepository baseRepository1;
        BaseRepository baseRepository0;
        j2 j20;
        if(continuation0 instanceof j2) {
            j20 = (j2)continuation0;
            int v2 = j20.e;
            if((v2 & 0x80000000) == 0) {
                j20 = new j2(this, continuation0);
            }
            else {
                j20.e = v2 ^ 0x80000000;
            }
        }
        else {
            j20 = new j2(this, continuation0);
        }
        Object object0 = j20.c;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(j20.e) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    j20.a = this;
                    j20.b = this;
                    j20.e = 1;
                    object0 = this.a.getNotifications(v, v1, s, j20);
                }
                catch(CancellationException cancellationException0) {
                    CancellationException cancellationException1 = cancellationException0;
                    baseRepository0 = this;
                    baseRepository1 = baseRepository0;
                    goto label_43;
                }
                catch(Throwable throwable0) {
                    throwable1 = throwable0;
                    baseRepository0 = this;
                    baseRepository1 = baseRepository0;
                    goto label_51;
                }
                if(object0 == object1) {
                    return object1;
                }
                baseRepository0 = this;
                baseRepository1 = baseRepository0;
                result0 = new Success(((ItemModel)object0).getData());
                break;
            }
            case 1: {
                baseRepository0 = (BaseRepository)j20.b;
                baseRepository1 = (NotificationRepositoryImpl)j20.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    result0 = new Success(((ItemModel)object0).getData());
                    break;
                }
                catch(CancellationException cancellationException1) {
                label_43:
                    j20.a = baseRepository1;
                    j20.b = baseRepository0;
                    j20.e = 2;
                    if(baseRepository0.sendError("coroutine cancel", cancellationException1, j20) == object1) {
                        return object1;
                    }
                    result$Fail0 = new Fail(baseRepository0.createCoroutineCancelErrorModel());
                    result0 = result$Fail0;
                    break;
                }
                catch(Throwable throwable1) {
                }
            label_51:
                j20.a = baseRepository1;
                j20.b = baseRepository0;
                j20.e = 3;
                object0 = baseRepository0.createErrorModel(throwable1, j20);
                if(object0 == object1) {
                    return object1;
                }
                goto label_65;
            }
            case 2: {
                baseRepository0 = (BaseRepository)j20.b;
                baseRepository1 = (NotificationRepositoryImpl)j20.a;
                ResultKt.throwOnFailure(object0);
                result$Fail0 = new Fail(baseRepository0.createCoroutineCancelErrorModel());
                result0 = result$Fail0;
                break;
            }
            case 3: {
                baseRepository0 = (BaseRepository)j20.b;
                baseRepository1 = (NotificationRepositoryImpl)j20.a;
                ResultKt.throwOnFailure(object0);
            label_65:
                if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
                    MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
                    j20.a = baseRepository1;
                    j20.b = (ErrorModel)object0;
                    j20.e = 4;
                    if(mutableSharedFlow0.emit(((ErrorModel)object0), j20) == object1) {
                        return object1;
                    }
                }
                else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
                    MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
                    j20.a = baseRepository1;
                    j20.b = (ErrorModel)object0;
                    j20.e = 5;
                    if(mutableSharedFlow1.emit(((ErrorModel)object0), j20) == object1) {
                        return object1;
                    }
                }
                result$Fail0 = new Fail(((ErrorModel)object0));
                result0 = result$Fail0;
                break;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)j20.b;
                baseRepository1 = (NotificationRepositoryImpl)j20.a;
                ResultKt.throwOnFailure(object0);
                result0 = new Fail(errorModel0);
                break;
            }
            case 6: {
                result0 = (Result)j20.a;
                ResultKt.throwOnFailure(object0);
                return result0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(result0 instanceof Success) {
            j20.a = result0;
            j20.b = null;
            j20.e = 6;
            if(baseRepository1.b.emit(Boxing.boxLong(0L), j20) == object1) {
                return object1;
            }
        }
        return result0;
    }

    @Override  // com.kakao.tistory.domain.repository.NotificationRepository
    @Nullable
    public Object putNotificationRead(long v, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        k2 k20;
        if(continuation0 instanceof k2) {
            k20 = (k2)continuation0;
            int v1 = k20.d;
            if((v1 & 0x80000000) == 0) {
                k20 = new k2(this, continuation0);
            }
            else {
                k20.d = v1 ^ 0x80000000;
            }
        }
        else {
            k20 = new k2(this, continuation0);
        }
        Object object0 = k20.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(k20.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    k20.a = this;
                    k20.d = 1;
                    if(this.a.putNotificationRead(v, k20) == object1) {
                        return object1;
                    }
                    baseRepository0 = this;
                    break;
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    k20.a = baseRepository0;
                    k20.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, k20) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository0 = this;
                    goto label_46;
                }
                return object1;
            }
            case 1: {
                baseRepository0 = (BaseRepository)k20.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    k20.a = baseRepository0;
                    k20.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, k20) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_46;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)k20.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository0 = (BaseRepository)k20.a;
                ResultKt.throwOnFailure(object0);
                goto label_51;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)k20.a;
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
            k20.a = baseRepository0;
            k20.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, k20) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_46:
        k20.a = baseRepository0;
        k20.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, k20);
        if(object0 == object1) {
            return object1;
        }
    label_51:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            k20.a = (ErrorModel)object0;
            k20.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), k20) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            k20.a = (ErrorModel)object0;
            k20.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), k20) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }
}

