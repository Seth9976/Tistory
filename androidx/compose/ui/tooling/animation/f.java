package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.ui.tooling.animation.clock.TransitionClock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function1 {
    public final Transition w;
    public final PreviewAnimationClock x;

    public f(Transition transition0, PreviewAnimationClock previewAnimationClock0) {
        this.w = transition0;
        this.x = previewAnimationClock0;
        super(1);
    }

    public final void a(Object object0) {
        Transition transition0 = this.w;
        AnimatedContentComposeAnimation animatedContentComposeAnimation0 = AnimatedContentComposeAnimation.Companion.parseAnimatedContent(transition0);
        PreviewAnimationClock previewAnimationClock0 = this.x;
        if(animatedContentComposeAnimation0 != null) {
            previewAnimationClock0.getAnimatedContentClocks$ui_tooling_release().put(animatedContentComposeAnimation0, new TransitionClock(animatedContentComposeAnimation0));
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

