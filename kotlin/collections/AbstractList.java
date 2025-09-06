package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0006\n\u0002\u0010*\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u000B\b\'\u0018\u0000 \"*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0004\"#$%B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001A\u00028\u00002\u0006\u0010\u0007\u001A\u00020\u0006H¦\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\u00000\nH\u0096\u0002¢\u0006\u0004\b\u000B\u0010\fJ\u0017\u0010\u000E\u001A\u00020\u00062\u0006\u0010\r\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u0017\u0010\u0010\u001A\u00020\u00062\u0006\u0010\r\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u000FJ\u0015\u0010\u0012\u001A\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001D\u0010\u0012\u001A\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0014J%\u0010\u0017\u001A\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0015\u001A\u00020\u00062\u0006\u0010\u0016\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001A\u0010\u001C\u001A\u00020\u001B2\b\u0010\u001A\u001A\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001C\u0010\u001DJ\u000F\u0010\u001E\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u001E\u0010\u001FR\u0014\u0010!\u001A\u00020\u00068&X¦\u0004¢\u0006\u0006\u001A\u0004\b \u0010\u001F¨\u0006&"}, d2 = {"Lkotlin/collections/AbstractList;", "E", "Lkotlin/collections/AbstractCollection;", "", "<init>", "()V", "", "index", "get", "(I)Ljava/lang/Object;", "", "iterator", "()Ljava/util/Iterator;", "element", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "getSize", "size", "Companion", "kotlin/collections/a", "kotlin/collections/b", "kotlin/collections/c", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SinceKotlin(version = "1.1")
@SourceDebugExtension({"SMAP\nAbstractList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractList.kt\nkotlin/collections/AbstractList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,170:1\n350#2,7:171\n378#2,7:178\n*S KotlinDebug\n*F\n+ 1 AbstractList.kt\nkotlin/collections/AbstractList\n*L\n27#1:171,7\n29#1:178,7\n*E\n"})
public abstract class AbstractList extends AbstractCollection implements List, KMappedMarker {
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u001E\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001J\u001F\u0010\b\u001A\u00020\u00052\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001F\u0010\n\u001A\u00020\u00052\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\u0007J\'\u0010\u000F\u001A\u00020\u00052\u0006\u0010\u000B\u001A\u00020\u00022\u0006\u0010\f\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\r\u0010\u000EJ\'\u0010\u0013\u001A\u00020\u00052\u0006\u0010\u0010\u001A\u00020\u00022\u0006\u0010\u0011\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u0012\u0010\u000EJ\u001F\u0010\u0018\u001A\u00020\u00022\u0006\u0010\u0014\u001A\u00020\u00022\u0006\u0010\u0015\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001B\u0010\u001D\u001A\u00020\u00022\n\u0010\u001A\u001A\u0006\u0012\u0002\b\u00030\u0019H\u0000¢\u0006\u0004\b\u001B\u0010\u001CJ\'\u0010\"\u001A\u00020\u001F2\n\u0010\u001A\u001A\u0006\u0012\u0002\b\u00030\u00192\n\u0010\u001E\u001A\u0006\u0012\u0002\b\u00030\u0019H\u0000¢\u0006\u0004\b \u0010!R\u0014\u0010#\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lkotlin/collections/AbstractList$Companion;", "", "", "index", "size", "", "checkElementIndex$kotlin_stdlib", "(II)V", "checkElementIndex", "checkPositionIndex$kotlin_stdlib", "checkPositionIndex", "fromIndex", "toIndex", "checkRangeIndexes$kotlin_stdlib", "(III)V", "checkRangeIndexes", "startIndex", "endIndex", "checkBoundsIndexes$kotlin_stdlib", "checkBoundsIndexes", "oldCapacity", "minCapacity", "newCapacity$kotlin_stdlib", "(II)I", "newCapacity", "", "c", "orderedHashCode$kotlin_stdlib", "(Ljava/util/Collection;)I", "orderedHashCode", "other", "", "orderedEquals$kotlin_stdlib", "(Ljava/util/Collection;Ljava/util/Collection;)Z", "orderedEquals", "maxArraySize", "I", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final void checkBoundsIndexes$kotlin_stdlib(int v, int v1, int v2) {
            if(v >= 0 && v1 <= v2) {
                if(v > v1) {
                    throw new IllegalArgumentException("startIndex: " + v + " > endIndex: " + v1);
                }
                return;
            }
            StringBuilder stringBuilder0 = q.u("startIndex: ", v, ", endIndex: ", v1, ", size: ");
            stringBuilder0.append(v2);
            throw new IndexOutOfBoundsException(stringBuilder0.toString());
        }

        public final void checkElementIndex$kotlin_stdlib(int v, int v1) {
            if(v < 0 || v >= v1) {
                throw new IndexOutOfBoundsException("index: " + v + ", size: " + v1);
            }
        }

        public final void checkPositionIndex$kotlin_stdlib(int v, int v1) {
            if(v < 0 || v > v1) {
                throw new IndexOutOfBoundsException("index: " + v + ", size: " + v1);
            }
        }

        public final void checkRangeIndexes$kotlin_stdlib(int v, int v1, int v2) {
            if(v >= 0 && v1 <= v2) {
                if(v > v1) {
                    throw new IllegalArgumentException("fromIndex: " + v + " > toIndex: " + v1);
                }
                return;
            }
            StringBuilder stringBuilder0 = q.u("fromIndex: ", v, ", toIndex: ", v1, ", size: ");
            stringBuilder0.append(v2);
            throw new IndexOutOfBoundsException(stringBuilder0.toString());
        }

        public final int newCapacity$kotlin_stdlib(int v, int v1) {
            int v2 = v + (v >> 1) - v1 >= 0 ? v + (v >> 1) : v1;
            if(v2 - 0x7FFFFFF7 > 0) {
                return v1 <= 0x7FFFFFF7 ? 0x7FFFFFF7 : 0x7FFFFFFF;
            }
            return v2;
        }

        public final boolean orderedEquals$kotlin_stdlib(@NotNull Collection collection0, @NotNull Collection collection1) {
            Intrinsics.checkNotNullParameter(collection0, "c");
            Intrinsics.checkNotNullParameter(collection1, "other");
            if(collection0.size() != collection1.size()) {
                return false;
            }
            Iterator iterator0 = collection1.iterator();
            for(Object object0: collection0) {
                Object object1 = iterator0.next();
                if(!Intrinsics.areEqual(object0, object1)) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
            return true;
        }

        public final int orderedHashCode$kotlin_stdlib(@NotNull Collection collection0) {
            Intrinsics.checkNotNullParameter(collection0, "c");
            int v = 1;
            for(Object object0: collection0) {
                v = v * 0x1F + (object0 == null ? 0 : object0.hashCode());
            }
            return v;
        }
    }

    @NotNull
    public static final Companion Companion;

    static {
        AbstractList.Companion = new Companion(null);
    }

    @Override
    public void add(int v, Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean addAll(int v, Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof List ? AbstractList.Companion.orderedEquals$kotlin_stdlib(this, ((Collection)object0)) : false;
    }

    @Override
    public abstract Object get(int arg1);

    @Override  // kotlin.collections.AbstractCollection
    public abstract int getSize();

    @Override
    public int hashCode() {
        return AbstractList.Companion.orderedHashCode$kotlin_stdlib(this);
    }

    @Override
    public int indexOf(Object object0) {
        int v = 0;
        for(Object object1: this) {
            if(!Intrinsics.areEqual(object1, object0)) {
                ++v;
                continue;
            }
            return v;
        }
        return -1;
    }

    @Override  // kotlin.collections.AbstractCollection
    @NotNull
    public Iterator iterator() {
        return new a(this);
    }

    @Override
    public int lastIndexOf(Object object0) {
        ListIterator listIterator0 = this.listIterator(this.size());
        while(listIterator0.hasPrevious()) {
            if(Intrinsics.areEqual(listIterator0.previous(), object0)) {
                return listIterator0.nextIndex();
            }
            if(false) {
                break;
            }
        }
        return -1;
    }

    @Override
    @NotNull
    public ListIterator listIterator() {
        return new b(this, 0);
    }

    @Override
    @NotNull
    public ListIterator listIterator(int v) {
        return new b(this, v);
    }

    @Override
    public Object remove(int v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object set(int v, Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    @NotNull
    public List subList(int v, int v1) {
        return new c(this, v, v1);
    }
}

