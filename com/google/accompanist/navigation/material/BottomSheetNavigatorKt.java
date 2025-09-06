package com.google.accompanist.navigation.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u001A\u001D\u0010\u0000\u001A\u00020\u00012\u000E\b\u0002\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"rememberBottomSheetNavigator", "Lcom/google/accompanist/navigation/material/BottomSheetNavigator;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "(Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;II)Lcom/google/accompanist/navigation/material/BottomSheetNavigator;", "navigation-material_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBottomSheetNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetNavigator.kt\ncom/google/accompanist/navigation/material/BottomSheetNavigatorKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,253:1\n1116#2,6:254\n*S KotlinDebug\n*F\n+ 1 BottomSheetNavigator.kt\ncom/google/accompanist/navigation/material/BottomSheetNavigatorKt\n*L\n91#1:254,6\n*E\n"})
public final class BottomSheetNavigatorKt {
    @Composable
    @ExperimentalMaterialNavigationApi
    @NotNull
    public static final BottomSheetNavigator rememberBottomSheetNavigator(@Nullable AnimationSpec animationSpec0, @Nullable Composer composer0, int v, int v1) {
        composer0.startReplaceableGroup(-1053217086);
        AnimationSpec animationSpec1 = (v1 & 1) == 0 ? animationSpec0 : new SpringSpec(0.0f, 0.0f, null, 7, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1053217086, v, -1, "com.google.accompanist.navigation.material.rememberBottomSheetNavigator (BottomSheetNavigator.kt:85)");
        }
        ModalBottomSheetState modalBottomSheetState0 = ModalBottomSheetKt.rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, animationSpec1, null, false, composer0, 70, 12);
        composer0.startReplaceableGroup(0x552A702E);
        BottomSheetNavigator bottomSheetNavigator0 = composer0.rememberedValue();
        if(bottomSheetNavigator0 == Composer.Companion.getEmpty()) {
            bottomSheetNavigator0 = new BottomSheetNavigator(modalBottomSheetState0);
            composer0.updateRememberedValue(bottomSheetNavigator0);
        }
        composer0.endReplaceableGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return bottomSheetNavigator0;
    }
}

