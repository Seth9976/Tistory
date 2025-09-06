package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0010\b\n\u0002\b\u000B\n\u0002\u0010#\n\u0002\u0010\'\n\u0002\b\u0005\n\u0002\u0010\u001F\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\u001B\u0012\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u00A2\u0006\u0004\b\u0007\u0010\bJ\u001B\u0010\t\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0016\u00A2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b\r\u0010\u000EJ\u001A\u0010\u000F\u001A\u0004\u0018\u00018\u00012\u0006\u0010\u000B\u001A\u00028\u0000H\u0096\u0002\u00A2\u0006\u0004\b\u000F\u0010\u0010J!\u0010\u0012\u001A\u0004\u0018\u00018\u00012\u0006\u0010\u000B\u001A\u00028\u00002\u0006\u0010\u0011\u001A\u00028\u0001H\u0016\u00A2\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0017\u001A\u00020\u00162\u0014\u0010\u0015\u001A\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014H\u0016\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001A\u0004\u0018\u00018\u00012\u0006\u0010\u000B\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b\u0019\u0010\u0010J\u001D\u0010\u0019\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00028\u00002\u0006\u0010\u0011\u001A\u00028\u0001\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u000F\u0010\u001B\u001A\u00020\u0016H\u0016\u00A2\u0006\u0004\b\u001B\u0010\u001CR*\u0010%\u001A\u00020\u001D2\u0006\u0010\u001E\u001A\u00020\u001D8\u0006@DX\u0086\u000E\u00A2\u0006\u0012\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\"\"\u0004\b#\u0010$R.\u0010-\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010&8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b\'\u0010(\u001A\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u00104\u001A\u0004\u0018\u00018\u00018\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b.\u0010/\u001A\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010<\u001A\u0002058\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b6\u00107\u001A\u0004\b8\u00109\"\u0004\b:\u0010;R*\u0010@\u001A\u0002052\u0006\u0010\u0011\u001A\u0002058\u0016@VX\u0096\u000E\u00A2\u0006\u0012\n\u0004\b=\u00107\u001A\u0004\b>\u00109\"\u0004\b?\u0010;R&\u0010E\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010B0A8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bC\u0010DR\u001A\u0010G\u001A\b\u0012\u0004\u0012\u00028\u00000A8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bF\u0010DR\u001A\u0010K\u001A\b\u0012\u0004\u0012\u00028\u00010H8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bI\u0010J\u00A8\u0006L"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap$Builder;", "Lkotlin/collections/AbstractMutableMap;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "map", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;)V", "build", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "from", "", "putAll", "(Ljava/util/Map;)V", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "clear", "()V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "<set-?>", "b", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "getOwnership", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "setOwnership", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)V", "ownership", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "c", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "getNode$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "setNode$runtime_release", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;)V", "node", "d", "Ljava/lang/Object;", "getOperationResult$runtime_release", "()Ljava/lang/Object;", "setOperationResult$runtime_release", "(Ljava/lang/Object;)V", "operationResult", "", "e", "I", "getModCount$runtime_release", "()I", "setModCount$runtime_release", "(I)V", "modCount", "f", "getSize", "setSize", "size", "", "", "getEntries", "()Ljava/util/Set;", "entries", "getKeys", "keys", "", "getValues", "()Ljava/util/Collection;", "values", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public class PersistentHashMapBuilder extends AbstractMutableMap implements Builder {
    public static final int $stable = 8;
    public PersistentHashMap a;
    public MutabilityOwnership b;
    public TrieNode c;
    public Object d;
    public int e;
    public int f;

    public PersistentHashMapBuilder(@NotNull PersistentHashMap persistentHashMap0) {
        this.a = persistentHashMap0;
        this.b = new MutabilityOwnership();
        this.c = this.a.getNode$runtime_release();
        this.f = this.a.size();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap$Builder
    public PersistentMap build() {
        return this.build();
    }

    @NotNull
    public PersistentHashMap build() {
        PersistentHashMap persistentHashMap0;
        if(this.c == this.a.getNode$runtime_release()) {
            persistentHashMap0 = this.a;
        }
        else {
            this.b = new MutabilityOwnership();
            persistentHashMap0 = new PersistentHashMap(this.c, this.size());
        }
        this.a = persistentHashMap0;
        return persistentHashMap0;
    }

    @Override
    public void clear() {
        TrieNode trieNode0 = TrieNode.Companion.getEMPTY$runtime_release();
        Intrinsics.checkNotNull(trieNode0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.c = trieNode0;
        this.setSize(0);
    }

    @Override
    public boolean containsKey(Object object0) {
        TrieNode trieNode0 = this.c;
        return object0 == null ? trieNode0.containsKey(0, null, 0) : trieNode0.containsKey(object0.hashCode(), object0, 0);
    }

    @Override
    @Nullable
    public Object get(Object object0) {
        TrieNode trieNode0 = this.c;
        return object0 == null ? trieNode0.get(0, null, 0) : trieNode0.get(object0.hashCode(), object0, 0);
    }

    @Override  // kotlin.collections.AbstractMutableMap
    @NotNull
    public Set getEntries() {
        return new PersistentHashMapBuilderEntries(this);
    }

    @Override  // kotlin.collections.AbstractMutableMap
    @NotNull
    public Set getKeys() {
        return new PersistentHashMapBuilderKeys(this);
    }

    public final int getModCount$runtime_release() {
        return this.e;
    }

    @NotNull
    public final TrieNode getNode$runtime_release() {
        return this.c;
    }

    @Nullable
    public final Object getOperationResult$runtime_release() {
        return this.d;
    }

    @NotNull
    public final MutabilityOwnership getOwnership() {
        return this.b;
    }

    @Override  // kotlin.collections.AbstractMutableMap
    public int getSize() {
        return this.f;
    }

    @Override  // kotlin.collections.AbstractMutableMap
    @NotNull
    public Collection getValues() {
        return new PersistentHashMapBuilderValues(this);
    }

    @Override  // kotlin.collections.AbstractMutableMap
    @Nullable
    public Object put(Object object0, Object object1) {
        this.d = null;
        this.c = this.c.mutablePut((object0 == null ? 0 : object0.hashCode()), object0, object1, 0, this);
        return this.d;
    }

    @Override
    public void putAll(@NotNull Map map0) {
        PersistentHashMap persistentHashMap0 = map0 instanceof PersistentHashMap ? ((PersistentHashMap)map0) : null;
        if(persistentHashMap0 == null) {
            PersistentHashMapBuilder persistentHashMapBuilder0 = map0 instanceof PersistentHashMapBuilder ? ((PersistentHashMapBuilder)map0) : null;
            persistentHashMap0 = persistentHashMapBuilder0 == null ? null : persistentHashMapBuilder0.build();
        }
        if(persistentHashMap0 == null) {
            super.putAll(map0);
        }
        else {
            DeltaCounter deltaCounter0 = new DeltaCounter(0, 1, null);
            int v = this.size();
            TrieNode trieNode0 = this.c;
            TrieNode trieNode1 = persistentHashMap0.getNode$runtime_release();
            Intrinsics.checkNotNull(trieNode1, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
            this.c = trieNode0.mutablePutAll(trieNode1, 0, deltaCounter0, this);
            int v1 = persistentHashMap0.size() + v - deltaCounter0.getCount();
            if(v != v1) {
                this.setSize(v1);
            }
        }
    }

    @Override
    @Nullable
    public Object remove(Object object0) {
        this.d = null;
        TrieNode trieNode0 = this.c.mutableRemove((object0 == null ? 0 : object0.hashCode()), object0, 0, this);
        if(trieNode0 == null) {
            trieNode0 = TrieNode.Companion.getEMPTY$runtime_release();
            Intrinsics.checkNotNull(trieNode0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.c = trieNode0;
        return this.d;
    }

    @Override
    public final boolean remove(Object object0, Object object1) {
        int v = this.size();
        TrieNode trieNode0 = this.c.mutableRemove((object0 == null ? 0 : object0.hashCode()), object0, object1, 0, this);
        if(trieNode0 == null) {
            trieNode0 = TrieNode.Companion.getEMPTY$runtime_release();
            Intrinsics.checkNotNull(trieNode0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.c = trieNode0;
        return v != this.size();
    }

    public final void setModCount$runtime_release(int v) {
        this.e = v;
    }

    public final void setNode$runtime_release(@NotNull TrieNode trieNode0) {
        this.c = trieNode0;
    }

    public final void setOperationResult$runtime_release(@Nullable Object object0) {
        this.d = object0;
    }

    public final void setOwnership(@NotNull MutabilityOwnership mutabilityOwnership0) {
        this.b = mutabilityOwnership0;
    }

    public void setSize(int v) {
        this.f = v;
        ++this.e;
    }
}

