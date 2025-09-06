package androidx.appcompat.app;

import android.view.Window.Callback;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter.Callback;

public final class h0 implements Callback {
    public final i0 a;

    public h0(i0 i00) {
        this.a = i00;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter$Callback
    public final void onCloseMenu(MenuBuilder menuBuilder0, boolean z) {
        AppCompatDelegateImpl.PanelFeatureState appCompatDelegateImpl$PanelFeatureState0;
        MenuBuilder menuBuilder1 = menuBuilder0.getRootMenu();
        boolean z1 = menuBuilder1 != menuBuilder0;
        if(z1) {
            menuBuilder0 = menuBuilder1;
        }
        i0 i00 = this.a;
        AppCompatDelegateImpl.PanelFeatureState[] arr_appCompatDelegateImpl$PanelFeatureState = i00.M;
        int v1 = arr_appCompatDelegateImpl$PanelFeatureState == null ? 0 : arr_appCompatDelegateImpl$PanelFeatureState.length;
        for(int v = 0; true; ++v) {
            appCompatDelegateImpl$PanelFeatureState0 = null;
            if(v >= v1) {
                break;
            }
            AppCompatDelegateImpl.PanelFeatureState appCompatDelegateImpl$PanelFeatureState1 = arr_appCompatDelegateImpl$PanelFeatureState[v];
            if(appCompatDelegateImpl$PanelFeatureState1 != null && appCompatDelegateImpl$PanelFeatureState1.h == menuBuilder0) {
                appCompatDelegateImpl$PanelFeatureState0 = appCompatDelegateImpl$PanelFeatureState1;
                break;
            }
        }
        if(appCompatDelegateImpl$PanelFeatureState0 != null) {
            if(z1) {
                i00.i(appCompatDelegateImpl$PanelFeatureState0.a, appCompatDelegateImpl$PanelFeatureState0, menuBuilder1);
                i00.k(appCompatDelegateImpl$PanelFeatureState0, true);
                return;
            }
            i00.k(appCompatDelegateImpl$PanelFeatureState0, z);
        }
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter$Callback
    public final boolean onOpenSubMenu(MenuBuilder menuBuilder0) {
        if(menuBuilder0 == menuBuilder0.getRootMenu()) {
            i0 i00 = this.a;
            if(i00.G) {
                Window.Callback window$Callback0 = i00.l.getCallback();
                if(window$Callback0 != null && !i00.R) {
                    window$Callback0.onMenuOpened(108, menuBuilder0);
                }
            }
        }
        return true;
    }
}

