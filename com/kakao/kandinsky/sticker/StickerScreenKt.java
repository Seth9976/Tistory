package com.kakao.kandinsky.sticker;

import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.text.selection.a;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.compose.FlowExtKt;
import com.kakao.kandinsky.base.ConsumeKDEventKt;
import com.kakao.kandinsky.designsystem.common.RotatableScreenKt;
import com.kakao.kandinsky.sticker.contract.StickerUiModel;
import ea.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w0.i1;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001A7\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00010\bH\u0007¢\u0006\u0002\u0010\t¨\u0006\n²\u0006\n\u0010\u000B\u001A\u00020\fX\u008A\u0084\u0002"}, d2 = {"StickerScreen", "", "viewModel", "Lcom/kakao/kandinsky/sticker/StickerViewModel;", "onConfirm", "Lkotlin/Function1;", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "goHomeState", "Lkotlin/Function0;", "(Lcom/kakao/kandinsky/sticker/StickerViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "sticker_release", "uiState", "Lcom/kakao/kandinsky/sticker/contract/StickerUiModel;"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nStickerScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StickerScreen.kt\ncom/kakao/kandinsky/sticker/StickerScreenKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,59:1\n1223#2,6:60\n81#3:66\n*S KotlinDebug\n*F\n+ 1 StickerScreen.kt\ncom/kakao/kandinsky/sticker/StickerScreenKt\n*L\n24#1:60,6\n22#1:66\n*E\n"})
public final class StickerScreenKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void StickerScreen(@NotNull StickerViewModel stickerViewModel0, @NotNull Function1 function10, @NotNull Function0 function00, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(stickerViewModel0, "viewModel");
        Intrinsics.checkNotNullParameter(function10, "onConfirm");
        Intrinsics.checkNotNullParameter(function00, "goHomeState");
        Composer composer1 = composer0.startRestartGroup(-1021851481);
        int v1 = (v & 14) == 0 ? (composer1.changed(stickerViewModel0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changedInstance(function00) ? 0x100 : 0x80);
        }
        if((v1 & 731) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1021851481, v1, -1, "com.kakao.kandinsky.sticker.StickerScreen (StickerScreen.kt:20)");
            }
            State state0 = FlowExtKt.collectAsStateWithLifecycle(stickerViewModel0.getUiState(), null, null, null, composer1, 8, 7);
            composer1.startReplaceGroup(0x9243E06);
            boolean z = composer1.changed(state0);
            i1 i10 = composer1.rememberedValue();
            if(z || i10 == Composer.Companion.getEmpty()) {
                i10 = new i1(state0, 1);
                composer1.updateRememberedValue(i10);
            }
            composer1.endReplaceGroup();
            BackHandlerKt.BackHandler(false, i10, composer1, 0, 1);
            RotatableScreenKt.RotatableScreen-FHprtrg(null, null, ((StickerUiModel)state0.getValue()).getOnChangedContentBounds(), null, 0L, ComposableLambdaKt.rememberComposableLambda(0xEA170CC7, true, new c(state0, 6), composer1, 54), composer1, 0x30000, 27);
            ConsumeKDEventKt.ConsumeEvent(stickerViewModel0.getEvent(), function10, function00, composer1, v1 & 0x380 | (v1 & 0x70 | 8));
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new a(v, 19, stickerViewModel0, function10, function00));
        }
    }

    public static final StickerUiModel access$StickerScreen$lambda$0(State state0) {
        return (StickerUiModel)state0.getValue();
    }
}

