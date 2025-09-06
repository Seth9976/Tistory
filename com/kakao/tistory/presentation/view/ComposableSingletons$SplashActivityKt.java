package com.kakao.tistory.presentation.view;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
public final class ComposableSingletons.SplashActivityKt {
    @NotNull
    public static final ComposableSingletons.SplashActivityKt INSTANCE;
    @NotNull
    public static Function2 lambda-1;

    static {
        ComposableSingletons.SplashActivityKt.INSTANCE = new ComposableSingletons.SplashActivityKt();
        ComposableSingletons.SplashActivityKt.lambda-1 = ComposableLambdaKt.composableLambdaInstance(0x5EAC6F49, false, a.a);
    }

    @NotNull
    public final Function2 getLambda-1$presentation_prodRelease() {
        return ComposableSingletons.SplashActivityKt.lambda-1;
    }
}

