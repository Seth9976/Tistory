package kotlinx.collections.immutable.implementations.persistentOrderedSet;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\u000B\u001A\u00020\nH\u0016¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lkotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSetMutableIterator;", "E", "Lkotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSetIterator;", "", "Lkotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSetBuilder;", "builder", "<init>", "(Lkotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSetBuilder;)V", "next", "()Ljava/lang/Object;", "", "remove", "()V", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PersistentOrderedSetMutableIterator extends PersistentOrderedSetIterator implements Iterator, KMutableIterator {
    public final PersistentOrderedSetBuilder d;
    public Object e;
    public boolean f;
    public int g;

    public PersistentOrderedSetMutableIterator(@NotNull PersistentOrderedSetBuilder persistentOrderedSetBuilder0) {
        Intrinsics.checkNotNullParameter(persistentOrderedSetBuilder0, "builder");
        super(persistentOrderedSetBuilder0.getFirstElement$kotlinx_collections_immutable(), persistentOrderedSetBuilder0.getHashMapBuilder$kotlinx_collections_immutable());
        this.d = persistentOrderedSetBuilder0;
        this.g = persistentOrderedSetBuilder0.getHashMapBuilder$kotlinx_collections_immutable().getModCount$kotlinx_collections_immutable();
    }

    @Override  // kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSetIterator
    public Object next() {
        if(this.d.getHashMapBuilder$kotlinx_collections_immutable().getModCount$kotlinx_collections_immutable() != this.g) {
            throw new ConcurrentModificationException();
        }
        Object object0 = super.next();
        this.e = object0;
        this.f = true;
        return object0;
    }

    @Override  // kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSetIterator
    public void remove() {
        if(!this.f) {
            throw new IllegalStateException();
        }
        Object object0 = this.e;
        TypeIntrinsics.asMutableCollection(this.d).remove(object0);
        this.e = null;
        this.f = false;
        this.g = this.d.getHashMapBuilder$kotlinx_collections_immutable().getModCount$kotlinx_collections_immutable();
        this.setIndex$kotlinx_collections_immutable(this.getIndex$kotlinx_collections_immutable() - 1);
    }
}

