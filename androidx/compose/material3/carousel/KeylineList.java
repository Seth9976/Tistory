package androidx.compose.material3.carousel;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u001E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u000B\n\u0002\u0010\u0000\n\u0002\b#\b\u0000\u0018\u0000 Q2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001QB\u0017\b\u0000\u0012\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00020\u0001\u00A2\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001A\u00020\u00072\u0006\u0010\u0006\u001A\u00020\u0002H\u0096\u0003\u00A2\u0006\u0004\b\b\u0010\tJ\u001E\u0010\f\u001A\u00020\u00072\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00020\nH\u0096\u0001\u00A2\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001A\u00020\u00022\u0006\u0010\u000F\u001A\u00020\u000EH\u0096\u0003\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001A\u00020\u000E2\u0006\u0010\u0006\u001A\u00020\u0002H\u0096\u0001\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001A\u00020\u0007H\u0096\u0001\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0096\u0003\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001A\u00020\u000E2\u0006\u0010\u0006\u001A\u00020\u0002H\u0096\u0001\u00A2\u0006\u0004\b\u0019\u0010\u0013J\u0016\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u00020\u001AH\u0096\u0001\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u001E\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u00020\u001A2\u0006\u0010\u000F\u001A\u00020\u000EH\u0096\u0001\u00A2\u0006\u0004\b\u001B\u0010\u001DJ&\u0010 \u001A\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u001E\u001A\u00020\u000E2\u0006\u0010\u001F\u001A\u00020\u000EH\u0096\u0001\u00A2\u0006\u0004\b \u0010!J\r\u0010\"\u001A\u00020\u0007\u00A2\u0006\u0004\b\"\u0010\u0015J\u0015\u0010%\u001A\u00020\u00072\u0006\u0010$\u001A\u00020#\u00A2\u0006\u0004\b%\u0010&J\u0015\u0010(\u001A\u00020\u000E2\u0006\u0010\'\u001A\u00020#\u00A2\u0006\u0004\b(\u0010)J\u0015\u0010*\u001A\u00020\u000E2\u0006\u0010\'\u001A\u00020#\u00A2\u0006\u0004\b*\u0010)J\u0015\u0010,\u001A\u00020\u00022\u0006\u0010+\u001A\u00020#\u00A2\u0006\u0004\b,\u0010-J\u0015\u0010.\u001A\u00020\u00022\u0006\u0010+\u001A\u00020#\u00A2\u0006\u0004\b.\u0010-J\u001A\u00101\u001A\u00020\u00072\b\u00100\u001A\u0004\u0018\u00010/H\u0096\u0002\u00A2\u0006\u0004\b1\u00102J\u000F\u00103\u001A\u00020\u000EH\u0016\u00A2\u0006\u0004\b3\u00104R\u0017\u00108\u001A\u00020\u000E8\u0006\u00A2\u0006\f\n\u0004\b5\u00106\u001A\u0004\b7\u00104R\u0017\u0010;\u001A\u00020\u000E8\u0006\u00A2\u0006\f\n\u0004\b9\u00106\u001A\u0004\b:\u00104R\u0017\u0010>\u001A\u00020\u000E8\u0006\u00A2\u0006\f\n\u0004\b<\u00106\u001A\u0004\b=\u00104R\u0017\u0010A\u001A\u00020\u000E8\u0006\u00A2\u0006\f\n\u0004\b?\u00106\u001A\u0004\b@\u00104R\u0017\u0010D\u001A\u00020\u000E8\u0006\u00A2\u0006\f\n\u0004\bB\u00106\u001A\u0004\bC\u00104R\u0014\u0010\'\u001A\u00020\u000E8\u0016X\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\bE\u00104R\u0011\u0010H\u001A\u00020\u00028F\u00A2\u0006\u0006\u001A\u0004\bF\u0010GR\u0011\u0010J\u001A\u00020\u00028F\u00A2\u0006\u0006\u001A\u0004\bI\u0010GR\u0011\u0010L\u001A\u00020\u00028F\u00A2\u0006\u0006\u001A\u0004\bK\u0010GR\u0011\u0010N\u001A\u00020\u00028F\u00A2\u0006\u0006\u001A\u0004\bM\u0010GR\u0011\u0010P\u001A\u00020\u00028F\u00A2\u0006\u0006\u001A\u0004\bO\u0010G\u00A8\u0006R"}, d2 = {"Landroidx/compose/material3/carousel/KeylineList;", "", "Landroidx/compose/material3/carousel/Keyline;", "keylines", "<init>", "(Ljava/util/List;)V", "element", "", "contains", "(Landroidx/compose/material3/carousel/Keyline;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "index", "get", "(I)Landroidx/compose/material3/carousel/Keyline;", "indexOf", "(Landroidx/compose/material3/carousel/Keyline;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "isFirstFocalItemAtStartOfContainer", "", "carouselMainAxisSize", "isLastFocalItemAtEndOfContainer", "(F)Z", "size", "firstIndexAfterFocalRangeWithSize", "(F)I", "lastIndexBeforeFocalRangeWithSize", "unadjustedOffset", "getKeylineBefore", "(F)Landroidx/compose/material3/carousel/Keyline;", "getKeylineAfter", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "b", "I", "getPivotIndex", "pivotIndex", "c", "getFirstNonAnchorIndex", "firstNonAnchorIndex", "d", "getLastNonAnchorIndex", "lastNonAnchorIndex", "e", "getFirstFocalIndex", "firstFocalIndex", "f", "getLastFocalIndex", "lastFocalIndex", "getSize", "getPivot", "()Landroidx/compose/material3/carousel/Keyline;", "pivot", "getFirstNonAnchor", "firstNonAnchor", "getLastNonAnchor", "lastNonAnchor", "getFirstFocal", "firstFocal", "getLastFocal", "lastFocal", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nKeylineList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeylineList.kt\nandroidx/compose/material3/carousel/KeylineList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,566:1\n350#2,7:567\n350#2,7:574\n378#2,7:581\n350#2,7:588\n378#2,7:595\n288#2,2:602\n288#2,2:604\n116#3,2:606\n33#3,6:608\n118#3:614\n69#3,6:615\n33#3,6:621\n*S KotlinDebug\n*F\n+ 1 KeylineList.kt\nandroidx/compose/material3/carousel/KeylineList\n*L\n72#1:567,7\n82#1:574,7\n96#1:581,7\n110#1:588,7\n128#1:595,7\n180#1:602,2\n194#1:604,2\n217#1:606,2\n217#1:608,6\n217#1:614\n225#1:615,6\n232#1:621,6\n*E\n"})
public final class KeylineList implements List, KMappedMarker {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/material3/carousel/KeylineList$Companion;", "", "Landroidx/compose/material3/carousel/KeylineList;", "Empty", "Landroidx/compose/material3/carousel/KeylineList;", "getEmpty", "()Landroidx/compose/material3/carousel/KeylineList;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final KeylineList getEmpty() {
            return KeylineList.g;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public static final KeylineList g;

