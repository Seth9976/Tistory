package com.kakao.kandinsky.filter;

import com.kakao.kandinsky.filter.contract.FeatureMenu;
import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
public final class FilterScreenKt.FilterScreen.3.WhenMappings {
    public static final int[] $EnumSwitchMapping$0;

    static {
        int[] arr_v = new int[FeatureMenu.values().length];
        try {
            arr_v[FeatureMenu.Effect.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[FeatureMenu.Filter.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        FilterScreenKt.FilterScreen.3.WhenMappings.$EnumSwitchMapping$0 = arr_v;
    }
}

