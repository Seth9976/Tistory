package androidx.compose.ui.text.font;

import androidx.compose.runtime.Immutable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u001E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0017\b\u0000\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002\u00A2\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0003H\u0096\u0003\u00A2\u0006\u0004\b\t\u0010\nJ\u001E\u0010\r\u001A\u00020\b2\f\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u00030\u000BH\u0096\u0001\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0018\u0010\u0011\u001A\u00020\u00032\u0006\u0010\u0010\u001A\u00020\u000FH\u0096\u0003\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001A\u00020\u000F2\u0006\u0010\u0007\u001A\u00020\u0003H\u0096\u0001\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001A\u00020\bH\u0096\u0001\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\u00030\u0017H\u0096\u0003\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001A\u001A\u00020\u000F2\u0006\u0010\u0007\u001A\u00020\u0003H\u0096\u0001\u00A2\u0006\u0004\b\u001A\u0010\u0014J\u0016\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\u00030\u001BH\u0096\u0001\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u001E\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\u00030\u001B2\u0006\u0010\u0010\u001A\u00020\u000FH\u0096\u0001\u00A2\u0006\u0004\b\u001C\u0010\u001EJ&\u0010!\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u001F\u001A\u00020\u000F2\u0006\u0010 \u001A\u00020\u000FH\u0096\u0001\u00A2\u0006\u0004\b!\u0010\"J\u001A\u0010%\u001A\u00020\b2\b\u0010$\u001A\u0004\u0018\u00010#H\u0096\u0002\u00A2\u0006\u0004\b%\u0010&J\u000F\u0010\'\u001A\u00020\u000FH\u0016\u00A2\u0006\u0004\b\'\u0010(J\u000F\u0010*\u001A\u00020)H\u0016\u00A2\u0006\u0004\b*\u0010+R\u001D\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00A2\u0006\f\n\u0004\b,\u0010-\u001A\u0004\b.\u0010/R\u0014\u00101\u001A\u00020\u000F8\u0016X\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\b0\u0010(\u00A8\u00062"}, d2 = {"Landroidx/compose/ui/text/font/FontListFontFamily;", "Landroidx/compose/ui/text/font/FileBasedFontFamily;", "", "Landroidx/compose/ui/text/font/Font;", "fonts", "<init>", "(Ljava/util/List;)V", "element", "", "contains", "(Landroidx/compose/ui/text/font/Font;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "index", "get", "(I)Landroidx/compose/ui/text/font/Font;", "indexOf", "(Landroidx/compose/ui/text/font/Font;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "g", "Ljava/util/List;", "getFonts", "()Ljava/util/List;", "getSize", "size", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFontFamily.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontFamily.kt\nandroidx/compose/ui/text/font/FontListFontFamily\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,268:1\n1#2:269\n*E\n"})
public final class FontListFontFamily extends FileBasedFontFamily implements List, KMappedMarker {
    public static final int $stable;
    public final List g;

    public FontListFontFamily(@NotNull List list0) {
        super(null);
        this.g = list0;
        if(list0.isEmpty()) {
            throw new IllegalStateException("At least one font should be passed to FontFamily");
        }
    }

    public void add(int v, Font font0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void add(int v, Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean add(Font font0) {
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

    public boolean contains(@NotNull Font font0) {
        return this.g.contains(font0);
    }

    @Override
    public final boolean contains(Object object0) {
        return object0 instanceof Font ? this.contains(((Font)object0)) : false;
    }

    @Override
    public boolean containsAll(@NotNull Collection collection0) {
        return this.g.containsAll(collection0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof FontListFontFamily ? Intrinsics.areEqual(this.g, ((FontListFontFamily)object0).g) : false;
    }

    @NotNull
    public Font get(int v) {
        return (Font)this.g.get(v);
    }

    @Override
    public Object get(int v) {
        return this.get(v);
    }

    @NotNull
    public final List getFonts() {
        return this.g;
    }

    public int getSize() {
        return this.g.size();
    }

    @Override
    public int hashCode() {
        return this.g.hashCode();
    }

    public int indexOf(@NotNull Font font0) {
        return this.g.indexOf(font0);
    }

    @Override
    public final int indexOf(Object object0) {
        return object0 instanceof Font ? this.indexOf(((Font)object0)) : -1;
    }

    @Override
    public boolean isEmpty() {
        return this.g.isEmpty();
    }

    @Override
    @NotNull
    public Iterator iterator() {
        return this.g.iterator();
    }

    public int lastIndexOf(@NotNull Font font0) {
        return this.g.lastIndexOf(font0);
    }

    @Override
    public final int lastIndexOf(Object object0) {
        return object0 instanceof Font ? this.lastIndexOf(((Font)object0)) : -1;
    }

    @Override
    @NotNull
    public ListIterator listIterator() {
        return this.g.listIterator();
    }

    @Override
    @NotNull
    public ListIterator listIterator(int v) {
        return this.g.listIterator(v);
    }

    public Font remove(int v) {
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

    public Font set(int v, Font font0) {
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
        return this.g.subList(v, v1);
    }

    @Override
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override
    public Object[] toArray(Object[] arr_object) {
        return CollectionToArray.toArray(this, arr_object);
    }

    @Override
    @NotNull
    public String toString() {
        return "FontListFontFamily(fonts=" + this.g + ')';
    }
}

