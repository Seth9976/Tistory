package z;

import androidx.compose.foundation.gestures.PressGestureScopeImpl;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class l3 extends RestrictedSuspendLambda implements Function2 {
    public int p;
    public Object q;
    public final CoroutineScope r;
    public final Function1 s;
    public final Function1 t;
    public final ObjectRef u;
    public final PressGestureScopeImpl v;

    public l3(CoroutineScope coroutineScope0, Function1 function10, Function1 function11, ObjectRef ref$ObjectRef0, PressGestureScopeImpl pressGestureScopeImpl0, Continuation continuation0) {
        this.r = coroutineScope0;
        this.s = function10;
        this.t = function11;
        this.u = ref$ObjectRef0;
        this.v = pressGestureScopeImpl0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new l3(this.r, this.s, this.t, this.u, this.v, continuation0);
        continuation1.q = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((l3)this.create(((AwaitPointerEventScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.p = 1;
                object0 = TapGestureDetectorKt.waitForUpOrCancellation$default(((AwaitPointerEventScope)this.q), null, this, 1, null);
                if(object0 == object1) {
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
        PressGestureScopeImpl pressGestureScopeImpl0 = this.v;
        if(((PointerInputChange)object0) != null) {
            ((PointerInputChange)object0).consume();
            j3 j30 = new j3(pressGestureScopeImpl0, null);
            BuildersKt.launch$default(this.r, null, null, j30, 3, null);
            Offset offset0 = Offset.box-impl(((PointerInputChange)object0).getPosition-F1C5BW0());
            this.s.invoke(offset0);
            return Unit.INSTANCE;
        }
        k3 k30 = new k3(pressGestureScopeImpl0, null);
        BuildersKt.launch$default(this.r, null, null, k30, 3, null);
        Function1 function10 = this.t;
        if(function10 != null) {
            function10.invoke(Offset.box-impl(((PointerInputChange)this.u.element).getPosition-F1C5BW0()));
            return Unit.INSTANCE;
        }
        return null;
    }
}

