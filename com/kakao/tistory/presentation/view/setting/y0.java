package com.kakao.tistory.presentation.view.setting;

import com.kakao.tistory.presentation.common.SettingItem;
import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class y0 extends Lambda implements Function1 {
    public final SettingListActivity a;

    public y0(SettingListActivity settingListActivity0) {
        this.a = settingListActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((SettingItem)object0), "it");
        NavigatorExtensionKt.goToWebView$default(this.a, ((SettingItem)object0), false, false, false, 14, null);
        return Unit.INSTANCE;
    }
}

