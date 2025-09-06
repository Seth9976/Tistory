package androidx.core.graphics;

import androidx.annotation.RequiresApi;

public enum BlendModeCompat {
    CLEAR,
    SRC,
    DST,
    SRC_OVER,
    DST_OVER,
    SRC_IN,
    DST_IN,
    SRC_OUT,
    DST_OUT,
    SRC_ATOP,
    DST_ATOP,
    XOR,
    PLUS,
    MODULATE,
    SCREEN,
    OVERLAY,
    DARKEN,
    LIGHTEN,
    @RequiresApi(29)
    COLOR_DODGE,
    @RequiresApi(29)
    COLOR_BURN,
    @RequiresApi(29)
    HARD_LIGHT,
    @RequiresApi(29)
    SOFT_LIGHT,
    @RequiresApi(29)
    DIFFERENCE,
    @RequiresApi(29)
    EXCLUSION,
    @RequiresApi(29)
    MULTIPLY,
    @RequiresApi(29)
    HUE,
    @RequiresApi(29)
    SATURATION,
    @RequiresApi(29)
    COLOR,
    @RequiresApi(29)
    LUMINOSITY;

}

