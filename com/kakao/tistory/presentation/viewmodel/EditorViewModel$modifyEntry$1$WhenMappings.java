package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.blog.entity.EntryVisibilityType;
import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
public final class EditorViewModel.modifyEntry.1.WhenMappings {
    public static final int[] $EnumSwitchMapping$0;

    static {
        int[] arr_v = new int[EntryVisibilityType.values().length];
        try {
            arr_v[EntryVisibilityType.PUBLIC.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[EntryVisibilityType.PROTECTED.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[EntryVisibilityType.PRIVATE.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        EditorViewModel.modifyEntry.1.WhenMappings.$EnumSwitchMapping$0 = arr_v;
    }
}

