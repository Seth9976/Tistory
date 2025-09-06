package k0;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.text.handwriting.StylusHandwritingNode;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import qd.a;

public final class e extends RestrictedSuspendLambda implements Function2 {
    public PointerInputChange p;
    public PointerEventPass q;
    public int r;
    public Object s;
    public final StylusHandwritingNode t;

    public e(StylusHandwritingNode stylusHandwritingNode0, Continuation continuation0) {
        this.t = stylusHandwritingNode0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new e(this.t, continuation0);
        continuation1.s = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((e)this.create(((AwaitPointerEventScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object6;
        Object object5;
        AwaitPointerEventScope awaitPointerEventScope3;
        PointerInputChange pointerInputChange3;
        AwaitPointerEventScope awaitPointerEventScope2;
        Object object4;
        PointerInputChange pointerInputChange0;
        PointerEventPass pointerEventPass0;
        AwaitPointerEventScope awaitPointerEventScope1;
        Object object2;
        AwaitPointerEventScope awaitPointerEventScope0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        boolean z = true;
        StylusHandwritingNode stylusHandwritingNode0 = this.t;
    alab1:
        switch(this.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                awaitPointerEventScope0 = (AwaitPointerEventScope)this.s;
                this.s = awaitPointerEventScope0;
                this.r = 1;
                object2 = TapGestureDetectorKt.awaitFirstDown(awaitPointerEventScope0, true, PointerEventPass.Initial, this);
                if(object2 == object1) {
                    return object1;
                }
                goto label_15;
            }
            case 1: {
                awaitPointerEventScope0 = (AwaitPointerEventScope)this.s;
                ResultKt.throwOnFailure(object0);
                object2 = object0;
            label_15:
                if(!PointerType.equals-impl0(((PointerInputChange)object2).getType-T8wyACA(), 3) && !PointerType.equals-impl0(((PointerInputChange)object2).getType-T8wyACA(), 4)) {
                    return Unit.INSTANCE;
                }
                if(Offset.getX-impl(((PointerInputChange)object2).getPosition-F1C5BW0()) < 0.0f || Offset.getX-impl(((PointerInputChange)object2).getPosition-F1C5BW0()) >= ((float)IntSize.getWidth-impl(awaitPointerEventScope0.getSize-YbymL2g())) || Offset.getY-impl(((PointerInputChange)object2).getPosition-F1C5BW0()) < 0.0f || Offset.getY-impl(((PointerInputChange)object2).getPosition-F1C5BW0()) >= ((float)IntSize.getHeight-impl(awaitPointerEventScope0.getSize-YbymL2g()))) {
                    z = false;
                }
                awaitPointerEventScope1 = awaitPointerEventScope0;
                pointerEventPass0 = stylusHandwritingNode0.q || z ? PointerEventPass.Initial : PointerEventPass.Main;
                pointerInputChange0 = (PointerInputChange)object2;
                goto label_57;
            }
            case 2: {
                pointerEventPass0 = this.q;
                pointerInputChange0 = this.p;
                awaitPointerEventScope1 = (AwaitPointerEventScope)this.s;
                ResultKt.throwOnFailure(object0);
                Object object3 = object0;
                while(true) {
                    List list0 = ((PointerEvent)object3).getChanges();
                    int v = list0.size();
                    int v1 = 0;
                    while(true) {
                        if(v1 >= v) {
                            awaitPointerEventScope2 = awaitPointerEventScope1;
                            object4 = null;
                            break;
                        }
                        object4 = list0.get(v1);
                        PointerInputChange pointerInputChange1 = (PointerInputChange)object4;
                        if(pointerInputChange1.isConsumed()) {
                            awaitPointerEventScope2 = awaitPointerEventScope1;
                        }
                        else {
                            awaitPointerEventScope2 = awaitPointerEventScope1;
                            if(PointerId.equals-impl0(pointerInputChange1.getId-J3iCeTQ(), pointerInputChange0.getId-J3iCeTQ()) && pointerInputChange1.getPressed()) {
                                break;
                            }
                        }
                        ++v1;
                        awaitPointerEventScope1 = awaitPointerEventScope2;
                    }
                    PointerInputChange pointerInputChange2 = (PointerInputChange)object4;
                    if(pointerInputChange2 == null || pointerInputChange2.getUptimeMillis() - pointerInputChange0.getUptimeMillis() >= awaitPointerEventScope2.getViewConfiguration().getLongPressTimeoutMillis()) {
                        pointerInputChange2 = null;
                        goto label_50;
                    }
                    else if(Offset.getDistance-impl(Offset.minus-MK-Hz9U(pointerInputChange2.getPosition-F1C5BW0(), pointerInputChange0.getPosition-F1C5BW0())) > awaitPointerEventScope2.getViewConfiguration().getHandwritingSlop()) {
                    label_50:
                        if(pointerInputChange2 != null && ((Boolean)stylusHandwritingNode0.getOnHandwritingSlopExceeded().invoke()).booleanValue()) {
                            pointerInputChange2.consume();
                            pointerInputChange3 = pointerInputChange0;
                            awaitPointerEventScope3 = awaitPointerEventScope2;
                            goto label_82;
                        }
                        return Unit.INSTANCE;
                    }
                    else {
                        awaitPointerEventScope1 = awaitPointerEventScope2;
                    label_57:
                        this.s = awaitPointerEventScope1;
                        this.p = pointerInputChange0;
                        this.q = pointerEventPass0;
                        this.r = 2;
                        object3 = awaitPointerEventScope1.awaitPointerEvent(pointerEventPass0, this);
                        if(object3 != object1) {
                            continue;
                        }
                        break;
                    }
                    break alab1;
                }
                return object1;
            }
            case 3: {
                pointerInputChange3 = this.p;
                awaitPointerEventScope3 = (AwaitPointerEventScope)this.s;
                ResultKt.throwOnFailure(object0);
                object5 = object0;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        do {
            List list1 = ((PointerEvent)object5).getChanges();
            int v2 = list1.size();
            int v3 = 0;
            while(true) {
                object6 = null;
                if(v3 < v2) {
                    object6 = list1.get(v3);
                    PointerInputChange pointerInputChange4 = (PointerInputChange)object6;
                    if(pointerInputChange4.isConsumed() || !PointerId.equals-impl0(pointerInputChange4.getId-J3iCeTQ(), pointerInputChange3.getId-J3iCeTQ()) || !pointerInputChange4.getPressed()) {
                        ++v3;
                        continue;
                    }
                }
                break;
            }
            if(((PointerInputChange)object6) == null) {
                return Unit.INSTANCE;
            }
            ((PointerInputChange)object6).consume();
        label_82:
            this.s = awaitPointerEventScope3;
            this.p = pointerInputChange3;
            this.q = null;
            this.r = 3;
            object5 = awaitPointerEventScope3.awaitPointerEvent(PointerEventPass.Initial, this);
        }
        while(object5 != object1);
        return object1;
    }
}

