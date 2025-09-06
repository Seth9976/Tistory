package com.kakao.kandinsky.crop;

import androidx.activity.compose.BackHandlerKt;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.text.selection.w0;
import androidx.compose.material3.fc;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import androidx.lifecycle.compose.FlowExtKt;
import com.kakao.kandinsky.base.ConsumeKDEventKt;
import com.kakao.kandinsky.crop.contract.CropUiState;
import com.kakao.kandinsky.designsystem.common.RotatableScreenKt;
import com.kakao.kandinsky.utils.Logger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w0.i1;
import x9.c;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001AO\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00042\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\b\u001A\u000E\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00010\u000BH\u0007¢\u0006\u0002\u0010\f¨\u0006\r²\u0006\n\u0010\u000E\u001A\u00020\u000FX\u008A\u0084\u0002"}, d2 = {"CropScreen", "", "Landroidx/compose/foundation/layout/BoxScope;", "viewModel", "Lcom/kakao/kandinsky/crop/CropViewModel;", "onConfirm", "Lkotlin/Function1;", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "updateEnableAnimation", "", "goHomeState", "Lkotlin/Function0;", "(Landroidx/compose/foundation/layout/BoxScope;Lcom/kakao/kandinsky/crop/CropViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "crop_release", "uiState", "Lcom/kakao/kandinsky/crop/contract/CropUiState;"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCropScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CropScreen.kt\ncom/kakao/kandinsky/crop/CropScreenKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,145:1\n1223#2,6:146\n148#3:152\n81#4:153\n*S KotlinDebug\n*F\n+ 1 CropScreen.kt\ncom/kakao/kandinsky/crop/CropScreenKt\n*L\n39#1:146,6\n75#1:152\n36#1:153\n*E\n"})
public final class CropScreenKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void CropScreen(@NotNull BoxScope boxScope0, @NotNull CropViewModel cropViewModel0, @NotNull Function1 function10, @NotNull Function1 function11, @NotNull Function0 function00, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(boxScope0, "<this>");
        Intrinsics.checkNotNullParameter(cropViewModel0, "viewModel");
        Intrinsics.checkNotNullParameter(function10, "onConfirm");
        Intrinsics.checkNotNullParameter(function11, "updateEnableAnimation");
        Intrinsics.checkNotNullParameter(function00, "goHomeState");
        Composer composer1 = composer0.startRestartGroup(1005095947);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1005095947, v, -1, "com.kakao.kandinsky.crop.CropScreen (CropScreen.kt:34)");
        }
        State state0 = FlowExtKt.collectAsStateWithLifecycle(cropViewModel0.getUiState(), null, null, null, composer1, 8, 7);
        CropUiState cropUiState0 = (CropUiState)state0.getValue();
        Logger.INSTANCE.log("uiState " + cropUiState0);
        composer1.startReplaceGroup(221340892);
        boolean z = composer1.changed(state0);
        i1 i10 = composer1.rememberedValue();
        if(z || i10 == Composer.Companion.getEmpty()) {
            i10 = new i1(state0, 4);
            composer1.updateRememberedValue(i10);
        }
        composer1.endReplaceGroup();
        BackHandlerKt.BackHandler(false, i10, composer1, 0, 1);
        ConsumeKDEventKt.ConsumeEvent(cropViewModel0.getEvent(), function10, function00, composer1, v >> 3 & 0x70 | 8 | v >> 6 & 0x380);
        EnterTransition enterTransition0 = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null);
        ExitTransition exitTransition0 = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null);
        AnimatedVisibilityKt.AnimatedVisibility(((CropUiState)state0.getValue()).getShowCropBox(), null, enterTransition0, exitTransition0, null, ComposableLambdaKt.rememberComposableLambda(1520309299, true, new w0(10, state0, function11), composer1, 54), composer1, 200064, 18);
        Function1 function12 = ((CropUiState)state0.getValue()).getOnChangedContentBounds();
        RotatableScreenKt.RotatableScreen-FHprtrg(null, PaddingKt.PaddingValues-0680j_4(50.0f), function12, null, Color.Companion.getTransparent-0d7_KjU(), ComposableLambdaKt.rememberComposableLambda(0xD41A63EB, true, new c(boxScope0, state0), composer1, 54), composer1, 0x36030, 9);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new fc(boxScope0, cropViewModel0, function10, function11, function00, v, 6));
        }
    }

    public static final CropUiState access$CropScreen$lambda$0(State state0) {
        return (CropUiState)state0.getValue();
    }
}

