package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.presentation.common.ReportType;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class p3 extends Lambda implements Function1 {
    public static final p3 a;

    static {
        p3.a = new p3();
    }

    public p3() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return ((ReportType)object0) == ReportType.REPORT_ETC;
    }
}

