package com.google.android.material.sidesheet;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.BackEventCompat;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import c3.h;
import com.google.android.material.R.string;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.motion.MaterialSideContainerBackHelper;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel.Builder;
import com.google.android.material.shape.ShapeAppearanceModel;
import g.a;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;

public class SideSheetBehavior extends Behavior implements Sheet {
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR;
        public final int b;

        static {
            SavedState.CREATOR = new f();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        public SavedState(@NonNull Parcel parcel0) {
            this(parcel0, null);
        }

        public SavedState(@NonNull Parcel parcel0, ClassLoader classLoader0) {
            super(parcel0, classLoader0);
            this.b = parcel0.readInt();
        }

        public SavedState(Parcelable parcelable0, @NonNull SideSheetBehavior sideSheetBehavior0) {
            super(parcelable0);
            this.b = sideSheetBehavior0.v;
        }

        @Override  // androidx.customview.view.AbsSavedState
        public void writeToParcel(@NonNull Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeInt(this.b);
        }
    }

    public int A;
    public int B;
    public int C;
    public int D;
    public WeakReference E;
    public WeakReference F;
    public int G;
    public VelocityTracker H;
    public MaterialSideContainerBackHelper I;
    public int J;
    public final LinkedHashSet K;
    public final e L;
    public static final int M;
    public static final int N;
    public a o;
    public final MaterialShapeDrawable p;
    public final ColorStateList q;
    public final ShapeAppearanceModel r;
    public final g s;
    public final float t;
    public boolean u;
    public int v;
    public int w;
    public ViewDragHelper x;
    public boolean y;
    public float z;

    static {
        SideSheetBehavior.M = string.side_sheet_accessibility_pane_title;
        SideSheetBehavior.N = style.Widget_Material3_SideSheet;
    }

    public SideSheetBehavior() {
        this.s = new g(this);
        this.u = true;
        this.v = 5;
        this.w = 5;
        this.z = 0.1f;
        this.G = -1;
        this.K = new LinkedHashSet();
        this.L = new e(this);
    }

