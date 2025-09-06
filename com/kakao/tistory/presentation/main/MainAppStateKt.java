package com.kakao.tistory.presentation.main;

import android.content.Context;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavHostControllerKt;
import com.google.accompanist.navigation.material.BottomSheetNavigator;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001A\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\r\u0010\u0000\u001A\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002\u001A!\u0010\u0003\u001A\u00020\u00042\b\b\u0002\u0010\u0005\u001A\u00020\u00012\b\b\u0002\u0010\u0006\u001A\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"rememberBottomSheetNavigator", "Lcom/google/accompanist/navigation/material/BottomSheetNavigator;", "(Landroidx/compose/runtime/Composer;I)Lcom/google/accompanist/navigation/material/BottomSheetNavigator;", "rememberMainAppState", "Lcom/kakao/tistory/presentation/main/MainAppState;", "bottomSheetNavigator", "navController", "Landroidx/navigation/NavHostController;", "(Lcom/google/accompanist/navigation/material/BottomSheetNavigator;Landroidx/navigation/NavHostController;Landroidx/compose/runtime/Composer;II)Lcom/kakao/tistory/presentation/main/MainAppState;", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMainAppState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainAppState.kt\ncom/kakao/tistory/presentation/main/MainAppStateKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,166:1\n77#2:167\n1223#3,6:168\n1223#3,6:174\n*S KotlinDebug\n*F\n+ 1 MainAppState.kt\ncom/kakao/tistory/presentation/main/MainAppStateKt\n*L\n50#1:167\n51#1:168,6\n65#1:174,6\n*E\n"})
public final class MainAppStateKt {
    @Composable
    @NotNull
    public static final BottomSheetNavigator rememberBottomSheetNavigator(@Nullable Composer composer0, int v) {
        composer0.startReplaceGroup(0x5D897F53);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x5D897F53, v, -1, "com.kakao.tistory.presentation.main.rememberBottomSheetNavigator (MainAppState.kt:59)");
        }
        KeyframesSpec keyframesSpec0 = AnimationSpecKt.keyframes(z.a);
        ModalBottomSheetState modalBottomSheetState0 = ModalBottomSheetKt.rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, keyframesSpec0, null, false, composer0, 54, 12);
        composer0.startReplaceGroup(843470276);
        BottomSheetNavigator bottomSheetNavigator0 = composer0.rememberedValue();
        if(bottomSheetNavigator0 == Composer.Companion.getEmpty()) {
            bottomSheetNavigator0 = new BottomSheetNavigator(modalBottomSheetState0);
            composer0.updateRememberedValue(bottomSheetNavigator0);
        }
        composer0.endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return bottomSheetNavigator0;
    }

    @Composable
    @NotNull
    public static final MainAppState rememberMainAppState(@Nullable BottomSheetNavigator bottomSheetNavigator0, @Nullable NavHostController navHostController0, @Nullable Composer composer0, int v, int v1) {
        composer0.startReplaceGroup(0x538EF585);
        int v2 = 1;
        if((v1 & 1) != 0) {
            bottomSheetNavigator0 = MainAppStateKt.rememberBottomSheetNavigator(composer0, 0);
        }
        if((v1 & 2) != 0) {
            navHostController0 = NavHostControllerKt.rememberNavController(new Navigator[]{bottomSheetNavigator0}, composer0, 8);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x538EF585, v, -1, "com.kakao.tistory.presentation.main.rememberMainAppState (MainAppState.kt:48)");
        }
        Object object0 = composer0.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composer0.startReplaceGroup(0x84636A0C);
        boolean z = composer0.changed(((Context)object0));
        boolean z1 = composer0.changed(navHostController0);
        if(((v & 14 ^ 6) <= 4 || !composer0.changed(bottomSheetNavigator0)) && (v & 6) != 4) {
            v2 = 0;
        }
        MainAppState mainAppState0 = composer0.rememberedValue();
        if((z | z1 | v2) != 0 || mainAppState0 == Composer.Companion.getEmpty()) {
            mainAppState0 = new MainAppState(((Context)object0), navHostController0, bottomSheetNavigator0, null, 8, null);
            composer0.updateRememberedValue(mainAppState0);
        }
        composer0.endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return mainAppState0;
    }
}

