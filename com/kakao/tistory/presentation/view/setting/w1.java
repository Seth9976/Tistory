package com.kakao.tistory.presentation.view.setting;

import androidx.activity.result.ActivityResultCallback;
import kotlin.Function;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class w1 implements ActivityResultCallback, FunctionAdapter {
    public final SettingPushActivity a;

    public w1(SettingPushActivity settingPushActivity0) {
        this.a = settingPushActivity0;
        super();
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return !(object0 instanceof ActivityResultCallback) || !(object0 instanceof FunctionAdapter) ? false : Intrinsics.areEqual(this.getFunctionDelegate(), ((FunctionAdapter)object0).getFunctionDelegate());
    }

    @Override  // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.a, SettingPushActivity.class, "onNotificationPermissionResult", "onNotificationPermissionResult(Z)V", 0);
    }

    @Override
    public final int hashCode() {
        return this.getFunctionDelegate().hashCode();
    }

    @Override  // androidx.activity.result.ActivityResultCallback
    public final void onActivityResult(Object object0) {
        SettingPushActivity.access$onNotificationPermissionResult(this.a, ((Boolean)object0).booleanValue());
    }
}

