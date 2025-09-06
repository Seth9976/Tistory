package z;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref.ObjectRef;
import qd.a;

public final class p0 extends RestrictedSuspendLambda implements Function2 {
    public PointerEvent p;
    public int q;
    public int r;
    public Object s;
    public final ObjectRef t;
    public final ObjectRef u;

    public p0(ObjectRef ref$ObjectRef0, ObjectRef ref$ObjectRef1, Continuation continuation0) {
        this.t = ref$ObjectRef0;
        this.u = ref$ObjectRef1;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new p0(this.t, this.u, continuation0);
        continuation1.s = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((p0)this.create(((AwaitPointerEventScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object6;
        Object object4;
        Object object3;
        AwaitPointerEventScope awaitPointerEventScope1;
        PointerEvent pointerEvent0;
        Object object2;
        int v;
        AwaitPointerEventScope awaitPointerEventScope0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                awaitPointerEventScope0 = (AwaitPointerEventScope)this.s;
                v = 0;
                goto label_63;
            }
            case 1: {
                v = this.q;
                awaitPointerEventScope0 = (AwaitPointerEventScope)this.s;
                ResultKt.throwOnFailure(object0);
                object2 = object0;
                goto label_71;
            }
            case 2: {
                v = this.q;
                pointerEvent0 = this.p;
                awaitPointerEventScope1 = (AwaitPointerEventScope)this.s;
                ResultKt.throwOnFailure(object0);
                object3 = object0;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            List list0 = ((PointerEvent)object3).getChanges();
            int v1 = list0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                if(((PointerInputChange)list0.get(v2)).isConsumed()) {
                    v = 1;
                    break;
                }
            }
            ObjectRef ref$ObjectRef0 = this.t;
            boolean z = DragGestureDetectorKt.a(pointerEvent0, ((PointerInputChange)ref$ObjectRef0.element).getId-J3iCeTQ());
            ObjectRef ref$ObjectRef1 = this.u;
            if(z) {
                List list1 = pointerEvent0.getChanges();
                int v3 = list1.size();
                int v4 = 0;
                while(true) {
                    object4 = null;
                    if(v4 < v3) {
                        Object object5 = list1.get(v4);
                        if(((PointerInputChange)object5).getPressed()) {
                            object4 = object5;
                        }
                        else {
                            ++v4;
                            continue;
                        }
                    }
                    break;
                }
                if(((PointerInputChange)object4) == null) {
                    v = 1;
                    awaitPointerEventScope0 = awaitPointerEventScope1;
                    goto label_63;
                }
                else {
                    ref$ObjectRef0.element = (PointerInputChange)object4;
                    ref$ObjectRef1.element = (PointerInputChange)object4;
                    goto label_62;
                }
                goto label_49;
            }
            else {
            label_49:
                List list2 = pointerEvent0.getChanges();
                int v5 = list2.size();
                int v6 = 0;
                while(true) {
                    object6 = null;
                    if(v6 < v5) {
                        Object object7 = list2.get(v6);
                        if(PointerId.equals-impl0(((PointerInputChange)object7).getId-J3iCeTQ(), ((PointerInputChange)ref$ObjectRef0.element).getId-J3iCeTQ())) {
                            object6 = object7;
                        }
                        else {
                            ++v6;
                            continue;
                        }
                    }
                    break;
                }
                ref$ObjectRef1.element = object6;
            }
        label_62:
            awaitPointerEventScope0 = awaitPointerEventScope1;
        label_63:
            if(v != 0) {
                break;
            }
            this.s = awaitPointerEventScope0;
            this.p = null;
            this.q = 0;
            this.r = 1;
            object2 = awaitPointerEventScope0.awaitPointerEvent(PointerEventPass.Main, this);
            if(object2 == object1) {
                return object1;
            }
        label_71:
            List list3 = ((PointerEvent)object2).getChanges();
            int v7 = list3.size();
            int v8 = 0;
            while(true) {
                if(v8 < v7) {
                    if(PointerEventKt.changedToUpIgnoreConsumed(((PointerInputChange)list3.get(v8)))) {
                        ++v8;
                        continue;
                    }
                    else {
                        break;
                    }
                }
                v = 1;
                break;
            }
            List list4 = ((PointerEvent)object2).getChanges();
            int v9 = list4.size();
            int v10 = 0;
            while(v10 < v9) {
                PointerInputChange pointerInputChange0 = (PointerInputChange)list4.get(v10);
                if(!pointerInputChange0.isConsumed() && !PointerEventKt.isOutOfBounds-jwHxaWs(pointerInputChange0, awaitPointerEventScope0.getSize-YbymL2g(), awaitPointerEventScope0.getExtendedTouchPadding-NH-jbRc())) {
                    ++v10;
                }
                else {
                    v = 1;
                    if(true) {
                        break;
                    }
                }
            }
            this.s = awaitPointerEventScope0;
            this.p = (PointerEvent)object2;
            this.q = v;
            this.r = 2;
            object3 = awaitPointerEventScope0.awaitPointerEvent(PointerEventPass.Final, this);
            if(object3 == object1) {
                return object1;
            }
            awaitPointerEventScope1 = awaitPointerEventScope0;
            pointerEvent0 = (PointerEvent)object2;
        }
        return Unit.INSTANCE;
    }
}

