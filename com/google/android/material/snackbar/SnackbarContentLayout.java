package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import com.google.android.material.R.id;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MotionUtils;

@RestrictTo({Scope.LIBRARY_GROUP})
public class SnackbarContentLayout extends LinearLayout implements ContentViewCallback {
    public TextView a;
    public Button b;
    public final TimeInterpolator c;
    public int d;

    public SnackbarContentLayout(@NonNull Context context0) {
        this(context0, null);
    }

    public SnackbarContentLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.c = MotionUtils.resolveThemeInterpolator(context0, attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
    }

    public final boolean a(int v, int v1, int v2) {
        boolean z;
        if(v == this.getOrientation()) {
            z = false;
        }
        else {
            this.setOrientation(v);
            z = true;
        }
        if(this.a.getPaddingTop() == v1 && this.a.getPaddingBottom() == v2) {
            return z;
        }
        TextView textView0 = this.a;
        if(ViewCompat.isPaddingRelative(textView0)) {
            ViewCompat.setPaddingRelative(textView0, ViewCompat.getPaddingStart(textView0), v1, ViewCompat.getPaddingEnd(textView0), v2);
            return true;
        }
        textView0.setPadding(textView0.getPaddingLeft(), v1, textView0.getPaddingRight(), v2);
        return true;
    }

    @Override  // com.google.android.material.snackbar.ContentViewCallback
    public void animateContentIn(int v, int v1) {
        this.a.setAlpha(0.0f);
        ViewPropertyAnimator viewPropertyAnimator0 = this.a.animate().alpha(1.0f).setDuration(((long)v1));
        TimeInterpolator timeInterpolator0 = this.c;
        viewPropertyAnimator0.setInterpolator(timeInterpolator0).setStartDelay(((long)v)).start();
        if(this.b.getVisibility() == 0) {
            this.b.setAlpha(0.0f);
            this.b.animate().alpha(1.0f).setDuration(((long)v1)).setInterpolator(timeInterpolator0).setStartDelay(((long)v)).start();
        }
    }

    @Override  // com.google.android.material.snackbar.ContentViewCallback
    public void animateContentOut(int v, int v1) {
        this.a.setAlpha(1.0f);
        ViewPropertyAnimator viewPropertyAnimator0 = this.a.animate().alpha(0.0f).setDuration(((long)v1));
        TimeInterpolator timeInterpolator0 = this.c;
        viewPropertyAnimator0.setInterpolator(timeInterpolator0).setStartDelay(((long)v)).start();
        if(this.b.getVisibility() == 0) {
            this.b.setAlpha(1.0f);
            this.b.animate().alpha(0.0f).setDuration(((long)v1)).setInterpolator(timeInterpolator0).setStartDelay(((long)v)).start();
        }
    }

    public Button getActionView() {
        return this.b;
    }

    public TextView getMessageView() {
        return this.a;
    }

    @Override  // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView)this.findViewById(id.snackbar_text);
        this.b = (Button)this.findViewById(id.snackbar_action);
    }

    @Override  // android.widget.LinearLayout
    public void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        if(this.getOrientation() == 1) {
            return;
        }
        int v2 = this.getResources().getDimensionPixelSize(dimen.design_snackbar_padding_vertical_2lines);
        int v3 = this.getResources().getDimensionPixelSize(dimen.design_snackbar_padding_vertical);
        Layout layout0 = this.a.getLayout();
        boolean z = layout0 != null && layout0.getLineCount() > 1;
        if(!z || this.d <= 0 || this.b.getMeasuredWidth() <= this.d) {
            if(!z) {
                v2 = v3;
            }
            if(this.a(0, v2, v2)) {
                super.onMeasure(v, v1);
            }
        }
        else if(this.a(1, v2, v2 - v3)) {
            super.onMeasure(v, v1);
        }
    }

    public void setMaxInlineActionWidth(int v) {
        this.d = v;
    }
}

