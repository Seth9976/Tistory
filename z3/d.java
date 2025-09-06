package z3;

import androidx.datastore.preferences.SharedPreferencesMigrationKt;
import androidx.datastore.preferences.core.Preferences.Key;
import androidx.datastore.preferences.core.Preferences;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.l;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

public final class d extends SuspendLambda implements Function2 {
    public Object o;
    public final Set p;

    public d(Set set0, Continuation continuation0) {
        this.p = set0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new d(this.p, continuation0);
        continuation1.o = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((d)this.create(((Preferences)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        Iterable iterable0 = ((Preferences)this.o).asMap().keySet();
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object1: iterable0) {
            arrayList0.add(((Key)object1).getName());
        }
        Set set0 = this.p;
        if(set0 != SharedPreferencesMigrationKt.getMIGRATE_ALL_KEYS()) {
            if(!(set0 instanceof Collection) || !set0.isEmpty()) {
                for(Object object2: set0) {
                    if(arrayList0.contains(((String)object2))) {
                        continue;
                    }
                    return Boxing.boxBoolean(true);
                }
            }
            return Boxing.boxBoolean(false);
        }
        return Boxing.boxBoolean(true);
    }
}

