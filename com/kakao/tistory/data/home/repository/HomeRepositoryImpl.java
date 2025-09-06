package com.kakao.tistory.data.home.repository;

import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.data.home.api.HomeService;
import com.kakao.tistory.data.preference.HomePreference;
import com.kakao.tistory.data.repository.BaseRepository;
import com.kakao.tistory.domain.ErrorStatusKt;
import com.kakao.tistory.domain.entity.common.ItemModel;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.home.repository.HomeRepository;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001C\u0010\f\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000B0\n0\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u001E\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u00100\t2\u0006\u0010\u000F\u001A\u00020\u000EH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u000F\u001A\u00020\u000EH\u0096@¢\u0006\u0004\b\u0014\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/kakao/tistory/data/home/repository/HomeRepositoryImpl;", "Lcom/kakao/tistory/data/repository/BaseRepository;", "Lcom/kakao/tistory/domain/home/repository/HomeRepository;", "Lcom/kakao/tistory/data/home/api/HomeService;", "homeService", "Lcom/kakao/tistory/data/preference/HomePreference;", "homePreference", "<init>", "(Lcom/kakao/tistory/data/home/api/HomeService;Lcom/kakao/tistory/data/preference/HomePreference;)V", "Lcom/kakao/tistory/domain/entity/common/Result;", "", "Lcom/kakao/tistory/domain/home/entity/HomeSlot;", "getHomeSlotList", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "categoryGroupId", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Category;", "getCategorySlotList", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "setCategoryPreference", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nHomeRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeRepositoryImpl.kt\ncom/kakao/tistory/data/home/repository/HomeRepositoryImpl\n+ 2 BaseRepository.kt\ncom/kakao/tistory/data/repository/BaseRepository\n+ 3 BaseRepository.kt\ncom/kakao/tistory/data/repository/BaseRepository$checkError$2\n*L\n1#1,32:1\n26#2,27:33\n53#2:61\n26#2,27:62\n53#2:90\n35#2:91\n39#3:60\n39#3:89\n*S KotlinDebug\n*F\n+ 1 HomeRepositoryImpl.kt\ncom/kakao/tistory/data/home/repository/HomeRepositoryImpl\n*L\n18#1:33,27\n18#1:61\n24#1:62,27\n24#1:90\n24#1:91\n18#1:60\n24#1:89\n*E\n"})
public final class HomeRepositoryImpl extends BaseRepository implements HomeRepository {
    public final HomeService a;
    public final HomePreference b;

    @Inject
    public HomeRepositoryImpl(@NotNull HomeService homeService0, @NotNull HomePreference homePreference0) {
        Intrinsics.checkNotNullParameter(homeService0, "homeService");
        Intrinsics.checkNotNullParameter(homePreference0, "homePreference");
        super();
        this.a = homeService0;
        this.b = homePreference0;
    }

