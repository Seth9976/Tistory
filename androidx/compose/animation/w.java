package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class w extends Lambda implements Function3 {
    public final ResizeMode A;
    public final AnimatedVisibilityScope w;
    public final EnterTransition x;
    public final ExitTransition y;
    public final SharedContentState z;

    public w(AnimatedVisibilityScope animatedVisibilityScope0, EnterTransition enterTransition0, ExitTransition exitTransition0, SharedContentState sharedTransitionScope$SharedContentState0, ResizeMode sharedTransitionScope$ResizeMode0) {
        this.w = animatedVisibilityScope0;
        this.x = enterTransition0;
        this.y = exitTransition0;
        this.z = sharedTransitionScope$SharedContentState0;
        this.A = sharedTransitionScope$ResizeMode0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Modifier modifier2;
        Modifier modifier0 = (Modifier)object0;
        int v = ((Number)object2).intValue();
        ((Composer)object1).startReplaceGroup(0xE7015AFB);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xE7015AFB, v, -1, "androidx.compose.animation.SharedTransitionScopeImpl.sharedBounds.<anonymous> (SharedTransitionScope.kt:770)");
        }
        Transition transition0 = this.w.getTransition();
        SharedContentState sharedTransitionScope$SharedContentState0 = this.z;
        boolean z = ((Composer)object1).changedInstance(sharedTransitionScope$SharedContentState0);
        u u0 = ((Composer)object1).rememberedValue();
        if(z || u0 == Composer.Companion.getEmpty()) {
            u0 = new u(sharedTransitionScope$SharedContentState0);
            ((Composer)object1).updateRememberedValue(u0);
        }
        Modifier modifier1 = EnterExitTransitionKt.createModifier(transition0, this.x, this.y, u0, "enter/exit for " + sharedTransitionScope$SharedContentState0.getKey(), ((Composer)object1), 0, 0);
        ResizeMode sharedTransitionScope$ResizeMode0 = this.A;
        if(sharedTransitionScope$ResizeMode0 instanceof n) {
            ((Composer)object1).startReplaceGroup(0xD000E710);
            Companion modifier$Companion0 = Modifier.Companion;
            boolean z1 = ((Composer)object1).changedInstance(sharedTransitionScope$SharedContentState0);
            v v1 = ((Composer)object1).rememberedValue();
            if(z1 || v1 == Composer.Companion.getEmpty()) {
                v1 = new v(sharedTransitionScope$SharedContentState0);
                ((Composer)object1).updateRememberedValue(v1);
            }
            modifier2 = SharedTransitionScopeKt.access$createContentScaleModifier(modifier$Companion0, ((n)sharedTransitionScope$ResizeMode0), v1);
            ((Composer)object1).endReplaceGroup();
        }
        else {
            ((Composer)object1).startReplaceGroup(-804630006);
            ((Composer)object1).endReplaceGroup();
            modifier2 = Modifier.Companion;
        }
        Modifier modifier3 = modifier1.then(modifier2);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ((Composer)object1).endReplaceGroup();
        return modifier3;
    }
}

