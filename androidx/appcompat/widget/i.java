package androidx.appcompat.widget;

import android.view.View;
import androidx.appcompat.view.menu.ShowableListMenu;

public final class i extends ForwardingListener {
    public final int j;
    public final Object k;

    public i(Object object0, View view0, int v) {
        this.j = v;
        this.k = object0;
        super(view0);
    }

    @Override  // androidx.appcompat.widget.ForwardingListener
    public final ShowableListMenu getPopup() {
        switch(this.j) {
            case 0: {
                k k0 = ((j)this.k).a.o;
                return k0 == null ? null : k0.getPopup();
            }
            case 1: {
                return ((ActivityChooserView)this.k).getListPopupWindow();
            }
            case 2: {
                return (ListPopupWindow)this.k;
            }
            default: {
                return ((PopupMenu)this.k).d.getPopup();
            }
        }
    }

    @Override  // androidx.appcompat.widget.ForwardingListener
    public boolean onForwardingStarted() {
        switch(this.j) {
            case 0: {
                ((j)this.k).a.l();
                return true;
            }
            case 1: {
                ((ActivityChooserView)this.k).showPopup();
                return true;
            }
            case 3: {
                ((PopupMenu)this.k).show();
                return true;
            }
            default: {
                return super.onForwardingStarted();
            }
        }
    }

    @Override  // androidx.appcompat.widget.ForwardingListener
    public boolean onForwardingStopped() {
        switch(this.j) {
            case 0: {
                o o0 = ((j)this.k).a;
                if(o0.q != null) {
                    return false;
                }
                o0.h();
                return true;
            }
            case 1: {
                ((ActivityChooserView)this.k).dismissPopup();
                return true;
            }
            case 3: {
                ((PopupMenu)this.k).dismiss();
                return true;
            }
            default: {
                return super.onForwardingStopped();
            }
        }
    }
}

