package w3;

import androidx.datastore.core.Data;
import androidx.datastore.core.DataStoreImpl;
import androidx.datastore.core.InterProcessCoordinator;
import androidx.datastore.core.RunOnce;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

public final class d extends RunOnce {
    public List c;
    public final DataStoreImpl d;

    public d(DataStoreImpl dataStoreImpl0, List list0) {
        Intrinsics.checkNotNullParameter(list0, "initTasksList");
        this.d = dataStoreImpl0;
        super();
        this.c = CollectionsKt___CollectionsKt.toList(list0);
    }

    @Override  // androidx.datastore.core.RunOnce
    public final Object doRun(Continuation continuation0) {
        d d0;
        a a0;
        if(continuation0 instanceof a) {
            a0 = (a)continuation0;
            int v = a0.r;
            if((v & 0x80000000) == 0) {
                a0 = new a(this, continuation0);
            }
            else {
                a0.r = v ^ 0x80000000;
            }
        }
        else {
            a0 = new a(this, continuation0);
        }
        Object object0 = a0.p;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(a0.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                List list0 = this.c;
                DataStoreImpl dataStoreImpl0 = this.d;
                if(list0 == null) {
                label_28:
                    a0.o = this;
                    a0.r = 1;
                    object0 = DataStoreImpl.access$readDataOrHandleCorruption(dataStoreImpl0, false, a0);
                    if(object0 == object1) {
                        return object1;
                    }
                    d0 = this;
                }
                else {
                    Intrinsics.checkNotNull(list0);
                    if(!list0.isEmpty()) {
                        InterProcessCoordinator interProcessCoordinator0 = dataStoreImpl0.a();
                        c c0 = new c(dataStoreImpl0, this, null);
                        a0.o = this;
                        a0.r = 2;
                        object0 = interProcessCoordinator0.lock(c0, a0);
                        if(object0 == object1) {
                            return object1;
                        }
                        d0 = this;
                        break;
                    }
                    goto label_28;
                }
                break;
            }
            case 1: {
                d0 = a0.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            case 2: {
                d0 = a0.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        d0.d.g.tryUpdate(((Data)object0));
        return Unit.INSTANCE;
    }
}

