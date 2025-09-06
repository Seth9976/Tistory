package com.kakao.tistory.presentation.view.editor;

import androidx.compose.ui.platform.SoftwareKeyboardController;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class d5 extends SuspendLambda implements Function2 {
    public final String a;
    public final SoftwareKeyboardController b;

    public d5(String s, SoftwareKeyboardController softwareKeyboardController0, Continuation continuation0) {
        this.a = s;
        this.b = softwareKeyboardController0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new d5(this.a, this.b, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new d5(this.a, this.b, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        if(this.a != null) {
            SoftwareKeyboardController softwareKeyboardController0 = this.b;
            if(softwareKeyboardController0 != null) {
                softwareKeyboardController0.show();
            }
        }
        return Unit.INSTANCE;
    }
}

