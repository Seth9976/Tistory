package com.kakao.tistory.presentation.view.bottomsheet;

import androidx.fragment.app.FragmentActivity;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.view.common.dialog.TistoryDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class u extends Lambda implements Function1 {
    public final ReportDialogFragment a;

    public u(ReportDialogFragment reportDialogFragment0) {
        this.a = reportDialogFragment0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Unit)object0), "it");
        this.a.dismiss();
        FragmentActivity fragmentActivity0 = this.a.getActivity();
        if(fragmentActivity0 != null) {
            String s = this.a.getString(string.label_dialog_report_title);
            Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
            String s1 = this.a.getString(string.label_dialog_report_message);
            TistoryDialog.showOk$default(TistoryDialog.INSTANCE, fragmentActivity0, s, s1, false, null, t.a, null, 88, null);
        }
        return Unit.INSTANCE;
    }
}

