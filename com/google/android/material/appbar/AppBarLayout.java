package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.math.MathUtils;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.core.view.z0;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import com.google.android.material.R.integer;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class AppBarLayout extends LinearLayout implements AttachedBehavior {
    public static class BaseBehavior extends HeaderBehavior {
        public static abstract class BaseDragCallback {
            public abstract boolean canDrag(@NonNull AppBarLayout arg1);
        }

        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator CREATOR;
            public boolean b;
            public boolean c;
            public int d;
            public float e;
            public boolean f;

            static {
                SavedState.CREATOR = new f();  // 初始化器: Ljava/lang/Object;-><init>()V
            }

            public SavedState(@NonNull Parcel parcel0, ClassLoader classLoader0) {
                super(parcel0, classLoader0);
                boolean z = false;
                this.b = parcel0.readByte() != 0;
                this.c = parcel0.readByte() != 0;
                this.d = parcel0.readInt();
                this.e = parcel0.readFloat();
                if(parcel0.readByte() != 0) {
                    z = true;
                }
                this.f = z;
            }

            public SavedState(Parcelable parcelable0) {
                super(parcelable0);
            }

            @Override  // androidx.customview.view.AbsSavedState
            public void writeToParcel(@NonNull Parcel parcel0, int v) {
                super.writeToParcel(parcel0, v);
                parcel0.writeByte(((byte)this.b));
                parcel0.writeByte(((byte)this.c));
                parcel0.writeInt(this.d);
                parcel0.writeFloat(this.e);
                parcel0.writeByte(((byte)this.f));
            }
        }

        public ValueAnimator A;
        public SavedState B;
        public WeakReference C;
        public BaseDragCallback D;
        public boolean E;
        public int y;
        public int z;

        public BaseBehavior() {
            this.u = -1;
            this.w = -1;
        }

        public BaseBehavior(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
        }

        @Override  // com.google.android.material.appbar.ViewOffsetBehavior
        public final int a() {
            return this.getTopAndBottomOffset() + this.y;
        }

        @Override  // com.google.android.material.appbar.HeaderBehavior
        public final boolean b(View view0) {
            BaseDragCallback appBarLayout$BaseBehavior$BaseDragCallback0 = this.D;
            if(appBarLayout$BaseBehavior$BaseDragCallback0 != null) {
                return appBarLayout$BaseBehavior$BaseDragCallback0.canDrag(((AppBarLayout)view0));
            }
            WeakReference weakReference0 = this.C;
            if(weakReference0 != null) {
                View view1 = (View)weakReference0.get();
                return view1 != null && view1.isShown() && !view1.canScrollVertically(-1);
            }
            return true;
        }

        @Override  // com.google.android.material.appbar.HeaderBehavior
        public final int c(View view0) {
            int v = ((AppBarLayout)view0).getDownNestedScrollRange();
            return ((AppBarLayout)view0).getTopInset() - v;
        }

        @Override  // com.google.android.material.appbar.HeaderBehavior
        public final int d(View view0) {
            return ((AppBarLayout)view0).getTotalScrollRange();
        }

        @Override  // com.google.android.material.appbar.HeaderBehavior
        public final void e(CoordinatorLayout coordinatorLayout0, View view0) {
            this.k(coordinatorLayout0, ((AppBarLayout)view0));
            if(((AppBarLayout)view0).isLiftOnScroll()) {
                ((AppBarLayout)view0).c(((AppBarLayout)view0).d(BaseBehavior.i(coordinatorLayout0)), !((AppBarLayout)view0).i);
            }
        }

        @Override  // com.google.android.material.appbar.HeaderBehavior
        public final int f(CoordinatorLayout coordinatorLayout0, View view0, int v, int v1, int v2) {
            int v12;
            int v10;
            int v3 = this.a();
            int v4 = 0;
            if(v1 == 0 || v3 < v1 || v3 > v2) {
                this.y = 0;
            }
            else {
                int v5 = MathUtils.clamp(v, v1, v2);
                if(v3 != v5) {
                    if(((AppBarLayout)view0).e) {
                        int v6 = Math.abs(v5);
                        int v7 = ((AppBarLayout)view0).getChildCount();
                        int v8 = 0;
                        while(v8 < v7) {
                            View view1 = ((AppBarLayout)view0).getChildAt(v8);
                            LayoutParams appBarLayout$LayoutParams0 = (LayoutParams)view1.getLayoutParams();
                            Interpolator interpolator0 = appBarLayout$LayoutParams0.getScrollInterpolator();
                            if(v6 >= view1.getTop() && v6 <= view1.getBottom()) {
                                if(interpolator0 == null) {
                                    break;
                                }
                                int v9 = appBarLayout$LayoutParams0.getScrollFlags();
                                if((v9 & 1) == 0) {
                                    v10 = 0;
                                }
                                else {
                                    v10 = view1.getHeight() + appBarLayout$LayoutParams0.topMargin + appBarLayout$LayoutParams0.bottomMargin;
                                    if((v9 & 2) != 0) {
                                        v10 -= ViewCompat.getMinimumHeight(view1);
                                    }
                                }
                                if(ViewCompat.getFitsSystemWindows(view1)) {
                                    v10 -= ((AppBarLayout)view0).getTopInset();
                                }
                                if(v10 <= 0) {
                                    break;
                                }
                                int v11 = Math.round(interpolator0.getInterpolation(((float)(v6 - view1.getTop())) / ((float)v10)) * ((float)v10));
                                v12 = (view1.getTop() + v11) * Integer.signum(v5);
                                goto label_31;
                            }
                            ++v8;
                        }
                    }
                    v12 = v5;
                label_31:
                    boolean z = this.setTopAndBottomOffset(v12);
                    this.y = v5 - v12;
                    int v13 = 1;
                    if(z) {
                        for(int v14 = 0; v14 < ((AppBarLayout)view0).getChildCount(); ++v14) {
                            LayoutParams appBarLayout$LayoutParams1 = (LayoutParams)((AppBarLayout)view0).getChildAt(v14).getLayoutParams();
                            ChildScrollEffect appBarLayout$ChildScrollEffect0 = appBarLayout$LayoutParams1.getScrollEffect();
                            if(appBarLayout$ChildScrollEffect0 != null && (appBarLayout$LayoutParams1.getScrollFlags() & 1) != 0) {
                                appBarLayout$ChildScrollEffect0.onOffsetChanged(((AppBarLayout)view0), ((AppBarLayout)view0).getChildAt(v14), ((float)this.getTopAndBottomOffset()));
                            }
                        }
                    }
                    if(!z && ((AppBarLayout)view0).e) {
                        coordinatorLayout0.dispatchDependentViewsChanged(((AppBarLayout)view0));
                    }
                    ((AppBarLayout)view0).b(this.getTopAndBottomOffset());
                    if(v5 < v3) {
                        v13 = -1;
                    }
                    BaseBehavior.m(coordinatorLayout0, ((AppBarLayout)view0), v5, v13, false);
                    v4 = v3 - v5;
                }
            }
            this.l(coordinatorLayout0, ((AppBarLayout)view0));
            return v4;
        }

        public final void h(CoordinatorLayout coordinatorLayout0, AppBarLayout appBarLayout0, int v) {
            int v1 = (int)((((float)Math.abs(this.a() - v)) / ((float)appBarLayout0.getHeight()) + 1.0f) * 150.0f);
            int v2 = this.a();
            if(v2 != v) {
                ValueAnimator valueAnimator0 = this.A;
                if(valueAnimator0 == null) {
                    ValueAnimator valueAnimator1 = new ValueAnimator();
                    this.A = valueAnimator1;
                    valueAnimator1.setInterpolator(AnimationUtils.DECELERATE_INTERPOLATOR);
                    this.A.addUpdateListener(new b(this, coordinatorLayout0, appBarLayout0));
                }
                else {
                    valueAnimator0.cancel();
                }
                this.A.setDuration(((long)Math.min(v1, 600)));
                this.A.setIntValues(new int[]{v2, v});
                this.A.start();
            }
            else if(this.A != null && this.A.isRunning()) {
                this.A.cancel();
            }
        }

        public static View i(CoordinatorLayout coordinatorLayout0) {
            int v = coordinatorLayout0.getChildCount();
            int v1 = 0;
            while(v1 < v) {
                View view0 = coordinatorLayout0.getChildAt(v1);
                if(!(view0 instanceof NestedScrollingChild) && !(view0 instanceof AbsListView) && !(view0 instanceof ScrollView)) {
                    ++v1;
                    continue;
                }
                return view0;
            }
            return null;
        }

        public final SavedState j(Parcelable parcelable0, AppBarLayout appBarLayout0) {
            int v = this.getTopAndBottomOffset();
            int v1 = appBarLayout0.getChildCount();
            boolean z = false;
            for(int v2 = 0; v2 < v1; ++v2) {
                View view0 = appBarLayout0.getChildAt(v2);
                int v3 = view0.getBottom() + v;
                if(view0.getTop() + v <= 0 && v3 >= 0) {
                    if(parcelable0 == null) {
                        parcelable0 = AbsSavedState.EMPTY_STATE;
                    }
                    SavedState appBarLayout$BaseBehavior$SavedState0 = new SavedState(parcelable0);
                    appBarLayout$BaseBehavior$SavedState0.c = v == 0;
                    appBarLayout$BaseBehavior$SavedState0.b = v != 0 && -v >= appBarLayout0.getTotalScrollRange();
                    appBarLayout$BaseBehavior$SavedState0.d = v2;
                    int v4 = ViewCompat.getMinimumHeight(view0);
                    if(v3 == appBarLayout0.getTopInset() + v4) {
                        z = true;
                    }
                    appBarLayout$BaseBehavior$SavedState0.f = z;
                    appBarLayout$BaseBehavior$SavedState0.e = ((float)v3) / ((float)view0.getHeight());
                    return appBarLayout$BaseBehavior$SavedState0;
                }
            }
            return null;
        }

        public final void k(CoordinatorLayout coordinatorLayout0, AppBarLayout appBarLayout0) {
            int v = appBarLayout0.getTopInset();
            int v1 = appBarLayout0.getPaddingTop() + v;
            int v2 = this.a() - v1;
            int v3 = appBarLayout0.getChildCount();
            int v4;
            for(v4 = 0; true; ++v4) {
                if(v4 >= v3) {
                    v4 = -1;
                    break;
                }
                View view0 = appBarLayout0.getChildAt(v4);
                int v5 = view0.getTop();
                int v6 = view0.getBottom();
                LayoutParams appBarLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                if((appBarLayout$LayoutParams0.getScrollFlags() & 0x20) == 0x20) {
                    v5 -= appBarLayout$LayoutParams0.topMargin;
                    v6 += appBarLayout$LayoutParams0.bottomMargin;
                }
                if(v5 <= -v2 && v6 >= -v2) {
                    break;
                }
            }
            if(v4 >= 0) {
                View view1 = appBarLayout0.getChildAt(v4);
                LayoutParams appBarLayout$LayoutParams1 = (LayoutParams)view1.getLayoutParams();
                int v7 = appBarLayout$LayoutParams1.getScrollFlags();
                if((v7 & 17) == 17) {
                    int v8 = -view1.getTop();
                    int v9 = -view1.getBottom();
                    if(v4 == 0 && ViewCompat.getFitsSystemWindows(appBarLayout0) && ViewCompat.getFitsSystemWindows(view1)) {
                        v8 -= appBarLayout0.getTopInset();
                    }
                    if((v7 & 2) == 2) {
                        v9 += ViewCompat.getMinimumHeight(view1);
                    }
                    else if((v7 & 5) == 5) {
                        int v10 = ViewCompat.getMinimumHeight(view1) + v9;
                        if(v2 < v10) {
                            v8 = v10;
                        }
                        else {
                            v9 = v10;
                        }
                    }
                    if((v7 & 0x20) == 0x20) {
                        v8 += appBarLayout$LayoutParams1.topMargin;
                        v9 -= appBarLayout$LayoutParams1.bottomMargin;
                    }
                    if(v2 < (v9 + v8) / 2) {
                        v8 = v9;
                    }
                    this.h(coordinatorLayout0, appBarLayout0, MathUtils.clamp(v8 + v1, -appBarLayout0.getTotalScrollRange(), 0));
                }
            }
        }

        public final void l(CoordinatorLayout coordinatorLayout0, AppBarLayout appBarLayout0) {
            View view0;
            ViewCompat.removeAccessibilityAction(coordinatorLayout0, AccessibilityActionCompat.ACTION_SCROLL_FORWARD.getId());
            ViewCompat.removeAccessibilityAction(coordinatorLayout0, AccessibilityActionCompat.ACTION_SCROLL_BACKWARD.getId());
            if(appBarLayout0.getTotalScrollRange() == 0) {
                return;
            }
            int v = coordinatorLayout0.getChildCount();
            boolean z = false;
            for(int v1 = 0; true; ++v1) {
                view0 = null;
                if(v1 >= v) {
                    break;
                }
                View view1 = coordinatorLayout0.getChildAt(v1);
                if(((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams)view1.getLayoutParams()).getBehavior() instanceof ScrollingViewBehavior) {
                    view0 = view1;
                    break;
                }
            }
            if(view0 == null) {
                return;
            }
            int v2 = appBarLayout0.getChildCount();
            for(int v3 = 0; v3 < v2; ++v3) {
                if(((LayoutParams)appBarLayout0.getChildAt(v3).getLayoutParams()).a != 0) {
                    if(!ViewCompat.hasAccessibilityDelegate(coordinatorLayout0)) {
                        ViewCompat.setAccessibilityDelegate(coordinatorLayout0, new c(this));
                    }
                    boolean z1 = true;
                    if(this.a() != -appBarLayout0.getTotalScrollRange()) {
                        e e0 = new e(appBarLayout0, false);
                        ViewCompat.replaceAccessibilityAction(coordinatorLayout0, AccessibilityActionCompat.ACTION_SCROLL_FORWARD, null, e0);
                        z = true;
                    }
                    if(this.a() == 0) {
                        z1 = z;
                    }
                    else if(view0.canScrollVertically(-1)) {
                        int v4 = appBarLayout0.getDownNestedPreScrollRange();
                        if(-v4 == 0) {
                            z1 = z;
                        }
                        else {
                            d d0 = new d(this, coordinatorLayout0, appBarLayout0, view0, -v4);
                            ViewCompat.replaceAccessibilityAction(coordinatorLayout0, AccessibilityActionCompat.ACTION_SCROLL_BACKWARD, null, d0);
                        }
                    }
                    else {
                        e e1 = new e(appBarLayout0, true);
                        ViewCompat.replaceAccessibilityAction(coordinatorLayout0, AccessibilityActionCompat.ACTION_SCROLL_BACKWARD, null, e1);
                    }
                    this.E = z1;
                    return;
                }
            }
        }

        public static void m(CoordinatorLayout coordinatorLayout0, AppBarLayout appBarLayout0, int v, int v1, boolean z) {
            boolean z1;
            View view0;
            int v2 = Math.abs(v);
            int v3 = appBarLayout0.getChildCount();
            int v4 = 0;
            for(int v5 = 0; true; ++v5) {
                view0 = null;
                if(v5 >= v3) {
                    break;
                }
                View view1 = appBarLayout0.getChildAt(v5);
                if(v2 >= view1.getTop() && v2 <= view1.getBottom()) {
                    view0 = view1;
                    break;
                }
            }
            if(view0 == null) {
                z1 = false;
            }
            else {
                int v6 = ((LayoutParams)view0.getLayoutParams()).getScrollFlags();
                if((v6 & 1) == 0) {
                    z1 = false;
                }
                else {
                    int v7 = ViewCompat.getMinimumHeight(view0);
                    if(v1 <= 0 || (v6 & 12) == 0) {
                        z1 = (v6 & 2) == 0 || -v < view0.getBottom() - v7 - appBarLayout0.getTopInset() ? false : true;
                    }
                    else if(-v >= view0.getBottom() - v7 - appBarLayout0.getTopInset()) {
                        z1 = true;
                    }
                    else {
                        z1 = false;
                    }
                }
            }
            if(appBarLayout0.isLiftOnScroll()) {
                z1 = appBarLayout0.d(BaseBehavior.i(coordinatorLayout0));
            }
            boolean z2 = appBarLayout0.c(z1, !appBarLayout0.i);
            if(z) {
            label_46:
                if(appBarLayout0.getBackground() != null) {
                    appBarLayout0.getBackground().jumpToCurrentState();
                }
                if(appBarLayout0.getForeground() != null) {
                    appBarLayout0.getForeground().jumpToCurrentState();
                }
                if(appBarLayout0.getStateListAnimator() != null) {
                    appBarLayout0.getStateListAnimator().jumpToCurrentState();
                }
            }
            else if(z2) {
                List list0 = coordinatorLayout0.getDependents(appBarLayout0);
                int v8 = list0.size();
                while(v4 < v8) {
                    Behavior coordinatorLayout$Behavior0 = ((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams)((View)list0.get(v4)).getLayoutParams()).getBehavior();
                    if(coordinatorLayout$Behavior0 instanceof ScrollingViewBehavior) {
                        if(((ScrollingViewBehavior)coordinatorLayout$Behavior0).getOverlayTop() == 0) {
                            return;
                        }
                        goto label_46;
                    }
                    ++v4;
                }
            }
        }

        @Override  // com.google.android.material.appbar.ViewOffsetBehavior
        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, int v) {
            return this.onLayoutChild(coordinatorLayout0, ((AppBarLayout)view0), v);
        }

        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull AppBarLayout appBarLayout0, int v) {
            int v4;
            super.onLayoutChild(coordinatorLayout0, appBarLayout0, v);
            int v1 = appBarLayout0.getPendingAction();
            SavedState appBarLayout$BaseBehavior$SavedState0 = this.B;
            if(appBarLayout$BaseBehavior$SavedState0 == null || (v1 & 8) != 0) {
                if(v1 != 0) {
                    boolean z = (v1 & 4) != 0;
                    if((v1 & 2) != 0) {
                        int v5 = appBarLayout0.getUpNestedPreScrollRange();
                        if(z) {
                            this.h(coordinatorLayout0, appBarLayout0, -v5);
                        }
                        else {
                            this.g(coordinatorLayout0, appBarLayout0, -v5);
                        }
                    }
                    else if((v1 & 1) != 0) {
                        if(z) {
                            this.h(coordinatorLayout0, appBarLayout0, 0);
                        }
                        else {
                            this.g(coordinatorLayout0, appBarLayout0, 0);
                        }
                    }
                }
            }
            else if(appBarLayout$BaseBehavior$SavedState0.b) {
                this.g(coordinatorLayout0, appBarLayout0, -appBarLayout0.getTotalScrollRange());
            }
            else if(appBarLayout$BaseBehavior$SavedState0.c) {
                this.g(coordinatorLayout0, appBarLayout0, 0);
            }
            else {
                View view0 = appBarLayout0.getChildAt(appBarLayout$BaseBehavior$SavedState0.d);
                int v2 = view0.getBottom();
                if(this.B.f) {
                    int v3 = ViewCompat.getMinimumHeight(view0);
                    v4 = appBarLayout0.getTopInset() + v3 - v2;
                }
                else {
                    v4 = Math.round(((float)view0.getHeight()) * this.B.e) - v2;
                }
                this.g(coordinatorLayout0, appBarLayout0, v4);
            }
            appBarLayout0.f = 0;
            this.B = null;
            this.setTopAndBottomOffset(MathUtils.clamp(this.getTopAndBottomOffset(), -appBarLayout0.getTotalScrollRange(), 0));
            BaseBehavior.m(coordinatorLayout0, appBarLayout0, this.getTopAndBottomOffset(), 0, true);
            appBarLayout0.b(this.getTopAndBottomOffset());
            this.l(coordinatorLayout0, appBarLayout0);
            return true;
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, int v, int v1, int v2, int v3) {
            return this.onMeasureChild(coordinatorLayout0, ((AppBarLayout)view0), v, v1, v2, v3);
        }

        public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull AppBarLayout appBarLayout0, int v, int v1, int v2, int v3) {
            if(((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams)appBarLayout0.getLayoutParams()).height == -2) {
                coordinatorLayout0.onMeasureChild(appBarLayout0, v, v1, 0, v3);
                return true;
            }
            return super.onMeasureChild(coordinatorLayout0, appBarLayout0, v, v1, v2, v3);
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout0, @NonNull View view0, View view1, int v, int v1, int[] arr_v, int v2) {
            this.onNestedPreScroll(coordinatorLayout0, ((AppBarLayout)view0), view1, v, v1, arr_v, v2);
        }

        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout0, @NonNull AppBarLayout appBarLayout0, View view0, int v, int v1, int[] arr_v, int v2) {
            int v4;
            int v3;
            if(v1 != 0) {
                if(v1 < 0) {
                    v3 = -appBarLayout0.getTotalScrollRange();
                    v4 = appBarLayout0.getDownNestedPreScrollRange() + v3;
                }
                else {
                    v3 = -appBarLayout0.getUpNestedPreScrollRange();
                    v4 = 0;
                }
                if(v3 != v4) {
                    arr_v[1] = this.f(coordinatorLayout0, appBarLayout0, this.a() - v1, v3, v4);
                }
            }
            if(appBarLayout0.isLiftOnScroll()) {
                appBarLayout0.c(appBarLayout0.d(view0), !appBarLayout0.i);
            }
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public void onNestedScroll(CoordinatorLayout coordinatorLayout0, @NonNull View view0, View view1, int v, int v1, int v2, int v3, int v4, int[] arr_v) {
            this.onNestedScroll(coordinatorLayout0, ((AppBarLayout)view0), view1, v, v1, v2, v3, v4, arr_v);
        }

        public void onNestedScroll(CoordinatorLayout coordinatorLayout0, @NonNull AppBarLayout appBarLayout0, View view0, int v, int v1, int v2, int v3, int v4, int[] arr_v) {
            if(v3 < 0) {
                int v5 = appBarLayout0.getDownNestedScrollRange();
                arr_v[1] = this.f(coordinatorLayout0, appBarLayout0, this.a() - v3, -v5, 0);
            }
            if(v3 == 0) {
                this.l(coordinatorLayout0, appBarLayout0);
            }
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, Parcelable parcelable0) {
            this.onRestoreInstanceState(coordinatorLayout0, ((AppBarLayout)view0), parcelable0);
        }

        public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull AppBarLayout appBarLayout0, Parcelable parcelable0) {
            if(parcelable0 instanceof SavedState) {
                this.B = (SavedState)parcelable0;
                super.onRestoreInstanceState(coordinatorLayout0, appBarLayout0, ((SavedState)parcelable0).getSuperState());
                return;
            }
            super.onRestoreInstanceState(coordinatorLayout0, appBarLayout0, parcelable0);
            this.B = null;
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0) {
            return this.onSaveInstanceState(coordinatorLayout0, ((AppBarLayout)view0));
        }

        public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull AppBarLayout appBarLayout0) {
            Parcelable parcelable0 = super.onSaveInstanceState(coordinatorLayout0, appBarLayout0);
            SavedState appBarLayout$BaseBehavior$SavedState0 = this.j(parcelable0, appBarLayout0);
            return appBarLayout$BaseBehavior$SavedState0 != null ? appBarLayout$BaseBehavior$SavedState0 : parcelable0;
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1, View view2, int v, int v1) {
            return this.onStartNestedScroll(coordinatorLayout0, ((AppBarLayout)view0), view1, view2, v, v1);
        }

        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull AppBarLayout appBarLayout0, @NonNull View view0, View view1, int v, int v1) {
            boolean z = (v & 2) != 0 && (appBarLayout0.isLiftOnScroll() || appBarLayout0.getTotalScrollRange() != 0 && coordinatorLayout0.getHeight() - view0.getHeight() <= appBarLayout0.getHeight());
            if(z) {
                ValueAnimator valueAnimator0 = this.A;
                if(valueAnimator0 != null) {
                    valueAnimator0.cancel();
                }
            }
            this.C = null;
            this.z = v1;
            return z;
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout0, @NonNull View view0, View view1, int v) {
            this.onStopNestedScroll(coordinatorLayout0, ((AppBarLayout)view0), view1, v);
        }

        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout0, @NonNull AppBarLayout appBarLayout0, View view0, int v) {
            if(this.z == 0 || v == 1) {
                this.k(coordinatorLayout0, appBarLayout0);
                if(appBarLayout0.isLiftOnScroll()) {
                    appBarLayout0.c(appBarLayout0.d(view0), !appBarLayout0.i);
                }
            }
            this.C = new WeakReference(view0);
        }

        public void setDragCallback(@Nullable BaseDragCallback appBarLayout$BaseBehavior$BaseDragCallback0) {
            this.D = appBarLayout$BaseBehavior$BaseDragCallback0;
        }
    }

    public interface BaseOnOffsetChangedListener {
        void onOffsetChanged(AppBarLayout arg1, int arg2);
    }

    public static class com.google.android.material.appbar.AppBarLayout.Behavior extends BaseBehavior {
        public static abstract class DragCallback extends BaseDragCallback {
        }

        public com.google.android.material.appbar.AppBarLayout.Behavior() {
        }

        public com.google.android.material.appbar.AppBarLayout.Behavior(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
        }

        @Override  // com.google.android.material.appbar.ViewOffsetBehavior
        public int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        @Override  // com.google.android.material.appbar.ViewOffsetBehavior
        public int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        @Override  // com.google.android.material.appbar.ViewOffsetBehavior
        public boolean isHorizontalOffsetEnabled() {
            return super.isHorizontalOffsetEnabled();
        }

        @Override  // com.google.android.material.appbar.ViewOffsetBehavior
        public boolean isVerticalOffsetEnabled() {
            return super.isVerticalOffsetEnabled();
        }

        @Override  // com.google.android.material.appbar.HeaderBehavior
        public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull MotionEvent motionEvent0) {
            return super.onInterceptTouchEvent(coordinatorLayout0, view0, motionEvent0);
        }

        @Override  // com.google.android.material.appbar.AppBarLayout$BaseBehavior
        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull AppBarLayout appBarLayout0, int v) {
            return super.onLayoutChild(coordinatorLayout0, appBarLayout0, v);
        }

        @Override  // com.google.android.material.appbar.AppBarLayout$BaseBehavior
        public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull AppBarLayout appBarLayout0, int v, int v1, int v2, int v3) {
            return super.onMeasureChild(coordinatorLayout0, appBarLayout0, v, v1, v2, v3);
        }

        @Override  // com.google.android.material.appbar.AppBarLayout$BaseBehavior
        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout0, @NonNull AppBarLayout appBarLayout0, View view0, int v, int v1, int[] arr_v, int v2) {
            super.onNestedPreScroll(coordinatorLayout0, appBarLayout0, view0, v, v1, arr_v, v2);
        }

        @Override  // com.google.android.material.appbar.AppBarLayout$BaseBehavior
        public void onNestedScroll(CoordinatorLayout coordinatorLayout0, @NonNull AppBarLayout appBarLayout0, View view0, int v, int v1, int v2, int v3, int v4, int[] arr_v) {
            super.onNestedScroll(coordinatorLayout0, appBarLayout0, view0, v, v1, v2, v3, v4, arr_v);
        }

        @Override  // com.google.android.material.appbar.AppBarLayout$BaseBehavior
        public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull AppBarLayout appBarLayout0, Parcelable parcelable0) {
            super.onRestoreInstanceState(coordinatorLayout0, appBarLayout0, parcelable0);
        }

        @Override  // com.google.android.material.appbar.AppBarLayout$BaseBehavior
        public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull AppBarLayout appBarLayout0) {
            return super.onSaveInstanceState(coordinatorLayout0, appBarLayout0);
        }

        @Override  // com.google.android.material.appbar.AppBarLayout$BaseBehavior
        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull AppBarLayout appBarLayout0, @NonNull View view0, View view1, int v, int v1) {
            return super.onStartNestedScroll(coordinatorLayout0, appBarLayout0, view0, view1, v, v1);
        }

        @Override  // com.google.android.material.appbar.AppBarLayout$BaseBehavior
        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout0, @NonNull AppBarLayout appBarLayout0, View view0, int v) {
            super.onStopNestedScroll(coordinatorLayout0, appBarLayout0, view0, v);
        }

        @Override  // com.google.android.material.appbar.HeaderBehavior
        public boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull MotionEvent motionEvent0) {
            return super.onTouchEvent(coordinatorLayout0, view0, motionEvent0);
        }

        @Override  // com.google.android.material.appbar.AppBarLayout$BaseBehavior
        public void setDragCallback(@Nullable BaseDragCallback appBarLayout$BaseBehavior$BaseDragCallback0) {
            super.setDragCallback(appBarLayout$BaseBehavior$BaseDragCallback0);
        }

        @Override  // com.google.android.material.appbar.ViewOffsetBehavior
        public void setHorizontalOffsetEnabled(boolean z) {
            super.setHorizontalOffsetEnabled(z);
        }

        @Override  // com.google.android.material.appbar.ViewOffsetBehavior
        public boolean setLeftAndRightOffset(int v) {
            return super.setLeftAndRightOffset(v);
        }

        @Override  // com.google.android.material.appbar.ViewOffsetBehavior
        public boolean setTopAndBottomOffset(int v) {
            return super.setTopAndBottomOffset(v);
        }

        @Override  // com.google.android.material.appbar.ViewOffsetBehavior
        public void setVerticalOffsetEnabled(boolean z) {
            super.setVerticalOffsetEnabled(z);
        }
    }

    public static abstract class ChildScrollEffect {
        public abstract void onOffsetChanged(@NonNull AppBarLayout arg1, @NonNull View arg2, float arg3);
    }

    public static class CompressChildScrollEffect extends ChildScrollEffect {
        public final Rect a;
        public final Rect b;

        public CompressChildScrollEffect() {
            this.a = new Rect();
            this.b = new Rect();
        }

        @Override  // com.google.android.material.appbar.AppBarLayout$ChildScrollEffect
        public void onOffsetChanged(@NonNull AppBarLayout appBarLayout0, @NonNull View view0, float f) {
            Rect rect0 = this.a;
            view0.getDrawingRect(rect0);
            appBarLayout0.offsetDescendantRectToMyCoords(view0, rect0);
            rect0.offset(0, -appBarLayout0.getTopInset());
            float f1 = ((float)rect0.top) - Math.abs(f);
            if(f1 <= 0.0f) {
                float f2 = MathUtils.clamp(Math.abs(f1 / ((float)rect0.height())), 0.0f, 1.0f);
                float f3 = -f1 - ((float)rect0.height()) * 0.3f * (1.0f - (1.0f - f2) * (1.0f - f2));
                view0.setTranslationY(f3);
                view0.getDrawingRect(this.b);
                this.b.offset(0, ((int)(-f3)));
                ViewCompat.setClipBounds(view0, this.b);
                return;
            }
            ViewCompat.setClipBounds(view0, null);
            view0.setTranslationY(0.0f);
        }
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {
        @RestrictTo({Scope.LIBRARY_GROUP})
        @Retention(RetentionPolicy.SOURCE)
        public @interface ScrollEffect {
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        @Retention(RetentionPolicy.SOURCE)
        public @interface ScrollFlags {
        }

        public static final int SCROLL_EFFECT_COMPRESS = 1;
        public static final int SCROLL_EFFECT_NONE = 0;
        public static final int SCROLL_FLAG_ENTER_ALWAYS = 4;
        public static final int SCROLL_FLAG_ENTER_ALWAYS_COLLAPSED = 8;
        public static final int SCROLL_FLAG_EXIT_UNTIL_COLLAPSED = 2;
        public static final int SCROLL_FLAG_NO_SCROLL = 0;
        public static final int SCROLL_FLAG_SCROLL = 1;
        public static final int SCROLL_FLAG_SNAP = 16;
        public static final int SCROLL_FLAG_SNAP_MARGINS = 0x20;
        public int a;
        public ChildScrollEffect b;
        public Interpolator c;

        public LayoutParams(int v, int v1) {
            super(v, v1);
            this.a = 1;
        }

        public LayoutParams(int v, int v1, float f) {
            super(v, v1, f);
            this.a = 1;
        }

        public LayoutParams(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            this.a = 1;
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.AppBarLayout_Layout);
            this.a = typedArray0.getInt(styleable.AppBarLayout_Layout_layout_scrollFlags, 0);
            this.setScrollEffect(typedArray0.getInt(styleable.AppBarLayout_Layout_layout_scrollEffect, 0));
            if(typedArray0.hasValue(styleable.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.c = android.view.animation.AnimationUtils.loadInterpolator(context0, typedArray0.getResourceId(styleable.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            typedArray0.recycle();
        }

        public LayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            super(viewGroup$LayoutParams0);
            this.a = 1;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
            super(viewGroup$MarginLayoutParams0);
            this.a = 1;
        }

        @RequiresApi(19)
        public LayoutParams(LinearLayout.LayoutParams linearLayout$LayoutParams0) {
            super(linearLayout$LayoutParams0);
            this.a = 1;
        }

        @RequiresApi(19)
        public LayoutParams(@NonNull LayoutParams appBarLayout$LayoutParams0) {
            super(appBarLayout$LayoutParams0);
            this.a = appBarLayout$LayoutParams0.a;
            this.b = appBarLayout$LayoutParams0.b;
            this.c = appBarLayout$LayoutParams0.c;
        }

        @Nullable
        public ChildScrollEffect getScrollEffect() {
            return this.b;
        }

        public int getScrollFlags() {
            return this.a;
        }

        public Interpolator getScrollInterpolator() {
            return this.c;
        }

        public void setScrollEffect(int v) {
            this.b = v == 1 ? new CompressChildScrollEffect() : null;
        }

        public void setScrollEffect(@Nullable ChildScrollEffect appBarLayout$ChildScrollEffect0) {
            this.b = appBarLayout$ChildScrollEffect0;
        }

        public void setScrollFlags(int v) {
            this.a = v;
        }

        public void setScrollInterpolator(Interpolator interpolator0) {
            this.c = interpolator0;
        }
    }

    public interface LiftOnScrollListener {
        void onUpdate(@Dimension float arg1, @ColorInt int arg2);
    }

    public interface OnOffsetChangedListener extends BaseOnOffsetChangedListener {
        @Override  // com.google.android.material.appbar.AppBarLayout$BaseOnOffsetChangedListener
        void onOffsetChanged(AppBarLayout arg1, int arg2);
    }

    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.ScrollingViewBehavior_Layout);
            this.setOverlayTop(typedArray0.getDimensionPixelSize(styleable.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            typedArray0.recycle();
        }

        @Override  // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public final AppBarLayout b(List list0) {
            int v = list0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                View view0 = (View)list0.get(v1);
                if(view0 instanceof AppBarLayout) {
                    return (AppBarLayout)view0;
                }
            }
            return null;
        }

        @Override  // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public final float c(View view0) {
            if(view0 instanceof AppBarLayout) {
                int v = ((AppBarLayout)view0).getTotalScrollRange();
                int v1 = ((AppBarLayout)view0).getDownNestedPreScrollRange();
                Behavior coordinatorLayout$Behavior0 = ((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams)((AppBarLayout)view0).getLayoutParams()).getBehavior();
                int v2 = coordinatorLayout$Behavior0 instanceof BaseBehavior ? ((BaseBehavior)coordinatorLayout$Behavior0).a() : 0;
                if(v1 != 0 && v + v2 <= v1) {
                    return 0.0f;
                }
                int v3 = v - v1;
                return v3 == 0 ? 0.0f : ((float)v2) / ((float)v3) + 1.0f;
            }
            return 0.0f;
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public final int d(View view0) {
            return view0 instanceof AppBarLayout ? ((AppBarLayout)view0).getTotalScrollRange() : view0.getMeasuredHeight();
        }

        @Override  // com.google.android.material.appbar.ViewOffsetBehavior
        public int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        @Override  // com.google.android.material.appbar.ViewOffsetBehavior
        public int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        @Override  // com.google.android.material.appbar.ViewOffsetBehavior
        public boolean isHorizontalOffsetEnabled() {
            return super.isHorizontalOffsetEnabled();
        }

        @Override  // com.google.android.material.appbar.ViewOffsetBehavior
        public boolean isVerticalOffsetEnabled() {
            return super.isVerticalOffsetEnabled();
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout0, View view0, View view1) {
            return view1 instanceof AppBarLayout;
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public boolean onDependentViewChanged(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1) {
            Behavior coordinatorLayout$Behavior0 = ((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams)view1.getLayoutParams()).getBehavior();
            if(coordinatorLayout$Behavior0 instanceof BaseBehavior) {
                ViewCompat.offsetTopAndBottom(view0, view1.getBottom() - view0.getTop() + ((BaseBehavior)coordinatorLayout$Behavior0).y + this.t - (this.u == 0 ? 0 : MathUtils.clamp(((int)(this.c(view1) * ((float)this.u))), 0, this.u)));
            }
            if(view1 instanceof AppBarLayout && ((AppBarLayout)view1).isLiftOnScroll()) {
                ((AppBarLayout)view1).c(((AppBarLayout)view1).d(view0), !((AppBarLayout)view1).i);
            }
            return false;
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public void onDependentViewRemoved(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1) {
            if(view1 instanceof AppBarLayout) {
                ViewCompat.removeAccessibilityAction(coordinatorLayout0, AccessibilityActionCompat.ACTION_SCROLL_FORWARD.getId());
                ViewCompat.removeAccessibilityAction(coordinatorLayout0, AccessibilityActionCompat.ACTION_SCROLL_BACKWARD.getId());
                ViewCompat.setAccessibilityDelegate(coordinatorLayout0, null);
            }
        }

        @Override  // com.google.android.material.appbar.ViewOffsetBehavior
        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, int v) {
            super.onLayoutChild(coordinatorLayout0, view0, v);
            return true;
        }

        @Override  // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, int v, int v1, int v2, int v3) {
            return super.onMeasureChild(coordinatorLayout0, view0, v, v1, v2, v3);
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public boolean onRequestChildRectangleOnScreen(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull Rect rect0, boolean z) {
            AppBarLayout appBarLayout0;
            List list0 = coordinatorLayout0.getDependencies(view0);
            int v = list0.size();
            for(int v1 = 0; true; ++v1) {
                appBarLayout0 = null;
                if(v1 >= v) {
                    break;
                }
                View view1 = (View)list0.get(v1);
                if(view1 instanceof AppBarLayout) {
                    appBarLayout0 = (AppBarLayout)view1;
                    break;
                }
            }
            if(appBarLayout0 != null) {
                Rect rect1 = new Rect(rect0);
                rect1.offset(view0.getLeft(), view0.getTop());
                int v2 = coordinatorLayout0.getWidth();
                int v3 = coordinatorLayout0.getHeight();
                this.r.set(0, 0, v2, v3);
                if(!this.r.contains(rect1)) {
                    appBarLayout0.setExpanded(false, !z);
                    return true;
                }
            }
            return false;
        }

        @Override  // com.google.android.material.appbar.ViewOffsetBehavior
        public void setHorizontalOffsetEnabled(boolean z) {
            super.setHorizontalOffsetEnabled(z);
        }

        @Override  // com.google.android.material.appbar.ViewOffsetBehavior
        public boolean setLeftAndRightOffset(int v) {
            return super.setLeftAndRightOffset(v);
        }

        @Override  // com.google.android.material.appbar.ViewOffsetBehavior
        public boolean setTopAndBottomOffset(int v) {
            return super.setTopAndBottomOffset(v);
        }

        @Override  // com.google.android.material.appbar.ViewOffsetBehavior
        public void setVerticalOffsetEnabled(boolean z) {
            super.setVerticalOffsetEnabled(z);
        }
    }

    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public int f;
    public WindowInsetsCompat g;
    public ArrayList h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public int m;
    public WeakReference n;
    public final boolean o;
    public ValueAnimator p;
    public final ValueAnimator.AnimatorUpdateListener q;
    public final ArrayList r;
    public final long s;
    public final TimeInterpolator t;
    public int[] u;
    public Drawable v;
    public Integer w;
    public final float x;
    public com.google.android.material.appbar.AppBarLayout.Behavior y;
    public static final int z;

    static {
        AppBarLayout.z = style.Widget_Design_AppBarLayout;
    }

    public AppBarLayout(@NonNull Context context0) {
        this(context0, null);
    }

    public AppBarLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.appBarLayoutStyle);
    }

    public AppBarLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        int v1 = AppBarLayout.z;
        super(MaterialThemeOverlay.wrap(context0, attributeSet0, v, v1), attributeSet0, v);
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.f = 0;
        this.r = new ArrayList();
        Context context1 = this.getContext();
        int v2 = 1;
        this.setOrientation(1);
        if(this.getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            this.setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context2 = this.getContext();
        TypedArray typedArray0 = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet0, k.a, v, v1, new int[0]);
        try {
            if(typedArray0.hasValue(0)) {
                this.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context2, typedArray0.getResourceId(0, 0)));
            }
        }
        finally {
            typedArray0.recycle();
        }
        TypedArray typedArray1 = ThemeEnforcement.obtainStyledAttributes(context1, attributeSet0, styleable.AppBarLayout, v, v1, new int[0]);
        ViewCompat.setBackground(this, typedArray1.getDrawable(styleable.AppBarLayout_android_background));
        ColorStateList colorStateList0 = MaterialResources.getColorStateList(context1, typedArray1, styleable.AppBarLayout_liftOnScrollColor);
        this.o = colorStateList0 != null;
        ColorStateList colorStateList1 = DrawableUtils.getColorStateListOrNull(this.getBackground());
        if(colorStateList1 != null) {
            MaterialShapeDrawable materialShapeDrawable0 = new MaterialShapeDrawable();
            materialShapeDrawable0.setFillColor(colorStateList1);
            if(colorStateList0 == null) {
                materialShapeDrawable0.initializeElevationOverlay(context1);
                this.q = new z0(1, this, materialShapeDrawable0);
            }
            else {
                this.q = new a(this, colorStateList1, colorStateList0, materialShapeDrawable0, MaterialColors.getColorOrNull(this.getContext(), attr.colorSurface));
            }
            ViewCompat.setBackground(this, materialShapeDrawable0);
        }
        this.s = (long)MotionUtils.resolveThemeDuration(context1, attr.motionDurationMedium2, this.getResources().getInteger(integer.app_bar_elevation_anim_duration));
        this.t = MotionUtils.resolveThemeInterpolator(context1, attr.motionEasingStandardInterpolator, AnimationUtils.LINEAR_INTERPOLATOR);
        if(typedArray1.hasValue(styleable.AppBarLayout_expanded)) {
            if(!typedArray1.getBoolean(styleable.AppBarLayout_expanded, false)) {
                v2 = 2;
            }
            this.f = v2;
            this.requestLayout();
        }
        if(typedArray1.hasValue(styleable.AppBarLayout_elevation)) {
            k.a(this, ((float)typedArray1.getDimensionPixelSize(styleable.AppBarLayout_elevation, 0)));
        }
        if(typedArray1.hasValue(styleable.AppBarLayout_android_keyboardNavigationCluster)) {
            this.setKeyboardNavigationCluster(typedArray1.getBoolean(styleable.AppBarLayout_android_keyboardNavigationCluster, false));
        }
        if(typedArray1.hasValue(styleable.AppBarLayout_android_touchscreenBlocksFocus)) {
            this.setTouchscreenBlocksFocus(typedArray1.getBoolean(styleable.AppBarLayout_android_touchscreenBlocksFocus, false));
        }
        this.x = this.getResources().getDimension(dimen.design_appbar_elevation);
        this.l = typedArray1.getBoolean(styleable.AppBarLayout_liftOnScroll, false);
        this.m = typedArray1.getResourceId(styleable.AppBarLayout_liftOnScrollTargetViewId, -1);
        this.setStatusBarForeground(typedArray1.getDrawable(styleable.AppBarLayout_statusBarForeground));
        typedArray1.recycle();
        ViewCompat.setOnApplyWindowInsetsListener(this, new androidx.appcompat.view.menu.f(this, 11));
    }

    public final void a() {
        SavedState appBarLayout$BaseBehavior$SavedState0 = this.y == null || this.b == -1 || this.f != 0 ? null : this.y.j(AbsSavedState.EMPTY_STATE, this);
        this.b = -1;
        this.c = -1;
        this.d = -1;
        if(appBarLayout$BaseBehavior$SavedState0 != null) {
            com.google.android.material.appbar.AppBarLayout.Behavior appBarLayout$Behavior0 = this.y;
            if(appBarLayout$Behavior0.B == null) {
                appBarLayout$Behavior0.B = appBarLayout$BaseBehavior$SavedState0;
            }
        }
    }

    public void addLiftOnScrollListener(@NonNull LiftOnScrollListener appBarLayout$LiftOnScrollListener0) {
        this.r.add(appBarLayout$LiftOnScrollListener0);
    }

    public void addOnOffsetChangedListener(@Nullable BaseOnOffsetChangedListener appBarLayout$BaseOnOffsetChangedListener0) {
        if(this.h == null) {
            this.h = new ArrayList();
        }
        if(appBarLayout$BaseOnOffsetChangedListener0 != null && !this.h.contains(appBarLayout$BaseOnOffsetChangedListener0)) {
            this.h.add(appBarLayout$BaseOnOffsetChangedListener0);
        }
    }

    public void addOnOffsetChangedListener(OnOffsetChangedListener appBarLayout$OnOffsetChangedListener0) {
        this.addOnOffsetChangedListener(appBarLayout$OnOffsetChangedListener0);
    }

    public final void b(int v) {
        this.a = v;
        if(!this.willNotDraw()) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
        ArrayList arrayList0 = this.h;
        if(arrayList0 != null) {
            int v1 = arrayList0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                BaseOnOffsetChangedListener appBarLayout$BaseOnOffsetChangedListener0 = (BaseOnOffsetChangedListener)this.h.get(v2);
                if(appBarLayout$BaseOnOffsetChangedListener0 != null) {
                    appBarLayout$BaseOnOffsetChangedListener0.onOffsetChanged(this, v);
                }
            }
        }
    }

    public final boolean c(boolean z, boolean z1) {
        if(z1 && this.k != z) {
            float f = 0.0f;
            this.k = z;
            this.refreshDrawableState();
            if(this.getBackground() instanceof MaterialShapeDrawable) {
                if(this.o) {
                    if(z) {
                        f = 1.0f;
                    }
                    this.e((z ? 0.0f : 1.0f), f);
                    return true;
                }
                if(this.l) {
                    float f1 = this.x;
                    if(z) {
                        f = f1;
                    }
                    this.e((z ? 0.0f : f1), f);
                }
            }
            return true;
        }
        return false;
    }

    @Override  // android.widget.LinearLayout
    public boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof LayoutParams;
    }

    public void clearLiftOnScrollListener() {
        this.r.clear();
    }

    public final boolean d(View view0) {
        View view1 = null;
        if(this.n == null) {
            int v = this.m;
            if(v != -1) {
                View view2 = view0 == null ? null : view0.findViewById(v);
                if(view2 == null && this.getParent() instanceof ViewGroup) {
                    view2 = ((ViewGroup)this.getParent()).findViewById(this.m);
                }
                if(view2 != null) {
                    this.n = new WeakReference(view2);
                }
            }
        }
        WeakReference weakReference0 = this.n;
        if(weakReference0 != null) {
            view1 = (View)weakReference0.get();
        }
        if(view1 != null) {
            view0 = view1;
        }
        return view0 != null && (view0.canScrollVertically(-1) || view0.getScrollY() > 0);
    }

    @Override  // android.view.View
    public void draw(@NonNull Canvas canvas0) {
        super.draw(canvas0);
        if(this.v != null && this.getTopInset() > 0) {
            int v = canvas0.save();
            canvas0.translate(0.0f, ((float)(-this.a)));
            this.v.draw(canvas0);
            canvas0.restoreToCount(v);
        }
    }

    @Override  // android.view.ViewGroup
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] arr_v = this.getDrawableState();
        Drawable drawable0 = this.v;
        if(drawable0 != null && drawable0.isStateful() && drawable0.setState(arr_v)) {
            this.invalidateDrawable(drawable0);
        }
    }

    public final void e(float f, float f1) {
        ValueAnimator valueAnimator0 = this.p;
        if(valueAnimator0 != null) {
            valueAnimator0.cancel();
        }
        ValueAnimator valueAnimator1 = ValueAnimator.ofFloat(new float[]{f, f1});
        this.p = valueAnimator1;
        valueAnimator1.setDuration(this.s);
        this.p.setInterpolator(this.t);
        ValueAnimator.AnimatorUpdateListener valueAnimator$AnimatorUpdateListener0 = this.q;
        if(valueAnimator$AnimatorUpdateListener0 != null) {
            this.p.addUpdateListener(valueAnimator$AnimatorUpdateListener0);
        }
        this.p.start();
    }

    @Override  // android.widget.LinearLayout
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return this.generateDefaultLayoutParams();
    }

    @Override  // android.widget.LinearLayout
    public LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return this.generateDefaultLayoutParams();
    }

    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    @Override  // android.widget.LinearLayout
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return this.generateLayoutParams(attributeSet0);
    }

    @Override  // android.widget.LinearLayout
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return this.generateLayoutParams(viewGroup$LayoutParams0);
    }

    @Override  // android.widget.LinearLayout
    public LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return this.generateLayoutParams(attributeSet0);
    }

    @Override  // android.widget.LinearLayout
    public LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return this.generateLayoutParams(viewGroup$LayoutParams0);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return new LayoutParams(this.getContext(), attributeSet0);
    }

    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(viewGroup$LayoutParams0 instanceof LinearLayout.LayoutParams) {
            return new LayoutParams(((LinearLayout.LayoutParams)viewGroup$LayoutParams0));
        }
        return viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams ? new LayoutParams(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0)) : new LayoutParams(viewGroup$LayoutParams0);
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$AttachedBehavior
    @NonNull
    public Behavior getBehavior() {
        com.google.android.material.appbar.AppBarLayout.Behavior appBarLayout$Behavior0 = new com.google.android.material.appbar.AppBarLayout.Behavior();
        this.y = appBarLayout$Behavior0;
        return appBarLayout$Behavior0;
    }

    public int getDownNestedPreScrollRange() {
        int v6;
        int v = this.c;
        if(v != -1) {
            return v;
        }
        int v1 = this.getChildCount() - 1;
        int v2 = 0;
        while(v1 >= 0) {
            View view0 = this.getChildAt(v1);
            if(view0.getVisibility() != 8) {
                LayoutParams appBarLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                int v3 = view0.getMeasuredHeight();
                int v4 = appBarLayout$LayoutParams0.a;
                if((v4 & 5) == 5) {
                    int v5 = appBarLayout$LayoutParams0.topMargin + appBarLayout$LayoutParams0.bottomMargin;
                    if((v4 & 8) == 0) {
                        v6 = (v4 & 2) == 0 ? v5 + v3 : v3 - ViewCompat.getMinimumHeight(view0) + v5;
                    }
                    else {
                        v6 = ViewCompat.getMinimumHeight(view0) + v5;
                    }
                    if(v1 == 0 && ViewCompat.getFitsSystemWindows(view0)) {
                        v6 = Math.min(v6, v3 - this.getTopInset());
                    }
                    v2 += v6;
                }
                else {
                    if(v2 <= 0) {
                        goto label_22;
                    }
                    break;
                }
            }
        label_22:
            --v1;
        }
        int v7 = Math.max(0, v2);
        this.c = v7;
        return v7;
    }

    public int getDownNestedScrollRange() {
        int v = this.d;
        if(v != -1) {
            return v;
        }
        int v1 = this.getChildCount();
        int v3 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            View view0 = this.getChildAt(v2);
            if(view0.getVisibility() != 8) {
                LayoutParams appBarLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                int v4 = view0.getMeasuredHeight();
                int v5 = appBarLayout$LayoutParams0.topMargin + appBarLayout$LayoutParams0.bottomMargin + v4;
                int v6 = appBarLayout$LayoutParams0.a;
                if((v6 & 1) == 0) {
                    break;
                }
                v3 += v5;
                if((v6 & 2) != 0) {
                    v3 -= ViewCompat.getMinimumHeight(view0);
                    break;
                }
            }
        }
        int v7 = Math.max(0, v3);
        this.d = v7;
        return v7;
    }

    @IdRes
    public int getLiftOnScrollTargetViewId() {
        return this.m;
    }

    @Nullable
    public MaterialShapeDrawable getMaterialShapeBackground() {
        Drawable drawable0 = this.getBackground();
        return drawable0 instanceof MaterialShapeDrawable ? ((MaterialShapeDrawable)drawable0) : null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int v = this.getTopInset();
        int v1 = ViewCompat.getMinimumHeight(this);
        if(v1 != 0) {
            return v1 * 2 + v;
        }
        int v2 = this.getChildCount();
        v1 = v2 < 1 ? 0 : ViewCompat.getMinimumHeight(this.getChildAt(v2 - 1));
        return v1 == 0 ? this.getHeight() / 3 : v1 * 2 + v;
    }

    public int getPendingAction() {
        return this.f;
    }

    @Nullable
    public Drawable getStatusBarForeground() {
        return this.v;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    @VisibleForTesting
    public final int getTopInset() {
        return this.g == null ? 0 : this.g.getSystemWindowInsetTop();
    }

    public final int getTotalScrollRange() {
        int v = this.b;
        if(v != -1) {
            return v;
        }
        int v1 = this.getChildCount();
        int v3 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            View view0 = this.getChildAt(v2);
            if(view0.getVisibility() != 8) {
                LayoutParams appBarLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                int v4 = view0.getMeasuredHeight();
                int v5 = appBarLayout$LayoutParams0.a;
                if((v5 & 1) == 0) {
                    break;
                }
                int v6 = v4 + appBarLayout$LayoutParams0.topMargin + appBarLayout$LayoutParams0.bottomMargin + v3;
                v3 = v2 != 0 || !ViewCompat.getFitsSystemWindows(view0) ? v4 + appBarLayout$LayoutParams0.topMargin + appBarLayout$LayoutParams0.bottomMargin + v3 : v6 - this.getTopInset();
                if((v5 & 2) != 0) {
                    v3 -= ViewCompat.getMinimumHeight(view0);
                    break;
                }
            }
        }
        int v7 = Math.max(0, v3);
        this.b = v7;
        return v7;
    }

    public int getUpNestedPreScrollRange() {
        return this.getTotalScrollRange();
    }

    public boolean isLiftOnScroll() {
        return this.l;
    }

    public boolean isLifted() {
        return this.k;
    }

    @Override  // android.view.ViewGroup
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override  // android.view.ViewGroup
    public int[] onCreateDrawableState(int v) {
        if(this.u == null) {
            this.u = new int[4];
        }
        int[] arr_v = this.u;
        int[] arr_v1 = super.onCreateDrawableState(v + arr_v.length);
        boolean z = this.j;
        arr_v[0] = z ? attr.state_liftable : -attr.state_liftable;
        arr_v[1] = !z || !this.k ? -attr.state_lifted : attr.state_lifted;
        arr_v[2] = z ? attr.state_collapsible : -attr.state_collapsible;
        arr_v[3] = !z || !this.k ? -attr.state_collapsed : attr.state_collapsed;
        return View.mergeDrawableStates(arr_v1, arr_v);
    }

    @Override  // android.view.ViewGroup
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference0 = this.n;
        if(weakReference0 != null) {
            weakReference0.clear();
        }
        this.n = null;
    }

    @Override  // android.widget.LinearLayout
    public void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        boolean z1 = false;
        if(ViewCompat.getFitsSystemWindows(this) && this.getChildCount() > 0) {
            View view0 = this.getChildAt(0);
            if(view0.getVisibility() != 8 && !ViewCompat.getFitsSystemWindows(view0)) {
                int v4 = this.getTopInset();
                for(int v5 = this.getChildCount() - 1; v5 >= 0; --v5) {
                    ViewCompat.offsetTopAndBottom(this.getChildAt(v5), v4);
                }
            }
        }
        this.a();
        this.e = false;
        int v6 = this.getChildCount();
        for(int v7 = 0; v7 < v6; ++v7) {
            if(((LayoutParams)this.getChildAt(v7).getLayoutParams()).getScrollInterpolator() != null) {
                this.e = true;
                break;
            }
        }
        Drawable drawable0 = this.v;
        if(drawable0 != null) {
            drawable0.setBounds(0, 0, this.getWidth(), this.getTopInset());
        }
        if(!this.i) {
            if(this.l) {
            label_34:
                z1 = true;
            }
            else {
                int v8 = this.getChildCount();
                int v9 = 0;
                while(v9 < v8) {
                    int v10 = ((LayoutParams)this.getChildAt(v9).getLayoutParams()).a;
                    if((v10 & 1) == 1 && (v10 & 10) != 0) {
                        goto label_34;
                    }
                    ++v9;
                }
            }
            if(this.j != z1) {
                this.j = z1;
                this.refreshDrawableState();
            }
        }
    }

    @Override  // android.widget.LinearLayout
    public void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        int v2 = View.MeasureSpec.getMode(v1);
        if(v2 != 0x40000000 && ViewCompat.getFitsSystemWindows(this) && this.getChildCount() > 0) {
            View view0 = this.getChildAt(0);
            if(view0.getVisibility() != 8 && !ViewCompat.getFitsSystemWindows(view0)) {
                int v3 = this.getMeasuredHeight();
                switch(v2) {
                    case 0x80000000: {
                        int v4 = this.getMeasuredHeight();
                        v3 = MathUtils.clamp(this.getTopInset() + v4, 0, View.MeasureSpec.getSize(v1));
                        break;
                    }
                    case 0: {
                        v3 += this.getTopInset();
                    }
                }
                this.setMeasuredDimension(this.getMeasuredWidth(), v3);
            }
        }
        this.a();
    }

    public boolean removeLiftOnScrollListener(@NonNull LiftOnScrollListener appBarLayout$LiftOnScrollListener0) {
        return this.r.remove(appBarLayout$LiftOnScrollListener0);
    }

    public void removeOnOffsetChangedListener(@Nullable BaseOnOffsetChangedListener appBarLayout$BaseOnOffsetChangedListener0) {
        ArrayList arrayList0 = this.h;
        if(arrayList0 != null && appBarLayout$BaseOnOffsetChangedListener0 != null) {
            arrayList0.remove(appBarLayout$BaseOnOffsetChangedListener0);
        }
    }

    public void removeOnOffsetChangedListener(OnOffsetChangedListener appBarLayout$OnOffsetChangedListener0) {
        this.removeOnOffsetChangedListener(appBarLayout$OnOffsetChangedListener0);
    }

    @Override  // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeUtils.setElevation(this, f);
    }

    public void setExpanded(boolean z) {
        this.setExpanded(z, ViewCompat.isLaidOut(this));
    }

    public void setExpanded(boolean z, boolean z1) {
        this.f = (z ? 1 : 2) | (z1 ? 4 : 0) | 8;
        this.requestLayout();
    }

    public void setLiftOnScroll(boolean z) {
        this.l = z;
    }

    public void setLiftOnScrollTargetView(@Nullable View view0) {
        this.m = -1;
        if(view0 == null) {
            WeakReference weakReference0 = this.n;
            if(weakReference0 != null) {
                weakReference0.clear();
            }
            this.n = null;
            return;
        }
        this.n = new WeakReference(view0);
    }

    public void setLiftOnScrollTargetViewId(@IdRes int v) {
        this.m = v;
        WeakReference weakReference0 = this.n;
        if(weakReference0 != null) {
            weakReference0.clear();
        }
        this.n = null;
    }

    public boolean setLiftable(boolean z) {
        this.i = true;
        if(this.j != z) {
            this.j = z;
            this.refreshDrawableState();
            return true;
        }
        return false;
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.i = z;
    }

    public boolean setLifted(boolean z) {
        return this.c(z, true);
    }

    @Override  // android.widget.LinearLayout
    public void setOrientation(int v) {
        if(v != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(1);
    }

    public void setStatusBarForeground(@Nullable Drawable drawable0) {
        Integer integer0 = null;
        Drawable drawable1 = this.v;
        if(drawable1 != drawable0) {
            if(drawable1 != null) {
                drawable1.setCallback(null);
            }
            Drawable drawable2 = drawable0 == null ? null : drawable0.mutate();
            this.v = drawable2;
            if(drawable2 instanceof MaterialShapeDrawable) {
                integer0 = ((MaterialShapeDrawable)drawable2).getResolvedTintColor();
            }
            else {
                ColorStateList colorStateList0 = DrawableUtils.getColorStateListOrNull(drawable2);
                if(colorStateList0 != null) {
                    integer0 = colorStateList0.getDefaultColor();
                }
            }
            this.w = integer0;
            Drawable drawable3 = this.v;
            int v = 0;
            if(drawable3 != null) {
                if(drawable3.isStateful()) {
                    this.v.setState(this.getDrawableState());
                }
                DrawableCompat.setLayoutDirection(this.v, ViewCompat.getLayoutDirection(this));
                this.v.setVisible(this.getVisibility() == 0, false);
                this.v.setCallback(this);
            }
            if(this.v != null && this.getTopInset() > 0) {
                v = 1;
            }
            this.setWillNotDraw(((boolean)(v ^ 1)));
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void setStatusBarForegroundColor(@ColorInt int v) {
        this.setStatusBarForeground(new ColorDrawable(v));
    }

    public void setStatusBarForegroundResource(@DrawableRes int v) {
        this.setStatusBarForeground(AppCompatResources.getDrawable(this.getContext(), v));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        k.a(this, f);
    }

    @Override  // android.view.View
    public void setVisibility(int v) {
        super.setVisibility(v);
        Drawable drawable0 = this.v;
        if(drawable0 != null) {
            drawable0.setVisible(v == 0, false);
        }
    }

    @Override  // android.view.View
    public boolean verifyDrawable(@NonNull Drawable drawable0) {
        return super.verifyDrawable(drawable0) || drawable0 == this.v;
    }
}

