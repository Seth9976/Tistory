package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.presentation.common.ReportType;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class v3 extends Lambda implements Function1 {
    public static final v3 a;

    static {
        v3.a = new v3();
    }

    public v3() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return ((ReportType)object0) == ReportType.REPORT_ETC;
    }
}

