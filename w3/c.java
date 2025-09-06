package w3;

import androidx.datastore.core.Data;
import androidx.datastore.core.DataStoreImpl.InitDataStore.doRun.initData.1.api.1;
import androidx.datastore.core.DataStoreImpl;
import androidx.datastore.core.InterProcessCoordinator;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref.BooleanRef;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import qd.a;

public final class c extends SuspendLambda implements Function1 {
    public Object o;
    public Serializable p;
    public Object q;
    public Object r;
    public Iterator s;
    public int t;
    public int u;
    public final DataStoreImpl v;
    public final d w;

    public c(DataStoreImpl dataStoreImpl0, d d0, Continuation continuation0) {
        this.v = dataStoreImpl0;
        this.w = d0;
        super(1, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation0) {
        return new c(this.v, this.w, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return ((c)this.create(((Continuation)object0))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object2;
        BooleanRef ref$BooleanRef0;
        ObjectRef ref$ObjectRef0;
        Mutex mutex0;
        Mutex mutex1;
        BooleanRef ref$BooleanRef1;
        ObjectRef ref$ObjectRef1;
        DataStoreImpl.InitDataStore.doRun.initData.1.api.1 dataStoreImpl$InitDataStore$doRun$initData$1$api$10;
        Iterator iterator0;
        Mutex mutex2;
        BooleanRef ref$BooleanRef2;
        ObjectRef ref$ObjectRef3;
        ObjectRef ref$ObjectRef2;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        d d0 = this.w;
        int v = 0;
        DataStoreImpl dataStoreImpl0 = this.v;
        switch(this.u) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                mutex2 = MutexKt.Mutex$default(false, 1, null);
                ref$BooleanRef2 = new BooleanRef();
                ref$ObjectRef2 = new ObjectRef();
                this.o = mutex2;
                this.p = ref$BooleanRef2;
                this.q = ref$ObjectRef2;
                this.r = ref$ObjectRef2;
                this.u = 1;
                object0 = DataStoreImpl.access$readDataOrHandleCorruption(dataStoreImpl0, true, this);
                if(object0 == object1) {
                    return object1;
                }
                ref$ObjectRef3 = ref$ObjectRef2;
            label_41:
                ref$ObjectRef2.element = ((Data)object0).getValue();
                DataStoreImpl.InitDataStore.doRun.initData.1.api.1 dataStoreImpl$InitDataStore$doRun$initData$1$api$11 = new DataStoreImpl.InitDataStore.doRun.initData.1.api.1(mutex2, ref$BooleanRef2, ref$ObjectRef3, dataStoreImpl0);
                List list0 = d0.c;
                if(list0 == null) {
                    mutex0 = mutex2;
                }
                else {
                    mutex1 = mutex2;
                    ref$BooleanRef1 = ref$BooleanRef2;
                    ref$ObjectRef1 = ref$ObjectRef3;
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$10 = dataStoreImpl$InitDataStore$doRun$initData$1$api$11;
                    iterator0 = list0.iterator();
                label_50:
                    while(iterator0.hasNext()) {
                        Object object3 = iterator0.next();
                        this.o = mutex1;
                        this.p = ref$BooleanRef1;
                        this.q = ref$ObjectRef1;
                        this.r = dataStoreImpl$InitDataStore$doRun$initData$1$api$10;
                        this.s = iterator0;
                        this.u = 2;
                        if(((Function2)object3).invoke(dataStoreImpl$InitDataStore$doRun$initData$1$api$10, this) == object1) {
                            return object1;
                        }
                        if(false) {
                            break;
                        }
                    }
                    ref$ObjectRef3 = ref$ObjectRef1;
                    ref$BooleanRef2 = ref$BooleanRef1;
                    mutex0 = mutex1;
                }
                break;
            }
            case 1: {
                ref$ObjectRef2 = (ObjectRef)this.r;
                ref$ObjectRef3 = (ObjectRef)this.q;
                ref$BooleanRef2 = (BooleanRef)this.p;
                mutex2 = (Mutex)this.o;
                ResultKt.throwOnFailure(object0);
                goto label_41;
            }
            case 2: {
                iterator0 = this.s;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$10 = (DataStoreImpl.InitDataStore.doRun.initData.1.api.1)this.r;
                ref$ObjectRef1 = (ObjectRef)this.q;
                ref$BooleanRef1 = (BooleanRef)this.p;
                mutex1 = (Mutex)this.o;
                ResultKt.throwOnFailure(object0);
                goto label_50;
            }
            case 3: {
                mutex0 = (Mutex)this.q;
                ref$ObjectRef0 = (ObjectRef)this.p;
                ref$BooleanRef0 = (BooleanRef)this.o;
                ResultKt.throwOnFailure(object0);
                goto label_77;
            }
            case 4: {
                int v1 = this.t;
                object2 = this.o;
                ResultKt.throwOnFailure(object0);
                return new Data(object2, v1, ((Number)object0).intValue());
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        d0.c = null;
        this.o = ref$BooleanRef2;
        this.p = ref$ObjectRef3;
        this.q = mutex0;
        this.r = null;
        this.s = null;
        this.u = 3;
        if(mutex0.lock(null, this) == object1) {
            return object1;
        }
        ref$ObjectRef0 = ref$ObjectRef3;
        ref$BooleanRef0 = ref$BooleanRef2;
    label_77:
        ref$BooleanRef0.element = true;
        mutex0.unlock(null);
        object2 = ref$ObjectRef0.element;
        if(object2 != null) {
            v = object2.hashCode();
        }
        InterProcessCoordinator interProcessCoordinator0 = dataStoreImpl0.a();
        this.o = object2;
        this.p = null;
        this.q = null;
        this.t = v;
        this.u = 4;
        object0 = interProcessCoordinator0.getVersion(this);
        return object0 == object1 ? object1 : new Data(object2, v, ((Number)object0).intValue());
    }
}

