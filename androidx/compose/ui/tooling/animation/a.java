package androidx.compose.ui.tooling.animation;

import androidx.compose.ui.Modifier.Element;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function1 {
    public final AnimateContentSizeSearch w;

    public a(AnimateContentSizeSearch animationSearch$AnimateContentSizeSearch0) {
        this.w = animationSearch$AnimateContentSizeSearch0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(Intrinsics.areEqual(((Element)object0).getClass().getName(), "androidx.compose.animation.SizeAnimationModifierElement")) {
            this.w.getAnimations().add(((Element)object0));
            return true;
        }
        return false;
    }
}

