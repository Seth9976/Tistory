package androidx.compose.material3;

import a5.b;
import aa.l;
import aa.x;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material3.internal.MappedInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.room.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zd.c;

@Metadata(d1 = {"\u0000N\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\u001AÍ\u0001\u0010\u001F\u001A\u00020\u00032\u0006\u0010\u0001\u001A\u00020\u00002\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\u0011\u0010\u0006\u001A\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00052\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\u000B2\u0006\u0010\u000F\u001A\u00020\u000B2\u0006\u0010\u0010\u001A\u00020\u000B2\u0006\u0010\u0011\u001A\u00020\u000B2\u0006\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0016\u001A\u00020\u00002\u0013\u0010\u0017\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00052\u0013\u0010\u0018\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00052\u0006\u0010\u001A\u001A\u00020\u00192\u0006\u0010\u001C\u001A\u00020\u001BH\u0001ø\u0001\u0000¢\u0006\u0004\b\u001D\u0010\u001E\"\u001A\u0010$\u001A\u00020\u000B8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001A\u0004\b\"\u0010#\"\u001A\u0010\'\u001A\u00020\u000B8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010!\u001A\u0004\b&\u0010#\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006*²\u0006\u000E\u0010)\u001A\u00020(8\n@\nX\u008A\u008E\u0002"}, d2 = {"", "selected", "Lkotlin/Function0;", "", "onClick", "Landroidx/compose/runtime/Composable;", "icon", "Landroidx/compose/ui/text/TextStyle;", "labelTextStyle", "Landroidx/compose/ui/graphics/Shape;", "indicatorShape", "Landroidx/compose/ui/unit/Dp;", "indicatorWidth", "indicatorHorizontalPadding", "indicatorVerticalPadding", "indicatorToLabelVerticalPadding", "startIconToLabelHorizontalPadding", "topIconItemVerticalPadding", "Landroidx/compose/material3/NavigationItemColors;", "colors", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "label", "badge", "Landroidx/compose/material3/NavigationItemIconPosition;", "iconPosition", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "NavigationItem-SHbi2eg", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/graphics/Shape;FFFFFFLandroidx/compose/material3/NavigationItemColors;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "NavigationItem", "a", "F", "getNavigationItemMinWidth", "()F", "NavigationItemMinWidth", "b", "getNavigationItemMinHeight", "NavigationItemMinHeight", "", "itemWidth", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNavigationItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationItem.kt\nandroidx/compose/material3/NavigationItemKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 9 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,731:1\n1223#2,6:732\n1223#2,6:738\n1223#2,6:777\n1223#2,6:783\n1223#2,6:824\n71#3,3:744\n74#3:775\n78#3:792\n71#3:830\n68#3,6:831\n74#3:865\n78#3:869\n71#3:870\n68#3,6:871\n74#3:905\n78#3:909\n78#4,6:747\n85#4,4:762\n89#4,2:772\n93#4:791\n78#4:793\n76#4,8:794\n85#4,4:811\n89#4,2:821\n78#4,6:837\n85#4,4:852\n89#4,2:862\n93#4:868\n78#4,6:877\n85#4,4:892\n89#4,2:902\n93#4:908\n93#4:912\n368#5,9:753\n377#5:774\n378#5,2:789\n368#5,9:802\n377#5:823\n368#5,9:843\n377#5:864\n378#5,2:866\n368#5,9:883\n377#5:904\n378#5,2:906\n378#5,2:910\n4032#6,6:766\n4032#6,6:815\n4032#6,6:856\n4032#6,6:896\n77#7:776\n50#8:913\n50#8:914\n75#9:915\n108#9,2:916\n148#10:918\n*S KotlinDebug\n*F\n+ 1 NavigationItem.kt\nandroidx/compose/material3/NavigationItemKt\n*L\n282#1:732,6\n295#1:738,6\n319#1:777,6\n331#1:783,6\n370#1:824,6\n284#1:744,3\n284#1:775\n284#1:792\n376#1:830\n376#1:831,6\n376#1:865\n376#1:869\n378#1:870\n378#1:871,6\n378#1:905\n378#1:909\n284#1:747,6\n284#1:762,4\n284#1:772,2\n284#1:791\n357#1:793\n357#1:794,8\n357#1:811,4\n357#1:821,2\n376#1:837,6\n376#1:852,4\n376#1:862,2\n376#1:868\n378#1:877,6\n378#1:892,4\n378#1:902,2\n378#1:908\n357#1:912\n284#1:753,9\n284#1:774\n284#1:789,2\n357#1:802,9\n357#1:823\n376#1:843,9\n376#1:864\n376#1:866,2\n378#1:883,9\n378#1:904\n378#1:906,2\n357#1:910,2\n284#1:766,6\n357#1:815,6\n376#1:856,6\n378#1:896,6\n311#1:776\n657#1:913\n666#1:914\n282#1:915\n282#1:916,2\n730#1:918\n*E\n"})
public final class NavigationItemKt {
    public static final float a;
    public static final float b;
    public static final float c;

    static {
        NavigationItemKt.a = 0.0f;
        NavigationItemKt.b = 0.0f;
        NavigationItemKt.c = 12.0f;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void NavigationItem-SHbi2eg(boolean z, @NotNull Function0 function00, @NotNull Function2 function20, @NotNull TextStyle textStyle0, @NotNull Shape shape0, float f, float f1, float f2, float f3, float f4, float f5, @NotNull NavigationItemColors navigationItemColors0, @NotNull Modifier modifier0, boolean z1, @Nullable Function2 function21, @Nullable Function2 function22, int v, @NotNull MutableInteractionSource mutableInteractionSource0, @Nullable Composer composer0, int v1, int v2) {
        MappedInteractionSource mappedInteractionSource1;
        Composer composer1 = composer0.startRestartGroup(0x20A982B4);
        int v3 = (v1 & 6) == 0 ? (composer1.changed(z) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v3 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        int v4 = 0x80;
        if((v1 & 0x180) == 0) {
            v3 |= (composer1.changedInstance(function20) ? 0x100 : 0x80);
        }
        int v5 = 0x400;
        if((v1 & 0xC00) == 0) {
            v3 |= (composer1.changed(textStyle0) ? 0x800 : 0x400);
        }
        int v6 = 0x2000;
        if((v1 & 0x6000) == 0) {
            v3 |= (composer1.changed(shape0) ? 0x4000 : 0x2000);
        }
        int v7 = 0x10000;
        if((v1 & 0x30000) == 0) {
            v3 |= (composer1.changed(f) ? 0x20000 : 0x10000);
        }
        int v8 = 0x80000;
        if((v1 & 0x180000) == 0) {
            v3 |= (composer1.changed(f1) ? 0x100000 : 0x80000);
        }
        int v9 = 0x400000;
        if((v1 & 0xC00000) == 0) {
            v3 |= (composer1.changed(f2) ? 0x800000 : 0x400000);
        }
        if((v1 & 0x6000000) == 0) {
            v3 |= (composer1.changed(f3) ? 0x4000000 : 0x2000000);
        }
        if((v1 & 0x30000000) == 0) {
            v3 |= (composer1.changed(f4) ? 0x20000000 : 0x10000000);
        }
        int v10 = (v2 & 6) == 0 ? v2 | (composer1.changed(f5) ? 4 : 2) : v2;
        if((v2 & 0x30) == 0) {
            v10 |= (composer1.changed(navigationItemColors0) ? 0x20 : 16);
        }
        if((v2 & 0x180) == 0) {
            if(composer1.changed(modifier0)) {
                v4 = 0x100;
            }
            v10 |= v4;
        }
        if((v2 & 0xC00) == 0) {
            if(composer1.changed(z1)) {
                v5 = 0x800;
            }
            v10 |= v5;
        }
        if((v2 & 0x6000) == 0) {
            if(composer1.changedInstance(function21)) {
                v6 = 0x4000;
            }
            v10 |= v6;
        }
        if((v2 & 0x30000) == 0) {
            if(composer1.changedInstance(function22)) {
                v7 = 0x20000;
            }
            v10 |= v7;
        }
        if((v2 & 0x180000) == 0) {
            if(composer1.changed(v)) {
                v8 = 0x100000;
            }
            v10 |= v8;
        }
        if((v2 & 0xC00000) == 0) {
            if(composer1.changed(mutableInteractionSource0)) {
                v9 = 0x800000;
            }
            v10 |= v9;
        }
        if((v3 & 306783379) != 306783378 || (0x492493 & v10) != 4793490 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x20A982B4, v3, v10, "androidx.compose.material3.NavigationItem (NavigationItem.kt:252)");
            }
            ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(0xFD5B955A, true, new dg(navigationItemColors0, z, z1, function21, function20), composer1, 54);
            composer1.startReplaceGroup(0x988FDD70);
            if(function22 != null) {
                composableLambda0 = ComposableLambdaKt.rememberComposableLambda(0x6D71F51B, true, new x(6, function22, composableLambda0), composer1, 54);
            }
            composer1.endReplaceGroup();
            composer1.startReplaceGroup(0x988FF73C);
            ComposableLambda composableLambda1 = function21 == null ? null : ComposableLambdaKt.rememberComposableLambda(-254668050, true, new wg(navigationItemColors0, z, z1, textStyle0, function21), composer1, 54);
            composer1.endReplaceGroup();
            MutableIntState mutableIntState0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(mutableIntState0 == composer$Companion0.getEmpty()) {
                mutableIntState0 = SnapshotIntStateKt.mutableIntStateOf(0);
                composer1.updateRememberedValue(mutableIntState0);
            }
            Modifier modifier1 = SizeKt.defaultMinSize-VpY3zN4(SelectableKt.selectable-O2vRcR0(modifier0, z, mutableInteractionSource0, null, z1, Role.box-impl(4), function00), NavigationItemKt.a, NavigationItemKt.b);
            me me0 = composer1.rememberedValue();
            if(me0 == composer$Companion0.getEmpty()) {
                me0 = new me(mutableIntState0, 1);
                composer1.updateRememberedValue(me0);
            }
            Modifier modifier2 = OnRemeasuredModifierKt.onSizeChanged(modifier1, me0);
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), true);
            int v11 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function01 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function01);
            }
            else {
                composer1.useNode();
            }
            Function2 function23 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v11)) {
                a.t(v11, composer1, v11, function23);
            }
            Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
            State state0 = AnimateAsStateKt.animateFloatAsState((z ? 1.0f : 0.0f), AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, null, null, composer1, 0x30, 28);
            composer1.startReplaceGroup(-1634400795);
            if(NavigationItemIconPosition.equals-impl0(v, 0)) {
                Density density0 = (Density)composer1.consume(CompositionLocalsKt.getLocalDensity());
                long v12 = OffsetKt.Offset(((float)(mutableIntState0.getIntValue() - density0.roundToPx-0680j_4(f))) / 2.0f, density0.toPx-0680j_4(NavigationItemKt.c));
                boolean z2 = composer1.changed(v12);
                MappedInteractionSource mappedInteractionSource0 = composer1.rememberedValue();
                if(z2 || (v10 & 0x1C00000) == 0x800000 || mappedInteractionSource0 == composer$Companion0.getEmpty()) {
                    mappedInteractionSource0 = new MappedInteractionSource(mutableInteractionSource0, v12, null);
                    composer1.updateRememberedValue(mappedInteractionSource0);
                }
                mappedInteractionSource1 = mappedInteractionSource0;
            }
            else {
                mappedInteractionSource1 = null;
            }
            composer1.endReplaceGroup();
            MutableInteractionSource mutableInteractionSource1 = mappedInteractionSource1 == null ? mutableInteractionSource0 : mappedInteractionSource1;
            long v13 = navigationItemColors0.getSelectedIndicatorColor-0d7_KjU();
            boolean z3 = composer1.changed(state0);
            l l0 = composer1.rememberedValue();
            if(z3 || l0 == composer$Companion0.getEmpty()) {
                l0 = new l(state0, 5);
                composer1.updateRememberedValue(l0);
            }
            NavigationItemKt.a(mutableInteractionSource1, v13, shape0, composableLambda0, v, composableLambda1, l0, f1, f2, f3, f4, f5, composer1, v3 >> 6 & 0x380 | v10 >> 6 & 0xE000 | 0x1C00000 & v3 << 3 | 0xE000000 & v3 << 3 | v3 << 3 & 0x70000000, v3 >> 27 & 14 | v10 << 3 & 0x70);
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
            scopeUpdateScope0.updateScope(new bg(z, function00, function20, textStyle0, shape0, f, f1, f2, f3, f4, f5, navigationItemColors0, modifier0, z1, function21, function22, v, mutableInteractionSource0, v1, v2));
        }
    }

    public static final void a(InteractionSource interactionSource0, long v, Shape shape0, Function2 function20, int v1, Function2 function21, Function0 function00, float f, float f1, float f2, float f3, float f4, Composer composer0, int v2, int v3) {
        int v8;
        km km0;
        int v7;
        Composer composer1 = composer0.startRestartGroup(0x68C42E79);
        int v4 = 4;
        int v5 = (v2 & 6) == 0 ? (composer1.changed(interactionSource0) ? 4 : 2) | v2 : v2;
        int v6 = 16;
        if((v2 & 0x30) == 0) {
            v5 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v2 & 0x180) == 0) {
            v5 |= (composer1.changed(shape0) ? 0x100 : 0x80);
        }
        if((v2 & 0xC00) == 0) {
            v5 |= (composer1.changedInstance(function20) ? 0x800 : 0x400);
        }
        if((v2 & 0x6000) == 0) {
            v5 |= (composer1.changed(v1) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v2) == 0) {
            v5 |= (composer1.changedInstance(function21) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v2) == 0) {
            v5 |= (composer1.changedInstance(function00) ? 0x100000 : 0x80000);
        }
        if((0xC00000 & v2) == 0) {
            v5 |= (composer1.changed(f) ? 0x800000 : 0x400000);
        }
        if((0x6000000 & v2) == 0) {
            v5 |= (composer1.changed(f1) ? 0x4000000 : 0x2000000);
        }
        if((0x30000000 & v2) == 0) {
            v5 |= (composer1.changed(f2) ? 0x20000000 : 0x10000000);
        }
        if((v3 & 6) == 0) {
            if(!composer1.changed(f3)) {
                v4 = 2;
            }
            v7 = v3 | v4;
        }
        else {
            v7 = v3;
        }
        if((v3 & 0x30) == 0) {
            if(composer1.changed(f4)) {
                v6 = 0x20;
            }
            v7 |= v6;
        }
        if((v5 & 306783379) != 306783378 || (v7 & 19) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x68C42E79, v5, v7, "androidx.compose.material3.NavigationItemLayout (NavigationItem.kt:355)");
            }
            if(function21 == null || NavigationItemIconPosition.equals-impl0(v1, 0)) {
                v8 = v5;
                km0 = new nr(function21 != null, function00, f, f1, f2, f4);
            }
            else {
                km0 = new km(function00, f, f1, f3);
                v8 = v5;
            }
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            int v9 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier0 = ComposedModifierKt.materializeModifier(composer1, modifier$Companion0);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function01 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function01);
            }
            else {
                composer1.useNode();
            }
            Function2 function22 = a.r(composeUiNode$Companion0, composer1, km0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v9)) {
                a.t(v9, composer1, v9, function22);
            }
            Updater.set-impl(composer1, modifier0, composeUiNode$Companion0.getSetModifier());
            BoxKt.Box(IndicationKt.indication(ClipKt.clip(LayoutIdKt.layoutId(modifier$Companion0, "indicatorRipple"), shape0), interactionSource0, RippleKt.rippleOrFallbackImplementation-9IZ8Weo(false, 0.0f, 0L, composer1, 0, 7)), composer1, 0);
            Modifier modifier1 = LayoutIdKt.layoutId(modifier$Companion0, "indicator");
            aa.a a0 = composer1.rememberedValue();
            if((v8 & 0x380000) == 0x100000 || a0 == Composer.Companion.getEmpty()) {
                a0 = new aa.a(function00, 7);
                composer1.updateRememberedValue(a0);
            }
            BoxKt.Box(BackgroundKt.background-bw27NRU(GraphicsLayerModifierKt.graphicsLayer(modifier1, a0), v, shape0), composer1, 0);
            Modifier modifier2 = LayoutIdKt.layoutId(modifier$Companion0, "icon");
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v10 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
            Function0 function02 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function02);
            }
            else {
                composer1.useNode();
            }
            Function2 function23 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap1);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v10)) {
                a.t(v10, composer1, v10, function23);
            }
            Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
            function20.invoke(composer1, ((int)(v8 >> 9 & 14)));
            composer1.endNode();
            composer1.startReplaceGroup(-776741606);
            if(function21 != null) {
                Modifier modifier4 = LayoutIdKt.layoutId(modifier$Companion0, "label");
                MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
                int v11 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                CompositionLocalMap compositionLocalMap2 = composer1.getCurrentCompositionLocalMap();
                Modifier modifier5 = ComposedModifierKt.materializeModifier(composer1, modifier4);
                Function0 function03 = composeUiNode$Companion0.getConstructor();
                if(composer1.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer1.startReusableNode();
                if(composer1.getInserting()) {
                    composer1.createNode(function03);
                }
                else {
                    composer1.useNode();
                }
                Function2 function24 = a.r(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap2);
                if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v11)) {
                    a.t(v11, composer1, v11, function24);
                }
                Updater.set-impl(composer1, modifier5, composeUiNode$Companion0.getSetModifier());
                b.y(composer1, v8 >> 15 & 14, function21);
            }
            if(a.x(composer1)) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new eg(interactionSource0, v, shape0, function20, v1, function21, function00, f, f1, f2, f3, f4, v2, v3));
        }
    }

    public static final void access$NavigationItem_SHbi2eg$lambda$3(MutableIntState mutableIntState0, int v) {
        mutableIntState0.setIntValue(v);
    }

    public static final MeasureResult access$placeIcon-X9ElhV4(MeasureScope measureScope0, Placeable placeable0, Placeable placeable1, Placeable placeable2, long v) {
        int v1 = ConstraintsKt.constrainWidth-K40F9xA(v, placeable1.getWidth());
        int v2 = ConstraintsKt.constrainHeight-K40F9xA(v, placeable1.getHeight());
        return MeasureScope.layout$default(measureScope0, v1, v2, null, new fg(q.d(placeable2, v1, 2), q.A(placeable2, v2, 2), q.d(placeable0, v1, 2), q.A(placeable0, v2, 2), q.d(placeable1, v1, 2), q.A(placeable1, v2, 2), placeable2, placeable0, placeable1), 4, null);
    }

    public static final MeasureResult access$placeLabelAndStartIcon-nru01g4(MeasureScope measureScope0, Placeable placeable0, Placeable placeable1, Placeable placeable2, Placeable placeable3, long v, float f) {
        int v1 = ConstraintsKt.constrainWidth-K40F9xA(v, placeable2.getWidth());
        int v2 = ConstraintsKt.constrainHeight-K40F9xA(v, placeable2.getHeight());
        int v3 = q.d(placeable3, v1, 2);
        int v4 = q.A(placeable3, v2, 2);
        int v5 = q.A(placeable1, v2, 2);
        int v6 = q.A(placeable0, v2, 2);
        int v7 = (v1 - (placeable0.getWidth() + (measureScope0.roundToPx-0680j_4(f) + placeable1.getWidth()))) / 2;
        return MeasureScope.layout$default(measureScope0, v1, v2, null, new gg(placeable3, v3, v4, placeable0, placeable1.getWidth() + v7 + measureScope0.roundToPx-0680j_4(f), v6, placeable1, v7, v5, placeable2, q.d(placeable2, v1, 2), q.A(placeable2, v2, 2)), 4, null);
    }

    public static final MeasureResult access$placeLabelAndTopIcon-qoqLrGI(MeasureScope measureScope0, Placeable placeable0, Placeable placeable1, Placeable placeable2, Placeable placeable3, long v, float f, float f1, float f2) {
        int v1 = ConstraintsKt.constrainWidth-K40F9xA(v, Math.max(placeable0.getWidth(), placeable2.getWidth()));
        float f3 = measureScope0.toPx-0680j_4(f);
        int v2 = ConstraintsKt.constrainHeight-K40F9xA(v, c.roundToInt(measureScope0.toPx-0680j_4(f2) * 2.0f + (f3 + ((float)placeable2.getHeight()) + ((float)placeable0.getHeight()))));
        int v3 = measureScope0.roundToPx-0680j_4(f2 + f1);
        int v4 = q.d(placeable1, v1, 2);
        int v5 = q.d(placeable3, v1, 2);
        int v6 = measureScope0.roundToPx-0680j_4(f1);
        return MeasureScope.layout$default(measureScope0, v1, v2, null, new hg(placeable3, v5, v3 - v6, placeable0, q.d(placeable0, v1, 2), measureScope0.roundToPx-0680j_4(f + f1) + (placeable1.getHeight() + v3), placeable1, v4, v3, placeable2, q.d(placeable2, v1, 2), v3 - v6), 4, null);
    }

    public static final float getNavigationItemMinHeight() {
        return NavigationItemKt.b;
    }

    public static final float getNavigationItemMinWidth() {
        return NavigationItemKt.a;
    }
}

