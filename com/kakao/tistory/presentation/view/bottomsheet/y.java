package com.kakao.tistory.presentation.view.bottomsheet;

import androidx.fragment.app.FragmentActivity;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.view.common.dialog.TistoryDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class y extends Lambda implements Function1 {
    public final ReportDialogFragment a;

    public y(ReportDialogFragment reportDialogFragment0) {
        this.a = reportDialogFragment0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Unit)object0), "it");
        FragmentActivity fragmentActivity0 = this.a.getActivity();
        if(fragmentActivity0 != null) {
            String s = this.a.getString(string.label_report_illegal_filming_title);
            Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
            String s1 = this.a.getString(string.label_report_illegal_filming_description);
            String s2 = this.a.getString(string.label_dialog_cancel);
            Intrinsics.checkNotNullExpressionValue(s2, "getString(...)");
            String s3 = this.a.getString(string.label_dialog_ok);
            Intrinsics.checkNotNullExpressionValue(s3, "getString(...)");
            x x0 = new x(this.a);
            TistoryDialog.INSTANCE.showOkCancel(fragmentActivity0, s, s1, s2, s3, true, x0);
        }
        return Unit.INSTANCE;
    }
}

