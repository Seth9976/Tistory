package androidx.navigation.compose;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import o4.a;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
public final class ComposableSingletons.ComposeNavigatorKt {
    @NotNull
    public static final ComposableSingletons.ComposeNavigatorKt INSTANCE;
    @NotNull
    public static Function4 lambda-1;

    static {
        ComposableSingletons.ComposeNavigatorKt.INSTANCE = new ComposableSingletons.ComposeNavigatorKt();
        ComposableSingletons.ComposeNavigatorKt.lambda-1 = ComposableLambdaKt.composableLambdaInstance(0x798B76F, false, a.w);
    }

    @NotNull
    public final Function4 getLambda-1$navigation_compose_release() {
        return ComposableSingletons.ComposeNavigatorKt.lambda-1;
    }
}

