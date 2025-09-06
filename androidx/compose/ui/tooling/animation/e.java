package androidx.compose.ui.tooling.animation;

import androidx.compose.ui.tooling.animation.clock.AnimateXAsStateClock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function1 {
    public final AnimateXAsStateSearchInfo w;
    public final PreviewAnimationClock x;

    public e(AnimateXAsStateSearchInfo animationSearch$AnimateXAsStateSearchInfo0, PreviewAnimationClock previewAnimationClock0) {
        this.w = animationSearch$AnimateXAsStateSearchInfo0;
        this.x = previewAnimationClock0;
        super(1);
    }

    public final void a(Object object0) {
        AnimateXAsStateSearchInfo animationSearch$AnimateXAsStateSearchInfo0 = this.w;
        AnimateXAsStateComposeAnimation animateXAsStateComposeAnimation0 = AnimateXAsStateComposeAnimation.Companion.parse$ui_tooling_release(animationSearch$AnimateXAsStateSearchInfo0);
        PreviewAnimationClock previewAnimationClock0 = this.x;
        if(animateXAsStateComposeAnimation0 != null) {
            previewAnimationClock0.getAnimateXAsStateClocks$ui_tooling_release().put(animateXAsStateComposeAnimation0, new AnimateXAsStateClock(animateXAsStateComposeAnimation0));
            return;
        }
        previewAnimationClock0.a(animationSearch$AnimateXAsStateSearchInfo0.getAnimatable().getLabel());
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        this.a(object0);
        return Unit.INSTANCE;
    }
}

