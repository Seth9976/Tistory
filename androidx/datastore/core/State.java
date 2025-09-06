package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R\u0017\u0010\b\u001A\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\t\n\u000B\f¨\u0006\r"}, d2 = {"Landroidx/datastore/core/State;", "T", "", "", "a", "I", "getVersion", "()I", "version", "Landroidx/datastore/core/Data;", "Landroidx/datastore/core/Final;", "Landroidx/datastore/core/ReadException;", "Landroidx/datastore/core/UnInitialized;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class State {
    public final int a;

    public State(int v, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
    }

    public final int getVersion() {
        return this.a;
    }
}

