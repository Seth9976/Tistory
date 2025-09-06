package androidx.compose.foundation.gestures;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlinx.coroutines.channels.Channel;
import qd.a;

public final class q extends SuspendLambda implements Function2 {
    public ObjectRef o;
    public int p;
    public Object q;
    public final ObjectRef r;
    public final DragGestureNode s;

    public q(ObjectRef ref$ObjectRef0, DragGestureNode dragGestureNode0, Continuation continuation0) {
        this.r = ref$ObjectRef0;
        this.s = dragGestureNode0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new q(this.r, this.s, continuation0);
        continuation1.q = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((q)this.create(((Function1)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ObjectRef ref$ObjectRef0;
        Function1 function10;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                function10 = (Function1)this.q;
                goto label_11;
            }
            case 1: {
                ref$ObjectRef0 = this.o;
                function10 = (Function1)this.q;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    alab1:
        while(true) {
            DragEvent dragEvent0 = (DragEvent)object0;
            while(true) {
                ref$ObjectRef0.element = dragEvent0;
            label_11:
                dragEvent0 = null;
                ref$ObjectRef0 = this.r;
                Object object2 = ref$ObjectRef0.element;
                if(object2 instanceof DragStopped || object2 instanceof DragCancelled) {
                    break alab1;
                }
                DragDelta dragEvent$DragDelta0 = object2 instanceof DragDelta ? ((DragDelta)object2) : null;
                if(dragEvent$DragDelta0 != null) {
                    function10.invoke(dragEvent$DragDelta0);
                }
                Channel channel0 = this.s.t;
                if(channel0 == null) {
                    continue;
                }
                this.q = function10;
                this.o = ref$ObjectRef0;
                this.p = 1;
                object0 = channel0.receive(this);
                if(object0 != object1) {
                    break;
                }
                return object1;
            }
        }
        return Unit.INSTANCE;
    }
}

