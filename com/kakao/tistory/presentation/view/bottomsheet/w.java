package com.kakao.tistory.presentation.view.bottomsheet;

import androidx.fragment.app.FragmentActivity;
import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.presentation.view.common.dialog.TistoryDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class w extends Lambda implements Function1 {
    public final ReportDialogFragment a;

    public w(ReportDialogFragment reportDialogFragment0) {
        this.a = reportDialogFragment0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((ErrorModel)object0), "data");
        FragmentActivity fragmentActivity0 = this.a.getActivity();
        if(fragmentActivity0 != null) {
            TistoryDialog.showOk$default(TistoryDialog.INSTANCE, fragmentActivity0, ((ErrorModel)object0).getTitle(), ((ErrorModel)object0).getMessage(), false, null, v.a, null, 88, null);
        }
        return Unit.INSTANCE;
    }
}

