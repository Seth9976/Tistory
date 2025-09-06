package kotlinx.collections.immutable.implementations.persistentOrderedSet;

import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.PersistentCollection;
import kotlinx.collections.immutable.PersistentSet.Builder;
import kotlinx.collections.immutable.PersistentSet;
import kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import kotlinx.collections.immutable.internal.EndOfChain;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rf.a;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001A\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000EJ\u0017\u0010\u000F\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u000F\u0010\u000EJ\u0017\u0010\u0010\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u000EJ\u000F\u0010\u0012\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001A\u0010\u0019\u001A\u00020\f2\b\u0010\u0018\u001A\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u000EJ\u000F\u0010\u001B\u001A\u00020\u001AH\u0016¢\u0006\u0004\b\u001B\u0010\u001CR$\u0010#\u001A\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010 \"\u0004\b!\u0010\"R&\u0010*\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020%0$8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010\'\u001A\u0004\b(\u0010)R\u0014\u0010,\u001A\u00020\u001A8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b+\u0010\u001C¨\u0006-"}, d2 = {"Lkotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSetBuilder;", "E", "Lkotlin/collections/AbstractMutableSet;", "Lkotlinx/collections/immutable/PersistentSet$Builder;", "Lkotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet;", "set", "<init>", "(Lkotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet;)V", "Lkotlinx/collections/immutable/PersistentSet;", "build", "()Lkotlinx/collections/immutable/PersistentSet;", "element", "", "contains", "(Ljava/lang/Object;)Z", "add", "remove", "", "clear", "()V", "", "iterator", "()Ljava/util/Iterator;", "", "other", "equals", "", "hashCode", "()I", "b", "Ljava/lang/Object;", "getFirstElement$kotlinx_collections_immutable", "()Ljava/lang/Object;", "setFirstElement$kotlinx_collections_immutable", "(Ljava/lang/Object;)V", "firstElement", "Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "Lkotlinx/collections/immutable/implementations/persistentOrderedSet/Links;", "d", "Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "getHashMapBuilder$kotlinx_collections_immutable", "()Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "hashMapBuilder", "getSize", "size", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PersistentOrderedSetBuilder extends AbstractMutableSet implements Builder {
    public PersistentOrderedSet a;
    public Object b;
    public Object c;
    public final PersistentHashMapBuilder d;

    public PersistentOrderedSetBuilder(@NotNull PersistentOrderedSet persistentOrderedSet0) {
        Intrinsics.checkNotNullParameter(persistentOrderedSet0, "set");
        super();
        this.a = persistentOrderedSet0;
        this.b = persistentOrderedSet0.getFirstElement$kotlinx_collections_immutable();
        this.c = this.a.getLastElement$kotlinx_collections_immutable();
        this.d = this.a.getHashMap$kotlinx_collections_immutable().builder();
    }

    @Override  // kotlin.collections.AbstractMutableSet
    public boolean add(Object object0) {
        PersistentHashMapBuilder persistentHashMapBuilder0 = this.d;
        if(persistentHashMapBuilder0.containsKey(object0)) {
            return false;
        }
        if(this.isEmpty()) {
            this.b = object0;
            this.c = object0;
            persistentHashMapBuilder0.put(object0, new Links());
            return true;
        }
        Object object1 = persistentHashMapBuilder0.get(this.c);
        Intrinsics.checkNotNull(object1);
        persistentHashMapBuilder0.put(this.c, ((Links)object1).withNext(object0));
        persistentHashMapBuilder0.put(object0, new Links(this.c));
        this.c = object0;
        return true;
    }

    @Override  // kotlinx.collections.immutable.PersistentCollection$Builder
    public PersistentCollection build() {
        return this.build();
    }

    @Override  // kotlinx.collections.immutable.PersistentSet$Builder
    @NotNull
    public PersistentSet build() {
        PersistentOrderedSet persistentOrderedSet0;
        PersistentHashMap persistentHashMap0 = this.d.build();
        if(persistentHashMap0 == this.a.getHashMap$kotlinx_collections_immutable()) {
            boolean z = this.b != this.a.getFirstElement$kotlinx_collections_immutable();
            boolean z1 = this.c != this.a.getLastElement$kotlinx_collections_immutable();
            persistentOrderedSet0 = this.a;
        }
        else {
            persistentOrderedSet0 = new PersistentOrderedSet(this.b, this.c, persistentHashMap0);
        }
        this.a = persistentOrderedSet0;
        return persistentOrderedSet0;
    }

    @Override
    public void clear() {
        this.d.clear();
        this.b = EndOfChain.INSTANCE;
        this.c = EndOfChain.INSTANCE;
    }

    @Override
    public boolean contains(Object object0) {
        return this.d.containsKey(object0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof Set)) {
            return false;
        }
        if(this.size() != ((Set)object0).size()) {
            return false;
        }
        PersistentHashMapBuilder persistentHashMapBuilder0 = this.d;
        if(((Set)object0) instanceof PersistentOrderedSet) {
            return persistentHashMapBuilder0.getNode$kotlinx_collections_immutable().equalsWith$kotlinx_collections_immutable(((PersistentOrderedSet)object0).getHashMap$kotlinx_collections_immutable().getNode$kotlinx_collections_immutable(), a.z);
        }
        return ((Set)object0) instanceof PersistentOrderedSetBuilder ? persistentHashMapBuilder0.getNode$kotlinx_collections_immutable().equalsWith$kotlinx_collections_immutable(((PersistentOrderedSetBuilder)object0).d.getNode$kotlinx_collections_immutable(), a.A) : super.equals(object0);
    }

    @Nullable
    public final Object getFirstElement$kotlinx_collections_immutable() {
        return this.b;
    }

    @NotNull
    public final PersistentHashMapBuilder getHashMapBuilder$kotlinx_collections_immutable() {
        return this.d;
    }

    @Override  // kotlin.collections.AbstractMutableSet
    public int getSize() {
        return this.d.size();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    @NotNull
    public Iterator iterator() {
        return new PersistentOrderedSetMutableIterator(this);
    }

    @Override
    public boolean remove(Object object0) {
        PersistentHashMapBuilder persistentHashMapBuilder0 = this.d;
        Links links0 = (Links)persistentHashMapBuilder0.remove(object0);
        if(links0 == null) {
            return false;
        }
        if(links0.getHasPrevious()) {
            Object object1 = persistentHashMapBuilder0.get(links0.getPrevious());
            Intrinsics.checkNotNull(object1);
            persistentHashMapBuilder0.put(links0.getPrevious(), ((Links)object1).withNext(links0.getNext()));
        }
        else {
            this.b = links0.getNext();
        }
        if(links0.getHasNext()) {
            Object object2 = persistentHashMapBuilder0.get(links0.getNext());
            Intrinsics.checkNotNull(object2);
            persistentHashMapBuilder0.put(links0.getNext(), ((Links)object2).withPrevious(links0.getPrevious()));
            return true;
        }
        this.c = links0.getPrevious();
        return true;
    }

    public final void setFirstElement$kotlinx_collections_immutable(@Nullable Object object0) {
        this.b = object0;
    }
}

