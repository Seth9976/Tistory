package com.google.android.material.floatingactionbutton;

import a8.g;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.annotation.AnimatorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.view.menu.f;
import androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.List;

public class ExtendedFloatingActionButton extends MaterialButton implements AttachedBehavior {
    public static class ExtendedFloatingActionButtonBehavior extends Behavior {
        public Rect o;
        public boolean p;
        public boolean q;

        public ExtendedFloatingActionButtonBehavior() {
            this.p = false;
            this.q = true;
        }

        public ExtendedFloatingActionButtonBehavior(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.ExtendedFloatingActionButton_Behavior_Layout);
            this.p = typedArray0.getBoolean(styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.q = typedArray0.getBoolean(styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            typedArray0.recycle();
        }

        public final boolean a(CoordinatorLayout coordinatorLayout0, AppBarLayout appBarLayout0, ExtendedFloatingActionButton extendedFloatingActionButton0) {
            LayoutParams coordinatorLayout$LayoutParams0 = (LayoutParams)extendedFloatingActionButton0.getLayoutParams();
            if(!this.p && !this.q || coordinatorLayout$LayoutParams0.getAnchorId() != appBarLayout0.getId()) {
                return false;
            }
            if(this.o == null) {
                this.o = new Rect();
            }
            Rect rect0 = this.o;
            DescendantOffsetUtils.getDescendantRect(coordinatorLayout0, appBarLayout0, rect0);
            if(rect0.bottom <= appBarLayout0.getMinimumHeightForVisibleOverlappingContent()) {
                this.shrinkOrHide(extendedFloatingActionButton0);
                return true;
            }
            this.extendOrShow(extendedFloatingActionButton0);
            return true;
        }

        public final boolean b(View view0, ExtendedFloatingActionButton extendedFloatingActionButton0) {
            LayoutParams coordinatorLayout$LayoutParams0 = (LayoutParams)extendedFloatingActionButton0.getLayoutParams();
            if(!this.p && !this.q || coordinatorLayout$LayoutParams0.getAnchorId() != view0.getId()) {
                return false;
            }
            LayoutParams coordinatorLayout$LayoutParams1 = (LayoutParams)extendedFloatingActionButton0.getLayoutParams();
            if(view0.getTop() < extendedFloatingActionButton0.getHeight() / 2 + coordinatorLayout$LayoutParams1.topMargin) {
                this.shrinkOrHide(extendedFloatingActionButton0);
                return true;
            }
            this.extendOrShow(extendedFloatingActionButton0);
            return true;
        }

        public void extendOrShow(@NonNull ExtendedFloatingActionButton extendedFloatingActionButton0) {
            extendedFloatingActionButton0.e((this.q ? 3 : 0), null);
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public boolean getInsetDodgeRect(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull Rect rect0) {
            return this.getInsetDodgeRect(coordinatorLayout0, ((ExtendedFloatingActionButton)view0), rect0);
        }

        public boolean getInsetDodgeRect(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton0, @NonNull Rect rect0) {
            return super.getInsetDodgeRect(coordinatorLayout0, extendedFloatingActionButton0, rect0);
        }

        public boolean isAutoHideEnabled() {
            return this.p;
        }

        public boolean isAutoShrinkEnabled() {
            return this.q;
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public void onAttachedToLayoutParams(@NonNull LayoutParams coordinatorLayout$LayoutParams0) {
            if(coordinatorLayout$LayoutParams0.dodgeInsetEdges == 0) {
                coordinatorLayout$LayoutParams0.dodgeInsetEdges = 80;
            }
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout0, @NonNull View view0, View view1) {
            return this.onDependentViewChanged(coordinatorLayout0, ((ExtendedFloatingActionButton)view0), view1);
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout0, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton0, View view0) {
            if(view0 instanceof AppBarLayout) {
                this.a(coordinatorLayout0, ((AppBarLayout)view0), extendedFloatingActionButton0);
                return false;
            }
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
            if((viewGroup$LayoutParams0 instanceof LayoutParams ? ((LayoutParams)viewGroup$LayoutParams0).getBehavior() instanceof BottomSheetBehavior : false)) {
                this.b(view0, extendedFloatingActionButton0);
            }
            return false;
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, int v) {
            return this.onLayoutChild(coordinatorLayout0, ((ExtendedFloatingActionButton)view0), v);
        }

        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton0, int v) {
            List list0 = coordinatorLayout0.getDependencies(extendedFloatingActionButton0);
            int v1 = list0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                View view0 = (View)list0.get(v2);
                if(!(view0 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
                    if(!(viewGroup$LayoutParams0 instanceof LayoutParams ? ((LayoutParams)viewGroup$LayoutParams0).getBehavior() instanceof BottomSheetBehavior : false) || !this.b(view0, extendedFloatingActionButton0)) {
                        continue;
                    }
                    break;
                }
                else if(this.a(coordinatorLayout0, ((AppBarLayout)view0), extendedFloatingActionButton0)) {
                    break;
                }
            }
            coordinatorLayout0.onLayoutChild(extendedFloatingActionButton0, v);
            return true;
        }

        public void setAutoHideEnabled(boolean z) {
            this.p = z;
        }

        public void setAutoShrinkEnabled(boolean z) {
            this.q = z;
        }

        public void shrinkOrHide(@NonNull ExtendedFloatingActionButton extendedFloatingActionButton0) {
            extendedFloatingActionButton0.e((this.q ? 2 : 1), null);
        }
    }

    public static abstract class OnChangedCallback {
        public void onExtended(ExtendedFloatingActionButton extendedFloatingActionButton0) {
        }

        public void onHidden(ExtendedFloatingActionButton extendedFloatingActionButton0) {
        }

        public void onShown(ExtendedFloatingActionButton extendedFloatingActionButton0) {
        }

        public void onShrunken(ExtendedFloatingActionButton extendedFloatingActionButton0) {
        }
    }

    interface Size {
        int getHeight();

        ViewGroup.LayoutParams getLayoutParams();

        int getPaddingEnd();

        int getPaddingStart();

        int getWidth();
    }

    public int A;
    public int B;
    public final ExtendedFloatingActionButtonBehavior C;
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public static final int I;
    public static final g J;
    public static final g K;
    public static final g L;
    public static final g M;
    @NonNull
    protected ColorStateList originalTextCsl;
    public int u;
    public final j v;
    public final j w;
    public final l x;
    public final k y;
    public final int z;

    static {
        ExtendedFloatingActionButton.I = style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;
        ExtendedFloatingActionButton.J = new g(16, "width", Float.class);
        ExtendedFloatingActionButton.K = new g(17, "height", Float.class);
        ExtendedFloatingActionButton.L = new g(18, "paddingStart", Float.class);
        ExtendedFloatingActionButton.M = new g(19, "paddingEnd", Float.class);
    }

    public ExtendedFloatingActionButton(@NonNull Context context0) {
        this(context0, null);
    }

    public ExtendedFloatingActionButton(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.extendedFloatingActionButtonStyle);
    }

