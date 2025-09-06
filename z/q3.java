package z;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.gestures.TransformGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import qd.a;

public final class q3 extends RestrictedSuspendLambda implements Function2 {
    public float p;
    public float q;
    public float r;
    public long s;
    public int t;
    public int u;
    public int v;
    public Object w;
    public final boolean x;
    public final Function4 y;

    public q3(boolean z, Function4 function40, Continuation continuation0) {
        this.x = z;
        this.y = function40;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new q3(this.x, this.y, continuation0);
        continuation1.w = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((q3)this.create(((AwaitPointerEventScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        float f8;
        int v6;
        int v5;
        Object object2;
        float f3;
        long v2;
        float f2;
        int v1;
        int v;
        float f1;
        AwaitPointerEventScope awaitPointerEventScope0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.v) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                awaitPointerEventScope0 = (AwaitPointerEventScope)this.w;
                float f = awaitPointerEventScope0.getViewConfiguration().getTouchSlop();
                this.w = awaitPointerEventScope0;
                this.p = 0.0f;
                this.q = 1.0f;
                this.s = 0L;
                this.t = 0;
                this.r = f;
                this.u = 0;
                this.v = 1;
                if(TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope0, false, null, this, 2, null) == object1) {
                    return object1;
                }
                f1 = 1.0f;
                v = 0;
                v1 = 0;
                f2 = f;
                v2 = 0L;
                f3 = 0.0f;
                goto label_103;
            }
            case 1: {
                v = this.u;
                f2 = this.r;
                v1 = this.t;
                v2 = this.s;
                f1 = this.q;
                f3 = this.p;
                awaitPointerEventScope0 = (AwaitPointerEventScope)this.w;
                ResultKt.throwOnFailure(object0);
                goto label_103;
            }
            case 2: {
                v = this.u;
                f2 = this.r;
                v1 = this.t;
                v2 = this.s;
                f1 = this.q;
                f3 = this.p;
                awaitPointerEventScope0 = (AwaitPointerEventScope)this.w;
                ResultKt.throwOnFailure(object0);
                object2 = object0;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    alab1:
        while(true) {
            List list0 = ((PointerEvent)object2).getChanges();
            int v3 = list0.size();
            int v4 = 0;
            while(true) {
                v5 = 0;
                if(v4 < v3) {
                    if(((PointerInputChange)list0.get(v4)).isConsumed()) {
                        v5 = 1;
                    }
                    else {
                        ++v4;
                        continue;
                    }
                }
                break;
            }
            if(v5 == 0) {
                float f4 = TransformGestureDetectorKt.calculateZoom(((PointerEvent)object2));
                float f5 = TransformGestureDetectorKt.calculateRotation(((PointerEvent)object2));
                v6 = 0;
                long v7 = TransformGestureDetectorKt.calculatePan(((PointerEvent)object2));
                if(v1 == 0) {
                    f1 *= f4;
                    f3 += f5;
                    v2 = Offset.plus-MK-Hz9U(v2, v7);
                    float f6 = TransformGestureDetectorKt.calculateCentroidSize(((PointerEvent)object2), false);
                    float f7 = Math.abs(3.141593f * f3 * f6 / 180.0f);
                    if(Math.abs(1.0f - f1) * f6 > f2 || f7 > f2 || Offset.getDistance-impl(v2) > f2) {
                        v = !this.x || f7 >= f2 ? 0 : 1;
                        v1 = 1;
                    }
                }
                if(v1 == 0) {
                    f8 = f3;
                }
                else {
                    long v8 = TransformGestureDetectorKt.calculateCentroid(((PointerEvent)object2), false);
                    if(v != 0) {
                        f5 = 0.0f;
                    }
                    if(f5 != 0.0f) {
                        f8 = f3;
                    label_78:
                        Offset offset0 = Offset.box-impl(v8);
                        Offset offset1 = Offset.box-impl(v7);
                        this.y.invoke(offset0, offset1, Boxing.boxFloat(f4), Boxing.boxFloat(f5));
                    }
                    else if(f4 == 1.0f) {
                        f8 = f3;
                        if(!Offset.equals-impl0(v7, 0L)) {
                            goto label_78;
                        }
                    }
                    else {
                        f8 = f3;
                        goto label_78;
                    }
                    List list1 = ((PointerEvent)object2).getChanges();
                    int v9 = list1.size();
                    for(int v10 = 0; v10 < v9; ++v10) {
                        PointerInputChange pointerInputChange0 = (PointerInputChange)list1.get(v10);
                        if(PointerEventKt.positionChanged(pointerInputChange0)) {
                            pointerInputChange0.consume();
                        }
                    }
                }
                f3 = f8;
            }
            else {
                v6 = v5;
            }
            if(v6 == 0) {
                List list2 = ((PointerEvent)object2).getChanges();
                int v11 = list2.size();
                int v12 = 0;
                while(true) {
                    if(v12 >= v11) {
                        return Unit.INSTANCE;
                    }
                    if(!((PointerInputChange)list2.get(v12)).getPressed()) {
                        ++v12;
                        continue;
                    }
                label_103:
                    this.w = awaitPointerEventScope0;
                    this.p = f3;
                    this.q = f1;
                    this.s = v2;
                    this.t = v1;
                    this.r = f2;
                    this.u = v;
                    this.v = 2;
                    object2 = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope0, null, this, 1, null);
                    if(object2 != object1) {
                        continue alab1;
                    }
                    break alab1;
                }
            }
            return Unit.INSTANCE;
        }
        return object1;
    }
}

