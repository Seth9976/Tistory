package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R.attr;
import com.google.android.material.R.layout;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

public class Snackbar extends BaseTransientBottomBar {
    public static class Callback extends BaseCallback {
        public static final int DISMISS_EVENT_ACTION = 1;
        public static final int DISMISS_EVENT_CONSECUTIVE = 4;
        public static final int DISMISS_EVENT_MANUAL = 3;
        public static final int DISMISS_EVENT_SWIPE = 0;
        public static final int DISMISS_EVENT_TIMEOUT = 2;

        public void onDismissed(Snackbar snackbar0, int v) {
        }

        @Override  // com.google.android.material.snackbar.BaseTransientBottomBar$BaseCallback
        public void onDismissed(Object object0, int v) {
        }

        public void onShown(Snackbar snackbar0) {
        }

        @Override  // com.google.android.material.snackbar.BaseTransientBottomBar$BaseCallback
        public void onShown(Object object0) {
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public static final class SnackbarLayout extends SnackbarBaseLayout {
        public SnackbarLayout(Context context0) {
            super(context0);
        }

        public SnackbarLayout(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
        }

        @Override  // com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout
        public void onMeasure(int v, int v1) {
            super.onMeasure(v, v1);
            int v2 = this.getChildCount();
            int v3 = this.getMeasuredWidth();
            int v4 = this.getPaddingLeft();
            int v5 = this.getPaddingRight();
            for(int v6 = 0; v6 < v2; ++v6) {
                View view0 = this.getChildAt(v6);
                if(view0.getLayoutParams().width == -1) {
                    view0.measure(View.MeasureSpec.makeMeasureSpec(v3 - v4 - v5, 0x40000000), View.MeasureSpec.makeMeasureSpec(view0.getMeasuredHeight(), 0x40000000));
                }
            }
        }

        @Override  // com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout
        public void setBackground(@Nullable Drawable drawable0) {
            super.setBackground(drawable0);
        }

        @Override  // com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout
        public void setBackgroundDrawable(@Nullable Drawable drawable0) {
            super.setBackgroundDrawable(drawable0);
        }

        @Override  // com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout
        public void setBackgroundTintList(@Nullable ColorStateList colorStateList0) {
            super.setBackgroundTintList(colorStateList0);
        }

        @Override  // com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout
        public void setBackgroundTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
            super.setBackgroundTintMode(porterDuff$Mode0);
        }

        @Override  // com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout
        public void setLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            super.setLayoutParams(viewGroup$LayoutParams0);
        }

        @Override  // com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout
        public void setOnClickListener(@Nullable View.OnClickListener view$OnClickListener0) {
            super.setOnClickListener(view$OnClickListener0);
        }
    }

    public final AccessibilityManager F;
    public boolean G;
    public Callback H;
    public static final int[] I;
    public static final int[] J;

    static {
        Snackbar.I = new int[]{attr.snackbarButtonStyle};
        Snackbar.J = new int[]{attr.snackbarButtonStyle, attr.snackbarTextViewStyle};
    }

    public Snackbar(Context context0, ViewGroup viewGroup0, SnackbarContentLayout snackbarContentLayout0, SnackbarContentLayout snackbarContentLayout1) {
        super(context0, viewGroup0, snackbarContentLayout0, snackbarContentLayout1);
        this.F = (AccessibilityManager)viewGroup0.getContext().getSystemService("accessibility");
    }

    @Override  // com.google.android.material.snackbar.BaseTransientBottomBar
    public void dismiss() {
        super.dismiss();
    }

    public static Snackbar f(Context context0, View view0, CharSequence charSequence0, int v) {
        ViewGroup viewGroup1;
        ViewGroup viewGroup0 = null;
        while(true) {
            if(view0 instanceof CoordinatorLayout) {
                viewGroup1 = (ViewGroup)view0;
                break;
            }
            if(view0 instanceof FrameLayout) {
                if(view0.getId() == 0x1020002) {
                    viewGroup1 = (ViewGroup)view0;
                    break;
                }
                viewGroup0 = (ViewGroup)view0;
            }
            if(view0 != null) {
                ViewParent viewParent0 = view0.getParent();
                view0 = viewParent0 instanceof View ? ((View)viewParent0) : null;
            }
            if(view0 == null) {
                viewGroup1 = viewGroup0;
                break;
            }
        }
        if(viewGroup1 == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        if(context0 == null) {
            context0 = viewGroup1.getContext();
        }
        LayoutInflater layoutInflater0 = LayoutInflater.from(context0);
        TypedArray typedArray0 = context0.obtainStyledAttributes(Snackbar.J);
        int v1 = typedArray0.getResourceId(0, -1);
        int v2 = typedArray0.getResourceId(1, -1);
        typedArray0.recycle();
        SnackbarContentLayout snackbarContentLayout0 = (SnackbarContentLayout)layoutInflater0.inflate((v1 == -1 || v2 == -1 ? layout.design_layout_snackbar_include : layout.mtrl_layout_snackbar_include), viewGroup1, false);
        Snackbar snackbar0 = new Snackbar(context0, viewGroup1, snackbarContentLayout0, snackbarContentLayout0);
        snackbar0.setText(charSequence0);
        snackbar0.setDuration(v);
        return snackbar0;
    }

    @Override  // com.google.android.material.snackbar.BaseTransientBottomBar
    public int getDuration() {
        int v = super.getDuration();
        if(v == -2) {
            return -2;
        }
        AccessibilityManager accessibilityManager0 = this.F;
        if(Build.VERSION.SDK_INT >= 29) {
            return this.G ? accessibilityManager0.getRecommendedTimeoutMillis(v, 7) : accessibilityManager0.getRecommendedTimeoutMillis(v, 3);
        }
        return !this.G || !accessibilityManager0.isTouchExplorationEnabled() ? v : -2;
    }

    @Deprecated
    public static boolean hasSnackbarButtonStyleAttr(@NonNull Context context0) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(Snackbar.I);
        int v = typedArray0.getResourceId(0, -1);
        typedArray0.recycle();
        return v != -1;
    }

