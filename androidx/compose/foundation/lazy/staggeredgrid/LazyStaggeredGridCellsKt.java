package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class LazyStaggeredGridCellsKt {
    public static final int[] access$calculateCellsCrossAxisSizeImpl(int v, int v1, int v2) {
        int v3 = v - (v1 - 1) * v2;
        int v4 = v3 / v1;
        int[] arr_v = new int[v1];
        for(int v5 = 0; v5 < v1; ++v5) {
            arr_v[v5] = v4 >= 0 ? (v5 >= v3 % v1 ? 0 : 1) + v4 : 0;
        }
        return arr_v;
    }
}

