package coil.target;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import coil.transition.TransitionTarget;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u0019\u0010\u000E\u001A\u00020\n2\b\u0010\r\u001A\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000E\u0010\fJ\u0017\u0010\u0010\u001A\u00020\n2\u0006\u0010\u000F\u001A\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u0017\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0012\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u000B\u0010\u0013J\u0017\u0010\u0014\u001A\u00020\n2\u0006\u0010\u0012\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0019\u0010\u0016\u001A\u00020\n2\b\u0010\u0015\u001A\u0004\u0018\u00010\bH\u0004¢\u0006\u0004\b\u0016\u0010\fJ\u000F\u0010\u0017\u001A\u00020\nH\u0004¢\u0006\u0004\b\u0017\u0010\u0007R\u001E\u0010\u0015\u001A\u0004\u0018\u00010\b8&@&X¦\u000E¢\u0006\f\u001A\u0004\b\u0018\u0010\u0019\"\u0004\b\u001A\u0010\f¨\u0006\u001B"}, d2 = {"Lcoil/target/GenericViewTarget;", "Landroid/view/View;", "T", "Lcoil/target/ViewTarget;", "Lcoil/transition/TransitionTarget;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "<init>", "()V", "Landroid/graphics/drawable/Drawable;", "placeholder", "", "onStart", "(Landroid/graphics/drawable/Drawable;)V", "error", "onError", "result", "onSuccess", "Landroidx/lifecycle/LifecycleOwner;", "owner", "(Landroidx/lifecycle/LifecycleOwner;)V", "onStop", "drawable", "updateDrawable", "updateAnimation", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "setDrawable", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class GenericViewTarget implements DefaultLifecycleObserver, ViewTarget, TransitionTarget {
    public boolean a;

    @Override  // coil.transition.TransitionTarget
    @Nullable
    public abstract Drawable getDrawable();

    @Override  // coil.target.Target
    public void onError(@Nullable Drawable drawable0) {
        this.updateDrawable(drawable0);
    }

    @Override  // coil.target.Target
    public void onStart(@Nullable Drawable drawable0) {
        this.updateDrawable(drawable0);
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull LifecycleOwner lifecycleOwner0) {
        this.a = true;
        this.updateAnimation();
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull LifecycleOwner lifecycleOwner0) {
        this.a = false;
        this.updateAnimation();
    }

    @Override  // coil.target.Target
    public void onSuccess(@NotNull Drawable drawable0) {
        this.updateDrawable(drawable0);
    }

    public abstract void setDrawable(@Nullable Drawable arg1);

    public final void updateAnimation() {
        Drawable drawable0 = this.getDrawable();
        Animatable animatable0 = drawable0 instanceof Animatable ? ((Animatable)drawable0) : null;
        if(animatable0 == null) {
            return;
        }
        if(this.a) {
            animatable0.start();
            return;
        }
        animatable0.stop();
    }

    public final void updateDrawable(@Nullable Drawable drawable0) {
        Drawable drawable1 = this.getDrawable();
        Animatable animatable0 = drawable1 instanceof Animatable ? ((Animatable)drawable1) : null;
        if(animatable0 != null) {
            animatable0.stop();
        }
        this.setDrawable(drawable0);
        this.updateAnimation();
    }
}

