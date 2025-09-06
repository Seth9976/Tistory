package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public class SubMenuBuilder extends MenuBuilder implements SubMenu {
    public final MenuBuilder B;
    public final MenuItemImpl C;

    public SubMenuBuilder(Context context0, MenuBuilder menuBuilder0, MenuItemImpl menuItemImpl0) {
        super(context0);
        this.B = menuBuilder0;
        this.C = menuItemImpl0;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.appcompat.view.menu.MenuBuilder
    public final boolean a(MenuBuilder menuBuilder0, MenuItemImpl menuItemImpl0) {
        return super.a(menuBuilder0, menuItemImpl0) || this.B.a(menuBuilder0, menuItemImpl0);
    }

    @Override  // androidx.appcompat.view.menu.MenuBuilder
    public boolean collapseItemActionView(MenuItemImpl menuItemImpl0) {
        return this.B.collapseItemActionView(menuItemImpl0);
    }

    @Override  // androidx.appcompat.view.menu.MenuBuilder
    public boolean expandItemActionView(MenuItemImpl menuItemImpl0) {
        return this.B.expandItemActionView(menuItemImpl0);
    }

    // 去混淆评级： 低(25)
    @Override  // androidx.appcompat.view.menu.MenuBuilder
    public String getActionViewStatesKey() {
        int v = this.C == null ? 0 : this.C.getItemId();
        return v == 0 ? null : "android:menu:actionviewstates:" + v;
    }

    @Override  // android.view.SubMenu
    public MenuItem getItem() {
        return this.C;
    }

    public Menu getParentMenu() {
        return this.B;
    }

    @Override  // androidx.appcompat.view.menu.MenuBuilder
    public MenuBuilder getRootMenu() {
        return this.B.getRootMenu();
    }

    @Override  // androidx.appcompat.view.menu.MenuBuilder
    public boolean isGroupDividerEnabled() {
        return this.B.isGroupDividerEnabled();
    }

    @Override  // androidx.appcompat.view.menu.MenuBuilder
    public boolean isQwertyMode() {
        return this.B.isQwertyMode();
    }

    @Override  // androidx.appcompat.view.menu.MenuBuilder
    public boolean isShortcutsVisible() {
        return this.B.isShortcutsVisible();
    }

    @Override  // androidx.appcompat.view.menu.MenuBuilder
    public void setCallback(Callback menuBuilder$Callback0) {
        this.B.setCallback(menuBuilder$Callback0);
    }

    @Override  // androidx.appcompat.view.menu.MenuBuilder, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.B.setGroupDividerEnabled(z);
    }

    @Override  // android.view.SubMenu
    public SubMenu setHeaderIcon(int v) {
        return (SubMenu)super.setHeaderIconInt(v);
    }

    @Override  // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable0) {
        return (SubMenu)super.setHeaderIconInt(drawable0);
    }

    @Override  // android.view.SubMenu
    public SubMenu setHeaderTitle(int v) {
        return (SubMenu)super.setHeaderTitleInt(v);
    }

    @Override  // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence0) {
        return (SubMenu)super.setHeaderTitleInt(charSequence0);
    }

    @Override  // android.view.SubMenu
    public SubMenu setHeaderView(View view0) {
        return (SubMenu)super.setHeaderViewInt(view0);
    }

    @Override  // android.view.SubMenu
    public SubMenu setIcon(int v) {
        this.C.setIcon(v);
        return this;
    }

    @Override  // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable0) {
        this.C.setIcon(drawable0);
        return this;
    }

    @Override  // androidx.appcompat.view.menu.MenuBuilder, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.B.setQwertyMode(z);
    }

    @Override  // androidx.appcompat.view.menu.MenuBuilder
    public void setShortcutsVisible(boolean z) {
        this.B.setShortcutsVisible(z);
    }
}

