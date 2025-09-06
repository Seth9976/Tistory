package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.a;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

@ExperimentalUnsignedTypes
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u001E\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0017\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\n\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u000B\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00014B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0001\u0012\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u001B\u0010\r\u001A\u00020\u00022\u0006\u0010\n\u001A\u00020\u0003H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u000B\u0010\fJ \u0010\u0012\u001A\u00020\u000F2\u0006\u0010\n\u001A\u00020\u00032\u0006\u0010\u000E\u001A\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u001B\u001A\u00020\u00182\u0006\u0010\u0017\u001A\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001AJ\u001D\u0010\u001F\u001A\u00020\u00182\f\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016¢\u0006\u0004\b\u001D\u0010\u001EJ\u000F\u0010\"\u001A\u00020\u0018H\u0016¢\u0006\u0004\b \u0010!J\u0010\u0010&\u001A\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010)\u001A\u00020\u0003HÖ\u0001¢\u0006\u0004\b\'\u0010(J\u001A\u0010.\u001A\u00020\u00182\b\u0010+\u001A\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-R\u001A\u0010\b\u001A\u00020\u00078\u0000X\u0081\u0004¢\u0006\f\n\u0004\b/\u00100\u0012\u0004\b1\u00102R\u0014\u0010\u0004\u001A\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b3\u0010(\u0088\u0001\b\u0092\u0001\u00020\u0007\u0082\u0002\u0004\n\u0002\b!¨\u00065"}, d2 = {"Lkotlin/UShortArray;", "", "Lkotlin/UShort;", "", "size", "constructor-impl", "(I)[S", "", "storage", "([S)[S", "index", "get-Mh2AYeg", "([SI)S", "get", "value", "", "set-01HTLdE", "([SIS)V", "set", "", "iterator-impl", "([S)Ljava/util/Iterator;", "iterator", "element", "", "contains-xj2QHRw", "([SS)Z", "contains", "elements", "containsAll-impl", "([SLjava/util/Collection;)Z", "containsAll", "isEmpty-impl", "([S)Z", "isEmpty", "", "toString-impl", "([S)Ljava/lang/String;", "toString", "hashCode-impl", "([S)I", "hashCode", "", "other", "equals-impl", "([SLjava/lang/Object;)Z", "equals", "a", "[S", "getStorage$annotations", "()V", "getSize-impl", "kotlin/collections/a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SinceKotlin(version = "1.3")
@JvmInline
@SourceDebugExtension({"SMAP\nUShortArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UShortArray.kt\nkotlin/UShortArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1726#2,3:87\n*S KotlinDebug\n*F\n+ 1 UShortArray.kt\nkotlin/UShortArray\n*L\n62#1:87,3\n*E\n"})
public final class UShortArray implements Collection, KMappedMarker {
    public final short[] a;

    public UShortArray(short[] arr_v) {
        this.a = arr_v;
    }

    @Override
    public boolean add(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean add-xj2QHRw(short v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean addAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static final UShortArray box-impl(short[] arr_v) {
        return new UShortArray(arr_v);
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @NotNull
    public static short[] constructor-impl(int v) {
        return UShortArray.constructor-impl(new short[v]);
    }

    @PublishedApi
    @NotNull
    public static short[] constructor-impl(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "storage");
        return arr_v;
    }

    @Override
    public final boolean contains(Object object0) {
        return object0 instanceof UShort ? this.contains-xj2QHRw(((UShort)object0).unbox-impl()) : false;
    }

    public static boolean contains-xj2QHRw(short[] arr_v, short v) {
        return ArraysKt___ArraysKt.contains(arr_v, v);
    }

    public boolean contains-xj2QHRw(short v) {
        return UShortArray.contains-xj2QHRw(this.a, v);
    }

    @Override
    public boolean containsAll(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        return UShortArray.containsAll-impl(this.a, collection0);
    }

    public static boolean containsAll-impl(short[] arr_v, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        if(!collection0.isEmpty()) {
            for(Object object0: collection0) {
                if(!(object0 instanceof UShort) || !ArraysKt___ArraysKt.contains(arr_v, ((UShort)object0).unbox-impl())) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
        }
        return true;
    }

    @Override
    public boolean equals(Object object0) {
        return UShortArray.equals-impl(this.a, object0);
    }

    // 去混淆评级： 低(20)
    public static boolean equals-impl(short[] arr_v, Object object0) {
        return object0 instanceof UShortArray ? Intrinsics.areEqual(arr_v, ((UShortArray)object0).unbox-impl()) : false;
    }

    public static final boolean equals-impl0(short[] arr_v, short[] arr_v1) {
        return Intrinsics.areEqual(arr_v, arr_v1);
    }

    public static final short get-Mh2AYeg(short[] arr_v, int v) {
        return UShort.constructor-impl(arr_v[v]);
    }

    public int getSize() {
        return UShortArray.getSize-impl(this.a);
    }

    public static int getSize-impl(short[] arr_v) {
        return arr_v.length;
    }

    @PublishedApi
    public static void getStorage$annotations() {
    }

    @Override
    public int hashCode() {
        return UShortArray.hashCode-impl(this.a);
    }

    public static int hashCode-impl(short[] arr_v) {
        return Arrays.hashCode(arr_v);
    }

    @Override
    public boolean isEmpty() {
        return UShortArray.isEmpty-impl(this.a);
    }

    public static boolean isEmpty-impl(short[] arr_v) {
        return arr_v.length == 0;
    }

    @Override
    @NotNull
    public Iterator iterator() {
        return UShortArray.iterator-impl(this.a);
    }

    @NotNull
    public static Iterator iterator-impl(short[] arr_v) {
        return new a(arr_v);
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
    public boolean retainAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static final void set-01HTLdE(short[] arr_v, int v, short v1) {
        arr_v[v] = v1;
    }

    @Override
    public int size() {
        return this.getSize();
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

    @Override
    public String toString() {
        return UShortArray.toString-impl(this.a);
    }

    public static String toString-impl(short[] arr_v) {
        return "UShortArray(storage=" + Arrays.toString(arr_v) + ')';
    }

    public final short[] unbox-impl() {
        return this.a;
    }
}

