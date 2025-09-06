package com.kakao.tistory.data.revenue.repository;

import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.data.repository.BaseRepository;
import com.kakao.tistory.data.revenue.api.RevenueService;
import com.kakao.tistory.domain.ErrorStatusKt;
import com.kakao.tistory.domain.entity.common.ItemModel;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.revenue.entity.RevenueResponse;
import com.kakao.tistory.domain.revenue.repository.RevenueVendorRepository;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u000B\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\n0\t2\u0006\u0010\b\u001A\u00020\u0007H\u0096@¢\u0006\u0004\b\u000B\u0010\fJ$\u0010\u000E\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\n0\t2\u0006\u0010\b\u001A\u00020\u0007H\u0096@¢\u0006\u0004\b\u000E\u0010\fJ+\u0010\u0012\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\t0\u00102\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\u000F\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013JA\u0010\u0018\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00170\u00160\u00102\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\u000F\u001A\u00020\u00072\u0006\u0010\u0014\u001A\u00020\u00072\u0006\u0010\u0015\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019JG\u0010\u001C\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001B0\t0\u00102\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\u000F\u001A\u00020\u00072\u0006\u0010\u0014\u001A\u00020\u00072\b\u0010\u001A\u001A\u0004\u0018\u00010\u00072\b\u0010\u0015\u001A\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u001C\u0010\u001DJ\u001E\u0010\u001F\u001A\b\u0012\u0004\u0012\u00020\u001E0\t2\u0006\u0010\b\u001A\u00020\u0007H\u0096@¢\u0006\u0004\b\u001F\u0010\f¨\u0006 "}, d2 = {"Lcom/kakao/tistory/data/revenue/repository/RevenueVendorRepositoryImpl;", "Lcom/kakao/tistory/data/repository/BaseRepository;", "Lcom/kakao/tistory/domain/revenue/repository/RevenueVendorRepository;", "Lcom/kakao/tistory/data/revenue/api/RevenueService;", "revenueService", "<init>", "(Lcom/kakao/tistory/data/revenue/api/RevenueService;)V", "", "blogName", "Lcom/kakao/tistory/domain/entity/common/Result;", "", "getRevenueVendorList", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/kakao/tistory/domain/revenue/entity/RevenueCurrent;", "getRevenueCurrent", "vendor", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kakao/tistory/domain/revenue/entity/RevenueSummary;", "getRevenueSummary", "(Ljava/lang/String;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "granularity", "endDate", "Landroidx/paging/Pager;", "Lcom/kakao/tistory/domain/revenue/entity/RevenueGraph;", "getRevenueGraph", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "startDate", "Lcom/kakao/tistory/domain/revenue/entity/RevenueGraphDetailInfo;", "getRevenueGraphDetailInfo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "Lcom/kakao/tistory/domain/revenue/entity/RevenueSupport;", "getRevenueSupport", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRevenueVendorRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RevenueVendorRepositoryImpl.kt\ncom/kakao/tistory/data/revenue/repository/RevenueVendorRepositoryImpl\n+ 2 BaseRepository.kt\ncom/kakao/tistory/data/repository/BaseRepository\n+ 3 BaseRepository.kt\ncom/kakao/tistory/data/repository/BaseRepository$checkError$2\n*L\n1#1,80:1\n26#2,27:81\n53#2:109\n26#2,27:110\n53#2:138\n35#2:139\n26#2,27:140\n53#2:168\n35#2:169\n39#3:108\n39#3:137\n39#3:167\n*S KotlinDebug\n*F\n+ 1 RevenueVendorRepositoryImpl.kt\ncom/kakao/tistory/data/revenue/repository/RevenueVendorRepositoryImpl\n*L\n19#1:81,27\n19#1:109\n25#1:110,27\n25#1:138\n25#1:139\n76#1:140,27\n76#1:168\n76#1:169\n19#1:108\n25#1:137\n76#1:167\n*E\n"})
public final class RevenueVendorRepositoryImpl extends BaseRepository implements RevenueVendorRepository {
    public final RevenueService a;

