package com.kakao.kandinsky.designsystem.common;

import a5.b;
import aa.f0;
import android.util.Range;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.core.util.RangeKt;
import androidx.room.a;
import ca.h;
import ca.i1;
import ca.j1;
import ca.k1;
import ca.l1;
import ca.m1;
import ca.n1;
import ca.o1;
import ca.p1;
import ca.q1;
import ca.q;
import ca.r1;
import ca.s1;
import ca.s;
import com.kakao.kandinsky.designsystem.theme.Orientation;
import com.kakao.kandinsky.designsystem.theme.OrientationKt;
import com.kakao.kandinsky.designsystem.theme.ThemeKt;
import com.kakao.kandinsky.utils.NumberExtensionKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics.Kotlin;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zd.c;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A\u0096\u0001\u0010\u0015\u001A\u00020\u00072\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0012\u0010\b\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\t\u001A\u00020\u00042\u001F\b\u0002\u0010\r\u001A\u0019\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\u000E\u001A\u00020\u00022\b\b\u0002\u0010\u0010\u001A\u00020\u000F2\b\b\u0002\u0010\u0012\u001A\u00020\u00112\f\u0010\u0014\u001A\b\u0012\u0004\u0012\u00020\u00040\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001A9\u0010\u001A\u001A\u00020\u00072\b\b\u0002\u0010\u0001\u001A\u00020\u00002\u001E\b\u0002\u0010\u0019\u001A\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\u0018¢\u0006\u0002\b\fH\u0007¢\u0006\u0004\b\u001A\u0010\u001B¨\u0006#²\u0006\u000E\u0010\u001C\u001A\u00020\u00048\n@\nX\u008A\u008E\u0002²\u0006\f\u0010\u001D\u001A\u00020\u00048\nX\u008A\u0084\u0002²\u0006\u001A\u0010 \u001A\u0010\u0012\f\u0012\n \u001F*\u0004\u0018\u00010\u00040\u00040\u001E8\nX\u008A\u0084\u0002²\u0006\u000E\u0010!\u001A\u00020\u00048\n@\nX\u008A\u008E\u0002²\u0006\u000E\u0010\"\u001A\u00020\u00048\n@\nX\u008A\u008E\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "", "value", "Lkotlin/Function1;", "", "onValueChange", "defaultValue", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/ExtensionFunctionType;", "onDragStopped", "showNumber", "", "numberFormat", "", "roundAtDecimalPoint", "Lkotlin/ranges/ClosedFloatingPointRange;", "valueRange", "KDSlider", "(Landroidx/compose/ui/Modifier;ZFLkotlin/jvm/functions/Function1;FLkotlin/jvm/functions/Function2;ZLjava/lang/String;ILkotlin/ranges/ClosedFloatingPointRange;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/runtime/Composable;", "content", "SliderBoundBox", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "tickOffset", "termPerStep", "Landroid/util/Range;", "kotlin.jvm.PlatformType", "sliderRange", "sliderOffset", "tickValue", "designsystem_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nKDSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KDSlider.kt\ncom/kakao/kandinsky/designsystem/common/KDSliderKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 10 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 11 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 13 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,372:1\n1223#2,6:373\n1223#2,6:379\n1223#2,3:386\n1226#2,3:390\n1223#2,6:393\n1223#2,6:399\n1223#2,6:405\n1223#2,6:411\n1223#2,6:500\n77#3:385\n77#3:417\n77#3:459\n77#3:499\n1#4:389\n71#5:418\n68#5,6:419\n74#5:453\n78#5:457\n71#5:460\n69#5,5:461\n74#5:494\n78#5:498\n71#5:526\n69#5,5:527\n74#5:560\n78#5:564\n78#6,6:425\n85#6,4:440\n89#6,2:450\n93#6:456\n78#6,6:466\n85#6,4:481\n89#6,2:491\n93#6:497\n78#6,6:532\n85#6,4:547\n89#6,2:557\n93#6:563\n368#7,9:431\n377#7:452\n378#7,2:454\n368#7,9:472\n377#7:493\n378#7,2:495\n368#7,9:538\n377#7:559\n378#7,2:561\n4032#8,6:444\n4032#8,6:485\n4032#8,6:551\n148#9:458\n148#9:516\n148#9:521\n148#9:522\n148#9:523\n148#9:524\n148#9:525\n123#10,8:506\n132#10,3:518\n1864#11,2:514\n1866#11:517\n81#12:565\n107#12,2:566\n81#12:569\n76#13:568\n76#13:570\n109#13,2:571\n76#13:573\n109#13,2:574\n*S KotlinDebug\n*F\n+ 1 KDSlider.kt\ncom/kakao/kandinsky/designsystem/common/KDSliderKt\n*L\n43#1:373,6\n116#1:379,6\n119#1:386,3\n119#1:390,3\n126#1:393,6\n135#1:399,6\n136#1:405,6\n143#1:411,6\n248#1:500,6\n117#1:385\n144#1:417\n214#1:459\n233#1:499\n158#1:418\n158#1:419,6\n158#1:453\n158#1:457\n197#1:460\n197#1:461,5\n197#1:494\n197#1:498\n341#1:526\n341#1:527,5\n341#1:560\n341#1:564\n158#1:425,6\n158#1:440,4\n158#1:450,2\n158#1:456\n197#1:466,6\n197#1:481,4\n197#1:491,2\n197#1:497\n341#1:532,6\n341#1:547,4\n341#1:557,2\n341#1:563\n158#1:431,9\n158#1:452\n158#1:454,2\n197#1:472,9\n197#1:493\n197#1:495,2\n341#1:538,9\n341#1:559\n341#1:561,2\n158#1:444,6\n197#1:485,6\n341#1:551,6\n196#1:458\n305#1:516\n330#1:521\n331#1:522\n353#1:523\n355#1:524\n356#1:525\n284#1:506,8\n284#1:518,3\n285#1:514,2\n285#1:517\n43#1:565\n43#1:566,2\n126#1:569\n119#1:568\n135#1:570\n135#1:571,2\n143#1:573\n143#1:574,2\n*E\n"})
public final class KDSliderKt {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[Orientation.values().length];
            try {
                arr_v[Orientation.Portrait.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Orientation.Landscape.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void KDSlider(@Nullable Modifier modifier0, boolean z, float f, @NotNull Function1 function10, float f1, @Nullable Function2 function20, boolean z1, @Nullable String s, int v, @NotNull ClosedFloatingPointRange closedFloatingPointRange0, @Nullable Composer composer0, int v1, int v2) {
        String s1;
        float f2;
        Function2 function21;
        int v4;
        boolean z3;
        boolean z2;
        Modifier modifier1;
        Modifier modifier3;
        int v3;
        Intrinsics.checkNotNullParameter(function10, "onValueChange");
        Intrinsics.checkNotNullParameter(closedFloatingPointRange0, "valueRange");
        Composer composer1 = composer0.startRestartGroup(0xDAF9BFDD);
        if((v2 & 1) == 0) {
            v3 = (v1 & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x70) == 0) {
            v3 |= (composer1.changed(z) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v1 & 0x380) == 0) {
            v3 |= (composer1.changed(f) ? 0x100 : 0x80);
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
        }
        else if((v1 & 0x1C00) == 0) {
            v3 |= (composer1.changedInstance(function10) ? 0x800 : 0x400);
        }
        if((v2 & 16) != 0) {
            v3 |= 0x6000;
        }
        else if((0xE000 & v1) == 0) {
            v3 |= (composer1.changed(f1) ? 0x4000 : 0x2000);
        }
        if((v2 & 0x20) != 0) {
            v3 |= 0x30000;
        }
        else if((v1 & 0x70000) == 0) {
            v3 |= (composer1.changedInstance(function20) ? 0x20000 : 0x10000);
        }
        if((v2 & 0x40) != 0) {
            v3 |= 0x180000;
        }
        else if((v1 & 0x380000) == 0) {
            v3 |= (composer1.changed(z1) ? 0x100000 : 0x80000);
        }
        if((v2 & 0x80) != 0) {
            v3 |= 0xC00000;
        }
        else if((v1 & 0x1C00000) == 0) {
            v3 |= (composer1.changed(s) ? 0x800000 : 0x400000);
        }
        if((v2 & 0x100) != 0) {
            v3 |= 0x6000000;
        }
        else if((v1 & 0xE000000) == 0) {
            v3 |= (composer1.changed(v) ? 0x4000000 : 0x2000000);
        }
        if((v2 & 0x200) != 0) {
            v3 |= 0x30000000;
        }
        else if((v1 & 0x70000000) == 0) {
            v3 |= (composer1.changed(closedFloatingPointRange0) ? 0x20000000 : 0x10000000);
        }
        if((0x5B6DB6DB & v3) != 306783378 || !composer1.getSkipping()) {
            Modifier modifier2 = (v2 & 1) == 0 ? modifier0 : Modifier.Companion;
            boolean z4 = (v2 & 2) == 0 ? z : true;
            float f3 = (v2 & 16) == 0 ? f1 : 0.0f;
            Function2 function22 = (v2 & 0x20) == 0 ? function20 : i1.w;
            boolean z5 = (v2 & 0x40) == 0 ? z1 : true;
            String s2 = (v2 & 0x80) == 0 ? s : "%s°";
            int v5 = (v2 & 0x100) == 0 ? v : 0;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xDAF9BFDD, v3, -1, "com.kakao.kandinsky.designsystem.common.KDSlider (KDSlider.kt:111)");
            }
            if(z4) {
                composer1.startReplaceGroup(0xA5CDA0B8);
                composer1.startReplaceGroup(0xA5CDA0C8);
                TickSliderOptions tickSliderOptions0 = composer1.rememberedValue();
                Companion composer$Companion0 = Composer.Companion;
                if(tickSliderOptions0 == composer$Companion0.getEmpty()) {
                    tickSliderOptions0 = new TickSliderOptions(0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, 0L, 0L, 0L, 0L, 0.0f, 0.0f, 0L, 0L, 0x1FFFF, null);
                    composer1.updateRememberedValue(tickSliderOptions0);
                }
                composer1.endReplaceGroup();
                Density density0 = (Density)composer1.consume(CompositionLocalsKt.getLocalDensity());
                composer1.startReplaceGroup(0xA5CDA130);
                MutableFloatState mutableFloatState0 = composer1.rememberedValue();
                if(mutableFloatState0 == composer$Companion0.getEmpty()) {
                    mutableFloatState0 = PrimitiveSnapshotStateKt.mutableFloatStateOf(density0.toPx-0680j_4(tickSliderOptions0.getTermPerTick-D9Ej5fM()) / ((float)tickSliderOptions0.getDegreePerTick()));
                    composer1.updateRememberedValue(mutableFloatState0);
                }
                composer1.endReplaceGroup();
                composer1.startReplaceGroup(-1513250170);
                MutableState mutableState0 = composer1.rememberedValue();
                if((v3 & 0x70000000) == 0x20000000 || mutableState0 == composer$Companion0.getEmpty()) {
                    float f4 = ((Number)closedFloatingPointRange0.getStart()).floatValue();
                    Float float0 = (float)(mutableFloatState0.getFloatValue() * f4);
                    float f5 = ((Number)closedFloatingPointRange0.getEndInclusive()).floatValue();
                    mutableState0 = SnapshotStateKt.mutableStateOf$default(new Range(float0, ((float)(mutableFloatState0.getFloatValue() * f5))), null, 2, null);
                    composer1.updateRememberedValue(mutableState0);
                }
                composer1.endReplaceGroup();
                composer1.startReplaceGroup(0xA5CDA385);
                MutableFloatState mutableFloatState1 = composer1.rememberedValue();
                if(mutableFloatState1 == composer$Companion0.getEmpty()) {
                    mutableFloatState1 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                    composer1.updateRememberedValue(mutableFloatState1);
                }
                composer1.endReplaceGroup();
                Float float1 = f;
                composer1.startReplaceGroup(0xA5CDA3CF);
                j1 j10 = composer1.rememberedValue();
                if((((v3 & 0xE000000) == 0x4000000 ? 1 : 0) | ((v3 & 0x380) == 0x100 ? 1 : 0)) != 0 || j10 == composer$Companion0.getEmpty()) {
                    j10 = new j1(f, v5, mutableFloatState1, mutableFloatState0, null);
                    composer1.updateRememberedValue(j10);
                }
                composer1.endReplaceGroup();
                EffectsKt.LaunchedEffect(float1, j10, composer1, v3 >> 6 & 14 | 0x40);
                composer1.startReplaceGroup(0xA5CDA4B4);
                MutableFloatState mutableFloatState2 = composer1.rememberedValue();
                if(mutableFloatState2 == composer$Companion0.getEmpty()) {
                    mutableFloatState2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                    composer1.updateRememberedValue(mutableFloatState2);
                }
                composer1.endReplaceGroup();
                modifier3 = modifier2;
                DraggableState draggableState0 = DraggableKt.rememberDraggableState(new m1(tickSliderOptions0, ((HapticFeedback)composer1.consume(CompositionLocalsKt.getLocalHapticFeedback())), f, function10, mutableState0, mutableFloatState1, v5, mutableFloatState0, mutableFloatState2), composer1, 0);
                Modifier modifier4 = SizeKt.wrapContentSize$default(Modifier.Companion, null, false, 3, null);
                androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
                MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
                int v6 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
                Modifier modifier5 = ComposedModifierKt.materializeModifier(composer1, modifier4);
                androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
                Function2 function23 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
                if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v6)) {
                    a.t(v6, composer1, v6, function23);
                }
                Updater.set-impl(composer1, modifier5, composeUiNode$Companion0.getSetModifier());
                BoxScopeInstance boxScopeInstance0 = BoxScopeInstance.INSTANCE;
                KDSliderKt.SliderBoundBox(PointerInteropFilter_androidKt.pointerInteropFilter$default(boxScopeInstance0.align(modifier3, alignment$Companion0.getCenter()), null, q.A, 1, null), ComposableLambdaKt.rememberComposableLambda(0x4A19E99A, true, new k1(f3, f, draggableState0, true, tickSliderOptions0, closedFloatingPointRange0, function22, mutableFloatState0, mutableState0), composer1, 54), composer1, 0x30, 0);
                composer1.startReplaceGroup(-1513248205);
                if(z5) {
                    Comparable comparable0 = RangeKt.toRange(closedFloatingPointRange0).clamp(f);
                    Intrinsics.checkNotNullExpressionValue(comparable0, "clamp(...)");
                    KDSliderKt.a(boxScopeInstance0, ((Number)comparable0).floatValue(), s2, v5, composer1, v3 >> 15 & 0x380 | 6 | v3 >> 15 & 0x1C00);
                }
                composer1.endReplaceGroup();
                composer1.endNode();
                composer1.endReplaceGroup();
            }
            else {
                composer1.startReplaceGroup(0xA5CDA08E);
                KDSliderKt.SliderBoundBox(null, null, composer1, 0, 3);
                composer1.endReplaceGroup();
                modifier3 = modifier2;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier3;
            z2 = z4;
            f2 = f3;
            function21 = function22;
            z3 = z5;
            s1 = s2;
            v4 = v5;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z2 = z;
            z3 = z1;
            v4 = v;
            function21 = function20;
            f2 = f1;
            s1 = s;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new l1(modifier1, z2, f, function10, f2, function21, z3, s1, v4, closedFloatingPointRange0, v1, v2));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void SliderBoundBox(@Nullable Modifier modifier0, @Nullable Function3 function30, @Nullable Composer composer0, int v, int v1) {
        Alignment alignment0;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x26F185F8);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x20 : 16);
        }
        if((v2 & 91) != 18 || !composer1.getSkipping()) {
            if((v1 & 1) != 0) {
                modifier0 = Modifier.Companion;
            }
            if((v1 & 2) != 0) {
                function30 = ComposableSingletons.KDSliderKt.INSTANCE.getLambda-1$designsystem_release();
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x26F185F8, v2, -1, "com.kakao.kandinsky.designsystem.common.SliderBoundBox (KDSlider.kt:194)");
            }
            Modifier modifier1 = OrientationKt.byOrientation(modifier0, new r1(52.0f, 0), new r1(52.0f, 1));
            switch(WhenMappings.$EnumSwitchMapping$0[((Orientation)composer1.consume(OrientationKt.getLocalOrientation())).ordinal()]) {
                case 1: {
                    alignment0 = Alignment.Companion.getCenterEnd();
                    break;
                }
                case 2: {
                    alignment0 = Alignment.Companion.getBottomCenter();
                    break;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment0, false);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
            function30.invoke(BoxScopeInstance.INSTANCE, composer1, ((int)((v2 << 6 & 0x1C00) >> 6 & 0x70 | 6)));
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
            scopeUpdateScope0.updateScope(new s1(modifier0, function30, v, v1, 0));
        }
    }

    public static final void a(BoxScope boxScope0, float f, String s, int v, Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(0xA52FDCB3);
        int v2 = (v1 & 14) == 0 ? (composer1.changed(boxScope0) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.changed(f) ? 0x20 : 16);
        }
        if((v1 & 0x380) == 0) {
            v2 |= (composer1.changed(s) ? 0x100 : 0x80);
        }
        if((v1 & 0x1C00) == 0) {
            v2 |= (composer1.changed(v) ? 0x800 : 0x400);
        }
        if((v2 & 5851) != 1170 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xA52FDCB3, v2, -1, "com.kakao.kandinsky.designsystem.common.SliderNumber (KDSlider.kt:339)");
            }
            Modifier modifier0 = OrientationKt.byOrientation(boxScope0.align(Modifier.Companion, Alignment.Companion.getCenter()), s.I, s.J);
            MaterialTheme materialTheme0 = MaterialTheme.INSTANCE;
            int v3 = MaterialTheme.$stable;
            Modifier modifier1 = PaddingKt.padding-VpY3zN4$default(SizeKt.height-3ABfNKs(SizeKt.wrapContentSize(BackgroundKt.background-bw27NRU(modifier0, materialTheme0.getColorScheme(composer1, v3).getTertiaryContainer-0d7_KjU(), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(16.0f)), Alignment.Companion.getCenter(), true), 32.0f), 16.0f, 0.0f, 2, null);
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                a.t(v4, composer1, v4, function20);
            }
            Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
            Integer integer0 = v == 0 ? c.roundToInt(f) : NumberExtensionKt.round(f, v);
            String s1 = b.f(1, s, "format(...)", new Object[]{integer0.toString()});
            TextStyle textStyle0 = TextStyle.copy-p1EtxEg$default(materialTheme0.getTypography(composer1, v3).getBodySmall(), 0L, 0L, FontWeight.Companion.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFB, null);
            TextKt.Text--4IGK_g(s1, null, materialTheme0.getColorScheme(composer1, v3).getOnTertiaryContainer-0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle0, composer1, 0, 0, 0xFFFA);
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
            scopeUpdateScope0.updateScope(new f0(boxScope0, f, s, v, v1, 1));
        }
    }

    public static final float access$KDSlider$lambda$10(MutableFloatState mutableFloatState0) {
        return mutableFloatState0.getFloatValue();
    }

    public static final void access$KDSlider$lambda$11(MutableFloatState mutableFloatState0, float f) {
        mutableFloatState0.setFloatValue(f);
    }

    public static final float access$KDSlider$lambda$14(MutableFloatState mutableFloatState0) {
        return mutableFloatState0.getFloatValue();
    }

    public static final void access$KDSlider$lambda$15(MutableFloatState mutableFloatState0, float f) {
        mutableFloatState0.setFloatValue(f);
    }

    public static final Range access$KDSlider$lambda$8(MutableState mutableState0) {
        return (Range)mutableState0.getValue();
    }

    public static final float access$KDSlider$offsetToValue(float f, int v, MutableFloatState mutableFloatState0) {
        return NumberExtensionKt.round(f / mutableFloatState0.getFloatValue(), v);
    }

    public static final float access$KDSlider$valueToOffset(float f, MutableFloatState mutableFloatState0) {
        return mutableFloatState0.getFloatValue() * f;
    }

    public static final void access$PreviewSlider(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xCD01BD95);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xCD01BD95, v, -1, "com.kakao.kandinsky.designsystem.common.PreviewSlider (KDSlider.kt:41)");
            }
            composer1.startReplaceGroup(0xA0D9E42);
            MutableState mutableState0 = composer1.rememberedValue();
            if(mutableState0 == Composer.Companion.getEmpty()) {
                mutableState0 = SnapshotStateKt.mutableStateOf$default(100.0f, null, 2, null);
                composer1.updateRememberedValue(mutableState0);
            }
            composer1.endReplaceGroup();
            ThemeKt.KandinskyTheme(ComposableLambdaKt.rememberComposableLambda(0x748FA6EF, true, new n1(mutableState0), composer1, 54), composer1, 6);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h(v, 2));
        }
    }

    public static final float access$PreviewSlider$lambda$1(MutableState mutableState0) {
        return ((Number)mutableState0.getValue()).floatValue();
    }

    public static final void access$PreviewSlider$lambda$2(MutableState mutableState0, float f) {
        mutableState0.setValue(f);
    }

    public static final void access$Slider(DraggableState draggableState0, boolean z, TickSliderOptions tickSliderOptions0, boolean z1, float f, Range range0, ClosedFloatingPointRange closedFloatingPointRange0, Function2 function20, Composer composer0, int v) {
        androidx.compose.foundation.gestures.Orientation orientation0;
        Composer composer1 = composer0.startRestartGroup(1172130711);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1172130711, v, -1, "com.kakao.kandinsky.designsystem.common.Slider (KDSlider.kt:231)");
        }
        Object object0 = composer1.consume(OrientationKt.getLocalOrientation());
        Modifier modifier0 = OrientationKt.byOrientation(Modifier.Companion, s.G, s.H);
        switch(WhenMappings.$EnumSwitchMapping$0[((Orientation)object0).ordinal()]) {
            case 1: {
                orientation0 = androidx.compose.foundation.gestures.Orientation.Horizontal;
                break;
            }
            case 2: {
                orientation0 = androidx.compose.foundation.gestures.Orientation.Vertical;
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        composer1.startReplaceGroup(0x74F24BD0);
        boolean z2 = (0x1C00000 & v ^ 0xC00000) > 0x800000 && composer1.changed(function20) || (0xC00000 & v) == 0x800000;
        o1 o10 = composer1.rememberedValue();
        if(z2 || o10 == Composer.Companion.getEmpty()) {
            o10 = new o1(3, function20, Kotlin.class, "suspendConversion1", "Slider$suspendConversion1(Lkotlin/jvm/functions/Function2;Lkotlinx/coroutines/CoroutineScope;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);  // 初始化器: Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
            composer1.updateRememberedValue(o10);
        }
        composer1.endReplaceGroup();
        CanvasKt.Canvas(DraggableKt.draggable$default(modifier0, draggableState0, orientation0, z, null, false, null, o10, ((Orientation)object0) == Orientation.Portrait, 56, null), new p1(((Orientation)object0), closedFloatingPointRange0, f, range0, tickSliderOptions0, z1), composer1, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new q1(draggableState0, z, tickSliderOptions0, z1, f, range0, closedFloatingPointRange0, function20, v));
        }
    }

    public static final Object access$Slider$suspendConversion1(Function2 function20, CoroutineScope coroutineScope0, float f, Continuation continuation0) {
        function20.invoke(coroutineScope0, Boxing.boxFloat(f));
        return Unit.INSTANCE;
    }

    public static final void access$SliderNumber(BoxScope boxScope0, float f, String s, int v, Composer composer0, int v1) {
        KDSliderKt.a(boxScope0, f, s, v, composer0, v1);
    }

    public static final void access$drawCenterTick(DrawScope drawScope0, boolean z, TickSliderOptions tickSliderOptions0) {
        float f = Size.getWidth-impl(drawScope0.getDrawContext().getSize-NH-jbRc());
        float f1 = drawScope0.toPx-0680j_4(tickSliderOptions0.getCenterTickWidth-D9Ej5fM());
        float f2 = drawScope0.toPx-0680j_4(tickSliderOptions0.getCenterTickHeight-D9Ej5fM());
        DrawScope.drawRoundRect-u-Aw5IA$default(drawScope0, (z ? tickSliderOptions0.getChangedCenterTickColor-0d7_KjU() : tickSliderOptions0.getUnchangedCenterTickColor-0d7_KjU()), OffsetKt.Offset(f / 2.0f - f1 / 2.0f, -f2 / 2.0f), androidx.compose.ui.geometry.SizeKt.Size(drawScope0.toPx-0680j_4(2.0f), f2), CornerRadiusKt.CornerRadius(drawScope0.toPx-0680j_4(1.0f), drawScope0.toPx-0680j_4(1.0f)), null, 0.0f, null, 0, 0xF0, null);
    }

    public static final void access$drawSlider(DrawScope drawScope0, float f, Range range0, List list0, TickSliderOptions tickSliderOptions0) {
        Triple triple0;
        float f1 = Size.getWidth-impl(drawScope0.getDrawContext().getSize-NH-jbRc());
        Comparable comparable0 = range0.getLower();
        Intrinsics.checkNotNullExpressionValue(comparable0, "getLower(...)");
        float f2 = ((Number)comparable0).floatValue() + f1 / 2.0f - f;
        drawScope0.getDrawContext().getTransform().translate(f2, 0.0f);
        try {
            int v1 = 0;
            for(Object object0: list0) {
                if(v1 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                int v2 = ((Number)object0).intValue();
                if(v1 == 0 || v1 == CollectionsKt__CollectionsKt.getLastIndex(list0)) {
                    triple0 = new Triple(Color.box-impl(tickSliderOptions0.getCenterTickColor-0d7_KjU()), Dp.box-impl(tickSliderOptions0.getSideTickWidth-D9Ej5fM()), Dp.box-impl(tickSliderOptions0.getSideTickHeight-D9Ej5fM()));
                }
                else if(v2 == 0) {
                    triple0 = new Triple(Color.box-impl(tickSliderOptions0.getCenterTickColor-0d7_KjU()), Dp.box-impl(tickSliderOptions0.getCenterTickWidth-D9Ej5fM()), Dp.box-impl(tickSliderOptions0.getCenterTickHeight-D9Ej5fM()));
                }
                else if(v2 % 10 == 0) {
                    triple0 = new Triple(Color.box-impl(tickSliderOptions0.getAccentTickColor-0d7_KjU()), Dp.box-impl(tickSliderOptions0.getTickWidth-D9Ej5fM()), Dp.box-impl(tickSliderOptions0.getTickHeight-D9Ej5fM()));
                }
                else {
                    triple0 = new Triple(Color.box-impl(tickSliderOptions0.getTickColor-0d7_KjU()), Dp.box-impl(tickSliderOptions0.getTickWidth-D9Ej5fM()), Dp.box-impl(tickSliderOptions0.getTickHeight-D9Ej5fM()));
                }
                float f3 = ((Dp)triple0.component2()).unbox-impl();
                float f4 = ((Dp)triple0.component3()).unbox-impl();
                DrawScope.drawRoundRect-u-Aw5IA$default(drawScope0, ((Color)triple0.component1()).unbox-impl(), OffsetKt.Offset(drawScope0.toPx-0680j_4(tickSliderOptions0.getTermPerTick-D9Ej5fM()) * ((float)v1) - drawScope0.toPx-0680j_4(f3) / 2.0f, -drawScope0.toPx-0680j_4(f4) / 2.0f), androidx.compose.ui.geometry.SizeKt.Size(drawScope0.toPx-0680j_4(f3), drawScope0.toPx-0680j_4(f4)), CornerRadiusKt.CornerRadius(drawScope0.toPx-0680j_4(1.0f), drawScope0.toPx-0680j_4(1.0f)), null, 0.0f, null, 0, 0xF0, null);
                ++v1;
            }
        }
        finally {
            drawScope0.getDrawContext().getTransform().translate(-f2, -0.0f);
        }
    }
}

