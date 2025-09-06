package com.kakao.common.util;

import android.content.res.Resources;
import android.util.TypedValue;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001A\n\u0010\u0000\u001A\u00020\u0001*\u00020\u0001\u001A\n\u0010\u0002\u001A\u00020\u0003*\u00020\u0001\u001A\n\u0010\u0004\u001A\u00020\u0001*\u00020\u0001\u001A\n\u0010\u0005\u001A\u00020\u0003*\u00020\u0001¨\u0006\u0006"}, d2 = {"dp2px", "", "dp2pxRoundDown", "", "px2dp", "px2dpRoundDown", "keditor_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class UnitConversionKt {
    public static final float dp2px(float f) {
        return TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics());
    }

    public static final int dp2pxRoundDown(float f) {
        return (int)UnitConversionKt.dp2px(f);
    }

    public static final float px2dp(float f) {
        return f / Resources.getSystem().getDisplayMetrics().density;
    }

    public static final int px2dpRoundDown(float f) {
        return (int)UnitConversionKt.px2dp(f);
    }
}

