package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.Animation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"androidx/fragment/app/DefaultSpecialEffectsController$startAnimations$3", "Landroid/view/animation/Animation$AnimationListener;", "Landroid/view/animation/Animation;", "animation", "", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "onAnimationEnd", "onAnimationRepeat", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class DefaultSpecialEffectsController.startAnimations.3 implements Animation.AnimationListener {
    public final Operation a;
    public final DefaultSpecialEffectsController b;
    public final View c;
    public final i d;

    public DefaultSpecialEffectsController.startAnimations.3(View view0, i i0, DefaultSpecialEffectsController defaultSpecialEffectsController0, Operation specialEffectsController$Operation0) {
        this.a = specialEffectsController$Operation0;
        this.b = defaultSpecialEffectsController0;
        this.c = view0;
        this.d = i0;
    }

    @Override  // android.view.animation.Animation$AnimationListener
    public void onAnimationEnd(@NotNull Animation animation0) {
        Intrinsics.checkNotNullParameter(animation0, "animation");
        e e0 = new e(this.b, this.c, this.d);
        this.b.getContainer().post(e0);
        if(FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.a + " has ended.");
        }
    }

    @Override  // android.view.animation.Animation$AnimationListener
    public void onAnimationRepeat(@NotNull Animation animation0) {
        Intrinsics.checkNotNullParameter(animation0, "animation");
    }

    @Override  // android.view.animation.Animation$AnimationListener
    public void onAnimationStart(@NotNull Animation animation0) {
        Intrinsics.checkNotNullParameter(animation0, "animation");
        if(FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.a + " has reached onAnimationStart.");
        }
    }
}

