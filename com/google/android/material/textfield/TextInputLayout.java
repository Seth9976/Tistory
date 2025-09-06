package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.h;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.appcompat.widget.m2;
import androidx.compose.ui.text.n0;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.text.BidiFormatter;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import androidx.transition.Fade;
import androidx.transition.TransitionManager;
import com.google.android.material.R.attr;
import com.google.android.material.R.color;
import com.google.android.material.R.dimen;
import com.google.android.material.R.id;
import com.google.android.material.R.string;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.appbar.g;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.CollapsingTextHelper;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.CornerTreatment;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel.Builder;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import f8.e;
import f8.f;
import f8.i;
import f8.n;
import f8.o;
import f8.r;
import f8.s;
import g.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.LinkedHashSet;

public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static class AccessibilityDelegate extends AccessibilityDelegateCompat {
        public final TextInputLayout d;

        public AccessibilityDelegate(@NonNull TextInputLayout textInputLayout0) {
            this.d = textInputLayout0;
        }

        @Override  // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(@NonNull View view0, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
            super.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfoCompat0);
            TextInputLayout textInputLayout0 = this.d;
            EditText editText0 = textInputLayout0.getEditText();
            Editable editable0 = editText0 == null ? null : editText0.getText();
            CharSequence charSequence0 = textInputLayout0.getHint();
            CharSequence charSequence1 = textInputLayout0.getError();
            CharSequence charSequence2 = textInputLayout0.getPlaceholderText();
            int v = textInputLayout0.getCounterMaxLength();
            CharSequence charSequence3 = textInputLayout0.getCounterOverflowDescription();
            boolean z = TextUtils.isEmpty(editable0);
            boolean z1 = TextUtils.isEmpty(charSequence0);
            boolean z2 = textInputLayout0.x0;
            boolean z3 = TextUtils.isEmpty(charSequence1);
            boolean z4 = !z3 || !TextUtils.isEmpty(charSequence3);
            String s = z1 ? "" : charSequence0.toString();
            r r0 = textInputLayout0.f;
            AppCompatTextView appCompatTextView0 = r0.b;
            if(appCompatTextView0.getVisibility() == 0) {
                accessibilityNodeInfoCompat0.setLabelFor(appCompatTextView0);
                accessibilityNodeInfoCompat0.setTraversalAfter(appCompatTextView0);
            }
            else {
                accessibilityNodeInfoCompat0.setTraversalAfter(r0.d);
            }
            if(!z) {
                accessibilityNodeInfoCompat0.setText(editable0);
            }
            else if(!TextUtils.isEmpty(s)) {
                accessibilityNodeInfoCompat0.setText(s);
                if(!z2 && charSequence2 != null) {
                    accessibilityNodeInfoCompat0.setText(s + ", " + charSequence2);
                }
            }
            else if(charSequence2 != null) {
                accessibilityNodeInfoCompat0.setText(charSequence2);
            }
            if(!TextUtils.isEmpty(s)) {
                accessibilityNodeInfoCompat0.setHintText(s);
                accessibilityNodeInfoCompat0.setShowingHintText(z);
            }
            if(editable0 == null || editable0.length() != v) {
                v = -1;
            }
            accessibilityNodeInfoCompat0.setMaxTextLength(v);
            if(z4) {
                if(z3) {
                    charSequence1 = charSequence3;
                }
                accessibilityNodeInfoCompat0.setError(charSequence1);
            }
            AppCompatTextView appCompatTextView1 = textInputLayout0.n.y;
            if(appCompatTextView1 != null) {
                accessibilityNodeInfoCompat0.setLabelFor(appCompatTextView1);
            }
            textInputLayout0.g.b().n(accessibilityNodeInfoCompat0);
        }

        @Override  // androidx.core.view.AccessibilityDelegateCompat
        public void onPopulateAccessibilityEvent(@NonNull View view0, @NonNull AccessibilityEvent accessibilityEvent0) {
            super.onPopulateAccessibilityEvent(view0, accessibilityEvent0);
            this.d.g.b().o(accessibilityEvent0);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface BoxBackgroundMode {
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface EndIconMode {
    }

    public interface LengthCounter {
        int countLength(@Nullable Editable arg1);
    }

    public interface OnEditTextAttachedListener {
        void onEditTextAttached(@NonNull TextInputLayout arg1);
    }

    public interface OnEndIconChangedListener {
        void onEndIconChanged(@NonNull TextInputLayout arg1, int arg2);
    }

    public Fade A;
    public boolean A0;
    public Fade B;
    public ValueAnimator B0;
    public static final int BOX_BACKGROUND_FILLED = 1;
    public static final int BOX_BACKGROUND_NONE = 0;
    public static final int BOX_BACKGROUND_OUTLINE = 2;
    public ColorStateList C;
    public boolean C0;
    public ColorStateList D;
    public boolean D0;
    public ColorStateList E;
    public boolean E0;
    public static final int END_ICON_CLEAR_TEXT = 2;
    public static final int END_ICON_CUSTOM = -1;
    public static final int END_ICON_DROPDOWN_MENU = 3;
    public static final int END_ICON_NONE = 0;
    public static final int END_ICON_PASSWORD_TOGGLE = 1;
    public ColorStateList F;
    public static final int F0;
    public boolean G;
    public static final int[][] G0;
    public CharSequence H;
    public boolean I;
    public MaterialShapeDrawable J;
    public MaterialShapeDrawable K;
    public StateListDrawable L;
    public boolean M;
    public MaterialShapeDrawable N;
    public MaterialShapeDrawable O;
    public ShapeAppearanceModel P;
    public boolean Q;
    public final int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int a0;
    public int b0;
    public final Rect c0;
    public final Rect d0;
    public final FrameLayout e;
    public final RectF e0;
    public final r f;
    public Typeface f0;
    public final b g;
    public ColorDrawable g0;
    public EditText h;
    public int h0;
    public CharSequence i;
    public final LinkedHashSet i0;
    public int j;
    public ColorDrawable j0;
    public int k;
    public int k0;
    public int l;
    public Drawable l0;
    public int m;
    public ColorStateList m0;
    public final o n;
    public ColorStateList n0;
    public boolean o;
    public int o0;
    public int p;
    public int p0;
    public boolean q;
    public int q0;
    public LengthCounter r;
    public ColorStateList r0;
    public AppCompatTextView s;
    public int s0;
    public int t;
    public int t0;
    public int u;
    public int u0;
    public CharSequence v;
    public int v0;
    public boolean w;
    public int w0;
    public AppCompatTextView x;
    public boolean x0;
    public ColorStateList y;
    public final CollapsingTextHelper y0;
    public int z;
    public boolean z0;

    static {
        TextInputLayout.F0 = style.Widget_Design_TextInputLayout;
        TextInputLayout.G0 = new int[][]{new int[]{0x10100A7}, new int[0]};
    }

    public TextInputLayout(@NonNull Context context0) {
        this(context0, null);
    }

    public TextInputLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.textInputStyle);
    }

    public TextInputLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        int v1 = TextInputLayout.F0;
        super(MaterialThemeOverlay.wrap(context0, attributeSet0, v, v1), attributeSet0, v);
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = new o(this);
        this.r = new n0(18);
        this.c0 = new Rect();
        this.d0 = new Rect();
        this.e0 = new RectF();
        this.i0 = new LinkedHashSet();
        CollapsingTextHelper collapsingTextHelper0 = new CollapsingTextHelper(this);
        this.y0 = collapsingTextHelper0;
        this.E0 = false;
        Context context1 = this.getContext();
        this.setOrientation(1);
        this.setWillNotDraw(false);
        this.setAddStatesFromChildren(true);
        FrameLayout frameLayout0 = new FrameLayout(context1);
        this.e = frameLayout0;
        frameLayout0.setAddStatesFromChildren(true);
        collapsingTextHelper0.setTextSizeInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
        collapsingTextHelper0.setPositionInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
        collapsingTextHelper0.setCollapsedTextGravity(0x800033);
        TintTypedArray tintTypedArray0 = ThemeEnforcement.obtainTintedStyledAttributes(context1, attributeSet0, styleable.TextInputLayout, v, v1, new int[]{styleable.TextInputLayout_counterTextAppearance, styleable.TextInputLayout_counterOverflowTextAppearance, styleable.TextInputLayout_errorTextAppearance, styleable.TextInputLayout_helperTextTextAppearance, styleable.TextInputLayout_hintTextAppearance});
        r r0 = new r(this, tintTypedArray0);
        this.f = r0;
        this.G = tintTypedArray0.getBoolean(styleable.TextInputLayout_hintEnabled, true);
        this.setHint(tintTypedArray0.getText(styleable.TextInputLayout_android_hint));
        this.A0 = tintTypedArray0.getBoolean(styleable.TextInputLayout_hintAnimationEnabled, true);
        this.z0 = tintTypedArray0.getBoolean(styleable.TextInputLayout_expandedHintEnabled, true);
        if(tintTypedArray0.hasValue(styleable.TextInputLayout_android_minEms)) {
            this.setMinEms(tintTypedArray0.getInt(styleable.TextInputLayout_android_minEms, -1));
        }
        else if(tintTypedArray0.hasValue(styleable.TextInputLayout_android_minWidth)) {
            this.setMinWidth(tintTypedArray0.getDimensionPixelSize(styleable.TextInputLayout_android_minWidth, -1));
        }
        if(tintTypedArray0.hasValue(styleable.TextInputLayout_android_maxEms)) {
            this.setMaxEms(tintTypedArray0.getInt(styleable.TextInputLayout_android_maxEms, -1));
        }
        else if(tintTypedArray0.hasValue(styleable.TextInputLayout_android_maxWidth)) {
            this.setMaxWidth(tintTypedArray0.getDimensionPixelSize(styleable.TextInputLayout_android_maxWidth, -1));
        }
        this.P = ShapeAppearanceModel.builder(context1, attributeSet0, v, v1).build();
        this.R = context1.getResources().getDimensionPixelOffset(dimen.mtrl_textinput_box_label_cutout_padding);
        this.T = tintTypedArray0.getDimensionPixelOffset(styleable.TextInputLayout_boxCollapsedPaddingTop, 0);
        this.V = tintTypedArray0.getDimensionPixelSize(styleable.TextInputLayout_boxStrokeWidth, context1.getResources().getDimensionPixelSize(dimen.mtrl_textinput_box_stroke_width_default));
        this.W = tintTypedArray0.getDimensionPixelSize(styleable.TextInputLayout_boxStrokeWidthFocused, context1.getResources().getDimensionPixelSize(dimen.mtrl_textinput_box_stroke_width_focused));
        this.U = this.V;
        float f = tintTypedArray0.getDimension(styleable.TextInputLayout_boxCornerRadiusTopStart, -1.0f);
        float f1 = tintTypedArray0.getDimension(styleable.TextInputLayout_boxCornerRadiusTopEnd, -1.0f);
        float f2 = tintTypedArray0.getDimension(styleable.TextInputLayout_boxCornerRadiusBottomEnd, -1.0f);
        float f3 = tintTypedArray0.getDimension(styleable.TextInputLayout_boxCornerRadiusBottomStart, -1.0f);
        Builder shapeAppearanceModel$Builder0 = this.P.toBuilder();
        if(f >= 0.0f) {
            shapeAppearanceModel$Builder0.setTopLeftCornerSize(f);
        }
        if(f1 >= 0.0f) {
            shapeAppearanceModel$Builder0.setTopRightCornerSize(f1);
        }
        if(f2 >= 0.0f) {
            shapeAppearanceModel$Builder0.setBottomRightCornerSize(f2);
        }
        if(f3 >= 0.0f) {
            shapeAppearanceModel$Builder0.setBottomLeftCornerSize(f3);
        }
        this.P = shapeAppearanceModel$Builder0.build();
        ColorStateList colorStateList0 = MaterialResources.getColorStateList(context1, tintTypedArray0, styleable.TextInputLayout_boxBackgroundColor);
        if(colorStateList0 == null) {
            this.b0 = 0;
            this.s0 = 0;
            this.t0 = 0;
            this.u0 = 0;
            this.v0 = 0;
        }
        else {
            int v2 = colorStateList0.getDefaultColor();
            this.s0 = v2;
            this.b0 = v2;
            if(colorStateList0.isStateful()) {
                this.t0 = colorStateList0.getColorForState(new int[]{0xFEFEFF62}, -1);
                this.u0 = colorStateList0.getColorForState(new int[]{0x101009C, 0x101009E}, -1);
                this.v0 = colorStateList0.getColorForState(new int[]{0x1010367, 0x101009E}, -1);
            }
            else {
                this.u0 = this.s0;
                ColorStateList colorStateList1 = AppCompatResources.getColorStateList(context1, color.mtrl_filled_background_color);
                this.t0 = colorStateList1.getColorForState(new int[]{0xFEFEFF62}, -1);
                this.v0 = colorStateList1.getColorForState(new int[]{0x1010367}, -1);
            }
        }
        if(tintTypedArray0.hasValue(styleable.TextInputLayout_android_textColorHint)) {
            ColorStateList colorStateList2 = tintTypedArray0.getColorStateList(styleable.TextInputLayout_android_textColorHint);
            this.n0 = colorStateList2;
            this.m0 = colorStateList2;
        }
        ColorStateList colorStateList3 = MaterialResources.getColorStateList(context1, tintTypedArray0, styleable.TextInputLayout_boxStrokeColor);
        this.q0 = tintTypedArray0.getColor(styleable.TextInputLayout_boxStrokeColor, 0);
        this.o0 = ContextCompat.getColor(context1, color.mtrl_textinput_default_box_stroke_color);
        this.w0 = ContextCompat.getColor(context1, color.mtrl_textinput_disabled_color);
        this.p0 = ContextCompat.getColor(context1, color.mtrl_textinput_hovered_box_stroke_color);
        if(colorStateList3 != null) {
            this.setBoxStrokeColorStateList(colorStateList3);
        }
        if(tintTypedArray0.hasValue(styleable.TextInputLayout_boxStrokeErrorColor)) {
            this.setBoxStrokeErrorColor(MaterialResources.getColorStateList(context1, tintTypedArray0, styleable.TextInputLayout_boxStrokeErrorColor));
        }
        if(tintTypedArray0.getResourceId(styleable.TextInputLayout_hintTextAppearance, -1) != -1) {
            this.setHintTextAppearance(tintTypedArray0.getResourceId(styleable.TextInputLayout_hintTextAppearance, 0));
        }
        this.E = tintTypedArray0.getColorStateList(styleable.TextInputLayout_cursorColor);
        this.F = tintTypedArray0.getColorStateList(styleable.TextInputLayout_cursorErrorColor);
        int v3 = tintTypedArray0.getResourceId(styleable.TextInputLayout_errorTextAppearance, 0);
        CharSequence charSequence0 = tintTypedArray0.getText(styleable.TextInputLayout_errorContentDescription);
        int v4 = tintTypedArray0.getInt(styleable.TextInputLayout_errorAccessibilityLiveRegion, 1);
        boolean z = tintTypedArray0.getBoolean(styleable.TextInputLayout_errorEnabled, false);
        int v5 = tintTypedArray0.getResourceId(styleable.TextInputLayout_helperTextTextAppearance, 0);
        boolean z1 = tintTypedArray0.getBoolean(styleable.TextInputLayout_helperTextEnabled, false);
        CharSequence charSequence1 = tintTypedArray0.getText(styleable.TextInputLayout_helperText);
        int v6 = tintTypedArray0.getResourceId(styleable.TextInputLayout_placeholderTextAppearance, 0);
        CharSequence charSequence2 = tintTypedArray0.getText(styleable.TextInputLayout_placeholderText);
        boolean z2 = tintTypedArray0.getBoolean(styleable.TextInputLayout_counterEnabled, false);
        this.setCounterMaxLength(tintTypedArray0.getInt(styleable.TextInputLayout_counterMaxLength, -1));
        this.u = tintTypedArray0.getResourceId(styleable.TextInputLayout_counterTextAppearance, 0);
        this.t = tintTypedArray0.getResourceId(styleable.TextInputLayout_counterOverflowTextAppearance, 0);
        this.setBoxBackgroundMode(tintTypedArray0.getInt(styleable.TextInputLayout_boxBackgroundMode, 0));
        this.setErrorContentDescription(charSequence0);
        this.setErrorAccessibilityLiveRegion(v4);
        this.setCounterOverflowTextAppearance(this.t);
        this.setHelperTextTextAppearance(v5);
        this.setErrorTextAppearance(v3);
        this.setCounterTextAppearance(this.u);
        this.setPlaceholderText(charSequence2);
        this.setPlaceholderTextAppearance(v6);
        if(tintTypedArray0.hasValue(styleable.TextInputLayout_errorTextColor)) {
            this.setErrorTextColor(tintTypedArray0.getColorStateList(styleable.TextInputLayout_errorTextColor));
        }
        if(tintTypedArray0.hasValue(styleable.TextInputLayout_helperTextTextColor)) {
            this.setHelperTextColor(tintTypedArray0.getColorStateList(styleable.TextInputLayout_helperTextTextColor));
        }
        if(tintTypedArray0.hasValue(styleable.TextInputLayout_hintTextColor)) {
            this.setHintTextColor(tintTypedArray0.getColorStateList(styleable.TextInputLayout_hintTextColor));
        }
        if(tintTypedArray0.hasValue(styleable.TextInputLayout_counterTextColor)) {
            this.setCounterTextColor(tintTypedArray0.getColorStateList(styleable.TextInputLayout_counterTextColor));
        }
        if(tintTypedArray0.hasValue(styleable.TextInputLayout_counterOverflowTextColor)) {
            this.setCounterOverflowTextColor(tintTypedArray0.getColorStateList(styleable.TextInputLayout_counterOverflowTextColor));
        }
        if(tintTypedArray0.hasValue(styleable.TextInputLayout_placeholderTextColor)) {
            this.setPlaceholderTextColor(tintTypedArray0.getColorStateList(styleable.TextInputLayout_placeholderTextColor));
        }
        b b0 = new b(this, tintTypedArray0);
        this.g = b0;
        boolean z3 = tintTypedArray0.getBoolean(styleable.TextInputLayout_android_enabled, true);
        tintTypedArray0.recycle();
        ViewCompat.setImportantForAccessibility(this, 2);
        ViewCompat.setImportantForAutofill(this, 1);
        frameLayout0.addView(r0);
        frameLayout0.addView(b0);
        this.addView(frameLayout0);
        this.setEnabled(z3);
        this.setHelperTextEnabled(z1);
        this.setErrorEnabled(z);
        this.setCounterEnabled(z2);
        this.setHelperText(charSequence1);
    }

    public final void a(float f) {
        CollapsingTextHelper collapsingTextHelper0 = this.y0;
        if(collapsingTextHelper0.getExpansionFraction() == f) {
            return;
        }
        if(this.B0 == null) {
            ValueAnimator valueAnimator0 = new ValueAnimator();
            this.B0 = valueAnimator0;
            valueAnimator0.setInterpolator(MotionUtils.resolveThemeInterpolator(this.getContext(), attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
            this.B0.setDuration(((long)MotionUtils.resolveThemeDuration(this.getContext(), attr.motionDurationMedium4, 0xA7)));
            this.B0.addUpdateListener(new g(this, 5));
        }
        this.B0.setFloatValues(new float[]{collapsingTextHelper0.getExpansionFraction(), f});
        this.B0.start();
    }

    public void addOnEditTextAttachedListener(@NonNull OnEditTextAttachedListener textInputLayout$OnEditTextAttachedListener0) {
        this.i0.add(textInputLayout$OnEditTextAttachedListener0);
        if(this.h != null) {
            textInputLayout$OnEditTextAttachedListener0.onEditTextAttached(this);
        }
    }

    public void addOnEndIconChangedListener(@NonNull OnEndIconChangedListener textInputLayout$OnEndIconChangedListener0) {
        this.g.j.add(textInputLayout$OnEndIconChangedListener0);
    }

    @Override  // android.view.ViewGroup
    public void addView(@NonNull View view0, int v, @NonNull ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(view0 instanceof EditText) {
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(viewGroup$LayoutParams0);
            frameLayout$LayoutParams0.gravity = frameLayout$LayoutParams0.gravity & 0xFFFFFF8F | 16;
            this.e.addView(view0, frameLayout$LayoutParams0);
            this.e.setLayoutParams(viewGroup$LayoutParams0);
            this.t();
            this.setEditText(((EditText)view0));
            return;
        }
        super.addView(view0, v, viewGroup$LayoutParams0);
    }

    public final void b() {
        MaterialShapeDrawable materialShapeDrawable0 = this.J;
        if(materialShapeDrawable0 == null) {
            return;
        }
        ShapeAppearanceModel shapeAppearanceModel0 = this.P;
        if(materialShapeDrawable0.getShapeAppearanceModel() != shapeAppearanceModel0) {
            this.J.setShapeAppearanceModel(shapeAppearanceModel0);
        }
        if(this.S == 2) {
            int v = this.U;
            if(v > -1) {
                int v1 = this.a0;
                if(v1 != 0) {
                    this.J.setStroke(((float)v), v1);
                }
            }
        }
        int v2 = this.S == 1 ? MaterialColors.layer(MaterialColors.getColor(this, attr.colorSurface, 0), this.b0) : this.b0;
        this.b0 = v2;
        this.J.setFillColor(ColorStateList.valueOf(v2));
        MaterialShapeDrawable materialShapeDrawable1 = this.N;
        if(materialShapeDrawable1 != null && this.O != null) {
            if(this.U > -1 && this.a0 != 0) {
                materialShapeDrawable1.setFillColor((this.h.isFocused() ? ColorStateList.valueOf(this.o0) : ColorStateList.valueOf(this.a0)));
                this.O.setFillColor(ColorStateList.valueOf(this.a0));
            }
            this.invalidate();
        }
        this.s();
    }

    public final int c() {
        if(!this.G) {
            return 0;
        }
        CollapsingTextHelper collapsingTextHelper0 = this.y0;
        switch(this.S) {
            case 0: {
                return (int)collapsingTextHelper0.getCollapsedTextHeight();
            }
            case 2: {
                return (int)(collapsingTextHelper0.getCollapsedTextHeight() / 2.0f);
            }
            default: {
                return 0;
            }
        }
    }

    public void clearOnEditTextAttachedListeners() {
        this.i0.clear();
    }

    public void clearOnEndIconChangedListeners() {
        this.g.j.clear();
    }

    public final Fade d() {
        Fade fade0 = new Fade();
        fade0.setDuration(((long)MotionUtils.resolveThemeDuration(this.getContext(), attr.motionDurationShort2, 87)));
        fade0.setInterpolator(MotionUtils.resolveThemeInterpolator(this.getContext(), attr.motionEasingLinearInterpolator, AnimationUtils.LINEAR_INTERPOLATOR));
        return fade0;
    }

    @Override  // android.view.ViewGroup
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(@NonNull ViewStructure viewStructure0, int v) {
        EditText editText0 = this.h;
        if(editText0 == null) {
            super.dispatchProvideAutofillStructure(viewStructure0, v);
            return;
        }
        if(this.i != null) {
            boolean z = this.I;
            this.I = false;
            CharSequence charSequence0 = editText0.getHint();
            this.h.setHint(this.i);
            try {
                super.dispatchProvideAutofillStructure(viewStructure0, v);
            }
            finally {
                this.h.setHint(charSequence0);
                this.I = z;
            }
            return;
        }
        viewStructure0.setAutofillId(this.getAutofillId());
        this.onProvideAutofillStructure(viewStructure0, v);
        this.onProvideAutofillVirtualStructure(viewStructure0, v);
        FrameLayout frameLayout0 = this.e;
        viewStructure0.setChildCount(frameLayout0.getChildCount());
        for(int v1 = 0; v1 < frameLayout0.getChildCount(); ++v1) {
            View view0 = frameLayout0.getChildAt(v1);
            ViewStructure viewStructure1 = viewStructure0.newChild(v1);
            view0.dispatchProvideAutofillStructure(viewStructure1, v);
            if(view0 == this.h) {
                viewStructure1.setHint(this.getHint());
            }
        }
    }

    @Override  // android.view.ViewGroup
    public void dispatchRestoreInstanceState(@NonNull SparseArray sparseArray0) {
        this.D0 = true;
        super.dispatchRestoreInstanceState(sparseArray0);
        this.D0 = false;
    }

    @Override  // android.view.View
    public void draw(@NonNull Canvas canvas0) {
        super.draw(canvas0);
        CollapsingTextHelper collapsingTextHelper0 = this.y0;
        if(this.G) {
            collapsingTextHelper0.draw(canvas0);
        }
        if(this.O != null) {
            MaterialShapeDrawable materialShapeDrawable0 = this.N;
            if(materialShapeDrawable0 != null) {
                materialShapeDrawable0.draw(canvas0);
                if(this.h.isFocused()) {
                    Rect rect0 = this.O.getBounds();
                    Rect rect1 = this.N.getBounds();
                    float f = collapsingTextHelper0.getExpansionFraction();
                    int v = rect1.centerX();
                    rect0.left = AnimationUtils.lerp(v, rect1.left, f);
                    rect0.right = AnimationUtils.lerp(v, rect1.right, f);
                    this.O.draw(canvas0);
                }
            }
        }
    }

    @Override  // android.view.ViewGroup
    public void drawableStateChanged() {
        if(this.C0) {
            return;
        }
        boolean z = true;
        this.C0 = true;
        super.drawableStateChanged();
        int[] arr_v = this.getDrawableState();
        boolean z1 = this.y0 == null ? false : this.y0.setState(arr_v);
        if(this.h != null) {
            if(!ViewCompat.isLaidOut(this) || !this.isEnabled()) {
                z = false;
            }
            this.u(z, false);
        }
        this.r();
        this.x();
        if(z1) {
            this.invalidate();
        }
        this.C0 = false;
    }

    // 去混淆评级： 低(30)
    public final boolean e() {
        return this.G && !TextUtils.isEmpty(this.H) && this.J instanceof f8.g;
    }

    public final MaterialShapeDrawable f(boolean z) {
        float f = (float)this.getResources().getDimensionPixelOffset(dimen.mtrl_shape_corner_size_small_component);
        float f1 = this.h instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView)this.h).getPopupElevation() : ((float)this.getResources().getDimensionPixelOffset(dimen.m3_comp_outlined_autocomplete_menu_container_elevation));
        int v = this.getResources().getDimensionPixelOffset(dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        ShapeAppearanceModel shapeAppearanceModel0 = ShapeAppearanceModel.builder().setTopLeftCornerSize((z ? f : 0.0f)).setTopRightCornerSize((z ? f : 0.0f)).setBottomLeftCornerSize(f).setBottomRightCornerSize(f).build();
        ColorStateList colorStateList0 = this.h instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView)this.h).getDropDownBackgroundTintList() : null;
        MaterialShapeDrawable materialShapeDrawable0 = MaterialShapeDrawable.createWithElevationOverlay(this.getContext(), f1, colorStateList0);
        materialShapeDrawable0.setShapeAppearanceModel(shapeAppearanceModel0);
        materialShapeDrawable0.setPadding(0, v, 0, v);
        return materialShapeDrawable0;
    }

    public final int g(int v, boolean z) {
        if(!z && this.getPrefixText() != null) {
            return this.f.a() + v;
        }
        return !z || this.getSuffixText() == null ? this.h.getCompoundPaddingLeft() + v : this.g.c() + v;
    }

    @Override  // android.widget.LinearLayout
    public int getBaseline() {
        EditText editText0 = this.h;
        if(editText0 != null) {
            int v = editText0.getBaseline();
            int v1 = this.getPaddingTop();
            return this.c() + (v1 + v);
        }
        return super.getBaseline();
    }

    @NonNull
    public MaterialShapeDrawable getBoxBackground() {
        if(this.S != 1 && this.S != 2) {
            throw new IllegalStateException();
        }
        return this.J;
    }

    public int getBoxBackgroundColor() {
        return this.b0;
    }

    public int getBoxBackgroundMode() {
        return this.S;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.T;
    }

    // 去混淆评级： 低(20)
    public float getBoxCornerRadiusBottomEnd() {
        return ViewUtils.isLayoutRtl(this) ? this.P.getBottomLeftCornerSize().getCornerSize(this.e0) : this.P.getBottomRightCornerSize().getCornerSize(this.e0);
    }

    // 去混淆评级： 低(20)
    public float getBoxCornerRadiusBottomStart() {
        return ViewUtils.isLayoutRtl(this) ? this.P.getBottomRightCornerSize().getCornerSize(this.e0) : this.P.getBottomLeftCornerSize().getCornerSize(this.e0);
    }

    // 去混淆评级： 低(20)
    public float getBoxCornerRadiusTopEnd() {
        return ViewUtils.isLayoutRtl(this) ? this.P.getTopLeftCornerSize().getCornerSize(this.e0) : this.P.getTopRightCornerSize().getCornerSize(this.e0);
    }

    // 去混淆评级： 低(20)
    public float getBoxCornerRadiusTopStart() {
        return ViewUtils.isLayoutRtl(this) ? this.P.getTopRightCornerSize().getCornerSize(this.e0) : this.P.getTopLeftCornerSize().getCornerSize(this.e0);
    }

    public int getBoxStrokeColor() {
        return this.q0;
    }

    @Nullable
    public ColorStateList getBoxStrokeErrorColor() {
        return this.r0;
    }

    public int getBoxStrokeWidth() {
        return this.V;
    }

    public int getBoxStrokeWidthFocused() {
        return this.W;
    }

    public int getCounterMaxLength() {
        return this.p;
    }

    @Nullable
    public CharSequence getCounterOverflowDescription() {
        if(this.o && this.q) {
            return this.s == null ? null : this.s.getContentDescription();
        }
        return null;
    }

    @Nullable
    public ColorStateList getCounterOverflowTextColor() {
        return this.D;
    }

    @Nullable
    public ColorStateList getCounterTextColor() {
        return this.C;
    }

    @Nullable
    @RequiresApi(29)
    public ColorStateList getCursorColor() {
        return this.E;
    }

    @Nullable
    @RequiresApi(29)
    public ColorStateList getCursorErrorColor() {
        return this.F;
    }

    @Nullable
    public ColorStateList getDefaultHintTextColor() {
        return this.m0;
    }

    @Nullable
    public EditText getEditText() {
        return this.h;
    }

    @Nullable
    private Drawable getEditTextBoxBackground() {
        if(this.h instanceof AutoCompleteTextView && !a.H(this.h)) {
            int v = MaterialColors.getColor(this.h, attr.colorControlHighlight);
            int v1 = this.S;
            int[][] arr2_v = TextInputLayout.G0;
            if(v1 == 2) {
                Context context0 = this.getContext();
                MaterialShapeDrawable materialShapeDrawable0 = this.J;
                int v2 = MaterialColors.getColor(context0, attr.colorSurface, "TextInputLayout");
                MaterialShapeDrawable materialShapeDrawable1 = new MaterialShapeDrawable(materialShapeDrawable0.getShapeAppearanceModel());
                int v3 = MaterialColors.layer(v, v2, 0.1f);
                materialShapeDrawable1.setFillColor(new ColorStateList(arr2_v, new int[]{v3, 0}));
                materialShapeDrawable1.setTint(v2);
                ColorStateList colorStateList0 = new ColorStateList(arr2_v, new int[]{v3, v2});
                MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(materialShapeDrawable0.getShapeAppearanceModel());
                materialShapeDrawable2.setTint(-1);
                return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList0, materialShapeDrawable1, materialShapeDrawable2), materialShapeDrawable0});
            }
            if(v1 == 1) {
                MaterialShapeDrawable materialShapeDrawable3 = this.J;
                int v4 = this.b0;
                return new RippleDrawable(new ColorStateList(arr2_v, new int[]{MaterialColors.layer(v, v4, 0.1f), v4}), materialShapeDrawable3, materialShapeDrawable3);
            }
            return null;
        }
        return this.J;
    }

    @Nullable
    public CharSequence getEndIconContentDescription() {
        return this.g.g.getContentDescription();
    }

    @Nullable
    public Drawable getEndIconDrawable() {
        return this.g.g.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.g.m;
    }

    public int getEndIconMode() {
        return this.g.i;
    }

    @NonNull
    public ImageView.ScaleType getEndIconScaleType() {
        return this.g.n;
    }

    @NonNull
    public CheckableImageButton getEndIconView() {
        return this.g.g;
    }

    // 去混淆评级： 低(20)
    @Nullable
    public CharSequence getError() {
        return this.n.q ? this.n.p : null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.n.t;
    }

    @Nullable
    public CharSequence getErrorContentDescription() {
        return this.n.s;
    }

    @ColorInt
    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView0 = this.n.r;
        return appCompatTextView0 == null ? -1 : appCompatTextView0.getCurrentTextColor();
    }

    @Nullable
    public Drawable getErrorIconDrawable() {
        return this.g.c.getDrawable();
    }

    // 去混淆评级： 低(20)
    @Nullable
    public CharSequence getHelperText() {
        return this.n.x ? this.n.w : null;
    }

    @ColorInt
    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView0 = this.n.y;
        return appCompatTextView0 == null ? -1 : appCompatTextView0.getCurrentTextColor();
    }

    // 去混淆评级： 低(20)
    @Nullable
    public CharSequence getHint() {
        return this.G ? this.H : null;
    }

    @VisibleForTesting
    public final float getHintCollapsedTextHeight() {
        return this.y0.getCollapsedTextHeight();
    }

    @VisibleForTesting
    public final int getHintCurrentCollapsedTextColor() {
        return this.y0.getCurrentCollapsedTextColor();
    }

    @Nullable
    public ColorStateList getHintTextColor() {
        return this.n0;
    }

    @NonNull
    public LengthCounter getLengthCounter() {
        return this.r;
    }

    public int getMaxEms() {
        return this.k;
    }

    @Px
    public int getMaxWidth() {
        return this.m;
    }

    public int getMinEms() {
        return this.j;
    }

    @Px
    public int getMinWidth() {
        return this.l;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if(this.L == null) {
            StateListDrawable stateListDrawable0 = new StateListDrawable();
            this.L = stateListDrawable0;
            Drawable drawable0 = this.getOrCreateOutlinedDropDownMenuBackground();
            stateListDrawable0.addState(new int[]{0x10100AA}, drawable0);
            StateListDrawable stateListDrawable1 = this.L;
            MaterialShapeDrawable materialShapeDrawable0 = this.f(false);
            stateListDrawable1.addState(new int[0], materialShapeDrawable0);
        }
        return this.L;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if(this.K == null) {
            this.K = this.f(true);
        }
        return this.K;
    }

    @Nullable
    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.g.g.getContentDescription();
    }

    @Nullable
    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.g.g.getDrawable();
    }

    // 去混淆评级： 低(20)
    @Nullable
    public CharSequence getPlaceholderText() {
        return this.w ? this.v : null;
    }

    @StyleRes
    public int getPlaceholderTextAppearance() {
        return this.z;
    }

    @Nullable
    public ColorStateList getPlaceholderTextColor() {
        return this.y;
    }

    @Nullable
    public CharSequence getPrefixText() {
        return this.f.c;
    }

    @Nullable
    public ColorStateList getPrefixTextColor() {
        return this.f.b.getTextColors();
    }

    @NonNull
    public TextView getPrefixTextView() {
        return this.f.b;
    }

    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.P;
    }

    @Nullable
    public CharSequence getStartIconContentDescription() {
        return this.f.d.getContentDescription();
    }

    @Nullable
    public Drawable getStartIconDrawable() {
        return this.f.d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f.g;
    }

    @NonNull
    public ImageView.ScaleType getStartIconScaleType() {
        return this.f.h;
    }

    @Nullable
    public CharSequence getSuffixText() {
        return this.g.p;
    }

    @Nullable
    public ColorStateList getSuffixTextColor() {
        return this.g.q.getTextColors();
    }

    @NonNull
    public TextView getSuffixTextView() {
        return this.g.q;
    }

    @Nullable
    public Typeface getTypeface() {
        return this.f0;
    }

    public final int h(int v, boolean z) {
        if(!z && this.getSuffixText() != null) {
            return v - this.g.c();
        }
        return !z || this.getPrefixText() == null ? v - this.h.getCompoundPaddingRight() : v - this.f.a();
    }

    public final void i() {
        switch(this.S) {
            case 0: {
                this.J = null;
                this.N = null;
                this.O = null;
                break;
            }
            case 1: {
                this.J = new MaterialShapeDrawable(this.P);
                this.N = new MaterialShapeDrawable();
                this.O = new MaterialShapeDrawable();
                break;
            }
            case 2: {
                if(!this.G || this.J instanceof f8.g) {
                    this.J = new MaterialShapeDrawable(this.P);
                }
                else {
                    e e0 = new e((this.P == null ? new ShapeAppearanceModel() : this.P), new RectF());
                    f f0 = new f(e0);  // 初始化器: Lcom/google/android/material/shape/MaterialShapeDrawable;-><init>(Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;)V
                    f0.y = e0;
                    this.J = f0;
                }
                this.N = null;
                this.O = null;
                break;
            }
            default: {
                StringBuilder stringBuilder0 = new StringBuilder();
                throw new IllegalArgumentException(wb.a.c(this.S, " is illegal; only @BoxBackgroundMode constants are supported.", stringBuilder0));
            }
        }
        this.s();
        this.x();
        if(this.S == 1) {
            if(MaterialResources.isFontScaleAtLeast2_0(this.getContext())) {
                this.T = this.getResources().getDimensionPixelSize(dimen.material_font_2_0_box_collapsed_padding_top);
            }
            else if(MaterialResources.isFontScaleAtLeast1_3(this.getContext())) {
                this.T = this.getResources().getDimensionPixelSize(dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if(this.h != null && this.S == 1) {
            if(MaterialResources.isFontScaleAtLeast2_0(this.getContext())) {
                ViewCompat.setPaddingRelative(this.h, ViewCompat.getPaddingStart(this.h), this.getResources().getDimensionPixelSize(dimen.material_filled_edittext_font_2_0_padding_top), ViewCompat.getPaddingEnd(this.h), this.getResources().getDimensionPixelSize(dimen.material_filled_edittext_font_2_0_padding_bottom));
            }
            else if(MaterialResources.isFontScaleAtLeast1_3(this.getContext())) {
                ViewCompat.setPaddingRelative(this.h, ViewCompat.getPaddingStart(this.h), this.getResources().getDimensionPixelSize(dimen.material_filled_edittext_font_1_3_padding_top), ViewCompat.getPaddingEnd(this.h), this.getResources().getDimensionPixelSize(dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if(this.S != 0) {
            this.t();
        }
        EditText editText0 = this.h;
        if(editText0 instanceof AutoCompleteTextView && ((AutoCompleteTextView)editText0).getDropDownBackground() == null) {
            int v = this.S;
            if(v == 2) {
                ((AutoCompleteTextView)editText0).setDropDownBackgroundDrawable(this.getOrCreateOutlinedDropDownMenuBackground());
                return;
            }
            if(v == 1) {
                ((AutoCompleteTextView)editText0).setDropDownBackgroundDrawable(this.getOrCreateFilledDropDownMenuBackground());
            }
        }
    }

    public boolean isCounterEnabled() {
        return this.o;
    }

    public boolean isEndIconCheckable() {
        return this.g.g.isCheckable();
    }

    public boolean isEndIconVisible() {
        return this.g.d();
    }

    public boolean isErrorEnabled() {
        return this.n.q;
    }

    public boolean isExpandedHintEnabled() {
        return this.z0;
    }

    public boolean isHelperTextEnabled() {
        return this.n.x;
    }

    public boolean isHintAnimationEnabled() {
        return this.A0;
    }

    public boolean isHintEnabled() {
        return this.G;
    }

    @Deprecated
    public boolean isPasswordVisibilityToggleEnabled() {
        return this.g.i == 1;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public boolean isProvidingHint() {
        return this.I;
    }

    public boolean isStartIconCheckable() {
        return this.f.d.isCheckable();
    }

    public boolean isStartIconVisible() {
        return this.f.d.getVisibility() == 0;
    }

    public final void j() {
        if(!this.e()) {
            return;
        }
        int v = this.h.getWidth();
        int v1 = this.h.getGravity();
        RectF rectF0 = this.e0;
        this.y0.getCollapsedTextActualBounds(rectF0, v, v1);
        if(rectF0.width() > 0.0f && rectF0.height() > 0.0f) {
            rectF0.left -= (float)this.R;
            rectF0.right += (float)this.R;
            rectF0.offset(((float)(-this.getPaddingLeft())), ((float)(-this.getPaddingTop())) - rectF0.height() / 2.0f + ((float)this.U));
            f8.g g0 = (f8.g)this.J;
            g0.getClass();
            g0.i(rectF0.left, rectF0.top, rectF0.right, rectF0.bottom);
        }
    }

    public static void k(ViewGroup viewGroup0, boolean z) {
        int v = viewGroup0.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = viewGroup0.getChildAt(v1);
            view0.setEnabled(z);
            if(view0 instanceof ViewGroup) {
                TextInputLayout.k(((ViewGroup)view0), z);
            }
        }
    }

    public final void l(AppCompatTextView appCompatTextView0, int v) {
        try {
            TextViewCompat.setTextAppearance(appCompatTextView0, v);
            if(appCompatTextView0.getTextColors().getDefaultColor() == 0xFFFF00FF) {
                goto label_2;
            }
            return;
        }
        catch(Exception unused_ex) {
        }
    label_2:
        TextViewCompat.setTextAppearance(appCompatTextView0, style.TextAppearance_AppCompat_Caption);
        appCompatTextView0.setTextColor(ContextCompat.getColor(this.getContext(), color.design_error));
    }

    // 去混淆评级： 低(20)
    public final boolean m() {
        return this.n.o == 1 && this.n.r != null && !TextUtils.isEmpty(this.n.p);
    }

    public final void n(Editable editable0) {
        int v = this.r.countLength(editable0);
        boolean z = this.q;
        int v1 = this.p;
        if(v1 == -1) {
            this.s.setText(String.valueOf(v));
            this.s.setContentDescription(null);
            this.q = false;
        }
        else {
            this.q = v > v1;
            Context context0 = this.getContext();
            this.s.setContentDescription(context0.getString((this.q ? string.character_counter_overflowed_content_description : string.character_counter_content_description), new Object[]{v, this.p}));
            if(z != this.q) {
                this.o();
            }
            BidiFormatter bidiFormatter0 = BidiFormatter.getInstance();
            this.s.setText(bidiFormatter0.unicodeWrap(this.getContext().getString(string.character_counter_pattern, new Object[]{v, this.p})));
        }
        if(this.h != null && z != this.q) {
            this.u(false, false);
            this.x();
            this.r();
        }
    }

    public final void o() {
        AppCompatTextView appCompatTextView0 = this.s;
        if(appCompatTextView0 != null) {
            this.l(appCompatTextView0, (this.q ? this.t : this.u));
            if(!this.q) {
                ColorStateList colorStateList0 = this.C;
                if(colorStateList0 != null) {
                    this.s.setTextColor(colorStateList0);
                }
            }
            if(this.q) {
                ColorStateList colorStateList1 = this.D;
                if(colorStateList1 != null) {
                    this.s.setTextColor(colorStateList1);
                }
            }
        }
    }

    @Override  // android.view.View
    public void onConfigurationChanged(@NonNull Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        this.y0.maybeUpdateFontWeightAdjustment(configuration0);
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public void onGlobalLayout() {
        b b0 = this.g;
        b0.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.E0 = false;
        if(this.h != null) {
            int v = Math.max(b0.getMeasuredHeight(), this.f.getMeasuredHeight());
            if(this.h.getMeasuredHeight() < v) {
                this.h.setMinimumHeight(v);
                z = true;
            }
        }
        if(z || this.q()) {
            this.h.post(new h(this, 20));
        }
    }

    @Override  // android.widget.LinearLayout
    public void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        EditText editText0 = this.h;
        if(editText0 != null) {
            Rect rect0 = this.c0;
            DescendantOffsetUtils.getDescendantRect(this, editText0, rect0);
            MaterialShapeDrawable materialShapeDrawable0 = this.N;
            if(materialShapeDrawable0 != null) {
                materialShapeDrawable0.setBounds(rect0.left, rect0.bottom - this.V, rect0.right, rect0.bottom);
            }
            MaterialShapeDrawable materialShapeDrawable1 = this.O;
            if(materialShapeDrawable1 != null) {
                materialShapeDrawable1.setBounds(rect0.left, rect0.bottom - this.W, rect0.right, rect0.bottom);
            }
            if(this.G) {
                float f = this.h.getTextSize();
                CollapsingTextHelper collapsingTextHelper0 = this.y0;
                collapsingTextHelper0.setExpandedTextSize(f);
                int v4 = this.h.getGravity();
                collapsingTextHelper0.setCollapsedTextGravity(v4 & 0xFFFFFF8F | 0x30);
                collapsingTextHelper0.setExpandedTextGravity(v4);
                if(this.h == null) {
                    throw new IllegalStateException();
                }
                boolean z1 = ViewUtils.isLayoutRtl(this);
                Rect rect1 = this.d0;
                rect1.bottom = rect0.bottom;
                switch(this.S) {
                    case 1: {
                        rect1.left = this.g(rect0.left, z1);
                        rect1.top = rect0.top + this.T;
                        rect1.right = this.h(rect0.right, z1);
                        break;
                    }
                    case 2: {
                        int v5 = rect0.left;
                        rect1.left = this.h.getPaddingLeft() + v5;
                        rect1.top = rect0.top - this.c();
                        rect1.right = rect0.right - this.h.getPaddingRight();
                        break;
                    }
                    default: {
                        rect1.left = this.g(rect0.left, z1);
                        rect1.top = this.getPaddingTop();
                        rect1.right = this.h(rect0.right, z1);
                    }
                }
                collapsingTextHelper0.setCollapsedBounds(rect1);
                if(this.h == null) {
                    throw new IllegalStateException();
                }
                float f1 = collapsingTextHelper0.getExpandedTextHeight();
                int v6 = rect0.left;
                rect1.left = this.h.getCompoundPaddingLeft() + v6;
                rect1.top = this.S != 1 || this.h.getMinLines() > 1 ? rect0.top + this.h.getCompoundPaddingTop() : ((int)(((float)rect0.centerY()) - f1 / 2.0f));
                rect1.right = rect0.right - this.h.getCompoundPaddingRight();
                rect1.bottom = this.S != 1 || this.h.getMinLines() > 1 ? rect0.bottom - this.h.getCompoundPaddingBottom() : ((int)(((float)rect1.top) + f1));
                collapsingTextHelper0.setExpandedBounds(rect1);
                collapsingTextHelper0.recalculate();
                if(this.e() && !this.x0) {
                    this.j();
                }
            }
        }
    }

    @Override  // android.widget.LinearLayout
    public void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        b b0 = this.g;
        if(!this.E0) {
            b0.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.E0 = true;
        }
        if(this.x != null) {
            EditText editText0 = this.h;
            if(editText0 != null) {
                int v2 = editText0.getGravity();
                this.x.setGravity(v2);
                this.x.setPadding(this.h.getCompoundPaddingLeft(), this.h.getCompoundPaddingTop(), this.h.getCompoundPaddingRight(), this.h.getCompoundPaddingBottom());
            }
        }
        b0.m();
    }

    @Override  // android.view.View
    public void onRestoreInstanceState(@Nullable Parcelable parcelable0) {
        if(!(parcelable0 instanceof s)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((s)parcelable0).getSuperState());
        this.setError(((s)parcelable0).b);
        if(((s)parcelable0).c) {
            this.post(new androidx.appcompat.widget.a(this, 15));
        }
        this.requestLayout();
    }

    @Override  // android.widget.LinearLayout
    public void onRtlPropertiesChanged(int v) {
        super.onRtlPropertiesChanged(v);
        if(v == 1 != this.Q) {
            float f = this.P.getTopLeftCornerSize().getCornerSize(this.e0);
            float f1 = this.P.getTopRightCornerSize().getCornerSize(this.e0);
            float f2 = this.P.getBottomLeftCornerSize().getCornerSize(this.e0);
            float f3 = this.P.getBottomRightCornerSize().getCornerSize(this.e0);
            CornerTreatment cornerTreatment0 = this.P.getTopLeftCorner();
            CornerTreatment cornerTreatment1 = this.P.getTopRightCorner();
            CornerTreatment cornerTreatment2 = this.P.getBottomLeftCorner();
            CornerTreatment cornerTreatment3 = this.P.getBottomRightCorner();
            ShapeAppearanceModel shapeAppearanceModel0 = ShapeAppearanceModel.builder().setTopLeftCorner(cornerTreatment1).setTopRightCorner(cornerTreatment0).setBottomLeftCorner(cornerTreatment3).setBottomRightCorner(cornerTreatment2).setTopLeftCornerSize(f1).setTopRightCornerSize(f).setBottomLeftCornerSize(f3).setBottomRightCornerSize(f2).build();
            this.Q = v == 1;
            this.setShapeAppearanceModel(shapeAppearanceModel0);
        }
    }

    @Override  // android.view.View
    @Nullable
    public Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new s(super.onSaveInstanceState());  // 初始化器: Landroidx/customview/view/AbsSavedState;-><init>(Landroid/os/Parcelable;)V
        if(this.m()) {
            parcelable0.b = this.getError();
        }
        parcelable0.c = this.g.i != 0 && this.g.g.isChecked();
        return parcelable0;
    }

    public final void p() {
        ColorStateList colorStateList0 = this.E == null ? MaterialColors.getColorStateListOrNull(this.getContext(), attr.colorControlActivated) : this.E;
        if(this.h != null && this.h.getTextCursorDrawable() != null) {
            Drawable drawable0 = DrawableCompat.wrap(this.h.getTextCursorDrawable()).mutate();
            if(this.m() || this.s != null && this.q) {
                ColorStateList colorStateList1 = this.F;
                if(colorStateList1 != null) {
                    colorStateList0 = colorStateList1;
                }
            }
            DrawableCompat.setTintList(drawable0, colorStateList0);
        }
    }

    @Deprecated
    public void passwordVisibilityToggleRequested(boolean z) {
        b b0 = this.g;
        if(b0.i == 1) {
            CheckableImageButton checkableImageButton0 = b0.g;
            checkableImageButton0.performClick();
            if(z) {
                checkableImageButton0.jumpDrawablesToCurrentState();
            }
        }
    }

    public final boolean q() {
        boolean z1;
        if(this.h == null) {
            return false;
        }
        CheckableImageButton checkableImageButton0 = null;
        boolean z = true;
        if(this.getStartIconDrawable() == null && (this.getPrefixText() == null || this.getPrefixTextView().getVisibility() != 0)) {
        label_21:
            if(this.g0 == null) {
                z1 = false;
            }
            else {
                Drawable[] arr_drawable1 = TextViewCompat.getCompoundDrawablesRelative(this.h);
                TextViewCompat.setCompoundDrawablesRelative(this.h, null, arr_drawable1[1], arr_drawable1[2], arr_drawable1[3]);
                this.g0 = null;
                z1 = true;
            }
        }
        else {
            r r0 = this.f;
            if(r0.getMeasuredWidth() > 0) {
                int v = r0.getMeasuredWidth() - this.h.getPaddingLeft();
                if(this.g0 == null || this.h0 != v) {
                    ColorDrawable colorDrawable0 = new ColorDrawable();
                    this.g0 = colorDrawable0;
                    this.h0 = v;
                    colorDrawable0.setBounds(0, 0, v, 1);
                }
                Drawable[] arr_drawable = TextViewCompat.getCompoundDrawablesRelative(this.h);
                ColorDrawable colorDrawable1 = this.g0;
                if(arr_drawable[0] == colorDrawable1) {
                    z1 = false;
                }
                else {
                    TextViewCompat.setCompoundDrawablesRelative(this.h, colorDrawable1, arr_drawable[1], arr_drawable[2], arr_drawable[3]);
                    z1 = true;
                }
            }
            else {
                goto label_21;
            }
        }
        b b0 = this.g;
        if((b0.e() || b0.i != 0 && this.isEndIconVisible() || b0.p != null) && b0.getMeasuredWidth() > 0) {
            int v1 = b0.q.getMeasuredWidth() - this.h.getPaddingRight();
            if(b0.e()) {
                checkableImageButton0 = b0.c;
            }
            else if(b0.i != 0 && b0.d()) {
                checkableImageButton0 = b0.g;
            }
            if(checkableImageButton0 != null) {
                int v2 = checkableImageButton0.getMeasuredWidth();
                v1 = MarginLayoutParamsCompat.getMarginStart(((ViewGroup.MarginLayoutParams)checkableImageButton0.getLayoutParams())) + (v2 + v1);
            }
            Drawable[] arr_drawable2 = TextViewCompat.getCompoundDrawablesRelative(this.h);
            ColorDrawable colorDrawable2 = this.j0;
            if(colorDrawable2 != null && this.k0 != v1) {
                this.k0 = v1;
                colorDrawable2.setBounds(0, 0, v1, 1);
                TextViewCompat.setCompoundDrawablesRelative(this.h, arr_drawable2[0], arr_drawable2[1], this.j0, arr_drawable2[3]);
                return true;
            }
            if(colorDrawable2 == null) {
                ColorDrawable colorDrawable3 = new ColorDrawable();
                this.j0 = colorDrawable3;
                this.k0 = v1;
                colorDrawable3.setBounds(0, 0, v1, 1);
            }
            Drawable drawable0 = arr_drawable2[2];
            ColorDrawable colorDrawable4 = this.j0;
            if(drawable0 != colorDrawable4) {
                this.l0 = drawable0;
                TextViewCompat.setCompoundDrawablesRelative(this.h, arr_drawable2[0], arr_drawable2[1], colorDrawable4, arr_drawable2[3]);
                return true;
            }
            return z1;
        }
        if(this.j0 != null) {
            Drawable[] arr_drawable3 = TextViewCompat.getCompoundDrawablesRelative(this.h);
            if(arr_drawable3[2] == this.j0) {
                TextViewCompat.setCompoundDrawablesRelative(this.h, arr_drawable3[0], arr_drawable3[1], this.l0, arr_drawable3[3]);
            }
            else {
                z = z1;
            }
            this.j0 = null;
            return z;
        }
        return z1;
    }

    public final void r() {
        EditText editText0 = this.h;
        if(editText0 != null && this.S == 0) {
            Drawable drawable0 = editText0.getBackground();
            if(drawable0 == null) {
                return;
            }
            drawable0 = drawable0.mutate();
            if(this.m()) {
                drawable0.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(this.getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
                return;
            }
            if(this.q) {
                AppCompatTextView appCompatTextView0 = this.s;
                if(appCompatTextView0 != null) {
                    drawable0.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(appCompatTextView0.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
                    return;
                }
            }
            DrawableCompat.clearColorFilter(drawable0);
            this.h.refreshDrawableState();
        }
    }

    public void refreshEndIconDrawableState() {
        g.b.z(this.g.a, this.g.g, this.g.k);
    }

    public void refreshErrorIconDrawableState() {
        g.b.z(this.g.a, this.g.c, this.g.d);
    }

    public void refreshStartIconDrawableState() {
        g.b.z(this.f.a, this.f.d, this.f.e);
    }

    public void removeOnEditTextAttachedListener(@NonNull OnEditTextAttachedListener textInputLayout$OnEditTextAttachedListener0) {
        this.i0.remove(textInputLayout$OnEditTextAttachedListener0);
    }

    public void removeOnEndIconChangedListener(@NonNull OnEndIconChangedListener textInputLayout$OnEndIconChangedListener0) {
        this.g.j.remove(textInputLayout$OnEndIconChangedListener0);
    }

    public final void s() {
        if(this.h != null && this.J != null && (this.M || this.h.getBackground() == null) && this.S != 0) {
            Drawable drawable0 = this.getEditTextBoxBackground();
            ViewCompat.setBackground(this.h, drawable0);
            this.M = true;
        }
    }

    public void setBoxBackgroundColor(@ColorInt int v) {
        if(this.b0 != v) {
            this.b0 = v;
            this.s0 = v;
            this.u0 = v;
            this.v0 = v;
            this.b();
        }
    }

    public void setBoxBackgroundColorResource(@ColorRes int v) {
        this.setBoxBackgroundColor(ContextCompat.getColor(this.getContext(), v));
    }

    public void setBoxBackgroundColorStateList(@NonNull ColorStateList colorStateList0) {
        int v = colorStateList0.getDefaultColor();
        this.s0 = v;
        this.b0 = v;
        this.t0 = colorStateList0.getColorForState(new int[]{0xFEFEFF62}, -1);
        this.u0 = colorStateList0.getColorForState(new int[]{0x101009C, 0x101009E}, -1);
        this.v0 = colorStateList0.getColorForState(new int[]{0x1010367, 0x101009E}, -1);
        this.b();
    }

    public void setBoxBackgroundMode(int v) {
        if(v == this.S) {
            return;
        }
        this.S = v;
        if(this.h != null) {
            this.i();
        }
    }

    public void setBoxCollapsedPaddingTop(int v) {
        this.T = v;
    }

    public void setBoxCornerFamily(int v) {
        this.P = this.P.toBuilder().setTopLeftCorner(v, this.P.getTopLeftCornerSize()).setTopRightCorner(v, this.P.getTopRightCornerSize()).setBottomLeftCorner(v, this.P.getBottomLeftCornerSize()).setBottomRightCorner(v, this.P.getBottomRightCornerSize()).build();
        this.b();
    }

    public void setBoxCornerRadii(float f, float f1, float f2, float f3) {
        boolean z = ViewUtils.isLayoutRtl(this);
        this.Q = z;
        float f4 = z ? f1 : f;
        if(!z) {
            f = f1;
        }
        float f5 = z ? f3 : f2;
        if(!z) {
            f2 = f3;
        }
        if(this.J == null || this.J.getTopLeftCornerResolvedSize() != f4 || this.J.getTopRightCornerResolvedSize() != f || this.J.getBottomLeftCornerResolvedSize() != f5 || this.J.getBottomRightCornerResolvedSize() != f2) {
            this.P = this.P.toBuilder().setTopLeftCornerSize(f4).setTopRightCornerSize(f).setBottomLeftCornerSize(f5).setBottomRightCornerSize(f2).build();
            this.b();
        }
    }

    public void setBoxCornerRadiiResources(@DimenRes int v, @DimenRes int v1, @DimenRes int v2, @DimenRes int v3) {
        this.setBoxCornerRadii(this.getContext().getResources().getDimension(v), this.getContext().getResources().getDimension(v1), this.getContext().getResources().getDimension(v3), this.getContext().getResources().getDimension(v2));
    }

    public void setBoxStrokeColor(@ColorInt int v) {
        if(this.q0 != v) {
            this.q0 = v;
            this.x();
        }
    }

    public void setBoxStrokeColorStateList(@NonNull ColorStateList colorStateList0) {
        if(colorStateList0.isStateful()) {
            this.o0 = colorStateList0.getDefaultColor();
            this.w0 = colorStateList0.getColorForState(new int[]{0xFEFEFF62}, -1);
            this.p0 = colorStateList0.getColorForState(new int[]{0x1010367, 0x101009E}, -1);
            this.q0 = colorStateList0.getColorForState(new int[]{0x101009C, 0x101009E}, -1);
        }
        else if(this.q0 != colorStateList0.getDefaultColor()) {
            this.q0 = colorStateList0.getDefaultColor();
        }
        this.x();
    }

    public void setBoxStrokeErrorColor(@Nullable ColorStateList colorStateList0) {
        if(this.r0 != colorStateList0) {
            this.r0 = colorStateList0;
            this.x();
        }
    }

    public void setBoxStrokeWidth(int v) {
        this.V = v;
        this.x();
    }

    public void setBoxStrokeWidthFocused(int v) {
        this.W = v;
        this.x();
    }

    public void setBoxStrokeWidthFocusedResource(@DimenRes int v) {
        this.setBoxStrokeWidthFocused(this.getResources().getDimensionPixelSize(v));
    }

    public void setBoxStrokeWidthResource(@DimenRes int v) {
        this.setBoxStrokeWidth(this.getResources().getDimensionPixelSize(v));
    }

    public void setCounterEnabled(boolean z) {
        if(this.o != z) {
            Editable editable0 = null;
            o o0 = this.n;
            if(z) {
                AppCompatTextView appCompatTextView0 = new AppCompatTextView(this.getContext());
                this.s = appCompatTextView0;
                appCompatTextView0.setId(id.textinput_counter);
                Typeface typeface0 = this.f0;
                if(typeface0 != null) {
                    this.s.setTypeface(typeface0);
                }
                this.s.setMaxLines(1);
                o0.a(this.s, 2);
                MarginLayoutParamsCompat.setMarginStart(((ViewGroup.MarginLayoutParams)this.s.getLayoutParams()), this.getResources().getDimensionPixelOffset(dimen.mtrl_textinput_counter_margin_start));
                this.o();
                if(this.s != null) {
                    EditText editText0 = this.h;
                    if(editText0 != null) {
                        editable0 = editText0.getText();
                    }
                    this.n(editable0);
                }
            }
            else {
                o0.g(this.s, 2);
                this.s = null;
            }
            this.o = z;
        }
    }

    public void setCounterMaxLength(int v) {
        if(this.p != v) {
            this.p = v > 0 ? v : -1;
            if(this.o && this.s != null) {
                this.n((this.h == null ? null : this.h.getText()));
            }
        }
    }

    public void setCounterOverflowTextAppearance(int v) {
        if(this.t != v) {
            this.t = v;
            this.o();
        }
    }

    public void setCounterOverflowTextColor(@Nullable ColorStateList colorStateList0) {
        if(this.D != colorStateList0) {
            this.D = colorStateList0;
            this.o();
        }
    }

    public void setCounterTextAppearance(int v) {
        if(this.u != v) {
            this.u = v;
            this.o();
        }
    }

    public void setCounterTextColor(@Nullable ColorStateList colorStateList0) {
        if(this.C != colorStateList0) {
            this.C = colorStateList0;
            this.o();
        }
    }

    @RequiresApi(29)
    public void setCursorColor(@Nullable ColorStateList colorStateList0) {
        if(this.E != colorStateList0) {
            this.E = colorStateList0;
            this.p();
        }
    }

    @RequiresApi(29)
    public void setCursorErrorColor(@Nullable ColorStateList colorStateList0) {
        if(this.F != colorStateList0) {
            this.F = colorStateList0;
            if(this.m() || this.s != null && this.q) {
                this.p();
            }
        }
    }

    public void setDefaultHintTextColor(@Nullable ColorStateList colorStateList0) {
        this.m0 = colorStateList0;
        this.n0 = colorStateList0;
        if(this.h != null) {
            this.u(false, false);
        }
    }

    private void setEditText(EditText editText0) {
        if(this.h != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if(this.getEndIconMode() != 3 && !(editText0 instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.h = editText0;
        int v = this.j;
        if(v == -1) {
            this.setMinWidth(this.l);
        }
        else {
            this.setMinEms(v);
        }
        int v1 = this.k;
        if(v1 == -1) {
            this.setMaxWidth(this.m);
        }
        else {
            this.setMaxEms(v1);
        }
        this.M = false;
        this.i();
        this.setTextInputAccessibilityDelegate(new AccessibilityDelegate(this));
        Typeface typeface0 = this.h.getTypeface();
        this.y0.setTypefaces(typeface0);
        float f = this.h.getTextSize();
        this.y0.setExpandedTextSize(f);
        int v2 = Build.VERSION.SDK_INT;
        float f1 = this.h.getLetterSpacing();
        this.y0.setExpandedLetterSpacing(f1);
        int v3 = this.h.getGravity();
        this.y0.setCollapsedTextGravity(v3 & 0xFFFFFF8F | 0x30);
        this.y0.setExpandedTextGravity(v3);
        this.h.addTextChangedListener(new m2(this, 2));
        if(this.m0 == null) {
            this.m0 = this.h.getHintTextColors();
        }
        if(this.G) {
            if(TextUtils.isEmpty(this.H)) {
                CharSequence charSequence0 = this.h.getHint();
                this.i = charSequence0;
                this.setHint(charSequence0);
                this.h.setHint(null);
            }
            this.I = true;
        }
        if(v2 >= 29) {
            this.p();
        }
        if(this.s != null) {
            this.n(this.h.getText());
        }
        this.r();
        this.n.b();
        this.f.bringToFront();
        b b0 = this.g;
        b0.bringToFront();
        for(Object object0: this.i0) {
            ((OnEditTextAttachedListener)object0).onEditTextAttached(this);
        }
        b0.m();
        if(!this.isEnabled()) {
            editText0.setEnabled(false);
        }
        this.u(false, true);
    }

    @Override  // android.view.View
    public void setEnabled(boolean z) {
        TextInputLayout.k(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.g.g.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.g.g.setCheckable(z);
    }

    public void setEndIconContentDescription(@StringRes int v) {
        CharSequence charSequence0 = v == 0 ? null : this.g.getResources().getText(v);
        CheckableImageButton checkableImageButton0 = this.g.g;
        if(checkableImageButton0.getContentDescription() != charSequence0) {
            checkableImageButton0.setContentDescription(charSequence0);
        }
    }

    public void setEndIconContentDescription(@Nullable CharSequence charSequence0) {
        CheckableImageButton checkableImageButton0 = this.g.g;
        if(checkableImageButton0.getContentDescription() != charSequence0) {
            checkableImageButton0.setContentDescription(charSequence0);
        }
    }

    public void setEndIconDrawable(@DrawableRes int v) {
        b b0 = this.g;
        Drawable drawable0 = v == 0 ? null : AppCompatResources.getDrawable(b0.getContext(), v);
        CheckableImageButton checkableImageButton0 = b0.g;
        checkableImageButton0.setImageDrawable(drawable0);
        if(drawable0 != null) {
            g.b.a(b0.a, checkableImageButton0, b0.k, b0.l);
            g.b.z(b0.a, checkableImageButton0, b0.k);
        }
    }

    public void setEndIconDrawable(@Nullable Drawable drawable0) {
        b b0 = this.g;
        CheckableImageButton checkableImageButton0 = b0.g;
        checkableImageButton0.setImageDrawable(drawable0);
        if(drawable0 != null) {
            g.b.a(b0.a, checkableImageButton0, b0.k, b0.l);
            g.b.z(b0.a, checkableImageButton0, b0.k);
        }
    }

    public void setEndIconMinSize(@IntRange(from = 0L) int v) {
        b b0 = this.g;
        if(v >= 0) {
            if(v != b0.m) {
                b0.m = v;
                b0.g.setMinimumWidth(v);
                b0.g.setMinimumHeight(v);
                b0.c.setMinimumWidth(v);
                b0.c.setMinimumHeight(v);
            }
            return;
        }
        b0.getClass();
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    public void setEndIconMode(int v) {
        this.g.g(v);
    }

    public void setEndIconOnClickListener(@Nullable View.OnClickListener view$OnClickListener0) {
        View.OnLongClickListener view$OnLongClickListener0 = this.g.o;
        this.g.g.setOnClickListener(view$OnClickListener0);
        g.b.E(this.g.g, view$OnLongClickListener0);
    }

    public void setEndIconOnLongClickListener(@Nullable View.OnLongClickListener view$OnLongClickListener0) {
        this.g.o = view$OnLongClickListener0;
        this.g.g.setOnLongClickListener(view$OnLongClickListener0);
        g.b.E(this.g.g, view$OnLongClickListener0);
    }

    public void setEndIconScaleType(@NonNull ImageView.ScaleType imageView$ScaleType0) {
        this.g.n = imageView$ScaleType0;
        this.g.g.setScaleType(imageView$ScaleType0);
        this.g.c.setScaleType(imageView$ScaleType0);
    }

    public void setEndIconTintList(@Nullable ColorStateList colorStateList0) {
        b b0 = this.g;
        if(b0.k != colorStateList0) {
            b0.k = colorStateList0;
            g.b.a(b0.a, b0.g, colorStateList0, b0.l);
        }
    }

    public void setEndIconTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        b b0 = this.g;
        if(b0.l != porterDuff$Mode0) {
            b0.l = porterDuff$Mode0;
            g.b.a(b0.a, b0.g, b0.k, porterDuff$Mode0);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.g.h(z);
    }

    public void setError(@Nullable CharSequence charSequence0) {
        o o0 = this.n;
        if(!o0.q) {
            if(TextUtils.isEmpty(charSequence0)) {
                return;
            }
            this.setErrorEnabled(true);
        }
        if(!TextUtils.isEmpty(charSequence0)) {
            o0.c();
            o0.p = charSequence0;
            o0.r.setText(charSequence0);
            int v = o0.n;
            if(v != 1) {
                o0.o = 1;
            }
            o0.i(v, o0.o, o0.h(o0.r, charSequence0));
            return;
        }
        o0.f();
    }

    public void setErrorAccessibilityLiveRegion(int v) {
        this.n.t = v;
        AppCompatTextView appCompatTextView0 = this.n.r;
        if(appCompatTextView0 != null) {
            ViewCompat.setAccessibilityLiveRegion(appCompatTextView0, v);
        }
    }

    public void setErrorContentDescription(@Nullable CharSequence charSequence0) {
        this.n.s = charSequence0;
        AppCompatTextView appCompatTextView0 = this.n.r;
        if(appCompatTextView0 != null) {
            appCompatTextView0.setContentDescription(charSequence0);
        }
    }

    public void setErrorEnabled(boolean z) {
        o o0 = this.n;
        if(o0.q != z) {
            o0.c();
            TextInputLayout textInputLayout0 = o0.h;
            if(z) {
                AppCompatTextView appCompatTextView0 = new AppCompatTextView(o0.g);
                o0.r = appCompatTextView0;
                appCompatTextView0.setId(id.textinput_error);
                o0.r.setTextAlignment(5);
                Typeface typeface0 = o0.B;
                if(typeface0 != null) {
                    o0.r.setTypeface(typeface0);
                }
                int v = o0.u;
                o0.u = v;
                AppCompatTextView appCompatTextView1 = o0.r;
                if(appCompatTextView1 != null) {
                    textInputLayout0.l(appCompatTextView1, v);
                }
                ColorStateList colorStateList0 = o0.v;
                o0.v = colorStateList0;
                AppCompatTextView appCompatTextView2 = o0.r;
                if(appCompatTextView2 != null && colorStateList0 != null) {
                    appCompatTextView2.setTextColor(colorStateList0);
                }
                CharSequence charSequence0 = o0.s;
                o0.s = charSequence0;
                AppCompatTextView appCompatTextView3 = o0.r;
                if(appCompatTextView3 != null) {
                    appCompatTextView3.setContentDescription(charSequence0);
                }
                int v1 = o0.t;
                o0.t = v1;
                AppCompatTextView appCompatTextView4 = o0.r;
                if(appCompatTextView4 != null) {
                    ViewCompat.setAccessibilityLiveRegion(appCompatTextView4, v1);
                }
                o0.r.setVisibility(4);
                o0.a(o0.r, 0);
            }
            else {
                o0.f();
                o0.g(o0.r, 0);
                o0.r = null;
                textInputLayout0.r();
                textInputLayout0.x();
            }
            o0.q = z;
        }
    }

    public void setErrorIconDrawable(@DrawableRes int v) {
        Drawable drawable0 = v == 0 ? null : AppCompatResources.getDrawable(this.g.getContext(), v);
        this.g.i(drawable0);
        g.b.z(this.g.a, this.g.c, this.g.d);
    }

    public void setErrorIconDrawable(@Nullable Drawable drawable0) {
        this.g.i(drawable0);
    }

    public void setErrorIconOnClickListener(@Nullable View.OnClickListener view$OnClickListener0) {
        View.OnLongClickListener view$OnLongClickListener0 = this.g.f;
        this.g.c.setOnClickListener(view$OnClickListener0);
        g.b.E(this.g.c, view$OnLongClickListener0);
    }

    public void setErrorIconOnLongClickListener(@Nullable View.OnLongClickListener view$OnLongClickListener0) {
        this.g.f = view$OnLongClickListener0;
        this.g.c.setOnLongClickListener(view$OnLongClickListener0);
        g.b.E(this.g.c, view$OnLongClickListener0);
    }

    public void setErrorIconTintList(@Nullable ColorStateList colorStateList0) {
        b b0 = this.g;
        if(b0.d != colorStateList0) {
            b0.d = colorStateList0;
            g.b.a(b0.a, b0.c, colorStateList0, b0.e);
        }
    }

    public void setErrorIconTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        b b0 = this.g;
        if(b0.e != porterDuff$Mode0) {
            b0.e = porterDuff$Mode0;
            g.b.a(b0.a, b0.c, b0.d, porterDuff$Mode0);
        }
    }

    public void setErrorTextAppearance(@StyleRes int v) {
        o o0 = this.n;
        o0.u = v;
        AppCompatTextView appCompatTextView0 = o0.r;
        if(appCompatTextView0 != null) {
            o0.h.l(appCompatTextView0, v);
        }
    }

    public void setErrorTextColor(@Nullable ColorStateList colorStateList0) {
        this.n.v = colorStateList0;
        AppCompatTextView appCompatTextView0 = this.n.r;
        if(appCompatTextView0 != null && colorStateList0 != null) {
            appCompatTextView0.setTextColor(colorStateList0);
        }
    }

    public void setExpandedHintEnabled(boolean z) {
        if(this.z0 != z) {
            this.z0 = z;
            this.u(false, false);
        }
    }

    public void setHelperText(@Nullable CharSequence charSequence0) {
        if(!TextUtils.isEmpty(charSequence0)) {
            if(!this.isHelperTextEnabled()) {
                this.setHelperTextEnabled(true);
            }
            o o0 = this.n;
            o0.c();
            o0.w = charSequence0;
            o0.y.setText(charSequence0);
            int v = o0.n;
            if(v != 2) {
                o0.o = 2;
            }
            o0.i(v, o0.o, o0.h(o0.y, charSequence0));
        }
        else if(this.isHelperTextEnabled()) {
            this.setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(@Nullable ColorStateList colorStateList0) {
        this.n.A = colorStateList0;
        AppCompatTextView appCompatTextView0 = this.n.y;
        if(appCompatTextView0 != null && colorStateList0 != null) {
            appCompatTextView0.setTextColor(colorStateList0);
        }
    }

    public void setHelperTextEnabled(boolean z) {
        o o0 = this.n;
        if(o0.x != z) {
            o0.c();
            if(z) {
                AppCompatTextView appCompatTextView0 = new AppCompatTextView(o0.g);
                o0.y = appCompatTextView0;
                appCompatTextView0.setId(id.textinput_helper_text);
                o0.y.setTextAlignment(5);
                Typeface typeface0 = o0.B;
                if(typeface0 != null) {
                    o0.y.setTypeface(typeface0);
                }
                o0.y.setVisibility(4);
                ViewCompat.setAccessibilityLiveRegion(o0.y, 1);
                int v = o0.z;
                o0.z = v;
                AppCompatTextView appCompatTextView1 = o0.y;
                if(appCompatTextView1 != null) {
                    TextViewCompat.setTextAppearance(appCompatTextView1, v);
                }
                ColorStateList colorStateList0 = o0.A;
                o0.A = colorStateList0;
                AppCompatTextView appCompatTextView2 = o0.y;
                if(appCompatTextView2 != null && colorStateList0 != null) {
                    appCompatTextView2.setTextColor(colorStateList0);
                }
                o0.a(o0.y, 1);
                o0.y.setAccessibilityDelegate(new n(o0));
            }
            else {
                o0.c();
                int v1 = o0.n;
                if(v1 == 2) {
                    o0.o = 0;
                }
                o0.i(v1, o0.o, o0.h(o0.y, ""));
                o0.g(o0.y, 1);
                o0.y = null;
                o0.h.r();
                o0.h.x();
            }
            o0.x = z;
        }
    }

    public void setHelperTextTextAppearance(@StyleRes int v) {
        this.n.z = v;
        AppCompatTextView appCompatTextView0 = this.n.y;
        if(appCompatTextView0 != null) {
            TextViewCompat.setTextAppearance(appCompatTextView0, v);
        }
    }

    public void setHint(@StringRes int v) {
        this.setHint((v == 0 ? null : this.getResources().getText(v)));
    }

    public void setHint(@Nullable CharSequence charSequence0) {
        if(this.G) {
            this.setHintInternal(charSequence0);
            this.sendAccessibilityEvent(0x800);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.A0 = z;
    }

    public void setHintEnabled(boolean z) {
        if(z != this.G) {
            this.G = z;
            if(z) {
                CharSequence charSequence0 = this.h.getHint();
                if(!TextUtils.isEmpty(charSequence0)) {
                    if(TextUtils.isEmpty(this.H)) {
                        this.setHint(charSequence0);
                    }
                    this.h.setHint(null);
                }
                this.I = true;
            }
            else {
                this.I = false;
                if(!TextUtils.isEmpty(this.H) && TextUtils.isEmpty(this.h.getHint())) {
                    this.h.setHint(this.H);
                }
                this.setHintInternal(null);
            }
            if(this.h != null) {
                this.t();
            }
        }
    }

    private void setHintInternal(CharSequence charSequence0) {
        if(!TextUtils.equals(charSequence0, this.H)) {
            this.H = charSequence0;
            this.y0.setText(charSequence0);
            if(!this.x0) {
                this.j();
            }
        }
    }

    public void setHintTextAppearance(@StyleRes int v) {
        this.y0.setCollapsedTextAppearance(v);
        this.n0 = this.y0.getCollapsedTextColor();
        if(this.h != null) {
            this.u(false, false);
            this.t();
        }
    }

    public void setHintTextColor(@Nullable ColorStateList colorStateList0) {
        if(this.n0 != colorStateList0) {
            if(this.m0 == null) {
                this.y0.setCollapsedTextColor(colorStateList0);
            }
            this.n0 = colorStateList0;
            if(this.h != null) {
                this.u(false, false);
            }
        }
    }

    public void setLengthCounter(@NonNull LengthCounter textInputLayout$LengthCounter0) {
        this.r = textInputLayout$LengthCounter0;
    }

    public void setMaxEms(int v) {
        this.k = v;
        EditText editText0 = this.h;
        if(editText0 != null && v != -1) {
            editText0.setMaxEms(v);
        }
    }

    public void setMaxWidth(@Px int v) {
        this.m = v;
        EditText editText0 = this.h;
        if(editText0 != null && v != -1) {
            editText0.setMaxWidth(v);
        }
    }

    public void setMaxWidthResource(@DimenRes int v) {
        this.setMaxWidth(this.getContext().getResources().getDimensionPixelSize(v));
    }

    public void setMinEms(int v) {
        this.j = v;
        EditText editText0 = this.h;
        if(editText0 != null && v != -1) {
            editText0.setMinEms(v);
        }
    }

    public void setMinWidth(@Px int v) {
        this.l = v;
        EditText editText0 = this.h;
        if(editText0 != null && v != -1) {
            editText0.setMinWidth(v);
        }
    }

    public void setMinWidthResource(@DimenRes int v) {
        this.setMinWidth(this.getContext().getResources().getDimensionPixelSize(v));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@StringRes int v) {
        CharSequence charSequence0 = v == 0 ? null : this.g.getResources().getText(v);
        this.g.g.setContentDescription(charSequence0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@Nullable CharSequence charSequence0) {
        this.g.g.setContentDescription(charSequence0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@DrawableRes int v) {
        Drawable drawable0 = v == 0 ? null : AppCompatResources.getDrawable(this.g.getContext(), v);
        this.g.g.setImageDrawable(drawable0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@Nullable Drawable drawable0) {
        this.g.g.setImageDrawable(drawable0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        b b0 = this.g;
        if(z && b0.i != 1) {
            b0.g(1);
            return;
        }
        if(!z) {
            b0.g(0);
            return;
        }
        b0.getClass();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(@Nullable ColorStateList colorStateList0) {
        this.g.k = colorStateList0;
        g.b.a(this.g.a, this.g.g, colorStateList0, this.g.l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        this.g.l = porterDuff$Mode0;
        g.b.a(this.g.a, this.g.g, this.g.k, porterDuff$Mode0);
    }

    public void setPlaceholderText(@Nullable CharSequence charSequence0) {
        if(this.x == null) {
            AppCompatTextView appCompatTextView0 = new AppCompatTextView(this.getContext());
            this.x = appCompatTextView0;
            appCompatTextView0.setId(id.textinput_placeholder);
            ViewCompat.setImportantForAccessibility(this.x, 2);
            Fade fade0 = this.d();
            this.A = fade0;
            fade0.setStartDelay(67L);
            this.B = this.d();
            this.setPlaceholderTextAppearance(this.z);
            this.setPlaceholderTextColor(this.y);
        }
        if(TextUtils.isEmpty(charSequence0)) {
            this.setPlaceholderTextEnabled(false);
        }
        else {
            if(!this.w) {
                this.setPlaceholderTextEnabled(true);
            }
            this.v = charSequence0;
        }
        this.v((this.h == null ? null : this.h.getText()));
    }

    public void setPlaceholderTextAppearance(@StyleRes int v) {
        this.z = v;
        AppCompatTextView appCompatTextView0 = this.x;
        if(appCompatTextView0 != null) {
            TextViewCompat.setTextAppearance(appCompatTextView0, v);
        }
    }

    public void setPlaceholderTextColor(@Nullable ColorStateList colorStateList0) {
        if(this.y != colorStateList0) {
            this.y = colorStateList0;
            AppCompatTextView appCompatTextView0 = this.x;
            if(appCompatTextView0 != null && colorStateList0 != null) {
                appCompatTextView0.setTextColor(colorStateList0);
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if(this.w == z) {
            return;
        }
        if(z) {
            AppCompatTextView appCompatTextView0 = this.x;
            if(appCompatTextView0 != null) {
                this.e.addView(appCompatTextView0);
                this.x.setVisibility(0);
            }
        }
        else {
            AppCompatTextView appCompatTextView1 = this.x;
            if(appCompatTextView1 != null) {
                appCompatTextView1.setVisibility(8);
            }
            this.x = null;
        }
        this.w = z;
    }

    public void setPrefixText(@Nullable CharSequence charSequence0) {
        this.f.getClass();
        this.f.c = TextUtils.isEmpty(charSequence0) ? null : charSequence0;
        this.f.b.setText(charSequence0);
        this.f.e();
    }

    public void setPrefixTextAppearance(@StyleRes int v) {
        TextViewCompat.setTextAppearance(this.f.b, v);
    }

    public void setPrefixTextColor(@NonNull ColorStateList colorStateList0) {
        this.f.b.setTextColor(colorStateList0);
    }

    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel0) {
        if(this.J != null && this.J.getShapeAppearanceModel() != shapeAppearanceModel0) {
            this.P = shapeAppearanceModel0;
            this.b();
        }
    }

    public void setStartIconCheckable(boolean z) {
        this.f.d.setCheckable(z);
    }

    public void setStartIconContentDescription(@StringRes int v) {
        this.setStartIconContentDescription((v == 0 ? null : this.getResources().getText(v)));
    }

    public void setStartIconContentDescription(@Nullable CharSequence charSequence0) {
        CheckableImageButton checkableImageButton0 = this.f.d;
        if(checkableImageButton0.getContentDescription() != charSequence0) {
            checkableImageButton0.setContentDescription(charSequence0);
        }
    }

    public void setStartIconDrawable(@DrawableRes int v) {
        this.setStartIconDrawable((v == 0 ? null : AppCompatResources.getDrawable(this.getContext(), v)));
    }

    public void setStartIconDrawable(@Nullable Drawable drawable0) {
        this.f.b(drawable0);
    }

    public void setStartIconMinSize(@IntRange(from = 0L) int v) {
        r r0 = this.f;
        if(v >= 0) {
            if(v != r0.g) {
                r0.g = v;
                r0.d.setMinimumWidth(v);
                r0.d.setMinimumHeight(v);
            }
            return;
        }
        r0.getClass();
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    public void setStartIconOnClickListener(@Nullable View.OnClickListener view$OnClickListener0) {
        View.OnLongClickListener view$OnLongClickListener0 = this.f.i;
        this.f.d.setOnClickListener(view$OnClickListener0);
        g.b.E(this.f.d, view$OnLongClickListener0);
    }

    public void setStartIconOnLongClickListener(@Nullable View.OnLongClickListener view$OnLongClickListener0) {
        this.f.i = view$OnLongClickListener0;
        this.f.d.setOnLongClickListener(view$OnLongClickListener0);
        g.b.E(this.f.d, view$OnLongClickListener0);
    }

    public void setStartIconScaleType(@NonNull ImageView.ScaleType imageView$ScaleType0) {
        this.f.h = imageView$ScaleType0;
        this.f.d.setScaleType(imageView$ScaleType0);
    }

    public void setStartIconTintList(@Nullable ColorStateList colorStateList0) {
        r r0 = this.f;
        if(r0.e != colorStateList0) {
            r0.e = colorStateList0;
            g.b.a(r0.a, r0.d, colorStateList0, r0.f);
        }
    }

    public void setStartIconTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        r r0 = this.f;
        if(r0.f != porterDuff$Mode0) {
            r0.f = porterDuff$Mode0;
            g.b.a(r0.a, r0.d, r0.e, porterDuff$Mode0);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.f.c(z);
    }

    public void setSuffixText(@Nullable CharSequence charSequence0) {
        this.g.getClass();
        this.g.p = TextUtils.isEmpty(charSequence0) ? null : charSequence0;
        this.g.q.setText(charSequence0);
        this.g.n();
    }

    public void setSuffixTextAppearance(@StyleRes int v) {
        TextViewCompat.setTextAppearance(this.g.q, v);
    }

    public void setSuffixTextColor(@NonNull ColorStateList colorStateList0) {
        this.g.q.setTextColor(colorStateList0);
    }

    public void setTextInputAccessibilityDelegate(@Nullable AccessibilityDelegate textInputLayout$AccessibilityDelegate0) {
        EditText editText0 = this.h;
        if(editText0 != null) {
            ViewCompat.setAccessibilityDelegate(editText0, textInputLayout$AccessibilityDelegate0);
        }
    }

    public void setTypeface(@Nullable Typeface typeface0) {
        if(typeface0 != this.f0) {
            this.f0 = typeface0;
            this.y0.setTypefaces(typeface0);
            o o0 = this.n;
            if(typeface0 != o0.B) {
                o0.B = typeface0;
                AppCompatTextView appCompatTextView0 = o0.r;
                if(appCompatTextView0 != null) {
                    appCompatTextView0.setTypeface(typeface0);
                }
                AppCompatTextView appCompatTextView1 = o0.y;
                if(appCompatTextView1 != null) {
                    appCompatTextView1.setTypeface(typeface0);
                }
            }
            AppCompatTextView appCompatTextView2 = this.s;
            if(appCompatTextView2 != null) {
                appCompatTextView2.setTypeface(typeface0);
            }
        }
    }

    public final void t() {
        if(this.S != 1) {
            FrameLayout frameLayout0 = this.e;
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = (LinearLayout.LayoutParams)frameLayout0.getLayoutParams();
            int v = this.c();
            if(v != linearLayout$LayoutParams0.topMargin) {
                linearLayout$LayoutParams0.topMargin = v;
                frameLayout0.requestLayout();
            }
        }
    }

    public final void u(boolean z, boolean z1) {
        boolean z2 = this.isEnabled();
        boolean z3 = this.h != null && !TextUtils.isEmpty(this.h.getText());
        boolean z4 = this.h != null && this.h.hasFocus();
        ColorStateList colorStateList0 = this.m0;
        CollapsingTextHelper collapsingTextHelper0 = this.y0;
        if(colorStateList0 != null) {
            collapsingTextHelper0.setCollapsedAndExpandedTextColor(colorStateList0);
        }
        Editable editable0 = null;
        if(!z2) {
            collapsingTextHelper0.setCollapsedAndExpandedTextColor(ColorStateList.valueOf((this.m0 == null ? this.w0 : this.m0.getColorForState(new int[]{0xFEFEFF62}, this.w0))));
        }
        else if(this.m()) {
            AppCompatTextView appCompatTextView0 = this.n.r;
            collapsingTextHelper0.setCollapsedAndExpandedTextColor((appCompatTextView0 == null ? null : appCompatTextView0.getTextColors()));
        }
        else if(this.q) {
            AppCompatTextView appCompatTextView1 = this.s;
            if(appCompatTextView1 != null) {
                collapsingTextHelper0.setCollapsedAndExpandedTextColor(appCompatTextView1.getTextColors());
                goto label_24;
            }
            goto label_20;
        }
        else {
        label_20:
            if(z4) {
                ColorStateList colorStateList1 = this.n0;
                if(colorStateList1 != null) {
                    collapsingTextHelper0.setCollapsedTextColor(colorStateList1);
                }
            }
        }
    label_24:
        b b0 = this.g;
        r r0 = this.f;
        if(!z3 && this.z0 && (!this.isEnabled() || !z4)) {
            if(z1 || !this.x0) {
                if(this.B0 != null && this.B0.isRunning()) {
                    this.B0.cancel();
                }
                if(!z || !this.A0) {
                    collapsingTextHelper0.setExpansionFraction(0.0f);
                }
                else {
                    this.a(0.0f);
                }
                if(this.e() && !((f8.g)this.J).y.v.isEmpty() && this.e()) {
                    ((f8.g)this.J).i(0.0f, 0.0f, 0.0f, 0.0f);
                }
                this.x0 = true;
                AppCompatTextView appCompatTextView2 = this.x;
                if(appCompatTextView2 != null && this.w) {
                    appCompatTextView2.setText(null);
                    TransitionManager.beginDelayedTransition(this.e, this.B);
                    this.x.setVisibility(4);
                }
                r0.j = true;
                r0.e();
                b0.r = true;
                b0.n();
            }
        }
        else if(z1 || this.x0) {
            if(this.B0 != null && this.B0.isRunning()) {
                this.B0.cancel();
            }
            if(!z || !this.A0) {
                collapsingTextHelper0.setExpansionFraction(1.0f);
            }
            else {
                this.a(1.0f);
            }
            this.x0 = false;
            if(this.e()) {
                this.j();
            }
            EditText editText0 = this.h;
            if(editText0 != null) {
                editable0 = editText0.getText();
            }
            this.v(editable0);
            r0.j = false;
            r0.e();
            b0.r = false;
            b0.n();
        }
    }

    public final void v(Editable editable0) {
        int v = this.r.countLength(editable0);
        FrameLayout frameLayout0 = this.e;
        if(v != 0 || this.x0) {
            AppCompatTextView appCompatTextView0 = this.x;
            if(appCompatTextView0 != null && this.w) {
                appCompatTextView0.setText(null);
                TransitionManager.beginDelayedTransition(frameLayout0, this.B);
                this.x.setVisibility(4);
            }
        }
        else if(this.x != null && this.w && !TextUtils.isEmpty(this.v)) {
            this.x.setText(this.v);
            TransitionManager.beginDelayedTransition(frameLayout0, this.A);
            this.x.setVisibility(0);
            this.x.bringToFront();
            this.announceForAccessibility(this.v);
        }
    }

    public final void w(boolean z, boolean z1) {
        int v = this.r0.getDefaultColor();
        int v1 = this.r0.getColorForState(new int[]{0x1010367, 0x101009E}, v);
        int v2 = this.r0.getColorForState(new int[]{0x10102FE, 0x101009E}, v);
        if(z) {
            this.a0 = v2;
            return;
        }
        if(z1) {
            this.a0 = v1;
            return;
        }
        this.a0 = v;
    }

    public final void x() {
        boolean z = false;
        if(this.J != null && this.S != 0) {
            boolean z1 = this.isFocused() || this.h != null && this.h.hasFocus();
            if(this.isHovered() || this.h != null && this.h.isHovered()) {
                z = true;
            }
            if(!this.isEnabled()) {
                this.a0 = this.w0;
            }
            else if(!this.m()) {
                if(this.q) {
                    AppCompatTextView appCompatTextView0 = this.s;
                    if(appCompatTextView0 == null) {
                        goto label_22;
                    }
                    else if(this.r0 != null) {
                        this.w(z1, z);
                    }
                    else {
                        this.a0 = appCompatTextView0.getCurrentTextColor();
                    }
                }
                else {
                label_22:
                    if(z1) {
                        this.a0 = this.q0;
                    }
                    else if(z) {
                        this.a0 = this.p0;
                    }
                    else {
                        this.a0 = this.o0;
                    }
                }
            }
            else if(this.r0 != null) {
                this.w(z1, z);
            }
            else {
                this.a0 = this.getErrorCurrentTextColors();
            }
            if(Build.VERSION.SDK_INT >= 29) {
                this.p();
            }
            b b0 = this.g;
            b0.l();
            TextInputLayout textInputLayout0 = b0.a;
            g.b.z(textInputLayout0, b0.c, b0.d);
            CheckableImageButton checkableImageButton0 = b0.g;
            g.b.z(textInputLayout0, checkableImageButton0, b0.k);
            if(b0.b() instanceof i) {
                if(!textInputLayout0.m() || checkableImageButton0.getDrawable() == null) {
                    g.b.a(textInputLayout0, checkableImageButton0, b0.k, b0.l);
                }
                else {
                    Drawable drawable0 = DrawableCompat.wrap(checkableImageButton0.getDrawable()).mutate();
                    DrawableCompat.setTint(drawable0, textInputLayout0.getErrorCurrentTextColors());
                    checkableImageButton0.setImageDrawable(drawable0);
                }
            }
            this.refreshStartIconDrawableState();
            if(this.S == 2) {
                int v = this.U;
                this.U = !z1 || !this.isEnabled() ? this.V : this.W;
                if(this.U != v && this.e() && !this.x0) {
                    if(this.e()) {
                        ((f8.g)this.J).i(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    this.j();
                }
            }
            if(this.S == 1) {
                if(!this.isEnabled()) {
                    this.b0 = this.t0;
                }
                else if(z && !z1) {
                    this.b0 = this.v0;
                }
                else if(z1) {
                    this.b0 = this.u0;
                }
                else {
                    this.b0 = this.s0;
                }
            }
            this.b();
        }
    }
}