    public ExtendedFloatingActionButton(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        int v1 = ExtendedFloatingActionButton.I;
        super(MaterialThemeOverlay.wrap(context0, attributeSet0, v, v1), attributeSet0, v);
        this.u = 0;
        f f0 = new f(14);
        l l0 = new l(this, f0);
        this.x = l0;
        k k0 = new k(this, f0);
        this.y = k0;
        this.D = true;
        this.E = false;
        this.F = false;
        Context context1 = this.getContext();
        this.C = new ExtendedFloatingActionButtonBehavior(context1, attributeSet0);
        TypedArray typedArray0 = ThemeEnforcement.obtainStyledAttributes(context1, attributeSet0, styleable.ExtendedFloatingActionButton, v, v1, new int[0]);
        MotionSpec motionSpec0 = MotionSpec.createFromAttribute(context1, typedArray0, styleable.ExtendedFloatingActionButton_showMotionSpec);
        MotionSpec motionSpec1 = MotionSpec.createFromAttribute(context1, typedArray0, styleable.ExtendedFloatingActionButton_hideMotionSpec);
        MotionSpec motionSpec2 = MotionSpec.createFromAttribute(context1, typedArray0, styleable.ExtendedFloatingActionButton_extendMotionSpec);
        MotionSpec motionSpec3 = MotionSpec.createFromAttribute(context1, typedArray0, styleable.ExtendedFloatingActionButton_shrinkMotionSpec);
        this.z = typedArray0.getDimensionPixelSize(styleable.ExtendedFloatingActionButton_collapsedSize, -1);
        int v2 = typedArray0.getInt(styleable.ExtendedFloatingActionButton_extendStrategy, 1);
        this.A = ViewCompat.getPaddingStart(this);
        this.B = ViewCompat.getPaddingEnd(this);
        f f1 = new f(14);
        com.google.android.material.floatingactionbutton.f f2 = new com.google.android.material.floatingactionbutton.f(this);
        com.google.android.material.floatingactionbutton.g g0 = new com.google.android.material.floatingactionbutton.g(this, f2);
        h h0 = new h(this, g0, f2);
        if(v2 != 1) {
            f2 = v2 == 2 ? g0 : h0;
        }
        j j0 = new j(this, f1, f2, true);
        this.w = j0;
        j j1 = new j(this, f1, new e(this), false);
        this.v = j1;
        l0.f = motionSpec0;
        k0.f = motionSpec1;
        j0.f = motionSpec2;
        j1.f = motionSpec3;
        typedArray0.recycle();
        this.setShapeAppearanceModel(ShapeAppearanceModel.builder(context1, attributeSet0, v, v1, ShapeAppearanceModel.PILL).build());
        this.originalTextCsl = this.getTextColors();
    }

