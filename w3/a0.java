package w3;

import androidx.datastore.core.Data;
import androidx.datastore.core.DataStoreImpl;
import androidx.datastore.core.InterProcessCoordinator;
import androidx.datastore.core.WriteScope;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref.IntRef;
import qd.a;

public final class a0 extends SuspendLambda implements Function2 {
    public IntRef o;
    public int p;
    public Object q;
    public final IntRef r;
    public final DataStoreImpl s;
    public final Object t;
    public final boolean u;

    public a0(IntRef ref$IntRef0, DataStoreImpl dataStoreImpl0, Object object0, boolean z, Continuation continuation0) {
        this.r = ref$IntRef0;
        this.s = dataStoreImpl0;
        this.t = object0;
        this.u = z;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new a0(this.r, this.s, this.t, this.u, continuation0);
        continuation1.q = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((a0)this.create(((WriteScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        IntRef ref$IntRef1;
        WriteScope writeScope1;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        IntRef ref$IntRef0 = this.r;
        Object object2 = this.t;
        DataStoreImpl dataStoreImpl0 = this.s;
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                WriteScope writeScope0 = (WriteScope)this.q;
                InterProcessCoordinator interProcessCoordinator0 = dataStoreImpl0.a();
                this.q = writeScope0;
                this.o = ref$IntRef0;
                this.p = 1;
                Object object3 = interProcessCoordinator0.incrementAndGetVersion(this);
                if(object3 == object1) {
                    return object1;
                }
                writeScope1 = writeScope0;
                object0 = object3;
                ref$IntRef1 = ref$IntRef0;
                goto label_22;
            }
            case 1: {
                ref$IntRef1 = this.o;
                writeScope1 = (WriteScope)this.q;
                ResultKt.throwOnFailure(object0);
            label_22:
                ref$IntRef1.element = ((Number)object0).intValue();
                this.q = null;
                this.o = null;
                this.p = 2;
                if(writeScope1.writeData(object2, this) == object1) {
                    return object1;
                }
                break;
            }
            case 2: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(this.u) {
            dataStoreImpl0.g.tryUpdate(new Data(object2, (object2 == null ? 0 : object2.hashCode()), ref$IntRef0.element));
        }
        return Unit.INSTANCE;
    }
}

