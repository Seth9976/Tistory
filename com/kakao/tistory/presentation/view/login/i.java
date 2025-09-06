package com.kakao.tistory.presentation.view.login;

import com.kakao.android.base.tiara.TiaraUtils;
import com.kakao.tiara.data.Click;
import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import com.kakao.tistory.presentation.common.tiara.TiaraActionType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function0 {
    public final KakaoLoginActivity a;
    public final String b;

    public i(KakaoLoginActivity kakaoLoginActivity0, String s) {
        this.a = kakaoLoginActivity0;
        this.b = s;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String s = this.a.getSection();
        String s1 = this.a.getPage();
        Click click0 = TiaraUtils.createClick$default(TiaraUtils.INSTANCE, "find_account", null, null, this.b, null, null, null, null, null, null, 0x3F6, null);
        TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, s, s1, TiaraActionType.CLICK_ACCOUNT_FIND, null, click0, null, null, null, 0xE8, null);
        NavigatorExtensionKt.goToWebView$default(this.a, this.b, false, false, false, false, 14, null);
        return Unit.INSTANCE;
    }
}

