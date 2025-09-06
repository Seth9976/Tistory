package z;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.platform.k1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref.FloatRef;
import qd.a;

public final class a1 extends RestrictedSuspendLambda implements Function2 {
    public FloatRef p;
    public int q;
    public Object r;
    public final Function1 s;
    public final Function2 t;
    public final Function0 u;
    public final Function0 v;

    public a1(Continuation continuation0, Function0 function00, Function0 function01, Function1 function10, Function2 function20) {
        this.s = function10;
        this.t = function20;
        this.u = function00;
        this.v = function01;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new a1(continuation0, this.u, this.v, this.s, this.t);
        continuation1.r = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((a1)this.create(((AwaitPointerEventScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        FloatRef ref$FloatRef1;
        AwaitPointerEventScope awaitPointerEventScope2;
        AwaitPointerEventScope awaitPointerEventScope1;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                AwaitPointerEventScope awaitPointerEventScope0 = (AwaitPointerEventScope)this.r;
                this.r = awaitPointerEventScope0;
                this.q = 1;
                Object object2 = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope0, false, null, this, 2, null);
                if(object2 == object1) {
                    return object1;
                }
                awaitPointerEventScope1 = awaitPointerEventScope0;
                object0 = object2;
                goto label_15;
            }
            case 1: {
                awaitPointerEventScope1 = (AwaitPointerEventScope)this.r;
                ResultKt.throwOnFailure(object0);
            label_15:
                FloatRef ref$FloatRef0 = new FloatRef();
                z0 z00 = new z0(ref$FloatRef0);
                this.r = awaitPointerEventScope1;
                this.p = ref$FloatRef0;
                this.q = 2;
                object0 = DragGestureDetectorKt.awaitVerticalPointerSlopOrCancellation-gDDlDlE(awaitPointerEventScope1, ((PointerInputChange)object0).getId-J3iCeTQ(), ((PointerInputChange)object0).getType-T8wyACA(), z00, this);
                if(object0 == object1) {
                    return object1;
                }
                awaitPointerEventScope2 = awaitPointerEventScope1;
                ref$FloatRef1 = ref$FloatRef0;
                goto label_29;
            }
            case 2: {
                ref$FloatRef1 = this.p;
                awaitPointerEventScope2 = (AwaitPointerEventScope)this.r;
                ResultKt.throwOnFailure(object0);
            label_29:
                if(((PointerInputChange)object0) != null) {
                    Offset offset0 = Offset.box-impl(((PointerInputChange)object0).getPosition-F1C5BW0());
                    this.s.invoke(offset0);
                    this.t.invoke(((PointerInputChange)object0), Boxing.boxFloat(ref$FloatRef1.element));
                    k1 k10 = new k1(this.t, 7);
                    this.r = null;
                    this.p = null;
                    this.q = 3;
                    object0 = DragGestureDetectorKt.verticalDrag-jO51t88(awaitPointerEventScope2, ((PointerInputChange)object0).getId-J3iCeTQ(), k10, this);
                    if(object0 == object1) {
                        return object1;
                    }
                    goto label_41;
                }
                break;
            }
            case 3: {
                ResultKt.throwOnFailure(object0);
            label_41:
                if(((Boolean)object0).booleanValue()) {
                    this.u.invoke();
                    return Unit.INSTANCE;
                }
                this.v.invoke();
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return Unit.INSTANCE;
    }
}

