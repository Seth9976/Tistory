package com.kakao.tistory.presentation.view.login;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import qd.a;

public final class b0 extends SuspendLambda implements Function2 {
    public int a;
    public Object b;
    public final FocusManager c;

    public b0(FocusManager focusManager0, Continuation continuation0) {
        this.c = focusManager0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new b0(this.c, continuation0);
        continuation1.b = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        b0 b00 = new b0(this.c, ((Continuation)object1));
        b00.b = (PointerInputScope)object0;
        return b00.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                PointerInputScope pointerInputScope0 = (PointerInputScope)this.b;
                a0 a00 = new a0(this.c);
                this.a = 1;
                return TapGestureDetectorKt.detectTapGestures$default(pointerInputScope0, null, null, null, a00, this, 7, null) == object1 ? object1 : Unit.INSTANCE;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

