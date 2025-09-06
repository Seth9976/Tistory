package com.kakao.tistory.presentation.screen.blog.navigation;

import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.NavOptionsBuilderKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function0 {
    public final NavController a;

    public f(NavController navController0) {
        this.a = navController0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        NavOptions navOptions0 = NavOptionsBuilderKt.navOptions(e.a);
        NavController.navigate$default(this.a, "NOTICE_LIST", navOptions0, null, 4, null);
        return Unit.INSTANCE;
    }
}