    public void addOnExtendAnimationListener(@NonNull Animator.AnimatorListener animator$AnimatorListener0) {
        this.w.addAnimationListener(animator$AnimatorListener0);
    }

    public void addOnHideAnimationListener(@NonNull Animator.AnimatorListener animator$AnimatorListener0) {
        this.y.addAnimationListener(animator$AnimatorListener0);
    }

    public void addOnShowAnimationListener(@NonNull Animator.AnimatorListener animator$AnimatorListener0) {
        this.x.addAnimationListener(animator$AnimatorListener0);
    }

    public void addOnShrinkAnimationListener(@NonNull Animator.AnimatorListener animator$AnimatorListener0) {
        this.v.addAnimationListener(animator$AnimatorListener0);
    }

    public final void e(int v, OnChangedCallback extendedFloatingActionButton$OnChangedCallback0) {
        l l0;
        switch(v) {
            case 0: {
                l0 = this.x;
                break;
            }
            case 1: {
                l0 = this.y;
                break;
            }
            case 2: {
                l0 = this.v;
                break;
            }
            default: {
                if(v != 3) {
                    throw new IllegalStateException("Unknown strategy type: " + v);
                }
                l0 = this.w;
                break;
            }
        }
        if(l0.shouldCancel()) {
            return;
        }
        if((ViewCompat.isLaidOut(this) || !(this.getVisibility() == 0 ? this.u != 1 : this.u == 2) && this.F) && !this.isInEditMode()) {
            if(v == 2) {
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.getLayoutParams();
                if(viewGroup$LayoutParams0 == null) {
                    this.G = this.getWidth();
                    this.H = this.getHeight();
                }
                else {
                    this.G = viewGroup$LayoutParams0.width;
                    this.H = viewGroup$LayoutParams0.height;
                }
            }
            this.measure(0, 0);
            AnimatorSet animatorSet0 = l0.createAnimator();
            animatorSet0.addListener(new i(l0, extendedFloatingActionButton$OnChangedCallback0));
            for(Object object0: l0.c) {
                animatorSet0.addListener(((Animator.AnimatorListener)object0));
            }
            animatorSet0.start();
            return;
        }
        l0.performNow();
        l0.onChange(extendedFloatingActionButton$OnChangedCallback0);
    }

    public void extend() {
        this.e(3, null);
    }

    public void extend(@NonNull OnChangedCallback extendedFloatingActionButton$OnChangedCallback0) {
        this.e(3, extendedFloatingActionButton$OnChangedCallback0);
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$AttachedBehavior
    @NonNull
    public Behavior getBehavior() {
        return this.C;
    }

    public int getCollapsedPadding() {
        return (this.getCollapsedSize() - this.getIconSize()) / 2;
    }

    @VisibleForTesting
    public int getCollapsedSize() {
        return this.z >= 0 ? this.z : Math.min(ViewCompat.getPaddingStart(this), ViewCompat.getPaddingEnd(this)) * 2 + this.getIconSize();
    }

    @Nullable
    public MotionSpec getExtendMotionSpec() {
        return this.w.f;
    }

    @Nullable
    public MotionSpec getHideMotionSpec() {
        return this.y.f;
    }

    @Nullable
    public MotionSpec getShowMotionSpec() {
        return this.x.f;
    }

    @Nullable
    public MotionSpec getShrinkMotionSpec() {
        return this.v.f;
    }

    public void hide() {
        this.e(1, null);
    }

    public void hide(@NonNull OnChangedCallback extendedFloatingActionButton$OnChangedCallback0) {
        this.e(1, extendedFloatingActionButton$OnChangedCallback0);
    }

    public final boolean isExtended() {
        return this.D;
    }

    @Override  // com.google.android.material.button.MaterialButton
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if(this.D && TextUtils.isEmpty(this.getText()) && this.getIcon() != null) {
            this.D = false;
            this.v.performNow();
        }
    }

