package com.kakao.tistory.presentation.common.graph;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
public final class ComposableSingletons.StatisticsBarGraphKt {
    @NotNull
    public static final ComposableSingletons.StatisticsBarGraphKt INSTANCE;
    @NotNull
    public static Function2 lambda-1;
    @NotNull
    public static Function3 lambda-2;

    static {
        ComposableSingletons.StatisticsBarGraphKt.INSTANCE = new ComposableSingletons.StatisticsBarGraphKt();
        ComposableSingletons.StatisticsBarGraphKt.lambda-1 = ComposableLambdaKt.composableLambdaInstance(0xB7676BD6, false, m.a);
        ComposableSingletons.StatisticsBarGraphKt.lambda-2 = ComposableLambdaKt.composableLambdaInstance(-1314804955, false, n.a);
    }

    @NotNull
    public final Function2 getLambda-1$presentation_prodRelease() {
        return ComposableSingletons.StatisticsBarGraphKt.lambda-1;
    }

    @NotNull
    public final Function3 getLambda-2$presentation_prodRelease() {
        return ComposableSingletons.StatisticsBarGraphKt.lambda-2;
    }
}

