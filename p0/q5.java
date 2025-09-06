package p0;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.AnchoredDraggableKt;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.material.SurfaceKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment.Companion;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import j0.b2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import r0.a;

public final class q5 extends Lambda implements Function3 {
    public final long A;
    public final long B;
    public final float C;
    public final Function2 D;
    public final long E;
    public final CoroutineScope F;
    public final Function3 G;
    public final boolean w;
    public final ModalBottomSheetState x;
    public final Orientation y;
    public final Shape z;

    public q5(boolean z, ModalBottomSheetState modalBottomSheetState0, Orientation orientation0, Shape shape0, long v, long v1, float f, Function2 function20, long v2, CoroutineScope coroutineScope0, Function3 function30) {
        this.w = z;
        this.x = modalBottomSheetState0;
        this.y = orientation0;
        this.z = shape0;
        this.A = v;
        this.B = v1;
        this.C = f;
        this.D = function20;
        this.E = v2;
        this.F = coroutineScope0;
        this.G = function30;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Modifier modifier3;
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
            ComposerKt.traceEventStart(0x98C467BA, v, -1, "androidx.compose.material.ModalBottomSheetLayout.<anonymous> (ModalBottomSheet.kt:573)");
        }
        float f = (float)Constraints.getMaxHeight-impl(((BoxWithConstraintsScope)object0).getConstraints-msEJaDk());
        Modifier modifier0 = Modifier.Companion;
        Modifier modifier1 = SizeKt.fillMaxSize$default(modifier0, 0.0f, 1, null);
        composer0.startReplaceableGroup(0x2BB5B5D7);
        Companion alignment$Companion0 = Alignment.Companion;
        MeasurePolicy measurePolicy0 = a.i(alignment$Companion0, false, composer0, 0, -1323940314);
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
        Function2 function20 = androidx.room.a.r(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v1)) {
            androidx.room.a.t(v1, composer0, v1, function20);
        }
        a.w(0, function30, SkippableUpdater.box-impl(composer0), composer0, 2058660585);
        this.D.invoke(composer0, 0);
        ModalBottomSheetState modalBottomSheetState0 = this.x;
        CoroutineScope coroutineScope0 = this.F;
        k5 k50 = new k5(modalBottomSheetState0, coroutineScope0, 0);
        Object object3 = modalBottomSheetState0.getAnchoredDraggableState$material_release().getTargetValue();
        ModalBottomSheetValue modalBottomSheetValue0 = ModalBottomSheetValue.Hidden;
        ModalBottomSheetKt.access$Scrim-3J-VO9M(this.E, k50, object3 != modalBottomSheetValue0, composer0, 0);
        composer0.endReplaceableGroup();
        composer0.endNode();
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();
        Modifier modifier2 = SizeKt.fillMaxWidth$default(SizeKt.widthIn-VpY3zN4$default(((BoxWithConstraintsScope)object0).align(modifier0, alignment$Companion0.getTopCenter()), 0.0f, 640.0f, 1, null), 0.0f, 1, null);
        composer0.startReplaceableGroup(0x4A0054A6);
        boolean z = this.w;
        if(z) {
            composer0.startReplaceableGroup(0x1E7B2B64);
            boolean z1 = composer0.changed(modalBottomSheetState0.getAnchoredDraggableState$material_release());
            Orientation orientation0 = this.y;
            boolean z2 = composer0.changed(orientation0);
            NestedScrollConnection nestedScrollConnection0 = composer0.rememberedValue();
            if(z1 || z2 || nestedScrollConnection0 == Composer.Companion.getEmpty()) {
                nestedScrollConnection0 = ModalBottomSheetKt.access$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(modalBottomSheetState0.getAnchoredDraggableState$material_release(), orientation0);
                composer0.updateRememberedValue(nestedScrollConnection0);
            }
            composer0.endReplaceableGroup();
            modifier3 = NestedScrollModifierKt.nestedScroll$default(modifier0, nestedScrollConnection0, null, 2, null);
        }
        else {
            modifier3 = modifier0;
        }
        composer0.endReplaceableGroup();
        Modifier modifier4 = OffsetKt.offset(modifier2.then(modifier3), new l5(modalBottomSheetState0, 0));
        boolean z3 = z && modalBottomSheetState0.getAnchoredDraggableState$material_release().getCurrentValue() != modalBottomSheetValue0;
        Modifier modifier5 = ModalBottomSheetKt.access$modalBottomSheetAnchors(AnchoredDraggableKt.anchoredDraggable$default(modifier4, modalBottomSheetState0.getAnchoredDraggableState$material_release(), this.y, z3, false, null, false, 56, null), modalBottomSheetState0, f);
        if(z) {
            modifier0 = SemanticsModifierKt.semantics$default(modifier0, false, new b2(12, modalBottomSheetState0, coroutineScope0), 1, null);
        }
        Modifier modifier6 = modifier5.then(modifier0);
        ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambda(composer0, 0x5C90CFFE, true, new p5(this.G));
        SurfaceKt.Surface-F-jzlyU(modifier6, this.z, this.A, this.B, null, this.C, composableLambda0, composer0, 0x180000, 16);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

