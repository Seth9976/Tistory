package com.kakao.tistory.presentation.main;

import androidx.activity.ComponentActivity;
import androidx.compose.runtime.DisposableEffectScope;
import com.kakao.tistory.presentation.main.contract.MainUiState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class t extends Lambda implements Function1 {
    public final ComponentActivity a;
    public final MainUiState b;

    public t(ComponentActivity componentActivity0, MainUiState mainUiState0) {
        this.a = componentActivity0;
        this.b = mainUiState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((DisposableEffectScope)object0), "$this$DisposableEffect");
        s s0 = new s(this.b);
        ComponentActivity componentActivity0 = this.a;
        if(componentActivity0 != null) {
            componentActivity0.addOnNewIntentListener(new v(s0));
        }
        return new MainAppKt.NewIntentHandler.1.invoke..inlined.onDispose.1(this.a, s0);
    }
}

