package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableCollection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableCollection;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0010\u001E\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001B\b\u0000\u0012\u0010\u0010\u0005\u001A\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000F\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000E\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u000E\u0010\rJ\u001D\u0010\u0011\u001A\u00020\b2\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00028\u00000\u000FH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0014\u001A\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001A\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u0019\u0010\rJ\u001D\u0010\u001A\u001A\u00020\b2\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00028\u00000\u000FH\u0016¢\u0006\u0004\b\u001A\u0010\u0012J\u001D\u0010\u001B\u001A\u00020\b2\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00028\u00000\u000FH\u0016¢\u0006\u0004\b\u001B\u0010\u0012R!\u0010\u0005\u001A\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u00048\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001FR\u0014\u0010#\u001A\u00020 8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lkotlin/collections/builders/MapBuilderValues;", "V", "", "Lkotlin/collections/AbstractMutableCollection;", "Lkotlin/collections/builders/MapBuilder;", "backing", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", "", "isEmpty", "()Z", "element", "contains", "(Ljava/lang/Object;)Z", "add", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "", "clear", "()V", "", "iterator", "()Ljava/util/Iterator;", "remove", "removeAll", "retainAll", "a", "Lkotlin/collections/builders/MapBuilder;", "getBacking", "()Lkotlin/collections/builders/MapBuilder;", "", "getSize", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class MapBuilderValues extends AbstractMutableCollection implements Collection, KMutableCollection {
    public final MapBuilder a;

    public MapBuilderValues(@NotNull MapBuilder mapBuilder0) {
        Intrinsics.checkNotNullParameter(mapBuilder0, "backing");
        super();
        this.a = mapBuilder0;
    }

    @Override  // kotlin.collections.AbstractMutableCollection
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
        return this.a.containsValue(object0);
    }

    @NotNull
    public final MapBuilder getBacking() {
        return this.a;
    }

    @Override  // kotlin.collections.AbstractMutableCollection
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
        return this.a.valuesIterator$kotlin_stdlib();
    }

    @Override
    public boolean remove(Object object0) {
        return this.a.removeValue$kotlin_stdlib(object0);
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

