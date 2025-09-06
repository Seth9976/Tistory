package androidx.compose.material;

import aa.r;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.j0;
import androidx.compose.material3.jf;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import p0.v3;
import p0.x3;
import p0.z3;
import r0.a;

public final class q extends Lambda implements Function3 {
    public final long A;
    public final long B;
    public final float C;
    public final Function2 D;
    public final CoroutineScope E;
    public final Function3 F;
    public final DrawerState w;
    public final boolean x;
    public final long y;
    public final Shape z;

    public q(DrawerState drawerState0, boolean z, long v, Shape shape0, long v1, long v2, float f, Function2 function20, CoroutineScope coroutineScope0, Function3 function30) {
        this.w = drawerState0;
        this.x = z;
        this.y = v;
        this.z = shape0;
        this.A = v1;
        this.B = v2;
        this.C = f;
        this.D = function20;
        this.E = coroutineScope0;
        this.F = function30;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Composer composer0 = (Composer)object1;
        int v = ((Number)object2).intValue();
        if((v & 14) == 0) {
            v |= (composer0.changed(((BoxWithConstraintsScope)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x30AD78B7, v, -1, "androidx.compose.material.ModalDrawer.<anonymous> (Drawer.kt:517)");
        }
        long v1 = ((BoxWithConstraintsScope)object0).getConstraints-msEJaDk();
        if(!Constraints.getHasBoundedWidth-impl(v1)) {
            throw new IllegalStateException("Drawer shouldn\'t have infinite width");
        }
        float f = -((float)Constraints.getMaxWidth-impl(v1));
        Density density0 = (Density)composer0.consume(CompositionLocalsKt.getLocalDensity());
        composer0.startReplaceableGroup(463500327);
        DrawerState drawerState0 = this.w;
        boolean z = composer0.changed(drawerState0);
        boolean z1 = composer0.changed(density0);
        boolean z2 = composer0.changed(f);
        boolean z3 = composer0.changed(0.0f);
        v3 v30 = composer0.rememberedValue();
        if((z | z1 | z2 | z3) != 0 || v30 == Composer.Companion.getEmpty()) {
            v30 = new v3(drawerState0, density0, f);
            composer0.updateRememberedValue(v30);
        }
        composer0.endReplaceableGroup();
        EffectsKt.SideEffect(v30, composer0, 0);
        boolean z4 = composer0.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = AnchoredDraggableKt.anchoredDraggable$default(modifier$Companion0, drawerState0.getAnchoredDraggableState$material_release(), Orientation.Horizontal, this.x, z4, null, false, 0x30, null);
        composer0.startReplaceableGroup(0x2BB5B5D7);
        androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
        MeasurePolicy measurePolicy0 = a.i(alignment$Companion0, false, composer0, 0, -1323940314);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap0 = composer0.getCurrentCompositionLocalMap();
        androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function00 = composeUiNode$Companion0.getConstructor();
        Function3 function30 = LayoutKt.modifierMaterializerOf(modifier0);
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
        Function2 function20 = androidx.room.a.r(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v2)) {
            androidx.room.a.t(v2, composer0, v2, function20);
        }
        a.w(0, function30, SkippableUpdater.box-impl(composer0), composer0, 2058660585);
        composer0.startReplaceableGroup(0x2BB5B5D7);
        MeasurePolicy measurePolicy1 = a.i(alignment$Companion0, false, composer0, 0, -1323940314);
        int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
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
        Function2 function21 = androidx.room.a.r(composeUiNode$Companion0, composer0, measurePolicy1, composer0, compositionLocalMap1);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v3)) {
            androidx.room.a.t(v3, composer0, v3, function21);
        }
        a.w(0, function31, SkippableUpdater.box-impl(composer0), composer0, 2058660585);
        this.D.invoke(composer0, 0);
        composer0.endReplaceableGroup();
        composer0.endNode();
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();
        boolean z5 = drawerState0.isOpen();
        CoroutineScope coroutineScope0 = this.E;
        jf jf0 = new jf(this.x, drawerState0, coroutineScope0, 6);
        composer0.startReplaceableGroup(0x1BA07890);
        boolean z6 = composer0.changed(f);
        boolean z7 = composer0.changed(0.0f);
        boolean z8 = composer0.changed(drawerState0);
        j0 j00 = composer0.rememberedValue();
        if((z6 | z7 | z8) != 0 || j00 == Composer.Companion.getEmpty()) {
            j00 = new j0(f, drawerState0);
            composer0.updateRememberedValue(j00);
        }
        composer0.endReplaceableGroup();
        DrawerKt.access$Scrim-Bx497Mc(z5, jf0, j00, this.y, composer0, 0);
        String s = Strings_androidKt.getString-4foXLRw(0, composer0, 6);
        Density density1 = (Density)composer0.consume(CompositionLocalsKt.getLocalDensity());
        Modifier modifier1 = SizeKt.sizeIn-qDBjuR0(modifier$Companion0, density1.toDp-u2uoSUM(Constraints.getMinWidth-impl(v1)), density1.toDp-u2uoSUM(Constraints.getMinHeight-impl(v1)), density1.toDp-u2uoSUM(Constraints.getMaxWidth-impl(v1)), density1.toDp-u2uoSUM(Constraints.getMaxHeight-impl(v1)));
        composer0.startReplaceableGroup(463502210);
        boolean z9 = composer0.changed(drawerState0);
        x3 x30 = composer0.rememberedValue();
        if(z9 || x30 == Composer.Companion.getEmpty()) {
            x30 = new x3(drawerState0, 0);
            composer0.updateRememberedValue(x30);
        }
        composer0.endReplaceableGroup();
        Modifier modifier2 = SemanticsModifierKt.semantics$default(PaddingKt.padding-qDBjuR0$default(OffsetKt.offset(modifier1, x30), 0.0f, 0.0f, 56.0f, 0.0f, 11, null), false, new r(s, drawerState0, 17, coroutineScope0), 1, null);
        ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambda(composer0, 0x8C4B1CF9, true, new z3(this.F));
        SurfaceKt.Surface-F-jzlyU(modifier2, this.z, this.A, this.B, null, this.C, composableLambda0, composer0, 0x180000, 16);
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

