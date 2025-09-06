package w3;

import androidx.datastore.core.Data;
import androidx.datastore.core.DataStoreImpl;
import androidx.datastore.core.InterProcessCoordinator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import qd.a;

public final class t extends SuspendLambda implements Function2 {
    public Object o;
    public int p;
    public boolean q;
    public final DataStoreImpl r;
    public final int s;

    public t(DataStoreImpl dataStoreImpl0, int v, Continuation continuation0) {
        this.r = dataStoreImpl0;
        this.s = v;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new t(this.r, this.s, continuation0);
        continuation1.q = ((Boolean)object0).booleanValue();
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Boolean)object0).booleanValue();
        return ((t)this.create(((Boolean)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object3;
        boolean z;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        DataStoreImpl dataStoreImpl0 = this.r;
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                z = this.q;
                this.q = z;
                this.p = 1;
                object0 = DataStoreImpl.access$readDataFromFileOrDefault(dataStoreImpl0, this);
                if(object0 == object1) {
                    return object1;
                }
                goto label_13;
            }
            case 1: {
                z = this.q;
                ResultKt.throwOnFailure(object0);
            label_13:
                if(z) {
                    InterProcessCoordinator interProcessCoordinator0 = dataStoreImpl0.a();
                    this.o = object0;
                    this.p = 2;
                    Object object2 = interProcessCoordinator0.getVersion(this);
                    if(object2 == object1) {
                        return object1;
                    }
                    object3 = object0;
                    object0 = object2;
                    break;
                }
                return object0 == null ? new Data(null, 0, this.s) : new Data(object0, object0.hashCode(), this.s);
            }
            case 2: {
                object3 = this.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        int v = ((Number)object0).intValue();
        return object3 == null ? new Data(null, 0, v) : new Data(object3, object3.hashCode(), v);
    }
}

