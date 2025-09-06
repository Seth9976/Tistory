package androidx.drawerlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.Openable;
import androidx.customview.widget.ViewDragHelper;
import androidx.drawerlayout.R.attr;
import androidx.drawerlayout.R.dimen;
import androidx.drawerlayout.R.styleable;
import c4.c;
import c4.d;
import java.util.ArrayList;

public class DrawerLayout extends ViewGroup implements Openable {
    public interface DrawerListener {
        void onDrawerClosed(@NonNull View arg1);

        void onDrawerOpened(@NonNull View arg1);

        void onDrawerSlide(@NonNull View arg1, float arg2);

        void onDrawerStateChanged(int arg1);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public float a;
        public boolean b;
        public int c;
        public int gravity;

        public LayoutParams(int v, int v1) {
            super(v, v1);
            this.gravity = 0;
        }

        public LayoutParams(int v, int v1, int v2) {
            this(v, v1);
            this.gravity = v2;
        }

        public LayoutParams(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            this.gravity = 0;
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, DrawerLayout.M);
            this.gravity = typedArray0.getInt(0, 0);
            typedArray0.recycle();
        }

        public LayoutParams(@NonNull ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            super(viewGroup$LayoutParams0);
            this.gravity = 0;
        }

        public LayoutParams(@NonNull ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
            super(viewGroup$MarginLayoutParams0);
            this.gravity = 0;
        }

        public LayoutParams(@NonNull LayoutParams drawerLayout$LayoutParams0) {
            super(drawerLayout$LayoutParams0);
            this.gravity = drawerLayout$LayoutParams0.gravity;
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;

        static {
            SavedState.CREATOR = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        public SavedState(@NonNull Parcel parcel0, @Nullable ClassLoader classLoader0) {
            super(parcel0, classLoader0);
            this.b = parcel0.readInt();
            this.c = parcel0.readInt();
            this.d = parcel0.readInt();
            this.e = parcel0.readInt();
            this.f = parcel0.readInt();
        }

        public SavedState(@NonNull Parcelable parcelable0) {
            super(parcelable0);
            this.b = 0;
        }

        @Override  // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeInt(this.b);
            parcel0.writeInt(this.c);
            parcel0.writeInt(this.d);
            parcel0.writeInt(this.e);
            parcel0.writeInt(this.f);
        }
    }

    public static abstract class SimpleDrawerListener implements DrawerListener {
        @Override  // androidx.drawerlayout.widget.DrawerLayout$DrawerListener
        public void onDrawerClosed(View view0) {
        }

        @Override  // androidx.drawerlayout.widget.DrawerLayout$DrawerListener
        public void onDrawerOpened(View view0) {
        }

        @Override  // androidx.drawerlayout.widget.DrawerLayout$DrawerListener
        public void onDrawerSlide(View view0, float f) {
        }

        @Override  // androidx.drawerlayout.widget.DrawerLayout$DrawerListener
        public void onDrawerStateChanged(int v) {
        }
    }

    public CharSequence A;
    public Object B;
    public boolean C;
    public Drawable D;
    public Drawable E;
    public Drawable F;
    public Drawable G;
    public final ArrayList H;
    public Rect I;
    public Matrix J;
    public final c4.a K;
    public static final int[] L = null;
    public static final int LOCK_MODE_LOCKED_CLOSED = 1;
    public static final int LOCK_MODE_LOCKED_OPEN = 2;
    public static final int LOCK_MODE_UNDEFINED = 3;
    public static final int LOCK_MODE_UNLOCKED = 0;
    public static final int[] M = null;
    public static final boolean N = false;
    public static final boolean O = false;
    public static final boolean P = false;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    public final d a;
    public float b;
    public final int c;
    public int d;
    public float e;
    public final Paint f;
    public final ViewDragHelper g;
    public final ViewDragHelper h;
    public final b i;
    public final b j;
    public int k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public DrawerListener s;
    public ArrayList t;
    public float u;
    public float v;
    public Drawable w;
    public Drawable x;
    public Drawable y;
    public CharSequence z;

    static {
        DrawerLayout.L = new int[]{0x1010434};
        DrawerLayout.M = new int[]{0x10100B3};
        boolean z = true;
        DrawerLayout.N = true;
        DrawerLayout.O = true;
        if(Build.VERSION.SDK_INT < 29) {
            z = false;
        }
        DrawerLayout.P = z;
    }

    public DrawerLayout(@NonNull Context context0) {
        this(context0, null);
    }

