package com.kakao.kandinsky.selector;

import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.selection.b0;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.sd;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.room.a;
import com.kakao.kandinsky.designsystem.theme.OrientationKt;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ra.m;
import ra.n;

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A±\u0001\u0010\u0000\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u000329\b\u0002\u0010\u0004\u001A3\u0012\u0004\u0012\u00020\u0006\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\n¢\u0006\u0002\b\u000B29\b\u0002\u0010\f\u001A3\u0012\u0004\u0012\u00020\u0006\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\n¢\u0006\u0002\b\u000B2\u001E\b\u0002\u0010\r\u001A\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u000E¢\u0006\u0002\b\n¢\u0006\u0002\b\u000BH\u0007¢\u0006\u0002\u0010\u000F¨\u0006\u0010"}, d2 = {"SelectorBottomSheet", "", "onDismiss", "Lkotlin/Function0;", "topBar", "Lkotlin/Function2;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ParameterName;", "name", "dismiss", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "bottomBar", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "selector_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSelectorBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectorBottomSheet.kt\ncom/kakao/kandinsky/selector/SelectorBottomSheetKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,53:1\n488#2:54\n487#2,4:55\n491#2,2:62\n495#2:68\n1223#3,3:59\n1226#3,3:65\n487#4:64\n77#5:69\n148#6:70\n*S KotlinDebug\n*F\n+ 1 SelectorBottomSheet.kt\ncom/kakao/kandinsky/selector/SelectorBottomSheetKt\n*L\n26#1:54\n26#1:55,4\n26#1:62,2\n26#1:68\n26#1:59,3\n26#1:65,3\n26#1:64\n37#1:69\n42#1:70\n*E\n"})
public final class SelectorBottomSheetKt {
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void SelectorBottomSheet(@NotNull Function0 function00, @Nullable Function4 function40, @Nullable Function4 function41, @Nullable Function3 function30, @Nullable Composer composer0, int v, int v1) {
        Function3 function31;
        Function4 function43;
        Function4 function42;
        int v2;
        Intrinsics.checkNotNullParameter(function00, "onDismiss");
        Composer composer1 = composer0.startRestartGroup(0x9DEACCBC);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changedInstance(function40) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changedInstance(function41) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x800 : 0x400);
        }
        if((v2 & 5851) != 1170 || !composer1.getSkipping()) {
            function42 = (v1 & 2) == 0 ? function40 : ComposableSingletons.SelectorBottomSheetKt.INSTANCE.getLambda-1$selector_release();
            Function4 function44 = (v1 & 4) == 0 ? function41 : ComposableSingletons.SelectorBottomSheetKt.INSTANCE.getLambda-2$selector_release();
            Function3 function32 = (v1 & 8) == 0 ? function30 : ComposableSingletons.SelectorBottomSheetKt.INSTANCE.getLambda-3$selector_release();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x9DEACCBC, v2, -1, "com.kakao.kandinsky.selector.SelectorBottomSheet (SelectorBottomSheet.kt:24)");
            }
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer1.rememberedValue();
            if(compositionScopedCoroutineScopeCanceller0 == Composer.Companion.getEmpty()) {
                compositionScopedCoroutineScopeCanceller0 = a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer1), composer1);
            }
            SheetState sheetState0 = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composer1, 6, 2);
            composer1.startMovableGroup(0x6355C0B9, composer1.consume(OrientationKt.getLocalOrientation()));
            Modifier modifier0 = WindowInsetsPadding_androidKt.safeDrawingPadding(Modifier.Companion);
            RoundedCornerShape roundedCornerShape0 = RoundedCornerShapeKt.RoundedCornerShape-a9UjIt4$default(10.0f, 10.0f, 0.0f, 0.0f, 12, null);
            long v3 = MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable).getScrim-0d7_KjU();
            ModalBottomSheetKt.ModalBottomSheet-dYc4hso(function00, modifier0, sheetState0, 0.0f, roundedCornerShape0, MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable).getInverseSurface-0d7_KjU(), 0L, 0.0f, v3, null, null, null, ComposableLambdaKt.rememberComposableLambda(-572890830, true, new m(function42, function44, function32, compositionScopedCoroutineScopeCanceller0.getCoroutineScope(), sheetState0, function00), composer1, 54), composer1, v2 & 14 | 0x30000000, 0x180, 0xCC8);
            composer1.endMovableGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function43 = function44;
            function31 = function32;
        }
        else {
            composer1.skipToGroupEnd();
            function42 = function40;
            function43 = function41;
            function31 = function30;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new b0(function00, function42, function43, function31, v, v1, 7));
        }
    }

    public static final void access$SelectorBottomSheet$dismiss(CoroutineScope coroutineScope0, SheetState sheetState0, Function0 function00) {
        BuildersKt.launch$default(coroutineScope0, null, null, new n(sheetState0, null), 3, null).invokeOnCompletion(new sd(sheetState0, function00, 2));
    }
}

