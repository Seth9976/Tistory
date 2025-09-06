package com.kakao.keditor.standard;

import android.content.res.Resources;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u000B\n\u0002\u0010\b\n\u0002\b\u0005\u001A\u0015\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0002H\u0086\u0004\u001A\n\u0010\u0004\u001A\u00020\u0002*\u00020\u0002\u001A\u0015\u0010\u0005\u001A\u00020\u0002*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0002H\u0086\u0004\u001A\u0015\u0010\u0006\u001A\u00020\u0002*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0002H\u0086\u0004¨\u0006\u0007"}, d2 = {"containsFlag", "", "", "flag", "dpToSp", "minusFlag", "plusFlag", "keditor_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class IntStandardKt {
    public static final boolean containsFlag(int v, int v1) {
        return (v & v1) == v1;
    }

    public static final int dpToSp(int v) {
        return (int)(((float)v) * Resources.getSystem().getDisplayMetrics().scaledDensity);
    }

    public static final int minusFlag(int v, int v1) {
        return v & ~v1;
    }

    public static final int plusFlag(int v, int v1) [...] // Inlined contents
}

