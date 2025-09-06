package com.kakao.tistory.presentation.view.editor;

import androidx.compose.ui.platform.SoftwareKeyboardController;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class d3 extends SuspendLambda implements Function2 {
    public final SoftwareKeyboardController a;

    public d3(SoftwareKeyboardController softwareKeyboardController0, Continuation continuation0) {
        this.a = softwareKeyboardController0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new d3(this.a, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new d3(this.a, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        SoftwareKeyboardController softwareKeyboardController0 = this.a;
        if(softwareKeyboardController0 != null) {
            softwareKeyboardController0.hide();
        }
        return Unit.INSTANCE;
    }
}

