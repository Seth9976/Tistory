package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.view.menu.f;
import androidx.core.R.attr;
import androidx.core.view.DifferentialMotionFlingController;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.NestedScrollingChild3;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ScrollingView;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import p3.h;
import p3.i;
import p3.j;

public class NestedScrollView extends FrameLayout implements NestedScrollingChild3, NestedScrollingParent3, ScrollingView {
    public interface OnScrollChangeListener {
        void onScrollChange(@NonNull NestedScrollView arg1, int arg2, int arg3, int arg4, int arg5);
    }

    public static final float A;
    public static final h B;
    public static final int[] C;
    public final float a;
    public long b;
    public final Rect c;
    public final OverScroller d;
    public int e;
    public boolean f;
    public boolean g;
    public View h;
    public boolean i;
    public VelocityTracker j;
    public boolean k;
    public boolean l;
    public final int m;
    @NonNull
    @RestrictTo({Scope.LIBRARY})
    @VisibleForTesting
    public EdgeEffect mEdgeGlowBottom;
    @NonNull
    @RestrictTo({Scope.LIBRARY})
    @VisibleForTesting
    public EdgeEffect mEdgeGlowTop;
    public final int n;
    public final int o;
    public int p;
    public final int[] q;
    public final int[] r;
    public int s;
    public int t;
    public j u;
    public final NestedScrollingParentHelper v;
    public final NestedScrollingChildHelper w;
    public float x;
    public OnScrollChangeListener y;
    public final DifferentialMotionFlingController z;

    static {
        NestedScrollView.A = 2.358202f;
        NestedScrollView.B = new h();  // 初始化器: Landroidx/core/view/AccessibilityDelegateCompat;-><init>()V
        NestedScrollView.C = new int[]{0x101017A};
    }

    public NestedScrollView(@NonNull Context context0) {
        this(context0, null);
    }

