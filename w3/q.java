package w3;

import androidx.datastore.core.DataStoreImpl;
import androidx.datastore.core.InterProcessCoordinator;
import androidx.datastore.core.ReadException;
import androidx.datastore.core.State;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import qd.a;

public final class q extends SuspendLambda implements Function1 {
    public Throwable o;
    public int p;
    public final DataStoreImpl q;

    public q(DataStoreImpl dataStoreImpl0, Continuation continuation0) {
        this.q = dataStoreImpl0;
        super(1, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation0) {
        return new q(this.q, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return ((q)this.create(((Continuation)object0))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        DataStoreImpl dataStoreImpl0 = this.q;
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    this.p = 1;
                    object0 = DataStoreImpl.access$readDataOrHandleCorruption(dataStoreImpl0, true, this);
                    if(object0 == object1) {
                        return object1;
                    label_12:
                        ResultKt.throwOnFailure(object0);
                    }
                    return TuplesKt.to(((State)object0), Boxing.boxBoolean(true));
                }
                catch(Throwable throwable1) {
                    break;
                }
            }
            case 1: {
                goto label_12;
            }
            case 2: {
                Throwable throwable0 = this.o;
                ResultKt.throwOnFailure(object0);
                return TuplesKt.to(new ReadException(throwable0, ((Number)object0).intValue()), Boxing.boxBoolean(true));
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        InterProcessCoordinator interProcessCoordinator0 = dataStoreImpl0.a();
        this.o = throwable1;
        this.p = 2;
        Object object2 = interProcessCoordinator0.getVersion(this);
        return object2 == object1 ? object1 : TuplesKt.to(new ReadException(throwable1, ((Number)object2).intValue()), Boxing.boxBoolean(true));
    }
}

