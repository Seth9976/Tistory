package r7;

import android.view.View;
import androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat;
import androidx.core.view.WindowInsetsAnimationCompat.Callback;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.animation.AnimationUtils;
import java.util.List;

public final class e extends Callback {
    public final View c;
    public int d;
    public int e;
    public final int[] f;

    public e(View view0) {
        super(0);
        this.f = new int[2];
        this.c = view0;
    }

    @Override  // androidx.core.view.WindowInsetsAnimationCompat$Callback
    public final void onEnd(WindowInsetsAnimationCompat windowInsetsAnimationCompat0) {
        this.c.setTranslationY(0.0f);
    }

    @Override  // androidx.core.view.WindowInsetsAnimationCompat$Callback
    public final void onPrepare(WindowInsetsAnimationCompat windowInsetsAnimationCompat0) {
        this.c.getLocationOnScreen(this.f);
        this.d = this.f[1];
    }

    @Override  // androidx.core.view.WindowInsetsAnimationCompat$Callback
    public final WindowInsetsCompat onProgress(WindowInsetsCompat windowInsetsCompat0, List list0) {
        for(Object object0: list0) {
            WindowInsetsAnimationCompat windowInsetsAnimationCompat0 = (WindowInsetsAnimationCompat)object0;
            if((windowInsetsAnimationCompat0.getTypeMask() & 8) != 0) {
                int v = this.e;
                float f = windowInsetsAnimationCompat0.getInterpolatedFraction();
                this.c.setTranslationY(((float)AnimationUtils.lerp(v, 0, f)));
                return windowInsetsCompat0;
            }
            if(false) {
                break;
            }
        }
        return windowInsetsCompat0;
    }

    @Override  // androidx.core.view.WindowInsetsAnimationCompat$Callback
    public final BoundsCompat onStart(WindowInsetsAnimationCompat windowInsetsAnimationCompat0, BoundsCompat windowInsetsAnimationCompat$BoundsCompat0) {
        this.c.getLocationOnScreen(this.f);
        int v = this.d - this.f[1];
        this.e = v;
        this.c.setTranslationY(((float)v));
        return windowInsetsAnimationCompat$BoundsCompat0;
    }
}

