package com.kakao.kandinsky.mosaic;

import aa.l;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.text.selection.a;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.compose.FlowExtKt;
import com.kakao.kandinsky.base.ConsumeKDEventKt;
import com.kakao.kandinsky.designsystem.common.RotatableScreenKt;
import com.kakao.kandinsky.mosaic.contract.MosaicUiState;
import fg.c;
import ka.i;
import ka.k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001A7\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00010\bH\u0007¢\u0006\u0002\u0010\t¨\u0006\n²\u0006\n\u0010\u000B\u001A\u00020\fX\u008A\u0084\u0002"}, d2 = {"MosaicScreen", "", "viewModel", "Lcom/kakao/kandinsky/mosaic/MosaicViewModel;", "onConfirm", "Lkotlin/Function1;", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "goHomeState", "Lkotlin/Function0;", "(Lcom/kakao/kandinsky/mosaic/MosaicViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "mosaic_release", "uiState", "Lcom/kakao/kandinsky/mosaic/contract/MosaicUiState;"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMosaicScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MosaicScreen.kt\ncom/kakao/kandinsky/mosaic/MosaicScreenKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,133:1\n1223#2,6:134\n1223#2,6:140\n1223#2,6:146\n81#3:152\n*S KotlinDebug\n*F\n+ 1 MosaicScreen.kt\ncom/kakao/kandinsky/mosaic/MosaicScreenKt\n*L\n28#1:134,6\n32#1:140,6\n49#1:146,6\n26#1:152\n*E\n"})
public final class MosaicScreenKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void MosaicScreen(@NotNull MosaicViewModel mosaicViewModel0, @NotNull Function1 function10, @NotNull Function0 function00, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(mosaicViewModel0, "viewModel");
        Intrinsics.checkNotNullParameter(function10, "onConfirm");
        Intrinsics.checkNotNullParameter(function00, "goHomeState");
        Composer composer1 = composer0.startRestartGroup(508941037);
        int v1 = (v & 14) == 0 ? (composer1.changed(mosaicViewModel0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changedInstance(function00) ? 0x100 : 0x80);
        }
        if((v1 & 731) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(508941037, v1, -1, "com.kakao.kandinsky.mosaic.MosaicScreen (MosaicScreen.kt:24)");
            }
            State state0 = FlowExtKt.collectAsStateWithLifecycle(mosaicViewModel0.getUiState(), null, null, null, composer1, 8, 7);
            composer1.startReplaceGroup(-1308740454);
            boolean z = composer1.changed(state0);
            l l0 = composer1.rememberedValue();
            if(z || l0 == Composer.Companion.getEmpty()) {
                l0 = new l(state0, 17);
                composer1.updateRememberedValue(l0);
            }
            composer1.endReplaceGroup();
            boolean z1 = false;
            BackHandlerKt.BackHandler(false, l0, composer1, 0, 1);
            Unit unit0 = Unit.INSTANCE;
            composer1.startReplaceGroup(-1308740388);
            boolean z2 = composer1.changed(state0);
            i i0 = composer1.rememberedValue();
            if((v1 & 14) == 4 || z2 || i0 == Composer.Companion.getEmpty()) {
                i0 = new i(mosaicViewModel0, state0, null);
                composer1.updateRememberedValue(i0);
            }
            composer1.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit0, i0, composer1, 70);
            composer1.startReplaceGroup(0xB1FE36A5);
            if((v1 & 14) == 4) {
                z1 = true;
            }
            c c0 = composer1.rememberedValue();
            if(z1 || c0 == Composer.Companion.getEmpty()) {
                c0 = new c(mosaicViewModel0, 17);
                composer1.updateRememberedValue(c0);
            }
            composer1.endReplaceGroup();
            EffectsKt.DisposableEffect(unit0, c0, composer1, 6);
            ConsumeKDEventKt.ConsumeEvent(mosaicViewModel0.getEvent(), function10, function00, composer1, v1 & 0x70 | 8 | v1 & 0x380);
            RotatableScreenKt.RotatableScreen-FHprtrg(null, null, ((MosaicUiState)state0.getValue()).getOnChangedContentBounds(), null, 0L, ComposableLambdaKt.rememberComposableLambda(0x56DC270D, true, new k(state0, function10, function00), composer1, 54), composer1, 0x30000, 27);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new a(v, 11, mosaicViewModel0, function10, function00));
        }
    }

    public static final MosaicUiState access$MosaicScreen$lambda$0(State state0) {
        return (MosaicUiState)state0.getValue();
    }
}

