package com.kakao.tistory.presentation.view;

import com.kakao.tistory.presentation.viewmodel.SplashViewModel.DestinationType;
import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
public final class SplashActivity.initViewModel.1.3.WhenMappings {
    public static final int[] $EnumSwitchMapping$0;

    static {
        int[] arr_v = new int[DestinationType.values().length];
        try {
            arr_v[DestinationType.LOGIN.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[DestinationType.MAIN.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[DestinationType.TRANSFER.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        SplashActivity.initViewModel.1.3.WhenMappings.$EnumSwitchMapping$0 = arr_v;
    }
}

