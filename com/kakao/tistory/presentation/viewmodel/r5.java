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

public final class r5 extends SuspendLambda implements Function2 {
    public SignUpViewModel a;
    public String b;
    public int c;
    public final SignUpViewModel d;
    public final String e;

    public r5(SignUpViewModel signUpViewModel0, String s, Continuation continuation0) {
        this.d = signUpViewModel0;
        this.e = s;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new r5(this.d, this.e, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new r5(this.d, this.e, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        SignUpViewModel signUpViewModel1;
        Object object2;
        String s;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.c) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.d.isShowProgress().postValue(Boxing.boxBoolean(true));
                OAuthToken oAuthToken0 = this.d.getToken();
                if(oAuthToken0 != null) {
                    SignUpViewModel signUpViewModel0 = this.d;
                    s = this.e;
                    Date date0 = oAuthToken0.getRefreshTokenExpiresAt();
                    if(date0 != null) {
                        long v = oAuthToken0.getAccessTokenExpiresAt().getTime();
                        long v1 = date0.getTime();
                        this.a = signUpViewModel0;
                        this.b = s;
                        this.c = 1;
                        object2 = signUpViewModel0.n.invoke(oAuthToken0.getAccessToken(), v, oAuthToken0.getRefreshToken(), v1, oAuthToken0.getScopes(), this);
                        if(object2 == object1) {
                            return object1;
                        }
                        signUpViewModel1 = signUpViewModel0;
                        goto label_28;
                    }
                }
                break;
            }
            case 1: {
                String s1 = this.b;
                signUpViewModel1 = this.a;
                ResultKt.throwOnFailure(object0);
                s = s1;
                object2 = object0;
            label_28:
                q5 q50 = new q5(signUpViewModel1, s);
                this.a = null;
                this.b = null;
                this.c = 2;
                if(((Flow)object2).collect(q50, this) == object1) {
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

