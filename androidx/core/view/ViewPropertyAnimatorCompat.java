package androidx.core.view;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

public final class ViewPropertyAnimatorCompat {
    public final WeakReference a;

    public ViewPropertyAnimatorCompat(View view0) {
        this.a = new WeakReference(view0);
    }

    @NonNull
    public ViewPropertyAnimatorCompat alpha(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().alpha(f);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat alphaBy(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().alphaBy(f);
        }
        return this;
    }

    public void cancel() {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().cancel();
        }
    }

    public long getDuration() {
        View view0 = (View)this.a.get();
        return view0 == null ? 0L : view0.animate().getDuration();
    }

    @Nullable
    public Interpolator getInterpolator() {
        View view0 = (View)this.a.get();
        return view0 == null ? null : ((Interpolator)view0.animate().getInterpolator());
    }

    public long getStartDelay() {
        View view0 = (View)this.a.get();
        return view0 == null ? 0L : view0.animate().getStartDelay();
    }

    @NonNull
    public ViewPropertyAnimatorCompat rotation(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().rotation(f);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat rotationBy(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().rotationBy(f);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat rotationX(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().rotationX(f);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat rotationXBy(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().rotationXBy(f);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat rotationY(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().rotationY(f);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat rotationYBy(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().rotationYBy(f);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat scaleX(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().scaleX(f);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat scaleXBy(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().scaleXBy(f);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat scaleY(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().scaleY(f);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat scaleYBy(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().scaleYBy(f);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat setDuration(long v) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().setDuration(v);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat setInterpolator(@Nullable Interpolator interpolator0) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().setInterpolator(interpolator0);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat setListener(@Nullable ViewPropertyAnimatorListener viewPropertyAnimatorListener0) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            if(viewPropertyAnimatorListener0 != null) {
                view0.animate().setListener(new a1(viewPropertyAnimatorListener0, view0, 0));
                return this;
            }
            view0.animate().setListener(null);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat setStartDelay(long v) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().setStartDelay(v);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat setUpdateListener(@Nullable ViewPropertyAnimatorUpdateListener viewPropertyAnimatorUpdateListener0) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            z0 z00 = viewPropertyAnimatorUpdateListener0 == null ? null : new z0(0, viewPropertyAnimatorUpdateListener0, view0);
            view0.animate().setUpdateListener(z00);
        }
        return this;
    }

    public void start() {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().start();
        }
    }

    @NonNull
    public ViewPropertyAnimatorCompat translationX(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().translationX(f);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat translationXBy(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().translationXBy(f);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat translationY(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().translationY(f);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat translationYBy(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().translationYBy(f);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat translationZ(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            b1.a(view0.animate(), f);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat translationZBy(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            b1.b(view0.animate(), f);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat withEndAction(@NonNull Runnable runnable0) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().withEndAction(runnable0);
        }
        return this;
    }

    @SuppressLint({"WrongConstant"})
    @NonNull
    public ViewPropertyAnimatorCompat withLayer() {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().withLayer();
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat withStartAction(@NonNull Runnable runnable0) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().withStartAction(runnable0);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat x(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().x(f);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat xBy(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().xBy(f);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat y(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().y(f);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat yBy(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().yBy(f);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat z(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            b1.c(view0.animate(), f);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat zBy(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            b1.d(view0.animate(), f);
        }
        return this;
    }
}

