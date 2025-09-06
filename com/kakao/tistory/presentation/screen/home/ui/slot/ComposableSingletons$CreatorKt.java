package com.kakao.tistory.presentation.screen.home.ui.slot;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
public final class ComposableSingletons.CreatorKt {
    @NotNull
    public static final ComposableSingletons.CreatorKt INSTANCE;
    @NotNull
    public static Function3 lambda-1;
    @NotNull
    public static Function2 lambda-2;

    static {
        ComposableSingletons.CreatorKt.INSTANCE = new ComposableSingletons.CreatorKt();
        ComposableSingletons.CreatorKt.lambda-1 = ComposableLambdaKt.composableLambdaInstance(-323369380, false, c0.a);
        ComposableSingletons.CreatorKt.lambda-2 = ComposableLambdaKt.composableLambdaInstance(-206770670, false, d0.a);
    }

    @NotNull
    public final Function3 getLambda-1$presentation_prodRelease() {
        return ComposableSingletons.CreatorKt.lambda-1;
    }

    @NotNull
    public final Function2 getLambda-2$presentation_prodRelease() {
        return ComposableSingletons.CreatorKt.lambda-2;
    }
}

