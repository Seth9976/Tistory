package androidx.compose.foundation.gestures;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import qd.a;

public final class r extends SuspendLambda implements Function2 {
    public ObjectRef o;
    public ObjectRef p;
    public int q;
    public Object r;
    public final DragGestureNode s;

    public r(DragGestureNode dragGestureNode0, Continuation continuation0) {
        this.s = dragGestureNode0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new r(this.s, continuation0);
        continuation1.r = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((r)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        CoroutineScope coroutineScope2;
        CoroutineScope coroutineScope1;
        ObjectRef ref$ObjectRef2;
        DragEvent dragEvent0;
        ObjectRef ref$ObjectRef1;
        ObjectRef ref$ObjectRef0;
        CoroutineScope coroutineScope0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        DragGestureNode dragGestureNode0 = this.s;
        switch(this.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                coroutineScope0 = (CoroutineScope)this.r;
                goto label_29;
            }
            case 1: {
                ref$ObjectRef0 = this.p;
                ref$ObjectRef1 = this.o;
                coroutineScope0 = (CoroutineScope)this.r;
                ResultKt.throwOnFailure(object0);
                dragEvent0 = (DragEvent)object0;
                goto label_45;
            }
            case 2: {
                ref$ObjectRef2 = this.o;
                coroutineScope1 = (CoroutineScope)this.r;
                ResultKt.throwOnFailure(object0);
                goto label_56;
            }
            case 3: {
                ref$ObjectRef2 = this.o;
                coroutineScope1 = (CoroutineScope)this.r;
                try {
                    ResultKt.throwOnFailure(object0);
                    goto label_65;
                }
                catch(CancellationException unused_ex) {
                    coroutineScope2 = coroutineScope1;
                    goto label_81;
                }
            }
            case 4: {
                coroutineScope2 = (CoroutineScope)this.r;
                goto label_24;
            }
            case 5: {
                coroutineScope2 = (CoroutineScope)this.r;
                try {
                label_24:
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException unused_ex) {
                    goto label_81;
                }
            }
            case 6: {
                coroutineScope2 = (CoroutineScope)this.r;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    alab1:
        while(true) {
            coroutineScope0 = coroutineScope2;
            while(true) {
            label_29:
                if(!CoroutineScopeKt.isActive(coroutineScope0)) {
                    return Unit.INSTANCE;
                }
                ref$ObjectRef0 = new ObjectRef();
                Channel channel0 = dragGestureNode0.t;
                if(channel0 == null) {
                    ref$ObjectRef1 = ref$ObjectRef0;
                    dragEvent0 = null;
                }
                else {
                    this.r = coroutineScope0;
                    this.o = ref$ObjectRef0;
                    this.p = ref$ObjectRef0;
                    this.q = 1;
                    object0 = channel0.receive(this);
                    if(object0 == object1) {
                        return object1;
                    }
                    ref$ObjectRef1 = ref$ObjectRef0;
                    dragEvent0 = (DragEvent)object0;
                }
            label_45:
                ref$ObjectRef0.element = dragEvent0;
                Object object2 = ref$ObjectRef1.element;
                if(!(object2 instanceof DragStarted)) {
                    continue;
                }
                this.r = coroutineScope0;
                this.o = ref$ObjectRef1;
                this.p = null;
                this.q = 2;
                if(DragGestureNode.access$processDragStart(dragGestureNode0, ((DragStarted)object2), this) == object1) {
                    return object1;
                }
                ref$ObjectRef2 = ref$ObjectRef1;
                coroutineScope1 = coroutineScope0;
                try {
                label_56:
                    q q0 = new q(ref$ObjectRef2, dragGestureNode0, null);
                    this.r = coroutineScope1;
                    this.o = ref$ObjectRef2;
                    this.q = 3;
                    if(dragGestureNode0.drag(q0, this) == object1) {
                        return object1;
                    }
                    goto label_65;
                }
                catch(CancellationException unused_ex) {
                    coroutineScope2 = coroutineScope1;
                    goto label_81;
                }
                return object1;
                try {
                label_65:
                    coroutineScope0 = coroutineScope1;
                    Object object3 = ref$ObjectRef2.element;
                    if(object3 instanceof DragStopped) {
                        Intrinsics.checkNotNull(object3, "null cannot be cast to non-null type androidx.compose.foundation.gestures.DragEvent.DragStopped");
                        this.r = coroutineScope0;
                        this.o = null;
                        this.q = 4;
                        if(DragGestureNode.access$processDragStop(dragGestureNode0, ((DragStopped)object3), this) != object1) {
                            continue;
                        }
                        return object1;
                    }
                    if(!(object3 instanceof DragCancelled)) {
                        continue;
                    }
                    this.r = coroutineScope0;
                    this.o = null;
                    this.q = 5;
                    if(DragGestureNode.access$processDragCancel(dragGestureNode0, this) != object1) {
                        continue;
                    }
                    return object1;
                label_80:
                    coroutineScope2 = coroutineScope0;
                }
                catch(CancellationException unused_ex) {
                    goto label_80;
                }
            label_81:
                this.r = coroutineScope2;
                this.o = null;
                this.q = 6;
                if(DragGestureNode.access$processDragCancel(dragGestureNode0, this) != object1) {
                    break;
                }
                break alab1;
            }
        }
        return object1;
    }
}

