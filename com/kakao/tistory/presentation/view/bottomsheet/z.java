package com.kakao.tistory.presentation.view.bottomsheet;

import androidx.fragment.app.FragmentActivity;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class z extends Lambda implements Function1 {
    public final ReportDialogFragment a;

    public z(ReportDialogFragment reportDialogFragment0) {
        this.a = reportDialogFragment0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Unit)object0), "it");
        FragmentActivity fragmentActivity0 = this.a.getActivity();
        if(fragmentActivity0 != null) {
            String s = this.a.getString(string.link_kakao_usurpation);
            Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
            NavigatorExtensionKt.goToWebView$default(fragmentActivity0, s, true, false, true, false, 16, null);
        }
        return Unit.INSTANCE;
    }
}

