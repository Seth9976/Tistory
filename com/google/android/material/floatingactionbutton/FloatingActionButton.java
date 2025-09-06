package com.google.android.material.floatingactionbutton;

import android.animation.Animator.AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.widget.ImageView.ScaleType;
import androidx.annotation.AnimatorRes;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatImageHelper;
import androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.TintableBackgroundView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TintableImageSourceView;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.animation.TransformationCallback;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.expandable.ExpandableTransformationWidget;
import com.google.android.material.expandable.ExpandableWidgetHelper;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.stateful.ExtendableSavedState;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

public class FloatingActionButton extends VisibilityAwareImageButton implements AttachedBehavior, TintableBackgroundView, TintableImageSourceView, ExpandableTransformationWidget, Shapeable {
    public static class BaseBehavior extends Behavior {
        public Rect o;
        public OnVisibilityChangedListener p;
        public boolean q;

        public BaseBehavior() {
            this.q = true;
        }

        public BaseBehavior(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.FloatingActionButton_Behavior_Layout);
            this.q = typedArray0.getBoolean(styleable.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            typedArray0.recycle();
        }

        public final boolean a(CoordinatorLayout coordinatorLayout0, AppBarLayout appBarLayout0, FloatingActionButton floatingActionButton0) {
            boolean z;
            LayoutParams coordinatorLayout$LayoutParams0 = (LayoutParams)floatingActionButton0.getLayoutParams();
            if(!this.q) {
                z = false;
            }
            else if(coordinatorLayout$LayoutParams0.getAnchorId() == appBarLayout0.getId() && floatingActionButton0.getUserSetVisibility() == 0) {
                z = true;
            }
            else {
                z = false;
            }
            if(!z) {
                return false;
            }
            if(this.o == null) {
                this.o = new Rect();
            }
            Rect rect0 = this.o;
            DescendantOffsetUtils.getDescendantRect(coordinatorLayout0, appBarLayout0, rect0);
            if(rect0.bottom <= appBarLayout0.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton0.c(this.p, false);
                return true;
            }
            floatingActionButton0.f(this.p, false);
            return true;
        }