    static {
        KeylineList.Companion = new Companion(null);
        KeylineList.$stable = 8;
        KeylineList.g = new KeylineList(CollectionsKt__CollectionsKt.emptyList());
    }

    public KeylineList(@NotNull List list0) {
        int v2;
        this.a = list0;
        Iterator iterator0 = this.iterator();
        int v = 0;
        int v1;
        for(v1 = 0; true; ++v1) {
            v2 = -1;
            if(!iterator0.hasNext()) {
                v1 = -1;
                break;
            }
            Object object0 = iterator0.next();
            if(((Keyline)object0).isPivot()) {
                break;
            }
        }
        this.b = v1;
        int v3 = 0;
        Iterator iterator1 = this.iterator();
        while(true) {
            if(!iterator1.hasNext()) {
                v3 = -1;
                break;
            }
            Object object1 = iterator1.next();
            if(!((Keyline)object1).isAnchor()) {
                break;
            }
            ++v3;
        }
        int v4 = -1;
        this.c = v3;
        ListIterator listIterator0 = this.listIterator(this.size());
        while(listIterator0.hasPrevious()) {
            if(!((Keyline)listIterator0.previous()).isAnchor()) {
                v4 = listIterator0.nextIndex();
                break;
            }
        }
        this.d = v4;
        Iterator iterator2 = this.iterator();
        while(true) {
            if(!iterator2.hasNext()) {
                v = -1;
                break;
            }
            Object object2 = iterator2.next();
            if(((Keyline)object2).isFocal()) {
                break;
            }
            ++v;
        }
        this.e = v;
        ListIterator listIterator1 = this.listIterator(this.size());
        while(listIterator1.hasPrevious()) {
            if(((Keyline)listIterator1.previous()).isFocal()) {
                v2 = listIterator1.nextIndex();
                break;
            }
            if(false) {
                break;
            }
        }
        this.f = v2;
    }

