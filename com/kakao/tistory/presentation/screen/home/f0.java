package com.kakao.tistory.presentation.screen.home;

import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.presentation.common.utils.CrashlyticsUtils;
import com.kakao.tistory.presentation.screen.home.contract.HomeIntent.UpdateCategory;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotMapperKt;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.Category;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class f0 extends SuspendLambda implements Function2 {
    public int a;
    public final HomeViewModel b;
    public final String c;
    public final List d;
    public final j0 e;

    public f0(HomeViewModel homeViewModel0, String s, List list0, j0 j00, Continuation continuation0) {
        this.b = homeViewModel0;
        this.c = s;
        this.d = list0;
        this.e = j00;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new f0(this.b, this.c, this.d, this.e, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((f0)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Category homeSlotUiState$Category0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.a = 1;
                object0 = this.b.h.invoke(this.c, this);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        List list0 = this.d;
        HomeViewModel homeViewModel0 = this.b;
        j0 j00 = this.e;
        if(((Result)object0) instanceof Success) {
            Success result$Success0 = (Success)(((Result)object0));
            try {
                homeSlotUiState$Category0 = HomeSlotMapperKt.toUiState(((com.kakao.tistory.domain.home.entity.HomeSlot.Category)result$Success0.getData()), new c0(homeViewModel0), new d0(homeViewModel0), new e0(homeViewModel0), list0);
            }
            catch(Exception exception0) {
                CrashlyticsUtils.INSTANCE.logException(exception0);
                homeSlotUiState$Category0 = null;
            }
            if(homeSlotUiState$Category0 != null) {
                homeViewModel0.sendIntent(new UpdateCategory(homeSlotUiState$Category0));
                return Unit.INSTANCE;
            }
            j00.invoke(new ErrorModel());
            return Unit.INSTANCE;
        }
        if(((Result)object0) instanceof Fail) {
            j00.invoke(((Fail)(((Result)object0))).getErrorModel());
        }
        return Unit.INSTANCE;
    }
}

