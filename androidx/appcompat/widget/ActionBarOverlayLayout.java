package androidx.appcompat.widget;

import a8.e;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window.Callback;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.id;
import androidx.appcompat.view.menu.MenuPresenter.Callback;
import androidx.core.graphics.Insets;
import androidx.core.view.NestedScrollingParent2;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat.Builder;
import androidx.core.view.WindowInsetsCompat;

@SuppressLint({"UnknownNullness"})
@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public class ActionBarOverlayLayout extends ViewGroup implements DecorContentParent, NestedScrollingParent2, NestedScrollingParent3, NestedScrollingParent {
    public interface ActionBarVisibilityCallback {
        void enableContentAnimations(boolean arg1);

        void hideForSystem();

        void onContentScrollStarted();

        void onContentScrollStopped();

        void onWindowVisibilityChanged(int arg1);

        void showForSystem();
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(int v, int v1) {
            super(v, v1);
        }

        public LayoutParams(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
        }

        public LayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            super(viewGroup$LayoutParams0);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
            super(viewGroup$MarginLayoutParams0);
        }
    }

    public final NestedScrollingParentHelper A;
    public static final int[] B;
    public int a;
    public int b;
    public ContentFrameLayout c;
    public ActionBarContainer d;
    public DecorToolbar e;
    public Drawable f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public final Rect n;
    public final Rect o;
    public final Rect p;
    public WindowInsetsCompat q;
    public WindowInsetsCompat r;
    public WindowInsetsCompat s;
    public WindowInsetsCompat t;
    public ActionBarVisibilityCallback u;
    public OverScroller v;
    public ViewPropertyAnimator w;
    public final e x;
    public final androidx.appcompat.widget.e y;
    public final androidx.appcompat.widget.e z;

    static {
        ActionBarOverlayLayout.B = new int[]{attr.actionBarSize, 0x1010059};
    }

    public ActionBarOverlayLayout(@NonNull Context context0) {
        this(context0, null);
    }

    public ActionBarOverlayLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.b = 0;
        this.n = new Rect();
        this.o = new Rect();
        this.p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        this.q = WindowInsetsCompat.CONSUMED;
        this.r = WindowInsetsCompat.CONSUMED;
        this.s = WindowInsetsCompat.CONSUMED;
        this.t = WindowInsetsCompat.CONSUMED;
        this.x = new e(this, 3);
        this.y = new androidx.appcompat.widget.e(this, 0);
        this.z = new androidx.appcompat.widget.e(this, 1);
        this.c(context0);
        this.A = new NestedScrollingParentHelper(this);
    }

    public static boolean a(View view0, Rect rect0, boolean z) {
        boolean z1;
        LayoutParams actionBarOverlayLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        int v = rect0.left;
        if(actionBarOverlayLayout$LayoutParams0.leftMargin == v) {
            z1 = false;
        }
        else {
            actionBarOverlayLayout$LayoutParams0.leftMargin = v;
            z1 = true;
        }
        int v1 = rect0.top;
        if(actionBarOverlayLayout$LayoutParams0.topMargin != v1) {
            actionBarOverlayLayout$LayoutParams0.topMargin = v1;
            z1 = true;
        }
        int v2 = rect0.right;
        if(actionBarOverlayLayout$LayoutParams0.rightMargin != v2) {
            actionBarOverlayLayout$LayoutParams0.rightMargin = v2;
            z1 = true;
        }
        if(z) {
            int v3 = rect0.bottom;
            if(actionBarOverlayLayout$LayoutParams0.bottomMargin != v3) {
                actionBarOverlayLayout$LayoutParams0.bottomMargin = v3;
                return true;
            }
        }
        return z1;
    }

    public final void b() {
        this.removeCallbacks(this.y);
        this.removeCallbacks(this.z);
        ViewPropertyAnimator viewPropertyAnimator0 = this.w;
        if(viewPropertyAnimator0 != null) {
            viewPropertyAnimator0.cancel();
        }
    }

    public final void c(Context context0) {
        TypedArray typedArray0 = this.getContext().getTheme().obtainStyledAttributes(ActionBarOverlayLayout.B);
        this.a = typedArray0.getDimensionPixelSize(0, 0);
        Drawable drawable0 = typedArray0.getDrawable(1);
        this.f = drawable0;
        this.setWillNotDraw(drawable0 == null);
        typedArray0.recycle();
        this.g = false;
        this.v = new OverScroller(context0);
    }

    @Override  // androidx.appcompat.widget.DecorContentParent
    public boolean canShowOverflowMenu() {
        this.d();
        return this.e.canShowOverflowMenu();
    }

    @Override  // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof LayoutParams;
    }

    public final void d() {
        DecorToolbar decorToolbar0;
        if(this.c == null) {
            this.c = (ContentFrameLayout)this.findViewById(id.action_bar_activity_content);
            this.d = (ActionBarContainer)this.findViewById(id.action_bar_container);
            View view0 = this.findViewById(id.action_bar);
            if(view0 instanceof DecorToolbar) {
                decorToolbar0 = (DecorToolbar)view0;
            }
            else if(view0 instanceof Toolbar) {
                decorToolbar0 = ((Toolbar)view0).getWrapper();
            }
            else {
                throw new IllegalStateException("Can\'t make a decor toolbar out of " + view0.getClass().getSimpleName());
            }
            this.e = decorToolbar0;
        }
    }

    @Override  // androidx.appcompat.widget.DecorContentParent
    public void dismissPopups() {
        this.d();
        this.e.dismissPopupMenus();
    }

    @Override  // android.view.View
    public void draw(Canvas canvas0) {
        int v;
        super.draw(canvas0);
        if(this.f != null && !this.g) {
            if(this.d.getVisibility() == 0) {
                float f = (float)this.d.getBottom();
                v = (int)(this.d.getTranslationY() + f + 0.5f);
            }
            else {
                v = 0;
            }
            this.f.setBounds(0, v, this.getWidth(), this.f.getIntrinsicHeight() + v);
            this.f.draw(canvas0);
        }
    }

    @Override  // android.view.View
    public boolean fitSystemWindows(Rect rect0) {
        return super.fitSystemWindows(rect0);
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return this.generateDefaultLayoutParams();
    }

    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return this.generateLayoutParams(attributeSet0);
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return new LayoutParams(viewGroup$LayoutParams0);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return new LayoutParams(this.getContext(), attributeSet0);
    }

    public int getActionBarHideOffset() {
        return this.d == null ? 0 : -((int)this.d.getTranslationY());
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.A.getNestedScrollAxes();
    }

    @Override  // androidx.appcompat.widget.DecorContentParent
    public CharSequence getTitle() {
        this.d();
        return this.e.getTitle();
    }

    @Override  // androidx.appcompat.widget.DecorContentParent
    public boolean hasIcon() {
        this.d();
        return this.e.hasIcon();
    }

    @Override  // androidx.appcompat.widget.DecorContentParent
    public boolean hasLogo() {
        this.d();
        return this.e.hasLogo();
    }

    @Override  // androidx.appcompat.widget.DecorContentParent
    public boolean hideOverflowMenu() {
        this.d();
        return this.e.hideOverflowMenu();
    }

    @Override  // androidx.appcompat.widget.DecorContentParent
    public void initFeature(int v) {
        this.d();
        switch(v) {
            case 2: {
                this.e.initProgress();
                return;
            }
            case 5: {
                this.e.initIndeterminateProgress();
                return;
            }
            case 109: {
                this.setOverlayMode(true);
            }
        }
    }

    public boolean isHideOnContentScrollEnabled() {
        return this.j;
    }

    public boolean isInOverlayMode() {
        return this.h;
    }

    @Override  // androidx.appcompat.widget.DecorContentParent
    public boolean isOverflowMenuShowPending() {
        this.d();
        return this.e.isOverflowMenuShowPending();
    }

    @Override  // androidx.appcompat.widget.DecorContentParent
    public boolean isOverflowMenuShowing() {
        this.d();
        return this.e.isOverflowMenuShowing();
    }

    @Override  // android.view.View
    @RequiresApi(21)
    public WindowInsets onApplyWindowInsets(@NonNull WindowInsets windowInsets0) {
        this.d();
        WindowInsetsCompat windowInsetsCompat0 = WindowInsetsCompat.toWindowInsetsCompat(windowInsets0, this);
        Rect rect0 = new Rect(windowInsetsCompat0.getSystemWindowInsetLeft(), windowInsetsCompat0.getSystemWindowInsetTop(), windowInsetsCompat0.getSystemWindowInsetRight(), windowInsetsCompat0.getSystemWindowInsetBottom());
        boolean z = ActionBarOverlayLayout.a(this.d, rect0, false);
        Rect rect1 = this.n;
        ViewCompat.computeSystemWindowInsets(this, windowInsetsCompat0, rect1);
        WindowInsetsCompat windowInsetsCompat1 = windowInsetsCompat0.inset(rect1.left, rect1.top, rect1.right, rect1.bottom);
        this.q = windowInsetsCompat1;
        boolean z1 = true;
        if(!this.r.equals(windowInsetsCompat1)) {
            this.r = this.q;
            z = true;
        }
        Rect rect2 = this.o;
        if(rect2.equals(rect1)) {
            z1 = z;
        }
        else {
            rect2.set(rect1);
        }
        if(z1) {
            this.requestLayout();
        }
        return windowInsetsCompat0.consumeDisplayCutout().consumeSystemWindowInsets().consumeStableInsets().toWindowInsets();
    }

    @Override  // android.view.View
    public void onConfigurationChanged(Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        this.c(this.getContext());
        ViewCompat.requestApplyInsets(this);
    }

    @Override  // android.view.ViewGroup
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b();
    }

    @Override  // android.view.ViewGroup
    public void onLayout(boolean z, int v, int v1, int v2, int v3) {
        int v4 = this.getChildCount();
        int v5 = this.getPaddingLeft();
        int v6 = this.getPaddingTop();
        for(int v7 = 0; v7 < v4; ++v7) {
            View view0 = this.getChildAt(v7);
            if(view0.getVisibility() != 8) {
                LayoutParams actionBarOverlayLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                int v8 = view0.getMeasuredWidth();
                int v9 = view0.getMeasuredHeight();
                int v10 = actionBarOverlayLayout$LayoutParams0.leftMargin + v5;
                int v11 = actionBarOverlayLayout$LayoutParams0.topMargin + v6;
                view0.layout(v10, v11, v8 + v10, v9 + v11);
            }
        }
    }

    @Override  // android.view.View
    public void onMeasure(int v, int v1) {
        int v5;
        this.d();
        this.measureChildWithMargins(this.d, v, 0, v1, 0);
        LayoutParams actionBarOverlayLayout$LayoutParams0 = (LayoutParams)this.d.getLayoutParams();
        int v2 = Math.max(0, this.d.getMeasuredWidth() + actionBarOverlayLayout$LayoutParams0.leftMargin + actionBarOverlayLayout$LayoutParams0.rightMargin);
        int v3 = Math.max(0, this.d.getMeasuredHeight() + actionBarOverlayLayout$LayoutParams0.topMargin + actionBarOverlayLayout$LayoutParams0.bottomMargin);
        int v4 = View.combineMeasuredStates(0, this.d.getMeasuredState());
        boolean z = (ViewCompat.getWindowSystemUiVisibility(this) & 0x100) != 0;
        if(z) {
            v5 = this.a;
            if(this.i && this.d.getTabContainer() != null) {
                v5 += this.a;
            }
        }
        else {
            v5 = this.d.getVisibility() == 8 ? 0 : this.d.getMeasuredHeight();
        }
        Rect rect0 = this.p;
        rect0.set(this.n);
        WindowInsetsCompat windowInsetsCompat0 = this.q;
        this.s = windowInsetsCompat0;
        if(this.h || z) {
            Insets insets0 = Insets.of(windowInsetsCompat0.getSystemWindowInsetLeft(), this.s.getSystemWindowInsetTop() + v5, this.s.getSystemWindowInsetRight(), this.s.getSystemWindowInsetBottom());
            this.s = new Builder(this.s).setSystemWindowInsets(insets0).build();
        }
        else {
            rect0.top += v5;
            rect0.bottom = rect0.bottom;
            this.s = windowInsetsCompat0.inset(0, v5, 0, 0);
        }
        ActionBarOverlayLayout.a(this.c, rect0, true);
        if(!this.t.equals(this.s)) {
            this.t = this.s;
            ViewCompat.dispatchApplyWindowInsets(this.c, this.s);
        }
        this.measureChildWithMargins(this.c, v, 0, v1, 0);
        LayoutParams actionBarOverlayLayout$LayoutParams1 = (LayoutParams)this.c.getLayoutParams();
        int v6 = Math.max(v2, this.c.getMeasuredWidth() + actionBarOverlayLayout$LayoutParams1.leftMargin + actionBarOverlayLayout$LayoutParams1.rightMargin);
        int v7 = Math.max(v3, this.c.getMeasuredHeight() + actionBarOverlayLayout$LayoutParams1.topMargin + actionBarOverlayLayout$LayoutParams1.bottomMargin);
        int v8 = View.combineMeasuredStates(v4, this.c.getMeasuredState());
        int v9 = this.getPaddingLeft();
        int v10 = this.getPaddingRight();
        int v11 = this.getPaddingTop();
        int v12 = Math.max(this.getPaddingBottom() + v11 + v7, this.getSuggestedMinimumHeight());
        this.setMeasuredDimension(View.resolveSizeAndState(Math.max(v10 + v9 + v6, this.getSuggestedMinimumWidth()), v, v8), View.resolveSizeAndState(v12, v1, v8 << 16));
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View view0, float f, float f1, boolean z) {
        if(this.j && z) {
            this.v.fling(0, 0, 0, ((int)f1), 0, 0, 0x80000000, 0x7FFFFFFF);
            if(this.v.getFinalY() > this.d.getHeight()) {
                this.b();
                this.z.run();
            }
            else {
                this.b();
                this.y.run();
            }
            this.k = true;
            return true;
        }
        return false;
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view0, float f, float f1) {
        return false;
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(View view0, int v, int v1, int[] arr_v) {
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(View view0, int v, int v1, int[] arr_v, int v2) {
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(View view0, int v, int v1, int v2, int v3) {
        int v4 = this.l + v1;
        this.l = v4;
        this.setActionBarHideOffset(v4);
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(View view0, int v, int v1, int v2, int v3, int v4) {
        if(v4 == 0) {
            this.onNestedScroll(view0, v, v1, v2, v3);
        }
    }

    @Override  // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(View view0, int v, int v1, int v2, int v3, int v4, int[] arr_v) {
        this.onNestedScroll(view0, v, v1, v2, v3, v4);
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(View view0, View view1, int v) {
        this.A.onNestedScrollAccepted(view0, view1, v);
        this.l = this.getActionBarHideOffset();
        this.b();
        ActionBarVisibilityCallback actionBarOverlayLayout$ActionBarVisibilityCallback0 = this.u;
        if(actionBarOverlayLayout$ActionBarVisibilityCallback0 != null) {
            actionBarOverlayLayout$ActionBarVisibilityCallback0.onContentScrollStarted();
        }
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View view0, View view1, int v, int v1) {
        if(v1 == 0) {
            this.onNestedScrollAccepted(view0, view1, v);
        }
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view0, View view1, int v) {
        return (v & 2) == 0 || this.d.getVisibility() != 0 ? false : this.j;
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View view0, View view1, int v, int v1) {
        return v1 == 0 && this.onStartNestedScroll(view0, view1, v);
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(View view0) {
        if(this.j && !this.k) {
            if(this.l <= this.d.getHeight()) {
                this.b();
                this.postDelayed(this.y, 600L);
            }
            else {
                this.b();
                this.postDelayed(this.z, 600L);
            }
        }
        ActionBarVisibilityCallback actionBarOverlayLayout$ActionBarVisibilityCallback0 = this.u;
        if(actionBarOverlayLayout$ActionBarVisibilityCallback0 != null) {
            actionBarOverlayLayout$ActionBarVisibilityCallback0.onContentScrollStopped();
        }
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(View view0, int v) {
        if(v == 0) {
            this.onStopNestedScroll(view0);
        }
    }

    @Override  // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int v) {
        super.onWindowSystemUiVisibilityChanged(v);
        this.d();
        int v1 = this.m ^ v;
        this.m = v;
        int v2 = (v & 0x100) == 0 ? 0 : 1;
        ActionBarVisibilityCallback actionBarOverlayLayout$ActionBarVisibilityCallback0 = this.u;
        if(actionBarOverlayLayout$ActionBarVisibilityCallback0 != null) {
            actionBarOverlayLayout$ActionBarVisibilityCallback0.enableContentAnimations(((boolean)(v2 ^ 1)));
            if((v & 4) == 0 || v2 == 0) {
                this.u.showForSystem();
            }
            else {
                this.u.hideForSystem();
            }
        }
        if((v1 & 0x100) != 0 && this.u != null) {
            ViewCompat.requestApplyInsets(this);
        }
    }

    @Override  // android.view.View
    public void onWindowVisibilityChanged(int v) {
        super.onWindowVisibilityChanged(v);
        this.b = v;
        ActionBarVisibilityCallback actionBarOverlayLayout$ActionBarVisibilityCallback0 = this.u;
        if(actionBarOverlayLayout$ActionBarVisibilityCallback0 != null) {
            actionBarOverlayLayout$ActionBarVisibilityCallback0.onWindowVisibilityChanged(v);
        }
    }

    @Override  // androidx.appcompat.widget.DecorContentParent
    public void restoreToolbarHierarchyState(SparseArray sparseArray0) {
        this.d();
        this.e.restoreHierarchyState(sparseArray0);
    }

    @Override  // androidx.appcompat.widget.DecorContentParent
    public void saveToolbarHierarchyState(SparseArray sparseArray0) {
        this.d();
        this.e.saveHierarchyState(sparseArray0);
    }

    public void setActionBarHideOffset(int v) {
        this.b();
        int v1 = Math.max(0, Math.min(v, this.d.getHeight()));
        this.d.setTranslationY(((float)(-v1)));
    }

    public void setActionBarVisibilityCallback(ActionBarVisibilityCallback actionBarOverlayLayout$ActionBarVisibilityCallback0) {
        this.u = actionBarOverlayLayout$ActionBarVisibilityCallback0;
        if(this.getWindowToken() != null) {
            this.u.onWindowVisibilityChanged(this.b);
            int v = this.m;
            if(v != 0) {
                this.onWindowSystemUiVisibilityChanged(v);
                ViewCompat.requestApplyInsets(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.i = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if(z != this.j) {
            this.j = z;
            if(!z) {
                this.b();
                this.setActionBarHideOffset(0);
            }
        }
    }

    @Override  // androidx.appcompat.widget.DecorContentParent
    public void setIcon(int v) {
        this.d();
        this.e.setIcon(v);
    }

    @Override  // androidx.appcompat.widget.DecorContentParent
    public void setIcon(Drawable drawable0) {
        this.d();
        this.e.setIcon(drawable0);
    }

    @Override  // androidx.appcompat.widget.DecorContentParent
    public void setLogo(int v) {
        this.d();
        this.e.setLogo(v);
    }

    @Override  // androidx.appcompat.widget.DecorContentParent
    public void setMenu(Menu menu0, Callback menuPresenter$Callback0) {
        this.d();
        this.e.setMenu(menu0, menuPresenter$Callback0);
    }

    @Override  // androidx.appcompat.widget.DecorContentParent
    public void setMenuPrepared() {
        this.d();
        this.e.setMenuPrepared();
    }

    public void setOverlayMode(boolean z) {
        this.h = z;
        this.g = false;
    }

    public void setShowingForActionMode(boolean z) {
    }

    @Override  // androidx.appcompat.widget.DecorContentParent
    public void setUiOptions(int v) {
    }

    @Override  // androidx.appcompat.widget.DecorContentParent
    public void setWindowCallback(Window.Callback window$Callback0) {
        this.d();
        this.e.setWindowCallback(window$Callback0);
    }

    @Override  // androidx.appcompat.widget.DecorContentParent
    public void setWindowTitle(CharSequence charSequence0) {
        this.d();
        this.e.setWindowTitle(charSequence0);
    }

    @Override  // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override  // androidx.appcompat.widget.DecorContentParent
    public boolean showOverflowMenu() {
        this.d();
        return this.e.showOverflowMenu();
    }
}

