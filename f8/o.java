package f8;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;

public final class o {
    public ColorStateList A;
    public Typeface B;
    public final int a;
    public final int b;
    public final int c;
    public final TimeInterpolator d;
    public final TimeInterpolator e;
    public final TimeInterpolator f;
    public final Context g;
    public final TextInputLayout h;
    public LinearLayout i;
    public int j;
    public FrameLayout k;
    public AnimatorSet l;
    public final float m;
    public int n;
    public int o;
    public CharSequence p;
    public boolean q;
    public AppCompatTextView r;
    public CharSequence s;
    public int t;
    public int u;
    public ColorStateList v;
    public CharSequence w;
    public boolean x;
    public AppCompatTextView y;
    public int z;

    public o(TextInputLayout textInputLayout0) {
        Context context0 = textInputLayout0.getContext();
        this.g = context0;
        this.h = textInputLayout0;
        this.m = (float)context0.getResources().getDimensionPixelSize(dimen.design_textinput_caption_translate_y);
        this.a = MotionUtils.resolveThemeDuration(context0, attr.motionDurationShort4, 0xD9);
        this.b = MotionUtils.resolveThemeDuration(context0, attr.motionDurationMedium4, 0xA7);
        this.c = MotionUtils.resolveThemeDuration(context0, attr.motionDurationShort4, 0xA7);
        this.d = MotionUtils.resolveThemeInterpolator(context0, attr.motionEasingEmphasizedDecelerateInterpolator, AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
        this.e = MotionUtils.resolveThemeInterpolator(context0, attr.motionEasingEmphasizedDecelerateInterpolator, AnimationUtils.LINEAR_INTERPOLATOR);
        this.f = MotionUtils.resolveThemeInterpolator(context0, attr.motionEasingLinearInterpolator, AnimationUtils.LINEAR_INTERPOLATOR);
    }

    public final void a(AppCompatTextView appCompatTextView0, int v) {
        if(this.i == null && this.k == null) {
            LinearLayout linearLayout0 = new LinearLayout(this.g);
            this.i = linearLayout0;
            linearLayout0.setOrientation(0);
            this.h.addView(this.i, -1, -2);
            this.k = new FrameLayout(this.g);
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(0, -2, 1.0f);
            this.i.addView(this.k, linearLayout$LayoutParams0);
            if(this.h.getEditText() != null) {
                this.b();
            }
        }
        if(v == 0 || v == 1) {
            this.k.setVisibility(0);
            this.k.addView(appCompatTextView0);
        }
        else {
            LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-2, -2);
            this.i.addView(appCompatTextView0, linearLayout$LayoutParams1);
        }
        this.i.setVisibility(0);
        ++this.j;
    }

