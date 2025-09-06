package com.kakao.kandinsky.crop.contract;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/kakao/kandinsky/crop/contract/TouchCirclePoint;", "", "Lcom/kakao/kandinsky/crop/contract/TouchDragPoint;", "TopLeft", "TopRight", "BottomRight", "BottomLeft", "crop_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum TouchCirclePoint implements TouchDragPoint {
    TopLeft,
    TopRight,
    BottomRight,
    BottomLeft;

    public static final TouchCirclePoint[] a;
    public static final EnumEntries b;

    static {
        TouchCirclePoint.a = arr_touchCirclePoint;
        Intrinsics.checkNotNullParameter(arr_touchCirclePoint, "entries");
        TouchCirclePoint.b = new a(arr_touchCirclePoint);
    }

    @NotNull
    public static EnumEntries getEntries() {
        return TouchCirclePoint.b;
    }
}