    public void removeOnExtendAnimationListener(@NonNull Animator.AnimatorListener animator$AnimatorListener0) {
        this.w.removeAnimationListener(animator$AnimatorListener0);
    }

    public void removeOnHideAnimationListener(@NonNull Animator.AnimatorListener animator$AnimatorListener0) {
        this.y.removeAnimationListener(animator$AnimatorListener0);
    }

    public void removeOnShowAnimationListener(@NonNull Animator.AnimatorListener animator$AnimatorListener0) {
        this.x.removeAnimationListener(animator$AnimatorListener0);
    }

    public void removeOnShrinkAnimationListener(@NonNull Animator.AnimatorListener animator$AnimatorListener0) {
        this.v.removeAnimationListener(animator$AnimatorListener0);
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        this.F = z;
    }

    public void setExtendMotionSpec(@Nullable MotionSpec motionSpec0) {
        this.w.f = motionSpec0;
    }

    public void setExtendMotionSpecResource(@AnimatorRes int v) {
        this.setExtendMotionSpec(MotionSpec.createFromResource(this.getContext(), v));
    }

    public void setExtended(boolean z) {
        if(this.D == z) {
            return;
        }
        j j0 = z ? this.w : this.v;
        if(j0.shouldCancel()) {
            return;
        }
        j0.performNow();
    }

    public void setHideMotionSpec(@Nullable MotionSpec motionSpec0) {
        this.y.f = motionSpec0;
    }

    public void setHideMotionSpecResource(@AnimatorRes int v) {
        this.setHideMotionSpec(MotionSpec.createFromResource(this.getContext(), v));
    }

    @Override  // android.widget.TextView
    public void setPadding(int v, int v1, int v2, int v3) {
        super.setPadding(v, v1, v2, v3);
        if(this.D && !this.E) {
            this.A = ViewCompat.getPaddingStart(this);
            this.B = ViewCompat.getPaddingEnd(this);
        }
    }

    @Override  // android.widget.TextView
    public void setPaddingRelative(int v, int v1, int v2, int v3) {
        super.setPaddingRelative(v, v1, v2, v3);
        if(this.D && !this.E) {
            this.A = v;
            this.B = v2;
        }
    }

    public void setShowMotionSpec(@Nullable MotionSpec motionSpec0) {
        this.x.f = motionSpec0;
    }

    public void setShowMotionSpecResource(@AnimatorRes int v) {
        this.setShowMotionSpec(MotionSpec.createFromResource(this.getContext(), v));
    }

    public void setShrinkMotionSpec(@Nullable MotionSpec motionSpec0) {
        this.v.f = motionSpec0;
    }

    public void setShrinkMotionSpecResource(@AnimatorRes int v) {
        this.setShrinkMotionSpec(MotionSpec.createFromResource(this.getContext(), v));
    }

    @Override  // android.widget.TextView
    public void setTextColor(int v) {
        super.setTextColor(v);
        this.originalTextCsl = this.getTextColors();
    }

    @Override  // android.widget.TextView
    public void setTextColor(@NonNull ColorStateList colorStateList0) {
        super.setTextColor(colorStateList0);
        this.originalTextCsl = this.getTextColors();
    }

    public void show() {
        this.e(0, null);
    }

    public void show(@NonNull OnChangedCallback extendedFloatingActionButton$OnChangedCallback0) {
        this.e(0, extendedFloatingActionButton$OnChangedCallback0);
    }

    public void shrink() {
        this.e(2, null);
    }

    public void shrink(@NonNull OnChangedCallback extendedFloatingActionButton$OnChangedCallback0) {
        this.e(2, extendedFloatingActionButton$OnChangedCallback0);
    }

    public void silentlyUpdateTextColor(@NonNull ColorStateList colorStateList0) {
        super.setTextColor(colorStateList0);
    }
}