    public SideSheetBehavior(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.s = new g(this);
        this.u = true;
        this.v = 5;
        this.w = 5;
        this.z = 0.1f;
        this.G = -1;
        this.K = new LinkedHashSet();
        this.L = new e(this);
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.SideSheetBehavior_Layout);
        if(typedArray0.hasValue(styleable.SideSheetBehavior_Layout_backgroundTint)) {
            this.q = MaterialResources.getColorStateList(context0, typedArray0, styleable.SideSheetBehavior_Layout_backgroundTint);
        }
        if(typedArray0.hasValue(styleable.SideSheetBehavior_Layout_shapeAppearance)) {
            this.r = ShapeAppearanceModel.builder(context0, attributeSet0, 0, SideSheetBehavior.N).build();
        }
        if(typedArray0.hasValue(styleable.SideSheetBehavior_Layout_coplanarSiblingViewId)) {
            this.setCoplanarSiblingViewId(typedArray0.getResourceId(styleable.SideSheetBehavior_Layout_coplanarSiblingViewId, -1));
        }
        ShapeAppearanceModel shapeAppearanceModel0 = this.r;
        if(shapeAppearanceModel0 != null) {
            MaterialShapeDrawable materialShapeDrawable0 = new MaterialShapeDrawable(shapeAppearanceModel0);
            this.p = materialShapeDrawable0;
            materialShapeDrawable0.initializeElevationOverlay(context0);
            ColorStateList colorStateList0 = this.q;
            if(colorStateList0 == null) {
                TypedValue typedValue0 = new TypedValue();
                context0.getTheme().resolveAttribute(0x1010031, typedValue0, true);
                this.p.setTint(typedValue0.data);
            }
            else {
                this.p.setFillColor(colorStateList0);
            }
        }
        this.t = typedArray0.getDimension(styleable.SideSheetBehavior_Layout_android_elevation, -1.0f);
        this.setDraggable(typedArray0.getBoolean(styleable.SideSheetBehavior_Layout_behavior_draggable, true));
        typedArray0.recycle();
        ViewConfiguration.get(context0).getScaledMaximumFlingVelocity();
    }

    public final void a(int v) {
        if(this.v == v) {
            return;
        }
        this.v = v;
        if(v == 3 || v == 5) {
            this.w = v;
        }
        WeakReference weakReference0 = this.E;
        if(weakReference0 == null) {
            return;
        }
        View view0 = (View)weakReference0.get();
        if(view0 == null) {
            return;
        }
        int v1 = this.v == 5 ? 4 : 0;
        if(view0.getVisibility() != v1) {
            view0.setVisibility(v1);
        }
        for(Object object0: this.K) {
            ((SheetCallback)object0).onStateChanged(view0, v);
        }
        this.d();
    }

    @Override  // com.google.android.material.sidesheet.Sheet
    public void addCallback(@NonNull SheetCallback sheetCallback0) {
        this.addCallback(((SideSheetCallback)sheetCallback0));
    }

    public void addCallback(@NonNull SideSheetCallback sideSheetCallback0) {
        this.K.add(sideSheetCallback0);
    }

    // 去混淆评级： 低(20)
    public final boolean b() {
        return this.x != null && (this.u || this.v == 1);
    }

    public final void c(View view0, int v, boolean z) {
        int v1;
        switch(v) {
            case 3: {
                v1 = this.getExpandedOffset();
                break;
            }
            case 5: {
                v1 = this.o.v();
                break;
            }
            default: {
                throw new IllegalArgumentException("Invalid state to get outer edge offset: " + v);
            }
        }
        ViewDragHelper viewDragHelper0 = this.x;
        if(viewDragHelper0 != null) {
            if(!z) {
                if(viewDragHelper0.smoothSlideViewTo(view0, v1, view0.getTop())) {
                    this.a(2);
                    this.s.a(v);
                    return;
                }
            }
            else if(viewDragHelper0.settleCapturedViewAt(v1, view0.getTop())) {
                this.a(2);
                this.s.a(v);
                return;
            }
        }
        this.a(v);
    }

    @Override  // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
        MaterialSideContainerBackHelper materialSideContainerBackHelper0 = this.I;
        if(materialSideContainerBackHelper0 == null) {
            return;
        }
        materialSideContainerBackHelper0.cancelBackProgress();
    }

    public final void d() {
        WeakReference weakReference0 = this.E;
        if(weakReference0 == null) {
            return;
        }
        View view0 = (View)weakReference0.get();
        if(view0 == null) {
            return;
        }
        ViewCompat.removeAccessibilityAction(view0, 0x40000);
        ViewCompat.removeAccessibilityAction(view0, 0x100000);
        if(this.v != 5) {
            c c0 = new c(this, 5);
            ViewCompat.replaceAccessibilityAction(view0, AccessibilityActionCompat.ACTION_DISMISS, null, c0);
        }
        if(this.v != 3) {
            c c1 = new c(this, 3);
            ViewCompat.replaceAccessibilityAction(view0, AccessibilityActionCompat.ACTION_EXPAND, null, c1);
        }
    }

    public void expand() {
        this.setState(3);
    }

    @NonNull
    public static SideSheetBehavior from(@NonNull View view0) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        if(!(viewGroup$LayoutParams0 instanceof LayoutParams)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        Behavior coordinatorLayout$Behavior0 = ((LayoutParams)viewGroup$LayoutParams0).getBehavior();
        if(!(coordinatorLayout$Behavior0 instanceof SideSheetBehavior)) {
            throw new IllegalArgumentException("The view is not associated with SideSheetBehavior");
        }
        return (SideSheetBehavior)coordinatorLayout$Behavior0;
    }

    @Nullable
    public View getCoplanarSiblingView() {
        return this.F == null ? null : ((View)this.F.get());
    }

    public int getExpandedOffset() {
        return this.o.u();
    }

    public float getHideFriction() {
        return this.z;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public int getLastStableState() {
        return this.w;
    }

    @Override  // com.google.android.material.sidesheet.Sheet
    public int getState() {
        return this.v;
    }

    @Override  // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
        MaterialSideContainerBackHelper materialSideContainerBackHelper0 = this.I;
        if(materialSideContainerBackHelper0 == null) {
            return;
        }
        BackEventCompat backEventCompat0 = materialSideContainerBackHelper0.onHandleBackInvoked();
        int v = 5;
        if(backEventCompat0 != null && Build.VERSION.SDK_INT >= 34) {
            MaterialSideContainerBackHelper materialSideContainerBackHelper1 = this.I;
            if(this.o != null && this.o.C() != 0) {
                v = 3;
            }
            a8.e e0 = new a8.e(this, 7);
            View view0 = this.getCoplanarSiblingView();
            ValueAnimator.AnimatorUpdateListener valueAnimator$AnimatorUpdateListener0 = null;
            if(view0 != null) {
                ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view0.getLayoutParams();
                if(viewGroup$MarginLayoutParams0 != null) {
                    valueAnimator$AnimatorUpdateListener0 = new d(this, viewGroup$MarginLayoutParams0, this.o.t(viewGroup$MarginLayoutParams0), view0);
                }
            }
            materialSideContainerBackHelper1.finishBackProgress(backEventCompat0, v, e0, valueAnimator$AnimatorUpdateListener0);
            return;
        }
        this.setState(5);
    }

    public void hide() {
        this.setState(5);
    }

    public boolean isDraggable() {
        return this.u;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public void onAttachedToLayoutParams(@NonNull LayoutParams coordinatorLayout$LayoutParams0) {
        super.onAttachedToLayoutParams(coordinatorLayout$LayoutParams0);
        this.E = null;
        this.x = null;
        this.I = null;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.E = null;
        this.x = null;
        this.I = null;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull MotionEvent motionEvent0) {
        if((view0.isShown() || ViewCompat.getAccessibilityPaneTitle(view0) != null) && this.u) {
            int v = motionEvent0.getActionMasked();
            if(v == 0) {
                VelocityTracker velocityTracker0 = this.H;
                if(velocityTracker0 != null) {
                    velocityTracker0.recycle();
                    this.H = null;
                }
            }
            if(this.H == null) {
                this.H = VelocityTracker.obtain();
            }
            this.H.addMovement(motionEvent0);
            switch(v) {
                case 0: {
                    this.J = (int)motionEvent0.getX();
                    return !this.y && (this.x != null && this.x.shouldInterceptTouchEvent(motionEvent0));
                label_14:
                    if(v == 3) {
                        goto label_15;
                    }
                    break;
                }
                case 1: {
                label_15:
                    if(this.y) {
                        this.y = false;
                        return false;
                    }
                    break;
                }
                default: {
                    goto label_14;
                }
            }
            return !this.y && (this.x != null && this.x.shouldInterceptTouchEvent(motionEvent0));
        }
        this.y = true;
        return false;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, int v) {
        if(ViewCompat.getFitsSystemWindows(coordinatorLayout0) && !ViewCompat.getFitsSystemWindows(view0)) {
            view0.setFitsSystemWindows(true);
        }
        int v1 = 0;
        if(this.E == null) {
            this.E = new WeakReference(view0);
            this.I = new MaterialSideContainerBackHelper(view0);
            MaterialShapeDrawable materialShapeDrawable0 = this.p;
            if(materialShapeDrawable0 == null) {
                ColorStateList colorStateList0 = this.q;
                if(colorStateList0 != null) {
                    ViewCompat.setBackgroundTintList(view0, colorStateList0);
                }
            }
            else {
                ViewCompat.setBackground(view0, materialShapeDrawable0);
                float f = this.t == -1.0f ? ViewCompat.getElevation(view0) : this.t;
                this.p.setElevation(f);
            }
            int v2 = this.v == 5 ? 4 : 0;
            if(view0.getVisibility() != v2) {
                view0.setVisibility(v2);
            }
            this.d();
            if(ViewCompat.getImportantForAccessibility(view0) == 0) {
                ViewCompat.setImportantForAccessibility(view0, 1);
            }
            if(ViewCompat.getAccessibilityPaneTitle(view0) == null) {
                ViewCompat.setAccessibilityPaneTitle(view0, view0.getResources().getString(SideSheetBehavior.M));
            }
        }
        int v3 = GravityCompat.getAbsoluteGravity(((LayoutParams)view0.getLayoutParams()).gravity, v) == 3 ? 1 : 0;
        if(this.o == null || this.o.C() != v3) {
            ShapeAppearanceModel shapeAppearanceModel0 = this.r;
            LayoutParams coordinatorLayout$LayoutParams0 = null;
            if(v3 == 0) {
                this.o = new com.google.android.material.sidesheet.a(this, 1);
                if(shapeAppearanceModel0 != null) {
                    WeakReference weakReference0 = this.E;
                    if(weakReference0 != null) {
                        View view1 = (View)weakReference0.get();
                        if(view1 != null && view1.getLayoutParams() instanceof LayoutParams) {
                            coordinatorLayout$LayoutParams0 = (LayoutParams)view1.getLayoutParams();
                        }
                    }
                    if(coordinatorLayout$LayoutParams0 == null || coordinatorLayout$LayoutParams0.rightMargin <= 0) {
                        Builder shapeAppearanceModel$Builder0 = shapeAppearanceModel0.toBuilder();
                        shapeAppearanceModel$Builder0.setTopRightCornerSize(0.0f).setBottomRightCornerSize(0.0f);
                        ShapeAppearanceModel shapeAppearanceModel1 = shapeAppearanceModel$Builder0.build();
                        MaterialShapeDrawable materialShapeDrawable1 = this.p;
                        if(materialShapeDrawable1 != null) {
                            materialShapeDrawable1.setShapeAppearanceModel(shapeAppearanceModel1);
                        }
                    }
                }
            }
            else {
                this.o = new com.google.android.material.sidesheet.a(this, 0);
                if(shapeAppearanceModel0 != null) {
                    WeakReference weakReference1 = this.E;
                    if(weakReference1 != null) {
                        View view2 = (View)weakReference1.get();
                        if(view2 != null && view2.getLayoutParams() instanceof LayoutParams) {
                            coordinatorLayout$LayoutParams0 = (LayoutParams)view2.getLayoutParams();
                        }
                    }
                    if(coordinatorLayout$LayoutParams0 == null || coordinatorLayout$LayoutParams0.leftMargin <= 0) {
                        Builder shapeAppearanceModel$Builder1 = shapeAppearanceModel0.toBuilder();
                        shapeAppearanceModel$Builder1.setTopLeftCornerSize(0.0f).setBottomLeftCornerSize(0.0f);
                        ShapeAppearanceModel shapeAppearanceModel2 = shapeAppearanceModel$Builder1.build();
                        MaterialShapeDrawable materialShapeDrawable2 = this.p;
                        if(materialShapeDrawable2 != null) {
                            materialShapeDrawable2.setShapeAppearanceModel(shapeAppearanceModel2);
                        }
                    }
                }
            }
        }
        if(this.x == null) {
            this.x = ViewDragHelper.create(coordinatorLayout0, this.L);
        }
        int v4 = this.o.z(view0);
        coordinatorLayout0.onLayoutChild(view0, v);
        this.B = coordinatorLayout0.getWidth();
        this.C = this.o.A(coordinatorLayout0);
        this.A = view0.getWidth();
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view0.getLayoutParams();
        this.D = viewGroup$MarginLayoutParams0 == null ? 0 : this.o.c(viewGroup$MarginLayoutParams0);
        int v5 = this.v;
        if(v5 == 1) {
            v1 = v4 - this.o.z(view0);
        }
        else {
            switch(v5) {
                case 2: {
                    v1 = v4 - this.o.z(view0);
                    break;
                }
                case 3: {
                    break;
                }
                case 5: {
                    v1 = this.o.v();
                    break;
                }
                default: {
                    throw new IllegalStateException("Unexpected value: " + this.v);
                }
            }
        }
        ViewCompat.offsetLeftAndRight(view0, v1);
        if(this.F == null) {
            int v6 = this.G;
            if(v6 != -1) {
                View view3 = coordinatorLayout0.findViewById(v6);
                if(view3 != null) {
                    this.F = new WeakReference(view3);
                }
            }
        }
        for(Object object0: this.K) {
            SheetCallback sheetCallback0 = (SheetCallback)object0;
            if(sheetCallback0 instanceof SideSheetCallback) {
                ((SideSheetCallback)sheetCallback0).getClass();
            }
        }
        return true;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, int v, int v1, int v2, int v3) {
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view0.getLayoutParams();
        int v4 = coordinatorLayout0.getPaddingLeft();
        int v5 = ViewGroup.getChildMeasureSpec(v, coordinatorLayout0.getPaddingRight() + v4 + viewGroup$MarginLayoutParams0.leftMargin + viewGroup$MarginLayoutParams0.rightMargin + v1, viewGroup$MarginLayoutParams0.width);
        int v6 = coordinatorLayout0.getPaddingTop();
        view0.measure(v5, ViewGroup.getChildMeasureSpec(v2, coordinatorLayout0.getPaddingBottom() + v6 + viewGroup$MarginLayoutParams0.topMargin + viewGroup$MarginLayoutParams0.bottomMargin + v3, viewGroup$MarginLayoutParams0.height));
        return true;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull Parcelable parcelable0) {
        if(((SavedState)parcelable0).getSuperState() != null) {
            super.onRestoreInstanceState(coordinatorLayout0, view0, ((SavedState)parcelable0).getSuperState());
        }
        int v = ((SavedState)parcelable0).b;
        if(v == 1 || v == 2) {
            v = 5;
        }
        this.v = v;
        this.w = v;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    @NonNull
    public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout0, view0), this);
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull MotionEvent motionEvent0) {
        if(!view0.isShown()) {
            return false;
        }
        int v = motionEvent0.getActionMasked();
        if(this.v == 1 && v == 0) {
            return true;
        }
        if(this.b()) {
            this.x.processTouchEvent(motionEvent0);
        }
        if(v == 0) {
            VelocityTracker velocityTracker0 = this.H;
            if(velocityTracker0 != null) {
                velocityTracker0.recycle();
                this.H = null;
            }
        }
        if(this.H == null) {
            this.H = VelocityTracker.obtain();
        }
        this.H.addMovement(motionEvent0);
        if(this.b() && v == 2 && !this.y && this.b() && Math.abs(((float)this.J) - motionEvent0.getX()) > ((float)this.x.getTouchSlop())) {
            this.x.captureChildView(view0, motionEvent0.getPointerId(motionEvent0.getActionIndex()));
        }
        return !this.y;
    }

    @Override  // com.google.android.material.sidesheet.Sheet
    public void removeCallback(@NonNull SheetCallback sheetCallback0) {
        this.removeCallback(((SideSheetCallback)sheetCallback0));
    }

    public void removeCallback(@NonNull SideSheetCallback sideSheetCallback0) {
        this.K.remove(sideSheetCallback0);
    }

    public void setCoplanarSiblingView(@Nullable View view0) {
        this.G = -1;
        if(view0 == null) {
            WeakReference weakReference0 = this.F;
            if(weakReference0 != null) {
                weakReference0.clear();
            }
            this.F = null;
            return;
        }
        this.F = new WeakReference(view0);
        WeakReference weakReference1 = this.E;
        if(weakReference1 != null) {
            View view1 = (View)weakReference1.get();
            if(ViewCompat.isLaidOut(view1)) {
                view1.requestLayout();
            }
        }
    }

    public void setCoplanarSiblingViewId(@IdRes int v) {
        this.G = v;
        WeakReference weakReference0 = this.F;
        if(weakReference0 != null) {
            weakReference0.clear();
        }
        this.F = null;
        WeakReference weakReference1 = this.E;
        if(weakReference1 != null) {
            View view0 = (View)weakReference1.get();
            if(v != -1 && ViewCompat.isLaidOut(view0)) {
                view0.requestLayout();
            }
        }
    }

    public void setDraggable(boolean z) {
        this.u = z;
    }

    public void setHideFriction(float f) {
        this.z = f;
    }

    @Override  // com.google.android.material.sidesheet.Sheet
    public void setState(int v) {
        if(v == 1 || v == 2) {
            throw new IllegalArgumentException(r0.a.o(new StringBuilder("STATE_"), (v == 1 ? "DRAGGING" : "SETTLING"), " should not be set externally."));
        }
        if(this.E != null && this.E.get() != null) {
            View view0 = (View)this.E.get();
            h h0 = new h(this, v, 1);
            ViewParent viewParent0 = view0.getParent();
            if(viewParent0 != null && viewParent0.isLayoutRequested() && ViewCompat.isAttachedToWindow(view0)) {
                view0.post(h0);
                return;
            }
            h0.run();
            return;
        }
        this.a(v);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public boolean shouldSkipSmoothAnimation() [...] // Inlined contents

    @Override  // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(@NonNull BackEventCompat backEventCompat0) {
        MaterialSideContainerBackHelper materialSideContainerBackHelper0 = this.I;
        if(materialSideContainerBackHelper0 == null) {
            return;
        }
        materialSideContainerBackHelper0.startBackProgress(backEventCompat0);
    }

    @Override  // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(@NonNull BackEventCompat backEventCompat0) {
        int v = 5;
        MaterialSideContainerBackHelper materialSideContainerBackHelper0 = this.I;
        if(materialSideContainerBackHelper0 == null) {
            return;
        }
        if(this.o != null && this.o.C() != 0) {
            v = 3;
        }
        materialSideContainerBackHelper0.updateBackProgress(backEventCompat0, v);
        if(this.E != null && this.E.get() != null) {
            View view0 = (View)this.E.get();
            View view1 = this.getCoplanarSiblingView();
            if(view1 != null) {
                ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view1.getLayoutParams();
                if(viewGroup$MarginLayoutParams0 != null) {
                    float f = (float)this.A;
                    float f1 = view0.getScaleX();
                    this.o.a0(viewGroup$MarginLayoutParams0, ((int)(f1 * f + ((float)this.D))));
                    view1.requestLayout();
                }
            }
        }
    }
}

