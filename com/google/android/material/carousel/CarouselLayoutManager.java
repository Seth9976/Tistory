package com.google.android.material.carousel;

import a7.b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View.OnLayoutChangeListener;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.activity.e0;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.Recycler;
import androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider;
import androidx.recyclerview.widget.RecyclerView.State;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R.styleable;
import com.google.android.material.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kotlin.text.q;

public class CarouselLayoutManager extends LayoutManager implements ScrollVectorProvider, Carousel {
    public static final int ALIGNMENT_CENTER = 1;
    public static final int ALIGNMENT_START = 0;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    public int a;
    public int b;
    public int c;
    public boolean d;
    public final d e;
    public CarouselStrategy f;
    public m g;
    public l h;
    public int i;
    public HashMap j;
    public g k;
    public final View.OnLayoutChangeListener l;
    public int m;
    public int n;
    public int o;

    public CarouselLayoutManager() {
        this(new MultiBrowseCarouselStrategy());
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context0, AttributeSet attributeSet0, int v, int v1) {
        this.d = false;
        this.e = new d();
        this.i = 0;
        this.l = new e0(this, 1);
        this.n = -1;
        this.o = 0;
        this.setCarouselStrategy(new MultiBrowseCarouselStrategy());
        if(attributeSet0 != null) {
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.Carousel);
            this.setCarouselAlignment(typedArray0.getInt(styleable.Carousel_carousel_alignment, 0));
            this.setOrientation(typedArray0.getInt(styleable.RecyclerView_android_orientation, 0));
            typedArray0.recycle();
        }
    }

    public CarouselLayoutManager(@NonNull CarouselStrategy carouselStrategy0) {
        this(carouselStrategy0, 0);
    }

    public CarouselLayoutManager(@NonNull CarouselStrategy carouselStrategy0, int v) {
        this.d = false;
        this.e = new d();
        this.i = 0;
        this.l = new e0(this, 1);
        this.n = -1;
        this.o = 0;
        this.setCarouselStrategy(carouselStrategy0);
        this.setOrientation(v);
    }

    public final void A() {
        if(this.d && this.getChildCount() >= 1) {
            for(int v1 = 0; v1 < this.getChildCount() - 1; ++v1) {
                int v2 = this.getPosition(this.getChildAt(v1));
                int v3 = this.getPosition(this.getChildAt(v1 + 1));
                if(v2 > v3) {
                    if(this.d && Log.isLoggable("CarouselLayoutManager", 3)) {
                        Log.d("CarouselLayoutManager", "internal representation of views on the screen");
                        for(int v = 0; v < this.getChildCount(); ++v) {
                            View view0 = this.getChildAt(v);
                            float f = this.l(view0);
                            Log.d("CarouselLayoutManager", "item position " + this.getPosition(view0) + ", center:" + f + ", child index:" + v);
                        }
                        Log.d("CarouselLayoutManager", "==============");
                    }
                    StringBuilder stringBuilder0 = q.u("Detected invalid child order. Child at index [", v1, "] had adapter position [", v2, "] and child at index [");
                    stringBuilder0.append(v1 + 1);
                    stringBuilder0.append("] had adapter position [");
                    stringBuilder0.append(v3);
                    stringBuilder0.append("].");
                    throw new IllegalStateException(stringBuilder0.toString());
                }
            }
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public boolean canScrollHorizontally() {
        return this.isHorizontal();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public boolean canScrollVertically() {
        return !this.isHorizontal();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public int computeHorizontalScrollExtent(@NonNull State recyclerView$State0) {
        return this.getChildCount() == 0 || this.g == null || this.getItemCount() <= 1 ? 0 : ((int)(((float)this.getWidth()) * (this.g.a.a / ((float)this.computeHorizontalScrollRange(recyclerView$State0)))));
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public int computeHorizontalScrollOffset(@NonNull State recyclerView$State0) {
        return this.a;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public int computeHorizontalScrollRange(@NonNull State recyclerView$State0) {
        return this.c - this.b;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$SmoothScroller$ScrollVectorProvider
    @Nullable
    public PointF computeScrollVectorForPosition(int v) {
        if(this.g == null) {
            return null;
        }
        int v1 = this.o(v, this.m(v)) - this.a;
        return this.isHorizontal() ? new PointF(((float)v1), 0.0f) : new PointF(0.0f, ((float)v1));
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public int computeVerticalScrollExtent(@NonNull State recyclerView$State0) {
        return this.getChildCount() == 0 || this.g == null || this.getItemCount() <= 1 ? 0 : ((int)(((float)this.getHeight()) * (this.g.a.a / ((float)this.computeVerticalScrollRange(recyclerView$State0)))));
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public int computeVerticalScrollOffset(@NonNull State recyclerView$State0) {
        return this.a;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public int computeVerticalScrollRange(@NonNull State recyclerView$State0) {
        return this.c - this.b;
    }

    public final void d(View view0, int v, c c0) {
        float f = this.h.a / 2.0f;
        this.addView(view0, v);
        this.k.j(((int)(c0.c - f)), view0, ((int)(c0.c + f)));
        this.y(view0, c0.b, c0.d);
    }

    // 去混淆评级： 低(20)
    public final float e(float f, float f1) {
        return this.r() ? f - f1 : f + f1;
    }

    public final void f(int v, Recycler recyclerView$Recycler0, State recyclerView$State0) {
        float f = this.i(v);
        while(v < recyclerView$State0.getItemCount()) {
            c c0 = this.u(recyclerView$Recycler0, f, v);
            float f1 = c0.c;
            b b0 = c0.d;
            if(this.s(f1, b0)) {
                break;
            }
            f = this.e(f, this.h.a);
            if(!this.t(f1, b0)) {
                this.d(c0.a, -1, c0);
            }
            ++v;
        }
    }

    public final void g(int v, Recycler recyclerView$Recycler0) {
        float f = this.i(v);
        while(v >= 0) {
            c c0 = this.u(recyclerView$Recycler0, f, v);
            b b0 = c0.d;
            float f1 = c0.c;
            if(this.t(f1, b0)) {
                break;
            }
            float f2 = this.h.a;
            f = this.r() ? f + f2 : f - f2;
            if(!this.s(f1, b0)) {
                this.d(c0.a, 0, c0);
            }
            --v;
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override  // com.google.android.material.carousel.Carousel
    public int getCarouselAlignment() {
        return this.o;
    }

    @Override  // com.google.android.material.carousel.Carousel
    public int getContainerHeight() {
        return this.getHeight();
    }

    @Override  // com.google.android.material.carousel.Carousel
    public int getContainerWidth() {
        return this.getWidth();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void getDecoratedBoundsWithMargins(@NonNull View view0, @NonNull Rect rect0) {
        super.getDecoratedBoundsWithMargins(view0, rect0);
        float f = (float)rect0.centerY();
        if(this.isHorizontal()) {
            f = (float)rect0.centerX();
        }
        b b0 = CarouselLayoutManager.q(f, this.h.b, true);
        k k0 = (k)b0.b;
        float f1 = AnimationUtils.lerp(k0.d, ((k)b0.c).d, k0.b, ((k)b0.c).b, f);
        float f2 = 0.0f;
        float f3 = this.isHorizontal() ? (((float)rect0.width()) - f1) / 2.0f : 0.0f;
        if(!this.isHorizontal()) {
            f2 = (((float)rect0.height()) - f1) / 2.0f;
        }
        rect0.set(((int)(((float)rect0.left) + f3)), ((int)(((float)rect0.top) + f2)), ((int)(((float)rect0.right) - f3)), ((int)(((float)rect0.bottom) - f2)));
    }

    public int getOrientation() {
        return this.k.a;
    }

    public final float h(View view0, float f, b b0) {
        k k0 = (k)b0.b;
        k k1 = (k)b0.c;
        float f1 = k1.a;
        float f2 = AnimationUtils.lerp(k0.b, k1.b, k0.a, f1, f);
        if(k1 == this.h.b() || k0 == this.h.d()) {
            LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            float f3 = this.k.b(recyclerView$LayoutParams0);
            return f2 + (1.0f - k1.c + f3 / this.h.a) * (f - f1);
        }
        return f2;
    }

    public final float i(int v) {
        return this.e(((float)(this.k.h() - this.a)), this.h.a * ((float)v));
    }

    @Override  // com.google.android.material.carousel.Carousel
    public boolean isHorizontal() {
        return this.k.a == 0;
    }

    public final void j(Recycler recyclerView$Recycler0, State recyclerView$State0) {
        while(this.getChildCount() > 0) {
            View view0 = this.getChildAt(0);
            float f = this.l(view0);
            if(!this.t(f, CarouselLayoutManager.q(f, this.h.b, true))) {
                break;
            }
            this.removeAndRecycleView(view0, recyclerView$Recycler0);
        }
        while(this.getChildCount() - 1 >= 0) {
            View view1 = this.getChildAt(this.getChildCount() - 1);
            float f1 = this.l(view1);
            if(!this.s(f1, CarouselLayoutManager.q(f1, this.h.b, true))) {
                break;
            }
            this.removeAndRecycleView(view1, recyclerView$Recycler0);
        }
        if(this.getChildCount() == 0) {
            this.g(this.i - 1, recyclerView$Recycler0);
            this.f(this.i, recyclerView$Recycler0, recyclerView$State0);
        }
        else {
            int v = this.getPosition(this.getChildAt(0));
            int v1 = this.getPosition(this.getChildAt(this.getChildCount() - 1));
            this.g(v - 1, recyclerView$Recycler0);
            this.f(v1 + 1, recyclerView$Recycler0, recyclerView$State0);
        }
        this.A();
    }

    // 去混淆评级： 低(20)
    public final int k() {
        return this.isHorizontal() ? this.getContainerWidth() : this.getContainerHeight();
    }

    public final float l(View view0) {
        Rect rect0 = new Rect();
        super.getDecoratedBoundsWithMargins(view0, rect0);
        return this.isHorizontal() ? ((float)rect0.centerX()) : ((float)rect0.centerY());
    }

    public final l m(int v) {
        HashMap hashMap0 = this.j;
        if(hashMap0 != null) {
            l l0 = (l)hashMap0.get(MathUtils.clamp(v, 0, Math.max(0, this.getItemCount() - 1)));
            return l0 == null ? this.g.a : l0;
        }
        return this.g.a;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void measureChildWithMargins(@NonNull View view0, int v, int v1) {
        if(!(view0 instanceof Maskable)) {
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        Rect rect0 = new Rect();
        this.calculateItemDecorationsForChild(view0, rect0);
        int v2 = rect0.left + rect0.right + v;
        int v3 = rect0.top + rect0.bottom + v1;
        float f = this.g == null || this.k.a != 0 ? ((float)recyclerView$LayoutParams0.width) : this.g.a.a;
        float f1 = this.g == null || this.k.a != 1 ? ((float)recyclerView$LayoutParams0.height) : this.g.a.a;
        int v4 = this.getPaddingLeft();
        int v5 = LayoutManager.getChildMeasureSpec(this.getWidth(), this.getWidthMode(), this.getPaddingRight() + v4 + recyclerView$LayoutParams0.leftMargin + recyclerView$LayoutParams0.rightMargin + v2, ((int)f), this.canScrollHorizontally());
        int v6 = this.getPaddingTop();
        view0.measure(v5, LayoutManager.getChildMeasureSpec(this.getHeight(), this.getHeightMode(), this.getPaddingBottom() + v6 + recyclerView$LayoutParams0.topMargin + recyclerView$LayoutParams0.bottomMargin + v3, ((int)f1), this.canScrollVertically()));
    }

    public final int n(int v, boolean z) {
        int v1 = this.o(v, this.g.a(((float)this.a), true, ((float)this.b), ((float)this.c))) - this.a;
        int v2 = this.j == null ? v1 : this.o(v, this.m(v)) - this.a;
        return !z || Math.abs(v2) >= Math.abs(v1) ? v1 : v2;
    }

    public final int o(int v, l l0) {
        if(this.r()) {
            return (int)(((float)this.k()) - l0.c().a - ((float)v) * l0.a - l0.a / 2.0f);
        }
        k k0 = l0.a();
        return (int)(l0.a / 2.0f + (((float)v) * l0.a - k0.a));
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView0) {
        super.onAttachedToWindow(recyclerView0);
        this.w();
        recyclerView0.addOnLayoutChangeListener(this.l);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView0, Recycler recyclerView$Recycler0) {
        super.onDetachedFromWindow(recyclerView0, recyclerView$Recycler0);
        recyclerView0.removeOnLayoutChangeListener(this.l);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @Nullable
    public View onFocusSearchFailed(@NonNull View view0, int v, @NonNull Recycler recyclerView$Recycler0, @NonNull State recyclerView$State0) {
        int v2;
        if(this.getChildCount() == 0) {
            return null;
        }
        int v1 = this.getOrientation();
        switch(v) {
            case 1: {
                v2 = -1;
                break;
            }
            case 2: {
                v2 = 1;
                break;
            }
            case 17: {
                if(v1 != 0) {
                    v2 = 0x80000000;
                }
                else if(this.r()) {
                    v2 = 1;
                }
                else {
                    v2 = -1;
                }
                break;
            }
            case 33: {
                v2 = v1 == 1 ? -1 : 0x80000000;
                break;
            }
            case 66: {
                if(v1 != 0) {
                    v2 = 0x80000000;
                }
                else if(!this.r()) {
                    v2 = 1;
                }
                else {
                    v2 = -1;
                }
                break;
            }
            case 130: {
                v2 = v1 == 1 ? 1 : 0x80000000;
                break;
            }
            default: {
                Log.d("CarouselLayoutManager", "Unknown focus request:" + v);
                v2 = 0x80000000;
            }
        }
        int v3 = 0;
        if(v2 == 0x80000000) {
            return null;
        }
        if(v2 == -1) {
            if(this.getPosition(view0) == 0) {
                return null;
            }
            int v4 = this.getPosition(this.getChildAt(0));
            if(v4 - 1 >= 0 && v4 - 1 < this.getItemCount()) {
                c c0 = this.u(recyclerView$Recycler0, this.i(v4 - 1), v4 - 1);
                this.d(c0.a, 0, c0);
            }
            if(this.r()) {
                v3 = this.getChildCount() - 1;
            }
            return this.getChildAt(v3);
        }
        if(this.getPosition(view0) == this.getItemCount() - 1) {
            return null;
        }
        int v5 = this.getPosition(this.getChildAt(this.getChildCount() - 1));
        if(v5 + 1 >= 0 && v5 + 1 < this.getItemCount()) {
            c c1 = this.u(recyclerView$Recycler0, this.i(v5 + 1), v5 + 1);
            this.d(c1.a, -1, c1);
        }
        if(!this.r()) {
            v3 = this.getChildCount() - 1;
        }
        return this.getChildAt(v3);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent0) {
        super.onInitializeAccessibilityEvent(accessibilityEvent0);
        if(this.getChildCount() > 0) {
            accessibilityEvent0.setFromIndex(this.getPosition(this.getChildAt(0)));
            accessibilityEvent0.setToIndex(this.getPosition(this.getChildAt(this.getChildCount() - 1)));
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void onItemsAdded(@NonNull RecyclerView recyclerView0, int v, int v1) {
        super.onItemsAdded(recyclerView0, v, v1);
        int v2 = this.getItemCount();
        int v3 = this.m;
        if(v2 != v3 && this.g != null) {
            if(this.f.d(this, v3)) {
                this.w();
            }
            this.m = v2;
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void onItemsRemoved(@NonNull RecyclerView recyclerView0, int v, int v1) {
        super.onItemsRemoved(recyclerView0, v, v1);
        int v2 = this.getItemCount();
        int v3 = this.m;
        if(v2 != v3 && this.g != null) {
            if(this.f.d(this, v3)) {
                this.w();
            }
            this.m = v2;
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void onLayoutChildren(Recycler recyclerView$Recycler0, State recyclerView$State0) {
        int v18;
        if(recyclerView$State0.getItemCount() > 0 && ((float)this.k()) > 0.0f) {
            boolean z = this.r();
            boolean z1 = this.g == null;
            if(z1) {
                this.v(recyclerView$Recycler0);
            }
            m m0 = this.g;
            boolean z2 = this.r();
            l l0 = z2 ? ((l)m0.c.get(m0.c.size() - 1)) : ((l)m0.b.get(m0.b.size() - 1));
            k k0 = z2 ? l0.c() : l0.a();
            int v = this.getPaddingStart();
            float f = l0.a / 2.0f;
            float f1 = this.r() ? k0.a + f : k0.a - f;
            int v1 = (int)(((float)(v * (z2 ? 1 : -1))) + ((float)this.k.h()) - f1);
            m m1 = this.g;
            boolean z3 = this.r();
            l l1 = z3 ? ((l)m1.b.get(m1.b.size() - 1)) : ((l)m1.c.get(m1.c.size() - 1));
            k k1 = z3 ? l1.a() : l1.c();
            int v2 = recyclerView$State0.getItemCount();
            float f2 = (float)this.getPaddingEnd();
            float f3 = (float)this.k.h();
            float f4 = (float)this.k.e();
            int v3 = (int)((((float)(v2 - 1)) * l1.a + f2) * (z3 ? -1.0f : 1.0f) - (k1.a - f3) + (f4 - k1.a));
            int v4 = z3 ? Math.min(0, v3) : Math.max(0, v3);
            this.b = z ? v4 : v1;
            if(z) {
                v4 = v1;
            }
            this.c = v4;
            if(z1) {
                this.a = v1;
                m m2 = this.g;
                int v5 = this.getItemCount();
                int v6 = this.b;
                int v7 = this.c;
                boolean z4 = this.r();
                l l2 = m2.a;
                HashMap hashMap0 = new HashMap();
                int v9 = 0;
                for(int v8 = 0; true; ++v8) {
                    float f5 = l2.a;
                    if(v8 >= v5) {
                        break;
                    }
                    int v10 = z4 ? v5 - v8 - 1 : v8;
                    List list0 = m2.c;
                    if(Float.compare(((float)v10) * f5 * ((float)(z4 ? -1 : 1)), ((float)v7) - m2.g) > 0 || v8 >= v5 - list0.size()) {
                        hashMap0.put(v10, ((l)list0.get(MathUtils.clamp(v9, 0, list0.size() - 1))));
                        ++v9;
                    }
                }
                int v11 = v5 - 1;
                int v12 = 0;
                while(v11 >= 0) {
                    int v13 = z4 ? v5 - v11 - 1 : v11;
                    List list1 = m2.b;
                    if(Float.compare(((float)v13) * f5 * ((float)(z4 ? -1 : 1)), ((float)v6) + m2.f) < 0 || v11 < list1.size()) {
                        hashMap0.put(v13, ((l)list1.get(MathUtils.clamp(v12, 0, list1.size() - 1))));
                        ++v12;
                    }
                    --v11;
                }
                this.j = hashMap0;
                int v14 = this.n;
                if(v14 != -1) {
                    this.a = this.o(v14, this.m(v14));
                }
            }
            int v15 = this.a;
            int v16 = this.b;
            int v17 = this.c;
            if(v15 < v16) {
                v18 = v16 - v15;
            }
            else {
                v18 = v15 <= v17 ? 0 : v17 - v15;
            }
            this.a = v18 + v15;
            this.i = MathUtils.clamp(this.i, 0, recyclerView$State0.getItemCount());
            this.z(this.g);
            this.detachAndScrapAttachedViews(recyclerView$Recycler0);
            this.j(recyclerView$Recycler0, recyclerView$State0);
            this.m = this.getItemCount();
            return;
        }
        this.removeAndRecycleAllViews(recyclerView$Recycler0);
        this.i = 0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void onLayoutCompleted(State recyclerView$State0) {
        super.onLayoutCompleted(recyclerView$State0);
        this.i = this.getChildCount() == 0 ? 0 : this.getPosition(this.getChildAt(0));
        this.A();
    }

    public final int p(int v, l l0) {
        int v1 = 0x7FFFFFFF;
        for(Object object0: l0.b.subList(l0.c, l0.d + 1)) {
            k k0 = (k)object0;
            float f = l0.a / 2.0f + ((float)v) * l0.a;
            int v2 = (this.r() ? ((int)(((float)this.k()) - k0.a - f)) : ((int)(f - k0.a))) - this.a;
            if(Math.abs(v1) > Math.abs(v2)) {
                v1 = v2;
            }
        }
        return v1;
    }

    public static b q(float f, List list0, boolean z) {
        float f1 = 3.402823E+38f;
        int v = -1;
        int v1 = -1;
        int v2 = -1;
        int v3 = -1;
        float f2 = -3.402823E+38f;
        float f3 = 3.402823E+38f;
        float f4 = 3.402823E+38f;
        for(int v4 = 0; v4 < list0.size(); ++v4) {
            k k0 = (k)list0.get(v4);
            float f5 = z ? k0.b : k0.a;
            float f6 = Math.abs(f5 - f);
            if(f5 <= f && f6 <= f1) {
                v = v4;
                f1 = f6;
            }
            if(f5 > f && f6 <= f3) {
                v2 = v4;
                f3 = f6;
            }
            if(f5 <= f4) {
                v1 = v4;
                f4 = f5;
            }
            if(f5 > f2) {
                v3 = v4;
                f2 = f5;
            }
        }
        if(v == -1) {
            v = v1;
        }
        if(v2 == -1) {
            v2 = v3;
        }
        return new b(((k)list0.get(v)), ((k)list0.get(v2)));
    }

    public final boolean r() {
        return this.isHorizontal() && this.getLayoutDirection() == 1;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView0, @NonNull View view0, @NonNull Rect rect0, boolean z, boolean z1) {
        if(this.g == null) {
            return false;
        }
        int v = this.p(this.getPosition(view0), this.m(this.getPosition(view0)));
        if(v == 0) {
            return false;
        }
        int v1 = this.a;
        int v2 = this.b;
        int v3 = this.c;
        int v4 = v1 + v;
        if(v4 < v2) {
            v = v2 - v1;
        }
        else if(v4 > v3) {
            v = v3 - v1;
        }
        l l0 = this.g.a(((float)(v1 + v)), false, ((float)v2), ((float)v3));
        int v5 = this.p(this.getPosition(view0), l0);
        if(this.isHorizontal()) {
            recyclerView0.scrollBy(v5, 0);
            return true;
        }
        recyclerView0.scrollBy(0, v5);
        return true;
    }

    public final boolean s(float f, b b0) {
        k k0 = (k)b0.b;
        float f1 = AnimationUtils.lerp(k0.d, ((k)b0.c).d, k0.b, ((k)b0.c).b, f);
        float f2 = this.r() ? f + f1 / 2.0f : f - f1 / 2.0f;
        return this.r() ? f2 < 0.0f : f2 > ((float)this.k());
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public int scrollHorizontallyBy(int v, Recycler recyclerView$Recycler0, State recyclerView$State0) {
        return this.canScrollHorizontally() ? this.x(v, recyclerView$Recycler0, recyclerView$State0) : 0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void scrollToPosition(int v) {
        this.n = v;
        if(this.g == null) {
            return;
        }
        this.a = this.o(v, this.m(v));
        this.i = MathUtils.clamp(v, 0, Math.max(0, this.getItemCount() - 1));
        this.z(this.g);
        this.requestLayout();
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public int scrollVerticallyBy(int v, Recycler recyclerView$Recycler0, State recyclerView$State0) {
        return this.canScrollVertically() ? this.x(v, recyclerView$Recycler0, recyclerView$State0) : 0;
    }

    public void setCarouselAlignment(int v) {
        this.o = v;
        this.w();
    }

    public void setCarouselStrategy(@NonNull CarouselStrategy carouselStrategy0) {
        this.f = carouselStrategy0;
        this.w();
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void setDebuggingEnabled(@NonNull RecyclerView recyclerView0, boolean z) {
        this.d = z;
        d d0 = this.e;
        recyclerView0.removeItemDecoration(d0);
        if(z) {
            recyclerView0.addItemDecoration(d0);
        }
        recyclerView0.invalidateItemDecorations();
    }

    public void setOrientation(int v) {
        f f0;
        if(v != 0 && v != 1) {
            throw new IllegalArgumentException("invalid orientation:" + v);
        }
        this.assertNotInLayoutOrScroll(null);
        if(this.k == null || v != this.k.a) {
            switch(v) {
                case 0: {
                    f0 = new f(this);
                    break;
                }
                case 1: {
                    f0 = new e(this);
                    break;
                }
                default: {
                    throw new IllegalArgumentException("invalid orientation");
                }
            }
            this.k = f0;
            this.w();
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView0, State recyclerView$State0, int v) {
        com.google.android.material.carousel.b b0 = new com.google.android.material.carousel.b(this, recyclerView0.getContext());
        b0.setTargetPosition(v);
        this.startSmoothScroll(b0);
    }

    public final boolean t(float f, b b0) {
        k k0 = (k)b0.b;
        float f1 = this.e(f, AnimationUtils.lerp(k0.d, ((k)b0.c).d, k0.b, ((k)b0.c).b, f) / 2.0f);
        return this.r() ? f1 > ((float)this.k()) : f1 < 0.0f;
    }

    public final c u(Recycler recyclerView$Recycler0, float f, int v) {
        View view0 = recyclerView$Recycler0.getViewForPosition(v);
        this.measureChildWithMargins(view0, 0, 0);
        float f1 = this.e(f, this.h.a / 2.0f);
        b b0 = CarouselLayoutManager.q(f1, this.h.b, false);
        return new c(view0, f1, this.h(view0, f1, b0), b0);
    }

    public final void v(Recycler recyclerView$Recycler0) {
        int v24;
        int v14;
        int v6;
        int v5;
        List list1;
        View view0 = recyclerView$Recycler0.getViewForPosition(0);
        this.measureChildWithMargins(view0, 0, 0);
        l l0 = this.f.c(this, view0);
        if(this.r()) {
            float f = (float)this.k();
            j j0 = new j(l0.a, f);
            k k0 = l0.d();
            k k1 = l0.d();
            float f1 = f - k0.b - k1.d / 2.0f;
            List list0 = l0.b;
            for(int v = list0.size() - 1; v >= 0; --v) {
                Object object0 = list0.get(v);
                float f2 = ((k)object0).d;
                j0.a(f2 / 2.0f + f1, ((k)object0).c, f2, v >= l0.c && v <= l0.d, ((k)object0).e);
                f1 += ((k)object0).d;
            }
            l0 = j0.d();
        }
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(l0);
        int v1;
        for(v1 = 0; true; ++v1) {
            list1 = l0.b;
            if(v1 >= list1.size()) {
                v1 = -1;
                break;
            }
            if(!((k)list1.get(v1)).e) {
                break;
            }
        }
        k k2 = l0.a();
        k k3 = l0.a();
        float f3 = 0.0f;
        int v2 = l0.d;
        int v3 = l0.c;
        if(Float.compare(k2.b - k3.d / 2.0f, 0.0f) >= 0) {
            k k4 = l0.a();
            for(int v4 = 0; true; ++v4) {
                k k5 = null;
                if(v4 >= list1.size()) {
                    break;
                }
                k k6 = (k)list1.get(v4);
                if(!k6.e) {
                    k5 = k6;
                    break;
                }
            }
            if(k4 == k5) {
                v5 = v3;
                v6 = v2;
                goto label_90;
            }
            goto label_50;
        }
        else {
        label_50:
            if(v1 == -1) {
                v5 = v3;
                v6 = v2;
            }
            else {
                int v7 = v3 - v1;
                int v8 = this.isHorizontal() ? this.getContainerWidth() : this.getContainerHeight();
                k k7 = l0.b();
                k k8 = l0.b();
                float f4 = k7.b - k8.d / 2.0f;
                if(v7 > 0 || l0.a().f <= 0.0f) {
                    v5 = v3;
                    v6 = v2;
                    int v9 = 0;
                    float f5 = 0.0f;
                    while(v9 < v7) {
                        l l1 = (l)arrayList0.get(arrayList0.size() - 1);
                        int v10 = v1 + v9;
                        int v11 = list1.size() - 1;
                        f5 += ((k)list1.get(v10)).f;
                        int v12 = v10 - 1;
                        if(v12 >= 0) {
                            float f6 = ((k)list1.get(v12)).c;
                            int v13 = l1.d;
                            while(true) {
                                List list2 = l1.b;
                                if(v13 < list2.size()) {
                                    if(f6 == ((k)list2.get(v13)).c) {
                                        break;
                                    }
                                    else {
                                        ++v13;
                                        continue;
                                    }
                                }
                                v13 = list2.size() - 1;
                                break;
                            }
                            v14 = v13 - 1;
                        }
                        else {
                            v14 = v11;
                        }
                        arrayList0.add(m.d(l1, v1, v14, f4 + f5, v5 - v9 - 1, v6 - v9 - 1, ((float)v8)));
                        ++v9;
                    }
                }
                else {
                    v5 = v3;
                    v6 = v2;
                    arrayList0.add(m.d(l0, 0, 0, f4 + l0.a().f, l0.c, l0.d, ((float)v8)));
                }
            }
        }
    label_90:
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(l0);
        int v15;
        for(v15 = list1.size() - 1; true; --v15) {
            if(v15 < 0) {
                v15 = -1;
                break;
            }
            if(!((k)list1.get(v15)).e) {
                break;
            }
        }
        int v16 = this.getContainerHeight();
        if(this.isHorizontal()) {
            v16 = this.getContainerWidth();
        }
        k k9 = l0.c();
        if(l0.c().d / 2.0f + k9.b <= ((float)v16)) {
            k k10 = l0.c();
            for(int v17 = list1.size() - 1; true; --v17) {
                k k11 = null;
                if(v17 < 0) {
                    break;
                }
                k k12 = (k)list1.get(v17);
                if(!k12.e) {
                    k11 = k12;
                    break;
                }
            }
            if(k10 != k11) {
                goto label_116;
            }
        }
        else {
        label_116:
            if(v15 != -1) {
                int v18 = v15 - v6;
                int v19 = this.isHorizontal() ? this.getContainerWidth() : this.getContainerHeight();
                k k13 = l0.b();
                k k14 = l0.b();
                float f7 = k13.b - k14.d / 2.0f;
                if(v18 > 0 || l0.c().f <= 0.0f) {
                    int v20 = 0;
                    while(v20 < v18) {
                        l l2 = (l)arrayList1.get(arrayList1.size() - 1);
                        int v21 = v15 - v20;
                        f3 += ((k)list1.get(v21)).f;
                        int v22 = v21 + 1;
                        if(v22 < list1.size()) {
                            float f8 = ((k)list1.get(v22)).c;
                            int v23 = l2.c - 1;
                            while(true) {
                                if(v23 >= 0) {
                                    if(f8 == ((k)l2.b.get(v23)).c) {
                                        break;
                                    }
                                    else {
                                        --v23;
                                        continue;
                                    }
                                }
                                v23 = 0;
                                break;
                            }
                            v24 = v23 + 1;
                        }
                        else {
                            v24 = 0;
                        }
                        arrayList1.add(m.d(l2, v15, v24, f7 - f3, v5 + v20 + 1, v6 + v20 + 1, ((float)v19)));
                        ++v20;
                    }
                }
                else {
                    arrayList1.add(m.d(l0, 0, 0, f7 - l0.c().f, l0.c, l0.d, ((float)v19)));
                }
            }
        }
        this.g = new m(l0, arrayList0, arrayList1);
    }

    public final void w() {
        this.g = null;
        this.requestLayout();
    }

    public final int x(int v, Recycler recyclerView$Recycler0, State recyclerView$State0) {
        if(this.getChildCount() != 0 && v != 0) {
            if(this.g == null) {
                this.v(recyclerView$Recycler0);
            }
            int v1 = this.a;
            int v2 = this.b;
            int v3 = this.c;
            int v4 = v1 + v;
            if(v4 < v2) {
                v = v2 - v1;
            }
            else if(v4 > v3) {
                v = v3 - v1;
            }
            this.a = v1 + v;
            this.z(this.g);
            float f = this.h.a / 2.0f;
            float f1 = this.i(this.getPosition(this.getChildAt(0)));
            Rect rect0 = new Rect();
            float f2 = this.r() ? this.h.c().b : this.h.a().b;
            float f3 = 3.402823E+38f;
            for(int v5 = 0; v5 < this.getChildCount(); ++v5) {
                View view0 = this.getChildAt(v5);
                float f4 = this.e(f1, f);
                b b0 = CarouselLayoutManager.q(f4, this.h.b, false);
                float f5 = this.h(view0, f4, b0);
                super.getDecoratedBoundsWithMargins(view0, rect0);
                this.y(view0, f4, b0);
                this.k.l(view0, rect0, f, f5);
                float f6 = Math.abs(f2 - f5);
                if(f6 < f3) {
                    this.n = this.getPosition(view0);
                    f3 = f6;
                }
                f1 = this.e(f1, this.h.a);
            }
            this.j(recyclerView$Recycler0, recyclerView$State0);
            return v;
        }
        return 0;
    }

    public final void y(View view0, float f, b b0) {
        if(!(view0 instanceof Maskable)) {
            return;
        }
        k k0 = (k)b0.b;
        float f1 = AnimationUtils.lerp(k0.c, ((k)b0.c).c, k0.a, ((k)b0.c).a, f);
        float f2 = (float)view0.getHeight();
        float f3 = (float)view0.getWidth();
        RectF rectF0 = this.k.c(f2, f3, AnimationUtils.lerp(0.0f, f2 / 2.0f, 0.0f, 1.0f, f1), AnimationUtils.lerp(0.0f, f3 / 2.0f, 0.0f, 1.0f, f1));
        float f4 = this.h(view0, f, b0);
        float f5 = rectF0.height();
        float f6 = rectF0.height();
        RectF rectF1 = new RectF(f4 - rectF0.width() / 2.0f, f4 - f5 / 2.0f, rectF0.width() / 2.0f + f4, f6 / 2.0f + f4);
        RectF rectF2 = new RectF(((float)this.k.f()), ((float)this.k.i()), ((float)this.k.g()), ((float)this.k.d()));
        CarouselStrategy carouselStrategy0 = this.f;
        carouselStrategy0.getClass();
        if(!(carouselStrategy0 instanceof UncontainedCarouselStrategy)) {
            this.k.a(rectF0, rectF1, rectF2);
        }
        this.k.k(rectF0, rectF1, rectF2);
        ((Maskable)view0).setMaskRectF(rectF0);
    }

    public final void z(m m0) {
        int v = this.c;
        int v1 = this.b;
        if(v <= v1) {
            this.h = this.r() ? ((l)m0.c.get(m0.c.size() - 1)) : ((l)m0.b.get(m0.b.size() - 1));
        }
        else {
            this.h = m0.a(((float)this.a), false, ((float)v1), ((float)v));
        }
        List list0 = this.h.b;
        this.e.getClass();
        this.e.n = Collections.unmodifiableList(list0);
    }
}

