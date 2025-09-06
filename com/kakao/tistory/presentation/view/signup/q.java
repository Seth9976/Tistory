package com.kakao.tistory.presentation.view.signup;

import android.content.Context;
import com.kakao.android.base.tiara.TiaraUtils;
import com.kakao.tiara.data.Click;
import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import com.kakao.tistory.presentation.common.tiara.TiaraActionType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class q extends Lambda implements Function0 {
    public final String a;
    public final Context b;

    public q(String s, Context context0) {
        this.a = s;
        this.b = context0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Click click0 = TiaraUtils.createClick$default(TiaraUtils.INSTANCE, "account_cs", null, null, this.a, null, null, null, null, null, null, 0x3F6, null);
        TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, "가입하기", "가입하기", TiaraActionType.CLICK_HELP, null, click0, null, null, null, 0xE8, null);
        NavigatorExtensionKt.goToWebView$default(this.b, this.a, true, false, false, false, 12, null);
        return Unit.INSTANCE;
    }
}

