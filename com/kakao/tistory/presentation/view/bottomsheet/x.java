package com.kakao.tistory.presentation.view.bottomsheet;

import android.app.Dialog;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.viewmodel.ReportViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class x extends Lambda implements Function2 {
    public final ReportDialogFragment a;

    public x(ReportDialogFragment reportDialogFragment0) {
        this.a = reportDialogFragment0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(((Dialog)object0), "dialog");
        if(((Number)object1).intValue() == 1) {
            ((Dialog)object0).dismiss();
            return Unit.INSTANCE;
        }
        ReportViewModel reportViewModel0 = ReportDialogFragment.access$getReportViewModel(this.a);
        String s = this.a.getString(string.illegal_report_api_base_url);
        Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
        String s1 = this.a.h;
        if(s1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("illegalFilmType");
            s1 = null;
        }
        reportViewModel0.checkIllegalContentReportUrl(s, s1);
        ((Dialog)object0).dismiss();
        return Unit.INSTANCE;
    }
}

