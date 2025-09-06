package kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableSet;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001B\u0012\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u0016\u0010\u0011\u001A\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001A\u00020\n2\u0006\u0010\t\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\fJ\u0018\u0010\u0014\u001A\u00020\n2\u0006\u0010\t\u001A\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\fR\u0014\u0010\u0018\u001A\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilderKeys;", "K", "V", "", "Lkotlin/collections/AbstractMutableSet;", "Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "builder", "<init>", "(Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)V", "element", "", "add", "(Ljava/lang/Object;)Z", "", "clear", "()V", "", "iterator", "()Ljava/util/Iterator;", "remove", "contains", "", "getSize", "()I", "size", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PersistentHashMapBuilderKeys extends AbstractMutableSet implements Set, KMutableSet {
    public final PersistentHashMapBuilder a;

    public PersistentHashMapBuilderKeys(@NotNull PersistentHashMapBuilder persistentHashMapBuilder0) {
        Intrinsics.checkNotNullParameter(persistentHashMapBuilder0, "builder");
        super();
        this.a = persistentHashMapBuilder0;
    }

    @Override  // kotlin.collections.AbstractMutableSet
    public boolean add(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        this.a.clear();
    }

    @Override
    public boolean contains(Object object0) {
        return this.a.containsKey(object0);
    }

    @Override  // kotlin.collections.AbstractMutableSet
    public int getSize() {
        return this.a.size();
    }

    @Override
    @NotNull
    public Iterator iterator() {
        return new PersistentHashMapBuilderKeysIterator(this.a);
    }

    @Override
    public boolean remove(Object object0) {
        PersistentHashMapBuilder persistentHashMapBuilder0 = this.a;
        if(persistentHashMapBuilder0.containsKey(object0)) {
            persistentHashMapBuilder0.remove(object0);
            return true;
        }
        return false;
    }
}

