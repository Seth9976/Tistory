package com.google.android.material.internal;

import android.content.res.ColorStateList;
import android.graphics.drawable.RippleDrawable;
import android.view.SubMenu;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.android.material.R.layout;
import java.util.ArrayList;

public final class k extends Adapter {
    public final ArrayList g;
    public MenuItemImpl h;
    public boolean i;
    public final NavigationMenuPresenter j;

    public k(NavigationMenuPresenter navigationMenuPresenter0) {
        this.j = navigationMenuPresenter0;
        super();
        this.g = new ArrayList();
        this.a();
    }

    public final void a() {
        if(this.i) {
            return;
        }
        this.i = true;
        ArrayList arrayList0 = this.g;
        arrayList0.clear();
        arrayList0.add(new l());  // 初始化器: Ljava/lang/Object;-><init>()V
        NavigationMenuPresenter navigationMenuPresenter0 = this.j;
        int v = navigationMenuPresenter0.d.getVisibleItems().size();
        int v1 = -1;
        boolean z = false;
        int v3 = 0;
        for(int v2 = 0; v2 < v; ++v2) {
            MenuItemImpl menuItemImpl0 = (MenuItemImpl)navigationMenuPresenter0.d.getVisibleItems().get(v2);
            if(menuItemImpl0.isChecked()) {
                this.b(menuItemImpl0);
            }
            if(menuItemImpl0.isCheckable()) {
                menuItemImpl0.setExclusiveCheckable(false);
            }
            if(menuItemImpl0.hasSubMenu()) {
                SubMenu subMenu0 = menuItemImpl0.getSubMenu();
                if(subMenu0.hasVisibleItems()) {
                    if(v2 != 0) {
                        arrayList0.add(new m(navigationMenuPresenter0.B, 0));
                    }
                    arrayList0.add(new n(menuItemImpl0));
                    int v4 = arrayList0.size();
                    int v5 = subMenu0.size();
                    boolean z1 = false;
                    for(int v6 = 0; v6 < v5; ++v6) {
                        MenuItemImpl menuItemImpl1 = (MenuItemImpl)subMenu0.getItem(v6);
                        if(menuItemImpl1.isVisible()) {
                            if(!z1 && menuItemImpl1.getIcon() != null) {
                                z1 = true;
                            }
                            if(menuItemImpl1.isCheckable()) {
                                menuItemImpl1.setExclusiveCheckable(false);
                            }
                            if(menuItemImpl0.isChecked()) {
                                this.b(menuItemImpl0);
                            }
                            arrayList0.add(new n(menuItemImpl1));
                        }
                    }
                    if(z1) {
                        int v7 = arrayList0.size();
                        while(v4 < v7) {
                            ((n)arrayList0.get(v4)).b = true;
                            ++v4;
                        }
                    }
                }
            }
            else {
                int v8 = menuItemImpl0.getGroupId();
                if(v8 != v1) {
                    v3 = arrayList0.size();
                    z = menuItemImpl0.getIcon() != null;
                    if(v2 != 0) {
                        ++v3;
                        arrayList0.add(new m(navigationMenuPresenter0.B, navigationMenuPresenter0.B));
                    }
                }
                else if(!z && menuItemImpl0.getIcon() != null) {
                    int v9 = arrayList0.size();
                    for(int v10 = v3; v10 < v9; ++v10) {
                        ((n)arrayList0.get(v10)).b = true;
                    }
                    z = true;
                }
                n n0 = new n(menuItemImpl0);
                n0.b = z;
                arrayList0.add(n0);
                v1 = v8;
            }
        }
        this.i = false;
    }

