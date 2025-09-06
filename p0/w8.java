package p0;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.material.SnackbarData;
import androidx.compose.material.SnackbarHostKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.util.ListUtilsKt;
import j0.t1;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import r0.a;

public final class w8 extends Lambda implements Function3 {
    public final SnackbarData w;
    public final SnackbarData x;
    public final List y;
    public final k4 z;

    public w8(SnackbarData snackbarData0, SnackbarData snackbarData1, List list0, k4 k40) {
        this.w = snackbarData0;
        this.x = snackbarData1;
        this.y = list0;
        this.z = k40;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Composer composer0 = (Composer)object1;
        int v = ((Number)object2).intValue();
        if((v & 14) == 0) {
            v |= (composer0.changedInstance(((Function2)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1471040642, v, -1, "androidx.compose.material.FadeInFadeOutWithScale.<anonymous>.<anonymous> (SnackbarHost.kt:274)");
        }
        boolean z = Intrinsics.areEqual(this.w, this.x);
        int v1 = !z || ListUtilsKt.fastFilterNotNull(this.y).size() == 1 ? 0 : 75;
        State state0 = SnackbarHostKt.access$animatedOpacity(AnimationSpecKt.tween((z ? 150 : 75), v1, EasingKt.getLinearEasing()), z, new t1(28, this.w, this.z), composer0, 0, 0);
        State state1 = SnackbarHostKt.access$animatedScale(AnimationSpecKt.tween((z ? 150 : 75), v1, EasingKt.getFastOutSlowInEasing()), z, composer0, 0);
        float f = ((Number)state1.getValue()).floatValue();
        float f1 = ((Number)state1.getValue()).floatValue();
        float f2 = ((Number)state0.getValue()).floatValue();
        Modifier modifier0 = SemanticsModifierKt.semantics$default(GraphicsLayerModifierKt.graphicsLayer-Ap8cVGQ$default(Modifier.Companion, f, f1, f2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0x1FFF8, null), false, new v8(this.w), 1, null);
        composer0.startReplaceableGroup(0x2BB5B5D7);
        MeasurePolicy measurePolicy0 = a.i(Alignment.Companion, false, composer0, 0, -1323940314);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap0 = composer0.getCurrentCompositionLocalMap();
        Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
        ((Function2)object0).invoke(composer0, ((int)(v & 14)));
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

