package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.internal.view.SupportSubMenu;

public final class u extends MenuWrapperICS implements SubMenu {
    public final SupportSubMenu e;

    public u(Context context0, SupportSubMenu supportSubMenu0) {
        super(context0, supportSubMenu0);
        this.e = supportSubMenu0;
    }

    @Override  // android.view.SubMenu
    public final void clearHeader() {
        this.e.clearHeader();
    }

    @Override  // android.view.SubMenu
    public final MenuItem getItem() {
        return this.a(this.e.getItem());
    }

    @Override  // android.view.SubMenu
    public final SubMenu setHeaderIcon(int v) {
        this.e.setHeaderIcon(v);
        return this;
    }

    @Override  // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable0) {
        this.e.setHeaderIcon(drawable0);
        return this;
    }

    @Override  // android.view.SubMenu
    public final SubMenu setHeaderTitle(int v) {
        this.e.setHeaderTitle(v);
        return this;
    }

    @Override  // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence0) {
        this.e.setHeaderTitle(charSequence0);
        return this;
    }

    @Override  // android.view.SubMenu
    public final SubMenu setHeaderView(View view0) {
        this.e.setHeaderView(view0);
        return this;
    }

    @Override  // android.view.SubMenu
    public final SubMenu setIcon(int v) {
        this.e.setIcon(v);
        return this;
    }

    @Override  // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable0) {
        this.e.setIcon(drawable0);
        return this;
    }
}

