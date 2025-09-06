package com.kakao.tistory.presentation.common.graph;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
public final class ComposableSingletons.TistoryBarGraphKt {
    @NotNull
    public static final ComposableSingletons.TistoryBarGraphKt INSTANCE;
    @NotNull
    public static Function3 lambda-1;

    static {
        ComposableSingletons.TistoryBarGraphKt.INSTANCE = new ComposableSingletons.TistoryBarGraphKt();
        ComposableSingletons.TistoryBarGraphKt.lambda-1 = ComposableLambdaKt.composableLambdaInstance(-608523730, false, o.a);
    }

    @NotNull
    public final Function3 getLambda-1$presentation_prodRelease() {
        return ComposableSingletons.TistoryBarGraphKt.lambda-1;
    }
}

