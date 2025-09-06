package com.kakao.tistory.presentation.screen.home;

import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.presentation.screen.home.contract.HomeIntent.SlotListLoadingFail;
import com.kakao.tistory.presentation.screen.home.contract.HomeIntent.SlotListLoadingSuccess;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class a0 extends SuspendLambda implements Function2 {
    public int a;
    public final HomeViewModel b;

    public a0(HomeViewModel homeViewModel0, Continuation continuation0) {
        this.b = homeViewModel0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new a0(this.b, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new a0(this.b, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.a = 1;
                object0 = this.b.g.invoke(this);
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
        HomeViewModel homeViewModel0 = this.b;
        if(((Result)object0) instanceof Success) {
            homeViewModel0.sendIntent(new SlotListLoadingSuccess(HomeViewModel.access$slotListToUiState(homeViewModel0, ((List)((Success)(((Result)object0))).getData()))));
            return Unit.INSTANCE;
        }
        if(((Result)object0) instanceof Fail) {
            homeViewModel0.sendIntent(new SlotListLoadingFail(((Fail)(((Result)object0))).getErrorModel()));
        }
        return Unit.INSTANCE;
    }
}

