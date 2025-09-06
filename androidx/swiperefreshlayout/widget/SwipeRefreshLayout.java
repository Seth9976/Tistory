package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.ListView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.content.ContextCompat;
import androidx.core.view.NestedScrollingChild2;
import androidx.core.view.NestedScrollingChild3;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.NestedScrollingParent2;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ViewCompat;
import androidx.core.widget.ListViewCompat;
import androidx.swiperefreshlayout.R.styleable;

public class SwipeRefreshLayout extends ViewGroup implements NestedScrollingChild2, NestedScrollingChild3, NestedScrollingChild, NestedScrollingParent2, NestedScrollingParent3, NestedScrollingParent {
    public interface OnChildScrollUpCallback {
        boolean canChildScrollUp(@NonNull SwipeRefreshLayout arg1, @Nullable View arg2);
    }

    public interface OnRefreshListener {
        void onRefresh();
    }

    public h A;
    public h B;
    public f C;
    public f D;
    public static final int DEFAULT = 1;
    public static final int DEFAULT_SLINGSHOT_DISTANCE = -1;
    public h E;
    public boolean F;
    public int G;
    public boolean H;
    public OnChildScrollUpCallback I;
    public boolean J;
    public final e K;
    public final h L;
    public static final int LARGE;
    public final h M;
    public static final int[] N;
    public View a;
    public OnRefreshListener b;
    public boolean c;
    public final int d;
    public float e;
    public float f;
    public final NestedScrollingParentHelper g;
    public final NestedScrollingChildHelper h;
    public final int[] i;
    public final int[] j;
    public final int[] k;
    public boolean l;
    public final int m;
    protected int mFrom;
    protected int mOriginalOffsetTop;
    public int n;
    public float o;
    public float p;
    public boolean q;
    public int r;
    public boolean s;
    public final DecelerateInterpolator t;
    public final a u;
    public int v;
    public float w;
    public int x;
    public int y;
    public final CircularProgressDrawable z;

    static {
        SwipeRefreshLayout.N = new int[]{0x101000E};
    }

    public SwipeRefreshLayout(@NonNull Context context0) {
        this(context0, null);
    }

