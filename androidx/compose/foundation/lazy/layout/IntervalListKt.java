package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nIntervalList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/IntervalListKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,222:1\n48#2:223\n523#2:224\n523#2:225\n*S KotlinDebug\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/IntervalListKt\n*L\n198#1:223\n203#1:224\n212#1:225\n*E\n"})
public final class IntervalListKt {
    public static final int access$binarySearch(MutableVector mutableVector0, int v) {
        int v1 = mutableVector0.getSize() - 1;
        int v2 = 0;
        while(v2 < v1) {
            int v3 = (v1 - v2) / 2 + v2;
            int v4 = ((Interval)mutableVector0.getContent()[v3]).getStartIndex();
            if(v4 == v) {
                return v3;
            }
            if(v4 < v) {
                v2 = v3 + 1;
                if(v >= ((Interval)mutableVector0.getContent()[v2]).getStartIndex()) {
                    continue;
                }
                return v3;
            }
            v1 = v3 - 1;
        }
        return v2;
    }
}