    public final void b() {
        if(this.i != null) {
            TextInputLayout textInputLayout0 = this.h;
            if(textInputLayout0.getEditText() != null) {
                EditText editText0 = textInputLayout0.getEditText();
                Context context0 = this.g;
                boolean z = MaterialResources.isFontScaleAtLeast1_3(context0);
                LinearLayout linearLayout0 = this.i;
                int v = dimen.material_helper_text_font_1_3_padding_horizontal;
                int v1 = ViewCompat.getPaddingStart(editText0);
                if(z) {
                    v1 = context0.getResources().getDimensionPixelSize(v);
                }
                int v2 = dimen.material_helper_text_font_1_3_padding_top;
                int v3 = context0.getResources().getDimensionPixelSize(dimen.material_helper_text_default_padding_top);
                if(z) {
                    v3 = context0.getResources().getDimensionPixelSize(v2);
                }
                int v4 = dimen.material_helper_text_font_1_3_padding_horizontal;
                int v5 = ViewCompat.getPaddingEnd(editText0);
                if(z) {
                    v5 = context0.getResources().getDimensionPixelSize(v4);
                }
                ViewCompat.setPaddingRelative(linearLayout0, v1, v3, v5, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet0 = this.l;
        if(animatorSet0 != null) {
            animatorSet0.cancel();
        }
    }

    public final void d(ArrayList arrayList0, boolean z, AppCompatTextView appCompatTextView0, int v, int v1, int v2) {
        if(appCompatTextView0 != null && z && (v == v2 || v == v1)) {
            boolean z1 = v2 == v;
            ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(appCompatTextView0, View.ALPHA, new float[]{(z1 ? 1.0f : 0.0f)});
            int v3 = this.c;
            objectAnimator0.setDuration((z1 ? ((long)this.b) : ((long)v3)));
            objectAnimator0.setInterpolator((z1 ? this.e : this.f));
            if(v == v2 && v1 != 0) {
                objectAnimator0.setStartDelay(((long)v3));
            }
            arrayList0.add(objectAnimator0);
            if(v2 == v && v1 != 0) {
                ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(appCompatTextView0, View.TRANSLATION_Y, new float[]{-this.m, 0.0f});
                objectAnimator1.setDuration(((long)this.a));
                objectAnimator1.setInterpolator(this.d);
                objectAnimator1.setStartDelay(((long)v3));
                arrayList0.add(objectAnimator1);
            }
        }
    }

    public final TextView e(int v) {
        switch(v) {
            case 1: {
                return this.r;
            }
            case 2: {
                return this.y;
            }
            default: {
                return null;
            }
        }
    }

    public final void f() {
        this.p = null;
        this.c();
        if(this.n == 1) {
            this.o = !this.x || TextUtils.isEmpty(this.w) ? 0 : 2;
        }
        this.i(this.n, this.o, this.h(this.r, ""));
    }

    public final void g(AppCompatTextView appCompatTextView0, int v) {
        LinearLayout linearLayout0 = this.i;
        if(linearLayout0 == null) {
            return;
        }
        if(v != 0 && v != 1) {
            linearLayout0.removeView(appCompatTextView0);
        }
        else {
            FrameLayout frameLayout0 = this.k;
            if(frameLayout0 == null) {
                linearLayout0.removeView(appCompatTextView0);
            }
            else {
                frameLayout0.removeView(appCompatTextView0);
            }
        }
        int v1 = this.j - 1;
        this.j = v1;
        LinearLayout linearLayout1 = this.i;
        if(v1 == 0) {
            linearLayout1.setVisibility(8);
        }
    }

    // 去混淆评级： 低(40)
    public final boolean h(AppCompatTextView appCompatTextView0, CharSequence charSequence0) {
        return ViewCompat.isLaidOut(this.h) && this.h.isEnabled() && (this.o != this.n || appCompatTextView0 == null || !TextUtils.equals(appCompatTextView0.getText(), charSequence0));
    }

    public final void i(int v, int v1, boolean z) {
        if(v == v1) {
            return;
        }
        if(z) {
            AnimatorSet animatorSet0 = new AnimatorSet();
            this.l = animatorSet0;
            ArrayList arrayList0 = new ArrayList();
            this.d(arrayList0, this.x, this.y, 2, v, v1);
            this.d(arrayList0, this.q, this.r, 1, v, v1);
            AnimatorSetCompat.playTogether(animatorSet0, arrayList0);
            animatorSet0.addListener(new m(this, v1, this.e(v), v, this.e(v1)));
            animatorSet0.start();
        }
        else if(v != v1) {
            if(v1 != 0) {
                TextView textView0 = this.e(v1);
                if(textView0 != null) {
                    textView0.setVisibility(0);
                    textView0.setAlpha(1.0f);
                }
            }
            if(v != 0) {
                TextView textView1 = this.e(v);
                if(textView1 != null) {
                    textView1.setVisibility(4);
                    if(v == 1) {
                        textView1.setText(null);
                    }
                }
            }
            this.n = v1;
        }
        this.h.r();
        this.h.u(z, false);
        this.h.x();
    }
}

