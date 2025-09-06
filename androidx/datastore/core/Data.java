package androidx.datastore.core;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000B\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001F\u0012\u0006\u0010\u0003\u001A\u00028\u0000\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001A\u00020\t¢\u0006\u0004\b\n\u0010\u000BR\u0017\u0010\u0003\u001A\u00028\u00008\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000FR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/datastore/core/Data;", "T", "Landroidx/datastore/core/State;", "value", "", "hashCode", "version", "<init>", "(Ljava/lang/Object;II)V", "", "checkHashCode", "()V", "b", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "c", "I", "getHashCode", "()I", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Data extends State {
    public final Object b;
    public final int c;

    public Data(Object object0, int v, int v1) {
        super(v1, null);
        this.b = object0;
        this.c = v;
    }

    public final void checkHashCode() {
        if((this.b == null ? 0 : this.b.hashCode()) != this.c) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
    }

    public final int getHashCode() {
        return this.c;
    }

    public final Object getValue() {
        return this.b;
    }
}

