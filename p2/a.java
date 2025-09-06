package p2;

import androidx.compose.animation.core.DecayAnimation;
import androidx.compose.animation.core.TargetBasedAnimation;
import androidx.compose.animation.core.Transition;
import androidx.compose.ui.tooling.animation.AnimationSearch;
import androidx.compose.ui.tooling.animation.PreviewAnimationClock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function1 {
    public final int w;
    public final AnimationSearch x;

    public a(AnimationSearch animationSearch0, int v) {
        this.w = v;
        this.x = animationSearch0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                ((PreviewAnimationClock)this.x.a.invoke()).trackAnimatedContent(((Transition)object0));
                return Unit.INSTANCE;
            }
            case 1: {
                ((PreviewAnimationClock)this.x.a.invoke()).trackAnimatedVisibility(((Transition)object0), this.x.b);
                return Unit.INSTANCE;
            }
            case 2: {
                ((PreviewAnimationClock)this.x.a.invoke()).trackTransition(((Transition)object0));
                return Unit.INSTANCE;
            }
            case 3: {
                ((PreviewAnimationClock)this.x.a.invoke()).trackAnimateContentSize(object0);
                return Unit.INSTANCE;
            }
            case 4: {
                ((PreviewAnimationClock)this.x.a.invoke()).trackTargetBasedAnimations(((TargetBasedAnimation)object0));
                return Unit.INSTANCE;
            }
            default: {
                ((PreviewAnimationClock)this.x.a.invoke()).trackDecayAnimations(((DecayAnimation)object0));
                return Unit.INSTANCE;
            }
        }
    }
}

