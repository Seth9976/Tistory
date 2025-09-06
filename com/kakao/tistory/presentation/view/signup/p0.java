package com.kakao.tistory.presentation.view.signup;

import com.kakao.android.base.tiara.TiaraUtils;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class p0 extends SuspendLambda implements Function2 {
    public p0(Continuation continuation0) {
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new p0(continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new p0(((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        SignUpUsedEmailScreenKt.SignUpUsedEmailScreen.2.1 signUpUsedEmailScreenKt$SignUpUsedEmailScreen$2$10 = new SignUpUsedEmailScreenKt.SignUpUsedEmailScreen.2.1();
        TiaraUtils.trackPage$default(TiaraUtils.INSTANCE, signUpUsedEmailScreenKt$SignUpUsedEmailScreen$2$10, null, null, null, 14, null);
        return Unit.INSTANCE;
    }
}

