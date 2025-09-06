package com.google.android.material.bottomsheet;

import a8.e;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.activity.BackEventCompat;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.w0;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import com.google.android.material.R.string;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBottomContainerBackHelper;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.sidesheet.g;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import r7.b;
import r7.c;

public class BottomSheetBehavior extends Behavior implements MaterialBackHandler {
    public static abstract class BottomSheetCallback {
        public void a(View view0) {
        }

        public abstract void onSlide(@NonNull View arg1, float arg2);

        public abstract void onStateChanged(@NonNull View arg1, int arg2);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface SaveFlags {
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR;
        public final int b;
        public final int c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        static {
            SavedState.CREATOR = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        public SavedState(@NonNull Parcel parcel0) {
            this(parcel0, null);
        }

        public SavedState(@NonNull Parcel parcel0, ClassLoader classLoader0) {
            super(parcel0, classLoader0);
            this.b = parcel0.readInt();
            this.c = parcel0.readInt();
            boolean z = false;
            this.d = parcel0.readInt() == 1;
            this.e = parcel0.readInt() == 1;
            if(parcel0.readInt() == 1) {
                z = true;
            }
            this.f = z;
        }

        @Deprecated
        public SavedState(Parcelable parcelable0, int v) {
            super(parcelable0);
            this.b = v;
        }

        public SavedState(Parcelable parcelable0, @NonNull BottomSheetBehavior bottomSheetBehavior0) {
            super(parcelable0);
            this.b = bottomSheetBehavior0.a0;
            this.c = bottomSheetBehavior0.t;
            this.d = bottomSheetBehavior0.p;
            this.e = bottomSheetBehavior0.X;
            this.f = bottomSheetBehavior0.Y;
        }

        @Override  // androidx.customview.view.AbsSavedState
        public void writeToParcel(@NonNull Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeInt(this.b);
            parcel0.writeInt(this.c);
            parcel0.writeInt(((int)this.d));
            parcel0.writeInt(((int)this.e));
            parcel0.writeInt(((int)this.f));
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface StableState {
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    public int A;
    public int B;
    public boolean C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public int K;
    public int L;
    public boolean M;
    public final ShapeAppearanceModel N;
    public boolean O;
    public final g P;
    public static final int PEEK_HEIGHT_AUTO = -1;
    public ValueAnimator Q;
    public int R;
    public int S;
    public static final int SAVE_ALL = -1;
    public static final int SAVE_FIT_TO_CONTENTS = 2;
    public static final int SAVE_HIDEABLE = 4;
    public static final int SAVE_NONE = 0;
    public static final int SAVE_PEEK_HEIGHT = 1;
    public static final int SAVE_SKIP_COLLAPSED = 8;
    public static final int STATE_COLLAPSED = 4;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_EXPANDED = 3;
    public static final int STATE_HALF_EXPANDED = 6;
    public static final int STATE_HIDDEN = 5;
    public static final int STATE_SETTLING = 2;
    public int T;
    public float U;
    public int V;
    public final float W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public int a0;
    public int b0;
    public ViewDragHelper c0;
    public boolean d0;
    public int e0;
    public boolean f0;
    public float g0;
    public int h0;
    public int i0;
    public int j0;
    public WeakReference k0;
    public WeakReference l0;
    public WeakReference m0;
    public final ArrayList n0;
    public int o;
    public VelocityTracker o0;
    public boolean p;
    public MaterialBottomContainerBackHelper p0;
    public boolean q;
    public int q0;
    public final float r;
    public int r0;
    public int s;
    public boolean s0;
    public int t;
    public HashMap t0;
    public boolean u;
    public final SparseIntArray u0;
    public int v;
    public final b v0;
    public final int w;
    public static final int w0;
    public final MaterialShapeDrawable x;
    public final ColorStateList y;
    public int z;

    static {
        BottomSheetBehavior.w0 = style.Widget_Design_BottomSheet_Modal;
    }

    public BottomSheetBehavior() {
        this.o = 0;
        this.p = true;
        this.q = false;
        this.z = -1;
        this.A = -1;
        this.P = new g(this);
        this.U = 0.5f;
        this.W = -1.0f;
        this.Z = true;
        this.a0 = 4;
        this.b0 = 4;
        this.g0 = 0.1f;
        this.n0 = new ArrayList();
        this.r0 = -1;
        this.u0 = new SparseIntArray();
        this.v0 = new b(this);
    }

    public BottomSheetBehavior(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.o = 0;
        this.p = true;
        this.q = false;
        this.z = -1;
        this.A = -1;
        this.P = new g(this);
        this.U = 0.5f;
        this.W = -1.0f;
        this.Z = true;
        this.a0 = 4;
        this.b0 = 4;
        this.g0 = 0.1f;
        this.n0 = new ArrayList();
        this.r0 = -1;
        this.u0 = new SparseIntArray();
        this.v0 = new b(this);
        this.w = context0.getResources().getDimensionPixelSize(dimen.mtrl_min_touch_target_size);
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.BottomSheetBehavior_Layout);
        if(typedArray0.hasValue(styleable.BottomSheetBehavior_Layout_backgroundTint)) {
            this.y = MaterialResources.getColorStateList(context0, typedArray0, styleable.BottomSheetBehavior_Layout_backgroundTint);
        }
        if(typedArray0.hasValue(styleable.BottomSheetBehavior_Layout_shapeAppearance)) {
            this.N = ShapeAppearanceModel.builder(context0, attributeSet0, attr.bottomSheetStyle, BottomSheetBehavior.w0).build();
        }
        ShapeAppearanceModel shapeAppearanceModel0 = this.N;
        if(shapeAppearanceModel0 != null) {
            MaterialShapeDrawable materialShapeDrawable0 = new MaterialShapeDrawable(shapeAppearanceModel0);
            this.x = materialShapeDrawable0;
            materialShapeDrawable0.initializeElevationOverlay(context0);
            ColorStateList colorStateList0 = this.y;
            if(colorStateList0 == null) {
                TypedValue typedValue0 = new TypedValue();
                context0.getTheme().resolveAttribute(0x1010031, typedValue0, true);
                this.x.setTint(typedValue0.data);
            }
            else {
                this.x.setFillColor(colorStateList0);
            }
        }
        ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(new float[]{this.b(), 1.0f});
        this.Q = valueAnimator0;
        valueAnimator0.setDuration(500L);
        this.Q.addUpdateListener(new com.google.android.material.appbar.g(this, 6));
        this.W = typedArray0.getDimension(styleable.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        if(typedArray0.hasValue(styleable.BottomSheetBehavior_Layout_android_maxWidth)) {
            this.setMaxWidth(typedArray0.getDimensionPixelSize(styleable.BottomSheetBehavior_Layout_android_maxWidth, -1));
        }
        if(typedArray0.hasValue(styleable.BottomSheetBehavior_Layout_android_maxHeight)) {
            this.setMaxHeight(typedArray0.getDimensionPixelSize(styleable.BottomSheetBehavior_Layout_android_maxHeight, -1));
        }
        TypedValue typedValue1 = typedArray0.peekValue(styleable.BottomSheetBehavior_Layout_behavior_peekHeight);
        if(typedValue1 == null || typedValue1.data != -1) {
            this.setPeekHeight(typedArray0.getDimensionPixelSize(styleable.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        }
        else {
            this.setPeekHeight(-1);
        }
        this.setHideable(typedArray0.getBoolean(styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
        this.setGestureInsetBottomIgnored(typedArray0.getBoolean(styleable.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false));
        this.setFitToContents(typedArray0.getBoolean(styleable.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        this.setSkipCollapsed(typedArray0.getBoolean(styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        this.setDraggable(typedArray0.getBoolean(styleable.BottomSheetBehavior_Layout_behavior_draggable, true));
        this.setSaveFlags(typedArray0.getInt(styleable.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        this.setHalfExpandedRatio(typedArray0.getFloat(styleable.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        TypedValue typedValue2 = typedArray0.peekValue(styleable.BottomSheetBehavior_Layout_behavior_expandedOffset);
        if(typedValue2 == null || typedValue2.type != 16) {
            this.setExpandedOffset(typedArray0.getDimensionPixelOffset(styleable.BottomSheetBehavior_Layout_behavior_expandedOffset, 0));
        }
        else {
            this.setExpandedOffset(typedValue2.data);
        }
        this.setSignificantVelocityThreshold(typedArray0.getInt(styleable.BottomSheetBehavior_Layout_behavior_significantVelocityThreshold, 500));
        this.D = typedArray0.getBoolean(styleable.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
        this.E = typedArray0.getBoolean(styleable.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
        this.F = typedArray0.getBoolean(styleable.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
        this.G = typedArray0.getBoolean(styleable.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
        this.H = typedArray0.getBoolean(styleable.BottomSheetBehavior_Layout_marginLeftSystemWindowInsets, false);
        this.I = typedArray0.getBoolean(styleable.BottomSheetBehavior_Layout_marginRightSystemWindowInsets, false);
        this.J = typedArray0.getBoolean(styleable.BottomSheetBehavior_Layout_marginTopSystemWindowInsets, false);
        this.M = typedArray0.getBoolean(styleable.BottomSheetBehavior_Layout_shouldRemoveExpandedCorners, true);
        typedArray0.recycle();
        this.r = (float)ViewConfiguration.get(context0).getScaledMaximumFlingVelocity();
    }

    public final void a() {
        int v = this.c();
        if(this.p) {
            this.V = Math.max(this.j0 - v, this.S);
            return;
        }
        this.V = this.j0 - v;
    }

    public void addBottomSheetCallback(@NonNull BottomSheetCallback bottomSheetBehavior$BottomSheetCallback0) {
        ArrayList arrayList0 = this.n0;
        if(!arrayList0.contains(bottomSheetBehavior$BottomSheetCallback0)) {
            arrayList0.add(bottomSheetBehavior$BottomSheetCallback0);
        }
    }

    public final float b() {
        float f3;
        float f = 0.0f;
        if(this.x != null && (this.k0 != null && this.k0.get() != null && Build.VERSION.SDK_INT >= 0x1F)) {
            View view0 = (View)this.k0.get();
            if(this.j()) {
                WindowInsets windowInsets0 = view0.getRootWindowInsets();
                if(windowInsets0 != null) {
                    float f1 = this.x.getTopLeftCornerResolvedSize();
                    RoundedCorner roundedCorner0 = i3.a.g(windowInsets0);
                    if(roundedCorner0 == null) {
                        f3 = 0.0f;
                    }
                    else {
                        float f2 = (float)roundedCorner0.getRadius();
                        f3 = f2 <= 0.0f || f1 <= 0.0f ? 0.0f : f2 / f1;
                    }
                    float f4 = this.x.getTopRightCornerResolvedSize();
                    RoundedCorner roundedCorner1 = i3.a.r(windowInsets0);
                    if(roundedCorner1 != null) {
                        float f5 = (float)roundedCorner1.getRadius();
                        if(f5 > 0.0f && f4 > 0.0f) {
                            f = f5 / f4;
                        }
                    }
                    return Math.max(f3, f);
                }
            }
        }
        return 0.0f;
    }

    public final int c() {
        if(this.u) {
            return Math.min(Math.max(this.v, this.j0 - this.i0 * 9 / 16), this.h0) + this.K;
        }
        if(!this.C && !this.D) {
            return this.B <= 0 ? this.t + this.K : Math.max(this.t, this.B + this.w);
        }
        return this.t + this.K;
    }

    public float calculateSlideOffset() {
        return this.k0 == null || this.k0.get() == null ? -1.0f : this.d(((View)this.k0.get()).getTop());
    }

    @Override  // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper0 = this.p0;
        if(materialBottomContainerBackHelper0 == null) {
            return;
        }
        materialBottomContainerBackHelper0.cancelBackProgress();
    }

    public final float d(int v) {
        return v > this.V || this.V == this.getExpandedOffset() ? ((float)(this.V - v)) / ((float)(this.j0 - this.V)) : ((float)(this.V - v)) / ((float)(this.V - this.getExpandedOffset()));
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void disableShapeAnimations() {
        this.Q = null;
    }

    public final void e(int v, View view0) {
        if(view0 == null) {
            return;
        }
        ViewCompat.removeAccessibilityAction(view0, 0x80000);
        ViewCompat.removeAccessibilityAction(view0, 0x40000);
        ViewCompat.removeAccessibilityAction(view0, 0x100000);
        SparseIntArray sparseIntArray0 = this.u0;
        int v1 = sparseIntArray0.get(v, -1);
        if(v1 != -1) {
            ViewCompat.removeAccessibilityAction(view0, v1);
            sparseIntArray0.delete(v);
        }
    }

    public final void f(int v) {
        View view0 = (View)this.k0.get();
        if(view0 != null) {
            ArrayList arrayList0 = this.n0;
            if(!arrayList0.isEmpty()) {
                float f = this.d(v);
                for(int v1 = 0; v1 < arrayList0.size(); ++v1) {
                    ((BottomSheetCallback)arrayList0.get(v1)).onSlide(view0, f);
                }
            }
        }
    }

    @NonNull
    public static BottomSheetBehavior from(@NonNull View view0) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        if(!(viewGroup$LayoutParams0 instanceof LayoutParams)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        Behavior coordinatorLayout$Behavior0 = ((LayoutParams)viewGroup$LayoutParams0).getBehavior();
        if(!(coordinatorLayout$Behavior0 instanceof BottomSheetBehavior)) {
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        return (BottomSheetBehavior)coordinatorLayout$Behavior0;
    }

    public static View g(View view0) {
        if(view0.getVisibility() != 0) {
            return null;
        }
        if(ViewCompat.isNestedScrollingEnabled(view0)) {
            return view0;
        }
        if(view0 instanceof ViewGroup) {
            int v = ((ViewGroup)view0).getChildCount();
            for(int v1 = 0; v1 < v; ++v1) {
                View view1 = BottomSheetBehavior.g(((ViewGroup)view0).getChildAt(v1));
                if(view1 != null) {
                    return view1;
                }
            }
        }
        return null;
    }

    public int getExpandedOffset() {
        if(this.p) {
            return this.S;
        }
        return this.G ? Math.max(this.R, 0) : Math.max(this.R, this.L);
    }

    @FloatRange(from = 0.0, to = 1.0)
    public float getHalfExpandedRatio() {
        return this.U;
    }

    public float getHideFriction() {
        return this.g0;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public int getLastStableState() {
        return this.b0;
    }

    @Px
    public int getMaxHeight() {
        return this.A;
    }

    @Px
    public int getMaxWidth() {
        return this.z;
    }

    // 去混淆评级： 低(20)
    public int getPeekHeight() {
        return this.u ? -1 : this.t;
    }

    public int getSaveFlags() {
        return this.o;
    }

    public int getSignificantVelocityThreshold() {
        return this.s;
    }

    public boolean getSkipCollapsed() {
        return this.Y;
    }

    public int getState() {
        return this.a0;
    }

    public static int h(int v, int v1, int v2, int v3) {
        int v4 = ViewGroup.getChildMeasureSpec(v, v1, v3);
        if(v2 == -1) {
            return v4;
        }
        int v5 = View.MeasureSpec.getMode(v4);
        int v6 = View.MeasureSpec.getSize(v4);
        if(v5 != 0x40000000) {
            if(v6 != 0) {
                v2 = Math.min(v6, v2);
            }
            return View.MeasureSpec.makeMeasureSpec(v2, 0x80000000);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(v6, v2), 0x40000000);
    }

    @Override  // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper0 = this.p0;
        if(materialBottomContainerBackHelper0 == null) {
            return;
        }
        BackEventCompat backEventCompat0 = materialBottomContainerBackHelper0.onHandleBackInvoked();
        int v = 4;
        if(backEventCompat0 != null && Build.VERSION.SDK_INT >= 34) {
            if(this.X) {
                this.p0.finishBackProgressNotPersistent(backEventCompat0, new e(this, 11));
                return;
            }
            this.p0.finishBackProgressPersistent(backEventCompat0, null);
            this.setState(4);
            return;
        }
        if(this.X) {
            v = 5;
        }
        this.setState(v);
    }

    public final int i(int v) {
        switch(v) {
            case 3: {
                return this.getExpandedOffset();
            }
            case 4: {
                return this.V;
            }
            case 5: {
                return this.j0;
            }
            case 6: {
                return this.T;
            }
            default: {
                throw new IllegalArgumentException("Invalid state to get top offset: " + v);
            }
        }
    }

    public boolean isDraggable() {
        return this.Z;
    }

    public boolean isFitToContents() {
        return this.p;
    }

    public boolean isGestureInsetBottomIgnored() {
        return this.C;
    }

    public boolean isHideable() {
        return this.X;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public boolean isHideableWhenDragging() [...] // Inlined contents

    @RestrictTo({Scope.LIBRARY_GROUP})
    public boolean isNestedScrollingCheckEnabled() [...] // Inlined contents

    public boolean isShouldRemoveExpandedCorners() {
        return this.M;
    }

    public final boolean j() {
        if(this.k0 != null && this.k0.get() != null) {
            int[] arr_v = new int[2];
            ((View)this.k0.get()).getLocationOnScreen(arr_v);
            return arr_v[1] == 0;
        }
        return false;
    }

    public final void k(BottomSheetDragHandleView bottomSheetDragHandleView0) {
        if(bottomSheetDragHandleView0 == null) {
            WeakReference weakReference0 = this.l0;
            if(weakReference0 != null) {
                this.e(1, ((View)weakReference0.get()));
                this.l0 = null;
                return;
            }
        }
        this.l0 = new WeakReference(bottomSheetDragHandleView0);
        this.o(1, bottomSheetDragHandleView0);
    }

    public final void l(int v) {
        if(this.a0 == v) {
            return;
        }
        this.a0 = v;
        if(v == 3 || v == 4 || v == 6 || this.X && v == 5) {
            this.b0 = v;
        }
        WeakReference weakReference0 = this.k0;
        if(weakReference0 == null) {
            return;
        }
        View view0 = (View)weakReference0.get();
        if(view0 == null) {
            return;
        }
        if(v == 3) {
            this.r(true);
        }
        else if(v == 4 || v == 5 || v == 6) {
            this.r(false);
        }
        this.q(v, true);
        for(int v1 = 0; true; ++v1) {
            ArrayList arrayList0 = this.n0;
            if(v1 >= arrayList0.size()) {
                break;
            }
            ((BottomSheetCallback)arrayList0.get(v1)).onStateChanged(view0, v);
        }
        this.p();
    }

    public final boolean m(View view0, float f) {
        if(this.Y) {
            return true;
        }
        if(view0.getTop() < this.V) {
            return false;
        }
        int v = this.c();
        float f1 = (float)view0.getTop();
        return Math.abs(f * this.g0 + f1 - ((float)this.V)) / ((float)v) > 0.5f;
    }

    public final void n(View view0, int v, boolean z) {
        int v1 = this.i(v);
        ViewDragHelper viewDragHelper0 = this.c0;
        if(viewDragHelper0 != null) {
            if(!z) {
                if(viewDragHelper0.smoothSlideViewTo(view0, view0.getLeft(), v1)) {
                    this.l(2);
                    this.q(v, true);
                    this.P.a(v);
                    return;
                }
            }
            else if(viewDragHelper0.settleCapturedViewAt(view0.getLeft(), v1)) {
                this.l(2);
                this.q(v, true);
                this.P.a(v);
                return;
            }
        }
        this.l(v);
    }

    public final void o(int v, View view0) {
        if(view0 == null) {
            return;
        }
        this.e(v, view0);
        int v1 = 6;
        if(!this.p && this.a0 != 6) {
            int v2 = string.bottomsheet_action_expand_halfway;
            int v3 = ViewCompat.addAccessibilityAction(view0, view0.getResources().getString(v2), new c(this, 6));
            this.u0.put(v, v3);
        }
        if(this.X && this.a0 != 5) {
            c c0 = new c(this, 5);
            ViewCompat.replaceAccessibilityAction(view0, AccessibilityActionCompat.ACTION_DISMISS, null, c0);
        }
        switch(this.a0) {
            case 3: {
                if(this.p) {
                    v1 = 4;
                }
                c c1 = new c(this, v1);
                ViewCompat.replaceAccessibilityAction(view0, AccessibilityActionCompat.ACTION_COLLAPSE, null, c1);
                return;
            }
            case 4: {
                if(this.p) {
                    v1 = 3;
                }
                c c2 = new c(this, v1);
                ViewCompat.replaceAccessibilityAction(view0, AccessibilityActionCompat.ACTION_EXPAND, null, c2);
                return;
            }
            case 6: {
                c c3 = new c(this, 4);
                ViewCompat.replaceAccessibilityAction(view0, AccessibilityActionCompat.ACTION_COLLAPSE, null, c3);
                c c4 = new c(this, 3);
                ViewCompat.replaceAccessibilityAction(view0, AccessibilityActionCompat.ACTION_EXPAND, null, c4);
            }
        }
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public void onAttachedToLayoutParams(@NonNull LayoutParams coordinatorLayout$LayoutParams0) {
        super.onAttachedToLayoutParams(coordinatorLayout$LayoutParams0);
        this.k0 = null;
        this.c0 = null;
        this.p0 = null;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.k0 = null;
        this.c0 = null;
        this.p0 = null;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull MotionEvent motionEvent0) {
        if(view0.isShown() && this.Z) {
            int v = motionEvent0.getActionMasked();
            View view1 = null;
            if(v == 0) {
                this.q0 = -1;
                this.r0 = -1;
                VelocityTracker velocityTracker0 = this.o0;
                if(velocityTracker0 != null) {
                    velocityTracker0.recycle();
                    this.o0 = null;
                }
            }
            if(this.o0 == null) {
                this.o0 = VelocityTracker.obtain();
            }
            this.o0.addMovement(motionEvent0);
            switch(v) {
                case 0: {
                    int v1 = (int)motionEvent0.getX();
                    this.r0 = (int)motionEvent0.getY();
                    if(this.a0 != 2) {
                        View view2 = this.m0 == null ? null : ((View)this.m0.get());
                        if(view2 != null && coordinatorLayout0.isPointInChildBounds(view2, v1, this.r0)) {
                            this.q0 = motionEvent0.getPointerId(motionEvent0.getActionIndex());
                            this.s0 = true;
                        }
                    }
                    this.d0 = this.q0 == -1 && !coordinatorLayout0.isPointInChildBounds(view0, v1, this.r0);
                    break;
                }
                case 1: {
                label_25:
                    this.s0 = false;
                    this.q0 = -1;
                    if(this.d0) {
                        this.d0 = false;
                        return false;
                    }
                    break;
                }
                default: {
                    if(v == 3) {
                        goto label_25;
                    }
                }
            }
            if(!this.d0 && (this.c0 != null && this.c0.shouldInterceptTouchEvent(motionEvent0))) {
                return true;
            }
            WeakReference weakReference0 = this.m0;
            if(weakReference0 != null) {
                view1 = (View)weakReference0.get();
            }
            return v == 2 && view1 != null && !this.d0 && this.a0 != 1 && !coordinatorLayout0.isPointInChildBounds(view1, ((int)motionEvent0.getX()), ((int)motionEvent0.getY())) && this.c0 != null && (this.r0 != -1 && Math.abs(((float)this.r0) - motionEvent0.getY()) > ((float)this.c0.getTouchSlop()));
        }
        this.d0 = true;
        return false;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, int v) {
        if(ViewCompat.getFitsSystemWindows(coordinatorLayout0) && !ViewCompat.getFitsSystemWindows(view0)) {
            view0.setFitsSystemWindows(true);
        }
        if(this.k0 == null) {
            this.v = coordinatorLayout0.getResources().getDimensionPixelSize(dimen.design_bottom_sheet_peek_height_min);
            boolean z = Build.VERSION.SDK_INT >= 29 && !this.isGestureInsetBottomIgnored() && !this.u;
            if(this.D || this.E || this.F || this.H || this.I || this.J || z) {
                ViewUtils.doOnApplyWindowInsets(view0, new r7.a(this, z));
            }
            ViewCompat.setWindowInsetsAnimationCallback(view0, new r7.e(view0));
            this.k0 = new WeakReference(view0);
            this.p0 = new MaterialBottomContainerBackHelper(view0);
            MaterialShapeDrawable materialShapeDrawable0 = this.x;
            if(materialShapeDrawable0 == null) {
                ColorStateList colorStateList0 = this.y;
                if(colorStateList0 != null) {
                    ViewCompat.setBackgroundTintList(view0, colorStateList0);
                }
            }
            else {
                ViewCompat.setBackground(view0, materialShapeDrawable0);
                float f = this.W == -1.0f ? ViewCompat.getElevation(view0) : this.W;
                this.x.setElevation(f);
            }
            this.p();
            if(ViewCompat.getImportantForAccessibility(view0) == 0) {
                ViewCompat.setImportantForAccessibility(view0, 1);
            }
        }
        if(this.c0 == null) {
            this.c0 = ViewDragHelper.create(coordinatorLayout0, this.v0);
        }
        int v2 = view0.getTop();
        coordinatorLayout0.onLayoutChild(view0, v);
        this.i0 = coordinatorLayout0.getWidth();
        this.j0 = coordinatorLayout0.getHeight();
        int v3 = view0.getHeight();
        this.h0 = v3;
        int v4 = this.j0;
        int v5 = this.L;
        if(v4 - v3 < v5) {
            if(this.G) {
                int v6 = this.A;
                if(v6 != -1) {
                    v4 = Math.min(v4, v6);
                }
                this.h0 = v4;
            }
            else {
                int v7 = v4 - v5;
                int v8 = this.A;
                if(v8 != -1) {
                    v7 = Math.min(v7, v8);
                }
                this.h0 = v7;
            }
        }
        this.S = Math.max(0, this.j0 - this.h0);
        this.T = (int)((1.0f - this.U) * ((float)this.j0));
        this.a();
        int v9 = this.a0;
        if(v9 == 3) {
            ViewCompat.offsetTopAndBottom(view0, this.getExpandedOffset());
        }
        else if(v9 == 6) {
            ViewCompat.offsetTopAndBottom(view0, this.T);
        }
        else if(!this.X || v9 != 5) {
            switch(v9) {
                case 1: 
                case 2: {
                    ViewCompat.offsetTopAndBottom(view0, v2 - view0.getTop());
                    break;
                }
                case 4: {
                    ViewCompat.offsetTopAndBottom(view0, this.V);
                }
            }
        }
        else {
            ViewCompat.offsetTopAndBottom(view0, this.j0);
        }
        this.q(this.a0, false);
        this.m0 = new WeakReference(BottomSheetBehavior.g(view0));
        for(int v1 = 0; true; ++v1) {
            ArrayList arrayList0 = this.n0;
            if(v1 >= arrayList0.size()) {
                break;
            }
            ((BottomSheetCallback)arrayList0.get(v1)).a(view0);
        }
        return true;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, int v, int v1, int v2, int v3) {
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view0.getLayoutParams();
        int v4 = coordinatorLayout0.getPaddingLeft();
        int v5 = BottomSheetBehavior.h(v, coordinatorLayout0.getPaddingRight() + v4 + viewGroup$MarginLayoutParams0.leftMargin + viewGroup$MarginLayoutParams0.rightMargin + v1, this.z, viewGroup$MarginLayoutParams0.width);
        int v6 = coordinatorLayout0.getPaddingTop();
        view0.measure(v5, BottomSheetBehavior.h(v2, coordinatorLayout0.getPaddingBottom() + v6 + viewGroup$MarginLayoutParams0.topMargin + viewGroup$MarginLayoutParams0.bottomMargin + v3, this.A, viewGroup$MarginLayoutParams0.height));
        return true;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public boolean onNestedPreFling(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1, float f, float f1) {
        return this.m0 != null && view1 == this.m0.get() && (this.a0 != 3 || super.onNestedPreFling(coordinatorLayout0, view0, view1, f, f1));
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1, int v, int v1, @NonNull int[] arr_v, int v2) {
        if(v2 == 1) {
            return;
        }
        if(view1 != (this.m0 == null ? null : ((View)this.m0.get()))) {
            return;
        }
        int v3 = view0.getTop();
        int v4 = v3 - v1;
        if(v1 <= 0) {
            if(v1 < 0 && !view1.canScrollVertically(-1)) {
                if(v4 <= this.V || this.isHideable()) {
                    if(!this.Z) {
                        return;
                    }
                    arr_v[1] = v1;
                    ViewCompat.offsetTopAndBottom(view0, -v1);
                    this.l(1);
                }
                else {
                    int v6 = v3 - this.V;
                    arr_v[1] = v6;
                    ViewCompat.offsetTopAndBottom(view0, -v6);
                    this.l(4);
                }
            }
        }
        else if(v4 < this.getExpandedOffset()) {
            int v5 = v3 - this.getExpandedOffset();
            arr_v[1] = v5;
            ViewCompat.offsetTopAndBottom(view0, -v5);
            this.l(3);
        }
        else {
            if(!this.Z) {
                return;
            }
            arr_v[1] = v1;
            ViewCompat.offsetTopAndBottom(view0, -v1);
            this.l(1);
        }
        this.f(view0.getTop());
        this.e0 = v1;
        this.f0 = true;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1, int v, int v1, int v2, int v3, int v4, @NonNull int[] arr_v) {
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull Parcelable parcelable0) {
        super.onRestoreInstanceState(coordinatorLayout0, view0, ((SavedState)parcelable0).getSuperState());
        int v = this.o;
        if(v != 0) {
            if(v == -1 || (v & 1) == 1) {
                this.t = ((SavedState)parcelable0).c;
            }
            if(v == -1 || (v & 2) == 2) {
                this.p = ((SavedState)parcelable0).d;
            }
            if(v == -1 || (v & 4) == 4) {
                this.X = ((SavedState)parcelable0).e;
            }
            if(v == -1 || (v & 8) == 8) {
                this.Y = ((SavedState)parcelable0).f;
            }
        }
        int v1 = ((SavedState)parcelable0).b;
        if(v1 != 1 && v1 != 2) {
            this.a0 = v1;
            this.b0 = v1;
            return;
        }
        this.a0 = 4;
        this.b0 = 4;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    @NonNull
    public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout0, view0), this);
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1, @NonNull View view2, int v, int v1) {
        this.e0 = 0;
        this.f0 = false;
        return (v & 2) != 0;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1, int v) {
        float f;
        int v1 = 3;
        if(view0.getTop() == this.getExpandedOffset()) {
            this.l(3);
            return;
        }
        if(this.m0 == null || view1 != this.m0.get() || !this.f0) {
            return;
        }
        if(this.e0 <= 0) {
            if(this.X) {
                VelocityTracker velocityTracker0 = this.o0;
                if(velocityTracker0 == null) {
                    f = 0.0f;
                }
                else {
                    velocityTracker0.computeCurrentVelocity(1000, this.r);
                    f = this.o0.getYVelocity(this.q0);
                }
                if(this.m(view0, f)) {
                    v1 = 5;
                    this.n(view0, v1, false);
                    this.f0 = false;
                    return;
                }
                goto label_20;
            }
            else {
            label_20:
                if(this.e0 == 0) {
                    int v2 = view0.getTop();
                    if(!this.p) {
                        int v3 = this.T;
                        if(v2 >= v3) {
                            v1 = Math.abs(v2 - v3) < Math.abs(v2 - this.V) ? 6 : 4;
                        }
                        else if(v2 >= Math.abs(v2 - this.V)) {
                            v1 = 6;
                        }
                    }
                    else if(Math.abs(v2 - this.S) >= Math.abs(v2 - this.V)) {
                        v1 = 4;
                    }
                }
                else if(this.p) {
                    v1 = 4;
                }
                else {
                    int v4 = view0.getTop();
                    v1 = Math.abs(v4 - this.T) < Math.abs(v4 - this.V) ? 6 : 4;
                }
            }
        }
        else if(!this.p && view0.getTop() > this.T) {
            v1 = 6;
        }
        this.n(view0, v1, false);
        this.f0 = false;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull MotionEvent motionEvent0) {
        if(!view0.isShown()) {
            return false;
        }
        int v = motionEvent0.getActionMasked();
        int v1 = this.a0;
        if(v1 == 1 && v == 0) {
            return true;
        }
        ViewDragHelper viewDragHelper0 = this.c0;
        if(viewDragHelper0 != null && (this.Z || v1 == 1)) {
            viewDragHelper0.processTouchEvent(motionEvent0);
        }
        if(v == 0) {
            this.q0 = -1;
            this.r0 = -1;
            VelocityTracker velocityTracker0 = this.o0;
            if(velocityTracker0 != null) {
                velocityTracker0.recycle();
                this.o0 = null;
            }
        }
        if(this.o0 == null) {
            this.o0 = VelocityTracker.obtain();
        }
        this.o0.addMovement(motionEvent0);
        if(this.c0 != null && (this.Z || this.a0 == 1) && v == 2 && !this.d0 && Math.abs(((float)this.r0) - motionEvent0.getY()) > ((float)this.c0.getTouchSlop())) {
            this.c0.captureChildView(view0, motionEvent0.getPointerId(motionEvent0.getActionIndex()));
        }
        return !this.d0;
    }

    public final void p() {
        WeakReference weakReference0 = this.k0;
        if(weakReference0 != null) {
            this.o(0, ((View)weakReference0.get()));
        }
        WeakReference weakReference1 = this.l0;
        if(weakReference1 != null) {
            this.o(1, ((View)weakReference1.get()));
        }
    }

    public final void q(int v, boolean z) {
        MaterialShapeDrawable materialShapeDrawable0 = this.x;
        if(v == 2) {
            return;
        }
        boolean z1 = this.a0 == 3 && (this.M || this.j());
        if(this.O != z1 && materialShapeDrawable0 != null) {
            this.O = z1;
            float f = 1.0f;
            if(z) {
                ValueAnimator valueAnimator0 = this.Q;
                if(valueAnimator0 != null) {
                    if(valueAnimator0.isRunning()) {
                        this.Q.reverse();
                        return;
                    }
                    float f1 = materialShapeDrawable0.getInterpolation();
                    if(z1) {
                        f = this.b();
                    }
                    this.Q.setFloatValues(new float[]{f1, f});
                    this.Q.start();
                    return;
                }
            }
            if(this.Q != null && this.Q.isRunning()) {
                this.Q.cancel();
            }
            if(this.O) {
                f = this.b();
            }
            materialShapeDrawable0.setInterpolation(f);
        }
    }

    public final void r(boolean z) {
        WeakReference weakReference0 = this.k0;
        if(weakReference0 == null) {
            return;
        }
        ViewParent viewParent0 = ((View)weakReference0.get()).getParent();
        if(!(viewParent0 instanceof CoordinatorLayout)) {
            return;
        }
        int v = ((CoordinatorLayout)viewParent0).getChildCount();
        if(z) {
            if(this.t0 == null) {
                this.t0 = new HashMap(v);
                goto label_12;
            }
            return;
        }
    label_12:
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = ((CoordinatorLayout)viewParent0).getChildAt(v1);
            if(view0 != this.k0.get()) {
                if(z) {
                    this.t0.put(view0, view0.getImportantForAccessibility());
                    if(this.q) {
                        ViewCompat.setImportantForAccessibility(view0, 4);
                    }
                }
                else if(this.q && (this.t0 != null && this.t0.containsKey(view0))) {
                    ViewCompat.setImportantForAccessibility(view0, ((int)(((Integer)this.t0.get(view0)))));
                }
            }
        }
        if(!z) {
            this.t0 = null;
            return;
        }
        if(this.q) {
            ((View)this.k0.get()).sendAccessibilityEvent(8);
        }
    }

    public void removeBottomSheetCallback(@NonNull BottomSheetCallback bottomSheetBehavior$BottomSheetCallback0) {
        this.n0.remove(bottomSheetBehavior$BottomSheetCallback0);
    }

    public final void s(boolean z) {
        if(this.k0 != null) {
            this.a();
            if(this.a0 == 4) {
                View view0 = (View)this.k0.get();
                if(view0 != null) {
                    if(z) {
                        this.setState(4);
                        return;
                    }
                    view0.requestLayout();
                }
            }
        }
    }

    @Deprecated
    public void setBottomSheetCallback(BottomSheetCallback bottomSheetBehavior$BottomSheetCallback0) {
        Log.w("BottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        ArrayList arrayList0 = this.n0;
        arrayList0.clear();
        if(bottomSheetBehavior$BottomSheetCallback0 != null) {
            arrayList0.add(bottomSheetBehavior$BottomSheetCallback0);
        }
    }

    public void setDraggable(boolean z) {
        this.Z = z;
    }

    public void setExpandedOffset(int v) {
        if(v < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.R = v;
        this.q(this.a0, true);
    }

    public void setFitToContents(boolean z) {
        if(this.p == z) {
            return;
        }
        this.p = z;
        if(this.k0 != null) {
            this.a();
        }
        this.l((!this.p || this.a0 != 6 ? this.a0 : 3));
        this.q(this.a0, true);
        this.p();
    }

    public void setGestureInsetBottomIgnored(boolean z) {
        this.C = z;
    }

    public void setHalfExpandedRatio(@FloatRange(from = 0.0, fromInclusive = false, to = 1.0, toInclusive = false) float f) {
        if(f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.U = f;
        if(this.k0 != null) {
            this.T = (int)((1.0f - f) * ((float)this.j0));
        }
    }

    public void setHideFriction(float f) {
        this.g0 = f;
    }

    public void setHideable(boolean z) {
        if(this.X != z) {
            this.X = z;
            if(!z && this.a0 == 5) {
                this.setState(4);
            }
            this.p();
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void setHideableInternal(boolean z) {
        this.X = z;
    }

    public void setMaxHeight(@Px int v) {
        this.A = v;
    }

    public void setMaxWidth(@Px int v) {
        this.z = v;
    }

    public void setPeekHeight(int v) {
        this.setPeekHeight(v, false);
    }

    public final void setPeekHeight(int v, boolean z) {
        if(v == -1) {
            if(!this.u) {
                this.u = true;
                this.s(z);
            }
        }
        else if(this.u || this.t != v) {
            this.u = false;
            this.t = Math.max(0, v);
            this.s(z);
        }
    }

    public void setSaveFlags(int v) {
        this.o = v;
    }

    public void setShouldRemoveExpandedCorners(boolean z) {
        if(this.M != z) {
            this.M = z;
            this.q(this.getState(), true);
        }
    }

    public void setSignificantVelocityThreshold(int v) {
        this.s = v;
    }

    public void setSkipCollapsed(boolean z) {
        this.Y = z;
    }

    public void setState(int v) {
        if(v == 1 || v == 2) {
            throw new IllegalArgumentException(r0.a.o(new StringBuilder("STATE_"), (v == 1 ? "DRAGGING" : "SETTLING"), " should not be set externally."));
        }
        if(!this.X && v == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + 5);
            return;
        }
        int v1 = v != 6 || !this.p || this.i(6) > this.S ? v : 3;
        if(this.k0 != null && this.k0.get() != null) {
            View view0 = (View)this.k0.get();
            w0 w00 = new w0(this, view0, v1);
            ViewParent viewParent0 = view0.getParent();
            if(viewParent0 != null && viewParent0.isLayoutRequested() && ViewCompat.isAttachedToWindow(view0)) {
                view0.post(w00);
                return;
            }
            w00.run();
            return;
        }
        this.l(v);
    }

    public void setUpdateImportantForAccessibilityOnSiblings(boolean z) {
        this.q = z;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public boolean shouldExpandOnUpwardDrag(long v, @FloatRange(from = 0.0, to = 100.0) float f) {
        return false;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public boolean shouldSkipHalfExpandedStateWhenDragging() [...] // Inlined contents

    @RestrictTo({Scope.LIBRARY_GROUP})
    public boolean shouldSkipSmoothAnimation() [...] // Inlined contents

    @Override  // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(@NonNull BackEventCompat backEventCompat0) {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper0 = this.p0;
        if(materialBottomContainerBackHelper0 == null) {
            return;
        }
        materialBottomContainerBackHelper0.startBackProgress(backEventCompat0);
    }

    @Override  // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(@NonNull BackEventCompat backEventCompat0) {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper0 = this.p0;
        if(materialBottomContainerBackHelper0 == null) {
            return;
        }
        materialBottomContainerBackHelper0.updateBackProgress(backEventCompat0);
    }
}

