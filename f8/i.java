package f8;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import androidx.core.app.h;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.o;
import com.google.android.material.R.attr;
import com.google.android.material.R.drawable;
import com.google.android.material.R.string;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.datepicker.t;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.motion.e;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textfield.b;
import g.a;

public final class i extends l {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public AutoCompleteTextView h;
    public final t i;
    public final com.google.android.material.datepicker.i j;
    public final h k;
    public boolean l;
    public boolean m;
    public boolean n;
    public long o;
    public AccessibilityManager p;
    public ValueAnimator q;
    public ValueAnimator r;

    public i(b b0) {
        super(b0);
        this.i = new t(this, 9);
        this.j = new com.google.android.material.datepicker.i(this, 6);
        this.k = new h(this, 13);
        this.o = 0x7FFFFFFFFFFFFFFFL;
        this.f = MotionUtils.resolveThemeDuration(b0.getContext(), attr.motionDurationShort3, 67);
        this.e = MotionUtils.resolveThemeDuration(b0.getContext(), attr.motionDurationShort3, 50);
        this.g = MotionUtils.resolveThemeInterpolator(b0.getContext(), attr.motionEasingLinearInterpolator, AnimationUtils.LINEAR_INTERPOLATOR);
    }

    @Override  // f8.l
    public final void a() {
        if(this.p.isTouchExplorationEnabled() && a.H(this.h) && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new androidx.activity.h(this, 19));
    }

    @Override  // f8.l
    public final int c() {
        return string.exposed_dropdown_menu_content_description;
    }

    @Override  // f8.l
    public final int d() {
        return drawable.mtrl_dropdown_arrow;
    }

    @Override  // f8.l
    public final View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override  // f8.l
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override  // f8.l
    public final TouchExplorationStateChangeListener h() {
        return this.k;
    }

    @Override  // f8.l
    public final boolean i(int v) {
        return v != 0;
    }

    @Override  // f8.l
    public final boolean j() {
        return this.l;
    }

    @Override  // f8.l
    public final boolean l() {
        return this.n;
    }

    @Override  // f8.l
    public final void m(EditText editText0) {
        if(!(editText0 instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        this.h = (AutoCompleteTextView)editText0;
        ((AutoCompleteTextView)editText0).setOnTouchListener(new o(this, 2));
        this.h.setOnDismissListener(new f8.h(this));
        this.h.setThreshold(0);
        TextInputLayout textInputLayout0 = this.a;
        textInputLayout0.setErrorIconDrawable(null);
        if(!a.H(editText0) && this.p.isTouchExplorationEnabled()) {
            ViewCompat.setImportantForAccessibility(this.d, 2);
        }
        textInputLayout0.setEndIconVisible(true);
    }

    @Override  // f8.l
    public final void n(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        if(!a.H(this.h)) {
            accessibilityNodeInfoCompat0.setClassName("android.widget.Spinner");
        }
        if(accessibilityNodeInfoCompat0.isShowingHintText()) {
            accessibilityNodeInfoCompat0.setHintText(null);
        }
    }

    @Override  // f8.l
    public final void o(AccessibilityEvent accessibilityEvent0) {
        if(this.p.isEnabled() && !a.H(this.h)) {
            boolean z = accessibilityEvent0.getEventType() == 0x8000 && this.n && !this.h.isPopupShowing();
            if(accessibilityEvent0.getEventType() == 1 || z) {
                this.u();
                this.m = true;
                this.o = System.currentTimeMillis();
            }
        }
    }

    @Override  // f8.l
    public final void r() {
        ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        valueAnimator0.setInterpolator(this.g);
        valueAnimator0.setDuration(((long)this.f));
        valueAnimator0.addUpdateListener(new e(this, 3));
        this.r = valueAnimator0;
        ValueAnimator valueAnimator1 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        valueAnimator1.setInterpolator(this.g);
        valueAnimator1.setDuration(((long)this.e));
        valueAnimator1.addUpdateListener(new e(this, 3));
        this.q = valueAnimator1;
        valueAnimator1.addListener(new a8.e(this, 8));
        this.p = (AccessibilityManager)this.c.getSystemService("accessibility");
    }

    @Override  // f8.l
    public final void s() {
        AutoCompleteTextView autoCompleteTextView0 = this.h;
        if(autoCompleteTextView0 != null) {
            autoCompleteTextView0.setOnTouchListener(null);
            this.h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z) {
        if(this.n != z) {
            this.n = z;
            this.r.cancel();
            this.q.start();
        }
    }

    public final void u() {
        if(this.h == null) {
            return;
        }
        long v = System.currentTimeMillis() - this.o;
        if(Long.compare(v, 0L) < 0 || v > 300L) {
            this.m = false;
        }
        if(!this.m) {
            this.t(!this.n);
            if(this.n) {
                this.h.requestFocus();
                this.h.showDropDown();
                return;
            }
            this.h.dismissDropDown();
            return;
        }
        this.m = false;
    }
}

