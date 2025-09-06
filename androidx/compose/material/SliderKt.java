package androidx.compose.material;

import androidx.annotation.IntRange;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.material3.al;
import androidx.compose.material3.m;
import androidx.compose.material3.vn;
import androidx.compose.material3.wk;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.util.MathHelpersKt;
import ce.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.FloatRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.b8;
import p0.c8;
import p0.d8;
import p0.f8;
import p0.g8;
import p0.h8;
import p0.k7;
import p0.m8;
import p0.o8;
import p0.s7;
import p0.t7;
import p0.t8;
import p0.y7;
import p0.z7;
import r0.a;

@Metadata(d1 = {"\u0000D\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u001A\u007F\u0010\u0013\u001A\u00020\u00032\u0006\u0010\u0001\u001A\u00020\u00002\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\u000E\b\u0002\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00000\t2\b\b\u0003\u0010\f\u001A\u00020\u000B2\u0010\b\u0002\u0010\u000E\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001A\u00020\u000F2\b\b\u0002\u0010\u0012\u001A\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001A\u0081\u0001\u0010\u0015\u001A\u00020\u00032\f\u0010\u0001\u001A\b\u0012\u0004\u0012\u00020\u00000\t2\u0018\u0010\u0004\u001A\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\t\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\u000E\b\u0002\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00000\t2\b\b\u0003\u0010\f\u001A\u00020\u000B2\u0010\b\u0002\u0010\u000E\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u0012\u001A\u00020\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\"\u001A\u0010\u001C\u001A\u00020\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001B\"\u001A\u0010\u001F\u001A\u00020\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001D\u0010\u0019\u001A\u0004\b\u001E\u0010\u001B¨\u0006 "}, d2 = {"", "value", "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "Lkotlin/ranges/ClosedFloatingPointRange;", "valueRange", "", "steps", "Lkotlin/Function0;", "onValueChangeFinished", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/material/SliderColors;", "colors", "Slider", "(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/SliderColors;Landroidx/compose/runtime/Composer;II)V", "RangeSlider", "(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material/SliderColors;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getThumbRadius", "()F", "ThumbRadius", "e", "getTrackHeight", "TrackHeight", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 11 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 12 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,1195:1\n25#2:1196\n36#2:1204\n25#2:1212\n25#2:1219\n36#2:1226\n456#2,8:1251\n464#2,3:1265\n467#2,3:1272\n456#2,8:1294\n464#2,3:1308\n467#2,3:1328\n456#2,8:1350\n464#2,3:1364\n25#2:1368\n467#2,3:1382\n1116#3,6:1197\n1116#3,6:1205\n1116#3,6:1213\n1116#3,6:1220\n1116#3,6:1227\n1116#3,6:1316\n1116#3,6:1322\n1116#3,6:1369\n1116#3,6:1375\n1116#3,6:1400\n1#4:1203\n92#5:1211\n92#5:1233\n92#5:1270\n88#5:1271\n92#5:1313\n88#5:1314\n88#5:1315\n68#6,6:1234\n74#6:1268\n78#6:1276\n68#6,6:1277\n74#6:1311\n78#6:1332\n68#6,6:1333\n74#6:1367\n78#6:1386\n79#7,11:1240\n92#7:1275\n79#7,11:1283\n92#7:1331\n79#7,11:1339\n92#7:1385\n3737#8,6:1259\n3737#8,6:1302\n3737#8,6:1358\n74#9:1269\n74#9:1312\n154#10:1381\n154#10:1407\n154#10:1408\n154#10:1409\n154#10:1410\n154#10:1411\n154#10:1412\n154#10:1413\n482#11,13:1387\n135#12:1406\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt\n*L\n158#1:1196\n163#1:1204\n305#1:1212\n306#1:1219\n310#1:1226\n592#1:1251,8\n592#1:1265,3\n592#1:1272,3\n636#1:1294,8\n636#1:1308,3\n636#1:1328,3\n696#1:1350,8\n696#1:1364,3\n700#1:1368\n696#1:1382,3\n158#1:1197,6\n163#1:1205,6\n305#1:1213,6\n306#1:1220,6\n310#1:1227,6\n664#1:1316,6\n675#1:1322,6\n700#1:1369,6\n701#1:1375,6\n844#1:1400,6\n169#1:1211\n317#1:1233\n602#1:1270\n603#1:1271\n646#1:1313\n647#1:1314\n648#1:1315\n592#1:1234,6\n592#1:1268\n592#1:1276\n636#1:1277,6\n636#1:1311\n636#1:1332\n696#1:1333,6\n696#1:1367\n696#1:1386\n592#1:1240,11\n592#1:1275\n636#1:1283,11\n636#1:1331\n696#1:1339,11\n696#1:1385\n592#1:1259,6\n636#1:1302,6\n696#1:1358,6\n596#1:1269\n640#1:1312\n727#1:1381\n1153#1:1407\n1154#1:1408\n1155#1:1409\n1156#1:1410\n1159#1:1411\n1160#1:1412\n1161#1:1413\n802#1:1387,13\n939#1:1406\n*E\n"})
public final class SliderKt {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final Modifier f;
    public static final TweenSpec g;

    static {
        SliderKt.a = 10.0f;
        SliderKt.b = 24.0f;
        SliderKt.c = 1.0f;
        SliderKt.d = 6.0f;
        SliderKt.e = 4.0f;
        SliderKt.f = SizeKt.heightIn-VpY3zN4$default(SizeKt.widthIn-VpY3zN4$default(Modifier.Companion, 144.0f, 0.0f, 2, null), 0.0f, 48.0f, 1, null);
        SliderKt.g = new TweenSpec(100, 0, null, 6, null);
    }

    @ExperimentalMaterialApi
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void RangeSlider(@NotNull ClosedFloatingPointRange closedFloatingPointRange0, @NotNull Function1 function10, @Nullable Modifier modifier0, boolean z, @Nullable ClosedFloatingPointRange closedFloatingPointRange1, @IntRange(from = 0L) int v, @Nullable Function0 function00, @Nullable SliderColors sliderColors0, @Nullable Composer composer0, int v1, int v2) {
        ClosedFloatingPointRange closedFloatingPointRange3;
        boolean z2;
        int v6;
        ClosedFloatingPointRange closedFloatingPointRange2;
        SliderColors sliderColors2;
        int v5;
        boolean z1;
        Modifier modifier2;
        Function0 function02;
        int v4;
        SliderColors sliderColors1;
        Function0 function01;
        Modifier modifier1;
        int v3;
        Composer composer1 = composer0.startRestartGroup(0xA33E880D);
        if((v2 & 1) == 0) {
            v3 = (v1 & 14) == 0 ? (composer1.changed(closedFloatingPointRange0) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x70) == 0) {
            v3 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
            modifier1 = modifier0;
        }
        else if((v1 & 0x380) == 0) {
            modifier1 = modifier0;
            v3 |= (composer1.changed(modifier1) ? 0x100 : 0x80);
        }
        else {
            modifier1 = modifier0;
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
        }
        else if((v1 & 0x1C00) == 0) {
            v3 |= (composer1.changed(z) ? 0x800 : 0x400);
        }
        if((0xE000 & v1) == 0) {
            v3 |= ((v2 & 16) != 0 || !composer1.changed(closedFloatingPointRange1) ? 0x2000 : 0x4000);
        }
        if((v2 & 0x20) != 0) {
            v3 |= 0x30000;
        }
        else if((0x70000 & v1) == 0) {
            v3 |= (composer1.changed(v) ? 0x20000 : 0x10000);
        }
        if((v2 & 0x40) == 0) {
            function01 = function00;
            if((v1 & 0x380000) == 0) {
                v3 |= (composer1.changedInstance(function01) ? 0x100000 : 0x80000);
            }
        }
        else {
            v3 |= 0x180000;
            function01 = function00;
        }
        if((v1 & 0x1C00000) == 0) {
            if((v2 & 0x80) == 0) {
                sliderColors1 = sliderColors0;
                v4 = composer1.changed(sliderColors1) ? 0x800000 : 0x400000;
            }
            else {
                sliderColors1 = sliderColors0;
                v4 = 0x400000;
            }
            v3 |= v4;
        }
        else {
            sliderColors1 = sliderColors0;
        }
        if((v3 & 0x16DB6DB) == 4793490 && composer1.getSkipping()) {
            composer1.skipToGroupEnd();
            function02 = function01;
            modifier2 = modifier1;
            z1 = z;
            v5 = v;
            sliderColors2 = sliderColors1;
            closedFloatingPointRange2 = closedFloatingPointRange1;
        }
        else {
            composer1.startDefaults();
            if((v1 & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v2 & 4) != 0) {
                    modifier1 = Modifier.Companion;
                }
                z2 = (v2 & 8) == 0 ? z : true;
                if((v2 & 16) == 0) {
                    closedFloatingPointRange3 = closedFloatingPointRange1;
                }
                else {
                    closedFloatingPointRange3 = e.rangeTo(0.0f, 1.0f);
                    v3 &= 0xFFFF1FFF;
                }
                v6 = (v2 & 0x20) == 0 ? v : 0;
                if((v2 & 0x40) != 0) {
                    function01 = null;
                }
                if((v2 & 0x80) != 0) {
                    v3 &= 0xFE3FFFFF;
                    sliderColors1 = SliderDefaults.INSTANCE.colors-q0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer1, 0, 6, 0x3FF);
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 16) != 0) {
                    v3 &= 0xFFFF1FFF;
                }
                if((v2 & 0x80) != 0) {
                    v3 &= 0xFE3FFFFF;
                }
                v6 = v;
                z2 = z;
                closedFloatingPointRange3 = closedFloatingPointRange1;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xA33E880D, v3, -1, "androidx.compose.material.RangeSlider (Slider.kt:303)");
            }
            composer1.startReplaceableGroup(0xE2A708A4);
            MutableInteractionSource mutableInteractionSource0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(mutableInteractionSource0 == composer$Companion0.getEmpty()) {
                mutableInteractionSource0 = InteractionSourceKt.MutableInteractionSource();
                composer1.updateRememberedValue(mutableInteractionSource0);
            }
            composer1.endReplaceableGroup();
            composer1.startReplaceableGroup(0xE2A708A4);
            MutableInteractionSource mutableInteractionSource1 = composer1.rememberedValue();
            if(mutableInteractionSource1 == composer$Companion0.getEmpty()) {
                mutableInteractionSource1 = InteractionSourceKt.MutableInteractionSource();
                composer1.updateRememberedValue(mutableInteractionSource1);
            }
            composer1.endReplaceableGroup();
            if(v6 < 0) {
                throw new IllegalArgumentException("steps should be >= 0");
            }
            State state0 = SnapshotStateKt.rememberUpdatedState(function10, composer1, v3 >> 3 & 14);
            composer1.startReplaceableGroup(0x44FAF204);
            boolean z3 = composer1.changed(v6);
            List list0 = composer1.rememberedValue();
            if(z3 || list0 == composer$Companion0.getEmpty()) {
                list0 = SliderKt.access$stepsToTickFractions(v6);
                composer1.updateRememberedValue(list0);
            }
            composer1.endReplaceableGroup();
            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.requiredSizeIn-qDBjuR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier1), 4.0f * SliderKt.a, SliderKt.a * 2.0f, 0.0f, 0.0f, 12, null), null, false, ComposableLambdaKt.composableLambda(composer1, 0x26E5BB63, true, new s7(closedFloatingPointRange3, closedFloatingPointRange0, state0, mutableInteractionSource0, mutableInteractionSource1, z2, v6, function01, list0, sliderColors1)), composer1, 0xC00, 6);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier1;
            v5 = v6;
            sliderColors2 = sliderColors1;
            closedFloatingPointRange2 = closedFloatingPointRange3;
            function02 = function01;
            z1 = z2;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new wk(closedFloatingPointRange0, function10, modifier2, z1, closedFloatingPointRange2, v5, function02, sliderColors2, v1, v2, 1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void Slider(float f, @NotNull Function1 function10, @Nullable Modifier modifier0, boolean z, @Nullable ClosedFloatingPointRange closedFloatingPointRange0, @IntRange(from = 0L) int v, @Nullable Function0 function00, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable SliderColors sliderColors0, @Nullable Composer composer0, int v1, int v2) {
        ClosedFloatingPointRange closedFloatingPointRange2;
        SliderColors sliderColors2;
        MutableInteractionSource mutableInteractionSource2;
        Function0 function02;
        SliderColors sliderColors1;
        Function0 function01;
        int v4;
        ClosedFloatingPointRange closedFloatingPointRange1;
        boolean z2;
        Modifier modifier2;
        MutableInteractionSource mutableInteractionSource1;
        boolean z1;
        Modifier modifier1;
        int v3;
        Composer composer1 = composer0.startRestartGroup(0x8B092424);
        if((v2 & 1) == 0) {
            v3 = (v1 & 14) == 0 ? (composer1.changed(f) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x70) == 0) {
            v3 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
            modifier1 = modifier0;
        }
        else if((v1 & 0x380) == 0) {
            modifier1 = modifier0;
            v3 |= (composer1.changed(modifier1) ? 0x100 : 0x80);
        }
        else {
            modifier1 = modifier0;
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
            z1 = z;
        }
        else if((v1 & 0x1C00) == 0) {
            z1 = z;
            v3 |= (composer1.changed(z1) ? 0x800 : 0x400);
        }
        else {
            z1 = z;
        }
        if((0xE000 & v1) == 0) {
            v3 |= ((v2 & 16) != 0 || !composer1.changed(closedFloatingPointRange0) ? 0x2000 : 0x4000);
        }
        if((v2 & 0x20) != 0) {
            v3 |= 0x30000;
        }
        else if((0x70000 & v1) == 0) {
            v3 |= (composer1.changed(v) ? 0x20000 : 0x10000);
        }
        if((v2 & 0x40) != 0) {
            v3 |= 0x180000;
        }
        else if((v1 & 0x380000) == 0) {
            v3 |= (composer1.changedInstance(function00) ? 0x100000 : 0x80000);
        }
        if((v2 & 0x80) != 0) {
            v3 |= 0xC00000;
        }
        else if((v1 & 0x1C00000) == 0) {
            v3 |= (composer1.changed(mutableInteractionSource0) ? 0x800000 : 0x400000);
        }
        if((v1 & 0xE000000) == 0) {
            v3 |= ((v2 & 0x100) != 0 || !composer1.changed(sliderColors0) ? 0x2000000 : 0x4000000);
        }
        if((v3 & 0xB6DB6DB) == 0x2492492 && composer1.getSkipping()) {
            composer1.skipToGroupEnd();
            mutableInteractionSource1 = mutableInteractionSource0;
            modifier2 = modifier1;
            z2 = z1;
            closedFloatingPointRange1 = closedFloatingPointRange0;
            v4 = v;
            function01 = function00;
            sliderColors1 = sliderColors0;
        }
        else {
            composer1.startDefaults();
            if((v1 & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v2 & 4) != 0) {
                    modifier1 = Modifier.Companion;
                }
                if((v2 & 8) != 0) {
                    z1 = true;
                }
                if((v2 & 16) == 0) {
                    closedFloatingPointRange2 = closedFloatingPointRange0;
                }
                else {
                    closedFloatingPointRange2 = e.rangeTo(0.0f, 1.0f);
                    v3 &= 0xFFFF1FFF;
                }
                v4 = (v2 & 0x20) == 0 ? v : 0;
                function02 = (v2 & 0x40) == 0 ? function00 : null;
                if((v2 & 0x80) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource0;
                }
                else {
                    composer1.startReplaceableGroup(0xE2A708A4);
                    MutableInteractionSource mutableInteractionSource3 = composer1.rememberedValue();
                    if(mutableInteractionSource3 == Composer.Companion.getEmpty()) {
                        mutableInteractionSource3 = InteractionSourceKt.MutableInteractionSource();
                        composer1.updateRememberedValue(mutableInteractionSource3);
                    }
                    composer1.endReplaceableGroup();
                    mutableInteractionSource2 = mutableInteractionSource3;
                }
                if((v2 & 0x100) == 0) {
                    sliderColors2 = sliderColors0;
                }
                else {
                    v3 &= 0xF1FFFFFF;
                    sliderColors2 = SliderDefaults.INSTANCE.colors-q0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer1, 0, 6, 0x3FF);
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 16) != 0) {
                    v3 &= 0xFFFF1FFF;
                }
                if((v2 & 0x100) != 0) {
                    v3 &= 0xF1FFFFFF;
                }
                v4 = v;
                function02 = function00;
                mutableInteractionSource2 = mutableInteractionSource0;
                sliderColors2 = sliderColors0;
                closedFloatingPointRange2 = closedFloatingPointRange0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x8B092424, v3, -1, "androidx.compose.material.Slider (Slider.kt:159)");
            }
            if(v4 < 0) {
                throw new IllegalArgumentException("steps should be >= 0");
            }
            State state0 = SnapshotStateKt.rememberUpdatedState(function10, composer1, v3 >> 3 & 14);
            composer1.startReplaceableGroup(0x44FAF204);
            boolean z3 = composer1.changed(v4);
            List list0 = composer1.rememberedValue();
            if(z3 || list0 == Composer.Companion.getEmpty()) {
                list0 = SliderKt.access$stepsToTickFractions(v4);
                composer1.updateRememberedValue(list0);
            }
            composer1.endReplaceableGroup();
            BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(SliderKt.c(SizeKt.requiredSizeIn-qDBjuR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier1), SliderKt.a * 2.0f, SliderKt.a * 2.0f, 0.0f, 0.0f, 12, null), f, z1, function10, function02, closedFloatingPointRange2, v4), z1, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composer1, 2085116814, true, new y7(closedFloatingPointRange2, f, mutableInteractionSource2, z1, list0, sliderColors2, state0, function02)), composer1, 0xC00, 6);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            closedFloatingPointRange1 = closedFloatingPointRange2;
            modifier2 = modifier1;
            function01 = function02;
            mutableInteractionSource1 = mutableInteractionSource2;
            sliderColors1 = sliderColors2;
            z2 = z1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new al(f, function10, modifier2, z2, closedFloatingPointRange1, v4, function01, mutableInteractionSource1, sliderColors1, v1, v2));
        }
    }

    public static final void a(BoxScope boxScope0, Modifier modifier0, float f, MutableInteractionSource mutableInteractionSource0, SliderColors sliderColors0, boolean z, float f1, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x19909AAA);
        int v1 = (v & 14) == 0 ? (composer1.changed(boxScope0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changed(f) ? 0x100 : 0x80);
        }
        if((v & 0x1C00) == 0) {
            v1 |= (composer1.changed(mutableInteractionSource0) ? 0x800 : 0x400);
        }
        if((0xE000 & v) == 0) {
            v1 |= (composer1.changed(sliderColors0) ? 0x4000 : 0x2000);
        }
        if((0x70000 & v) == 0) {
            v1 |= (composer1.changed(z) ? 0x20000 : 0x10000);
        }
        if((0x380000 & v) == 0) {
            v1 |= (composer1.changed(f1) ? 0x100000 : 0x80000);
        }
        if((0x2DB6DB & v1) != 0x92492 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x19909AAA, v1, -1, "androidx.compose.material.SliderThumb (Slider.kt:694)");
            }
            Modifier modifier1 = boxScope0.align(PaddingKt.padding-qDBjuR0$default(Modifier.Companion, f, 0.0f, 0.0f, 0.0f, 14, null), Alignment.Companion.getCenterStart());
            composer1.startReplaceableGroup(0x2BB5B5D7);
            MeasurePolicy measurePolicy0 = a.i(Alignment.Companion, false, composer1, 0, -1323940314);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
            Function3 function30 = LayoutKt.modifierMaterializerOf(modifier1);
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
            Function2 function20 = androidx.room.a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                androidx.room.a.t(v2, composer1, v2, function20);
            }
            a.w(0, function30, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
            composer1.startReplaceableGroup(0xE2A708A4);
            SnapshotStateList snapshotStateList0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(snapshotStateList0 == composer$Companion0.getEmpty()) {
                snapshotStateList0 = SnapshotStateKt.mutableStateListOf();
                composer1.updateRememberedValue(snapshotStateList0);
            }
            composer1.endReplaceableGroup();
            composer1.startReplaceableGroup(0x107DC38);
            boolean z1 = composer1.changed(mutableInteractionSource0);
            boolean z2 = composer1.changed(snapshotStateList0);
            b8 b80 = composer1.rememberedValue();
            if(z1 || z2 || b80 == composer$Companion0.getEmpty()) {
                b80 = new b8(mutableInteractionSource0, snapshotStateList0, null);
                composer1.updateRememberedValue(b80);
            }
            composer1.endReplaceableGroup();
            EffectsKt.LaunchedEffect(mutableInteractionSource0, b80, composer1, v1 >> 9 & 14 | 0x40);
            SpacerKt.Spacer(BackgroundKt.background-bw27NRU(ShadowKt.shadow-s4CzXII$default(HoverableKt.hoverable$default(IndicationKt.indication(SizeKt.size-VpY3zN4(modifier0, f1, f1), mutableInteractionSource0, RippleKt.rememberRipple-9IZ8Weo(false, SliderKt.b, 0L, composer1, 54, 4)), mutableInteractionSource0, false, 2, null), (z ? (snapshotStateList0.isEmpty() ? SliderKt.c : SliderKt.d) : 0.0f), RoundedCornerShapeKt.getCircleShape(), false, 0L, 0L, 24, null), ((Color)sliderColors0.thumbColor(z, composer1, v1 >> 15 & 14 | v1 >> 9 & 0x70).getValue()).unbox-impl(), RoundedCornerShapeKt.getCircleShape()), composer1, 0);
            composer1.endReplaceableGroup();
            composer1.endNode();
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new z7(boxScope0, modifier0, f, mutableInteractionSource0, sliderColors0, z, f1, v));
        }
    }

    public static final void access$CorrectValueSideEffect(Function1 function10, ClosedFloatingPointRange closedFloatingPointRange0, ClosedFloatingPointRange closedFloatingPointRange1, MutableState mutableState0, float f, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xD3A7FBC8);
        int v1 = (v & 14) == 0 ? (composer1.changedInstance(function10) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(closedFloatingPointRange0) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changed(closedFloatingPointRange1) ? 0x100 : 0x80);
        }
        if((v & 0x1C00) == 0) {
            v1 |= (composer1.changed(mutableState0) ? 0x800 : 0x400);
        }
        if((0xE000 & v) == 0) {
            v1 |= (composer1.changed(f) ? 0x4000 : 0x2000);
        }
        if((0xB6DB & v1) != 9362 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xD3A7FBC8, v1, -1, "androidx.compose.material.CorrectValueSideEffect (Slider.kt:842)");
            }
            composer1.startReplaceableGroup(0x107F0DA);
            boolean z = composer1.changed(closedFloatingPointRange0);
            boolean z1 = composer1.changedInstance(function10);
            boolean z2 = composer1.changed(f);
            boolean z3 = composer1.changed(mutableState0);
            boolean z4 = composer1.changed(closedFloatingPointRange1);
            k7 k70 = composer1.rememberedValue();
            if((z | z1 | z2 | z3 | z4) != 0 || k70 == Composer.Companion.getEmpty()) {
                k70 = new k7(closedFloatingPointRange0, function10, f, mutableState0, closedFloatingPointRange1);
                composer1.updateRememberedValue(k70);
            }
            composer1.endReplaceableGroup();
            EffectsKt.SideEffect(k70, composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new vn(function10, closedFloatingPointRange0, closedFloatingPointRange1, mutableState0, f, v));
        }
    }

    public static final void access$RangeSliderImpl(boolean z, float f, float f1, List list0, SliderColors sliderColors0, float f2, MutableInteractionSource mutableInteractionSource0, MutableInteractionSource mutableInteractionSource1, Modifier modifier0, Modifier modifier1, Modifier modifier2, Composer composer0, int v, int v1) {
        Composer composer1 = composer0.startRestartGroup(0xEF60639F);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xEF60639F, v, v1, "androidx.compose.material.RangeSliderImpl (Slider.kt:631)");
        }
        String s = Strings_androidKt.getString-4foXLRw(5, composer1, 6);
        String s1 = Strings_androidKt.getString-4foXLRw(6, composer1, 6);
        Modifier modifier3 = modifier0.then(SliderKt.f);
        composer1.startReplaceableGroup(0x2BB5B5D7);
        androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
        MeasurePolicy measurePolicy0 = a.i(alignment$Companion0, false, composer1, 0, -1323940314);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
        androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function00 = composeUiNode$Companion0.getConstructor();
        Function3 function30 = LayoutKt.modifierMaterializerOf(modifier3);
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
        Function2 function20 = androidx.room.a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
            androidx.room.a.t(v2, composer1, v2, function20);
        }
        a.w(0, function30, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
        Density density0 = (Density)composer1.consume(CompositionLocalsKt.getLocalDensity());
        float f3 = density0.toPx-0680j_4(SliderKt.e);
        float f4 = density0.toPx-0680j_4(SliderKt.a);
        float f5 = density0.toDp-u2uoSUM(f2);
        float f6 = SliderKt.a * 2.0f;
        Modifier modifier4 = SizeKt.fillMaxSize$default(BoxScopeInstance.INSTANCE.align(Modifier.Companion, alignment$Companion0.getCenterStart()), 0.0f, 1, null);
        androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
        BoxScopeInstance boxScopeInstance0 = BoxScopeInstance.INSTANCE;
        SliderKt.b(modifier4, sliderColors0, z, f, f1, list0, f4, f3, composer1, v >> 9 & 0x70 | 0x40000 | v << 6 & 0x380 | v << 6 & 0x1C00 | v << 6 & 0xE000);
        composer1.startReplaceableGroup(0x107D7F6);
        boolean z1 = composer1.changed(s);
        m m0 = composer1.rememberedValue();
        if(z1 || m0 == Composer.Companion.getEmpty()) {
            m0 = new m(s, 15);
            composer1.updateRememberedValue(m0);
        }
        composer1.endReplaceableGroup();
        int v3 = v << 15 & 0x70000;
        SliderKt.a(boxScopeInstance0, FocusableKt.focusable(SemanticsModifierKt.semantics(modifier$Companion0, true, m0), true, mutableInteractionSource0).then(modifier1), f5 * f, mutableInteractionSource0, sliderColors0, z, f6, composer1, 0x180006 | v >> 9 & 0x1C00 | v & 0xE000 | v3);
        composer1.startReplaceableGroup(0x107D970);
        boolean z2 = composer1.changed(s1);
        m m1 = composer1.rememberedValue();
        if(z2 || m1 == Composer.Companion.getEmpty()) {
            m1 = new m(s1, 16);
            composer1.updateRememberedValue(m1);
        }
        composer1.endReplaceableGroup();
        SliderKt.a(boxScopeInstance0, FocusableKt.focusable(SemanticsModifierKt.semantics(modifier$Companion0, true, m1), true, mutableInteractionSource1).then(modifier2), f5 * f1, mutableInteractionSource1, sliderColors0, z, f6, composer1, 0x180006 | v >> 12 & 0x1C00 | v & 0xE000 | v3);
        composer1.endReplaceableGroup();
        composer1.endNode();
        composer1.endReplaceableGroup();
        composer1.endReplaceableGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new t7(z, f, f1, list0, sliderColors0, f2, mutableInteractionSource0, mutableInteractionSource1, modifier0, modifier1, modifier2, v, v1));
        }
    }

    public static final void access$SliderImpl(boolean z, float f, List list0, SliderColors sliderColors0, float f1, MutableInteractionSource mutableInteractionSource0, Modifier modifier0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x641DECE1);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x641DECE1, v, -1, "androidx.compose.material.SliderImpl (Slider.kt:590)");
        }
        Modifier modifier1 = modifier0.then(SliderKt.f);
        composer1.startReplaceableGroup(0x2BB5B5D7);
        MeasurePolicy measurePolicy0 = a.i(Alignment.Companion, false, composer1, 0, -1323940314);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
        androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function00 = composeUiNode$Companion0.getConstructor();
        Function3 function30 = LayoutKt.modifierMaterializerOf(modifier1);
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
        Function2 function20 = androidx.room.a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v1)) {
            androidx.room.a.t(v1, composer1, v1, function20);
        }
        a.w(0, function30, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
        Density density0 = (Density)composer1.consume(CompositionLocalsKt.getLocalDensity());
        float f2 = density0.toPx-0680j_4(SliderKt.e);
        float f3 = density0.toPx-0680j_4(SliderKt.a);
        float f4 = density0.toDp-u2uoSUM(f1);
        SliderKt.b(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), sliderColors0, z, 0.0f, f, list0, f3, f2, composer1, v >> 6 & 0x70 | 0x40C06 | v << 6 & 0x380 | v << 9 & 0xE000);
        SliderKt.a(BoxScopeInstance.INSTANCE, Modifier.Companion, f4 * f, mutableInteractionSource0, sliderColors0, z, SliderKt.a * 2.0f, composer1, v >> 6 & 0x1C00 | 0x180036 | v << 3 & 0xE000 | v << 15 & 0x70000);
        composer1.endReplaceableGroup();
        composer1.endNode();
        composer1.endReplaceableGroup();
        composer1.endReplaceableGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new z7(z, f, list0, sliderColors0, f1, mutableInteractionSource0, modifier0, v));
        }
    }

    public static final Object access$animateToTarget(DraggableState draggableState0, float f, float f1, float f2, Continuation continuation0) {
        Unit unit0 = DraggableState.drag$default(draggableState0, null, new f8(f, f1, f2, null), continuation0, 1, null);
        return unit0 == qd.a.getCOROUTINE_SUSPENDED() ? unit0 : Unit.INSTANCE;
    }

    public static final Object access$awaitSlop-8vUncbI(AwaitPointerEventScope awaitPointerEventScope0, long v, int v1, Continuation continuation0) {
        g8 g80;
        if(continuation0 instanceof g8) {
            g80 = (g8)continuation0;
            int v2 = g80.q;
            if((v2 & 0x80000000) == 0) {
                g80 = new g8(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                g80.q = v2 ^ 0x80000000;
            }
        }
        else {
            g80 = new g8(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = g80.p;
        Pair pair0 = qd.a.getCOROUTINE_SUSPENDED();
        switch(g80.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                FloatRef ref$FloatRef0 = new FloatRef();
                h8 h80 = new h8(ref$FloatRef0);
                g80.o = ref$FloatRef0;
                g80.q = 1;
                Object object1 = DragGestureDetectorCopyKt.awaitHorizontalPointerSlopOrCancellation-gDDlDlE(awaitPointerEventScope0, v, v1, h80, g80);
                if(object1 != pair0) {
                    return ((PointerInputChange)object1) == null ? null : TuplesKt.to(((PointerInputChange)object1), Boxing.boxFloat(ref$FloatRef0.element));
                }
                return pair0;
            }
            case 1: {
                FloatRef ref$FloatRef1 = g80.o;
                ResultKt.throwOnFailure(object0);
                return ((PointerInputChange)object0) == null ? null : TuplesKt.to(((PointerInputChange)object0), Boxing.boxFloat(ref$FloatRef1.element));
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public static final float access$calcFraction(float f, float f1, float f2) {
        float f3 = f1 - f;
        return f3 == 0.0f ? c.coerceIn(0.0f, 0.0f, 1.0f) : c.coerceIn((f2 - f) / f3, 0.0f, 1.0f);
    }

    public static final Modifier access$rangeSliderPressDragModifier(Modifier modifier0, MutableInteractionSource mutableInteractionSource0, MutableInteractionSource mutableInteractionSource1, State state0, State state1, boolean z, boolean z1, float f, ClosedFloatingPointRange closedFloatingPointRange0, State state2, State state3) {
        if(z) {
            m8 m80 = new m8(mutableInteractionSource0, mutableInteractionSource1, state0, state1, state3, z1, f, state2, null);
            return SuspendingPointerInputFilterKt.pointerInput(modifier0, new Object[]{mutableInteractionSource0, mutableInteractionSource1, f, Boolean.valueOf(z1), closedFloatingPointRange0}, m80);
        }
        return modifier0;
    }

    public static final float access$scale(float f, float f1, float f2, float f3, float f4) {
        float f5 = f1 - f;
        return f5 == 0.0f ? MathHelpersKt.lerp(f3, f4, c.coerceIn(0.0f, 0.0f, 1.0f)) : MathHelpersKt.lerp(f3, f4, c.coerceIn((f2 - f) / f5, 0.0f, 1.0f));
    }

    public static final ClosedFloatingPointRange access$scale(float f, float f1, ClosedFloatingPointRange closedFloatingPointRange0, float f2, float f3) {
        float f4 = f1 - f;
        int v = Float.compare(f4, 0.0f);
        float f5 = MathHelpersKt.lerp(f2, f3, c.coerceIn((v == 0 ? 0.0f : (((Number)closedFloatingPointRange0.getStart()).floatValue() - f) / f4), 0.0f, 1.0f));
        return v == 0 ? e.rangeTo(f5, MathHelpersKt.lerp(f2, f3, c.coerceIn(0.0f, 0.0f, 1.0f))) : e.rangeTo(f5, MathHelpersKt.lerp(f2, f3, c.coerceIn((((Number)closedFloatingPointRange0.getEndInclusive()).floatValue() - f) / f4, 0.0f, 1.0f)));
    }

    // 去混淆评级： 低(30)
    public static final Modifier access$sliderTapModifier(Modifier modifier0, DraggableState draggableState0, MutableInteractionSource mutableInteractionSource0, float f, boolean z, State state0, State state1, MutableState mutableState0, boolean z1) {
        return ComposedModifierKt.composed(modifier0, InspectableValueKt.getNoInspectorInfo(), new t8(draggableState0, mutableInteractionSource0, f, z1, state0, state1, mutableState0, z));
    }

    public static final float access$snapValueToTick(float f, List list0, float f1, float f2) {
        if(list0.isEmpty()) {
            return f;
        }
        Object object0 = list0.get(0);
        float f3 = Math.abs(MathHelpersKt.lerp(f1, f2, ((Number)object0).floatValue()) - f);
        int v = CollectionsKt__CollectionsKt.getLastIndex(list0);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = list0.get(v1);
                float f4 = Math.abs(MathHelpersKt.lerp(f1, f2, ((Number)object1).floatValue()) - f);
                if(Float.compare(f3, f4) > 0) {
                    object0 = object1;
                    f3 = f4;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return ((Float)object0) == null ? f : MathHelpersKt.lerp(f1, f2, ((Float)object0).floatValue());
    }

    public static final List access$stepsToTickFractions(int v) {
        if(v == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList0 = new ArrayList(v + 2);
        for(int v1 = 0; v1 < v + 2; ++v1) {
            arrayList0.add(((float)(((float)v1) / ((float)(v + 1)))));
        }
        return arrayList0;
    }

    public static final void b(Modifier modifier0, SliderColors sliderColors0, boolean z, float f, float f1, List list0, float f2, float f3, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(1833126050);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1833126050, v, -1, "androidx.compose.material.Track (Slider.kt:742)");
        }
        int v1 = v >> 6 & 14 | 0x30 | v << 3 & 0x380;
        CanvasKt.Canvas(modifier0, new c8(f2, sliderColors0.trackColor(z, false, composer1, v1), f3, f1, f, sliderColors0.trackColor(z, true, composer1, v1), list0, sliderColors0.tickColor(z, false, composer1, v1), sliderColors0.tickColor(z, true, composer1, v1)), composer1, v & 14);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d8(modifier0, sliderColors0, z, f, f1, list0, f2, f3, v));
        }
    }

    public static final Modifier c(Modifier modifier0, float f, boolean z, Function1 function10, Function0 function00, ClosedFloatingPointRange closedFloatingPointRange0, int v) {
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(modifier0, false, new o8(z, closedFloatingPointRange0, v, c.coerceIn(f, ((Number)closedFloatingPointRange0.getStart()).floatValue(), ((Number)closedFloatingPointRange0.getEndInclusive()).floatValue()), function10, function00), 1, null), f, closedFloatingPointRange0, v);
    }

    public static final float getThumbRadius() [...] // 潜在的解密器

    public static final float getTrackHeight() {
        return SliderKt.e;
    }
}

