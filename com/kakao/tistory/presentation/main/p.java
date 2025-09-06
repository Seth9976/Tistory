package com.kakao.tistory.presentation.main;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.kakao.tistory.presentation.common.TistoryWindowInsets;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class p extends Lambda implements Function2 {
    public final MainAppState a;
    public final State b;
    public final SnackbarHostState c;

    public p(MainAppState mainAppState0, State state0, SnackbarHostState snackbarHostState0) {
        this.a = mainAppState0;
        this.b = state0;
        this.c = snackbarHostState0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x531BA430, v, -1, "com.kakao.tistory.presentation.main.MainApp.<anonymous>.<anonymous> (MainApp.kt:64)");
        }
        WindowInsets windowInsets0 = TistoryWindowInsets.INSTANCE.getBottom(((Composer)object0), 6);
        ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(0x95C32CB5, true, new m(this.a, this.b), ((Composer)object0), 54);
        ComposableLambda composableLambda1 = ComposableLambdaKt.rememberComposableLambda(-564091530, true, new n(this.c), ((Composer)object0), 54);
        ComposableLambda composableLambda2 = ComposableLambdaKt.rememberComposableLambda(0x615EF8FF, true, new o(this.a, this.b), ((Composer)object0), 54);
        ScaffoldKt.Scaffold-TvnljyQ(Modifier.Companion, null, composableLambda0, composableLambda1, null, 0, 0L, 0L, windowInsets0, composableLambda2, ((Composer)object0), 0x30D80D86, 50);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

