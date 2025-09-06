package s;

import aa.w;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import r0.a;

public final class a0 extends Lambda implements Function2 {
    public final Transition w;
    public final FiniteAnimationSpec x;
    public final Object y;
    public final Function3 z;

    public a0(Transition transition0, FiniteAnimationSpec finiteAnimationSpec0, Object object0, Function3 function30) {
        this.w = transition0;
        this.x = finiteAnimationSpec0;
        this.y = object0;
        this.z = function30;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Composer composer0 = (Composer)object0;
        int v = ((Number)object1).intValue();
        if((v & 3) == 2 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xAAFA89D8, v, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous> (Crossfade.kt:127)");
        }
        z z0 = new z(this.x);
        TwoWayConverter twoWayConverter0 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        Transition transition0 = this.w;
        Object object2 = transition0.getCurrentState();
        composer0.startReplaceGroup(0xE5DA4D14);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xE5DA4D14, 0, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:129)");
        }
        Object object3 = this.y;
        float f = 0.0f;
        float f1 = Intrinsics.areEqual(object2, object3) ? 1.0f : 0.0f;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        Float float0 = f1;
        Object object4 = transition0.getTargetState();
        composer0.startReplaceGroup(0xE5DA4D14);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xE5DA4D14, 0, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:129)");
        }
        if(Intrinsics.areEqual(object4, object3)) {
            f = 1.0f;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        State state0 = TransitionKt.createTransitionAnimation(transition0, float0, f, ((FiniteAnimationSpec)z0.invoke(transition0.getSegment(), composer0, 0)), twoWayConverter0, "FloatAnimation", composer0, 0);
        Companion modifier$Companion0 = Modifier.Companion;
        boolean z1 = composer0.changed(state0);
        w w0 = composer0.rememberedValue();
        if(z1 || w0 == Composer.Companion.getEmpty()) {
            w0 = new w(state0, 12);
            composer0.updateRememberedValue(w0);
        }
        Modifier modifier0 = GraphicsLayerModifierKt.graphicsLayer(modifier$Companion0, w0);
        composer0.startReplaceableGroup(0x2BB5B5D7);
        MeasurePolicy measurePolicy0 = a.i(Alignment.Companion, false, composer0, 0, -1323940314);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
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
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v1)) {
            androidx.room.a.t(v1, composer0, v1, function20);
        }
        a.w(0, function30, SkippableUpdater.box-impl(composer0), composer0, 2058660585);
        this.z.invoke(object3, composer0, 0);
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

