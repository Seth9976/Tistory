package w3;

import androidx.datastore.core.DataStoreImpl;
import androidx.datastore.core.Final;
import androidx.datastore.core.ReadException;
import androidx.datastore.core.State;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class v extends SuspendLambda implements Function2 {
    public int o;
    public final DataStoreImpl p;
    public final boolean q;

    public v(DataStoreImpl dataStoreImpl0, boolean z, Continuation continuation0) {
        this.p = dataStoreImpl0;
        this.q = z;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new v(this.p, this.q, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((v)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        DataStoreImpl dataStoreImpl0 = this.p;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(dataStoreImpl0.g.getCurrentState() instanceof Final) {
                    return dataStoreImpl0.g.getCurrentState();
                }
                try {
                    this.o = 1;
                    if(dataStoreImpl0.b(this) == object1) {
                        return object1;
                    label_12:
                        ResultKt.throwOnFailure(object0);
                    }
                    break;
                }
                catch(Throwable throwable0) {
                    return new ReadException(throwable0, -1);
                }
            }
            case 1: {
                goto label_12;
            }
            case 2: {
                ResultKt.throwOnFailure(object0);
                return (State)object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        this.o = 2;
        object0 = DataStoreImpl.access$readDataAndUpdateCache(dataStoreImpl0, this.q, this);
        return object0 == object1 ? object1 : ((State)object0);
    }
}

