package androidx.appcompat.app;

import android.view.Menu;
import android.view.Window.Callback;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ToolbarWidgetWrapper;

public final class r implements Runnable {
    public final int a;
    public final Object b;

    public r(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override
    public final void run() {
        if(this.a != 0) {
            t0 t00 = (t0)this.b;
            Window.Callback window$Callback0 = t00.b;
            ToolbarWidgetWrapper toolbarWidgetWrapper0 = t00.a;
            if(!t00.e) {
                toolbarWidgetWrapper0.setMenuCallbacks(new q0(t00), new r0(t00));
                t00.e = true;
            }
            Menu menu0 = toolbarWidgetWrapper0.getMenu();
            MenuBuilder menuBuilder0 = menu0 instanceof MenuBuilder ? ((MenuBuilder)menu0) : null;
            if(menuBuilder0 != null) {
                menuBuilder0.stopDispatchingItemsChanged();
            }
            try {
                menu0.clear();
                if(!window$Callback0.onCreatePanelMenu(0, menu0) || !window$Callback0.onPreparePanel(0, null, menu0)) {
                    menu0.clear();
                }
            }
            finally {
                if(menuBuilder0 != null) {
                    menuBuilder0.startDispatchingItemsChanged();
                }
            }
            return;
        }
        i0 i00 = (i0)this.b;
        if((i00.a0 & 1) != 0) {
            i00.n(0);
        }
        if((i00.a0 & 0x1000) != 0) {
            i00.n(108);
        }
        i00.Z = false;
        i00.a0 = 0;
    }
}

