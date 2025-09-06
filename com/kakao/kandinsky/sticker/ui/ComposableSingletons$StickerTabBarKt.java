package com.kakao.kandinsky.sticker.ui;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import ya.a;
import ya.b;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
public final class ComposableSingletons.StickerTabBarKt {
    @NotNull
    public static final ComposableSingletons.StickerTabBarKt INSTANCE;
    @NotNull
    public static Function2 lambda-1;
    @NotNull
    public static Function2 lambda-2;

    static {
        ComposableSingletons.StickerTabBarKt.INSTANCE = new ComposableSingletons.StickerTabBarKt();
        ComposableSingletons.StickerTabBarKt.lambda-1 = ComposableLambdaKt.composableLambdaInstance(0x641B44FC, false, a.w);
        ComposableSingletons.StickerTabBarKt.lambda-2 = ComposableLambdaKt.composableLambdaInstance(0x29EEC0B7, false, b.w);
    }

    @NotNull
    public final Function2 getLambda-1$sticker_release() {
        return ComposableSingletons.StickerTabBarKt.lambda-1;
    }

    @NotNull
    public final Function2 getLambda-2$sticker_release() {
        return ComposableSingletons.StickerTabBarKt.lambda-2;
    }
}

