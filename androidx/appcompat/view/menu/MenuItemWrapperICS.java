package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.internal.view.SupportMenuItem;
import java.lang.reflect.Method;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public class MenuItemWrapperICS extends b implements MenuItem {
    public final SupportMenuItem d;
    public Method e;

    public MenuItemWrapperICS(Context context0, SupportMenuItem supportMenuItem0) {
        super(context0);
        if(supportMenuItem0 == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.d = supportMenuItem0;
    }

    @Override  // android.view.MenuItem
    public boolean collapseActionView() {
        return this.d.collapseActionView();
    }

    @Override  // android.view.MenuItem
    public boolean expandActionView() {
        return this.d.expandActionView();
    }

    @Override  // android.view.MenuItem
    public ActionProvider getActionProvider() {
        androidx.core.view.ActionProvider actionProvider0 = this.d.getSupportActionProvider();
        return actionProvider0 instanceof l ? ((l)actionProvider0).d : null;
    }

    @Override  // android.view.MenuItem
    public View getActionView() {
        View view0 = this.d.getActionView();
        return view0 instanceof n ? ((View)((n)view0).a) : view0;
    }

    @Override  // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.d.getAlphabeticModifiers();
    }

    @Override  // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.d.getAlphabeticShortcut();
    }

    @Override  // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.d.getContentDescription();
    }

    @Override  // android.view.MenuItem
    public int getGroupId() {
        return this.d.getGroupId();
    }

    @Override  // android.view.MenuItem
    public Drawable getIcon() {
        return this.d.getIcon();
    }

    @Override  // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.d.getIconTintList();
    }

    @Override  // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.d.getIconTintMode();
    }

    @Override  // android.view.MenuItem
    public Intent getIntent() {
        return this.d.getIntent();
    }

    @Override  // android.view.MenuItem
    public int getItemId() {
        return this.d.getItemId();
    }

    @Override  // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.d.getMenuInfo();
    }

    @Override  // android.view.MenuItem
    public int getNumericModifiers() {
        return this.d.getNumericModifiers();
    }

    @Override  // android.view.MenuItem
    public char getNumericShortcut() {
        return this.d.getNumericShortcut();
    }

    @Override  // android.view.MenuItem
    public int getOrder() {
        return this.d.getOrder();
    }

    @Override  // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.b(this.d.getSubMenu());
    }

    @Override  // android.view.MenuItem
    public CharSequence getTitle() {
        return this.d.getTitle();
    }

    @Override  // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.d.getTitleCondensed();
    }

    @Override  // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.d.getTooltipText();
    }

    @Override  // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.d.hasSubMenu();
    }

    @Override  // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.d.isActionViewExpanded();
    }

    @Override  // android.view.MenuItem
    public boolean isCheckable() {
        return this.d.isCheckable();
    }

    @Override  // android.view.MenuItem
    public boolean isChecked() {
        return this.d.isChecked();
    }

    @Override  // android.view.MenuItem
    public boolean isEnabled() {
        return this.d.isEnabled();
    }

    @Override  // android.view.MenuItem
    public boolean isVisible() {
        return this.d.isVisible();
    }

    @Override  // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider0) {
        m m0 = new m(this, this.a, actionProvider0);  // 初始化器: Landroidx/appcompat/view/menu/l;-><init>(Landroidx/appcompat/view/menu/MenuItemWrapperICS;Landroid/content/Context;Landroid/view/ActionProvider;)V
        if(actionProvider0 == null) {
            m0 = null;
        }
        this.d.setSupportActionProvider(m0);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setActionView(int v) {
        SupportMenuItem supportMenuItem0 = this.d;
        supportMenuItem0.setActionView(v);
        View view0 = supportMenuItem0.getActionView();
        if(view0 instanceof CollapsibleActionView) {
            supportMenuItem0.setActionView(new n(view0));
        }
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setActionView(View view0) {
        if(view0 instanceof CollapsibleActionView) {
            view0 = new n(view0);
        }
        this.d.setActionView(view0);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        this.d.setAlphabeticShortcut(c);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int v) {
        this.d.setAlphabeticShortcut(c, v);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.d.setCheckable(z);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.d.setChecked(z);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence0) {
        this.d.setContentDescription(charSequence0);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.d.setEnabled(z);
        return this;
    }

    public void setExclusiveCheckable(boolean z) {
        try {
            SupportMenuItem supportMenuItem0 = this.d;
            if(this.e == null) {
                this.e = supportMenuItem0.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.e.invoke(supportMenuItem0, Boolean.valueOf(z));
            return;
        }
        catch(Exception exception0) {
        }
        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", exception0);
    }

    @Override  // android.view.MenuItem
    public MenuItem setIcon(int v) {
        this.d.setIcon(v);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable0) {
        this.d.setIcon(drawable0);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList0) {
        this.d.setIconTintList(colorStateList0);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode porterDuff$Mode0) {
        this.d.setIconTintMode(porterDuff$Mode0);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setIntent(Intent intent0) {
        this.d.setIntent(intent0);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        this.d.setNumericShortcut(c);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int v) {
        this.d.setNumericShortcut(c, v);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener menuItem$OnActionExpandListener0) {
        o o0 = menuItem$OnActionExpandListener0 == null ? null : new o(this, menuItem$OnActionExpandListener0);
        this.d.setOnActionExpandListener(o0);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener menuItem$OnMenuItemClickListener0) {
        p p0 = menuItem$OnMenuItemClickListener0 == null ? null : new p(this, menuItem$OnMenuItemClickListener0);
        this.d.setOnMenuItemClickListener(p0);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setShortcut(char c, char c1) {
        this.d.setShortcut(c, c1);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setShortcut(char c, char c1, int v, int v1) {
        this.d.setShortcut(c, c1, v, v1);
        return this;
    }

    @Override  // android.view.MenuItem
    public void setShowAsAction(int v) {
        this.d.setShowAsAction(v);
    }

    @Override  // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int v) {
        this.d.setShowAsActionFlags(v);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setTitle(int v) {
        this.d.setTitle(v);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence0) {
        this.d.setTitle(charSequence0);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence0) {
        this.d.setTitleCondensed(charSequence0);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence0) {
        this.d.setTooltipText(charSequence0);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        return this.d.setVisible(z);
    }
}

