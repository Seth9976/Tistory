package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/fragment/app/DefaultSpecialEffectsController$startAnimations$1", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "anim", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class DefaultSpecialEffectsController.startAnimations.1 extends AnimatorListenerAdapter {
    public final DefaultSpecialEffectsController a;
    public final View b;
    public final boolean c;
    public final Operation d;
    public final i e;

    public DefaultSpecialEffectsController.startAnimations.1(DefaultSpecialEffectsController defaultSpecialEffectsController0, View view0, boolean z, Operation specialEffectsController$Operation0, i i0) {
        this.a = defaultSpecialEffectsController0;
        this.b = view0;
        this.c = z;
        this.d = specialEffectsController$Operation0;
        this.e = i0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public void onAnimationEnd(@NotNull Animator animator0) {
        Intrinsics.checkNotNullParameter(animator0, "anim");
        View view0 = this.b;
        this.a.getContainer().endViewTransition(view0);
        Operation specialEffectsController$Operation0 = this.d;
        if(this.c) {
            Intrinsics.checkNotNullExpressionValue(view0, "viewToAnimate");
            specialEffectsController$Operation0.getFinalState().applyState(view0);
        }
        this.e.a();
        if(FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Animator from operation " + specialEffectsController$Operation0 + " has ended.");
        }
    }
}

