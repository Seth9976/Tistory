package com.kakao.tistory.presentation.view.toppost;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
public final class ComposableSingletons.TopPostListActivityKt {
    @NotNull
    public static final ComposableSingletons.TopPostListActivityKt INSTANCE;
    @NotNull
    public static Function4 lambda-1;
    @NotNull
    public static Function4 lambda-2;

    static {
        ComposableSingletons.TopPostListActivityKt.INSTANCE = new ComposableSingletons.TopPostListActivityKt();
        ComposableSingletons.TopPostListActivityKt.lambda-1 = ComposableLambdaKt.composableLambdaInstance(0xCF3B448A, false, a.a);
        ComposableSingletons.TopPostListActivityKt.lambda-2 = ComposableLambdaKt.composableLambdaInstance(0x3F1269E, false, b.a);
    }

    @NotNull
    public final Function4 getLambda-1$presentation_prodRelease() {
        return ComposableSingletons.TopPostListActivityKt.lambda-1;
    }

    @NotNull
    public final Function4 getLambda-2$presentation_prodRelease() {
        return ComposableSingletons.TopPostListActivityKt.lambda-2;
    }
}

