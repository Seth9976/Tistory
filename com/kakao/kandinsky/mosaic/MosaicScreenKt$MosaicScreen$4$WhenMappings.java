package com.kakao.kandinsky.mosaic;

import com.kakao.kandinsky.core.kdphoto.Mosaic.Type;
import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
public final class MosaicScreenKt.MosaicScreen.4.WhenMappings {
    public static final int[] $EnumSwitchMapping$0;
    public static final int[] $EnumSwitchMapping$1;
    public static final int[] $EnumSwitchMapping$2;

    static {
        int[] arr_v = new int[Type.values().length];
        try {
            arr_v[Type.Circle.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[Type.Rectangle.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        MosaicScreenKt.MosaicScreen.4.WhenMappings.$EnumSwitchMapping$0 = arr_v;
        int[] arr_v1 = new int[com.kakao.kandinsky.core.kdphoto.Blur.Type.values().length];
        try {
            arr_v1[com.kakao.kandinsky.core.kdphoto.Blur.Type.Circle.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v1[com.kakao.kandinsky.core.kdphoto.Blur.Type.Rectangle.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        MosaicScreenKt.MosaicScreen.4.WhenMappings.$EnumSwitchMapping$1 = arr_v1;
        int[] arr_v2 = new int[ViewType.values().length];
        try {
            arr_v2[ViewType.Mosaic.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v2[ViewType.Blur.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        MosaicScreenKt.MosaicScreen.4.WhenMappings.$EnumSwitchMapping$2 = arr_v2;
    }
}

