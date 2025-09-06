package androidx.compose.runtime.internal;

import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.CompositionLocalMapKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.ValueHolder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode.ModificationResult;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00192\u001E\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u00012\u00020\u0005:\u0002\u0018\u0019B1\u0012\"\u0010\u0006\u001A\u001E\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u0007\u0012\u0006\u0010\b\u001A\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0010\u001A\u00020\u0011H\u0016J\"\u0010\u0012\u001A\u0002H\u0013\"\u0004\b\u0000\u0010\u00132\f\u0010\u0014\u001A\b\u0012\u0004\u0012\u0002H\u00130\u0002H\u0096\u0002¢\u0006\u0002\u0010\u0015J(\u0010\u0016\u001A\u00020\u00052\u000E\u0010\u0014\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u000E\u0010\u0017\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0004H\u0016R6\u0010\u000B\u001A$\u0012 \u0012\u001E\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\r0\f8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u001A"}, d2 = {"Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "Landroidx/compose/runtime/CompositionLocal;", "", "Landroidx/compose/runtime/ValueHolder;", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "node", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "size", "", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;I)V", "entries", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "", "getEntries", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "builder", "Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap$Builder;", "get", "T", "key", "(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "putValue", "value", "Builder", "Companion", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PersistentCompositionLocalHashMap extends PersistentHashMap implements PersistentCompositionLocalMap {
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u001E\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u00012\u00020\u0005B\u000F\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\n\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000BR\"\u0010\u0007\u001A\u00020\u00068\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000B\"\u0004\b\u000F\u0010\t¨\u0006\u0010"}, d2 = {"Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap$Builder;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "Landroidx/compose/runtime/CompositionLocal;", "", "Landroidx/compose/runtime/ValueHolder;", "Landroidx/compose/runtime/PersistentCompositionLocalMap$Builder;", "Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;", "map", "<init>", "(Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;)V", "build", "()Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;", "g", "Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;", "getMap$runtime_release", "setMap$runtime_release", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Builder extends PersistentHashMapBuilder implements androidx.compose.runtime.PersistentCompositionLocalMap.Builder {
        public static final int $stable = 8;
        public PersistentCompositionLocalHashMap g;

        public Builder(@NotNull PersistentCompositionLocalHashMap persistentCompositionLocalHashMap0) {
            super(persistentCompositionLocalHashMap0);
            this.g = persistentCompositionLocalHashMap0;
        }

        @Override  // androidx.compose.runtime.PersistentCompositionLocalMap$Builder
        public PersistentCompositionLocalMap build() {
            return this.build();
        }

        @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap$Builder
        public PersistentMap build() {
            return this.build();
        }

        @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder
        public PersistentHashMap build() {
            return this.build();
        }

        @NotNull
        public PersistentCompositionLocalHashMap build() {
            PersistentCompositionLocalHashMap persistentCompositionLocalHashMap0;
            if(this.getNode$runtime_release() == this.g.getNode$runtime_release()) {
                persistentCompositionLocalHashMap0 = this.g;
            }
            else {
                this.setOwnership(new MutabilityOwnership());
                persistentCompositionLocalHashMap0 = new PersistentCompositionLocalHashMap(this.getNode$runtime_release(), this.size());
            }
            this.g = persistentCompositionLocalHashMap0;
            return persistentCompositionLocalHashMap0;
        }

        public boolean containsKey(CompositionLocal compositionLocal0) {
            return super.containsKey(compositionLocal0);
        }

        @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder
        public final boolean containsKey(Object object0) {
            return object0 instanceof CompositionLocal ? this.containsKey(((CompositionLocal)object0)) : false;
        }

        public boolean containsValue(ValueHolder valueHolder0) {
            return super.containsValue(valueHolder0);
        }

        @Override
        public final boolean containsValue(Object object0) {
            return object0 instanceof ValueHolder ? this.containsValue(((ValueHolder)object0)) : false;
        }

        public ValueHolder get(CompositionLocal compositionLocal0) {
            return (ValueHolder)super.get(compositionLocal0);
        }

        public final ValueHolder get(Object object0) {
            return object0 instanceof CompositionLocal ? this.get(((CompositionLocal)object0)) : null;
        }

        @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder
        public final Object get(Object object0) {
            return !(object0 instanceof CompositionLocal) ? null : this.get(((CompositionLocal)object0));
        }

        @NotNull
        public final PersistentCompositionLocalHashMap getMap$runtime_release() {
            return this.g;
        }

        public ValueHolder getOrDefault(CompositionLocal compositionLocal0, ValueHolder valueHolder0) {
            return (ValueHolder)super.getOrDefault(compositionLocal0, valueHolder0);
        }

        public final ValueHolder getOrDefault(Object object0, ValueHolder valueHolder0) {
            return object0 instanceof CompositionLocal ? this.getOrDefault(((CompositionLocal)object0), valueHolder0) : valueHolder0;
        }

        @Override
        public final Object getOrDefault(Object object0, Object object1) {
            return !(object0 instanceof CompositionLocal) ? object1 : this.getOrDefault(((CompositionLocal)object0), ((ValueHolder)object1));
        }

        public ValueHolder remove(CompositionLocal compositionLocal0) {
            return (ValueHolder)super.remove(compositionLocal0);
        }

        public final ValueHolder remove(Object object0) {
            return object0 instanceof CompositionLocal ? this.remove(((CompositionLocal)object0)) : null;
        }

        @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder
        public final Object remove(Object object0) {
            return !(object0 instanceof CompositionLocal) ? null : this.remove(((CompositionLocal)object0));
        }

        public final void setMap$runtime_release(@NotNull PersistentCompositionLocalHashMap persistentCompositionLocalHashMap0) {
            this.g = persistentCompositionLocalHashMap0;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001D\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001A\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap$Companion;", "", "Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;", "Empty", "Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;", "getEmpty", "()Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;", "getEmpty$annotations", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final PersistentCompositionLocalHashMap getEmpty() {
            return PersistentCompositionLocalHashMap.f;
        }

        public static void getEmpty$annotations() {
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public static final PersistentCompositionLocalHashMap f;

    static {
        PersistentCompositionLocalHashMap.Companion = new Companion(null);
        TrieNode trieNode0 = TrieNode.Companion.getEMPTY$runtime_release();
        Intrinsics.checkNotNull(trieNode0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.ValueHolder<kotlin.Any?>>");
        PersistentCompositionLocalHashMap.f = new PersistentCompositionLocalHashMap(trieNode0, 0);
    }

    public PersistentCompositionLocalHashMap(@NotNull TrieNode trieNode0, int v) {
        super(trieNode0, v);
    }

    @Override  // androidx.compose.runtime.PersistentCompositionLocalMap
    public androidx.compose.runtime.PersistentCompositionLocalMap.Builder builder() {
        return this.builder();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder builder() {
        return this.builder();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap
    public PersistentHashMapBuilder builder() {
        return this.builder();
    }

    @NotNull
    public Builder builder() {
        return new Builder(this);
    }

    public boolean containsKey(CompositionLocal compositionLocal0) {
        return super.containsKey(compositionLocal0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap
    public final boolean containsKey(Object object0) {
        return object0 instanceof CompositionLocal ? this.containsKey(((CompositionLocal)object0)) : false;
    }

    public boolean containsValue(ValueHolder valueHolder0) {
        return super.containsValue(valueHolder0);
    }

    @Override  // kotlin.collections.AbstractMap
    public final boolean containsValue(Object object0) {
        return object0 instanceof ValueHolder ? this.containsValue(((ValueHolder)object0)) : false;
    }

    public ValueHolder get(CompositionLocal compositionLocal0) {
        return (ValueHolder)super.get(compositionLocal0);
    }

    public final ValueHolder get(Object object0) {
        return object0 instanceof CompositionLocal ? this.get(((CompositionLocal)object0)) : null;
    }

    @Override  // androidx.compose.runtime.CompositionLocalMap
    public Object get(@NotNull CompositionLocal compositionLocal0) {
        return CompositionLocalMapKt.read(this, compositionLocal0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap
    public final Object get(Object object0) {
        return !(object0 instanceof CompositionLocal) ? null : this.get(((CompositionLocal)object0));
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    @NotNull
    public ImmutableSet getEntries() {
        return super.getEntries();
    }

    public ValueHolder getOrDefault(CompositionLocal compositionLocal0, ValueHolder valueHolder0) {
        return (ValueHolder)super.getOrDefault(compositionLocal0, valueHolder0);
    }

    public final ValueHolder getOrDefault(Object object0, ValueHolder valueHolder0) {
        return object0 instanceof CompositionLocal ? this.getOrDefault(((CompositionLocal)object0), valueHolder0) : valueHolder0;
    }

    @Override
    public final Object getOrDefault(Object object0, Object object1) {
        return !(object0 instanceof CompositionLocal) ? object1 : this.getOrDefault(((CompositionLocal)object0), ((ValueHolder)object1));
    }

    @Override  // androidx.compose.runtime.PersistentCompositionLocalMap
    @NotNull
    public PersistentCompositionLocalMap putValue(@NotNull CompositionLocal compositionLocal0, @NotNull ValueHolder valueHolder0) {
        ModificationResult trieNode$ModificationResult0 = this.getNode$runtime_release().put(compositionLocal0.hashCode(), compositionLocal0, valueHolder0, 0);
        return trieNode$ModificationResult0 == null ? this : new PersistentCompositionLocalHashMap(trieNode$ModificationResult0.getNode(), trieNode$ModificationResult0.getSizeDelta() + this.size());
    }
}

