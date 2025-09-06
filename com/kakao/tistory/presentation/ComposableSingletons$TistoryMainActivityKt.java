package com.kakao.tistory.presentation;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
public final class ComposableSingletons.TistoryMainActivityKt {
    @NotNull
    public static final ComposableSingletons.TistoryMainActivityKt INSTANCE;
    @NotNull
    public static Function2 lambda-1;
    @NotNull
    public static Function2 lambda-2;

    static {
        ComposableSingletons.TistoryMainActivityKt.INSTANCE = new ComposableSingletons.TistoryMainActivityKt();
        ComposableSingletons.TistoryMainActivityKt.lambda-1 = ComposableLambdaKt.composableLambdaInstance(0x50E6328D, false, c.a);
        ComposableSingletons.TistoryMainActivityKt.lambda-2 = ComposableLambdaKt.composableLambdaInstance(0xB73B0776, false, d.a);
    }

    @NotNull
    public final Function2 getLambda-1$presentation_prodRelease() {
        return ComposableSingletons.TistoryMainActivityKt.lambda-1;
    }

    @NotNull
    public final Function2 getLambda-2$presentation_prodRelease() {
        return ComposableSingletons.TistoryMainActivityKt.lambda-2;
    }
}

