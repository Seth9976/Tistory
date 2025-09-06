package androidx.vectordrawable.graphics.drawable;

import android.graphics.drawable.Animatable2.AnimationCallback;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

public interface Animatable2Compat extends Animatable {
    public static abstract class AnimationCallback {
        public a a;

        public final Animatable2.AnimationCallback a() {
            if(this.a == null) {
                this.a = new a(this);
            }
            return this.a;
        }

        public void onAnimationEnd(Drawable drawable0) {
        }

        public void onAnimationStart(Drawable drawable0) {
        }
    }

    void clearAnimationCallbacks();

    void registerAnimationCallback(@NonNull AnimationCallback arg1);

    boolean unregisterAnimationCallback(@NonNull AnimationCallback arg1);
}

