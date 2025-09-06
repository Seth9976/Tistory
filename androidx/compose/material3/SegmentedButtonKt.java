package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.foundation.text.selection.j;
import androidx.compose.material3.tokens.OutlinedSegmentedButtonTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.room.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001A\u0093\u0001\u0010\u0015\u001A\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\n\u001A\u00020\u00012\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\r2\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000F2\u0013\b\u0002\u0010\u0013\u001A\r\u0012\u0004\u0012\u00020\u00040\u0011\u00A2\u0006\u0002\b\u00122\u0011\u0010\u0014\u001A\r\u0012\u0004\u0012\u00020\u00040\u0011\u00A2\u0006\u0002\b\u0012H\u0007\u00A2\u0006\u0004\b\u0015\u0010\u0016\u001A\u008D\u0001\u0010\u0015\u001A\u00020\u0004*\u00020\u00172\u0006\u0010\u0018\u001A\u00020\u00012\f\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\u00040\u00112\u0006\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\n\u001A\u00020\u00012\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\r2\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000F2\u0013\b\u0002\u0010\u0013\u001A\r\u0012\u0004\u0012\u00020\u00040\u0011\u00A2\u0006\u0002\b\u00122\u0011\u0010\u0014\u001A\r\u0012\u0004\u0012\u00020\u00040\u0011\u00A2\u0006\u0002\b\u0012H\u0007\u00A2\u0006\u0004\b\u0015\u0010\u001A\u001AD\u0010!\u001A\u00020\u00042\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u001C\u001A\u00020\u001B2\u001C\u0010\u001E\u001A\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00040\u0003\u00A2\u0006\u0002\b\u0012\u00A2\u0006\u0002\b\u001DH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001F\u0010 \u001AD\u0010#\u001A\u00020\u00042\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u001C\u001A\u00020\u001B2\u001C\u0010\u001E\u001A\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003\u00A2\u0006\u0002\b\u0012\u00A2\u0006\u0002\b\u001DH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\"\u0010 \u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006$"}, d2 = {"Landroidx/compose/material3/MultiChoiceSegmentedButtonRowScope;", "", "checked", "Lkotlin/Function1;", "", "onCheckedChange", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "Landroidx/compose/material3/SegmentedButtonColors;", "colors", "Landroidx/compose/foundation/BorderStroke;", "border", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "icon", "label", "SegmentedButton", "(Landroidx/compose/material3/MultiChoiceSegmentedButtonRowScope;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SegmentedButtonColors;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/material3/SingleChoiceSegmentedButtonRowScope;", "selected", "onClick", "(Landroidx/compose/material3/SingleChoiceSegmentedButtonRowScope;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SegmentedButtonColors;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/unit/Dp;", "space", "Lkotlin/ExtensionFunctionType;", "content", "SingleChoiceSegmentedButtonRow-uFdPcIQ", "(Landroidx/compose/ui/Modifier;FLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "SingleChoiceSegmentedButtonRow", "MultiChoiceSegmentedButtonRow-uFdPcIQ", "MultiChoiceSegmentedButtonRow", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSegmentedButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedButton.kt\nandroidx/compose/material3/SegmentedButtonKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,774:1\n1223#2,6:775\n1223#2,6:781\n1223#2,6:820\n1223#2,6:863\n1223#2,6:912\n1223#2,6:918\n62#3:787\n62#3:830\n98#4,3:788\n101#4:819\n105#4:829\n98#4,3:831\n101#4:862\n105#4:872\n78#5,6:791\n85#5,4:806\n89#5,2:816\n93#5:828\n78#5,6:834\n85#5,4:849\n89#5,2:859\n93#5:871\n78#5,6:879\n85#5,4:894\n89#5,2:904\n93#5:910\n368#6,9:797\n377#6:818\n378#6,2:826\n368#6,9:840\n377#6:861\n378#6,2:869\n368#6,9:885\n377#6:906\n378#6,2:908\n4032#7,6:810\n4032#7,6:853\n4032#7,6:898\n71#8:873\n69#8,5:874\n74#8:907\n78#8:911\n148#9:924\n*S KotlinDebug\n*F\n+ 1 SegmentedButton.kt\nandroidx/compose/material3/SegmentedButtonKt\n*L\n142#1:775,6\n220#1:781,6\n279#1:820,6\n316#1:863,6\n398#1:912,6\n399#1:918,6\n276#1:787\n313#1:830\n270#1:788,3\n270#1:819\n270#1:829\n308#1:831,3\n308#1:862\n308#1:872\n270#1:791,6\n270#1:806,4\n270#1:816,2\n270#1:828\n308#1:834,6\n308#1:849,4\n308#1:859,2\n308#1:871\n326#1:879,6\n326#1:894,4\n326#1:904,2\n326#1:910\n270#1:797,9\n270#1:818\n270#1:826,2\n308#1:840,9\n308#1:861\n308#1:869,2\n326#1:885,9\n326#1:906\n326#1:908,2\n270#1:810,6\n308#1:853,6\n326#1:898,6\n326#1:873\n326#1:874,5\n326#1:907\n326#1:911\n767#1:924\n*E\n"})
public final class SegmentedButtonKt {
    public static final float a;

