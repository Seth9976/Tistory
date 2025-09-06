package y7;

import android.view.View.OnClickListener;
import android.view.View;
import androidx.appcompat.view.menu.MenuItemImpl;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;

public final class c implements View.OnClickListener {
    public final NavigationBarMenuView a;

    public c(NavigationBarMenuView navigationBarMenuView0) {
        this.a = navigationBarMenuView0;
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        MenuItemImpl menuItemImpl0 = ((NavigationBarItemView)view0).getItemData();
        if(!this.a.E.performItemAction(menuItemImpl0, this.a.D, 0)) {
            menuItemImpl0.setChecked(true);
        }
    }
}

