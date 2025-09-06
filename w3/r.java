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
import kotlin.jvm.functions.Function2;
import qd.a;

public final class r extends SuspendLambda implements Function2 {
    public Throwable o;
    public int p;
    public boolean q;
    public final DataStoreImpl r;
    public final int s;

    public r(DataStoreImpl dataStoreImpl0, int v, Continuation continuation0) {
        this.r = dataStoreImpl0;
        this.s = v;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new r(this.r, this.s, continuation0);
        continuation1.q = ((Boolean)object0).booleanValue();
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Boolean)object0).booleanValue();
        return ((r)this.create(((Boolean)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        DataStoreImpl dataStoreImpl0 = this.r;
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                boolean z1 = this.q;
                try {
                    this.q = z1;
                    this.p = 1;
                    object0 = DataStoreImpl.access$readDataOrHandleCorruption(dataStoreImpl0, z1, this);
                    if(object0 == object1) {
                        return object1;
                    label_15:
                        z1 = this.q;
                        ResultKt.throwOnFailure(object0);
                    }
                    return TuplesKt.to(((State)object0), Boxing.boxBoolean(z1));
                }
                catch(Throwable throwable1) {
                    break;
                }
            }
            case 1: {
                goto label_15;
            }
            case 2: {
                boolean z = this.q;
                Throwable throwable0 = this.o;
                ResultKt.throwOnFailure(object0);
                return TuplesKt.to(new ReadException(throwable0, ((Number)object0).intValue()), Boxing.boxBoolean(z));
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(z1) {
            InterProcessCoordinator interProcessCoordinator0 = dataStoreImpl0.a();
            this.o = throwable1;
            this.q = true;
            this.p = 2;
            Object object2 = interProcessCoordinator0.getVersion(this);
            return object2 == object1 ? object1 : TuplesKt.to(new ReadException(throwable1, ((Number)object2).intValue()), Boxing.boxBoolean(true));
        }
        return TuplesKt.to(new ReadException(throwable1, this.s), Boxing.boxBoolean(false));
    }
}