        public final boolean b(View view0, FloatingActionButton floatingActionButton0) {
            boolean z;
            LayoutParams coordinatorLayout$LayoutParams0 = (LayoutParams)floatingActionButton0.getLayoutParams();
            if(!this.q) {
                z = false;
            }
            else if(coordinatorLayout$LayoutParams0.getAnchorId() == view0.getId() && floatingActionButton0.getUserSetVisibility() == 0) {
                z = true;
            }
            else {
                z = false;
            }
            if(!z) {
                return false;
            }
            LayoutParams coordinatorLayout$LayoutParams1 = (LayoutParams)floatingActionButton0.getLayoutParams();
            if(view0.getTop() < floatingActionButton0.getHeight() / 2 + coordinatorLayout$LayoutParams1.topMargin) {
                floatingActionButton0.c(this.p, false);
                return true;
            }
            floatingActionButton0.f(this.p, false);
            return true;
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public boolean getInsetDodgeRect(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull Rect rect0) {
            return this.getInsetDodgeRect(coordinatorLayout0, ((FloatingActionButton)view0), rect0);
        }

        public boolean getInsetDodgeRect(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull FloatingActionButton floatingActionButton0, @NonNull Rect rect0) {
            rect0.set(floatingActionButton0.getLeft() + floatingActionButton0.l.left, floatingActionButton0.getTop() + floatingActionButton0.l.top, floatingActionButton0.getRight() - floatingActionButton0.l.right, floatingActionButton0.getBottom() - floatingActionButton0.l.bottom);
            return true;
        }

        public boolean isAutoHideEnabled() {
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
            return this.onDependentViewChanged(coordinatorLayout0, ((FloatingActionButton)view0), view1);
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout0, @NonNull FloatingActionButton floatingActionButton0, View view0) {
            if(view0 instanceof AppBarLayout) {
                this.a(coordinatorLayout0, ((AppBarLayout)view0), floatingActionButton0);
                return false;
            }
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
            if((viewGroup$LayoutParams0 instanceof LayoutParams ? ((LayoutParams)viewGroup$LayoutParams0).getBehavior() instanceof BottomSheetBehavior : false)) {
                this.b(view0, floatingActionButton0);
            }
            return false;
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, int v) {
            return this.onLayoutChild(coordinatorLayout0, ((FloatingActionButton)view0), v);
        }

        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull FloatingActionButton floatingActionButton0, int v) {
            int v4;
            List list0 = coordinatorLayout0.getDependencies(floatingActionButton0);
            int v1 = list0.size();
            int v2 = 0;
            for(int v3 = 0; v3 < v1; ++v3) {
                View view0 = (View)list0.get(v3);
                if(!(view0 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
                    if(!(viewGroup$LayoutParams0 instanceof LayoutParams ? ((LayoutParams)viewGroup$LayoutParams0).getBehavior() instanceof BottomSheetBehavior : false) || !this.b(view0, floatingActionButton0)) {
                        continue;
                    }
                    break;
                }
                else if(this.a(coordinatorLayout0, ((AppBarLayout)view0), floatingActionButton0)) {
                    break;
                }
            }
            coordinatorLayout0.onLayoutChild(floatingActionButton0, v);
            Rect rect0 = floatingActionButton0.l;
            if(rect0 != null && rect0.centerX() > 0 && rect0.centerY() > 0) {
                LayoutParams coordinatorLayout$LayoutParams0 = (LayoutParams)floatingActionButton0.getLayoutParams();
                if(floatingActionButton0.getRight() >= coordinatorLayout0.getWidth() - coordinatorLayout$LayoutParams0.rightMargin) {
                    v4 = rect0.right;
                }
                else {
                    v4 = floatingActionButton0.getLeft() > coordinatorLayout$LayoutParams0.leftMargin ? 0 : -rect0.left;
                }
                if(floatingActionButton0.getBottom() >= coordinatorLayout0.getHeight() - coordinatorLayout$LayoutParams0.bottomMargin) {
                    v2 = rect0.bottom;
                }
                else if(floatingActionButton0.getTop() <= coordinatorLayout$LayoutParams0.topMargin) {
                    v2 = -rect0.top;
                }
                if(v2 != 0) {
                    ViewCompat.offsetTopAndBottom(floatingActionButton0, v2);
                }
                if(v4 != 0) {
                    ViewCompat.offsetLeftAndRight(floatingActionButton0, v4);
                }
            }
            return true;
        }

        public void setAutoHideEnabled(boolean z) {
            this.q = z;
        }

        @VisibleForTesting
        public void setInternalAutoHideListener(OnVisibilityChangedListener floatingActionButton$OnVisibilityChangedListener0) {
            this.p = floatingActionButton$OnVisibilityChangedListener0;
        }
    }

    public static class com.google.android.material.floatingactionbutton.FloatingActionButton.Behavior extends BaseBehavior {
        public com.google.android.material.floatingactionbutton.FloatingActionButton.Behavior() {
        }

        public com.google.android.material.floatingactionbutton.FloatingActionButton.Behavior(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
        }

        @Override  // com.google.android.material.floatingactionbutton.FloatingActionButton$BaseBehavior
        public boolean getInsetDodgeRect(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull FloatingActionButton floatingActionButton0, @NonNull Rect rect0) {
            return super.getInsetDodgeRect(coordinatorLayout0, floatingActionButton0, rect0);
        }

        @Override  // com.google.android.material.floatingactionbutton.FloatingActionButton$BaseBehavior
        public boolean isAutoHideEnabled() {
            return super.isAutoHideEnabled();
        }

        @Override  // com.google.android.material.floatingactionbutton.FloatingActionButton$BaseBehavior
        public void onAttachedToLayoutParams(@NonNull LayoutParams coordinatorLayout$LayoutParams0) {
            super.onAttachedToLayoutParams(coordinatorLayout$LayoutParams0);
        }

        @Override  // com.google.android.material.floatingactionbutton.FloatingActionButton$BaseBehavior
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout0, @NonNull FloatingActionButton floatingActionButton0, View view0) {
            return super.onDependentViewChanged(coordinatorLayout0, floatingActionButton0, view0);
        }

        @Override  // com.google.android.material.floatingactionbutton.FloatingActionButton$BaseBehavior
        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull FloatingActionButton floatingActionButton0, int v) {
            return super.onLayoutChild(coordinatorLayout0, floatingActionButton0, v);
        }

