package com.kakao.tistory.presentation.widget.entry;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
public final class ComposableSingletons.EntryItemKt {
    @NotNull
    public static final ComposableSingletons.EntryItemKt INSTANCE;
    @NotNull
    public static Function2 lambda-1;

    static {
        ComposableSingletons.EntryItemKt.INSTANCE = new ComposableSingletons.EntryItemKt();
        ComposableSingletons.EntryItemKt.lambda-1 = ComposableLambdaKt.composableLambdaInstance(0x922A73B9, false, a.a);
    }

    @NotNull
    public final Function2 getLambda-1$presentation_prodRelease() {
        return ComposableSingletons.EntryItemKt.lambda-1;
    }
}

