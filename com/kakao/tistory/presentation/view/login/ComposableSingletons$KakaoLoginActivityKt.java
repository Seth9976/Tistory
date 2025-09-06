package com.kakao.tistory.presentation.view.login;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
public final class ComposableSingletons.KakaoLoginActivityKt {
    @NotNull
    public static final ComposableSingletons.KakaoLoginActivityKt INSTANCE;
    @NotNull
    public static Function3 lambda-1;
    @NotNull
    public static Function3 lambda-2;

    static {
        ComposableSingletons.KakaoLoginActivityKt.INSTANCE = new ComposableSingletons.KakaoLoginActivityKt();
        ComposableSingletons.KakaoLoginActivityKt.lambda-1 = ComposableLambdaKt.composableLambdaInstance(0xE84BA9B9, false, a.a);
        ComposableSingletons.KakaoLoginActivityKt.lambda-2 = ComposableLambdaKt.composableLambdaInstance(0xD335AAFE, false, b.a);
    }

    @NotNull
    public final Function3 getLambda-1$presentation_prodRelease() {
        return ComposableSingletons.KakaoLoginActivityKt.lambda-1;
    }

    @NotNull
    public final Function3 getLambda-2$presentation_prodRelease() {
        return ComposableSingletons.KakaoLoginActivityKt.lambda-2;
    }
}

