package androidx.appcompat.widget;

import androidx.appcompat.view.menu.ShowableListMenu;

public final class i0 extends ForwardingListener {
    public final r0 j;
    public final AppCompatSpinner k;

    public i0(AppCompatSpinner appCompatSpinner0, AppCompatSpinner appCompatSpinner1, r0 r00) {
        this.k = appCompatSpinner0;
        this.j = r00;
        super(appCompatSpinner1);
    }

    @Override  // androidx.appcompat.widget.ForwardingListener
    public final ShowableListMenu getPopup() {
        return this.j;
    }

    @Override  // androidx.appcompat.widget.ForwardingListener
    public final boolean onForwardingStarted() {
        AppCompatSpinner appCompatSpinner0 = this.k;
        if(!appCompatSpinner0.getInternalPopup().isShowing()) {
            int v = l0.b(appCompatSpinner0);
            int v1 = l0.a(appCompatSpinner0);
            appCompatSpinner0.f.show(v, v1);
        }
        return true;
    }
}

