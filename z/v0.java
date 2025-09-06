package z;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import java.io.Serializable;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref.LongRef;
import qd.a;

public final class v0 extends RestrictedSuspendLambda implements Function2 {
    public final Orientation A;
    public final Function2 B;
    public final Function2 C;
    public final Function0 D;
    public final Function1 E;
    public Object p;
    public Serializable q;
    public AwaitPointerEventScope r;
    public LongRef s;
    public p3 t;
    public PointerInputChange u;
    public boolean v;
    public float w;
    public int x;
    public Object y;
    public final Function0 z;

    public v0(Function0 function00, Orientation orientation0, Function2 function20, Function2 function21, Function0 function01, Function1 function10, Continuation continuation0) {
        this.z = function00;
        this.A = orientation0;
        this.B = function20;
        this.C = function21;
        this.D = function01;
        this.E = function10;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new v0(this.z, this.A, this.B, this.C, this.D, this.E, continuation0);
        continuation1.y = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((v0)this.create(((AwaitPointerEventScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        float f4;
        Object object10;
        PointerInputChange pointerInputChange5;
        Function2 function21;
        Object object9;
        Object object7;
        PointerEvent pointerEvent1;
        Object object6;
        Object object2;
        Orientation orientation2;
        AwaitPointerEventScope awaitPointerEventScope1;
        Function2 function20;
        AwaitPointerEventScope awaitPointerEventScope0;
        LongRef ref$LongRef0;
        PointerInputChange pointerInputChange2;
        AwaitPointerEventScope awaitPointerEventScope4;
        LongRef ref$LongRef3;
        float f1;
        p3 p31;
        LongRef ref$LongRef2;
        AwaitPointerEventScope awaitPointerEventScope2;
        PointerInputChange pointerInputChange0;
        float f3;
        AwaitPointerEventScope awaitPointerEventScope7;
        Object object3;
        LongRef ref$LongRef5;
        Object object4;
        boolean z1;
        PointerInputChange pointerInputChange4;
        Object object5;
        AwaitPointerEventScope awaitPointerEventScope8;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        Orientation orientation0 = this.A;
        int v = 0;
        switch(this.x) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                awaitPointerEventScope8 = (AwaitPointerEventScope)this.y;
                this.y = awaitPointerEventScope8;
                this.x = 1;
                object5 = TapGestureDetectorKt.awaitFirstDown(awaitPointerEventScope8, false, PointerEventPass.Initial, this);
                if(object5 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                awaitPointerEventScope8 = (AwaitPointerEventScope)this.y;
                ResultKt.throwOnFailure(object0);
                object5 = object0;
                break;
            }
            case 2: {
                boolean z = this.v;
                pointerInputChange4 = (PointerInputChange)this.p;
                awaitPointerEventScope7 = (AwaitPointerEventScope)this.y;
                ResultKt.throwOnFailure(object0);
                z1 = z;
                object4 = object0;
                goto label_76;
            }
            case 3: {
                float f2 = this.w;
                p3 p32 = this.t;
                LongRef ref$LongRef4 = this.s;
                AwaitPointerEventScope awaitPointerEventScope5 = this.r;
                ref$LongRef5 = (LongRef)this.q;
                PointerInputChange pointerInputChange3 = (PointerInputChange)this.p;
                AwaitPointerEventScope awaitPointerEventScope6 = (AwaitPointerEventScope)this.y;
                ResultKt.throwOnFailure(object0);
                object3 = object0;
                ref$LongRef3 = ref$LongRef4;
                awaitPointerEventScope7 = awaitPointerEventScope5;
                awaitPointerEventScope4 = awaitPointerEventScope6;
                p31 = p32;
                f3 = f2;
                pointerInputChange2 = pointerInputChange3;
                goto label_105;
            }
            case 4: {
                float f = this.w;
                pointerInputChange0 = this.u;
                p3 p30 = this.t;
                LongRef ref$LongRef1 = this.s;
                awaitPointerEventScope2 = this.r;
                ref$LongRef2 = (LongRef)this.q;
                PointerInputChange pointerInputChange1 = (PointerInputChange)this.p;
                AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope)this.y;
                ResultKt.throwOnFailure(object0);
                p31 = p30;
                f1 = f;
                ref$LongRef3 = ref$LongRef1;
                awaitPointerEventScope4 = awaitPointerEventScope3;
                pointerInputChange2 = pointerInputChange1;
                goto label_161;
            }
            case 5: {
                ref$LongRef0 = this.s;
                awaitPointerEventScope0 = this.r;
                Orientation orientation1 = (Orientation)this.q;
                function20 = (Function2)this.p;
                awaitPointerEventScope1 = (AwaitPointerEventScope)this.y;
                ResultKt.throwOnFailure(object0);
                orientation2 = orientation1;
                object2 = object0;
                goto label_203;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        boolean z2 = ((Boolean)this.z.invoke()).booleanValue();
        if(!z2) {
            ((PointerInputChange)object5).consume();
        }
        this.y = awaitPointerEventScope8;
        this.p = (PointerInputChange)object5;
        this.v = z2;
        this.x = 2;
        z1 = z2;
        object4 = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope8, false, null, this, 2, null);
        if(object4 == object1) {
            return object1;
        }
        awaitPointerEventScope7 = awaitPointerEventScope8;
        pointerInputChange4 = (PointerInputChange)object5;
    label_76:
        pointerInputChange2 = (PointerInputChange)object4;
        LongRef ref$LongRef6 = new LongRef();
        ref$LongRef6.element = 0L;
        long v1 = 0L;
        if(z1) {
            while(true) {
                long v2 = pointerInputChange2.getId-J3iCeTQ();
                int v3 = pointerInputChange2.getType-T8wyACA();
                if(DragGestureDetectorKt.a(awaitPointerEventScope7.getCurrentEvent(), v2)) {
                    pointerInputChange4 = null;
                }
                else {
                    f3 = DragGestureDetectorKt.pointerSlop-E8SPZFQ(awaitPointerEventScope7.getViewConfiguration(), v3);
                    LongRef ref$LongRef7 = new LongRef();
                    ref$LongRef7.element = v2;
                    p31 = new p3(orientation0);
                    ref$LongRef3 = ref$LongRef7;
                    ref$LongRef5 = ref$LongRef6;
                    awaitPointerEventScope4 = awaitPointerEventScope7;
                    while(true) {
                        this.y = awaitPointerEventScope4;
                        this.p = pointerInputChange2;
                        this.q = ref$LongRef5;
                        this.r = awaitPointerEventScope7;
                        this.s = ref$LongRef3;
                        this.t = p31;
                        this.u = null;
                        this.w = f3;
                        this.x = 3;
                        object3 = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope7, null, this, 1, null);
                        if(object3 == object1) {
                            return object1;
                        }
                    label_105:
                        PointerEvent pointerEvent0 = (PointerEvent)object3;
                        List list0 = pointerEvent0.getChanges();
                        int v4 = list0.size();
                        while(true) {
                            if(v < v4) {
                                object6 = list0.get(v);
                                pointerEvent1 = pointerEvent0;
                                if(PointerId.equals-impl0(((PointerInputChange)object6).getId-J3iCeTQ(), ref$LongRef3.element)) {
                                    break;
                                }
                                else {
                                    ++v;
                                    pointerEvent0 = pointerEvent1;
                                    continue;
                                }
                            }
                            pointerEvent1 = pointerEvent0;
                            object6 = null;
                            break;
                        }
                        if(((PointerInputChange)object6) == null || ((PointerInputChange)object6).isConsumed()) {
                            awaitPointerEventScope7 = awaitPointerEventScope4;
                            ref$LongRef6 = ref$LongRef5;
                            pointerInputChange4 = null;
                            break;
                        }
                        if(PointerEventKt.changedToUpIgnoreConsumed(((PointerInputChange)object6))) {
                            List list1 = pointerEvent1.getChanges();
                            int v5 = list1.size();
                            int v6 = 0;
                            while(true) {
                                object7 = null;
                                if(v6 < v5) {
                                    Object object8 = list1.get(v6);
                                    if(((PointerInputChange)object8).getPressed()) {
                                        object7 = object8;
                                    }
                                    else {
                                        ++v6;
                                        continue;
                                    }
                                }
                                break;
                            }
                            if(((PointerInputChange)object7) == null) {
                                awaitPointerEventScope7 = awaitPointerEventScope4;
                                ref$LongRef6 = ref$LongRef5;
                                pointerInputChange4 = null;
                                break;
                            }
                            else {
                                ref$LongRef3.element = ((PointerInputChange)object7).getId-J3iCeTQ();
                                goto label_169;
                            }
                            goto label_135;
                        }
                        else {
                        label_135:
                            Offset offset0 = p31.a(((PointerInputChange)object6), f3);
                            if(offset0 == null) {
                            label_146:
                                this.y = awaitPointerEventScope4;
                                this.p = pointerInputChange2;
                                this.q = ref$LongRef5;
                                this.r = awaitPointerEventScope7;
                                this.s = ref$LongRef3;
                                this.t = p31;
                                this.u = (PointerInputChange)object6;
                                this.w = f3;
                                this.x = 4;
                                if(awaitPointerEventScope7.awaitPointerEvent(PointerEventPass.Final, this) == object1) {
                                    return object1;
                                }
                                f1 = f3;
                                pointerInputChange0 = (PointerInputChange)object6;
                                ref$LongRef2 = ref$LongRef5;
                                awaitPointerEventScope2 = awaitPointerEventScope7;
                            label_161:
                                if(pointerInputChange0.isConsumed()) {
                                    awaitPointerEventScope7 = awaitPointerEventScope4;
                                    ref$LongRef6 = ref$LongRef2;
                                    pointerInputChange4 = null;
                                    break;
                                }
                                else {
                                    f3 = f1;
                                    awaitPointerEventScope7 = awaitPointerEventScope2;
                                    ref$LongRef5 = ref$LongRef2;
                                }
                            }
                            else {
                                ((PointerInputChange)object6).consume();
                                ref$LongRef5.element = offset0.unbox-impl();
                                if(((PointerInputChange)object6).isConsumed()) {
                                    awaitPointerEventScope7 = awaitPointerEventScope4;
                                    ref$LongRef6 = ref$LongRef5;
                                    pointerInputChange4 = (PointerInputChange)object6;
                                    break;
                                }
                                else {
                                    p31.b();
                                    goto label_169;
                                }
                                goto label_146;
                            }
                        }
                    label_169:
                        v = 0;
                    }
                }
                if(pointerInputChange4 == null || pointerInputChange4.isConsumed()) {
                    break;
                }
                v = 0;
            }
            v1 = ref$LongRef6.element;
        }
        if(pointerInputChange4 != null) {
            Offset offset1 = Offset.box-impl(v1);
            this.B.invoke(pointerInputChange4, offset1);
            Offset offset2 = Offset.box-impl(ref$LongRef6.element);
            function20 = this.C;
            function20.invoke(pointerInputChange4, offset2);
            long v7 = pointerInputChange4.getId-J3iCeTQ();
            if(!DragGestureDetectorKt.a(awaitPointerEventScope7.getCurrentEvent(), v7)) {
                orientation2 = orientation0;
                while(true) {
                    LongRef ref$LongRef8 = new LongRef();
                    ref$LongRef8.element = v7;
                    awaitPointerEventScope0 = awaitPointerEventScope7;
                    ref$LongRef0 = ref$LongRef8;
                    awaitPointerEventScope1 = awaitPointerEventScope0;
                    while(true) {
                        this.y = awaitPointerEventScope1;
                        this.p = function20;
                        this.q = orientation2;
                        this.r = awaitPointerEventScope0;
                        this.s = ref$LongRef0;
                        this.t = null;
                        this.u = null;
                        this.x = 5;
                        object2 = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope0, null, this, 1, null);
                        if(object2 == object1) {
                            return object1;
                        }
                    label_203:
                        List list2 = ((PointerEvent)object2).getChanges();
                        int v8 = list2.size();
                        int v9 = 0;
                        while(true) {
                            if(v9 < v8) {
                                object9 = list2.get(v9);
                                function21 = function20;
                                if(PointerId.equals-impl0(((PointerInputChange)object9).getId-J3iCeTQ(), ref$LongRef0.element)) {
                                    break;
                                }
                                else {
                                    ++v9;
                                    function20 = function21;
                                    continue;
                                }
                            }
                            function21 = function20;
                            object9 = null;
                            break;
                        }
                        pointerInputChange5 = (PointerInputChange)object9;
                        if(pointerInputChange5 == null) {
                            pointerInputChange5 = null;
                            break;
                        }
                        else {
                            if(PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange5)) {
                                List list3 = ((PointerEvent)object2).getChanges();
                                int v10 = list3.size();
                                int v11 = 0;
                                while(true) {
                                    object10 = null;
                                    if(v11 < v10) {
                                        Object object11 = list3.get(v11);
                                        if(((PointerInputChange)object11).getPressed()) {
                                            object10 = object11;
                                        }
                                        else {
                                            ++v11;
                                            continue;
                                        }
                                    }
                                    break;
                                }
                                if(((PointerInputChange)object10) == null) {
                                    break;
                                }
                                else {
                                    ref$LongRef0.element = ((PointerInputChange)object10).getId-J3iCeTQ();
                                    goto label_242;
                                }
                                goto label_236;
                            }
                            else {
                            label_236:
                                long v12 = PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange5);
                                if(orientation2 == null) {
                                    f4 = Offset.getDistance-impl(v12);
                                }
                                else {
                                    f4 = orientation2 == Orientation.Vertical ? Offset.getY-impl(v12) : Offset.getX-impl(v12);
                                }
                                if(f4 == 0.0f) {
                                    goto label_242;
                                }
                                break;
                            }
                        label_242:
                            function20 = function21;
                            continue;
                        }
                        goto label_255;
                    }
                    if(pointerInputChange5 == null || pointerInputChange5.isConsumed()) {
                        break;
                    }
                    else if(!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange5)) {
                        function20 = function21;
                        function20.invoke(pointerInputChange5, Offset.box-impl(PointerEventKt.positionChange(pointerInputChange5)));
                        pointerInputChange5.consume();
                        v7 = pointerInputChange5.getId-J3iCeTQ();
                        awaitPointerEventScope7 = awaitPointerEventScope1;
                        continue;
                    }
                    goto label_255;
                }
            }
            pointerInputChange5 = null;
        label_255:
            if(pointerInputChange5 == null) {
                this.D.invoke();
                return Unit.INSTANCE;
            }
            this.E.invoke(pointerInputChange5);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}

