package kotlinx.collections.immutable.implementations.persistentOrderedSet;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractSet;
import kotlin.collections.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.PersistentCollection;
import kotlinx.collections.immutable.PersistentSet.Builder;
import kotlinx.collections.immutable.PersistentSet;
import kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import kotlinx.collections.immutable.internal.EndOfChain;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rf.a;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u001E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0010\b\u0000\u0018\u0000 5*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u00015B/\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0004\u0012\u0012\u0010\t\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007\u00A2\u0006\u0004\b\n\u0010\u000BJ\u0018\u0010\u000E\u001A\u00020\r2\u0006\u0010\f\u001A\u00028\u0000H\u0096\u0002\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u001D\u0010\u0010\u001A\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\f\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001A\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u001D\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\f\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b\u0016\u0010\u0011J#\u0010\u0017\u001A\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016\u00A2\u0006\u0004\b\u0017\u0010\u0015J)\u0010\u0017\u001A\b\u0012\u0004\u0012\u00028\u00000\u00032\u0012\u0010\u0019\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\u0018H\u0016\u00A2\u0006\u0004\b\u0017\u0010\u001AJ#\u0010\u001B\u001A\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016\u00A2\u0006\u0004\b\u001B\u0010\u0015J\u0015\u0010\u001C\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0016\u0010\u001F\u001A\b\u0012\u0004\u0012\u00028\u00000\u001EH\u0096\u0002\u00A2\u0006\u0004\b\u001F\u0010 J\u0015\u0010\"\u001A\b\u0012\u0004\u0012\u00028\u00000!H\u0016\u00A2\u0006\u0004\b\"\u0010#J\u001A\u0010%\u001A\u00020\r2\b\u0010$\u001A\u0004\u0018\u00010\u0004H\u0096\u0002\u00A2\u0006\u0004\b%\u0010\u000FJ\u000F\u0010\'\u001A\u00020&H\u0016\u00A2\u0006\u0004\b\'\u0010(R\u001C\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b)\u0010*\u001A\u0004\b+\u0010,R\u001C\u0010\u0006\u001A\u0004\u0018\u00010\u00048\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b-\u0010*\u001A\u0004\b.\u0010,R&\u0010\t\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u00078\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b/\u00100\u001A\u0004\b1\u00102R\u0014\u00104\u001A\u00020&8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b3\u0010(\u00A8\u00066"}, d2 = {"Lkotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet;", "E", "Lkotlin/collections/AbstractSet;", "Lkotlinx/collections/immutable/PersistentSet;", "", "firstElement", "lastElement", "Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "Lkotlinx/collections/immutable/implementations/persistentOrderedSet/Links;", "hashMap", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "add", "(Ljava/lang/Object;)Lkotlinx/collections/immutable/PersistentSet;", "", "elements", "addAll", "(Ljava/util/Collection;)Lkotlinx/collections/immutable/PersistentSet;", "remove", "removeAll", "Lkotlin/Function1;", "predicate", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/collections/immutable/PersistentSet;", "retainAll", "clear", "()Lkotlinx/collections/immutable/PersistentSet;", "", "iterator", "()Ljava/util/Iterator;", "Lkotlinx/collections/immutable/PersistentSet$Builder;", "builder", "()Lkotlinx/collections/immutable/PersistentSet$Builder;", "other", "equals", "", "hashCode", "()I", "a", "Ljava/lang/Object;", "getFirstElement$kotlinx_collections_immutable", "()Ljava/lang/Object;", "b", "getLastElement$kotlinx_collections_immutable", "c", "Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "getHashMap$kotlinx_collections_immutable", "()Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "getSize", "size", "Companion", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPersistentOrderedSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentOrderedSet.kt\nkotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet\n+ 2 extensions.kt\nkotlinx/collections/immutable/ExtensionsKt\n*L\n1#1,131:1\n31#2:132\n31#2:133\n31#2:134\n31#2:135\n*S KotlinDebug\n*F\n+ 1 PersistentOrderedSet.kt\nkotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet\n*L\n56#1:132\n81#1:133\n85#1:134\n89#1:135\n*E\n"})
public final class PersistentOrderedSet extends AbstractSet implements PersistentSet {
    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001J\u001B\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0001\u0010\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u001A\u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Lkotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet$Companion;", "", "E", "Lkotlinx/collections/immutable/PersistentSet;", "emptyOf$kotlinx_collections_immutable", "()Lkotlinx/collections/immutable/PersistentSet;", "emptyOf", "Lkotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet;", "", "EMPTY", "Lkotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet;", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final PersistentSet emptyOf$kotlinx_collections_immutable() {
            return PersistentOrderedSet.d;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final Object a;
    public final Object b;
    public final PersistentHashMap c;
    public static final PersistentOrderedSet d;

    static {
        PersistentOrderedSet.Companion = new Companion(null);
        PersistentHashMap persistentHashMap0 = PersistentHashMap.Companion.emptyOf$kotlinx_collections_immutable();
        PersistentOrderedSet.d = new PersistentOrderedSet(EndOfChain.INSTANCE, EndOfChain.INSTANCE, persistentHashMap0);
    }

    public PersistentOrderedSet(@Nullable Object object0, @Nullable Object object1, @NotNull PersistentHashMap persistentHashMap0) {
        Intrinsics.checkNotNullParameter(persistentHashMap0, "hashMap");
        super();
        this.a = object0;
        this.b = object1;
        this.c = persistentHashMap0;
    }

