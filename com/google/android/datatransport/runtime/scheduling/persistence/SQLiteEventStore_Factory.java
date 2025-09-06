package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.time.Clock;
import javax.inject.Provider;

public final class SQLiteEventStore_Factory implements Factory {
    public final Provider a;
    public final Provider b;
    public final Provider c;
    public final Provider d;
    public final Provider e;

    public SQLiteEventStore_Factory(Provider provider0, Provider provider1, Provider provider2, Provider provider3, Provider provider4) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
        this.d = provider3;
        this.e = provider4;
    }

    public static SQLiteEventStore_Factory create(Provider provider0, Provider provider1, Provider provider2, Provider provider3, Provider provider4) {
        return new SQLiteEventStore_Factory(provider0, provider1, provider2, provider3, provider4);
    }

    public SQLiteEventStore get() {
        return SQLiteEventStore_Factory.newInstance(((Clock)this.a.get()), ((Clock)this.b.get()), this.c.get(), this.d.get(), this.e);
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static SQLiteEventStore newInstance(Clock clock0, Clock clock1, Object object0, Object object1, Provider provider0) {
        return new SQLiteEventStore(clock0, clock1, ((c)object0), ((o)object1), provider0);
    }
}

