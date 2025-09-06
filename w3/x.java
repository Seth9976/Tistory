package w3;

import androidx.datastore.core.Data;
import androidx.datastore.core.DataStoreImpl;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import qd.a;

public final class x extends SuspendLambda implements Function1 {
    public Object o;
    public int p;
    public final DataStoreImpl q;
    public final CoroutineContext r;
    public final Function2 s;

    public x(DataStoreImpl dataStoreImpl0, Function2 function20, CoroutineContext coroutineContext0, Continuation continuation0) {
        this.q = dataStoreImpl0;
        this.r = coroutineContext0;
        this.s = function20;
        super(1, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation0) {
        return new x(this.q, this.s, this.r, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return ((x)this.create(((Continuation)object0))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Data data0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        DataStoreImpl dataStoreImpl0 = this.q;
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.p = 1;
                object0 = DataStoreImpl.access$readDataOrHandleCorruption(dataStoreImpl0, true, this);
                if(object0 == object1) {
                    return object1;
                }
                goto label_13;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
            label_13:
                data0 = (Data)object0;
                w w0 = new w(this.s, data0, null);
                this.o = data0;
                this.p = 2;
                object0 = BuildersKt.withContext(this.r, w0, this);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 2: {
                data0 = (Data)this.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            case 3: {
                Object object2 = this.o;
                ResultKt.throwOnFailure(object0);
                return object2;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        data0.checkHashCode();
        if(!Intrinsics.areEqual(data0.getValue(), object0)) {
            this.o = object0;
            this.p = 3;
            return dataStoreImpl0.writeData$datastore_core_release(object0, true, this) == object1 ? object1 : object0;
        }
        return object0;
    }
}

