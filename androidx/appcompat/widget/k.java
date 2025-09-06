package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;
import androidx.appcompat.R.attr;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPopupHelper;

public final class k extends MenuPopupHelper {
    public final o m;

    public k(o o0, Context context0, MenuBuilder menuBuilder0, View view0) {
        this.m = o0;
        super(context0, menuBuilder0, view0, true, attr.actionOverflowMenuStyle);
        this.setGravity(0x800005);
        this.setPresenterCallback(o0.s);
    }

    @Override  // androidx.appcompat.view.menu.MenuPopupHelper
    public final void onDismiss() {
        o o0 = this.m;
        if(o0.mMenu != null) {
            o0.mMenu.close();
        }
        o0.o = null;
        super.onDismiss();
    }
}

