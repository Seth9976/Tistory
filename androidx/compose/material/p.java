package androidx.compose.material;

import aa.r;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.jf;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
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
import p0.c1;
import p0.o3;
import p0.q3;
import r0.a;

public final class p extends Lambda implements Function3 {
    public final Shape A;
    public final long B;
    public final long C;
    public final float D;
    public final CoroutineScope E;
    public final Function3 F;
    public final boolean w;
    public final BottomDrawerState x;
    public final Function2 y;
    public final long z;

    public p(boolean z, BottomDrawerState bottomDrawerState0, Function2 function20, long v, Shape shape0, long v1, long v2, float f, CoroutineScope coroutineScope0, Function3 function30) {
        this.w = z;
        this.x = bottomDrawerState0;
        this.y = function20;
        this.z = v;
        this.A = shape0;
        this.B = v1;
        this.C = v2;
        this.D = f;
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
            ComposerKt.traceEventStart(1220102512, v, -1, "androidx.compose.material.BottomDrawer.<anonymous> (Drawer.kt:657)");
        }
        float f = (float)Constraints.getMaxHeight-impl(((BoxWithConstraintsScope)object0).getConstraints-msEJaDk());
        boolean z = Constraints.getMaxWidth-impl(((BoxWithConstraintsScope)object0).getConstraints-msEJaDk()) > Constraints.getMaxHeight-impl(((BoxWithConstraintsScope)object0).getConstraints-msEJaDk());
        Density density0 = (Density)composer0.consume(CompositionLocalsKt.getLocalDensity());
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = SizeKt.sizeIn-qDBjuR0$default(modifier$Companion0, 0.0f, 0.0f, density0.toDp-u2uoSUM(Constraints.getMaxWidth-impl(((BoxWithConstraintsScope)object0).getConstraints-msEJaDk())), density0.toDp-u2uoSUM(Constraints.getMaxHeight-impl(((BoxWithConstraintsScope)object0).getConstraints-msEJaDk())), 3, null);
        boolean z1 = this.w;
        BottomDrawerState bottomDrawerState0 = this.x;
        Modifier modifier1 = z1 ? NestedScrollModifierKt.nestedScroll$default(modifier$Companion0, bottomDrawerState0.getNestedScrollConnection$material_release(), null, 2, null) : modifier$Companion0;
        boolean z2 = composer0.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
        Modifier modifier2 = AnchoredDraggableKt.anchoredDraggable$default(modifier1, bottomDrawerState0.getAnchoredDraggableState$material_release(), Orientation.Vertical, this.w, z2, null, false, 0x30, null);
        composer0.startReplaceableGroup(0x2BB5B5D7);
        MeasurePolicy measurePolicy0 = a.i(Alignment.Companion, false, composer0, 0, -1323940314);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap0 = composer0.getCurrentCompositionLocalMap();
        androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function00 = composeUiNode$Companion0.getConstructor();
        Function3 function30 = LayoutKt.modifierMaterializerOf(modifier2);
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
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v1)) {
            androidx.room.a.t(v1, composer0, v1, function20);
        }
        a.w(0, function30, SkippableUpdater.box-impl(composer0), composer0, 2058660585);
        this.y.invoke(composer0, 0);
        jf jf0 = new jf(z1, bottomDrawerState0, this.E, 5);
        boolean z3 = bottomDrawerState0.getTargetValue() != BottomDrawerValue.Closed;
        DrawerKt.access$BottomDrawerScrim-3J-VO9M(this.z, jf0, z3, composer0, 0);
        String s = Strings_androidKt.getString-4foXLRw(0, composer0, 6);
        Modifier modifier3 = SemanticsModifierKt.semantics$default(OffsetKt.offset(OnRemeasuredModifierKt.onSizeChanged(modifier0, new o3(bottomDrawerState0, f, z)), new c1(bottomDrawerState0, 1)), false, new r(s, bottomDrawerState0, 16, this.E), 1, null);
        ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambda(composer0, 457750254, true, new q3(this.F));
        SurfaceKt.Surface-F-jzlyU(modifier3, this.A, this.B, this.C, null, this.D, composableLambda0, composer0, 0x180000, 16);
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

