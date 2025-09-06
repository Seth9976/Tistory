package p0;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.BackdropScaffoldState;
import androidx.compose.material.BackdropValue;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material.SwipeableKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.room.a;
import j0.b2;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.x;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import m0.b0;

public final class r0 extends Lambda implements Function4 {
    public final float A;
    public final Shape B;
    public final long C;
    public final long D;
    public final float E;
    public final float F;
    public final CoroutineScope G;
    public final float H;
    public final Function2 I;
    public final long J;
    public final Function3 K;
    public final float w;
    public final boolean x;
    public final boolean y;
    public final BackdropScaffoldState z;

    public r0(float f, boolean z, boolean z1, BackdropScaffoldState backdropScaffoldState0, float f1, Shape shape0, long v, long v1, float f2, float f3, CoroutineScope coroutineScope0, float f4, Function2 function20, long v2, Function3 function30) {
        this.w = f;
        this.x = z;
        this.y = z1;
        this.z = backdropScaffoldState0;
        this.A = f1;
        this.B = shape0;
        this.C = v;
        this.D = v1;
        this.E = f2;
        this.F = f3;
        this.G = coroutineScope0;
        this.H = f4;
        this.I = function20;
        this.J = v2;
        this.K = function30;
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        long v = ((Constraints)object0).unbox-impl();
        float f = ((Number)object1).floatValue();
        int v1 = ((Number)object3).intValue();
        int v2 = (v1 & 14) == 0 ? (((Composer)object2).changed(v) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (((Composer)object2).changed(f) ? 0x20 : 16);
        }
        if((v2 & 731) == 0x92 && ((Composer)object2).getSkipping()) {
            ((Composer)object2).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1800047509, v2, -1, "androidx.compose.material.BackdropScaffold.<anonymous>.<anonymous> (BackdropScaffold.kt:305)");
        }
        float f1 = ((float)Constraints.getMaxHeight-impl(v)) - this.w;
        float f2 = this.x ? Math.min(f1, f) : f1;
        BackdropScaffoldState backdropScaffoldState0 = this.z;
        Modifier modifier0 = this.y ? NestedScrollModifierKt.nestedScroll$default(Modifier.Companion, backdropScaffoldState0.getNestedScrollConnection$material_release(), null, 2, null) : Modifier.Companion;
        Companion modifier$Companion0 = Modifier.Companion;
        Map map0 = x.mapOf(new Pair[]{TuplesKt.to(this.A, BackdropValue.Concealed), TuplesKt.to(f2, BackdropValue.Revealed)});
        Modifier modifier1 = SemanticsModifierKt.semantics$default(SwipeableKt.swipeable-pPrIpRY$default(modifier0, this.z, map0, Orientation.Vertical, this.y, false, null, null, null, 0.0f, 0x1F0, null), false, new b2(9, backdropScaffoldState0, this.G), 1, null);
        ((Composer)object2).startReplaceableGroup(1686360964);
        boolean z = ((Composer)object2).changed(backdropScaffoldState0);
        b0 b00 = ((Composer)object2).rememberedValue();
        if(z || b00 == Composer.Companion.getEmpty()) {
            b00 = new b0(backdropScaffoldState0, 17);
            ((Composer)object2).updateRememberedValue(b00);
        }
        ((Composer)object2).endReplaceableGroup();
        Modifier modifier2 = OffsetKt.offset(modifier$Companion0, b00).then(modifier1);
        ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambda(((Composer)object2), 0xC080D1D1, true, new n0(this.H, this.I, this.J, this.z, this.y, this.G));
        SurfaceKt.Surface-F-jzlyU(modifier2, this.B, this.C, this.D, null, this.E, composableLambda0, ((Composer)object2), 0x180000, 16);
        Modifier modifier3 = PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 0.0f, 0.0f, (!backdropScaffoldState0.isRevealed() || f2 != f1 ? 0.0f : this.F), 7, null);
        ((Composer)object2).startReplaceableGroup(0x2BB5B5D7);
        MeasurePolicy measurePolicy0 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getBottomCenter(), false, ((Composer)object2), 6);
        ((Composer)object2).startReplaceableGroup(-1323940314);
        int v3 = ComposablesKt.getCurrentCompositeKeyHash(((Composer)object2), 0);
        CompositionLocalMap compositionLocalMap0 = ((Composer)object2).getCurrentCompositionLocalMap();
        androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function00 = composeUiNode$Companion0.getConstructor();
        Function3 function30 = LayoutKt.modifierMaterializerOf(modifier3);
        if(((Composer)object2).getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        ((Composer)object2).startReusableNode();
        if(((Composer)object2).getInserting()) {
            ((Composer)object2).createNode(function00);
        }
        else {
            ((Composer)object2).useNode();
        }
        Composer composer0 = Updater.constructor-impl(((Composer)object2));
        Function2 function20 = a.r(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v3)) {
            a.t(v3, composer0, v3, function20);
        }
        r0.a.w(0, function30, SkippableUpdater.box-impl(SkippableUpdater.constructor-impl(((Composer)object2))), ((Composer)object2), 2058660585);
        this.K.invoke(backdropScaffoldState0.getSnackbarHostState(), ((Composer)object2), 0);
        ((Composer)object2).endReplaceableGroup();
        ((Composer)object2).endNode();
        ((Composer)object2).endReplaceableGroup();
        ((Composer)object2).endReplaceableGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

