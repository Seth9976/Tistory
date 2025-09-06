package com.kakao.tistory.presentation.blog;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.kakao.tistory.presentation.common.TistoryWindowInsets;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function2 {
    public final SnackbarHostState a;
    public final BlogAppState b;

    public c(SnackbarHostState snackbarHostState0, BlogAppState blogAppState0) {
        this.a = snackbarHostState0;
        this.b = blogAppState0;
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
            ComposerKt.traceEventStart(0xF518123D, v, -1, "com.kakao.tistory.presentation.blog.BlogActivity.BlogApp.<anonymous>.<anonymous> (BlogActivity.kt:64)");
        }
        WindowInsets windowInsets0 = TistoryWindowInsets.INSTANCE.getBottom(((Composer)object0), 6);
        ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(0x9C63B03, true, new a(this.a), ((Composer)object0), 54);
        ComposableLambda composableLambda1 = ComposableLambdaKt.rememberComposableLambda(0xE37F51CC, true, new b(this.b), ((Composer)object0), 54);
        ScaffoldKt.Scaffold-TvnljyQ(Modifier.Companion, null, null, composableLambda0, null, 0, 0L, 0L, windowInsets0, composableLambda1, ((Composer)object0), 0x30D80C06, 54);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

