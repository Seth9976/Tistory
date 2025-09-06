package com.kakao.kandinsky.designsystem.common;

import aa.d;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitState;
import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.foundation.interaction.DragInteractionKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PageSize.Fixed;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.d7;
import androidx.compose.material3.pi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MovableContentKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.room.a;
import androidx.room.f;
import ca.a1;
import ca.b1;
import ca.d1;
import ca.e1;
import ca.f1;
import ca.h;
import ca.q0;
import ca.r0;
import ca.s;
import ca.v0;
import ca.w0;
import ca.x0;
import ca.y0;
import com.kakao.kandinsky.designsystem.theme.Orientation;
import com.kakao.kandinsky.designsystem.theme.OrientationKt;
import com.kakao.kandinsky.designsystem.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\u001A¬\u0001\u0010\u0012\u001A\u00020\n2\b\b\u0002\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00022)\b\u0002\u0010\u000B\u001A#\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u00052\u0014\b\u0002\u0010\u000E\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\f2\u001F\b\u0002\u0010\u0010\u001A\u0019\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\u0002\b\u000F2\u001F\b\u0002\u0010\u0011\u001A\u0019\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\u0002\b\u000FH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0018²\u0006\f\u0010\t\u001A\u00020\u00068\nX\u008A\u0084\u0002²\u0006\u000E\u0010\u0014\u001A\u00020\u00068\n@\nX\u008A\u008E\u0002²\u0006\f\u0010\u0015\u001A\u00020\u00068\nX\u008A\u0084\u0002²\u0006\f\u0010\u0015\u001A\u00020\u00068\nX\u008A\u0084\u0002²\u0006\f\u0010\u0017\u001A\u00020\u00168\nX\u008A\u0084\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "size", "selectedIndex", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "isDragging", "", "onSelected", "Lkotlin/Function1;", "", "getToastMessage", "Landroidx/compose/runtime/Composable;", "absoluteSizeContent", "relativeSizeContent", "ItemSlider", "(Landroidx/compose/ui/Modifier;IILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "showToast", "isSelected", "", "alpha", "designsystem_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nItemSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ItemSlider.kt\ncom/kakao/kandinsky/designsystem/common/ItemSliderKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,378:1\n77#2:379\n1#3:380\n1223#4,6:381\n1223#4,6:387\n1223#4,6:393\n1223#4,6:399\n1223#4,6:455\n86#5:405\n50#5:406\n68#5:407\n68#5:408\n56#5:409\n86#5:410\n50#5:411\n68#5:412\n68#5:449\n56#5:450\n71#6:413\n68#6,6:414\n74#6:448\n78#6:454\n71#6:461\n69#6,5:462\n74#6:495\n71#6:496\n69#6,5:497\n74#6:530\n78#6:534\n78#6:538\n71#6:551\n69#6,5:552\n74#6:585\n78#6:589\n78#7,6:420\n85#7,4:435\n89#7,2:445\n93#7:453\n78#7,6:467\n85#7,4:482\n89#7,2:492\n78#7,6:502\n85#7,4:517\n89#7,2:527\n93#7:533\n93#7:537\n78#7,6:557\n85#7,4:572\n89#7,2:582\n93#7:588\n368#8,9:426\n377#8:447\n378#8,2:451\n368#8,9:473\n377#8:494\n368#8,9:508\n377#8:529\n378#8,2:531\n378#8,2:535\n368#8,9:563\n377#8:584\n378#8,2:586\n4032#9,6:439\n4032#9,6:486\n4032#9,6:521\n4032#9,6:576\n1967#10:539\n1963#10:540\n1882#10,7:541\n148#11:548\n148#11:549\n148#11:550\n148#11:595\n148#11:596\n81#12:590\n81#12:591\n107#12,2:592\n81#12:594\n*S KotlinDebug\n*F\n+ 1 ItemSlider.kt\ncom/kakao/kandinsky/designsystem/common/ItemSliderKt\n*L\n108#1:379\n110#1:381,6\n112#1:387,6\n187#1:393,6\n210#1:399,6\n303#1:455,6\n243#1:405\n243#1:406\n244#1:407\n255#1:408\n255#1:409\n262#1:410\n262#1:411\n263#1:412\n275#1:449\n275#1:450\n265#1:413\n265#1:414,6\n265#1:448\n265#1:454\n298#1:461\n298#1:462,5\n298#1:495\n306#1:496\n306#1:497,5\n306#1:530\n306#1:534\n298#1:538\n324#1:551\n324#1:552,5\n324#1:585\n324#1:589\n265#1:420,6\n265#1:435,4\n265#1:445,2\n265#1:453\n298#1:467,6\n298#1:482,4\n298#1:492,2\n306#1:502,6\n306#1:517,4\n306#1:527,2\n306#1:533\n298#1:537\n324#1:557,6\n324#1:572,4\n324#1:582,2\n324#1:588\n265#1:426,9\n265#1:447\n265#1:451,2\n298#1:473,9\n298#1:494\n306#1:508,9\n306#1:529\n306#1:531,2\n298#1:535,2\n324#1:563,9\n324#1:584\n324#1:586,2\n265#1:439,6\n298#1:486,6\n306#1:521,6\n324#1:576,6\n322#1:539\n322#1:540\n322#1:541,7\n335#1:548\n338#1:549\n340#1:550\n94#1:595\n95#1:596\n111#1:590\n112#1:591\n112#1:592,2\n322#1:594\n*E\n"})
public final class ItemSliderKt {
    public static final float a;
    public static final RoundedCornerShape b;

