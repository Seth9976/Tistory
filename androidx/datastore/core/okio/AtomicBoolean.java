package androidx.datastore.core.okio;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001A\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001A\u00020\t2\u0006\u0010\b\u001A\u00020\u0002¢\u0006\u0004\b\n\u0010\u0005¨\u0006\u000B"}, d2 = {"Landroidx/datastore/core/okio/AtomicBoolean;", "", "", "initialValue", "<init>", "(Z)V", "get", "()Z", "value", "", "set", "datastore-core-okio"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AtomicBoolean {
    public final java.util.concurrent.atomic.AtomicBoolean a;

    public AtomicBoolean(boolean z) {
        this.a = new java.util.concurrent.atomic.AtomicBoolean(z);
    }

    public final boolean get() {
        return this.a.get();
    }

    public final void set(boolean z) {
        this.a.set(z);
    }
}

