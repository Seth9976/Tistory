package kotlin.collections.builders;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableSet;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010\u001E\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005B\u001B\b\u0000\u0012\u0010\u0010\u0007\u001A\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\b\u0010\tB\t\b\u0016¢\u0006\u0004\b\b\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\f\u001A\u00020\u000B¢\u0006\u0004\b\b\u0010\rJ\u0013\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u000E¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0012\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001A\u00020\u00112\u0006\u0010\u0014\u001A\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000F\u0010\u0018\u001A\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\nJ\u0017\u0010\u0019\u001A\u00020\u00112\u0006\u0010\u0014\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u0019\u0010\u0016J\u0017\u0010\u001A\u001A\u00020\u00112\u0006\u0010\u0014\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u001A\u0010\u0016J\u0016\u0010\u001C\u001A\b\u0012\u0004\u0012\u00028\u00000\u001BH\u0096\u0002¢\u0006\u0004\b\u001C\u0010\u001DJ\u001D\u0010 \u001A\u00020\u00112\f\u0010\u001F\u001A\b\u0012\u0004\u0012\u00028\u00000\u001EH\u0016¢\u0006\u0004\b \u0010!J\u001D\u0010\"\u001A\u00020\u00112\f\u0010\u001F\u001A\b\u0012\u0004\u0012\u00028\u00000\u001EH\u0016¢\u0006\u0004\b\"\u0010!J\u001D\u0010#\u001A\u00020\u00112\f\u0010\u001F\u001A\b\u0012\u0004\u0012\u00028\u00000\u001EH\u0016¢\u0006\u0004\b#\u0010!R\u0014\u0010&\u001A\u00020\u000B8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b$\u0010%¨\u0006\'"}, d2 = {"Lkotlin/collections/builders/SetBuilder;", "E", "", "Lkotlin/collections/AbstractMutableSet;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Lkotlin/collections/builders/MapBuilder;", "backing", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", "()V", "", "initialCapacity", "(I)V", "", "build", "()Ljava/util/Set;", "", "isEmpty", "()Z", "element", "contains", "(Ljava/lang/Object;)Z", "", "clear", "add", "remove", "", "iterator", "()Ljava/util/Iterator;", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "removeAll", "retainAll", "getSize", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class SetBuilder extends AbstractMutableSet implements Serializable, Set, KMutableSet {
    public final MapBuilder a;
    public static final SetBuilder b;

    static {
        SetBuilder.b = new SetBuilder(MapBuilder.Companion.getEmpty$kotlin_stdlib());
    }

    public SetBuilder() {
        this(new MapBuilder());
    }

    public SetBuilder(int v) {
        this(new MapBuilder(v));
    }

    public SetBuilder(@NotNull MapBuilder mapBuilder0) {
        Intrinsics.checkNotNullParameter(mapBuilder0, "backing");
        super();
        this.a = mapBuilder0;
    }

    @Override  // kotlin.collections.AbstractMutableSet
    public boolean add(Object object0) {
        return this.a.addKey$kotlin_stdlib(object0) >= 0;
    }

    @Override
    public boolean addAll(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        this.a.checkIsMutable$kotlin_stdlib();
        return super.addAll(collection0);
    }

    @NotNull
    public final Set build() {
        this.a.build();
        return this.size() <= 0 ? SetBuilder.b : this;
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