    public void add(int v, Keyline keyline0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void add(int v, Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean add(Keyline keyline0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean add(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean addAll(int v, Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean addAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(@NotNull Keyline keyline0) {
        return this.a.contains(keyline0);
    }

    @Override
    public final boolean contains(Object object0) {
        return object0 instanceof Keyline ? this.contains(((Keyline)object0)) : false;
    }

    @Override
    public boolean containsAll(@NotNull Collection collection0) {
        return this.a.containsAll(collection0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof KeylineList)) {
            return false;
        }
        if(this.size() != ((KeylineList)object0).size()) {
            return false;
        }
        int v = this.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(!Intrinsics.areEqual(((Keyline)this.get(v1)), ((KeylineList)object0).get(v1))) {
                return false;
            }
        }
        return true;
    }

    public final int firstIndexAfterFocalRangeWithSize(float f) {
        int v = CollectionsKt__CollectionsKt.getLastIndex(this);
        for(Object object0: new IntRange(this.f, v)) {
            if(this.get(((Number)object0).intValue()).getSize() == f) {
                return ((Integer)object0) == null ? CollectionsKt__CollectionsKt.getLastIndex(this) : ((int)(((Integer)object0)));
            }
            if(false) {
                break;
            }
        }
        return CollectionsKt__CollectionsKt.getLastIndex(this);
    }

    @NotNull
    public Keyline get(int v) {
        return (Keyline)this.a.get(v);
    }

    @Override
    public Object get(int v) {
        return this.get(v);
    }

    @NotNull
    public final Keyline getFirstFocal() {
        Keyline keyline0 = (Keyline)CollectionsKt___CollectionsKt.getOrNull(this, this.e);
        if(keyline0 == null) {
            throw new NoSuchElementException("All KeylineLists must have at least one focal keyline");
        }
        return keyline0;
    }

    public final int getFirstFocalIndex() {
        return this.e;
    }

    @NotNull
    public final Keyline getFirstNonAnchor() {
        return this.get(this.c);
    }

    public final int getFirstNonAnchorIndex() {
        return this.c;
    }

    @NotNull
    public final Keyline getKeylineAfter(float f) {
        int v = this.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = this.get(v1);
            if(((Keyline)object0).getUnadjustedOffset() >= f) {
                return ((Keyline)object0) == null ? ((Keyline)CollectionsKt___CollectionsKt.last(this)) : ((Keyline)object0);
            }
        }
        return (Keyline)CollectionsKt___CollectionsKt.last(this);
    }

    @NotNull
    public final Keyline getKeylineBefore(float f) {
        int v = this.size() - 1;
        if(v >= 0) {
            while(true) {
                Keyline keyline0 = this.get(v);
                if(keyline0.getUnadjustedOffset() < f) {
                    return keyline0;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return (Keyline)CollectionsKt___CollectionsKt.first(this);
    }

    @NotNull
    public final Keyline getLastFocal() {
        Keyline keyline0 = (Keyline)CollectionsKt___CollectionsKt.getOrNull(this, this.f);
        if(keyline0 == null) {
            throw new NoSuchElementException("All KeylineLists must have at least one focal keyline");
        }
        return keyline0;
    }

    public final int getLastFocalIndex() {
        return this.f;
    }

    @NotNull
    public final Keyline getLastNonAnchor() {
        return this.get(this.d);
    }

    public final int getLastNonAnchorIndex() {
        return this.d;
    }

    @NotNull
    public final Keyline getPivot() {
        return this.get(this.b);
    }

    public final int getPivotIndex() {
        return this.b;
    }

    public int getSize() {
        return this.a.size();
    }

    @Override
    public int hashCode() {
        int v = this.size();
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 += ((Keyline)this.get(v1)).hashCode() * 0x1F;
        }
        return v2;
    }

    public int indexOf(@NotNull Keyline keyline0) {
        return this.a.indexOf(keyline0);
    }

    @Override
    public final int indexOf(Object object0) {
        return object0 instanceof Keyline ? this.indexOf(((Keyline)object0)) : -1;
    }

    @Override
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final boolean isFirstFocalItemAtStartOfContainer() {
        return this.getFirstFocal().getOffset() - this.getFirstFocal().getSize() / 2.0f >= 0.0f && Intrinsics.areEqual(this.getFirstFocal(), this.getFirstNonAnchor());
    }

    public final boolean isLastFocalItemAtEndOfContainer(float f) {
        float f1 = this.getLastFocal().getOffset();
        return this.getLastFocal().getSize() / 2.0f + f1 <= f && Intrinsics.areEqual(this.getLastFocal(), this.getLastNonAnchor());
    }

    @Override
    @NotNull
    public Iterator iterator() {
        return this.a.iterator();
    }

    public final int lastIndexBeforeFocalRangeWithSize(float f) {
        for(Object object0: c.downTo(this.e - 1, 0)) {
            if(this.get(((Number)object0).intValue()).getSize() == f) {
                return ((Integer)object0) == null ? 0 : ((int)(((Integer)object0)));
            }
            if(false) {
                break;
            }
        }
        return 0;
    }

    public int lastIndexOf(@NotNull Keyline keyline0) {
        return this.a.lastIndexOf(keyline0);
    }

    @Override
    public final int lastIndexOf(Object object0) {
        return object0 instanceof Keyline ? this.lastIndexOf(((Keyline)object0)) : -1;
    }

    @Override
    @NotNull
    public ListIterator listIterator() {
        return this.a.listIterator();
    }

    @Override
    @NotNull
    public ListIterator listIterator(int v) {
        return this.a.listIterator(v);
    }

    public Keyline remove(int v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object remove(int v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean remove(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean removeAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void replaceAll(UnaryOperator unaryOperator0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean retainAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Keyline set(int v, Keyline keyline0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object set(int v, Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return this.getSize();
    }

    @Override
    public void sort(Comparator comparator0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    @NotNull
    public List subList(int v, int v1) {
        return this.a.subList(v, v1);
    }

    @Override
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override
    public Object[] toArray(Object[] arr_object) {
        return CollectionToArray.toArray(this, arr_object);
    }
}

