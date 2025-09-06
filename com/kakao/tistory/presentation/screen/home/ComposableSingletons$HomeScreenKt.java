package com.kakao.tistory.presentation.screen.home;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
public final class ComposableSingletons.HomeScreenKt {
    @NotNull
    public static final ComposableSingletons.HomeScreenKt INSTANCE;
    @NotNull
    public static Function3 lambda-1;

    static {
        ComposableSingletons.HomeScreenKt.INSTANCE = new ComposableSingletons.HomeScreenKt();
        ComposableSingletons.HomeScreenKt.lambda-1 = ComposableLambdaKt.composableLambdaInstance(0xDBC81971, false, a.a);
    }

    @NotNull
    public final Function3 getLambda-1$presentation_prodRelease() {
        return ComposableSingletons.HomeScreenKt.lambda-1;
    }
}

