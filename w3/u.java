package w3;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.DataStoreImpl;
import androidx.datastore.core.InterProcessCoordinator;
import java.io.Serializable;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref.IntRef;
import kotlin.jvm.internal.Ref.ObjectRef;
import qd.a;

public final class u extends SuspendLambda implements Function1 {
    public Serializable o;
    public int p;
    public final ObjectRef q;
    public final DataStoreImpl r;
    public final IntRef s;

    public u(ObjectRef ref$ObjectRef0, DataStoreImpl dataStoreImpl0, IntRef ref$IntRef0, Continuation continuation0) {
        this.q = ref$ObjectRef0;
        this.r = dataStoreImpl0;
        this.s = ref$IntRef0;
        super(1, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation0) {
        return new u(this.q, this.r, this.s, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return ((u)this.create(((Continuation)object0))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        IntRef ref$IntRef1;
        ObjectRef ref$ObjectRef1;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        IntRef ref$IntRef0 = this.s;
        ObjectRef ref$ObjectRef0 = this.q;
        DataStoreImpl dataStoreImpl0 = this.r;
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    this.o = ref$ObjectRef0;
                    this.p = 1;
                    object0 = DataStoreImpl.access$readDataFromFileOrDefault(dataStoreImpl0, this);
                    if(object0 == object1) {
                        return object1;
                    }
                    ref$ObjectRef1 = ref$ObjectRef0;
                    goto label_16;
                }
                catch(CorruptionException unused_ex) {
                    goto label_29;
                }
            }
            case 1: {
                ref$ObjectRef1 = (ObjectRef)this.o;
                try {
                    ResultKt.throwOnFailure(object0);
                label_16:
                    ref$ObjectRef1.element = object0;
                    InterProcessCoordinator interProcessCoordinator0 = dataStoreImpl0.a();
                    this.o = ref$IntRef0;
                    this.p = 2;
                    object0 = interProcessCoordinator0.getVersion(this);
                    if(object0 == object1) {
                        return object1;
                    }
                    ref$IntRef1 = ref$IntRef0;
                    ref$IntRef1.element = ((Number)object0).intValue();
                    return Unit.INSTANCE;
                }
                catch(CorruptionException unused_ex) {
                    goto label_29;
                }
            }
            case 2: {
                ref$IntRef1 = (IntRef)this.o;
                try {
                    ResultKt.throwOnFailure(object0);
                    ref$IntRef1.element = ((Number)object0).intValue();
                }
                catch(CorruptionException unused_ex) {
                label_29:
                    this.o = ref$IntRef0;
                    this.p = 3;
                    object0 = dataStoreImpl0.writeData$datastore_core_release(ref$ObjectRef0.element, true, this);
                    if(object0 == object1) {
                        return object1;
                    }
                    ref$IntRef0.element = ((Number)object0).intValue();
                }
                return Unit.INSTANCE;
            }
            case 3: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ref$IntRef0 = (IntRef)this.o;
        ResultKt.throwOnFailure(object0);
        ref$IntRef0.element = ((Number)object0).intValue();
        return Unit.INSTANCE;
    }
}

