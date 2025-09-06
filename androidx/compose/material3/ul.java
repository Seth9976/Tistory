package androidx.compose.material3;

import aa.m;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.room.a;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class ul extends Lambda implements Function3 {
    public final SnackbarData w;
    public final SnackbarData x;
    public final List y;
    public final fa z;

    public ul(SnackbarData snackbarData0, SnackbarData snackbarData1, List list0, fa fa0) {
        this.w = snackbarData0;
        this.x = snackbarData1;
        this.y = list0;
        this.z = fa0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Composer composer0 = (Composer)object1;
        int v = ((Number)object2).intValue();
        if((v & 6) == 0) {
            v |= (composer0.changedInstance(((Function2)object0)) ? 4 : 2);
        }
        if((v & 19) == 18 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x9D5F8A3B, v, -1, "androidx.compose.material3.FadeInFadeOutWithScale.<anonymous>.<anonymous> (SnackbarHost.kt:338)");
        }
        SnackbarData snackbarData0 = this.w;
        boolean z = Intrinsics.areEqual(snackbarData0, this.x);
        int v1 = !z || ListUtilsKt.fastFilterNotNull(this.y).size() == 1 ? 0 : 75;
        TweenSpec tweenSpec0 = AnimationSpecKt.tween((z ? 150 : 75), v1, EasingKt.getLinearEasing());
        boolean z1 = composer0.changed(snackbarData0);
        fa fa0 = this.z;
        boolean z2 = composer0.changedInstance(fa0);
        m m0 = composer0.rememberedValue();
        if(z1 || z2 || m0 == Composer.Companion.getEmpty()) {
            m0 = new m(5, snackbarData0, fa0);
            composer0.updateRememberedValue(m0);
        }
        State state0 = SnackbarHostKt.access$animatedOpacity(tweenSpec0, z, m0, composer0, 0, 0);
        State state1 = SnackbarHostKt.access$animatedScale(AnimationSpecKt.tween((z ? 150 : 75), v1, EasingKt.getFastOutSlowInEasing()), z, composer0, 0);
        float f = ((Number)state1.getValue()).floatValue();
        float f1 = ((Number)state1.getValue()).floatValue();
        float f2 = ((Number)state0.getValue()).floatValue();
        Modifier modifier0 = GraphicsLayerModifierKt.graphicsLayer-Ap8cVGQ$default(Modifier.Companion, f, f1, f2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0x1FFF8, null);
        boolean z3 = composer0.changed(snackbarData0);
        tl tl0 = composer0.rememberedValue();
        if(z3 || tl0 == Composer.Companion.getEmpty()) {
            tl0 = new tl(snackbarData0);
            composer0.updateRememberedValue(tl0);
        }
        Modifier modifier1 = SemanticsModifierKt.semantics$default(modifier0, false, tl0, 1, null);
        MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap0 = composer0.getCurrentCompositionLocalMap();
        Modifier modifier2 = ComposedModifierKt.materializeModifier(composer0, modifier1);
        Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function00 = composeUiNode$Companion0.getConstructor();
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
        Function2 function20 = a.r(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v2)) {
            a.t(v2, composer0, v2, function20);
        }
        Updater.set-impl(composer0, modifier2, composeUiNode$Companion0.getSetModifier());
        ((Function2)object0).invoke(composer0, ((int)(v & 14)));
        composer0.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

