package com.kakao.kandinsky.designsystem.common;

import com.kakao.kandinsky.designsystem.theme.Orientation;
import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
public final class MenuListKt.MenuList.1.WhenMappings {
    public static final int[] $EnumSwitchMapping$0;

    static {
        int[] arr_v = new int[Orientation.values().length];
        try {
            arr_v[Orientation.Portrait.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[Orientation.Landscape.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        MenuListKt.MenuList.1.WhenMappings.$EnumSwitchMapping$0 = arr_v;
    }
}

