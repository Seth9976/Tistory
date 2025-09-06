package com.kakao.keditor.plugin.itemspec.table;

import com.kakao.common.util.UnitConversionKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000E\u0010\u0002\u001A\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0003"}, d2 = {"THICK_LINE_WIDTH", "", "THIN_LINE_WIDTH", "keditor_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class TableStyleKt {
    private static final float THICK_LINE_WIDTH;
    private static final float THIN_LINE_WIDTH;

    static {
        TableStyleKt.THIN_LINE_WIDTH = UnitConversionKt.dp2px(0.5f);
        TableStyleKt.THICK_LINE_WIDTH = UnitConversionKt.dp2px(1.0f);
    }

    public static final float access$getTHICK_LINE_WIDTH$p() [...] // 潜在的解密器

    public static final float access$getTHIN_LINE_WIDTH$p() {
        return TableStyleKt.THIN_LINE_WIDTH;
    }
}

