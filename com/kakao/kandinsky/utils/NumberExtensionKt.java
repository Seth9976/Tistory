package com.kakao.kandinsky.utils;

import kotlin.Metadata;
import zd.c;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001A\u0012\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003\u001A\n\u0010\u0004\u001A\u00020\u0001*\u00020\u0001¨\u0006\u0005"}, d2 = {"round", "", "decimalPoint", "", "toDegrees", "utils_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class NumberExtensionKt {
    public static final float round(float f, int v) {
        float f1 = (float)Math.pow(10.0, v);
        return ((float)c.roundToInt(f * f1)) / f1;
    }

    public static final float toDegrees(float f) {
        return (float)Math.toDegrees(f);
    }
}

