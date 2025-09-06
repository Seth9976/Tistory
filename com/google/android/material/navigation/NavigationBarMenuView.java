package com.google.android.material.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuView;
import androidx.core.util.Pools.SynchronizedPool;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;
import com.google.android.material.R.attr;
import com.google.android.material.R.integer;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.internal.TextScale;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.util.HashSet;
import y7.c;

@RestrictTo({Scope.LIBRARY_GROUP})
public abstract class NavigationBarMenuView extends ViewGroup implements MenuView {
    public ShapeAppearanceModel A;
    public boolean B;
    public ColorStateList C;
    public NavigationBarPresenter D;
    public MenuBuilder E;
    public static final int[] F;
    public static final int[] G;
    public final AutoTransition a;
    public final c b;
    public final SynchronizedPool c;
    public final SparseArray d;
    public int e;
    public NavigationBarItemView[] f;
    public int g;
    public int h;
    public ColorStateList i;
    public int j;
    public ColorStateList k;
    public final ColorStateList l;
    public int m;
    public int n;
    public boolean o;
    public Drawable p;
    public ColorStateList q;
    public int r;
    public final SparseArray s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public int x;
    public int y;
    public int z;

    static {
        NavigationBarMenuView.F = new int[]{0x10100A0};
        NavigationBarMenuView.G = new int[]{0xFEFEFF62};
    }

