package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyCharacterMap.KeyData;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ActionProvider;
import androidx.core.view.ViewConfigurationCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public class MenuBuilder implements SupportMenu {
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public interface Callback {
        boolean onMenuItemSelected(@NonNull MenuBuilder arg1, @NonNull MenuItem arg2);

        void onMenuModeChange(@NonNull MenuBuilder arg1);
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public interface ItemInvoker {
        boolean invokeItem(MenuItemImpl arg1);
    }

    public static final int[] A;
    public final Context a;
    public final Resources b;
    public boolean c;
    public boolean d;
    public Callback e;
    public final ArrayList f;
    public final ArrayList g;
    public boolean h;
    public final ArrayList i;
    public final ArrayList j;
    public boolean k;
    public int l;
    public ContextMenu.ContextMenuInfo m;
    public CharSequence n;
    public Drawable o;
    public View p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public final ArrayList v;
    public final CopyOnWriteArrayList w;
    public MenuItemImpl x;
    public boolean y;
    public boolean z;

    static {
        MenuBuilder.A = new int[]{1, 4, 5, 3, 2, 0};
    }

    public MenuBuilder(Context context0) {
        this.l = 0;
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = false;
        this.u = false;
        this.v = new ArrayList();
        this.w = new CopyOnWriteArrayList();
        this.y = false;
        this.a = context0;
        this.b = context0.getResources();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = true;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = true;
        this.f(true);
    }

    public boolean a(MenuBuilder menuBuilder0, MenuItemImpl menuItemImpl0) {
        return this.e != null && this.e.onMenuItemSelected(menuBuilder0, menuItemImpl0);
    }

    @Override  // android.view.Menu
    public MenuItem add(int v) {
        return this.addInternal(0, 0, 0, this.b.getString(v));
    }

    @Override  // android.view.Menu
    public MenuItem add(int v, int v1, int v2, int v3) {
        return this.addInternal(v, v1, v2, this.b.getString(v3));
    }

    @Override  // android.view.Menu
    public MenuItem add(int v, int v1, int v2, CharSequence charSequence0) {
        return this.addInternal(v, v1, v2, charSequence0);
    }

    @Override  // android.view.Menu
    public MenuItem add(CharSequence charSequence0) {
        return this.addInternal(0, 0, 0, charSequence0);
    }

    @Override  // android.view.Menu
    public int addIntentOptions(int v, int v1, int v2, ComponentName componentName0, Intent[] arr_intent, Intent intent0, int v3, MenuItem[] arr_menuItem) {
        PackageManager packageManager0 = this.a.getPackageManager();
        List list0 = packageManager0.queryIntentActivityOptions(componentName0, arr_intent, intent0, 0);
        int v5 = list0 == null ? 0 : list0.size();
        if((v3 & 1) == 0) {
            this.removeGroup(v);
        }
        for(int v4 = 0; v4 < v5; ++v4) {
            ResolveInfo resolveInfo0 = (ResolveInfo)list0.get(v4);
            Intent intent1 = new Intent((resolveInfo0.specificIndex >= 0 ? arr_intent[resolveInfo0.specificIndex] : intent0));
            intent1.setComponent(new ComponentName(resolveInfo0.activityInfo.applicationInfo.packageName, resolveInfo0.activityInfo.name));
            MenuItem menuItem0 = this.add(v, v1, v2, resolveInfo0.loadLabel(packageManager0)).setIcon(resolveInfo0.loadIcon(packageManager0)).setIntent(intent1);
            if(arr_menuItem != null) {
                int v6 = resolveInfo0.specificIndex;
                if(v6 >= 0) {
                    arr_menuItem[v6] = menuItem0;
                }
            }
        }
        return v5;
    }

    public MenuItem addInternal(int v, int v1, int v2, CharSequence charSequence0) {
        int v6;
        int v3 = (0xFFFF0000 & v2) >> 16;
        if(v3 < 0 || v3 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int v4 = MenuBuilder.A[v3] << 16 | 0xFFFF & v2;
        MenuItem menuItem0 = new MenuItemImpl(this, v, v1, v2, v4, charSequence0, this.l);
        ContextMenu.ContextMenuInfo contextMenu$ContextMenuInfo0 = this.m;
        if(contextMenu$ContextMenuInfo0 != null) {
            menuItem0.E = contextMenu$ContextMenuInfo0;
        }
        ArrayList arrayList0 = this.f;
        for(int v5 = arrayList0.size() - 1; true; --v5) {
            v6 = 0;
            if(v5 < 0) {
                break;
            }
            if(((MenuItemImpl)arrayList0.get(v5)).getOrdering() <= v4) {
                v6 = v5 + 1;
                break;
            }
        }
        arrayList0.add(v6, menuItem0);
        this.onItemsChanged(true);
        return menuItem0;
    }

    public void addMenuPresenter(MenuPresenter menuPresenter0) {
        this.addMenuPresenter(menuPresenter0, this.a);
    }

    public void addMenuPresenter(MenuPresenter menuPresenter0, Context context0) {
        WeakReference weakReference0 = new WeakReference(menuPresenter0);
        this.w.add(weakReference0);
        menuPresenter0.initForMenu(context0, this);
        this.k = true;
    }

    @Override  // android.view.Menu
    public SubMenu addSubMenu(int v) {
        return this.addSubMenu(0, 0, 0, this.b.getString(v));
    }

    @Override  // android.view.Menu
    public SubMenu addSubMenu(int v, int v1, int v2, int v3) {
        return this.addSubMenu(v, v1, v2, this.b.getString(v3));
    }

    @Override  // android.view.Menu
    public SubMenu addSubMenu(int v, int v1, int v2, CharSequence charSequence0) {
        MenuItemImpl menuItemImpl0 = (MenuItemImpl)this.addInternal(v, v1, v2, charSequence0);
        SubMenu subMenu0 = new SubMenuBuilder(this.a, this, menuItemImpl0);
        menuItemImpl0.setSubMenu(((SubMenuBuilder)subMenu0));
        return subMenu0;
    }

    @Override  // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence0) {
        return this.addSubMenu(0, 0, 0, charSequence0);
    }

    public final MenuItemImpl b(int v, KeyEvent keyEvent0) {
        ArrayList arrayList0 = this.v;
        arrayList0.clear();
        this.c(arrayList0, v, keyEvent0);
        if(arrayList0.isEmpty()) {
            return null;
        }
        int v1 = keyEvent0.getMetaState();
        KeyCharacterMap.KeyData keyCharacterMap$KeyData0 = new KeyCharacterMap.KeyData();
        keyEvent0.getKeyData(keyCharacterMap$KeyData0);
        int v2 = arrayList0.size();
        if(v2 == 1) {
            return (MenuItemImpl)arrayList0.get(0);
        }
        boolean z = this.isQwertyMode();
        for(int v3 = 0; v3 < v2; ++v3) {
            MenuItemImpl menuItemImpl0 = (MenuItemImpl)arrayList0.get(v3);
            int v4 = z ? menuItemImpl0.getAlphabeticShortcut() : menuItemImpl0.getNumericShortcut();
            if(v4 == keyCharacterMap$KeyData0.meta[0] && (v1 & 2) == 0 || v4 == keyCharacterMap$KeyData0.meta[2] && (v1 & 2) != 0 || z && v4 == 8 && v == 67) {
                return menuItemImpl0;
            }
        }
        return null;
    }

    public final void c(ArrayList arrayList0, int v, KeyEvent keyEvent0) {
        boolean z = this.isQwertyMode();
        int v1 = keyEvent0.getModifiers();
        KeyCharacterMap.KeyData keyCharacterMap$KeyData0 = new KeyCharacterMap.KeyData();
        if(!keyEvent0.getKeyData(keyCharacterMap$KeyData0) && v != 67) {
            return;
        }
        ArrayList arrayList1 = this.f;
        int v2 = arrayList1.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            MenuItemImpl menuItemImpl0 = (MenuItemImpl)arrayList1.get(v3);
            if(menuItemImpl0.hasSubMenu()) {
                ((MenuBuilder)menuItemImpl0.getSubMenu()).c(arrayList0, v, keyEvent0);
            }
            int v4 = z ? menuItemImpl0.getAlphabeticShortcut() : menuItemImpl0.getNumericShortcut();
            if((v1 & 0x1100F) == ((z ? menuItemImpl0.getAlphabeticModifiers() : menuItemImpl0.getNumericModifiers()) & 0x1100F) && v4 != 0 && ((v4 == keyCharacterMap$KeyData0.meta[0] || v4 == keyCharacterMap$KeyData0.meta[2] || z && v4 == 8 && v == 67) && menuItemImpl0.isEnabled())) {
                arrayList0.add(menuItemImpl0);
            }
        }
    }

    public void changeMenuMode() {
        Callback menuBuilder$Callback0 = this.e;
        if(menuBuilder$Callback0 != null) {
            menuBuilder$Callback0.onMenuModeChange(this);
        }
    }

    @Override  // android.view.Menu
    public void clear() {
        MenuItemImpl menuItemImpl0 = this.x;
        if(menuItemImpl0 != null) {
            this.collapseItemActionView(menuItemImpl0);
        }
        this.f.clear();
        this.onItemsChanged(true);
    }

    public void clearAll() {
        this.q = true;
        this.clear();
        this.clearHeader();
        this.w.clear();
        this.q = false;
        this.r = false;
        this.s = false;
        this.onItemsChanged(true);
    }

    public void clearHeader() {
        this.o = null;
        this.n = null;
        this.p = null;
        this.onItemsChanged(false);
    }

    @Override  // android.view.Menu
    public void close() {
        this.close(true);
    }

    public final void close(boolean z) {
        if(this.u) {
            return;
        }
        this.u = true;
        CopyOnWriteArrayList copyOnWriteArrayList0 = this.w;
        for(Object object0: copyOnWriteArrayList0) {
            WeakReference weakReference0 = (WeakReference)object0;
            MenuPresenter menuPresenter0 = (MenuPresenter)weakReference0.get();
            if(menuPresenter0 == null) {
                copyOnWriteArrayList0.remove(weakReference0);
            }
            else {
                menuPresenter0.onCloseMenu(this, z);
            }
        }
        this.u = false;
    }

    public boolean collapseItemActionView(MenuItemImpl menuItemImpl0) {
        CopyOnWriteArrayList copyOnWriteArrayList0 = this.w;
        boolean z = false;
        if(!copyOnWriteArrayList0.isEmpty() && this.x == menuItemImpl0) {
            this.stopDispatchingItemsChanged();
            for(Object object0: copyOnWriteArrayList0) {
                WeakReference weakReference0 = (WeakReference)object0;
                MenuPresenter menuPresenter0 = (MenuPresenter)weakReference0.get();
                if(menuPresenter0 == null) {
                    copyOnWriteArrayList0.remove(weakReference0);
                }
                else {
                    z = menuPresenter0.collapseItemActionView(this, menuItemImpl0);
                    if(z) {
                        break;
                    }
                }
            }
            this.startDispatchingItemsChanged();
            if(z) {
                this.x = null;
            }
        }
        return z;
    }

    public final void d(int v, boolean z) {
        if(v >= 0) {
            ArrayList arrayList0 = this.f;
            if(v < arrayList0.size()) {
                arrayList0.remove(v);
                if(z) {
                    this.onItemsChanged(true);
                }
            }
        }
    }

    public final void e(int v, CharSequence charSequence0, int v1, Drawable drawable0, View view0) {
        if(view0 == null) {
            if(v > 0) {
                this.n = this.b.getText(v);
            }
            else if(charSequence0 != null) {
                this.n = charSequence0;
            }
            if(v1 > 0) {
                this.o = ContextCompat.getDrawable(this.getContext(), v1);
            }
            else if(drawable0 != null) {
                this.o = drawable0;
            }
            this.p = null;
        }
        else {
            this.p = view0;
            this.n = null;
            this.o = null;
        }
        this.onItemsChanged(false);
    }

    public boolean expandItemActionView(MenuItemImpl menuItemImpl0) {
        CopyOnWriteArrayList copyOnWriteArrayList0 = this.w;
        boolean z = false;
        if(copyOnWriteArrayList0.isEmpty()) {
            return false;
        }
        this.stopDispatchingItemsChanged();
        for(Object object0: copyOnWriteArrayList0) {
            WeakReference weakReference0 = (WeakReference)object0;
            MenuPresenter menuPresenter0 = (MenuPresenter)weakReference0.get();
            if(menuPresenter0 == null) {
                copyOnWriteArrayList0.remove(weakReference0);
            }
            else {
                z = menuPresenter0.expandItemActionView(this, menuItemImpl0);
                if(z) {
                    break;
                }
            }
        }
        this.startDispatchingItemsChanged();
        if(z) {
            this.x = menuItemImpl0;
        }
        return z;
    }

    public final void f(boolean z) {
        this.d = z && this.b.getConfiguration().keyboard != 1 && ViewConfigurationCompat.shouldShowMenuShortcutsWhenKeyboardPresent(ViewConfiguration.get(this.a), this.a);
    }

    public int findGroupIndex(int v) {
        return this.findGroupIndex(v, 0);
    }

    public int findGroupIndex(int v, int v1) {
        int v2 = this.size();
        if(v1 < 0) {
            v1 = 0;
        }
        while(v1 < v2) {
            if(((MenuItemImpl)this.f.get(v1)).getGroupId() == v) {
                return v1;
            }
            ++v1;
        }
        return -1;
    }

    @Override  // android.view.Menu
    public MenuItem findItem(int v) {
        int v1 = this.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            MenuItem menuItem0 = (MenuItemImpl)this.f.get(v2);
            if(((MenuItemImpl)menuItem0).getItemId() == v) {
                return menuItem0;
            }
            if(((MenuItemImpl)menuItem0).hasSubMenu()) {
                MenuItem menuItem1 = ((MenuItemImpl)menuItem0).getSubMenu().findItem(v);
                if(menuItem1 != null) {
                    return menuItem1;
                }
            }
        }
        return null;
    }

    public int findItemIndex(int v) {
        int v1 = this.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            if(((MenuItemImpl)this.f.get(v2)).getItemId() == v) {
                return v2;
            }
        }
        return -1;
    }

    public void flagActionItems() {
        ArrayList arrayList0 = this.getVisibleItems();
        if(!this.k) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList0 = this.w;
        boolean z = false;
        for(Object object0: copyOnWriteArrayList0) {
            WeakReference weakReference0 = (WeakReference)object0;
            MenuPresenter menuPresenter0 = (MenuPresenter)weakReference0.get();
            if(menuPresenter0 == null) {
                copyOnWriteArrayList0.remove(weakReference0);
            }
            else {
                z |= menuPresenter0.flagActionItems();
            }
        }
        ArrayList arrayList1 = this.i;
        ArrayList arrayList2 = this.j;
        if(z) {
            arrayList1.clear();
            arrayList2.clear();
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                MenuItemImpl menuItemImpl0 = (MenuItemImpl)arrayList0.get(v1);
                if(menuItemImpl0.isActionButton()) {
                    arrayList1.add(menuItemImpl0);
                }
                else {
                    arrayList2.add(menuItemImpl0);
                }
            }
        }
        else {
            arrayList1.clear();
            arrayList2.clear();
            arrayList2.addAll(this.getVisibleItems());
        }
        this.k = false;
    }

    public ArrayList getActionItems() {
        this.flagActionItems();
        return this.i;
    }

    public String getActionViewStatesKey() [...] // 潜在的解密器

    public Context getContext() {
        return this.a;
    }

    public MenuItemImpl getExpandedItem() {
        return this.x;
    }

    public Drawable getHeaderIcon() {
        return this.o;
    }

    public CharSequence getHeaderTitle() {
        return this.n;
    }

    public View getHeaderView() {
        return this.p;
    }

    @Override  // android.view.Menu
    public MenuItem getItem(int v) {
        return (MenuItem)this.f.get(v);
    }

    public ArrayList getNonActionItems() {
        this.flagActionItems();
        return this.j;
    }

    public MenuBuilder getRootMenu() {
        return this;
    }

    @NonNull
    public ArrayList getVisibleItems() {
        ArrayList arrayList0 = this.g;
        if(!this.h) {
            return arrayList0;
        }
        arrayList0.clear();
        ArrayList arrayList1 = this.f;
        int v = arrayList1.size();
        for(int v1 = 0; v1 < v; ++v1) {
            MenuItemImpl menuItemImpl0 = (MenuItemImpl)arrayList1.get(v1);
            if(menuItemImpl0.isVisible()) {
                arrayList0.add(menuItemImpl0);
            }
        }
        this.h = false;
        this.k = true;
        return arrayList0;
    }

    @Override  // android.view.Menu
    public boolean hasVisibleItems() {
        if(this.z) {
            return true;
        }
        int v = this.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(((MenuItemImpl)this.f.get(v1)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean isGroupDividerEnabled() {
        return this.y;
    }

    public boolean isQwertyMode() {
        return this.c;
    }

    @Override  // android.view.Menu
    public boolean isShortcutKey(int v, KeyEvent keyEvent0) {
        return this.b(v, keyEvent0) != null;
    }

    public boolean isShortcutsVisible() {
        return this.d;
    }

    public void onItemsChanged(boolean z) {
        if(this.q) {
            this.r = true;
            if(z) {
                this.s = true;
            }
        }
        else {
            if(z) {
                this.h = true;
                this.k = true;
            }
            CopyOnWriteArrayList copyOnWriteArrayList0 = this.w;
            if(!copyOnWriteArrayList0.isEmpty()) {
                this.stopDispatchingItemsChanged();
                for(Object object0: copyOnWriteArrayList0) {
                    WeakReference weakReference0 = (WeakReference)object0;
                    MenuPresenter menuPresenter0 = (MenuPresenter)weakReference0.get();
                    if(menuPresenter0 == null) {
                        copyOnWriteArrayList0.remove(weakReference0);
                    }
                    else {
                        menuPresenter0.updateMenuView(z);
                    }
                }
                this.startDispatchingItemsChanged();
            }
        }
    }

    @Override  // android.view.Menu
    public boolean performIdentifierAction(int v, int v1) {
        return this.performItemAction(this.findItem(v), v1);
    }

    public boolean performItemAction(MenuItem menuItem0, int v) {
        return this.performItemAction(menuItem0, null, v);
    }

    public boolean performItemAction(MenuItem menuItem0, MenuPresenter menuPresenter0, int v) {
        boolean z = false;
        if(((MenuItemImpl)menuItem0) != null && ((MenuItemImpl)menuItem0).isEnabled()) {
            boolean z1 = ((MenuItemImpl)menuItem0).invoke();
            ActionProvider actionProvider0 = ((MenuItemImpl)menuItem0).getSupportActionProvider();
            boolean z2 = actionProvider0 != null && actionProvider0.hasSubMenu();
            if(((MenuItemImpl)menuItem0).hasCollapsibleActionView()) {
                z1 |= ((MenuItemImpl)menuItem0).expandActionView();
                if(z1) {
                    this.close(true);
                    return true;
                }
            }
            else if(((MenuItemImpl)menuItem0).hasSubMenu() || z2) {
                if((v & 4) == 0) {
                    this.close(false);
                }
                if(!((MenuItemImpl)menuItem0).hasSubMenu()) {
                    ((MenuItemImpl)menuItem0).setSubMenu(new SubMenuBuilder(this.getContext(), this, ((MenuItemImpl)menuItem0)));
                }
                SubMenuBuilder subMenuBuilder0 = (SubMenuBuilder)((MenuItemImpl)menuItem0).getSubMenu();
                if(z2) {
                    actionProvider0.onPrepareSubMenu(subMenuBuilder0);
                }
                CopyOnWriteArrayList copyOnWriteArrayList0 = this.w;
                if(!copyOnWriteArrayList0.isEmpty()) {
                    if(menuPresenter0 != null) {
                        z = menuPresenter0.onSubMenuSelected(subMenuBuilder0);
                    }
                    for(Object object0: copyOnWriteArrayList0) {
                        WeakReference weakReference0 = (WeakReference)object0;
                        MenuPresenter menuPresenter1 = (MenuPresenter)weakReference0.get();
                        if(menuPresenter1 == null) {
                            copyOnWriteArrayList0.remove(weakReference0);
                        }
                        else if(!z) {
                            z = menuPresenter1.onSubMenuSelected(subMenuBuilder0);
                        }
                    }
                }
                z1 |= z;
                if(!z1) {
                    this.close(true);
                }
            }
            else if((v & 1) == 0) {
                this.close(true);
                return z1;
            }
            return z1;
        }
        return false;
    }

    @Override  // android.view.Menu
    public boolean performShortcut(int v, KeyEvent keyEvent0, int v1) {
        MenuItemImpl menuItemImpl0 = this.b(v, keyEvent0);
        boolean z = menuItemImpl0 == null ? false : this.performItemAction(menuItemImpl0, v1);
        if((v1 & 2) != 0) {
            this.close(true);
        }
        return z;
    }

    @Override  // android.view.Menu
    public void removeGroup(int v) {
        int v1 = this.findGroupIndex(v);
        if(v1 >= 0) {
            ArrayList arrayList0 = this.f;
            int v2 = arrayList0.size();
            for(int v3 = 0; v3 < v2 - v1 && ((MenuItemImpl)arrayList0.get(v1)).getGroupId() == v; ++v3) {
                this.d(v1, false);
            }
            this.onItemsChanged(true);
        }
    }

    @Override  // android.view.Menu
    public void removeItem(int v) {
        this.d(this.findItemIndex(v), true);
    }

    public void removeItemAt(int v) {
        this.d(v, true);
    }

    public void removeMenuPresenter(MenuPresenter menuPresenter0) {
        CopyOnWriteArrayList copyOnWriteArrayList0 = this.w;
        for(Object object0: copyOnWriteArrayList0) {
            WeakReference weakReference0 = (WeakReference)object0;
            MenuPresenter menuPresenter1 = (MenuPresenter)weakReference0.get();
            if(menuPresenter1 == null || menuPresenter1 == menuPresenter0) {
                copyOnWriteArrayList0.remove(weakReference0);
            }
        }
    }

    public void restoreActionViewStates(Bundle bundle0) {
        if(bundle0 == null) {
            return;
        }
        SparseArray sparseArray0 = bundle0.getSparseParcelableArray("android:menu:actionviewstates");
        int v = this.size();
        for(int v1 = 0; v1 < v; ++v1) {
            MenuItem menuItem0 = this.getItem(v1);
            View view0 = menuItem0.getActionView();
            if(view0 != null && view0.getId() != -1) {
                view0.restoreHierarchyState(sparseArray0);
            }
            if(menuItem0.hasSubMenu()) {
                ((SubMenuBuilder)menuItem0.getSubMenu()).restoreActionViewStates(bundle0);
            }
        }
        int v2 = bundle0.getInt("android:menu:expandedactionview");
        if(v2 > 0) {
            MenuItem menuItem1 = this.findItem(v2);
            if(menuItem1 != null) {
                menuItem1.expandActionView();
            }
        }
    }

    public void restorePresenterStates(Bundle bundle0) {
        SparseArray sparseArray0 = bundle0.getSparseParcelableArray("android:menu:presenters");
        if(sparseArray0 != null) {
            CopyOnWriteArrayList copyOnWriteArrayList0 = this.w;
            if(!copyOnWriteArrayList0.isEmpty()) {
                for(Object object0: copyOnWriteArrayList0) {
                    WeakReference weakReference0 = (WeakReference)object0;
                    MenuPresenter menuPresenter0 = (MenuPresenter)weakReference0.get();
                    if(menuPresenter0 == null) {
                        copyOnWriteArrayList0.remove(weakReference0);
                    }
                    else {
                        int v = menuPresenter0.getId();
                        if(v > 0) {
                            Parcelable parcelable0 = (Parcelable)sparseArray0.get(v);
                            if(parcelable0 != null) {
                                menuPresenter0.onRestoreInstanceState(parcelable0);
                            }
                        }
                    }
                }
            }
        }
    }

    public void saveActionViewStates(Bundle bundle0) {
        int v = this.size();
        SparseArray sparseArray0 = null;
        for(int v1 = 0; v1 < v; ++v1) {
            MenuItem menuItem0 = this.getItem(v1);
            View view0 = menuItem0.getActionView();
            if(view0 != null && view0.getId() != -1) {
                if(sparseArray0 == null) {
                    sparseArray0 = new SparseArray();
                }
                view0.saveHierarchyState(sparseArray0);
                if(menuItem0.isActionViewExpanded()) {
                    bundle0.putInt("android:menu:expandedactionview", menuItem0.getItemId());
                }
            }
            if(menuItem0.hasSubMenu()) {
                ((SubMenuBuilder)menuItem0.getSubMenu()).saveActionViewStates(bundle0);
            }
        }
        if(sparseArray0 != null) {
            bundle0.putSparseParcelableArray("android:menu:actionviewstates", sparseArray0);
        }
    }

    public void savePresenterStates(Bundle bundle0) {
        CopyOnWriteArrayList copyOnWriteArrayList0 = this.w;
        if(!copyOnWriteArrayList0.isEmpty()) {
            SparseArray sparseArray0 = new SparseArray();
            for(Object object0: copyOnWriteArrayList0) {
                WeakReference weakReference0 = (WeakReference)object0;
                MenuPresenter menuPresenter0 = (MenuPresenter)weakReference0.get();
                if(menuPresenter0 == null) {
                    copyOnWriteArrayList0.remove(weakReference0);
                }
                else {
                    int v = menuPresenter0.getId();
                    if(v > 0) {
                        Parcelable parcelable0 = menuPresenter0.onSaveInstanceState();
                        if(parcelable0 != null) {
                            sparseArray0.put(v, parcelable0);
                        }
                    }
                }
            }
            bundle0.putSparseParcelableArray("android:menu:presenters", sparseArray0);
        }
    }

    public void setCallback(Callback menuBuilder$Callback0) {
        this.e = menuBuilder$Callback0;
    }

    public void setCurrentMenuInfo(ContextMenu.ContextMenuInfo contextMenu$ContextMenuInfo0) {
        this.m = contextMenu$ContextMenuInfo0;
    }

    public MenuBuilder setDefaultShowAsAction(int v) {
        this.l = v;
        return this;
    }

    @Override  // android.view.Menu
    public void setGroupCheckable(int v, boolean z, boolean z1) {
        ArrayList arrayList0 = this.f;
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            MenuItemImpl menuItemImpl0 = (MenuItemImpl)arrayList0.get(v2);
            if(menuItemImpl0.getGroupId() == v) {
                menuItemImpl0.setExclusiveCheckable(z1);
                menuItemImpl0.setCheckable(z);
            }
        }
    }

    @Override  // androidx.core.internal.view.SupportMenu
    public void setGroupDividerEnabled(boolean z) {
        this.y = z;
    }

    @Override  // android.view.Menu
    public void setGroupEnabled(int v, boolean z) {
        ArrayList arrayList0 = this.f;
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            MenuItemImpl menuItemImpl0 = (MenuItemImpl)arrayList0.get(v2);
            if(menuItemImpl0.getGroupId() == v) {
                menuItemImpl0.setEnabled(z);
            }
        }
    }

    @Override  // android.view.Menu
    public void setGroupVisible(int v, boolean z) {
        ArrayList arrayList0 = this.f;
        int v1 = arrayList0.size();
        boolean z1 = false;
        for(int v2 = 0; v2 < v1; ++v2) {
            MenuItemImpl menuItemImpl0 = (MenuItemImpl)arrayList0.get(v2);
            if(menuItemImpl0.getGroupId() == v) {
                int v3 = menuItemImpl0.y;
                int v4 = v3 & -9 | (z ? 0 : 8);
                menuItemImpl0.y = v4;
                if(v3 != v4) {
                    z1 = true;
                }
            }
        }
        if(z1) {
            this.onItemsChanged(true);
        }
    }

    public MenuBuilder setHeaderIconInt(int v) {
        this.e(0, null, v, null, null);
        return this;
    }

    public MenuBuilder setHeaderIconInt(Drawable drawable0) {
        this.e(0, null, 0, drawable0, null);
        return this;
    }

    public MenuBuilder setHeaderTitleInt(int v) {
        this.e(v, null, 0, null, null);
        return this;
    }

    public MenuBuilder setHeaderTitleInt(CharSequence charSequence0) {
        this.e(0, charSequence0, 0, null, null);
        return this;
    }

    public MenuBuilder setHeaderViewInt(View view0) {
        this.e(0, null, 0, null, view0);
        return this;
    }

    public void setOptionalIconsVisible(boolean z) {
        this.t = z;
    }

    public void setOverrideVisibleItems(boolean z) {
        this.z = z;
    }

    @Override  // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.c = z;
        this.onItemsChanged(false);
    }

    public void setShortcutsVisible(boolean z) {
        if(this.d == z) {
            return;
        }
        this.f(z);
        this.onItemsChanged(false);
    }

    @Override  // android.view.Menu
    public int size() {
        return this.f.size();
    }

    public void startDispatchingItemsChanged() {
        this.q = false;
        if(this.r) {
            this.r = false;
            this.onItemsChanged(this.s);
        }
    }

    public void stopDispatchingItemsChanged() {
        if(!this.q) {
            this.q = true;
            this.r = false;
            this.s = false;
        }
    }
}

