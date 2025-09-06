package p0;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ContentAlphaKt;
import androidx.compose.material.ContentColorKt;
import androidx.compose.material.SelectableChipColors;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.room.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class m2 extends Lambda implements Function2 {
    public final Function3 A;
    public final SelectableChipColors B;
    public final boolean C;
    public final State D;
    public final Function2 w;
    public final boolean x;
    public final Function2 y;
    public final Function2 z;

    public m2(Function2 function20, boolean z, Function2 function21, Function2 function22, Function3 function30, SelectableChipColors selectableChipColors0, boolean z1, State state0) {
        this.w = function20;
        this.x = z;
        this.y = function21;
        this.z = function22;
        this.A = function30;
        this.B = selectableChipColors0;
        this.C = z1;
        this.D = state0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Function2 function24;
        Modifier modifier2;
        Composer composer0 = (Composer)object0;
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xA3FCF9CE, v, -1, "androidx.compose.material.FilterChip.<anonymous>.<anonymous>.<anonymous> (Chip.kt:215)");
        }
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = SizeKt.defaultMinSize-VpY3zN4$default(IntrinsicKt.width(modifier$Companion0, IntrinsicSize.Max), 0.0f, 32.0f, 1, null);
        Function2 function20 = this.y;
        boolean z = this.x;
        Function2 function21 = this.w;
        Function2 function22 = this.z;
        Modifier modifier1 = PaddingKt.padding-qDBjuR0$default(modifier0, (function21 != null || z && function20 != null ? 0.0f : 12.0f), 0.0f, (function22 == null ? 12.0f : 0.0f), 0.0f, 10, null);
        Arrangement arrangement0 = Arrangement.INSTANCE;
        androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
        composer0.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getCenterVertically(), composer0, 54);
        composer0.startReplaceableGroup(-1323940314);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap0 = composer0.getCurrentCompositionLocalMap();
        androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function00 = composeUiNode$Companion0.getConstructor();
        Function3 function30 = LayoutKt.modifierMaterializerOf(modifier1);
        if(composer0.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer0.startReusableNode();
        if(composer0.getInserting()) {
            composer0.createNode(function00);
        }
        else {
            composer0.useNode();
        }
        Function2 function23 = a.r(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v1)) {
            a.t(v1, composer0, v1, function23);
        }
        r0.a.w(0, function30, SkippableUpdater.box-impl(composer0), composer0, 2058660585);
        RowScopeInstance rowScopeInstance0 = RowScopeInstance.INSTANCE;
        composer0.startReplaceableGroup(0x8C29E31B);
        if(function21 != null || z && function20 != null) {
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(modifier$Companion0, 4.0f), composer0, 6);
            composer0.startReplaceableGroup(0x2BB5B5D7);
            MeasurePolicy measurePolicy1 = BoxKt.rememberBoxMeasurePolicy(alignment$Companion0.getTopStart(), false, composer0, 0);
            composer0.startReplaceableGroup(-1323940314);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
            CompositionLocalMap compositionLocalMap1 = composer0.getCurrentCompositionLocalMap();
            Function0 function01 = composeUiNode$Companion0.getConstructor();
            Function3 function31 = LayoutKt.modifierMaterializerOf(modifier$Companion0);
            if(composer0.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer0.startReusableNode();
            if(composer0.getInserting()) {
                composer0.createNode(function01);
            }
            else {
                composer0.useNode();
            }
            Function2 function25 = a.r(composeUiNode$Companion0, composer0, measurePolicy1, composer0, compositionLocalMap1);
            if(composer0.getInserting()) {
                function24 = function22;
                a.t(v2, composer0, v2, function25);
            }
            else {
                function24 = function22;
                if(!Intrinsics.areEqual(composer0.rememberedValue(), v2)) {
                    a.t(v2, composer0, v2, function25);
                }
            }
            r0.a.w(0, function31, SkippableUpdater.box-impl(composer0), composer0, 2058660585);
            composer0.startReplaceableGroup(0x26BDFEFF);
            SelectableChipColors selectableChipColors0 = this.B;
            boolean z1 = this.C;
            if(function21 != null) {
                State state0 = selectableChipColors0.leadingIconColor(z1, z, composer0, 0);
                CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(state0.getValue()), ContentAlphaKt.getLocalContentAlpha().provides(Color.getAlpha-impl(((Color)state0.getValue()).unbox-impl()))}, function21, composer0, 8);
            }
            composer0.endReplaceableGroup();
            composer0.startReplaceableGroup(0x8C29E649);
            if(z && function20 != null) {
                State state1 = this.D;
                long v3 = ((Color)state1.getValue()).unbox-impl();
                composer0.startReplaceableGroup(0x26BE023E);
                if(function21 == null) {
                    modifier2 = modifier$Companion0;
                }
                else {
                    modifier2 = ClipKt.clip(BackgroundKt.background-bw27NRU(SizeKt.requiredSize-3ABfNKs(modifier$Companion0, 24.0f), ((Color)state1.getValue()).unbox-impl(), RoundedCornerShapeKt.getCircleShape()), RoundedCornerShapeKt.getCircleShape());
                    v3 = ((Color)selectableChipColors0.backgroundColor(z1, true, composer0, 0).getValue()).unbox-impl();
                }
                composer0.endReplaceableGroup();
                composer0.startReplaceableGroup(0x2BB5B5D7);
                MeasurePolicy measurePolicy2 = BoxKt.rememberBoxMeasurePolicy(alignment$Companion0.getCenter(), false, composer0, 6);
                composer0.startReplaceableGroup(-1323940314);
                int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
                CompositionLocalMap compositionLocalMap2 = composer0.getCurrentCompositionLocalMap();
                Function0 function02 = composeUiNode$Companion0.getConstructor();
                Function3 function32 = LayoutKt.modifierMaterializerOf(modifier2);
                if(composer0.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer0.startReusableNode();
                if(composer0.getInserting()) {
                    composer0.createNode(function02);
                }
                else {
                    composer0.useNode();
                }
                Function2 function26 = a.r(composeUiNode$Companion0, composer0, measurePolicy2, composer0, compositionLocalMap2);
                if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v4)) {
                    a.t(v4, composer0, v4, function26);
                }
                function32.invoke(SkippableUpdater.box-impl(composer0), composer0, 0);
                composer0.startReplaceableGroup(2058660585);
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.box-impl(v3)), function20, composer0, ProvidedValue.$stable);
                composer0.endReplaceableGroup();
                composer0.endNode();
                composer0.endReplaceableGroup();
                composer0.endReplaceableGroup();
            }
            composer0.endReplaceableGroup();
            composer0.endReplaceableGroup();
            composer0.endNode();
            composer0.endReplaceableGroup();
            composer0.endReplaceableGroup();
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(modifier$Companion0, 8.0f), composer0, 6);
        }
        else {
            function24 = function22;
        }
        composer0.endReplaceableGroup();
        Modifier modifier3 = RowScope.weight$default(rowScopeInstance0, modifier$Companion0, 1.0f, false, 2, null);
        composer0.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicy3 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getCenterVertically(), composer0, 54);
        composer0.startReplaceableGroup(-1323940314);
        int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap3 = composer0.getCurrentCompositionLocalMap();
        Function0 function03 = composeUiNode$Companion0.getConstructor();
        Function3 function33 = LayoutKt.modifierMaterializerOf(modifier3);
        if(composer0.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer0.startReusableNode();
        if(composer0.getInserting()) {
            composer0.createNode(function03);
        }
        else {
            composer0.useNode();
        }
        Function2 function27 = a.r(composeUiNode$Companion0, composer0, measurePolicy3, composer0, compositionLocalMap3);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v5)) {
            a.t(v5, composer0, v5, function27);
        }
        r0.a.w(0, function33, SkippableUpdater.box-impl(composer0), composer0, 2058660585);
        this.A.invoke(rowScopeInstance0, composer0, 6);
        composer0.endReplaceableGroup();
        composer0.endNode();
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();
        composer0.startReplaceableGroup(0xB996E84C);
        if(function24 != null) {
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(modifier$Companion0, 8.0f), composer0, 6);
            function24.invoke(composer0, 0);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(modifier$Companion0, 8.0f), composer0, 6);
        }
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();
        composer0.endNode();
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

