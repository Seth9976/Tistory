package com.kakao.kandinsky.base;

import androidx.compose.material3.gd;
import androidx.compose.material3.x5;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import com.kakao.kandinsky.base.contract.DialogUiState;
import com.kakao.kandinsky.designsystem.common.CommonDialogKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p9.a;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\u001A\u001B\u0010\u0000\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0002\u0010\u0005¨\u0006\u0006²\u0006\f\u0010\u0007\u001A\u0004\u0018\u00010\u0004X\u008A\u0084\u0002²\u0006\n\u0010\b\u001A\u00020\tX\u008A\u008E\u0002"}, d2 = {"ConsumeDialog", "", "event", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kakao/kandinsky/base/contract/DialogUiState;", "(Lkotlinx/coroutines/flow/Flow;Landroidx/compose/runtime/Composer;I)V", "base_release", "dialogEvent", "showDialog", ""}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nConsumeDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConsumeDialog.kt\ncom/kakao/kandinsky/base/ConsumeDialogKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,28:1\n1223#2,6:29\n1223#2,6:35\n1223#2,6:41\n81#3:47\n81#3:48\n107#3,2:49\n*S KotlinDebug\n*F\n+ 1 ConsumeDialog.kt\ncom/kakao/kandinsky/base/ConsumeDialogKt\n*L\n11#1:29,6\n12#1:35,6\n20#1:41,6\n10#1:47\n11#1:48\n11#1:49,2\n*E\n"})
public final class ConsumeDialogKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void ConsumeDialog(@NotNull Flow flow0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(flow0, "event");
        Composer composer1 = composer0.startRestartGroup(0x772CBD5F);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x772CBD5F, v, -1, "com.kakao.kandinsky.base.ConsumeDialog (ConsumeDialog.kt:8)");
        }
        State state0 = SnapshotStateKt.collectAsState(flow0, null, null, composer1, 56, 2);
        DialogUiState dialogUiState0 = (DialogUiState)state0.getValue();
        composer1.startReplaceGroup(0x10864D6D);
        boolean z = composer1.changed(dialogUiState0);
        MutableState mutableState0 = composer1.rememberedValue();
        if(z || mutableState0 == Composer.Companion.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(((DialogUiState)state0.getValue()) != null), null, 2, null);
            composer1.updateRememberedValue(mutableState0);
        }
        composer1.endReplaceGroup();
        composer1.startReplaceGroup(0x10864DBD);
        boolean z1 = composer1.changed(mutableState0);
        x5 x50 = composer1.rememberedValue();
        if(z1 || x50 == Composer.Companion.getEmpty()) {
            x50 = new x5(mutableState0, 3);
            composer1.updateRememberedValue(x50);
        }
        composer1.endReplaceGroup();
        DialogUiState dialogUiState1 = (DialogUiState)state0.getValue();
        if(dialogUiState1 != null) {
            composer1.startReplaceGroup(0x10864DF4);
            if(((Boolean)mutableState0.getValue()).booleanValue()) {
                int v1 = dialogUiState1.getTitleResId();
                int v2 = dialogUiState1.getMessageResId();
                composer1.startReplaceGroup(-504077219);
                boolean z2 = composer1.changed(dialogUiState1);
                boolean z3 = composer1.changed(x50);
                a a0 = composer1.rememberedValue();
                if(z2 || z3 || a0 == Composer.Companion.getEmpty()) {
                    a0 = new a(0, dialogUiState1, x50);
                    composer1.updateRememberedValue(a0);
                }
                composer1.endReplaceGroup();
                CommonDialogKt.CommonDialog(v1, v2, x50, a0, composer1, 0);
            }
            composer1.endReplaceGroup();
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new gd(flow0, v, 11));
        }
    }

    public static final void access$ConsumeDialog$lambda$3(MutableState mutableState0, boolean z) {
        mutableState0.setValue(Boolean.valueOf(z));
    }
}

