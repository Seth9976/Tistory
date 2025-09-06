package com.kakao.tistory.presentation.blog;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import com.google.accompanist.navigation.material.BottomSheetKt;
import com.google.accompanist.navigation.material.BottomSheetNavigator;
import com.kakao.tistory.presentation.widget.common.OfflineSnackbarKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function2 {
    public final BlogAppState a;
    public final SnackbarHostState b;
    public final State c;

    public d(BlogAppState blogAppState0, SnackbarHostState snackbarHostState0, State state0) {
        this.a = blogAppState0;
        this.b = snackbarHostState0;
        this.c = state0;
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
            ComposerKt.traceEventStart(0xCBF9FB58, v, -1, "com.kakao.tistory.presentation.blog.BlogActivity.BlogApp.<anonymous> (BlogActivity.kt:58)");
        }
        RoundedCornerShape roundedCornerShape0 = RoundedCornerShapeKt.RoundedCornerShape-a9UjIt4$default(12.0f, 12.0f, 0.0f, 0.0f, 12, null);
        long v1 = Color.copy-wmQWz5c$default(0L, 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
        ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(0xF518123D, true, new c(this.b, this.a), ((Composer)object0), 54);
        BottomSheetKt.ModalBottomSheetLayout-4erKP6g(this.a.getBottomSheetNavigator(), null, roundedCornerShape0, 0.0f, 0L, 0L, v1, composableLambda0, ((Composer)object0), BottomSheetNavigator.$stable | 0xD86000, 42);
        OfflineSnackbarKt.OfflineSnackbar(BlogActivity.access$BlogApp$lambda$1(this.c), this.b, ((Composer)object0), 0x30);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