    public SwipeRefreshLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.c = false;
        this.e = -1.0f;
        this.i = new int[2];
        this.j = new int[2];
        this.k = new int[2];
        this.r = -1;
        this.v = -1;
        this.K = new e(this);
        this.L = new h(this, 0);
        this.M = new h(this, 3);
        this.d = ViewConfiguration.get(context0).getScaledTouchSlop();
        this.m = this.getResources().getInteger(0x10E0001);
        this.setWillNotDraw(false);
        this.t = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics0 = this.getResources().getDisplayMetrics();
        this.G = (int)(displayMetrics0.density * 40.0f);
        a a0 = new a(this.getContext());  // 初始化器: Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V
        float f = a0.getContext().getResources().getDisplayMetrics().density;
        TypedArray typedArray0 = a0.getContext().obtainStyledAttributes(styleable.SwipeRefreshLayout);
        a0.b = typedArray0.getColor(styleable.SwipeRefreshLayout_swipeRefreshLayoutProgressSpinnerBackgroundColor, 0xFFFAFAFA);
        typedArray0.recycle();
        ShapeDrawable shapeDrawable0 = new ShapeDrawable(new OvalShape());
        ViewCompat.setElevation(a0, f * 4.0f);
        shapeDrawable0.getPaint().setColor(a0.b);
        ViewCompat.setBackground(a0, shapeDrawable0);
        this.u = a0;
        CircularProgressDrawable circularProgressDrawable0 = new CircularProgressDrawable(this.getContext());
        this.z = circularProgressDrawable0;
        circularProgressDrawable0.setStyle(1);
        this.u.setImageDrawable(this.z);
        this.u.setVisibility(8);
        this.addView(this.u);
        this.setChildrenDrawingOrderEnabled(true);
        int v = (int)(displayMetrics0.density * 64.0f);
        this.x = v;
        this.e = (float)v;
        this.g = new NestedScrollingParentHelper(this);
        this.h = new NestedScrollingChildHelper(this);
        this.setNestedScrollingEnabled(true);
        this.n = -this.G;
        this.mOriginalOffsetTop = -this.G;
        this.d(1.0f);
        TypedArray typedArray1 = context0.obtainStyledAttributes(attributeSet0, SwipeRefreshLayout.N);
        this.setEnabled(typedArray1.getBoolean(0, true));
        typedArray1.recycle();
    }

    public final void a() {
        if(this.a == null) {
            for(int v = 0; v < this.getChildCount(); ++v) {
                View view0 = this.getChildAt(v);
                if(!view0.equals(this.u)) {
                    this.a = view0;
                    return;
                }
            }
        }
    }

    public final void b(float f) {
        if(f > this.e) {
            this.f(true, true);
            return;
        }
        this.c = false;
        this.z.setStartEndTrim(0.0f, 0.0f);
        boolean z = this.s;
        g g0 = z ? null : new g(this);
        int v = this.n;
        if(z) {
            this.mFrom = v;
            this.w = this.u.getScaleX();
            h h0 = new h(this, 4);
            this.E = h0;
            h0.setDuration(150L);
            if(g0 != null) {
                this.u.a = g0;
            }
            this.u.clearAnimation();
            this.u.startAnimation(this.E);
        }
        else {
            this.mFrom = v;
            h h1 = this.M;
            h1.reset();
            h1.setDuration(200L);
            h1.setInterpolator(this.t);
            if(g0 != null) {
                this.u.a = g0;
            }
            this.u.clearAnimation();
            this.u.startAnimation(h1);
        }
        this.z.setArrowEnabled(false);
    }

    public final void c(float f) {
        this.z.setArrowEnabled(true);
        float f1 = Math.min(1.0f, Math.abs(f / this.e));
        float f2 = ((float)Math.max(((double)f1) - 0.4, 0.0)) * 5.0f / 3.0f;
        float f3 = Math.abs(f) - this.e;
        int v = this.y;
        if(v <= 0) {
            v = this.H ? this.x - this.mOriginalOffsetTop : this.x;
        }
        float f4 = Math.max(0.0f, Math.min(f3, ((float)v) * 2.0f) / ((float)v));
        float f5 = ((float)(((double)(f4 / 4.0f)) - Math.pow(f4 / 4.0f, 2.0))) * 2.0f;
        int v1 = this.mOriginalOffsetTop + ((int)(((float)v) * f1 + ((float)v) * f5 * 2.0f));
        if(this.u.getVisibility() != 0) {
            this.u.setVisibility(0);
        }
        if(!this.s) {
            this.u.setScaleX(1.0f);
            this.u.setScaleY(1.0f);
        }
        if(this.s) {
            this.setAnimationProgress(Math.min(1.0f, f / this.e));
        }
        if(Float.compare(f, this.e) >= 0) {
            if(this.z.getAlpha() < 0xFF) {
                f f8 = this.D;
                if(f8 == null || !f8.hasStarted() || f8.hasEnded()) {
                    f f9 = new f(this, this.z.getAlpha(), 0xFF);
                    f9.setDuration(300L);
                    this.u.a = null;
                    this.u.clearAnimation();
                    this.u.startAnimation(f9);
                    this.D = f9;
                }
            }
        }
        else if(this.z.getAlpha() > 76) {
            f f6 = this.C;
            if(f6 == null || !f6.hasStarted() || f6.hasEnded()) {
                f f7 = new f(this, this.z.getAlpha(), 76);
                f7.setDuration(300L);
                this.u.a = null;
                this.u.clearAnimation();
                this.u.startAnimation(f7);
                this.C = f7;
            }
        }
        this.z.setStartEndTrim(0.0f, Math.min(0.8f, f2 * 0.8f));
        this.z.setArrowScale(Math.min(1.0f, f2));
        this.z.setProgressRotation((f5 * 2.0f + (f2 * 0.4f - 0.25f)) * 0.5f);
        this.setTargetOffsetTopAndBottom(v1 - this.n);
    }

    public boolean canChildScrollUp() {
        OnChildScrollUpCallback swipeRefreshLayout$OnChildScrollUpCallback0 = this.I;
        if(swipeRefreshLayout$OnChildScrollUpCallback0 != null) {
            return swipeRefreshLayout$OnChildScrollUpCallback0.canChildScrollUp(this, this.a);
        }
        View view0 = this.a;
        return view0 instanceof ListView ? ListViewCompat.canScrollList(((ListView)view0), -1) : view0.canScrollVertically(-1);
    }

    public final void d(float f) {
        this.setTargetOffsetTopAndBottom(this.mFrom + ((int)(((float)(this.mOriginalOffsetTop - this.mFrom)) * f)) - this.u.getTop());
    }

    @Override  // androidx.core.view.NestedScrollingChild, android.view.View
    public boolean dispatchNestedFling(float f, float f1, boolean z) {
        return this.h.dispatchNestedFling(f, f1, z);
    }

    @Override  // androidx.core.view.NestedScrollingChild, android.view.View
    public boolean dispatchNestedPreFling(float f, float f1) {
        return this.h.dispatchNestedPreFling(f, f1);
    }

    @Override  // androidx.core.view.NestedScrollingChild, android.view.View
    public boolean dispatchNestedPreScroll(int v, int v1, int[] arr_v, int[] arr_v1) {
        return this.h.dispatchNestedPreScroll(v, v1, arr_v, arr_v1);
    }

    @Override  // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedPreScroll(int v, int v1, int[] arr_v, int[] arr_v1, int v2) {
        return v2 == 0 && this.dispatchNestedPreScroll(v, v1, arr_v, arr_v1);
    }

    @Override  // androidx.core.view.NestedScrollingChild3
    public void dispatchNestedScroll(int v, int v1, int v2, int v3, @Nullable int[] arr_v, int v4, @NonNull int[] arr_v1) {
        if(v4 == 0) {
            this.h.dispatchNestedScroll(v, v1, v2, v3, arr_v, 0, arr_v1);
        }
    }

    @Override  // androidx.core.view.NestedScrollingChild, android.view.View
    public boolean dispatchNestedScroll(int v, int v1, int v2, int v3, int[] arr_v) {
        return this.h.dispatchNestedScroll(v, v1, v2, v3, arr_v);
    }

    @Override  // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedScroll(int v, int v1, int v2, int v3, int[] arr_v, int v4) {
        return v4 == 0 && this.h.dispatchNestedScroll(v, v1, v2, v3, arr_v, 0);
    }

    public final void e() {
        this.u.clearAnimation();
        this.z.stop();
        this.u.setVisibility(8);
        this.setColorViewAlpha(0xFF);
        if(this.s) {
            this.setAnimationProgress(0.0f);
        }
        else {
            this.setTargetOffsetTopAndBottom(this.mOriginalOffsetTop - this.n);
        }
        this.n = this.u.getTop();
    }

    public final void f(boolean z, boolean z1) {
        if(this.c != z) {
            this.F = z1;
            this.a();
            this.c = z;
            e e0 = this.K;
            if(z) {
                this.mFrom = this.n;
                h h0 = this.L;
                h0.reset();
                h0.setDuration(200L);
                h0.setInterpolator(this.t);
                if(e0 != null) {
                    this.u.a = e0;
                }
                this.u.clearAnimation();
                this.u.startAnimation(h0);
                return;
            }
            h h1 = new h(this, 2);
            this.B = h1;
            h1.setDuration(150L);
            this.u.a = e0;
            this.u.clearAnimation();
            this.u.startAnimation(this.B);
        }
    }

    public final void g(float f) {
        float f1 = this.p;
        float f2 = (float)this.d;
        if(f - f1 > f2 && !this.q) {
            this.o = f1 + f2;
            this.q = true;
            this.z.setAlpha(76);
        }
    }

    @Override  // android.view.ViewGroup
    public int getChildDrawingOrder(int v, int v1) {
        int v2 = this.v;
        if(v2 < 0) {
            return v1;
        }
        if(v1 == v - 1) {
            return v2;
        }
        return v1 < v2 ? v1 : v1 + 1;
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.g.getNestedScrollAxes();
    }

    public int getProgressCircleDiameter() {
        return this.G;
    }

    public int getProgressViewEndOffset() {
        return this.x;
    }

    public int getProgressViewStartOffset() {
        return this.mOriginalOffsetTop;
    }

    @Override  // androidx.core.view.NestedScrollingChild, android.view.View
    public boolean hasNestedScrollingParent() {
        return this.h.hasNestedScrollingParent();
    }

    @Override  // androidx.core.view.NestedScrollingChild2
    public boolean hasNestedScrollingParent(int v) {
        return v == 0 && this.hasNestedScrollingParent();
    }

    @Override  // androidx.core.view.NestedScrollingChild, android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.h.isNestedScrollingEnabled();
    }

    public boolean isRefreshing() {
        return this.c;
    }

    @Override  // android.view.ViewGroup
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e();
    }

    @Override  // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        this.a();
        int v = motionEvent0.getActionMasked();
        int v1 = 0;
        if(this.isEnabled() && !this.canChildScrollUp() && !this.c && !this.l) {
            switch(v) {
                case 0: {
                    this.setTargetOffsetTopAndBottom(this.mOriginalOffsetTop - this.u.getTop());
                    int v5 = motionEvent0.getPointerId(0);
                    this.r = v5;
                    this.q = false;
                    int v6 = motionEvent0.findPointerIndex(v5);
                    if(v6 < 0) {
                        return false;
                    }
                    this.p = motionEvent0.getY(v6);
                    break;
                }
                case 2: {
                    int v2 = this.r;
                    if(v2 == -1) {
                        Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but don\'t have an active pointer id.");
                        return false;
                    }
                    int v3 = motionEvent0.findPointerIndex(v2);
                    if(v3 < 0) {
                        return false;
                    }
                    this.g(motionEvent0.getY(v3));
                    return this.q;
                }
                case 1: 
                case 3: {
                    this.q = false;
                    this.r = -1;
                    return false;
                }
                case 6: {
                    int v4 = motionEvent0.getActionIndex();
                    if(motionEvent0.getPointerId(v4) == this.r) {
                        if(v4 == 0) {
                            v1 = 1;
                        }
                        this.r = motionEvent0.getPointerId(v1);
                        return this.q;
                    }
                    break;
                }
                default: {
                    return this.q;
                }
            }
            return this.q;
        }
        return false;
    }

    @Override  // android.view.ViewGroup
    public void onLayout(boolean z, int v, int v1, int v2, int v3) {
        int v4 = this.getMeasuredWidth();
        int v5 = this.getMeasuredHeight();
        if(this.getChildCount() == 0) {
            return;
        }
        if(this.a == null) {
            this.a();
        }
        View view0 = this.a;
        if(view0 == null) {
            return;
        }
        int v6 = this.getPaddingLeft();
        int v7 = this.getPaddingTop();
        view0.layout(v6, v7, v4 - this.getPaddingLeft() - this.getPaddingRight() + v6, v5 - this.getPaddingTop() - this.getPaddingBottom() + v7);
        int v8 = this.u.getMeasuredWidth();
        int v9 = this.u.getMeasuredHeight();
        this.u.layout(v4 / 2 - v8 / 2, this.n, v4 / 2 + v8 / 2, v9 + this.n);
    }

    @Override  // android.view.View
    public void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        if(this.a == null) {
            this.a();
        }
        View view0 = this.a;
        if(view0 == null) {
            return;
        }
        view0.measure(View.MeasureSpec.makeMeasureSpec(this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight(), 0x40000000), View.MeasureSpec.makeMeasureSpec(this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom(), 0x40000000));
        int v2 = View.MeasureSpec.makeMeasureSpec(this.G, 0x40000000);
        int v3 = View.MeasureSpec.makeMeasureSpec(this.G, 0x40000000);
        this.u.measure(v2, v3);
        this.v = -1;
        for(int v4 = 0; v4 < this.getChildCount(); ++v4) {
            if(this.getChildAt(v4) == this.u) {
                this.v = v4;
                return;
            }
        }
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View view0, float f, float f1, boolean z) {
        return this.dispatchNestedFling(f, f1, z);
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view0, float f, float f1) {
        return this.dispatchNestedPreFling(f, f1);
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(View view0, int v, int v1, int[] arr_v) {
        if(v1 > 0) {
            float f = this.f;
            if(f > 0.0f) {
                if(((float)v1) > f) {
                    arr_v[1] = (int)f;
                    this.f = 0.0f;
                }
                else {
                    this.f = f - ((float)v1);
                    arr_v[1] = v1;
                }
                this.c(this.f);
            }
        }
        if(this.H && v1 > 0 && this.f == 0.0f && Math.abs(v1 - arr_v[1]) > 0) {
            this.u.setVisibility(8);
        }
        int[] arr_v1 = this.i;
        if(this.dispatchNestedPreScroll(v - arr_v[0], v1 - arr_v[1], arr_v1, null)) {
            arr_v[0] += arr_v1[0];
            arr_v[1] += arr_v1[1];
        }
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(View view0, int v, int v1, int[] arr_v, int v2) {
        if(v2 == 0) {
            this.onNestedPreScroll(view0, v, v1, arr_v);
        }
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(View view0, int v, int v1, int v2, int v3) {
        this.onNestedScroll(view0, v, v1, v2, v3, 0, this.k);
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(View view0, int v, int v1, int v2, int v3, int v4) {
        this.onNestedScroll(view0, v, v1, v2, v3, v4, this.k);
    }

    @Override  // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(@NonNull View view0, int v, int v1, int v2, int v3, int v4, @NonNull int[] arr_v) {
        if(v4 != 0) {
            return;
        }
        int v5 = arr_v[1];
        this.dispatchNestedScroll(v, v1, v2, v3, this.j, 0, arr_v);
        int v6 = v3 - (arr_v[1] - v5);
        int v7 = v6 == 0 ? v3 + this.j[1] : v6;
        if(v7 < 0 && !this.canChildScrollUp()) {
            float f = this.f + ((float)Math.abs(v7));
            this.f = f;
            this.c(f);
            arr_v[1] += v6;
        }
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(View view0, View view1, int v) {
        this.g.onNestedScrollAccepted(view0, view1, v);
        this.startNestedScroll(v & 2);
        this.f = 0.0f;
        this.l = true;
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View view0, View view1, int v, int v1) {
        if(v1 == 0) {
            this.onNestedScrollAccepted(view0, view1, v);
        }
    }

    @Override  // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable0) {
        super.onRestoreInstanceState(((i)parcelable0).getSuperState());
        this.setRefreshing(((i)parcelable0).a);
    }

    @Override  // android.view.View
    public Parcelable onSaveInstanceState() {
        return new i(super.onSaveInstanceState(), this.c);
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view0, View view1, int v) {
        return this.isEnabled() && !this.c && (v & 2) != 0;
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View view0, View view1, int v, int v1) {
        return v1 == 0 ? this.onStartNestedScroll(view0, view1, v) : false;
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(View view0) {
        this.g.onStopNestedScroll(view0);
        this.l = false;
        float f = this.f;
        if(f > 0.0f) {
            this.b(f);
            this.f = 0.0f;
        }
        this.stopNestedScroll();
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(View view0, int v) {
        if(v == 0) {
            this.onStopNestedScroll(view0);
        }
    }

    @Override  // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        int v = motionEvent0.getActionMasked();
        int v1 = 0;
        if(this.isEnabled() && !this.canChildScrollUp() && !this.c && !this.l) {
            switch(v) {
                case 0: {
                    this.r = motionEvent0.getPointerId(0);
                    this.q = false;
                    break;
                }
                case 1: {
                    int v3 = motionEvent0.findPointerIndex(this.r);
                    if(v3 < 0) {
                        Log.e("SwipeRefreshLayout", "Got ACTION_UP event but don\'t have an active pointer id.");
                        return false;
                    }
                    if(this.q) {
                        float f = motionEvent0.getY(v3);
                        this.q = false;
                        this.b((f - this.o) * 0.5f);
                    }
                    this.r = -1;
                    return false;
                }
                case 2: {
                    int v5 = motionEvent0.findPointerIndex(this.r);
                    if(v5 < 0) {
                        Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                        return false;
                    }
                    float f1 = motionEvent0.getY(v5);
                    this.g(f1);
                    if(this.q) {
                        float f2 = (f1 - this.o) * 0.5f;
                        if(f2 > 0.0f) {
                            this.getParent().requestDisallowInterceptTouchEvent(true);
                            this.c(f2);
                            return true;
                        }
                        return false;
                    }
                    break;
                }
                case 3: {
                    return false;
                }
                case 5: {
                    int v2 = motionEvent0.getActionIndex();
                    if(v2 < 0) {
                        Log.e("SwipeRefreshLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    }
                    this.r = motionEvent0.getPointerId(v2);
                    return true;
                }
                case 6: {
                    int v4 = motionEvent0.getActionIndex();
                    if(motionEvent0.getPointerId(v4) == this.r) {
                        if(v4 == 0) {
                            v1 = 1;
                        }
                        this.r = motionEvent0.getPointerId(v1);
                        return true;
                    }
                    break;
                }
                default: {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    @Override  // android.view.ViewGroup
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if(this.a == null || ViewCompat.isNestedScrollingEnabled(this.a)) {
            super.requestDisallowInterceptTouchEvent(z);
        }
        else if(!this.J) {
            ViewParent viewParent0 = this.getParent();
            if(viewParent0 != null) {
                viewParent0.requestDisallowInterceptTouchEvent(z);
            }
        }
    }

    public void setAnimationProgress(float f) {
        this.u.setScaleX(f);
        this.u.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(@ColorRes int[] arr_v) {
        this.setColorSchemeResources(arr_v);
    }

    public void setColorSchemeColors(@ColorInt int[] arr_v) {
        this.a();
        this.z.setColorSchemeColors(arr_v);
    }

    public void setColorSchemeResources(@ColorRes int[] arr_v) {
        Context context0 = this.getContext();
        int[] arr_v1 = new int[arr_v.length];
        for(int v = 0; v < arr_v.length; ++v) {
            arr_v1[v] = ContextCompat.getColor(context0, arr_v[v]);
        }
        this.setColorSchemeColors(arr_v1);
    }

    private void setColorViewAlpha(int v) {
        this.u.getBackground().setAlpha(v);
        this.z.setAlpha(v);
    }

    public void setDistanceToTriggerSync(int v) {
        this.e = (float)v;
    }

    @Override  // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if(!z) {
            this.e();
        }
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z) {
        this.J = z;
    }

    @Override  // androidx.core.view.NestedScrollingChild, android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.h.setNestedScrollingEnabled(z);
    }

    public void setOnChildScrollUpCallback(@Nullable OnChildScrollUpCallback swipeRefreshLayout$OnChildScrollUpCallback0) {
        this.I = swipeRefreshLayout$OnChildScrollUpCallback0;
    }

    public void setOnRefreshListener(@Nullable OnRefreshListener swipeRefreshLayout$OnRefreshListener0) {
        this.b = swipeRefreshLayout$OnRefreshListener0;
    }

    @Deprecated
    public void setProgressBackgroundColor(int v) {
        this.setProgressBackgroundColorSchemeResource(v);
    }

    public void setProgressBackgroundColorSchemeColor(@ColorInt int v) {
        this.u.setBackgroundColor(v);
    }

    public void setProgressBackgroundColorSchemeResource(@ColorRes int v) {
        this.setProgressBackgroundColorSchemeColor(ContextCompat.getColor(this.getContext(), v));
    }

    public void setProgressViewEndTarget(boolean z, int v) {
        this.x = v;
        this.s = z;
        this.u.invalidate();
    }

    public void setProgressViewOffset(boolean z, int v, int v1) {
        this.s = z;
        this.mOriginalOffsetTop = v;
        this.x = v1;
        this.H = true;
        this.e();
        this.c = false;
    }

    public void setRefreshing(boolean z) {
        if(z && !this.c) {
            this.c = true;
            this.setTargetOffsetTopAndBottom((this.H ? this.x : this.x + this.mOriginalOffsetTop) - this.n);
            this.F = false;
            e e0 = this.K;
            this.u.setVisibility(0);
            this.z.setAlpha(0xFF);
            h h0 = new h(this, 1);
            this.A = h0;
            h0.setDuration(((long)this.m));
            if(e0 != null) {
                this.u.a = e0;
            }
            this.u.clearAnimation();
            this.u.startAnimation(this.A);
            return;
        }
        this.f(z, false);
    }

    public void setSize(int v) {
        if(v != 0 && v != 1) {
            return;
        }
        DisplayMetrics displayMetrics0 = this.getResources().getDisplayMetrics();
        this.G = v == 0 ? ((int)(displayMetrics0.density * 56.0f)) : ((int)(displayMetrics0.density * 40.0f));
        this.u.setImageDrawable(null);
        this.z.setStyle(v);
        this.u.setImageDrawable(this.z);
    }

    public void setSlingshotDistance(@Px int v) {
        this.y = v;
    }

    public void setTargetOffsetTopAndBottom(int v) {
        this.u.bringToFront();
        ViewCompat.offsetTopAndBottom(this.u, v);
        this.n = this.u.getTop();
    }

    @Override  // androidx.core.view.NestedScrollingChild, android.view.View
    public boolean startNestedScroll(int v) {
        return this.h.startNestedScroll(v);
    }

    @Override  // androidx.core.view.NestedScrollingChild2
    public boolean startNestedScroll(int v, int v1) {
        return v1 == 0 && this.startNestedScroll(v);
    }

    @Override  // androidx.core.view.NestedScrollingChild, android.view.View
    public void stopNestedScroll() {
        this.h.stopNestedScroll();
    }

    @Override  // androidx.core.view.NestedScrollingChild2
    public void stopNestedScroll(int v) {
        if(v == 0) {
            this.stopNestedScroll();
        }
    }
}

