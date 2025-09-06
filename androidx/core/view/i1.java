package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import androidx.core.R.id;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import java.util.List;

public final class i1 extends l1 {
    public static final PathInterpolator f;
    public static final FastOutLinearInInterpolator g;
    public static final DecelerateInterpolator h;

    static {
        i1.f = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
        i1.g = new FastOutLinearInInterpolator();
        i1.h = new DecelerateInterpolator();
    }

    public static void g(View view0, WindowInsetsAnimationCompat windowInsetsAnimationCompat0) {
        Callback windowInsetsAnimationCompat$Callback0 = i1.l(view0);
        if(windowInsetsAnimationCompat$Callback0 != null) {
            windowInsetsAnimationCompat$Callback0.onEnd(windowInsetsAnimationCompat0);
            if(windowInsetsAnimationCompat$Callback0.getDispatchMode() == 0) {
                return;
            }
        }
        if(view0 instanceof ViewGroup) {
            for(int v = 0; v < ((ViewGroup)view0).getChildCount(); ++v) {
                i1.g(((ViewGroup)view0).getChildAt(v), windowInsetsAnimationCompat0);
            }
        }
    }

    public static void h(View view0, WindowInsetsAnimationCompat windowInsetsAnimationCompat0, WindowInsets windowInsets0, boolean z) {
        Callback windowInsetsAnimationCompat$Callback0 = i1.l(view0);
        if(windowInsetsAnimationCompat$Callback0 != null) {
            windowInsetsAnimationCompat$Callback0.a = windowInsets0;
            if(!z) {
                windowInsetsAnimationCompat$Callback0.onPrepare(windowInsetsAnimationCompat0);
                z = windowInsetsAnimationCompat$Callback0.getDispatchMode() == 0;
            }
        }
        if(view0 instanceof ViewGroup) {
            for(int v = 0; v < ((ViewGroup)view0).getChildCount(); ++v) {
                i1.h(((ViewGroup)view0).getChildAt(v), windowInsetsAnimationCompat0, windowInsets0, z);
            }
        }
    }

    public static void i(View view0, WindowInsetsCompat windowInsetsCompat0, List list0) {
        Callback windowInsetsAnimationCompat$Callback0 = i1.l(view0);
        if(windowInsetsAnimationCompat$Callback0 != null) {
            windowInsetsCompat0 = windowInsetsAnimationCompat$Callback0.onProgress(windowInsetsCompat0, list0);
            if(windowInsetsAnimationCompat$Callback0.getDispatchMode() == 0) {
                return;
            }
        }
        if(view0 instanceof ViewGroup) {
            for(int v = 0; v < ((ViewGroup)view0).getChildCount(); ++v) {
                i1.i(((ViewGroup)view0).getChildAt(v), windowInsetsCompat0, list0);
            }
        }
    }

    public static void j(View view0, WindowInsetsAnimationCompat windowInsetsAnimationCompat0, BoundsCompat windowInsetsAnimationCompat$BoundsCompat0) {
        Callback windowInsetsAnimationCompat$Callback0 = i1.l(view0);
        if(windowInsetsAnimationCompat$Callback0 != null) {
            windowInsetsAnimationCompat$Callback0.onStart(windowInsetsAnimationCompat0, windowInsetsAnimationCompat$BoundsCompat0);
            if(windowInsetsAnimationCompat$Callback0.getDispatchMode() == 0) {
                return;
            }
        }
        if(view0 instanceof ViewGroup) {
            for(int v = 0; v < ((ViewGroup)view0).getChildCount(); ++v) {
                i1.j(((ViewGroup)view0).getChildAt(v), windowInsetsAnimationCompat0, windowInsetsAnimationCompat$BoundsCompat0);
            }
        }
    }

    public static WindowInsets k(View view0, WindowInsets windowInsets0) {
        return view0.getTag(id.tag_on_apply_window_listener) == null ? view0.onApplyWindowInsets(windowInsets0) : windowInsets0;
    }

    public static Callback l(View view0) {
        Object object0 = view0.getTag(id.tag_window_insets_animation_callback);
        return object0 instanceof h1 ? ((h1)object0).a : null;
    }
}

