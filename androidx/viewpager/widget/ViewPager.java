package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.annotation.CallSuper;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.appcompat.widget.y1;
import androidx.constraintlayout.core.c;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.h1;
import e5.d;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import wb.a;

public class ViewPager extends ViewGroup {
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.TYPE})
    public @interface DecorView {
    }

    public static class LayoutParams extends ViewGroup.LayoutParams {
        public float a;
        public boolean b;
        public int c;
        public int d;
        public int gravity;
        public boolean isDecor;

        public LayoutParams() {
            super(-1, -1);
            this.a = 0.0f;
        }

        public LayoutParams(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            this.a = 0.0f;
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, ViewPager.g0);
            this.gravity = typedArray0.getInteger(0, 0x30);
            typedArray0.recycle();
        }
    }

    public interface OnAdapterChangeListener {
        void onAdapterChanged(@NonNull ViewPager arg1, @Nullable PagerAdapter arg2, @Nullable PagerAdapter arg3);
    }

    public interface OnPageChangeListener {
        void onPageScrollStateChanged(int arg1);

        void onPageScrolled(int arg1, float arg2, @Px int arg3);

        void onPageSelected(int arg1);
    }

    public interface PageTransformer {
        void transformPage(@NonNull View arg1, float arg2);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR;
        public int b;
        public Parcelable c;
        public final ClassLoader d;

        static {
            SavedState.CREATOR = new b();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        public SavedState(Parcel parcel0, ClassLoader classLoader0) {
            super(parcel0, classLoader0);
            if(classLoader0 == null) {
                classLoader0 = this.getClass().getClassLoader();
            }
            this.b = parcel0.readInt();
            this.c = parcel0.readParcelable(classLoader0);
            this.d = classLoader0;
        }

        public SavedState(@NonNull Parcelable parcelable0) {
            super(parcelable0);
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("FragmentPager.SavedState{");
            stringBuilder0.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder0.append(" position=");
            return a.c(this.b, "}", stringBuilder0);
        }

        @Override  // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeInt(this.b);
            parcel0.writeParcelable(this.c, v);
        }
    }

    public static class SimpleOnPageChangeListener implements OnPageChangeListener {
        @Override  // androidx.viewpager.widget.ViewPager$OnPageChangeListener
        public void onPageScrollStateChanged(int v) {
        }

        @Override  // androidx.viewpager.widget.ViewPager$OnPageChangeListener
        public void onPageScrolled(int v, float f, int v1) {
        }

        @Override  // androidx.viewpager.widget.ViewPager$OnPageChangeListener
        public void onPageSelected(int v) {
        }
    }

    public int A;
    public int B;
    public float C;
    public float D;
    public float E;
    public float F;
    public int G;
    public VelocityTracker H;
    public int I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public long N;
    public EdgeEffect O;
    public EdgeEffect P;
    public boolean Q;
    public boolean R;
    public int S;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    public ArrayList T;
    public OnPageChangeListener U;
    public OnPageChangeListener V;
    public ArrayList W;
    public int a;
    public PageTransformer a0;
    public final ArrayList b;
    public int b0;
    public final d c;
    public int c0;
    public final Rect d;
    public ArrayList d0;
    public PagerAdapter e;
    public final androidx.appcompat.widget.a e0;
    public int f;
    public int f0;
    public int g;
    public static final int[] g0;
    public Parcelable h;
    public static final c h0;
    public ClassLoader i;
    public static final h1 i0;
    public Scroller j;
    public static final androidx.viewpager.widget.c j0;
    public boolean k;
    public y1 l;
    public int m;
    public Drawable n;
    public int o;
    public int p;
    public float q;
    public float r;
    public int s;
    public boolean t;
    public boolean u;
    public boolean v;
    public int w;
    public boolean x;
    public boolean y;
    public int z;

    static {
        ViewPager.g0 = new int[]{0x10100B3};
        ViewPager.h0 = new c(10);
        ViewPager.i0 = new h1(1);
        ViewPager.j0 = new androidx.viewpager.widget.c();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public ViewPager(@NonNull Context context0) {
        super(context0);
        this.b = new ArrayList();
        this.c = new d();  // 初始化器: Ljava/lang/Object;-><init>()V
        this.d = new Rect();
        this.g = -1;
        this.h = null;
        this.i = null;
        this.q = -3.402823E+38f;
        this.r = 3.402823E+38f;
        this.w = 1;
        this.G = -1;
        this.Q = true;
        this.e0 = new androidx.appcompat.widget.a(this, 13);
        this.f0 = 0;
        this.j();
    }

    public ViewPager(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.b = new ArrayList();
        this.c = new d();  // 初始化器: Ljava/lang/Object;-><init>()V
        this.d = new Rect();
        this.g = -1;
        this.h = null;
        this.i = null;
        this.q = -3.402823E+38f;
        this.r = 3.402823E+38f;
        this.w = 1;
        this.G = -1;
        this.Q = true;
        this.e0 = new androidx.appcompat.widget.a(this, 13);
        this.f0 = 0;
        this.j();
    }

    public final d a(int v, int v1) {
        d d0 = new d();  // 初始化器: Ljava/lang/Object;-><init>()V
        d0.b = v;
        d0.a = this.e.instantiateItem(this, v);
        d0.d = 1.0f;
        ArrayList arrayList0 = this.b;
        if(v1 >= 0 && v1 < arrayList0.size()) {
            arrayList0.add(v1, d0);
            return d0;
        }
        arrayList0.add(d0);
        return d0;
    }

    @Override  // android.view.ViewGroup
    public void addFocusables(ArrayList arrayList0, int v, int v1) {
        int v2 = arrayList0.size();
        int v3 = this.getDescendantFocusability();
        if(v3 != 0x60000) {
            for(int v4 = 0; v4 < this.getChildCount(); ++v4) {
                View view0 = this.getChildAt(v4);
                if(view0.getVisibility() == 0) {
                    d d0 = this.g(view0);
                    if(d0 != null && d0.b == this.f) {
                        view0.addFocusables(arrayList0, v, v1);
                    }
                }
            }
        }
        if(v3 == 0x40000 && v2 != arrayList0.size() || !this.isFocusable()) {
            return;
        }
        if((v1 & 1) == 1 && this.isInTouchMode() && !this.isFocusableInTouchMode()) {
            return;
        }
        arrayList0.add(this);
    }

    public void addOnAdapterChangeListener(@NonNull OnAdapterChangeListener viewPager$OnAdapterChangeListener0) {
        if(this.W == null) {
            this.W = new ArrayList();
        }
        this.W.add(viewPager$OnAdapterChangeListener0);
    }

    public void addOnPageChangeListener(@NonNull OnPageChangeListener viewPager$OnPageChangeListener0) {
        if(this.T == null) {
            this.T = new ArrayList();
        }
        this.T.add(viewPager$OnPageChangeListener0);
    }

    @Override  // android.view.ViewGroup
    public void addTouchables(ArrayList arrayList0) {
        for(int v = 0; v < this.getChildCount(); ++v) {
            View view0 = this.getChildAt(v);
            if(view0.getVisibility() == 0) {
                d d0 = this.g(view0);
                if(d0 != null && d0.b == this.f) {
                    view0.addTouchables(arrayList0);
                }
            }
        }
    }

    @Override  // android.view.ViewGroup
    public void addView(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(!this.checkLayoutParams(viewGroup$LayoutParams0)) {
            viewGroup$LayoutParams0 = this.generateLayoutParams(viewGroup$LayoutParams0);
        }
        int v1 = ((LayoutParams)viewGroup$LayoutParams0).isDecor | view0.getClass().getAnnotation(DecorView.class) != null;
        ((LayoutParams)viewGroup$LayoutParams0).isDecor = v1;
        if(this.t) {
            if(v1 != 0) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            ((LayoutParams)viewGroup$LayoutParams0).b = true;
            this.addViewInLayout(view0, v, viewGroup$LayoutParams0);
            return;
        }
        super.addView(view0, v, viewGroup$LayoutParams0);
    }

    public boolean arrowScroll(int v) {
        View view0 = this.findFocus();
        if(view0 == this) {
            view0 = null;
        }
        else if(view0 != null) {
            ViewParent viewParent0 = view0.getParent();
            while(viewParent0 instanceof ViewGroup) {
                if(viewParent0 == this) {
                    goto label_20;
                }
                viewParent0 = viewParent0.getParent();
            }
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append(view0.getClass().getSimpleName());
            for(ViewParent viewParent1 = view0.getParent(); viewParent1 instanceof ViewGroup; viewParent1 = viewParent1.getParent()) {
                stringBuilder0.append(" => ");
                stringBuilder0.append(viewParent1.getClass().getSimpleName());
            }
            Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + stringBuilder0.toString());
            view0 = null;
        }
    label_20:
        View view1 = FocusFinder.getInstance().findNextFocus(this, view0, v);
        boolean z = false;
        if(view1 != null && view1 != view0) {
            Rect rect0 = this.d;
            if(v != 17) {
                if(v == 66) {
                    z = view0 == null || this.f(view1, rect0).left > this.f(view0, rect0).left ? view1.requestFocus() : this.l();
                }
            }
            else if(view0 != null && this.f(view1, rect0).left >= this.f(view0, rect0).left) {
                int v1 = this.f;
                if(v1 > 0) {
                    this.setCurrentItem(v1 - 1, true);
                    z = true;
                }
            }
            else {
                z = view1.requestFocus();
            }
        }
        else if(v == 1 || v == 17) {
            int v2 = this.f;
            if(v2 > 0) {
                this.setCurrentItem(v2 - 1, true);
                z = true;
            }
        }
        else if(v == 2 || v == 66) {
            z = this.l();
        }
        if(z) {
            this.playSoundEffect(SoundEffectConstants.getContantForFocusDirection(v));
        }
        return z;
    }

    public final void b(boolean z) {
        boolean z1 = this.f0 == 2;
        if(z1) {
            this.setScrollingCacheEnabled(false);
            if(!this.j.isFinished()) {
                this.j.abortAnimation();
                int v = this.getScrollX();
                int v1 = this.getScrollY();
                int v2 = this.j.getCurrX();
                int v3 = this.j.getCurrY();
                if(v != v2 || v1 != v3) {
                    this.scrollTo(v2, v3);
                    if(v2 != v) {
                        this.m(v2);
                    }
                }
            }
        }
        this.v = false;
        for(int v4 = 0; true; ++v4) {
            ArrayList arrayList0 = this.b;
            if(v4 >= arrayList0.size()) {
                break;
            }
            d d0 = (d)arrayList0.get(v4);
            if(d0.c) {
                d0.c = false;
                z1 = true;
            }
        }
        if(z1) {
            androidx.appcompat.widget.a a0 = this.e0;
            if(z) {
                ViewCompat.postOnAnimation(this, a0);
                return;
            }
            a0.run();
        }
    }

    public boolean beginFakeDrag() {
        if(this.x) {
            return false;
        }
        this.M = true;
        this.setScrollState(1);
        this.C = 0.0f;
        this.E = 0.0f;
        VelocityTracker velocityTracker0 = this.H;
        if(velocityTracker0 == null) {
            this.H = VelocityTracker.obtain();
        }
        else {
            velocityTracker0.clear();
        }
        long v = SystemClock.uptimeMillis();
        MotionEvent motionEvent0 = MotionEvent.obtain(v, v, 0, 0.0f, 0.0f, 0);
        this.H.addMovement(motionEvent0);
        motionEvent0.recycle();
        this.N = v;
        return true;
    }

    public final void c() {
        int v = this.e.getCount();
        this.a = v;
        ArrayList arrayList0 = this.b;
        boolean z = arrayList0.size() < this.w * 2 + 1 && arrayList0.size() < v;
        int v1 = this.f;
        boolean z1 = false;
        for(int v2 = 0; v2 < arrayList0.size(); ++v2) {
            d d0 = (d)arrayList0.get(v2);
            int v3 = this.e.getItemPosition(d0.a);
            if(v3 != -1) {
                if(v3 == -2) {
                    arrayList0.remove(v2);
                    --v2;
                    if(!z1) {
                        this.e.startUpdate(this);
                        z1 = true;
                    }
                    this.e.destroyItem(this, d0.b, d0.a);
                    int v4 = this.f;
                    if(v4 == d0.b) {
                        v1 = Math.max(0, Math.min(v4, v - 1));
                    }
                    z = true;
                }
                else {
                    int v5 = d0.b;
                    if(v5 != v3) {
                        if(v5 == this.f) {
                            v1 = v3;
                        }
                        d0.b = v3;
                        z = true;
                    }
                }
            }
        }
        if(z1) {
            this.e.finishUpdate(this);
        }
        Collections.sort(arrayList0, ViewPager.h0);
        if(z) {
            int v6 = this.getChildCount();
            for(int v7 = 0; v7 < v6; ++v7) {
                LayoutParams viewPager$LayoutParams0 = (LayoutParams)this.getChildAt(v7).getLayoutParams();
                if(!viewPager$LayoutParams0.isDecor) {
                    viewPager$LayoutParams0.a = 0.0f;
                }
            }
            this.t(v1, 0, false, true);
            this.requestLayout();
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
        return z && view0.canScrollHorizontally(-v);
    }

    @Override  // android.view.View
    public boolean canScrollHorizontally(int v) {
        if(this.e == null) {
            return false;
        }
        int v1 = this.getClientWidth();
        int v2 = this.getScrollX();
        return v >= 0 ? v > 0 && v2 < ((int)(((float)v1) * this.r)) : v2 > ((int)(((float)v1) * this.q));
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof LayoutParams && super.checkLayoutParams(viewGroup$LayoutParams0);
    }

    public void clearOnPageChangeListeners() {
        ArrayList arrayList0 = this.T;
        if(arrayList0 != null) {
            arrayList0.clear();
        }
    }

    @Override  // android.view.View
    public void computeScroll() {
        this.k = true;
        if(!this.j.isFinished() && this.j.computeScrollOffset()) {
            int v = this.getScrollX();
            int v1 = this.getScrollY();
            int v2 = this.j.getCurrX();
            int v3 = this.j.getCurrY();
            if(v != v2 || v1 != v3) {
                this.scrollTo(v2, v3);
                if(!this.m(v2)) {
                    this.j.abortAnimation();
                    this.scrollTo(0, v3);
                }
            }
            ViewCompat.postInvalidateOnAnimation(this);
            return;
        }
        this.b(true);
    }

    public final int d(float f, int v, int v1, int v2) {
        if(Math.abs(v2) <= this.K || Math.abs(v1) <= this.I) {
            v += (int)(f + (v < this.f ? 0.6f : 0.4f));
        }
        else if(v1 <= 0) {
            ++v;
        }
        ArrayList arrayList0 = this.b;
        if(arrayList0.size() > 0) {
            d d0 = (d)arrayList0.get(0);
            int v3 = Math.min(v, ((d)arrayList0.get(arrayList0.size() - 1)).b);
            return Math.max(d0.b, v3);
        }
        return v;
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.ViewGroup
    public boolean dispatchKeyEvent(KeyEvent keyEvent0) {
        return super.dispatchKeyEvent(keyEvent0) || this.executeKeyEvent(keyEvent0);
    }

    @Override  // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent0) {
        if(accessibilityEvent0.getEventType() == 0x1000) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent0);
        }
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.getChildAt(v1);
            if(view0.getVisibility() == 0) {
                d d0 = this.g(view0);
                if(d0 != null && d0.b == this.f && view0.dispatchPopulateAccessibilityEvent(accessibilityEvent0)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override  // android.view.View
    public void draw(Canvas canvas0) {
        super.draw(canvas0);
        int v = this.getOverScrollMode();
        boolean z = false;
        if(v == 0 || v == 1 && (this.e != null && this.e.getCount() > 1)) {
            if(!this.O.isFinished()) {
                int v1 = canvas0.save();
                int v2 = this.getHeight() - this.getPaddingTop() - this.getPaddingBottom();
                int v3 = this.getWidth();
                canvas0.rotate(270.0f);
                canvas0.translate(((float)(this.getPaddingTop() - v2)), this.q * ((float)v3));
                this.O.setSize(v2, v3);
                z = this.O.draw(canvas0);
                canvas0.restoreToCount(v1);
            }
            if(!this.P.isFinished()) {
                int v4 = canvas0.save();
                int v5 = this.getWidth();
                int v6 = this.getHeight();
                int v7 = this.getPaddingTop();
                int v8 = this.getPaddingBottom();
                canvas0.rotate(90.0f);
                canvas0.translate(((float)(-this.getPaddingTop())), -(this.r + 1.0f) * ((float)v5));
                this.P.setSize(v6 - v7 - v8, v5);
                z |= this.P.draw(canvas0);
                canvas0.restoreToCount(v4);
            }
        }
        else {
            this.O.finish();
            this.P.finish();
        }
        if(z) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    @Override  // android.view.ViewGroup
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable0 = this.n;
        if(drawable0 != null && drawable0.isStateful()) {
            drawable0.setState(this.getDrawableState());
        }
    }

    public final void e(int v) {
        OnPageChangeListener viewPager$OnPageChangeListener0 = this.U;
        if(viewPager$OnPageChangeListener0 != null) {
            viewPager$OnPageChangeListener0.onPageSelected(v);
        }
        ArrayList arrayList0 = this.T;
        if(arrayList0 != null) {
            int v1 = arrayList0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                OnPageChangeListener viewPager$OnPageChangeListener1 = (OnPageChangeListener)this.T.get(v2);
                if(viewPager$OnPageChangeListener1 != null) {
                    viewPager$OnPageChangeListener1.onPageSelected(v);
                }
            }
        }
        OnPageChangeListener viewPager$OnPageChangeListener2 = this.V;
        if(viewPager$OnPageChangeListener2 != null) {
            viewPager$OnPageChangeListener2.onPageSelected(v);
        }
    }

    public void endFakeDrag() {
        if(!this.M) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if(this.e != null) {
            VelocityTracker velocityTracker0 = this.H;
            velocityTracker0.computeCurrentVelocity(1000, ((float)this.J));
            int v = (int)velocityTracker0.getXVelocity(this.G);
            this.v = true;
            int v1 = this.getClientWidth();
            int v2 = this.getScrollX();
            d d0 = this.h();
            this.t(this.d((((float)v2) / ((float)v1) - d0.e) / d0.d, d0.b, v, ((int)(this.C - this.E))), v, true, true);
        }
        this.x = false;
        this.y = false;
        VelocityTracker velocityTracker1 = this.H;
        if(velocityTracker1 != null) {
            velocityTracker1.recycle();
            this.H = null;
        }
        this.M = false;
    }

    public boolean executeKeyEvent(@NonNull KeyEvent keyEvent0) {
        if(keyEvent0.getAction() == 0) {
            switch(keyEvent0.getKeyCode()) {
                case 21: {
                    if(!keyEvent0.hasModifiers(2)) {
                        return this.arrowScroll(17);
                    }
                    int v = this.f;
                    if(v > 0) {
                        this.setCurrentItem(v - 1, true);
                        return true;
                    }
                    break;
                }
                case 22: {
                    return keyEvent0.hasModifiers(2) ? this.l() : this.arrowScroll(66);
                }
                case 61: {
                    if(keyEvent0.hasNoModifiers()) {
                        return this.arrowScroll(2);
                    }
                    return keyEvent0.hasModifiers(1) ? this.arrowScroll(1) : false;
                }
                default: {
                    return false;
                }
            }
        }
        return false;
    }

    public final Rect f(View view0, Rect rect0) {
        if(rect0 == null) {
            rect0 = new Rect();
        }
        if(view0 == null) {
            rect0.set(0, 0, 0, 0);
            return rect0;
        }
        rect0.left = view0.getLeft();
        rect0.right = view0.getRight();
        rect0.top = view0.getTop();
        rect0.bottom = view0.getBottom();
        for(ViewParent viewParent0 = view0.getParent(); viewParent0 instanceof ViewGroup && viewParent0 != this; viewParent0 = ((ViewGroup)viewParent0).getParent()) {
            int v = rect0.left;
            rect0.left = ((ViewGroup)viewParent0).getLeft() + v;
            int v1 = rect0.right;
            rect0.right = ((ViewGroup)viewParent0).getRight() + v1;
            int v2 = rect0.top;
            rect0.top = ((ViewGroup)viewParent0).getTop() + v2;
            int v3 = rect0.bottom;
            rect0.bottom = ((ViewGroup)viewParent0).getBottom() + v3;
        }
        return rect0;
    }

    public void fakeDragBy(float f) {
        if(!this.M) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if(this.e == null) {
            return;
        }
        this.C += f;
        float f1 = ((float)this.getScrollX()) - f;
        float f2 = (float)this.getClientWidth();
        float f3 = this.q * f2;
        float f4 = this.r * f2;
        d d0 = (d)this.b.get(0);
        d d1 = (d)this.b.get(this.b.size() - 1);
        if(d0.b != 0) {
            f3 = d0.e * f2;
        }
        if(d1.b != this.e.getCount() - 1) {
            f4 = d1.e * f2;
        }
        if(f1 < f3) {
            f1 = f3;
        }
        else if(f1 > f4) {
            f1 = f4;
        }
        this.C = f1 - ((float)(((int)f1))) + this.C;
        this.scrollTo(((int)f1), this.getScrollY());
        this.m(((int)f1));
        long v = SystemClock.uptimeMillis();
        MotionEvent motionEvent0 = MotionEvent.obtain(this.N, v, 2, this.C, 0.0f, 0);
        this.H.addMovement(motionEvent0);
        motionEvent0.recycle();
    }

    public final d g(View view0) {
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = this.b;
            if(v >= arrayList0.size()) {
                break;
            }
            d d0 = (d)arrayList0.get(v);
            if(this.e.isViewFromObject(view0, d0.a)) {
                return d0;
            }
        }
        return null;
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return new LayoutParams(this.getContext(), attributeSet0);
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return this.generateDefaultLayoutParams();
    }

    @Nullable
    public PagerAdapter getAdapter() {
        return this.e;
    }

    @Override  // android.view.ViewGroup
    public int getChildDrawingOrder(int v, int v1) {
        if(this.c0 == 2) {
            v1 = v - 1 - v1;
        }
        return ((LayoutParams)((View)this.d0.get(v1)).getLayoutParams()).d;
    }

    private int getClientWidth() {
        return this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight();
    }

    public int getCurrentItem() {
        return this.f;
    }

    public int getOffscreenPageLimit() {
        return this.w;
    }

    public int getPageMargin() {
        return this.m;
    }

    public final d h() {
        d d2;
        int v = this.getClientWidth();
        float f = 0.0f;
        float f1 = v <= 0 ? 0.0f : ((float)this.getScrollX()) / ((float)v);
        float f2 = v <= 0 ? 0.0f : ((float)this.m) / ((float)v);
        int v1 = 0;
        boolean z = true;
        d d0 = null;
        int v2 = -1;
        float f3 = 0.0f;
        while(true) {
            ArrayList arrayList0 = this.b;
            if(v1 >= arrayList0.size()) {
                break;
            }
            d d1 = (d)arrayList0.get(v1);
            if(z || d1.b == v2 + 1) {
                d2 = d1;
            }
            else {
                this.c.e = f + f3 + f2;
                this.c.b = v2 + 1;
                this.c.d = 1.0f;
                --v1;
                d2 = this.c;
            }
            f = d2.e;
            float f4 = d2.d + f + f2;
            if(!z && f1 < f) {
                return d0;
            }
            if(f1 >= f4 && v1 != arrayList0.size() - 1) {
                ++v1;
                z = false;
                v2 = d2.b;
                f3 = d2.d;
                d0 = d2;
                continue;
            }
            return d2;
        }
        return d0;
    }

    public final d i(int v) {
        for(int v1 = 0; true; ++v1) {
            ArrayList arrayList0 = this.b;
            if(v1 >= arrayList0.size()) {
                break;
            }
            d d0 = (d)arrayList0.get(v1);
            if(d0.b == v) {
                return d0;
            }
        }
        return null;
    }

    public boolean isFakeDragging() {
        return this.M;
    }

    public final void j() {
        this.setWillNotDraw(false);
        this.setDescendantFocusability(0x40000);
        this.setFocusable(true);
        Context context0 = this.getContext();
        this.j = new Scroller(context0, ViewPager.i0);
        ViewConfiguration viewConfiguration0 = ViewConfiguration.get(context0);
        float f = context0.getResources().getDisplayMetrics().density;
        this.B = viewConfiguration0.getScaledPagingTouchSlop();
        this.I = (int)(400.0f * f);
        this.J = viewConfiguration0.getScaledMaximumFlingVelocity();
        this.O = new EdgeEffect(context0);
        this.P = new EdgeEffect(context0);
        this.K = (int)(25.0f * f);
        this.L = (int)(2.0f * f);
        this.z = (int)(f * 16.0f);
        ViewCompat.setAccessibilityDelegate(this, new com.google.android.material.internal.b(this, 4));
        if(ViewCompat.getImportantForAccessibility(this) == 0) {
            ViewCompat.setImportantForAccessibility(this, 1);
        }
        ViewCompat.setOnApplyWindowInsetsListener(this, new a7.b(this));
    }

    public final void k(MotionEvent motionEvent0) {
        int v = motionEvent0.getActionIndex();
        if(motionEvent0.getPointerId(v) == this.G) {
            int v1 = v == 0 ? 1 : 0;
            this.C = motionEvent0.getX(v1);
            this.G = motionEvent0.getPointerId(v1);
            VelocityTracker velocityTracker0 = this.H;
            if(velocityTracker0 != null) {
                velocityTracker0.clear();
            }
        }
    }

    public final boolean l() {
        if(this.e != null && this.f < this.e.getCount() - 1) {
            this.setCurrentItem(this.f + 1, true);
            return true;
        }
        return false;
    }

    public final boolean m(int v) {
        if(this.b.size() == 0) {
            if(this.Q) {
                return false;
            }
            this.R = false;
            this.onPageScrolled(0, 0.0f, 0);
            if(!this.R) {
                throw new IllegalStateException("onPageScrolled did not call superclass implementation");
            }
            return false;
        }
        d d0 = this.h();
        int v1 = this.getClientWidth();
        int v2 = v1 + this.m;
        int v3 = d0.b;
        float f = (((float)v) / ((float)v1) - d0.e) / (d0.d + ((float)this.m) / ((float)v1));
        this.R = false;
        this.onPageScrolled(v3, f, ((int)(((float)v2) * f)));
        if(!this.R) {
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        return true;
    }

    public final boolean n(float f) {
        boolean z2;
        boolean z1;
        float f1 = this.C - f;
        this.C = f;
        float f2 = ((float)this.getScrollX()) + f1;
        float f3 = (float)this.getClientWidth();
        float f4 = this.q * f3;
        float f5 = this.r * f3;
        boolean z = false;
        d d0 = (d)this.b.get(0);
        d d1 = (d)this.b.get(this.b.size() - 1);
        if(d0.b == 0) {
            z1 = true;
        }
        else {
            f4 = d0.e * f3;
            z1 = false;
        }
        if(d1.b == this.e.getCount() - 1) {
            z2 = true;
        }
        else {
            f5 = d1.e * f3;
            z2 = false;
        }
        if(f2 < f4) {
            if(z1) {
                this.O.onPull(Math.abs(f4 - f2) / f3);
                z = true;
            }
            f2 = f4;
        }
        else if(f2 > f5) {
            if(z2) {
                this.P.onPull(Math.abs(f2 - f5) / f3);
                z = true;
            }
            f2 = f5;
        }
        this.C = f2 - ((float)(((int)f2))) + this.C;
        this.scrollTo(((int)f2), this.getScrollY());
        this.m(((int)f2));
        return z;
    }

    public final void o() {
        this.p(this.f);
    }

    @Override  // android.view.ViewGroup
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Q = true;
    }

    @Override  // android.view.ViewGroup
    public void onDetachedFromWindow() {
        this.removeCallbacks(this.e0);
        if(this.j != null && !this.j.isFinished()) {
            this.j.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override  // android.view.View
    public void onDraw(Canvas canvas0) {
        float f3;
        ArrayList arrayList1;
        float f2;
        super.onDraw(canvas0);
        if(this.m > 0 && this.n != null) {
            ArrayList arrayList0 = this.b;
            if(arrayList0.size() > 0 && this.e != null) {
                int v = this.getScrollX();
                int v1 = this.getWidth();
                float f = ((float)this.m) / ((float)v1);
                int v2 = 0;
                d d0 = (d)arrayList0.get(0);
                float f1 = d0.e;
                int v3 = arrayList0.size();
                int v4 = d0.b;
                int v5 = ((d)arrayList0.get(v3 - 1)).b;
                while(v4 < v5) {
                    while(true) {
                        int v6 = d0.b;
                        if(v4 <= v6 || v2 >= v3) {
                            break;
                        }
                        ++v2;
                        d0 = (d)arrayList0.get(v2);
                    }
                    if(v4 == v6) {
                        f2 = (d0.e + d0.d) * ((float)v1);
                        f1 = d0.e + d0.d + f;
                    }
                    else {
                        f2 = (f1 + 1.0f) * ((float)v1);
                        f1 = f + 1.0f + f1;
                    }
                    if(((float)this.m) + f2 > ((float)v)) {
                        arrayList1 = arrayList0;
                        f3 = f;
                        this.n.setBounds(Math.round(f2), this.o, Math.round(((float)this.m) + f2), this.p);
                        this.n.draw(canvas0);
                    }
                    else {
                        arrayList1 = arrayList0;
                        f3 = f;
                    }
                    if(f2 > ((float)(v + v1))) {
                        break;
                    }
                    ++v4;
                    arrayList0 = arrayList1;
                    f = f3;
                }
            }
        }
    }

    @Override  // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        int v = motionEvent0.getAction();
        switch(v & 0xFF) {
            case 0: {
                break;
            }
            case 1: 
            case 3: {
                this.r();
                return false;
            label_5:
                if(this.x) {
                    return true;
                }
                if(this.y) {
                    return false;
                }
                break;
            }
            default: {
                goto label_5;
            }
        }
        switch(v & 0xFF) {
            case 0: {
                float f = motionEvent0.getX();
                this.E = f;
                this.C = f;
                float f1 = motionEvent0.getY();
                this.F = f1;
                this.D = f1;
                this.G = motionEvent0.getPointerId(0);
                this.y = false;
                this.k = true;
                this.j.computeScrollOffset();
                if(this.f0 != 2 || Math.abs(this.j.getFinalX() - this.j.getCurrX()) <= this.L) {
                    this.b(false);
                    this.x = false;
                }
                else {
                    this.j.abortAnimation();
                    this.v = false;
                    this.o();
                    this.x = true;
                    ViewParent viewParent0 = this.getParent();
                    if(viewParent0 != null) {
                        viewParent0.requestDisallowInterceptTouchEvent(true);
                    }
                    this.setScrollState(1);
                }
                break;
            }
            case 2: {
                int v1 = this.G;
                if(v1 != -1) {
                    int v2 = motionEvent0.findPointerIndex(v1);
                    float f2 = motionEvent0.getX(v2);
                    float f3 = f2 - this.C;
                    float f4 = Math.abs(f3);
                    float f5 = motionEvent0.getY(v2);
                    float f6 = Math.abs(f5 - this.F);
                    int v3 = Float.compare(f3, 0.0f);
                    if(v3 != 0 && ((this.C >= ((float)this.A) || v3 <= 0) && (this.C <= ((float)(this.getWidth() - this.A)) || f3 >= 0.0f) && this.canScroll(this, false, ((int)f3), ((int)f2), ((int)f5)))) {
                        this.C = f2;
                        this.D = f5;
                        this.y = true;
                        return false;
                    }
                    float f7 = (float)this.B;
                    if(f4 > f7 && f4 * 0.5f > f6) {
                        this.x = true;
                        ViewParent viewParent1 = this.getParent();
                        if(viewParent1 != null) {
                            viewParent1.requestDisallowInterceptTouchEvent(true);
                        }
                        this.setScrollState(1);
                        float f8 = (float)this.B;
                        this.C = v3 <= 0 ? this.E - f8 : this.E + f8;
                        this.D = f5;
                        this.setScrollingCacheEnabled(true);
                    }
                    else if(f6 > f7) {
                        this.y = true;
                    }
                    if(this.x && this.n(f2)) {
                        ViewCompat.postInvalidateOnAnimation(this);
                    }
                }
                break;
            }
            default: {
                if((v & 0xFF) == 6) {
                    this.k(motionEvent0);
                }
            }
        }
        if(this.H == null) {
            this.H = VelocityTracker.obtain();
        }
        this.H.addMovement(motionEvent0);
        return this.x;
    }

    @Override  // android.view.ViewGroup
    public void onLayout(boolean z, int v, int v1, int v2, int v3) {
        int v17;
        int v15;
        int v4 = this.getChildCount();
        int v5 = v2 - v;
        int v6 = v3 - v1;
        int v7 = this.getPaddingLeft();
        int v8 = this.getPaddingTop();
        int v9 = this.getPaddingRight();
        int v10 = this.getPaddingBottom();
        int v11 = this.getScrollX();
        int v13 = 0;
        for(int v12 = 0; v12 < v4; ++v12) {
            View view0 = this.getChildAt(v12);
            if(view0.getVisibility() != 8) {
                LayoutParams viewPager$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                if(viewPager$LayoutParams0.isDecor) {
                    int v14 = viewPager$LayoutParams0.gravity & 0x70;
                    switch(viewPager$LayoutParams0.gravity & 7) {
                        case 1: {
                            v15 = v7;
                            v7 = Math.max((v5 - view0.getMeasuredWidth()) / 2, v7);
                            break;
                        }
                        case 3: {
                            v15 = view0.getMeasuredWidth() + v7;
                            break;
                        }
                        case 5: {
                            int v16 = v5 - v9 - view0.getMeasuredWidth();
                            v9 += view0.getMeasuredWidth();
                            v15 = v7;
                            v7 = v16;
                            break;
                        }
                        default: {
                            v15 = v7;
                        }
                    }
                    switch(v14) {
                        case 16: {
                            v17 = v8;
                            v8 = Math.max((v6 - view0.getMeasuredHeight()) / 2, v8);
                            break;
                        }
                        case 0x30: {
                            v17 = view0.getMeasuredHeight() + v8;
                            break;
                        }
                        case 80: {
                            int v18 = v6 - v10 - view0.getMeasuredHeight();
                            v10 += view0.getMeasuredHeight();
                            v17 = v8;
                            v8 = v18;
                            break;
                        }
                        default: {
                            v17 = v8;
                        }
                    }
                    view0.layout(v7 + v11, v8, view0.getMeasuredWidth() + (v7 + v11), view0.getMeasuredHeight() + v8);
                    ++v13;
                    v8 = v17;
                    v7 = v15;
                }
            }
        }
        for(int v19 = 0; v19 < v4; ++v19) {
            View view1 = this.getChildAt(v19);
            if(view1.getVisibility() != 8) {
                LayoutParams viewPager$LayoutParams1 = (LayoutParams)view1.getLayoutParams();
                if(!viewPager$LayoutParams1.isDecor) {
                    d d0 = this.g(view1);
                    if(d0 != null) {
                        float f = (float)(v5 - v7 - v9);
                        int v20 = ((int)(d0.e * f)) + v7;
                        if(viewPager$LayoutParams1.b) {
                            viewPager$LayoutParams1.b = false;
                            view1.measure(View.MeasureSpec.makeMeasureSpec(((int)(f * viewPager$LayoutParams1.a)), 0x40000000), View.MeasureSpec.makeMeasureSpec(v6 - v8 - v10, 0x40000000));
                        }
                        view1.layout(v20, v8, view1.getMeasuredWidth() + v20, view1.getMeasuredHeight() + v8);
                    }
                }
            }
        }
        this.o = v8;
        this.p = v6 - v10;
        this.S = v13;
        if(this.Q) {
            this.s(this.f, 0, false, false);
        }
        this.Q = false;
    }

    @Override  // android.view.View
    public void onMeasure(int v, int v1) {
        int v11;
        this.setMeasuredDimension(View.getDefaultSize(0, v), View.getDefaultSize(0, v1));
        int v3 = this.getMeasuredWidth();
        this.A = Math.min(v3 / 10, this.z);
        int v4 = v3 - this.getPaddingLeft() - this.getPaddingRight();
        int v5 = this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom();
        int v6 = this.getChildCount();
        for(int v7 = 0; true; ++v7) {
            boolean z = true;
            int v8 = 0x40000000;
            if(v7 >= v6) {
                break;
            }
            View view0 = this.getChildAt(v7);
            if(view0.getVisibility() != 8) {
                LayoutParams viewPager$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                if(viewPager$LayoutParams0 != null && viewPager$LayoutParams0.isDecor) {
                    int v9 = viewPager$LayoutParams0.gravity & 7;
                    boolean z1 = (viewPager$LayoutParams0.gravity & 0x70) == 0x30 || (viewPager$LayoutParams0.gravity & 0x70) == 80;
                    if(v9 != 3 && v9 != 5) {
                        z = false;
                    }
                    int v10 = 0x80000000;
                    if(z1) {
                        v11 = 0x80000000;
                        v10 = 0x40000000;
                    }
                    else {
                        v11 = z ? 0x40000000 : 0x80000000;
                    }
                    int v12 = viewPager$LayoutParams0.width;
                    switch(v12) {
                        case -2: {
                            v12 = v4;
                            break;
                        }
                        case -1: {
                            v12 = v4;
                            v10 = 0x40000000;
                            break;
                        }
                        default: {
                            v10 = 0x40000000;
                        }
                    }
                    int v13 = viewPager$LayoutParams0.height;
                    switch(v13) {
                        case -2: {
                            v13 = v5;
                            v8 = v11;
                            break;
                        }
                        case -1: {
                            v13 = v5;
                        }
                    }
                    view0.measure(View.MeasureSpec.makeMeasureSpec(v12, v10), View.MeasureSpec.makeMeasureSpec(v13, v8));
                    if(z1) {
                        v5 -= view0.getMeasuredHeight();
                    }
                    else if(z) {
                        v4 -= view0.getMeasuredWidth();
                    }
                }
            }
        }
        View.MeasureSpec.makeMeasureSpec(v4, 0x40000000);
        this.s = View.MeasureSpec.makeMeasureSpec(v5, 0x40000000);
        this.t = true;
        this.o();
        this.t = false;
        int v14 = this.getChildCount();
        for(int v2 = 0; v2 < v14; ++v2) {
            View view1 = this.getChildAt(v2);
            if(view1.getVisibility() != 8) {
                LayoutParams viewPager$LayoutParams1 = (LayoutParams)view1.getLayoutParams();
                if(viewPager$LayoutParams1 == null || !viewPager$LayoutParams1.isDecor) {
                    view1.measure(View.MeasureSpec.makeMeasureSpec(((int)(((float)v4) * viewPager$LayoutParams1.a)), 0x40000000), this.s);
                }
            }
        }
    }

    @CallSuper
    public void onPageScrolled(int v, float f, int v1) {
        int v9;
        if(this.S > 0) {
            int v3 = this.getScrollX();
            int v4 = this.getPaddingLeft();
            int v5 = this.getPaddingRight();
            int v6 = this.getWidth();
            int v7 = this.getChildCount();
            for(int v8 = 0; v8 < v7; ++v8) {
                View view0 = this.getChildAt(v8);
                LayoutParams viewPager$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                if(viewPager$LayoutParams0.isDecor) {
                    switch(viewPager$LayoutParams0.gravity & 7) {
                        case 1: {
                            v9 = v4;
                            v4 = Math.max((v6 - view0.getMeasuredWidth()) / 2, v4);
                            break;
                        }
                        case 3: {
                            v9 = view0.getWidth() + v4;
                            break;
                        }
                        case 5: {
                            int v10 = v6 - v5 - view0.getMeasuredWidth();
                            v5 += view0.getMeasuredWidth();
                            v9 = v4;
                            v4 = v10;
                            break;
                        }
                        default: {
                            v9 = v4;
                        }
                    }
                    int v11 = v4 + v3 - view0.getLeft();
                    if(v11 != 0) {
                        view0.offsetLeftAndRight(v11);
                    }
                    v4 = v9;
                }
            }
        }
        OnPageChangeListener viewPager$OnPageChangeListener0 = this.U;
        if(viewPager$OnPageChangeListener0 != null) {
            viewPager$OnPageChangeListener0.onPageScrolled(v, f, v1);
        }
        ArrayList arrayList0 = this.T;
        if(arrayList0 != null) {
            int v12 = arrayList0.size();
            for(int v13 = 0; v13 < v12; ++v13) {
                OnPageChangeListener viewPager$OnPageChangeListener1 = (OnPageChangeListener)this.T.get(v13);
                if(viewPager$OnPageChangeListener1 != null) {
                    viewPager$OnPageChangeListener1.onPageScrolled(v, f, v1);
                }
            }
        }
        OnPageChangeListener viewPager$OnPageChangeListener2 = this.V;
        if(viewPager$OnPageChangeListener2 != null) {
            viewPager$OnPageChangeListener2.onPageScrolled(v, f, v1);
        }
        if(this.a0 != null) {
            int v14 = this.getScrollX();
            int v15 = this.getChildCount();
            for(int v2 = 0; v2 < v15; ++v2) {
                View view1 = this.getChildAt(v2);
                if(!((LayoutParams)view1.getLayoutParams()).isDecor) {
                    float f1 = ((float)(view1.getLeft() - v14)) / ((float)this.getClientWidth());
                    this.a0.transformPage(view1, f1);
                }
            }
        }
        this.R = true;
    }

    @Override  // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int v, Rect rect0) {
        int v4;
        int v3;
        int v2;
        int v1 = this.getChildCount();
        if((v & 2) == 0) {
            v3 = v1 - 1;
            v2 = -1;
            v4 = -1;
        }
        else {
            v2 = v1;
            v3 = 0;
            v4 = 1;
        }
        while(v3 != v2) {
            View view0 = this.getChildAt(v3);
            if(view0.getVisibility() == 0) {
                d d0 = this.g(view0);
                if(d0 != null && d0.b == this.f && view0.requestFocus(v, rect0)) {
                    return true;
                }
            }
            v3 += v4;
        }
        return false;
    }

    @Override  // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((SavedState)parcelable0).getSuperState());
        PagerAdapter pagerAdapter0 = this.e;
        ClassLoader classLoader0 = ((SavedState)parcelable0).d;
        if(pagerAdapter0 != null) {
            pagerAdapter0.restoreState(((SavedState)parcelable0).c, classLoader0);
            this.t(((SavedState)parcelable0).b, 0, false, true);
            return;
        }
        this.g = ((SavedState)parcelable0).b;
        this.h = ((SavedState)parcelable0).c;
        this.i = classLoader0;
    }

    @Override  // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new SavedState(super.onSaveInstanceState());
        parcelable0.b = this.f;
        PagerAdapter pagerAdapter0 = this.e;
        if(pagerAdapter0 != null) {
            parcelable0.c = pagerAdapter0.saveState();
        }
        return parcelable0;
    }

    @Override  // android.view.View
    public void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        if(v != v2) {
            this.q(v, v2, this.m, this.m);
        }
    }

    @Override  // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        boolean z = false;
        if(this.M) {
            return true;
        }
        if(motionEvent0.getAction() == 0 && motionEvent0.getEdgeFlags() != 0) {
            return false;
        }
        if(this.e != null && this.e.getCount() != 0) {
            if(this.H == null) {
                this.H = VelocityTracker.obtain();
            }
            this.H.addMovement(motionEvent0);
            int v = motionEvent0.getAction();
            switch(v & 0xFF) {
                case 0: {
                    this.j.abortAnimation();
                    this.v = false;
                    this.o();
                    float f3 = motionEvent0.getX();
                    this.E = f3;
                    this.C = f3;
                    float f4 = motionEvent0.getY();
                    this.F = f4;
                    this.D = f4;
                    this.G = motionEvent0.getPointerId(0);
                    break;
                }
                case 1: {
                    if(this.x) {
                        VelocityTracker velocityTracker0 = this.H;
                        velocityTracker0.computeCurrentVelocity(1000, ((float)this.J));
                        int v3 = (int)velocityTracker0.getXVelocity(this.G);
                        this.v = true;
                        int v4 = this.getClientWidth();
                        int v5 = this.getScrollX();
                        d d0 = this.h();
                        this.t(this.d((((float)v5) / ((float)v4) - d0.e) / (d0.d + ((float)this.m) / ((float)v4)), d0.b, v3, ((int)(motionEvent0.getX(motionEvent0.findPointerIndex(this.G)) - this.E))), v3, true, true);
                        z = this.r();
                    }
                    break;
                }
                default: {
                    switch(v & 0xFF) {
                        case 2: {
                            if(this.x) {
                            label_33:
                                if(this.x) {
                                    z = this.n(motionEvent0.getX(motionEvent0.findPointerIndex(this.G)));
                                }
                            }
                            else {
                                int v1 = motionEvent0.findPointerIndex(this.G);
                                if(v1 == -1) {
                                    z = this.r();
                                }
                                else {
                                    float f = motionEvent0.getX(v1);
                                    float f1 = Math.abs(f - this.C);
                                    float f2 = motionEvent0.getY(v1);
                                    if(f1 > ((float)this.B) && f1 > Math.abs(f2 - this.D)) {
                                        this.x = true;
                                        ViewParent viewParent0 = this.getParent();
                                        if(viewParent0 != null) {
                                            viewParent0.requestDisallowInterceptTouchEvent(true);
                                        }
                                        this.C = f - this.E > 0.0f ? this.E + ((float)this.B) : this.E - ((float)this.B);
                                        this.D = f2;
                                        this.setScrollState(1);
                                        this.setScrollingCacheEnabled(true);
                                        ViewParent viewParent1 = this.getParent();
                                        if(viewParent1 != null) {
                                            viewParent1.requestDisallowInterceptTouchEvent(true);
                                        }
                                    }
                                    goto label_33;
                                }
                            }
                            break;
                        }
                        case 3: {
                            if(this.x) {
                                this.s(this.f, 0, true, false);
                                z = this.r();
                            }
                            break;
                        }
                        case 5: {
                            int v2 = motionEvent0.getActionIndex();
                            this.C = motionEvent0.getX(v2);
                            this.G = motionEvent0.getPointerId(v2);
                            break;
                        }
                        case 6: {
                            this.k(motionEvent0);
                            this.C = motionEvent0.getX(motionEvent0.findPointerIndex(this.G));
                        }
                    }
                }
            }
            if(z) {
                ViewCompat.postInvalidateOnAnimation(this);
            }
            return true;
        }
        return false;
    }

    public final void p(int v) {
        String s;
        d d11;
        d d3;
        float f;
        d d1;
        ArrayList arrayList0;
        d d0;
        int v1 = this.f;
        if(v1 == v) {
            d0 = null;
        }
        else {
            d0 = this.i(v1);
            this.f = v;
        }
        if(this.e == null) {
            this.u();
            return;
        }
        if(this.v) {
            this.u();
            return;
        }
        if(this.getWindowToken() == null) {
            return;
        }
        this.e.startUpdate(this);
        int v2 = this.w;
        int v3 = Math.max(0, this.f - v2);
        int v4 = this.e.getCount();
        int v5 = Math.min(v4 - 1, this.f + v2);
        if(v4 == this.a) {
            int v6 = 0;
            while(true) {
                arrayList0 = this.b;
                if(v6 < arrayList0.size()) {
                    d1 = (d)arrayList0.get(v6);
                    int v7 = d1.b;
                    int v8 = this.f;
                    if(v7 < v8) {
                        ++v6;
                        continue;
                    }
                    else if(v7 == v8) {
                        break;
                    }
                }
                d1 = null;
                break;
            }
            if(d1 == null && v4 > 0) {
                d1 = this.a(this.f, v6);
            }
            if(d1 != null) {
                int v9 = v6 - 1;
                d d2 = v9 < 0 ? null : ((d)arrayList0.get(v9));
                int v10 = this.getClientWidth();
                if(v10 <= 0) {
                    f = 0.0f;
                }
                else {
                    float f1 = 2.0f - d1.d;
                    f = ((float)this.getPaddingLeft()) / ((float)v10) + f1;
                }
                int v11 = this.f - 1;
                float f2 = 0.0f;
                while(v11 >= 0) {
                    if(f2 < f || v11 >= v3) {
                        if(d2 == null || v11 != d2.b) {
                            f2 += this.a(v11, v9 + 1).d;
                            ++v6;
                            if(v9 >= 0) {
                                d3 = (d)arrayList0.get(v9);
                                goto label_71;
                            }
                        }
                        else {
                            f2 += d2.d;
                            --v9;
                            if(v9 >= 0) {
                                d3 = (d)arrayList0.get(v9);
                                goto label_71;
                            }
                        }
                        d3 = null;
                    label_71:
                        d2 = d3;
                    }
                    else {
                        if(d2 == null) {
                            break;
                        }
                        if(v11 == d2.b && !d2.c) {
                            arrayList0.remove(v9);
                            this.e.destroyItem(this, v11, d2.a);
                            --v9;
                            --v6;
                            d2 = v9 >= 0 ? ((d)arrayList0.get(v9)) : null;
                        }
                    }
                    --v11;
                }
                float f3 = d1.d;
                int v12 = v6 + 1;
                if(f3 < 2.0f) {
                    d d4 = v12 >= arrayList0.size() ? null : ((d)arrayList0.get(v12));
                    float f4 = v10 > 0 ? ((float)this.getPaddingRight()) / ((float)v10) + 2.0f : 0.0f;
                    int v13 = this.f + 1;
                    int v14 = v12;
                    while(v13 < v4) {
                        if(f3 < f4 || v13 <= v5) {
                        label_93:
                            if(d4 == null || v13 != d4.b) {
                                d d5 = this.a(v13, v14);
                                ++v14;
                                f3 += d5.d;
                                if(v14 < arrayList0.size()) {
                                    d4 = (d)arrayList0.get(v14);
                                    goto label_106;
                                }
                            }
                            else {
                                f3 += d4.d;
                                ++v14;
                                if(v14 < arrayList0.size()) {
                                    d4 = (d)arrayList0.get(v14);
                                    goto label_106;
                                }
                            }
                            d4 = null;
                        }
                        else {
                            if(d4 == null) {
                                break;
                            }
                            if(v13 == d4.b && !d4.c) {
                                arrayList0.remove(v14);
                                this.e.destroyItem(this, v13, d4.a);
                                if(v14 < arrayList0.size()) {
                                    d4 = (d)arrayList0.get(v14);
                                    goto label_106;
                                }
                                else {
                                    d4 = null;
                                    ++v13;
                                    continue;
                                }
                                goto label_93;
                            }
                        }
                    label_106:
                        ++v13;
                    }
                }
                int v15 = this.e.getCount();
                int v16 = this.getClientWidth();
                float f5 = v16 <= 0 ? 0.0f : ((float)this.m) / ((float)v16);
                if(d0 != null) {
                    int v17 = d0.b;
                    int v18 = d1.b;
                    if(v17 < v18) {
                        float f6 = d0.e + d0.d + f5;
                        int v19 = v17 + 1;
                        int v20 = 0;
                        while(v19 <= d1.b && v20 < arrayList0.size()) {
                            d d6;
                            for(d6 = (d)arrayList0.get(v20); v19 > d6.b && v20 < arrayList0.size() - 1; d6 = (d)arrayList0.get(v20)) {
                                ++v20;
                            }
                            while(v19 < d6.b) {
                                f6 += f5 + 1.0f;
                                ++v19;
                            }
                            d6.e = f6;
                            f6 += d6.d + f5;
                            ++v19;
                        }
                    }
                    else if(v17 > v18) {
                        int v21 = arrayList0.size() - 1;
                        float f7 = d0.e;
                        for(int v22 = v17 - 1; v22 >= d1.b && v21 >= 0; --v22) {
                            d d7;
                            for(d7 = (d)arrayList0.get(v21); v22 < d7.b && v21 > 0; d7 = (d)arrayList0.get(v21)) {
                                --v21;
                            }
                            while(v22 > d7.b) {
                                f7 -= f5 + 1.0f;
                                --v22;
                            }
                            f7 -= d7.d + f5;
                            d7.e = f7;
                        }
                    }
                }
                int v23 = arrayList0.size();
                float f8 = d1.e;
                int v24 = d1.b - 1;
                this.q = d1.b == 0 ? f8 : -3.402823E+38f;
                this.r = d1.b == v15 - 1 ? d1.d + f8 - 1.0f : 3.402823E+38f;
                int v25 = v6 - 1;
                while(v25 >= 0) {
                    d d8 = (d)arrayList0.get(v25);
                    while(true) {
                        int v26 = d8.b;
                        if(v24 <= v26) {
                            break;
                        }
                        f8 -= f5 + 1.0f;
                        --v24;
                    }
                    f8 -= d8.d + f5;
                    d8.e = f8;
                    if(v26 == 0) {
                        this.q = f8;
                    }
                    --v25;
                    --v24;
                }
                float f9 = d1.e + d1.d + f5;
                int v27 = d1.b;
                while(true) {
                    ++v27;
                    if(v12 >= v23) {
                        break;
                    }
                    d d9 = (d)arrayList0.get(v12);
                    while(true) {
                        int v28 = d9.b;
                        if(v27 >= v28) {
                            break;
                        }
                        f9 += f5 + 1.0f;
                        ++v27;
                    }
                    if(v28 == v15 - 1) {
                        this.r = d9.d + f9 - 1.0f;
                    }
                    d9.e = f9;
                    f9 += d9.d + f5;
                    ++v12;
                }
                this.e.setPrimaryItem(this, this.f, d1.a);
            }
            this.e.finishUpdate(this);
            int v29 = this.getChildCount();
            for(int v30 = 0; v30 < v29; ++v30) {
                View view0 = this.getChildAt(v30);
                LayoutParams viewPager$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                viewPager$LayoutParams0.d = v30;
                if(!viewPager$LayoutParams0.isDecor && viewPager$LayoutParams0.a == 0.0f) {
                    d d10 = this.g(view0);
                    if(d10 != null) {
                        viewPager$LayoutParams0.a = d10.d;
                        viewPager$LayoutParams0.c = d10.b;
                    }
                }
            }
            this.u();
            if(this.hasFocus()) {
                View view1 = this.findFocus();
                if(view1 == null) {
                label_213:
                    d11 = null;
                }
                else {
                    ViewParent viewParent0;
                    while((viewParent0 = view1.getParent()) != this) {
                        if(viewParent0 == null || !(viewParent0 instanceof View)) {
                            goto label_213;
                        }
                        view1 = (View)viewParent0;
                    }
                    d11 = this.g(view1);
                }
                if(d11 == null || d11.b != this.f) {
                    for(int v31 = 0; v31 < this.getChildCount(); ++v31) {
                        View view2 = this.getChildAt(v31);
                        d d12 = this.g(view2);
                        if(d12 != null && d12.b == this.f && view2.requestFocus(2)) {
                            break;
                        }
                    }
                }
            }
            return;
        }
        try {
            s = this.getResources().getResourceName(this.getId());
        }
        catch(Resources.NotFoundException unused_ex) {
            s = Integer.toHexString(this.getId());
        }
        StringBuilder stringBuilder0 = new StringBuilder("The application\'s PagerAdapter changed the adapter\'s contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
        r0.a.A(stringBuilder0, this.a, ", found: ", v4, " Pager id: ");
        stringBuilder0.append(s);
        stringBuilder0.append(" Pager class: ");
        stringBuilder0.append(this.getClass());
        stringBuilder0.append(" Problematic adapter: ");
        stringBuilder0.append(this.e.getClass());
        throw new IllegalStateException(stringBuilder0.toString());
    }

    public final void q(int v, int v1, int v2, int v3) {
        if(v1 > 0 && !this.b.isEmpty()) {
            if(!this.j.isFinished()) {
                this.j.setFinalX(this.getCurrentItem() * this.getClientWidth());
                return;
            }
            int v4 = this.getPaddingLeft();
            int v5 = this.getPaddingRight();
            int v6 = this.getPaddingLeft();
            int v7 = this.getPaddingRight();
            this.scrollTo(((int)(((float)this.getScrollX()) / ((float)(v1 - v6 - v7 + v3)) * ((float)(v - v4 - v5 + v2)))), this.getScrollY());
            return;
        }
        d d0 = this.i(this.f);
        int v8 = (int)((d0 == null ? 0.0f : Math.min(d0.e, this.r)) * ((float)(v - this.getPaddingLeft() - this.getPaddingRight())));
        if(v8 != this.getScrollX()) {
            this.b(false);
            this.scrollTo(v8, this.getScrollY());
        }
    }

    public final boolean r() {
        this.G = -1;
        this.x = false;
        this.y = false;
        VelocityTracker velocityTracker0 = this.H;
        if(velocityTracker0 != null) {
            velocityTracker0.recycle();
            this.H = null;
        }
        this.O.onRelease();
        this.P.onRelease();
        return this.O.isFinished() || this.P.isFinished();
    }

    public void removeOnAdapterChangeListener(@NonNull OnAdapterChangeListener viewPager$OnAdapterChangeListener0) {
        ArrayList arrayList0 = this.W;
        if(arrayList0 != null) {
            arrayList0.remove(viewPager$OnAdapterChangeListener0);
        }
    }

    public void removeOnPageChangeListener(@NonNull OnPageChangeListener viewPager$OnPageChangeListener0) {
        ArrayList arrayList0 = this.T;
        if(arrayList0 != null) {
            arrayList0.remove(viewPager$OnPageChangeListener0);
        }
    }

    @Override  // android.view.ViewGroup
    public void removeView(View view0) {
        if(this.t) {
            this.removeViewInLayout(view0);
            return;
        }
        super.removeView(view0);
    }

    public final void s(int v, int v1, boolean z, boolean z1) {
        int v3;
        int v2;
        d d0 = this.i(v);
        if(d0 == null) {
            v2 = 0;
        }
        else {
            float f = (float)this.getClientWidth();
            v2 = (int)(Math.max(this.q, Math.min(d0.e, this.r)) * f);
        }
        if(z) {
            if(this.getChildCount() == 0) {
                this.setScrollingCacheEnabled(false);
            }
            else {
                if(this.j == null || this.j.isFinished()) {
                    v3 = this.getScrollX();
                }
                else {
                    v3 = this.k ? this.j.getCurrX() : this.j.getStartX();
                    this.j.abortAnimation();
                    this.setScrollingCacheEnabled(false);
                }
                int v4 = this.getScrollY();
                int v5 = v2 - v3;
                if(v5 != 0 || -v4 != 0) {
                    this.setScrollingCacheEnabled(true);
                    this.setScrollState(2);
                    int v6 = this.getClientWidth();
                    int v7 = Math.abs(v1);
                    this.k = false;
                    this.j.startScroll(v3, v4, v5, -v4, Math.min((v7 <= 0 ? ((int)((((float)Math.abs(v5)) / (1.0f * ((float)v6) + ((float)this.m)) + 1.0f) * 100.0f)) : Math.round(Math.abs((((float)Math.sin((Math.min(1.0f, ((float)Math.abs(v5)) * 1.0f / ((float)v6)) - 0.5f) * 0.471239f)) * ((float)(v6 / 2)) + ((float)(v6 / 2))) / ((float)v7)) * 1000.0f) * 4), 600));
                    ViewCompat.postInvalidateOnAnimation(this);
                }
                else {
                    this.b(false);
                    this.o();
                    this.setScrollState(0);
                }
            }
            if(z1) {
                this.e(v);
            }
        }
        else {
            if(z1) {
                this.e(v);
            }
            this.b(false);
            this.scrollTo(v2, 0);
            this.m(v2);
        }
    }

    public void setAdapter(@Nullable PagerAdapter pagerAdapter0) {
        ArrayList arrayList0;
        PagerAdapter pagerAdapter1 = this.e;
        if(pagerAdapter1 != null) {
            synchronized(pagerAdapter1) {
                pagerAdapter1.b = null;
            }
            this.e.startUpdate(this);
            for(int v1 = 0; true; ++v1) {
                arrayList0 = this.b;
                if(v1 >= arrayList0.size()) {
                    break;
                }
                d d0 = (d)arrayList0.get(v1);
                this.e.destroyItem(this, d0.b, d0.a);
            }
            this.e.finishUpdate(this);
            arrayList0.clear();
            for(int v2 = 0; v2 < this.getChildCount(); ++v2) {
                if(!((LayoutParams)this.getChildAt(v2).getLayoutParams()).isDecor) {
                    this.removeViewAt(v2);
                    --v2;
                }
            }
            this.f = 0;
            this.scrollTo(0, 0);
        }
        PagerAdapter pagerAdapter2 = this.e;
        this.e = pagerAdapter0;
        this.a = 0;
        if(pagerAdapter0 != null) {
            if(this.l == null) {
                this.l = new y1(this, 1);
            }
            synchronized(this.e) {
                this.e.b = this.l;
            }
            this.v = false;
            boolean z = this.Q;
            this.Q = true;
            this.a = this.e.getCount();
            if(this.g >= 0) {
                this.e.restoreState(this.h, this.i);
                this.t(this.g, 0, false, true);
                this.g = -1;
                this.h = null;
                this.i = null;
            }
            else if(z) {
                this.requestLayout();
            }
            else {
                this.o();
            }
        }
        if(this.W != null && !this.W.isEmpty()) {
            int v3 = this.W.size();
            for(int v = 0; v < v3; ++v) {
                ((OnAdapterChangeListener)this.W.get(v)).onAdapterChanged(this, pagerAdapter2, pagerAdapter0);
            }
        }
    }

    public void setCurrentItem(int v) {
        this.v = false;
        this.t(v, 0, !this.Q, false);
    }

    public void setCurrentItem(int v, boolean z) {
        this.v = false;
        this.t(v, 0, z, false);
    }

    public void setOffscreenPageLimit(int v) {
        if(v < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + v + " too small; defaulting to 1");
            v = 1;
        }
        if(v != this.w) {
            this.w = v;
            this.o();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(OnPageChangeListener viewPager$OnPageChangeListener0) {
        this.U = viewPager$OnPageChangeListener0;
    }

    public void setPageMargin(int v) {
        int v1 = this.m;
        this.m = v;
        int v2 = this.getWidth();
        this.q(v2, v2, v, v1);
        this.requestLayout();
    }

    public void setPageMarginDrawable(@DrawableRes int v) {
        this.setPageMarginDrawable(ContextCompat.getDrawable(this.getContext(), v));
    }

    public void setPageMarginDrawable(@Nullable Drawable drawable0) {
        this.n = drawable0;
        if(drawable0 != null) {
            this.refreshDrawableState();
        }
        this.setWillNotDraw(drawable0 == null);
        this.invalidate();
    }

    public void setPageTransformer(boolean z, @Nullable PageTransformer viewPager$PageTransformer0) {
        this.setPageTransformer(z, viewPager$PageTransformer0, 2);
    }

    public void setPageTransformer(boolean z, @Nullable PageTransformer viewPager$PageTransformer0, int v) {
        int v1 = 1;
        boolean z1 = viewPager$PageTransformer0 != null != (this.a0 != null);
        this.a0 = viewPager$PageTransformer0;
        this.setChildrenDrawingOrderEnabled(viewPager$PageTransformer0 != null);
        if(viewPager$PageTransformer0 == null) {
            this.c0 = 0;
        }
        else {
            if(z) {
                v1 = 2;
            }
            this.c0 = v1;
            this.b0 = v;
        }
        if(z1) {
            this.o();
        }
    }

    public void setScrollState(int v) {
        if(this.f0 == v) {
            return;
        }
        this.f0 = v;
        if(this.a0 != null) {
            int v2 = this.getChildCount();
            for(int v3 = 0; v3 < v2; ++v3) {
                int v4 = v == 0 ? this.b0 : 0;
                this.getChildAt(v3).setLayerType(v4, null);
            }
        }
        OnPageChangeListener viewPager$OnPageChangeListener0 = this.U;
        if(viewPager$OnPageChangeListener0 != null) {
            viewPager$OnPageChangeListener0.onPageScrollStateChanged(v);
        }
        ArrayList arrayList0 = this.T;
        if(arrayList0 != null) {
            int v5 = arrayList0.size();
            for(int v1 = 0; v1 < v5; ++v1) {
                OnPageChangeListener viewPager$OnPageChangeListener1 = (OnPageChangeListener)this.T.get(v1);
                if(viewPager$OnPageChangeListener1 != null) {
                    viewPager$OnPageChangeListener1.onPageScrollStateChanged(v);
                }
            }
        }
        OnPageChangeListener viewPager$OnPageChangeListener2 = this.V;
        if(viewPager$OnPageChangeListener2 != null) {
            viewPager$OnPageChangeListener2.onPageScrollStateChanged(v);
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if(this.u != z) {
            this.u = z;
        }
    }

    public final void t(int v, int v1, boolean z, boolean z1) {
        boolean z2 = false;
        if(this.e != null && this.e.getCount() > 0) {
            ArrayList arrayList0 = this.b;
            if(!z1 && this.f == v && arrayList0.size() != 0) {
                this.setScrollingCacheEnabled(false);
                return;
            }
            if(v < 0) {
                v = 0;
            }
            else if(v >= this.e.getCount()) {
                v = this.e.getCount() - 1;
            }
            if(v > this.f + this.w || v < this.f - this.w) {
                for(int v2 = 0; v2 < arrayList0.size(); ++v2) {
                    ((d)arrayList0.get(v2)).c = true;
                }
            }
            if(this.f != v) {
                z2 = true;
            }
            if(this.Q) {
                this.f = v;
                if(z2) {
                    this.e(v);
                }
                this.requestLayout();
                return;
            }
            this.p(v);
            this.s(v, v1, z, z2);
            return;
        }
        this.setScrollingCacheEnabled(false);
    }

    public final void u() {
        if(this.c0 != 0) {
            ArrayList arrayList0 = this.d0;
            if(arrayList0 == null) {
                this.d0 = new ArrayList();
            }
            else {
                arrayList0.clear();
            }
            int v = this.getChildCount();
            for(int v1 = 0; v1 < v; ++v1) {
                View view0 = this.getChildAt(v1);
                this.d0.add(view0);
            }
            Collections.sort(this.d0, ViewPager.j0);
        }
    }

    @Override  // android.view.View
    public boolean verifyDrawable(Drawable drawable0) {
        return super.verifyDrawable(drawable0) || drawable0 == this.n;
    }
}

