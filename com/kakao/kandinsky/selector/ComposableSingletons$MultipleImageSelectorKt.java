package com.kakao.kandinsky.selector;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import ra.c;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
public final class ComposableSingletons.MultipleImageSelectorKt {
    @NotNull
    public static final ComposableSingletons.MultipleImageSelectorKt INSTANCE;
    @NotNull
    public static Function2 lambda-1;
    @NotNull
    public static Function3 lambda-2;

    static {
        ComposableSingletons.MultipleImageSelectorKt.INSTANCE = new ComposableSingletons.MultipleImageSelectorKt();
        ComposableSingletons.MultipleImageSelectorKt.lambda-1 = ComposableLambdaKt.composableLambdaInstance(1980223045, false, c.x);
        ComposableSingletons.MultipleImageSelectorKt.lambda-2 = ComposableLambdaKt.composableLambdaInstance(0x1FEA6B6F, false, a.w);
    }

    @NotNull
    public final Function2 getLambda-1$selector_release() {
        return ComposableSingletons.MultipleImageSelectorKt.lambda-1;
    }

    @NotNull
    public final Function3 getLambda-2$selector_release() {
        return ComposableSingletons.MultipleImageSelectorKt.lambda-2;
    }
}

