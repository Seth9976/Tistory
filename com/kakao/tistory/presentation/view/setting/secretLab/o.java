package com.kakao.tistory.presentation.view.setting.secretLab;

import androidx.navigation.NavController;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class o extends Lambda implements Function0 {
    public final NavController a;

    public o(NavController navController0) {
        this.a = navController0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        NavController.navigate$default(this.a, "SeverType", null, null, 6, null);
        return Unit.INSTANCE;
    }
}

