package com.kakao.kandinsky.home;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import ia.c;
import ia.d;
import ia.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
public final class ComposableSingletons.HomeScreenKt {
    @NotNull
    public static final ComposableSingletons.HomeScreenKt INSTANCE;
    @NotNull
    public static Function2 lambda-1;
    @NotNull
    public static Function3 lambda-2;
    @NotNull
    public static Function3 lambda-3;

    static {
        ComposableSingletons.HomeScreenKt.INSTANCE = new ComposableSingletons.HomeScreenKt();
        ComposableSingletons.HomeScreenKt.lambda-1 = ComposableLambdaKt.composableLambdaInstance(0x1E14D6F5, false, c.w);
        ComposableSingletons.HomeScreenKt.lambda-2 = ComposableLambdaKt.composableLambdaInstance(0xDA1D907F, false, d.w);
        ComposableSingletons.HomeScreenKt.lambda-3 = ComposableLambdaKt.composableLambdaInstance(0x5A9F0707, false, e.w);
    }

    @NotNull
    public final Function2 getLambda-1$home_release() {
        return ComposableSingletons.HomeScreenKt.lambda-1;
    }

    @NotNull
    public final Function3 getLambda-2$home_release() {
        return ComposableSingletons.HomeScreenKt.lambda-2;
    }

    @NotNull
    public final Function3 getLambda-3$home_release() {
        return ComposableSingletons.HomeScreenKt.lambda-3;
    }
}

