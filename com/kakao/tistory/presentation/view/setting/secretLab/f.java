package com.kakao.tistory.presentation.view.setting.secretLab;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavHostController;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function4 {
    public final SecretLabActivity a;
    public final NavHostController b;

    public f(SecretLabActivity secretLabActivity0, NavHostController navHostController0) {
        this.a = secretLabActivity0;
        this.b = navHostController0;
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        int v = ((Number)object3).intValue();
        Intrinsics.checkNotNullParameter(((AnimatedContentScope)object0), "$this$composable");
        Intrinsics.checkNotNullParameter(((NavBackStackEntry)object1), "it");
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1490016914, v, -1, "com.kakao.tistory.presentation.view.setting.secretLab.SecretLabActivity.Content.<anonymous>.<anonymous>.<anonymous> (SecretLabActivity.kt:96)");
        }
        SecretLabActivity.access$MainContent(this.a, this.b, ((Composer)object2), 72);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