    public final void b(MenuItemImpl menuItemImpl0) {
        if(this.h != menuItemImpl0 && menuItemImpl0.isCheckable()) {
            MenuItemImpl menuItemImpl1 = this.h;
            if(menuItemImpl1 != null) {
                menuItemImpl1.setChecked(false);
            }
            this.h = menuItemImpl0;
            menuItemImpl0.setChecked(true);
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final int getItemCount() {
        return this.g.size();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final long getItemId(int v) {
        return (long)v;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final int getItemViewType(int v) {
        NavigationMenuItem navigationMenuPresenter$NavigationMenuItem0 = (NavigationMenuItem)this.g.get(v);
        if(navigationMenuPresenter$NavigationMenuItem0 instanceof m) {
            return 2;
        }
        if(navigationMenuPresenter$NavigationMenuItem0 instanceof l) {
            return 3;
        }
        if(!(navigationMenuPresenter$NavigationMenuItem0 instanceof n)) {
            throw new RuntimeException("Unknown item type.");
        }
        return ((n)navigationMenuPresenter$NavigationMenuItem0).a.hasSubMenu() ? 1 : 0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
        int v1 = this.getItemViewType(v);
        ArrayList arrayList0 = this.g;
        NavigationMenuPresenter navigationMenuPresenter0 = this.j;
        switch(v1) {
            case 0: {
                NavigationMenuItemView navigationMenuItemView0 = (NavigationMenuItemView)((s)recyclerView$ViewHolder0).itemView;
                navigationMenuItemView0.setIconTintList(navigationMenuPresenter0.m);
                navigationMenuItemView0.setTextAppearance(navigationMenuPresenter0.j);
                ColorStateList colorStateList0 = navigationMenuPresenter0.l;
                if(colorStateList0 != null) {
                    navigationMenuItemView0.setTextColor(colorStateList0);
                }
                ViewCompat.setBackground(navigationMenuItemView0, (navigationMenuPresenter0.n == null ? null : navigationMenuPresenter0.n.getConstantState().newDrawable()));
                RippleDrawable rippleDrawable0 = navigationMenuPresenter0.o;
                if(rippleDrawable0 != null) {
                    navigationMenuItemView0.setForeground(rippleDrawable0.getConstantState().newDrawable());
                }
                n n0 = (n)arrayList0.get(v);
                navigationMenuItemView0.setNeedsEmptyIcon(n0.b);
                navigationMenuItemView0.setPadding(navigationMenuPresenter0.p, navigationMenuPresenter0.q, navigationMenuPresenter0.p, navigationMenuPresenter0.q);
                navigationMenuItemView0.setIconPadding(navigationMenuPresenter0.r);
                if(navigationMenuPresenter0.x) {
                    navigationMenuItemView0.setIconSize(navigationMenuPresenter0.s);
                }
                navigationMenuItemView0.setMaxLines(navigationMenuPresenter0.z);
                navigationMenuItemView0.initialize(n0.a, navigationMenuPresenter0.k);
                ViewCompat.setAccessibilityDelegate(navigationMenuItemView0, new j(this, v, false));
                return;
            }
            case 1: {
                TextView textView0 = (TextView)((s)recyclerView$ViewHolder0).itemView;
                textView0.setText(((n)arrayList0.get(v)).a.getTitle());
                TextViewCompat.setTextAppearance(textView0, navigationMenuPresenter0.h);
                textView0.setPadding(navigationMenuPresenter0.v, textView0.getPaddingTop(), navigationMenuPresenter0.w, textView0.getPaddingBottom());
                ColorStateList colorStateList1 = navigationMenuPresenter0.i;
                if(colorStateList1 != null) {
                    textView0.setTextColor(colorStateList1);
                }
                ViewCompat.setAccessibilityDelegate(textView0, new j(this, v, true));
                return;
            }
            case 2: {
                m m0 = (m)arrayList0.get(v);
                ((s)recyclerView$ViewHolder0).itemView.setPadding(navigationMenuPresenter0.t, m0.a, navigationMenuPresenter0.u, m0.b);
            }
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
        NavigationMenuPresenter navigationMenuPresenter0 = this.j;
        switch(v) {
            case 0: {
                p p0 = new p(navigationMenuPresenter0.g.inflate(layout.design_navigation_item, viewGroup0, false));  // 初始化器: Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V
                p0.itemView.setOnClickListener(navigationMenuPresenter0.D);
                return p0;
            }
            case 1: {
                return new r(navigationMenuPresenter0.g.inflate(layout.design_navigation_item_subheader, viewGroup0, false));  // 初始化器: Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V
            }
            case 2: {
                return new q(navigationMenuPresenter0.g.inflate(layout.design_navigation_item_separator, viewGroup0, false));  // 初始化器: Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V
            }
            case 3: {
                return new i(navigationMenuPresenter0.b);  // 初始化器: Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V
            }
            default: {
                return null;
            }
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final void onViewRecycled(ViewHolder recyclerView$ViewHolder0) {
        if(((s)recyclerView$ViewHolder0) instanceof p) {
            ((NavigationMenuItemView)((s)recyclerView$ViewHolder0).itemView).recycle();
        }
    }
}

