package com.google.accompanist.flowlayout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import m6.b;
import m6.c;
import m6.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001Av\u0010\u0013\u001A\u00020\u000E2\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\f\b\u0002\u0010\u0006\u001A\u00060\u0004j\u0002`\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\u000B\u001A\u00020\u00072\f\b\u0002\u0010\f\u001A\u00060\u0004j\u0002`\u00052\u0011\u0010\u0010\u001A\r\u0012\u0004\u0012\u00020\u000E0\r¢\u0006\u0002\b\u000FH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001Av\u0010\u0015\u001A\u00020\u000E2\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\f\b\u0002\u0010\u0006\u001A\u00060\u0004j\u0002`\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\u000B\u001A\u00020\u00072\f\b\u0002\u0010\f\u001A\u00060\u0004j\u0002`\u00052\u0011\u0010\u0010\u001A\r\u0012\u0004\u0012\u00020\u000E0\r¢\u0006\u0002\b\u000FH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0012*\n\u0010\u0016\"\u00020\u00042\u00020\u0004\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/google/accompanist/flowlayout/SizeMode;", "mainAxisSize", "Lcom/google/accompanist/flowlayout/MainAxisAlignment;", "Lcom/google/accompanist/flowlayout/FlowMainAxisAlignment;", "mainAxisAlignment", "Landroidx/compose/ui/unit/Dp;", "mainAxisSpacing", "Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;", "crossAxisAlignment", "crossAxisSpacing", "lastLineMainAxisAlignment", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "FlowRow-07r0xoM", "(Landroidx/compose/ui/Modifier;Lcom/google/accompanist/flowlayout/SizeMode;Lcom/google/accompanist/flowlayout/MainAxisAlignment;FLcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;FLcom/google/accompanist/flowlayout/MainAxisAlignment;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "FlowRow", "FlowColumn-07r0xoM", "FlowColumn", "FlowMainAxisAlignment", "flowlayout_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Flow.kt\ncom/google/accompanist/flowlayout/FlowKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,334:1\n154#2:335\n154#2:336\n154#2:337\n154#2:338\n74#3:339\n75#3,11:341\n88#3:366\n76#4:340\n456#5,14:352\n*S KotlinDebug\n*F\n+ 1 Flow.kt\ncom/google/accompanist/flowlayout/FlowKt\n*L\n51#1:335\n53#1:336\n89#1:337\n91#1:338\n148#1:339\n148#1:341,11\n148#1:366\n148#1:340\n148#1:352,14\n*E\n"})
public final class FlowKt {
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void FlowColumn-07r0xoM(@Nullable Modifier modifier0, @Nullable SizeMode sizeMode0, @Nullable MainAxisAlignment mainAxisAlignment0, float f, @Nullable FlowCrossAxisAlignment flowCrossAxisAlignment0, float f1, @Nullable MainAxisAlignment mainAxisAlignment1, @NotNull Function2 function20, @Nullable Composer composer0, int v, int v1) {
        MainAxisAlignment mainAxisAlignment4;
        FlowCrossAxisAlignment flowCrossAxisAlignment2;
        float f4;
        MainAxisAlignment mainAxisAlignment3;
        SizeMode sizeMode2;
        float f3;
        Modifier modifier1;
        Modifier modifier2;
        FlowCrossAxisAlignment flowCrossAxisAlignment3;
        float f6;
        MainAxisAlignment mainAxisAlignment6;
        SizeMode sizeMode3;
        MainAxisAlignment mainAxisAlignment5;
        float f5;
        FlowCrossAxisAlignment flowCrossAxisAlignment1;
        float f2;
        MainAxisAlignment mainAxisAlignment2;
        SizeMode sizeMode1;
        int v2;
        Intrinsics.checkNotNullParameter(function20, "content");
        Composer composer1 = composer0.startRestartGroup(0xC23C0E5);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
            sizeMode1 = sizeMode0;
        }
        else if((v & 0x70) == 0) {
            sizeMode1 = sizeMode0;
            v2 |= (composer1.changed(sizeMode1) ? 0x20 : 16);
        }
        else {
            sizeMode1 = sizeMode0;
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            mainAxisAlignment2 = mainAxisAlignment0;
        }
        else if((v & 0x380) == 0) {
            mainAxisAlignment2 = mainAxisAlignment0;
            v2 |= (composer1.changed(mainAxisAlignment2) ? 0x100 : 0x80);
        }
        else {
            mainAxisAlignment2 = mainAxisAlignment0;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            f2 = f;
        }
        else if((v & 0x1C00) == 0) {
            f2 = f;
            v2 |= (composer1.changed(f2) ? 0x800 : 0x400);
        }
        else {
            f2 = f;
        }
        if((v1 & 16) == 0) {
            flowCrossAxisAlignment1 = flowCrossAxisAlignment0;
            if((v & 0xE000) == 0) {
                v2 |= (composer1.changed(flowCrossAxisAlignment1) ? 0x4000 : 0x2000);
            }
        }
        else {
            v2 |= 0x6000;
            flowCrossAxisAlignment1 = flowCrossAxisAlignment0;
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((v & 0x70000) == 0) {
            v2 |= (composer1.changed(f1) ? 0x20000 : 0x10000);
        }
        if((v & 0x380000) == 0) {
            v2 |= ((v1 & 0x40) != 0 || !composer1.changed(mainAxisAlignment1) ? 0x80000 : 0x100000);
        }
        if((v1 & 0x80) != 0) {
            v2 |= 0xC00000;
        }
        else if((v & 0x1C00000) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x800000 : 0x400000);
        }
        if((0x16DB6DB & v2) != 4793490 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v1 & 1) == 0 ? modifier0 : Modifier.Companion;
                if((v1 & 2) != 0) {
                    sizeMode1 = SizeMode.Wrap;
                }
                if((v1 & 4) != 0) {
                    mainAxisAlignment2 = MainAxisAlignment.Start;
                }
                if((v1 & 8) != 0) {
                    f2 = 0.0f;
                }
                if((v1 & 16) != 0) {
                    flowCrossAxisAlignment1 = FlowCrossAxisAlignment.Start;
                }
                float f7 = (v1 & 0x20) == 0 ? f1 : 0.0f;
                if((v1 & 0x40) == 0) {
                    mainAxisAlignment5 = mainAxisAlignment1;
                    f5 = f7;
                    sizeMode3 = sizeMode1;
                    mainAxisAlignment6 = mainAxisAlignment2;
                }
                else {
                    v2 &= 0xFFC7FFFF;
                    f5 = f7;
                    sizeMode3 = sizeMode1;
                    mainAxisAlignment6 = mainAxisAlignment2;
                    mainAxisAlignment5 = mainAxisAlignment6;
                }
                f6 = f2;
                flowCrossAxisAlignment3 = flowCrossAxisAlignment1;
                modifier2 = modifier3;
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 0x40) != 0) {
                    v2 &= 0xFFC7FFFF;
                }
                f5 = f1;
                mainAxisAlignment5 = mainAxisAlignment1;
                sizeMode3 = sizeMode1;
                mainAxisAlignment6 = mainAxisAlignment2;
                f6 = f2;
                flowCrossAxisAlignment3 = flowCrossAxisAlignment1;
                modifier2 = modifier0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xC23C0E5, v2, -1, "com.google.accompanist.flowlayout.FlowColumn (Flow.kt:84)");
            }
            FlowKt.a(modifier2, LayoutOrientation.Vertical, sizeMode3, mainAxisAlignment6, f6, flowCrossAxisAlignment3, f5, mainAxisAlignment5, function20, composer1, v2 & 14 | 0x30 | v2 << 3 & 0x380 | v2 << 3 & 0x1C00 | 0xE000 & v2 << 3 | v2 << 3 & 0x70000 | v2 << 3 & 0x380000 | v2 << 3 & 0x1C00000 | v2 << 3 & 0xE000000);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            sizeMode2 = sizeMode3;
            mainAxisAlignment3 = mainAxisAlignment6;
            f4 = f6;
            flowCrossAxisAlignment2 = flowCrossAxisAlignment3;
            f3 = f5;
            mainAxisAlignment4 = mainAxisAlignment5;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            f3 = f1;
            sizeMode2 = sizeMode1;
            mainAxisAlignment3 = mainAxisAlignment2;
            f4 = f2;
            flowCrossAxisAlignment2 = flowCrossAxisAlignment1;
            mainAxisAlignment4 = mainAxisAlignment1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d(modifier1, sizeMode2, mainAxisAlignment3, f4, flowCrossAxisAlignment2, f3, mainAxisAlignment4, function20, v, v1, 0));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void FlowRow-07r0xoM(@Nullable Modifier modifier0, @Nullable SizeMode sizeMode0, @Nullable MainAxisAlignment mainAxisAlignment0, float f, @Nullable FlowCrossAxisAlignment flowCrossAxisAlignment0, float f1, @Nullable MainAxisAlignment mainAxisAlignment1, @NotNull Function2 function20, @Nullable Composer composer0, int v, int v1) {
        MainAxisAlignment mainAxisAlignment4;
        FlowCrossAxisAlignment flowCrossAxisAlignment2;
        float f4;
        MainAxisAlignment mainAxisAlignment3;
        SizeMode sizeMode2;
        float f3;
        Modifier modifier1;
        Modifier modifier2;
        FlowCrossAxisAlignment flowCrossAxisAlignment3;
        float f6;
        MainAxisAlignment mainAxisAlignment6;
        SizeMode sizeMode3;
        MainAxisAlignment mainAxisAlignment5;
        float f5;
        FlowCrossAxisAlignment flowCrossAxisAlignment1;
        float f2;
        MainAxisAlignment mainAxisAlignment2;
        SizeMode sizeMode1;
        int v2;
        Intrinsics.checkNotNullParameter(function20, "content");
        Composer composer1 = composer0.startRestartGroup(0xF7CCE859);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
            sizeMode1 = sizeMode0;
        }
        else if((v & 0x70) == 0) {
            sizeMode1 = sizeMode0;
            v2 |= (composer1.changed(sizeMode1) ? 0x20 : 16);
        }
        else {
            sizeMode1 = sizeMode0;
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            mainAxisAlignment2 = mainAxisAlignment0;
        }
        else if((v & 0x380) == 0) {
            mainAxisAlignment2 = mainAxisAlignment0;
            v2 |= (composer1.changed(mainAxisAlignment2) ? 0x100 : 0x80);
        }
        else {
            mainAxisAlignment2 = mainAxisAlignment0;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            f2 = f;
        }
        else if((v & 0x1C00) == 0) {
            f2 = f;
            v2 |= (composer1.changed(f2) ? 0x800 : 0x400);
        }
        else {
            f2 = f;
        }
        if((v1 & 16) == 0) {
            flowCrossAxisAlignment1 = flowCrossAxisAlignment0;
            if((v & 0xE000) == 0) {
                v2 |= (composer1.changed(flowCrossAxisAlignment1) ? 0x4000 : 0x2000);
            }
        }
        else {
            v2 |= 0x6000;
            flowCrossAxisAlignment1 = flowCrossAxisAlignment0;
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((v & 0x70000) == 0) {
            v2 |= (composer1.changed(f1) ? 0x20000 : 0x10000);
        }
        if((v & 0x380000) == 0) {
            v2 |= ((v1 & 0x40) != 0 || !composer1.changed(mainAxisAlignment1) ? 0x80000 : 0x100000);
        }
        if((v1 & 0x80) != 0) {
            v2 |= 0xC00000;
        }
        else if((v & 0x1C00000) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x800000 : 0x400000);
        }
        if((0x16DB6DB & v2) != 4793490 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v1 & 1) == 0 ? modifier0 : Modifier.Companion;
                if((v1 & 2) != 0) {
                    sizeMode1 = SizeMode.Wrap;
                }
                if((v1 & 4) != 0) {
                    mainAxisAlignment2 = MainAxisAlignment.Start;
                }
                if((v1 & 8) != 0) {
                    f2 = 0.0f;
                }
                if((v1 & 16) != 0) {
                    flowCrossAxisAlignment1 = FlowCrossAxisAlignment.Start;
                }
                float f7 = (v1 & 0x20) == 0 ? f1 : 0.0f;
                if((v1 & 0x40) == 0) {
                    mainAxisAlignment5 = mainAxisAlignment1;
                    f5 = f7;
                    sizeMode3 = sizeMode1;
                    mainAxisAlignment6 = mainAxisAlignment2;
                }
                else {
                    v2 &= 0xFFC7FFFF;
                    f5 = f7;
                    sizeMode3 = sizeMode1;
                    mainAxisAlignment6 = mainAxisAlignment2;
                    mainAxisAlignment5 = mainAxisAlignment6;
                }
                f6 = f2;
                flowCrossAxisAlignment3 = flowCrossAxisAlignment1;
                modifier2 = modifier3;
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 0x40) != 0) {
                    v2 &= 0xFFC7FFFF;
                }
                f5 = f1;
                mainAxisAlignment5 = mainAxisAlignment1;
                sizeMode3 = sizeMode1;
                mainAxisAlignment6 = mainAxisAlignment2;
                f6 = f2;
                flowCrossAxisAlignment3 = flowCrossAxisAlignment1;
                modifier2 = modifier0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xF7CCE859, v2, -1, "com.google.accompanist.flowlayout.FlowRow (Flow.kt:46)");
            }
            FlowKt.a(modifier2, LayoutOrientation.Horizontal, sizeMode3, mainAxisAlignment6, f6, flowCrossAxisAlignment3, f5, mainAxisAlignment5, function20, composer1, v2 & 14 | 0x30 | v2 << 3 & 0x380 | v2 << 3 & 0x1C00 | 0xE000 & v2 << 3 | v2 << 3 & 0x70000 | v2 << 3 & 0x380000 | v2 << 3 & 0x1C00000 | v2 << 3 & 0xE000000);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            sizeMode2 = sizeMode3;
            mainAxisAlignment3 = mainAxisAlignment6;
            f4 = f6;
            flowCrossAxisAlignment2 = flowCrossAxisAlignment3;
            f3 = f5;
            mainAxisAlignment4 = mainAxisAlignment5;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            f3 = f1;
            sizeMode2 = sizeMode1;
            mainAxisAlignment3 = mainAxisAlignment2;
            f4 = f2;
            flowCrossAxisAlignment2 = flowCrossAxisAlignment1;
            mainAxisAlignment4 = mainAxisAlignment1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d(modifier1, sizeMode2, mainAxisAlignment3, f4, flowCrossAxisAlignment2, f3, mainAxisAlignment4, function20, v, v1, 1));
        }
    }

    public static final void a(Modifier modifier0, LayoutOrientation layoutOrientation0, SizeMode sizeMode0, MainAxisAlignment mainAxisAlignment0, float f, FlowCrossAxisAlignment flowCrossAxisAlignment0, float f1, MainAxisAlignment mainAxisAlignment1, Function2 function20, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-1567419051);
        int v1 = (v & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(layoutOrientation0) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changed(sizeMode0) ? 0x100 : 0x80);
        }
        if((v & 0x1C00) == 0) {
            v1 |= (composer1.changed(mainAxisAlignment0) ? 0x800 : 0x400);
        }
        if((0xE000 & v) == 0) {
            v1 |= (composer1.changed(f) ? 0x4000 : 0x2000);
        }
        if((0x70000 & v) == 0) {
            v1 |= (composer1.changed(flowCrossAxisAlignment0) ? 0x20000 : 0x10000);
        }
        if((0x380000 & v) == 0) {
            v1 |= (composer1.changed(f1) ? 0x100000 : 0x80000);
        }
        if((0x1C00000 & v) == 0) {
            v1 |= (composer1.changed(mainAxisAlignment1) ? 0x800000 : 0x400000);
        }
        if((0xE000000 & v) == 0) {
            v1 |= (composer1.changedInstance(function20) ? 0x4000000 : 0x2000000);
        }
        if((0xB6DB6DB & v1) != 0x2492492 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1567419051, v1, -1, "com.google.accompanist.flowlayout.Flow (Flow.kt:131)");
            }
            b b0 = new b(layoutOrientation0, f, sizeMode0, f1, mainAxisAlignment0, mainAxisAlignment1, flowCrossAxisAlignment0);
            composer1.startReplaceableGroup(-1323940314);
            Density density0 = (Density)composer1.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection0 = (LayoutDirection)composer1.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration0 = (ViewConfiguration)composer1.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
            Function3 function30 = LayoutKt.materializerOf(modifier0);
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
            Updater.set-impl(composer1, b0, composeUiNode$Companion0.getSetMeasurePolicy());
            Updater.set-impl(composer1, density0, composeUiNode$Companion0.getSetDensity());
            Updater.set-impl(composer1, layoutDirection0, composeUiNode$Companion0.getSetLayoutDirection());
            Updater.set-impl(composer1, viewConfiguration0, composeUiNode$Companion0.getSetViewConfiguration());
            a.w(0, function30, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
            function20.invoke(composer1, ((int)(((v1 << 3 & 0x70 | v1 >> 24 & 14) << 9 & 0x1C00 | 6) >> 9 & 14)));
            composer1.endReplaceableGroup();
            composer1.endNode();
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
            scopeUpdateScope0.updateScope(new c(modifier0, layoutOrientation0, sizeMode0, mainAxisAlignment0, f, flowCrossAxisAlignment0, f1, mainAxisAlignment1, function20, v));
        }
    }

    public static final int access$Flow_F4y8cZ0$crossAxisSize(Placeable placeable0, LayoutOrientation layoutOrientation0) {
        return layoutOrientation0 == LayoutOrientation.Horizontal ? placeable0.getHeight() : placeable0.getWidth();
    }

    public static final int access$Flow_F4y8cZ0$mainAxisSize(Placeable placeable0, LayoutOrientation layoutOrientation0) {
        return layoutOrientation0 == LayoutOrientation.Horizontal ? placeable0.getWidth() : placeable0.getHeight();
    }
}

