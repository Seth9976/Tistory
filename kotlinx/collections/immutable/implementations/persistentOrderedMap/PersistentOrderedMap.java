package kotlinx.collections.immutable.implementations.persistentOrderedMap;

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
import kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import kotlinx.collections.immutable.internal.EndOfChain;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qf.a;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 ?*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001?B5\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0005\u0012\u0018\u0010\n\u001A\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t0\b\u00A2\u0006\u0004\b\u000B\u0010\fJ!\u0010\u000F\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000E0\rH\u0001\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u0017\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0011\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u001A\u0010\u0015\u001A\u0004\u0018\u00018\u00012\u0006\u0010\u0011\u001A\u00028\u0000H\u0096\u0002\u00A2\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0018\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0011\u001A\u00028\u00002\u0006\u0010\u0017\u001A\u00028\u0001H\u0016\u00A2\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001A\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0011\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b\u001A\u0010\u001BJ+\u0010\u001A\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0011\u001A\u00028\u00002\u0006\u0010\u0017\u001A\u00028\u0001H\u0016\u00A2\u0006\u0004\b\u001A\u0010\u0019J1\u0010\u001E\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0014\u0010\u001D\u001A\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001CH\u0016\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u001B\u0010 \u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016\u00A2\u0006\u0004\b \u0010!J\u001B\u0010#\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"H\u0016\u00A2\u0006\u0004\b#\u0010$J\u001A\u0010&\u001A\u00020\u00122\b\u0010%\u001A\u0004\u0018\u00010\u0005H\u0096\u0002\u00A2\u0006\u0004\b&\u0010\u0014J\u000F\u0010(\u001A\u00020\'H\u0016\u00A2\u0006\u0004\b(\u0010)R\u001C\u0010\u0006\u001A\u0004\u0018\u00010\u00058\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b*\u0010+\u001A\u0004\b,\u0010-R\u001C\u0010\u0007\u001A\u0004\u0018\u00010\u00058\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b.\u0010+\u001A\u0004\b/\u0010-R,\u0010\n\u001A\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t0\b8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b0\u00101\u001A\u0004\b2\u00103R\u0014\u00105\u001A\u00020\'8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b4\u0010)R\u001A\u00109\u001A\b\u0012\u0004\u0012\u00028\u0000068VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b7\u00108R\u001A\u0010=\u001A\b\u0012\u0004\u0012\u00028\u00010:8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b;\u0010<R&\u0010>\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000E068VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\u000F\u00108\u00A8\u0006@"}, d2 = {"Lkotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;", "K", "V", "Lkotlin/collections/AbstractMap;", "Lkotlinx/collections/immutable/PersistentMap;", "", "firstKey", "lastKey", "Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "Lkotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "hashMap", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;)V", "", "", "getEntries", "()Ljava/util/Set;", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;", "remove", "(Ljava/lang/Object;)Lkotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;", "", "m", "putAll", "(Ljava/util/Map;)Lkotlinx/collections/immutable/PersistentMap;", "clear", "()Lkotlinx/collections/immutable/PersistentMap;", "Lkotlinx/collections/immutable/PersistentMap$Builder;", "builder", "()Lkotlinx/collections/immutable/PersistentMap$Builder;", "other", "equals", "", "hashCode", "()I", "c", "Ljava/lang/Object;", "getFirstKey$kotlinx_collections_immutable", "()Ljava/lang/Object;", "d", "getLastKey$kotlinx_collections_immutable", "e", "Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "getHashMap$kotlinx_collections_immutable", "()Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "getSize", "size", "Lkotlinx/collections/immutable/ImmutableSet;", "getKeys", "()Lkotlinx/collections/immutable/ImmutableSet;", "keys", "Lkotlinx/collections/immutable/ImmutableCollection;", "getValues", "()Lkotlinx/collections/immutable/ImmutableCollection;", "values", "entries", "Companion", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPersistentOrderedMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentOrderedMap.kt\nkotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap\n+ 2 extensions.kt\nkotlinx/collections/immutable/ExtensionsKt\n*L\n1#1,172:1\n53#2:173\n*S KotlinDebug\n*F\n+ 1 PersistentOrderedMap.kt\nkotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap\n*L\n120#1:173\n*E\n"})
public final class PersistentOrderedMap extends AbstractMap implements PersistentMap {
    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001J\'\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\t\u001A\u000E\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Lkotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap$Companion;", "", "K", "V", "Lkotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;", "emptyOf$kotlinx_collections_immutable", "()Lkotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;", "emptyOf", "", "EMPTY", "Lkotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final PersistentOrderedMap emptyOf$kotlinx_collections_immutable() {
            PersistentOrderedMap persistentOrderedMap0 = PersistentOrderedMap.f;
            Intrinsics.checkNotNull(persistentOrderedMap0, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap<K of kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion.emptyOf, V of kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion.emptyOf>");
            return persistentOrderedMap0;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final Object c;
    public final Object d;
    public final PersistentHashMap e;
    public static final PersistentOrderedMap f;

    static {
        PersistentOrderedMap.Companion = new Companion(null);
        PersistentHashMap persistentHashMap0 = PersistentHashMap.Companion.emptyOf$kotlinx_collections_immutable();
        PersistentOrderedMap.f = new PersistentOrderedMap(EndOfChain.INSTANCE, EndOfChain.INSTANCE, persistentHashMap0);
    }

    public PersistentOrderedMap(@Nullable Object object0, @Nullable Object object1, @NotNull PersistentHashMap persistentHashMap0) {
        Intrinsics.checkNotNullParameter(persistentHashMap0, "hashMap");
        super();
        this.c = object0;
        this.d = object1;
        this.e = persistentHashMap0;
    }

    @Override  // kotlinx.collections.immutable.PersistentMap
    @NotNull
    public Builder builder() {
        return new PersistentOrderedMapBuilder(this);
    }

    @Override  // kotlinx.collections.immutable.PersistentMap
    @NotNull
    public PersistentMap clear() {
        return PersistentOrderedMap.Companion.emptyOf$kotlinx_collections_immutable();
    }

    @Override  // kotlin.collections.AbstractMap
    public boolean containsKey(Object object0) {
        return this.e.containsKey(object0);
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
        PersistentHashMap persistentHashMap0 = this.e;
        if(((Map)object0) instanceof PersistentOrderedMap) {
            return persistentHashMap0.getNode$kotlinx_collections_immutable().equalsWith$kotlinx_collections_immutable(((PersistentOrderedMap)object0).e.getNode$kotlinx_collections_immutable(), a.x);
        }
        if(((Map)object0) instanceof PersistentOrderedMapBuilder) {
            return persistentHashMap0.getNode$kotlinx_collections_immutable().equalsWith$kotlinx_collections_immutable(((PersistentOrderedMapBuilder)object0).getHashMapBuilder$kotlinx_collections_immutable().getNode$kotlinx_collections_immutable(), a.y);
        }
        if(((Map)object0) instanceof PersistentHashMap) {
            return persistentHashMap0.getNode$kotlinx_collections_immutable().equalsWith$kotlinx_collections_immutable(((PersistentHashMap)object0).getNode$kotlinx_collections_immutable(), a.z);
        }
        return ((Map)object0) instanceof PersistentHashMapBuilder ? persistentHashMap0.getNode$kotlinx_collections_immutable().equalsWith$kotlinx_collections_immutable(((PersistentHashMapBuilder)object0).getNode$kotlinx_collections_immutable(), a.A) : super.equals(object0);
    }

    @Override  // kotlin.collections.AbstractMap
    @Nullable
    public Object get(Object object0) {
        LinkedValue linkedValue0 = (LinkedValue)this.e.get(object0);
        return linkedValue0 == null ? null : linkedValue0.getValue();
    }

    @Override  // kotlin.collections.AbstractMap
    @PublishedApi
    @NotNull
    public final Set getEntries() {
        return new PersistentOrderedMapEntries(this);
    }

    @Override  // kotlinx.collections.immutable.ImmutableMap
    @NotNull
    public ImmutableSet getEntries() {
        return new PersistentOrderedMapEntries(this);
    }

    @Nullable
    public final Object getFirstKey$kotlinx_collections_immutable() {
        return this.c;
    }

    @NotNull
    public final PersistentHashMap getHashMap$kotlinx_collections_immutable() {
        return this.e;
    }

    @Override  // kotlin.collections.AbstractMap
    public Set getKeys() {
        return this.getKeys();
    }

    @Override  // kotlinx.collections.immutable.ImmutableMap
    @NotNull
    public ImmutableSet getKeys() {
        return new PersistentOrderedMapKeys(this);
    }

    @Nullable
    public final Object getLastKey$kotlinx_collections_immutable() {
        return this.d;
    }

    @Override  // kotlin.collections.AbstractMap
    public int getSize() {
        return this.e.size();
    }

    @Override  // kotlin.collections.AbstractMap
    public Collection getValues() {
        return this.getValues();
    }

    @Override  // kotlinx.collections.immutable.ImmutableMap
    @NotNull
    public ImmutableCollection getValues() {
        return new PersistentOrderedMapValues(this);
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
    public PersistentOrderedMap put(Object object0, Object object1) {
        PersistentHashMap persistentHashMap0 = this.e;
        if(this.isEmpty()) {
            return new PersistentOrderedMap(object0, object0, persistentHashMap0.put(object0, new LinkedValue(object1)));
        }
        LinkedValue linkedValue0 = (LinkedValue)persistentHashMap0.get(object0);
        Object object2 = this.d;
        Object object3 = this.c;
        if(linkedValue0 != null) {
            return linkedValue0.getValue() == object1 ? this : new PersistentOrderedMap(object3, object2, persistentHashMap0.put(object0, linkedValue0.withValue(object1)));
        }
        Object object4 = persistentHashMap0.get(object2);
        Intrinsics.checkNotNull(object4);
        return new PersistentOrderedMap(object3, object0, persistentHashMap0.put(object2, ((LinkedValue)object4).withNext(object0)).put(object0, new LinkedValue(object1, object2)));
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
    public PersistentOrderedMap remove(Object object0) {
        PersistentHashMap persistentHashMap0 = this.e;
        LinkedValue linkedValue0 = (LinkedValue)persistentHashMap0.get(object0);
        if(linkedValue0 == null) {
            return this;
        }
        PersistentHashMap persistentHashMap1 = persistentHashMap0.remove(object0);
        if(linkedValue0.getHasPrevious()) {
            Object object1 = persistentHashMap1.get(linkedValue0.getPrevious());
            Intrinsics.checkNotNull(object1);
            persistentHashMap1 = persistentHashMap1.put(linkedValue0.getPrevious(), ((LinkedValue)object1).withNext(linkedValue0.getNext()));
        }
        if(linkedValue0.getHasNext()) {
            Object object2 = persistentHashMap1.get(linkedValue0.getNext());
            Intrinsics.checkNotNull(object2);
            persistentHashMap1 = persistentHashMap1.put(linkedValue0.getNext(), ((LinkedValue)object2).withPrevious(linkedValue0.getPrevious()));
        }
        Object object3 = linkedValue0.getHasPrevious() ? this.c : linkedValue0.getNext();
        return linkedValue0.getHasNext() ? new PersistentOrderedMap(object3, this.d, persistentHashMap1) : new PersistentOrderedMap(object3, linkedValue0.getPrevious(), persistentHashMap1);
    }

    @NotNull
    public PersistentOrderedMap remove(Object object0, Object object1) {
        LinkedValue linkedValue0 = (LinkedValue)this.e.get(object0);
        if(linkedValue0 == null) {
            return this;
        }
        return Intrinsics.areEqual(linkedValue0.getValue(), object1) ? this.remove(object0) : this;
    }

    public final ImmutableCollection values() {
        return this.getValues();
    }
}