    @Inject
    public RevenueVendorRepositoryImpl(@NotNull RevenueService revenueService0) {
        Intrinsics.checkNotNullParameter(revenueService0, "revenueService");
        super();
        this.a = revenueService0;
    }

    @Override  // com.kakao.tistory.domain.revenue.repository.RevenueVendorRepository
    @Nullable
    public Object getRevenueCurrent(@NotNull String s, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        a a0;
        if(continuation0 instanceof a) {
            a0 = (a)continuation0;
            int v = a0.d;
            if((v & 0x80000000) == 0) {
                a0 = new a(this, continuation0);
            }
            else {
                a0.d = v ^ 0x80000000;
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
                    object0 = this.a.getRevenue(s, a0);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    a0.a = baseRepository0;
                    a0.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, a0) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
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
                    goto label_47;
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
                goto label_52;
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
            return new Success(((RevenueResponse)((ItemModel)object0).getData()).getItems());
        }
        catch(CancellationException cancellationException0) {
            a0.a = baseRepository0;
            a0.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, a0) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        a0.a = baseRepository0;
        a0.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, a0);
        if(object0 == object1) {
            return object1;
        }
    label_52:
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

    @Override  // com.kakao.tistory.domain.revenue.repository.RevenueVendorRepository
    @NotNull
    public Flow getRevenueGraph(@NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull String s3) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        Intrinsics.checkNotNullParameter(s1, "vendor");
        Intrinsics.checkNotNullParameter(s2, "granularity");
        Intrinsics.checkNotNullParameter(s3, "endDate");
        return FlowKt.flow(new c(s3, this, s, s1, s2, null));
    }

    @Override  // com.kakao.tistory.domain.revenue.repository.RevenueVendorRepository
    @NotNull
    public Flow getRevenueGraphDetailInfo(@NotNull String s, @NotNull String s1, @NotNull String s2, @Nullable String s3, @Nullable String s4) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        Intrinsics.checkNotNullParameter(s1, "vendor");
        Intrinsics.checkNotNullParameter(s2, "granularity");
        return FlowKt.flow(new d(this, s, s1, s2, s3, s4, null));
    }

    @Override  // com.kakao.tistory.domain.revenue.repository.RevenueVendorRepository
    @NotNull
    public Flow getRevenueSummary(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        Intrinsics.checkNotNullParameter(s1, "vendor");
        return FlowKt.flow(new e(this, s, s1, null));
    }

    @Override  // com.kakao.tistory.domain.revenue.repository.RevenueVendorRepository
    @Nullable
    public Object getRevenueSupport(@NotNull String s, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        f f0;
        if(continuation0 instanceof f) {
            f0 = (f)continuation0;
            int v = f0.d;
            if((v & 0x80000000) == 0) {
                f0 = new f(this, continuation0);
            }
            else {
                f0.d = v ^ 0x80000000;
            }
        }
        else {
            f0 = new f(this, continuation0);
        }
        Object object0 = f0.b;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(f0.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    f0.a = this;
                    f0.d = 1;
                    object0 = this.a.getRevenueSupport(s, f0);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    f0.a = baseRepository0;
                    f0.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, f0) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
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
                baseRepository0 = (BaseRepository)f0.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    f0.a = baseRepository0;
                    f0.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, f0) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)f0.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository0 = (BaseRepository)f0.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)f0.a;
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
            f0.a = baseRepository0;
            f0.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, f0) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        f0.a = baseRepository0;
        f0.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, f0);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            f0.a = (ErrorModel)object0;
            f0.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), f0) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            f0.a = (ErrorModel)object0;
            f0.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), f0) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.revenue.repository.RevenueVendorRepository
    @Nullable
    public Object getRevenueVendorList(@NotNull String s, @NotNull Continuation continuation0) {
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
                    object0 = this.a.getRevenueVendorList(s, g0);
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
            return new Success(((ItemModel)object0).getData());
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
}

