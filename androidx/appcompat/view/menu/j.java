package androidx.appcompat.view.menu;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface;
import android.view.KeyEvent.DispatcherState;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AlertDialog;

public final class j implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener, DialogInterface.OnKeyListener, Callback {
    public SubMenuBuilder a;
    public AlertDialog b;
    public ListMenuPresenter c;

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        MenuItemImpl menuItemImpl0 = (MenuItemImpl)this.c.getAdapter().getItem(v);
        this.a.performItemAction(menuItemImpl0, 0);
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter$Callback
    public final void onCloseMenu(MenuBuilder menuBuilder0, boolean z) {
        if(z || menuBuilder0 == this.a) {
            AlertDialog alertDialog0 = this.b;
            if(alertDialog0 != null) {
                alertDialog0.dismiss();
            }
        }
    }

    @Override  // android.content.DialogInterface$OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface0) {
        this.c.onCloseMenu(this.a, true);
    }

    @Override  // android.content.DialogInterface$OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface0, int v, KeyEvent keyEvent0) {
        SubMenuBuilder subMenuBuilder0 = this.a;
        if(v == 4 || v == 82) {
            if(keyEvent0.getAction() == 0 && keyEvent0.getRepeatCount() == 0) {
                Window window0 = this.b.getWindow();
                if(window0 != null) {
                    View view0 = window0.getDecorView();
                    if(view0 != null) {
                        KeyEvent.DispatcherState keyEvent$DispatcherState0 = view0.getKeyDispatcherState();
                        if(keyEvent$DispatcherState0 != null) {
                            keyEvent$DispatcherState0.startTracking(keyEvent0, this);
                            return true;
                        }
                    }
                }
            }
            else if(keyEvent0.getAction() == 1 && !keyEvent0.isCanceled()) {
                Window window1 = this.b.getWindow();
                if(window1 != null) {
                    View view1 = window1.getDecorView();
                    if(view1 != null) {
                        KeyEvent.DispatcherState keyEvent$DispatcherState1 = view1.getKeyDispatcherState();
                        if(keyEvent$DispatcherState1 != null && keyEvent$DispatcherState1.isTracking(keyEvent0)) {
                            subMenuBuilder0.close(true);
                            dialogInterface0.dismiss();
                            return true;
                        }
                    }
                }
            }
        }
        return subMenuBuilder0.performShortcut(v, keyEvent0, 0);
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter$Callback
    public final boolean onOpenSubMenu(MenuBuilder menuBuilder0) {
        return false;
    }
}

