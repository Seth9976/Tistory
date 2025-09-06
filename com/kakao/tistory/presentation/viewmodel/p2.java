package com.kakao.tistory.presentation.viewmodel;

import com.kakao.sdk.auth.model.OAuthToken;
import java.util.Date;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import qd.a;

public final class p2 extends SuspendLambda implements Function2 {
    public KakaoLoginViewModel a;
    public OAuthToken b;
    public int c;
    public final KakaoLoginViewModel d;
    public final OAuthToken e;

    public p2(KakaoLoginViewModel kakaoLoginViewModel0, OAuthToken oAuthToken0, Continuation continuation0) {
        this.d = kakaoLoginViewModel0;
        this.e = oAuthToken0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new p2(this.d, this.e, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new p2(this.d, this.e, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        OAuthToken oAuthToken1;
        KakaoLoginViewModel kakaoLoginViewModel1;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.c) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.d.isShowProgress().postValue(Boxing.boxBoolean(true));
                Date date0 = this.e.getRefreshTokenExpiresAt();
                if(date0 != null) {
                    KakaoLoginViewModel kakaoLoginViewModel0 = this.d;
                    OAuthToken oAuthToken0 = this.e;
                    long v = oAuthToken0.getAccessTokenExpiresAt().getTime();
                    long v1 = date0.getTime();
                    this.a = kakaoLoginViewModel0;
                    this.b = oAuthToken0;
                    this.c = 1;
                    object0 = kakaoLoginViewModel0.g.invoke(oAuthToken0.getAccessToken(), v, oAuthToken0.getRefreshToken(), v1, oAuthToken0.getScopes(), this);
                    if(object0 == object1) {
                        return object1;
                    }
                    kakaoLoginViewModel1 = kakaoLoginViewModel0;
                    oAuthToken1 = oAuthToken0;
                    goto label_25;
                }
                break;
            }
            case 1: {
                oAuthToken1 = this.b;
                kakaoLoginViewModel1 = this.a;
                ResultKt.throwOnFailure(object0);
            label_25:
                o2 o20 = new o2(kakaoLoginViewModel1, oAuthToken1);
                this.a = null;
                this.b = null;
                this.c = 2;
                if(((Flow)object0).collect(o20, this) == object1) {
                    return object1;
                }
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
        return Unit.INSTANCE;
    }
}

