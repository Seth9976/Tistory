package z;

import androidx.compose.foundation.gestures.TransformEvent.TransformDelta;
import androidx.compose.foundation.gestures.TransformEvent.TransformStopped;
import androidx.compose.foundation.gestures.TransformScope;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref.ObjectRef;
import qd.a;

public final class s3 extends SuspendLambda implements Function2 {
    public ObjectRef o;
    public int p;
    public Object q;
    public final ObjectRef r;
    public final x3 s;

    public s3(ObjectRef ref$ObjectRef0, x3 x30, Continuation continuation0) {
        this.r = ref$ObjectRef0;
        this.s = x30;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new s3(this.r, this.s, continuation0);
        continuation1.q = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((s3)this.create(((TransformScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ObjectRef ref$ObjectRef0;
        TransformScope transformScope0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                transformScope0 = (TransformScope)this.q;
                goto label_10;
            }
            case 1: {
                ref$ObjectRef0 = this.o;
                transformScope0 = (TransformScope)this.q;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            ref$ObjectRef0.element = object0;
        label_10:
            ref$ObjectRef0 = this.r;
            Object object2 = ref$ObjectRef0.element;
            if(object2 instanceof TransformEvent.TransformStopped) {
                break;
            }
            TransformEvent.TransformDelta transformEvent$TransformDelta0 = object2 instanceof TransformEvent.TransformDelta ? ((TransformEvent.TransformDelta)object2) : null;
            if(transformEvent$TransformDelta0 != null) {
                transformScope0.transformBy-d-4ec7I(transformEvent$TransformDelta0.getZoomChange(), transformEvent$TransformDelta0.getPanChange-F1C5BW0(), transformEvent$TransformDelta0.getRotationChange());
            }
            this.q = transformScope0;
            this.o = ref$ObjectRef0;
            this.p = 1;
            object0 = this.s.u.receive(this);
            if(object0 != object1) {
                continue;
            }
            return object1;
        }
        return Unit.INSTANCE;
    }
}

