package com.kakao.tistory.presentation.view.setting;

import com.kakao.tistory.presentation.common.SettingItem;
import com.kakao.tistory.presentation.viewmodel.SettingViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class p0 extends FunctionReferenceImpl implements Function1 {
    public p0(SettingViewModel settingViewModel0) {
        super(1, settingViewModel0, SettingViewModel.class, "onClickSettingItem", "onClickSettingItem(Lcom/kakao/tistory/presentation/common/SettingItem;)V", 0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((SettingItem)object0), "p0");
        ((SettingViewModel)this.receiver).onClickSettingItem(((SettingItem)object0));
        return Unit.INSTANCE;
    }
}

