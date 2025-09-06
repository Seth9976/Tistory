package com.kakao.kandinsky.signature;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
public final class ComposableSingletons.SignatureScreenKt {
    @NotNull
    public static final ComposableSingletons.SignatureScreenKt INSTANCE;
    @NotNull
    public static Function2 lambda-1;

    static {
        ComposableSingletons.SignatureScreenKt.INSTANCE = new ComposableSingletons.SignatureScreenKt();
        ComposableSingletons.SignatureScreenKt.lambda-1 = ComposableLambdaKt.composableLambdaInstance(0x12D96DFA, false, a.w);
    }

    @NotNull
    public final Function2 getLambda-1$signature_release() {
        return ComposableSingletons.SignatureScreenKt.lambda-1;
    }
}

