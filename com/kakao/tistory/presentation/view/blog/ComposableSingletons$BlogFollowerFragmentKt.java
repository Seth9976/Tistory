package com.kakao.tistory.presentation.view.blog;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
public final class ComposableSingletons.BlogFollowerFragmentKt {
    @NotNull
    public static final ComposableSingletons.BlogFollowerFragmentKt INSTANCE;
    @NotNull
    public static Function3 lambda-1;
    @NotNull
    public static Function2 lambda-2;

    static {
        ComposableSingletons.BlogFollowerFragmentKt.INSTANCE = new ComposableSingletons.BlogFollowerFragmentKt();
        ComposableSingletons.BlogFollowerFragmentKt.lambda-1 = ComposableLambdaKt.composableLambdaInstance(0x83CFF885, false, t0.a);
        ComposableSingletons.BlogFollowerFragmentKt.lambda-2 = ComposableLambdaKt.composableLambdaInstance(0xB033A1FE, false, u0.a);
    }

    @NotNull
    public final Function3 getLambda-1$presentation_prodRelease() {
        return ComposableSingletons.BlogFollowerFragmentKt.lambda-1;
    }

    @NotNull
    public final Function2 getLambda-2$presentation_prodRelease() {
        return ComposableSingletons.BlogFollowerFragmentKt.lambda-2;
    }
}

