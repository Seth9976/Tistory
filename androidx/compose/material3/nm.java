package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.material.ElevationOverlay;
import androidx.compose.material.ElevationOverlayKt;
import androidx.compose.material.InteractiveComponentSizeKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import r0.a;

public final class nm extends Lambda implements Function2 {
    public final float A;
    public final BorderStroke B;
    public final float C;
    public final MutableInteractionSource D;
    public final boolean E;
    public final Function0 F;
    public final Function2 G;
    public final int w;
    public final Modifier x;
    public final Shape y;
    public final long z;

    public nm(Modifier modifier0, Shape shape0, long v, float f, BorderStroke borderStroke0, float f1, MutableInteractionSource mutableInteractionSource0, boolean z, Function0 function00, Function2 function20) {
        this.w = 1;
        this.x = modifier0;
        this.y = shape0;
        this.z = v;
        this.A = f;
        this.B = borderStroke0;
        this.C = f1;
        this.D = mutableInteractionSource0;
        this.E = z;
        this.F = function00;
        this.G = function20;
        super(2);
    }

    public nm(Modifier modifier0, Shape shape0, long v, float f, BorderStroke borderStroke0, MutableInteractionSource mutableInteractionSource0, boolean z, Function0 function00, float f1, Function2 function20) {
        this.w = 0;
        this.x = modifier0;
        this.y = shape0;
        this.z = v;
        this.A = f;
        this.B = borderStroke0;
        this.D = mutableInteractionSource0;
        this.E = z;
        this.F = function00;
        this.C = f1;
        this.G = function20;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            Composer composer0 = (Composer)object0;
            int v = ((Number)object1).intValue();
            if((v & 11) == 2 && composer0.getSkipping()) {
                composer0.skipToGroupEnd();
                return Unit.INSTANCE;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2031491085, v, -1, "androidx.compose.material.Surface.<anonymous> (Surface.kt:228)");
            }
            Modifier modifier0 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(this.x);
            Object object2 = composer0.consume(ElevationOverlayKt.getLocalElevationOverlay());
            long v1 = SurfaceKt.access$surfaceColorAtElevation-cq6XJ1M(this.z, ((ElevationOverlay)object2), this.A, composer0, 0);
            Modifier modifier1 = SurfaceKt.access$surface-8ww4TTg(modifier0, this.y, v1, this.B, this.C);
            Indication indication0 = RippleKt.rememberRipple-9IZ8Weo(false, 0.0f, 0L, composer0, 0, 7);
            Modifier modifier2 = ClickableKt.clickable-O2vRcR0$default(modifier1, this.D, indication0, this.E, null, null, this.F, 24, null);
            composer0.startReplaceableGroup(0x2BB5B5D7);
            MeasurePolicy measurePolicy0 = a.i(Alignment.Companion, true, composer0, 0x30, -1323940314);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
            CompositionLocalMap compositionLocalMap0 = composer0.getCurrentCompositionLocalMap();
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
            if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v2)) {
                androidx.room.a.t(v2, composer0, v2, function20);
            }
            a.w(0, function30, SkippableUpdater.box-impl(composer0), composer0, 2058660585);
            this.G.invoke(composer0, 0);
            composer0.endReplaceableGroup();
            composer0.endNode();
            composer0.endReplaceableGroup();
            composer0.endReplaceableGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
        int v3 = ((Number)object1).intValue();
        if((v3 & 3) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1279702876, v3, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:209)");
        }
        Modifier modifier3 = androidx.compose.material3.InteractiveComponentSizeKt.minimumInteractiveComponentSize(this.x);
        long v4 = androidx.compose.material3.SurfaceKt.access$surfaceColorAtElevation-CLU3JFs(this.z, this.A, ((Composer)object0), 0);
        float f = ((Density)((Composer)object0).consume(CompositionLocalsKt.getLocalDensity())).toPx-0680j_4(this.C);
        Modifier modifier4 = androidx.compose.material3.SurfaceKt.access$surface-XO-JAsU(modifier3, this.y, v4, this.B, f);
        Indication indication1 = androidx.compose.material3.RippleKt.rippleOrFallbackImplementation-9IZ8Weo(false, 0.0f, 0L, ((Composer)object0), 0, 7);
        Modifier modifier5 = ClickableKt.clickable-O2vRcR0$default(modifier4, this.D, indication1, this.E, null, null, this.F, 24, null);
        MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
        int v5 = ComposablesKt.getCurrentCompositeKeyHash(((Composer)object0), 0);
        CompositionLocalMap compositionLocalMap1 = ((Composer)object0).getCurrentCompositionLocalMap();
        Modifier modifier6 = ComposedModifierKt.materializeModifier(((Composer)object0), modifier5);
        Companion composeUiNode$Companion1 = ComposeUiNode.Companion;
        Function0 function01 = composeUiNode$Companion1.getConstructor();
        if(((Composer)object0).getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        ((Composer)object0).startReusableNode();
        if(((Composer)object0).getInserting()) {
            ((Composer)object0).createNode(function01);
        }
        else {
            ((Composer)object0).useNode();
        }
        Composer composer1 = Updater.constructor-impl(((Composer)object0));
        Function2 function21 = androidx.room.a.r(composeUiNode$Companion1, composer1, measurePolicy1, composer1, compositionLocalMap1);
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v5)) {
            androidx.room.a.t(v5, composer1, v5, function21);
        }
        Integer integer0 = a.l(composeUiNode$Companion1, composer1, modifier6, 0);
        if(a.B(this.G, ((Composer)object0), integer0)) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

