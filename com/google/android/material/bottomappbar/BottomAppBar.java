package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.w;
import com.google.android.material.R.animator;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior.OnScrollStateChangedListener;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class BottomAppBar extends Toolbar implements AttachedBehavior {
    interface AnimationListener {
        void onAnimationEnd(BottomAppBar arg1);

        void onAnimationStart(BottomAppBar arg1);
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior {
        public final Rect A;
        public WeakReference B;
        public int C;
        public final g D;

        public Behavior() {
            this.D = new g(this);
            this.A = new Rect();
        }

        public Behavior(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            this.D = new g(this);
            this.A = new Rect();
        }

        @Override  // com.google.android.material.behavior.HideBottomViewOnScrollBehavior
        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, int v) {
            return this.onLayoutChild(coordinatorLayout0, ((BottomAppBar)view0), v);
        }

        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull BottomAppBar bottomAppBar0, int v) {
            this.B = new WeakReference(bottomAppBar0);
            View view0 = bottomAppBar0.x();
            if(view0 != null && !ViewCompat.isLaidOut(view0)) {
                BottomAppBar.F(bottomAppBar0, view0);
                this.C = ((LayoutParams)view0.getLayoutParams()).bottomMargin;
                if(view0 instanceof FloatingActionButton) {
                    if(bottomAppBar0.j0 == 0 && bottomAppBar0.n0) {
                        ViewCompat.setElevation(((FloatingActionButton)view0), 0.0f);
                        ((FloatingActionButton)view0).setCompatElevation(0.0f);
                    }
                    if(((FloatingActionButton)view0).getShowMotionSpec() == null) {
                        ((FloatingActionButton)view0).setShowMotionSpecResource(animator.mtrl_fab_show_motion_spec);
                    }
                    if(((FloatingActionButton)view0).getHideMotionSpec() == null) {
                        ((FloatingActionButton)view0).setHideMotionSpecResource(animator.mtrl_fab_hide_motion_spec);
                    }
                    ((FloatingActionButton)view0).addOnHideAnimationListener(bottomAppBar0.z0);
                    ((FloatingActionButton)view0).addOnShowAnimationListener(new a(bottomAppBar0, 3));
                    ((FloatingActionButton)view0).addTransformationCallback(bottomAppBar0.A0);
                }
                view0.addOnLayoutChangeListener(this.D);
                bottomAppBar0.C();
            }
            coordinatorLayout0.onLayoutChild(bottomAppBar0, v);
            return super.onLayoutChild(coordinatorLayout0, bottomAppBar0, v);
        }

        @Override  // com.google.android.material.behavior.HideBottomViewOnScrollBehavior
        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1, @NonNull View view2, int v, int v1) {
            return this.onStartNestedScroll(coordinatorLayout0, ((BottomAppBar)view0), view1, view2, v, v1);
        }

        // 去混淆评级： 低(20)
        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull BottomAppBar bottomAppBar0, @NonNull View view0, @NonNull View view1, int v, int v1) {
            return bottomAppBar0.getHideOnScroll() && super.onStartNestedScroll(coordinatorLayout0, bottomAppBar0, view0, view1, v, v1);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FabAlignmentMode {
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface FabAnchorMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FabAnimationMode {
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface MenuAlignmentMode {
    }

    public final f A0;
    public static final int B0 = 0;
    public static final int C0 = 0;
    public static final int D0 = 0;
    public static final int FAB_ALIGNMENT_MODE_CENTER = 0;
    public static final int FAB_ALIGNMENT_MODE_END = 1;
    public static final int FAB_ANCHOR_MODE_CRADLE = 1;
    public static final int FAB_ANCHOR_MODE_EMBED = 0;
    public static final int FAB_ANIMATION_MODE_SCALE = 0;
    public static final int FAB_ANIMATION_MODE_SLIDE = 1;
    public static final int MENU_ALIGNMENT_MODE_AUTO = 0;
    public static final int MENU_ALIGNMENT_MODE_START = 1;
    public Integer d0;
    public final MaterialShapeDrawable e0;
    public AnimatorSet f0;
    public AnimatorSet g0;
    public int h0;
    public int i0;
    public int j0;
    public final int k0;
    public int l0;
    public int m0;
    public final boolean n0;
    public boolean o0;
    public final boolean p0;
    public final boolean q0;
    public final boolean r0;
    public int s0;
    public boolean t0;
    public boolean u0;
    public Behavior v0;
    public int w0;
    public int x0;
    public int y0;
    public final a z0;

    static {
        BottomAppBar.B0 = style.Widget_MaterialComponents_BottomAppBar;
        BottomAppBar.C0 = attr.motionDurationLong2;
        BottomAppBar.D0 = attr.motionEasingEmphasizedInterpolator;
    }

    public BottomAppBar(@NonNull Context context0) {
        this(context0, null);
    }

    public BottomAppBar(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.bottomAppBarStyle);
    }

    public BottomAppBar(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        int v1 = BottomAppBar.B0;
        super(MaterialThemeOverlay.wrap(context0, attributeSet0, v, v1), attributeSet0, v);
        MaterialShapeDrawable materialShapeDrawable0 = new MaterialShapeDrawable();
        this.e0 = materialShapeDrawable0;
        this.s0 = 0;
        this.t0 = false;
        this.u0 = true;
        this.z0 = new a(this, 0);
        this.A0 = new f(this, 13);
        Context context1 = this.getContext();
        TypedArray typedArray0 = ThemeEnforcement.obtainStyledAttributes(context1, attributeSet0, styleable.BottomAppBar, v, v1, new int[0]);
        ColorStateList colorStateList0 = MaterialResources.getColorStateList(context1, typedArray0, styleable.BottomAppBar_backgroundTint);
        if(typedArray0.hasValue(styleable.BottomAppBar_navigationIconTint)) {
            this.setNavigationIconTint(typedArray0.getColor(styleable.BottomAppBar_navigationIconTint, -1));
        }
        int v2 = typedArray0.getDimensionPixelSize(styleable.BottomAppBar_elevation, 0);
        float f = (float)typedArray0.getDimensionPixelOffset(styleable.BottomAppBar_fabCradleMargin, 0);
        float f1 = (float)typedArray0.getDimensionPixelOffset(styleable.BottomAppBar_fabCradleRoundedCornerRadius, 0);
        float f2 = (float)typedArray0.getDimensionPixelOffset(styleable.BottomAppBar_fabCradleVerticalOffset, 0);
        this.h0 = typedArray0.getInt(styleable.BottomAppBar_fabAlignmentMode, 0);
        this.i0 = typedArray0.getInt(styleable.BottomAppBar_fabAnimationMode, 0);
        this.j0 = typedArray0.getInt(styleable.BottomAppBar_fabAnchorMode, 1);
        this.n0 = typedArray0.getBoolean(styleable.BottomAppBar_removeEmbeddedFabElevation, true);
        this.m0 = typedArray0.getInt(styleable.BottomAppBar_menuAlignmentMode, 0);
        this.o0 = typedArray0.getBoolean(styleable.BottomAppBar_hideOnScroll, false);
        this.p0 = typedArray0.getBoolean(styleable.BottomAppBar_paddingBottomSystemWindowInsets, false);
        this.q0 = typedArray0.getBoolean(styleable.BottomAppBar_paddingLeftSystemWindowInsets, false);
        this.r0 = typedArray0.getBoolean(styleable.BottomAppBar_paddingRightSystemWindowInsets, false);
        this.l0 = typedArray0.getDimensionPixelOffset(styleable.BottomAppBar_fabAlignmentModeEndMargin, -1);
        boolean z = typedArray0.getBoolean(styleable.BottomAppBar_addElevationShadow, true);
        typedArray0.recycle();
        this.k0 = this.getResources().getDimensionPixelOffset(dimen.mtrl_bottomappbar_fabOffsetEndMode);
        BottomAppBarTopEdgeTreatment bottomAppBarTopEdgeTreatment0 = new BottomAppBarTopEdgeTreatment(f, f1, f2);
        materialShapeDrawable0.setShapeAppearanceModel(ShapeAppearanceModel.builder().setTopEdge(bottomAppBarTopEdgeTreatment0).build());
        if(z) {
            materialShapeDrawable0.setShadowCompatibilityMode(2);
        }
        else {
            materialShapeDrawable0.setShadowCompatibilityMode(1);
            if(Build.VERSION.SDK_INT >= 28) {
                androidx.work.impl.background.systemjob.a.x(this);
                androidx.work.impl.background.systemjob.a.C(this);
            }
        }
        materialShapeDrawable0.setPaintStyle(Paint.Style.FILL);
        materialShapeDrawable0.initializeElevationOverlay(context1);
        this.setElevation(((float)v2));
        DrawableCompat.setTintList(materialShapeDrawable0, colorStateList0);
        ViewCompat.setBackground(this, materialShapeDrawable0);
        ViewUtils.doOnApplyWindowInsets(this, attributeSet0, v, v1, new b(this));
    }

    public final void A(int v, boolean z) {
        if(!ViewCompat.isLaidOut(this)) {
            this.t0 = false;
            this.replaceMenu(this.s0);
            return;
        }
        AnimatorSet animatorSet0 = this.g0;
        if(animatorSet0 != null) {
            animatorSet0.cancel();
        }
        ArrayList arrayList0 = new ArrayList();
        if(!this.z()) {
            v = 0;
            z = false;
        }
        ActionMenuView actionMenuView0 = this.getActionMenuView();
        if(actionMenuView0 != null) {
            float f = (float)this.getFabAlignmentAnimationDuration();
            ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(actionMenuView0, "alpha", new float[]{1.0f});
            objectAnimator0.setDuration(((long)(0.8f * f)));
            if(Math.abs(actionMenuView0.getTranslationX() - ((float)this.getActionMenuViewTranslationX(actionMenuView0, v, z))) > 1.0f) {
                ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(actionMenuView0, "alpha", new float[]{0.0f});
                objectAnimator1.setDuration(((long)(f * 0.2f)));
                objectAnimator1.addListener(new e(this, actionMenuView0, v, z));
                AnimatorSet animatorSet1 = new AnimatorSet();
                animatorSet1.playSequentially(new Animator[]{objectAnimator1, objectAnimator0});
                arrayList0.add(animatorSet1);
            }
            else if(actionMenuView0.getAlpha() < 1.0f) {
                arrayList0.add(objectAnimator0);
            }
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(arrayList0);
        this.g0 = animatorSet2;
        animatorSet2.addListener(new a(this, 2));
        this.g0.start();
    }

    public final void B() {
        ActionMenuView actionMenuView0 = this.getActionMenuView();
        if(actionMenuView0 != null && this.g0 == null) {
            actionMenuView0.setAlpha(1.0f);
            if(!this.z()) {
                this.E(actionMenuView0, 0, false, false);
                return;
            }
            this.E(actionMenuView0, this.h0, this.u0, false);
        }
    }

    public final void C() {
        BottomAppBarTopEdgeTreatment bottomAppBarTopEdgeTreatment0 = this.getTopEdgeTreatment();
        bottomAppBarTopEdgeTreatment0.e = this.getFabTranslationX();
        float f = !this.u0 || !this.z() || this.j0 != 1 ? 0.0f : 1.0f;
        this.e0.setInterpolation(f);
        View view0 = this.x();
        if(view0 != null) {
            view0.setTranslationY(this.getFabTranslationY());
            view0.setTranslationX(this.getFabTranslationX());
        }
    }

    public final void D(int v) {
        if(((float)v) != this.getTopEdgeTreatment().getFabDiameter()) {
            this.getTopEdgeTreatment().setFabDiameter(((float)v));
            this.e0.invalidateSelf();
        }
    }

    public final void E(ActionMenuView actionMenuView0, int v, boolean z, boolean z1) {
        com.google.android.material.bottomappbar.f f0 = new com.google.android.material.bottomappbar.f(this, actionMenuView0, v, z);
        if(z1) {
            actionMenuView0.post(f0);
            return;
        }
        f0.run();
    }

    public static void F(BottomAppBar bottomAppBar0, View view0) {
        LayoutParams coordinatorLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        coordinatorLayout$LayoutParams0.anchorGravity = 17;
        int v = bottomAppBar0.j0;
        if(v == 1) {
            coordinatorLayout$LayoutParams0.anchorGravity = 49;
        }
        if(v == 0) {
            coordinatorLayout$LayoutParams0.anchorGravity |= 80;
        }
    }

    public void addOnScrollStateChangedListener(@NonNull OnScrollStateChangedListener hideBottomViewOnScrollBehavior$OnScrollStateChangedListener0) {
        this.getBehavior().addOnScrollStateChangedListener(hideBottomViewOnScrollBehavior$OnScrollStateChangedListener0);
    }

    public void clearOnScrollStateChangedListeners() {
        this.getBehavior().clearOnScrollStateChangedListeners();
    }

    public void createFabDefaultXAnimation(int v, List list0) {
        FloatingActionButton floatingActionButton0 = this.w();
        if(floatingActionButton0 != null && !floatingActionButton0.isOrWillBeHidden()) {
            floatingActionButton0.hide(new d(this, v));
        }
    }

    @Nullable
    private ActionMenuView getActionMenuView() {
        for(int v = 0; v < this.getChildCount(); ++v) {
            View view0 = this.getChildAt(v);
            if(view0 instanceof ActionMenuView) {
                return (ActionMenuView)view0;
            }
        }
        return null;
    }

    public int getActionMenuViewTranslationX(@NonNull ActionMenuView actionMenuView0, int v, boolean z) {
        int v1 = 0;
        if(this.m0 != 1 && (v != 1 || !z)) {
            return 0;
        }
        boolean z1 = ViewUtils.isLayoutRtl(this);
        int v2 = z1 ? this.getMeasuredWidth() : 0;
        for(int v3 = 0; v3 < this.getChildCount(); ++v3) {
            View view0 = this.getChildAt(v3);
            if(view0.getLayoutParams() instanceof androidx.appcompat.widget.Toolbar.LayoutParams && (((androidx.appcompat.widget.Toolbar.LayoutParams)view0.getLayoutParams()).gravity & 0x800007) == 0x800003) {
                v2 = z1 ? Math.min(v2, view0.getLeft()) : Math.max(v2, view0.getRight());
            }
        }
        int v4 = z1 ? actionMenuView0.getRight() : actionMenuView0.getLeft();
        int v5 = z1 ? this.x0 : -this.y0;
        if(this.getNavigationIcon() == null) {
            v1 = this.getResources().getDimensionPixelOffset(dimen.m3_bottomappbar_horizontal_padding);
            if(!z1) {
                v1 = -v1;
            }
        }
        return v2 - (v4 + v5 + v1);
    }

    @Nullable
    public ColorStateList getBackgroundTint() {
        return this.e0.getTintList();
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$AttachedBehavior
    @NonNull
    public androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior getBehavior() {
        return this.getBehavior();
    }

    @NonNull
    public Behavior getBehavior() {
        if(this.v0 == null) {
            this.v0 = new Behavior();
        }
        return this.v0;
    }

    private int getBottomInset() {
        return this.w0;
    }

    @Dimension
    public float getCradleVerticalOffset() {
        return this.getTopEdgeTreatment().d;
    }

    private int getFabAlignmentAnimationDuration() {
        return MotionUtils.resolveThemeDuration(this.getContext(), BottomAppBar.C0, 300);
    }

    public int getFabAlignmentMode() {
        return this.h0;
    }

    @Px
    public int getFabAlignmentModeEndMargin() {
        return this.l0;
    }

    public int getFabAnchorMode() {
        return this.j0;
    }

    public int getFabAnimationMode() {
        return this.i0;
    }

    public float getFabCradleMargin() {
        return this.getTopEdgeTreatment().b;
    }

    @Dimension
    public float getFabCradleRoundedCornerRadius() {
        return this.getTopEdgeTreatment().a;
    }

    private float getFabTranslationX() {
        return this.y(this.h0);
    }

    private float getFabTranslationY() {
        if(this.j0 == 1) {
            return -this.getTopEdgeTreatment().d;
        }
        View view0 = this.x();
        return view0 == null ? 0.0f : ((float)(-(this.getMeasuredHeight() + this.getBottomInset() - view0.getMeasuredHeight()) / 2));
    }

    public boolean getHideOnScroll() {
        return this.o0;
    }

    private int getLeftInset() {
        return this.y0;
    }

    public int getMenuAlignmentMode() {
        return this.m0;
    }

    private int getRightInset() {
        return this.x0;
    }

    @NonNull
    private BottomAppBarTopEdgeTreatment getTopEdgeTreatment() {
        return (BottomAppBarTopEdgeTreatment)this.e0.getShapeAppearanceModel().getTopEdge();
    }

    public boolean isScrolledDown() {
        return this.getBehavior().isScrolledDown();
    }

    public boolean isScrolledUp() {
        return this.getBehavior().isScrolledUp();
    }

    @Override  // androidx.appcompat.widget.Toolbar
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this, this.e0);
        if(this.getParent() instanceof ViewGroup) {
            ((ViewGroup)this.getParent()).setClipChildren(false);
        }
    }

    @Override  // androidx.appcompat.widget.Toolbar
    public void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        if(z) {
            AnimatorSet animatorSet0 = this.g0;
            if(animatorSet0 != null) {
                animatorSet0.cancel();
            }
            AnimatorSet animatorSet1 = this.f0;
            if(animatorSet1 != null) {
                animatorSet1.cancel();
            }
            this.C();
            View view0 = this.x();
            if(view0 != null && ViewCompat.isLaidOut(view0)) {
                view0.post(new w(1, view0));
            }
        }
        this.B();
    }

    @Override  // androidx.appcompat.widget.Toolbar
    public void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof h)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((h)parcelable0).getSuperState());
        this.h0 = ((h)parcelable0).b;
        this.u0 = ((h)parcelable0).c;
    }

    @Override  // androidx.appcompat.widget.Toolbar
    @NonNull
    public Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new h(super.onSaveInstanceState());  // 初始化器: Landroidx/customview/view/AbsSavedState;-><init>(Landroid/os/Parcelable;)V
        parcelable0.b = this.h0;
        parcelable0.c = this.u0;
        return parcelable0;
    }

    public void performHide() {
        this.performHide(true);
    }

    public void performHide(boolean z) {
        this.getBehavior().slideDown(this, z);
    }

    public void performShow() {
        this.performShow(true);
    }

    public void performShow(boolean z) {
        this.getBehavior().slideUp(this, z);
    }

    public void removeOnScrollStateChangedListener(@NonNull OnScrollStateChangedListener hideBottomViewOnScrollBehavior$OnScrollStateChangedListener0) {
        this.getBehavior().removeOnScrollStateChangedListener(hideBottomViewOnScrollBehavior$OnScrollStateChangedListener0);
    }

    public void replaceMenu(@MenuRes int v) {
        if(v != 0) {
            this.s0 = 0;
            this.getMenu().clear();
            this.inflateMenu(v);
        }
    }

    public void setBackgroundTint(@Nullable ColorStateList colorStateList0) {
        DrawableCompat.setTintList(this.e0, colorStateList0);
    }

    public void setCradleVerticalOffset(@Dimension float f) {
        if(f != this.getCradleVerticalOffset()) {
            this.getTopEdgeTreatment().b(f);
            this.e0.invalidateSelf();
            this.C();
        }
    }

    @Override  // android.view.View
    public void setElevation(float f) {
        this.e0.setElevation(f);
        this.getBehavior().setAdditionalHiddenOffsetY(this, this.e0.getShadowRadius() - this.e0.getShadowOffsetY());
    }

    public void setFabAlignmentMode(int v) {
        this.setFabAlignmentModeAndReplaceMenu(v, 0);
    }

    public void setFabAlignmentModeAndReplaceMenu(int v, @MenuRes int v1) {
        this.s0 = v1;
        this.t0 = true;
        this.A(v, this.u0);
        if(this.h0 != v && ViewCompat.isLaidOut(this)) {
            AnimatorSet animatorSet0 = this.f0;
            if(animatorSet0 != null) {
                animatorSet0.cancel();
            }
            ArrayList arrayList0 = new ArrayList();
            if(this.i0 == 1) {
                ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this.w(), "translationX", new float[]{this.y(v)});
                objectAnimator0.setDuration(((long)this.getFabAlignmentAnimationDuration()));
                arrayList0.add(objectAnimator0);
            }
            else {
                this.createFabDefaultXAnimation(v, arrayList0);
            }
            AnimatorSet animatorSet1 = new AnimatorSet();
            animatorSet1.playTogether(arrayList0);
            animatorSet1.setInterpolator(MotionUtils.resolveThemeInterpolator(this.getContext(), BottomAppBar.D0, AnimationUtils.LINEAR_INTERPOLATOR));
            this.f0 = animatorSet1;
            animatorSet1.addListener(new a(this, 1));
            this.f0.start();
        }
        this.h0 = v;
    }

    public void setFabAlignmentModeEndMargin(@Px int v) {
        if(this.l0 != v) {
            this.l0 = v;
            this.C();
        }
    }

    public void setFabAnchorMode(int v) {
        this.j0 = v;
        this.C();
        View view0 = this.x();
        if(view0 != null) {
            BottomAppBar.F(this, view0);
            view0.requestLayout();
            this.e0.invalidateSelf();
        }
    }

    public void setFabAnimationMode(int v) {
        this.i0 = v;
    }

    public void setFabCornerSize(@Dimension float f) {
        if(f != this.getTopEdgeTreatment().getFabCornerRadius()) {
            this.getTopEdgeTreatment().setFabCornerSize(f);
            this.e0.invalidateSelf();
        }
    }

    public void setFabCradleMargin(@Dimension float f) {
        if(f != this.getFabCradleMargin()) {
            this.getTopEdgeTreatment().b = f;
            this.e0.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(@Dimension float f) {
        if(f != this.getFabCradleRoundedCornerRadius()) {
            this.getTopEdgeTreatment().a = f;
            this.e0.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.o0 = z;
    }

    public void setMenuAlignmentMode(int v) {
        if(this.m0 != v) {
            this.m0 = v;
            ActionMenuView actionMenuView0 = this.getActionMenuView();
            if(actionMenuView0 != null) {
                this.E(actionMenuView0, this.h0, this.z(), false);
            }
        }
    }

    @Override  // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@Nullable Drawable drawable0) {
        if(drawable0 != null && this.d0 != null) {
            drawable0 = DrawableCompat.wrap(drawable0.mutate());
            DrawableCompat.setTint(drawable0, ((int)this.d0));
        }
        super.setNavigationIcon(drawable0);
    }

    public void setNavigationIconTint(@ColorInt int v) {
        this.d0 = v;
        Drawable drawable0 = this.getNavigationIcon();
        if(drawable0 != null) {
            this.setNavigationIcon(drawable0);
        }
    }

    @Override  // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence0) {
    }

    @Override  // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence0) {
    }

    public final FloatingActionButton w() {
        View view0 = this.x();
        return view0 instanceof FloatingActionButton ? ((FloatingActionButton)view0) : null;
    }

    public final View x() {
        if(!(this.getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for(Object object0: ((CoordinatorLayout)this.getParent()).getDependents(this)) {
            View view0 = (View)object0;
            if(view0 instanceof FloatingActionButton || view0 instanceof ExtendedFloatingActionButton) {
                return view0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public final float y(int v) {
        boolean z = ViewUtils.isLayoutRtl(this);
        int v1 = 1;
        if(v == 1) {
            View view0 = this.x();
            int v2 = z ? this.y0 : this.x0;
            int v3 = this.l0 == -1 || view0 == null ? this.k0 + v2 : view0.getMeasuredWidth() / 2 + this.l0 + v2;
            int v4 = this.getMeasuredWidth();
            if(z) {
                v1 = -1;
            }
            return (float)((v4 / 2 - v3) * v1);
        }
        return 0.0f;
    }

    public final boolean z() {
        FloatingActionButton floatingActionButton0 = this.w();
        return floatingActionButton0 != null && floatingActionButton0.isOrWillBeShown();
    }
}

