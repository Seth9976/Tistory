package com.kakao.kandinsky.utils;

import android.graphics.Matrix;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.PersistentList;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u001E\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0010*\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087@\u0018\u0000 =2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001=B\u0017\u0012\u000E\b\u0002\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00020\u0001\u00A2\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\n\u001A\u00020\u00072\u0006\u0010\u0006\u001A\u00020\u0002H\u0096\u0003\u00A2\u0006\u0004\b\b\u0010\tJ\u001E\u0010\u000F\u001A\u00020\u00072\f\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u00020\u000BH\u0096\u0001\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0018\u0010\u0014\u001A\u00020\u00022\u0006\u0010\u0011\u001A\u00020\u0010H\u0096\u0003\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0017\u001A\u00020\u00102\u0006\u0010\u0006\u001A\u00020\u0002H\u0096\u0001\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u001A\u001A\u00020\u0007H\u0096\u0001\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001E\u001A\b\u0012\u0004\u0012\u00020\u00020\u001BH\u0096\u0003\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0018\u0010 \u001A\u00020\u00102\u0006\u0010\u0006\u001A\u00020\u0002H\u0096\u0001\u00A2\u0006\u0004\b\u001F\u0010\u0016J\u0016\u0010$\u001A\b\u0012\u0004\u0012\u00020\u00020!H\u0096\u0001\u00A2\u0006\u0004\b\"\u0010#J\u001E\u0010$\u001A\b\u0012\u0004\u0012\u00020\u00020!2\u0006\u0010\u0011\u001A\u00020\u0010H\u0096\u0001\u00A2\u0006\u0004\b\"\u0010%J&\u0010*\u001A\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010&\u001A\u00020\u00102\u0006\u0010\'\u001A\u00020\u0010H\u0096\u0001\u00A2\u0006\u0004\b(\u0010)J\r\u0010.\u001A\u00020+\u00A2\u0006\u0004\b,\u0010-J\u0010\u00102\u001A\u00020/H\u00D6\u0001\u00A2\u0006\u0004\b0\u00101J\u0010\u00105\u001A\u00020\u0010H\u00D6\u0001\u00A2\u0006\u0004\b3\u00104J\u001A\u0010:\u001A\u00020\u00072\b\u00107\u001A\u0004\u0018\u000106H\u00D6\u0003\u00A2\u0006\u0004\b8\u00109R\u0014\u0010<\u001A\u00020\u00108\u0016X\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\b;\u00104\u0088\u0001\u0003\u0092\u0001\b\u0012\u0004\u0012\u00020\u00020\u0001\u00A8\u0006>"}, d2 = {"Lcom/kakao/kandinsky/utils/MatrixValues;", "Lkotlinx/collections/immutable/ImmutableList;", "", "values", "constructor-impl", "(Lkotlinx/collections/immutable/ImmutableList;)Lkotlinx/collections/immutable/ImmutableList;", "element", "", "contains-impl", "(Lkotlinx/collections/immutable/ImmutableList;F)Z", "contains", "", "elements", "containsAll-impl", "(Lkotlinx/collections/immutable/ImmutableList;Ljava/util/Collection;)Z", "containsAll", "", "index", "get-impl", "(Lkotlinx/collections/immutable/ImmutableList;I)Ljava/lang/Float;", "get", "indexOf-impl", "(Lkotlinx/collections/immutable/ImmutableList;F)I", "indexOf", "isEmpty-impl", "(Lkotlinx/collections/immutable/ImmutableList;)Z", "isEmpty", "", "iterator-impl", "(Lkotlinx/collections/immutable/ImmutableList;)Ljava/util/Iterator;", "iterator", "lastIndexOf-impl", "lastIndexOf", "", "listIterator-impl", "(Lkotlinx/collections/immutable/ImmutableList;)Ljava/util/ListIterator;", "listIterator", "(Lkotlinx/collections/immutable/ImmutableList;I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList-impl", "(Lkotlinx/collections/immutable/ImmutableList;II)Lkotlinx/collections/immutable/ImmutableList;", "subList", "Landroid/graphics/Matrix;", "toMatrix-impl", "(Lkotlinx/collections/immutable/ImmutableList;)Landroid/graphics/Matrix;", "toMatrix", "", "toString-impl", "(Lkotlinx/collections/immutable/ImmutableList;)Ljava/lang/String;", "toString", "hashCode-impl", "(Lkotlinx/collections/immutable/ImmutableList;)I", "hashCode", "", "other", "equals-impl", "(Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/Object;)Z", "equals", "getSize-impl", "size", "Companion", "utils_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@JvmInline
@SourceDebugExtension({"SMAP\nMatrixValues.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatrixValues.kt\ncom/kakao/kandinsky/utils/MatrixValues\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Matrix.kt\nandroidx/core/graphics/MatrixKt\n*L\n1#1,21:1\n1#2:22\n1#2:24\n32#3:23\n*S KotlinDebug\n*F\n+ 1 MatrixValues.kt\ncom/kakao/kandinsky/utils/MatrixValues\n*L\n17#1:24\n17#1:23\n*E\n"})
public final class MatrixValues implements ImmutableList {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001D\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/kakao/kandinsky/utils/MatrixValues$Companion;", "", "Lkotlinx/collections/immutable/PersistentList;", "", "IDENTITY_MATRIX_VALUES", "Lkotlinx/collections/immutable/PersistentList;", "getIDENTITY_MATRIX_VALUES", "()Lkotlinx/collections/immutable/PersistentList;", "utils_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final PersistentList getIDENTITY_MATRIX_VALUES() {
            return MatrixValues.b;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final ImmutableList a;
    public static final PersistentList b;

    static {
        MatrixValues.Companion = new Companion(null);
        Matrix matrix0 = new Matrix();
        float[] arr_f = new float[9];
        matrix0.getValues(arr_f);
        MatrixValues.b = ExtensionsKt.toPersistentList(ArraysKt___ArraysKt.toList(arr_f));
    }

    public MatrixValues(ImmutableList immutableList0) {
        this.a = immutableList0;
    }

    public void add(int v, float f) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void add(int v, Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean add(float f) {
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

    public static final MatrixValues box-impl(ImmutableList immutableList0) {
        return new MatrixValues(immutableList0);
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @NotNull
    public static ImmutableList constructor-impl(@NotNull ImmutableList immutableList0) {
        Intrinsics.checkNotNullParameter(immutableList0, "values");
        if(immutableList0.size() != 9) {
            throw new IllegalArgumentException("MatrixValues must have 9 elements");
        }
        return immutableList0;
    }

    public static ImmutableList constructor-impl$default(ImmutableList immutableList0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            immutableList0 = MatrixValues.b;
        }
        return MatrixValues.constructor-impl(immutableList0);
    }

    public boolean contains(float f) {
        return MatrixValues.contains-impl(this.a, f);
    }

    @Override
    public final boolean contains(Object object0) {
        return object0 instanceof Float ? this.contains(((Number)object0).floatValue()) : false;
    }

    public static boolean contains-impl(ImmutableList immutableList0, float f) {
        return immutableList0.contains(f);
    }

    @Override
    public boolean containsAll(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        return MatrixValues.containsAll-impl(this.a, collection0);
    }

    public static boolean containsAll-impl(ImmutableList immutableList0, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        return immutableList0.containsAll(collection0);
    }

    @Override
    public boolean equals(Object object0) {
        return MatrixValues.equals-impl(this.a, object0);
    }

    // 去混淆评级： 低(20)
    public static boolean equals-impl(ImmutableList immutableList0, Object object0) {
        return object0 instanceof MatrixValues ? Intrinsics.areEqual(immutableList0, ((MatrixValues)object0).unbox-impl()) : false;
    }

    public static final boolean equals-impl0(ImmutableList immutableList0, ImmutableList immutableList1) {
        return Intrinsics.areEqual(immutableList0, immutableList1);
    }

    @NotNull
    public Float get(int v) {
        return MatrixValues.get-impl(this.a, v);
    }

    @Override
    public Object get(int v) {
        return this.get(v);
    }

    @NotNull
    public static Float get-impl(ImmutableList immutableList0, int v) {
        return (Float)immutableList0.get(v);
    }

    public int getSize() {
        return MatrixValues.getSize-impl(this.a);
    }

    public static int getSize-impl(ImmutableList immutableList0) {
        return immutableList0.size();
    }

    @Override
    public int hashCode() {
        return MatrixValues.hashCode-impl(this.a);
    }

    public static int hashCode-impl(ImmutableList immutableList0) {
        return immutableList0.hashCode();
    }

    public int indexOf(float f) {
        return MatrixValues.indexOf-impl(this.a, f);
    }

    @Override
    public final int indexOf(Object object0) {
        return object0 instanceof Float ? this.indexOf(((Number)object0).floatValue()) : -1;
    }

    public static int indexOf-impl(ImmutableList immutableList0, float f) {
        return immutableList0.indexOf(f);
    }

    @Override
    public boolean isEmpty() {
        return MatrixValues.isEmpty-impl(this.a);
    }

    public static boolean isEmpty-impl(ImmutableList immutableList0) {
        return immutableList0.isEmpty();
    }

    @Override
    @NotNull
    public Iterator iterator() {
        return MatrixValues.iterator-impl(this.a);
    }

    @NotNull
    public static Iterator iterator-impl(ImmutableList immutableList0) {
        return immutableList0.iterator();
    }

    public int lastIndexOf(float f) {
        return MatrixValues.lastIndexOf-impl(this.a, f);
    }

    @Override
    public final int lastIndexOf(Object object0) {
        return object0 instanceof Float ? this.lastIndexOf(((Number)object0).floatValue()) : -1;
    }

    public static int lastIndexOf-impl(ImmutableList immutableList0, float f) {
        return immutableList0.lastIndexOf(f);
    }

    @Override
    @NotNull
    public ListIterator listIterator() {
        return MatrixValues.listIterator-impl(this.a);
    }

    @Override
    @NotNull
    public ListIterator listIterator(int v) {
        return MatrixValues.listIterator-impl(this.a, v);
    }

    @NotNull
    public static ListIterator listIterator-impl(ImmutableList immutableList0) {
        return immutableList0.listIterator();
    }

    @NotNull
    public static ListIterator listIterator-impl(ImmutableList immutableList0, int v) {
        return immutableList0.listIterator(v);
    }

    public float remove(int v) {
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

    public Float set(int v, float f) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object set(int v, Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public int size() {
        return this.getSize();
    }

    @Override
    public void sort(Comparator comparator0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public List subList(int v, int v1) {
        return this.subList(v, v1);
    }

    @Override  // kotlinx.collections.immutable.ImmutableList
    @NotNull
    public ImmutableList subList(int v, int v1) {
        return MatrixValues.subList-impl(this.a, v, v1);
    }

    @NotNull
    public static ImmutableList subList-impl(ImmutableList immutableList0, int v, int v1) {
        return immutableList0.subList(v, v1);
    }

    @Override
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override
    public Object[] toArray(Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "array");
        return CollectionToArray.toArray(this, arr_object);
    }

    @NotNull
    public static final Matrix toMatrix-impl(ImmutableList immutableList0) {
        Matrix matrix0 = new Matrix();
        matrix0.setValues(CollectionsKt___CollectionsKt.toFloatArray(MatrixValues.box-impl(immutableList0)));
        return matrix0;
    }

    @Override
    public String toString() {
        return "MatrixValues(values=" + this.a + ")";
    }

    public static String toString-impl(ImmutableList immutableList0) [...] // Inlined contents

    public final ImmutableList unbox-impl() {
        return this.a;
    }
}

