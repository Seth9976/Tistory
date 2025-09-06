package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractSet;
import kotlin.collections.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u001E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u0000 2*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u00012B/\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0004\u0012\u0012\u0010\t\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007\u00A2\u0006\u0004\b\n\u0010\u000BJ\u0018\u0010\u000E\u001A\u00020\r2\u0006\u0010\f\u001A\u00028\u0000H\u0096\u0002\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u001D\u0010\u0010\u001A\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\f\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001A\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u001D\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\f\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b\u0016\u0010\u0011J#\u0010\u0017\u001A\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016\u00A2\u0006\u0004\b\u0017\u0010\u0015J)\u0010\u0017\u001A\b\u0012\u0004\u0012\u00028\u00000\u00032\u0012\u0010\u0019\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\u0018H\u0016\u00A2\u0006\u0004\b\u0017\u0010\u001AJ#\u0010\u001B\u001A\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016\u00A2\u0006\u0004\b\u001B\u0010\u0015J\u0015\u0010\u001C\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0016\u0010\u001F\u001A\b\u0012\u0004\u0012\u00028\u00000\u001EH\u0096\u0002\u00A2\u0006\u0004\b\u001F\u0010 J\u0015\u0010\"\u001A\b\u0012\u0004\u0012\u00028\u00000!H\u0016\u00A2\u0006\u0004\b\"\u0010#R\u001C\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b$\u0010%\u001A\u0004\b&\u0010\'R\u001C\u0010\u0006\u001A\u0004\u0018\u00010\u00048\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b(\u0010%\u001A\u0004\b)\u0010\'R&\u0010\t\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u00078\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b*\u0010+\u001A\u0004\b,\u0010-R\u0014\u00101\u001A\u00020.8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b/\u00100\u00A8\u00063"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet;", "E", "Lkotlin/collections/AbstractSet;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "", "firstElement", "lastElement", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/Links;", "hashMap", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "add", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "", "elements", "addAll", "(Ljava/util/Collection;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "remove", "removeAll", "Lkotlin/Function1;", "predicate", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "retainAll", "clear", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "", "iterator", "()Ljava/util/Iterator;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet$Builder;", "builder", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet$Builder;", "a", "Ljava/lang/Object;", "getFirstElement$runtime_release", "()Ljava/lang/Object;", "b", "getLastElement$runtime_release", "c", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "getHashMap$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "", "getSize", "()I", "size", "Companion", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPersistentOrderedSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentOrderedSet.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n1#1,109:1\n31#2:110\n31#2:111\n31#2:112\n31#2:113\n*S KotlinDebug\n*F\n+ 1 PersistentOrderedSet.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet\n*L\n56#1:110\n81#1:111\n85#1:112\n89#1:113\n*E\n"})
public final class PersistentOrderedSet extends AbstractSet implements PersistentSet {
    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001J\u001B\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0001\u0010\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u001A\u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet$Companion;", "", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "emptyOf$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "emptyOf", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet;", "", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final PersistentSet emptyOf$runtime_release() {
            return PersistentOrderedSet.d;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final Object a;
    public final Object b;
    public final PersistentHashMap c;
    public static final PersistentOrderedSet d;

    static {
        PersistentOrderedSet.Companion = new Companion(null);
        PersistentOrderedSet.$stable = 8;
        PersistentHashMap persistentHashMap0 = PersistentHashMap.Companion.emptyOf$runtime_release();
        PersistentOrderedSet.d = new PersistentOrderedSet(EndOfChain.INSTANCE, EndOfChain.INSTANCE, persistentHashMap0);
    }

    public PersistentOrderedSet(@Nullable Object object0, @Nullable Object object1, @NotNull PersistentHashMap persistentHashMap0) {
        this.a = object0;
        this.b = object1;
        this.c = persistentHashMap0;
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection add(Object object0) {
        return this.add(object0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
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

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection addAll(Collection collection0) {
        return this.addAll(collection0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    @NotNull
    public PersistentSet addAll(@NotNull Collection collection0) {
        Builder persistentSet$Builder0 = this.builder();
        persistentSet$Builder0.addAll(collection0);
        return persistentSet$Builder0.build();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder builder() {
        return this.builder();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    @NotNull
    public Builder builder() {
        return new PersistentOrderedSetBuilder(this);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection clear() {
        return this.clear();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    @NotNull
    public PersistentSet clear() {
        return PersistentOrderedSet.Companion.emptyOf$runtime_release();
    }

    @Override  // kotlin.collections.AbstractCollection
    public boolean contains(Object object0) {
        return this.c.containsKey(object0);
    }

    @Nullable
    public final Object getFirstElement$runtime_release() {
        return this.a;
    }

    @NotNull
    public final PersistentHashMap getHashMap$runtime_release() {
        return this.c;
    }

    @Nullable
    public final Object getLastElement$runtime_release() {
        return this.b;
    }

    @Override  // kotlin.collections.AbstractCollection
    public int getSize() {
        return this.c.size();
    }

    @Override  // kotlin.collections.AbstractSet
    @NotNull
    public Iterator iterator() {
        return new PersistentOrderedSetIterator(this.a, this.c);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection remove(Object object0) {
        return this.remove(object0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
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

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection removeAll(Collection collection0) {
        return this.removeAll(collection0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection removeAll(Function1 function10) {
        return this.removeAll(function10);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    @NotNull
    public PersistentSet removeAll(@NotNull Collection collection0) {
        Builder persistentSet$Builder0 = this.builder();
        persistentSet$Builder0.removeAll(collection0);
        return persistentSet$Builder0.build();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    @NotNull
    public PersistentSet removeAll(@NotNull Function1 function10) {
        Builder persistentSet$Builder0 = this.builder();
        o.removeAll(persistentSet$Builder0, function10);
        return persistentSet$Builder0.build();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection retainAll(Collection collection0) {
        return this.retainAll(collection0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    @NotNull
    public PersistentSet retainAll(@NotNull Collection collection0) {
        Builder persistentSet$Builder0 = this.builder();
        persistentSet$Builder0.retainAll(collection0);
        return persistentSet$Builder0.build();
    }
}