    @Override  // kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection add(Object object0) {
        return this.add(object0);
    }

    @Override  // kotlinx.collections.immutable.PersistentSet
    @NotNull
    public PersistentSet add(Object object0) {
        PersistentHashMap persistentHashMap0 = this.c;
        if(persistentHashMap0.containsKey(object0)) {
            return this;
        }
        if(this.isEmpty()) {
            return new PersistentOrderedSet(object0, object0, persistentHashMap0.put(object0, new Links()));
        }
        Object object1 = persistentHashMap0.get(this.b);
        Intrinsics.checkNotNull(object1);
        Links links0 = ((Links)object1).withNext(object0);
        PersistentHashMap persistentHashMap1 = persistentHashMap0.put(this.b, links0).put(object0, new Links(this.b));
        return new PersistentOrderedSet(this.a, object0, persistentHashMap1);
    }

    @Override  // kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection addAll(Collection collection0) {
        return this.addAll(collection0);
    }

    @Override  // kotlinx.collections.immutable.PersistentSet
    @NotNull
    public PersistentSet addAll(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        Builder persistentSet$Builder0 = this.builder();
        persistentSet$Builder0.addAll(collection0);
        return persistentSet$Builder0.build();
    }

    @Override  // kotlinx.collections.immutable.PersistentCollection
    public kotlinx.collections.immutable.PersistentCollection.Builder builder() {
        return this.builder();
    }

    @Override  // kotlinx.collections.immutable.PersistentSet
    @NotNull
    public Builder builder() {
        return new PersistentOrderedSetBuilder(this);
    }

    @Override  // kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection clear() {
        return this.clear();
    }

    @Override  // kotlinx.collections.immutable.PersistentSet
    @NotNull
    public PersistentSet clear() {
        return PersistentOrderedSet.Companion.emptyOf$kotlinx_collections_immutable();
    }

    @Override  // kotlin.collections.AbstractCollection
    public boolean contains(Object object0) {
        return this.c.containsKey(object0);
    }

    @Override  // kotlin.collections.AbstractSet
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
        PersistentHashMap persistentHashMap0 = this.c;
        if(((Set)object0) instanceof PersistentOrderedSet) {
            return persistentHashMap0.getNode$kotlinx_collections_immutable().equalsWith$kotlinx_collections_immutable(((PersistentOrderedSet)object0).c.getNode$kotlinx_collections_immutable(), a.x);
        }
        return ((Set)object0) instanceof PersistentOrderedSetBuilder ? persistentHashMap0.getNode$kotlinx_collections_immutable().equalsWith$kotlinx_collections_immutable(((PersistentOrderedSetBuilder)object0).getHashMapBuilder$kotlinx_collections_immutable().getNode$kotlinx_collections_immutable(), a.y) : super.equals(object0);
    }

    @Nullable
    public final Object getFirstElement$kotlinx_collections_immutable() {
        return this.a;
    }

    @NotNull
    public final PersistentHashMap getHashMap$kotlinx_collections_immutable() {
        return this.c;
    }

    @Nullable
    public final Object getLastElement$kotlinx_collections_immutable() {
        return this.b;
    }

    @Override  // kotlin.collections.AbstractCollection
    public int getSize() {
        return this.c.size();
    }

    @Override  // kotlin.collections.AbstractSet
    public int hashCode() {
        return super.hashCode();
    }

    @Override  // kotlin.collections.AbstractSet
    @NotNull
    public Iterator iterator() {
        return new PersistentOrderedSetIterator(this.a, this.c);
    }

    @Override  // kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection remove(Object object0) {
        return this.remove(object0);
    }

    @Override  // kotlinx.collections.immutable.PersistentSet
    @NotNull
    public PersistentSet remove(Object object0) {
        PersistentHashMap persistentHashMap0 = this.c;
        Links links0 = (Links)persistentHashMap0.get(object0);
        if(links0 == null) {
            return this;
        }
        PersistentHashMap persistentHashMap1 = persistentHashMap0.remove(object0);
        if(links0.getHasPrevious()) {
            Object object1 = persistentHashMap1.get(links0.getPrevious());
            Intrinsics.checkNotNull(object1);
            persistentHashMap1 = persistentHashMap1.put(links0.getPrevious(), ((Links)object1).withNext(links0.getNext()));
        }
        if(links0.getHasNext()) {
            Object object2 = persistentHashMap1.get(links0.getNext());
            Intrinsics.checkNotNull(object2);
            persistentHashMap1 = persistentHashMap1.put(links0.getNext(), ((Links)object2).withPrevious(links0.getPrevious()));
        }
        Object object3 = links0.getHasPrevious() ? this.a : links0.getNext();
        return links0.getHasNext() ? new PersistentOrderedSet(object3, this.b, persistentHashMap1) : new PersistentOrderedSet(object3, links0.getPrevious(), persistentHashMap1);
    }

    @Override  // kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection removeAll(Collection collection0) {
        return this.removeAll(collection0);
    }

    @Override  // kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection removeAll(Function1 function10) {
        return this.removeAll(function10);
    }

    @Override  // kotlinx.collections.immutable.PersistentSet
    @NotNull
    public PersistentSet removeAll(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        Builder persistentSet$Builder0 = this.builder();
        persistentSet$Builder0.removeAll(collection0);
        return persistentSet$Builder0.build();
    }

    @Override  // kotlinx.collections.immutable.PersistentSet
    @NotNull
    public PersistentSet removeAll(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "predicate");
        Builder persistentSet$Builder0 = this.builder();
        o.removeAll(persistentSet$Builder0, function10);
        return persistentSet$Builder0.build();
    }

    @Override  // kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection retainAll(Collection collection0) {
        return this.retainAll(collection0);
    }

    @Override  // kotlinx.collections.immutable.PersistentSet
    @NotNull
    public PersistentSet retainAll(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        Builder persistentSet$Builder0 = this.builder();
        persistentSet$Builder0.retainAll(collection0);
        return persistentSet$Builder0.build();
    }
}

