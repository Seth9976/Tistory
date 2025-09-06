package z;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.platform.k1;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import qd.a;

public final class w0 extends RestrictedSuspendLambda implements Function2 {
    public int p;
    public Object q;
    public final Function1 r;
    public final Function0 s;
    public final Function0 t;
    public final Function2 u;

    public w0(Continuation continuation0, Function0 function00, Function0 function01, Function1 function10, Function2 function20) {
        this.r = function10;
        this.s = function00;
        this.t = function01;
        this.u = function20;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new w0(continuation0, this.s, this.t, this.r, this.u);
        continuation1.q = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((w0)this.create(((AwaitPointerEventScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        AwaitPointerEventScope awaitPointerEventScope1;
        AwaitPointerEventScope awaitPointerEventScope0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        Function0 function00 = this.t;
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                awaitPointerEventScope0 = (AwaitPointerEventScope)this.q;
                try {
                    this.q = awaitPointerEventScope0;
                    this.p = 1;
                    object0 = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope0, false, null, this, 2, null);
                    if(object0 == object1) {
                        return object1;
                    }
                    goto label_13;
                }
                catch(CancellationException cancellationException0) {
                    break;
                }
            }
            case 1: {
                awaitPointerEventScope0 = (AwaitPointerEventScope)this.q;
                try {
                    ResultKt.throwOnFailure(object0);
                label_13:
                    this.q = awaitPointerEventScope0;
                    this.p = 2;
                    object0 = DragGestureDetectorKt.awaitLongPressOrCancellation-rnUCldI(awaitPointerEventScope0, ((PointerInputChange)object0).getId-J3iCeTQ(), this);
                    if(object0 == object1) {
                        return object1;
                    }
                    goto label_20;
                }
                catch(CancellationException cancellationException0) {
                    break;
                }
            }
            case 2: {
                awaitPointerEventScope0 = (AwaitPointerEventScope)this.q;
                try {
                    ResultKt.throwOnFailure(object0);
                label_20:
                    if(((PointerInputChange)object0) != null) {
                        Offset offset0 = Offset.box-impl(((PointerInputChange)object0).getPosition-F1C5BW0());
                        this.r.invoke(offset0);
                        k1 k10 = new k1(this.u, 5);
                        this.q = awaitPointerEventScope0;
                        this.p = 3;
                        object0 = DragGestureDetectorKt.drag-jO51t88(awaitPointerEventScope0, ((PointerInputChange)object0).getId-J3iCeTQ(), k10, this);
                        if(object0 == object1) {
                            return object1;
                        }
                        awaitPointerEventScope1 = awaitPointerEventScope0;
                        goto label_33;
                    }
                    return Unit.INSTANCE;
                }
                catch(CancellationException cancellationException0) {
                    break;
                }
            }
            case 3: {
                awaitPointerEventScope1 = (AwaitPointerEventScope)this.q;
                try {
                    ResultKt.throwOnFailure(object0);
                label_33:
                    if(((Boolean)object0).booleanValue()) {
                        List list0 = awaitPointerEventScope1.getCurrentEvent().getChanges();
                        int v = list0.size();
                        for(int v1 = 0; v1 < v; ++v1) {
                            PointerInputChange pointerInputChange0 = (PointerInputChange)list0.get(v1);
                            if(PointerEventKt.changedToUp(pointerInputChange0)) {
                                pointerInputChange0.consume();
                            }
                        }
                        this.s.invoke();
                        return Unit.INSTANCE;
                    }
                    function00.invoke();
                    return Unit.INSTANCE;
                }
                catch(CancellationException cancellationException0) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        function00.invoke();
        throw cancellationException0;
    }
}

