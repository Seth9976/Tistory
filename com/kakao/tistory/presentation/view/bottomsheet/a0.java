package com.kakao.tistory.presentation.view.bottomsheet;

import androidx.fragment.app.FragmentActivity;
import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a0 extends Lambda implements Function1 {
    public final ReportDialogFragment a;

    public a0(ReportDialogFragment reportDialogFragment0) {
        this.a = reportDialogFragment0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        FragmentActivity fragmentActivity0 = this.a.getActivity();
        if(fragmentActivity0 != null) {
            Intrinsics.checkNotNull(((String)object0));
            NavigatorExtensionKt.goToWebView$default(fragmentActivity0, ((String)object0), true, false, true, false, 16, null);
        }
        return Unit.INSTANCE;
    }
}

