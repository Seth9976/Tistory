package androidx.compose.material3;

import androidx.appcompat.app.w0;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.DragInteraction.Cancel;
import androidx.compose.foundation.interaction.DragInteraction.Start;
import androidx.compose.foundation.interaction.DragInteraction.Stop;
import androidx.compose.material3.internal.DragGestureDetectorCopyKt;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref.BooleanRef;
import kotlin.jvm.internal.Ref.FloatRef;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class ml extends RestrictedSuspendLambda implements Function2 {
    public Object p;
    public Start q;
    public FloatRef r;
    public BooleanRef s;
    public int t;
    public Object u;
    public final RangeSliderState v;
    public final w0 w;
    public final CoroutineScope x;

    public ml(RangeSliderState rangeSliderState0, w0 w00, CoroutineScope coroutineScope0, Continuation continuation0) {
        this.v = rangeSliderState0;
        this.w = w00;
        this.x = coroutineScope0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new ml(this.v, this.w, this.x, continuation0);
        continuation1.u = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((ml)this.create(((AwaitPointerEventScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Start dragInteraction$Start3;
        Cancel dragInteraction$Cancel0;
        Object object4;
        PointerInputChange pointerInputChange0;
        AwaitPointerEventScope awaitPointerEventScope3;
        BooleanRef ref$BooleanRef1;
        Start dragInteraction$Start1;
        Object object3;
        boolean z1;
        FloatRef ref$FloatRef0;
        AwaitPointerEventScope awaitPointerEventScope1;
        Object object2;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        int v = this.t;
        w0 w00 = this.w;
        RangeSliderState rangeSliderState0 = (RangeSliderState)w00.a;
        RangeSliderState rangeSliderState1 = this.v;
        boolean z = true;
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
                goto label_21;
            }
            case 1: {
                AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope)this.u;
                ResultKt.throwOnFailure(object0);
                awaitPointerEventScope1 = awaitPointerEventScope2;
                object2 = object0;
            label_21:
                Start dragInteraction$Start0 = new Start();
                ref$FloatRef0 = new FloatRef();
                float f = rangeSliderState1.isRtl$material3_release() ? ((float)rangeSliderState1.getTotalWidth$material3_release()) - Offset.getX-impl(((PointerInputChange)object2).getPosition-F1C5BW0()) : Offset.getX-impl(((PointerInputChange)object2).getPosition-F1C5BW0());
                ref$FloatRef0.element = f;
                int v1 = Float.compare(Math.abs(rangeSliderState0.getRawOffsetStart$material3_release() - f), Math.abs(rangeSliderState0.getRawOffsetEnd$material3_release() - f));
                BooleanRef ref$BooleanRef0 = new BooleanRef();
                if(v1 == 0) {
                    z1 = rangeSliderState1.getRawOffsetStart$material3_release() > ref$FloatRef0.element;
                }
                else if(v1 < 0) {
                    z1 = true;
                }
                else {
                    z1 = false;
                }
                ref$BooleanRef0.element = z1;
                this.u = awaitPointerEventScope1;
                this.p = (PointerInputChange)object2;
                this.q = dragInteraction$Start0;
                this.r = ref$FloatRef0;
                this.s = ref$BooleanRef0;
                this.t = 2;
                object3 = SliderKt.access$awaitSlop-8vUncbI(awaitPointerEventScope1, ((PointerInputChange)object2).getId-J3iCeTQ(), ((PointerInputChange)object2).getType-T8wyACA(), this);
                if(object3 == object1) {
                    return object1;
                }
                dragInteraction$Start1 = dragInteraction$Start0;
                ref$BooleanRef1 = ref$BooleanRef0;
                awaitPointerEventScope3 = awaitPointerEventScope1;
                pointerInputChange0 = (PointerInputChange)object2;
                goto label_59;
            }
            case 2: {
                ref$BooleanRef1 = this.s;
                ref$FloatRef0 = this.r;
                Start dragInteraction$Start2 = this.q;
                PointerInputChange pointerInputChange1 = (PointerInputChange)this.p;
                AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope)this.u;
                ResultKt.throwOnFailure(object0);
                awaitPointerEventScope3 = awaitPointerEventScope4;
                pointerInputChange0 = pointerInputChange1;
                dragInteraction$Start1 = dragInteraction$Start2;
                object3 = object0;
            label_59:
                if(((Pair)object3) != null) {
                    float f1 = DragGestureDetectorCopyKt.pointerSlop-E8SPZFQ(awaitPointerEventScope3.getViewConfiguration(), pointerInputChange0.getType-T8wyACA());
                    if(Math.abs(rangeSliderState1.getRawOffsetEnd$material3_release() - ref$FloatRef0.element) < f1 && Math.abs(rangeSliderState1.getRawOffsetStart$material3_release() - ref$FloatRef0.element) < f1) {
                        float f2 = ((Number)((Pair)object3).getSecond()).floatValue();
                        if(!rangeSliderState1.isRtl$material3_release()) {
                            if(f2 >= 0.0f) {
                                z = false;
                            }
                        }
                        else if(f2 < 0.0f) {
                            z = false;
                        }
                        ref$BooleanRef1.element = z;
                        ref$FloatRef0.element = Offset.getX-impl(PointerEventKt.positionChange(((PointerInputChange)((Pair)object3).getFirst()))) + ref$FloatRef0.element;
                    }
                }
                boolean z2 = ref$BooleanRef1.element;
                rangeSliderState0.onDrag$material3_release(z2, ref$FloatRef0.element - (z2 ? rangeSliderState0.getRawOffsetStart$material3_release() : rangeSliderState0.getRawOffsetEnd$material3_release()));
                gi gi0 = new gi(w00, z2, dragInteraction$Start1, null);
                BuildersKt.launch$default(this.x, null, null, gi0, 3, null);
                try {
                    ll ll0 = new ll(rangeSliderState1, ref$BooleanRef1);
                    this.u = dragInteraction$Start1;
                    this.p = ref$BooleanRef1;
                    this.q = null;
                    this.r = null;
                    this.s = null;
                    this.t = 3;
                    object4 = DragGestureDetectorKt.horizontalDrag-jO51t88(awaitPointerEventScope3, pointerInputChange0.getId-J3iCeTQ(), ll0, this);
                    if(object4 == object1) {
                        return object1;
                    }
                    dragInteraction$Cancel0 = ((Boolean)object4).booleanValue() ? new Stop(dragInteraction$Start1) : new Cancel(dragInteraction$Start1);
                    goto label_99;
                }
                catch(CancellationException unused_ex) {
                    dragInteraction$Start3 = dragInteraction$Start1;
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
        dragInteraction$Start3 = (Start)this.u;
        try {
            ResultKt.throwOnFailure(object0);
            dragInteraction$Start1 = dragInteraction$Start3;
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
            dragInteraction$Start3 = dragInteraction$Start1;
        }
    label_98:
        dragInteraction$Cancel0 = new Cancel(dragInteraction$Start3);
    label_99:
        rangeSliderState1.getGestureEndAction$material3_release().invoke(Boxing.boxBoolean(ref$BooleanRef1.element));
        kl kl0 = new kl(w00, ref$BooleanRef1, dragInteraction$Cancel0, null);
        BuildersKt.launch$default(this.x, null, null, kl0, 3, null);
        return Unit.INSTANCE;
    }
}

