package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;
import androidx.appcompat.R.attr;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.view.menu.SubMenuBuilder;

public final class f extends MenuPopupHelper {
    public final o m;

    public f(o o0, Context context0, SubMenuBuilder subMenuBuilder0, View view0) {
        this.m = o0;
        super(context0, subMenuBuilder0, view0, false, attr.actionOverflowMenuStyle);
        if(!((MenuItemImpl)subMenuBuilder0.getItem()).isActionButton()) {
            View view1 = o0.e;
            if(view1 == null) {
                view1 = (View)o0.mMenuView;
            }
            this.setAnchorView(view1);
        }
        this.setPresenterCallback(o0.s);
    }

    @Override  // androidx.appcompat.view.menu.MenuPopupHelper
    public final void onDismiss() {
        this.m.p = null;
        this.m.t = 0;
        super.onDismiss();
    }
}

