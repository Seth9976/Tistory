package com.kakao.tistory.presentation.main;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
public final class ComposableSingletons.MainAppKt {
    @NotNull
    public static final ComposableSingletons.MainAppKt INSTANCE;
    @NotNull
    public static Function4 lambda-1;

    static {
        ComposableSingletons.MainAppKt.INSTANCE = new ComposableSingletons.MainAppKt();
        ComposableSingletons.MainAppKt.lambda-1 = ComposableLambdaKt.composableLambdaInstance(600394764, false, b.a);
    }

    @NotNull
    public final Function4 getLambda-1$presentation_prodRelease() {
        return ComposableSingletons.MainAppKt.lambda-1;
    }
}

