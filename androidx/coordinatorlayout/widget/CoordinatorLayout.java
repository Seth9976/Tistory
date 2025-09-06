package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.core.c;
import androidx.coordinatorlayout.R.attr;
import androidx.coordinatorlayout.R.style;
import androidx.coordinatorlayout.R.styleable;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.Pools.SynchronizedPool;
import androidx.core.view.GravityCompat;
import androidx.core.view.NestedScrollingParent2;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.floatingactionbutton.t;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import x1.h;

public class CoordinatorLayout extends ViewGroup implements NestedScrollingParent2, NestedScrollingParent3 {
    public interface AttachedBehavior {
        @NonNull
        Behavior getBehavior();
    }

    public static abstract class Behavior {
        public Behavior() {
        }

        public Behavior(Context context0, AttributeSet attributeSet0) {
        }

        public boolean blocksInteractionBelow(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0) {
            return false;
        }

        public boolean getInsetDodgeRect(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull Rect rect0) {
            return false;
        }

        @ColorInt
        public int getScrimColor(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0) [...] // Inlined contents

        @FloatRange(from = 0.0, to = 1.0)
        public float getScrimOpacity(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0) [...] // Inlined contents

        @Nullable
        public static Object getTag(@NonNull View view0) {
            return ((LayoutParams)view0.getLayoutParams()).m;
        }

        public boolean layoutDependsOn(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1) {
            return false;
        }

        @NonNull
        public WindowInsetsCompat onApplyWindowInsets(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull WindowInsetsCompat windowInsetsCompat0) [...] // Inlined contents

        public void onAttachedToLayoutParams(@NonNull LayoutParams coordinatorLayout$LayoutParams0) {
        }

        public boolean onDependentViewChanged(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1) {
            return false;
        }

        public void onDependentViewRemoved(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1) {
        }

        public void onDetachedFromLayoutParams() {
        }

