package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Dimension;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter.Callback;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.R.dimen;
import com.google.android.material.R.layout;
import java.util.ArrayList;

@RestrictTo({Scope.LIBRARY_GROUP})
public class NavigationMenuPresenter implements MenuPresenter {
    interface NavigationMenuItem {
    }

    public int A;
    public int B;
    public int C;
    public final h D;
    public static final int NO_TEXT_APPEARANCE_SET;
    public NavigationMenuView a;
    public LinearLayout b;
    public Callback c;
    public MenuBuilder d;
    public int e;
    public k f;
    public LayoutInflater g;
    public int h;
    public ColorStateList i;
    public int j;
    public boolean k;
    public ColorStateList l;
    public ColorStateList m;
    public Drawable n;
    public RippleDrawable o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public boolean x;
    public boolean y;
    public int z;

    public NavigationMenuPresenter() {
        this.h = 0;
        this.j = 0;
        this.k = true;
        this.y = true;
        this.C = -1;
        this.D = new h(this);
    }

    public void addHeaderView(@NonNull View view0) {
        this.b.addView(view0);
        this.a.setPadding(0, 0, 0, this.a.getPaddingBottom());
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public boolean collapseItemActionView(MenuBuilder menuBuilder0, MenuItemImpl menuItemImpl0) {
        return false;
    }

    public void dispatchApplyWindowInsets(@NonNull WindowInsetsCompat windowInsetsCompat0) {
        int v = windowInsetsCompat0.getSystemWindowInsetTop();
        if(this.A != v) {
            this.A = v;
            int v1 = this.getHeaderCount() > 0 || !this.y ? 0 : this.A;
            this.a.setPadding(0, v1, 0, this.a.getPaddingBottom());
        }
        this.a.setPadding(0, this.a.getPaddingTop(), 0, windowInsetsCompat0.getSystemWindowInsetBottom());
        ViewCompat.dispatchApplyWindowInsets(this.b, windowInsetsCompat0);
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public boolean expandItemActionView(MenuBuilder menuBuilder0, MenuItemImpl menuItemImpl0) {
        return false;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public boolean flagActionItems() {
        return false;
    }

    @Nullable
    public MenuItemImpl getCheckedItem() {
        return this.f.h;
    }

    @Px
    public int getDividerInsetEnd() {
        return this.u;
    }

    @Px
    public int getDividerInsetStart() {
        return this.t;
    }

    public int getHeaderCount() {
        return this.b.getChildCount();
    }

    public View getHeaderView(int v) {
        return this.b.getChildAt(v);
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public int getId() {
        return this.e;
    }

    @Nullable
    public Drawable getItemBackground() {
        return this.n;
    }

    public int getItemHorizontalPadding() {
        return this.p;
    }

    public int getItemIconPadding() {
        return this.r;
    }

    public int getItemMaxLines() {
        return this.z;
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.l;
    }

    @Nullable
    public ColorStateList getItemTintList() {
        return this.m;
    }

    @Px
    public int getItemVerticalPadding() {
        return this.q;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public MenuView getMenuView(ViewGroup viewGroup0) {
        if(this.a == null) {
            NavigationMenuView navigationMenuView0 = (NavigationMenuView)this.g.inflate(layout.design_navigation_menu, viewGroup0, false);
            this.a = navigationMenuView0;
            navigationMenuView0.setAccessibilityDelegateCompat(new o(this, this.a));
            if(this.f == null) {
                this.f = new k(this);
            }
            int v = this.C;
            if(v != -1) {
                this.a.setOverScrollMode(v);
            }
            LinearLayout linearLayout0 = (LinearLayout)this.g.inflate(layout.design_navigation_item_header, this.a, false);
            this.b = linearLayout0;
            ViewCompat.setImportantForAccessibility(linearLayout0, 2);
            this.a.setAdapter(this.f);
        }
        return this.a;
    }

    @Px
    public int getSubheaderInsetEnd() {
        return this.w;
    }

    @Px
    public int getSubheaderInsetStart() {
        return this.v;
    }

    public View inflateHeaderView(@LayoutRes int v) {
        View view0 = this.g.inflate(v, this.b, false);
        this.addHeaderView(view0);
        return view0;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public void initForMenu(@NonNull Context context0, @NonNull MenuBuilder menuBuilder0) {
        this.g = LayoutInflater.from(context0);
        this.d = menuBuilder0;
        this.B = context0.getResources().getDimensionPixelOffset(dimen.design_navigation_separator_vertical_padding);
    }

    public boolean isBehindStatusBar() {
        return this.y;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public void onCloseMenu(MenuBuilder menuBuilder0, boolean z) {
        Callback menuPresenter$Callback0 = this.c;
        if(menuPresenter$Callback0 != null) {
            menuPresenter$Callback0.onCloseMenu(menuBuilder0, z);
        }
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public void onRestoreInstanceState(Parcelable parcelable0) {
        if(parcelable0 instanceof Bundle) {
            SparseArray sparseArray0 = ((Bundle)parcelable0).getSparseParcelableArray("android:menu:list");
            if(sparseArray0 != null) {
                this.a.restoreHierarchyState(sparseArray0);
            }
            Bundle bundle0 = ((Bundle)parcelable0).getBundle("android:menu:adapter");
            if(bundle0 != null) {
                k k0 = this.f;
                k0.getClass();
                int v1 = bundle0.getInt("android:menu:checked", 0);
                ArrayList arrayList0 = k0.g;
                if(v1 != 0) {
                    k0.i = true;
                    int v2 = arrayList0.size();
                    for(int v3 = 0; v3 < v2; ++v3) {
                        NavigationMenuItem navigationMenuPresenter$NavigationMenuItem0 = (NavigationMenuItem)arrayList0.get(v3);
                        if(navigationMenuPresenter$NavigationMenuItem0 instanceof n) {
                            MenuItemImpl menuItemImpl0 = ((n)navigationMenuPresenter$NavigationMenuItem0).a;
                            if(menuItemImpl0 != null && menuItemImpl0.getItemId() == v1) {
                                k0.b(menuItemImpl0);
                                break;
                            }
                        }
                    }
                    k0.i = false;
                    k0.a();
                }
                SparseArray sparseArray1 = bundle0.getSparseParcelableArray("android:menu:action_views");
                if(sparseArray1 != null) {
                    int v4 = arrayList0.size();
                    for(int v = 0; v < v4; ++v) {
                        NavigationMenuItem navigationMenuPresenter$NavigationMenuItem1 = (NavigationMenuItem)arrayList0.get(v);
                        if(navigationMenuPresenter$NavigationMenuItem1 instanceof n) {
                            MenuItemImpl menuItemImpl1 = ((n)navigationMenuPresenter$NavigationMenuItem1).a;
                            if(menuItemImpl1 != null) {
                                View view0 = menuItemImpl1.getActionView();
                                if(view0 != null) {
                                    ParcelableSparseArray parcelableSparseArray0 = (ParcelableSparseArray)sparseArray1.get(menuItemImpl1.getItemId());
                                    if(parcelableSparseArray0 != null) {
                                        view0.restoreHierarchyState(parcelableSparseArray0);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            SparseArray sparseArray2 = ((Bundle)parcelable0).getSparseParcelableArray("android:menu:header");
            if(sparseArray2 != null) {
                this.b.restoreHierarchyState(sparseArray2);
            }
        }
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    @NonNull
    public Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new Bundle();
        if(this.a != null) {
            SparseArray sparseArray0 = new SparseArray();
            this.a.saveHierarchyState(sparseArray0);
            ((Bundle)parcelable0).putSparseParcelableArray("android:menu:list", sparseArray0);
        }
        k k0 = this.f;
        if(k0 != null) {
            k0.getClass();
            Bundle bundle0 = new Bundle();
            MenuItemImpl menuItemImpl0 = k0.h;
            if(menuItemImpl0 != null) {
                bundle0.putInt("android:menu:checked", menuItemImpl0.getItemId());
            }
            SparseArray sparseArray1 = new SparseArray();
            ArrayList arrayList0 = k0.g;
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                NavigationMenuItem navigationMenuPresenter$NavigationMenuItem0 = (NavigationMenuItem)arrayList0.get(v1);
                if(navigationMenuPresenter$NavigationMenuItem0 instanceof n) {
                    MenuItemImpl menuItemImpl1 = ((n)navigationMenuPresenter$NavigationMenuItem0).a;
                    View view0 = menuItemImpl1 == null ? null : menuItemImpl1.getActionView();
                    if(view0 != null) {
                        ParcelableSparseArray parcelableSparseArray0 = new ParcelableSparseArray();
                        view0.saveHierarchyState(parcelableSparseArray0);
                        sparseArray1.put(menuItemImpl1.getItemId(), parcelableSparseArray0);
                    }
                }
            }
            bundle0.putSparseParcelableArray("android:menu:action_views", sparseArray1);
            ((Bundle)parcelable0).putBundle("android:menu:adapter", bundle0);
        }
        if(this.b != null) {
            SparseArray sparseArray2 = new SparseArray();
            this.b.saveHierarchyState(sparseArray2);
            ((Bundle)parcelable0).putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return parcelable0;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder0) {
        return false;
    }

    public void removeHeaderView(@NonNull View view0) {
        this.b.removeView(view0);
        if(this.getHeaderCount() <= 0) {
            this.a.setPadding(0, this.A, 0, this.a.getPaddingBottom());
        }
    }

    public void setBehindStatusBar(boolean z) {
        if(this.y != z) {
            this.y = z;
            int v = this.getHeaderCount() > 0 || !this.y ? 0 : this.A;
            this.a.setPadding(0, v, 0, this.a.getPaddingBottom());
        }
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public void setCallback(Callback menuPresenter$Callback0) {
        this.c = menuPresenter$Callback0;
    }

    public void setCheckedItem(@NonNull MenuItemImpl menuItemImpl0) {
        this.f.b(menuItemImpl0);
    }

    public void setDividerInsetEnd(@Px int v) {
        this.u = v;
        this.updateMenuView(false);
    }

    public void setDividerInsetStart(@Px int v) {
        this.t = v;
        this.updateMenuView(false);
    }

    public void setId(int v) {
        this.e = v;
    }

    public void setItemBackground(@Nullable Drawable drawable0) {
        this.n = drawable0;
        this.updateMenuView(false);
    }

    public void setItemForeground(@Nullable RippleDrawable rippleDrawable0) {
        this.o = rippleDrawable0;
        this.updateMenuView(false);
    }

    public void setItemHorizontalPadding(int v) {
        this.p = v;
        this.updateMenuView(false);
    }

    public void setItemIconPadding(int v) {
        this.r = v;
        this.updateMenuView(false);
    }

    public void setItemIconSize(@Dimension int v) {
        if(this.s != v) {
            this.s = v;
            this.x = true;
            this.updateMenuView(false);
        }
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList0) {
        this.m = colorStateList0;
        this.updateMenuView(false);
    }

    public void setItemMaxLines(int v) {
        this.z = v;
        this.updateMenuView(false);
    }

    public void setItemTextAppearance(@StyleRes int v) {
        this.j = v;
        this.updateMenuView(false);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.k = z;
        this.updateMenuView(false);
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList0) {
        this.l = colorStateList0;
        this.updateMenuView(false);
    }

    public void setItemVerticalPadding(@Px int v) {
        this.q = v;
        this.updateMenuView(false);
    }

    public void setOverScrollMode(int v) {
        this.C = v;
        NavigationMenuView navigationMenuView0 = this.a;
        if(navigationMenuView0 != null) {
            navigationMenuView0.setOverScrollMode(v);
        }
    }

    public void setSubheaderColor(@Nullable ColorStateList colorStateList0) {
        this.i = colorStateList0;
        this.updateMenuView(false);
    }

    public void setSubheaderInsetEnd(@Px int v) {
        this.w = v;
        this.updateMenuView(false);
    }

    public void setSubheaderInsetStart(@Px int v) {
        this.v = v;
        this.updateMenuView(false);
    }

    public void setSubheaderTextAppearance(@StyleRes int v) {
        this.h = v;
        this.updateMenuView(false);
    }

    public void setUpdateSuspended(boolean z) {
        k k0 = this.f;
        if(k0 != null) {
            k0.i = z;
        }
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public void updateMenuView(boolean z) {
        k k0 = this.f;
        if(k0 != null) {
            k0.a();
            k0.notifyDataSetChanged();
        }
    }
}

