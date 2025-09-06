package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.presentation.common.Logger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class a5 extends SuspendLambda implements Function2 {
    public int a;
    public final String b;
    public final SignUpViewModel c;
    public final Function0 d;

    public a5(String s, SignUpViewModel signUpViewModel0, Function0 function00, Continuation continuation0) {
        this.b = s;
        this.c = signUpViewModel0;
        this.d = function00;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new a5(this.b, this.c, this.d, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((a5)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Logger.INSTANCE.log("checkFcmToken() addOnSuccessListener " + this.b);
                Intrinsics.checkNotNullExpressionValue(this.b, "$it");
                this.a = 1;
                if(this.c.o.invoke(this.b, this) == object1) {
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
        this.d.invoke();
        return Unit.INSTANCE;
    }
}

