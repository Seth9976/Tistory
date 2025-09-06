package androidx.compose.material;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.i;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.room.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.b;
import p0.c;
import p0.d;
import p0.f;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001A{\u0010\u000F\u001A\u00020\u00012\u0011\u0010\u0003\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\u0015\b\u0002\u0010\u0006\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0015\b\u0002\u0010\u0007\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\f\u001A\u00020\nH\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000E\u001A=\u0010\u0011\u001A\u00020\u0001*\u00020\u00102\u0013\u0010\u0006\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0013\u0010\u0007\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u0002H\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001A5\u0010\u0019\u001A\u00020\u00012\u0006\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0015\u001A\u00020\u00132\u0011\u0010\u0016\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u001A"}, d2 = {"Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "buttons", "Landroidx/compose/ui/Modifier;", "modifier", "title", "text", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "AlertDialogContent-WMdw5o4", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/runtime/Composer;II)V", "AlertDialogContent", "Landroidx/compose/foundation/layout/ColumnScope;", "AlertDialogBaselineLayout", "(Landroidx/compose/foundation/layout/ColumnScope;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/unit/Dp;", "mainAxisSpacing", "crossAxisSpacing", "content", "AlertDialogFlowRow-ixp7dh8", "(FFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "AlertDialogFlowRow", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material/AlertDialogKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,295:1\n79#2,11:296\n79#2,11:330\n92#2:362\n79#2,11:370\n92#2:402\n92#2:407\n76#2,14:414\n92#2:448\n456#3,8:307\n464#3,3:321\n456#3,8:341\n464#3,3:355\n467#3,3:359\n456#3,8:381\n464#3,3:395\n467#3,3:399\n467#3,3:404\n456#3,8:428\n464#3,6:442\n3737#4,6:315\n3737#4,6:349\n3737#4,6:389\n3737#4,6:436\n68#5,6:324\n74#5:358\n78#5:363\n68#5,6:364\n74#5:398\n78#5:403\n1116#6,6:408\n154#7:449\n154#7:450\n*S KotlinDebug\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material/AlertDialogKt\n*L\n99#1:296,11\n102#1:330,11\n102#1:362\n107#1:370,11\n107#1:402\n99#1:407\n195#1:414,14\n195#1:448\n99#1:307,8\n99#1:321,3\n102#1:341,8\n102#1:355,3\n102#1:359,3\n107#1:381,8\n107#1:395,3\n107#1:399,3\n99#1:404,3\n195#1:428,8\n195#1:442,6\n99#1:315,6\n102#1:349,6\n107#1:389,6\n195#1:436,6\n102#1:324,6\n102#1:358\n102#1:363\n107#1:364,6\n107#1:398\n107#1:403\n195#1:408,6\n286#1:449\n287#1:450\n*E\n"})
public final class AlertDialogKt {
    public static final Modifier a;
    public static final Modifier b;
    public static final long c;
    public static final long d;
    public static final long e;

    static {
        AlertDialogKt.a = PaddingKt.padding-qDBjuR0$default(Modifier.Companion, 24.0f, 0.0f, 24.0f, 0.0f, 10, null);
        AlertDialogKt.b = PaddingKt.padding-qDBjuR0$default(Modifier.Companion, 24.0f, 0.0f, 24.0f, 28.0f, 2, null);
        AlertDialogKt.c = 0x142200000L;
        AlertDialogKt.d = 0x142100000L;
        AlertDialogKt.e = 0x142180000L;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void AlertDialogBaselineLayout(@NotNull ColumnScope columnScope0, @Nullable Function2 function20, @Nullable Function2 function21, @Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xDEE2A029);
        int v1 = (v & 14) == 0 ? (composer1.changed(columnScope0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changedInstance(function20) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changedInstance(function21) ? 0x100 : 0x80);
        }
        if((v1 & 731) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xDEE2A029, v1, -1, "androidx.compose.material.AlertDialogBaselineLayout (AlertDialog.kt:97)");
            }
            Modifier modifier0 = columnScope0.weight(Modifier.Companion, 1.0f, false);
            b b0 = b.b;
            composer1.startReplaceableGroup(-1323940314);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
            Function3 function30 = LayoutKt.modifierMaterializerOf(modifier0);
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
            Updater.set-impl(composer1, compositionLocalMap0, composeUiNode$Companion0.getSetResolvedCompositionLocals());
            Function2 function22 = composeUiNode$Companion0.getSetCompositeKeyHash();
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                a.t(v2, composer1, v2, function22);
            }
            r0.a.w(0, function30, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
            composer1.startReplaceableGroup(0xBAD1F21E);
            if(function20 != null) {
                Modifier modifier1 = columnScope0.align(LayoutIdKt.layoutId(AlertDialogKt.a, "title"), Alignment.Companion.getStart());
                composer1.startReplaceableGroup(0x2BB5B5D7);
                MeasurePolicy measurePolicy0 = r0.a.i(Alignment.Companion, false, composer1, 0, -1323940314);
                int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
                Function0 function01 = composeUiNode$Companion0.getConstructor();
                Function3 function31 = LayoutKt.modifierMaterializerOf(modifier1);
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
                Function2 function23 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap1);
                if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                    a.t(v3, composer1, v3, function23);
                }
                r0.a.w(0, function31, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
                function20.invoke(composer1, 0);
                composer1.endReplaceableGroup();
                composer1.endNode();
                composer1.endReplaceableGroup();
                composer1.endReplaceableGroup();
            }
            composer1.endReplaceableGroup();
            composer1.startReplaceableGroup(-1735756505);
            if(function21 != null) {
                Modifier modifier2 = columnScope0.align(LayoutIdKt.layoutId(AlertDialogKt.b, "text"), Alignment.Companion.getStart());
                composer1.startReplaceableGroup(0x2BB5B5D7);
                MeasurePolicy measurePolicy1 = r0.a.i(Alignment.Companion, false, composer1, 0, -1323940314);
                int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                CompositionLocalMap compositionLocalMap2 = composer1.getCurrentCompositionLocalMap();
                Function0 function02 = composeUiNode$Companion0.getConstructor();
                Function3 function32 = LayoutKt.modifierMaterializerOf(modifier2);
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
                Function2 function24 = a.r(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap2);
                if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                    a.t(v4, composer1, v4, function24);
                }
                r0.a.w(0, function32, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
                function21.invoke(composer1, 0);
                composer1.endReplaceableGroup();
                composer1.endNode();
                composer1.endReplaceableGroup();
                composer1.endReplaceableGroup();
            }
            composer1.endReplaceableGroup();
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
            scopeUpdateScope0.updateScope(new androidx.compose.foundation.text.selection.a(columnScope0, function20, function21, v, 13));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void AlertDialogContent-WMdw5o4(@NotNull Function2 function20, @Nullable Modifier modifier0, @Nullable Function2 function21, @Nullable Function2 function22, @Nullable Shape shape0, long v, long v1, @Nullable Composer composer0, int v2, int v3) {
        long v6;
        long v5;
        Shape shape1;
        Function2 function24;
        Modifier modifier1;
        Shape shape2;
        Modifier modifier2;
        Function2 function23;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0xE4F5660F);
        if((v3 & 1) == 0) {
            v4 = (v2 & 14) == 0 ? (composer1.changedInstance(function20) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v4 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
            function23 = function21;
        }
        else if((v2 & 0x380) == 0) {
            function23 = function21;
            v4 |= (composer1.changedInstance(function23) ? 0x100 : 0x80);
        }
        else {
            function23 = function21;
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v2 & 0x1C00) == 0) {
            v4 |= (composer1.changedInstance(function22) ? 0x800 : 0x400);
        }
        if((0xE000 & v2) == 0) {
            v4 |= ((v3 & 16) != 0 || !composer1.changed(shape0) ? 0x2000 : 0x4000);
        }
        if((0x70000 & v2) == 0) {
            v4 |= ((v3 & 0x20) != 0 || !composer1.changed(v) ? 0x10000 : 0x20000);
        }
        if((0x380000 & v2) == 0) {
            v4 |= ((v3 & 0x40) != 0 || !composer1.changed(v1) ? 0x80000 : 0x100000);
        }
        if((v4 & 0x2DB6DB) != 0x92492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v3 & 2) == 0 ? modifier0 : Modifier.Companion;
                function24 = null;
                if((v3 & 4) != 0) {
                    function23 = null;
                }
                if((v3 & 8) == 0) {
                    function24 = function22;
                }
                if((v3 & 16) == 0) {
                    shape2 = shape0;
                }
                else {
                    shape2 = MaterialTheme.INSTANCE.getShapes(composer1, 6).getMedium();
                    v4 &= 0xFFFF1FFF;
                }
                if((v3 & 0x20) == 0) {
                    v5 = v;
                }
                else {
                    v5 = MaterialTheme.INSTANCE.getColors(composer1, 6).getSurface-0d7_KjU();
                    v4 &= 0xFFF8FFFF;
                }
                if((v3 & 0x40) == 0) {
                    v6 = v1;
                }
                else {
                    long v7 = ColorsKt.contentColorFor-ek8zF_U(v5, composer1, v4 >> 15 & 14);
                    v4 &= 0xFFC7FFFF;
                    v6 = v7;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 16) != 0) {
                    v4 &= 0xFFFF1FFF;
                }
                if((v3 & 0x20) != 0) {
                    v4 &= 0xFFF8FFFF;
                }
                if((v3 & 0x40) != 0) {
                    v4 &= 0xFFC7FFFF;
                }
                modifier2 = modifier0;
                function24 = function22;
                shape2 = shape0;
                v5 = v;
                v6 = v1;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xE4F5660F, v4, -1, "androidx.compose.material.AlertDialogContent (AlertDialog.kt:53)");
            }
            SurfaceKt.Surface-F-jzlyU(modifier2, shape2, v5, v6, null, 0.0f, ComposableLambdaKt.composableLambda(composer1, 629950291, true, new c(function23, function24, function20)), composer1, v4 >> 3 & 14 | 0x180000 | v4 >> 9 & 0x70 | v4 >> 9 & 0x380 | v4 >> 9 & 0x1C00, 0x30);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            shape1 = shape2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            function24 = function22;
            shape1 = shape0;
            v5 = v;
            v6 = v1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d(function20, modifier1, function23, function24, shape1, v5, v6, v2, v3));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void AlertDialogFlowRow-ixp7dh8(float f, float f1, @NotNull Function2 function20, @Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x4608554);
        int v1 = (v & 14) == 0 ? (composer1.changed(f) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(f1) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changedInstance(function20) ? 0x100 : 0x80);
        }
        if((v1 & 731) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x4608554, v1, -1, "androidx.compose.material.AlertDialogFlowRow (AlertDialog.kt:193)");
            }
            composer1.startReplaceableGroup(-2007963684);
            boolean z = composer1.changed(f);
            boolean z1 = composer1.changed(f1);
            f f2 = composer1.rememberedValue();
            if(z || z1 || f2 == Composer.Companion.getEmpty()) {
                f2 = new f(f, f1);
                composer1.updateRememberedValue(f2);
            }
            composer1.endReplaceableGroup();
            composer1.startReplaceableGroup(-1323940314);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
            Function3 function30 = LayoutKt.modifierMaterializerOf(Modifier.Companion);
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
            Function2 function21 = a.r(composeUiNode$Companion0, composer1, f2, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                a.t(v2, composer1, v2, function21);
            }
            r0.a.w(0, function30, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
            function20.invoke(composer1, ((int)(((v1 >> 6 & 14) << 9 & 0x1C00 | 6) >> 9 & 14)));
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
            scopeUpdateScope0.updateScope(new i(f, f1, function20, v, 1));
        }
    }

    public static final long access$getTextBaselineDistanceFromTitle$p() [...] // 潜在的解密器

    public static final long access$getTextBaselineDistanceFromTop$p() [...] // 潜在的解密器

    public static final long access$getTitleBaselineDistanceFromTop$p() [...] // 潜在的解密器
}

