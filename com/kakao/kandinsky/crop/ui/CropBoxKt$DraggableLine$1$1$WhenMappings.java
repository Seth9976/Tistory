package com.kakao.kandinsky.crop.ui;

import com.kakao.kandinsky.crop.contract.TouchLinePoint;
import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
public final class CropBoxKt.DraggableLine.1.1.WhenMappings {
    public static final int[] $EnumSwitchMapping$0;

    static {
        int[] arr_v = new int[TouchLinePoint.values().length];
        try {
            arr_v[TouchLinePoint.Top.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[TouchLinePoint.Bottom.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[TouchLinePoint.Left.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[TouchLinePoint.Right.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        CropBoxKt.DraggableLine.1.1.WhenMappings.$EnumSwitchMapping$0 = arr_v;
    }
}

