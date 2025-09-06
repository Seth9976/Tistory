package z;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.TransformEvent.TransformStarted;
import androidx.compose.foundation.gestures.TransformableState;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import qd.a;

public final class t3 extends SuspendLambda implements Function2 {
    public ObjectRef o;
    public ObjectRef p;
    public int q;
    public Object r;
    public final x3 s;

    public t3(x3 x30, Continuation continuation0) {
        this.s = x30;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new t3(this.s, continuation0);
        continuation1.r = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((t3)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        CoroutineScope coroutineScope1;
        ObjectRef ref$ObjectRef1;
        ObjectRef ref$ObjectRef0;
        CoroutineScope coroutineScope0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        x3 x30 = this.s;
        switch(this.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                coroutineScope0 = (CoroutineScope)this.r;
                break;
            }
            case 1: {
                ref$ObjectRef0 = this.p;
                ref$ObjectRef1 = this.o;
                coroutineScope1 = (CoroutineScope)this.r;
                ResultKt.throwOnFailure(object0);
                goto label_27;
            }
            case 2: {
                CoroutineScope coroutineScope2 = (CoroutineScope)this.r;
                try {
                    ResultKt.throwOnFailure(object0);
                }
                catch(CancellationException unused_ex) {
                }
                coroutineScope0 = coroutineScope2;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(CoroutineScopeKt.isActive(coroutineScope0)) {
            ref$ObjectRef0 = new ObjectRef();
            this.r = coroutineScope0;
            this.o = ref$ObjectRef0;
            this.p = ref$ObjectRef0;
            this.q = 1;
            Object object2 = x30.u.receive(this);
            if(object2 == object1) {
                return object1;
            }
            coroutineScope1 = coroutineScope0;
            object0 = object2;
            ref$ObjectRef1 = ref$ObjectRef0;
        label_27:
            ref$ObjectRef0.element = object0;
            if(ref$ObjectRef1.element instanceof TransformEvent.TransformStarted) {
                try {
                    TransformableState transformableState0 = x30.p;
                    s3 s30 = new s3(ref$ObjectRef1, x30, null);
                    this.r = coroutineScope1;
                    this.o = null;
                    this.p = null;
                    this.q = 2;
                    if(transformableState0.transform(MutatePriority.UserInput, s30, this) == object1) {
                        return object1;
                    }
                }
                catch(CancellationException unused_ex) {
                }
            }
            coroutineScope0 = coroutineScope1;
        }
        return Unit.INSTANCE;
    }
}

