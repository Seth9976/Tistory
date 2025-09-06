package y3;

import androidx.datastore.migrations.SharedPreferencesMigration;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class d extends ContinuationImpl {
    public SharedPreferencesMigration o;
    public Object p;
    public final SharedPreferencesMigration q;
    public int r;

    public d(SharedPreferencesMigration sharedPreferencesMigration0, Continuation continuation0) {
        this.q = sharedPreferencesMigration0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.p = object0;
        this.r |= 0x80000000;
        return this.q.shouldMigrate(null, this);
    }
}

