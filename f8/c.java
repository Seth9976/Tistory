package f8;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import androidx.activity.h;
import com.google.android.material.R.attr;
import com.google.android.material.R.drawable;
import com.google.android.material.R.string;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.datepicker.i;
import com.google.android.material.datepicker.t;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.textfield.b;

public final class c extends l {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public final TimeInterpolator h;
    public EditText i;
    public final t j;
    public final i k;
    public AnimatorSet l;
    public ValueAnimator m;

    public c(b b0) {
        super(b0);
        this.j = new t(this, 8);
        this.k = new i(this, 5);
        this.e = MotionUtils.resolveThemeDuration(b0.getContext(), attr.motionDurationShort3, 100);
        this.f = MotionUtils.resolveThemeDuration(b0.getContext(), attr.motionDurationShort3, 150);
        this.g = MotionUtils.resolveThemeInterpolator(b0.getContext(), attr.motionEasingLinearInterpolator, AnimationUtils.LINEAR_INTERPOLATOR);
        this.h = MotionUtils.resolveThemeInterpolator(b0.getContext(), attr.motionEasingEmphasizedInterpolator, AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
    }

    @Override  // f8.l
    public final void a() {
        if(this.b.p != null) {
            return;
        }
        this.t(this.u());
    }

    @Override  // f8.l
    public final int c() {
        return string.clear_text_end_icon_content_description;
    }

    @Override  // f8.l
    public final int d() {
        return drawable.mtrl_ic_cancel;
    }

    @Override  // f8.l
    public final View.OnFocusChangeListener e() {
        return this.k;
    }

    @Override  // f8.l
    public final View.OnClickListener f() {
        return this.j;
    }

    @Override  // f8.l
    public final View.OnFocusChangeListener g() {
        return this.k;
    }

    @Override  // f8.l
    public final void m(EditText editText0) {
        this.i = editText0;
        boolean z = this.u();
        this.a.setEndIconVisible(z);
    }

    @Override  // f8.l
    public final void p(boolean z) {
        if(this.b.p == null) {
            return;
        }
        this.t(z);
    }

    @Override  // f8.l
    public final void r() {
        ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        valueAnimator0.setInterpolator(this.h);
        valueAnimator0.setDuration(((long)this.f));
        valueAnimator0.addUpdateListener(new a(this, 1));
        ValueAnimator valueAnimator1 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        valueAnimator1.setInterpolator(this.g);
        valueAnimator1.setDuration(((long)this.e));
        valueAnimator1.addUpdateListener(new a(this, 0));
        AnimatorSet animatorSet0 = new AnimatorSet();
        this.l = animatorSet0;
        animatorSet0.playTogether(new Animator[]{valueAnimator0, valueAnimator1});
        this.l.addListener(new f8.b(this, 0));
        ValueAnimator valueAnimator2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        valueAnimator2.setInterpolator(this.g);
        valueAnimator2.setDuration(((long)this.e));
        valueAnimator2.addUpdateListener(new a(this, 0));
        this.m = valueAnimator2;
        valueAnimator2.addListener(new f8.b(this, 1));
    }

    @Override  // f8.l
    public final void s() {
        EditText editText0 = this.i;
        if(editText0 != null) {
            editText0.post(new h(this, 18));
        }
    }

    public final void t(boolean z) {
        boolean z1 = this.b.d() == z;
        if(z && !this.l.isRunning()) {
            this.m.cancel();
            this.l.start();
            if(z1) {
                this.l.end();
            }
        }
        else if(!z) {
            this.l.cancel();
            this.m.start();
            if(z1) {
                this.m.end();
            }
        }
    }

    // 去混淆评级： 低(20)
    public final boolean u() {
        return this.i != null && (this.i.hasFocus() || this.d.hasFocus()) && this.i.getText().length() > 0;
    }
}

