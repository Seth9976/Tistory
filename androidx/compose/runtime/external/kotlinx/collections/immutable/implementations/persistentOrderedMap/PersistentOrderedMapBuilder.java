package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\'\n\u0002\b\u0005\n\u0002\u0010\u001F\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\u001B\u0012\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u00A2\u0006\u0004\b\u0007\u0010\bJ\u001B\u0010\n\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\u0016\u00A2\u0006\u0004\b\n\u0010\u000BJ\u0017\u0010\u000E\u001A\u00020\r2\u0006\u0010\f\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0010\u001A\u0004\u0018\u00018\u00012\u0006\u0010\f\u001A\u00028\u0000H\u0096\u0002\u00A2\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001A\u0004\u0018\u00018\u00012\u0006\u0010\f\u001A\u00028\u00002\u0006\u0010\u0012\u001A\u00028\u0001H\u0016\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001A\u0004\u0018\u00018\u00012\u0006\u0010\f\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b\u0015\u0010\u0011J\u001D\u0010\u0015\u001A\u00020\r2\u0006\u0010\f\u001A\u00028\u00002\u0006\u0010\u0012\u001A\u00028\u0001\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u000F\u0010\u0018\u001A\u00020\u0017H\u0016\u00A2\u0006\u0004\b\u0018\u0010\u0019R(\u0010 \u001A\u0004\u0018\u00010\u001A2\b\u0010\u001B\u001A\u0004\u0018\u00010\u001A8\u0000@BX\u0080\u000E\u00A2\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001FR,\u0010\'\u001A\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\"0!8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b%\u0010&R\u0014\u0010+\u001A\u00020(8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b)\u0010*R&\u00100\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010-0,8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b.\u0010/R\u001A\u00102\u001A\b\u0012\u0004\u0012\u00028\u00000,8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b1\u0010/R\u001A\u00106\u001A\b\u0012\u0004\u0012\u00028\u0001038VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b4\u00105\u00A8\u00067"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;", "K", "V", "Lkotlin/collections/AbstractMutableMap;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap$Builder;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;", "map", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;)V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "build", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "", "clear", "()V", "", "<set-?>", "b", "Ljava/lang/Object;", "getFirstKey$runtime_release", "()Ljava/lang/Object;", "firstKey", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "d", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "getHashMapBuilder$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "hashMapBuilder", "", "getSize", "()I", "size", "", "", "getEntries", "()Ljava/util/Set;", "entries", "getKeys", "keys", "", "getValues", "()Ljava/util/Collection;", "values", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PersistentOrderedMapBuilder extends AbstractMutableMap implements Builder {
    public static final int $stable = 8;
    public PersistentOrderedMap a;
    public Object b;
    public Object c;
    public final PersistentHashMapBuilder d;

    public PersistentOrderedMapBuilder(@NotNull PersistentOrderedMap persistentOrderedMap0) {
        this.a = persistentOrderedMap0;
        this.b = persistentOrderedMap0.getFirstKey$runtime_release();
        this.c = this.a.getLastKey$runtime_release();
        this.d = this.a.getHashMap$runtime_release().builder();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap$Builder
    @NotNull
    public PersistentMap build() {
        PersistentOrderedMap persistentOrderedMap0;
        PersistentHashMap persistentHashMap0 = this.d.build();
        if(persistentHashMap0 == this.a.getHashMap$runtime_release()) {
            boolean z = this.b != this.a.getFirstKey$runtime_release();
            boolean z1 = this.c != this.a.getLastKey$runtime_release();
            persistentOrderedMap0 = this.a;
        }
        else {
            persistentOrderedMap0 = new PersistentOrderedMap(this.b, this.c, persistentHashMap0);
        }
        this.a = persistentOrderedMap0;
        return persistentOrderedMap0;
    }

    @Override
    public void clear() {
        this.d.clear();
        this.b = EndOfChain.INSTANCE;
        this.c = EndOfChain.INSTANCE;
    }

    @Override
    public boolean containsKey(Object object0) {
        return this.d.containsKey(object0);
    }

    @Override
    @Nullable
    public Object get(Object object0) {
        LinkedValue linkedValue0 = (LinkedValue)this.d.get(object0);
        return linkedValue0 == null ? null : linkedValue0.getValue();
    }

    @Override  // kotlin.collections.AbstractMutableMap
    @NotNull
    public Set getEntries() {
        return new PersistentOrderedMapBuilderEntries(this);
    }

    @Nullable
    public final Object getFirstKey$runtime_release() {
        return this.b;
    }

    @NotNull
    public final PersistentHashMapBuilder getHashMapBuilder$runtime_release() {
        return this.d;
    }

    @Override  // kotlin.collections.AbstractMutableMap
    @NotNull
    public Set getKeys() {
        return new PersistentOrderedMapBuilderKeys(this);
    }

    @Override  // kotlin.collections.AbstractMutableMap
    public int getSize() {
        return this.d.size();
    }

    @Override  // kotlin.collections.AbstractMutableMap
    @NotNull
    public Collection getValues() {
        return new PersistentOrderedMapBuilderValues(this);
    }

    @Override  // kotlin.collections.AbstractMutableMap
    @Nullable
    public Object put(Object object0, Object object1) {
        PersistentHashMapBuilder persistentHashMapBuilder0 = this.d;
        LinkedValue linkedValue0 = (LinkedValue)persistentHashMapBuilder0.get(object0);
        if(linkedValue0 != null) {
            if(linkedValue0.getValue() == object1) {
                return object1;
            }
            persistentHashMapBuilder0.put(object0, linkedValue0.withValue(object1));
            return linkedValue0.getValue();
        }
        if(this.isEmpty()) {
            this.b = object0;
            this.c = object0;
            persistentHashMapBuilder0.put(object0, new LinkedValue(object1));
            return null;
        }
        Object object2 = this.c;
        Object object3 = persistentHashMapBuilder0.get(object2);
        Intrinsics.checkNotNull(object3);
        persistentHashMapBuilder0.put(object2, ((LinkedValue)object3).withNext(object0));
        persistentHashMapBuilder0.put(object0, new LinkedValue(object1, object2));
        this.c = object0;
        return null;
    }

    @Override
    @Nullable
    public Object remove(Object object0) {
        PersistentHashMapBuilder persistentHashMapBuilder0 = this.d;
        LinkedValue linkedValue0 = (LinkedValue)persistentHashMapBuilder0.remove(object0);
        if(linkedValue0 == null) {
            return null;
        }
        if(linkedValue0.getHasPrevious()) {
            Object object1 = persistentHashMapBuilder0.get(linkedValue0.getPrevious());
            Intrinsics.checkNotNull(object1);
            persistentHashMapBuilder0.put(linkedValue0.getPrevious(), ((LinkedValue)object1).withNext(linkedValue0.getNext()));
        }
        else {
            this.b = linkedValue0.getNext();
        }
        if(linkedValue0.getHasNext()) {
            Object object2 = persistentHashMapBuilder0.get(linkedValue0.getNext());
            Intrinsics.checkNotNull(object2);
            persistentHashMapBuilder0.put(linkedValue0.getNext(), ((LinkedValue)object2).withPrevious(linkedValue0.getPrevious()));
            return linkedValue0.getValue();
        }
        this.c = linkedValue0.getPrevious();
        return linkedValue0.getValue();
    }

    @Override
    public final boolean remove(Object object0, Object object1) {
        LinkedValue linkedValue0 = (LinkedValue)this.d.get(object0);
        if(linkedValue0 == null) {
            return false;
        }
        if(Intrinsics.areEqual(linkedValue0.getValue(), object1)) {
            this.remove(object0);
            return true;
        }
        return false;
    }
}

