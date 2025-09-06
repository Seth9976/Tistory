package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractSet;
import kotlin.collections.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u001E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 ,*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001,B\u001D\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00028\u0000H\u0096\u0002\u00A2\u0006\u0004\b\f\u0010\rJ\u001D\u0010\u000E\u001A\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\n\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b\u000E\u0010\u000FJ#\u0010\u0012\u001A\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0016\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u001D\u0010\u0014\u001A\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\n\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b\u0014\u0010\u000FJ#\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0016\u00A2\u0006\u0004\b\u0015\u0010\u0013J)\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00000\u00032\u0012\u0010\u0017\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000B0\u0016H\u0016\u00A2\u0006\u0004\b\u0015\u0010\u0018J#\u0010\u0019\u001A\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0016\u00A2\u0006\u0004\b\u0019\u0010\u0013J\u001D\u0010\u001A\u001A\u00020\u000B2\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0016\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u0015\u0010\u001C\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0016\u0010\u001F\u001A\b\u0012\u0004\u0012\u00028\u00000\u001EH\u0096\u0002\u00A2\u0006\u0004\b\u001F\u0010 J\u0015\u0010\"\u001A\b\u0012\u0004\u0012\u00028\u00000!H\u0016\u00A2\u0006\u0004\b\"\u0010#R \u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u00048\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b$\u0010%\u001A\u0004\b&\u0010\'R\u001A\u0010\u0007\u001A\u00020\u00068\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b(\u0010)\u001A\u0004\b*\u0010+\u00A8\u0006-"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet;", "E", "Lkotlin/collections/AbstractSet;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "node", "", "size", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;I)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "add", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "", "elements", "addAll", "(Ljava/util/Collection;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "remove", "removeAll", "Lkotlin/Function1;", "predicate", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "retainAll", "containsAll", "(Ljava/util/Collection;)Z", "clear", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "", "iterator", "()Ljava/util/Iterator;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet$Builder;", "builder", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet$Builder;", "a", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "getNode$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "b", "I", "getSize", "()I", "Companion", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPersistentHashSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentHashSet.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n1#1,72:1\n31#2:73\n31#2:74\n31#2:75\n31#2:76\n*S KotlinDebug\n*F\n+ 1 PersistentHashSet.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet\n*L\n24#1:73\n34#1:74\n38#1:75\n42#1:76\n*E\n"})
public final class PersistentHashSet extends AbstractSet implements PersistentSet {
    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001J\u001B\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0001\u0010\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u001A\u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet$Companion;", "", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "emptyOf$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "emptyOf", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet;", "", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final PersistentSet emptyOf$runtime_release() {
            return PersistentHashSet.c;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final TrieNode a;
    public final int b;
    public static final PersistentHashSet c;

    static {
        PersistentHashSet.Companion = new Companion(null);
        PersistentHashSet.$stable = 8;
        PersistentHashSet.c = new PersistentHashSet(TrieNode.Companion.getEMPTY$runtime_release(), 0);
    }

    public PersistentHashSet(@NotNull TrieNode trieNode0, int v) {
        this.a = trieNode0;
        this.b = v;
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection add(Object object0) {
        return this.add(object0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    @NotNull
    public PersistentSet add(Object object0) {
        TrieNode trieNode0 = this.a.add((object0 == null ? 0 : object0.hashCode()), object0, 0);
        return this.a == trieNode0 ? this : new PersistentHashSet(trieNode0, this.size() + 1);
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
        return new PersistentHashSetBuilder(this);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection clear() {
        return this.clear();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    @NotNull
    public PersistentSet clear() {
        return PersistentHashSet.Companion.emptyOf$runtime_release();
    }

    @Override  // kotlin.collections.AbstractCollection
    public boolean contains(Object object0) {
        return object0 == null ? this.a.contains(0, null, 0) : this.a.contains(object0.hashCode(), object0, 0);
    }

    @Override  // kotlin.collections.AbstractCollection
    public boolean containsAll(@NotNull Collection collection0) {
        TrieNode trieNode0 = this.a;
        if(collection0 instanceof PersistentHashSet) {
            return trieNode0.containsAll(((PersistentHashSet)collection0).a, 0);
        }
        return collection0 instanceof PersistentHashSetBuilder ? trieNode0.containsAll(((PersistentHashSetBuilder)collection0).getNode$runtime_release(), 0) : super.containsAll(collection0);
    }

    @NotNull
    public final TrieNode getNode$runtime_release() {
        return this.a;
    }

    @Override  // kotlin.collections.AbstractCollection
    public int getSize() {
        return this.b;
    }

    @Override  // kotlin.collections.AbstractSet
    @NotNull
    public Iterator iterator() {
        return new PersistentHashSetIterator(this.a);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection remove(Object object0) {
        return this.remove(object0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    @NotNull
    public PersistentSet remove(Object object0) {
        TrieNode trieNode0 = this.a.remove((object0 == null ? 0 : object0.hashCode()), object0, 0);
        return this.a == trieNode0 ? this : new PersistentHashSet(trieNode0, this.size() - 1);
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

