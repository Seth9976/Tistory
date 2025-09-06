package com.google.accompanist.swiperefresh;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import org.jetbrains.annotations.NotNull;
import p6.b;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
public final class ComposableSingletons.SwipeRefreshKt {
    @NotNull
    public static final ComposableSingletons.SwipeRefreshKt INSTANCE;
    @NotNull
    public static Function4 lambda-1;

    static {
        ComposableSingletons.SwipeRefreshKt.INSTANCE = new ComposableSingletons.SwipeRefreshKt();
        ComposableSingletons.SwipeRefreshKt.lambda-1 = ComposableLambdaKt.composableLambdaInstance(0xA34E0E41, false, b.w);
    }

    @NotNull
    public final Function4 getLambda-1$swiperefresh_release() {
        return ComposableSingletons.SwipeRefreshKt.lambda-1;
    }
}

