package com.kakao.kandinsky.selector;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import org.jetbrains.annotations.NotNull;
import ra.d;
import ra.e;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
public final class ComposableSingletons.SelectorBottomSheetKt {
    @NotNull
    public static final ComposableSingletons.SelectorBottomSheetKt INSTANCE;
    @NotNull
    public static Function4 lambda-1;
    @NotNull
    public static Function4 lambda-2;
    @NotNull
    public static Function3 lambda-3;

    static {
        ComposableSingletons.SelectorBottomSheetKt.INSTANCE = new ComposableSingletons.SelectorBottomSheetKt();
        ComposableSingletons.SelectorBottomSheetKt.lambda-1 = ComposableLambdaKt.composableLambdaInstance(0x231527BA, false, d.x);
        ComposableSingletons.SelectorBottomSheetKt.lambda-2 = ComposableLambdaKt.composableLambdaInstance(0xB7595037, false, d.y);
        ComposableSingletons.SelectorBottomSheetKt.lambda-3 = ComposableLambdaKt.composableLambdaInstance(0x22516168, false, e.w);
    }

    @NotNull
    public final Function4 getLambda-1$selector_release() {
        return ComposableSingletons.SelectorBottomSheetKt.lambda-1;
    }

    @NotNull
    public final Function4 getLambda-2$selector_release() {
        return ComposableSingletons.SelectorBottomSheetKt.lambda-2;
    }

    @NotNull
    public final Function3 getLambda-3$selector_release() {
        return ComposableSingletons.SelectorBottomSheetKt.lambda-3;
    }
}

