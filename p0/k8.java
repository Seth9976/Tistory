package p0;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.DragInteraction.Cancel;
import androidx.compose.foundation.interaction.DragInteraction.Start;
import androidx.compose.foundation.interaction.DragInteraction.Stop;
import androidx.compose.material.DragGestureDetectorCopyKt;
import androidx.compose.material.SliderKt;
import androidx.compose.material3.e9;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref.BooleanRef;
import kotlin.jvm.internal.Ref.FloatRef;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class k8 extends RestrictedSuspendLambda implements Function2 {
    public final State A;
    public final State B;
    public final State C;
    public Object p;
    public Start q;
    public FloatRef r;
    public BooleanRef s;
    public int t;
    public Object u;
    public final boolean v;
    public final float w;
    public final e9 x;
    public final State y;
    public final CoroutineScope z;

    public k8(boolean z, float f, e9 e90, State state0, CoroutineScope coroutineScope0, State state1, State state2, State state3, Continuation continuation0) {
        this.v = z;
        this.w = f;
        this.x = e90;
        this.y = state0;
        this.z = coroutineScope0;
        this.A = state1;
        this.B = state2;
        this.C = state3;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new k8(this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, continuation0);
        continuation1.u = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((k8)this.create(((AwaitPointerEventScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Start dragInteraction$Start2;
        Cancel dragInteraction$Cancel0;
        Object object4;
        boolean z2;
        BooleanRef ref$BooleanRef1;
        Start dragInteraction$Start1;
        FloatRef ref$FloatRef1;
        AwaitPointerEventScope awaitPointerEventScope3;
        Object object3;
        boolean z1;
        PointerInputChange pointerInputChange0;
        AwaitPointerEventScope awaitPointerEventScope1;
        Object object2;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        int v = this.t;
        e9 e90 = this.x;
        State state0 = this.y;
        State state1 = (State)e90.d;
        State state2 = (State)e90.c;
        boolean z = this.v;
        switch(v) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                AwaitPointerEventScope awaitPointerEventScope0 = (AwaitPointerEventScope)this.u;
                this.u = awaitPointerEventScope0;
                this.t = 1;
                object2 = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope0, false, null, this, 2, null);
                if(object2 == object1) {
                    return object1;
                }
                awaitPointerEventScope1 = awaitPointerEventScope0;
                goto label_22;
            }
            case 1: {
                AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope)this.u;
                ResultKt.throwOnFailure(object0);
                awaitPointerEventScope1 = awaitPointerEventScope2;
                object2 = object0;
            label_22:
                pointerInputChange0 = (PointerInputChange)object2;
                Start dragInteraction$Start0 = new Start();
                FloatRef ref$FloatRef0 = new FloatRef();
                long v1 = pointerInputChange0.getPosition-F1C5BW0();
                float f = z ? this.w - Offset.getX-impl(v1) : Offset.getX-impl(v1);
                ref$FloatRef0.element = f;
                int v2 = Float.compare(Math.abs(((Number)state2.getValue()).floatValue() - f), Math.abs(((Number)state1.getValue()).floatValue() - f));
                BooleanRef ref$BooleanRef0 = new BooleanRef();
                if(v2 == 0) {
                    z1 = ((Number)state0.getValue()).floatValue() > ref$FloatRef0.element;
                }
                else if(v2 < 0) {
                    z1 = true;
                }
                else {
                    z1 = false;
                }
                ref$BooleanRef0.element = z1;
                this.u = awaitPointerEventScope1;
                this.p = pointerInputChange0;
                this.q = dragInteraction$Start0;
                this.r = ref$FloatRef0;
                this.s = ref$BooleanRef0;
                this.t = 2;
                object3 = SliderKt.access$awaitSlop-8vUncbI(awaitPointerEventScope1, pointerInputChange0.getId-J3iCeTQ(), pointerInputChange0.getType-T8wyACA(), this);
                if(object3 == object1) {
                    return object1;
                }
                awaitPointerEventScope3 = awaitPointerEventScope1;
                ref$FloatRef1 = ref$FloatRef0;
                dragInteraction$Start1 = dragInteraction$Start0;
                ref$BooleanRef1 = ref$BooleanRef0;
                goto label_59;
            }
            case 2: {
                ref$BooleanRef1 = this.s;
                ref$FloatRef1 = this.r;
                dragInteraction$Start1 = this.q;
                pointerInputChange0 = (PointerInputChange)this.p;
                awaitPointerEventScope3 = (AwaitPointerEventScope)this.u;
                ResultKt.throwOnFailure(object0);
                object3 = object0;
            label_59:
                if(((Pair)object3) != null) {
                    float f1 = DragGestureDetectorCopyKt.pointerSlop-E8SPZFQ(awaitPointerEventScope3.getViewConfiguration(), pointerInputChange0.getType-T8wyACA());
                    if(Math.abs(((Number)this.B.getValue()).floatValue() - ref$FloatRef1.element) < f1 && Math.abs(((Number)state0.getValue()).floatValue() - ref$FloatRef1.element) < f1) {
                        float f2 = ((Number)((Pair)object3).getSecond()).floatValue();
                        if(!z) {
                            z2 = f2 < 0.0f;
                        }
                        else if(f2 >= 0.0f) {
                            z2 = true;
                        }
                        else {
                            z2 = false;
                        }
                        ref$BooleanRef1.element = z2;
                        ref$FloatRef1.element = Offset.getX-impl(PointerEventKt.positionChange(((PointerInputChange)((Pair)object3).getFirst()))) + ref$FloatRef1.element;
                    }
                }
                boolean z3 = ref$BooleanRef1.element;
                float f3 = ref$FloatRef1.element;
                ((Function2)((State)e90.f).getValue()).invoke(Boolean.valueOf(z3), ((float)(f3 - ((Number)(z3 ? state2.getValue() : state1.getValue())).floatValue())));
                v6 v60 = new v6(e90, z3, dragInteraction$Start1, null);
                BuildersKt.launch$default(this.z, null, null, v60, 3, null);
                try {
                    j8 j80 = new j8(this.C, ref$BooleanRef1, z);
                    this.u = dragInteraction$Start1;
                    this.p = ref$BooleanRef1;
                    this.q = null;
                    this.r = null;
                    this.s = null;
                    this.t = 3;
                    object4 = DragGestureDetectorKt.horizontalDrag-jO51t88(awaitPointerEventScope3, pointerInputChange0.getId-J3iCeTQ(), j80, this);
                    if(object4 == object1) {
                        return object1;
                    }
                    dragInteraction$Cancel0 = ((Boolean)object4).booleanValue() ? new Stop(dragInteraction$Start1) : new Cancel(dragInteraction$Start1);
                    goto label_99;
                }
                catch(CancellationException unused_ex) {
                    dragInteraction$Start2 = dragInteraction$Start1;
                    goto label_98;
                }
            }
            case 3: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ref$BooleanRef1 = (BooleanRef)this.p;
        dragInteraction$Start2 = (Start)this.u;
        try {
            ResultKt.throwOnFailure(object0);
            dragInteraction$Start1 = dragInteraction$Start2;
            object4 = object0;
        }
        catch(CancellationException unused_ex) {
            goto label_98;
        }
        try {
            dragInteraction$Cancel0 = ((Boolean)object4).booleanValue() ? new Stop(dragInteraction$Start1) : new Cancel(dragInteraction$Start1);
            goto label_99;
        }
        catch(CancellationException unused_ex) {
            dragInteraction$Start2 = dragInteraction$Start1;
        }
    label_98:
        dragInteraction$Cancel0 = new Cancel(dragInteraction$Start2);
    label_99:
        ((Function1)this.A.getValue()).invoke(Boxing.boxBoolean(ref$BooleanRef1.element));
        i8 i80 = new i8(e90, ref$BooleanRef1, dragInteraction$Cancel0, null);
        BuildersKt.launch$default(this.z, null, null, i80, 3, null);
        return Unit.INSTANCE;
    }
}

