package p0;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.selection.y;
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
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

public final class ac {
    public static final ac a;
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

    static {
        ac.a = new ac();  // 初始化器: Ljava/lang/Object;-><init>()V
        ac.b = 88.0f;
        ac.c = 40.0f;
        ac.d = 16.0f;
        ac.e = 16.0f;
        ac.f = 16.0f;
        ac.g = 16.0f;
        ac.h = 28.0f;
        ac.i = 20.0f;
        ac.j = 20.0f;
        ac.k = 16.0f;
        ac.l = 16.0f;
    }

    public final void a(Modifier modifier0, Function2 function20, ComposableLambda composableLambda0, ComposableLambda composableLambda1, ComposableLambda composableLambda2, ComposableLambda composableLambda3, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x684AE52D);
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
                ComposerKt.traceEventStart(0x684AE52D, v1, -1, "androidx.compose.material.ThreeLine.ListItem (ListItem.kt:304)");
            }
            Modifier modifier1 = SizeKt.heightIn-VpY3zN4$default(modifier0, ac.b, 0.0f, 2, null);
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
            RowScopeInstance rowScopeInstance0 = RowScopeInstance.INSTANCE;
            composer1.startReplaceableGroup(0xEF49B277);
            if(function20 != null) {
                float f = ac.d + ac.c;
                Modifier modifier2 = PaddingKt.padding-qDBjuR0$default(SizeKt.sizeIn-qDBjuR0$default(Modifier.Companion, f, f, 0.0f, 0.0f, 12, null), ac.d, ac.e, 0.0f, ac.e, 4, null);
                composer1.startReplaceableGroup(0x2BB5B5D7);
                MeasurePolicy measurePolicy1 = BoxKt.rememberBoxMeasurePolicy(alignment$Companion0.getCenterStart(), false, composer1, 6);
                composer1.startReplaceableGroup(-1323940314);
                int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
                Function0 function01 = composeUiNode$Companion0.getConstructor();
                Function3 function31 = LayoutKt.modifierMaterializerOf(modifier2);
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
            float f1 = ac.h;
            List list0 = CollectionsKt__CollectionsKt.listOf(new Dp[]{Dp.box-impl(f1), Dp.box-impl(ac.i), Dp.box-impl(ac.j)});
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            ListItemKt.access$BaselinesOffsetColumn(list0, PaddingKt.padding-qDBjuR0$default(RowScope.weight$default(rowScopeInstance0, modifier$Companion0, 1.0f, false, 2, null), ac.f, 0.0f, ac.g, 0.0f, 10, null), ComposableLambdaKt.composableLambda(composer1, 0xED0A445B, true, new y(composableLambda2, composableLambda0, 9, composableLambda1)), composer1, 390, 0);
            composer1.startReplaceableGroup(0xD7883FFA);
            if(composableLambda3 != null) {
                Modifier modifier3 = PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, ac.k, ac.l, 0.0f, 9, null);
                ListItemKt.access$OffsetToBaselineOrCenter-Kz89ssw(f1 - ac.k, modifier3, composableLambda3, composer1, v1 >> 9 & 0x380 | 54, 0);
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
            scopeUpdateScope0.updateScope(new c5(this, modifier0, function20, composableLambda0, composableLambda1, composableLambda2, composableLambda3, v, 2));
        }
    }
}

