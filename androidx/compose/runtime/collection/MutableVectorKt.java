package androidx.compose.runtime.collection;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\u001A(\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\b\b\u0002\u0010\u0002\u001A\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0005\u001AG\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0006\u001A\u00020\u00012\u0014\b\b\u0010\b\u001A\u000E\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\u0004\u0010\t\u001A\u001E\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\u0086\b¢\u0006\u0004\b\n\u0010\u000B\u001A2\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0012\u0010\r\u001A\n\u0012\u0006\b\u0001\u0012\u00028\u00000\f\"\u00028\u0000H\u0086\b¢\u0006\u0004\b\n\u0010\u000E¨\u0006\u000F"}, d2 = {"T", "", "capacity", "Landroidx/compose/runtime/collection/MutableVector;", "MutableVector", "(I)Landroidx/compose/runtime/collection/MutableVector;", "size", "Lkotlin/Function1;", "init", "(ILkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/collection/MutableVector;", "mutableVectorOf", "()Landroidx/compose/runtime/collection/MutableVector;", "", "elements", "([Ljava/lang/Object;)Landroidx/compose/runtime/collection/MutableVector;", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,1220:1\n1187#1,2:1221\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1208#1:1221,2\n*E\n"})
public final class MutableVectorKt {
    public static final MutableVector MutableVector(int v) {
        Intrinsics.reifiedOperationMarker(0, "T?");
        return new MutableVector(new Object[v], 0);
    }

    public static final MutableVector MutableVector(int v, Function1 function10) {
        Intrinsics.reifiedOperationMarker(0, "T");
        Object[] arr_object = new Object[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_object[v1] = function10.invoke(v1);
        }
        return new MutableVector(arr_object, v);
    }

    public static MutableVector MutableVector$default(int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = 16;
        }
        Intrinsics.reifiedOperationMarker(0, "T?");
        return new MutableVector(new Object[v], 0);
    }

    public static final void access$checkIndex(List list0, int v) {
        int v1 = list0.size();
        if(v < 0 || v >= v1) {
            throw new IndexOutOfBoundsException("Index " + v + " is out of bounds. The list has " + v1 + " elements.");
        }
    }

    public static final void access$checkSubIndex(List list0, int v, int v1) {
        int v2 = list0.size();
        if(v > v1) {
            throw new IllegalArgumentException("Indices are out of order. fromIndex (" + v + ") is greater than toIndex (" + v1 + ").");
        }
        if(v < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + v + ") is less than 0.");
        }
        if(v1 > v2) {
            throw new IndexOutOfBoundsException("toIndex (" + v1 + ") is more than than the list size (" + v2 + ')');
        }
    }

    public static final MutableVector mutableVectorOf() {
        Intrinsics.reifiedOperationMarker(0, "T?");
        return new MutableVector(new Object[16], 0);
    }

    public static final MutableVector mutableVectorOf(Object[] arr_object) {
        return new MutableVector(arr_object, arr_object.length);
    }
}

