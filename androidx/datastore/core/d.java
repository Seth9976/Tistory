package androidx.datastore.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import qd.a;

public final class d extends SuspendLambda implements Function2 {
    public Iterator o;
    public DataMigration p;
    public Object q;
    public int r;
    public Object s;
    public final List t;
    public final ArrayList u;

    public d(List list0, ArrayList arrayList0, Continuation continuation0) {
        this.t = list0;
        this.u = arrayList0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new d(this.t, this.u, continuation0);
        continuation1.s = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((d)this.create(object0, ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        DataMigration dataMigration1;
        Iterator iterator1;
        Object object2;
        List list0;
        Iterator iterator0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                object0 = this.s;
                iterator0 = this.t.iterator();
                list0 = this.u;
                break;
            }
            case 1: {
                object2 = this.q;
                DataMigration dataMigration0 = this.p;
                iterator1 = this.o;
                List list1 = (List)this.s;
                ResultKt.throwOnFailure(object0);
                dataMigration1 = dataMigration0;
                list0 = list1;
                goto label_33;
            }
            case 2: {
                iterator0 = this.o;
                list0 = (List)this.s;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(iterator0.hasNext()) {
            Object object3 = iterator0.next();
            this.s = list0;
            this.o = iterator0;
            this.p = (DataMigration)object3;
            this.q = object0;
            this.r = 1;
            Object object4 = ((DataMigration)object3).shouldMigrate(object0, this);
            if(object4 == object1) {
                return object1;
            }
            object2 = object0;
            object0 = object4;
            dataMigration1 = (DataMigration)object3;
            iterator1 = iterator0;
        label_33:
            if(((Boolean)object0).booleanValue()) {
                list0.add(new c(dataMigration1, null));
                this.s = list0;
                this.o = iterator1;
                this.p = null;
                this.q = null;
                this.r = 2;
                object0 = dataMigration1.migrate(object2, this);
                if(object0 == object1) {
                    return object1;
                }
            }
            else {
                object0 = object2;
            }
            iterator0 = iterator1;
        }
        return object0;
    }
}

