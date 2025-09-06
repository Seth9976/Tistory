package kotlinx.collections.immutable.implementations.immutableSet;

import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\n\u001A\u001F\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0005\u001A\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\u0007\u001A\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006\"\u0014\u0010\b\u001A\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006\"\u0014\u0010\t\u001A\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"", "index", "shift", "indexSegment", "(II)I", "MAX_BRANCHING_FACTOR", "I", "LOG_MAX_BRANCHING_FACTOR", "MAX_BRANCHING_FACTOR_MINUS_ONE", "MAX_SHIFT", "kotlinx-collections-immutable"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class TrieNodeKt {
    public static final int LOG_MAX_BRANCHING_FACTOR = 5;
    public static final int MAX_BRANCHING_FACTOR = 0x20;
    public static final int MAX_BRANCHING_FACTOR_MINUS_ONE = 0x1F;
    public static final int MAX_SHIFT = 30;

    public static final Object[] access$addElementAtIndex(Object[] arr_object, int v, Object object0) {
        Object[] arr_object1 = new Object[arr_object.length + 1];
        ArraysKt___ArraysJvmKt.copyInto$default(arr_object, arr_object1, 0, 0, v, 6, null);
        ArraysKt___ArraysJvmKt.copyInto(arr_object, arr_object1, v + 1, v, arr_object.length);
        arr_object1[v] = object0;
        return arr_object1;
    }

    public static final Object[] access$removeCellAtIndex(Object[] arr_object, int v) {
        Object[] arr_object1 = new Object[arr_object.length - 1];
        ArraysKt___ArraysJvmKt.copyInto$default(arr_object, arr_object1, 0, 0, v, 6, null);
        ArraysKt___ArraysJvmKt.copyInto(arr_object, arr_object1, v, v + 1, arr_object.length);
        return arr_object1;
    }

    public static final int indexSegment(int v, int v1) [...] // Inlined contents
}

