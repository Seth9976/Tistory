package a1;

import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableListIterator;

public final class c implements ListIterator, KMutableListIterator {
    public final int a;
    public final Object b;
    public int c;

    public c(List list0, int v, int v1) {
        this.a = v1;
        if(v1 != 1) {
            super();
            this.b = list0;
            this.c = v;
            return;
        }
        Intrinsics.checkNotNullParameter(list0, "list");
        super();
        this.b = list0;
        this.c = v - 1;
    }

    @Override
    public final void add(Object object0) {
        if(this.a != 0) {
            int v = this.c + 1;
            this.c = v;
            ((List)this.b).add(v, object0);
            return;
        }
        ((List)this.b).add(this.c, object0);
        ++this.c;
    }

    @Override
    public final boolean hasNext() {
        return this.a == 0 ? this.c < ((List)this.b).size() : this.c < ((List)this.b).size() - 1;
    }

    @Override
    public final boolean hasPrevious() {
        return this.a == 0 ? this.c > 0 : this.c >= 0;
    }

    @Override
    public final Object next() {
        if(this.a != 0) {
            int v = this.c + 1;
            this.c = v;
            return ((List)this.b).get(v);
        }
        int v1 = this.c;
        this.c = v1 + 1;
        return ((List)this.b).get(v1);
    }

    @Override
    public final int nextIndex() {
        return this.a == 0 ? this.c : this.c + 1;
    }

    @Override
    public final Object previous() {
        if(this.a != 0) {
            int v = this.c;
            this.c = v - 1;
            return ((List)this.b).get(v);
        }
        int v1 = this.c - 1;
        this.c = v1;
        return ((List)this.b).get(v1);
    }

    @Override
    public final int previousIndex() {
        return this.a == 0 ? this.c - 1 : this.c;
    }

    @Override
    public final void remove() {
        if(this.a != 0) {
            ((List)this.b).remove(this.c);
            --this.c;
            return;
        }
        int v = this.c - 1;
        this.c = v;
        ((List)this.b).remove(v);
    }

    @Override
    public final void set(Object object0) {
        if(this.a != 0) {
            ((List)this.b).set(this.c, object0);
            return;
        }
        ((List)this.b).set(this.c, object0);
    }
}

