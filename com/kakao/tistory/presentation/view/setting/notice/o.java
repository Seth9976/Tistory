package com.kakao.tistory.presentation.view.setting.notice;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class o extends FunctionReferenceImpl implements Function0 {
    public o(Object object0) {
        super(0, object0, SettingNoticeListActivity.class, "finish", "finish()V", 0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((SettingNoticeListActivity)this.receiver).finish();
        return Unit.INSTANCE;
    }
}

