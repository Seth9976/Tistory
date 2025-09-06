package i1;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateListKt;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.KotlinNothingValueException;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableListIterator;

public final class f implements ListIterator, KMutableListIterator {
    public final int a;
    public int b;
    public int c;
    public int d;
    public final Object e;

    public f(SnapshotStateList snapshotStateList0, int v) {
        this.a = 0;
        super();
        this.e = snapshotStateList0;
        this.b = v - 1;
        this.c = -1;
        this.d = snapshotStateList0.getStructure$runtime_release();
    }

    public f(ListBuilder listBuilder0, int v) {
        this.a = 1;
        Intrinsics.checkNotNullParameter(listBuilder0, "list");
        super();
        this.e = listBuilder0;
        this.b = v;
        this.c = -1;
        this.d = ListBuilder.access$getModCount$p$s-2084097795(listBuilder0);
    }

    public void a() {
        if(ListBuilder.access$getModCount$p$s-2084097795(((ListBuilder)this.e)) != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override
    public final void add(Object object0) {
        if(this.a != 0) {
            this.a();
            int v = this.b;
            this.b = v + 1;
            ((ListBuilder)this.e).add(v, object0);
            this.c = -1;
            this.d = ListBuilder.access$getModCount$p$s-2084097795(((ListBuilder)this.e));
            return;
        }
        this.b();
        ((SnapshotStateList)this.e).add(this.b + 1, object0);
        this.c = -1;
        ++this.b;
        this.d = ((SnapshotStateList)this.e).getStructure$runtime_release();
    }

    public void b() {
        if(((SnapshotStateList)this.e).getStructure$runtime_release() != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override
    public final boolean hasNext() {
        return this.a == 0 ? this.b < ((SnapshotStateList)this.e).size() - 1 : this.b < ListBuilder.access$getLength$p(((ListBuilder)this.e));
    }

    @Override
    public final boolean hasPrevious() {
        return this.a == 0 ? this.b >= 0 : this.b > 0;
    }

    @Override
    public final Object next() {
        if(this.a != 0) {
            this.a();
            int v = this.b;
            ListBuilder listBuilder0 = (ListBuilder)this.e;
            if(v >= ListBuilder.access$getLength$p(listBuilder0)) {
                throw new NoSuchElementException();
            }
            int v1 = this.b;
            this.b = v1 + 1;
            this.c = v1;
            return ListBuilder.access$getArray$p(listBuilder0)[ListBuilder.access$getOffset$p(listBuilder0) + this.c];
        }
        this.b();
        int v2 = this.b + 1;
        this.c = v2;
        SnapshotStateListKt.access$validateRange(v2, ((SnapshotStateList)this.e).size());
        Object object0 = ((SnapshotStateList)this.e).get(v2);
        this.b = v2;
        return object0;
    }

    @Override
    public final int nextIndex() {
        return this.a == 0 ? this.b + 1 : this.b;
    }

    @Override
    public final Object previous() {
        if(this.a != 0) {
            this.a();
            int v = this.b;
            if(v <= 0) {
                throw new NoSuchElementException();
            }
            this.b = v - 1;
            this.c = v - 1;
            return ListBuilder.access$getArray$p(((ListBuilder)this.e))[ListBuilder.access$getOffset$p(((ListBuilder)this.e)) + this.c];
        }
        this.b();
        SnapshotStateListKt.access$validateRange(this.b, ((SnapshotStateList)this.e).size());
        this.c = this.b;
        Object object0 = ((SnapshotStateList)this.e).get(this.b);
        --this.b;
        return object0;
    }

    @Override
    public final int previousIndex() {
        return this.a == 0 ? this.b : this.b - 1;
    }

    @Override
    public final void remove() {
        if(this.a != 0) {
            this.a();
            int v = this.c;
            if(v == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            ((ListBuilder)this.e).remove(v);
            this.b = this.c;
            this.c = -1;
            this.d = ListBuilder.access$getModCount$p$s-2084097795(((ListBuilder)this.e));
            return;
        }
        this.b();
        ((SnapshotStateList)this.e).remove(this.b);
        --this.b;
        this.c = -1;
        this.d = ((SnapshotStateList)this.e).getStructure$runtime_release();
    }

    @Override
    public final void set(Object object0) {
        if(this.a != 0) {
            this.a();
            int v = this.c;
            if(v == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            ((ListBuilder)this.e).set(v, object0);
            return;
        }
        this.b();
        int v1 = this.c;
        if(v1 >= 0) {
            ((SnapshotStateList)this.e).set(v1, object0);
            this.d = ((SnapshotStateList)this.e).getStructure$runtime_release();
            return;
        }
        SnapshotStateListKt.access$invalidIteratorSet();
        throw new KotlinNothingValueException();
    }
}

