package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableSet;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001E\n\u0002\b\u0004\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001B\b\u0000\u0012\u0010\u0010\u0005\u001A\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000F\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000F\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u0017\u0010\u0011\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\rJ\u001D\u0010\u0014\u001A\u00020\b2\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\rJ\u0016\u0010\u0018\u001A\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001D\u0010\u001A\u001A\u00020\b2\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016¢\u0006\u0004\b\u001A\u0010\u0015J\u001D\u0010\u001B\u001A\u00020\b2\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016¢\u0006\u0004\b\u001B\u0010\u0015R\u0014\u0010\u001F\u001A\u00020\u001C8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001D\u0010\u001E¨\u0006 "}, d2 = {"Lkotlin/collections/builders/MapBuilderKeys;", "E", "", "Lkotlin/collections/AbstractMutableSet;", "Lkotlin/collections/builders/MapBuilder;", "backing", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", "", "isEmpty", "()Z", "element", "contains", "(Ljava/lang/Object;)Z", "", "clear", "()V", "add", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "remove", "", "iterator", "()Ljava/util/Iterator;", "removeAll", "retainAll", "", "getSize", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class MapBuilderKeys extends AbstractMutableSet implements Set, KMutableSet {
    public final MapBuilder a;

    public MapBuilderKeys(@NotNull MapBuilder mapBuilder0) {
        Intrinsics.checkNotNullParameter(mapBuilder0, "backing");
        super();
        this.a = mapBuilder0;
    }

    @Override  // kotlin.collections.AbstractMutableSet
    public boolean add(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        this.a.clear();
    }

    @Override
    public boolean contains(Object object0) {
        return this.a.containsKey(object0);
    }

    @Override  // kotlin.collections.AbstractMutableSet
    public int getSize() {
        return this.a.size();
    }

    @Override
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    @NotNull
    public Iterator iterator() {
        return this.a.keysIterator$kotlin_stdlib();
    }

    @Override
    public boolean remove(Object object0) {
        return this.a.removeKey$kotlin_stdlib(object0) >= 0;
    }

    @Override
    public boolean removeAll(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        this.a.checkIsMutable$kotlin_stdlib();
        return super.removeAll(collection0);
    }

    @Override
    public boolean retainAll(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        this.a.checkIsMutable$kotlin_stdlib();
        return super.retainAll(collection0);
    }
}

