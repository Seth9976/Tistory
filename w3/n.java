package w3;

import androidx.datastore.core.Data;
import androidx.datastore.core.DataStoreImpl.internalDataFlow.1.invokeSuspend..inlined.map.1;
import androidx.datastore.core.DataStoreImpl;
import androidx.datastore.core.Final;
import androidx.datastore.core.ReadException;
import androidx.datastore.core.State;
import androidx.datastore.core.UnInitialized;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import qd.a;

public final class n extends SuspendLambda implements Function2 {
    public Data o;
    public int p;
    public Object q;
    public final DataStoreImpl r;

    public n(DataStoreImpl dataStoreImpl0, Continuation continuation0) {
        this.r = dataStoreImpl0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new n(this.r, continuation0);
        continuation1.q = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((n)this.create(((FlowCollector)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        State state0;
        FlowCollector flowCollector1;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        DataStoreImpl dataStoreImpl0 = this.r;
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                FlowCollector flowCollector0 = (FlowCollector)this.q;
                this.q = flowCollector0;
                this.p = 1;
                Object object2 = DataStoreImpl.access$readState(dataStoreImpl0, false, this);
                if(object2 == object1) {
                    return object1;
                }
                flowCollector1 = flowCollector0;
                object0 = object2;
                goto label_19;
            }
            case 1: {
                FlowCollector flowCollector2 = (FlowCollector)this.q;
                ResultKt.throwOnFailure(object0);
                flowCollector1 = flowCollector2;
            label_19:
                state0 = (State)object0;
                if(state0 instanceof Data) {
                    Object object3 = ((Data)state0).getValue();
                    this.q = flowCollector1;
                    this.o = (Data)state0;
                    this.p = 2;
                    if(flowCollector1.emit(object3, this) == object1) {
                        return object1;
                    }
                }
                else {
                    if(state0 instanceof UnInitialized) {
                        throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    }
                    if(state0 instanceof ReadException) {
                        throw ((ReadException)state0).getReadException();
                    }
                    if(state0 instanceof Final) {
                        return Unit.INSTANCE;
                    }
                }
                break;
            }
            case 2: {
                state0 = this.o;
                flowCollector1 = (FlowCollector)this.q;
                ResultKt.throwOnFailure(object0);
                break;
            }
            case 3: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        DataStoreImpl.internalDataFlow.1.invokeSuspend..inlined.map.1 dataStoreImpl$internalDataFlow$1$invokeSuspend$$inlined$map$10 = new DataStoreImpl.internalDataFlow.1.invokeSuspend..inlined.map.1(FlowKt.dropWhile(FlowKt.takeWhile(dataStoreImpl0.g.getFlow(), new l(2, null)), new m(state0, null)));  // 初始化器: Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V
        this.q = null;
        this.o = null;
        this.p = 3;
        return FlowKt.emitAll(flowCollector1, dataStoreImpl$internalDataFlow$1$invokeSuspend$$inlined$map$10, this) == object1 ? object1 : Unit.INSTANCE;
    }
}

