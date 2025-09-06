package com.kakao.tistory.presentation.view.setting;

import com.kakao.tistory.presentation.view.common.dialog.CommonTimePickerDialog;
import com.kakao.tistory.presentation.viewmodel.PushViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class z1 extends Lambda implements Function2 {
    public final SettingPushActivity a;

    public z1(SettingPushActivity settingPushActivity0) {
        this.a = settingPushActivity0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(((CommonTimePickerDialog)object0), "dialog");
        if(((Number)object1).intValue() == 2) {
            PushViewModel.putPushSetting$default(SettingPushActivity.access$getPushViewModel(this.a), false, false, false, false, false, false, false, ((CommonTimePickerDialog)object0).getStartTime(), ((CommonTimePickerDialog)object0).getEndTime(), 0x7F, null);
        }
        ((CommonTimePickerDialog)object0).dismiss();
        return Unit.INSTANCE;
    }
}

