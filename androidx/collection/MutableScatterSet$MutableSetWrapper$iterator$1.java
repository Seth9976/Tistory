package androidx.collection;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import org.jetbrains.annotations.NotNull;
import r.j;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010)\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\u0006\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0003\u001A\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001A\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000F\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0011\u001A\u00020\n8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u000B\u0010\f\u001A\u0004\b\r\u0010\u000E\"\u0004\b\u000F\u0010\u0010R\u001D\u0010\u0017\u001A\b\u0012\u0004\u0012\u00028\u00000\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"androidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1", "", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "", "remove", "()V", "", "a", "I", "getCurrent", "()I", "setCurrent", "(I)V", "current", "", "b", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "collection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class MutableScatterSet.MutableSetWrapper.iterator.1 implements Iterator, KMutableIterator {
    public int a;
    public final Iterator b;
    public final MutableScatterSet c;

    public MutableScatterSet.MutableSetWrapper.iterator.1(MutableScatterSet mutableScatterSet0) {
        this.c = mutableScatterSet0;
        this.a = -1;
        this.b = SequencesKt__SequenceBuilderKt.iterator(new j(mutableScatterSet0, this, null));
    }

    public final int getCurrent() {
        return this.a;
    }

    @NotNull
    public final Iterator getIterator() {
        return this.b;
    }

    @Override
    public boolean hasNext() {
        return this.b.hasNext();
    }

    @Override
    public Object next() {
        return this.b.next();
    }

    @Override
    public void remove() {
        int v = this.a;
        if(v != -1) {
            this.c.removeElementAt(v);
            this.a = -1;
        }
    }

    public final void setCurrent(int v) {
        this.a = v;
    }
}

