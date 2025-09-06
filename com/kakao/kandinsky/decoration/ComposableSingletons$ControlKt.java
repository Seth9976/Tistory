package com.kakao.kandinsky.decoration;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
public final class ComposableSingletons.ControlKt {
    @NotNull
    public static final ComposableSingletons.ControlKt INSTANCE;
    @NotNull
    public static Function2 lambda-1;

    static {
        ComposableSingletons.ControlKt.INSTANCE = new ComposableSingletons.ControlKt();
        ComposableSingletons.ControlKt.lambda-1 = ComposableLambdaKt.composableLambdaInstance(0x676E5FFB, false, a.w);
    }

    @NotNull
    public final Function2 getLambda-1$decoration_release() {
        return ComposableSingletons.ControlKt.lambda-1;
    }
}

