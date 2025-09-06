package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.text.selection.b1;
import androidx.compose.material3.e0;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import b0.f;
import d0.x;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function2 {
    public final SnapshotStateList A;
    public final Function4 B;
    public final Transition w;
    public final Object x;
    public final Function1 y;
    public final AnimatedContentTransitionScopeImpl z;

    public a(Transition transition0, Object object0, Function1 function10, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl0, SnapshotStateList snapshotStateList0, Function4 function40) {
        this.w = transition0;
        this.x = object0;
        this.y = function10;
        this.z = animatedContentTransitionScopeImpl0;
        this.A = snapshotStateList0;
        this.B = function40;
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
            ComposerKt.traceEventStart(885640742, v, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:757)");
        }
        ContentTransform contentTransform0 = composer0.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        Function1 function10 = this.y;
        AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl0 = this.z;
        if(contentTransform0 == composer$Companion0.getEmpty()) {
            contentTransform0 = (ContentTransform)function10.invoke(animatedContentTransitionScopeImpl0);
            composer0.updateRememberedValue(contentTransform0);
        }
        Transition transition0 = this.w;
        Object object2 = transition0.getSegment().getTargetState();
        Object object3 = this.x;
        boolean z = composer0.changed(Intrinsics.areEqual(object2, object3));
        ExitTransition exitTransition0 = composer0.rememberedValue();
        if(z || exitTransition0 == composer$Companion0.getEmpty()) {
            exitTransition0 = Intrinsics.areEqual(transition0.getSegment().getTargetState(), object3) ? ExitTransition.Companion.getNone() : ((ContentTransform)function10.invoke(animatedContentTransitionScopeImpl0)).getInitialContentExit();
            composer0.updateRememberedValue(exitTransition0);
        }
        ChildData animatedContentTransitionScopeImpl$ChildData0 = composer0.rememberedValue();
        if(animatedContentTransitionScopeImpl$ChildData0 == composer$Companion0.getEmpty()) {
            animatedContentTransitionScopeImpl$ChildData0 = new ChildData(Intrinsics.areEqual(object3, transition0.getTargetState()));
            composer0.updateRememberedValue(animatedContentTransitionScopeImpl$ChildData0);
        }
        EnterTransition enterTransition0 = contentTransform0.getTargetContentEnter();
        androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
        boolean z1 = composer0.changedInstance(contentTransform0);
        e0 e00 = composer0.rememberedValue();
        if(z1 || e00 == composer$Companion0.getEmpty()) {
            e00 = new e0(contentTransform0, 10);
            composer0.updateRememberedValue(e00);
        }
        Modifier modifier0 = LayoutModifierKt.layout(modifier$Companion0, e00);
        animatedContentTransitionScopeImpl$ChildData0.setTarget(Intrinsics.areEqual(object3, transition0.getTargetState()));
        Modifier modifier1 = modifier0.then(animatedContentTransitionScopeImpl$ChildData0);
        boolean z2 = composer0.changedInstance(object3);
        f f0 = composer0.rememberedValue();
        if(z2 || f0 == composer$Companion0.getEmpty()) {
            f0 = new f(object3, 7);
            composer0.updateRememberedValue(f0);
        }
        boolean z3 = composer0.changed(exitTransition0);
        b1 b10 = composer0.rememberedValue();
        if(z3 || b10 == composer$Companion0.getEmpty()) {
            b10 = new b1(exitTransition0, 14);
            composer0.updateRememberedValue(b10);
        }
        ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(0xDB459A16, true, new x(1, this.A, object3, animatedContentTransitionScopeImpl0, this.B), composer0, 54);
        AnimatedVisibilityKt.AnimatedEnterExitImpl(this.w, f0, modifier1, enterTransition0, exitTransition0, b10, null, composableLambda0, composer0, 0xC00000, 0x40);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

