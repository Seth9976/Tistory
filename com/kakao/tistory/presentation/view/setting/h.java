package com.kakao.tistory.presentation.view.setting;

import com.kakao.android.base.tiara.TiaraUtils;
import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import com.kakao.tistory.presentation.common.tiara.TiaraActionType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function0 {
    public final SettingAppInfoActivity a;

    public h(SettingAppInfoActivity settingAppInfoActivity0) {
        this.a = settingAppInfoActivity0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String s = this.a.getSection();
        String s1 = this.a.getPage();
        TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, s, s1, TiaraActionType.CLICK_APP_UPDATE, null, null, null, null, null, 0xF8, null);
        NavigatorExtensionKt.goToGooglePlay$default(this.a, null, 1, null);
        return Unit.INSTANCE;
    }
}

