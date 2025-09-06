package com.kakao.tistory.presentation.view.login;

import com.kakao.android.base.tiara.TiaraUtils;
import com.kakao.tiara.data.Click;
import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import com.kakao.tistory.presentation.common.tiara.TiaraActionType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class y0 extends Lambda implements Function0 {
    public final String a;
    public final TistroyLoginActivity b;

    public y0(String s, TistroyLoginActivity tistroyLoginActivity0) {
        this.a = s;
        this.b = tistroyLoginActivity0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Click click0 = TiaraUtils.createClick$default(TiaraUtils.INSTANCE, "find_account", null, null, this.a, null, null, null, null, null, null, 0x3F6, null);
        TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, "로그인", "올드계정로그인", TiaraActionType.CLICK_ACCOUNT_FIND, null, click0, null, null, null, 0xE8, null);
        NavigatorExtensionKt.goToWebView$default(this.b, this.a, false, false, false, false, 14, null);
        return Unit.INSTANCE;
    }
}

