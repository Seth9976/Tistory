package com.kakao.kandinsky.border;

import aa.g;
import aa.l;
import android.content.Context;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.compose.FlowExtKt;
import com.kakao.kandinsky.base.ConsumeKDEventKt;
import com.kakao.kandinsky.border.contract.BorderUiState;
import com.kakao.kandinsky.core.kdphoto.Border;
import com.kakao.kandinsky.designsystem.common.FunctionStateKt;
import com.kakao.kandinsky.designsystem.common.ItemSliderKt;
import com.kakao.kandinsky.designsystem.common.RotatableScreenKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pa.r;
import t9.b;
import t9.c;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001AS\u0010\u000B\u001A\u00020\u00042\u0006\u0010\u0001\u001A\u00020\u00002\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0018\u0010\b\u001A\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00040\tH\u0007¢\u0006\u0004\b\u000B\u0010\f¨\u0006\u000F²\u0006\f\u0010\u000E\u001A\u00020\r8\nX\u008A\u0084\u0002"}, d2 = {"Lcom/kakao/kandinsky/border/BorderViewModel;", "borderViewModel", "Lkotlin/Function1;", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "", "onConfirm", "Lkotlin/Function2;", "", "onMultipleConfirm", "Lkotlin/Function0;", "goHomeState", "BorderScreen", "(Lcom/kakao/kandinsky/border/BorderViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Lcom/kakao/kandinsky/border/contract/BorderUiState;", "uiState", "border_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBorderScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BorderScreen.kt\ncom/kakao/kandinsky/border/BorderScreenKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,146:1\n1223#2,6:147\n1223#2,6:154\n77#3:153\n81#4:160\n*S KotlinDebug\n*F\n+ 1 BorderScreen.kt\ncom/kakao/kandinsky/border/BorderScreenKt\n*L\n35#1:147,6\n101#1:154,6\n96#1:153\n33#1:160\n*E\n"})
public final class BorderScreenKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void BorderScreen(@NotNull BorderViewModel borderViewModel0, @NotNull Function1 function10, @NotNull Function2 function20, @NotNull Function0 function00, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(borderViewModel0, "borderViewModel");
        Intrinsics.checkNotNullParameter(function10, "onConfirm");
        Intrinsics.checkNotNullParameter(function20, "onMultipleConfirm");
        Intrinsics.checkNotNullParameter(function00, "goHomeState");
        Composer composer1 = composer0.startRestartGroup(-101091621);
        int v1 = (v & 14) == 0 ? (composer1.changed(borderViewModel0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changedInstance(function20) ? 0x100 : 0x80);
        }
        if((v & 0x1C00) == 0) {
            v1 |= (composer1.changedInstance(function00) ? 0x800 : 0x400);
        }
        if((v1 & 5851) != 1170 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-101091621, v1, -1, "com.kakao.kandinsky.border.BorderScreen (BorderScreen.kt:31)");
            }
            State state0 = FlowExtKt.collectAsStateWithLifecycle(borderViewModel0.getUiState(), null, null, null, composer1, 8, 7);
            composer1.startReplaceGroup(0x767FB84E);
            boolean z = composer1.changed(state0);
            l l0 = composer1.rememberedValue();
            if(z || l0 == Composer.Companion.getEmpty()) {
                l0 = new l(state0, 26);
                composer1.updateRememberedValue(l0);
            }
            composer1.endReplaceGroup();
            BackHandlerKt.BackHandler(false, l0, composer1, 0, 1);
            ConsumeKDEventKt.ConsumeEvent(borderViewModel0.getEvent(), function10, function00, composer1, v1 >> 3 & 0x380 | (v1 & 0x70 | 8));
            RotatableScreenKt.RotatableScreen-FHprtrg(null, null, ((BorderUiState)state0.getValue()).getOnChangedContentBounds(), null, 0L, ComposableLambdaKt.rememberComposableLambda(0x6A3D22FB, true, new r(state0, function10, function00, function20, 1), composer1, 54), composer1, 0x30000, 27);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g(borderViewModel0, function10, function20, function00, v, 9));
        }
    }

    public static final void access$BorderList(String s, ImmutableList immutableList0, Border border0, Function1 function10, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-510364792);
        int v1 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(immutableList0) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changed(border0) ? 0x100 : 0x80);
        }
        if((v & 0x1C00) == 0) {
            v1 |= (composer1.changedInstance(function10) ? 0x800 : 0x400);
        }
        if((v1 & 5851) != 1170 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-510364792, v1, -1, "com.kakao.kandinsky.border.BorderList (BorderScreen.kt:94)");
            }
            Context context0 = (Context)composer1.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            int v2 = immutableList0.size();
            int v3 = border0.getIndex();
            composer1.startReplaceGroup(612546650);
            b b0 = composer1.rememberedValue();
            if((((v1 & 0x70) == 0x20 ? 1 : 0) | ((v1 & 0x1C00) == 0x800 ? 1 : 0)) != 0 || b0 == Composer.Companion.getEmpty()) {
                b0 = new b(function10, immutableList0);
                composer1.updateRememberedValue(b0);
            }
            composer1.endReplaceGroup();
            ItemSliderKt.ItemSlider(null, v2 + 1, v3, FunctionStateKt.skippableLambda(b0, composer1, 0), FunctionStateKt.skippableReturnLambda(new a(context0, immutableList0), composer1, 0), null, ComposableLambdaKt.rememberComposableLambda(0x5441953A, true, new c(s, immutableList0), composer1, 54), composer1, 0x180000, 33);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g(v, 8, s, immutableList0, border0, function10));
        }
    }

    public static final BorderUiState access$BorderScreen$lambda$0(State state0) {
        return (BorderUiState)state0.getValue();
    }
}

