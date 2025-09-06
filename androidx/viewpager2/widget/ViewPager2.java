package androidx.viewpager2.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ItemAnimator;
import androidx.recyclerview.widget.RecyclerView.ItemDecoration;
import androidx.viewpager2.R.styleable;
import androidx.viewpager2.adapter.StatefulAdapter;
import g5.b;
import g5.d;
import g5.e;
import g5.h;
import g5.k;
import g5.l;
import g5.m;
import g5.n;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class ViewPager2 extends ViewGroup {
    @IntRange(from = 1L)
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface OffscreenPageLimit {
    }

    public static abstract class OnPageChangeCallback {
        public void onPageScrollStateChanged(int v) {
        }

        public void onPageScrolled(int v, float f, @Px int v1) {
        }

        public void onPageSelected(int v) {
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Orientation {
    }

    public interface PageTransformer {
        void transformPage(@NonNull View arg1, float arg2);
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ScrollState {
    }

    public static final int OFFSCREEN_PAGE_LIMIT_DEFAULT = -1;
    public static final int ORIENTATION_HORIZONTAL = 0;
    public static final int ORIENTATION_VERTICAL = 1;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    public final Rect a;
    public final Rect b;
    public final a c;
    public int d;
    public boolean e;
    public final d f;
    public h g;
    public int h;
    public Parcelable i;
    public m j;
    public l k;
    public c l;
    public a m;
    public b n;
    public androidx.viewpager2.widget.b o;
    public ItemAnimator p;
    public boolean q;
    public boolean r;
    public int s;
    public k t;

    public ViewPager2(@NonNull Context context0) {
        super(context0);
        this.a = new Rect();
        this.b = new Rect();
        this.c = new a();
        this.e = false;
        this.f = new d(this, 0);
        this.h = -1;
        this.p = null;
        this.q = false;
        this.r = true;
        this.s = -1;
        this.a(context0, null);
    }

    public ViewPager2(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.a = new Rect();
        this.b = new Rect();
        this.c = new a();
        this.e = false;
        this.f = new d(this, 0);
        this.h = -1;
        this.p = null;
        this.q = false;
        this.r = true;
        this.s = -1;
        this.a(context0, attributeSet0);
    }

    public ViewPager2(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.a = new Rect();
        this.b = new Rect();
        this.c = new a();
        this.e = false;
        this.f = new d(this, 0);
        this.h = -1;
        this.p = null;
        this.q = false;
        this.r = true;
        this.s = -1;
        this.a(context0, attributeSet0);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @RequiresApi(21)
    public ViewPager2(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.a = new Rect();
        this.b = new Rect();
        this.c = new a();
        this.e = false;
        this.f = new d(this, 0);
        this.h = -1;
        this.p = null;
        this.q = false;
        this.r = true;
        this.s = -1;
        this.a(context0, attributeSet0);
    }

    public final void a(Context context0, AttributeSet attributeSet0) {
        this.t = new k(this);
        m m0 = new m(this, context0);
        this.j = m0;
        m0.setId(ViewCompat.generateViewId());
        this.j.setDescendantFocusability(0x20000);
        h h0 = new h(this, context0);
        this.g = h0;
        this.j.setLayoutManager(h0);
        this.j.setScrollingTouchSlop(1);
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.ViewPager2);
        ViewCompat.saveAttributeDataForStyleable(this, context0, styleable.ViewPager2, attributeSet0, typedArray0, 0, 0);
        try {
            this.setOrientation(typedArray0.getInt(styleable.ViewPager2_android_orientation, 0));
        }
        finally {
            typedArray0.recycle();
        }
        this.j.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.j.addOnChildAttachStateChangeListener(new e());  // 初始化器: Ljava/lang/Object;-><init>()V
        c c0 = new c(this);
        this.l = c0;
        this.n = new b(this, c0, this.j);
        l l0 = new l(this);
        this.k = l0;
        l0.attachToRecyclerView(this.j);
        this.j.addOnScrollListener(this.l);
        a a0 = new a();
        this.m = a0;
        this.l.a = a0;
        androidx.viewpager2.widget.d d0 = new androidx.viewpager2.widget.d(this);
        androidx.viewpager2.widget.e e0 = new androidx.viewpager2.widget.e(this);
        this.m.a.add(d0);
        this.m.a.add(e0);
        k k0 = this.t;
        m m1 = this.j;
        k0.getClass();
        ViewCompat.setImportantForAccessibility(m1, 2);
        k0.c = new d(k0, 1);
        ViewPager2 viewPager20 = k0.d;
        if(ViewCompat.getImportantForAccessibility(viewPager20) == 0) {
            ViewCompat.setImportantForAccessibility(viewPager20, 1);
        }
        this.m.a.add(this.c);
        androidx.viewpager2.widget.b b0 = new androidx.viewpager2.widget.b(this.g);
        this.o = b0;
        this.m.a.add(b0);
        this.attachViewToParent(this.j, 0, this.j.getLayoutParams());
    }

    public void addItemDecoration(@NonNull ItemDecoration recyclerView$ItemDecoration0) {
        this.j.addItemDecoration(recyclerView$ItemDecoration0);
    }

    public void addItemDecoration(@NonNull ItemDecoration recyclerView$ItemDecoration0, int v) {
        this.j.addItemDecoration(recyclerView$ItemDecoration0, v);
    }

    public final void b() {
        if(this.h == -1) {
            return;
        }
        Adapter recyclerView$Adapter0 = this.getAdapter();
        if(recyclerView$Adapter0 == null) {
            return;
        }
        Parcelable parcelable0 = this.i;
        if(parcelable0 != null) {
            if(recyclerView$Adapter0 instanceof StatefulAdapter) {
                ((StatefulAdapter)recyclerView$Adapter0).restoreState(parcelable0);
            }
            this.i = null;
        }
        int v = Math.max(0, Math.min(this.h, recyclerView$Adapter0.getItemCount() - 1));
        this.d = v;
        this.h = -1;
        this.j.scrollToPosition(v);
        this.t.a();
    }

    public boolean beginFakeDrag() {
        b b0 = this.n;
        c c0 = b0.b;
        if(c0.f != 1) {
            b0.g = 0;
            b0.f = 0.0f;
            b0.h = SystemClock.uptimeMillis();
            VelocityTracker velocityTracker0 = b0.d;
            if(velocityTracker0 == null) {
                b0.d = VelocityTracker.obtain();
                b0.e = ViewConfiguration.get(b0.a.getContext()).getScaledMaximumFlingVelocity();
            }
            else {
                velocityTracker0.clear();
            }
            c0.e = 4;
            c0.d(true);
            if(c0.f != 0) {
                b0.c.stopScroll();
            }
            MotionEvent motionEvent0 = MotionEvent.obtain(b0.h, b0.h, 0, 0.0f, 0.0f, 0);
            b0.d.addMovement(motionEvent0);
            motionEvent0.recycle();
            return true;
        }
        return false;
    }

    public final void c(int v, boolean z) {
        Adapter recyclerView$Adapter0 = this.getAdapter();
        boolean z1 = false;
        if(recyclerView$Adapter0 == null) {
            if(this.h != -1) {
                this.h = Math.max(v, 0);
            }
            return;
        }
        if(recyclerView$Adapter0.getItemCount() <= 0) {
            return;
        }
        int v1 = Math.min(Math.max(v, 0), recyclerView$Adapter0.getItemCount() - 1);
        int v2 = this.d;
        if(v1 == v2 && this.l.f == 0) {
            return;
        }
        if(v1 == v2 && z) {
            return;
        }
        double f = (double)v2;
        this.d = v1;
        this.t.a();
        c c0 = this.l;
        if(c0.f != 0) {
            c0.e();
            f = ((double)c0.g.a) + ((double)c0.g.b);
        }
        c c1 = this.l;
        c1.getClass();
        c1.e = z ? 2 : 3;
        c1.m = false;
        if(c1.i != v1) {
            z1 = true;
        }
        c1.i = v1;
        c1.b(2);
        if(z1) {
            c1.a(v1);
        }
        if(!z) {
            this.j.scrollToPosition(v1);
            return;
        }
        if(Math.abs(((double)v1) - f) > 3.0) {
            this.j.scrollToPosition((((double)v1) > f ? v1 - 3 : v1 + 3));
            this.j.post(new androidx.work.impl.foreground.b(v1, this.j));
            return;
        }
        this.j.smoothScrollToPosition(v1);
    }

    @Override  // android.view.View
    public boolean canScrollHorizontally(int v) {
        return this.j.canScrollHorizontally(v);
    }

    @Override  // android.view.View
    public boolean canScrollVertically(int v) {
        return this.j.canScrollVertically(v);
    }

    public final void d() {
        l l0 = this.k;
        if(l0 == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View view0 = l0.findSnapView(this.g);
        if(view0 == null) {
            return;
        }
        int v = this.g.getPosition(view0);
        if(v != this.d && this.getScrollState() == 0) {
            this.m.onPageSelected(v);
        }
        this.e = false;
    }

    @Override  // android.view.ViewGroup
    public void dispatchRestoreInstanceState(SparseArray sparseArray0) {
        Parcelable parcelable0 = (Parcelable)sparseArray0.get(this.getId());
        if(parcelable0 instanceof n) {
            int v = ((n)parcelable0).a;
            sparseArray0.put(this.j.getId(), ((Parcelable)sparseArray0.get(v)));
            sparseArray0.remove(v);
        }
        super.dispatchRestoreInstanceState(sparseArray0);
        this.b();
    }

    public boolean endFakeDrag() {
        b b0 = this.n;
        c c0 = b0.b;
        if(c0.m) {
            c0.m = false;
            c0.e();
            g5.c c1 = c0.g;
            if(c1.c == 0) {
                int v = c1.a;
                if(v != c0.h) {
                    c0.a(v);
                }
                c0.b(0);
                c0.c();
            }
            else {
                c0.b(2);
            }
            VelocityTracker velocityTracker0 = b0.d;
            velocityTracker0.computeCurrentVelocity(1000, ((float)b0.e));
            int v1 = (int)velocityTracker0.getXVelocity();
            int v2 = (int)velocityTracker0.getYVelocity();
            if(!b0.c.fling(v1, v2)) {
                ViewPager2 viewPager20 = b0.a;
                View view0 = viewPager20.k.findSnapView(viewPager20.g);
                if(view0 != null) {
                    int[] arr_v = viewPager20.k.calculateDistanceToFinalSnap(viewPager20.g, view0);
                    int v3 = arr_v[0];
                    if(v3 != 0 || arr_v[1] != 0) {
                        viewPager20.j.smoothScrollBy(v3, arr_v[1]);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean fakeDragBy(@SuppressLint({"SupportAnnotationUsage"}) @Px float f) {
        b b0 = this.n;
        boolean z = false;
        if(b0.b.m) {
            float f1 = b0.f - f;
            b0.f = f1;
            int v = Math.round(f1 - ((float)b0.g));
            b0.g += v;
            long v1 = SystemClock.uptimeMillis();
            boolean z1 = b0.a.getOrientation() == 0;
            if(!z1) {
                z = v;
            }
            float f2 = 0.0f;
            float f3 = z1 ? b0.f : 0.0f;
            if(!z1) {
                f2 = b0.f;
            }
            b0.c.scrollBy((z1 ? v : 0), ((int)z));
            MotionEvent motionEvent0 = MotionEvent.obtain(b0.h, v1, 2, f3, f2, 0);
            b0.d.addMovement(motionEvent0);
            motionEvent0.recycle();
            return true;
        }
        return false;
    }

    @Override  // android.view.ViewGroup
    @RequiresApi(23)
    public CharSequence getAccessibilityClassName() {
        this.t.getClass();
        this.t.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    @Nullable
    public Adapter getAdapter() {
        return this.j.getAdapter();
    }

    public int getCurrentItem() {
        return this.d;
    }

    @NonNull
    public ItemDecoration getItemDecorationAt(int v) {
        return this.j.getItemDecorationAt(v);
    }

    public int getItemDecorationCount() {
        return this.j.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.s;
    }

    public int getOrientation() {
        return this.g.getOrientation() == 1 ? 1 : 0;
    }

    public int getPageSize() {
        m m0 = this.j;
        return this.getOrientation() == 0 ? m0.getWidth() - m0.getPaddingLeft() - m0.getPaddingRight() : m0.getHeight() - m0.getPaddingTop() - m0.getPaddingBottom();
    }

    public int getScrollState() {
        return this.l.f;
    }

    public void invalidateItemDecorations() {
        this.j.invalidateItemDecorations();
    }

    public boolean isFakeDragging() {
        return this.n.b.m;
    }

    public boolean isUserInputEnabled() {
        return this.r;
    }

    @Override  // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo0) {
        int v1;
        int v;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        k k0 = this.t;
        k0.getClass();
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0 = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo0);
        ViewPager2 viewPager20 = k0.d;
        if(viewPager20.getAdapter() == null) {
            v = 0;
            v1 = 0;
        }
        else if(viewPager20.getOrientation() == 1) {
            v = viewPager20.getAdapter().getItemCount();
            v1 = 1;
        }
        else {
            v1 = viewPager20.getAdapter().getItemCount();
            v = 1;
        }
        accessibilityNodeInfoCompat0.setCollectionInfo(CollectionInfoCompat.obtain(v, v1, false, 0));
        Adapter recyclerView$Adapter0 = viewPager20.getAdapter();
        if(recyclerView$Adapter0 != null) {
            int v2 = recyclerView$Adapter0.getItemCount();
            if(v2 != 0 && viewPager20.isUserInputEnabled()) {
                if(viewPager20.d > 0) {
                    accessibilityNodeInfoCompat0.addAction(0x2000);
                }
                if(viewPager20.d < v2 - 1) {
                    accessibilityNodeInfoCompat0.addAction(0x1000);
                }
                accessibilityNodeInfoCompat0.setScrollable(true);
            }
        }
    }

    @Override  // android.view.ViewGroup
    public void onLayout(boolean z, int v, int v1, int v2, int v3) {
        int v4 = this.j.getMeasuredWidth();
        int v5 = this.j.getMeasuredHeight();
        this.a.left = this.getPaddingLeft();
        this.a.right = v2 - v - this.getPaddingRight();
        this.a.top = this.getPaddingTop();
        this.a.bottom = v3 - v1 - this.getPaddingBottom();
        Gravity.apply(0x800033, v4, v5, this.a, this.b);
        this.j.layout(this.b.left, this.b.top, this.b.right, this.b.bottom);
        if(this.e) {
            this.d();
        }
    }

    @Override  // android.view.View
    public void onMeasure(int v, int v1) {
        this.measureChild(this.j, v, v1);
        int v2 = this.j.getMeasuredWidth();
        int v3 = this.j.getMeasuredHeight();
        int v4 = this.j.getMeasuredState();
        int v5 = this.getPaddingLeft();
        int v6 = this.getPaddingRight();
        int v7 = this.getPaddingTop();
        int v8 = this.getPaddingBottom();
        int v9 = Math.max(v6 + v5 + v2, this.getSuggestedMinimumWidth());
        int v10 = Math.max(v8 + v7 + v3, this.getSuggestedMinimumHeight());
        this.setMeasuredDimension(View.resolveSizeAndState(v9, v, v4), View.resolveSizeAndState(v10, v1, v4 << 16));
    }

    @Override  // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof n)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((n)parcelable0).getSuperState());
        this.h = ((n)parcelable0).b;
        this.i = ((n)parcelable0).c;
    }

    @Override  // android.view.View
    @Nullable
    public Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new n(super.onSaveInstanceState());  // 初始化器: Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V
        parcelable0.a = this.j.getId();
        parcelable0.b = this.h == -1 ? this.d : this.h;
        Parcelable parcelable1 = this.i;
        if(parcelable1 != null) {
            parcelable0.c = parcelable1;
            return parcelable0;
        }
        Adapter recyclerView$Adapter0 = this.j.getAdapter();
        if(recyclerView$Adapter0 instanceof StatefulAdapter) {
            parcelable0.c = ((StatefulAdapter)recyclerView$Adapter0).saveState();
        }
        return parcelable0;
    }

    @Override  // android.view.ViewGroup
    public void onViewAdded(View view0) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override  // android.view.View
    @RequiresApi(16)
    public boolean performAccessibilityAction(int v, @Nullable Bundle bundle0) {
        this.t.getClass();
        if(v != 0x1000 && v != 0x2000) {
            return super.performAccessibilityAction(v, bundle0);
        }
        k k0 = this.t;
        k0.getClass();
        ViewPager2 viewPager20 = k0.d;
        int v1 = v == 0x2000 ? viewPager20.getCurrentItem() - 1 : viewPager20.getCurrentItem() + 1;
        if(viewPager20.isUserInputEnabled()) {
            viewPager20.c(v1, true);
        }
        return true;
    }

    public void registerOnPageChangeCallback(@NonNull OnPageChangeCallback viewPager2$OnPageChangeCallback0) {
        this.c.a.add(viewPager2$OnPageChangeCallback0);
    }

    public void removeItemDecoration(@NonNull ItemDecoration recyclerView$ItemDecoration0) {
        this.j.removeItemDecoration(recyclerView$ItemDecoration0);
    }

    public void removeItemDecorationAt(int v) {
        this.j.removeItemDecorationAt(v);
    }

    public void requestTransform() {
        if(this.o.b == null) {
            return;
        }
        c c0 = this.l;
        c0.e();
        double f = ((double)c0.g.a) + ((double)c0.g.b);
        float f1 = (float)(f - ((double)(((int)f))));
        int v = Math.round(((float)this.getPageSize()) * f1);
        this.o.onPageScrolled(((int)f), f1, v);
    }

    public void setAdapter(@Nullable Adapter recyclerView$Adapter0) {
        Adapter recyclerView$Adapter1 = this.j.getAdapter();
        k k0 = this.t;
        if(recyclerView$Adapter1 == null) {
            k0.getClass();
        }
        else {
            recyclerView$Adapter1.unregisterAdapterDataObserver(k0.c);
        }
        d d0 = this.f;
        if(recyclerView$Adapter1 != null) {
            recyclerView$Adapter1.unregisterAdapterDataObserver(d0);
        }
        this.j.setAdapter(recyclerView$Adapter0);
        this.d = 0;
        this.b();
        k k1 = this.t;
        k1.a();
        if(recyclerView$Adapter0 != null) {
            recyclerView$Adapter0.registerAdapterDataObserver(k1.c);
        }
        if(recyclerView$Adapter0 != null) {
            recyclerView$Adapter0.registerAdapterDataObserver(d0);
        }
    }

    public void setCurrentItem(int v) {
        this.setCurrentItem(v, true);
    }

    public void setCurrentItem(int v, boolean z) {
        if(this.isFakeDragging()) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        this.c(v, z);
    }

    @Override  // android.view.View
    @RequiresApi(17)
    public void setLayoutDirection(int v) {
        super.setLayoutDirection(v);
        this.t.a();
    }

    public void setOffscreenPageLimit(int v) {
        if(v < 1 && v != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.s = v;
        this.j.requestLayout();
    }

    public void setOrientation(int v) {
        this.g.setOrientation(v);
        this.t.a();
    }

    public void setPageTransformer(@Nullable PageTransformer viewPager2$PageTransformer0) {
        if(viewPager2$PageTransformer0 != null) {
            if(!this.q) {
                this.p = this.j.getItemAnimator();
                this.q = true;
            }
            this.j.setItemAnimator(null);
        }
        else if(this.q) {
            this.j.setItemAnimator(this.p);
            this.p = null;
            this.q = false;
        }
        androidx.viewpager2.widget.b b0 = this.o;
        if(viewPager2$PageTransformer0 == b0.b) {
            return;
        }
        b0.b = viewPager2$PageTransformer0;
        this.requestTransform();
    }

    public void setUserInputEnabled(boolean z) {
        this.r = z;
        this.t.a();
    }

    public void unregisterOnPageChangeCallback(@NonNull OnPageChangeCallback viewPager2$OnPageChangeCallback0) {
        this.c.a.remove(viewPager2$OnPageChangeCallback0);
    }
}

