package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\u000B\u001A\u00020\nH\u0016¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSetMutableIterator;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSetIterator;", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSetBuilder;", "builder", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSetBuilder;)V", "next", "()Ljava/lang/Object;", "", "remove", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PersistentOrderedSetMutableIterator extends PersistentOrderedSetIterator implements Iterator, KMutableIterator {
    public static final int $stable = 8;
    public final PersistentOrderedSetBuilder d;
    public Object e;
    public boolean f;
    public int g;

    public PersistentOrderedSetMutableIterator(@NotNull PersistentOrderedSetBuilder persistentOrderedSetBuilder0) {
        super(persistentOrderedSetBuilder0.getFirstElement$runtime_release(), persistentOrderedSetBuilder0.getHashMapBuilder$runtime_release());
        this.d = persistentOrderedSetBuilder0;
        this.g = persistentOrderedSetBuilder0.getHashMapBuilder$runtime_release().getModCount$runtime_release();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSetIterator
    public Object next() {
        if(this.d.getHashMapBuilder$runtime_release().getModCount$runtime_release() != this.g) {
            throw new ConcurrentModificationException();
        }
        Object object0 = super.next();
        this.e = object0;
        this.f = true;
        return object0;
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSetIterator
    public void remove() {
        if(!this.f) {
            throw new IllegalStateException();
        }
        Object object0 = this.e;
        TypeIntrinsics.asMutableCollection(this.d).remove(object0);
        this.e = null;
        this.f = false;
        this.g = this.d.getHashMapBuilder$runtime_release().getModCount$runtime_release();
        this.setIndex$runtime_release(this.getIndex$runtime_release() - 1);
    }
}

