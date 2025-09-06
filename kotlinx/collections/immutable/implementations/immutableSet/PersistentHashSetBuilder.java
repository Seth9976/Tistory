package kotlinx.collections.immutable.implementations.immutableSet;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.PersistentCollection;
import kotlinx.collections.immutable.PersistentSet.Builder;
import kotlinx.collections.immutable.PersistentSet;
import kotlinx.collections.immutable.internal.DeltaCounter;
import kotlinx.collections.immutable.internal.MutabilityOwnership;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u001E\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004\u00A2\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016\u00A2\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00028\u0000H\u0096\u0002\u00A2\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000E\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b\u000E\u0010\rJ\u001D\u0010\u0011\u001A\u00020\u000B2\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00028\u00000\u000FH\u0016\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u001D\u0010\u0013\u001A\u00020\u000B2\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00028\u00000\u000FH\u0016\u00A2\u0006\u0004\b\u0013\u0010\u0012J\u001D\u0010\u0014\u001A\u00020\u000B2\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00028\u00000\u000FH\u0016\u00A2\u0006\u0004\b\u0014\u0010\u0012J\u001D\u0010\u0015\u001A\u00020\u000B2\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00028\u00000\u000FH\u0016\u00A2\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0016\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b\u0016\u0010\rJ\u000F\u0010\u0018\u001A\u00020\u0017H\u0016\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001B\u001A\b\u0012\u0004\u0012\u00028\u00000\u001AH\u0096\u0002\u00A2\u0006\u0004\b\u001B\u0010\u001CR$\u0010#\u001A\u00020\u001D2\u0006\u0010\u001E\u001A\u00020\u001D8\u0000@BX\u0080\u000E\u00A2\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\"R0\u0010)\u001A\b\u0012\u0004\u0012\u00028\u00000$2\f\u0010\u001E\u001A\b\u0012\u0004\u0012\u00028\u00000$8\u0000@BX\u0080\u000E\u00A2\u0006\f\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010(R$\u0010/\u001A\u00020*2\u0006\u0010\u001E\u001A\u00020*8\u0000@BX\u0080\u000E\u00A2\u0006\f\n\u0004\b+\u0010,\u001A\u0004\b-\u0010.R*\u00105\u001A\u00020*2\u0006\u00100\u001A\u00020*8\u0016@VX\u0096\u000E\u00A2\u0006\u0012\n\u0004\b1\u0010,\u001A\u0004\b2\u0010.\"\u0004\b3\u00104\u00A8\u00066"}, d2 = {"Lkotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;", "E", "Lkotlin/collections/AbstractMutableSet;", "Lkotlinx/collections/immutable/PersistentSet$Builder;", "Lkotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet;", "set", "<init>", "(Lkotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet;)V", "build", "()Lkotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet;", "element", "", "contains", "(Ljava/lang/Object;)Z", "add", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "retainAll", "removeAll", "containsAll", "remove", "", "clear", "()V", "", "iterator", "()Ljava/util/Iterator;", "Lkotlinx/collections/immutable/internal/MutabilityOwnership;", "<set-?>", "b", "Lkotlinx/collections/immutable/internal/MutabilityOwnership;", "getOwnership$kotlinx_collections_immutable", "()Lkotlinx/collections/immutable/internal/MutabilityOwnership;", "ownership", "Lkotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "c", "Lkotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "getNode$kotlinx_collections_immutable", "()Lkotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "node", "", "d", "I", "getModCount$kotlinx_collections_immutable", "()I", "modCount", "value", "e", "getSize", "setSize", "(I)V", "size", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PersistentHashSetBuilder extends AbstractMutableSet implements Builder {
    public PersistentHashSet a;
    public MutabilityOwnership b;
    public TrieNode c;
    public int d;
    public int e;

    public PersistentHashSetBuilder(@NotNull PersistentHashSet persistentHashSet0) {
        Intrinsics.checkNotNullParameter(persistentHashSet0, "set");
        super();
        this.a = persistentHashSet0;
        this.b = new MutabilityOwnership();
        this.c = this.a.getNode$kotlinx_collections_immutable();
        this.e = this.a.size();
    }

    @Override  // kotlin.collections.AbstractMutableSet
    public boolean add(Object object0) {
        this.c = this.c.mutableAdd((object0 == null ? 0 : object0.hashCode()), object0, 0, this);
        return false;
    }

    @Override
    public boolean addAll(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        PersistentHashSet persistentHashSet0 = collection0 instanceof PersistentHashSet ? ((PersistentHashSet)collection0) : null;
        if(persistentHashSet0 == null) {
            PersistentHashSetBuilder persistentHashSetBuilder0 = collection0 instanceof PersistentHashSetBuilder ? ((PersistentHashSetBuilder)collection0) : null;
            persistentHashSet0 = persistentHashSetBuilder0 == null ? null : persistentHashSetBuilder0.build();
        }
        if(persistentHashSet0 != null) {
            DeltaCounter deltaCounter0 = new DeltaCounter(0, 1, null);
            int v = this.size();
            TrieNode trieNode0 = this.c.mutableAddAll(persistentHashSet0.getNode$kotlinx_collections_immutable(), 0, deltaCounter0, this);
            int v1 = collection0.size() + v - deltaCounter0.getCount();
            if(v != v1) {
                this.c = trieNode0;
                this.setSize(v1);
            }
            return v != this.size();
        }
        return super.addAll(collection0);
    }

    @Override  // kotlinx.collections.immutable.PersistentCollection$Builder
    public PersistentCollection build() {
        return this.build();
    }

    @Override  // kotlinx.collections.immutable.PersistentSet$Builder
    public PersistentSet build() {
        return this.build();
    }

    @NotNull
    public PersistentHashSet build() {
        PersistentHashSet persistentHashSet0;
        if(this.c == this.a.getNode$kotlinx_collections_immutable()) {
            persistentHashSet0 = this.a;
        }
        else {
            this.b = new MutabilityOwnership();
            persistentHashSet0 = new PersistentHashSet(this.c, this.size());
        }
        this.a = persistentHashSet0;
        return persistentHashSet0;
    }

    @Override
    public void clear() {
        TrieNode trieNode0 = TrieNode.Companion.getEMPTY$kotlinx_collections_immutable();
        Intrinsics.checkNotNull(trieNode0, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
        this.c = trieNode0;
        this.setSize(0);
    }

    @Override
    public boolean contains(Object object0) {
        TrieNode trieNode0 = this.c;
        return object0 == null ? trieNode0.contains(0, null, 0) : trieNode0.contains(object0.hashCode(), object0, 0);
    }

    @Override
    public boolean containsAll(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        if(collection0 instanceof PersistentHashSet) {
            return this.c.containsAll(((PersistentHashSet)collection0).getNode$kotlinx_collections_immutable(), 0);
        }
        return collection0 instanceof PersistentHashSetBuilder ? this.c.containsAll(((PersistentHashSetBuilder)collection0).c, 0) : super.containsAll(collection0);
    }

    public final int getModCount$kotlinx_collections_immutable() {
        return this.d;
    }

    @NotNull
    public final TrieNode getNode$kotlinx_collections_immutable() {
        return this.c;
    }

    @NotNull
    public final MutabilityOwnership getOwnership$kotlinx_collections_immutable() {
        return this.b;
    }

    @Override  // kotlin.collections.AbstractMutableSet
    public int getSize() {
        return this.e;
    }

    @Override
    @NotNull
    public Iterator iterator() {
        return new PersistentHashSetMutableIterator(this);
    }

    @Override
    public boolean remove(Object object0) {
        this.c = this.c.mutableRemove((object0 == null ? 0 : object0.hashCode()), object0, 0, this);
        return false;
    }

    @Override
    public boolean removeAll(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        PersistentHashSet persistentHashSet0 = collection0 instanceof PersistentHashSet ? ((PersistentHashSet)collection0) : null;
        if(persistentHashSet0 == null) {
            PersistentHashSetBuilder persistentHashSetBuilder0 = collection0 instanceof PersistentHashSetBuilder ? ((PersistentHashSetBuilder)collection0) : null;
            persistentHashSet0 = persistentHashSetBuilder0 == null ? null : persistentHashSetBuilder0.build();
        }
        if(persistentHashSet0 != null) {
            DeltaCounter deltaCounter0 = new DeltaCounter(0, 1, null);
            int v = this.size();
            Object object0 = this.c.mutableRemoveAll(persistentHashSet0.getNode$kotlinx_collections_immutable(), 0, deltaCounter0, this);
            int v1 = v - deltaCounter0.getCount();
            if(v1 == 0) {
                this.clear();
                return v != this.size();
            }
            if(v1 != v) {
                Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
                this.c = (TrieNode)object0;
                this.setSize(v1);
            }
            return v != this.size();
        }
        return super.removeAll(collection0);
    }

    @Override
    public boolean retainAll(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        PersistentHashSet persistentHashSet0 = collection0 instanceof PersistentHashSet ? ((PersistentHashSet)collection0) : null;
        if(persistentHashSet0 == null) {
            PersistentHashSetBuilder persistentHashSetBuilder0 = collection0 instanceof PersistentHashSetBuilder ? ((PersistentHashSetBuilder)collection0) : null;
            persistentHashSet0 = persistentHashSetBuilder0 == null ? null : persistentHashSetBuilder0.build();
        }
        if(persistentHashSet0 != null) {
            DeltaCounter deltaCounter0 = new DeltaCounter(0, 1, null);
            int v = this.size();
            Object object0 = this.c.mutableRetainAll(persistentHashSet0.getNode$kotlinx_collections_immutable(), 0, deltaCounter0, this);
            int v1 = deltaCounter0.getCount();
            if(v1 == 0) {
                this.clear();
                return v != this.size();
            }
            if(v1 != v) {
                Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
                this.c = (TrieNode)object0;
                this.setSize(v1);
            }
            return v != this.size();
        }
        return super.retainAll(collection0);
    }

    public void setSize(int v) {
        this.e = v;
        ++this.d;
    }
}

