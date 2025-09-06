package androidx.slidingpanelayout.widget;

import a5.c;
import a5.e;
import a5.f;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.widget.Openable;
import androidx.customview.widget.ViewDragHelper;
import androidx.window.layout.FoldingFeature.Orientation;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.WindowInfoTracker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

public class SlidingPaneLayout extends ViewGroup implements Openable {
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public boolean a;
        public boolean b;
        public static final int[] c;
        public float weight;

        static {
            LayoutParams.c = new int[]{0x1010181};
        }

        public LayoutParams() {
            super(-1, -1);
            this.weight = 0.0f;
        }

        public LayoutParams(int v, int v1) {
            super(v, v1);
            this.weight = 0.0f;
        }

        public LayoutParams(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            this.weight = 0.0f;
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, LayoutParams.c);
            this.weight = typedArray0.getFloat(0, 0.0f);
            typedArray0.recycle();
        }

        public LayoutParams(@NonNull ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            super(viewGroup$LayoutParams0);
            this.weight = 0.0f;
        }

        public LayoutParams(@NonNull ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
            super(viewGroup$MarginLayoutParams0);
            this.weight = 0.0f;
        }

        public LayoutParams(@NonNull LayoutParams slidingPaneLayout$LayoutParams0) {
            super(slidingPaneLayout$LayoutParams0);
            this.weight = slidingPaneLayout$LayoutParams0.weight;
        }
    }

    public interface PanelSlideListener {
        void onPanelClosed(@NonNull View arg1);

        void onPanelOpened(@NonNull View arg1);

        void onPanelSlide(@NonNull View arg1, float arg2);
    }

    public static class SimplePanelSlideListener implements PanelSlideListener {
        @Override  // androidx.slidingpanelayout.widget.SlidingPaneLayout$PanelSlideListener
        public void onPanelClosed(@NonNull View view0) {
        }

        @Override  // androidx.slidingpanelayout.widget.SlidingPaneLayout$PanelSlideListener
        public void onPanelOpened(@NonNull View view0) {
        }

        @Override  // androidx.slidingpanelayout.widget.SlidingPaneLayout$PanelSlideListener
        public void onPanelSlide(@NonNull View view0, float f) {
        }
    }

    public static final int LOCK_MODE_LOCKED = 3;
    public static final int LOCK_MODE_LOCKED_CLOSED = 2;
    public static final int LOCK_MODE_LOCKED_OPEN = 1;
    public static final int LOCK_MODE_UNLOCKED;
    public int a;
    public int b;
    public Drawable c;
    public Drawable d;
    public boolean e;
    public View f;
    public float g;
    public float h;
    public int i;
    public boolean j;
    public int k;
    public float l;
    public float m;
    public final CopyOnWriteArrayList n;
    public PanelSlideListener o;
    public final ViewDragHelper p;
    public boolean q;
    public boolean r;
    public final Rect s;
    public final ArrayList t;
    public int u;
    public FoldingFeature v;
    public final a w;
    public FoldingFeatureObserver x;
    public static final boolean y;

    static {
        SlidingPaneLayout.y = Build.VERSION.SDK_INT >= 29;
    }

    public SlidingPaneLayout(@NonNull Context context0) {
        this(context0, null);
    }

    public SlidingPaneLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public SlidingPaneLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.a = 0;
        this.g = 1.0f;
        this.n = new CopyOnWriteArrayList();
        this.r = true;
        this.s = new Rect();
        this.t = new ArrayList();
        this.w = new a(this);
        float f = context0.getResources().getDisplayMetrics().density;
        this.setWillNotDraw(false);
        ViewCompat.setAccessibilityDelegate(this, new c(this));
        ViewCompat.setImportantForAccessibility(this, 1);
        ViewDragHelper viewDragHelper0 = ViewDragHelper.create(this, 0.5f, new b(this));
        this.p = viewDragHelper0;
        viewDragHelper0.setMinVelocity(f * 400.0f);
        this.setFoldingFeatureObserver(new FoldingFeatureObserver(WindowInfoTracker.getOrCreate(context0), ContextCompat.getMainExecutor(context0)));
    }

    public final boolean a(View view0) {
        if(view0 == null) {
            return false;
        }
        LayoutParams slidingPaneLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        return this.e && slidingPaneLayout$LayoutParams0.b && this.g > 0.0f;
    }

    public void addPanelSlideListener(@NonNull PanelSlideListener slidingPaneLayout$PanelSlideListener0) {
        this.n.add(slidingPaneLayout$PanelSlideListener0);
    }

    @Override  // android.view.ViewGroup
    public void addView(@NonNull View view0, int v, @Nullable ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(this.getChildCount() == 1) {
            f f0 = new f(view0.getContext());  // 初始化器: Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V
            f0.addView(view0);
            super.addView(f0, v, viewGroup$LayoutParams0);
            return;
        }
        super.addView(view0, v, viewGroup$LayoutParams0);
    }

    public final boolean b() {
        return ViewCompat.getLayoutDirection(this) == 1;
    }

    public final void c(float f) {
        boolean z = this.b();
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.getChildAt(v1);
            if(view0 != this.f) {
                int v2 = (int)((1.0f - this.h) * ((float)this.k));
                this.h = f;
                view0.offsetLeftAndRight((z ? -(v2 - ((int)((1.0f - f) * ((float)this.k)))) : v2 - ((int)((1.0f - f) * ((float)this.k)))));
            }
        }
    }

    public boolean canScroll(View view0, boolean z, int v, int v1, int v2) {
        if(view0 instanceof ViewGroup) {
            int v3 = view0.getScrollX();
            int v4 = view0.getScrollY();
            for(int v5 = ((ViewGroup)view0).getChildCount() - 1; v5 >= 0; --v5) {
                View view1 = ((ViewGroup)view0).getChildAt(v5);
                int v6 = v1 + v3;
                if(v6 >= view1.getLeft() && v6 < view1.getRight()) {
                    int v7 = v2 + v4;
                    if(v7 >= view1.getTop() && v7 < view1.getBottom() && this.canScroll(view1, true, v, v6 - view1.getLeft(), v7 - view1.getTop())) {
                        return true;
                    }
                }
            }
        }
        return z ? view0.canScrollHorizontally((this.b() ? v : -v)) : false;
    }

    @Deprecated
    public boolean canSlide() {
        return this.e;
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof LayoutParams && super.checkLayoutParams(viewGroup$LayoutParams0);
    }

    @Override  // androidx.customview.widget.Openable
    public void close() {
        this.closePane();
    }

    public boolean closePane() {
        if(!this.e) {
            this.q = false;
        }
        if(this.r || this.d(1.0f)) {
            this.q = false;
            return true;
        }
        return false;
    }

    @Override  // android.view.View
    public void computeScroll() {
        ViewDragHelper viewDragHelper0 = this.p;
        if(viewDragHelper0.continueSettling(true)) {
            if(!this.e) {
                viewDragHelper0.abort();
                return;
            }
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public final boolean d(float f) {
        int v2;
        if(!this.e) {
            return false;
        }
        boolean z = this.b();
        LayoutParams slidingPaneLayout$LayoutParams0 = (LayoutParams)this.f.getLayoutParams();
        if(z) {
            int v = this.getPaddingRight() + slidingPaneLayout$LayoutParams0.rightMargin;
            int v1 = this.f.getWidth();
            v2 = (int)(((float)this.getWidth()) - (f * ((float)this.i) + ((float)v) + ((float)v1)));
        }
        else {
            int v3 = this.getPaddingLeft();
            v2 = (int)(f * ((float)this.i) + ((float)(v3 + slidingPaneLayout$LayoutParams0.leftMargin)));
        }
        View view0 = this.f;
        int v4 = view0.getTop();
        if(this.p.smoothSlideViewTo(view0, v2, v4)) {
            int v5 = this.getChildCount();
            for(int v6 = 0; v6 < v5; ++v6) {
                View view1 = this.getChildAt(v6);
                if(view1.getVisibility() == 4) {
                    view1.setVisibility(0);
                }
            }
            ViewCompat.postInvalidateOnAnimation(this);
            return true;
        }
        return false;
    }

    @Override  // android.view.View
    public void draw(Canvas canvas0) {
        int v4;
        int v3;
        super.draw(canvas0);
        Drawable drawable0 = this.b() ? this.d : this.c;
        View view0 = this.getChildCount() <= 1 ? null : this.getChildAt(1);
        if(view0 != null && drawable0 != null) {
            int v = view0.getTop();
            int v1 = view0.getBottom();
            int v2 = drawable0.getIntrinsicWidth();
            if(this.b()) {
                v3 = view0.getRight();
                v4 = v2 + v3;
            }
            else {
                int v5 = view0.getLeft();
                v4 = v5;
                v3 = v5 - v2;
            }
            drawable0.setBounds(v3, v, v4, v1);
            drawable0.draw(canvas0);
        }
    }

    @Override  // android.view.ViewGroup
    public boolean drawChild(Canvas canvas0, View view0, long v) {
        boolean z = this.b();
        ViewDragHelper viewDragHelper0 = this.p;
        if((z ^ this.isOpen()) == 0) {
            viewDragHelper0.setEdgeTrackingEnabled(2);
            Insets insets1 = this.getSystemGestureInsets();
            if(insets1 != null) {
                viewDragHelper0.setEdgeSize(Math.max(viewDragHelper0.getDefaultEdgeSize(), insets1.right));
            }
        }
        else {
            viewDragHelper0.setEdgeTrackingEnabled(1);
            Insets insets0 = this.getSystemGestureInsets();
            if(insets0 != null) {
                viewDragHelper0.setEdgeSize(Math.max(viewDragHelper0.getDefaultEdgeSize(), insets0.left));
            }
        }
        LayoutParams slidingPaneLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        int v1 = canvas0.save();
        if(this.e && !slidingPaneLayout$LayoutParams0.a && this.f != null) {
            Rect rect0 = this.s;
            canvas0.getClipBounds(rect0);
            if(this.b()) {
                rect0.left = Math.max(rect0.left, this.f.getRight());
            }
            else {
                rect0.right = Math.min(rect0.right, this.f.getLeft());
            }
            canvas0.clipRect(rect0);
        }
        boolean z1 = super.drawChild(canvas0, view0, v);
        canvas0.restoreToCount(v1);
        return z1;
    }

    public final void e(View view0) {
        int v8;
        int v7;
        int v6;
        int v5;
        boolean z = this.b();
        int v = z ? this.getWidth() - this.getPaddingRight() : this.getPaddingLeft();
        int v1 = z ? this.getPaddingLeft() : this.getWidth() - this.getPaddingRight();
        int v2 = this.getPaddingTop();
        int v3 = this.getHeight();
        int v4 = this.getPaddingBottom();
        if(view0 == null || !view0.isOpaque()) {
            v5 = 0;
            v6 = 0;
            v7 = 0;
            v8 = 0;
        }
        else {
            v5 = view0.getLeft();
            v6 = view0.getRight();
            v7 = view0.getTop();
            v8 = view0.getBottom();
        }
        int v9 = this.getChildCount();
        for(int v10 = 0; v10 < v9; ++v10) {
            View view1 = this.getChildAt(v10);
            if(view1 == view0) {
                break;
            }
            if(view1.getVisibility() != 8) {
                view1.setVisibility((Math.max((z ? v1 : v), view1.getLeft()) < v5 || Math.max(v2, view1.getTop()) < v7 || Math.min((z ? v : v1), view1.getRight()) > v6 || Math.min(v3 - v4, view1.getBottom()) > v8 ? 0 : 4));
            }
        }
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return new LayoutParams(this.getContext(), attributeSet0);
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams ? new LayoutParams(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0)) : new LayoutParams(viewGroup$LayoutParams0);
    }

    @ColorInt
    @Deprecated
    public int getCoveredFadeColor() {
        return this.b;
    }

    public final int getLockMode() {
        return this.u;
    }

    @Px
    public int getParallaxDistance() {
        return this.k;
    }

    @ColorInt
    @Deprecated
    public int getSliderFadeColor() {
        return this.a;
    }

    private Insets getSystemGestureInsets() {
        if(SlidingPaneLayout.y) {
            WindowInsetsCompat windowInsetsCompat0 = ViewCompat.getRootWindowInsets(this);
            return windowInsetsCompat0 == null ? null : windowInsetsCompat0.getSystemGestureInsets();
        }
        return null;
    }

    @Override  // androidx.customview.widget.Openable
    public boolean isOpen() {
        return !this.e || this.g == 0.0f;
    }

    public boolean isSlideable() {
        return this.e;
    }

    @Override  // android.view.ViewGroup
    public void onAttachedToWindow() {
        Activity activity0;
        super.onAttachedToWindow();
        this.r = true;
        if(this.x != null) {
            for(Context context0 = this.getContext(); true; context0 = ((ContextWrapper)context0).getBaseContext()) {
                activity0 = null;
                if(!(context0 instanceof ContextWrapper)) {
                    break;
                }
                if(context0 instanceof Activity) {
                    activity0 = (Activity)context0;
                    break;
                }
            }
            if(activity0 != null) {
                this.x.registerLayoutStateChangeCallback(activity0);
            }
        }
    }

    @Override  // android.view.ViewGroup
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r = true;
        FoldingFeatureObserver foldingFeatureObserver0 = this.x;
        if(foldingFeatureObserver0 != null) {
            foldingFeatureObserver0.unregisterLayoutStateChangeCallback();
        }
        ArrayList arrayList0 = this.t;
        if(arrayList0.size() <= 0) {
            arrayList0.clear();
            return;
        }
        a5.b.z(arrayList0.get(0));
        throw null;
    }

    @Override  // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        int v = motionEvent0.getActionMasked();
        ViewDragHelper viewDragHelper0 = this.p;
        if(!this.e && v == 0 && this.getChildCount() > 1) {
            View view0 = this.getChildAt(1);
            if(view0 != null) {
                this.q = viewDragHelper0.isViewUnder(view0, ((int)motionEvent0.getX()), ((int)motionEvent0.getY()));
            }
        }
        if(this.e && (!this.j || v == 0)) {
            if(v != 1 && v != 3) {
                switch(v) {
                    case 0: {
                        this.j = false;
                        float f = motionEvent0.getX();
                        float f1 = motionEvent0.getY();
                        this.l = f;
                        this.m = f1;
                        return !viewDragHelper0.isViewUnder(this.f, ((int)f), ((int)f1)) || !this.a(this.f) ? viewDragHelper0.shouldInterceptTouchEvent(motionEvent0) : viewDragHelper0.shouldInterceptTouchEvent(motionEvent0) || true;
                    }
                    case 2: {
                        float f2 = motionEvent0.getX();
                        float f3 = motionEvent0.getY();
                        float f4 = Math.abs(f2 - this.l);
                        if(f4 > ((float)viewDragHelper0.getTouchSlop()) && Math.abs(f3 - this.m) > f4) {
                            viewDragHelper0.cancel();
                            this.j = true;
                            return false;
                        }
                        return viewDragHelper0.shouldInterceptTouchEvent(motionEvent0);
                    }
                    default: {
                        return viewDragHelper0.shouldInterceptTouchEvent(motionEvent0);
                    }
                }
            }
            viewDragHelper0.cancel();
            return false;
        }
        viewDragHelper0.cancel();
        return super.onInterceptTouchEvent(motionEvent0);
    }

    @Override  // android.view.ViewGroup
    public void onLayout(boolean z, int v, int v1, int v2, int v3) {
        int v20;
        int v19;
        int v17;
        int v11;
        boolean z1 = this.b();
        int v4 = v2 - v;
        int v5 = z1 ? this.getPaddingRight() : this.getPaddingLeft();
        int v6 = z1 ? this.getPaddingLeft() : this.getPaddingRight();
        int v7 = this.getPaddingTop();
        int v8 = this.getChildCount();
        if(this.r) {
            this.g = !this.e || !this.q ? 1.0f : 0.0f;
        }
        int v9 = v5;
        int v10 = 0;
        while(v10 < v8) {
            View view0 = this.getChildAt(v10);
            if(view0.getVisibility() == 8) {
                v11 = v9;
            }
            else {
                LayoutParams slidingPaneLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                int v12 = view0.getMeasuredWidth();
                if(slidingPaneLayout$LayoutParams0.a) {
                    int v13 = v4 - v6;
                    int v14 = Math.min(v5, v13) - v9 - (slidingPaneLayout$LayoutParams0.leftMargin + slidingPaneLayout$LayoutParams0.rightMargin);
                    this.i = v14;
                    int v15 = z1 ? slidingPaneLayout$LayoutParams0.rightMargin : slidingPaneLayout$LayoutParams0.leftMargin;
                    slidingPaneLayout$LayoutParams0.b = v12 / 2 + (v9 + v15 + v14) > v13;
                    int v16 = (int)(this.g * ((float)v14));
                    v11 = v15 + v16 + v9;
                    this.g = ((float)v16) / ((float)v14);
                }
                else {
                    if(this.e) {
                        int v18 = this.k;
                        if(v18 != 0) {
                            v17 = (int)((1.0f - this.g) * ((float)v18));
                            v11 = v5;
                            goto label_36;
                        }
                    }
                    v11 = v5;
                }
                v17 = 0;
            label_36:
                if(z1) {
                    v19 = v4 - v11 + v17;
                    v20 = v19 - v12;
                }
                else {
                    v20 = v11 - v17;
                    v19 = v20 + v12;
                }
                view0.layout(v20, v7, v19, view0.getMeasuredHeight() + v7);
                v5 = Math.abs((this.v == null || this.v.getOrientation() != Orientation.VERTICAL || !this.v.isSeparating() ? 0 : this.v.getBounds().width())) + view0.getWidth() + v5;
            }
            ++v10;
            v9 = v11;
        }
        if(this.r) {
            if(this.e && this.k != 0) {
                this.c(this.g);
            }
            this.e(this.f);
        }
        this.r = false;
    }

    @Override  // android.view.View
    public void onMeasure(int v, int v1) {
        ArrayList arrayList0;
        int v22;
        int v21;
        int v19;
        int v14;
        int v7;
        int v6;
        int v2 = View.MeasureSpec.getMode(v);
        int v3 = View.MeasureSpec.getSize(v);
        int v4 = View.MeasureSpec.getMode(v1);
        int v5 = View.MeasureSpec.getSize(v1);
        switch(v4) {
            case 0x80000000: {
                v7 = v5 - this.getPaddingTop() - this.getPaddingBottom();
                v6 = 0;
                break;
            }
            case 0x40000000: {
                v6 = v5 - this.getPaddingTop() - this.getPaddingBottom();
                v7 = v6;
                break;
            }
            default: {
                v6 = 0;
                v7 = 0;
            }
        }
        int v8 = Math.max(v3 - this.getPaddingLeft() - this.getPaddingRight(), 0);
        int v9 = this.getChildCount();
        if(v9 > 2) {
            Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
        }
        this.f = null;
        int v10 = 0;
        boolean z = false;
        int v11 = v8;
        float f = 0.0f;
        while(v10 < v9) {
            View view0 = this.getChildAt(v10);
            LayoutParams slidingPaneLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            if(view0.getVisibility() == 8) {
                slidingPaneLayout$LayoutParams0.b = false;
            }
            else {
                float f1 = slidingPaneLayout$LayoutParams0.weight;
                if(f1 > 0.0f) {
                    f += f1;
                    if(slidingPaneLayout$LayoutParams0.width != 0) {
                        goto label_32;
                    }
                }
                else {
                label_32:
                    int v12 = Math.max(v8 - (slidingPaneLayout$LayoutParams0.leftMargin + slidingPaneLayout$LayoutParams0.rightMargin), 0);
                    int v13 = slidingPaneLayout$LayoutParams0.width;
                    if(v13 == -2) {
                        v14 = View.MeasureSpec.makeMeasureSpec(v12, (v2 == 0 ? 0 : 0x80000000));
                    }
                    else {
                        v14 = v13 == -1 ? View.MeasureSpec.makeMeasureSpec(v12, v2) : View.MeasureSpec.makeMeasureSpec(v13, 0x40000000);
                    }
                    int v15 = this.getPaddingTop();
                    view0.measure(v14, ViewGroup.getChildMeasureSpec(v1, this.getPaddingBottom() + v15, slidingPaneLayout$LayoutParams0.height));
                    int v16 = view0.getMeasuredWidth();
                    int v17 = view0.getMeasuredHeight();
                    if(v17 > v6) {
                        switch(v4) {
                            case 0x80000000: {
                                v6 = Math.min(v17, v7);
                                break;
                            }
                            case 0: {
                                v6 = v17;
                            }
                        }
                    }
                    v11 -= v16;
                    if(v10 != 0) {
                        slidingPaneLayout$LayoutParams0.a = v11 < 0;
                        z |= v11 < 0;
                        if(v11 < 0) {
                            this.f = view0;
                        }
                    }
                }
            }
            ++v10;
        }
        if(z || f > 0.0f) {
            int v18 = 0;
            while(v18 < v9) {
                View view1 = this.getChildAt(v18);
                if(view1.getVisibility() == 8) {
                    v19 = v11;
                }
                else {
                    LayoutParams slidingPaneLayout$LayoutParams1 = (LayoutParams)view1.getLayoutParams();
                    int v20 = slidingPaneLayout$LayoutParams1.width != 0 || slidingPaneLayout$LayoutParams1.weight <= 0.0f ? view1.getMeasuredWidth() : 0;
                    if(z) {
                        v21 = v8 - (slidingPaneLayout$LayoutParams1.leftMargin + slidingPaneLayout$LayoutParams1.rightMargin);
                        v22 = View.MeasureSpec.makeMeasureSpec(v21, 0x40000000);
                    }
                    else if(slidingPaneLayout$LayoutParams1.weight > 0.0f) {
                        v21 = ((int)(slidingPaneLayout$LayoutParams1.weight * ((float)Math.max(0, v11)) / f)) + v20;
                        v22 = View.MeasureSpec.makeMeasureSpec(v21, 0x40000000);
                    }
                    else {
                        v21 = v20;
                        v22 = 0;
                    }
                    int v23 = this.getPaddingTop();
                    int v24 = this.getPaddingBottom() + v23;
                    LayoutParams slidingPaneLayout$LayoutParams2 = (LayoutParams)view1.getLayoutParams();
                    v19 = v11;
                    int v25 = slidingPaneLayout$LayoutParams2.width != 0 || slidingPaneLayout$LayoutParams2.weight <= 0.0f ? View.MeasureSpec.makeMeasureSpec(view1.getMeasuredHeight(), 0x40000000) : ViewGroup.getChildMeasureSpec(v1, v24, slidingPaneLayout$LayoutParams2.height);
                    if(v20 != v21) {
                        view1.measure(v22, v25);
                        int v26 = view1.getMeasuredHeight();
                        if(v26 > v6) {
                            switch(v4) {
                                case 0x80000000: {
                                    v6 = Math.min(v26, v7);
                                    break;
                                }
                                case 0: {
                                    v6 = v26;
                                }
                            }
                        }
                    }
                }
                ++v18;
                v11 = v19;
            }
        }
        if(this.v == null || !this.v.isSeparating() || this.v.getBounds().left == 0) {
            arrayList0 = null;
        }
        else if(this.v.getBounds().top == 0) {
            FoldingFeature foldingFeature0 = this.v;
            int[] arr_v = new int[2];
            this.getLocationInWindow(arr_v);
            int v27 = arr_v[0];
            int v28 = arr_v[1];
            int v29 = this.getWidth();
            int v30 = arr_v[1];
            Rect rect0 = new Rect(v27, v28, v29 + v27, this.getWidth() + v30);
            Rect rect1 = new Rect(foldingFeature0.getBounds());
            boolean z1 = rect1.intersect(rect0);
            if((rect1.width() != 0 || rect1.height() != 0) && z1) {
                rect1.offset(-arr_v[0], -arr_v[1]);
            }
            else {
                rect1 = null;
            }
            if(rect1 == null) {
                arrayList0 = null;
            }
            else {
                Rect rect2 = new Rect(this.getPaddingLeft(), this.getPaddingTop(), Math.max(this.getPaddingLeft(), rect1.left), this.getHeight() - this.getPaddingBottom());
                int v31 = this.getWidth() - this.getPaddingRight();
                arrayList0 = new ArrayList(Arrays.asList(new Rect[]{rect2, new Rect(Math.min(v31, rect1.right), this.getPaddingTop(), v31, this.getHeight() - this.getPaddingBottom())}));
            }
        }
        else {
            arrayList0 = null;
        }
        if(arrayList0 != null && !z) {
            for(int v32 = 0; v32 < v9; ++v32) {
                View view2 = this.getChildAt(v32);
                if(view2.getVisibility() != 8) {
                    Rect rect3 = (Rect)arrayList0.get(v32);
                    LayoutParams slidingPaneLayout$LayoutParams3 = (LayoutParams)view2.getLayoutParams();
                    int v33 = slidingPaneLayout$LayoutParams3.leftMargin + slidingPaneLayout$LayoutParams3.rightMargin;
                    int v34 = View.MeasureSpec.makeMeasureSpec(view2.getMeasuredHeight(), 0x40000000);
                    view2.measure(View.MeasureSpec.makeMeasureSpec(rect3.width(), 0x80000000), v34);
                    if((view2.getMeasuredWidthAndState() & 0x1000000) == 1 || (view2 instanceof f ? ViewCompat.getMinimumWidth(((f)view2).getChildAt(0)) : ViewCompat.getMinimumWidth(view2)) != 0 && rect3.width() < (view2 instanceof f ? ViewCompat.getMinimumWidth(((f)view2).getChildAt(0)) : ViewCompat.getMinimumWidth(view2))) {
                        view2.measure(View.MeasureSpec.makeMeasureSpec(v8 - v33, 0x40000000), v34);
                        if(v32 != 0) {
                            slidingPaneLayout$LayoutParams3.a = true;
                            this.f = view2;
                            z = true;
                        }
                    }
                    else {
                        view2.measure(View.MeasureSpec.makeMeasureSpec(rect3.width(), 0x40000000), v34);
                    }
                }
            }
        }
        int v35 = this.getPaddingTop();
        this.setMeasuredDimension(v3, this.getPaddingBottom() + (v35 + v6));
        this.e = z;
        ViewDragHelper viewDragHelper0 = this.p;
        if(viewDragHelper0.getViewDragState() != 0 && !z) {
            viewDragHelper0.abort();
        }
    }

    @Override  // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof e)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((e)parcelable0).getSuperState());
        if(((e)parcelable0).b) {
            this.openPane();
        }
        else {
            this.closePane();
        }
        this.q = ((e)parcelable0).b;
        this.setLockMode(((e)parcelable0).c);
    }

    @Override  // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new e(super.onSaveInstanceState());  // 初始化器: Landroidx/customview/view/AbsSavedState;-><init>(Landroid/os/Parcelable;)V
        parcelable0.b = this.isSlideable() ? this.isOpen() : this.q;
        parcelable0.c = this.u;
        return parcelable0;
    }

    @Override  // android.view.View
    public void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        if(v != v2) {
            this.r = true;
        }
    }

    @Override  // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        if(!this.e) {
            return super.onTouchEvent(motionEvent0);
        }
        ViewDragHelper viewDragHelper0 = this.p;
        viewDragHelper0.processTouchEvent(motionEvent0);
        switch(motionEvent0.getActionMasked()) {
            case 0: {
                float f = motionEvent0.getX();
                float f1 = motionEvent0.getY();
                this.l = f;
                this.m = f1;
                return true;
            }
            case 1: {
                if(this.a(this.f)) {
                    float f2 = motionEvent0.getX();
                    float f3 = motionEvent0.getY();
                    float f4 = f2 - this.l;
                    float f5 = f3 - this.m;
                    int v = viewDragHelper0.getTouchSlop();
                    if(f5 * f5 + f4 * f4 < ((float)(v * v)) && viewDragHelper0.isViewUnder(this.f, ((int)f2), ((int)f3))) {
                        if(!this.e) {
                            this.q = false;
                        }
                        if(this.r || this.d(1.0f)) {
                            this.q = false;
                            return true;
                        }
                    }
                }
                return true;
            }
            default: {
                return true;
            }
        }
    }

    @Override  // androidx.customview.widget.Openable
    public void open() {
        this.openPane();
    }

    public boolean openPane() {
        if(!this.e) {
            this.q = true;
        }
        if(!this.r && !this.d(0.0f)) {
            return false;
        }
        this.q = true;
        return true;
    }

    public void removePanelSlideListener(@NonNull PanelSlideListener slidingPaneLayout$PanelSlideListener0) {
        this.n.remove(slidingPaneLayout$PanelSlideListener0);
    }

    @Override  // android.view.ViewGroup
    public void removeView(@NonNull View view0) {
        if(view0.getParent() instanceof f) {
            super.removeView(((View)view0.getParent()));
            return;
        }
        super.removeView(view0);
    }

    @Override  // android.view.ViewGroup
    public void requestChildFocus(View view0, View view1) {
        super.requestChildFocus(view0, view1);
        if(!this.isInTouchMode() && !this.e) {
            this.q = view0 == this.f;
        }
    }

    @Deprecated
    public void setCoveredFadeColor(@ColorInt int v) {
        this.b = v;
    }

    private void setFoldingFeatureObserver(FoldingFeatureObserver foldingFeatureObserver0) {
        this.x = foldingFeatureObserver0;
        foldingFeatureObserver0.setOnFoldingFeatureChangeListener(this.w);
    }

    public final void setLockMode(int v) {
        this.u = v;
    }

    @Deprecated
    public void setPanelSlideListener(@Nullable PanelSlideListener slidingPaneLayout$PanelSlideListener0) {
        PanelSlideListener slidingPaneLayout$PanelSlideListener1 = this.o;
        if(slidingPaneLayout$PanelSlideListener1 != null) {
            this.removePanelSlideListener(slidingPaneLayout$PanelSlideListener1);
        }
        if(slidingPaneLayout$PanelSlideListener0 != null) {
            this.addPanelSlideListener(slidingPaneLayout$PanelSlideListener0);
        }
        this.o = slidingPaneLayout$PanelSlideListener0;
    }

    public void setParallaxDistance(@Px int v) {
        this.k = v;
        this.requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable0) {
        this.setShadowDrawableLeft(drawable0);
    }

    public void setShadowDrawableLeft(@Nullable Drawable drawable0) {
        this.c = drawable0;
    }

    public void setShadowDrawableRight(@Nullable Drawable drawable0) {
        this.d = drawable0;
    }

    @Deprecated
    public void setShadowResource(@DrawableRes int v) {
        this.setShadowDrawableLeft(this.getResources().getDrawable(v));
    }

    public void setShadowResourceLeft(int v) {
        this.setShadowDrawableLeft(ContextCompat.getDrawable(this.getContext(), v));
    }

    public void setShadowResourceRight(int v) {
        this.setShadowDrawableRight(ContextCompat.getDrawable(this.getContext(), v));
    }

    @Deprecated
    public void setSliderFadeColor(@ColorInt int v) {
        this.a = v;
    }

    @Deprecated
    public void smoothSlideClosed() {
        this.closePane();
    }

    @Deprecated
    public void smoothSlideOpen() {
        this.openPane();
    }
}

