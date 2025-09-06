package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.AbstractMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000 4*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u00014B#\u0012\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u00A2\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f0\u000BH\u0001\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0017\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u000F\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u001A\u0010\u0013\u001A\u0004\u0018\u00018\u00012\u0006\u0010\u000F\u001A\u00028\u0000H\u0096\u0002\u00A2\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0016\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u000F\u001A\u00028\u00002\u0006\u0010\u0015\u001A\u00028\u0001H\u0016\u00A2\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0018\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u000F\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u0018\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u000F\u001A\u00028\u00002\u0006\u0010\u0015\u001A\u00028\u0001H\u0016\u00A2\u0006\u0004\b\u0018\u0010\u0017J1\u0010\u001C\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0014\u0010\u001B\u001A\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001AH\u0016\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u001B\u0010\u001E\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u001B\u0010!\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 H\u0016\u00A2\u0006\u0004\b!\u0010\"R&\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b%\u0010&R\u001A\u0010\b\u001A\u00020\u00078\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b\'\u0010(\u001A\u0004\b)\u0010*R\u001A\u0010.\u001A\b\u0012\u0004\u0012\u00028\u00000+8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b,\u0010-R\u001A\u00102\u001A\b\u0012\u0004\u0012\u00028\u00010/8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b0\u00101R&\u00103\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f0+8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\r\u0010-\u00A8\u00065"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "K", "V", "Lkotlin/collections/AbstractMap;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "node", "", "size", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;I)V", "", "", "getEntries", "()Ljava/util/Set;", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "remove", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "", "m", "putAll", "(Ljava/util/Map;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "clear", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "builder", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "c", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "getNode$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "d", "I", "getSize", "()I", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "getKeys", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "keys", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "getValues", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "values", "entries", "Companion", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPersistentHashMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentHashMap.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n1#1,85:1\n53#2:86\n*S KotlinDebug\n*F\n+ 1 PersistentHashMap.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap\n*L\n69#1:86\n*E\n"})
public class PersistentHashMap extends AbstractMap implements PersistentMap {
    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001J\'\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\t\u001A\u000E\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap$Companion;", "", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "emptyOf$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "emptyOf", "", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final PersistentHashMap emptyOf$runtime_release() {
            PersistentHashMap persistentHashMap0 = PersistentHashMap.e;
            Intrinsics.checkNotNull(persistentHashMap0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
            return persistentHashMap0;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final TrieNode c;
    public final int d;
    public static final PersistentHashMap e;

    static {
        PersistentHashMap.Companion = new Companion(null);
        PersistentHashMap.$stable = 8;
        PersistentHashMap.e = new PersistentHashMap(TrieNode.Companion.getEMPTY$runtime_release(), 0);
    }

    public PersistentHashMap(@NotNull TrieNode trieNode0, int v) {
        this.c = trieNode0;
        this.d = v;
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public Builder builder() {
        return this.builder();
    }

    @NotNull
    public PersistentHashMapBuilder builder() {
        return new PersistentHashMapBuilder(this);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    @NotNull
    public PersistentMap clear() {
        return PersistentHashMap.Companion.emptyOf$runtime_release();
    }

    @Override  // kotlin.collections.AbstractMap
    public boolean containsKey(Object object0) {
        return object0 == null ? this.c.containsKey(0, null, 0) : this.c.containsKey(object0.hashCode(), object0, 0);
    }

    public final ImmutableSet entrySet() {
        return this.getEntries();
    }

    @Override  // kotlin.collections.AbstractMap
    @Nullable
    public Object get(Object object0) {
        return object0 == null ? this.c.get(0, null, 0) : this.c.get(object0.hashCode(), object0, 0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    @NotNull
    public ImmutableSet getEntries() {
        return new PersistentHashMapEntries(this);
    }

    @Override  // kotlin.collections.AbstractMap
    @PublishedApi
    @NotNull
    public final Set getEntries() {
        return new PersistentHashMapEntries(this);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    @NotNull
    public ImmutableSet getKeys() {
        return new PersistentHashMapKeys(this);
    }

    @Override  // kotlin.collections.AbstractMap
    public Set getKeys() {
        return this.getKeys();
    }

    @NotNull
    public final TrieNode getNode$runtime_release() {
        return this.c;
    }

    @Override  // kotlin.collections.AbstractMap
    public int getSize() {
        return this.d;
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    @NotNull
    public ImmutableCollection getValues() {
        return new PersistentHashMapValues(this);
    }

    @Override  // kotlin.collections.AbstractMap
    public Collection getValues() {
        return this.getValues();
    }

    public final ImmutableSet keySet() {
        return this.getKeys();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public PersistentMap put(Object object0, Object object1) {
        return this.put(object0, object1);
    }

    @NotNull
    public PersistentHashMap put(Object object0, Object object1) {
        ModificationResult trieNode$ModificationResult0 = this.c.put((object0 == null ? 0 : object0.hashCode()), object0, object1, 0);
        return trieNode$ModificationResult0 == null ? this : new PersistentHashMap(trieNode$ModificationResult0.getNode(), trieNode$ModificationResult0.getSizeDelta() + this.size());
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    @NotNull
    public PersistentMap putAll(@NotNull Map map0) {
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        Builder persistentMap$Builder0 = this.builder();
        persistentMap$Builder0.putAll(map0);
        return persistentMap$Builder0.build();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public PersistentMap remove(Object object0) {
        return this.remove(object0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public PersistentMap remove(Object object0, Object object1) {
        return this.remove(object0, object1);
    }

    @NotNull
    public PersistentHashMap remove(Object object0) {
        TrieNode trieNode0 = this.c.remove((object0 == null ? 0 : object0.hashCode()), object0, 0);
        if(this.c == trieNode0) {
            return this;
        }
        return trieNode0 == null ? PersistentHashMap.Companion.emptyOf$runtime_release() : new PersistentHashMap(trieNode0, this.size() - 1);
    }

    @NotNull
    public PersistentHashMap remove(Object object0, Object object1) {
        TrieNode trieNode0 = this.c.remove((object0 == null ? 0 : object0.hashCode()), object0, object1, 0);
        if(this.c == trieNode0) {
            return this;
        }
        return trieNode0 == null ? PersistentHashMap.Companion.emptyOf$runtime_release() : new PersistentHashMap(trieNode0, this.size() - 1);
    }

    public final ImmutableCollection values() {
        return this.getValues();
    }
}

