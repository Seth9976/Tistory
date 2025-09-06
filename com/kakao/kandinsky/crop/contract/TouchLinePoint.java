package com.kakao.kandinsky.crop.contract;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/kakao/kandinsky/crop/contract/TouchLinePoint;", "", "Lcom/kakao/kandinsky/crop/contract/TouchDragPoint;", "Top", "Left", "Right", "Bottom", "crop_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum TouchLinePoint implements TouchDragPoint {
    Top,
    Left,
    Right,
    Bottom;

    public static final TouchLinePoint[] a;
    public static final EnumEntries b;

    static {
        TouchLinePoint.a = arr_touchLinePoint;
        Intrinsics.checkNotNullParameter(arr_touchLinePoint, "entries");
        TouchLinePoint.b = new a(arr_touchLinePoint);
    }

    @NotNull
    public static EnumEntries getEntries() {
        return TouchLinePoint.b;
    }
}

