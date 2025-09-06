package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\'\u0018\u0000 \u000B*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u000BB\u0007\b\u0004¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001A\u00020\u00062\b\u0010\u0007\u001A\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\t\u001A\u00020\nH\u0016¨\u0006\f"}, d2 = {"Lkotlin/collections/AbstractSet;", "E", "Lkotlin/collections/AbstractCollection;", "", "()V", "equals", "", "other", "", "hashCode", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SinceKotlin(version = "1.1")
public abstract class AbstractSet extends AbstractCollection implements Set, KMappedMarker {
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001J\u001B\u0010\u0007\u001A\u00020\u00042\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\'\u0010\r\u001A\u00020\n2\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\b2\n\u0010\t\u001A\u0006\u0012\u0002\b\u00030\bH\u0000¢\u0006\u0004\b\u000B\u0010\f¨\u0006\u000E"}, d2 = {"Lkotlin/collections/AbstractSet$Companion;", "", "", "c", "", "unorderedHashCode$kotlin_stdlib", "(Ljava/util/Collection;)I", "unorderedHashCode", "", "other", "", "setEquals$kotlin_stdlib", "(Ljava/util/Set;Ljava/util/Set;)Z", "setEquals", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final boolean setEquals$kotlin_stdlib(@NotNull Set set0, @NotNull Set set1) {
            Intrinsics.checkNotNullParameter(set0, "c");
            Intrinsics.checkNotNullParameter(set1, "other");
            return set0.size() == set1.size() ? set0.containsAll(set1) : false;
        }

        public final int unorderedHashCode$kotlin_stdlib(@NotNull Collection collection0) {
            Intrinsics.checkNotNullParameter(collection0, "c");
            int v = 0;
            for(Object object0: collection0) {
                v += (object0 == null ? 0 : object0.hashCode());
            }
            return v;
        }
    }

    @NotNull
    public static final Companion Companion;

    static {
        AbstractSet.Companion = new Companion(null);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof Set ? AbstractSet.Companion.setEquals$kotlin_stdlib(this, ((Set)object0)) : false;
    }

    @Override
    public int hashCode() {
        return AbstractSet.Companion.unorderedHashCode$kotlin_stdlib(this);
    }

    @Override  // kotlin.collections.AbstractCollection
    public Iterator iterator() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

