package p2;

import androidx.compose.animation.core.Transition;
import androidx.compose.ui.tooling.animation.AnimatedVisibilityComposeAnimation;
import androidx.compose.ui.tooling.animation.AnimatedVisibilityComposeAnimation_androidKt;
import androidx.compose.ui.tooling.animation.PreviewAnimationClock;
import androidx.compose.ui.tooling.animation.clock.AnimatedVisibilityClock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function1 {
    public final Transition w;
    public final Function0 x;
    public final PreviewAnimationClock y;

    public d(Transition transition0, Function0 function00, PreviewAnimationClock previewAnimationClock0) {
        this.w = transition0;
        this.x = function00;
        this.y = previewAnimationClock0;
        super(1);
    }

    public final void a(Object object0) {
        Intrinsics.checkNotNull(this.w, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Boolean>");
        AnimatedVisibilityComposeAnimation animatedVisibilityComposeAnimation0 = AnimatedVisibilityComposeAnimation_androidKt.parseAnimatedVisibility(this.w);
        this.x.invoke();
        AnimatedVisibilityClock animatedVisibilityClock0 = new AnimatedVisibilityClock(animatedVisibilityComposeAnimation0);
        animatedVisibilityClock0.setClockTime(0L);
        this.y.getAnimatedVisibilityClocks$ui_tooling_release().put(animatedVisibilityComposeAnimation0, animatedVisibilityClock0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        this.a(object0);
        return Unit.INSTANCE;
    }
}

