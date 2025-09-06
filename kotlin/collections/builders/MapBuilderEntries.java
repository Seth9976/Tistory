package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\'\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001E\n\u0002\b\u0004\n\u0002\u0010)\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u001D\b\u0000\u0012\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u00A2\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\n\u001A\u00020\tH\u0016\u00A2\u0006\u0004\b\n\u0010\u000BJ#\u0010\u000E\u001A\u00020\t2\u0012\u0010\r\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\fH\u0016\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0011\u001A\u00020\u0010H\u0016\u00A2\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001A\u00020\t2\u0012\u0010\r\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016\u00A2\u0006\u0004\b\u0013\u0010\u000FJ)\u0010\u0016\u001A\u00020\t2\u0018\u0010\u0015\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0014H\u0016\u00A2\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0018\u001A\u00020\t2\u0012\u0010\r\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016\u00A2\u0006\u0004\b\u0018\u0010\u000FJ\"\u0010\u001A\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0019H\u0096\u0002\u00A2\u0006\u0004\b\u001A\u0010\u001BJ)\u0010\u001C\u001A\u00020\t2\u0018\u0010\u0015\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0014H\u0016\u00A2\u0006\u0004\b\u001C\u0010\u0017J)\u0010\u001D\u001A\u00020\t2\u0018\u0010\u0015\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0014H\u0016\u00A2\u0006\u0004\b\u001D\u0010\u0017J)\u0010\u001E\u001A\u00020\t2\u0018\u0010\u0015\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0014H\u0016\u00A2\u0006\u0004\b\u001E\u0010\u0017R#\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0006\u00A2\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\"R\u0014\u0010&\u001A\u00020#8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b$\u0010%\u00A8\u0006\'"}, d2 = {"Lkotlin/collections/builders/MapBuilderEntries;", "K", "V", "Lkotlin/collections/builders/AbstractMapBuilderEntrySet;", "", "Lkotlin/collections/builders/MapBuilder;", "backing", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", "", "isEmpty", "()Z", "", "element", "containsEntry", "(Ljava/util/Map$Entry;)Z", "", "clear", "()V", "add", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "remove", "", "iterator", "()Ljava/util/Iterator;", "containsAll", "removeAll", "retainAll", "a", "Lkotlin/collections/builders/MapBuilder;", "getBacking", "()Lkotlin/collections/builders/MapBuilder;", "", "getSize", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class MapBuilderEntries extends AbstractMapBuilderEntrySet {
    public final MapBuilder a;

    public MapBuilderEntries(@NotNull MapBuilder mapBuilder0) {
        Intrinsics.checkNotNullParameter(mapBuilder0, "backing");
        super();
        this.a = mapBuilder0;
    }

    @Override  // kotlin.collections.AbstractMutableSet
    public boolean add(Object object0) {
        return this.add(((Map.Entry)object0));
    }

    public boolean add(@NotNull Map.Entry map$Entry0) {
        Intrinsics.checkNotNullParameter(map$Entry0, "element");
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
    public boolean containsAll(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        return this.a.containsAllEntries$kotlin_stdlib(collection0);
    }

    @Override  // kotlin.collections.builders.AbstractMapBuilderEntrySet
    public boolean containsEntry(@NotNull Map.Entry map$Entry0) {
        Intrinsics.checkNotNullParameter(map$Entry0, "element");
        return this.a.containsEntry$kotlin_stdlib(map$Entry0);
    }

    @NotNull
    public final MapBuilder getBacking() {
        return this.a;
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
        return this.a.entriesIterator$kotlin_stdlib();
    }

    @Override  // kotlin.collections.builders.AbstractMapBuilderEntrySet
    public boolean remove(@NotNull Map.Entry map$Entry0) {
        Intrinsics.checkNotNullParameter(map$Entry0, "element");
        return this.a.removeEntry$kotlin_stdlib(map$Entry0);
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

