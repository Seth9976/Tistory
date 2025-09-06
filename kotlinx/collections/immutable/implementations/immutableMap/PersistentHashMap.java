package kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.AbstractMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableCollection;
import kotlinx.collections.immutable.ImmutableSet;
import kotlinx.collections.immutable.PersistentMap.Builder;
import kotlinx.collections.immutable.PersistentMap;
import kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap;
import kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 8*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u00018B#\u0012\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u00A2\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f0\u000BH\u0001\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0017\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u000F\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u001A\u0010\u0013\u001A\u0004\u0018\u00018\u00012\u0006\u0010\u000F\u001A\u00028\u0000H\u0096\u0002\u00A2\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0016\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u000F\u001A\u00028\u00002\u0006\u0010\u0015\u001A\u00028\u0001H\u0016\u00A2\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0018\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u000F\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u0018\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u000F\u001A\u00028\u00002\u0006\u0010\u0015\u001A\u00028\u0001H\u0016\u00A2\u0006\u0004\b\u0018\u0010\u0017J1\u0010\u001C\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0014\u0010\u001B\u001A\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001AH\u0016\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u001B\u0010\u001E\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u001B\u0010!\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 H\u0016\u00A2\u0006\u0004\b!\u0010\"J\u001A\u0010%\u001A\u00020\u00102\b\u0010$\u001A\u0004\u0018\u00010#H\u0096\u0002\u00A2\u0006\u0004\b%\u0010\u0012J\u000F\u0010&\u001A\u00020\u0007H\u0016\u00A2\u0006\u0004\b&\u0010\'R&\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b(\u0010)\u001A\u0004\b*\u0010+R\u001A\u0010\b\u001A\u00020\u00078\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b,\u0010-\u001A\u0004\b.\u0010\'R\u001A\u00102\u001A\b\u0012\u0004\u0012\u00028\u00000/8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b0\u00101R\u001A\u00106\u001A\b\u0012\u0004\u0012\u00028\u0001038VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b4\u00105R&\u00107\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f0/8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\r\u00101\u00A8\u00069"}, d2 = {"Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "K", "V", "Lkotlin/collections/AbstractMap;", "Lkotlinx/collections/immutable/PersistentMap;", "Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "node", "", "size", "<init>", "(Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;I)V", "", "", "getEntries", "()Ljava/util/Set;", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "remove", "(Ljava/lang/Object;)Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "", "m", "putAll", "(Ljava/util/Map;)Lkotlinx/collections/immutable/PersistentMap;", "clear", "()Lkotlinx/collections/immutable/PersistentMap;", "Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "builder", "()Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "", "other", "equals", "hashCode", "()I", "c", "Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "getNode$kotlinx_collections_immutable", "()Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "d", "I", "getSize", "Lkotlinx/collections/immutable/ImmutableSet;", "getKeys", "()Lkotlinx/collections/immutable/ImmutableSet;", "keys", "Lkotlinx/collections/immutable/ImmutableCollection;", "getValues", "()Lkotlinx/collections/immutable/ImmutableCollection;", "values", "entries", "Companion", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPersistentHashMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentHashMap.kt\nkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap\n+ 2 extensions.kt\nkotlinx/collections/immutable/ExtensionsKt\n*L\n1#1,119:1\n53#2:120\n*S KotlinDebug\n*F\n+ 1 PersistentHashMap.kt\nkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap\n*L\n71#1:120\n*E\n"})
public final class PersistentHashMap extends AbstractMap implements PersistentMap {
    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001J\'\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\t\u001A\u000E\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap$Companion;", "", "K", "V", "Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "emptyOf$kotlinx_collections_immutable", "()Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "emptyOf", "", "EMPTY", "Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final PersistentHashMap emptyOf$kotlinx_collections_immutable() {
            PersistentHashMap persistentHashMap0 = PersistentHashMap.e;
            Intrinsics.checkNotNull(persistentHashMap0, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
            return persistentHashMap0;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final TrieNode c;
    public final int d;
    public static final PersistentHashMap e;

    static {
        PersistentHashMap.Companion = new Companion(null);
        PersistentHashMap.e = new PersistentHashMap(TrieNode.Companion.getEMPTY$kotlinx_collections_immutable(), 0);
    }

    public PersistentHashMap(@NotNull TrieNode trieNode0, int v) {
        Intrinsics.checkNotNullParameter(trieNode0, "node");
        super();
        this.c = trieNode0;
        this.d = v;
    }

    @Override  // kotlinx.collections.immutable.PersistentMap
    public Builder builder() {
        return this.builder();
    }

    @NotNull
    public PersistentHashMapBuilder builder() {
        return new PersistentHashMapBuilder(this);
    }

    @Override  // kotlinx.collections.immutable.PersistentMap
    @NotNull
    public PersistentMap clear() {
        return PersistentHashMap.Companion.emptyOf$kotlinx_collections_immutable();
    }

    @Override  // kotlin.collections.AbstractMap
    public boolean containsKey(Object object0) {
        return object0 == null ? this.c.containsKey(0, null, 0) : this.c.containsKey(object0.hashCode(), object0, 0);
    }

    public final ImmutableSet entrySet() {
        return this.getEntries();
    }

    @Override  // kotlin.collections.AbstractMap
    public boolean equals(@Nullable Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof Map)) {
            return false;
        }
        if(this.size() != ((Map)object0).size()) {
            return false;
        }
        TrieNode trieNode0 = this.c;
        if(((Map)object0) instanceof PersistentOrderedMap) {
            return trieNode0.equalsWith$kotlinx_collections_immutable(((PersistentOrderedMap)object0).getHashMap$kotlinx_collections_immutable().c, b.x);
        }
        if(((Map)object0) instanceof PersistentOrderedMapBuilder) {
            return trieNode0.equalsWith$kotlinx_collections_immutable(((PersistentOrderedMapBuilder)object0).getHashMapBuilder$kotlinx_collections_immutable().getNode$kotlinx_collections_immutable(), b.y);
        }
        if(((Map)object0) instanceof PersistentHashMap) {
            return trieNode0.equalsWith$kotlinx_collections_immutable(((PersistentHashMap)object0).c, b.z);
        }
        return ((Map)object0) instanceof PersistentHashMapBuilder ? trieNode0.equalsWith$kotlinx_collections_immutable(((PersistentHashMapBuilder)object0).getNode$kotlinx_collections_immutable(), b.A) : super.equals(object0);
    }

    @Override  // kotlin.collections.AbstractMap
    @Nullable
    public Object get(Object object0) {
        return object0 == null ? this.c.get(0, null, 0) : this.c.get(object0.hashCode(), object0, 0);
    }

    @Override  // kotlin.collections.AbstractMap
    @PublishedApi
    @NotNull
    public final Set getEntries() {
        return new PersistentHashMapEntries(this);
    }

    @Override  // kotlinx.collections.immutable.ImmutableMap
    @NotNull
    public ImmutableSet getEntries() {
        return new PersistentHashMapEntries(this);
    }

    @Override  // kotlin.collections.AbstractMap
    public Set getKeys() {
        return this.getKeys();
    }

    @Override  // kotlinx.collections.immutable.ImmutableMap
    @NotNull
    public ImmutableSet getKeys() {
        return new PersistentHashMapKeys(this);
    }

    @NotNull
    public final TrieNode getNode$kotlinx_collections_immutable() {
        return this.c;
    }

    @Override  // kotlin.collections.AbstractMap
    public int getSize() {
        return this.d;
    }

    @Override  // kotlin.collections.AbstractMap
    public Collection getValues() {
        return this.getValues();
    }

    @Override  // kotlinx.collections.immutable.ImmutableMap
    @NotNull
    public ImmutableCollection getValues() {
        return new PersistentHashMapValues(this);
    }

    @Override  // kotlin.collections.AbstractMap
    public int hashCode() {
        return super.hashCode();
    }

    public final ImmutableSet keySet() {
        return this.getKeys();
    }

    @Override  // kotlinx.collections.immutable.PersistentMap
    public PersistentMap put(Object object0, Object object1) {
        return this.put(object0, object1);
    }

    @NotNull
    public PersistentHashMap put(Object object0, Object object1) {
        ModificationResult trieNode$ModificationResult0 = this.c.put((object0 == null ? 0 : object0.hashCode()), object0, object1, 0);
        return trieNode$ModificationResult0 == null ? this : new PersistentHashMap(trieNode$ModificationResult0.getNode(), trieNode$ModificationResult0.getSizeDelta() + this.size());
    }

    @Override  // kotlinx.collections.immutable.PersistentMap
    @NotNull
    public PersistentMap putAll(@NotNull Map map0) {
        Intrinsics.checkNotNullParameter(map0, "m");
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type kotlinx.collections.immutable.PersistentMap<K of kotlinx.collections.immutable.ExtensionsKt.mutate, V of kotlinx.collections.immutable.ExtensionsKt.mutate>");
        Builder persistentMap$Builder0 = this.builder();
        persistentMap$Builder0.putAll(map0);
        return persistentMap$Builder0.build();
    }

    @Override  // kotlinx.collections.immutable.PersistentMap
    public PersistentMap remove(Object object0) {
        return this.remove(object0);
    }

    @Override  // kotlinx.collections.immutable.PersistentMap
    public PersistentMap remove(Object object0, Object object1) {
        return this.remove(object0, object1);
    }

    @NotNull
    public PersistentHashMap remove(Object object0) {
        TrieNode trieNode0 = this.c.remove((object0 == null ? 0 : object0.hashCode()), object0, 0);
        if(this.c == trieNode0) {
            return this;
        }
        return trieNode0 == null ? PersistentHashMap.Companion.emptyOf$kotlinx_collections_immutable() : new PersistentHashMap(trieNode0, this.size() - 1);
    }

    @NotNull
    public PersistentHashMap remove(Object object0, Object object1) {
        TrieNode trieNode0 = this.c.remove((object0 == null ? 0 : object0.hashCode()), object0, object1, 0);
        if(this.c == trieNode0) {
            return this;
        }
        return trieNode0 == null ? PersistentHashMap.Companion.emptyOf$kotlinx_collections_immutable() : new PersistentHashMap(trieNode0, this.size() - 1);
    }

    public final ImmutableCollection values() {
        return this.getValues();
    }
}

