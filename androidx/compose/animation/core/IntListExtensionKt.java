package androidx.compose.animation.core;

import androidx.collection.IntList;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A(\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00012\b\b\u0002\u0010\u0004\u001A\u00020\u00012\b\b\u0002\u0010\u0005\u001A\u00020\u0001H\u0001¨\u0006\u0006"}, d2 = {"binarySearch", "", "Landroidx/collection/IntList;", "element", "fromIndex", "toIndex", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nIntListExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntListExtension.kt\nandroidx/compose/animation/core/IntListExtensionKt\n+ 2 Preconditions.kt\nandroidx/compose/animation/core/PreconditionsKt\n*L\n1#1,74:1\n33#2,7:75\n*S KotlinDebug\n*F\n+ 1 IntListExtension.kt\nandroidx/compose/animation/core/IntListExtensionKt\n*L\n49#1:75,7\n*E\n"})
public final class IntListExtensionKt {
    @JvmOverloads
    public static final int binarySearch(@NotNull IntList intList0, int v) {
        return IntListExtensionKt.binarySearch$default(intList0, v, 0, 0, 6, null);
    }

    @JvmOverloads
    public static final int binarySearch(@NotNull IntList intList0, int v, int v1) {
        return IntListExtensionKt.binarySearch$default(intList0, v, v1, 0, 4, null);
    }

    @JvmOverloads
    public static final int binarySearch(@NotNull IntList intList0, int v, int v1, int v2) {
        if(v1 > v2) {
            PreconditionsKt.throwIllegalArgumentException(("fromIndex(" + v1 + ") > toIndex(" + v2 + ')'));
        }
        if(v1 < 0) {
            throw new IndexOutOfBoundsException("Index out of range: " + v1);
        }
        if(v2 > intList0.getSize()) {
            throw new IndexOutOfBoundsException("Index out of range: " + v2);
        }
        int v3 = v2 - 1;
        while(v1 <= v3) {
            int v4 = v1 + v3 >>> 1;
            int v5 = intList0.get(v4);
            if(v5 < v) {
                v1 = v4 + 1;
                continue;
            }
            if(v5 > v) {
                v3 = v4 - 1;
                continue;
            }
            return v4;
        }
        return -(v1 + 1);
    }

    public static int binarySearch$default(IntList intList0, int v, int v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v1 = 0;
        }
        if((v3 & 4) != 0) {
            v2 = intList0.getSize();
        }
        return IntListExtensionKt.binarySearch(intList0, v, v1, v2);
    }
}

