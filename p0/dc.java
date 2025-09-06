package p0;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ListItemKt;
import androidx.compose.material3.c5;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment.Companion;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.room.a;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

public final class dc {
    public static final dc a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final float f;
    public static final float g;
    public static final float h;
    public static final float i;
    public static final float j;
    public static final float k;
    public static final float l;
    public static final float m;
    public static final float n;
    public static final float o;

    static {
        dc.a = new dc();  // 初始化器: Ljava/lang/Object;-><init>()V
        dc.b = 64.0f;
        dc.c = 72.0f;
        dc.d = 40.0f;
        dc.e = 16.0f;
        dc.f = 16.0f;
        dc.g = 16.0f;
        dc.h = 16.0f;
        dc.i = 24.0f;
        dc.j = 20.0f;
        dc.k = 28.0f;
        dc.l = 32.0f;
        dc.m = 20.0f;
        dc.n = 20.0f;
        dc.o = 16.0f;
    }

    public final void a(Modifier modifier0, Function2 function20, ComposableLambda composableLambda0, ComposableLambda composableLambda1, ComposableLambda composableLambda2, ComposableLambda composableLambda3, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xB017DE7F);
        int v1 = (v & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changedInstance(function20) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changedInstance(composableLambda0) ? 0x100 : 0x80);
        }
        if((v & 0x1C00) == 0) {
            v1 |= (composer1.changedInstance(composableLambda1) ? 0x800 : 0x400);
        }
        if((0xE000 & v) == 0) {
            v1 |= (composer1.changedInstance(composableLambda2) ? 0x4000 : 0x2000);
        }
        if((0x70000 & v) == 0) {
            v1 |= (composer1.changedInstance(composableLambda3) ? 0x20000 : 0x10000);
        }
        if((0x380000 & v) == 0) {
            v1 |= (composer1.changed(this) ? 0x100000 : 0x80000);
        }
        if((0x2DB6DB & v1) != 0x92492 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xB017DE7F, v1, -1, "androidx.compose.material.TwoLine.ListItem (ListItem.kt:206)");
            }
            float f = function20 == null ? dc.b : dc.c;
            Modifier modifier1 = SizeKt.heightIn-VpY3zN4$default(modifier0, f, 0.0f, 2, null);
            composer1.startReplaceableGroup(693286680);
            Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), alignment$Companion0.getTop(), composer1, 0);
            composer1.startReplaceableGroup(-1323940314);
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
            Function2 function21 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                a.t(v2, composer1, v2, function21);
            }
            r0.a.w(0, function30, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier2 = PaddingKt.padding-qDBjuR0$default(RowScope.weight$default(RowScopeInstance.INSTANCE, modifier$Companion0, 1.0f, false, 2, null), dc.g, 0.0f, dc.h, 0.0f, 10, null);
            composer1.startReplaceableGroup(0xEFE83320);
            if(function20 != null) {
                Modifier modifier3 = PaddingKt.padding-qDBjuR0$default(SizeKt.sizeIn-qDBjuR0$default(modifier$Companion0, dc.d + dc.e, f, 0.0f, 0.0f, 12, null), dc.e, dc.f, 0.0f, dc.f, 4, null);
                composer1.startReplaceableGroup(0x2BB5B5D7);
                MeasurePolicy measurePolicy1 = BoxKt.rememberBoxMeasurePolicy(alignment$Companion0.getTopStart(), false, composer1, 6);
                composer1.startReplaceableGroup(-1323940314);
                int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
                Function0 function01 = composeUiNode$Companion0.getConstructor();
                Function3 function31 = LayoutKt.modifierMaterializerOf(modifier3);
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
                Function2 function22 = a.r(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
                if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                    a.t(v3, composer1, v3, function22);
                }
                r0.a.w(0, function31, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
                function20.invoke(composer1, ((int)(v1 >> 3 & 14)));
                composer1.endReplaceableGroup();
                composer1.endNode();
                composer1.endReplaceableGroup();
                composer1.endReplaceableGroup();
            }
            composer1.endReplaceableGroup();
            float f1 = dc.k;
            float f2 = dc.l;
            if(composableLambda2 == null) {
                composer1.startReplaceableGroup(0xEFE836A6);
                ListItemKt.access$BaselinesOffsetColumn(CollectionsKt__CollectionsKt.listOf(new Dp[]{Dp.box-impl((function20 == null ? f1 : f2)), Dp.box-impl((function20 == null ? dc.m : dc.n))}), modifier2, ComposableLambdaKt.composableLambda(composer1, 0x3B3CBDC8, true, new bc(composableLambda0, composableLambda1, 1)), composer1, 0x180, 0);
            }
            else {
                composer1.startReplaceableGroup(0xEFE8358E);
                ListItemKt.access$BaselinesOffsetColumn(CollectionsKt__CollectionsKt.listOf(new Dp[]{Dp.box-impl(dc.i), Dp.box-impl(dc.j)}), modifier2, ComposableLambdaKt.composableLambda(composer1, -1675021441, true, new bc(composableLambda2, composableLambda0, 0)), composer1, 390, 0);
            }
            composer1.endReplaceableGroup();
            composer1.startReplaceableGroup(-2000988210);
            if(composableLambda3 != null) {
                ListItemKt.access$OffsetToBaselineOrCenter-Kz89ssw((function20 == null ? f1 : f2), null, ComposableLambdaKt.composableLambda(composer1, 0x9AD9F450, true, new cc(f, composableLambda3)), composer1, 0x180, 2);
            }
            composer1.endReplaceableGroup();
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
            scopeUpdateScope0.updateScope(new c5(this, modifier0, function20, composableLambda0, composableLambda1, composableLambda2, composableLambda3, v, 3));
        }
    }
}

