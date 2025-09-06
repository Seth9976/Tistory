package com.kakao.tistory.presentation.common.graph;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
public final class ComposableSingletons.BlogTwinBarGraphKt {
    @NotNull
    public static final ComposableSingletons.BlogTwinBarGraphKt INSTANCE;
    @NotNull
    public static Function2 lambda-1;

    static {
        ComposableSingletons.BlogTwinBarGraphKt.INSTANCE = new ComposableSingletons.BlogTwinBarGraphKt();
        ComposableSingletons.BlogTwinBarGraphKt.lambda-1 = ComposableLambdaKt.composableLambdaInstance(0xDD109036, false, k.a);
    }

    @NotNull
    public final Function2 getLambda-1$presentation_prodRelease() {
        return ComposableSingletons.BlogTwinBarGraphKt.lambda-1;
    }
}

