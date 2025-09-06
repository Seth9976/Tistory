package p0;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.fc;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.ui.Alignment.Companion;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.room.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

public final class a6 {
    public static final a6 a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final float f;
    public static final float g;
    public static final float h;
    public static final float i;

    static {
        a6.a = new a6();  // 初始化器: Ljava/lang/Object;-><init>()V
        a6.b = 48.0f;
        a6.c = 56.0f;
        a6.d = 40.0f;
        a6.e = 16.0f;
        a6.f = 8.0f;
        a6.g = 16.0f;
        a6.h = 16.0f;
        a6.i = 16.0f;
    }

    public final void a(Modifier modifier0, Function2 function20, ComposableLambda composableLambda0, ComposableLambda composableLambda1, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x8FAD8E0D);
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
            v1 |= (composer1.changed(this) ? 0x4000 : 0x2000);
        }
        if((0xB6DB & v1) != 9362 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x8FAD8E0D, v1, -1, "androidx.compose.material.OneLine.ListItem (ListItem.kt:143)");
            }
            Modifier modifier1 = SizeKt.heightIn-VpY3zN4$default(modifier0, (function20 == null ? a6.b : a6.c), 0.0f, 2, null);
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
            composer1.startReplaceableGroup(0x6CD4C917);
            if(function20 != null) {
                Modifier modifier2 = PaddingKt.padding-qDBjuR0$default(SizeKt.widthIn-VpY3zN4$default(rowScopeInstance0.align(Modifier.Companion, alignment$Companion0.getCenterVertically()), a6.e + a6.d, 0.0f, 2, null), a6.e, a6.f, 0.0f, a6.f, 4, null);
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
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier3 = PaddingKt.padding-qDBjuR0$default(rowScopeInstance0.align(RowScope.weight$default(rowScopeInstance0, modifier$Companion0, 1.0f, false, 2, null), alignment$Companion0.getCenterVertically()), a6.g, 0.0f, a6.h, 0.0f, 10, null);
            composer1.startReplaceableGroup(0x2BB5B5D7);
            MeasurePolicy measurePolicy2 = BoxKt.rememberBoxMeasurePolicy(alignment$Companion0.getCenterStart(), false, composer1, 6);
            composer1.startReplaceableGroup(-1323940314);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap2 = composer1.getCurrentCompositionLocalMap();
            Function0 function02 = composeUiNode$Companion0.getConstructor();
            Function3 function32 = LayoutKt.modifierMaterializerOf(modifier3);
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
            Function2 function23 = a.r(composeUiNode$Companion0, composer1, measurePolicy2, composer1, compositionLocalMap2);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                a.t(v4, composer1, v4, function23);
            }
            r0.a.w(0, function32, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
            composableLambda0.invoke(composer1, ((int)(v1 >> 6 & 14)));
            composer1.endReplaceableGroup();
            composer1.endNode();
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            composer1.startReplaceableGroup(0x84B70194);
            if(composableLambda1 != null) {
                Modifier modifier4 = PaddingKt.padding-qDBjuR0$default(rowScopeInstance0.align(modifier$Companion0, alignment$Companion0.getCenterVertically()), 0.0f, 0.0f, a6.i, 0.0f, 11, null);
                composer1.startReplaceableGroup(0x2BB5B5D7);
                MeasurePolicy measurePolicy3 = r0.a.i(alignment$Companion0, false, composer1, 0, -1323940314);
                int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                CompositionLocalMap compositionLocalMap3 = composer1.getCurrentCompositionLocalMap();
                Function0 function03 = composeUiNode$Companion0.getConstructor();
                Function3 function33 = LayoutKt.modifierMaterializerOf(modifier4);
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
                Function2 function24 = a.r(composeUiNode$Companion0, composer1, measurePolicy3, composer1, compositionLocalMap3);
                if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v5)) {
                    a.t(v5, composer1, v5, function24);
                }
                r0.a.w(0, function33, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
                composableLambda1.invoke(composer1, ((int)(v1 >> 9 & 14)));
                composer1.endReplaceableGroup();
                composer1.endNode();
                composer1.endReplaceableGroup();
                composer1.endReplaceableGroup();
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
            scopeUpdateScope0.updateScope(new fc(this, modifier0, function20, composableLambda0, composableLambda1, v));
        }
    }
}

