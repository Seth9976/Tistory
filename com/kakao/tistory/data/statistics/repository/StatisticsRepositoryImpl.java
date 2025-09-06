package com.kakao.tistory.data.statistics.repository;

import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.data.repository.BaseRepository;
import com.kakao.tistory.data.statistics.service.BlogStatisticsService;
import com.kakao.tistory.domain.ErrorStatusKt;
import com.kakao.tistory.domain.entity.common.ItemModel;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.statistics.entity.TopEntryResponse;
import com.kakao.tistory.domain.statistics.repository.StatisticsRepository;
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

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J4\u0010\u000E\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000B2\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\u0007H\u0096@¢\u0006\u0004\b\u000E\u0010\u000FJ$\u0010\u0010\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000B2\u0006\u0010\b\u001A\u00020\u0007H\u0096@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/kakao/tistory/data/statistics/repository/StatisticsRepositoryImpl;", "Lcom/kakao/tistory/data/repository/BaseRepository;", "Lcom/kakao/tistory/domain/statistics/repository/StatisticsRepository;", "Lcom/kakao/tistory/data/statistics/service/BlogStatisticsService;", "blogStatisticsService", "<init>", "(Lcom/kakao/tistory/data/statistics/service/BlogStatisticsService;)V", "", "blogName", "date", "granularity", "Lcom/kakao/tistory/domain/entity/common/Result;", "", "Lcom/kakao/tistory/domain/statistics/entity/TopEntry;", "getTopEntriesByPeriod", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTopEntriesLastWeek", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nStatisticsRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatisticsRepositoryImpl.kt\ncom/kakao/tistory/data/statistics/repository/StatisticsRepositoryImpl\n+ 2 BaseRepository.kt\ncom/kakao/tistory/data/repository/BaseRepository\n+ 3 BaseRepository.kt\ncom/kakao/tistory/data/repository/BaseRepository$checkError$2\n*L\n1#1,21:1\n26#2,27:22\n53#2:50\n26#2,27:51\n53#2:79\n35#2:80\n39#3:49\n39#3:78\n*S KotlinDebug\n*F\n+ 1 StatisticsRepositoryImpl.kt\ncom/kakao/tistory/data/statistics/repository/StatisticsRepositoryImpl\n*L\n14#1:22,27\n14#1:50\n19#1:51,27\n19#1:79\n19#1:80\n14#1:49\n19#1:78\n*E\n"})
public final class StatisticsRepositoryImpl extends BaseRepository implements StatisticsRepository {
    public final BlogStatisticsService a;

    @Inject
    public StatisticsRepositoryImpl(@NotNull BlogStatisticsService blogStatisticsService0) {
        Intrinsics.checkNotNullParameter(blogStatisticsService0, "blogStatisticsService");
        super();
        this.a = blogStatisticsService0;
    }

    @Override  // com.kakao.tistory.domain.statistics.repository.StatisticsRepository
    @Nullable
    public Object getTopEntriesByPeriod(@NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull Continuation continuation0) {
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
                    object0 = this.a.getTopEntries(s, s1, s2, a0);
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
            return new Success(((TopEntryResponse)((ItemModel)object0).getData()).getItems());
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

    @Override  // com.kakao.tistory.domain.statistics.repository.StatisticsRepository
    @Nullable
    public Object getTopEntriesLastWeek(@NotNull String s, @NotNull Continuation continuation0) {
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
                    object0 = this.a.getTopEntries(s, b0);
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
            return new Success(((TopEntryResponse)((ItemModel)object0).getData()).getItems());
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
}

