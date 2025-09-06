package com.kakao.tistory.presentation.screen.home;

import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.screen.home.contract.HomeEvent.ShowToast;
import com.kakao.tistory.presentation.screen.home.contract.HomeIntent.FollowFail;
import com.kakao.tistory.presentation.screen.home.contract.HomeIntent.OnClickUnFollow;
import com.kakao.tistory.presentation.screen.home.contract.HomeIntent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class h0 extends SuspendLambda implements Function2 {
    public int a;
    public final HomeViewModel b;
    public final HomeIntent c;

    public h0(HomeViewModel homeViewModel0, HomeIntent homeIntent0, Continuation continuation0) {
        this.b = homeViewModel0;
        this.c = homeIntent0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new h0(this.b, this.c, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new h0(this.b, this.c, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                String s = ((OnClickUnFollow)this.c).getBlogName();
                this.a = 1;
                object0 = this.b.k.invoke(s, this);
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
        HomeIntent homeIntent0 = this.c;
        if(((Result)object0) instanceof Success) {
            homeViewModel0.sendEvent(new ShowToast(null, Boxing.boxInt(string.blog_unfollow_toast), 1, null));
            return Unit.INSTANCE;
        }
        if(((Result)object0) instanceof Fail) {
            homeViewModel0.sendIntent(new FollowFail(((OnClickUnFollow)homeIntent0).getBlogName(), false));
        }
        return Unit.INSTANCE;
    }
}

