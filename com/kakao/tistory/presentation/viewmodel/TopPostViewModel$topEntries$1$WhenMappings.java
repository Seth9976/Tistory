package com.kakao.tistory.presentation.viewmodel;

import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
public final class TopPostViewModel.topEntries.1.WhenMappings {
    public static final int[] $EnumSwitchMapping$0;

    static {
        int[] arr_v = new int[TopEntriesSortType.values().length];
        try {
            arr_v[TopEntriesSortType.VIEW.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[TopEntriesSortType.COMMENT.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[TopEntriesSortType.LIKE.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        TopPostViewModel.topEntries.1.WhenMappings.$EnumSwitchMapping$0 = arr_v;
    }
}

