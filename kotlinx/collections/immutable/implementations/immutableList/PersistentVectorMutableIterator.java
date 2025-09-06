package kotlinx.collections.immutable.implementations.immutableList;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableListIterator;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001D\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\n\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\f\u001A\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\f\u0010\u000BJ\u0017\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0011\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0010¨\u0006\u0014"}, d2 = {"Lkotlinx/collections/immutable/implementations/immutableList/PersistentVectorMutableIterator;", "T", "", "Lkotlinx/collections/immutable/implementations/immutableList/AbstractListIterator;", "Lkotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;", "builder", "", "index", "<init>", "(Lkotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;I)V", "previous", "()Ljava/lang/Object;", "next", "element", "", "add", "(Ljava/lang/Object;)V", "remove", "()V", "set", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PersistentVectorMutableIterator extends AbstractListIterator implements ListIterator, KMutableListIterator {
    public final PersistentVectorBuilder c;
    public int d;
    public TrieIterator e;
    public int f;

    public PersistentVectorMutableIterator(@NotNull PersistentVectorBuilder persistentVectorBuilder0, int v) {
        Intrinsics.checkNotNullParameter(persistentVectorBuilder0, "builder");
        super(v, persistentVectorBuilder0.size());
        this.c = persistentVectorBuilder0;
        this.d = persistentVectorBuilder0.getModCount$kotlinx_collections_immutable();
        this.f = -1;
        this.b();
    }

    public final void a() {
        if(this.d != this.c.getModCount$kotlinx_collections_immutable()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override  // kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator
    public void add(Object object0) {
        this.a();
        this.c.add(this.getIndex(), object0);
        this.setIndex(this.getIndex() + 1);
        this.setSize(this.c.size());
        this.d = this.c.getModCount$kotlinx_collections_immutable();
        this.f = -1;
        this.b();
    }

    public final void b() {
        PersistentVectorBuilder persistentVectorBuilder0 = this.c;
        Object[] arr_object = persistentVectorBuilder0.getRoot$kotlinx_collections_immutable();
        if(arr_object == null) {
            this.e = null;
            return;
        }
        int v = persistentVectorBuilder0.size() - 1 & 0xFFFFFFE0;
        int v1 = c.coerceAtMost(this.getIndex(), v);
        int v2 = persistentVectorBuilder0.getRootShift$kotlinx_collections_immutable() / 5 + 1;
        TrieIterator trieIterator0 = this.e;
        if(trieIterator0 == null) {
            this.e = new TrieIterator(arr_object, v1, v, v2);
            return;
        }
        Intrinsics.checkNotNull(trieIterator0);
        trieIterator0.reset$kotlinx_collections_immutable(arr_object, v1, v, v2);
    }

    @Override  // kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator
    public Object next() {
        this.a();
        this.checkHasNext$kotlinx_collections_immutable();
        this.f = this.getIndex();
        TrieIterator trieIterator0 = this.e;
        PersistentVectorBuilder persistentVectorBuilder0 = this.c;
        if(trieIterator0 == null) {
            int v = this.getIndex();
            this.setIndex(v + 1);
            return persistentVectorBuilder0.getTail$kotlinx_collections_immutable()[v];
        }
        if(trieIterator0.hasNext()) {
            this.setIndex(this.getIndex() + 1);
            return trieIterator0.next();
        }
        int v1 = this.getIndex();
        this.setIndex(v1 + 1);
        return persistentVectorBuilder0.getTail$kotlinx_collections_immutable()[v1 - trieIterator0.getSize()];
    }

    @Override
    public Object previous() {
        this.a();
        this.checkHasPrevious$kotlinx_collections_immutable();
        this.f = this.getIndex() - 1;
        TrieIterator trieIterator0 = this.e;
        PersistentVectorBuilder persistentVectorBuilder0 = this.c;
        if(trieIterator0 == null) {
            this.setIndex(this.getIndex() - 1);
            return persistentVectorBuilder0.getTail$kotlinx_collections_immutable()[this.getIndex()];
        }
        if(this.getIndex() > trieIterator0.getSize()) {
            this.setIndex(this.getIndex() - 1);
            return persistentVectorBuilder0.getTail$kotlinx_collections_immutable()[this.getIndex() - trieIterator0.getSize()];
        }
        this.setIndex(this.getIndex() - 1);
        return trieIterator0.previous();
    }

    @Override  // kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator
    public void remove() {
        this.a();
        int v = this.f;
        if(v == -1) {
            throw new IllegalStateException();
        }
        PersistentVectorBuilder persistentVectorBuilder0 = this.c;
        persistentVectorBuilder0.remove(v);
        if(this.f < this.getIndex()) {
            this.setIndex(this.f);
        }
        this.setSize(persistentVectorBuilder0.size());
        this.d = persistentVectorBuilder0.getModCount$kotlinx_collections_immutable();
        this.f = -1;
        this.b();
    }

    @Override  // kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator
    public void set(Object object0) {
        this.a();
        int v = this.f;
        if(v == -1) {
            throw new IllegalStateException();
        }
        this.c.set(v, object0);
        this.d = this.c.getModCount$kotlinx_collections_immutable();
        this.b();
    }
}