    @Override  // com.kakao.tistory.domain.home.repository.HomeRepository
    @Nullable
    public Object getCategorySlotList(@NotNull String s, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        String s1;
        a a0;
        if(continuation0 instanceof a) {
            a0 = (a)continuation0;
            int v = a0.e;
            if((v & 0x80000000) == 0) {
                a0 = new a(this, continuation0);
            }
            else {
                a0.e = v ^ 0x80000000;
            }
        }
        else {
            a0 = new a(this, continuation0);
        }
        Object object0 = a0.c;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(a0.e) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                a0.a = this;
                a0.b = s;
                a0.e = 1;
                if(this.b.setCategory(s, a0) == object1) {
                    return object1;
                }
                s1 = s;
                baseRepository0 = this;
                goto label_33;
            }
            case 1: {
                String s2 = a0.b;
                HomeRepositoryImpl homeRepositoryImpl0 = (HomeRepositoryImpl)a0.a;
                ResultKt.throwOnFailure(object0);
                s1 = s2;
                baseRepository0 = homeRepositoryImpl0;
                try {
                label_33:
                    HomeService homeService0 = ((HomeRepositoryImpl)baseRepository0).a;
                    a0.a = baseRepository0;
                    a0.b = null;
                    a0.e = 2;
                    object0 = homeService0.getCategorySlotList(s1, a0);
                    return object0 == object1 ? object1 : new Success(((ItemModel)object0).getData());
                }
                catch(CancellationException cancellationException0) {
                    a0.a = baseRepository0;
                    a0.b = null;
                    a0.e = 3;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, a0) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_51;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)a0.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    return new Success(((ItemModel)object0).getData());
                }
                catch(CancellationException cancellationException0) {
                    a0.a = baseRepository0;
                    a0.b = null;
                    a0.e = 3;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, a0) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                label_51:
                    a0.a = baseRepository0;
                    a0.b = null;
                    a0.e = 4;
                    object0 = baseRepository0.createErrorModel(throwable0, a0);
                    if(object0 == object1) {
                        return object1;
                    }
                    goto label_59;
                }
            }
            case 3: {
                baseRepository0 = (BaseRepository)a0.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 4: {
                break;
            }
            case 5: 
            case 6: {
                ErrorModel errorModel0 = (ErrorModel)a0.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(errorModel0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        baseRepository0 = (BaseRepository)a0.a;
        ResultKt.throwOnFailure(object0);
    label_59:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            a0.a = (ErrorModel)object0;
            a0.e = 5;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), a0) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            a0.a = (ErrorModel)object0;
            a0.e = 6;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), a0) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.home.repository.HomeRepository
    @Nullable
    public Object getHomeSlotList(@NotNull Continuation continuation0) {
        BaseRepository baseRepository1;
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
                Flow flow0 = this.b.getCategory();
                b0.a = this;
                b0.d = 1;
                object0 = FlowKt.firstOrNull(flow0, b0);
                if(object0 == object1) {
                    return object1;
                }
                baseRepository1 = this;
                goto label_30;
            }
            case 1: {
                baseRepository1 = (HomeRepositoryImpl)b0.a;
                ResultKt.throwOnFailure(object0);
            label_30:
                String s = (String)object0;
                try {
                    HomeService homeService0 = ((HomeRepositoryImpl)baseRepository1).a;
                    b0.a = baseRepository1;
                    b0.d = 2;
                    object0 = homeService0.getHomeSlotList(s, b0);
                    return object0 == object1 ? object1 : new Success(((ItemModel)object0).getData());
                }
                catch(CancellationException cancellationException0) {
                    b0.a = baseRepository1;
                    b0.d = 3;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, b0) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                baseRepository1 = (BaseRepository)b0.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    return new Success(((ItemModel)object0).getData());
                }
                catch(CancellationException cancellationException0) {
                    b0.a = baseRepository1;
                    b0.d = 3;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, b0) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                label_47:
                    b0.a = baseRepository1;
                    b0.d = 4;
                    object0 = baseRepository1.createErrorModel(throwable0, b0);
                    if(object0 == object1) {
                        return object1;
                    }
                    goto label_54;
                }
            }
            case 3: {
                BaseRepository baseRepository0 = (BaseRepository)b0.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 4: {
                break;
            }
            case 5: 
            case 6: {
                ErrorModel errorModel0 = (ErrorModel)b0.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(errorModel0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        baseRepository1 = (BaseRepository)b0.a;
        ResultKt.throwOnFailure(object0);
    label_54:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            b0.a = (ErrorModel)object0;
            b0.d = 5;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), b0) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            b0.a = (ErrorModel)object0;
            b0.d = 6;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), b0) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.home.repository.HomeRepository
    @Nullable
    public Object setCategoryPreference(@NotNull String s, @NotNull Continuation continuation0) {
        Object object0 = this.b.setCategory(s, continuation0);
        return object0 == qd.a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }
}

