package com.kakao.tistory.presentation.main.ui;

import com.kakao.tistory.presentation.main.navigation.MainDestination;
import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
public final class MainBottomBarKt.MainBottomBar.1.WhenMappings {
    public static final int[] $EnumSwitchMapping$0;

    static {
        int[] arr_v = new int[MainDestination.values().length];
        try {
            arr_v[MainDestination.HOME.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[MainDestination.FEED.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[MainDestination.NOTIFICATION.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[MainDestination.EDITOR.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[MainDestination.MY.ordinal()] = 5;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        MainBottomBarKt.MainBottomBar.1.WhenMappings.$EnumSwitchMapping$0 = arr_v;
    }
}

