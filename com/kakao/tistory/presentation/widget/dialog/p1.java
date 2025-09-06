package com.kakao.tistory.presentation.widget.dialog;

import com.kakao.android.base.tiara.TiaraUtils;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class p1 extends SuspendLambda implements Function2 {
    public p1(Continuation continuation0) {
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new p1(continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new p1(((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        WelcomeDialogKt.WelcomeDialog.9.1 welcomeDialogKt$WelcomeDialog$9$10 = new WelcomeDialogKt.WelcomeDialog.9.1();
        TiaraUtils.trackPage$default(TiaraUtils.INSTANCE, welcomeDialogKt$WelcomeDialog$9$10, null, null, null, 14, null);
        return Unit.INSTANCE;
    }
}

