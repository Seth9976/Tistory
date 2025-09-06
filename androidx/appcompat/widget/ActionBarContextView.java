package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.id;
import androidx.appcompat.R.layout;
import androidx.appcompat.R.styleable;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public class ActionBarContextView extends b {
    public CharSequence c;
    public CharSequence d;
    public View e;
    public View f;
    public View g;
    public LinearLayout h;
    public TextView i;
    public TextView j;
    public final int k;
    public final int l;
    public boolean m;
    public final int n;

    public ActionBarContextView(@NonNull Context context0) {
        this(context0, null);
    }

    public ActionBarContextView(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.actionModeStyle);
    }

    public ActionBarContextView(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        TintTypedArray tintTypedArray0 = TintTypedArray.obtainStyledAttributes(context0, attributeSet0, styleable.ActionMode, v, 0);
        ViewCompat.setBackground(this, tintTypedArray0.getDrawable(styleable.ActionMode_background));
        this.k = tintTypedArray0.getResourceId(styleable.ActionMode_titleTextStyle, 0);
        this.l = tintTypedArray0.getResourceId(styleable.ActionMode_subtitleTextStyle, 0);
        this.mContentHeight = tintTypedArray0.getLayoutDimension(styleable.ActionMode_height, 0);
        this.n = tintTypedArray0.getResourceId(styleable.ActionMode_closeItemLayout, layout.abc_action_mode_close_item_material);
        tintTypedArray0.recycle();
    }

    public void animateToVisibility(int v) {
        this.setupAnimatorToVisibility(v, 200L).start();
    }

    public final void c() {
        if(this.h == null) {
            LayoutInflater.from(this.getContext()).inflate(layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout0 = (LinearLayout)this.getChildAt(this.getChildCount() - 1);
            this.h = linearLayout0;
            this.i = (TextView)linearLayout0.findViewById(id.action_bar_title);
            this.j = (TextView)this.h.findViewById(id.action_bar_subtitle);
            int v = this.k;
            if(v != 0) {
                this.i.setTextAppearance(this.getContext(), v);
            }
            int v1 = this.l;
            if(v1 != 0) {
                this.j.setTextAppearance(this.getContext(), v1);
            }
        }
        this.i.setText(this.c);
        this.j.setText(this.d);
        boolean z = TextUtils.isEmpty(this.c);
        boolean z1 = TextUtils.isEmpty(this.d);
        int v2 = 8;
        this.j.setVisibility((z1 ? 8 : 0));
        LinearLayout linearLayout1 = this.h;
        if(!z || !z1) {
            v2 = 0;
        }
        linearLayout1.setVisibility(v2);
        if(this.h.getParent() == null) {
            this.addView(this.h);
        }
    }

    public boolean canShowOverflowMenu() {
        return this.isOverflowReserved() && this.getVisibility() == 0;
    }

    public void closeMode() {
        if(this.e == null) {
            this.killMode();
        }
    }

    public void dismissPopupMenus() {
        o o0 = this.mActionMenuPresenter;
        if(o0 != null) {
            o0.h();
            f f0 = o0.p;
            if(f0 != null) {
                f0.dismiss();
            }
        }
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return new ViewGroup.MarginLayoutParams(this.getContext(), attributeSet0);
    }

    public int getAnimatedVisibility() {
        return this.mVisibilityAnim == null ? this.getVisibility() : this.mVisAnimListener.b;
    }

    public int getContentHeight() {
        return this.mContentHeight;
    }

    public CharSequence getSubtitle() {
        return this.d;
    }

    public CharSequence getTitle() {
        return this.c;
    }

    public boolean hideOverflowMenu() {
        return this.mActionMenuPresenter == null ? false : this.mActionMenuPresenter.h();
    }

    public void initForMode(ActionMode actionMode0) {
        View view0 = this.e;
        if(view0 == null) {
            View view1 = LayoutInflater.from(this.getContext()).inflate(this.n, this, false);
            this.e = view1;
            this.addView(view1);
        }
        else if(view0.getParent() == null) {
            this.addView(this.e);
        }
        View view2 = this.e.findViewById(id.action_mode_close_button);
        this.f = view2;
        view2.setOnClickListener(new d(actionMode0));
        MenuBuilder menuBuilder0 = (MenuBuilder)actionMode0.getMenu();
        o o0 = this.mActionMenuPresenter;
        if(o0 != null) {
            o0.h();
            f f0 = o0.p;
            if(f0 != null) {
                f0.dismiss();
            }
        }
        o o1 = new o(this.getContext());
        this.mActionMenuPresenter = o1;
        o1.h = true;
        o1.i = true;
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = new ViewGroup.LayoutParams(-2, -1);
        menuBuilder0.addMenuPresenter(this.mActionMenuPresenter, this.mPopupContext);
        ActionMenuView actionMenuView0 = (ActionMenuView)this.mActionMenuPresenter.getMenuView(this);
        this.mMenuView = actionMenuView0;
        ViewCompat.setBackground(actionMenuView0, null);
        this.addView(this.mMenuView, viewGroup$LayoutParams0);
    }

    // 去混淆评级： 低(20)
    public boolean isOverflowMenuShowPending() {
        return this.mActionMenuPresenter != null && (this.mActionMenuPresenter.q != null || this.mActionMenuPresenter.i());
    }

    public boolean isOverflowMenuShowing() {
        return this.mActionMenuPresenter == null ? false : this.mActionMenuPresenter.i();
    }

    public boolean isOverflowReserved() {
        return this.mActionMenuPresenter != null && this.mActionMenuPresenter.h;
    }

    public boolean isTitleOptional() {
        return this.m;
    }

    public void killMode() {
        this.removeAllViews();
        this.g = null;
        this.mMenuView = null;
        this.mActionMenuPresenter = null;
        View view0 = this.f;
        if(view0 != null) {
            view0.setOnClickListener(null);
        }
    }

    @Override  // android.view.ViewGroup
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o o0 = this.mActionMenuPresenter;
        if(o0 != null) {
            o0.h();
            f f0 = this.mActionMenuPresenter.p;
            if(f0 != null) {
                f0.dismiss();
            }
        }
    }

    @Override  // androidx.appcompat.widget.b
    public boolean onHoverEvent(MotionEvent motionEvent0) {
        super.onHoverEvent(motionEvent0);
        return true;
    }

    @Override  // android.view.ViewGroup
    public void onLayout(boolean z, int v, int v1, int v2, int v3) {
        boolean z1 = ViewUtils.isLayoutRtl(this);
        int v4 = z1 ? v2 - v - this.getPaddingRight() : this.getPaddingLeft();
        int v5 = this.getPaddingTop();
        int v6 = v3 - v1 - this.getPaddingTop() - this.getPaddingBottom();
        if(this.e != null && this.e.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)this.e.getLayoutParams();
            int v7 = z1 ? viewGroup$MarginLayoutParams0.leftMargin : viewGroup$MarginLayoutParams0.rightMargin;
            int v8 = b.next(v4, (z1 ? viewGroup$MarginLayoutParams0.rightMargin : viewGroup$MarginLayoutParams0.leftMargin), z1);
            v4 = b.next(v8 + this.positionChild(this.e, v8, v5, v6, z1), v7, z1);
        }
        int v9 = this.h == null || this.g != null || this.h.getVisibility() == 8 ? v4 : v4 + this.positionChild(this.h, v4, v5, v6, z1);
        View view0 = this.g;
        if(view0 != null) {
            this.positionChild(view0, v9, v5, v6, z1);
        }
        int v10 = z1 ? this.getPaddingLeft() : v2 - v - this.getPaddingRight();
        ActionMenuView actionMenuView0 = this.mMenuView;
        if(actionMenuView0 != null) {
            this.positionChild(actionMenuView0, v10, v5, v6, !z1);
        }
    }

    @Override  // android.view.View
    public void onMeasure(int v, int v1) {
        int v2 = 0x40000000;
        if(View.MeasureSpec.getMode(v) != 0x40000000) {
            throw new IllegalStateException(this.getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if(View.MeasureSpec.getMode(v1) == 0) {
            throw new IllegalStateException(this.getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int v3 = View.MeasureSpec.getSize(v);
        int v4 = this.mContentHeight > 0 ? this.mContentHeight : View.MeasureSpec.getSize(v1);
        int v5 = this.getPaddingTop();
        int v6 = this.getPaddingBottom() + v5;
        int v7 = v3 - this.getPaddingLeft() - this.getPaddingRight();
        int v8 = v4 - v6;
        int v9 = View.MeasureSpec.makeMeasureSpec(v8, 0x80000000);
        View view0 = this.e;
        if(view0 != null) {
            int v11 = this.measureChildView(view0, v7, v9, 0);
            ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)this.e.getLayoutParams();
            v7 = v11 - (viewGroup$MarginLayoutParams0.leftMargin + viewGroup$MarginLayoutParams0.rightMargin);
        }
        if(this.mMenuView != null && this.mMenuView.getParent() == this) {
            v7 = this.measureChildView(this.mMenuView, v7, v9, 0);
        }
        LinearLayout linearLayout0 = this.h;
        if(linearLayout0 != null && this.g == null) {
            if(this.m) {
                this.h.measure(0, v9);
                int v12 = this.h.getMeasuredWidth();
                boolean z = v12 <= v7;
                if(z) {
                    v7 -= v12;
                }
                this.h.setVisibility((z ? 0 : 8));
            }
            else {
                v7 = this.measureChildView(linearLayout0, v7, v9, 0);
            }
        }
        View view1 = this.g;
        if(view1 != null) {
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = view1.getLayoutParams();
            int v13 = viewGroup$LayoutParams0.width;
            if(v13 >= 0) {
                v7 = Math.min(v13, v7);
            }
            int v14 = viewGroup$LayoutParams0.height;
            if(v14 == -2) {
                v2 = 0x80000000;
            }
            if(v14 >= 0) {
                v8 = Math.min(v14, v8);
            }
            this.g.measure(View.MeasureSpec.makeMeasureSpec(v7, (v13 == -2 ? 0x80000000 : 0x40000000)), View.MeasureSpec.makeMeasureSpec(v8, v2));
        }
        if(this.mContentHeight <= 0) {
            int v15 = this.getChildCount();
            int v16 = 0;
            for(int v10 = 0; v10 < v15; ++v10) {
                int v17 = this.getChildAt(v10).getMeasuredHeight() + v6;
                if(v17 > v16) {
                    v16 = v17;
                }
            }
            this.setMeasuredDimension(v3, v16);
            return;
        }
        this.setMeasuredDimension(v3, v4);
    }

    @Override  // androidx.appcompat.widget.b
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        super.onTouchEvent(motionEvent0);
        return true;
    }

    public void postShowOverflowMenu() {
        this.post(new a(this, 0));
    }

    @Override  // androidx.appcompat.widget.b
    public void setContentHeight(int v) {
        this.mContentHeight = v;
    }

    public void setCustomView(View view0) {
        View view1 = this.g;
        if(view1 != null) {
            this.removeView(view1);
        }
        this.g = view0;
        if(view0 != null) {
            LinearLayout linearLayout0 = this.h;
            if(linearLayout0 != null) {
                this.removeView(linearLayout0);
                this.h = null;
            }
        }
        if(view0 != null) {
            this.addView(view0);
        }
        this.requestLayout();
    }

    public void setSubtitle(CharSequence charSequence0) {
        this.d = charSequence0;
        this.c();
    }

    public void setTitle(CharSequence charSequence0) {
        this.c = charSequence0;
        this.c();
        ViewCompat.setAccessibilityPaneTitle(this, charSequence0);
    }

    public void setTitleOptional(boolean z) {
        if(z != this.m) {
            this.requestLayout();
        }
        this.m = z;
    }

    @Override  // androidx.appcompat.widget.b
    public void setVisibility(int v) {
        super.setVisibility(v);
    }

    public ViewPropertyAnimatorCompat setupAnimatorToVisibility(int v, long v1) {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat1;
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat0 = this.mVisibilityAnim;
        if(viewPropertyAnimatorCompat0 != null) {
            viewPropertyAnimatorCompat0.cancel();
        }
        if(v == 0) {
            if(this.getVisibility() != 0) {
                this.setAlpha(0.0f);
            }
            viewPropertyAnimatorCompat1 = ViewCompat.animate(this).alpha(1.0f);
            viewPropertyAnimatorCompat1.setDuration(v1);
            viewPropertyAnimatorCompat1.setListener(this.mVisAnimListener.withFinalVisibility(viewPropertyAnimatorCompat1, 0));
            return viewPropertyAnimatorCompat1;
        }
        viewPropertyAnimatorCompat1 = ViewCompat.animate(this).alpha(0.0f);
        viewPropertyAnimatorCompat1.setDuration(v1);
        viewPropertyAnimatorCompat1.setListener(this.mVisAnimListener.withFinalVisibility(viewPropertyAnimatorCompat1, v));
        return viewPropertyAnimatorCompat1;
    }

    @Override  // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public boolean showOverflowMenu() {
        return this.mActionMenuPresenter == null ? false : this.mActionMenuPresenter.l();
    }
}

