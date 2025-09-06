package com.google.android.material.navigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import r0.a;

@RestrictTo({Scope.LIBRARY_GROUP})
public final class NavigationBarMenu extends MenuBuilder {
    public final Class B;
    public final int C;

    public NavigationBarMenu(@NonNull Context context0, @NonNull Class class0, int v) {
        super(context0);
        this.B = class0;
        this.C = v;
    }

    @Override  // androidx.appcompat.view.menu.MenuBuilder
    @NonNull
    public MenuItem addInternal(int v, int v1, int v2, @NonNull CharSequence charSequence0) {
        int v3 = this.C;
        if(this.size() + 1 <= v3) {
            this.stopDispatchingItemsChanged();
            MenuItem menuItem0 = super.addInternal(v, v1, v2, charSequence0);
            if(menuItem0 instanceof MenuItemImpl) {
                ((MenuItemImpl)menuItem0).setExclusiveCheckable(true);
            }
            this.startDispatchingItemsChanged();
            return menuItem0;
        }
        String s = this.B.getSimpleName();
        StringBuilder stringBuilder0 = new StringBuilder("Maximum number of items supported by ");
        stringBuilder0.append(s);
        stringBuilder0.append(" is ");
        stringBuilder0.append(v3);
        stringBuilder0.append(". Limit can be checked with ");
        throw new IllegalArgumentException(a.o(stringBuilder0, s, "#getMaxItemCount()"));
    }

    @Override  // androidx.appcompat.view.menu.MenuBuilder
    @NonNull
    public SubMenu addSubMenu(int v, int v1, int v2, @NonNull CharSequence charSequence0) {
        throw new UnsupportedOperationException(this.B.getSimpleName() + " does not support submenus");
    }

    public int getMaxItemCount() {
        return this.C;
    }
}

