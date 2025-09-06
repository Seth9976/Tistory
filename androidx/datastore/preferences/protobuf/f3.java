package androidx.datastore.preferences.protobuf;

import java.util.Iterator;

public final class f3 extends k3 {
    public final d3 c;

    public f3(d3 d30) {
        this.c = d30;
        super(d30, 0);
    }

    @Override  // androidx.datastore.preferences.protobuf.k3
    public final Iterator iterator() {
        return new e3(this.c);
    }
}

