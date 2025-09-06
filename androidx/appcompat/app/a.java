package androidx.appcompat.app;

import android.view.View.OnClickListener;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;

public final class a implements View.OnClickListener {
    public final ActionBarDrawerToggle a;

    public a(ActionBarDrawerToggle actionBarDrawerToggle0) {
        this.a = actionBarDrawerToggle0;
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        ActionBarDrawerToggle actionBarDrawerToggle0 = this.a;
        if(actionBarDrawerToggle0.f) {
            DrawerLayout drawerLayout0 = actionBarDrawerToggle0.b;
            int v = drawerLayout0.getDrawerLockMode(0x800003);
            if(drawerLayout0.isDrawerVisible(0x800003) && v != 2) {
                drawerLayout0.closeDrawer(0x800003);
                return;
            }
            if(v != 1) {
                drawerLayout0.openDrawer(0x800003);
            }
        }
        else {
            View.OnClickListener view$OnClickListener0 = actionBarDrawerToggle0.j;
            if(view$OnClickListener0 != null) {
                view$OnClickListener0.onClick(view0);
            }
        }
    }
}

