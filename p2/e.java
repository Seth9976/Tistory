package p2;

import androidx.compose.animation.core.Transition;
import androidx.compose.ui.tooling.animation.PreviewAnimationClock;
import androidx.compose.ui.tooling.animation.TransitionComposeAnimation;
import androidx.compose.ui.tooling.animation.TransitionComposeAnimation_androidKt;
import androidx.compose.ui.tooling.animation.clock.TransitionClock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function1 {
    public final Transition w;
    public final PreviewAnimationClock x;

    public e(Transition transition0, PreviewAnimationClock previewAnimationClock0) {
        this.w = transition0;
        this.x = previewAnimationClock0;
        super(1);
    }

    public final void a(Object object0) {
        Transition transition0 = this.w;
        TransitionComposeAnimation transitionComposeAnimation0 = TransitionComposeAnimation_androidKt.parse(transition0);
        PreviewAnimationClock previewAnimationClock0 = this.x;
        if(transitionComposeAnimation0 != null) {
            previewAnimationClock0.getTransitionClocks$ui_tooling_release().put(transitionComposeAnimation0, new TransitionClock(transitionComposeAnimation0));
            return;
        }
        previewAnimationClock0.a(transition0.getLabel());
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        this.a(object0);
        return Unit.INSTANCE;
    }
}

