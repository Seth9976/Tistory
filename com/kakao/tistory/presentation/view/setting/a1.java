package com.kakao.tistory.presentation.view.setting;

import com.kakao.tistory.presentation.common.BlogRoleType;
import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a1 extends Lambda implements Function1 {
    public final SettingListActivity a;

    public a1(SettingListActivity settingListActivity0) {
        this.a = settingListActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((BlogRoleType)object0), "it");
        NavigatorExtensionKt.goToSettingNotice(this.a);
        return Unit.INSTANCE;
    }
}

