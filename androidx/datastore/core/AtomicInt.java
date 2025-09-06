package androidx.datastore.core;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001A\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001A\u00020\u0002¢\u0006\u0004\b\b\u0010\u0007J\r\u0010\t\u001A\u00020\u0002¢\u0006\u0004\b\t\u0010\u0007J\r\u0010\n\u001A\u00020\u0002¢\u0006\u0004\b\n\u0010\u0007¨\u0006\u000B"}, d2 = {"Landroidx/datastore/core/AtomicInt;", "", "", "initialValue", "<init>", "(I)V", "getAndIncrement", "()I", "decrementAndGet", "get", "incrementAndGet", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AtomicInt {
    public final AtomicInteger a;

    public AtomicInt(int v) {
        this.a = new AtomicInteger(v);
    }

    public AtomicInt(int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        this(v);
    }

    public final int decrementAndGet() {
        return this.a.decrementAndGet();
    }

    public final int get() {
        return this.a.get();
    }

    public final int getAndIncrement() {
        return this.a.getAndIncrement();
    }

    public final int incrementAndGet() {
        return this.a.incrementAndGet();
    }
}

