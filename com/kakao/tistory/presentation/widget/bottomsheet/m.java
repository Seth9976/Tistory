package com.kakao.tistory.presentation.widget.bottomsheet;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import qd.a;

public final class m extends SuspendLambda implements Function2 {
    public int a;
    public Object b;
    public final Function0 c;

    public m(Function0 function00, Continuation continuation0) {
        this.c = function00;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new m(this.c, continuation0);
        continuation1.b = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        m m0 = new m(this.c, ((Continuation)object1));
        m0.b = (PointerInputScope)object0;
        return m0.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                PointerInputScope pointerInputScope0 = (PointerInputScope)this.b;
                l l0 = new l(this.c);
                this.a = 1;
                return TapGestureDetectorKt.detectTapGestures$default(pointerInputScope0, null, null, null, l0, this, 7, null) == object1 ? object1 : Unit.INSTANCE;
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

