package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.presentation.common.ReportType;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class r3 extends Lambda implements Function1 {
    public final ReportViewModel a;

    public r3(ReportViewModel reportViewModel0) {
        this.a = reportViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch((((ReportType)object0) == null ? -1 : ReportViewModel.reportButtonEnabled.1.WhenMappings.$EnumSwitchMapping$0[((ReportType)object0).ordinal()])) {
            case 1: {
                return false;
            }
            case 2: {
                String s = this.a.getReportMessage();
                return s != null && s.length() != 0;
            }
            default: {
                return true;
            }
        }
    }
}

