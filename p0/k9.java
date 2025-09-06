package p0;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material.ElevationOverlay;
import androidx.compose.material.ElevationOverlayKt;
import androidx.compose.material.InteractiveComponentSizeKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import r0.a;

public final class k9 extends Lambda implements Function2 {
    public final BorderStroke A;
    public final float B;
    public final MutableInteractionSource C;
    public final Indication D;
    public final boolean E;
    public final String F;
    public final Role G;
    public final Function0 H;
    public final Function2 I;
    public final Modifier w;
    public final Shape x;
    public final long y;
    public final float z;

    public k9(Modifier modifier0, Shape shape0, long v, float f, BorderStroke borderStroke0, float f1, MutableInteractionSource mutableInteractionSource0, Indication indication0, boolean z, String s, Role role0, Function0 function00, Function2 function20) {
        this.w = modifier0;
        this.x = shape0;
        this.y = v;
        this.z = f;
        this.A = borderStroke0;
        this.B = f1;
        this.C = mutableInteractionSource0;
        this.D = indication0;
        this.E = z;
        this.F = s;
        this.G = role0;
        this.H = function00;
        this.I = function20;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Composer composer0 = (Composer)object0;
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x8EAA230, v, -1, "androidx.compose.material.Surface.<anonymous> (Surface.kt:589)");
        }
        Modifier modifier0 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(this.w);
        Object object2 = composer0.consume(ElevationOverlayKt.getLocalElevationOverlay());
        long v1 = SurfaceKt.access$surfaceColorAtElevation-cq6XJ1M(this.y, ((ElevationOverlay)object2), this.z, composer0, 0);
        Modifier modifier1 = SurfaceKt.access$surface-8ww4TTg(modifier0, this.x, v1, this.A, this.B).then(ClickableKt.clickable-O2vRcR0(Modifier.Companion, this.C, this.D, this.E, this.F, this.G, this.H));
        composer0.startReplaceableGroup(0x2BB5B5D7);
        MeasurePolicy measurePolicy0 = a.i(Alignment.Companion, true, composer0, 0x30, -1323940314);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap0 = composer0.getCurrentCompositionLocalMap();
        Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v2)) {
            androidx.room.a.t(v2, composer0, v2, function20);
        }
        a.w(0, function30, SkippableUpdater.box-impl(composer0), composer0, 2058660585);
        this.I.invoke(composer0, 0);
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

