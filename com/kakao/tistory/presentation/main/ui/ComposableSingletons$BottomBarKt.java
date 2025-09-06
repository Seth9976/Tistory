package com.kakao.tistory.presentation.main.ui;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
public final class ComposableSingletons.BottomBarKt {
    @NotNull
    public static final ComposableSingletons.BottomBarKt INSTANCE;
    @NotNull
    public static Function3 lambda-1;
    @NotNull
    public static Function3 lambda-2;

    static {
        ComposableSingletons.BottomBarKt.INSTANCE = new ComposableSingletons.BottomBarKt();
        ComposableSingletons.BottomBarKt.lambda-1 = ComposableLambdaKt.composableLambdaInstance(0xAF132604, false, j.a);
        ComposableSingletons.BottomBarKt.lambda-2 = ComposableLambdaKt.composableLambdaInstance(0xAABE7F4B, false, k.a);
    }

    @NotNull
    public final Function3 getLambda-1$presentation_prodRelease() {
        return ComposableSingletons.BottomBarKt.lambda-1;
    }

    @NotNull
    public final Function3 getLambda-2$presentation_prodRelease() {
        return ComposableSingletons.BottomBarKt.lambda-2;
    }
}

