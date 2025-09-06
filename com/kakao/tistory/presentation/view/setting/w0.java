package com.kakao.tistory.presentation.view.setting;

import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.view.common.dialog.TistoryDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class w0 extends Lambda implements Function1 {
    public final SettingListActivity a;

    public w0(SettingListActivity settingListActivity0) {
        this.a = settingListActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Unit)object0), "it");
        String s = this.a.getString(string.label_dialog_setting_default_blog_title);
        Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
        String s1 = this.a.getString(string.label_dialog_setting_default_blog_message);
        TistoryDialog.showOk$default(TistoryDialog.INSTANCE, this.a, s, s1, false, null, v0.a, null, 88, null);
        return Unit.INSTANCE;
    }
}