    @Override  // com.google.android.material.snackbar.BaseTransientBottomBar
    public boolean isShown() {
        return super.isShown();
    }

    @NonNull
    public static Snackbar make(@NonNull Context context0, @NonNull View view0, @NonNull CharSequence charSequence0, int v) {
        return Snackbar.f(context0, view0, charSequence0, v);
    }

    @NonNull
    public static Snackbar make(@NonNull View view0, @StringRes int v, int v1) {
        return Snackbar.make(view0, view0.getResources().getText(v), v1);
    }

    @NonNull
    public static Snackbar make(@NonNull View view0, @NonNull CharSequence charSequence0, int v) {
        return Snackbar.f(null, view0, charSequence0, v);
    }

    @NonNull
    @CanIgnoreReturnValue
    public Snackbar setAction(@StringRes int v, View.OnClickListener view$OnClickListener0) {
        return this.setAction(this.getContext().getText(v), view$OnClickListener0);
    }

    @NonNull
    @CanIgnoreReturnValue
    public Snackbar setAction(@Nullable CharSequence charSequence0, @Nullable View.OnClickListener view$OnClickListener0) {
        Button button0 = ((SnackbarContentLayout)this.view.getChildAt(0)).getActionView();
        if(!TextUtils.isEmpty(charSequence0) && view$OnClickListener0 != null) {
            this.G = true;
            button0.setVisibility(0);
            button0.setText(charSequence0);
            button0.setOnClickListener(new p(0, this, view$OnClickListener0));
            return this;
        }
        button0.setVisibility(8);
        button0.setOnClickListener(null);
        this.G = false;
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public Snackbar setActionTextColor(@ColorInt int v) {
        ((SnackbarContentLayout)this.view.getChildAt(0)).getActionView().setTextColor(v);
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public Snackbar setActionTextColor(ColorStateList colorStateList0) {
        ((SnackbarContentLayout)this.view.getChildAt(0)).getActionView().setTextColor(colorStateList0);
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public Snackbar setBackgroundTint(@ColorInt int v) {
        return this.setBackgroundTintList(ColorStateList.valueOf(v));
    }

    @NonNull
    @CanIgnoreReturnValue
    public Snackbar setBackgroundTintList(@Nullable ColorStateList colorStateList0) {
        this.view.setBackgroundTintList(colorStateList0);
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public Snackbar setBackgroundTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        this.view.setBackgroundTintMode(porterDuff$Mode0);
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    @Deprecated
    public Snackbar setCallback(@Nullable Callback snackbar$Callback0) {
        Callback snackbar$Callback1 = this.H;
        if(snackbar$Callback1 != null) {
            this.removeCallback(snackbar$Callback1);
        }
        if(snackbar$Callback0 != null) {
            this.addCallback(snackbar$Callback0);
        }
        this.H = snackbar$Callback0;
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public Snackbar setMaxInlineActionWidth(@Dimension int v) {
        ((SnackbarContentLayout)this.view.getChildAt(0)).setMaxInlineActionWidth(v);
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public Snackbar setText(@StringRes int v) {
        return this.setText(this.getContext().getText(v));
    }

    @NonNull
    @CanIgnoreReturnValue
    public Snackbar setText(@NonNull CharSequence charSequence0) {
        ((SnackbarContentLayout)this.view.getChildAt(0)).getMessageView().setText(charSequence0);
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public Snackbar setTextColor(@ColorInt int v) {
        ((SnackbarContentLayout)this.view.getChildAt(0)).getMessageView().setTextColor(v);
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public Snackbar setTextColor(ColorStateList colorStateList0) {
        ((SnackbarContentLayout)this.view.getChildAt(0)).getMessageView().setTextColor(colorStateList0);
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public Snackbar setTextMaxLines(int v) {
        ((SnackbarContentLayout)this.view.getChildAt(0)).getMessageView().setMaxLines(v);
        return this;
    }

    @Override  // com.google.android.material.snackbar.BaseTransientBottomBar
    public void show() {
        super.show();
    }
}

