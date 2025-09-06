package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.MenuBuilder.ItemInvoker;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter.Callback;
import androidx.appcompat.view.menu.MenuView;

public class ActionMenuView extends LinearLayoutCompat implements ItemInvoker, MenuView {
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public interface ActionMenuChildView {
        boolean needsDividerAfter();

        boolean needsDividerBefore();
    }

    public static class LayoutParams extends androidx.appcompat.widget.LinearLayoutCompat.LayoutParams {
        public boolean a;
        @ViewDebug.ExportedProperty
        public int cellsUsed;
        @ViewDebug.ExportedProperty
        public boolean expandable;
        @ViewDebug.ExportedProperty
        public int extraPixels;
        @ViewDebug.ExportedProperty
        public boolean isOverflowButton;
        @ViewDebug.ExportedProperty
        public boolean preventEdgeOffset;

        public LayoutParams(int v, int v1) {
            super(v, v1);
            this.isOverflowButton = false;
        }

        public LayoutParams(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
        }

        public LayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            super(viewGroup$LayoutParams0);
        }

        public LayoutParams(LayoutParams actionMenuView$LayoutParams0) {
            super(actionMenuView$LayoutParams0);
            this.isOverflowButton = actionMenuView$LayoutParams0.isOverflowButton;
        }
    }

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem arg1);
    }

    public OnMenuItemClickListener A;
    public MenuBuilder p;
    public Context q;
    public int r;
    public boolean s;
    public o t;
    public Callback u;
    public androidx.appcompat.view.menu.MenuBuilder.Callback v;
    public boolean w;
    public int x;
    public final int y;
    public final int z;

    public ActionMenuView(@NonNull Context context0) {
        this(context0, null);
    }

    public ActionMenuView(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.setBaselineAligned(false);
        DisplayMetrics displayMetrics0 = context0.getResources().getDisplayMetrics();
        this.y = (int)(56.0f * displayMetrics0.density);
        this.z = (int)(displayMetrics0.density * 4.0f);
        this.q = context0;
        this.r = 0;
    }

    @Override  // androidx.appcompat.widget.LinearLayoutCompat
    public boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof LayoutParams;
    }

    public void dismissPopupMenus() {
        o o0 = this.t;
        if(o0 != null) {
            o0.h();
            f f0 = o0.p;
            if(f0 != null) {
                f0.dismiss();
            }
        }
    }

    @Override  // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent0) {
        return false;
    }

    @Override  // androidx.appcompat.widget.LinearLayoutCompat
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return this.generateDefaultLayoutParams();
    }

    public LayoutParams generateDefaultLayoutParams() {
        LayoutParams actionMenuView$LayoutParams0 = new LayoutParams(-2, -2);
        actionMenuView$LayoutParams0.gravity = 16;
        return actionMenuView$LayoutParams0;
    }

    @Override  // androidx.appcompat.widget.LinearLayoutCompat
    public androidx.appcompat.widget.LinearLayoutCompat.LayoutParams generateDefaultLayoutParams() {
        return this.generateDefaultLayoutParams();
    }

    @Override  // androidx.appcompat.widget.LinearLayoutCompat
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return this.generateLayoutParams(attributeSet0);
    }

    @Override  // androidx.appcompat.widget.LinearLayoutCompat
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return this.generateLayoutParams(viewGroup$LayoutParams0);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return new LayoutParams(this.getContext(), attributeSet0);
    }

    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(viewGroup$LayoutParams0 != null) {
            LayoutParams actionMenuView$LayoutParams0 = viewGroup$LayoutParams0 instanceof LayoutParams ? new LayoutParams(((LayoutParams)viewGroup$LayoutParams0)) : new LayoutParams(viewGroup$LayoutParams0);
            if(actionMenuView$LayoutParams0.gravity <= 0) {
                actionMenuView$LayoutParams0.gravity = 16;
            }
            return actionMenuView$LayoutParams0;
        }
        return this.generateDefaultLayoutParams();
    }

    @Override  // androidx.appcompat.widget.LinearLayoutCompat
    public androidx.appcompat.widget.LinearLayoutCompat.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return this.generateLayoutParams(attributeSet0);
    }

    @Override  // androidx.appcompat.widget.LinearLayoutCompat
    public androidx.appcompat.widget.LinearLayoutCompat.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return this.generateLayoutParams(viewGroup$LayoutParams0);
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public LayoutParams generateOverflowButtonLayoutParams() {
        LayoutParams actionMenuView$LayoutParams0 = this.generateDefaultLayoutParams();
        actionMenuView$LayoutParams0.isOverflowButton = true;
        return actionMenuView$LayoutParams0;
    }

    public Menu getMenu() {
        if(this.p == null) {
            Context context0 = this.getContext();
            MenuBuilder menuBuilder0 = new MenuBuilder(context0);
            this.p = menuBuilder0;
            menuBuilder0.setCallback(new q(this));
            o o0 = new o(context0);
            this.t = o0;
            o0.h = true;
            o0.i = true;
            Callback menuPresenter$Callback0 = this.u;
            if(menuPresenter$Callback0 == null) {
                menuPresenter$Callback0 = new p();  // 初始化器: Ljava/lang/Object;-><init>()V
            }
            o0.setCallback(menuPresenter$Callback0);
            this.p.addMenuPresenter(this.t, this.q);
            this.t.k(this);
        }
        return this.p;
    }

    @Nullable
    public Drawable getOverflowIcon() {
        this.getMenu();
        o o0 = this.t;
        j j0 = o0.e;
        if(j0 != null) {
            return j0.getDrawable();
        }
        return o0.g ? o0.f : null;
    }

    public int getPopupTheme() {
        return this.r;
    }

    @Override  // androidx.appcompat.view.menu.MenuView
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public int getWindowAnimations() {
        return 0;
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public boolean hasSupportDividerBeforeChildAt(int v) {
        boolean z = false;
        if(v == 0) {
            return false;
        }
        View view0 = this.getChildAt(v - 1);
        View view1 = this.getChildAt(v);
        if(v < this.getChildCount() && view0 instanceof ActionMenuChildView) {
            z = ((ActionMenuChildView)view0).needsDividerAfter();
        }
        return v > 0 && view1 instanceof ActionMenuChildView ? z | ((ActionMenuChildView)view1).needsDividerBefore() : z;
    }

    public boolean hideOverflowMenu() {
        return this.t != null && this.t.h();
    }

    @Override  // androidx.appcompat.view.menu.MenuView
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void initialize(MenuBuilder menuBuilder0) {
        this.p = menuBuilder0;
    }

    @Override  // androidx.appcompat.view.menu.MenuBuilder$ItemInvoker
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public boolean invokeItem(MenuItemImpl menuItemImpl0) {
        return this.p.performItemAction(menuItemImpl0, 0);
    }

    // 去混淆评级： 低(20)
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public boolean isOverflowMenuShowPending() {
        return this.t != null && (this.t.q != null || this.t.i());
    }

    public boolean isOverflowMenuShowing() {
        return this.t != null && this.t.i();
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public boolean isOverflowReserved() {
        return this.s;
    }

    @Override  // android.view.View
    public void onConfigurationChanged(Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        o o0 = this.t;
        if(o0 != null) {
            o0.updateMenuView(false);
            if(this.t.i()) {
                this.t.h();
                this.t.l();
            }
        }
    }

    @Override  // android.view.ViewGroup
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.dismissPopupMenus();
    }

    @Override  // androidx.appcompat.widget.LinearLayoutCompat
    public void onLayout(boolean z, int v, int v1, int v2, int v3) {
        int v15;
        int v14;
        if(!this.w) {
            super.onLayout(z, v, v1, v2, v3);
            return;
        }
        int v4 = this.getChildCount();
        int v5 = (v3 - v1) / 2;
        int v6 = this.getDividerWidth();
        int v7 = v2 - v;
        int v8 = v7 - this.getPaddingRight() - this.getPaddingLeft();
        boolean z1 = ViewUtils.isLayoutRtl(this);
        int v10 = 0;
        int v11 = 0;
        for(int v9 = 0; v9 < v4; ++v9) {
            View view0 = this.getChildAt(v9);
            if(view0.getVisibility() != 8) {
                LayoutParams actionMenuView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                if(actionMenuView$LayoutParams0.isOverflowButton) {
                    int v12 = view0.getMeasuredWidth();
                    if(this.hasSupportDividerBeforeChildAt(v9)) {
                        v12 += v6;
                    }
                    int v13 = view0.getMeasuredHeight();
                    if(z1) {
                        v14 = this.getPaddingLeft() + actionMenuView$LayoutParams0.leftMargin;
                        v15 = v14 + v12;
                    }
                    else {
                        v15 = this.getWidth() - this.getPaddingRight() - actionMenuView$LayoutParams0.rightMargin;
                        v14 = v15 - v12;
                    }
                    int v16 = v5 - v13 / 2;
                    view0.layout(v14, v16, v15, v13 + v16);
                    v8 -= v12;
                    v10 = 1;
                }
                else {
                    v8 -= view0.getMeasuredWidth() + actionMenuView$LayoutParams0.leftMargin + actionMenuView$LayoutParams0.rightMargin;
                    this.hasSupportDividerBeforeChildAt(v9);
                    ++v11;
                }
            }
        }
        if(v4 == 1 && v10 == 0) {
            View view1 = this.getChildAt(0);
            int v17 = view1.getMeasuredWidth();
            int v18 = view1.getMeasuredHeight();
            int v19 = v7 / 2 - v17 / 2;
            int v20 = v5 - v18 / 2;
            view1.layout(v19, v20, v17 + v19, v18 + v20);
            return;
        }
        int v21 = v11 - (v10 ^ 1);
        int v22 = Math.max(0, (v21 <= 0 ? 0 : v8 / v21));
        if(z1) {
            int v23 = this.getWidth() - this.getPaddingRight();
            for(int v24 = 0; v24 < v4; ++v24) {
                View view2 = this.getChildAt(v24);
                LayoutParams actionMenuView$LayoutParams1 = (LayoutParams)view2.getLayoutParams();
                if(view2.getVisibility() != 8 && !actionMenuView$LayoutParams1.isOverflowButton) {
                    int v25 = v23 - actionMenuView$LayoutParams1.rightMargin;
                    int v26 = view2.getMeasuredWidth();
                    int v27 = view2.getMeasuredHeight();
                    int v28 = v5 - v27 / 2;
                    view2.layout(v25 - v26, v28, v25, v27 + v28);
                    v23 = v25 - (v26 + actionMenuView$LayoutParams1.leftMargin + v22);
                }
            }
            return;
        }
        int v29 = this.getPaddingLeft();
        for(int v30 = 0; v30 < v4; ++v30) {
            View view3 = this.getChildAt(v30);
            LayoutParams actionMenuView$LayoutParams2 = (LayoutParams)view3.getLayoutParams();
            if(view3.getVisibility() != 8 && !actionMenuView$LayoutParams2.isOverflowButton) {
                int v31 = v29 + actionMenuView$LayoutParams2.leftMargin;
                int v32 = view3.getMeasuredWidth();
                int v33 = view3.getMeasuredHeight();
                int v34 = v5 - v33 / 2;
                view3.layout(v31, v34, v31 + v32, v33 + v34);
                v29 = v32 + actionMenuView$LayoutParams2.rightMargin + v22 + v31;
            }
        }
    }

    @Override  // androidx.appcompat.widget.LinearLayoutCompat
    public void onMeasure(int v, int v1) {
        int v48;
        int v47;
        int v46;
        int v41;
        int v40;
        int v36;
        int v29;
        int v25;
        int v24;
        int v23;
        boolean z = this.w;
        boolean z1 = View.MeasureSpec.getMode(v) == 0x40000000;
        this.w = z1;
        if(z != z1) {
            this.x = 0;
        }
        int v2 = View.MeasureSpec.getSize(v);
        if(this.w) {
            MenuBuilder menuBuilder0 = this.p;
            if(menuBuilder0 != null && v2 != this.x) {
                this.x = v2;
                menuBuilder0.onItemsChanged(true);
            }
        }
        int v3 = this.getChildCount();
        if(this.w && v3 > 0) {
            int v4 = View.MeasureSpec.getMode(v1);
            int v5 = View.MeasureSpec.getSize(v);
            int v6 = View.MeasureSpec.getSize(v1);
            int v7 = this.getPaddingLeft();
            int v8 = this.getPaddingRight();
            int v9 = this.getPaddingTop();
            int v10 = this.getPaddingBottom() + v9;
            int v11 = ViewGroup.getChildMeasureSpec(v1, v10, -2);
            int v12 = v5 - (v8 + v7);
            int v13 = this.y;
            int v14 = v12 / v13;
            if(v14 == 0) {
                this.setMeasuredDimension(v12, 0);
                return;
            }
            int v15 = v12 % v13 / v14 + v13;
            int v16 = this.getChildCount();
            int v17 = 0;
            int v18 = 0;
            int v19 = 0;
            int v20 = 0;
            boolean z2 = false;
            int v21 = 0;
            long v22 = 0L;
            while(true) {
                v23 = this.z;
                if(v20 >= v16) {
                    break;
                }
                View view0 = this.getChildAt(v20);
                if(view0.getVisibility() == 8) {
                    v24 = v4;
                    v25 = v10;
                }
                else {
                    if(view0 instanceof ActionMenuItemView) {
                        view0.setPadding(v23, 0, v23, 0);
                    }
                    LayoutParams actionMenuView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                    actionMenuView$LayoutParams0.a = false;
                    actionMenuView$LayoutParams0.extraPixels = 0;
                    actionMenuView$LayoutParams0.cellsUsed = 0;
                    actionMenuView$LayoutParams0.expandable = false;
                    actionMenuView$LayoutParams0.leftMargin = 0;
                    actionMenuView$LayoutParams0.rightMargin = 0;
                    actionMenuView$LayoutParams0.preventEdgeOffset = view0 instanceof ActionMenuItemView && ((ActionMenuItemView)view0).hasText();
                    int v26 = actionMenuView$LayoutParams0.isOverflowButton ? 1 : v14;
                    ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
                    v24 = v4;
                    v25 = v10;
                    int v27 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(v11) - v10, View.MeasureSpec.getMode(v11));
                    ActionMenuItemView actionMenuItemView0 = view0 instanceof ActionMenuItemView ? ((ActionMenuItemView)view0) : null;
                    boolean z3 = actionMenuItemView0 != null && actionMenuItemView0.hasText();
                    if(v26 <= 0 || z3 && v26 < 2) {
                        v29 = 0;
                    }
                    else {
                        view0.measure(View.MeasureSpec.makeMeasureSpec(v26 * v15, 0x80000000), v27);
                        int v28 = view0.getMeasuredWidth();
                        v29 = v28 / v15;
                        if(v28 % v15 != 0) {
                            ++v29;
                        }
                        if(z3 && v29 < 2) {
                            v29 = 2;
                        }
                    }
                    ((LayoutParams)viewGroup$LayoutParams0).expandable = !((LayoutParams)viewGroup$LayoutParams0).isOverflowButton && z3;
                    ((LayoutParams)viewGroup$LayoutParams0).cellsUsed = v29;
                    view0.measure(View.MeasureSpec.makeMeasureSpec(v29 * v15, 0x40000000), v27);
                    v19 = Math.max(v19, v29);
                    if(actionMenuView$LayoutParams0.expandable) {
                        ++v21;
                    }
                    if(actionMenuView$LayoutParams0.isOverflowButton) {
                        z2 = true;
                    }
                    v14 -= v29;
                    v17 = Math.max(v17, view0.getMeasuredHeight());
                    if(v29 == 1) {
                        v22 |= (long)(1 << v20);
                    }
                    ++v18;
                }
                ++v20;
                v10 = v25;
                v4 = v24;
            }
            int v30 = 0;
            while(true) {
                if(v21 <= 0 || v14 <= 0) {
                    goto label_128;
                }
                int v31 = 0x7FFFFFFF;
                int v32 = 0;
                long v34 = 0L;
                for(int v33 = 0; v33 < v16; ++v33) {
                    LayoutParams actionMenuView$LayoutParams1 = (LayoutParams)this.getChildAt(v33).getLayoutParams();
                    if(actionMenuView$LayoutParams1.expandable) {
                        int v35 = actionMenuView$LayoutParams1.cellsUsed;
                        if(v35 < v31) {
                            v34 = 1L << v33;
                            v31 = v35;
                            v32 = 1;
                        }
                        else if(v35 == v31) {
                            v34 |= 1L << v33;
                            ++v32;
                        }
                    }
                }
                v36 = v30;
                v22 |= v34;
                if(v32 <= v14) {
                    int v37 = v31 + 1;
                    for(int v38 = 0; v38 < v16; ++v38) {
                        View view1 = this.getChildAt(v38);
                        LayoutParams actionMenuView$LayoutParams2 = (LayoutParams)view1.getLayoutParams();
                        if((v34 & ((long)(1 << v38))) != 0L) {
                            if(z2 && v18 == 2 && actionMenuView$LayoutParams2.preventEdgeOffset && v14 == 1) {
                                view1.setPadding(v23 + v15, 0, v23, 0);
                            }
                            ++actionMenuView$LayoutParams2.cellsUsed;
                            actionMenuView$LayoutParams2.a = true;
                            --v14;
                        }
                        else if(actionMenuView$LayoutParams2.cellsUsed == v37) {
                            v22 |= (long)(1 << v38);
                        }
                    }
                    v30 = 1;
                    continue;
                label_128:
                    v36 = v30;
                }
                break;
            }
            int v39 = v11;
            boolean z4 = !z2 && v18 == 1;
            if(v14 > 0 && v22 != 0L && (v14 < v18 - 1 || z4 || v19 > 1)) {
                float f = (float)Long.bitCount(v22);
                if(!z4) {
                    if(Long.compare(v22 & 1L, 0L) != 0 && !((LayoutParams)this.getChildAt(0).getLayoutParams()).preventEdgeOffset) {
                        f -= 0.5f;
                    }
                    if((v22 & ((long)(1 << v16 - 1))) != 0L && !((LayoutParams)this.getChildAt(v16 - 1).getLayoutParams()).preventEdgeOffset) {
                        f -= 0.5f;
                    }
                }
                int v42 = f > 0.0f ? ((int)(((float)(v14 * v15)) / f)) : 0;
                int v43 = v36;
                v40 = v16;
                for(int v44 = 0; v44 < v40; ++v44) {
                    if((v22 & ((long)(1 << v44))) != 0L) {
                        View view2 = this.getChildAt(v44);
                        LayoutParams actionMenuView$LayoutParams3 = (LayoutParams)view2.getLayoutParams();
                        if(view2 instanceof ActionMenuItemView) {
                            actionMenuView$LayoutParams3.extraPixels = v42;
                            actionMenuView$LayoutParams3.a = true;
                            if(v44 == 0 && !actionMenuView$LayoutParams3.preventEdgeOffset) {
                                actionMenuView$LayoutParams3.leftMargin = -v42 / 2;
                            }
                            v43 = 1;
                        }
                        else if(actionMenuView$LayoutParams3.isOverflowButton) {
                            actionMenuView$LayoutParams3.extraPixels = v42;
                            actionMenuView$LayoutParams3.a = true;
                            actionMenuView$LayoutParams3.rightMargin = -v42 / 2;
                            v43 = 1;
                        }
                        else {
                            if(v44 != 0) {
                                actionMenuView$LayoutParams3.leftMargin = v42 / 2;
                            }
                            if(v44 != v40 - 1) {
                                actionMenuView$LayoutParams3.rightMargin = v42 / 2;
                            }
                        }
                    }
                }
                v41 = v43;
            }
            else {
                v40 = v16;
                v41 = v36;
            }
            if(v41 != 0) {
                int v45 = 0;
                while(v45 < v40) {
                    View view3 = this.getChildAt(v45);
                    LayoutParams actionMenuView$LayoutParams4 = (LayoutParams)view3.getLayoutParams();
                    if(actionMenuView$LayoutParams4.a) {
                        v46 = v39;
                        view3.measure(View.MeasureSpec.makeMeasureSpec(actionMenuView$LayoutParams4.cellsUsed * v15 + actionMenuView$LayoutParams4.extraPixels, 0x40000000), v46);
                    }
                    else {
                        v46 = v39;
                    }
                    ++v45;
                    v39 = v46;
                }
            }
            if(v4 == 0x40000000) {
                v48 = v6;
                v47 = v12;
            }
            else {
                v47 = v12;
                v48 = v17;
            }
            this.setMeasuredDimension(v47, v48);
            return;
        }
        for(int v49 = 0; v49 < v3; ++v49) {
            LayoutParams actionMenuView$LayoutParams5 = (LayoutParams)this.getChildAt(v49).getLayoutParams();
            actionMenuView$LayoutParams5.rightMargin = 0;
            actionMenuView$LayoutParams5.leftMargin = 0;
        }
        super.onMeasure(v, v1);
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public MenuBuilder peekMenu() {
        return this.p;
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void setExpandedActionViewsExclusive(boolean z) {
        this.t.m = z;
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void setMenuCallbacks(Callback menuPresenter$Callback0, androidx.appcompat.view.menu.MenuBuilder.Callback menuBuilder$Callback0) {
        this.u = menuPresenter$Callback0;
        this.v = menuBuilder$Callback0;
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener actionMenuView$OnMenuItemClickListener0) {
        this.A = actionMenuView$OnMenuItemClickListener0;
    }

    public void setOverflowIcon(@Nullable Drawable drawable0) {
        this.getMenu();
        o o0 = this.t;
        j j0 = o0.e;
        if(j0 != null) {
            j0.setImageDrawable(drawable0);
            return;
        }
        o0.g = true;
        o0.f = drawable0;
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void setOverflowReserved(boolean z) {
        this.s = z;
    }

    public void setPopupTheme(@StyleRes int v) {
        if(this.r != v) {
            this.r = v;
            if(v == 0) {
                this.q = this.getContext();
                return;
            }
            this.q = new ContextThemeWrapper(this.getContext(), v);
        }
    }

    @RestrictTo({Scope.LIBRARY})
    public void setPresenter(o o0) {
        this.t = o0;
        o0.k(this);
    }

    public boolean showOverflowMenu() {
        return this.t != null && this.t.l();
    }
}

