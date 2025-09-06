package androidx.datastore.preferences.protobuf;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

public final class q1 extends AbstractSet {
    public final Set a;
    public final MapAdapter b;

    public q1(MapAdapter internal$MapAdapter0, Set set0) {
        this.b = internal$MapAdapter0;
        super();
        this.a = set0;
    }

    @Override
    public final Iterator iterator() {
        Iterator iterator0 = this.a.iterator();
        return new p1(this.b, iterator0);
    }

    @Override
    public final int size() {
        return this.a.size();
    }
}

