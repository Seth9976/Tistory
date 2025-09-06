package com.kakao.tistory.presentation.view.editor;

import com.kakao.tistory.presentation.viewmodel.EditorViewModel.EditorMode;
import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
public final class EditorActivity.initViewModel.1.8.WhenMappings {
    public static final int[] $EnumSwitchMapping$0;

    static {
        int[] arr_v = new int[EditorMode.values().length];
        try {
            arr_v[EditorMode.SETTING_MODE.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[EditorMode.EDIT_MODE.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[EditorMode.EDIT_TAG_MODE.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        EditorActivity.initViewModel.1.8.WhenMappings.$EnumSwitchMapping$0 = arr_v;
    }
}