    static {
        ItemSliderKt.a = 58.0f;
        ItemSliderKt.b = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(16.0f);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void ItemSlider(@Nullable Modifier modifier0, int v, int v1, @Nullable Function2 function20, @Nullable Function1 function10, @Nullable Function4 function40, @Nullable Function4 function41, @Nullable Composer composer0, int v2, int v3) {
        Function4 function44;
        Function2 function21;
        Function4 function43;
        Function4 function42;
        Function1 function11;
        Modifier modifier1;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0x5A9280A8);
        if((v3 & 1) != 0) {
            v4 = v2 | 6;
            modifier1 = modifier0;
        }
        else if((v2 & 14) == 0) {
            modifier1 = modifier0;
            v4 = (composer1.changed(modifier1) ? 4 : 2) | v2;
        }
        else {
            modifier1 = modifier0;
            v4 = v2;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v4 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v2 & 0x380) == 0) {
            v4 |= (composer1.changed(v1) ? 0x100 : 0x80);
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v2 & 0x1C00) == 0) {
            v4 |= (composer1.changedInstance(function20) ? 0x800 : 0x400);
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
            function11 = function10;
        }
        else if((0xE000 & v2) == 0) {
            function11 = function10;
            v4 |= (composer1.changedInstance(function11) ? 0x4000 : 0x2000);
        }
        else {
            function11 = function10;
        }
        if((v3 & 0x20) != 0) {
            v4 |= 0x30000;
        }
        else if((0x70000 & v2) == 0) {
            v4 |= (composer1.changedInstance(function40) ? 0x20000 : 0x10000);
        }
        if((v3 & 0x40) == 0) {
            function42 = function41;
            if((v2 & 0x380000) == 0) {
                v4 |= (composer1.changedInstance(function42) ? 0x100000 : 0x80000);
            }
        }
        else {
            v4 |= 0x180000;
            function42 = function41;
        }
        if((v4 & 0x2DB6DB) != 0x92492 || !composer1.getSkipping()) {
            Modifier modifier2 = (v3 & 1) == 0 ? modifier1 : Modifier.Companion;
            Function2 function22 = (v3 & 8) == 0 ? function20 : q0.w;
            Function1 function12 = (v3 & 16) == 0 ? function11 : r0.w;
            Function4 function45 = (v3 & 0x20) == 0 ? function40 : ComposableSingletons.ItemSliderKt.INSTANCE.getLambda-6$designsystem_release();
            if((v3 & 0x40) != 0) {
                function42 = ComposableSingletons.ItemSliderKt.INSTANCE.getLambda-7$designsystem_release();
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x5A9280A8, v4, -1, "com.kakao.kandinsky.designsystem.common.ItemSlider (ItemSlider.kt:106)");
            }
            Object object0 = composer1.consume(OrientationKt.getLocalOrientation());
            Integer integer0 = v1 >= 0 ? v1 : null;
            int v5 = integer0 == null ? 0 : ((int)integer0);
            composer1.startReplaceGroup(0x6368C75E);
            x0 x00 = composer1.rememberedValue();
            if((v4 & 0x70) == 0x20 || x00 == Composer.Companion.getEmpty()) {
                x00 = new x0(v, 0);
                composer1.updateRememberedValue(x00);
            }
            composer1.endReplaceGroup();
            PagerState pagerState0 = PagerStateKt.rememberPagerState(v5, 0.0f, x00, composer1, 0, 2);
            State state0 = DragInteractionKt.collectIsDraggedAsState(pagerState0.getInteractionSource(), composer1, 0);
            composer1.startReplaceGroup(0x6368C7C9);
            MutableState mutableState0 = composer1.rememberedValue();
            if(mutableState0 == Composer.Companion.getEmpty()) {
                mutableState0 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer1.updateRememberedValue(mutableState0);
            }
            composer1.endReplaceGroup();
            BoxWithConstraintsKt.BoxWithConstraints(OrientationKt.byOrientation(modifier2, s.C, s.D), null, false, ComposableLambdaKt.rememberComposableLambda(0x9C570E7E, true, new v0(((Orientation)object0), pagerState0, function22, function45, function42, v1, state0, mutableState0, function12), composer1, 54), composer1, 0xC00, 6);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function43 = function42;
            function11 = function12;
            function44 = function45;
            modifier1 = modifier2;
            function21 = function22;
        }
        else {
            composer1.skipToGroupEnd();
            function43 = function42;
            function21 = function20;
            function44 = function40;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new w0(modifier1, v, v1, function21, function11, function44, function43, v2, v3));
        }
    }

    public static final boolean access$ItemSlider$lambda$2(State state0) {
        return ((Boolean)state0.getValue()).booleanValue();
    }

    public static final boolean access$ItemSlider$lambda$4(MutableState mutableState0) {
        return ((Boolean)mutableState0.getValue()).booleanValue();
    }

    public static final void access$ItemSlider$lambda$5(MutableState mutableState0, boolean z) {
        mutableState0.setValue(Boolean.valueOf(z));
    }

    public static final void access$Pager(BoxWithConstraintsScope boxWithConstraintsScope0, Orientation orientation0, PagerState pagerState0, Function2 function20, Function4 function40, Function4 function41, Composer composer0, int v, int v1) {
        Function2 function22;
        int v4;
        Function2 function23;
        Function2 function21;
        int v2;
        Composer composer1 = composer0.startRestartGroup(909518196);
        if((v1 & 0x80000000) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(boxWithConstraintsScope0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 1) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(orientation0) ? 0x20 : 16);
        }
        if((v1 & 2) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(pagerState0) ? 0x100 : 0x80);
        }
        if((v1 & 4) != 0) {
            v2 |= 0xC00;
            function21 = function20;
        }
        else if((v & 0x1C00) == 0) {
            function21 = function20;
            v2 |= (composer1.changedInstance(function21) ? 0x800 : 0x400);
        }
        else {
            function21 = function20;
        }
        if((v1 & 8) != 0) {
            v2 |= 0x6000;
        }
        else if((0xE000 & v) == 0) {
            v2 |= (composer1.changedInstance(function40) ? 0x4000 : 0x2000);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x30000;
        }
        else if((0x70000 & v) == 0) {
            v2 |= (composer1.changedInstance(function41) ? 0x20000 : 0x10000);
        }
        if((0x5B6DB & v2) != 74898 || !composer1.getSkipping()) {
            if((v1 & 4) != 0) {
                function21 = y0.w;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(909518196, v2, -1, "com.kakao.kandinsky.designsystem.common.Pager (ItemSlider.kt:185)");
            }
            composer1.startReplaceGroup(0x1F13AACA);
            Function5 function50 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(function50 == composer$Companion0.getEmpty()) {
                function50 = MovableContentKt.movableContentOf(ComposableLambdaKt.composableLambdaInstance(703338187, true, new d1(pagerState0, function21, function40, function41)));
                composer1.updateRememberedValue(function50);
            }
            composer1.endReplaceGroup();
            DecayAnimationSpec decayAnimationSpec0 = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer1, 0);
            composer1.startReplaceGroup(0x1F13AE25);
            ItemSliderKt.Pager.snapLayoutInfoProvider.1.1 itemSliderKt$Pager$snapLayoutInfoProvider$1$10 = composer1.rememberedValue();
            if((v2 & 0x380) == 0x100 || itemSliderKt$Pager$snapLayoutInfoProvider$1$10 == composer$Companion0.getEmpty()) {
                itemSliderKt$Pager$snapLayoutInfoProvider$1$10 = new ItemSliderKt.Pager.snapLayoutInfoProvider.1.1(pagerState0, decayAnimationSpec0);
                composer1.updateRememberedValue(itemSliderKt$Pager$snapLayoutInfoProvider$1$10);
            }
            composer1.endReplaceGroup();
            TargetedFlingBehavior targetedFlingBehavior0 = SnapFlingBehaviorKt.rememberSnapFlingBehavior(itemSliderKt$Pager$snapLayoutInfoProvider$1$10, composer1, 0);
            float f = ItemSliderKt.a;
            if(orientation0 == Orientation.Portrait) {
                composer1.startReplaceGroup(0x1F13B3B4);
                float f1 = Dp.constructor-impl(4.0f * f + boxWithConstraintsScope0.getMaxWidth-D9Ej5fM());
                Modifier modifier0 = SizeKt.requiredWidth-3ABfNKs(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), f1);
                Fixed pageSize$Fixed0 = new Fixed(f, null);
                PaddingValues paddingValues0 = PaddingKt.PaddingValues-YgX7TsA$default(f1 / 2.0f - f / 2.0f, 0.0f, 2, null);
                ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(0xAF05B817, true, new a1(function50, orientation0, 0, pagerState0), composer1, 54);
                function23 = function21;
                PagerKt.HorizontalPager-oI3XNZo(pagerState0, modifier0, paddingValues0, pageSize$Fixed0, 5, 0.0f, Alignment.Companion.getCenterVertically(), targetedFlingBehavior0, false, false, null, null, null, composableLambda0, composer1, v2 >> 6 & 14 | 0x186000, 0xC00, 0x1F20);
            }
            else {
                function23 = function21;
                composer1.startReplaceGroup(0x1F13B687);
                float f2 = Dp.constructor-impl(f * 4.0f + boxWithConstraintsScope0.getMaxHeight-D9Ej5fM());
                androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
                Modifier modifier1 = GraphicsLayerModifierKt.graphicsLayer-Ap8cVGQ$default(modifier$Companion0, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0x1FFFD, null);
                androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
                MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
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
                Function2 function24 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
                if(composer1.getInserting()) {
                    v4 = v2;
                    a.t(v3, composer1, v3, function24);
                }
                else {
                    v4 = v2;
                    if(!Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                        a.t(v3, composer1, v3, function24);
                    }
                }
                Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
                Modifier modifier3 = SizeKt.requiredHeight-3ABfNKs(SizeKt.fillMaxSize$default(modifier$Companion0, 0.0f, 1, null), f2);
                Fixed pageSize$Fixed1 = new Fixed(f, null);
                PagerKt.VerticalPager-oI3XNZo(pagerState0, modifier3, PaddingKt.PaddingValues-YgX7TsA$default(0.0f, f2 / 2.0f - f / 2.0f, 1, null), pageSize$Fixed1, 5, 0.0f, alignment$Companion0.getCenterHorizontally(), targetedFlingBehavior0, false, false, null, null, null, ComposableLambdaKt.rememberComposableLambda(0xD62FBF7A, true, new b1(pagerState0, function50, orientation0), composer1, 54), composer1, v4 >> 6 & 14 | 0x186000, 0xC00, 0x1F20);
                composer1.endNode();
            }
            composer1.endReplaceGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function22 = function23;
        }
        else {
            composer1.skipToGroupEnd();
            function22 = function21;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new pi(boxWithConstraintsScope0, orientation0, pagerState0, function22, function40, function41, v, v1));
        }
    }

    public static final void access$PreviewItemSlider(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x666FEEE8);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x666FEEE8, v, -1, "com.kakao.kandinsky.designsystem.common.PreviewItemSlider (ItemSlider.kt:40)");
            }
            ThemeKt.KandinskyTheme(ComposableSingletons.ItemSliderKt.INSTANCE.getLambda-5$designsystem_release(), composer1, 6);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h(v, 1));
        }
    }

    public static final void access$SliderItemBox(Modifier modifier0, Orientation orientation0, PagerState pagerState0, int v, Function1 function10, Function3 function30, Function3 function31, Composer composer0, int v1, int v2) {
        Function3 function33;
        Function3 function32;
        Modifier modifier1;
        int v3;
        Composer composer1 = composer0.startRestartGroup(-2072453992);
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
            v3 |= (composer1.changed(orientation0) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v1 & 0x380) == 0) {
            v3 |= (composer1.changed(pagerState0) ? 0x100 : 0x80);
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
        }
        else if((v1 & 0x1C00) == 0) {
            v3 |= (composer1.changed(v) ? 0x800 : 0x400);
        }
        if((v2 & 16) != 0) {
            v3 |= 0x6000;
        }
        else if((v1 & 0xE000) == 0) {
            v3 |= (composer1.changedInstance(function10) ? 0x4000 : 0x2000);
        }
        if((v2 & 0x20) != 0) {
            v3 |= 0x30000;
        }
        else if((0x70000 & v1) == 0) {
            v3 |= (composer1.changedInstance(function30) ? 0x20000 : 0x10000);
        }
        if((v2 & 0x40) != 0) {
            v3 |= 0x180000;
        }
        else if((v1 & 0x380000) == 0) {
            v3 |= (composer1.changedInstance(function31) ? 0x100000 : 0x80000);
        }
        if((v3 & 0x2DB6DB) != 0x92492 || !composer1.getSkipping()) {
            modifier1 = (v2 & 1) == 0 ? modifier0 : Modifier.Companion;
            function33 = (v2 & 0x20) == 0 ? function30 : ComposableSingletons.ItemSliderKt.INSTANCE.getLambda-8$designsystem_release();
            function32 = (v2 & 0x40) == 0 ? function31 : ComposableSingletons.ItemSliderKt.INSTANCE.getLambda-9$designsystem_release();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2072453992, v3, -1, "com.kakao.kandinsky.designsystem.common.SliderItemBox (ItemSlider.kt:296)");
            }
            Modifier modifier2 = GraphicsLayerModifierKt.graphicsLayer(modifier1, new f1(pagerState0, v, orientation0, 0));
            RoundedCornerShape roundedCornerShape0 = ItemSliderKt.b;
            Modifier modifier3 = SizeKt.size-3ABfNKs(ClipKt.clip(modifier2, roundedCornerShape0), ItemSliderKt.a);
            composer1.startReplaceGroup(0x910990E2);
            d7 d70 = composer1.rememberedValue();
            if((((0xE000 & v3) == 0x4000 ? 1 : 0) | ((v3 & 0x1C00) == 0x800 ? 1 : 0)) != 0 || d70 == Composer.Companion.getEmpty()) {
                d70 = new d7(v, 1, function10);
                composer1.updateRememberedValue(d70);
            }
            composer1.endReplaceGroup();
            Modifier modifier4 = ClickableKt.clickable-XHw0xAI$default(modifier3, false, null, null, d70, 7, null);
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getCenter(), false);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            Function2 function20 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                a.t(v4, composer1, v4, function20);
            }
            Updater.set-impl(composer1, modifier5, composeUiNode$Companion0.getSetModifier());
            Modifier modifier6 = ClipKt.clip(GraphicsLayerModifierKt.graphicsLayer(SizeKt.fillMaxSize$default(modifier1, 0.0f, 1, null), new f(pagerState0, v, 1)), roundedCornerShape0);
            MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getCenter(), false);
            int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier7 = ComposedModifierKt.materializeModifier(composer1, modifier6);
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
            Function2 function21 = a.r(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v5)) {
                a.t(v5, composer1, v5, function21);
            }
            int v6 = v3 >> 9 & 14;
            function32.invoke(r0.a.l(composeUiNode$Companion0, composer1, modifier7, v), composer1, ((int)(v3 >> 15 & 0x70 | v6)));
            composer1.endNode();
            function33.invoke(v, composer1, ((int)(v6 | v3 >> 12 & 0x70)));
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            function32 = function31;
            function33 = function30;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new e1(modifier1, orientation0, pagerState0, v, function10, function33, function32, v1, v2));
        }
    }

    public static final void access$ToastMessage(AnimatedVisibilityScope animatedVisibilityScope0, String s, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x30055F8A);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x30055F8A, v, -1, "com.kakao.kandinsky.designsystem.common.ToastMessage (ItemSlider.kt:320)");
        }
        Transition transition0 = animatedVisibilityScope0.getTransition();
        ItemSliderKt.ToastMessage..inlined.animateFloat.1 itemSliderKt$ToastMessage$$inlined$animateFloat$10 = ItemSliderKt.ToastMessage..inlined.animateFloat.1.INSTANCE;
        TwoWayConverter twoWayConverter0 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        EnterExitState enterExitState0 = (EnterExitState)transition0.getCurrentState();
        composer1.startReplaceGroup(0xBC032B71);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xBC032B71, 0, -1, "com.kakao.kandinsky.designsystem.common.ToastMessage.<anonymous> (ItemSlider.kt:321)");
        }
        EnterExitState enterExitState1 = EnterExitState.Visible;
        float f = 1.0f;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer1.endReplaceGroup();
        Float float0 = (float)(enterExitState0 == enterExitState1 ? 1.0f : 0.0f);
        EnterExitState enterExitState2 = (EnterExitState)transition0.getTargetState();
        composer1.startReplaceGroup(0xBC032B71);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xBC032B71, 0, -1, "com.kakao.kandinsky.designsystem.common.ToastMessage.<anonymous> (ItemSlider.kt:321)");
        }
        if(enterExitState2 != enterExitState1) {
            f = 0.0f;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer1.endReplaceGroup();
        State state0 = TransitionKt.createTransitionAnimation(transition0, float0, f, ((FiniteAnimationSpec)itemSliderKt$ToastMessage$$inlined$animateFloat$10.invoke(transition0.getSegment(), composer1, 0)), twoWayConverter0, "slider toast alpha animation", composer1, 0x30000);
        Modifier modifier0 = SizeKt.height-3ABfNKs(AlphaKt.alpha(OrientationKt.byOrientation(Modifier.Companion, s.E, s.F), ((Number)state0.getValue()).floatValue()), 32.0f);
        MaterialTheme materialTheme0 = MaterialTheme.INSTANCE;
        int v1 = MaterialTheme.$stable;
        Modifier modifier1 = PaddingKt.padding-VpY3zN4$default(BackgroundKt.background-bw27NRU(modifier0, Color.copy-wmQWz5c$default(materialTheme0.getColorScheme(composer1, v1).getTertiaryContainer-0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(12.0f)), 16.0f, 0.0f, 2, null);
        MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
            a.t(v2, composer1, v2, function20);
        }
        Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
        TextStyle textStyle0 = materialTheme0.getTypography(composer1, v1).getBodySmall();
        TextKt.Text--4IGK_g(s, null, materialTheme0.getColorScheme(composer1, v1).getOnTertiaryContainer-0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle0, composer1, v >> 3 & 14, 0, 0xFFFA);
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d(animatedVisibilityScope0, s, v, 7));
        }
    }

    public static final RoundedCornerShape access$getItemShape$p() {
        return ItemSliderKt.b;
    }

    public static final float access$getItemWidth$p() [...] // 潜在的解密器
}

