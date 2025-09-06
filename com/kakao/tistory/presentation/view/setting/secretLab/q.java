package com.kakao.tistory.presentation.view.setting.secretLab;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavController;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class q extends Lambda implements Function1 {
    public final SecretLabActivity a;
    public final NavController b;

    public q(SecretLabActivity secretLabActivity0, NavController navController0) {
        this.a = secretLabActivity0;
        this.b = navController0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((LazyListScope)object0), "$this$LazyColumn");
        LazyListScope.item$default(((LazyListScope)object0), null, null, ComposableLambdaKt.composableLambdaInstance(1104932473, true, new n(this.a)), 3, null);
        LazyListScope.item$default(((LazyListScope)object0), null, null, ComposableLambdaKt.composableLambdaInstance(0x28C3A922, true, new p(this.a, this.b)), 3, null);
        return Unit.INSTANCE;
    }
}

