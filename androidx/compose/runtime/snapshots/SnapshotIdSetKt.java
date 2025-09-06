package androidx.compose.runtime.snapshots;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\b\u0002\u001A\u0014\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"binarySearch", "", "", "value", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class SnapshotIdSetKt {
    public static final int binarySearch(@NotNull int[] arr_v, int v) {
        int v1 = arr_v.length - 1;
        int v2 = 0;
        while(v2 <= v1) {
            int v3 = v2 + v1 >>> 1;
            int v4 = arr_v[v3];
            if(v > v4) {
                v2 = v3 + 1;
                continue;
            }
            if(v < v4) {
                v1 = v3 - 1;
                continue;
            }
            return v3;
        }
        return -(v2 + 1);
    }
}