    public NestedScrollView(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.nestedScrollViewStyle);
    }

    public NestedScrollView(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.c = new Rect();
        this.f = true;
        this.g = false;
        this.h = null;
        this.i = false;
        this.l = true;
        this.p = -1;
        this.q = new int[2];
        this.r = new int[2];
        f f0 = new f(this, 26);
        this.z = new DifferentialMotionFlingController(this.getContext(), f0);
        this.mEdgeGlowTop = EdgeEffectCompat.create(context0, attributeSet0);
        this.mEdgeGlowBottom = EdgeEffectCompat.create(context0, attributeSet0);
        this.a = context0.getResources().getDisplayMetrics().density * 51890.199219f;
        this.d = new OverScroller(this.getContext());
        this.setFocusable(true);
        this.setDescendantFocusability(0x40000);
        this.setWillNotDraw(false);
        ViewConfiguration viewConfiguration0 = ViewConfiguration.get(this.getContext());
        this.m = viewConfiguration0.getScaledTouchSlop();
        this.n = viewConfiguration0.getScaledMinimumFlingVelocity();
        this.o = viewConfiguration0.getScaledMaximumFlingVelocity();
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, NestedScrollView.C, v, 0);
        this.setFillViewport(typedArray0.getBoolean(0, false));
        typedArray0.recycle();
        this.v = new NestedScrollingParentHelper(this);
        this.w = new NestedScrollingChildHelper(this);
        this.setNestedScrollingEnabled(true);
        ViewCompat.setAccessibilityDelegate(this, NestedScrollView.B);
    }

    public static boolean a(View view0, NestedScrollView nestedScrollView0) {
        if(view0 == nestedScrollView0) {
            return true;
        }
        ViewParent viewParent0 = view0.getParent();
        return viewParent0 instanceof ViewGroup && NestedScrollView.a(((View)viewParent0), nestedScrollView0);
    }

    @Override  // android.view.ViewGroup
    public void addView(@NonNull View view0) {
        if(this.getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view0);
    }

    @Override  // android.view.ViewGroup
    public void addView(View view0, int v) {
        if(this.getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view0, v);
    }

    @Override  // android.view.ViewGroup
    public void addView(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(this.getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view0, v, viewGroup$LayoutParams0);
    }

    @Override  // android.view.ViewGroup
    public void addView(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(this.getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view0, viewGroup$LayoutParams0);
    }

    public boolean arrowScroll(int v) {
        View view0 = this.findFocus();
        if(view0 == this) {
            view0 = null;
        }
        View view1 = FocusFinder.getInstance().findNextFocus(this, view0, v);
        int v1 = this.getMaxScrollAmount();
        if(view1 == null || !this.b(v1, view1, this.getHeight())) {
            if(v == 33 && this.getScrollY() < v1) {
                v1 = this.getScrollY();
            }
            else if(v == 130 && this.getChildCount() > 0) {
                View view2 = this.getChildAt(0);
                FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view2.getLayoutParams();
                int v2 = view2.getBottom() + frameLayout$LayoutParams0.bottomMargin;
                int v3 = this.getScrollY();
                v1 = Math.min(v2 - (this.getHeight() + v3 - this.getPaddingBottom()), v1);
            }
            if(v1 == 0) {
                return false;
            }
            if(v != 130) {
                v1 = -v1;
            }
            this.g(v1, 0, 1, true);
        }
        else {
            view1.getDrawingRect(this.c);
            this.offsetDescendantRectToMyCoords(view1, this.c);
            this.g(this.computeScrollDeltaToGetChildRectOnScreen(this.c), 0, 1, true);
            view1.requestFocus(v);
        }
        if(view0 != null && view0.isFocused() && !this.b(0, view0, this.getHeight())) {
            int v4 = this.getDescendantFocusability();
            this.setDescendantFocusability(0x20000);
            this.requestFocus();
            this.setDescendantFocusability(v4);
        }
        return true;
    }

    public final boolean b(int v, View view0, int v1) {
        view0.getDrawingRect(this.c);
        this.offsetDescendantRectToMyCoords(view0, this.c);
        return this.c.bottom + v >= this.getScrollY() && this.c.top - v <= this.getScrollY() + v1;
    }

    public final void c(int v, int v1, int[] arr_v) {
        int v2 = this.getScrollY();
        this.scrollBy(0, v);
        int v3 = this.getScrollY() - v2;
        if(arr_v != null) {
            arr_v[1] += v3;
        }
        this.w.dispatchNestedScroll(0, v3, 0, v - v3, null, v1, arr_v);
    }

    @Override  // androidx.core.view.ScrollingView, android.view.View
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override  // androidx.core.view.ScrollingView, android.view.View
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override  // androidx.core.view.ScrollingView, android.view.View
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override  // android.view.View
    public void computeScroll() {
        int v3;
        if(this.d.isFinished()) {
            return;
        }
        this.d.computeScrollOffset();
        int v = this.d.getCurrY();
        int v1 = v - this.t;
        int v2 = this.getHeight();
        if(v1 > 0 && EdgeEffectCompat.getDistance(this.mEdgeGlowTop) != 0.0f) {
            v3 = Math.round(EdgeEffectCompat.onPullDistance(this.mEdgeGlowTop, ((float)(-v1)) * 4.0f / ((float)v2), 0.5f) * (((float)(-v2)) / 4.0f));
            if(v3 != v1) {
                this.mEdgeGlowTop.finish();
            }
            v1 -= v3;
        }
        else if(v1 < 0 && EdgeEffectCompat.getDistance(this.mEdgeGlowBottom) != 0.0f) {
            v3 = Math.round(EdgeEffectCompat.onPullDistance(this.mEdgeGlowBottom, ((float)v1) * 4.0f / ((float)v2), 0.5f) * (((float)v2) / 4.0f));
            if(v3 != v1) {
                this.mEdgeGlowBottom.finish();
            }
            v1 -= v3;
        }
        this.t = v;
        int[] arr_v = this.r;
        arr_v[1] = 0;
        this.dispatchNestedPreScroll(0, v1, arr_v, null, 1);
        int v4 = v1 - arr_v[1];
        int v5 = this.getScrollRange();
        if(v4 != 0) {
            int v6 = this.getScrollY();
            this.e(v4, this.getScrollX(), v6, v5);
            int v7 = this.getScrollY() - v6;
            int v8 = v4 - v7;
            arr_v[1] = 0;
            this.dispatchNestedScroll(0, v7, 0, v8, this.q, 1, arr_v);
            v4 = v8 - arr_v[1];
        }
        if(v4 != 0) {
            int v9 = this.getOverScrollMode();
            if(v9 == 0 || v9 == 1 && v5 > 0) {
                if(v4 >= 0) {
                    if(this.mEdgeGlowBottom.isFinished()) {
                        this.mEdgeGlowBottom.onAbsorb(((int)this.d.getCurrVelocity()));
                    }
                }
                else if(this.mEdgeGlowTop.isFinished()) {
                    this.mEdgeGlowTop.onAbsorb(((int)this.d.getCurrVelocity()));
                }
            }
            this.d.abortAnimation();
            this.stopNestedScroll(1);
        }
        if(!this.d.isFinished()) {
            this.postInvalidateOnAnimation();
            return;
        }
        this.stopNestedScroll(1);
    }

    public int computeScrollDeltaToGetChildRectOnScreen(Rect rect0) {
        if(this.getChildCount() == 0) {
            return 0;
        }
        int v = this.getHeight();
        int v1 = this.getScrollY();
        int v2 = v1 + v;
        int v3 = this.getVerticalFadingEdgeLength();
        if(rect0.top > 0) {
            v1 += v3;
        }
        View view0 = this.getChildAt(0);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view0.getLayoutParams();
        int v4 = rect0.bottom >= view0.getHeight() + frameLayout$LayoutParams0.topMargin + frameLayout$LayoutParams0.bottomMargin ? v2 : v2 - v3;
        int v5 = rect0.bottom;
        if(v5 > v4 && rect0.top > v1) {
            return rect0.height() <= v ? Math.min(rect0.bottom - v4, view0.getBottom() + frameLayout$LayoutParams0.bottomMargin - v2) : Math.min(rect0.top - v1, view0.getBottom() + frameLayout$LayoutParams0.bottomMargin - v2);
        }
        if(rect0.top < v1 && v5 < v4) {
            return rect0.height() <= v ? Math.max(-(v1 - rect0.top), -this.getScrollY()) : Math.max(-(v4 - rect0.bottom), -this.getScrollY());
        }
        return 0;
    }

    @Override  // androidx.core.view.ScrollingView, android.view.View
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override  // androidx.core.view.ScrollingView, android.view.View
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override  // androidx.core.view.ScrollingView, android.view.View
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollRange() {
        int v = this.getChildCount();
        int v1 = this.getHeight() - this.getPaddingBottom() - this.getPaddingTop();
        if(v == 0) {
            return v1;
        }
        View view0 = this.getChildAt(0);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view0.getLayoutParams();
        int v2 = view0.getBottom() + frameLayout$LayoutParams0.bottomMargin;
        int v3 = this.getScrollY();
        int v4 = Math.max(0, v2 - v1);
        if(v3 < 0) {
            return v2 - v3;
        }
        return v3 <= v4 ? v2 : v2 + (v3 - v4);
    }

    public final void d(MotionEvent motionEvent0) {
        int v = motionEvent0.getActionIndex();
        if(motionEvent0.getPointerId(v) == this.p) {
            int v1 = v == 0 ? 1 : 0;
            this.e = (int)motionEvent0.getY(v1);
            this.p = motionEvent0.getPointerId(v1);
            VelocityTracker velocityTracker0 = this.j;
            if(velocityTracker0 != null) {
                velocityTracker0.clear();
            }
        }
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.ViewGroup
    public boolean dispatchKeyEvent(KeyEvent keyEvent0) {
        return super.dispatchKeyEvent(keyEvent0) || this.executeKeyEvent(keyEvent0);
    }

    @Override  // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f, float f1, boolean z) {
        return this.w.dispatchNestedFling(f, f1, z);
    }

    @Override  // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f, float f1) {
        return this.w.dispatchNestedPreFling(f, f1);
    }

    @Override  // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int v, int v1, @Nullable int[] arr_v, @Nullable int[] arr_v1) {
        return this.dispatchNestedPreScroll(v, v1, arr_v, arr_v1, 0);
    }

    @Override  // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedPreScroll(int v, int v1, @Nullable int[] arr_v, @Nullable int[] arr_v1, int v2) {
        return this.w.dispatchNestedPreScroll(v, v1, arr_v, arr_v1, v2);
    }

    @Override  // androidx.core.view.NestedScrollingChild3
    public void dispatchNestedScroll(int v, int v1, int v2, int v3, @Nullable int[] arr_v, int v4, @NonNull int[] arr_v1) {
        this.w.dispatchNestedScroll(v, v1, v2, v3, arr_v, v4, arr_v1);
    }

    @Override  // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int v, int v1, int v2, int v3, @Nullable int[] arr_v) {
        return this.w.dispatchNestedScroll(v, v1, v2, v3, arr_v);
    }

    @Override  // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedScroll(int v, int v1, int v2, int v3, @Nullable int[] arr_v, int v4) {
        return this.w.dispatchNestedScroll(v, v1, v2, v3, arr_v, v4);
    }

    @Override  // android.view.View
    public void draw(@NonNull Canvas canvas0) {
        int v7;
        super.draw(canvas0);
        int v = this.getScrollY();
        int v1 = 0;
        if(!this.mEdgeGlowTop.isFinished()) {
            int v2 = canvas0.save();
            int v3 = this.getWidth();
            int v4 = this.getHeight();
            int v5 = Math.min(0, v);
            if(i.a(this)) {
                int v6 = this.getPaddingLeft();
                v3 -= this.getPaddingRight() + v6;
                v7 = this.getPaddingLeft();
            }
            else {
                v7 = 0;
            }
            if(i.a(this)) {
                int v8 = this.getPaddingTop();
                v4 -= this.getPaddingBottom() + v8;
                v5 += this.getPaddingTop();
            }
            canvas0.translate(((float)v7), ((float)v5));
            this.mEdgeGlowTop.setSize(v3, v4);
            if(this.mEdgeGlowTop.draw(canvas0)) {
                this.postInvalidateOnAnimation();
            }
            canvas0.restoreToCount(v2);
        }
        if(!this.mEdgeGlowBottom.isFinished()) {
            int v9 = canvas0.save();
            int v10 = this.getWidth();
            int v11 = this.getHeight();
            int v12 = Math.max(this.getScrollRange(), v) + v11;
            if(i.a(this)) {
                int v13 = this.getPaddingLeft();
                v10 -= this.getPaddingRight() + v13;
                v1 = this.getPaddingLeft();
            }
            if(i.a(this)) {
                int v14 = this.getPaddingTop();
                v11 -= this.getPaddingBottom() + v14;
                v12 -= this.getPaddingBottom();
            }
            canvas0.translate(((float)(v1 - v10)), ((float)v12));
            canvas0.rotate(180.0f, ((float)v10), 0.0f);
            this.mEdgeGlowBottom.setSize(v10, v11);
            if(this.mEdgeGlowBottom.draw(canvas0)) {
                this.postInvalidateOnAnimation();
            }
            canvas0.restoreToCount(v9);
        }
    }

    public final boolean e(int v, int v1, int v2, int v3) {
        boolean z1;
        boolean z;
        this.getOverScrollMode();
        this.computeHorizontalScrollRange();
        this.computeHorizontalScrollExtent();
        this.computeVerticalScrollRange();
        this.computeVerticalScrollExtent();
        int v4 = v2 + v;
        if(v1 > 0) {
            v1 = 0;
            z = true;
        }
        else if(v1 >= 0) {
            z = false;
        }
        else {
            v1 = 0;
            z = true;
        }
        if(v4 > v3) {
            z1 = true;
        }
        else if(v4 < 0) {
            v3 = 0;
            z1 = true;
        }
        else {
            v3 = v4;
            z1 = false;
        }
        if(z1 && !this.hasNestedScrollingParent(1)) {
            int v5 = this.getScrollRange();
            this.d.springBack(v1, v3, 0, 0, 0, v5);
        }
        this.onOverScrolled(v1, v3, z, z1);
        return z || z1;
    }

    public boolean executeKeyEvent(@NonNull KeyEvent keyEvent0) {
        this.c.setEmpty();
        int v = 130;
        if(this.getChildCount() > 0) {
            View view0 = this.getChildAt(0);
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view0.getLayoutParams();
            if(view0.getHeight() + frameLayout$LayoutParams0.topMargin + frameLayout$LayoutParams0.bottomMargin > this.getHeight() - this.getPaddingTop() - this.getPaddingBottom()) {
                if(keyEvent0.getAction() == 0) {
                    switch(keyEvent0.getKeyCode()) {
                        case 19: {
                            return keyEvent0.isAltPressed() ? this.fullScroll(33) : this.arrowScroll(33);
                        }
                        case 20: {
                            return keyEvent0.isAltPressed() ? this.fullScroll(130) : this.arrowScroll(130);
                        }
                        case 62: {
                            if(keyEvent0.isShiftPressed()) {
                                v = 33;
                            }
                            this.pageScroll(v);
                            return false;
                        }
                        case 92: {
                            return this.fullScroll(33);
                        }
                        case 93: {
                            return this.fullScroll(130);
                        }
                        case 0x7A: {
                            this.pageScroll(33);
                            return false;
                        }
                        case 0x7B: {
                            this.pageScroll(130);
                            return false;
                        }
                        default: {
                            return false;
                        }
                    }
                }
                return false;
            }
        }
        if(this.isFocused() && keyEvent0.getKeyCode() != 4) {
            View view1 = this.findFocus();
            if(view1 == this) {
                view1 = null;
            }
            View view2 = FocusFinder.getInstance().findNextFocus(this, view1, 130);
            return view2 != null && view2 != this && view2.requestFocus(130);
        }
        return false;
    }

    public final boolean f(int v, int v1, int v2) {
        boolean z1;
        int v3 = this.getHeight();
        int v4 = this.getScrollY();
        int v5 = v3 + v4;
        ArrayList arrayList0 = this.getFocusables(2);
        int v6 = arrayList0.size();
        View view0 = null;
        int v8 = 0;
        for(int v7 = 0; v7 < v6; ++v7) {
            View view1 = (View)arrayList0.get(v7);
            int v9 = view1.getTop();
            int v10 = view1.getBottom();
            if(v1 < v10 && v9 < v2) {
                int v11 = v1 >= v9 || v10 >= v2 ? 0 : 1;
                if(view0 == null) {
                    view0 = view1;
                    v8 = v11;
                }
                else {
                    boolean z = v == 33 && v9 < view0.getTop() || v != 33 && v10 > view0.getBottom();
                    if(v8 == 0) {
                        if(v11 != 0) {
                            view0 = view1;
                            v8 = 1;
                        }
                        else if(z) {
                            view0 = view1;
                        }
                    }
                    else if(v11 != 0 && z) {
                        view0 = view1;
                    }
                }
            }
        }
        if(view0 == null) {
            view0 = this;
        }
        if(v1 < v4 || v2 > v5) {
            this.g((v == 33 ? v2 - v5 : v1 - v4), 0, 1, true);
            z1 = true;
        }
        else {
            z1 = false;
        }
        if(view0 != this.findFocus()) {
            view0.requestFocus(v);
        }
        return z1;
    }

    public void fling(int v) {
        if(this.getChildCount() > 0) {
            int v1 = this.getScrollX();
            int v2 = this.getScrollY();
            this.d.fling(v1, v2, 0, v, 0, 0, 0x80000000, 0x7FFFFFFF, 0, 0);
            this.startNestedScroll(2, 1);
            this.t = this.getScrollY();
            this.postInvalidateOnAnimation();
        }
    }

    public boolean fullScroll(int v) {
        int v1 = this.getHeight();
        Rect rect0 = this.c;
        rect0.top = 0;
        rect0.bottom = v1;
        if(v == 130) {
            int v2 = this.getChildCount();
            if(v2 > 0) {
                View view0 = this.getChildAt(v2 - 1);
                FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view0.getLayoutParams();
                int v3 = view0.getBottom() + frameLayout$LayoutParams0.bottomMargin;
                rect0.bottom = this.getPaddingBottom() + v3;
                rect0.top = rect0.bottom - v1;
            }
        }
        return this.f(v, rect0.top, rect0.bottom);
    }

    public final int g(int v, int v1, int v2, boolean z) {
        int v13;
        int v4;
        int v3;
        if(v2 == 1) {
            this.startNestedScroll(2, 1);
        }
        boolean z1 = this.dispatchNestedPreScroll(0, v, this.r, this.q, v2);
        int[] arr_v = this.r;
        int[] arr_v1 = this.q;
        if(z1) {
            v3 = v - arr_v[1];
            v4 = arr_v1[1];
        }
        else {
            v3 = v;
            v4 = 0;
        }
        int v5 = this.getScrollY();
        int v6 = this.getScrollRange();
        int v7 = this.getOverScrollMode();
        boolean z2 = (v7 == 0 || v7 == 1 && this.getScrollRange() > 0) && !z;
        int v8 = !this.e(v3, 0, v5, v6) || this.hasNestedScrollingParent(v2) ? 0 : 1;
        int v9 = this.getScrollY();
        arr_v[1] = 0;
        this.dispatchNestedScroll(0, v9 - v5, 0, v3 - (v9 - v5), this.q, v2, arr_v);
        int v10 = v4 + arr_v1[1];
        int v11 = v3 - arr_v[1];
        int v12 = v5 + v11;
        if(v12 >= 0) {
            if(v12 > v6 && z2) {
                EdgeEffectCompat.onPullDistance(this.mEdgeGlowBottom, ((float)v11) / ((float)this.getHeight()), 1.0f - ((float)v1) / ((float)this.getWidth()));
                if(!this.mEdgeGlowTop.isFinished()) {
                    this.mEdgeGlowTop.onRelease();
                }
            }
        }
        else if(z2) {
            EdgeEffectCompat.onPullDistance(this.mEdgeGlowTop, ((float)(-v11)) / ((float)this.getHeight()), ((float)v1) / ((float)this.getWidth()));
            if(!this.mEdgeGlowBottom.isFinished()) {
                this.mEdgeGlowBottom.onRelease();
            }
        }
        if(!this.mEdgeGlowTop.isFinished() || !this.mEdgeGlowBottom.isFinished()) {
            this.postInvalidateOnAnimation();
            v13 = 0;
        }
        else {
            v13 = v8;
        }
        if(v13 != 0 && v2 == 0) {
            VelocityTracker velocityTracker0 = this.j;
            if(velocityTracker0 != null) {
                velocityTracker0.clear();
            }
        }
        if(v2 == 1) {
            this.stopNestedScroll(1);
            this.mEdgeGlowTop.onRelease();
            this.mEdgeGlowBottom.onRelease();
        }
        return v10;
    }

    @Override  // android.view.View
    public float getBottomFadingEdgeStrength() {
        if(this.getChildCount() == 0) {
            return 0.0f;
        }
        View view0 = this.getChildAt(0);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view0.getLayoutParams();
        int v = this.getVerticalFadingEdgeLength();
        int v1 = this.getHeight();
        int v2 = this.getPaddingBottom();
        int v3 = view0.getBottom() + frameLayout$LayoutParams0.bottomMargin - this.getScrollY() - (v1 - v2);
        return v3 >= v ? 1.0f : ((float)v3) / ((float)v);
    }

    public int getMaxScrollAmount() {
        return (int)(((float)this.getHeight()) * 0.5f);
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.v.getNestedScrollAxes();
    }

    public int getScrollRange() {
        if(this.getChildCount() > 0) {
            View view0 = this.getChildAt(0);
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view0.getLayoutParams();
            return Math.max(0, view0.getHeight() + frameLayout$LayoutParams0.topMargin + frameLayout$LayoutParams0.bottomMargin - (this.getHeight() - this.getPaddingTop() - this.getPaddingBottom()));
        }
        return 0;
    }

    @Override  // android.view.View
    public float getTopFadingEdgeStrength() {
        if(this.getChildCount() == 0) {
            return 0.0f;
        }
        int v = this.getVerticalFadingEdgeLength();
        int v1 = this.getScrollY();
        return v1 >= v ? 1.0f : ((float)v1) / ((float)v);
    }

    @VisibleForTesting
    public float getVerticalScrollFactorCompat() {
        if(this.x == 0.0f) {
            TypedValue typedValue0 = new TypedValue();
            Context context0 = this.getContext();
            if(!context0.getTheme().resolveAttribute(0x101004D, typedValue0, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.x = typedValue0.getDimension(context0.getResources().getDisplayMetrics());
            return this.x;
        }
        return this.x;
    }

    public final boolean h(EdgeEffect edgeEffect0, int v) {
        if(v > 0) {
            return true;
        }
        float f = EdgeEffectCompat.getDistance(edgeEffect0) * ((float)this.getHeight());
        return ((float)(Math.exp(((double)NestedScrollView.A) / (((double)NestedScrollView.A) - 1.0) * Math.log(((float)Math.abs(-v)) * 0.35f / (this.a * 0.015f))) * ((double)(this.a * 0.015f)))) < f;
    }

    @Override  // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        return this.hasNestedScrollingParent(0);
    }

    @Override  // androidx.core.view.NestedScrollingChild2
    public boolean hasNestedScrollingParent(int v) {
        return this.w.hasNestedScrollingParent(v);
    }

    public final void i(int v, int v1, int v2, boolean z) {
        if(this.getChildCount() == 0) {
            return;
        }
        if(Long.compare(AnimationUtils.currentAnimationTimeMillis() - this.b, 0xFAL) > 0) {
            View view0 = this.getChildAt(0);
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view0.getLayoutParams();
            int v3 = view0.getHeight() + frameLayout$LayoutParams0.topMargin + frameLayout$LayoutParams0.bottomMargin;
            int v4 = this.getHeight();
            int v5 = this.getPaddingTop();
            int v6 = this.getPaddingBottom();
            int v7 = this.getScrollY();
            int v8 = this.getScrollX();
            this.d.startScroll(v8, v7, 0, Math.max(0, Math.min(v1 + v7, Math.max(0, v3 - (v4 - v5 - v6)))) - v7, v2);
            if(z) {
                this.startNestedScroll(2, 1);
            }
            else {
                this.stopNestedScroll(1);
            }
            this.t = this.getScrollY();
            this.postInvalidateOnAnimation();
        }
        else {
            if(!this.d.isFinished()) {
                this.d.abortAnimation();
                this.stopNestedScroll(1);
            }
            this.scrollBy(v, v1);
        }
        this.b = AnimationUtils.currentAnimationTimeMillis();
    }

    public boolean isFillViewport() {
        return this.k;
    }

    @Override  // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return this.w.isNestedScrollingEnabled();
    }

    public boolean isSmoothScrollingEnabled() {
        return this.l;
    }

    public final boolean j(MotionEvent motionEvent0) {
        boolean z;
        if(Float.compare(EdgeEffectCompat.getDistance(this.mEdgeGlowTop), 0.0f) == 0) {
            z = false;
        }
        else {
            EdgeEffectCompat.onPullDistance(this.mEdgeGlowTop, 0.0f, motionEvent0.getX() / ((float)this.getWidth()));
            z = true;
        }
        if(EdgeEffectCompat.getDistance(this.mEdgeGlowBottom) != 0.0f) {
            EdgeEffectCompat.onPullDistance(this.mEdgeGlowBottom, 0.0f, 1.0f - motionEvent0.getX() / ((float)this.getWidth()));
            return true;
        }
        return z;
    }

    @Override  // android.view.ViewGroup
    public void measureChild(@NonNull View view0, int v, int v1) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        int v2 = this.getPaddingLeft();
        view0.measure(ViewGroup.getChildMeasureSpec(v, this.getPaddingRight() + v2, viewGroup$LayoutParams0.width), 0);
    }

    @Override  // android.view.ViewGroup
    public void measureChildWithMargins(View view0, int v, int v1, int v2, int v3) {
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view0.getLayoutParams();
        int v4 = this.getPaddingLeft();
        view0.measure(ViewGroup.getChildMeasureSpec(v, this.getPaddingRight() + v4 + viewGroup$MarginLayoutParams0.leftMargin + viewGroup$MarginLayoutParams0.rightMargin + v1, viewGroup$MarginLayoutParams0.width), View.MeasureSpec.makeMeasureSpec(viewGroup$MarginLayoutParams0.topMargin + viewGroup$MarginLayoutParams0.bottomMargin, 0));
    }

    @Override  // android.view.ViewGroup
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.g = false;
    }

    @Override  // android.view.View
    public boolean onGenericMotionEvent(@NonNull MotionEvent motionEvent0) {
        int v1;
        float f;
        int v;
        if(motionEvent0.getAction() == 8 && !this.i) {
            if(MotionEventCompat.isFromSource(motionEvent0, 2)) {
                v = 9;
                f = motionEvent0.getAxisValue(9);
                v1 = (int)motionEvent0.getX();
            }
            else if(MotionEventCompat.isFromSource(motionEvent0, 0x400000)) {
                float f1 = motionEvent0.getAxisValue(26);
                v1 = this.getWidth() / 2;
                v = 26;
                f = f1;
            }
            else {
                v = 0;
                v1 = 0;
                f = 0.0f;
            }
            if(f != 0.0f) {
                this.g(-((int)(this.getVerticalScrollFactorCompat() * f)), v1, 1, MotionEventCompat.isFromSource(motionEvent0, 0x2002));
                if(v != 0) {
                    this.z.onMotionEvent(motionEvent0, v);
                }
                return true;
            }
        }
        return false;
    }

    @Override  // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NonNull MotionEvent motionEvent0) {
        int v = motionEvent0.getAction();
        boolean z = true;
        if(v == 2 && this.i) {
            return true;
        }
        if((v & 0xFF) == 0) {
            int v7 = (int)motionEvent0.getY();
            int v8 = (int)motionEvent0.getX();
            if(this.getChildCount() > 0) {
                int v9 = this.getScrollY();
                View view0 = this.getChildAt(0);
                if(v7 >= view0.getTop() - v9 && v7 < view0.getBottom() - v9 && v8 >= view0.getLeft() && v8 < view0.getRight()) {
                    this.e = v7;
                    this.p = motionEvent0.getPointerId(0);
                    VelocityTracker velocityTracker1 = this.j;
                    if(velocityTracker1 == null) {
                        this.j = VelocityTracker.obtain();
                    }
                    else {
                        velocityTracker1.clear();
                    }
                    this.j.addMovement(motionEvent0);
                    this.d.computeScrollOffset();
                    if(!this.j(motionEvent0) && this.d.isFinished()) {
                        z = false;
                    }
                    this.i = z;
                    this.startNestedScroll(2, 0);
                    return this.i;
                }
            }
            if(!this.j(motionEvent0) && this.d.isFinished()) {
                z = false;
            }
            this.i = z;
            VelocityTracker velocityTracker2 = this.j;
            if(velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.j = null;
            }
        }
        else {
            switch(v & 0xFF) {
                case 1: {
                    goto label_8;
                }
                case 2: {
                    goto label_23;
                }
            }
            switch(v & 0xFF) {
                case 3: {
                label_8:
                    this.i = false;
                    this.p = -1;
                    VelocityTracker velocityTracker0 = this.j;
                    if(velocityTracker0 != null) {
                        velocityTracker0.recycle();
                        this.j = null;
                    }
                    int v1 = this.getScrollX();
                    int v2 = this.getScrollY();
                    int v3 = this.getScrollRange();
                    if(this.d.springBack(v1, v2, 0, 0, 0, v3)) {
                        this.postInvalidateOnAnimation();
                    }
                    this.stopNestedScroll(0);
                    return this.i;
                }
                case 6: {
                    this.d(motionEvent0);
                    return this.i;
                }
                default: {
                    return this.i;
                }
            }
        label_23:
            int v4 = this.p;
            if(v4 != -1) {
                int v5 = motionEvent0.findPointerIndex(v4);
                if(v5 == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + v4 + " in onInterceptTouchEvent");
                    return this.i;
                }
                int v6 = (int)motionEvent0.getY(v5);
                if(Math.abs(v6 - this.e) > this.m && (2 & this.getNestedScrollAxes()) == 0) {
                    this.i = true;
                    this.e = v6;
                    if(this.j == null) {
                        this.j = VelocityTracker.obtain();
                    }
                    this.j.addMovement(motionEvent0);
                    this.s = 0;
                    ViewParent viewParent0 = this.getParent();
                    if(viewParent0 != null) {
                        viewParent0.requestDisallowInterceptTouchEvent(true);
                        return this.i;
                    }
                }
            }
        }
        return this.i;
    }

    @Override  // android.widget.FrameLayout
    public void onLayout(boolean z, int v, int v1, int v2, int v3) {
        int v6;
        super.onLayout(z, v, v1, v2, v3);
        int v4 = 0;
        this.f = false;
        if(this.h != null && NestedScrollView.a(this.h, this)) {
            View view0 = this.h;
            view0.getDrawingRect(this.c);
            this.offsetDescendantRectToMyCoords(view0, this.c);
            int v5 = this.computeScrollDeltaToGetChildRectOnScreen(this.c);
            if(v5 != 0) {
                this.scrollBy(0, v5);
            }
        }
        this.h = null;
        if(!this.g) {
            if(this.u != null) {
                this.scrollTo(this.getScrollX(), this.u.a);
                this.u = null;
            }
            if(this.getChildCount() > 0) {
                View view1 = this.getChildAt(0);
                FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view1.getLayoutParams();
                v6 = view1.getMeasuredHeight() + frameLayout$LayoutParams0.topMargin + frameLayout$LayoutParams0.bottomMargin;
            }
            else {
                v6 = 0;
            }
            int v7 = v3 - v1 - this.getPaddingTop() - this.getPaddingBottom();
            int v8 = this.getScrollY();
            if(v7 < v6 && v8 >= 0) {
                v4 = v7 + v8 <= v6 ? v8 : v6 - v7;
            }
            if(v4 != v8) {
                this.scrollTo(this.getScrollX(), v4);
            }
        }
        this.scrollTo(this.getScrollX(), this.getScrollY());
        this.g = true;
    }

    @Override  // android.widget.FrameLayout
    public void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        if(!this.k) {
            return;
        }
        if(View.MeasureSpec.getMode(v1) == 0) {
            return;
        }
        if(this.getChildCount() > 0) {
            View view0 = this.getChildAt(0);
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view0.getLayoutParams();
            int v2 = view0.getMeasuredHeight();
            int v3 = this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom() - frameLayout$LayoutParams0.topMargin - frameLayout$LayoutParams0.bottomMargin;
            if(v2 < v3) {
                int v4 = this.getPaddingLeft();
                view0.measure(ViewGroup.getChildMeasureSpec(v, this.getPaddingRight() + v4 + frameLayout$LayoutParams0.leftMargin + frameLayout$LayoutParams0.rightMargin, frameLayout$LayoutParams0.width), View.MeasureSpec.makeMeasureSpec(v3, 0x40000000));
            }
        }
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(@NonNull View view0, float f, float f1, boolean z) {
        if(!z) {
            this.dispatchNestedFling(0.0f, f1, true);
            this.fling(((int)f1));
            return true;
        }
        return false;
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(@NonNull View view0, float f, float f1) {
        return this.dispatchNestedPreFling(f, f1);
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(@NonNull View view0, int v, int v1, @NonNull int[] arr_v) {
        this.onNestedPreScroll(view0, v, v1, arr_v, 0);
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(@NonNull View view0, int v, int v1, @NonNull int[] arr_v, int v2) {
        this.dispatchNestedPreScroll(v, v1, arr_v, null, v2);
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(@NonNull View view0, int v, int v1, int v2, int v3) {
        this.c(v3, 0, null);
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(@NonNull View view0, int v, int v1, int v2, int v3, int v4) {
        this.c(v3, v4, null);
    }

    @Override  // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(@NonNull View view0, int v, int v1, int v2, int v3, int v4, @NonNull int[] arr_v) {
        this.c(v3, v4, arr_v);
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(@NonNull View view0, @NonNull View view1, int v) {
        this.onNestedScrollAccepted(view0, view1, v, 0);
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(@NonNull View view0, @NonNull View view1, int v, int v1) {
        this.v.onNestedScrollAccepted(view0, view1, v, v1);
        this.startNestedScroll(2, v1);
    }

    @Override  // android.view.View
    public void onOverScrolled(int v, int v1, boolean z, boolean z1) {
        super.scrollTo(v, v1);
    }

    @Override  // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int v, Rect rect0) {
        switch(v) {
            case 1: {
                v = 33;
                break;
            }
            case 2: {
                v = 130;
            }
        }
        View view0 = rect0 == null ? FocusFinder.getInstance().findNextFocus(this, null, v) : FocusFinder.getInstance().findNextFocusFromRect(this, rect0, v);
        if(view0 == null) {
            return false;
        }
        return this.b(0, view0, this.getHeight()) ? view0.requestFocus(v, rect0) : false;
    }

    @Override  // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof j)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((j)parcelable0).getSuperState());
        this.u = (j)parcelable0;
        this.requestLayout();
    }

    @Override  // android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new j(super.onSaveInstanceState());  // 初始化器: Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V
        parcelable0.a = this.getScrollY();
        return parcelable0;
    }

    @Override  // android.view.View
    public void onScrollChanged(int v, int v1, int v2, int v3) {
        super.onScrollChanged(v, v1, v2, v3);
        OnScrollChangeListener nestedScrollView$OnScrollChangeListener0 = this.y;
        if(nestedScrollView$OnScrollChangeListener0 != null) {
            nestedScrollView$OnScrollChangeListener0.onScrollChange(this, v, v1, v2, v3);
        }
    }

    @Override  // android.view.View
    public void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        View view0 = this.findFocus();
        if(view0 != null && this != view0 && this.b(0, view0, v3)) {
            view0.getDrawingRect(this.c);
            this.offsetDescendantRectToMyCoords(view0, this.c);
            int v4 = this.computeScrollDeltaToGetChildRectOnScreen(this.c);
            if(v4 != 0) {
                if(this.l) {
                    this.smoothScrollBy(0, v4);
                    return;
                }
                this.scrollBy(0, v4);
            }
        }
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(@NonNull View view0, @NonNull View view1, int v) {
        return this.onStartNestedScroll(view0, view1, v, 0);
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(@NonNull View view0, @NonNull View view1, int v, int v1) {
        return (v & 2) != 0;
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(@NonNull View view0) {
        this.onStopNestedScroll(view0, 0);
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(@NonNull View view0, int v) {
        this.v.onStopNestedScroll(view0, v);
        this.stopNestedScroll(v);
    }

    @Override  // android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent0) {
        float f3;
        if(this.j == null) {
            this.j = VelocityTracker.obtain();
        }
        int v = motionEvent0.getActionMasked();
        if(v == 0) {
            this.s = 0;
        }
        MotionEvent motionEvent1 = MotionEvent.obtain(motionEvent0);
        float f = 0.0f;
        motionEvent1.offsetLocation(0.0f, ((float)this.s));
        if(v == 0) {
            if(this.getChildCount() == 0) {
                return false;
            }
            if(this.i) {
                ViewParent viewParent1 = this.getParent();
                if(viewParent1 != null) {
                    viewParent1.requestDisallowInterceptTouchEvent(true);
                }
            }
            if(!this.d.isFinished()) {
                this.d.abortAnimation();
                this.stopNestedScroll(1);
            }
            int v15 = (int)motionEvent0.getY();
            int v16 = motionEvent0.getPointerId(0);
            this.e = v15;
            this.p = v16;
            this.startNestedScroll(2, 0);
        }
        else {
            switch(v) {
                case 1: {
                    VelocityTracker velocityTracker0 = this.j;
                    velocityTracker0.computeCurrentVelocity(1000, ((float)this.o));
                    int v1 = (int)velocityTracker0.getYVelocity(this.p);
                    if(Math.abs(v1) < this.n) {
                        int v2 = this.getScrollX();
                        int v3 = this.getScrollY();
                        int v4 = this.getScrollRange();
                        if(this.d.springBack(v2, v3, 0, 0, 0, v4)) {
                            this.postInvalidateOnAnimation();
                        }
                    }
                    else if(EdgeEffectCompat.getDistance(this.mEdgeGlowTop) == 0.0f) {
                        if(EdgeEffectCompat.getDistance(this.mEdgeGlowBottom) == 0.0f) {
                            if(!this.dispatchNestedPreFling(0.0f, ((float)(-v1)))) {
                                this.dispatchNestedFling(0.0f, ((float)(-v1)), true);
                                this.fling(-v1);
                            }
                        }
                        else if(this.h(this.mEdgeGlowBottom, -v1)) {
                            this.mEdgeGlowBottom.onAbsorb(-v1);
                        }
                        else {
                            this.fling(-v1);
                        }
                    }
                    else if(this.h(this.mEdgeGlowTop, v1)) {
                        this.mEdgeGlowTop.onAbsorb(v1);
                    }
                    else {
                        this.fling(-v1);
                    }
                    this.p = -1;
                    this.i = false;
                    VelocityTracker velocityTracker1 = this.j;
                    if(velocityTracker1 != null) {
                        velocityTracker1.recycle();
                        this.j = null;
                    }
                    this.stopNestedScroll(0);
                    this.mEdgeGlowTop.onRelease();
                    this.mEdgeGlowBottom.onRelease();
                    break;
                }
                case 2: {
                    int v5 = motionEvent0.findPointerIndex(this.p);
                    if(v5 == -1) {
                        Log.e("NestedScrollView", "Invalid pointerId=" + this.p + " in onTouchEvent");
                    }
                    else {
                        int v6 = (int)motionEvent0.getY(v5);
                        int v7 = this.e - v6;
                        float f1 = motionEvent0.getX(v5) / ((float)this.getWidth());
                        float f2 = ((float)v7) / ((float)this.getHeight());
                        if(EdgeEffectCompat.getDistance(this.mEdgeGlowTop) != 0.0f) {
                            f3 = -EdgeEffectCompat.onPullDistance(this.mEdgeGlowTop, -f2, f1);
                            if(EdgeEffectCompat.getDistance(this.mEdgeGlowTop) == 0.0f) {
                                this.mEdgeGlowTop.onRelease();
                            }
                            f = f3;
                        }
                        else if(EdgeEffectCompat.getDistance(this.mEdgeGlowBottom) != 0.0f) {
                            f3 = EdgeEffectCompat.onPullDistance(this.mEdgeGlowBottom, f2, 1.0f - f1);
                            if(EdgeEffectCompat.getDistance(this.mEdgeGlowBottom) == 0.0f) {
                                this.mEdgeGlowBottom.onRelease();
                            }
                            f = f3;
                        }
                        int v8 = Math.round(f * ((float)this.getHeight()));
                        if(v8 != 0) {
                            this.invalidate();
                        }
                        int v9 = v7 - v8;
                        if(!this.i && Math.abs(v9) > this.m) {
                            ViewParent viewParent0 = this.getParent();
                            if(viewParent0 != null) {
                                viewParent0.requestDisallowInterceptTouchEvent(true);
                            }
                            this.i = true;
                            v9 = v9 <= 0 ? v9 + this.m : v9 - this.m;
                        }
                        if(this.i) {
                            int v10 = this.g(v9, ((int)motionEvent0.getX(v5)), 0, false);
                            this.e = v6 - v10;
                            this.s += v10;
                        }
                    }
                    break;
                }
                case 3: {
                    if(this.i && this.getChildCount() > 0) {
                        int v11 = this.getScrollX();
                        int v12 = this.getScrollY();
                        int v13 = this.getScrollRange();
                        if(this.d.springBack(v11, v12, 0, 0, 0, v13)) {
                            this.postInvalidateOnAnimation();
                        }
                    }
                    this.p = -1;
                    this.i = false;
                    VelocityTracker velocityTracker2 = this.j;
                    if(velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.j = null;
                    }
                    this.stopNestedScroll(0);
                    this.mEdgeGlowTop.onRelease();
                    this.mEdgeGlowBottom.onRelease();
                    break;
                }
                case 5: {
                    int v14 = motionEvent0.getActionIndex();
                    this.e = (int)motionEvent0.getY(v14);
                    this.p = motionEvent0.getPointerId(v14);
                    break;
                }
                case 6: {
                    this.d(motionEvent0);
                    this.e = (int)motionEvent0.getY(motionEvent0.findPointerIndex(this.p));
                }
            }
        }
        VelocityTracker velocityTracker3 = this.j;
        if(velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent1);
        }
        motionEvent1.recycle();
        return true;
    }

    public boolean pageScroll(int v) {
        int v1 = this.getHeight();
        Rect rect0 = this.c;
        if(v == 130) {
            rect0.top = this.getScrollY() + v1;
            int v2 = this.getChildCount();
            if(v2 > 0) {
                View view0 = this.getChildAt(v2 - 1);
                FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view0.getLayoutParams();
                int v3 = view0.getBottom() + frameLayout$LayoutParams0.bottomMargin;
                int v4 = this.getPaddingBottom() + v3;
                if(rect0.top + v1 > v4) {
                    rect0.top = v4 - v1;
                }
            }
        }
        else {
            rect0.top = this.getScrollY() - v1;
            if(rect0.top < 0) {
                rect0.top = 0;
            }
        }
        int v5 = v1 + rect0.top;
        rect0.bottom = v5;
        return this.f(v, rect0.top, v5);
    }

    @Override  // android.view.ViewGroup
    public void requestChildFocus(View view0, View view1) {
        if(this.f) {
            this.h = view1;
        }
        else {
            view1.getDrawingRect(this.c);
            this.offsetDescendantRectToMyCoords(view1, this.c);
            int v = this.computeScrollDeltaToGetChildRectOnScreen(this.c);
            if(v != 0) {
                this.scrollBy(0, v);
            }
        }
        super.requestChildFocus(view0, view1);
    }

    @Override  // android.view.ViewGroup
    public boolean requestChildRectangleOnScreen(@NonNull View view0, Rect rect0, boolean z) {
        rect0.offset(view0.getLeft() - view0.getScrollX(), view0.getTop() - view0.getScrollY());
        int v = this.computeScrollDeltaToGetChildRectOnScreen(rect0);
        if(v != 0) {
            if(z) {
                this.scrollBy(0, v);
                return true;
            }
            this.smoothScrollBy(0, v);
        }
        return v != 0;
    }

    @Override  // android.view.ViewGroup
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if(z) {
            VelocityTracker velocityTracker0 = this.j;
            if(velocityTracker0 != null) {
                velocityTracker0.recycle();
                this.j = null;
            }
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override  // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f = true;
        super.requestLayout();
    }

    @Override  // android.view.View
    public void scrollTo(int v, int v1) {
        if(this.getChildCount() > 0) {
            View view0 = this.getChildAt(0);
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view0.getLayoutParams();
            int v2 = this.getWidth() - this.getPaddingLeft() - this.getPaddingRight();
            int v3 = view0.getWidth() + frameLayout$LayoutParams0.leftMargin + frameLayout$LayoutParams0.rightMargin;
            int v4 = this.getHeight() - this.getPaddingTop() - this.getPaddingBottom();
            int v5 = view0.getHeight() + frameLayout$LayoutParams0.topMargin + frameLayout$LayoutParams0.bottomMargin;
            if(v2 >= v3 || v < 0) {
                v = 0;
            }
            else if(v2 + v > v3) {
                v = v3 - v2;
            }
            if(v4 >= v5 || v1 < 0) {
                v1 = 0;
            }
            else if(v4 + v1 > v5) {
                v1 = v5 - v4;
            }
            if(v != this.getScrollX() || v1 != this.getScrollY()) {
                super.scrollTo(v, v1);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if(z != this.k) {
            this.k = z;
            this.requestLayout();
        }
    }

    @Override  // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z) {
        this.w.setNestedScrollingEnabled(z);
    }

    public void setOnScrollChangeListener(@Nullable OnScrollChangeListener nestedScrollView$OnScrollChangeListener0) {
        this.y = nestedScrollView$OnScrollChangeListener0;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.l = z;
    }

    @Override  // android.widget.FrameLayout
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public final void smoothScrollBy(int v, int v1) {
        this.i(v, v1, 0xFA, false);
    }

    public final void smoothScrollBy(int v, int v1, int v2) {
        this.i(v, v1, v2, false);
    }

    public final void smoothScrollTo(int v, int v1) {
        this.i(v - this.getScrollX(), v1 - this.getScrollY(), 0xFA, false);
    }

    public final void smoothScrollTo(int v, int v1, int v2) {
        this.i(v - this.getScrollX(), v1 - this.getScrollY(), v2, false);
    }

    @Override  // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int v) {
        return this.startNestedScroll(v, 0);
    }

    @Override  // androidx.core.view.NestedScrollingChild2
    public boolean startNestedScroll(int v, int v1) {
        return this.w.startNestedScroll(v, v1);
    }

    @Override  // android.view.View, androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
        this.stopNestedScroll(0);
    }

    @Override  // androidx.core.view.NestedScrollingChild2
    public void stopNestedScroll(int v) {
        this.w.stopNestedScroll(v);
    }
}

