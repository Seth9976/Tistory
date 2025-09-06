package com.kakao.kandinsky.crop;

import com.kakao.kandinsky.crop.contract.CropViewType;
import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
public final class CropScreenKt.CropScreen.3.WhenMappings {
    public static final int[] $EnumSwitchMapping$0;

    static {
        int[] arr_v = new int[CropViewType.values().length];
        try {
            arr_v[CropViewType.Crop.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[CropViewType.Rotate.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        CropScreenKt.CropScreen.3.WhenMappings.$EnumSwitchMapping$0 = arr_v;
    }
}

