package com.kakao.tistory.presentation.view.setting;

import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.view.common.dialog.TistoryDialog;
import com.kakao.tistory.presentation.viewmodel.SettingViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d1 extends Lambda implements Function1 {
    public final SettingListActivity a;
    public final SettingViewModel b;

    public d1(SettingListActivity settingListActivity0, SettingViewModel settingViewModel0) {
        this.a = settingListActivity0;
        this.b = settingViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Unit)object0), "it");
        String s = this.a.getString(string.label_dialog_setting_logout);
        Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
        String s1 = this.a.getString(string.label_dialog_cancel);
        Intrinsics.checkNotNullExpressionValue(s1, "getString(...)");
        String s2 = this.a.getString(string.label_setting_logout);
        Intrinsics.checkNotNullExpressionValue(s2, "getString(...)");
        c1 c10 = new c1(this.b);
        TistoryDialog.showOkCancel$default(TistoryDialog.INSTANCE, this.a, s, null, s1, s2, true, c10, 4, null);
        return Unit.INSTANCE;
    }
}