    public DrawerLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.drawerLayoutStyle);
    }

    public DrawerLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.a = new d(0);
        this.d = 0x99000000;
        this.f = new Paint();
        this.m = true;
        this.n = 3;
        this.o = 3;
        this.p = 3;
        this.q = 3;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.K = new c4.a(this);
        this.setDescendantFocusability(0x40000);
        DisplayMetrics displayMetrics0 = this.getResources().getDisplayMetrics();
        this.c = (int)(64.0f * displayMetrics0.density + 0.5f);
        float f = displayMetrics0.density * 400.0f;
        b b0 = new b(this, 3);
        this.i = b0;
        b b1 = new b(this, 5);
        this.j = b1;
        ViewDragHelper viewDragHelper0 = ViewDragHelper.create(this, 1.0f, b0);
        this.g = viewDragHelper0;
        viewDragHelper0.setEdgeTrackingEnabled(1);
        viewDragHelper0.setMinVelocity(f);
        b0.b = viewDragHelper0;
        ViewDragHelper viewDragHelper1 = ViewDragHelper.create(this, 1.0f, b1);
        this.h = viewDragHelper1;
        viewDragHelper1.setEdgeTrackingEnabled(2);
        viewDragHelper1.setMinVelocity(f);
        b1.b = viewDragHelper1;
        this.setFocusableInTouchMode(true);
        ViewCompat.setImportantForAccessibility(this, 1);
        ViewCompat.setAccessibilityDelegate(this, new c(this));
        this.setMotionEventSplittingEnabled(false);
        if(ViewCompat.getFitsSystemWindows(this)) {
            this.setOnApplyWindowInsetsListener(new c4.b());  // 初始化器: Ljava/lang/Object;-><init>()V
            this.setSystemUiVisibility(0x500);
            TypedArray typedArray0 = context0.obtainStyledAttributes(DrawerLayout.L);
            try {
                this.w = typedArray0.getDrawable(0);
            }
            finally {
                typedArray0.recycle();
            }
        }
        TypedArray typedArray1 = context0.obtainStyledAttributes(attributeSet0, styleable.DrawerLayout, v, 0);
        try {
            this.b = typedArray1.hasValue(styleable.DrawerLayout_elevation) ? typedArray1.getDimension(styleable.DrawerLayout_elevation, 0.0f) : this.getResources().getDimension(dimen.def_drawer_elevation);
        }
        finally {
            typedArray1.recycle();
        }
        this.H = new ArrayList();
    }

    public final boolean a(int v, View view0) {
        return (this.f(view0) & v) == v;
    }

    public void addDrawerListener(@NonNull DrawerListener drawerLayout$DrawerListener0) {
        if(drawerLayout$DrawerListener0 == null) {
            return;
        }
        if(this.t == null) {
            this.t = new ArrayList();
        }
        this.t.add(drawerLayout$DrawerListener0);
    }

    @Override  // android.view.ViewGroup
    public void addFocusables(ArrayList arrayList0, int v, int v1) {
        ArrayList arrayList1;
        if(this.getDescendantFocusability() == 0x60000) {
            return;
        }
        int v2 = this.getChildCount();
        boolean z = false;
        for(int v4 = 0; true; ++v4) {
            arrayList1 = this.H;
            if(v4 >= v2) {
                break;
            }
            View view0 = this.getChildAt(v4);
            if(!DrawerLayout.j(view0)) {
                arrayList1.add(view0);
            }
            else if(this.isDrawerOpen(view0)) {
                view0.addFocusables(arrayList0, v, v1);
                z = true;
            }
        }
        if(!z) {
            int v5 = arrayList1.size();
            for(int v3 = 0; v3 < v5; ++v3) {
                View view1 = (View)arrayList1.get(v3);
                if(view1.getVisibility() == 0) {
                    view1.addFocusables(arrayList0, v, v1);
                }
            }
        }
        arrayList1.clear();
    }

    @Override  // android.view.ViewGroup
    public void addView(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        super.addView(view0, v, viewGroup$LayoutParams0);
        if(this.d() != null || DrawerLayout.j(view0)) {
            ViewCompat.setImportantForAccessibility(view0, 4);
        }
        else {
            ViewCompat.setImportantForAccessibility(view0, 1);
        }
        if(!DrawerLayout.N) {
            ViewCompat.setAccessibilityDelegate(view0, this.a);
        }
    }

    public final void b(boolean z) {
        boolean z2;
        int v = this.getChildCount();
        boolean z1 = false;
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.getChildAt(v1);
            LayoutParams drawerLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            if(DrawerLayout.j(view0) && (!z || drawerLayout$LayoutParams0.b)) {
                int v2 = view0.getWidth();
                if(this.a(3, view0)) {
                    int v3 = view0.getTop();
                    z2 = this.g.smoothSlideViewTo(view0, -v2, v3);
                }
                else {
                    int v4 = this.getWidth();
                    int v5 = view0.getTop();
                    z2 = this.h.smoothSlideViewTo(view0, v4, v5);
                }
                z1 |= z2;
                drawerLayout$LayoutParams0.b = false;
            }
        }
        this.i.d.removeCallbacks(this.i.c);
        this.j.d.removeCallbacks(this.j.c);
        if(z1) {
            this.invalidate();
        }
    }

    public final View c(int v) {
        int v1 = GravityCompat.getAbsoluteGravity(v, ViewCompat.getLayoutDirection(this));
        int v2 = this.getChildCount();
        for(int v3 = 0; v3 < v2; ++v3) {
            View view0 = this.getChildAt(v3);
            if((this.f(view0) & 7) == (v1 & 7)) {
                return view0;
            }
        }
        return null;
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof LayoutParams && super.checkLayoutParams(viewGroup$LayoutParams0);
    }

    @Override  // androidx.customview.widget.Openable
    public void close() {
        this.closeDrawer(0x800003);
    }

    public void closeDrawer(int v) {
        this.closeDrawer(v, true);
    }

    public void closeDrawer(int v, boolean z) {
        View view0 = this.c(v);
        if(view0 == null) {
            throw new IllegalArgumentException("No drawer view found with gravity " + DrawerLayout.g(v));
        }
        this.closeDrawer(view0, z);
    }

    public void closeDrawer(@NonNull View view0) {
        this.closeDrawer(view0, true);
    }

    public void closeDrawer(@NonNull View view0, boolean z) {
        if(!DrawerLayout.j(view0)) {
            throw new IllegalArgumentException("View " + view0 + " is not a sliding drawer");
        }
        LayoutParams drawerLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        if(this.m) {
            drawerLayout$LayoutParams0.a = 0.0f;
            drawerLayout$LayoutParams0.c = 0;
        }
        else if(z) {
            drawerLayout$LayoutParams0.c |= 4;
            if(this.a(3, view0)) {
                int v = view0.getWidth();
                int v1 = view0.getTop();
                this.g.smoothSlideViewTo(view0, -v, v1);
            }
            else {
                int v2 = this.getWidth();
                int v3 = view0.getTop();
                this.h.smoothSlideViewTo(view0, v2, v3);
            }
        }
        else {
            this.k(view0, 0.0f);
            this.p(0, view0);
            view0.setVisibility(4);
        }
        this.invalidate();
    }

    public void closeDrawers() {
        this.b(false);
    }

    @Override  // android.view.View
    public void computeScroll() {
        int v = this.getChildCount();
        float f = 0.0f;
        for(int v1 = 0; v1 < v; ++v1) {
            f = Math.max(f, ((LayoutParams)this.getChildAt(v1).getLayoutParams()).a);
        }
        this.e = f;
        if(this.g.continueSettling(true) || this.h.continueSettling(true)) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public final View d() {
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.getChildAt(v1);
            if((((LayoutParams)view0.getLayoutParams()).c & 1) == 1) {
                return view0;
            }
        }
        return null;
    }

    @Override  // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent0) {
        boolean z;
        if((motionEvent0.getSource() & 2) != 0 && motionEvent0.getAction() != 10 && this.e > 0.0f) {
            int v = this.getChildCount();
            if(v != 0) {
                float f = motionEvent0.getX();
                float f1 = motionEvent0.getY();
                for(int v1 = v - 1; v1 >= 0; --v1) {
                    View view0 = this.getChildAt(v1);
                    if(this.I == null) {
                        this.I = new Rect();
                    }
                    view0.getHitRect(this.I);
                    if(this.I.contains(((int)f), ((int)f1)) && !DrawerLayout.i(view0)) {
                        if(view0.getMatrix().isIdentity()) {
                            float f2 = (float)(this.getScrollX() - view0.getLeft());
                            float f3 = (float)(this.getScrollY() - view0.getTop());
                            motionEvent0.offsetLocation(f2, f3);
                            z = view0.dispatchGenericMotionEvent(motionEvent0);
                            motionEvent0.offsetLocation(-f2, -f3);
                        }
                        else {
                            int v2 = this.getScrollX();
                            int v3 = view0.getLeft();
                            int v4 = this.getScrollY();
                            int v5 = view0.getTop();
                            MotionEvent motionEvent1 = MotionEvent.obtain(motionEvent0);
                            motionEvent1.offsetLocation(((float)(v2 - v3)), ((float)(v4 - v5)));
                            Matrix matrix0 = view0.getMatrix();
                            if(!matrix0.isIdentity()) {
                                if(this.J == null) {
                                    this.J = new Matrix();
                                }
                                matrix0.invert(this.J);
                                motionEvent1.transform(this.J);
                            }
                            z = view0.dispatchGenericMotionEvent(motionEvent1);
                            motionEvent1.recycle();
                        }
                        if(z) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return super.dispatchGenericMotionEvent(motionEvent0);
    }

    @Override  // android.view.ViewGroup
    public boolean drawChild(Canvas canvas0, View view0, long v) {
        int v1 = this.getHeight();
        boolean z = DrawerLayout.i(view0);
        int v2 = this.getWidth();
        int v3 = canvas0.save();
        int v4 = 0;
        if(z) {
            int v5 = this.getChildCount();
            int v7 = 0;
            for(int v6 = 0; v6 < v5; ++v6) {
                View view1 = this.getChildAt(v6);
                if(view1 != view0 && view1.getVisibility() == 0) {
                    Drawable drawable0 = view1.getBackground();
                    if(drawable0 != null && drawable0.getOpacity() == -1 && DrawerLayout.j(view1) && view1.getHeight() >= v1) {
                        if(this.a(3, view1)) {
                            int v8 = view1.getRight();
                            if(v8 > v7) {
                                v7 = v8;
                            }
                        }
                        else {
                            int v9 = view1.getLeft();
                            if(v9 < v2) {
                                v2 = v9;
                            }
                        }
                    }
                }
            }
            canvas0.clipRect(v7, 0, v2, this.getHeight());
            v4 = v7;
        }
        boolean z1 = super.drawChild(canvas0, view0, v);
        canvas0.restoreToCount(v3);
        float f = this.e;
        if(f > 0.0f && z) {
            this.f.setColor(this.d & 0xFFFFFF | ((int)(((float)((0xFF000000 & this.d) >>> 24)) * f)) << 24);
            canvas0.drawRect(((float)v4), 0.0f, ((float)v2), ((float)this.getHeight()), this.f);
            return z1;
        }
        if(this.x != null && this.a(3, view0)) {
            int v10 = this.x.getIntrinsicWidth();
            int v11 = view0.getRight();
            this.x.setBounds(v11, view0.getTop(), v10 + v11, view0.getBottom());
            this.x.setAlpha(((int)(Math.max(0.0f, Math.min(((float)v11) / ((float)this.g.getEdgeSize()), 1.0f)) * 255.0f)));
            this.x.draw(canvas0);
            return z1;
        }
        if(this.y != null && this.a(5, view0)) {
            int v12 = this.y.getIntrinsicWidth();
            int v13 = view0.getLeft();
            float f1 = Math.max(0.0f, Math.min(((float)(this.getWidth() - v13)) / ((float)this.h.getEdgeSize()), 1.0f));
            this.y.setBounds(v13 - v12, view0.getTop(), v13, view0.getBottom());
            this.y.setAlpha(((int)(f1 * 255.0f)));
            this.y.draw(canvas0);
        }
        return z1;
    }

    public final View e() {
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.getChildAt(v1);
            if(DrawerLayout.j(view0) && this.isDrawerVisible(view0)) {
                return view0;
            }
        }
        return null;
    }

    public final int f(View view0) {
        return GravityCompat.getAbsoluteGravity(((LayoutParams)view0.getLayoutParams()).gravity, ViewCompat.getLayoutDirection(this));
    }

    public static String g(int v) {
        if((v & 3) == 3) {
            return "LEFT";
        }
        return (v & 5) == 5 ? "RIGHT" : Integer.toHexString(v);
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return new LayoutParams(this.getContext(), attributeSet0);
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(viewGroup$LayoutParams0 instanceof LayoutParams) {
            return new LayoutParams(((LayoutParams)viewGroup$LayoutParams0));
        }
        return viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams ? new LayoutParams(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0)) : new LayoutParams(viewGroup$LayoutParams0);
    }

    // 去混淆评级： 低(20)
    public float getDrawerElevation() {
        return DrawerLayout.O ? this.b : 0.0f;
    }

    public int getDrawerLockMode(int v) {
        int v1 = ViewCompat.getLayoutDirection(this);
        switch(v) {
            case 3: {
                int v2 = this.n;
                if(v2 != 3) {
                    return v2;
                }
                int v3 = v1 == 0 ? this.p : this.q;
                return v3 == 3 ? 0 : v3;
            }
            case 5: {
                int v4 = this.o;
                if(v4 != 3) {
                    return v4;
                }
                int v5 = v1 == 0 ? this.q : this.p;
                return v5 == 3 ? 0 : v5;
            }
            case 0x800003: {
                int v6 = this.p;
                if(v6 != 3) {
                    return v6;
                }
                int v7 = v1 == 0 ? this.n : this.o;
                return v7 == 3 ? 0 : v7;
            }
            case 0x800005: {
                int v8 = this.q;
                if(v8 != 3) {
                    return v8;
                }
                int v9 = v1 == 0 ? this.o : this.n;
                return v9 == 3 ? 0 : v9;
            }
            default: {
                return 0;
            }
        }
    }

    public int getDrawerLockMode(@NonNull View view0) {
        if(!DrawerLayout.j(view0)) {
            throw new IllegalArgumentException("View " + view0 + " is not a drawer");
        }
        return this.getDrawerLockMode(((LayoutParams)view0.getLayoutParams()).gravity);
    }

    @Nullable
    public CharSequence getDrawerTitle(int v) {
        int v1 = GravityCompat.getAbsoluteGravity(v, ViewCompat.getLayoutDirection(this));
        if(v1 == 3) {
            return this.z;
        }
        return v1 == 5 ? this.A : null;
    }

    @Nullable
    public Drawable getStatusBarBackgroundDrawable() {
        return this.w;
    }

    public static boolean h(View view0) {
        switch(ViewCompat.getImportantForAccessibility(view0)) {
            case 2: 
            case 4: {
                return false;
            }
            default: {
                return true;
            }
        }
    }

    public static boolean i(View view0) {
        return ((LayoutParams)view0.getLayoutParams()).gravity == 0;
    }

    public boolean isDrawerOpen(int v) {
        View view0 = this.c(v);
        return view0 == null ? false : this.isDrawerOpen(view0);
    }

    public boolean isDrawerOpen(@NonNull View view0) {
        if(!DrawerLayout.j(view0)) {
            throw new IllegalArgumentException("View " + view0 + " is not a drawer");
        }
        return (((LayoutParams)view0.getLayoutParams()).c & 1) == 1;
    }

    public boolean isDrawerVisible(int v) {
        View view0 = this.c(v);
        return view0 == null ? false : this.isDrawerVisible(view0);
    }

    public boolean isDrawerVisible(@NonNull View view0) {
        if(!DrawerLayout.j(view0)) {
            throw new IllegalArgumentException("View " + view0 + " is not a drawer");
        }
        return ((LayoutParams)view0.getLayoutParams()).a > 0.0f;
    }

    @Override  // androidx.customview.widget.Openable
    public boolean isOpen() {
        return this.isDrawerOpen(0x800003);
    }

    public static boolean j(View view0) {
        int v = GravityCompat.getAbsoluteGravity(((LayoutParams)view0.getLayoutParams()).gravity, ViewCompat.getLayoutDirection(view0));
        return (v & 3) == 0 ? (v & 5) != 0 : true;
    }

    public final void k(View view0, float f) {
        float f1 = ((LayoutParams)view0.getLayoutParams()).a;
        float f2 = (float)view0.getWidth();
        view0.offsetLeftAndRight((this.a(3, view0) ? ((int)(f2 * f)) - ((int)(f1 * f2)) : -(((int)(f2 * f)) - ((int)(f1 * f2)))));
        this.m(view0, f);
    }

    public final void l() {
        Drawable drawable4;
        Drawable drawable1;
        if(DrawerLayout.O) {
            return;
        }
        int v = ViewCompat.getLayoutDirection(this);
        if(v == 0) {
            Drawable drawable0 = this.D;
            if(drawable0 == null) {
                drawable1 = this.F;
            }
            else {
                if(DrawableCompat.isAutoMirrored(drawable0)) {
                    DrawableCompat.setLayoutDirection(drawable0, 0);
                }
                drawable1 = this.D;
            }
        }
        else {
            Drawable drawable2 = this.E;
            if(drawable2 == null) {
                drawable1 = this.F;
            }
            else {
                if(DrawableCompat.isAutoMirrored(drawable2)) {
                    DrawableCompat.setLayoutDirection(drawable2, v);
                }
                drawable1 = this.E;
            }
        }
        this.x = drawable1;
        int v1 = ViewCompat.getLayoutDirection(this);
        if(v1 == 0) {
            Drawable drawable3 = this.E;
            if(drawable3 == null) {
                drawable4 = this.G;
            }
            else {
                if(DrawableCompat.isAutoMirrored(drawable3)) {
                    DrawableCompat.setLayoutDirection(drawable3, 0);
                }
                drawable4 = this.E;
            }
        }
        else {
            Drawable drawable5 = this.D;
            if(drawable5 == null) {
                drawable4 = this.G;
            }
            else {
                if(DrawableCompat.isAutoMirrored(drawable5)) {
                    DrawableCompat.setLayoutDirection(drawable5, v1);
                }
                drawable4 = this.D;
            }
        }
        this.y = drawable4;
    }

    public final void m(View view0, float f) {
        LayoutParams drawerLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        if(f == drawerLayout$LayoutParams0.a) {
            return;
        }
        drawerLayout$LayoutParams0.a = f;
        ArrayList arrayList0 = this.t;
        if(arrayList0 != null) {
            for(int v = arrayList0.size() - 1; v >= 0; --v) {
                ((DrawerListener)this.t.get(v)).onDrawerSlide(view0, f);
            }
        }
    }

    public final void n(View view0) {
        AccessibilityActionCompat accessibilityNodeInfoCompat$AccessibilityActionCompat0 = AccessibilityActionCompat.ACTION_DISMISS;
        ViewCompat.removeAccessibilityAction(view0, accessibilityNodeInfoCompat$AccessibilityActionCompat0.getId());
        if(this.isDrawerOpen(view0) && this.getDrawerLockMode(view0) != 2) {
            ViewCompat.replaceAccessibilityAction(view0, accessibilityNodeInfoCompat$AccessibilityActionCompat0, null, this.K);
        }
    }

    public final void o(View view0, boolean z) {
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view1 = this.getChildAt(v1);
            if((z || DrawerLayout.j(view1)) && (!z || view1 != view0)) {
                ViewCompat.setImportantForAccessibility(view1, 4);
            }
            else {
                ViewCompat.setImportantForAccessibility(view1, 1);
            }
        }
    }

    @Override  // android.view.ViewGroup
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.m = true;
    }

    @Override  // android.view.ViewGroup
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.m = true;
    }

    @Override  // android.view.View
    public void onDraw(Canvas canvas0) {
        super.onDraw(canvas0);
        if(this.C && this.w != null) {
            int v = this.B == null ? 0 : ((WindowInsets)this.B).getSystemWindowInsetTop();
            if(v > 0) {
                this.w.setBounds(0, 0, this.getWidth(), v);
                this.w.draw(canvas0);
            }
        }
    }

    @Override  // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        boolean z2;
        int v = motionEvent0.getActionMasked();
        ViewDragHelper viewDragHelper0 = this.g;
        boolean z = viewDragHelper0.shouldInterceptTouchEvent(motionEvent0);
        boolean z1 = this.h.shouldInterceptTouchEvent(motionEvent0);
        switch(v) {
            case 0: {
                float f = motionEvent0.getX();
                float f1 = motionEvent0.getY();
                this.u = f;
                this.v = f1;
                if(this.e > 0.0f) {
                    View view0 = viewDragHelper0.findTopChildUnder(((int)f), ((int)f1));
                    z2 = view0 == null || !DrawerLayout.i(view0) ? false : true;
                }
                else {
                    z2 = false;
                }
                this.r = false;
                break;
            }
            case 2: {
                if(viewDragHelper0.checkTouchSlop(3)) {
                    this.i.d.removeCallbacks(this.i.c);
                    this.j.d.removeCallbacks(this.j.c);
                }
                z2 = false;
                break;
            }
            case 1: 
            case 3: {
                this.b(true);
                this.r = false;
                z2 = false;
                break;
            }
            default: {
                z2 = false;
            }
        }
        if(!z && !z1 && !z2) {
            int v1 = this.getChildCount();
            for(int v2 = 0; v2 < v1; ++v2) {
                if(((LayoutParams)this.getChildAt(v2).getLayoutParams()).b) {
                    return true;
                }
            }
            return this.r;
        }
        return true;
    }

    @Override  // android.view.View
    public boolean onKeyDown(int v, KeyEvent keyEvent0) {
        if(v == 4 && this.e() != null) {
            keyEvent0.startTracking();
            return true;
        }
        return super.onKeyDown(v, keyEvent0);
    }

    @Override  // android.view.View
    public boolean onKeyUp(int v, KeyEvent keyEvent0) {
        if(v == 4) {
            View view0 = this.e();
            if(view0 != null && this.getDrawerLockMode(view0) == 0) {
                this.closeDrawers();
            }
            return view0 != null;
        }
        return super.onKeyUp(v, keyEvent0);
    }

    @Override  // android.view.ViewGroup
    public void onLayout(boolean z, int v, int v1, int v2, int v3) {
        float f;
        int v13;
        this.l = true;
        int v4 = v2 - v;
        int v5 = this.getChildCount();
        for(int v6 = 0; v6 < v5; ++v6) {
            View view0 = this.getChildAt(v6);
            if(view0.getVisibility() != 8) {
                LayoutParams drawerLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                if(DrawerLayout.i(view0)) {
                    int v7 = drawerLayout$LayoutParams0.leftMargin;
                    int v8 = drawerLayout$LayoutParams0.topMargin;
                    int v9 = view0.getMeasuredWidth();
                    int v10 = drawerLayout$LayoutParams0.topMargin;
                    view0.layout(v7, v8, v9 + v7, view0.getMeasuredHeight() + v10);
                }
                else {
                    int v11 = view0.getMeasuredWidth();
                    int v12 = view0.getMeasuredHeight();
                    if(this.a(3, view0)) {
                        v13 = ((int)(drawerLayout$LayoutParams0.a * ((float)v11))) - v11;
                        f = ((float)(v11 + v13)) / ((float)v11);
                    }
                    else {
                        int v14 = v4 - ((int)(drawerLayout$LayoutParams0.a * ((float)v11)));
                        f = ((float)(v4 - v14)) / ((float)v11);
                        v13 = v14;
                    }
                    boolean z1 = f != drawerLayout$LayoutParams0.a;
                    switch(drawerLayout$LayoutParams0.gravity & 0x70) {
                        case 16: {
                            int v15 = v3 - v1;
                            int v16 = (v15 - v12) / 2;
                            int v17 = drawerLayout$LayoutParams0.topMargin;
                            if(v16 < v17) {
                                v16 = v17;
                            }
                            else {
                                int v18 = v15 - drawerLayout$LayoutParams0.bottomMargin;
                                if(v16 + v12 > v18) {
                                    v16 = v18 - v12;
                                }
                            }
                            view0.layout(v13, v16, v11 + v13, v12 + v16);
                            break;
                        }
                        case 80: {
                            view0.layout(v13, v3 - v1 - drawerLayout$LayoutParams0.bottomMargin - view0.getMeasuredHeight(), v11 + v13, v3 - v1 - drawerLayout$LayoutParams0.bottomMargin);
                            break;
                        }
                        default: {
                            view0.layout(v13, drawerLayout$LayoutParams0.topMargin, v11 + v13, v12 + drawerLayout$LayoutParams0.topMargin);
                        }
                    }
                    if(z1) {
                        this.m(view0, f);
                    }
                    int v19 = drawerLayout$LayoutParams0.a > 0.0f ? 0 : 4;
                    if(view0.getVisibility() != v19) {
                        view0.setVisibility(v19);
                    }
                }
            }
        }
        if(DrawerLayout.P) {
            WindowInsets windowInsets0 = this.getRootWindowInsets();
            if(windowInsets0 != null) {
                Insets insets0 = WindowInsetsCompat.toWindowInsetsCompat(windowInsets0).getSystemGestureInsets();
                this.g.setEdgeSize(Math.max(this.g.getDefaultEdgeSize(), insets0.left));
                this.h.setEdgeSize(Math.max(this.h.getDefaultEdgeSize(), insets0.right));
            }
        }
        this.l = false;
        this.m = false;
    }

    @Override  // android.view.View
    @SuppressLint({"WrongConstant"})
    public void onMeasure(int v, int v1) {
        int v2 = View.MeasureSpec.getMode(v);
        int v3 = View.MeasureSpec.getMode(v1);
        int v4 = View.MeasureSpec.getSize(v);
        int v5 = View.MeasureSpec.getSize(v1);
        if(v2 != 0x40000000 || v3 != 0x40000000) {
            if(!this.isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if(v2 == 0) {
                v4 = 300;
            }
            if(v3 == 0) {
                v5 = 300;
            }
        }
        this.setMeasuredDimension(v4, v5);
        boolean z = this.B != null && ViewCompat.getFitsSystemWindows(this);
        int v6 = ViewCompat.getLayoutDirection(this);
        int v7 = this.getChildCount();
        boolean z1 = false;
        boolean z2 = false;
        for(int v8 = 0; v8 < v7; ++v8) {
            View view0 = this.getChildAt(v8);
            if(view0.getVisibility() != 8) {
                LayoutParams drawerLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                if(z) {
                    int v9 = GravityCompat.getAbsoluteGravity(drawerLayout$LayoutParams0.gravity, v6);
                    if(ViewCompat.getFitsSystemWindows(view0)) {
                        WindowInsets windowInsets0 = (WindowInsets)this.B;
                        if(v9 == 3) {
                            windowInsets0 = windowInsets0.replaceSystemWindowInsets(windowInsets0.getSystemWindowInsetLeft(), windowInsets0.getSystemWindowInsetTop(), 0, windowInsets0.getSystemWindowInsetBottom());
                        }
                        else if(v9 == 5) {
                            windowInsets0 = windowInsets0.replaceSystemWindowInsets(0, windowInsets0.getSystemWindowInsetTop(), windowInsets0.getSystemWindowInsetRight(), windowInsets0.getSystemWindowInsetBottom());
                        }
                        view0.dispatchApplyWindowInsets(windowInsets0);
                    }
                    else {
                        WindowInsets windowInsets1 = (WindowInsets)this.B;
                        if(v9 == 3) {
                            windowInsets1 = windowInsets1.replaceSystemWindowInsets(windowInsets1.getSystemWindowInsetLeft(), windowInsets1.getSystemWindowInsetTop(), 0, windowInsets1.getSystemWindowInsetBottom());
                        }
                        else if(v9 == 5) {
                            windowInsets1 = windowInsets1.replaceSystemWindowInsets(0, windowInsets1.getSystemWindowInsetTop(), windowInsets1.getSystemWindowInsetRight(), windowInsets1.getSystemWindowInsetBottom());
                        }
                        drawerLayout$LayoutParams0.leftMargin = windowInsets1.getSystemWindowInsetLeft();
                        drawerLayout$LayoutParams0.topMargin = windowInsets1.getSystemWindowInsetTop();
                        drawerLayout$LayoutParams0.rightMargin = windowInsets1.getSystemWindowInsetRight();
                        drawerLayout$LayoutParams0.bottomMargin = windowInsets1.getSystemWindowInsetBottom();
                    }
                }
                if(DrawerLayout.i(view0)) {
                    view0.measure(View.MeasureSpec.makeMeasureSpec(v4 - drawerLayout$LayoutParams0.leftMargin - drawerLayout$LayoutParams0.rightMargin, 0x40000000), View.MeasureSpec.makeMeasureSpec(v5 - drawerLayout$LayoutParams0.topMargin - drawerLayout$LayoutParams0.bottomMargin, 0x40000000));
                }
                else {
                    if(!DrawerLayout.j(view0)) {
                        throw new IllegalStateException("Child " + view0 + " at index " + v8 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if(DrawerLayout.O) {
                        float f = ViewCompat.getElevation(view0);
                        float f1 = this.b;
                        if(f != f1) {
                            ViewCompat.setElevation(view0, f1);
                        }
                    }
                    int v10 = this.f(view0) & 7;
                    if(v10 == 3 && z1 || v10 != 3 && z2) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + DrawerLayout.g(v10) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    if(v10 == 3) {
                        z1 = true;
                    }
                    else {
                        z2 = true;
                    }
                    view0.measure(ViewGroup.getChildMeasureSpec(v, this.c + drawerLayout$LayoutParams0.leftMargin + drawerLayout$LayoutParams0.rightMargin, drawerLayout$LayoutParams0.width), ViewGroup.getChildMeasureSpec(v1, drawerLayout$LayoutParams0.topMargin + drawerLayout$LayoutParams0.bottomMargin, drawerLayout$LayoutParams0.height));
                    continue;
                }
            }
        }
    }

    @Override  // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((SavedState)parcelable0).getSuperState());
        int v = ((SavedState)parcelable0).b;
        if(v != 0) {
            View view0 = this.c(v);
            if(view0 != null) {
                this.openDrawer(view0);
            }
        }
        int v1 = ((SavedState)parcelable0).c;
        if(v1 != 3) {
            this.setDrawerLockMode(v1, 3);
        }
        int v2 = ((SavedState)parcelable0).d;
        if(v2 != 3) {
            this.setDrawerLockMode(v2, 5);
        }
        int v3 = ((SavedState)parcelable0).e;
        if(v3 != 3) {
            this.setDrawerLockMode(v3, 0x800003);
        }
        int v4 = ((SavedState)parcelable0).f;
        if(v4 != 3) {
            this.setDrawerLockMode(v4, 0x800005);
        }
    }

    @Override  // android.view.View
    public void onRtlPropertiesChanged(int v) {
        this.l();
    }

    @Override  // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new SavedState(super.onSaveInstanceState());
        int v = this.getChildCount();
        int v1 = 0;
        while(v1 < v) {
            LayoutParams drawerLayout$LayoutParams0 = (LayoutParams)this.getChildAt(v1).getLayoutParams();
            if(drawerLayout$LayoutParams0.c != 1 && drawerLayout$LayoutParams0.c != 2) {
                ++v1;
            }
            else {
                parcelable0.b = drawerLayout$LayoutParams0.gravity;
                if(true) {
                    break;
                }
            }
        }
        parcelable0.c = this.n;
        parcelable0.d = this.o;
        parcelable0.e = this.p;
        parcelable0.f = this.q;
        return parcelable0;
    }

    @Override  // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        ViewDragHelper viewDragHelper0 = this.g;
        viewDragHelper0.processTouchEvent(motionEvent0);
        this.h.processTouchEvent(motionEvent0);
        int v = motionEvent0.getAction();
        boolean z = false;
        switch(v & 0xFF) {
            case 0: {
                float f4 = motionEvent0.getX();
                float f5 = motionEvent0.getY();
                this.u = f4;
                this.v = f5;
                this.r = false;
                break;
            }
            case 1: {
                float f = motionEvent0.getX();
                float f1 = motionEvent0.getY();
                View view0 = viewDragHelper0.findTopChildUnder(((int)f), ((int)f1));
                if(view0 == null || !DrawerLayout.i(view0)) {
                    z = true;
                }
                else {
                    float f2 = f - this.u;
                    float f3 = f1 - this.v;
                    int v1 = viewDragHelper0.getTouchSlop();
                    if(f3 * f3 + f2 * f2 < ((float)(v1 * v1))) {
                        View view1 = this.d();
                        if(view1 == null || this.getDrawerLockMode(view1) == 2) {
                            z = true;
                        }
                    }
                    else {
                        z = true;
                    }
                }
                this.b(z);
                return true;
            label_24:
                if((v & 0xFF) == 3) {
                    this.b(true);
                    this.r = false;
                    return true;
                }
                break;
            }
            default: {
                goto label_24;
            }
        }
        return true;
    }

    @Override  // androidx.customview.widget.Openable
    public void open() {
        this.openDrawer(0x800003);
    }

    public void openDrawer(int v) {
        this.openDrawer(v, true);
    }

    public void openDrawer(int v, boolean z) {
        View view0 = this.c(v);
        if(view0 == null) {
            throw new IllegalArgumentException("No drawer view found with gravity " + DrawerLayout.g(v));
        }
        this.openDrawer(view0, z);
    }

    public void openDrawer(@NonNull View view0) {
        this.openDrawer(view0, true);
    }

    public void openDrawer(@NonNull View view0, boolean z) {
        if(!DrawerLayout.j(view0)) {
            throw new IllegalArgumentException("View " + view0 + " is not a sliding drawer");
        }
        LayoutParams drawerLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        if(this.m) {
            drawerLayout$LayoutParams0.a = 1.0f;
            drawerLayout$LayoutParams0.c = 1;
            this.o(view0, true);
            this.n(view0);
        }
        else if(z) {
            drawerLayout$LayoutParams0.c |= 2;
            if(this.a(3, view0)) {
                int v = view0.getTop();
                this.g.smoothSlideViewTo(view0, 0, v);
            }
            else {
                int v1 = this.getWidth();
                int v2 = view0.getWidth();
                int v3 = view0.getTop();
                this.h.smoothSlideViewTo(view0, v1 - v2, v3);
            }
        }
        else {
            this.k(view0, 1.0f);
            this.p(0, view0);
            view0.setVisibility(0);
        }
        this.invalidate();
    }

    public final void p(int v, View view0) {
        int v1 = 2;
        int v2 = this.g.getViewDragState();
        int v3 = this.h.getViewDragState();
        if(v2 == 1 || v3 == 1) {
            v1 = 1;
        }
        else if(v2 != 2 && v3 != 2) {
            v1 = 0;
        }
        if(view0 != null && v == 0) {
            float f = ((LayoutParams)view0.getLayoutParams()).a;
            if(Float.compare(f, 0.0f) == 0) {
                LayoutParams drawerLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                if((drawerLayout$LayoutParams0.c & 1) == 1) {
                    drawerLayout$LayoutParams0.c = 0;
                    ArrayList arrayList0 = this.t;
                    if(arrayList0 != null) {
                        for(int v4 = arrayList0.size() - 1; v4 >= 0; --v4) {
                            ((DrawerListener)this.t.get(v4)).onDrawerClosed(view0);
                        }
                    }
                    this.o(view0, false);
                    this.n(view0);
                    if(this.hasWindowFocus()) {
                        View view1 = this.getRootView();
                        if(view1 != null) {
                            view1.sendAccessibilityEvent(0x20);
                        }
                    }
                }
            }
            else if(f == 1.0f) {
                LayoutParams drawerLayout$LayoutParams1 = (LayoutParams)view0.getLayoutParams();
                if((drawerLayout$LayoutParams1.c & 1) == 0) {
                    drawerLayout$LayoutParams1.c = 1;
                    ArrayList arrayList1 = this.t;
                    if(arrayList1 != null) {
                        for(int v5 = arrayList1.size() - 1; v5 >= 0; --v5) {
                            ((DrawerListener)this.t.get(v5)).onDrawerOpened(view0);
                        }
                    }
                    this.o(view0, true);
                    this.n(view0);
                    if(this.hasWindowFocus()) {
                        this.sendAccessibilityEvent(0x20);
                    }
                }
            }
        }
        if(v1 != this.k) {
            this.k = v1;
            ArrayList arrayList2 = this.t;
            if(arrayList2 != null) {
                for(int v6 = arrayList2.size() - 1; v6 >= 0; --v6) {
                    ((DrawerListener)this.t.get(v6)).onDrawerStateChanged(v1);
                }
            }
        }
    }

    public void removeDrawerListener(@NonNull DrawerListener drawerLayout$DrawerListener0) {
        if(drawerLayout$DrawerListener0 == null) {
            return;
        }
        ArrayList arrayList0 = this.t;
        if(arrayList0 == null) {
            return;
        }
        arrayList0.remove(drawerLayout$DrawerListener0);
    }

    @Override  // android.view.ViewGroup
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if(z) {
            this.b(true);
        }
    }

    @Override  // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if(!this.l) {
            super.requestLayout();
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void setChildInsets(Object object0, boolean z) {
        this.B = object0;
        this.C = z;
        this.setWillNotDraw(!z && this.getBackground() == null);
        this.requestLayout();
    }

    public void setDrawerElevation(float f) {
        this.b = f;
        for(int v = 0; v < this.getChildCount(); ++v) {
            View view0 = this.getChildAt(v);
            if(DrawerLayout.j(view0)) {
                ViewCompat.setElevation(view0, this.b);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(DrawerListener drawerLayout$DrawerListener0) {
        DrawerListener drawerLayout$DrawerListener1 = this.s;
        if(drawerLayout$DrawerListener1 != null) {
            this.removeDrawerListener(drawerLayout$DrawerListener1);
        }
        if(drawerLayout$DrawerListener0 != null) {
            this.addDrawerListener(drawerLayout$DrawerListener0);
        }
        this.s = drawerLayout$DrawerListener0;
    }

    public void setDrawerLockMode(int v) {
        this.setDrawerLockMode(v, 3);
        this.setDrawerLockMode(v, 5);
    }

    public void setDrawerLockMode(int v, int v1) {
        int v2 = GravityCompat.getAbsoluteGravity(v1, ViewCompat.getLayoutDirection(this));
        switch(v1) {
            case 3: {
                this.n = v;
                break;
            }
            case 5: {
                this.o = v;
                break;
            }
            case 0x800003: {
                this.p = v;
                break;
            }
            case 0x800005: {
                this.q = v;
            }
        }
        if(v != 0) {
            (v2 == 3 ? this.g : this.h).cancel();
        }
        switch(v) {
            case 1: {
                View view0 = this.c(v2);
                if(view0 != null) {
                    this.closeDrawer(view0);
                    return;
                }
                break;
            }
            case 2: {
                View view1 = this.c(v2);
                if(view1 != null) {
                    this.openDrawer(view1);
                    return;
                }
                break;
            }
        }
    }

    public void setDrawerLockMode(int v, @NonNull View view0) {
        if(!DrawerLayout.j(view0)) {
            throw new IllegalArgumentException("View " + view0 + " is not a drawer with appropriate layout_gravity");
        }
        this.setDrawerLockMode(v, ((LayoutParams)view0.getLayoutParams()).gravity);
    }

    public void setDrawerShadow(@DrawableRes int v, int v1) {
        this.setDrawerShadow(ContextCompat.getDrawable(this.getContext(), v), v1);
    }

    public void setDrawerShadow(Drawable drawable0, int v) {
        if(DrawerLayout.O) {
            return;
        }
        if((v & 0x800003) == 0x800003) {
            this.D = drawable0;
            this.l();
            this.invalidate();
            return;
        }
        if((v & 0x800005) == 0x800005) {
            this.E = drawable0;
            this.l();
            this.invalidate();
            return;
        }
        if((v & 3) == 3) {
            this.F = drawable0;
            this.l();
            this.invalidate();
            return;
        }
        if((v & 5) == 5) {
            this.G = drawable0;
            this.l();
            this.invalidate();
        }
    }

    public void setDrawerTitle(int v, @Nullable CharSequence charSequence0) {
        int v1 = GravityCompat.getAbsoluteGravity(v, ViewCompat.getLayoutDirection(this));
        if(v1 == 3) {
            this.z = charSequence0;
            return;
        }
        if(v1 == 5) {
            this.A = charSequence0;
        }
    }

    public void setScrimColor(@ColorInt int v) {
        this.d = v;
        this.invalidate();
    }

    public void setStatusBarBackground(int v) {
        this.w = v == 0 ? null : ContextCompat.getDrawable(this.getContext(), v);
        this.invalidate();
    }

    public void setStatusBarBackground(@Nullable Drawable drawable0) {
        this.w = drawable0;
        this.invalidate();
    }

    public void setStatusBarBackgroundColor(@ColorInt int v) {
        this.w = new ColorDrawable(v);
        this.invalidate();
    }
}

