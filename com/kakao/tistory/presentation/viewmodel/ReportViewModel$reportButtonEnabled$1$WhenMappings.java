package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.presentation.common.ReportType;
import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
public final class ReportViewModel.reportButtonEnabled.1.WhenMappings {
    public static final int[] $EnumSwitchMapping$0;

    static {
        int[] arr_v = new int[ReportType.values().length];
        try {
            arr_v[ReportType.NONE.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[ReportType.REPORT_ETC.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        ReportViewModel.reportButtonEnabled.1.WhenMappings.$EnumSwitchMapping$0 = arr_v;
    }
}

