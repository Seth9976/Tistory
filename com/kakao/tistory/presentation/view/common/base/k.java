package com.kakao.tistory.presentation.view.common.base;

import androidx.fragment.app.FragmentActivity;
import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function0 {
    public final TistoryComposeFragment a;
    public final String b;

    public k(TistoryComposeFragment tistoryComposeFragment0, String s) {
        this.a = tistoryComposeFragment0;
        this.b = s;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        FragmentActivity fragmentActivity0 = this.a.getActivity();
        if(fragmentActivity0 != null) {
            NavigatorExtensionKt.goToWebView$default(fragmentActivity0, this.b, false, false, false, false, 30, null);
        }
        return Unit.INSTANCE;
    }
}

