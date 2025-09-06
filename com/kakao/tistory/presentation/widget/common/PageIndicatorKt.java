package com.kakao.tistory.presentation.widget.common;

import a;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.DpKt;
import com.kakao.tistory.presentation.design.ui.list.m;
import d;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001A!\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t²\u0006\f\u0010\u0007\u001A\u00020\u00028\nX\u008A\u0084\u0002²\u0006\f\u0010\b\u001A\u00020\u00028\nX\u008A\u0084\u0002"}, d2 = {"Landroidx/compose/foundation/pager/PagerState;", "pagerState", "", "pageCount", "", "PageIndicator", "(Landroidx/compose/foundation/pager/PagerState;ILandroidx/compose/runtime/Composer;II)V", "pageCountState", "currentPage", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPageIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageIndicator.kt\ncom/kakao/tistory/presentation/widget/common/PageIndicatorKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,80:1\n148#2:81\n148#2:123\n148#2:124\n148#2:175\n85#3:82\n81#3,7:83\n88#3:118\n92#3:122\n78#4,6:90\n85#4,4:105\n89#4,2:115\n93#4:121\n78#4,6:128\n85#4,4:143\n89#4,2:153\n93#4:173\n368#5,9:96\n377#5:117\n378#5,2:119\n368#5,9:134\n377#5:155\n378#5,2:171\n4032#6,6:109\n4032#6,6:147\n98#7,3:125\n101#7:156\n105#7:174\n1223#8,6:157\n1223#8,6:163\n1223#8,6:176\n1855#9,2:169\n81#10:182\n81#10:183\n*S KotlinDebug\n*F\n+ 1 PageIndicator.kt\ncom/kakao/tistory/presentation/widget/common/PageIndicatorKt\n*L\n22#1:81\n42#1:123\n43#1:124\n71#1:175\n22#1:82\n22#1:83,7\n22#1:118\n22#1:122\n22#1:90,6\n22#1:105,4\n22#1:115,2\n22#1:121\n39#1:128,6\n39#1:143,4\n39#1:153,2\n39#1:173\n22#1:96,9\n22#1:117\n22#1:119,2\n39#1:134,9\n39#1:155\n39#1:171,2\n22#1:109,6\n39#1:147,6\n39#1:125,3\n39#1:156\n39#1:174\n48#1:157,6\n51#1:163,6\n75#1:176,6\n59#1:169,2\n46#1:182\n48#1:183\n*E\n"})
public final class PageIndicatorKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void PageIndicator(@NotNull PagerState pagerState0, int v, @Nullable Composer composer0, int v1, int v2) {
        int v3;
        Intrinsics.checkNotNullParameter(pagerState0, "pagerState");
        Composer composer1 = composer0.startRestartGroup(0xBC7BC88A);
        if((v2 & 1) == 0) {
            v3 = (v1 & 14) == 0 ? (composer1.changed(pagerState0) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v1 & 0x70) == 0) {
            v3 |= ((v2 & 2) != 0 || !composer1.changed(v) ? 16 : 0x20);
        }
        if((v3 & 91) != 18 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v1 & 1) != 0 && !composer1.getDefaultsInvalid()) {
                composer1.skipToGroupEnd();
                if((v2 & 2) != 0) {
                    v3 &= 0xFFFFFF8F;
                }
            }
            else if((v2 & 2) != 0) {
                v = pagerState0.getPageCount();
                v3 &= 0xFFFFFF8F;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xBC7BC88A, v3, -1, "com.kakao.tistory.presentation.widget.common.PageIndicator (PageIndicator.kt:37)");
            }
            Modifier modifier0 = SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 6.0f);
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.spacedBy-D5KLDUw(7.0f, Alignment.Companion.getCenterHorizontally()), Alignment.Companion.getCenterVertically(), composer1, 54);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                d.a(v4, composer1, v4, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            State state0 = SnapshotStateKt.rememberUpdatedState(Math.min(v, pagerState0.getPageCount()), composer1, 0);
            composer1.startReplaceGroup(-1429279301);
            if(((Number)state0.getValue()).intValue() > 0) {
                composer1.startReplaceGroup(0xAACEF25F);
                State state1 = composer1.rememberedValue();
                androidx.compose.runtime.Composer.Companion composer$Companion0 = Composer.Companion;
                if(state1 == composer$Companion0.getEmpty()) {
                    state1 = SnapshotStateKt.derivedStateOf(new w1(pagerState0, state0));
                    composer1.updateRememberedValue(state1);
                }
                composer1.endReplaceGroup();
                float f = pagerState0.getCurrentPageOffsetFraction();
                composer1.startReplaceGroup(0xAACF09CE);
                boolean z = composer1.changed(f);
                x1 x10 = composer1.rememberedValue();
                if(z || x10 == composer$Companion0.getEmpty()) {
                    x10 = new x1(f, state1);
                    composer1.updateRememberedValue(x10);
                }
                composer1.endReplaceGroup();
                Iterator iterator0 = c.until(0, ((Number)state0.getValue()).intValue()).iterator();
                while(iterator0.hasNext()) {
                    PageIndicatorKt.a(((Number)x10.invoke(((IntIterator)iterator0).nextInt())).floatValue(), composer1, 0);
                }
            }
            if(m.a(composer1)) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new y1(pagerState0, v, v1, v2));
        }
    }

    public static final void a(float f, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xAD6F6C9D);
        int v1 = (v & 14) == 0 ? (composer1.changed(f) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xAD6F6C9D, v1, -1, "com.kakao.tistory.presentation.widget.common.IndicatorView (PageIndicator.kt:68)");
            }
            long v2 = ColorKt.lerp-jxsXWHM(0L, 0L, f);
            float f1 = DpKt.lerp-Md-fbLM(3.0f, 6.0f, f);
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            composer1.startReplaceGroup(0xEC9BEB66);
            boolean z = composer1.changed(v2);
            u1 u10 = composer1.rememberedValue();
            if(z || u10 == Composer.Companion.getEmpty()) {
                u10 = new u1(v2);
                composer1.updateRememberedValue(u10);
            }
            composer1.endReplaceGroup();
            BoxKt.Box(SizeKt.size-3ABfNKs(DrawModifierKt.drawBehind(modifier$Companion0, u10), f1), composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new v1(f, v));
        }
    }

    public static final int access$PageIndicator$lambda$6$lambda$1(State state0) {
        return ((Number)state0.getValue()).intValue();
    }

    public static final int access$PageIndicator$lambda$6$lambda$3(State state0) {
        return ((Number)state0.getValue()).intValue();
    }

    public static final void access$PageIndicatorPreview(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x7E286875);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x7E286875, v, -1, "com.kakao.tistory.presentation.widget.common.PageIndicatorPreview (PageIndicator.kt:19)");
            }
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.spacedBy-0680j_4(10.0f), Alignment.Companion.getStart(), composer1, 6);
            int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier0 = ComposedModifierKt.materializeModifier(composer1, Modifier.Companion);
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
            Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v1)) {
                d.a(v1, composer1, v1, function20);
            }
            Updater.set-impl(composer1, modifier0, composeUiNode$Companion0.getSetModifier());
            PagerState pagerState0 = PagerStateKt.rememberPagerState(0, 0.0f, z1.a, composer1, 0x180, 3);
            PageIndicatorKt.PageIndicator(pagerState0, 0, composer1, 0x30, 0);
            PageIndicatorKt.PageIndicator(pagerState0, 5, composer1, 0x30, 0);
            PageIndicatorKt.PageIndicator(pagerState0, 2, composer1, 0x30, 0);
            PagerState pagerState1 = PagerStateKt.rememberPagerState(0, 0.0f, a2.a, composer1, 0x180, 3);
            PageIndicatorKt.PageIndicator(pagerState1, 3, composer1, 0x30, 0);
            PageIndicatorKt.PageIndicator(pagerState1, -3, composer1, 0x30, 0);
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
            scopeUpdateScope0.updateScope(new b2(v));
        }
    }
}

