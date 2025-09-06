package com.kakao.tistory.presentation.view.setting.secretLab;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.compose.NavGraphBuilderKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function1 {
    public final SecretLabActivity a;
    public final NavHostController b;

    public i(SecretLabActivity secretLabActivity0, NavHostController navHostController0) {
        this.a = secretLabActivity0;
        this.b = navHostController0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((NavGraphBuilder)object0), "$this$NavHost");
        NavGraphBuilderKt.composable$default(((NavGraphBuilder)object0), "Main", null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-1490016914, true, new f(this.a, this.b)), 0xFE, null);
        NavGraphBuilderKt.composable$default(((NavGraphBuilder)object0), "SeverType", null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(0x1497B217, true, new h(this.a)), 0xFE, null);
        return Unit.INSTANCE;
    }
}

