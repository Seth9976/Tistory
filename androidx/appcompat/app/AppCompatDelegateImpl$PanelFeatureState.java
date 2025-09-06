package androidx.appcompat.app;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.view.menu.ListMenuPresenter;
import androidx.appcompat.view.menu.MenuBuilder;

public final class AppCompatDelegateImpl.PanelFeatureState {
    public int a;
    public int b;
    public int c;
    public int d;
    public g0 e;
    public View f;
    public View g;
    public MenuBuilder h;
    public ListMenuPresenter i;
    public ContextThemeWrapper j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public Bundle p;
    public boolean qwertyMode;

    public void clearMenuPresenters() {
        MenuBuilder menuBuilder0 = this.h;
        if(menuBuilder0 != null) {
            menuBuilder0.removeMenuPresenter(this.i);
        }
        this.i = null;
    }

    public boolean hasPanelItems() {
        if(this.f == null) {
            return false;
        }
        return this.g == null ? this.i.getAdapter().getCount() > 0 : true;
    }
}

