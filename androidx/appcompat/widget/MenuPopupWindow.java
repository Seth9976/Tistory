package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.MenuAdapter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import java.lang.reflect.Method;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public class MenuPopupWindow extends ListPopupWindow implements MenuItemHoverListener {
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public static class MenuDropDownListView extends s1 {
        public final int m;
        public final int n;
        public MenuItemHoverListener o;
        public MenuItemImpl p;

        public MenuDropDownListView(Context context0, boolean z) {
            super(context0, z);
            if(1 == d2.a(context0.getResources().getConfiguration())) {
                this.m = 21;
                this.n = 22;
                return;
            }
            this.m = 22;
            this.n = 21;
        }

        public void clearSelection() {
            this.setSelection(-1);
        }

        @Override  // androidx.appcompat.widget.s1
        public boolean hasFocus() {
            return super.hasFocus();
        }

        @Override  // androidx.appcompat.widget.s1
        public boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override  // androidx.appcompat.widget.s1
        public boolean isFocused() {
            return super.isFocused();
        }

        @Override  // androidx.appcompat.widget.s1
        public boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override  // androidx.appcompat.widget.s1
        public int lookForSelectablePosition(int v, boolean z) {
            return super.lookForSelectablePosition(v, z);
        }

        @Override  // androidx.appcompat.widget.s1
        public int measureHeightOfChildrenCompat(int v, int v1, int v2, int v3, int v4) {
            return super.measureHeightOfChildrenCompat(v, v1, v2, v3, v4);
        }

        @Override  // androidx.appcompat.widget.s1
        public boolean onForwardedEvent(MotionEvent motionEvent0, int v) {
            return super.onForwardedEvent(motionEvent0, v);
        }

        @Override  // androidx.appcompat.widget.s1
        public boolean onHoverEvent(MotionEvent motionEvent0) {
            MenuItemImpl menuItemImpl0;
            MenuAdapter menuAdapter0;
            int v;
            if(this.o != null) {
                ListAdapter listAdapter0 = this.getAdapter();
                if(listAdapter0 instanceof HeaderViewListAdapter) {
                    v = ((HeaderViewListAdapter)listAdapter0).getHeadersCount();
                    menuAdapter0 = (MenuAdapter)((HeaderViewListAdapter)listAdapter0).getWrappedAdapter();
                }
                else {
                    menuAdapter0 = (MenuAdapter)listAdapter0;
                    v = 0;
                }
                if(motionEvent0.getAction() == 10) {
                    menuItemImpl0 = null;
                }
                else {
                    int v1 = this.pointToPosition(((int)motionEvent0.getX()), ((int)motionEvent0.getY()));
                    if(v1 == -1) {
                        menuItemImpl0 = null;
                    }
                    else {
                        int v2 = v1 - v;
                        menuItemImpl0 = v2 < 0 || v2 >= menuAdapter0.getCount() ? null : menuAdapter0.getItem(v2);
                    }
                }
                MenuItemImpl menuItemImpl1 = this.p;
                if(menuItemImpl1 != menuItemImpl0) {
                    MenuBuilder menuBuilder0 = menuAdapter0.getAdapterMenu();
                    if(menuItemImpl1 != null) {
                        this.o.onItemHoverExit(menuBuilder0, menuItemImpl1);
                    }
                    this.p = menuItemImpl0;
                    if(menuItemImpl0 != null) {
                        this.o.onItemHoverEnter(menuBuilder0, menuItemImpl0);
                    }
                }
            }
            return super.onHoverEvent(motionEvent0);
        }

        @Override  // android.widget.ListView
        public boolean onKeyDown(int v, KeyEvent keyEvent0) {
            ListMenuItemView listMenuItemView0 = (ListMenuItemView)this.getSelectedView();
            if(listMenuItemView0 != null && v == this.m) {
                if(listMenuItemView0.isEnabled() && listMenuItemView0.getItemData().hasSubMenu()) {
                    this.performItemClick(listMenuItemView0, this.getSelectedItemPosition(), this.getSelectedItemId());
                }
                return true;
            }
            if(listMenuItemView0 != null && v == this.n) {
                this.setSelection(-1);
                ListAdapter listAdapter0 = this.getAdapter();
                (listAdapter0 instanceof HeaderViewListAdapter ? ((MenuAdapter)((HeaderViewListAdapter)listAdapter0).getWrappedAdapter()) : ((MenuAdapter)listAdapter0)).getAdapterMenu().close(false);
                return true;
            }
            return super.onKeyDown(v, keyEvent0);
        }

        @Override  // androidx.appcompat.widget.s1
        public boolean onTouchEvent(MotionEvent motionEvent0) {
            return super.onTouchEvent(motionEvent0);
        }

        public void setHoverListener(MenuItemHoverListener menuItemHoverListener0) {
            this.o = menuItemHoverListener0;
        }

        @Override  // androidx.appcompat.widget.s1
        public void setSelector(Drawable drawable0) {
            super.setSelector(drawable0);
        }
    }

    public MenuItemHoverListener I;
    public static final Method J;

    static {
        if(Build.VERSION.SDK_INT <= 28) {
            try {
                MenuPopupWindow.J = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
            catch(NoSuchMethodException unused_ex) {
                Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    public MenuPopupWindow(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
    }

    @Override  // androidx.appcompat.widget.ListPopupWindow
    public final s1 a(Context context0, boolean z) {
        s1 s10 = new MenuDropDownListView(context0, z);
        ((MenuDropDownListView)s10).setHoverListener(this);
        return s10;
    }

    @Override  // androidx.appcompat.widget.MenuItemHoverListener
    public void onItemHoverEnter(@NonNull MenuBuilder menuBuilder0, @NonNull MenuItem menuItem0) {
        MenuItemHoverListener menuItemHoverListener0 = this.I;
        if(menuItemHoverListener0 != null) {
            menuItemHoverListener0.onItemHoverEnter(menuBuilder0, menuItem0);
        }
    }

    @Override  // androidx.appcompat.widget.MenuItemHoverListener
    public void onItemHoverExit(@NonNull MenuBuilder menuBuilder0, @NonNull MenuItem menuItem0) {
        MenuItemHoverListener menuItemHoverListener0 = this.I;
        if(menuItemHoverListener0 != null) {
            menuItemHoverListener0.onItemHoverExit(menuBuilder0, menuItem0);
        }
    }

    public void setEnterTransition(Object object0) {
        b2.a(this.F, ((Transition)object0));
    }

    public void setExitTransition(Object object0) {
        b2.b(this.F, ((Transition)object0));
    }

    public void setHoverListener(MenuItemHoverListener menuItemHoverListener0) {
        this.I = menuItemHoverListener0;
    }

    public void setTouchModal(boolean z) {
        PopupWindow popupWindow0 = this.F;
        if(Build.VERSION.SDK_INT <= 28) {
            Method method0 = MenuPopupWindow.J;
            if(method0 != null) {
                try {
                    method0.invoke(popupWindow0, Boolean.valueOf(z));
                }
                catch(Exception unused_ex) {
                    Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                }
            }
        }
        else {
            c2.a(popupWindow0, z);
        }
    }
}

