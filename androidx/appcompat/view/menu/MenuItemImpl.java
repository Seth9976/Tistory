package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug.CapturedViewProperty;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.view.ActionProvider;
import java.util.ArrayList;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public final class MenuItemImpl implements SupportMenuItem {
    public View A;
    public ActionProvider B;
    public MenuItem.OnActionExpandListener C;
    public boolean D;
    public ContextMenu.ContextMenuInfo E;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public CharSequence e;
    public CharSequence f;
    public Intent g;
    public char h;
    public int i;
    public char j;
    public int k;
    public Drawable l;
    public int m;
    public final MenuBuilder n;
    public SubMenuBuilder o;
    public Runnable p;
    public MenuItem.OnMenuItemClickListener q;
    public CharSequence r;
    public CharSequence s;
    public ColorStateList t;
    public PorterDuff.Mode u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;
    public int z;

    public MenuItemImpl(MenuBuilder menuBuilder0, int v, int v1, int v2, int v3, CharSequence charSequence0, int v4) {
        this.i = 0x1000;
        this.k = 0x1000;
        this.m = 0;
        this.t = null;
        this.u = null;
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = 16;
        this.D = false;
        this.n = menuBuilder0;
        this.a = v1;
        this.b = v;
        this.c = v2;
        this.d = v3;
        this.e = charSequence0;
        this.z = v4;
    }

    public static void a(int v, int v1, String s, StringBuilder stringBuilder0) {
        if((v & v1) == v1) {
            stringBuilder0.append(s);
        }
    }

    public void actionFormatChanged() {
        this.n.k = true;
        this.n.onItemsChanged(true);
    }

    public final Drawable b(Drawable drawable0) {
        if(drawable0 != null && this.x && (this.v || this.w)) {
            drawable0 = drawable0.mutate();
            if(this.v) {
                DrawableCompat.setTintList(drawable0, this.t);
            }
            if(this.w) {
                DrawableCompat.setTintMode(drawable0, this.u);
            }
            this.x = false;
        }
        return drawable0;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    public boolean collapseActionView() {
        if((this.z & 8) == 0) {
            return false;
        }
        if(this.A == null) {
            return true;
        }
        return this.C == null || this.C.onMenuItemActionCollapse(this) ? this.n.collapseItemActionView(this) : false;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    public boolean expandActionView() {
        if(!this.hasCollapsibleActionView()) {
            return false;
        }
        return this.C == null || this.C.onMenuItemActionExpand(this) ? this.n.expandItemActionView(this) : false;
    }

    @Override  // android.view.MenuItem
    public android.view.ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    public View getActionView() {
        View view0 = this.A;
        if(view0 != null) {
            return view0;
        }
        ActionProvider actionProvider0 = this.B;
        if(actionProvider0 != null) {
            View view1 = actionProvider0.onCreateActionView(this);
            this.A = view1;
            return view1;
        }
        return null;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    public int getAlphabeticModifiers() {
        return this.k;
    }

    @Override  // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.j;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    public CharSequence getContentDescription() {
        return this.r;
    }

    @Override  // android.view.MenuItem
    public int getGroupId() {
        return this.b;
    }

    @Override  // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable0 = this.l;
        if(drawable0 != null) {
            return this.b(drawable0);
        }
        if(this.m != 0) {
            Drawable drawable1 = AppCompatResources.getDrawable(this.n.getContext(), this.m);
            this.m = 0;
            this.l = drawable1;
            return this.b(drawable1);
        }
        return null;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    public ColorStateList getIconTintList() {
        return this.t;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.u;
    }

    @Override  // android.view.MenuItem
    public Intent getIntent() {
        return this.g;
    }

    @Override  // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.a;
    }

    @Override  // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    public int getNumericModifiers() {
        return this.i;
    }

    @Override  // android.view.MenuItem
    public char getNumericShortcut() {
        return this.h;
    }

    @Override  // android.view.MenuItem
    public int getOrder() {
        return this.c;
    }

    public int getOrdering() {
        return this.d;
    }

    @Override  // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.o;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    public ActionProvider getSupportActionProvider() {
        return this.B;
    }

    @Override  // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.e;
    }

    @Override  // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f == null ? this.e : this.f;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    public CharSequence getTooltipText() {
        return this.s;
    }

    public boolean hasCollapsibleActionView() {
        if((this.z & 8) != 0) {
            if(this.A == null) {
                ActionProvider actionProvider0 = this.B;
                if(actionProvider0 != null) {
                    this.A = actionProvider0.onCreateActionView(this);
                }
            }
            return this.A != null;
        }
        return false;
    }

    @Override  // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.o != null;
    }

    public boolean invoke() {
        if(this.q != null && this.q.onMenuItemClick(this)) {
            return true;
        }
        MenuBuilder menuBuilder0 = this.n;
        if(menuBuilder0.a(menuBuilder0, this)) {
            return true;
        }
        Runnable runnable0 = this.p;
        if(runnable0 != null) {
            runnable0.run();
            return true;
        }
        if(this.g != null) {
            try {
                menuBuilder0.getContext().startActivity(this.g);
                return true;
            }
            catch(ActivityNotFoundException activityNotFoundException0) {
                Log.e("MenuItemImpl", "Can\'t find activity to handle intent; ignoring", activityNotFoundException0);
            }
        }
        return this.B != null && this.B.onPerformDefaultAction();
    }

    public boolean isActionButton() {
        return (this.y & 0x20) == 0x20;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    public boolean isActionViewExpanded() {
        return this.D;
    }

    @Override  // android.view.MenuItem
    public boolean isCheckable() {
        return (this.y & 1) == 1;
    }

    @Override  // android.view.MenuItem
    public boolean isChecked() {
        return (this.y & 2) == 2;
    }

    @Override  // android.view.MenuItem
    public boolean isEnabled() {
        return (this.y & 16) != 0;
    }

    public boolean isExclusiveCheckable() {
        return (this.y & 4) != 0;
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.MenuItem
    public boolean isVisible() {
        return this.B == null || !this.B.overridesItemVisibility() ? (this.y & 8) == 0 : (this.y & 8) == 0 && this.B.isVisible();
    }

    public boolean requestsActionButton() {
        return (this.z & 1) == 1;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    public boolean requiresActionButton() {
        return (this.z & 2) == 2;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.core.internal.view.SupportMenuItem
    public boolean requiresOverflow() {
        return !this.requiresActionButton() && !this.requestsActionButton();
    }

    @Override  // android.view.MenuItem
    public MenuItem setActionProvider(android.view.ActionProvider actionProvider0) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    @NonNull
    public MenuItem setActionView(int v) {
        return this.setActionView(v);
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    @NonNull
    public MenuItem setActionView(View view0) {
        return this.setActionView(view0);
    }

    @NonNull
    public SupportMenuItem setActionView(int v) {
        Context context0 = this.n.getContext();
        this.setActionView(LayoutInflater.from(context0).inflate(v, new LinearLayout(context0), false));
        return this;
    }

    @NonNull
    public SupportMenuItem setActionView(View view0) {
        this.A = view0;
        this.B = null;
        if(view0 != null && view0.getId() == -1) {
            int v = this.a;
            if(v > 0) {
                view0.setId(v);
            }
        }
        this.n.k = true;
        this.n.onItemsChanged(true);
        return this;
    }

    public void setActionViewExpanded(boolean z) {
        this.D = z;
        this.n.onItemsChanged(false);
    }

    @Override  // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        if(this.j == c) {
            return this;
        }
        this.j = Character.toLowerCase(c);
        this.n.onItemsChanged(false);
        return this;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    @NonNull
    public MenuItem setAlphabeticShortcut(char c, int v) {
        if(this.j == c && this.k == v) {
            return this;
        }
        this.j = Character.toLowerCase(c);
        this.k = KeyEvent.normalizeMetaState(v);
        this.n.onItemsChanged(false);
        return this;
    }

    public MenuItem setCallback(Runnable runnable0) {
        this.p = runnable0;
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int v = this.y;
        int v1 = z | v & -2;
        this.y = v1;
        if(v != v1) {
            this.n.onItemsChanged(false);
        }
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        int v = this.y;
        int v1 = 2;
        if((v & 4) != 0) {
            MenuBuilder menuBuilder0 = this.n;
            menuBuilder0.getClass();
            int v2 = this.getGroupId();
            ArrayList arrayList0 = menuBuilder0.f;
            int v3 = arrayList0.size();
            menuBuilder0.stopDispatchingItemsChanged();
            for(int v4 = 0; v4 < v3; ++v4) {
                MenuItemImpl menuItemImpl0 = (MenuItemImpl)arrayList0.get(v4);
                if(menuItemImpl0.getGroupId() == v2 && menuItemImpl0.isExclusiveCheckable() && menuItemImpl0.isCheckable()) {
                    int v5 = menuItemImpl0.y;
                    int v6 = (menuItemImpl0 == this ? 0 : 2) | v5 & -3;
                    menuItemImpl0.y = v6;
                    if(v5 != v6) {
                        menuItemImpl0.n.onItemsChanged(false);
                    }
                }
            }
            menuBuilder0.startDispatchingItemsChanged();
            return this;
        }
        if(!z) {
            v1 = 0;
        }
        int v7 = v & -3 | v1;
        this.y = v7;
        if(v != v7) {
            this.n.onItemsChanged(false);
        }
        return this;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    @NonNull
    public MenuItem setContentDescription(CharSequence charSequence0) {
        return this.setContentDescription(charSequence0);
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    @NonNull
    public SupportMenuItem setContentDescription(CharSequence charSequence0) {
        this.r = charSequence0;
        this.n.onItemsChanged(false);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        if(z) {
            this.y |= 16;
        }
        else {
            this.y &= -17;
        }
        this.n.onItemsChanged(false);
        return this;
    }

    public void setExclusiveCheckable(boolean z) {
        this.y = (z ? 4 : 0) | this.y & -5;
    }

    @Override  // android.view.MenuItem
    public MenuItem setIcon(int v) {
        this.l = null;
        this.m = v;
        this.x = true;
        this.n.onItemsChanged(false);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable0) {
        this.m = 0;
        this.l = drawable0;
        this.x = true;
        this.n.onItemsChanged(false);
        return this;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    @NonNull
    public MenuItem setIconTintList(@Nullable ColorStateList colorStateList0) {
        this.t = colorStateList0;
        this.v = true;
        this.x = true;
        this.n.onItemsChanged(false);
        return this;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    @NonNull
    public MenuItem setIconTintMode(PorterDuff.Mode porterDuff$Mode0) {
        this.u = porterDuff$Mode0;
        this.w = true;
        this.x = true;
        this.n.onItemsChanged(false);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setIntent(Intent intent0) {
        this.g = intent0;
        return this;
    }

    public void setIsActionButton(boolean z) {
        if(z) {
            this.y |= 0x20;
            return;
        }
        this.y &= -33;
    }

    @Override  // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        if(this.h == c) {
            return this;
        }
        this.h = c;
        this.n.onItemsChanged(false);
        return this;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    @NonNull
    public MenuItem setNumericShortcut(char c, int v) {
        if(this.h == c && this.i == v) {
            return this;
        }
        this.h = c;
        this.i = KeyEvent.normalizeMetaState(v);
        this.n.onItemsChanged(false);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener menuItem$OnActionExpandListener0) {
        this.C = menuItem$OnActionExpandListener0;
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener menuItem$OnMenuItemClickListener0) {
        this.q = menuItem$OnMenuItemClickListener0;
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setShortcut(char c, char c1) {
        this.h = c;
        this.j = Character.toLowerCase(c1);
        this.n.onItemsChanged(false);
        return this;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    @NonNull
    public MenuItem setShortcut(char c, char c1, int v, int v1) {
        this.h = c;
        this.i = KeyEvent.normalizeMetaState(v);
        this.j = Character.toLowerCase(c1);
        this.k = KeyEvent.normalizeMetaState(v1);
        this.n.onItemsChanged(false);
        return this;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    public void setShowAsAction(int v) {
        if((v & 3) != 0 && (v & 3) != 1 && (v & 3) != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.z = v;
        this.n.k = true;
        this.n.onItemsChanged(true);
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    @NonNull
    public MenuItem setShowAsActionFlags(int v) {
        return this.setShowAsActionFlags(v);
    }

    @NonNull
    public SupportMenuItem setShowAsActionFlags(int v) {
        this.setShowAsAction(v);
        return this;
    }

    public void setSubMenu(SubMenuBuilder subMenuBuilder0) {
        this.o = subMenuBuilder0;
        subMenuBuilder0.setHeaderTitle(this.getTitle());
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    @NonNull
    public SupportMenuItem setSupportActionProvider(ActionProvider actionProvider0) {
        ActionProvider actionProvider1 = this.B;
        if(actionProvider1 != null) {
            actionProvider1.reset();
        }
        this.A = null;
        this.B = actionProvider0;
        this.n.onItemsChanged(true);
        ActionProvider actionProvider2 = this.B;
        if(actionProvider2 != null) {
            actionProvider2.setVisibilityListener(new k(this));
        }
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setTitle(int v) {
        return this.setTitle(this.n.getContext().getString(v));
    }

    @Override  // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence0) {
        this.e = charSequence0;
        this.n.onItemsChanged(false);
        SubMenuBuilder subMenuBuilder0 = this.o;
        if(subMenuBuilder0 != null) {
            subMenuBuilder0.setHeaderTitle(charSequence0);
        }
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence0) {
        this.f = charSequence0;
        this.n.onItemsChanged(false);
        return this;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    @NonNull
    public MenuItem setTooltipText(CharSequence charSequence0) {
        return this.setTooltipText(charSequence0);
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    @NonNull
    public SupportMenuItem setTooltipText(CharSequence charSequence0) {
        this.s = charSequence0;
        this.n.onItemsChanged(false);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        int v = this.y;
        int v1 = (z ? 0 : 8) | v & -9;
        this.y = v1;
        if(v != v1) {
            this.n.h = true;
            this.n.onItemsChanged(true);
        }
        return this;
    }

    public boolean shouldShowIcon() {
        return this.n.t;
    }

    public boolean showsTextAsAction() {
        return (this.z & 4) == 4;
    }

    @Override
    public String toString() {
        return this.e == null ? null : this.e.toString();
    }
}

