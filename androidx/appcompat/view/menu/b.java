package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.collection.SimpleArrayMap;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.internal.view.SupportSubMenu;

public abstract class b {
    public final Context a;
    public SimpleArrayMap b;
    public SimpleArrayMap c;

    public b(Context context0) {
        this.a = context0;
    }

    public final MenuItem a(MenuItem menuItem0) {
        if(menuItem0 instanceof SupportMenuItem) {
            if(this.b == null) {
                this.b = new SimpleArrayMap();
            }
            MenuItem menuItem1 = (MenuItem)this.b.get(((SupportMenuItem)menuItem0));
            if(menuItem1 == null) {
                menuItem1 = new MenuItemWrapperICS(this.a, ((SupportMenuItem)menuItem0));
                this.b.put(((SupportMenuItem)menuItem0), menuItem1);
            }
            return menuItem1;
        }
        return menuItem0;
    }

    public final SubMenu b(SubMenu subMenu0) {
        if(subMenu0 instanceof SupportSubMenu) {
            if(this.c == null) {
                this.c = new SimpleArrayMap();
            }
            SubMenu subMenu1 = (SubMenu)this.c.get(((SupportSubMenu)subMenu0));
            if(subMenu1 == null) {
                subMenu1 = new u(this.a, ((SupportSubMenu)subMenu0));
                this.c.put(((SupportSubMenu)subMenu0), subMenu1);
            }
            return subMenu1;
        }
        return subMenu0;
    }
}

