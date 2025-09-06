package com.kakao.tistory.presentation.viewmodel;

import com.kakao.sdk.auth.model.OAuthToken;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import qd.a;

public final class k2 extends SuspendLambda implements Function2 {
    public int a;
    public final KakaoLoginViewModel b;
    public final OAuthToken c;
    public final String d;

    public k2(KakaoLoginViewModel kakaoLoginViewModel0, OAuthToken oAuthToken0, String s, Continuation continuation0) {
        this.b = kakaoLoginViewModel0;
        this.c = oAuthToken0;
        this.d = s;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new k2(this.b, this.c, this.d, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((k2)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.a = 1;
                object0 = this.b.h.invoke(this.c.getAccessToken(), this);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            case 2: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        j2 j20 = new j2(this.b, this.c, this.d);
        this.a = 2;
        return ((Flow)object0).collect(j20, this) == object1 ? object1 : Unit.INSTANCE;
    }
}

