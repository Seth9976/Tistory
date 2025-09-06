package androidx.appcompat.app;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout.LayoutParams;
import androidx.appcompat.R.color;
import androidx.appcompat.widget.ViewUtils;
import androidx.core.content.ContextCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorUpdateListener;
import androidx.core.view.WindowInsetsCompat;

public final class s0 implements AppCompatDelegateImpl.ActionBarMenuCallback, OnApplyWindowInsetsListener, ViewPropertyAnimatorUpdateListener {
    public final Object a;

    public s0(Object object0) {
        this.a = object0;
        super();
    }

    @Override  // androidx.core.view.ViewPropertyAnimatorUpdateListener
    public void onAnimationUpdate(View view0) {
        ((View)((WindowDecorActionBar)this.a).e.getParent()).invalidate();
    }

    @Override  // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view0, WindowInsetsCompat windowInsetsCompat0) {
        int v12;
        int v9;
        int v = windowInsetsCompat0.getSystemWindowInsetTop();
        i0 i00 = (i0)this.a;
        i00.getClass();
        int v1 = windowInsetsCompat0.getSystemWindowInsetTop();
        int v2 = 0;
        if(i00.v == null || !(i00.v.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            v12 = 0;
        }
        else {
            ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)i00.v.getLayoutParams();
            int v3 = 1;
            if(i00.v.isShown()) {
                if(i00.d0 == null) {
                    i00.d0 = new Rect();
                    i00.e0 = new Rect();
                }
                Rect rect0 = i00.d0;
                Rect rect1 = i00.e0;
                rect0.set(windowInsetsCompat0.getSystemWindowInsetLeft(), windowInsetsCompat0.getSystemWindowInsetTop(), windowInsetsCompat0.getSystemWindowInsetRight(), windowInsetsCompat0.getSystemWindowInsetBottom());
                ViewUtils.computeFitSystemWindows(i00.B, rect0, rect1);
                int v4 = rect0.top;
                int v5 = rect0.left;
                int v6 = rect0.right;
                WindowInsetsCompat windowInsetsCompat1 = ViewCompat.getRootWindowInsets(i00.B);
                int v7 = windowInsetsCompat1 == null ? 0 : windowInsetsCompat1.getSystemWindowInsetLeft();
                int v8 = windowInsetsCompat1 == null ? 0 : windowInsetsCompat1.getSystemWindowInsetRight();
                if(viewGroup$MarginLayoutParams0.topMargin != v4 || viewGroup$MarginLayoutParams0.leftMargin != v5 || viewGroup$MarginLayoutParams0.rightMargin != v6) {
                    viewGroup$MarginLayoutParams0.topMargin = v4;
                    viewGroup$MarginLayoutParams0.leftMargin = v5;
                    viewGroup$MarginLayoutParams0.rightMargin = v6;
                    v9 = 1;
                }
                else {
                    v9 = 0;
                }
                Context context0 = i00.k;
                if(v4 <= 0 || i00.D != null) {
                    View view2 = i00.D;
                    if(view2 != null) {
                        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams1 = (ViewGroup.MarginLayoutParams)view2.getLayoutParams();
                        int v10 = viewGroup$MarginLayoutParams0.topMargin;
                        if(viewGroup$MarginLayoutParams1.height != v10 || viewGroup$MarginLayoutParams1.leftMargin != v7 || viewGroup$MarginLayoutParams1.rightMargin != v8) {
                            viewGroup$MarginLayoutParams1.height = v10;
                            viewGroup$MarginLayoutParams1.leftMargin = v7;
                            viewGroup$MarginLayoutParams1.rightMargin = v8;
                            i00.D.setLayoutParams(viewGroup$MarginLayoutParams1);
                        }
                    }
                }
                else {
                    View view1 = new View(context0);
                    i00.D = view1;
                    view1.setVisibility(8);
                    FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, viewGroup$MarginLayoutParams0.topMargin, 51);
                    frameLayout$LayoutParams0.leftMargin = v7;
                    frameLayout$LayoutParams0.rightMargin = v8;
                    i00.B.addView(i00.D, -1, frameLayout$LayoutParams0);
                }
                View view3 = i00.D;
                if(view3 == null) {
                    v3 = 0;
                }
                else if(view3.getVisibility() != 0) {
                    i00.D.setBackgroundColor(((ViewCompat.getWindowSystemUiVisibility(i00.D) & 0x2000) == 0 ? ContextCompat.getColor(context0, color.abc_decor_view_status_guard) : ContextCompat.getColor(context0, color.abc_decor_view_status_guard_light)));
                }
                if(!i00.I && v3 != 0) {
                    v1 = 0;
                }
                int v11 = v3;
                v3 = v9;
                v12 = v11;
            }
            else if(viewGroup$MarginLayoutParams0.topMargin == 0) {
                v12 = 0;
                v3 = 0;
            }
            else {
                viewGroup$MarginLayoutParams0.topMargin = 0;
                v12 = 0;
            }
            if(v3 != 0) {
                i00.v.setLayoutParams(viewGroup$MarginLayoutParams0);
            }
        }
        View view4 = i00.D;
        if(view4 != null) {
            if(v12 == 0) {
                v2 = 8;
            }
            view4.setVisibility(v2);
        }
        return v == v1 ? ViewCompat.onApplyWindowInsets(view0, windowInsetsCompat0) : ViewCompat.onApplyWindowInsets(view0, windowInsetsCompat0.replaceSystemWindowInsets(windowInsetsCompat0.getSystemWindowInsetLeft(), v1, windowInsetsCompat0.getSystemWindowInsetRight(), windowInsetsCompat0.getSystemWindowInsetBottom()));
    }

    @Override  // androidx.appcompat.app.AppCompatDelegateImpl$ActionBarMenuCallback
    public View onCreatePanelView(int v) {
        return v == 0 ? new View(((t0)this.a).a.getContext()) : null;
    }

    @Override  // androidx.appcompat.app.AppCompatDelegateImpl$ActionBarMenuCallback
    public boolean onPreparePanel(int v) {
        if(v == 0) {
            t0 t00 = (t0)this.a;
            if(!t00.d) {
                t00.a.setMenuPrepared();
                t00.d = true;
            }
        }
        return false;
    }
}

