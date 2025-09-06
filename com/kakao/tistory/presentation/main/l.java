package com.kakao.tistory.presentation.main;

import com.kakao.tistory.presentation.main.tiara.MainTiara;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class l extends Lambda implements Function0 {
    public final MainAppState a;

    public l(MainAppState mainAppState0) {
        this.a = mainAppState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        MainTiara.INSTANCE.trackLongClickBottomMy();
        this.a.navigateToBlogSwitchBottomSheet(true);
        return Unit.INSTANCE;
    }
}