    public NavigationBarMenuView(@NonNull Context context0) {
        super(context0);
        this.c = new SynchronizedPool(5);
        this.d = new SparseArray(5);
        this.g = 0;
        this.h = 0;
        this.s = new SparseArray(5);
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.B = false;
        this.l = this.createDefaultColorStateList(0x1010038);
        if(this.isInEditMode()) {
            this.a = null;
        }
        else {
            AutoTransition autoTransition0 = new AutoTransition();
            this.a = autoTransition0;
            autoTransition0.setOrdering(0);
            autoTransition0.setDuration(((long)MotionUtils.resolveThemeDuration(this.getContext(), attr.motionDurationMedium4, this.getResources().getInteger(integer.material_motion_duration_long_1))));
            autoTransition0.setInterpolator(MotionUtils.resolveThemeInterpolator(this.getContext(), attr.motionEasingStandard, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
            autoTransition0.addTransition(new TextScale());
        }
        this.b = new c(this);
        ViewCompat.setImportantForAccessibility(this, 1);
    }

    public final MaterialShapeDrawable a() {
        if(this.A != null && this.C != null) {
            MaterialShapeDrawable materialShapeDrawable0 = new MaterialShapeDrawable(this.A);
            materialShapeDrawable0.setFillColor(this.C);
            return materialShapeDrawable0;
        }
        return null;
    }

    public static void b(int v) {
        if(v == -1) {
            throw new IllegalArgumentException(-1 + " is not a valid view id");
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void buildMenuView() {
        this.removeAllViews();
        NavigationBarItemView[] arr_navigationBarItemView = this.f;
        if(arr_navigationBarItemView != null) {
            for(int v = 0; v < arr_navigationBarItemView.length; ++v) {
                NavigationBarItemView navigationBarItemView0 = arr_navigationBarItemView[v];
                if(navigationBarItemView0 != null) {
                    this.c.release(navigationBarItemView0);
                    if(navigationBarItemView0.F != null) {
                        ImageView imageView0 = navigationBarItemView0.n;
                        if(imageView0 != null) {
                            navigationBarItemView0.setClipChildren(true);
                            navigationBarItemView0.setClipToPadding(true);
                            BadgeUtils.detachBadgeDrawable(navigationBarItemView0.F, imageView0);
                        }
                        navigationBarItemView0.F = null;
                    }
                    navigationBarItemView0.t = null;
                    navigationBarItemView0.z = 0.0f;
                    navigationBarItemView0.a = false;
                }
            }
        }
        if(this.E.size() == 0) {
            this.g = 0;
            this.h = 0;
            this.f = null;
            return;
        }
        HashSet hashSet0 = new HashSet();
        for(int v1 = 0; v1 < this.E.size(); ++v1) {
            hashSet0.add(this.E.getItem(v1).getItemId());
        }
        for(int v2 = 0; true; ++v2) {
            SparseArray sparseArray0 = this.s;
            if(v2 >= sparseArray0.size()) {
                break;
            }
            int v3 = sparseArray0.keyAt(v2);
            if(!hashSet0.contains(v3)) {
                sparseArray0.delete(v3);
            }
        }
        this.f = new NavigationBarItemView[this.E.size()];
        boolean z = this.isShifting(this.e, this.E.getVisibleItems().size());
        for(int v4 = 0; v4 < this.E.size(); ++v4) {
            this.D.setUpdateSuspended(true);
            this.E.getItem(v4).setCheckable(true);
            this.D.setUpdateSuspended(false);
            NavigationBarItemView navigationBarItemView1 = this.getNewItem();
            this.f[v4] = navigationBarItemView1;
            navigationBarItemView1.setIconTintList(this.i);
            navigationBarItemView1.setIconSize(this.j);
            navigationBarItemView1.setTextColor(this.l);
            navigationBarItemView1.setTextAppearanceInactive(this.m);
            navigationBarItemView1.setTextAppearanceActive(this.n);
            navigationBarItemView1.setTextAppearanceActiveBoldEnabled(this.o);
            navigationBarItemView1.setTextColor(this.k);
            int v5 = this.t;
            if(v5 != -1) {
                navigationBarItemView1.setItemPaddingTop(v5);
            }
            int v6 = this.u;
            if(v6 != -1) {
                navigationBarItemView1.setItemPaddingBottom(v6);
            }
            int v7 = this.v;
            if(v7 != -1) {
                navigationBarItemView1.setActiveIndicatorLabelPadding(v7);
            }
            navigationBarItemView1.setActiveIndicatorWidth(this.x);
            navigationBarItemView1.setActiveIndicatorHeight(this.y);
            navigationBarItemView1.setActiveIndicatorMarginHorizontal(this.z);
            navigationBarItemView1.setActiveIndicatorDrawable(this.a());
            navigationBarItemView1.setActiveIndicatorResizeable(this.B);
            navigationBarItemView1.setActiveIndicatorEnabled(this.w);
            Drawable drawable0 = this.p;
            if(drawable0 == null) {
                navigationBarItemView1.setItemBackground(this.r);
            }
            else {
                navigationBarItemView1.setItemBackground(drawable0);
            }
            navigationBarItemView1.setItemRippleColor(this.q);
            navigationBarItemView1.setShifting(z);
            navigationBarItemView1.setLabelVisibilityMode(this.e);
            MenuItemImpl menuItemImpl0 = (MenuItemImpl)this.E.getItem(v4);
            navigationBarItemView1.initialize(menuItemImpl0, 0);
            navigationBarItemView1.setItemPosition(v4);
            int v8 = menuItemImpl0.getItemId();
            navigationBarItemView1.setOnTouchListener(((View.OnTouchListener)this.d.get(v8)));
            navigationBarItemView1.setOnClickListener(this.b);
            if(this.g != 0 && v8 == this.g) {
                this.h = v4;
            }
            this.setBadgeIfNeeded(navigationBarItemView1);
            this.addView(navigationBarItemView1);
        }
        int v9 = Math.min(this.E.size() - 1, this.h);
        this.h = v9;
        this.E.getItem(v9).setChecked(true);
    }

    @Nullable
    public ColorStateList createDefaultColorStateList(int v) {
        TypedValue typedValue0 = new TypedValue();
        if(!this.getContext().getTheme().resolveAttribute(v, typedValue0, true)) {
            return null;
        }
        ColorStateList colorStateList0 = AppCompatResources.getColorStateList(this.getContext(), typedValue0.resourceId);
        if(!this.getContext().getTheme().resolveAttribute(androidx.appcompat.R.attr.colorPrimary, typedValue0, true)) {
            return null;
        }
        int v1 = typedValue0.data;
        int v2 = colorStateList0.getDefaultColor();
        return new ColorStateList(new int[][]{NavigationBarMenuView.G, NavigationBarMenuView.F, ViewGroup.EMPTY_STATE_SET}, new int[]{colorStateList0.getColorForState(NavigationBarMenuView.G, v2), v1, v2});
    }

    @NonNull
    public abstract NavigationBarItemView createNavigationBarItemView(@NonNull Context arg1);

    @Nullable
    public NavigationBarItemView findItemView(int v) {
        NavigationBarMenuView.b(v);
        NavigationBarItemView[] arr_navigationBarItemView = this.f;
        if(arr_navigationBarItemView != null) {
            for(int v1 = 0; v1 < arr_navigationBarItemView.length; ++v1) {
                NavigationBarItemView navigationBarItemView0 = arr_navigationBarItemView[v1];
                if(navigationBarItemView0.getId() == v) {
                    return navigationBarItemView0;
                }
            }
        }
        return null;
    }

    @Px
    public int getActiveIndicatorLabelPadding() {
        return this.v;
    }

    @Nullable
    public BadgeDrawable getBadge(int v) {
        return (BadgeDrawable)this.s.get(v);
    }

    public SparseArray getBadgeDrawables() {
        return this.s;
    }

    @Nullable
    public ColorStateList getIconTintList() {
        return this.i;
    }

    @Nullable
    public ColorStateList getItemActiveIndicatorColor() {
        return this.C;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.w;
    }

    @Px
    public int getItemActiveIndicatorHeight() {
        return this.y;
    }

    @Px
    public int getItemActiveIndicatorMarginHorizontal() {
        return this.z;
    }

    @Nullable
    public ShapeAppearanceModel getItemActiveIndicatorShapeAppearance() {
        return this.A;
    }

    @Px
    public int getItemActiveIndicatorWidth() {
        return this.x;
    }

    @Nullable
    public Drawable getItemBackground() {
        return this.f == null || this.f.length <= 0 ? this.p : this.f[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.r;
    }

    @Dimension
    public int getItemIconSize() {
        return this.j;
    }

    @Px
    public int getItemPaddingBottom() {
        return this.u;
    }

    @Px
    public int getItemPaddingTop() {
        return this.t;
    }

    @Nullable
    public ColorStateList getItemRippleColor() {
        return this.q;
    }

    @StyleRes
    public int getItemTextAppearanceActive() {
        return this.n;
    }

    @StyleRes
    public int getItemTextAppearanceInactive() {
        return this.m;
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.k;
    }

    public int getLabelVisibilityMode() {
        return this.e;
    }

    @Nullable
    public MenuBuilder getMenu() {
        return this.E;
    }

    private NavigationBarItemView getNewItem() {
        NavigationBarItemView navigationBarItemView0 = (NavigationBarItemView)this.c.acquire();
        return navigationBarItemView0 == null ? this.createNavigationBarItemView(this.getContext()) : navigationBarItemView0;
    }

    public int getSelectedItemId() {
        return this.g;
    }

    public int getSelectedItemPosition() {
        return this.h;
    }

    @Override  // androidx.appcompat.view.menu.MenuView
    public int getWindowAnimations() {
        return 0;
    }

    @Override  // androidx.appcompat.view.menu.MenuView
    public void initialize(@NonNull MenuBuilder menuBuilder0) {
        this.E = menuBuilder0;
    }

    public boolean isItemActiveIndicatorResizeable() {
        return this.B;
    }

    public boolean isShifting(int v, int v1) {
        return v == -1 ? v1 > 3 : v == 0;
    }

    @Override  // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo0).setCollectionInfo(CollectionInfoCompat.obtain(1, this.E.getVisibleItems().size(), false, 1));
    }

    public void setActiveIndicatorLabelPadding(@Px int v) {
        this.v = v;
        NavigationBarItemView[] arr_navigationBarItemView = this.f;
        if(arr_navigationBarItemView != null) {
            for(int v1 = 0; v1 < arr_navigationBarItemView.length; ++v1) {
                arr_navigationBarItemView[v1].setActiveIndicatorLabelPadding(v);
            }
        }
    }

    private void setBadgeIfNeeded(@NonNull NavigationBarItemView navigationBarItemView0) {
        int v = navigationBarItemView0.getId();
        if(v != -1) {
            BadgeDrawable badgeDrawable0 = (BadgeDrawable)this.s.get(v);
            if(badgeDrawable0 != null) {
                navigationBarItemView0.setBadge(badgeDrawable0);
            }
        }
    }

    public void setIconTintList(@Nullable ColorStateList colorStateList0) {
        this.i = colorStateList0;
        NavigationBarItemView[] arr_navigationBarItemView = this.f;
        if(arr_navigationBarItemView != null) {
            for(int v = 0; v < arr_navigationBarItemView.length; ++v) {
                arr_navigationBarItemView[v].setIconTintList(colorStateList0);
            }
        }
    }

    public void setItemActiveIndicatorColor(@Nullable ColorStateList colorStateList0) {
        this.C = colorStateList0;
        NavigationBarItemView[] arr_navigationBarItemView = this.f;
        if(arr_navigationBarItemView != null) {
            for(int v = 0; v < arr_navigationBarItemView.length; ++v) {
                arr_navigationBarItemView[v].setActiveIndicatorDrawable(this.a());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.w = z;
        NavigationBarItemView[] arr_navigationBarItemView = this.f;
        if(arr_navigationBarItemView != null) {
            for(int v = 0; v < arr_navigationBarItemView.length; ++v) {
                arr_navigationBarItemView[v].setActiveIndicatorEnabled(z);
            }
        }
    }

    public void setItemActiveIndicatorHeight(@Px int v) {
        this.y = v;
        NavigationBarItemView[] arr_navigationBarItemView = this.f;
        if(arr_navigationBarItemView != null) {
            for(int v1 = 0; v1 < arr_navigationBarItemView.length; ++v1) {
                arr_navigationBarItemView[v1].setActiveIndicatorHeight(v);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(@Px int v) {
        this.z = v;
        NavigationBarItemView[] arr_navigationBarItemView = this.f;
        if(arr_navigationBarItemView != null) {
            for(int v1 = 0; v1 < arr_navigationBarItemView.length; ++v1) {
                arr_navigationBarItemView[v1].setActiveIndicatorMarginHorizontal(v);
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z) {
        this.B = z;
        NavigationBarItemView[] arr_navigationBarItemView = this.f;
        if(arr_navigationBarItemView != null) {
            for(int v = 0; v < arr_navigationBarItemView.length; ++v) {
                arr_navigationBarItemView[v].setActiveIndicatorResizeable(z);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(@Nullable ShapeAppearanceModel shapeAppearanceModel0) {
        this.A = shapeAppearanceModel0;
        NavigationBarItemView[] arr_navigationBarItemView = this.f;
        if(arr_navigationBarItemView != null) {
            for(int v = 0; v < arr_navigationBarItemView.length; ++v) {
                arr_navigationBarItemView[v].setActiveIndicatorDrawable(this.a());
            }
        }
    }

    public void setItemActiveIndicatorWidth(@Px int v) {
        this.x = v;
        NavigationBarItemView[] arr_navigationBarItemView = this.f;
        if(arr_navigationBarItemView != null) {
            for(int v1 = 0; v1 < arr_navigationBarItemView.length; ++v1) {
                arr_navigationBarItemView[v1].setActiveIndicatorWidth(v);
            }
        }
    }

    public void setItemBackground(@Nullable Drawable drawable0) {
        this.p = drawable0;
        NavigationBarItemView[] arr_navigationBarItemView = this.f;
        if(arr_navigationBarItemView != null) {
            for(int v = 0; v < arr_navigationBarItemView.length; ++v) {
                arr_navigationBarItemView[v].setItemBackground(drawable0);
            }
        }
    }

    public void setItemBackgroundRes(int v) {
        this.r = v;
        NavigationBarItemView[] arr_navigationBarItemView = this.f;
        if(arr_navigationBarItemView != null) {
            for(int v1 = 0; v1 < arr_navigationBarItemView.length; ++v1) {
                arr_navigationBarItemView[v1].setItemBackground(v);
            }
        }
    }

    public void setItemIconSize(@Dimension int v) {
        this.j = v;
        NavigationBarItemView[] arr_navigationBarItemView = this.f;
        if(arr_navigationBarItemView != null) {
            for(int v1 = 0; v1 < arr_navigationBarItemView.length; ++v1) {
                arr_navigationBarItemView[v1].setIconSize(v);
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void setItemOnTouchListener(int v, @Nullable View.OnTouchListener view$OnTouchListener0) {
        SparseArray sparseArray0 = this.d;
        if(view$OnTouchListener0 == null) {
            sparseArray0.remove(v);
        }
        else {
            sparseArray0.put(v, view$OnTouchListener0);
        }
        NavigationBarItemView[] arr_navigationBarItemView = this.f;
        if(arr_navigationBarItemView != null) {
            for(int v1 = 0; v1 < arr_navigationBarItemView.length; ++v1) {
                NavigationBarItemView navigationBarItemView0 = arr_navigationBarItemView[v1];
                if(navigationBarItemView0.getItemData().getItemId() == v) {
                    navigationBarItemView0.setOnTouchListener(view$OnTouchListener0);
                }
            }
        }
    }

    public void setItemPaddingBottom(@Px int v) {
        this.u = v;
        NavigationBarItemView[] arr_navigationBarItemView = this.f;
        if(arr_navigationBarItemView != null) {
            for(int v1 = 0; v1 < arr_navigationBarItemView.length; ++v1) {
                arr_navigationBarItemView[v1].setItemPaddingBottom(v);
            }
        }
    }

    public void setItemPaddingTop(@Px int v) {
        this.t = v;
        NavigationBarItemView[] arr_navigationBarItemView = this.f;
        if(arr_navigationBarItemView != null) {
            for(int v1 = 0; v1 < arr_navigationBarItemView.length; ++v1) {
                arr_navigationBarItemView[v1].setItemPaddingTop(v);
            }
        }
    }

    public void setItemRippleColor(@Nullable ColorStateList colorStateList0) {
        this.q = colorStateList0;
        NavigationBarItemView[] arr_navigationBarItemView = this.f;
        if(arr_navigationBarItemView != null) {
            for(int v = 0; v < arr_navigationBarItemView.length; ++v) {
                arr_navigationBarItemView[v].setItemRippleColor(colorStateList0);
            }
        }
    }

    public void setItemTextAppearanceActive(@StyleRes int v) {
        this.n = v;
        NavigationBarItemView[] arr_navigationBarItemView = this.f;
        if(arr_navigationBarItemView != null) {
            for(int v1 = 0; v1 < arr_navigationBarItemView.length; ++v1) {
                NavigationBarItemView navigationBarItemView0 = arr_navigationBarItemView[v1];
                navigationBarItemView0.setTextAppearanceActive(v);
                ColorStateList colorStateList0 = this.k;
                if(colorStateList0 != null) {
                    navigationBarItemView0.setTextColor(colorStateList0);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.o = z;
        NavigationBarItemView[] arr_navigationBarItemView = this.f;
        if(arr_navigationBarItemView != null) {
            for(int v = 0; v < arr_navigationBarItemView.length; ++v) {
                arr_navigationBarItemView[v].setTextAppearanceActiveBoldEnabled(z);
            }
        }
    }

    public void setItemTextAppearanceInactive(@StyleRes int v) {
        this.m = v;
        NavigationBarItemView[] arr_navigationBarItemView = this.f;
        if(arr_navigationBarItemView != null) {
            for(int v1 = 0; v1 < arr_navigationBarItemView.length; ++v1) {
                NavigationBarItemView navigationBarItemView0 = arr_navigationBarItemView[v1];
                navigationBarItemView0.setTextAppearanceInactive(v);
                ColorStateList colorStateList0 = this.k;
                if(colorStateList0 != null) {
                    navigationBarItemView0.setTextColor(colorStateList0);
                }
            }
        }
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList0) {
        this.k = colorStateList0;
        NavigationBarItemView[] arr_navigationBarItemView = this.f;
        if(arr_navigationBarItemView != null) {
            for(int v = 0; v < arr_navigationBarItemView.length; ++v) {
                arr_navigationBarItemView[v].setTextColor(colorStateList0);
            }
        }
    }

    public void setLabelVisibilityMode(int v) {
        this.e = v;
    }

    public void setPresenter(@NonNull NavigationBarPresenter navigationBarPresenter0) {
        this.D = navigationBarPresenter0;
    }

    public void updateMenuView() {
        MenuBuilder menuBuilder0 = this.E;
        if(menuBuilder0 != null && this.f != null) {
            int v = menuBuilder0.size();
            if(v != this.f.length) {
                this.buildMenuView();
                return;
            }
            int v1 = this.g;
            for(int v2 = 0; v2 < v; ++v2) {
                MenuItem menuItem0 = this.E.getItem(v2);
                if(menuItem0.isChecked()) {
                    this.g = menuItem0.getItemId();
                    this.h = v2;
                }
            }
            if(v1 != this.g) {
                AutoTransition autoTransition0 = this.a;
                if(autoTransition0 != null) {
                    TransitionManager.beginDelayedTransition(this, autoTransition0);
                }
            }
            boolean z = this.isShifting(this.e, this.E.getVisibleItems().size());
            for(int v3 = 0; v3 < v; ++v3) {
                this.D.setUpdateSuspended(true);
                this.f[v3].setLabelVisibilityMode(this.e);
                this.f[v3].setShifting(z);
                this.f[v3].initialize(((MenuItemImpl)this.E.getItem(v3)), 0);
                this.D.setUpdateSuspended(false);
            }
        }
    }
}