    static {
        SegmentedButtonKt.a = 8.0f;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void MultiChoiceSegmentedButtonRow-uFdPcIQ(@Nullable Modifier modifier0, float f, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1) {
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x94B2F8B);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changed(f) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x100 : 0x80);
        }
        if((v2 & 0x93) != 0x92 || !composer1.getSkipping()) {
            if((v1 & 1) != 0) {
                modifier0 = Modifier.Companion;
            }
            if((v1 & 2) != 0) {
                f = 0.0f;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x94B2F8B, v2, -1, "androidx.compose.material3.MultiChoiceSegmentedButtonRow (SegmentedButton.kt:306)");
            }
            Modifier modifier1 = IntrinsicKt.width(SizeKt.defaultMinSize-VpY3zN4$default(modifier0, 0.0f, 0.0f, 1, null), IntrinsicSize.Min);
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.spacedBy-0680j_4(-f), Alignment.Companion.getCenterVertically(), composer1, 0x30);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function00);
            }
            else {
                composer1.useNode();
            }
            Function2 function20 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                a.t(v3, composer1, v3, function20);
            }
            Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
            RowScopeInstance rowScopeInstance0 = RowScopeInstance.INSTANCE;
            je je0 = composer1.rememberedValue();
            if(je0 == Composer.Companion.getEmpty()) {
                je0 = new je(rowScopeInstance0);
                composer1.updateRememberedValue(je0);
            }
            function30.invoke(je0, composer1, ((int)(v2 >> 3 & 0x70 | 6)));
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new uj(modifier0, f, function30, v, v1, 0));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_]]")
    public static final void SegmentedButton(@NotNull MultiChoiceSegmentedButtonRowScope multiChoiceSegmentedButtonRowScope0, boolean z, @NotNull Function1 function10, @NotNull Shape shape0, @Nullable Modifier modifier0, boolean z1, @Nullable SegmentedButtonColors segmentedButtonColors0, @Nullable BorderStroke borderStroke0, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Function2 function20, @NotNull Function2 function21, @Nullable Composer composer0, int v, int v1, int v2) {
        Function2 function22;
        BorderStroke borderStroke1;
        boolean z3;
        Modifier modifier1;
        MutableInteractionSource mutableInteractionSource1;
        SegmentedButtonColors segmentedButtonColors1;
        MutableInteractionSource mutableInteractionSource5;
        Function2 function23;
        boolean z4;
        Modifier modifier2;
        int v5;
        MutableInteractionSource mutableInteractionSource2;
        BorderStroke borderStroke2;
        SegmentedButtonColors segmentedButtonColors2;
        BorderStroke borderStroke3;
        SegmentedButtonColors segmentedButtonColors3;
        int v4;
        boolean z2;
        int v3;
        Composer composer1 = composer0.startRestartGroup(-1596038053);
        if((0x80000000 & v2) == 0) {
            v3 = (v & 6) == 0 ? (composer1.changed(multiChoiceSegmentedButtonRowScope0) ? 4 : 2) | v : v;
        }
        else {
            v3 = v | 6;
        }
        if((v2 & 1) != 0) {
            v3 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v3 |= (composer1.changed(z) ? 0x20 : 16);
        }
        if((v2 & 2) != 0) {
            v3 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v3 |= (composer1.changedInstance(function10) ? 0x100 : 0x80);
        }
        if((v2 & 4) != 0) {
            v3 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v3 |= (composer1.changed(shape0) ? 0x800 : 0x400);
        }
        if((v2 & 8) != 0) {
            v3 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v3 |= (composer1.changed(modifier0) ? 0x4000 : 0x2000);
        }
        if((v2 & 16) != 0) {
            v3 |= 0x30000;
            z2 = z1;
        }
        else if((0x30000 & v) == 0) {
            z2 = z1;
            v3 |= (composer1.changed(z2) ? 0x20000 : 0x10000);
        }
        else {
            z2 = z1;
        }
        if((v & 0x180000) == 0) {
            v3 |= ((v2 & 0x20) != 0 || !composer1.changed(segmentedButtonColors0) ? 0x80000 : 0x100000);
        }
        if((v & 0xC00000) == 0) {
            v3 |= ((v2 & 0x40) != 0 || !composer1.changed(borderStroke0) ? 0x400000 : 0x800000);
        }
        if((v2 & 0x80) != 0) {
            v3 |= 0x6000000;
        }
        else if((v & 0x6000000) == 0) {
            v3 |= (composer1.changed(mutableInteractionSource0) ? 0x4000000 : 0x2000000);
        }
        if((v2 & 0x100) != 0) {
            v3 |= 0x30000000;
        }
        else if((v & 0x30000000) == 0) {
            v3 |= (composer1.changedInstance(function20) ? 0x20000000 : 0x10000000);
        }
        if((v2 & 0x200) == 0) {
            v4 = (v1 & 6) == 0 ? v1 | (composer1.changedInstance(function21) ? 4 : 2) : v1;
        }
        else {
            v4 = v1 | 6;
        }
        if((v3 & 306783379) != 306783378 || (v4 & 3) != 2 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v2 & 8) == 0 ? modifier0 : Modifier.Companion;
                if((v2 & 16) != 0) {
                    z2 = true;
                }
                if((v2 & 0x20) == 0) {
                    segmentedButtonColors3 = segmentedButtonColors0;
                }
                else {
                    segmentedButtonColors3 = SegmentedButtonDefaults.INSTANCE.colors(composer1, 6);
                    v3 &= 0xFFC7FFFF;
                }
                if((v2 & 0x40) == 0) {
                    borderStroke3 = borderStroke0;
                }
                else {
                    long v6 = segmentedButtonColors3.borderColor-WaAFU9c$material3_release(z2, z);
                    borderStroke3 = SegmentedButtonDefaults.borderStroke-l07J4OM$default(SegmentedButtonDefaults.INSTANCE, v6, 0.0f, 2, null);
                    v3 &= 0xFE3FFFFF;
                }
                MutableInteractionSource mutableInteractionSource3 = (v2 & 0x80) == 0 ? mutableInteractionSource0 : null;
                if((v2 & 0x100) == 0) {
                    v5 = v3;
                    function23 = function20;
                    mutableInteractionSource2 = mutableInteractionSource3;
                    modifier2 = modifier3;
                    segmentedButtonColors2 = segmentedButtonColors3;
                    borderStroke2 = borderStroke3;
                    z4 = z2;
                }
                else {
                    function23 = ComposableLambdaKt.rememberComposableLambda(970447394, true, new vj(z, 0), composer1, 54);
                    mutableInteractionSource2 = mutableInteractionSource3;
                    modifier2 = modifier3;
                    segmentedButtonColors2 = segmentedButtonColors3;
                    borderStroke2 = borderStroke3;
                    z4 = z2;
                    v5 = v3;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 0x20) != 0) {
                    v3 &= 0xFFC7FFFF;
                }
                if((v2 & 0x40) != 0) {
                    v3 &= 0xFE3FFFFF;
                }
                segmentedButtonColors2 = segmentedButtonColors0;
                borderStroke2 = borderStroke0;
                mutableInteractionSource2 = mutableInteractionSource0;
                v5 = v3;
                modifier2 = modifier0;
                z4 = z2;
                function23 = function20;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1596038053, v5, v4, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:139)");
            }
            composer1.startReplaceGroup(1788099965);
            if(mutableInteractionSource2 == null) {
                MutableInteractionSource mutableInteractionSource4 = composer1.rememberedValue();
                if(mutableInteractionSource4 == Composer.Companion.getEmpty()) {
                    mutableInteractionSource4 = InteractionSourceKt.MutableInteractionSource();
                    composer1.updateRememberedValue(mutableInteractionSource4);
                }
                mutableInteractionSource5 = mutableInteractionSource4;
            }
            else {
                mutableInteractionSource5 = mutableInteractionSource2;
            }
            composer1.endReplaceGroup();
            long v7 = segmentedButtonColors2.containerColor-WaAFU9c$material3_release(z4, z);
            long v8 = segmentedButtonColors2.contentColor-WaAFU9c$material3_release(z4, z);
            MutableIntState mutableIntState0 = SegmentedButtonKt.a(mutableInteractionSource5, composer1);
            SurfaceKt.Surface-d85dljk(z, function10, SizeKt.defaultMinSize-VpY3zN4(LayoutModifierKt.layout(RowScope.weight$default(multiChoiceSegmentedButtonRowScope0, modifier2, 1.0f, false, 2, null), new j(mutableIntState0, z, 1)), 58.0f, 40.0f), z4, shape0, v7, v8, 0.0f, 0.0f, borderStroke2, mutableInteractionSource5, ComposableLambdaKt.rememberComposableLambda(0x617EF585, true, new androidx.compose.material3.j(function23, function21, 4), composer1, 54), composer1, v5 >> 3 & 0x7E | v5 >> 6 & 0x1C00 | 0xE000 & v5 << 3 | v5 << 6 & 0x70000000, 0x30, 0x180);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            borderStroke1 = borderStroke2;
            mutableInteractionSource1 = mutableInteractionSource2;
            function22 = function23;
            segmentedButtonColors1 = segmentedButtonColors2;
            z3 = z4;
        }
        else {
            composer1.skipToGroupEnd();
            segmentedButtonColors1 = segmentedButtonColors0;
            mutableInteractionSource1 = mutableInteractionSource0;
            modifier1 = modifier0;
            z3 = z2;
            borderStroke1 = borderStroke0;
            function22 = function20;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new wj(multiChoiceSegmentedButtonRowScope0, z, function10, shape0, modifier1, z3, segmentedButtonColors1, borderStroke1, mutableInteractionSource1, function22, function21, v, v1, v2, 0));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_]]")
    public static final void SegmentedButton(@NotNull SingleChoiceSegmentedButtonRowScope singleChoiceSegmentedButtonRowScope0, boolean z, @NotNull Function0 function00, @NotNull Shape shape0, @Nullable Modifier modifier0, boolean z1, @Nullable SegmentedButtonColors segmentedButtonColors0, @Nullable BorderStroke borderStroke0, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Function2 function20, @NotNull Function2 function21, @Nullable Composer composer0, int v, int v1, int v2) {
        Function2 function22;
        BorderStroke borderStroke1;
        boolean z3;
        Modifier modifier1;
        MutableInteractionSource mutableInteractionSource1;
        SegmentedButtonColors segmentedButtonColors1;
        MutableInteractionSource mutableInteractionSource5;
        boolean z4;
        Modifier modifier2;
        Function2 function23;
        MutableInteractionSource mutableInteractionSource2;
        BorderStroke borderStroke2;
        SegmentedButtonColors segmentedButtonColors2;
        BorderStroke borderStroke3;
        SegmentedButtonColors segmentedButtonColors3;
        int v4;
        boolean z2;
        int v3;
        Composer composer1 = composer0.startRestartGroup(-1016574361);
        if((0x80000000 & v2) == 0) {
            v3 = (v & 6) == 0 ? (composer1.changed(singleChoiceSegmentedButtonRowScope0) ? 4 : 2) | v : v;
        }
        else {
            v3 = v | 6;
        }
        if((v2 & 1) != 0) {
            v3 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v3 |= (composer1.changed(z) ? 0x20 : 16);
        }
        if((v2 & 2) != 0) {
            v3 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v3 |= (composer1.changedInstance(function00) ? 0x100 : 0x80);
        }
        if((v2 & 4) != 0) {
            v3 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v3 |= (composer1.changed(shape0) ? 0x800 : 0x400);
        }
        if((v2 & 8) != 0) {
            v3 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v3 |= (composer1.changed(modifier0) ? 0x4000 : 0x2000);
        }
        if((v2 & 16) != 0) {
            v3 |= 0x30000;
            z2 = z1;
        }
        else if((0x30000 & v) == 0) {
            z2 = z1;
            v3 |= (composer1.changed(z2) ? 0x20000 : 0x10000);
        }
        else {
            z2 = z1;
        }
        if((v & 0x180000) == 0) {
            v3 |= ((v2 & 0x20) != 0 || !composer1.changed(segmentedButtonColors0) ? 0x80000 : 0x100000);
        }
        if((v & 0xC00000) == 0) {
            v3 |= ((v2 & 0x40) != 0 || !composer1.changed(borderStroke0) ? 0x400000 : 0x800000);
        }
        if((v2 & 0x80) != 0) {
            v3 |= 0x6000000;
        }
        else if((v & 0x6000000) == 0) {
            v3 |= (composer1.changed(mutableInteractionSource0) ? 0x4000000 : 0x2000000);
        }
        if((v2 & 0x100) != 0) {
            v3 |= 0x30000000;
        }
        else if((v & 0x30000000) == 0) {
            v3 |= (composer1.changedInstance(function20) ? 0x20000000 : 0x10000000);
        }
        if((v2 & 0x200) == 0) {
            v4 = (v1 & 6) == 0 ? v1 | (composer1.changedInstance(function21) ? 4 : 2) : v1;
        }
        else {
            v4 = v1 | 6;
        }
        if((v3 & 306783379) != 306783378 || (v4 & 3) != 2 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v2 & 8) == 0 ? modifier0 : Modifier.Companion;
                if((v2 & 16) != 0) {
                    z2 = true;
                }
                if((v2 & 0x20) == 0) {
                    segmentedButtonColors3 = segmentedButtonColors0;
                }
                else {
                    segmentedButtonColors3 = SegmentedButtonDefaults.INSTANCE.colors(composer1, 6);
                    v3 &= 0xFFC7FFFF;
                }
                if((v2 & 0x40) == 0) {
                    borderStroke3 = borderStroke0;
                }
                else {
                    long v5 = segmentedButtonColors3.borderColor-WaAFU9c$material3_release(z2, z);
                    borderStroke3 = SegmentedButtonDefaults.borderStroke-l07J4OM$default(SegmentedButtonDefaults.INSTANCE, v5, 0.0f, 2, null);
                    v3 &= 0xFE3FFFFF;
                }
                MutableInteractionSource mutableInteractionSource3 = (v2 & 0x80) == 0 ? mutableInteractionSource0 : null;
                if((v2 & 0x100) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource3;
                    modifier2 = modifier3;
                    segmentedButtonColors2 = segmentedButtonColors3;
                    borderStroke2 = borderStroke3;
                    z4 = z2;
                    function23 = function20;
                }
                else {
                    mutableInteractionSource2 = mutableInteractionSource3;
                    modifier2 = modifier3;
                    segmentedButtonColors2 = segmentedButtonColors3;
                    borderStroke2 = borderStroke3;
                    z4 = z2;
                    function23 = ComposableLambdaKt.rememberComposableLambda(0x499D9180, true, new vj(z, 1), composer1, 54);
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 0x20) != 0) {
                    v3 &= 0xFFC7FFFF;
                }
                if((v2 & 0x40) != 0) {
                    v3 &= 0xFE3FFFFF;
                }
                segmentedButtonColors2 = segmentedButtonColors0;
                borderStroke2 = borderStroke0;
                mutableInteractionSource2 = mutableInteractionSource0;
                function23 = function20;
                modifier2 = modifier0;
                z4 = z2;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1016574361, v3, v4, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:217)");
            }
            composer1.startReplaceGroup(0x6A95FB1D);
            if(mutableInteractionSource2 == null) {
                MutableInteractionSource mutableInteractionSource4 = composer1.rememberedValue();
                if(mutableInteractionSource4 == Composer.Companion.getEmpty()) {
                    mutableInteractionSource4 = InteractionSourceKt.MutableInteractionSource();
                    composer1.updateRememberedValue(mutableInteractionSource4);
                }
                mutableInteractionSource5 = mutableInteractionSource4;
            }
            else {
                mutableInteractionSource5 = mutableInteractionSource2;
            }
            composer1.endReplaceGroup();
            long v6 = segmentedButtonColors2.containerColor-WaAFU9c$material3_release(z4, z);
            long v7 = segmentedButtonColors2.contentColor-WaAFU9c$material3_release(z4, z);
            MutableIntState mutableIntState0 = SegmentedButtonKt.a(mutableInteractionSource5, composer1);
            SurfaceKt.Surface-d85dljk(z, function00, SemanticsModifierKt.semantics$default(SizeKt.defaultMinSize-VpY3zN4(LayoutModifierKt.layout(RowScope.weight$default(singleChoiceSegmentedButtonRowScope0, modifier2, 1.0f, false, 2, null), new j(mutableIntState0, z, 1)), 58.0f, 40.0f), false, xj.w, 1, null), z4, shape0, v6, v7, 0.0f, 0.0f, borderStroke2, mutableInteractionSource5, ComposableLambdaKt.rememberComposableLambda(383378045, true, new androidx.compose.material3.j(function23, function21, 5), composer1, 54), composer1, v3 >> 3 & 0x7E | v3 >> 6 & 0x1C00 | 0xE000 & v3 << 3 | v3 << 6 & 0x70000000, 0x30, 0x180);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function22 = function23;
            modifier1 = modifier2;
            borderStroke1 = borderStroke2;
            mutableInteractionSource1 = mutableInteractionSource2;
            segmentedButtonColors1 = segmentedButtonColors2;
            z3 = z4;
        }
        else {
            composer1.skipToGroupEnd();
            segmentedButtonColors1 = segmentedButtonColors0;
            mutableInteractionSource1 = mutableInteractionSource0;
            modifier1 = modifier0;
            z3 = z2;
            borderStroke1 = borderStroke0;
            function22 = function20;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new wj(singleChoiceSegmentedButtonRowScope0, z, function00, shape0, modifier1, z3, segmentedButtonColors1, borderStroke1, mutableInteractionSource1, function22, function21, v, v1, v2, 1));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void SingleChoiceSegmentedButtonRow-uFdPcIQ(@Nullable Modifier modifier0, float f, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1) {
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xA55976F6);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changed(f) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x100 : 0x80);
        }
        if((v2 & 0x93) != 0x92 || !composer1.getSkipping()) {
            if((v1 & 1) != 0) {
                modifier0 = Modifier.Companion;
            }
            if((v1 & 2) != 0) {
                f = 0.0f;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xA55976F6, v2, -1, "androidx.compose.material3.SingleChoiceSegmentedButtonRow (SegmentedButton.kt:268)");
            }
            Modifier modifier1 = IntrinsicKt.width(SizeKt.defaultMinSize-VpY3zN4$default(SelectableGroupKt.selectableGroup(modifier0), 0.0f, 0.0f, 1, null), IntrinsicSize.Min);
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.spacedBy-0680j_4(-f), Alignment.Companion.getCenterVertically(), composer1, 0x30);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function00);
            }
            else {
                composer1.useNode();
            }
            Function2 function20 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                a.t(v3, composer1, v3, function20);
            }
            Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
            RowScopeInstance rowScopeInstance0 = RowScopeInstance.INSTANCE;
            kk kk0 = composer1.rememberedValue();
            if(kk0 == Composer.Companion.getEmpty()) {
                kk0 = new kk(rowScopeInstance0);
                composer1.updateRememberedValue(kk0);
            }
            function30.invoke(kk0, composer1, ((int)(v2 >> 3 & 0x70 | 6)));
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new uj(modifier0, f, function30, v, v1, 1));
        }
    }

    public static final MutableIntState a(MutableInteractionSource mutableInteractionSource0, Composer composer0) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x10CD4D53, 0, -1, "androidx.compose.material3.interactionCountAsState (SegmentedButton.kt:396)");
        }
        MutableIntState mutableIntState0 = composer0.rememberedValue();
        androidx.compose.runtime.Composer.Companion composer$Companion0 = Composer.Companion;
        if(mutableIntState0 == composer$Companion0.getEmpty()) {
            mutableIntState0 = SnapshotIntStateKt.mutableIntStateOf(0);
            composer0.updateRememberedValue(mutableIntState0);
        }
        boolean z = composer0.changed(mutableInteractionSource0);
        ak ak0 = composer0.rememberedValue();
        if(z || ak0 == composer$Companion0.getEmpty()) {
            ak0 = new ak(mutableInteractionSource0, mutableIntState0, null);
            composer0.updateRememberedValue(ak0);
        }
        EffectsKt.LaunchedEffect(mutableInteractionSource0, ak0, composer0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableIntState0;
    }

    public static final void access$SegmentedButtonContent(Function2 function20, Function2 function21, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(1464121570);
        int v1 = (v & 6) == 0 ? (composer1.changedInstance(function20) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changedInstance(function21) ? 0x20 : 16);
        }
        if((v1 & 19) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1464121570, v1, -1, "androidx.compose.material3.SegmentedButtonContent (SegmentedButton.kt:324)");
            }
            Modifier modifier0 = PaddingKt.padding(Modifier.Companion, ButtonDefaults.INSTANCE.getTextButtonContentPadding());
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function00);
            }
            else {
                composer1.useNode();
            }
            Function2 function22 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                a.t(v2, composer1, v2, function22);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            TextKt.ProvideTextStyle(TypographyKt.getValue(OutlinedSegmentedButtonTokens.INSTANCE.getLabelTextFont(), composer1, 6), ComposableLambdaKt.rememberComposableLambda(0x54AC860B, true, new yj(function20, function21), composer1, 54), composer1, 0x30);
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new zj(function20, function21, v, 0));
        }
    }

    public static final float access$getIconSpacing$p() [...] // 潜在的解密器
}

