package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000x\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A\u0084\u0001\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\u00032\b\b\u0002\u0010\u000B\u001A\u00020\u00032\b\b\u0002\u0010\f\u001A\u00020\r21\u0010\u000E\u001A-\u0012\u0004\u0012\u00020\u0010\u0012\u0013\u0012\u00110\u0003\u00A2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00010\u000F\u00A2\u0006\u0002\b\u0014\u00A2\u0006\u0002\b\u0015H\u0007\u00A2\u0006\u0002\u0010\u0016\u001A\u0084\u0001\u0010\u0017\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\u0018\u001A\u00020\u00032\b\b\u0002\u0010\u000B\u001A\u00020\u00032\b\b\u0002\u0010\f\u001A\u00020\u001921\u0010\u000E\u001A-\u0012\u0004\u0012\u00020\u001A\u0012\u0013\u0012\u00110\u0003\u00A2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00010\u000F\u00A2\u0006\u0002\b\u0014\u00A2\u0006\u0002\b\u0015H\u0007\u00A2\u0006\u0002\u0010\u001B\u001A\u00A5\u0001\u0010\u001C\u001A\u0014\u0012\u0004\u0012\u00020\u001D\u0012\u0004\u0012\u00020\u001E\u0012\u0004\u0012\u00020\u001F0\u000F2\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\t2\u0006\u0010 \u001A\u00020\u00032\u0006\u0010\u000B\u001A\u00020\u00032\u0006\u0010!\u001A\u00020\"2\u0006\u0010\u0002\u001A\u00020\u00032\u0017\u0010#\u001A\u0013\u0012\u000F\u0012\r\u0012\u0004\u0012\u00020\u00010%\u00A2\u0006\u0002\b\u00140$2;\u0010&\u001A7\u0012\u0013\u0012\u00110\u0003\u00A2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\'\u00A2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u00010\u000F\u00A2\u0006\u0002\b\u0014H\u0001\u00A2\u0006\u0002\u0010)\u001A\u00A5\u0001\u0010*\u001A\u0014\u0012\u0004\u0012\u00020\u001D\u0012\u0004\u0012\u00020\u001E\u0012\u0004\u0012\u00020\u001F0\u000F2\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010 \u001A\u00020\u00032\u0006\u0010\u000B\u001A\u00020\u00032\u0006\u0010!\u001A\u00020\"2\u0006\u0010\u0002\u001A\u00020\u00032\u0017\u0010#\u001A\u0013\u0012\u000F\u0012\r\u0012\u0004\u0012\u00020\u00010%\u00A2\u0006\u0002\b\u00140$2;\u0010&\u001A7\u0012\u0013\u0012\u00110\u0003\u00A2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\'\u00A2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u00010\u000F\u00A2\u0006\u0002\b\u0014H\u0001\u00A2\u0006\u0002\u0010+\u00A8\u0006,"}, d2 = {"ContextualFlowColumn", "", "itemCount", "", "modifier", "Landroidx/compose/ui/Modifier;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "maxItemsInEachColumn", "maxLines", "overflow", "Landroidx/compose/foundation/layout/ContextualFlowColumnOverflow;", "content", "Lkotlin/Function2;", "Landroidx/compose/foundation/layout/ContextualFlowColumnScope;", "Lkotlin/ParameterName;", "name", "index", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;IILandroidx/compose/foundation/layout/ContextualFlowColumnOverflow;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "ContextualFlowRow", "maxItemsInEachRow", "Landroidx/compose/foundation/layout/ContextualFlowRowOverflow;", "Landroidx/compose/foundation/layout/ContextualFlowRowScope;", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;IILandroidx/compose/foundation/layout/ContextualFlowRowOverflow;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "contextualColumnMeasureHelper", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "maxItemsInMainAxis", "overflowState", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "overflowComposables", "", "Lkotlin/Function0;", "getComposable", "Landroidx/compose/foundation/layout/FlowLineInfo;", "info", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;ILjava/util/List;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", "contextualRowMeasurementHelper", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;ILjava/util/List;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nContextualFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextualFlowLayout.kt\nandroidx/compose/foundation/layout/ContextualFlowLayoutKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,564:1\n1223#2,6:565\n1223#2,6:571\n1223#2,6:577\n1223#2,6:583\n1223#2,6:589\n1223#2,6:595\n*S KotlinDebug\n*F\n+ 1 ContextualFlowLayout.kt\nandroidx/compose/foundation/layout/ContextualFlowLayoutKt\n*L\n75#1:565,6\n78#1:571,6\n150#1:577,6\n153#1:583,6\n344#1:589,6\n384#1:595,6\n*E\n"})
public final class ContextualFlowLayoutKt {
    @ExperimentalLayoutApi
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ContextualFlowColumn(int v, @Nullable Modifier modifier0, @Nullable Vertical arrangement$Vertical0, @Nullable Horizontal arrangement$Horizontal0, int v1, int v2, @Nullable ContextualFlowColumnOverflow contextualFlowColumnOverflow0, @NotNull Function4 function40, @Nullable Composer composer0, int v3, int v4) {
        ContextualFlowColumnOverflow contextualFlowColumnOverflow1;
        int v7;
        Horizontal arrangement$Horizontal1;
        Vertical arrangement$Vertical2;
        Modifier modifier2;
        int v6;
        Vertical arrangement$Vertical1;
        Modifier modifier1;
        int v5;
        Composer composer1 = composer0.startRestartGroup(0xDCEC8E21);
        if((v4 & 1) == 0) {
            v5 = (v3 & 6) == 0 ? (composer1.changed(v) ? 4 : 2) | v3 : v3;
        }
        else {
            v5 = v3 | 6;
        }
        if((v4 & 2) != 0) {
            v5 |= 0x30;
            modifier1 = modifier0;
        }
        else if((v3 & 0x30) == 0) {
            modifier1 = modifier0;
            v5 |= (composer1.changed(modifier1) ? 0x20 : 16);
        }
        else {
            modifier1 = modifier0;
        }
        if((v4 & 4) != 0) {
            v5 |= 0x180;
            arrangement$Vertical1 = arrangement$Vertical0;
        }
        else if((v3 & 0x180) == 0) {
            arrangement$Vertical1 = arrangement$Vertical0;
            v5 |= (composer1.changed(arrangement$Vertical1) ? 0x100 : 0x80);
        }
        else {
            arrangement$Vertical1 = arrangement$Vertical0;
        }
        if((v4 & 8) != 0) {
            v5 |= 0xC00;
        }
        else if((v3 & 0xC00) == 0) {
            v5 |= (composer1.changed(arrangement$Horizontal0) ? 0x800 : 0x400);
        }
        if((v4 & 16) != 0) {
            v5 |= 0x6000;
        }
        else if((v3 & 0x6000) == 0) {
            v5 |= (composer1.changed(v1) ? 0x4000 : 0x2000);
        }
        if((v4 & 0x20) != 0) {
            v5 |= 0x30000;
        }
        else if((v3 & 0x30000) == 0) {
            v5 |= (composer1.changed(v2) ? 0x20000 : 0x10000);
        }
        if((v4 & 0x40) != 0) {
            v5 |= 0x180000;
        }
        else if((v3 & 0x180000) == 0) {
            v5 |= (composer1.changed(contextualFlowColumnOverflow0) ? 0x100000 : 0x80000);
        }
        if((v4 & 0x80) != 0) {
            v5 |= 0xC00000;
        }
        else if((v3 & 0xC00000) == 0) {
            v5 |= (composer1.changedInstance(function40) ? 0x800000 : 0x400000);
        }
        if((0x492493 & v5) != 4793490 || !composer1.getSkipping()) {
            if((v4 & 2) != 0) {
                modifier1 = Modifier.Companion;
            }
            if((v4 & 4) != 0) {
                arrangement$Vertical1 = Arrangement.INSTANCE.getTop();
            }
            Horizontal arrangement$Horizontal2 = (v4 & 8) == 0 ? arrangement$Horizontal0 : Arrangement.INSTANCE.getStart();
            int v8 = 0x7FFFFFFF;
            int v9 = (v4 & 16) == 0 ? v1 : 0x7FFFFFFF;
            if((v4 & 0x20) == 0) {
                v8 = v2;
            }
            ContextualFlowColumnOverflow contextualFlowColumnOverflow2 = (v4 & 0x40) == 0 ? contextualFlowColumnOverflow0 : ContextualFlowColumnOverflow.Companion.getClip();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xDCEC8E21, v5, -1, "androidx.compose.foundation.layout.ContextualFlowColumn (ContextualFlowLayout.kt:148)");
            }
            FlowLayoutOverflowState flowLayoutOverflowState0 = composer1.rememberedValue();
            if((0x380000 & v5) == 0x100000 || flowLayoutOverflowState0 == Composer.Companion.getEmpty()) {
                flowLayoutOverflowState0 = contextualFlowColumnOverflow2.createOverflowState$foundation_layout_release();
                composer1.updateRememberedValue(flowLayoutOverflowState0);
            }
            ArrayList arrayList0 = composer1.rememberedValue();
            if((0x380000 & v5) == 0x100000 || arrayList0 == Composer.Companion.getEmpty()) {
                arrayList0 = new ArrayList();
                contextualFlowColumnOverflow2.addOverflowComposables$foundation_layout_release(flowLayoutOverflowState0, arrayList0);
                composer1.updateRememberedValue(arrayList0);
            }
            SubcomposeLayoutKt.SubcomposeLayout(modifier1, ContextualFlowLayoutKt.contextualColumnMeasureHelper(arrangement$Vertical1, arrangement$Horizontal2, v9, v8, flowLayoutOverflowState0, v, arrayList0, ComposableLambdaKt.rememberComposableLambda(0x1206CBF6, true, new j0(function40), composer1, 54), composer1, v5 >> 6 & 0x1C00 | (v5 >> 6 & 14 | 0xC00000 | v5 >> 6 & 0x70 | v5 >> 6 & 0x380) | v5 << 15 & 0x70000), composer1, v5 >> 3 & 14, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            arrangement$Vertical2 = arrangement$Vertical1;
            contextualFlowColumnOverflow1 = contextualFlowColumnOverflow2;
            v6 = v8;
            modifier2 = modifier1;
            v7 = v9;
            arrangement$Horizontal1 = arrangement$Horizontal2;
        }
        else {
            composer1.skipToGroupEnd();
            v6 = v2;
            modifier2 = modifier1;
            arrangement$Vertical2 = arrangement$Vertical1;
            arrangement$Horizontal1 = arrangement$Horizontal0;
            v7 = v1;
            contextualFlowColumnOverflow1 = contextualFlowColumnOverflow0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new i0(v, modifier2, arrangement$Vertical2, arrangement$Horizontal1, v7, v6, contextualFlowColumnOverflow1, function40, v3, v4));
        }
    }

    @ExperimentalLayoutApi
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ContextualFlowRow(int v, @Nullable Modifier modifier0, @Nullable Horizontal arrangement$Horizontal0, @Nullable Vertical arrangement$Vertical0, int v1, int v2, @Nullable ContextualFlowRowOverflow contextualFlowRowOverflow0, @NotNull Function4 function40, @Nullable Composer composer0, int v3, int v4) {
        ContextualFlowRowOverflow contextualFlowRowOverflow1;
        int v7;
        Vertical arrangement$Vertical1;
        Horizontal arrangement$Horizontal2;
        Modifier modifier2;
        int v6;
        Horizontal arrangement$Horizontal1;
        Modifier modifier1;
        int v5;
        Composer composer1 = composer0.startRestartGroup(0xEBA0FE3F);
        if((v4 & 1) == 0) {
            v5 = (v3 & 6) == 0 ? (composer1.changed(v) ? 4 : 2) | v3 : v3;
        }
        else {
            v5 = v3 | 6;
        }
        if((v4 & 2) != 0) {
            v5 |= 0x30;
            modifier1 = modifier0;
        }
        else if((v3 & 0x30) == 0) {
            modifier1 = modifier0;
            v5 |= (composer1.changed(modifier1) ? 0x20 : 16);
        }
        else {
            modifier1 = modifier0;
        }
        if((v4 & 4) != 0) {
            v5 |= 0x180;
            arrangement$Horizontal1 = arrangement$Horizontal0;
        }
        else if((v3 & 0x180) == 0) {
            arrangement$Horizontal1 = arrangement$Horizontal0;
            v5 |= (composer1.changed(arrangement$Horizontal1) ? 0x100 : 0x80);
        }
        else {
            arrangement$Horizontal1 = arrangement$Horizontal0;
        }
        if((v4 & 8) != 0) {
            v5 |= 0xC00;
        }
        else if((v3 & 0xC00) == 0) {
            v5 |= (composer1.changed(arrangement$Vertical0) ? 0x800 : 0x400);
        }
        if((v4 & 16) != 0) {
            v5 |= 0x6000;
        }
        else if((v3 & 0x6000) == 0) {
            v5 |= (composer1.changed(v1) ? 0x4000 : 0x2000);
        }
        if((v4 & 0x20) != 0) {
            v5 |= 0x30000;
        }
        else if((v3 & 0x30000) == 0) {
            v5 |= (composer1.changed(v2) ? 0x20000 : 0x10000);
        }
        if((v4 & 0x40) != 0) {
            v5 |= 0x180000;
        }
        else if((v3 & 0x180000) == 0) {
            v5 |= (composer1.changed(contextualFlowRowOverflow0) ? 0x100000 : 0x80000);
        }
        if((v4 & 0x80) != 0) {
            v5 |= 0xC00000;
        }
        else if((v3 & 0xC00000) == 0) {
            v5 |= (composer1.changedInstance(function40) ? 0x800000 : 0x400000);
        }
        if((0x492493 & v5) != 4793490 || !composer1.getSkipping()) {
            if((v4 & 2) != 0) {
                modifier1 = Modifier.Companion;
            }
            if((v4 & 4) != 0) {
                arrangement$Horizontal1 = Arrangement.INSTANCE.getStart();
            }
            Vertical arrangement$Vertical2 = (v4 & 8) == 0 ? arrangement$Vertical0 : Arrangement.INSTANCE.getTop();
            int v8 = 0x7FFFFFFF;
            int v9 = (v4 & 16) == 0 ? v1 : 0x7FFFFFFF;
            if((v4 & 0x20) == 0) {
                v8 = v2;
            }
            ContextualFlowRowOverflow contextualFlowRowOverflow2 = (v4 & 0x40) == 0 ? contextualFlowRowOverflow0 : ContextualFlowRowOverflow.Companion.getClip();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xEBA0FE3F, v5, -1, "androidx.compose.foundation.layout.ContextualFlowRow (ContextualFlowLayout.kt:73)");
            }
            FlowLayoutOverflowState flowLayoutOverflowState0 = composer1.rememberedValue();
            if((0x380000 & v5) == 0x100000 || flowLayoutOverflowState0 == Composer.Companion.getEmpty()) {
                flowLayoutOverflowState0 = contextualFlowRowOverflow2.createOverflowState$foundation_layout_release();
                composer1.updateRememberedValue(flowLayoutOverflowState0);
            }
            ArrayList arrayList0 = composer1.rememberedValue();
            if((0x380000 & v5) == 0x100000 || arrayList0 == Composer.Companion.getEmpty()) {
                arrayList0 = new ArrayList();
                contextualFlowRowOverflow2.addOverflowComposables$foundation_layout_release(flowLayoutOverflowState0, arrayList0);
                composer1.updateRememberedValue(arrayList0);
            }
            SubcomposeLayoutKt.SubcomposeLayout(modifier1, ContextualFlowLayoutKt.contextualRowMeasurementHelper(arrangement$Horizontal1, arrangement$Vertical2, v9, v8, flowLayoutOverflowState0, v, arrayList0, ComposableLambdaKt.rememberComposableLambda(-8464804, true, new l0(function40), composer1, 54), composer1, v5 >> 6 & 0x1C00 | (v5 >> 6 & 14 | 0xC00000 | v5 >> 6 & 0x70 | v5 >> 6 & 0x380) | v5 << 15 & 0x70000), composer1, v5 >> 3 & 14, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            arrangement$Horizontal2 = arrangement$Horizontal1;
            contextualFlowRowOverflow1 = contextualFlowRowOverflow2;
            v6 = v8;
            modifier2 = modifier1;
            v7 = v9;
            arrangement$Vertical1 = arrangement$Vertical2;
        }
        else {
            composer1.skipToGroupEnd();
            v6 = v2;
            modifier2 = modifier1;
            arrangement$Horizontal2 = arrangement$Horizontal1;
            arrangement$Vertical1 = arrangement$Vertical0;
            v7 = v1;
            contextualFlowRowOverflow1 = contextualFlowRowOverflow0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new k0(v, modifier2, arrangement$Horizontal2, arrangement$Vertical1, v7, v6, contextualFlowRowOverflow1, function40, v3, v4));
        }
    }

    @Composable
    @NotNull
    public static final Function2 contextualColumnMeasureHelper(@NotNull Vertical arrangement$Vertical0, @NotNull Horizontal arrangement$Horizontal0, int v, int v1, @NotNull FlowLayoutOverflowState flowLayoutOverflowState0, int v2, @NotNull List list0, @NotNull Function4 function40, @Nullable Composer composer0, int v3) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1009762916, v3, -1, "androidx.compose.foundation.layout.contextualColumnMeasureHelper (ContextualFlowLayout.kt:382)");
        }
        int v4 = 0;
        int v5 = ((v3 & 14 ^ 6) <= 4 || !composer0.changed(arrangement$Vertical0)) && (v3 & 6) != 4 ? 0 : 1;
        int v6 = ((v3 & 0x70 ^ 0x30) <= 0x20 || !composer0.changed(arrangement$Horizontal0)) && (v3 & 0x30) != 0x20 ? 0 : 1;
        int v7 = ((v3 & 0x380 ^ 0x180) <= 0x100 || !composer0.changed(v)) && (v3 & 0x180) != 0x100 ? 0 : 1;
        int v8 = ((v3 & 0x1C00 ^ 0xC00) <= 0x800 || !composer0.changed(v1)) && (v3 & 0xC00) != 0x800 ? 0 : 1;
        boolean z = composer0.changed(flowLayoutOverflowState0);
        int v9 = ((0x70000 & v3 ^ 0x30000) <= 0x20000 || !composer0.changed(v2)) && (v3 & 0x30000) != 0x20000 ? 0 : 1;
        if((0x1C00000 & v3 ^ 0xC00000) > 0x800000 && composer0.changed(function40) || (v3 & 0xC00000) == 0x800000) {
            v4 = 1;
        }
        d2 d20 = composer0.rememberedValue();
        if((v5 | v6 | v7 | v8 | z | v9 | v4) != 0 || d20 == Composer.Companion.getEmpty()) {
            d20 = new d2(new g2(false, arrangement$Horizontal0, arrangement$Vertical0, arrangement$Vertical0.getSpacing-D9Ej5fM(), FlowLayoutKt.getCROSS_AXIS_ALIGNMENT_START(), arrangement$Horizontal0.getSpacing-D9Ej5fM(), v2, v1, v, flowLayoutOverflowState0, list0, function40));
            composer0.updateRememberedValue(d20);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return d20;
    }

    @Composable
    @NotNull
    public static final Function2 contextualRowMeasurementHelper(@NotNull Horizontal arrangement$Horizontal0, @NotNull Vertical arrangement$Vertical0, int v, int v1, @NotNull FlowLayoutOverflowState flowLayoutOverflowState0, int v2, @NotNull List list0, @NotNull Function4 function40, @Nullable Composer composer0, int v3) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xFD6A8348, v3, -1, "androidx.compose.foundation.layout.contextualRowMeasurementHelper (ContextualFlowLayout.kt:342)");
        }
        int v4 = 0;
        int v5 = ((v3 & 14 ^ 6) <= 4 || !composer0.changed(arrangement$Horizontal0)) && (v3 & 6) != 4 ? 0 : 1;
        int v6 = ((v3 & 0x70 ^ 0x30) <= 0x20 || !composer0.changed(arrangement$Vertical0)) && (v3 & 0x30) != 0x20 ? 0 : 1;
        int v7 = ((v3 & 0x380 ^ 0x180) <= 0x100 || !composer0.changed(v)) && (v3 & 0x180) != 0x100 ? 0 : 1;
        int v8 = ((v3 & 0x1C00 ^ 0xC00) <= 0x800 || !composer0.changed(v1)) && (v3 & 0xC00) != 0x800 ? 0 : 1;
        boolean z = composer0.changed(flowLayoutOverflowState0);
        int v9 = ((0x70000 & v3 ^ 0x30000) <= 0x20000 || !composer0.changed(v2)) && (v3 & 0x30000) != 0x20000 ? 0 : 1;
        if((0x1C00000 & v3 ^ 0xC00000) > 0x800000 && composer0.changed(function40) || (v3 & 0xC00000) == 0x800000) {
            v4 = 1;
        }
        d2 d20 = composer0.rememberedValue();
        if((v5 | v6 | v7 | v8 | z | v9 | v4) != 0 || d20 == Composer.Companion.getEmpty()) {
            d20 = new d2(new g2(true, arrangement$Horizontal0, arrangement$Vertical0, arrangement$Horizontal0.getSpacing-D9Ej5fM(), FlowLayoutKt.getCROSS_AXIS_ALIGNMENT_TOP(), arrangement$Vertical0.getSpacing-D9Ej5fM(), v2, v1, v, flowLayoutOverflowState0, list0, function40));
            composer0.updateRememberedValue(d20);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return d20;
    }
}