        @Override  // com.google.android.material.floatingactionbutton.FloatingActionButton$BaseBehavior
        public void setAutoHideEnabled(boolean z) {
            super.setAutoHideEnabled(z);
        }

        @Override  // com.google.android.material.floatingactionbutton.FloatingActionButton$BaseBehavior
        @VisibleForTesting
        public void setInternalAutoHideListener(OnVisibilityChangedListener floatingActionButton$OnVisibilityChangedListener0) {
            super.setInternalAutoHideListener(floatingActionButton$OnVisibilityChangedListener0);
        }
    }

    public static abstract class OnVisibilityChangedListener {
        public void onHidden(FloatingActionButton floatingActionButton0) {
        }

        public void onShown(FloatingActionButton floatingActionButton0) {
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Size {
    }

    public static final int NO_CUSTOM_SIZE = 0;
    public static final int SIZE_AUTO = -1;
    public static final int SIZE_MINI = 1;
    public static final int SIZE_NORMAL;
    public ColorStateList b;
    public PorterDuff.Mode c;
    public ColorStateList d;
    public PorterDuff.Mode e;
    public ColorStateList f;
    public int g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public final Rect l;
    public final Rect m;
    public final AppCompatImageHelper n;
    public final ExpandableWidgetHelper o;
    public z p;
    public static final int q;

    static {
        FloatingActionButton.q = style.Widget_Design_FloatingActionButton;
    }

    public FloatingActionButton(@NonNull Context context0) {
        this(context0, null);
    }

    public FloatingActionButton(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.floatingActionButtonStyle);
    }

    public FloatingActionButton(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(MaterialThemeOverlay.wrap(context0, attributeSet0, v, FloatingActionButton.q), attributeSet0, v);
        this.l = new Rect();
        this.m = new Rect();
        Context context1 = this.getContext();
        TypedArray typedArray0 = ThemeEnforcement.obtainStyledAttributes(context1, attributeSet0, styleable.FloatingActionButton, v, FloatingActionButton.q, new int[0]);
        this.b = MaterialResources.getColorStateList(context1, typedArray0, styleable.FloatingActionButton_backgroundTint);
        this.c = ViewUtils.parseTintMode(typedArray0.getInt(styleable.FloatingActionButton_backgroundTintMode, -1), null);
        this.f = MaterialResources.getColorStateList(context1, typedArray0, styleable.FloatingActionButton_rippleColor);
        this.g = typedArray0.getInt(styleable.FloatingActionButton_fabSize, -1);
        this.h = typedArray0.getDimensionPixelSize(styleable.FloatingActionButton_fabCustomSize, 0);
        int v1 = typedArray0.getDimensionPixelSize(styleable.FloatingActionButton_borderWidth, 0);
        float f = typedArray0.getDimension(styleable.FloatingActionButton_elevation, 0.0f);
        float f1 = typedArray0.getDimension(styleable.FloatingActionButton_hoveredFocusedTranslationZ, 0.0f);
        float f2 = typedArray0.getDimension(styleable.FloatingActionButton_pressedTranslationZ, 0.0f);
        this.k = typedArray0.getBoolean(styleable.FloatingActionButton_useCompatPadding, false);
        int v2 = this.getResources().getDimensionPixelSize(dimen.mtrl_fab_min_touch_target);
        this.setMaxImageSize(typedArray0.getDimensionPixelSize(styleable.FloatingActionButton_maxImageSize, 0));
        MotionSpec motionSpec0 = MotionSpec.createFromAttribute(context1, typedArray0, styleable.FloatingActionButton_showMotionSpec);
        MotionSpec motionSpec1 = MotionSpec.createFromAttribute(context1, typedArray0, styleable.FloatingActionButton_hideMotionSpec);
        ShapeAppearanceModel shapeAppearanceModel0 = ShapeAppearanceModel.builder(context1, attributeSet0, v, FloatingActionButton.q, ShapeAppearanceModel.PILL).build();
        boolean z = typedArray0.getBoolean(styleable.FloatingActionButton_ensureMinTouchTargetSize, false);
        this.setEnabled(typedArray0.getBoolean(styleable.FloatingActionButton_android_enabled, true));
        typedArray0.recycle();
        AppCompatImageHelper appCompatImageHelper0 = new AppCompatImageHelper(this);
        this.n = appCompatImageHelper0;
        appCompatImageHelper0.loadFromAttributes(attributeSet0, v);
        this.o = new ExpandableWidgetHelper(this);
        this.getImpl().n(shapeAppearanceModel0);
        this.getImpl().g(this.b, this.c, this.f, v1);
        this.getImpl().k = v2;
        x x0 = this.getImpl();
        if(x0.h != f) {
            x0.h = f;
            x0.k(f, x0.i, x0.j);
        }
        x x1 = this.getImpl();
        if(x1.i != f1) {
            x1.i = f1;
            x1.k(x1.h, f1, x1.j);
        }
        x x2 = this.getImpl();
        if(x2.j != f2) {
            x2.j = f2;
            x2.k(x2.h, x2.i, f2);
        }
        this.getImpl().m = motionSpec0;
        this.getImpl().n = motionSpec1;
        this.getImpl().f = z;
        this.setScaleType(ImageView.ScaleType.MATRIX);
    }

    public void addOnHideAnimationListener(@NonNull Animator.AnimatorListener animator$AnimatorListener0) {
        x x0 = this.getImpl();
        if(x0.t == null) {
            x0.t = new ArrayList();
        }
        x0.t.add(animator$AnimatorListener0);
    }

    public void addOnShowAnimationListener(@NonNull Animator.AnimatorListener animator$AnimatorListener0) {
        x x0 = this.getImpl();
        if(x0.s == null) {
            x0.s = new ArrayList();
        }
        x0.s.add(animator$AnimatorListener0);
    }

    public void addTransformationCallback(@NonNull TransformationCallback transformationCallback0) {
        x x0 = this.getImpl();
        n n0 = new n(this, transformationCallback0);
        if(x0.u == null) {
            x0.u = new ArrayList();
        }
        x0.u.add(n0);
    }

    public final int b(int v) {
        int v1 = this.h;
        if(v1 != 0) {
            return v1;
        }
        Resources resources0 = this.getResources();
        switch(v) {
            case -1: {
                return Math.max(resources0.getConfiguration().screenWidthDp, resources0.getConfiguration().screenHeightDp) >= 470 ? this.b(0) : this.b(1);
            }
            case 1: {
                return resources0.getDimensionPixelSize(dimen.design_fab_size_mini);
            }
            default: {
                return resources0.getDimensionPixelSize(dimen.design_fab_size_normal);
            }
        }
    }

    public final void c(OnVisibilityChangedListener floatingActionButton$OnVisibilityChangedListener0, boolean z) {
        x x0 = this.getImpl();
        m m0 = floatingActionButton$OnVisibilityChangedListener0 == null ? null : new m(this, floatingActionButton$OnVisibilityChangedListener0);
        if(x0.v.getVisibility() == 0) {
            if(x0.r != 1) {
                goto label_6;
            }
        }
        else if(x0.r == 2) {
        label_6:
            Animator animator0 = x0.l;
            if(animator0 != null) {
                animator0.cancel();
            }
            FloatingActionButton floatingActionButton0 = x0.v;
            if(ViewCompat.isLaidOut(floatingActionButton0) && !floatingActionButton0.isInEditMode()) {
                MotionSpec motionSpec0 = x0.n;
                AnimatorSet animatorSet0 = motionSpec0 == null ? x0.c(x.F, 0.0f, 0.4f, x.G, 0.4f) : x0.b(motionSpec0, 0.0f, 0.0f, 0.0f);
                animatorSet0.addListener(new o(x0, z, m0));
                ArrayList arrayList0 = x0.t;
                if(arrayList0 != null) {
                    for(Object object0: arrayList0) {
                        animatorSet0.addListener(((Animator.AnimatorListener)object0));
                    }
                }
                animatorSet0.start();
                return;
            }
            floatingActionButton0.internalSetVisibility((z ? 8 : 4), z);
            if(m0 != null) {
                m0.onHidden();
            }
        }
    }

    public void clearCustomSize() {
        this.setCustomSize(0);
    }

    public final void d(Rect rect0) {
        rect0.left += this.l.left;
        rect0.top += this.l.top;
        rect0.right -= this.l.right;
        rect0.bottom -= this.l.bottom;
    }

    @Override  // android.widget.ImageView
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.getImpl().j(this.getDrawableState());
    }

    public final void e() {
        Drawable drawable0 = this.getDrawable();
        if(drawable0 == null) {
            return;
        }
        ColorStateList colorStateList0 = this.d;
        if(colorStateList0 == null) {
            DrawableCompat.clearColorFilter(drawable0);
            return;
        }
        int v = colorStateList0.getColorForState(this.getDrawableState(), 0);
        PorterDuff.Mode porterDuff$Mode0 = this.e == null ? PorterDuff.Mode.SRC_IN : this.e;
        drawable0.mutate().setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(v, porterDuff$Mode0));
    }

    public final void f(OnVisibilityChangedListener floatingActionButton$OnVisibilityChangedListener0, boolean z) {
        x x0 = this.getImpl();
        m m0 = floatingActionButton$OnVisibilityChangedListener0 == null ? null : new m(this, floatingActionButton$OnVisibilityChangedListener0);
        boolean z1 = true;
        if(x0.v.getVisibility() != 0) {
            if(x0.r != 2) {
                goto label_7;
            }
        }
        else if(x0.r == 1) {
        label_7:
            Animator animator0 = x0.l;
            if(animator0 != null) {
                animator0.cancel();
            }
            boolean z2 = x0.m == null;
            FloatingActionButton floatingActionButton0 = x0.v;
            if(!ViewCompat.isLaidOut(floatingActionButton0) || floatingActionButton0.isInEditMode()) {
                z1 = false;
            }
            Matrix matrix0 = x0.A;
            if(z1) {
                if(floatingActionButton0.getVisibility() != 0) {
                    float f = 0.0f;
                    floatingActionButton0.setAlpha(0.0f);
                    floatingActionButton0.setScaleY((z2 ? 0.4f : 0.0f));
                    floatingActionButton0.setScaleX((z2 ? 0.4f : 0.0f));
                    if(z2) {
                        f = 0.4f;
                    }
                    x0.p = f;
                    x0.a(f, matrix0);
                    floatingActionButton0.setImageMatrix(matrix0);
                }
                MotionSpec motionSpec0 = x0.m;
                AnimatorSet animatorSet0 = motionSpec0 == null ? x0.c(x.D, 1.0f, 1.0f, x.E, 1.0f) : x0.b(motionSpec0, 1.0f, 1.0f, 1.0f);
                animatorSet0.addListener(new p(x0, z, m0));
                ArrayList arrayList0 = x0.s;
                if(arrayList0 != null) {
                    for(Object object0: arrayList0) {
                        animatorSet0.addListener(((Animator.AnimatorListener)object0));
                    }
                }
                animatorSet0.start();
                return;
            }
            floatingActionButton0.internalSetVisibility(0, z);
            floatingActionButton0.setAlpha(1.0f);
            floatingActionButton0.setScaleY(1.0f);
            floatingActionButton0.setScaleX(1.0f);
            x0.p = 1.0f;
            x0.a(1.0f, matrix0);
            floatingActionButton0.setImageMatrix(matrix0);
            if(m0 != null) {
                m0.onShown();
            }
        }
    }

    @Override  // android.view.View
    @Nullable
    public ColorStateList getBackgroundTintList() {
        return this.b;
    }

    @Override  // android.view.View
    @Nullable
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.c;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$AttachedBehavior
    @NonNull
    public Behavior getBehavior() {
        return new com.google.android.material.floatingactionbutton.FloatingActionButton.Behavior();
    }

    public float getCompatElevation() {
        return this.getImpl().e();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return this.getImpl().i;
    }

    public float getCompatPressedTranslationZ() {
        return this.getImpl().j;
    }

    @Nullable
    public Drawable getContentBackground() {
        return this.getImpl().e;
    }

    @Deprecated
    public boolean getContentRect(@NonNull Rect rect0) {
        if(ViewCompat.isLaidOut(this)) {
            rect0.set(0, 0, this.getWidth(), this.getHeight());
            this.d(rect0);
            return true;
        }
        return false;
    }

    @Px
    public int getCustomSize() {
        return this.h;
    }

    @Override  // com.google.android.material.expandable.ExpandableTransformationWidget
    public int getExpandedComponentIdHint() {
        return this.o.getExpandedComponentIdHint();
    }

    @Nullable
    public MotionSpec getHideMotionSpec() {
        return this.getImpl().n;
    }

    private x getImpl() {
        if(this.p == null) {
            this.p = new z(this, new f(this, 15));  // 初始化器: Lcom/google/android/material/floatingactionbutton/x;-><init>(Lcom/google/android/material/floatingactionbutton/FloatingActionButton;Landroidx/appcompat/view/menu/f;)V
        }
        return this.p;
    }

    public void getMeasuredContentRect(@NonNull Rect rect0) {
        rect0.set(0, 0, this.getMeasuredWidth(), this.getMeasuredHeight());
        this.d(rect0);
    }

    @ColorInt
    @Deprecated
    public int getRippleColor() {
        return this.f == null ? 0 : this.f.getDefaultColor();
    }

    @Nullable
    public ColorStateList getRippleColorStateList() {
        return this.f;
    }

    @Override  // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return (ShapeAppearanceModel)Preconditions.checkNotNull(this.getImpl().a);
    }

    @Nullable
    public MotionSpec getShowMotionSpec() {
        return this.getImpl().m;
    }

    public int getSize() {
        return this.g;
    }

    public int getSizeDimension() {
        return this.b(this.g);
    }

    @Override  // androidx.core.view.TintableBackgroundView
    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        return this.getBackgroundTintList();
    }

    @Override  // androidx.core.view.TintableBackgroundView
    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return this.getBackgroundTintMode();
    }

    @Override  // androidx.core.widget.TintableImageSourceView
    @Nullable
    public ColorStateList getSupportImageTintList() {
        return this.d;
    }

    @Override  // androidx.core.widget.TintableImageSourceView
    @Nullable
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.e;
    }

    public boolean getUseCompatPadding() {
        return this.k;
    }

    public void hide() {
        this.hide(null);
    }

    public void hide(@Nullable OnVisibilityChangedListener floatingActionButton$OnVisibilityChangedListener0) {
        this.c(floatingActionButton$OnVisibilityChangedListener0, true);
    }

    @Override  // com.google.android.material.expandable.ExpandableWidget
    public boolean isExpanded() {
        return this.o.isExpanded();
    }

    public boolean isOrWillBeHidden() {
        x x0 = this.getImpl();
        return x0.v.getVisibility() == 0 ? x0.r == 1 : x0.r != 2;
    }

    public boolean isOrWillBeShown() {
        x x0 = this.getImpl();
        return x0.v.getVisibility() == 0 ? x0.r != 1 : x0.r == 2;
    }

    @Override  // android.widget.ImageView
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.getImpl().h();
    }

    @Override  // android.widget.ImageView
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        x x0 = this.getImpl();
        MaterialShapeDrawable materialShapeDrawable0 = x0.b;
        FloatingActionButton floatingActionButton0 = x0.v;
        if(materialShapeDrawable0 != null) {
            MaterialShapeUtils.setParentAbsoluteElevation(floatingActionButton0, materialShapeDrawable0);
        }
        if(!(x0 instanceof z)) {
            ViewTreeObserver viewTreeObserver0 = floatingActionButton0.getViewTreeObserver();
            if(x0.B == null) {
                x0.B = new t(x0, 0);
            }
            viewTreeObserver0.addOnPreDrawListener(x0.B);
        }
    }

    @Override  // android.widget.ImageView
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        x x0 = this.getImpl();
        ViewTreeObserver viewTreeObserver0 = x0.v.getViewTreeObserver();
        t t0 = x0.B;
        if(t0 != null) {
            viewTreeObserver0.removeOnPreDrawListener(t0);
            x0.B = null;
        }
    }

    @Override  // android.widget.ImageView
    public void onMeasure(int v, int v1) {
        int v2 = this.getSizeDimension();
        this.i = (v2 - this.j) / 2;
        this.getImpl().q();
        int v3 = Math.min(View.resolveSize(v2, v), View.resolveSize(v2, v1));
        this.setMeasuredDimension(this.l.left + v3 + this.l.right, v3 + this.l.top + this.l.bottom);
    }

    @Override  // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((ExtendableSavedState)parcelable0).getSuperState());
        Bundle bundle0 = (Bundle)Preconditions.checkNotNull(((Bundle)((ExtendableSavedState)parcelable0).extendableStates.get("expandableWidgetHelper")));
        this.o.onRestoreInstanceState(bundle0);
    }

    @Override  // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = super.onSaveInstanceState();
        if(parcelable0 == null) {
            parcelable0 = new Bundle();
        }
        Parcelable parcelable1 = new ExtendableSavedState(parcelable0);
        Bundle bundle0 = this.o.onSaveInstanceState();
        parcelable1.extendableStates.put("expandableWidgetHelper", bundle0);
        return parcelable1;
    }

    @Override  // android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent0) {
        if(motionEvent0.getAction() == 0) {
            this.getMeasuredContentRect(this.m);
            int v = this.p.f ? Math.max((this.p.k - this.p.v.getSizeDimension()) / 2, 0) : 0;
            this.m.inset(-v, -v);
            return this.m.contains(((int)motionEvent0.getX()), ((int)motionEvent0.getY())) ? super.onTouchEvent(motionEvent0) : false;
        }
        return super.onTouchEvent(motionEvent0);
    }

    public void removeOnHideAnimationListener(@NonNull Animator.AnimatorListener animator$AnimatorListener0) {
        ArrayList arrayList0 = this.getImpl().t;
        if(arrayList0 != null) {
            arrayList0.remove(animator$AnimatorListener0);
        }
    }

    public void removeOnShowAnimationListener(@NonNull Animator.AnimatorListener animator$AnimatorListener0) {
        ArrayList arrayList0 = this.getImpl().s;
        if(arrayList0 != null) {
            arrayList0.remove(animator$AnimatorListener0);
        }
    }

    public void removeTransformationCallback(@NonNull TransformationCallback transformationCallback0) {
        x x0 = this.getImpl();
        n n0 = new n(this, transformationCallback0);
        ArrayList arrayList0 = x0.u;
        if(arrayList0 != null) {
            arrayList0.remove(n0);
        }
    }

    @Override  // android.view.View
    public void setBackgroundColor(int v) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override  // android.view.View
    public void setBackgroundDrawable(Drawable drawable0) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override  // android.view.View
    public void setBackgroundResource(int v) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override  // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList0) {
        if(this.b != colorStateList0) {
            this.b = colorStateList0;
            x x0 = this.getImpl();
            MaterialShapeDrawable materialShapeDrawable0 = x0.b;
            if(materialShapeDrawable0 != null) {
                materialShapeDrawable0.setTintList(colorStateList0);
            }
            d d0 = x0.d;
            if(d0 != null) {
                if(colorStateList0 != null) {
                    d0.m = colorStateList0.getColorForState(d0.getState(), d0.m);
                }
                d0.p = colorStateList0;
                d0.n = true;
                d0.invalidateSelf();
            }
        }
    }

    @Override  // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        if(this.c != porterDuff$Mode0) {
            this.c = porterDuff$Mode0;
            MaterialShapeDrawable materialShapeDrawable0 = this.getImpl().b;
            if(materialShapeDrawable0 != null) {
                materialShapeDrawable0.setTintMode(porterDuff$Mode0);
            }
        }
    }

    public void setCompatElevation(float f) {
        x x0 = this.getImpl();
        if(x0.h != f) {
            x0.h = f;
            x0.k(f, x0.i, x0.j);
        }
    }

    public void setCompatElevationResource(@DimenRes int v) {
        this.setCompatElevation(this.getResources().getDimension(v));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        x x0 = this.getImpl();
        if(x0.i != f) {
            x0.i = f;
            x0.k(x0.h, f, x0.j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(@DimenRes int v) {
        this.setCompatHoveredFocusedTranslationZ(this.getResources().getDimension(v));
    }

    public void setCompatPressedTranslationZ(float f) {
        x x0 = this.getImpl();
        if(x0.j != f) {
            x0.j = f;
            x0.k(x0.h, x0.i, f);
        }
    }

    public void setCompatPressedTranslationZResource(@DimenRes int v) {
        this.setCompatPressedTranslationZ(this.getResources().getDimension(v));
    }

    public void setCustomSize(@Px int v) {
        if(v < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if(v != this.h) {
            this.h = v;
            this.requestLayout();
        }
    }

    @Override  // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeDrawable materialShapeDrawable0 = this.getImpl().b;
        if(materialShapeDrawable0 != null) {
            materialShapeDrawable0.setElevation(f);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if(z != this.getImpl().f) {
            this.getImpl().f = z;
            this.requestLayout();
        }
    }

    @Override  // com.google.android.material.expandable.ExpandableWidget
    public boolean setExpanded(boolean z) {
        return this.o.setExpanded(z);
    }

    @Override  // com.google.android.material.expandable.ExpandableTransformationWidget
    public void setExpandedComponentIdHint(@IdRes int v) {
        this.o.setExpandedComponentIdHint(v);
    }

    public void setHideMotionSpec(@Nullable MotionSpec motionSpec0) {
        this.getImpl().n = motionSpec0;
    }

    public void setHideMotionSpecResource(@AnimatorRes int v) {
        this.setHideMotionSpec(MotionSpec.createFromResource(this.getContext(), v));
    }

    @Override  // android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable0) {
        if(this.getDrawable() != drawable0) {
            super.setImageDrawable(drawable0);
            x x0 = this.getImpl();
            float f = x0.p;
            x0.p = f;
            x0.a(f, x0.A);
            x0.v.setImageMatrix(x0.A);
            if(this.d != null) {
                this.e();
            }
        }
    }

    @Override  // android.widget.ImageView
    public void setImageResource(@DrawableRes int v) {
        this.n.setImageResource(v);
        this.e();
    }

    public void setMaxImageSize(int v) {
        this.j = v;
        x x0 = this.getImpl();
        if(x0.q != v) {
            x0.q = v;
            float f = x0.p;
            x0.p = f;
            x0.a(f, x0.A);
            x0.v.setImageMatrix(x0.A);
        }
    }

    public void setRippleColor(@ColorInt int v) {
        this.setRippleColor(ColorStateList.valueOf(v));
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList0) {
        if(this.f != colorStateList0) {
            this.f = colorStateList0;
            this.getImpl().m(this.f);
        }
    }

    @Override  // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        ArrayList arrayList0 = this.getImpl().u;
        if(arrayList0 != null) {
            for(Object object0: arrayList0) {
                ((FloatingActionButtonImpl.InternalTransformationCallback)object0).onScaleChanged();
            }
        }
    }

    @Override  // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        ArrayList arrayList0 = this.getImpl().u;
        if(arrayList0 != null) {
            for(Object object0: arrayList0) {
                ((FloatingActionButtonImpl.InternalTransformationCallback)object0).onScaleChanged();
            }
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void setShadowPaddingEnabled(boolean z) {
        x x0 = this.getImpl();
        x0.g = z;
        x0.q();
    }

    @Override  // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel0) {
        this.getImpl().n(shapeAppearanceModel0);
    }

    public void setShowMotionSpec(@Nullable MotionSpec motionSpec0) {
        this.getImpl().m = motionSpec0;
    }

    public void setShowMotionSpecResource(@AnimatorRes int v) {
        this.setShowMotionSpec(MotionSpec.createFromResource(this.getContext(), v));
    }

    public void setSize(int v) {
        this.h = 0;
        if(v != this.g) {
            this.g = v;
            this.requestLayout();
        }
    }

    @Override  // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList0) {
        this.setBackgroundTintList(colorStateList0);
    }

    @Override  // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        this.setBackgroundTintMode(porterDuff$Mode0);
    }

    @Override  // androidx.core.widget.TintableImageSourceView
    public void setSupportImageTintList(@Nullable ColorStateList colorStateList0) {
        if(this.d != colorStateList0) {
            this.d = colorStateList0;
            this.e();
        }
    }

    @Override  // androidx.core.widget.TintableImageSourceView
    public void setSupportImageTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        if(this.e != porterDuff$Mode0) {
            this.e = porterDuff$Mode0;
            this.e();
        }
    }

    @Override  // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        this.getImpl().l();
    }

    @Override  // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.getImpl().l();
    }

    @Override  // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        this.getImpl().l();
    }

    public void setUseCompatPadding(boolean z) {
        if(this.k != z) {
            this.k = z;
            this.getImpl().i();
        }
    }

    @Override  // com.google.android.material.internal.VisibilityAwareImageButton
    public void setVisibility(int v) {
        super.setVisibility(v);
    }

    public boolean shouldEnsureMinTouchTargetSize() {
        return this.getImpl().f;
    }

    public void show() {
        this.show(null);
    }

    public void show(@Nullable OnVisibilityChangedListener floatingActionButton$OnVisibilityChangedListener0) {
        this.f(floatingActionButton$OnVisibilityChangedListener0, true);
    }
}

