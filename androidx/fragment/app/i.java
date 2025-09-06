package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.core.os.CancellationSignal;
import androidx.fragment.R.animator;
import androidx.fragment.R.id;
import kotlin.jvm.internal.Intrinsics;

public final class i extends j {
    public final boolean c;
    public boolean d;
    public g0 e;

    public i(Operation specialEffectsController$Operation0, CancellationSignal cancellationSignal0, boolean z) {
        Intrinsics.checkNotNullParameter(specialEffectsController$Operation0, "operation");
        Intrinsics.checkNotNullParameter(cancellationSignal0, "signal");
        super(specialEffectsController$Operation0, cancellationSignal0);
        this.c = z;
    }

    public final g0 c(Context context0) {
        g0 g01;
        g0 g00;
        int v2;
        int v1;
        Intrinsics.checkNotNullParameter(context0, "context");
        if(this.d) {
            return this.e;
        }
        Fragment fragment0 = this.a.getFragment();
        boolean z = this.a.getFinalState() == State.VISIBLE;
        int v = fragment0.getNextTransition();
        if(!this.c) {
            v1 = z ? fragment0.getEnterAnim() : fragment0.getExitAnim();
        }
        else if(z) {
            v1 = fragment0.getPopEnterAnim();
        }
        else {
            v1 = fragment0.getPopExitAnim();
        }
        fragment0.setAnimations(0, 0, 0, 0);
        if(fragment0.mContainer != null && fragment0.mContainer.getTag(id.visible_removing_fragment_view_tag) != null) {
            fragment0.mContainer.setTag(id.visible_removing_fragment_view_tag, null);
        }
        if(fragment0.mContainer == null || fragment0.mContainer.getLayoutTransition() == null) {
            if(v1 == 0) {
                switch(v) {
                    case 0: {
                        break;
                    }
                    case 0x1001: {
                        v2 = z ? animator.fragment_open_enter : animator.fragment_open_exit;
                        v1 = v2;
                        break;
                    }
                    case 0x1003: {
                        v2 = z ? animator.fragment_fade_enter : animator.fragment_fade_exit;
                        v1 = v2;
                        break;
                    }
                    case 4100: {
                        v2 = z ? i0.a(context0, 0x10100B8) : i0.a(context0, 0x10100B9);
                        v1 = v2;
                        break;
                    }
                    case 0x2002: {
                        v2 = z ? animator.fragment_close_enter : animator.fragment_close_exit;
                        v1 = v2;
                        break;
                    }
                    case 0x2005: {
                        v2 = z ? i0.a(context0, 0x10100BA) : i0.a(context0, 0x10100BB);
                        v1 = v2;
                        break;
                    }
                    default: {
                        v1 = -1;
                    }
                }
            }
            if(v1 != 0) {
                boolean z1 = "anim".equals(context0.getResources().getResourceTypeName(v1));
                if(z1) {
                    try {
                        Animation animation0 = AnimationUtils.loadAnimation(context0, v1);
                        if(animation0 == null) {
                            g01 = null;
                        }
                        else {
                            g00 = new g0(animation0);
                            g01 = g00;
                        }
                        this.e = g01;
                        this.d = true;
                        return g01;
                    }
                    catch(Resources.NotFoundException resources$NotFoundException0) {
                    }
                    catch(RuntimeException unused_ex) {
                        goto label_54;
                    }
                    throw resources$NotFoundException0;
                }
                else {
                    try {
                    label_54:
                        Animator animator0 = AnimatorInflater.loadAnimator(context0, v1);
                        if(animator0 == null) {
                            g01 = null;
                        }
                        else {
                            g00 = new g0(animator0);
                            g01 = g00;
                        }
                        this.e = g01;
                        this.d = true;
                        return g01;
                    }
                    catch(RuntimeException runtimeException0) {
                        if(z1) {
                            throw runtimeException0;
                        }
                        Animation animation1 = AnimationUtils.loadAnimation(context0, v1);
                        g01 = animation1 == null ? null : new g0(animation1);
                    }
                    this.e = g01;
                    this.d = true;
                    return g01;
                }
            }
        }
        else {
            g01 = null;
        }
        this.e = g01;
        this.d = true;
        return g01;
    }
}