        public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull MotionEvent motionEvent0) {
            return false;
        }

        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, int v) {
            return false;
        }

        public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, int v, int v1, int v2, int v3) {
            return false;
        }

        public boolean onNestedFling(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1, float f, float f1, boolean z) [...] // Inlined contents

        public boolean onNestedPreFling(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1, float f, float f1) {
            return false;
        }

        @Deprecated
        public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1, int v, int v1, @NonNull int[] arr_v) {
        }

        public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1, int v, int v1, @NonNull int[] arr_v, int v2) {
        }

        @Deprecated
        public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1, int v, int v1, int v2, int v3) {
        }

        @Deprecated
        public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1, int v, int v1, int v2, int v3, int v4) {
        }

        public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1, int v, int v1, int v2, int v3, int v4, @NonNull int[] arr_v) {
            arr_v[0] += v2;
            arr_v[1] += v3;
        }

        @Deprecated
        public void onNestedScrollAccepted(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1, @NonNull View view2, int v) {
        }

        public void onNestedScrollAccepted(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1, @NonNull View view2, int v, int v1) {
        }

        public boolean onRequestChildRectangleOnScreen(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull Rect rect0, boolean z) {
            return false;
        }

        public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull Parcelable parcelable0) {
        }

        @Nullable
        public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1, @NonNull View view2, int v) [...] // Inlined contents

        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1, @NonNull View view2, int v, int v1) {
            return false;
        }

        @Deprecated
        public void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1) {
        }

        public void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1, int v) {
        }

        public boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull MotionEvent motionEvent0) {
            return false;
        }

        public static void setTag(@NonNull View view0, @Nullable Object object0) {
            ((LayoutParams)view0.getLayoutParams()).m = object0;
        }
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    public @interface DefaultBehavior {
        Class value();
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface DispatchChangeEvent {
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public Behavior a;
        public int anchorGravity;
        public boolean b;
        public int c;
        public int d;
        public int dodgeInsetEdges;
        public int e;
        public View f;
        public View g;
        public int gravity;
        public boolean h;
        public boolean i;
        public int insetEdge;
        public boolean j;
        public boolean k;
        public int keyline;
        public final Rect l;
        public Object m;

        public LayoutParams(int v, int v1) {
            super(v, v1);
            this.b = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.c = -1;
            this.insetEdge = 0;
            this.dodgeInsetEdges = 0;
            this.l = new Rect();
        }

        public LayoutParams(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            Behavior coordinatorLayout$Behavior0;
            this.b = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.c = -1;
            this.insetEdge = 0;
            this.dodgeInsetEdges = 0;
            this.l = new Rect();
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.CoordinatorLayout_Layout);
            this.gravity = typedArray0.getInteger(styleable.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.c = typedArray0.getResourceId(styleable.CoordinatorLayout_Layout_layout_anchor, -1);
            this.anchorGravity = typedArray0.getInteger(styleable.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.keyline = typedArray0.getInteger(styleable.CoordinatorLayout_Layout_layout_keyline, -1);
            this.insetEdge = typedArray0.getInt(styleable.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.dodgeInsetEdges = typedArray0.getInt(styleable.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            boolean z = typedArray0.hasValue(styleable.CoordinatorLayout_Layout_layout_behavior);
            this.b = z;
            if(z) {
                String s = typedArray0.getString(styleable.CoordinatorLayout_Layout_layout_behavior);
                if(TextUtils.isEmpty(s)) {
                    coordinatorLayout$Behavior0 = null;
                }
                else {
                    if(s.startsWith(".")) {
                        s = "net.daum.android.tistoryapp" + s;
                    }
                    else if(s.indexOf(46) < 0) {
                        String s1 = CoordinatorLayout.u;
                        if(!TextUtils.isEmpty(s1)) {
                            s = s1 + '.' + s;
                        }
                    }
                    try {
                        ThreadLocal threadLocal0 = CoordinatorLayout.w;
                        Map map0 = (Map)threadLocal0.get();
                        if(map0 == null) {
                            map0 = new HashMap();
                            threadLocal0.set(map0);
                        }
                        Constructor constructor0 = (Constructor)map0.get(s);
                        if(constructor0 == null) {
                            constructor0 = Class.forName(s, false, context0.getClassLoader()).getConstructor(CoordinatorLayout.v);
                            constructor0.setAccessible(true);
                            map0.put(s, constructor0);
                        }
                        coordinatorLayout$Behavior0 = (Behavior)constructor0.newInstance(context0, attributeSet0);
                        goto label_44;
                    }
                    catch(Exception exception0) {
                    }
                    throw new RuntimeException("Could not inflate Behavior subclass " + s, exception0);
                }
            label_44:
                this.a = coordinatorLayout$Behavior0;
            }
            typedArray0.recycle();
            Behavior coordinatorLayout$Behavior1 = this.a;
            if(coordinatorLayout$Behavior1 != null) {
                coordinatorLayout$Behavior1.onAttachedToLayoutParams(this);
            }
        }

        public LayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            super(viewGroup$LayoutParams0);
            this.b = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.c = -1;
            this.insetEdge = 0;
            this.dodgeInsetEdges = 0;
            this.l = new Rect();
        }

        public LayoutParams(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
            super(viewGroup$MarginLayoutParams0);
            this.b = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.c = -1;
            this.insetEdge = 0;
            this.dodgeInsetEdges = 0;
            this.l = new Rect();
        }

        public LayoutParams(LayoutParams coordinatorLayout$LayoutParams0) {
            super(coordinatorLayout$LayoutParams0);
            this.b = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.c = -1;
            this.insetEdge = 0;
            this.dodgeInsetEdges = 0;
            this.l = new Rect();
        }

        public final boolean a(int v) {
            switch(v) {
                case 0: {
                    return this.i;
                }
                case 1: {
                    return this.j;
                }
                default: {
                    return false;
                }
            }
        }

        @IdRes
        public int getAnchorId() {
            return this.c;
        }

        @Nullable
        public Behavior getBehavior() {
            return this.a;
        }

        public void setAnchorId(@IdRes int v) {
            this.g = null;
            this.f = null;
            this.c = v;
        }

        public void setBehavior(@Nullable Behavior coordinatorLayout$Behavior0) {
            Behavior coordinatorLayout$Behavior1 = this.a;
            if(coordinatorLayout$Behavior1 != coordinatorLayout$Behavior0) {
                if(coordinatorLayout$Behavior1 != null) {
                    coordinatorLayout$Behavior1.onDetachedFromLayoutParams();
                }
                this.a = coordinatorLayout$Behavior0;
                this.m = null;
                this.b = true;
                if(coordinatorLayout$Behavior0 != null) {
                    coordinatorLayout$Behavior0.onAttachedToLayoutParams(this);
                }
            }
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR;
        public SparseArray b;

        static {
            SavedState.CREATOR = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        public SavedState(Parcel parcel0, ClassLoader classLoader0) {
            super(parcel0, classLoader0);
            int v = parcel0.readInt();
            int[] arr_v = new int[v];
            parcel0.readIntArray(arr_v);
            Parcelable[] arr_parcelable = parcel0.readParcelableArray(classLoader0);
            this.b = new SparseArray(v);
            for(int v1 = 0; v1 < v; ++v1) {
                this.b.append(arr_v[v1], arr_parcelable[v1]);
            }
        }

        public SavedState(Parcelable parcelable0) {
            super(parcelable0);
        }

        @Override  // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            int v2 = this.b == null ? 0 : this.b.size();
            parcel0.writeInt(v2);
            int[] arr_v = new int[v2];
            Parcelable[] arr_parcelable = new Parcelable[v2];
            for(int v1 = 0; v1 < v2; ++v1) {
                arr_v[v1] = this.b.keyAt(v1);
                arr_parcelable[v1] = (Parcelable)this.b.valueAt(v1);
            }
            parcel0.writeIntArray(arr_v);
            parcel0.writeParcelableArray(arr_parcelable, v);
        }
    }

    public final ArrayList a;
    public final DirectedAcyclicGraph b;
    public final ArrayList c;
    public final ArrayList d;
    public Paint e;
    public final int[] f;
    public final int[] g;
    public boolean h;
    public boolean i;
    public final int[] j;
    public View k;
    public View l;
    public t m;
    public boolean n;
    public WindowInsetsCompat o;
    public boolean p;
    public Drawable q;
    public ViewGroup.OnHierarchyChangeListener r;
    public h s;
    public final NestedScrollingParentHelper t;
    public static final String u;
    public static final Class[] v;
    public static final ThreadLocal w;
    public static final c x;
    public static final SynchronizedPool y;

    static {
        Package package0 = CoordinatorLayout.class.getPackage();
        CoordinatorLayout.u = package0 == null ? null : package0.getName();
        CoordinatorLayout.x = new c(12);
        CoordinatorLayout.v = new Class[]{Context.class, AttributeSet.class};
        CoordinatorLayout.w = new ThreadLocal();
        CoordinatorLayout.y = new SynchronizedPool(12);
    }

    public CoordinatorLayout(@NonNull Context context0) {
        this(context0, null);
    }

    public CoordinatorLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0, @AttrRes int v) {
        super(context0, attributeSet0, v);
        this.a = new ArrayList();
        this.b = new DirectedAcyclicGraph();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.f = new int[2];
        this.g = new int[2];
        this.t = new NestedScrollingParentHelper(this);
        TypedArray typedArray0 = v == 0 ? context0.obtainStyledAttributes(attributeSet0, styleable.CoordinatorLayout, 0, style.Widget_Support_CoordinatorLayout) : context0.obtainStyledAttributes(attributeSet0, styleable.CoordinatorLayout, v, 0);
        if(Build.VERSION.SDK_INT >= 29) {
            if(v == 0) {
                s1.c.r(this, context0, styleable.CoordinatorLayout, attributeSet0, typedArray0, style.Widget_Support_CoordinatorLayout);
            }
            else {
                s1.c.z(this, context0, styleable.CoordinatorLayout, attributeSet0, typedArray0, v);
            }
        }
        int v2 = typedArray0.getResourceId(styleable.CoordinatorLayout_keylines, 0);
        if(v2 != 0) {
            Resources resources0 = context0.getResources();
            int[] arr_v = resources0.getIntArray(v2);
            this.j = arr_v;
            float f = resources0.getDisplayMetrics().density;
            for(int v1 = 0; v1 < arr_v.length; ++v1) {
                this.j[v1] = (int)(((float)this.j[v1]) * f);
            }
        }
        this.q = typedArray0.getDrawable(styleable.CoordinatorLayout_statusBarBackground);
        typedArray0.recycle();
        this.m();
        super.setOnHierarchyChangeListener(new k6.a(this, 1));
        if(ViewCompat.getImportantForAccessibility(this) == 0) {
            ViewCompat.setImportantForAccessibility(this, 1);
        }
    }

    public static Rect a() {
        Rect rect0 = (Rect)CoordinatorLayout.y.acquire();
        return rect0 == null ? new Rect() : rect0;
    }

    public final void b(LayoutParams coordinatorLayout$LayoutParams0, Rect rect0, int v, int v1) {
        int v2 = this.getWidth();
        int v3 = this.getHeight();
        int v4 = Math.max(this.getPaddingLeft() + coordinatorLayout$LayoutParams0.leftMargin, Math.min(rect0.left, v2 - this.getPaddingRight() - v - coordinatorLayout$LayoutParams0.rightMargin));
        int v5 = Math.max(this.getPaddingTop() + coordinatorLayout$LayoutParams0.topMargin, Math.min(rect0.top, v3 - this.getPaddingBottom() - v1 - coordinatorLayout$LayoutParams0.bottomMargin));
        rect0.set(v4, v5, v + v4, v1 + v5);
    }

    public final void c(View view0, Rect rect0, boolean z) {
        if(!view0.isLayoutRequested() && view0.getVisibility() != 8) {
            if(z) {
                ViewGroupUtils.getDescendantRect(this, view0, rect0);
                return;
            }
            rect0.set(view0.getLeft(), view0.getTop(), view0.getRight(), view0.getBottom());
            return;
        }
        rect0.setEmpty();
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof LayoutParams && super.checkLayoutParams(viewGroup$LayoutParams0);
    }

    public static void d(int v, Rect rect0, Rect rect1, LayoutParams coordinatorLayout$LayoutParams0, int v1, int v2) {
        int v7;
        int v6;
        int v3 = GravityCompat.getAbsoluteGravity((coordinatorLayout$LayoutParams0.gravity == 0 ? 17 : coordinatorLayout$LayoutParams0.gravity), v);
        int v4 = (coordinatorLayout$LayoutParams0.anchorGravity & 7) == 0 ? coordinatorLayout$LayoutParams0.anchorGravity | 0x800003 : coordinatorLayout$LayoutParams0.anchorGravity;
        if((v4 & 0x70) == 0) {
            v4 |= 0x30;
        }
        int v5 = GravityCompat.getAbsoluteGravity(v4, v);
        switch(v5 & 7) {
            case 1: {
                v6 = rect0.left + rect0.width() / 2;
                break;
            }
            case 5: {
                v6 = rect0.right;
                break;
            }
            default: {
                v6 = rect0.left;
            }
        }
        switch(v5 & 0x70) {
            case 16: {
                v7 = rect0.top + rect0.height() / 2;
                break;
            }
            case 80: {
                v7 = rect0.bottom;
                break;
            }
            default: {
                v7 = rect0.top;
            }
        }
        if((v3 & 7) == 1) {
            v6 -= v1 / 2;
        }
        else if((v3 & 7) != 5) {
            v6 -= v1;
        }
        if((v3 & 0x70) == 16) {
            v7 -= v2 / 2;
        }
        else if((v3 & 0x70) != 80) {
            v7 -= v2;
        }
        rect1.set(v6, v7, v1 + v6, v2 + v7);
    }

    public void dispatchDependentViewsChanged(@NonNull View view0) {
        List list0 = this.b.getIncomingEdges(view0);
        if(list0 != null && !list0.isEmpty()) {
            for(int v = 0; v < list0.size(); ++v) {
                View view1 = (View)list0.get(v);
                Behavior coordinatorLayout$Behavior0 = ((LayoutParams)view1.getLayoutParams()).getBehavior();
                if(coordinatorLayout$Behavior0 != null) {
                    coordinatorLayout$Behavior0.onDependentViewChanged(this, view1, view0);
                }
            }
        }
    }

    public boolean doViewsOverlap(@NonNull View view0, @NonNull View view1) {
        SynchronizedPool pools$SynchronizedPool0 = CoordinatorLayout.y;
        boolean z = false;
        if(view0.getVisibility() == 0 && view1.getVisibility() == 0) {
            Rect rect0 = CoordinatorLayout.a();
            this.c(view0, rect0, view0.getParent() != this);
            Rect rect1 = CoordinatorLayout.a();
            this.c(view1, rect1, view1.getParent() != this);
            if(rect0.left <= rect1.right && rect0.top <= rect1.bottom && rect0.right >= rect1.left && rect0.bottom >= rect1.top) {
                z = true;
            }
            rect0.setEmpty();
            pools$SynchronizedPool0.release(rect0);
            rect1.setEmpty();
            pools$SynchronizedPool0.release(rect1);
            return z;
        }
        return false;
    }

    @Override  // android.view.ViewGroup
    public boolean drawChild(Canvas canvas0, View view0, long v) {
        boolean z = ((LayoutParams)view0.getLayoutParams()).a == null;
        return super.drawChild(canvas0, view0, v);
    }

    @Override  // android.view.ViewGroup
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] arr_v = this.getDrawableState();
        Drawable drawable0 = this.q;
        if((drawable0 == null || !drawable0.isStateful() ? false : drawable0.setState(arr_v))) {
            this.invalidate();
        }
    }

    public final int e(int v) {
        int[] arr_v = this.j;
        if(arr_v == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + v);
            return 0;
        }
        if(v >= 0 && v < arr_v.length) {
            return arr_v[v];
        }
        Log.e("CoordinatorLayout", "Keyline index " + v + " out of range for " + this);
        return 0;
    }

    public static LayoutParams f(View view0) {
        LayoutParams coordinatorLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        if(!coordinatorLayout$LayoutParams0.b) {
            if(view0 instanceof AttachedBehavior) {
                Behavior coordinatorLayout$Behavior0 = ((AttachedBehavior)view0).getBehavior();
                if(coordinatorLayout$Behavior0 == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                coordinatorLayout$LayoutParams0.setBehavior(coordinatorLayout$Behavior0);
                coordinatorLayout$LayoutParams0.b = true;
                return coordinatorLayout$LayoutParams0;
            }
            Class class0 = view0.getClass();
            DefaultBehavior coordinatorLayout$DefaultBehavior0 = null;
            while(class0 != null) {
                coordinatorLayout$DefaultBehavior0 = (DefaultBehavior)class0.getAnnotation(DefaultBehavior.class);
                if(coordinatorLayout$DefaultBehavior0 != null) {
                    break;
                }
                class0 = class0.getSuperclass();
            }
            if(coordinatorLayout$DefaultBehavior0 != null) {
                try {
                    coordinatorLayout$LayoutParams0.setBehavior(((Behavior)coordinatorLayout$DefaultBehavior0.value().getDeclaredConstructor(null).newInstance(null)));
                }
                catch(Exception exception0) {
                    Log.e("CoordinatorLayout", "Default behavior class " + coordinatorLayout$DefaultBehavior0.value().getName() + " could not be instantiated. Did you forget a default constructor?", exception0);
                }
            }
            coordinatorLayout$LayoutParams0.b = true;
        }
        return coordinatorLayout$LayoutParams0;
    }

    public final void g(int v) {
        int v5;
        Rect rect3;
        int v4;
        ArrayList arrayList1;
        boolean z2;
        int v27;
        int v24;
        boolean z1;
        boolean z;
        int v13;
        LayoutParams coordinatorLayout$LayoutParams3;
        SynchronizedPool pools$SynchronizedPool1;
        Rect rect7;
        View view2;
        LayoutParams coordinatorLayout$LayoutParams2;
        int v11;
        int v9;
        int v7;
        ArrayList arrayList2;
        SynchronizedPool pools$SynchronizedPool0;
        int v1 = ViewCompat.getLayoutDirection(this);
        ArrayList arrayList0 = this.a;
        int v2 = arrayList0.size();
        Rect rect0 = CoordinatorLayout.a();
        Rect rect1 = CoordinatorLayout.a();
        Rect rect2 = CoordinatorLayout.a();
        int v3 = 0;
        while(true) {
            pools$SynchronizedPool0 = CoordinatorLayout.y;
            if(v3 >= v2) {
                break;
            }
            View view0 = (View)arrayList0.get(v3);
            LayoutParams coordinatorLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            if(v != 0 || view0.getVisibility() != 8) {
                int v6 = 0;
                while(v6 < v3) {
                    View view1 = (View)arrayList0.get(v6);
                    if(coordinatorLayout$LayoutParams0.g == view1) {
                        LayoutParams coordinatorLayout$LayoutParams1 = (LayoutParams)view0.getLayoutParams();
                        if(coordinatorLayout$LayoutParams1.f != null) {
                            Rect rect4 = CoordinatorLayout.a();
                            Rect rect5 = CoordinatorLayout.a();
                            arrayList2 = arrayList0;
                            Rect rect6 = CoordinatorLayout.a();
                            v7 = v6;
                            ViewGroupUtils.getDescendantRect(this, coordinatorLayout$LayoutParams1.f, rect4);
                            this.c(view0, rect5, false);
                            int v8 = view0.getMeasuredWidth();
                            v9 = v2;
                            int v10 = view0.getMeasuredHeight();
                            v11 = v3;
                            int v12 = v8;
                            coordinatorLayout$LayoutParams2 = coordinatorLayout$LayoutParams0;
                            view2 = view0;
                            rect7 = rect2;
                            pools$SynchronizedPool1 = pools$SynchronizedPool0;
                            CoordinatorLayout.d(v1, rect4, rect6, coordinatorLayout$LayoutParams1, v12, v10);
                            if(rect6.left != rect5.left || rect6.top != rect5.top) {
                                coordinatorLayout$LayoutParams3 = coordinatorLayout$LayoutParams1;
                                v13 = v12;
                                z = true;
                            }
                            else {
                                coordinatorLayout$LayoutParams3 = coordinatorLayout$LayoutParams1;
                                v13 = v12;
                                z = false;
                            }
                            this.b(coordinatorLayout$LayoutParams3, rect6, v13, v10);
                            int v14 = rect6.left - rect5.left;
                            int v15 = rect6.top - rect5.top;
                            if(v14 != 0) {
                                ViewCompat.offsetLeftAndRight(view2, v14);
                            }
                            if(v15 != 0) {
                                ViewCompat.offsetTopAndBottom(view2, v15);
                            }
                            if(z) {
                                Behavior coordinatorLayout$Behavior0 = coordinatorLayout$LayoutParams3.getBehavior();
                                if(coordinatorLayout$Behavior0 != null) {
                                    coordinatorLayout$Behavior0.onDependentViewChanged(this, view2, coordinatorLayout$LayoutParams3.f);
                                }
                            }
                            rect4.setEmpty();
                            pools$SynchronizedPool1.release(rect4);
                            rect5.setEmpty();
                            pools$SynchronizedPool1.release(rect5);
                            rect6.setEmpty();
                            pools$SynchronizedPool1.release(rect6);
                        }
                    }
                    else {
                        v7 = v6;
                        coordinatorLayout$LayoutParams2 = coordinatorLayout$LayoutParams0;
                        arrayList2 = arrayList0;
                        v9 = v2;
                        rect7 = rect2;
                        v11 = v3;
                        view2 = view0;
                        pools$SynchronizedPool1 = pools$SynchronizedPool0;
                    }
                    v6 = v7 + 1;
                    pools$SynchronizedPool0 = pools$SynchronizedPool1;
                    view0 = view2;
                    arrayList0 = arrayList2;
                    v2 = v9;
                    v3 = v11;
                    coordinatorLayout$LayoutParams0 = coordinatorLayout$LayoutParams2;
                    rect2 = rect7;
                }
                ArrayList arrayList3 = arrayList0;
                v5 = v3;
                View view3 = view0;
                this.c(view3, rect1, true);
                if(coordinatorLayout$LayoutParams0.insetEdge != 0 && !rect1.isEmpty()) {
                    int v16 = GravityCompat.getAbsoluteGravity(coordinatorLayout$LayoutParams0.insetEdge, v1);
                    switch(v16 & 0x70) {
                        case 0x30: {
                            rect0.top = Math.max(rect0.top, rect1.bottom);
                            break;
                        }
                        case 80: {
                            rect0.bottom = Math.max(rect0.bottom, this.getHeight() - rect1.top);
                        }
                    }
                    switch(v16 & 7) {
                        case 3: {
                            rect0.left = Math.max(rect0.left, rect1.right);
                            break;
                        }
                        case 5: {
                            rect0.right = Math.max(rect0.right, this.getWidth() - rect1.left);
                        }
                    }
                }
                if(coordinatorLayout$LayoutParams0.dodgeInsetEdges != 0 && view3.getVisibility() == 0 && ViewCompat.isLaidOut(view3) && view3.getWidth() > 0 && view3.getHeight() > 0) {
                    LayoutParams coordinatorLayout$LayoutParams4 = (LayoutParams)view3.getLayoutParams();
                    Behavior coordinatorLayout$Behavior1 = coordinatorLayout$LayoutParams4.getBehavior();
                    Rect rect8 = CoordinatorLayout.a();
                    Rect rect9 = CoordinatorLayout.a();
                    rect9.set(view3.getLeft(), view3.getTop(), view3.getRight(), view3.getBottom());
                    if(coordinatorLayout$Behavior1 == null || !coordinatorLayout$Behavior1.getInsetDodgeRect(this, view3, rect8)) {
                        rect8.set(rect9);
                    }
                    else if(!rect9.contains(rect8)) {
                        throw new IllegalArgumentException("Rect should be within the child\'s bounds. Rect:" + rect8.toShortString() + " | Bounds:" + rect9.toShortString());
                    }
                    rect9.setEmpty();
                    pools$SynchronizedPool0.release(rect9);
                    if(!rect8.isEmpty()) {
                        int v17 = GravityCompat.getAbsoluteGravity(coordinatorLayout$LayoutParams4.dodgeInsetEdges, v1);
                        if((v17 & 0x30) == 0x30) {
                            int v18 = rect8.top - coordinatorLayout$LayoutParams4.topMargin - coordinatorLayout$LayoutParams4.e;
                            int v19 = rect0.top;
                            if(v18 < v19) {
                                CoordinatorLayout.l(v19 - v18, view3);
                                z1 = true;
                            }
                        }
                        else {
                            z1 = false;
                        }
                        if((v17 & 80) == 80) {
                            int v20 = this.getHeight() - rect8.bottom - coordinatorLayout$LayoutParams4.bottomMargin + coordinatorLayout$LayoutParams4.e;
                            int v21 = rect0.bottom;
                            if(v20 < v21) {
                                CoordinatorLayout.l(v20 - v21, view3);
                                z1 = true;
                            }
                        }
                        if(!z1) {
                            CoordinatorLayout.l(0, view3);
                        }
                        if((v17 & 3) == 3) {
                            int v22 = rect8.left - coordinatorLayout$LayoutParams4.leftMargin - coordinatorLayout$LayoutParams4.d;
                            int v23 = rect0.left;
                            if(v22 < v23) {
                                CoordinatorLayout.k(v23 - v22, view3);
                                v24 = 1;
                            }
                        }
                        else {
                            v24 = 0;
                        }
                        if((v17 & 5) == 5) {
                            int v25 = this.getWidth() - rect8.right - coordinatorLayout$LayoutParams4.rightMargin + coordinatorLayout$LayoutParams4.d;
                            int v26 = rect0.right;
                            if(v25 < v26) {
                                CoordinatorLayout.k(v25 - v26, view3);
                                v27 = 1;
                            }
                        }
                        else {
                            v27 = v24;
                        }
                        if(v27 == 0) {
                            CoordinatorLayout.k(0, view3);
                        }
                    }
                    rect8.setEmpty();
                    pools$SynchronizedPool0.release(rect8);
                }
                if(v == 2) {
                label_161:
                    rect3 = rect2;
                }
                else {
                    rect3 = rect2;
                    rect3.set(((LayoutParams)view3.getLayoutParams()).l);
                    if(rect3.equals(rect1)) {
                        arrayList1 = arrayList3;
                        v4 = v2;
                        goto label_183;
                    }
                    else {
                        ((LayoutParams)view3.getLayoutParams()).l.set(rect1);
                        goto label_162;
                    }
                    goto label_161;
                }
            label_162:
                int v28 = v5 + 1;
                v4 = v2;
                while(true) {
                    arrayList1 = arrayList3;
                    if(v28 >= v4) {
                        break;
                    }
                    View view4 = (View)arrayList1.get(v28);
                    LayoutParams coordinatorLayout$LayoutParams5 = (LayoutParams)view4.getLayoutParams();
                    Behavior coordinatorLayout$Behavior2 = coordinatorLayout$LayoutParams5.getBehavior();
                    if(coordinatorLayout$Behavior2 != null && coordinatorLayout$Behavior2.layoutDependsOn(this, view4, view3)) {
                        if(v != 0 || !coordinatorLayout$LayoutParams5.k) {
                            if(v == 2) {
                                coordinatorLayout$Behavior2.onDependentViewRemoved(this, view4, view3);
                                z2 = true;
                            }
                            else {
                                z2 = coordinatorLayout$Behavior2.onDependentViewChanged(this, view4, view3);
                            }
                            if(v == 1) {
                                coordinatorLayout$LayoutParams5.k = z2;
                            }
                        }
                        else {
                            coordinatorLayout$LayoutParams5.k = false;
                        }
                    }
                    ++v28;
                    arrayList3 = arrayList1;
                }
            }
            else {
                arrayList1 = arrayList0;
                v4 = v2;
                rect3 = rect2;
                v5 = v3;
            }
        label_183:
            v3 = v5 + 1;
            rect2 = rect3;
            v2 = v4;
            arrayList0 = arrayList1;
        }
        rect0.setEmpty();
        pools$SynchronizedPool0.release(rect0);
        rect1.setEmpty();
        pools$SynchronizedPool0.release(rect1);
        rect2.setEmpty();
        pools$SynchronizedPool0.release(rect2);
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return this.generateDefaultLayoutParams();
    }

    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return this.generateLayoutParams(attributeSet0);
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return this.generateLayoutParams(viewGroup$LayoutParams0);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return new LayoutParams(this.getContext(), attributeSet0);
    }

    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(viewGroup$LayoutParams0 instanceof LayoutParams) {
            return new LayoutParams(((LayoutParams)viewGroup$LayoutParams0));
        }
        return viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams ? new LayoutParams(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0)) : new LayoutParams(viewGroup$LayoutParams0);
    }

    @NonNull
    public List getDependencies(@NonNull View view0) {
        List list0 = this.b.getOutgoingEdges(view0);
        List list1 = this.d;
        ((ArrayList)list1).clear();
        if(list0 != null) {
            ((ArrayList)list1).addAll(list0);
        }
        return list1;
    }

    @VisibleForTesting
    public final List getDependencySortedChildren() {
        this.i();
        return Collections.unmodifiableList(this.a);
    }

    @NonNull
    public List getDependents(@NonNull View view0) {
        List list0 = this.b.getIncomingEdges(view0);
        List list1 = this.d;
        ((ArrayList)list1).clear();
        if(list0 != null) {
            ((ArrayList)list1).addAll(list0);
        }
        return list1;
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public final WindowInsetsCompat getLastWindowInsets() {
        return this.o;
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.t.getNestedScrollAxes();
    }

    @Nullable
    public Drawable getStatusBarBackground() {
        return this.q;
    }

    @Override  // android.view.View
    public int getSuggestedMinimumHeight() {
        int v = super.getSuggestedMinimumHeight();
        int v1 = this.getPaddingTop();
        return Math.max(v, this.getPaddingBottom() + v1);
    }

    @Override  // android.view.View
    public int getSuggestedMinimumWidth() {
        int v = super.getSuggestedMinimumWidth();
        int v1 = this.getPaddingLeft();
        return Math.max(v, this.getPaddingRight() + v1);
    }

    public final boolean h(MotionEvent motionEvent0, int v) {
        int v9;
        int v1 = motionEvent0.getActionMasked();
        ArrayList arrayList0 = this.c;
        arrayList0.clear();
        boolean z = this.isChildrenDrawingOrderEnabled();
        int v2 = this.getChildCount();
        for(int v3 = v2 - 1; v3 >= 0; --v3) {
            arrayList0.add(this.getChildAt((z ? this.getChildDrawingOrder(v2, v3) : v3)));
        }
        c c0 = CoordinatorLayout.x;
        if(c0 != null) {
            Collections.sort(arrayList0, c0);
        }
        int v4 = arrayList0.size();
        MotionEvent motionEvent1 = null;
        boolean z1 = false;
        int v6 = 0;
        for(int v5 = 0; v5 < v4; ++v5) {
            View view0 = (View)arrayList0.get(v5);
            LayoutParams coordinatorLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            Behavior coordinatorLayout$Behavior0 = coordinatorLayout$LayoutParams0.getBehavior();
            int v7 = 1;
            if(!z1 && v6 == 0 || v1 == 0) {
                if(!z1 && coordinatorLayout$Behavior0 != null) {
                    switch(v) {
                        case 0: {
                            z1 = coordinatorLayout$Behavior0.onInterceptTouchEvent(this, view0, motionEvent0);
                            break;
                        }
                        case 1: {
                            z1 = coordinatorLayout$Behavior0.onTouchEvent(this, view0, motionEvent0);
                        }
                    }
                    if(z1) {
                        this.k = view0;
                    }
                }
                Behavior coordinatorLayout$Behavior1 = coordinatorLayout$LayoutParams0.a;
                if(coordinatorLayout$Behavior1 == null) {
                    coordinatorLayout$LayoutParams0.h = false;
                }
                boolean z2 = coordinatorLayout$LayoutParams0.h;
                if(z2) {
                    v9 = 1;
                }
                else {
                    v9 = coordinatorLayout$Behavior1 == null ? false : coordinatorLayout$Behavior1.blocksInteractionBelow(this, view0);
                    coordinatorLayout$LayoutParams0.h = v9;
                }
                if(v9 == 0 || z2) {
                    v7 = 0;
                }
                if(v9 != 0 && v7 == 0) {
                    break;
                }
                v6 = v7;
            }
            else if(coordinatorLayout$Behavior0 != null) {
                if(motionEvent1 == null) {
                    long v8 = SystemClock.uptimeMillis();
                    motionEvent1 = MotionEvent.obtain(v8, v8, 3, 0.0f, 0.0f, 0);
                }
                switch(v) {
                    case 0: {
                        coordinatorLayout$Behavior0.onInterceptTouchEvent(this, view0, motionEvent1);
                        break;
                    }
                    case 1: {
                        coordinatorLayout$Behavior0.onTouchEvent(this, view0, motionEvent1);
                    }
                }
            }
        }
        arrayList0.clear();
        return z1;
    }

    public final void i() {
        ArrayList arrayList0 = this.a;
        arrayList0.clear();
        DirectedAcyclicGraph directedAcyclicGraph0 = this.b;
        directedAcyclicGraph0.clear();
        int v = this.getChildCount();
        int v1 = 0;
        while(v1 < v) {
            View view0 = this.getChildAt(v1);
            LayoutParams coordinatorLayout$LayoutParams0 = CoordinatorLayout.f(view0);
            if(coordinatorLayout$LayoutParams0.c == -1) {
                coordinatorLayout$LayoutParams0.g = null;
                coordinatorLayout$LayoutParams0.f = null;
            }
            else {
                if(coordinatorLayout$LayoutParams0.f != null && coordinatorLayout$LayoutParams0.f.getId() == coordinatorLayout$LayoutParams0.c) {
                    View view1 = coordinatorLayout$LayoutParams0.f;
                    ViewParent viewParent0 = view1.getParent();
                    while(viewParent0 != this) {
                        if(viewParent0 != null && viewParent0 != view0) {
                            if(viewParent0 instanceof View) {
                                view1 = (View)viewParent0;
                            }
                            viewParent0 = viewParent0.getParent();
                            continue;
                        }
                        coordinatorLayout$LayoutParams0.g = null;
                        coordinatorLayout$LayoutParams0.f = null;
                        goto label_27;
                    }
                    coordinatorLayout$LayoutParams0.g = view1;
                    goto label_53;
                }
            label_27:
                View view2 = this.findViewById(coordinatorLayout$LayoutParams0.c);
                coordinatorLayout$LayoutParams0.f = view2;
                if(view2 == null) {
                    if(!this.isInEditMode()) {
                        throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + this.getResources().getResourceName(coordinatorLayout$LayoutParams0.c) + " to anchor view " + view0);
                    }
                    coordinatorLayout$LayoutParams0.g = null;
                    coordinatorLayout$LayoutParams0.f = null;
                }
                else if(view2 == this) {
                    if(!this.isInEditMode()) {
                        throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                    }
                    coordinatorLayout$LayoutParams0.g = null;
                    coordinatorLayout$LayoutParams0.f = null;
                }
                else {
                    ViewParent viewParent1 = view2.getParent();
                    while(viewParent1 != this && viewParent1 != null) {
                        if(viewParent1 == view0) {
                            if(!this.isInEditMode()) {
                                throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                            }
                            coordinatorLayout$LayoutParams0.g = null;
                            coordinatorLayout$LayoutParams0.f = null;
                            goto label_53;
                        }
                        if(viewParent1 instanceof View) {
                            view2 = (View)viewParent1;
                        }
                        viewParent1 = viewParent1.getParent();
                    }
                    coordinatorLayout$LayoutParams0.g = view2;
                }
            }
        label_53:
            directedAcyclicGraph0.addNode(view0);
            int v2 = 0;
            while(v2 < v) {
                if(v2 != v1) {
                    View view3 = this.getChildAt(v2);
                    if(view3 == coordinatorLayout$LayoutParams0.g) {
                    label_62:
                        if(!directedAcyclicGraph0.contains(view3)) {
                            directedAcyclicGraph0.addNode(view3);
                        }
                        directedAcyclicGraph0.addEdge(view3, view0);
                    }
                    else {
                        int v3 = ViewCompat.getLayoutDirection(this);
                        int v4 = GravityCompat.getAbsoluteGravity(((LayoutParams)view3.getLayoutParams()).insetEdge, v3);
                        if(v4 != 0 && (GravityCompat.getAbsoluteGravity(coordinatorLayout$LayoutParams0.dodgeInsetEdges, v3) & v4) == v4 || coordinatorLayout$LayoutParams0.a != null && coordinatorLayout$LayoutParams0.a.layoutDependsOn(this, view0, view3)) {
                            goto label_62;
                        }
                    }
                }
                ++v2;
            }
            ++v1;
        }
        arrayList0.addAll(directedAcyclicGraph0.getSortedList());
        Collections.reverse(arrayList0);
    }

    public boolean isPointInChildBounds(@NonNull View view0, int v, int v1) {
        Rect rect0 = CoordinatorLayout.a();
        ViewGroupUtils.getDescendantRect(this, view0, rect0);
        try {
            return rect0.contains(v, v1);
        }
        finally {
            rect0.setEmpty();
            CoordinatorLayout.y.release(rect0);
        }
    }

    public final void j(boolean z) {
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.getChildAt(v1);
            Behavior coordinatorLayout$Behavior0 = ((LayoutParams)view0.getLayoutParams()).getBehavior();
            if(coordinatorLayout$Behavior0 != null) {
                long v2 = SystemClock.uptimeMillis();
                MotionEvent motionEvent0 = MotionEvent.obtain(v2, v2, 3, 0.0f, 0.0f, 0);
                if(z) {
                    coordinatorLayout$Behavior0.onInterceptTouchEvent(this, view0, motionEvent0);
                }
                else {
                    coordinatorLayout$Behavior0.onTouchEvent(this, view0, motionEvent0);
                }
                motionEvent0.recycle();
            }
        }
        for(int v3 = 0; v3 < v; ++v3) {
            ((LayoutParams)this.getChildAt(v3).getLayoutParams()).h = false;
        }
        this.k = null;
        this.h = false;
    }

    public static void k(int v, View view0) {
        LayoutParams coordinatorLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        int v1 = coordinatorLayout$LayoutParams0.d;
        if(v1 != v) {
            ViewCompat.offsetLeftAndRight(view0, v - v1);
            coordinatorLayout$LayoutParams0.d = v;
        }
    }

    public static void l(int v, View view0) {
        LayoutParams coordinatorLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        int v1 = coordinatorLayout$LayoutParams0.e;
        if(v1 != v) {
            ViewCompat.offsetTopAndBottom(view0, v - v1);
            coordinatorLayout$LayoutParams0.e = v;
        }
    }

    public final void m() {
        if(ViewCompat.getFitsSystemWindows(this)) {
            if(this.s == null) {
                this.s = new h(this);
            }
            ViewCompat.setOnApplyWindowInsetsListener(this, this.s);
            this.setSystemUiVisibility(0x500);
            return;
        }
        ViewCompat.setOnApplyWindowInsetsListener(this, null);
    }

    @Override  // android.view.ViewGroup
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.j(false);
        if(this.n) {
            if(this.m == null) {
                this.m = new t(this, 1);
            }
            this.getViewTreeObserver().addOnPreDrawListener(this.m);
        }
        if(this.o == null && ViewCompat.getFitsSystemWindows(this)) {
            ViewCompat.requestApplyInsets(this);
        }
        this.i = true;
    }

    @Override  // android.view.ViewGroup
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.j(false);
        if(this.n && this.m != null) {
            this.getViewTreeObserver().removeOnPreDrawListener(this.m);
        }
        View view0 = this.l;
        if(view0 != null) {
            this.onStopNestedScroll(view0);
        }
        this.i = false;
    }

    @Override  // android.view.View
    public void onDraw(Canvas canvas0) {
        super.onDraw(canvas0);
        if(this.p && this.q != null) {
            int v = this.o == null ? 0 : this.o.getSystemWindowInsetTop();
            if(v > 0) {
                this.q.setBounds(0, 0, this.getWidth(), v);
                this.q.draw(canvas0);
            }
        }
    }

    @Override  // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        int v = motionEvent0.getActionMasked();
        if(v == 0) {
            this.j(true);
        }
        boolean z = this.h(motionEvent0, 0);
        if(v == 1 || v == 3) {
            this.j(true);
        }
        return z;
    }

    @Override  // android.view.ViewGroup
    public void onLayout(boolean z, int v, int v1, int v2, int v3) {
        int v4 = ViewCompat.getLayoutDirection(this);
        ArrayList arrayList0 = this.a;
        int v5 = arrayList0.size();
        for(int v6 = 0; v6 < v5; ++v6) {
            View view0 = (View)arrayList0.get(v6);
            if(view0.getVisibility() != 8) {
                Behavior coordinatorLayout$Behavior0 = ((LayoutParams)view0.getLayoutParams()).getBehavior();
                if(coordinatorLayout$Behavior0 == null || !coordinatorLayout$Behavior0.onLayoutChild(this, view0, v4)) {
                    this.onLayoutChild(view0, v4);
                }
            }
        }
    }

    public void onLayoutChild(@NonNull View view0, int v) {
        int v11;
        LayoutParams coordinatorLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        View view1 = coordinatorLayout$LayoutParams0.f;
        if(view1 == null && coordinatorLayout$LayoutParams0.c != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        SynchronizedPool pools$SynchronizedPool0 = CoordinatorLayout.y;
        if(view1 != null) {
            Rect rect0 = CoordinatorLayout.a();
            Rect rect1 = CoordinatorLayout.a();
            try {
                ViewGroupUtils.getDescendantRect(this, view1, rect0);
                LayoutParams coordinatorLayout$LayoutParams1 = (LayoutParams)view0.getLayoutParams();
                int v2 = view0.getMeasuredWidth();
                int v3 = view0.getMeasuredHeight();
                CoordinatorLayout.d(v, rect0, rect1, coordinatorLayout$LayoutParams1, v2, v3);
                this.b(coordinatorLayout$LayoutParams1, rect1, v2, v3);
                view0.layout(rect1.left, rect1.top, rect1.right, rect1.bottom);
            }
            finally {
                rect0.setEmpty();
                pools$SynchronizedPool0.release(rect0);
                rect1.setEmpty();
                pools$SynchronizedPool0.release(rect1);
            }
            return;
        }
        int v4 = coordinatorLayout$LayoutParams0.keyline;
        if(v4 >= 0) {
            LayoutParams coordinatorLayout$LayoutParams2 = (LayoutParams)view0.getLayoutParams();
            int v5 = GravityCompat.getAbsoluteGravity((coordinatorLayout$LayoutParams2.gravity == 0 ? 0x800035 : coordinatorLayout$LayoutParams2.gravity), v);
            int v6 = this.getWidth();
            int v7 = this.getHeight();
            int v8 = view0.getMeasuredWidth();
            int v9 = view0.getMeasuredHeight();
            if(v == 1) {
                v4 = v6 - v4;
            }
            int v10 = this.e(v4) - v8;
            switch(v5 & 7) {
                case 1: {
                    v10 += v8 / 2;
                    break;
                }
                case 5: {
                    v10 += v8;
                }
            }
            switch(v5 & 0x70) {
                case 16: {
                    v11 = v9 / 2;
                    break;
                }
                case 80: {
                    v11 = v9;
                    break;
                }
                default: {
                    v11 = 0;
                }
            }
            int v12 = Math.max(this.getPaddingLeft() + coordinatorLayout$LayoutParams2.leftMargin, Math.min(v10, v6 - this.getPaddingRight() - v8 - coordinatorLayout$LayoutParams2.rightMargin));
            int v13 = Math.max(this.getPaddingTop() + coordinatorLayout$LayoutParams2.topMargin, Math.min(v11, v7 - this.getPaddingBottom() - v9 - coordinatorLayout$LayoutParams2.bottomMargin));
            view0.layout(v12, v13, v8 + v12, v9 + v13);
            return;
        }
        LayoutParams coordinatorLayout$LayoutParams3 = (LayoutParams)view0.getLayoutParams();
        Rect rect2 = CoordinatorLayout.a();
        rect2.set(this.getPaddingLeft() + coordinatorLayout$LayoutParams3.leftMargin, this.getPaddingTop() + coordinatorLayout$LayoutParams3.topMargin, this.getWidth() - this.getPaddingRight() - coordinatorLayout$LayoutParams3.rightMargin, this.getHeight() - this.getPaddingBottom() - coordinatorLayout$LayoutParams3.bottomMargin);
        if(this.o != null && ViewCompat.getFitsSystemWindows(this) && !ViewCompat.getFitsSystemWindows(view0)) {
            int v14 = rect2.left;
            rect2.left = this.o.getSystemWindowInsetLeft() + v14;
            int v15 = rect2.top;
            rect2.top = this.o.getSystemWindowInsetTop() + v15;
            rect2.right -= this.o.getSystemWindowInsetRight();
            rect2.bottom -= this.o.getSystemWindowInsetBottom();
        }
        Rect rect3 = CoordinatorLayout.a();
        int v16 = (coordinatorLayout$LayoutParams3.gravity & 7) == 0 ? coordinatorLayout$LayoutParams3.gravity | 0x800003 : coordinatorLayout$LayoutParams3.gravity;
        if((v16 & 0x70) == 0) {
            v16 |= 0x30;
        }
        GravityCompat.apply(v16, view0.getMeasuredWidth(), view0.getMeasuredHeight(), rect2, rect3, v);
        view0.layout(rect3.left, rect3.top, rect3.right, rect3.bottom);
        rect2.setEmpty();
        pools$SynchronizedPool0.release(rect2);
        rect3.setEmpty();
        pools$SynchronizedPool0.release(rect3);
    }

    @Override  // android.view.View
    public void onMeasure(int v, int v1) {
        int v35;
        int v34;
        int v33;
        int v32;
        int v31;
        int v26;
        int v24;
        ArrayList arrayList1;
        int v21;
        int v20;
        this.i();
        int v2 = this.getChildCount();
        for(int v3 = 0; true; ++v3) {
            boolean z = false;
            if(v3 >= v2) {
                break;
            }
            View view0 = this.getChildAt(v3);
            if(this.b.hasOutgoingEdges(view0)) {
                z = true;
                break;
            }
        }
        if(z != this.n) {
            if(z) {
                if(this.i) {
                    if(this.m == null) {
                        this.m = new t(this, 1);
                    }
                    this.getViewTreeObserver().addOnPreDrawListener(this.m);
                }
                this.n = true;
            }
            else {
                if(this.i && this.m != null) {
                    this.getViewTreeObserver().removeOnPreDrawListener(this.m);
                }
                this.n = false;
            }
        }
        int v4 = this.getPaddingLeft();
        int v5 = this.getPaddingTop();
        int v6 = this.getPaddingRight();
        int v7 = this.getPaddingBottom();
        int v8 = ViewCompat.getLayoutDirection(this);
        int v9 = View.MeasureSpec.getMode(v);
        int v10 = View.MeasureSpec.getSize(v);
        int v11 = View.MeasureSpec.getMode(v1);
        int v12 = View.MeasureSpec.getSize(v1);
        int v13 = this.getSuggestedMinimumWidth();
        int v14 = this.getSuggestedMinimumHeight();
        boolean z1 = this.o != null && ViewCompat.getFitsSystemWindows(this);
        ArrayList arrayList0 = this.a;
        int v15 = arrayList0.size();
        int v16 = v13;
        int v17 = v14;
        int v18 = 0;
        int v19 = 0;
        while(v19 < v15) {
            View view1 = (View)arrayList0.get(v19);
            if(view1.getVisibility() == 8) {
                v20 = v19;
                v21 = v15;
                arrayList1 = arrayList0;
            }
            else {
                LayoutParams coordinatorLayout$LayoutParams0 = (LayoutParams)view1.getLayoutParams();
                int v22 = coordinatorLayout$LayoutParams0.keyline;
                if(v22 < 0 || v9 == 0) {
                    v24 = v18;
                    v20 = v19;
                }
                else {
                    int v23 = this.e(v22);
                    v24 = v18;
                    int v25 = GravityCompat.getAbsoluteGravity((coordinatorLayout$LayoutParams0.gravity == 0 ? 0x800035 : coordinatorLayout$LayoutParams0.gravity), v8) & 7;
                    v20 = v19;
                    if(v25 == 3 && v8 != 1 || v25 == 5 && v8 == 1) {
                        v26 = Math.max(0, v10 - v6 - v23);
                        goto label_64;
                    }
                    else if(v25 == 5 && v8 != 1 || v25 == 3 && v8 == 1) {
                        v26 = Math.max(0, v23 - v4);
                        goto label_64;
                    }
                }
                v26 = 0;
            label_64:
                if(!z1 || ViewCompat.getFitsSystemWindows(view1)) {
                    v31 = v;
                    v32 = v1;
                }
                else {
                    int v27 = this.o.getSystemWindowInsetLeft();
                    int v28 = this.o.getSystemWindowInsetRight();
                    int v29 = this.o.getSystemWindowInsetTop();
                    int v30 = this.o.getSystemWindowInsetBottom();
                    v31 = View.MeasureSpec.makeMeasureSpec(v10 - (v28 + v27), v9);
                    v32 = View.MeasureSpec.makeMeasureSpec(v12 - (v30 + v29), v11);
                }
                Behavior coordinatorLayout$Behavior0 = coordinatorLayout$LayoutParams0.getBehavior();
                if(coordinatorLayout$Behavior0 == null) {
                    v34 = v17;
                    v35 = v16;
                    v21 = v15;
                    arrayList1 = arrayList0;
                    v33 = v24;
                    this.onMeasureChild(view1, v31, v26, v32, 0);
                }
                else {
                    v33 = v24;
                    v34 = v17;
                    v35 = v16;
                    v21 = v15;
                    arrayList1 = arrayList0;
                    if(!coordinatorLayout$Behavior0.onMeasureChild(this, view1, v31, v26, v32, 0)) {
                        this.onMeasureChild(view1, v31, v26, v32, 0);
                    }
                }
                v16 = Math.max(v35, view1.getMeasuredWidth() + (v4 + v6) + coordinatorLayout$LayoutParams0.leftMargin + coordinatorLayout$LayoutParams0.rightMargin);
                v17 = Math.max(v34, view1.getMeasuredHeight() + (v5 + v7) + coordinatorLayout$LayoutParams0.topMargin + coordinatorLayout$LayoutParams0.bottomMargin);
                v18 = View.combineMeasuredStates(v33, view1.getMeasuredState());
            }
            v19 = v20 + 1;
            v15 = v21;
            arrayList0 = arrayList1;
        }
        this.setMeasuredDimension(View.resolveSizeAndState(v16, v, 0xFF000000 & v18), View.resolveSizeAndState(v17, v1, v18 << 16));
    }

    public void onMeasureChild(View view0, int v, int v1, int v2, int v3) {
        this.measureChildWithMargins(view0, v, v1, v2, v3);
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View view0, float f, float f1, boolean z) {
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view1 = this.getChildAt(v1);
            if(view1.getVisibility() != 8) {
                boolean z1 = !((LayoutParams)view1.getLayoutParams()).a(0);
            }
        }
        return false;
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view0, float f, float f1) {
        int v = this.getChildCount();
        boolean z = false;
        for(int v1 = 0; v1 < v; ++v1) {
            View view1 = this.getChildAt(v1);
            if(view1.getVisibility() != 8) {
                LayoutParams coordinatorLayout$LayoutParams0 = (LayoutParams)view1.getLayoutParams();
                if(coordinatorLayout$LayoutParams0.a(0)) {
                    Behavior coordinatorLayout$Behavior0 = coordinatorLayout$LayoutParams0.getBehavior();
                    if(coordinatorLayout$Behavior0 != null) {
                        z |= coordinatorLayout$Behavior0.onNestedPreFling(this, view1, view0, f, f1);
                    }
                }
            }
        }
        return z;
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(View view0, int v, int v1, int[] arr_v) {
        this.onNestedPreScroll(view0, v, v1, arr_v, 0);
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(View view0, int v, int v1, int[] arr_v, int v2) {
        int v3 = this.getChildCount();
        boolean z = false;
        int v5 = 0;
        int v6 = 0;
        for(int v4 = 0; v4 < v3; ++v4) {
            View view1 = this.getChildAt(v4);
            if(view1.getVisibility() != 8) {
                LayoutParams coordinatorLayout$LayoutParams0 = (LayoutParams)view1.getLayoutParams();
                if(coordinatorLayout$LayoutParams0.a(v2)) {
                    Behavior coordinatorLayout$Behavior0 = coordinatorLayout$LayoutParams0.getBehavior();
                    if(coordinatorLayout$Behavior0 != null) {
                        this.f[0] = 0;
                        this.f[1] = 0;
                        coordinatorLayout$Behavior0.onNestedPreScroll(this, view1, view0, v, v1, this.f, v2);
                        v5 = v <= 0 ? Math.min(v5, this.f[0]) : Math.max(v5, this.f[0]);
                        v6 = v1 <= 0 ? Math.min(v6, this.f[1]) : Math.max(v6, this.f[1]);
                        z = true;
                    }
                }
            }
        }
        arr_v[0] = v5;
        arr_v[1] = v6;
        if(z) {
            this.g(1);
        }
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(View view0, int v, int v1, int v2, int v3) {
        this.onNestedScroll(view0, v, v1, v2, v3, 0);
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(View view0, int v, int v1, int v2, int v3, int v4) {
        this.onNestedScroll(view0, v, v1, v2, v3, 0, this.g);
    }

    @Override  // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(@NonNull View view0, int v, int v1, int v2, int v3, int v4, @NonNull int[] arr_v) {
        int v5 = this.getChildCount();
        boolean z = false;
        int v7 = 0;
        int v8 = 0;
        for(int v6 = 0; v6 < v5; ++v6) {
            View view1 = this.getChildAt(v6);
            if(view1.getVisibility() != 8) {
                LayoutParams coordinatorLayout$LayoutParams0 = (LayoutParams)view1.getLayoutParams();
                if(coordinatorLayout$LayoutParams0.a(v4)) {
                    Behavior coordinatorLayout$Behavior0 = coordinatorLayout$LayoutParams0.getBehavior();
                    if(coordinatorLayout$Behavior0 != null) {
                        this.f[0] = 0;
                        this.f[1] = 0;
                        coordinatorLayout$Behavior0.onNestedScroll(this, view1, view0, v, v1, v2, v3, v4, this.f);
                        v7 = v2 <= 0 ? Math.min(v7, this.f[0]) : Math.max(v7, this.f[0]);
                        v8 = v3 <= 0 ? Math.min(v8, this.f[1]) : Math.max(v8, this.f[1]);
                        z = true;
                    }
                }
            }
        }
        arr_v[0] += v7;
        arr_v[1] += v8;
        if(z) {
            this.g(1);
        }
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(View view0, View view1, int v) {
        this.onNestedScrollAccepted(view0, view1, v, 0);
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View view0, View view1, int v, int v1) {
        this.t.onNestedScrollAccepted(view0, view1, v, v1);
        this.l = view1;
        int v2 = this.getChildCount();
        for(int v3 = 0; v3 < v2; ++v3) {
            boolean z = !((LayoutParams)this.getChildAt(v3).getLayoutParams()).a(v1);
        }
    }

    @Override  // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((SavedState)parcelable0).getSuperState());
        SparseArray sparseArray0 = ((SavedState)parcelable0).b;
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.getChildAt(v1);
            int v2 = view0.getId();
            Behavior coordinatorLayout$Behavior0 = CoordinatorLayout.f(view0).getBehavior();
            if(v2 != -1 && coordinatorLayout$Behavior0 != null) {
                Parcelable parcelable1 = (Parcelable)sparseArray0.get(v2);
                if(parcelable1 != null) {
                    coordinatorLayout$Behavior0.onRestoreInstanceState(this, view0, parcelable1);
                }
            }
        }
    }

    @Override  // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray0 = new SparseArray();
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.getChildAt(v1);
            int v2 = view0.getId();
            Behavior coordinatorLayout$Behavior0 = ((LayoutParams)view0.getLayoutParams()).getBehavior();
            if(v2 != -1 && coordinatorLayout$Behavior0 != null) {
                Parcelable parcelable1 = coordinatorLayout$Behavior0.onSaveInstanceState(this, view0);
                if(parcelable1 != null) {
                    sparseArray0.append(v2, parcelable1);
                }
            }
        }
        parcelable0.b = sparseArray0;
        return parcelable0;
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view0, View view1, int v) {
        return this.onStartNestedScroll(view0, view1, v, 0);
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View view0, View view1, int v, int v1) {
        int v2 = this.getChildCount();
        boolean z = false;
        for(int v3 = 0; v3 < v2; ++v3) {
            View view2 = this.getChildAt(v3);
            if(view2.getVisibility() != 8) {
                LayoutParams coordinatorLayout$LayoutParams0 = (LayoutParams)view2.getLayoutParams();
                Behavior coordinatorLayout$Behavior0 = coordinatorLayout$LayoutParams0.getBehavior();
                if(coordinatorLayout$Behavior0 == null) {
                    switch(v1) {
                        case 0: {
                            coordinatorLayout$LayoutParams0.i = false;
                            break;
                        }
                        case 1: {
                            coordinatorLayout$LayoutParams0.j = false;
                        }
                    }
                }
                else {
                    boolean z1 = coordinatorLayout$Behavior0.onStartNestedScroll(this, view2, view0, view1, v, v1);
                    z |= z1;
                    switch(v1) {
                        case 0: {
                            coordinatorLayout$LayoutParams0.i = z1;
                            break;
                        }
                        case 1: {
                            coordinatorLayout$LayoutParams0.j = z1;
                        }
                    }
                }
            }
        }
        return z;
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(View view0) {
        this.onStopNestedScroll(view0, 0);
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(View view0, int v) {
        this.t.onStopNestedScroll(view0, v);
        int v1 = this.getChildCount();
        for(int v2 = 0; v2 < v1; ++v2) {
            View view1 = this.getChildAt(v2);
            LayoutParams coordinatorLayout$LayoutParams0 = (LayoutParams)view1.getLayoutParams();
            if(coordinatorLayout$LayoutParams0.a(v)) {
                Behavior coordinatorLayout$Behavior0 = coordinatorLayout$LayoutParams0.getBehavior();
                if(coordinatorLayout$Behavior0 != null) {
                    coordinatorLayout$Behavior0.onStopNestedScroll(this, view1, view0, v);
                }
                switch(v) {
                    case 0: {
                        coordinatorLayout$LayoutParams0.i = false;
                        break;
                    }
                    case 1: {
                        coordinatorLayout$LayoutParams0.j = false;
                    }
                }
                coordinatorLayout$LayoutParams0.k = false;
            }
        }
        this.l = null;
    }

    @Override  // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        boolean z1;
        boolean z;
        int v = motionEvent0.getActionMasked();
        if(this.k == null) {
            z = this.h(motionEvent0, 1);
            if(z) {
                goto label_7;
            }
            else {
                z1 = false;
            }
        }
        else {
            z = false;
        label_7:
            Behavior coordinatorLayout$Behavior0 = ((LayoutParams)this.k.getLayoutParams()).getBehavior();
            z1 = coordinatorLayout$Behavior0 == null ? false : coordinatorLayout$Behavior0.onTouchEvent(this, this.k, motionEvent0);
        }
        MotionEvent motionEvent1 = null;
        if(this.k == null) {
            z1 |= super.onTouchEvent(motionEvent0);
        }
        else if(z) {
            long v1 = SystemClock.uptimeMillis();
            motionEvent1 = MotionEvent.obtain(v1, v1, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEvent1);
        }
        if(motionEvent1 != null) {
            motionEvent1.recycle();
        }
        if(v == 1 || v == 3) {
            this.j(false);
        }
        return z1;
    }

    @Override  // android.view.ViewGroup
    public boolean requestChildRectangleOnScreen(View view0, Rect rect0, boolean z) {
        Behavior coordinatorLayout$Behavior0 = ((LayoutParams)view0.getLayoutParams()).getBehavior();
        return coordinatorLayout$Behavior0 == null || !coordinatorLayout$Behavior0.onRequestChildRectangleOnScreen(this, view0, rect0, z) ? super.requestChildRectangleOnScreen(view0, rect0, z) : true;
    }

    @Override  // android.view.ViewGroup
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if(z && !this.h) {
            this.j(false);
            this.h = true;
        }
    }

    @Override  // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        this.m();
    }

    @Override  // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener viewGroup$OnHierarchyChangeListener0) {
        this.r = viewGroup$OnHierarchyChangeListener0;
    }

    public void setStatusBarBackground(@Nullable Drawable drawable0) {
        Drawable drawable1 = null;
        Drawable drawable2 = this.q;
        if(drawable2 != drawable0) {
            if(drawable2 != null) {
                drawable2.setCallback(null);
            }
            if(drawable0 != null) {
                drawable1 = drawable0.mutate();
            }
            this.q = drawable1;
            if(drawable1 != null) {
                if(drawable1.isStateful()) {
                    this.q.setState(this.getDrawableState());
                }
                DrawableCompat.setLayoutDirection(this.q, ViewCompat.getLayoutDirection(this));
                this.q.setVisible(this.getVisibility() == 0, false);
                this.q.setCallback(this);
            }
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void setStatusBarBackgroundColor(@ColorInt int v) {
        this.setStatusBarBackground(new ColorDrawable(v));
    }

    public void setStatusBarBackgroundResource(@DrawableRes int v) {
        this.setStatusBarBackground((v == 0 ? null : ContextCompat.getDrawable(this.getContext(), v)));
    }

    @Override  // android.view.View
    public void setVisibility(int v) {
        super.setVisibility(v);
        if(this.q != null && this.q.isVisible() != (v == 0)) {
            this.q.setVisible(v == 0, false);
        }
    }

    @Override  // android.view.View
    public boolean verifyDrawable(Drawable drawable0) {
        return super.verifyDrawable(drawable0) || drawable0 == this.q;
    }
}

