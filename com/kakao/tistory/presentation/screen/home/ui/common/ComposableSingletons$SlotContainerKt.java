package com.kakao.tistory.presentation.screen.home.ui.common;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
public final class ComposableSingletons.SlotContainerKt {
    @NotNull
    public static final ComposableSingletons.SlotContainerKt INSTANCE;
    @NotNull
    public static Function2 lambda-1;

    static {
        ComposableSingletons.SlotContainerKt.INSTANCE = new ComposableSingletons.SlotContainerKt();
        ComposableSingletons.SlotContainerKt.lambda-1 = ComposableLambdaKt.composableLambdaInstance(0x28C0F166, false, a.a);
    }

    @NotNull
    public final Function2 getLambda-1$presentation_prodRelease() {
        return ComposableSingletons.SlotContainerKt.lambda-1;
    }
}

