package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.R.dimen;
import com.google.android.material.R.id;
import com.google.android.material.R.layout;
import com.google.android.material.R.string;
import com.google.android.material.R.styleable;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import f8.c;
import f8.i;
import f8.j;
import f8.k;
import f8.l;
import f8.q;
import java.util.Iterator;
import java.util.LinkedHashSet;

public final class b extends LinearLayout {
    public final TextInputLayout a;
    public final FrameLayout b;
    public final CheckableImageButton c;
    public ColorStateList d;
    public PorterDuff.Mode e;
    public View.OnLongClickListener f;
    public final CheckableImageButton g;
    public final k h;
    public int i;
    public final LinkedHashSet j;
    public ColorStateList k;
    public PorterDuff.Mode l;
    public int m;
    public ImageView.ScaleType n;
    public View.OnLongClickListener o;
    public CharSequence p;
    public final AppCompatTextView q;
    public boolean r;
    public EditText s;
    public final AccessibilityManager t;
    public TouchExplorationStateChangeListener u;
    public final j v;

    public b(TextInputLayout textInputLayout0, TintTypedArray tintTypedArray0) {
        super(textInputLayout0.getContext());
        this.i = 0;
        this.j = new LinkedHashSet();
        this.v = new j(this);
        a a0 = new a(this);
        this.t = (AccessibilityManager)this.getContext().getSystemService("accessibility");
        this.a = textInputLayout0;
        this.setVisibility(8);
        this.setOrientation(0);
        this.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 0x800005));
        FrameLayout frameLayout0 = new FrameLayout(this.getContext());
        this.b = frameLayout0;
        frameLayout0.setVisibility(8);
        frameLayout0.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflater0 = LayoutInflater.from(this.getContext());
        CheckableImageButton checkableImageButton0 = this.a(layoutInflater0, this, id.text_input_error_icon);
        this.c = checkableImageButton0;
        CheckableImageButton checkableImageButton1 = this.a(layoutInflater0, frameLayout0, id.text_input_end_icon);
        this.g = checkableImageButton1;
        this.h = new k(this, tintTypedArray0);
        AppCompatTextView appCompatTextView0 = new AppCompatTextView(this.getContext());
        this.q = appCompatTextView0;
        if(tintTypedArray0.hasValue(styleable.TextInputLayout_errorIconTint)) {
            this.d = MaterialResources.getColorStateList(this.getContext(), tintTypedArray0, styleable.TextInputLayout_errorIconTint);
        }
        if(tintTypedArray0.hasValue(styleable.TextInputLayout_errorIconTintMode)) {
            this.e = ViewUtils.parseTintMode(tintTypedArray0.getInt(styleable.TextInputLayout_errorIconTintMode, -1), null);
        }
        if(tintTypedArray0.hasValue(styleable.TextInputLayout_errorIconDrawable)) {
            this.i(tintTypedArray0.getDrawable(styleable.TextInputLayout_errorIconDrawable));
        }
        checkableImageButton0.setContentDescription(this.getResources().getText(string.error_icon_content_description));
        ViewCompat.setImportantForAccessibility(checkableImageButton0, 2);
        checkableImageButton0.setClickable(false);
        checkableImageButton0.setPressable(false);
        checkableImageButton0.setFocusable(false);
        if(!tintTypedArray0.hasValue(styleable.TextInputLayout_passwordToggleEnabled)) {
            if(tintTypedArray0.hasValue(styleable.TextInputLayout_endIconTint)) {
                this.k = MaterialResources.getColorStateList(this.getContext(), tintTypedArray0, styleable.TextInputLayout_endIconTint);
            }
            if(tintTypedArray0.hasValue(styleable.TextInputLayout_endIconTintMode)) {
                this.l = ViewUtils.parseTintMode(tintTypedArray0.getInt(styleable.TextInputLayout_endIconTintMode, -1), null);
            }
        }
        if(tintTypedArray0.hasValue(styleable.TextInputLayout_endIconMode)) {
            this.g(tintTypedArray0.getInt(styleable.TextInputLayout_endIconMode, 0));
            if(tintTypedArray0.hasValue(styleable.TextInputLayout_endIconContentDescription)) {
                CharSequence charSequence0 = tintTypedArray0.getText(styleable.TextInputLayout_endIconContentDescription);
                if(checkableImageButton1.getContentDescription() != charSequence0) {
                    checkableImageButton1.setContentDescription(charSequence0);
                }
            }
            checkableImageButton1.setCheckable(tintTypedArray0.getBoolean(styleable.TextInputLayout_endIconCheckable, true));
        }
        else if(tintTypedArray0.hasValue(styleable.TextInputLayout_passwordToggleEnabled)) {
            if(tintTypedArray0.hasValue(styleable.TextInputLayout_passwordToggleTint)) {
                this.k = MaterialResources.getColorStateList(this.getContext(), tintTypedArray0, styleable.TextInputLayout_passwordToggleTint);
            }
            if(tintTypedArray0.hasValue(styleable.TextInputLayout_passwordToggleTintMode)) {
                this.l = ViewUtils.parseTintMode(tintTypedArray0.getInt(styleable.TextInputLayout_passwordToggleTintMode, -1), null);
            }
            this.g(((int)tintTypedArray0.getBoolean(styleable.TextInputLayout_passwordToggleEnabled, false)));
            CharSequence charSequence1 = tintTypedArray0.getText(styleable.TextInputLayout_passwordToggleContentDescription);
            if(checkableImageButton1.getContentDescription() != charSequence1) {
                checkableImageButton1.setContentDescription(charSequence1);
            }
        }
        int v = tintTypedArray0.getDimensionPixelSize(styleable.TextInputLayout_endIconMinSize, this.getResources().getDimensionPixelSize(dimen.mtrl_min_touch_target_size));
        if(v < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if(v != this.m) {
            this.m = v;
            checkableImageButton1.setMinimumWidth(v);
            checkableImageButton1.setMinimumHeight(v);
            checkableImageButton0.setMinimumWidth(v);
            checkableImageButton0.setMinimumHeight(v);
        }
        if(tintTypedArray0.hasValue(styleable.TextInputLayout_endIconScaleType)) {
            ImageView.ScaleType imageView$ScaleType0 = g.b.h(tintTypedArray0.getInt(styleable.TextInputLayout_endIconScaleType, -1));
            this.n = imageView$ScaleType0;
            checkableImageButton1.setScaleType(imageView$ScaleType0);
            checkableImageButton0.setScaleType(imageView$ScaleType0);
        }
        appCompatTextView0.setVisibility(8);
        appCompatTextView0.setId(id.textinput_suffix_text);
        appCompatTextView0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        ViewCompat.setAccessibilityLiveRegion(appCompatTextView0, 1);
        TextViewCompat.setTextAppearance(appCompatTextView0, tintTypedArray0.getResourceId(styleable.TextInputLayout_suffixTextAppearance, 0));
        if(tintTypedArray0.hasValue(styleable.TextInputLayout_suffixTextColor)) {
            appCompatTextView0.setTextColor(tintTypedArray0.getColorStateList(styleable.TextInputLayout_suffixTextColor));
        }
        CharSequence charSequence2 = tintTypedArray0.getText(styleable.TextInputLayout_suffixText);
        this.p = TextUtils.isEmpty(charSequence2) ? null : charSequence2;
        appCompatTextView0.setText(charSequence2);
        this.n();
        frameLayout0.addView(checkableImageButton1);
        this.addView(appCompatTextView0);
        this.addView(frameLayout0);
        this.addView(checkableImageButton0);
        textInputLayout0.addOnEditTextAttachedListener(a0);
        this.addOnAttachStateChangeListener(new d(this, 4));
    }

    public final CheckableImageButton a(LayoutInflater layoutInflater0, ViewGroup viewGroup0, int v) {
        CheckableImageButton checkableImageButton0 = (CheckableImageButton)layoutInflater0.inflate(layout.design_text_input_end_icon, viewGroup0, false);
        checkableImageButton0.setId(v);
        if(MaterialResources.isFontScaleAtLeast1_3(this.getContext())) {
            MarginLayoutParamsCompat.setMarginStart(((ViewGroup.MarginLayoutParams)checkableImageButton0.getLayoutParams()), 0);
        }
        return checkableImageButton0;
    }

    public final l b() {
        int v = this.i;
        k k0 = this.h;
        SparseArray sparseArray0 = k0.a;
        l l0 = (l)sparseArray0.get(v);
        if(l0 == null) {
            b b0 = k0.b;
            switch(v) {
                case -1: {
                    l0 = new f8.d(b0, 0);
                    break;
                }
                case 0: {
                    l0 = new f8.d(b0, 1);
                    break;
                }
                case 1: {
                    l0 = new q(b0, k0.d);
                    break;
                }
                case 2: {
                    l0 = new c(b0);
                    break;
                }
                case 3: {
                    l0 = new i(b0);
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Invalid end icon mode: " + v);
                }
            }
            sparseArray0.append(v, l0);
        }
        return l0;
    }

    public final int c() {
        int v;
        if(this.d() || this.e()) {
            int v1 = this.g.getMeasuredWidth();
            v = MarginLayoutParamsCompat.getMarginStart(((ViewGroup.MarginLayoutParams)this.g.getLayoutParams())) + v1;
        }
        else {
            v = 0;
        }
        int v2 = ViewCompat.getPaddingEnd(this);
        return ViewCompat.getPaddingEnd(this.q) + v2 + v;
    }

    public final boolean d() {
        return this.b.getVisibility() == 0 && this.g.getVisibility() == 0;
    }

    public final boolean e() {
        return this.c.getVisibility() == 0;
    }

    public final void f(boolean z) {
        int v1;
        l l0 = this.b();
        CheckableImageButton checkableImageButton0 = this.g;
        int v = 1;
        if(l0.k()) {
            boolean z1 = checkableImageButton0.isChecked();
            if(z1 == l0.l()) {
                v1 = 0;
            }
            else {
                checkableImageButton0.setChecked(!z1);
                v1 = 1;
            }
        }
        else {
            v1 = 0;
        }
        if(l0 instanceof i) {
            boolean z2 = checkableImageButton0.isActivated();
            if(z2 == l0.j()) {
                v = v1;
            }
            else {
                checkableImageButton0.setActivated(!z2);
            }
        }
        else {
            v = v1;
        }
        if(z || v != 0) {
            g.b.z(this.a, checkableImageButton0, this.k);
        }
    }

    public final void g(int v) {
        TextInputLayout textInputLayout0;
        if(this.i == v) {
            return;
        }
        l l0 = this.b();
        TouchExplorationStateChangeListener accessibilityManagerCompat$TouchExplorationStateChangeListener0 = this.u;
        AccessibilityManager accessibilityManager0 = this.t;
        if(accessibilityManagerCompat$TouchExplorationStateChangeListener0 != null && accessibilityManager0 != null) {
            AccessibilityManagerCompat.removeTouchExplorationStateChangeListener(accessibilityManager0, accessibilityManagerCompat$TouchExplorationStateChangeListener0);
        }
        CharSequence charSequence0 = null;
        this.u = null;
        l0.s();
        int v1 = this.i;
        this.i = v;
        Iterator iterator0 = this.j.iterator();
        while(true) {
            boolean z = iterator0.hasNext();
            textInputLayout0 = this.a;
            if(!z) {
                break;
            }
            Object object0 = iterator0.next();
            ((OnEndIconChangedListener)object0).onEndIconChanged(textInputLayout0, v1);
        }
        this.h(v != 0);
        l l1 = this.b();
        int v2 = this.h.c == 0 ? l1.d() : this.h.c;
        Drawable drawable0 = v2 == 0 ? null : AppCompatResources.getDrawable(this.getContext(), v2);
        CheckableImageButton checkableImageButton0 = this.g;
        checkableImageButton0.setImageDrawable(drawable0);
        if(drawable0 != null) {
            g.b.a(textInputLayout0, checkableImageButton0, this.k, this.l);
            g.b.z(textInputLayout0, checkableImageButton0, this.k);
        }
        int v3 = l1.c();
        if(v3 != 0) {
            charSequence0 = this.getResources().getText(v3);
        }
        if(checkableImageButton0.getContentDescription() != charSequence0) {
            checkableImageButton0.setContentDescription(charSequence0);
        }
        checkableImageButton0.setCheckable(l1.k());
        if(!l1.i(textInputLayout0.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout0.getBoxBackgroundMode() + " is not supported by the end icon mode " + v);
        }
        l1.r();
        TouchExplorationStateChangeListener accessibilityManagerCompat$TouchExplorationStateChangeListener1 = l1.h();
        this.u = accessibilityManagerCompat$TouchExplorationStateChangeListener1;
        if(accessibilityManagerCompat$TouchExplorationStateChangeListener1 != null && accessibilityManager0 != null && ViewCompat.isAttachedToWindow(this)) {
            AccessibilityManagerCompat.addTouchExplorationStateChangeListener(accessibilityManager0, this.u);
        }
        View.OnLongClickListener view$OnLongClickListener0 = this.o;
        checkableImageButton0.setOnClickListener(l1.f());
        g.b.E(checkableImageButton0, view$OnLongClickListener0);
        EditText editText0 = this.s;
        if(editText0 != null) {
            l1.m(editText0);
            this.j(l1);
        }
        g.b.a(textInputLayout0, checkableImageButton0, this.k, this.l);
        this.f(true);
    }

    public final void h(boolean z) {
        if(this.d() != z) {
            this.g.setVisibility((z ? 0 : 8));
            this.k();
            this.m();
            this.a.q();
        }
    }

    public final void i(Drawable drawable0) {
        this.c.setImageDrawable(drawable0);
        this.l();
        g.b.a(this.a, this.c, this.d, this.e);
    }

    public final void j(l l0) {
        if(this.s == null) {
            return;
        }
        if(l0.e() != null) {
            this.s.setOnFocusChangeListener(l0.e());
        }
        if(l0.g() != null) {
            this.g.setOnFocusChangeListener(l0.g());
        }
    }

    public final void k() {
        int v = 8;
        int v1 = this.g.getVisibility() != 0 || this.e() ? 8 : 0;
        this.b.setVisibility(v1);
        int v2 = this.p == null || this.r ? 8 : 0;
        if(this.d() || this.e() || v2 == 0) {
            v = 0;
        }
        this.setVisibility(v);
    }

    public final void l() {
        Drawable drawable0 = this.c.getDrawable();
        TextInputLayout textInputLayout0 = this.a;
        int v = drawable0 == null || !textInputLayout0.isErrorEnabled() || !textInputLayout0.m() ? 8 : 0;
        this.c.setVisibility(v);
        this.k();
        this.m();
        if(this.i == 0) {
            textInputLayout0.q();
        }
    }

    public final void m() {
        TextInputLayout textInputLayout0 = this.a;
        if(textInputLayout0.h == null) {
            return;
        }
        int v = this.d() || this.e() ? 0 : ViewCompat.getPaddingEnd(textInputLayout0.h);
        int v1 = this.getContext().getResources().getDimensionPixelSize(dimen.material_input_text_to_prefix_suffix_padding);
        int v2 = textInputLayout0.h.getPaddingTop();
        int v3 = textInputLayout0.h.getPaddingBottom();
        ViewCompat.setPaddingRelative(this.q, v1, v2, v, v3);
    }

    public final void n() {
        AppCompatTextView appCompatTextView0 = this.q;
        int v = appCompatTextView0.getVisibility();
        boolean z = false;
        int v1 = this.p == null || this.r ? 8 : 0;
        if(v != v1) {
            l l0 = this.b();
            if(v1 == 0) {
                z = true;
            }
            l0.p(z);
        }
        this.k();
        appCompatTextView0.setVisibility(v1);
        this.a.q();
    }
}

