package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001A\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000EJ\u0017\u0010\u000F\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u000F\u0010\u000EJ\u0017\u0010\u0010\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u000EJ\u000F\u0010\u0012\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\u001E\u001A\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001B\"\u0004\b\u001C\u0010\u001DR&\u0010%\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020 0\u001F8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010$R\u0014\u0010)\u001A\u00020&8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\'\u0010(¨\u0006*"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSetBuilder;", "E", "Lkotlin/collections/AbstractMutableSet;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet$Builder;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet;", "set", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet;)V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "build", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "element", "", "contains", "(Ljava/lang/Object;)Z", "add", "remove", "", "clear", "()V", "", "iterator", "()Ljava/util/Iterator;", "", "b", "Ljava/lang/Object;", "getFirstElement$runtime_release", "()Ljava/lang/Object;", "setFirstElement$runtime_release", "(Ljava/lang/Object;)V", "firstElement", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/Links;", "d", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "getHashMapBuilder$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "hashMapBuilder", "", "getSize", "()I", "size", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PersistentOrderedSetBuilder extends AbstractMutableSet implements Builder {
    public static final int $stable = 8;
    public PersistentOrderedSet a;
    public Object b;
    public Object c;
    public final PersistentHashMapBuilder d;

    public PersistentOrderedSetBuilder(@NotNull PersistentOrderedSet persistentOrderedSet0) {
        this.a = persistentOrderedSet0;
        this.b = persistentOrderedSet0.getFirstElement$runtime_release();
        this.c = this.a.getLastElement$runtime_release();
        this.d = this.a.getHashMap$runtime_release().builder();
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

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection$Builder
    public PersistentCollection build() {
        return this.build();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet$Builder
    @NotNull
    public PersistentSet build() {
        PersistentOrderedSet persistentOrderedSet0;
        PersistentHashMap persistentHashMap0 = this.d.build();
        if(persistentHashMap0 == this.a.getHashMap$runtime_release()) {
            boolean z = this.b != this.a.getFirstElement$runtime_release();
            boolean z1 = this.c != this.a.getLastElement$runtime_release();
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

    @Nullable
    public final Object getFirstElement$runtime_release() {
        return this.b;
    }

    @NotNull
    public final PersistentHashMapBuilder getHashMapBuilder$runtime_release() {
        return this.d;
    }

    @Override  // kotlin.collections.AbstractMutableSet
    public int getSize() {
        return this.d.size();
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

    public final void setFirstElement$runtime_release(@Nullable Object object0) {
        this.b = object0;
    }
}

