package kotlinx.collections.immutable.adapters;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.collections.immutable.ImmutableCollection;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.collections.immutable.ImmutableSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010&\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\u001B\u0012\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001A\u00020\t2\u0006\u0010\b\u001A\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\n\u0010\u000BJ\u0018\u0010\r\u001A\u00020\t2\u0006\u0010\f\u001A\u00028\u0001H\u0096\u0001¢\u0006\u0004\b\r\u0010\u000BJ\u001A\u0010\u000E\u001A\u0004\u0018\u00018\u00012\u0006\u0010\b\u001A\u00028\u0000H\u0096\u0003¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0010\u001A\u00020\tH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0014\u001A\u00020\t2\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u000BJ\u000F\u0010\u0016\u001A\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000F\u0010\u0019\u001A\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001AR \u0010 \u001A\b\u0012\u0004\u0012\u00028\u00000\u001B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001FR \u0010&\u001A\b\u0012\u0004\u0012\u00028\u00010!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010%R,\u0010*\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\'0\u001B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010\u001D\u001A\u0004\b)\u0010\u001FR\u0014\u0010,\u001A\u00020\u00158\u0016X\u0096\u0005¢\u0006\u0006\u001A\u0004\b+\u0010\u0017¨\u0006-"}, d2 = {"Lkotlinx/collections/immutable/adapters/ImmutableMapAdapter;", "K", "V", "Lkotlinx/collections/immutable/ImmutableMap;", "", "impl", "<init>", "(Ljava/util/Map;)V", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "value", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "isEmpty", "()Z", "", "other", "equals", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lkotlinx/collections/immutable/ImmutableSet;", "b", "Lkotlinx/collections/immutable/ImmutableSet;", "getKeys", "()Lkotlinx/collections/immutable/ImmutableSet;", "keys", "Lkotlinx/collections/immutable/ImmutableCollection;", "c", "Lkotlinx/collections/immutable/ImmutableCollection;", "getValues", "()Lkotlinx/collections/immutable/ImmutableCollection;", "values", "", "d", "getEntries", "entries", "getSize", "size", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ImmutableMapAdapter implements Map, KMappedMarker, ImmutableMap {
    public final Map a;
    public final ImmutableSetAdapter b;
    public final ImmutableCollectionAdapter c;
    public final ImmutableSetAdapter d;

    public ImmutableMapAdapter(@NotNull Map map0) {
        Intrinsics.checkNotNullParameter(map0, "impl");
        super();
        this.a = map0;
        this.b = new ImmutableSetAdapter(map0.keySet());
        this.c = new ImmutableCollectionAdapter(map0.values());
        this.d = new ImmutableSetAdapter(map0.entrySet());
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object compute(Object object0, BiFunction biFunction0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object computeIfAbsent(Object object0, Function function0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object computeIfPresent(Object object0, BiFunction biFunction0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean containsKey(Object object0) {
        return this.a.containsKey(object0);
    }

    @Override
    public boolean containsValue(Object object0) {
        return this.a.containsValue(object0);
    }

    @Override
    public Set entrySet() {
        return this.entrySet();
    }

    public final ImmutableSet entrySet() {
        return this.getEntries();
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        return this.a.equals(object0);
    }

    @Override
    @Nullable
    public Object get(Object object0) {
        return this.a.get(object0);
    }

    @Override  // kotlinx.collections.immutable.ImmutableMap
    @NotNull
    public ImmutableSet getEntries() {
        return this.d;
    }

    @Override  // kotlinx.collections.immutable.ImmutableMap
    @NotNull
    public ImmutableSet getKeys() {
        return this.b;
    }

    public int getSize() {
        return this.a.size();
    }

    @Override  // kotlinx.collections.immutable.ImmutableMap
    @NotNull
    public ImmutableCollection getValues() {
        return this.c;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public Set keySet() {
        return this.keySet();
    }

    public final ImmutableSet keySet() {
        return this.getKeys();
    }

    @Override
    public Object merge(Object object0, Object object1, BiFunction biFunction0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object put(Object object0, Object object1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void putAll(Map map0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object putIfAbsent(Object object0, Object object1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object remove(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean remove(Object object0, Object object1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object replace(Object object0, Object object1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean replace(Object object0, Object object1, Object object2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void replaceAll(BiFunction biFunction0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return this.getSize();
    }

    @Override
    @NotNull
    public String toString() {
        return this.a.toString();
    }

    @Override
    public Collection values() {
        return this.values();
    }

    public final ImmutableCollection values() {
        return this.getValues();
    }
}

