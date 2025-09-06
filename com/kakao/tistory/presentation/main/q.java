package com.kakao.tistory.presentation.main;

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

public final class q extends Lambda implements Function2 {
    public final MainAppViewModel a;
    public final MainAppState b;
    public final SnackbarHostState c;
    public final State d;
    public final State e;

    public q(MainAppViewModel mainAppViewModel0, MainAppState mainAppState0, SnackbarHostState snackbarHostState0, State state0, State state1) {
        this.a = mainAppViewModel0;
        this.b = mainAppState0;
        this.c = snackbarHostState0;
        this.d = state0;
        this.e = state1;
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
            ComposerKt.traceEventStart(-1638313077, v, -1, "com.kakao.tistory.presentation.main.MainApp.<anonymous> (MainApp.kt:52)");
        }
        MainAppKt.access$ConsumeEvent(this.a, this.b, this.c, ((Composer)object0), 392);
        MainAppKt.access$BackPressedHandler(this.b.getCurrentMainDestinationState(((Composer)object0), 0), MainAppKt.access$MainApp$lambda$0(this.d), this.c, ((Composer)object0), 0x180);
        MainAppKt.access$NewIntentHandler(MainAppKt.access$MainApp$lambda$0(this.d), ((Composer)object0), 0);
        OfflineSnackbarKt.OfflineSnackbar(MainAppKt.access$MainApp$lambda$2(this.e), this.c, ((Composer)object0), 0x30);
        RoundedCornerShape roundedCornerShape0 = RoundedCornerShapeKt.RoundedCornerShape-a9UjIt4$default(12.0f, 12.0f, 0.0f, 0.0f, 12, null);
        long v1 = Color.copy-wmQWz5c$default(0L, 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
        ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(0x531BA430, true, new p(this.b, this.d, this.c), ((Composer)object0), 54);
        BottomSheetKt.ModalBottomSheetLayout-4erKP6g(this.b.getBottomSheetNavigator(), null, roundedCornerShape0, 0.0f, 0L, 0L, v1, composableLambda0, ((Composer)object0), BottomSheetNavigator.$stable | 0xD86000, 42);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

