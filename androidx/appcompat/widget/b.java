package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.styleable;
import androidx.core.view.ViewPropertyAnimatorCompat;

public abstract class b extends ViewGroup {
    public boolean a;
    public boolean b;
    protected o mActionMenuPresenter;
    protected int mContentHeight;
    protected ActionMenuView mMenuView;
    protected final Context mPopupContext;
    protected final AbsActionBarView.VisibilityAnimListener mVisAnimListener;
    protected ViewPropertyAnimatorCompat mVisibilityAnim;

    public b(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.mVisAnimListener = new AbsActionBarView.VisibilityAnimListener(this);
        TypedValue typedValue0 = new TypedValue();
        if(context0.getTheme().resolveAttribute(attr.actionBarPopupTheme, typedValue0, true) && typedValue0.resourceId != 0) {
            this.mPopupContext = new ContextThemeWrapper(context0, typedValue0.resourceId);
            return;
        }
        this.mPopupContext = context0;
    }

    public static void a(b b0) {
        b0.super.setVisibility(0);
    }

    public int measureChildView(View view0, int v, int v1, int v2) {
        view0.measure(View.MeasureSpec.makeMeasureSpec(v, 0x80000000), v1);
        return Math.max(0, v - view0.getMeasuredWidth() - v2);
    }

    // 去混淆评级： 低(20)
    public static int next(int v, int v1, boolean z) {
        return z ? v - v1 : v + v1;
    }

    @Override  // android.view.View
    public void onConfigurationChanged(Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        TypedArray typedArray0 = this.getContext().obtainStyledAttributes(null, styleable.ActionBar, attr.actionBarStyle, 0);
        this.setContentHeight(typedArray0.getLayoutDimension(styleable.ActionBar_height, 0));
        typedArray0.recycle();
        o o0 = this.mActionMenuPresenter;
        if(o0 != null) {
            o0.j();
        }
    }

    @Override  // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent0) {
        int v = motionEvent0.getActionMasked();
        if(v == 9) {
            this.b = false;
        }
        if(!this.b && (v == 9 && !super.onHoverEvent(motionEvent0))) {
            this.b = true;
        }
        if(v == 3 || v == 10) {
            this.b = false;
        }
        return true;
    }

    @Override  // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        int v = motionEvent0.getActionMasked();
        if(v == 0) {
            this.a = false;
        }
        if(!this.a && (v == 0 && !super.onTouchEvent(motionEvent0))) {
            this.a = true;
        }
        if(v == 1 || v == 3) {
            this.a = false;
        }
        return true;
    }

    public int positionChild(View view0, int v, int v1, int v2, boolean z) {
        int v3 = view0.getMeasuredWidth();
        int v4 = view0.getMeasuredHeight();
        int v5 = (v2 - v4) / 2 + v1;
        if(z) {
            view0.layout(v - v3, v5, v, v4 + v5);
            return -v3;
        }
        view0.layout(v, v5, v + v3, v4 + v5);
        return v3;
    }

    public abstract void setContentHeight(int arg1);

    @Override  // android.view.View
    public void setVisibility(int v) {
        if(v != this.getVisibility()) {
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompat0 = this.mVisibilityAnim;
            if(viewPropertyAnimatorCompat0 != null) {
                viewPropertyAnimatorCompat0.cancel();
            }
            super.setVisibility(v);
        }
    }
}

