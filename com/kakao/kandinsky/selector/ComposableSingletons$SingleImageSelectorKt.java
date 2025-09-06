package com.kakao.kandinsky.selector;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import org.jetbrains.annotations.NotNull;
import ra.c;
import ra.d;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
public final class ComposableSingletons.SingleImageSelectorKt {
    @NotNull
    public static final ComposableSingletons.SingleImageSelectorKt INSTANCE;
    @NotNull
    public static Function2 lambda-1;
    @NotNull
    public static Function4 lambda-2;
    @NotNull
    public static Function3 lambda-3;

    static {
        ComposableSingletons.SingleImageSelectorKt.INSTANCE = new ComposableSingletons.SingleImageSelectorKt();
        ComposableSingletons.SingleImageSelectorKt.lambda-1 = ComposableLambdaKt.composableLambdaInstance(0x4BD0E8B5, false, c.y);
        ComposableSingletons.SingleImageSelectorKt.lambda-2 = ComposableLambdaKt.composableLambdaInstance(-1417920030, false, d.z);
        ComposableSingletons.SingleImageSelectorKt.lambda-3 = ComposableLambdaKt.composableLambdaInstance(0x28CBFA78, false, b.w);
    }

    @NotNull
    public final Function2 getLambda-1$selector_release() {
        return ComposableSingletons.SingleImageSelectorKt.lambda-1;
    }

    @NotNull
    public final Function4 getLambda-2$selector_release() {
        return ComposableSingletons.SingleImageSelectorKt.lambda-2;
    }

    @NotNull
    public final Function3 getLambda-3$selector_release() {
        return ComposableSingletons.SingleImageSelectorKt.lambda-3;
    }
}

