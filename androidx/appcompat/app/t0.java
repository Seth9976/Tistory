package androidx.appcompat.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.Window.Callback;
import android.widget.SpinnerAdapter;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ToolbarWidgetWrapper;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;

public final class t0 extends ActionBar {
    public final ToolbarWidgetWrapper a;
    public final Window.Callback b;
    public final s0 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final ArrayList g;
    public final r h;

    public t0(Toolbar toolbar0, CharSequence charSequence0, Window.Callback window$Callback0) {
        this.g = new ArrayList();
        this.h = new r(this, 1);
        p0 p00 = new p0(this);
        Preconditions.checkNotNull(toolbar0);
        ToolbarWidgetWrapper toolbarWidgetWrapper0 = new ToolbarWidgetWrapper(toolbar0, false);
        this.a = toolbarWidgetWrapper0;
        this.b = (Window.Callback)Preconditions.checkNotNull(window$Callback0);
        toolbarWidgetWrapper0.setWindowCallback(window$Callback0);
        toolbar0.setOnMenuItemClickListener(p00);
        toolbarWidgetWrapper0.setWindowTitle(charSequence0);
        this.c = new s0(this);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final void a() {
        this.a.getViewGroup().removeCallbacks(this.h);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final void addOnMenuVisibilityListener(OnMenuVisibilityListener actionBar$OnMenuVisibilityListener0) {
        this.g.add(actionBar$OnMenuVisibilityListener0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final void addTab(Tab actionBar$Tab0) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final void addTab(Tab actionBar$Tab0, int v) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final void addTab(Tab actionBar$Tab0, int v, boolean z) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final void addTab(Tab actionBar$Tab0, boolean z) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final boolean closeOptionsMenu() {
        return this.a.hideOverflowMenu();
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final boolean collapseActionView() {
        ToolbarWidgetWrapper toolbarWidgetWrapper0 = this.a;
        if(toolbarWidgetWrapper0.hasExpandedActionView()) {
            toolbarWidgetWrapper0.collapseActionView();
            return true;
        }
        return false;
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final void dispatchMenuVisibilityChanged(boolean z) {
        if(z == this.f) {
            return;
        }
        this.f = z;
        ArrayList arrayList0 = this.g;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((OnMenuVisibilityListener)arrayList0.get(v1)).onMenuVisibilityChanged(z);
        }
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final View getCustomView() {
        return this.a.getCustomView();
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final int getDisplayOptions() {
        return this.a.getDisplayOptions();
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final float getElevation() {
        return ViewCompat.getElevation(this.a.getViewGroup());
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final int getHeight() {
        return this.a.getHeight();
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final int getNavigationItemCount() {
        return 0;
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final int getNavigationMode() {
        return 0;
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final int getSelectedNavigationIndex() {
        return -1;
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final Tab getSelectedTab() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final CharSequence getSubtitle() {
        return this.a.getSubtitle();
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final Tab getTabAt(int v) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final int getTabCount() {
        return 0;
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final Context getThemedContext() {
        return this.a.getContext();
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final CharSequence getTitle() {
        return this.a.getTitle();
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final void hide() {
        this.a.setVisibility(8);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final boolean invalidateOptionsMenu() {
        this.a.getViewGroup().removeCallbacks(this.h);
        ViewCompat.postOnAnimation(this.a.getViewGroup(), this.h);
        return true;
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final boolean isShowing() {
        return this.a.getVisibility() == 0;
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final Tab newTab() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final boolean onKeyShortcut(int v, KeyEvent keyEvent0) {
        ToolbarWidgetWrapper toolbarWidgetWrapper0 = this.a;
        boolean z = true;
        if(!this.e) {
            toolbarWidgetWrapper0.setMenuCallbacks(new q0(this), new r0(this));
            this.e = true;
        }
        Menu menu0 = toolbarWidgetWrapper0.getMenu();
        if(menu0 != null) {
            if(KeyCharacterMap.load((keyEvent0 == null ? -1 : keyEvent0.getDeviceId())).getKeyboardType() == 1) {
                z = false;
            }
            menu0.setQwertyMode(z);
            return menu0.performShortcut(v, keyEvent0, 0);
        }
        return false;
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final boolean onMenuKeyEvent(KeyEvent keyEvent0) {
        if(keyEvent0.getAction() == 1) {
            this.openOptionsMenu();
        }
        return true;
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final boolean openOptionsMenu() {
        return this.a.showOverflowMenu();
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final void removeAllTabs() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final void removeOnMenuVisibilityListener(OnMenuVisibilityListener actionBar$OnMenuVisibilityListener0) {
        this.g.remove(actionBar$OnMenuVisibilityListener0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final void removeTab(Tab actionBar$Tab0) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final void removeTabAt(int v) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final void selectTab(Tab actionBar$Tab0) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final void setBackgroundDrawable(Drawable drawable0) {
        this.a.setBackgroundDrawable(drawable0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final void setCustomView(int v) {
        this.setCustomView(LayoutInflater.from(this.a.getContext()).inflate(v, this.a.getViewGroup(), false));
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final void setCustomView(View view0) {
        this.setCustomView(view0, new LayoutParams(-2, -2));
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final void setCustomView(View view0, LayoutParams actionBar$LayoutParams0) {
        if(view0 != null) {
            view0.setLayoutParams(actionBar$LayoutParams0);
        }
        this.a.setCustomView(view0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final void setDefaultDisplayHomeAsUpEnabled(boolean z) {
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final void setDisplayHomeAsUpEnabled(boolean z) {
        this.setDisplayOptions((z ? 4 : 0), 4);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final void setDisplayOptions(int v) {
        this.setDisplayOptions(v, -1);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final void setDisplayOptions(int v, int v1) {
        int v2 = this.a.getDisplayOptions();
        this.a.setDisplayOptions(v & v1 | ~v1 & v2);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final void setDisplayShowCustomEnabled(boolean z) {
        this.setDisplayOptions((z ? 16 : 0), 16);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final void setDisplayShowHomeEnabled(boolean z) {
        this.setDisplayOptions((z ? 2 : 0), 2);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final void setDisplayShowTitleEnabled(boolean z) {
        this.setDisplayOptions((z ? 8 : 0), 8);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final void setDisplayUseLogoEnabled(boolean z) {
        this.setDisplayOptions(((int)z), 1);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final void setElevation(float f) {
        ViewCompat.setElevation(this.a.getViewGroup(), f);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final void setHomeActionContentDescription(int v) {
        this.a.setNavigationContentDescription(v);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final void setHomeActionContentDescription(CharSequence charSequence0) {
        this.a.setNavigationContentDescription(charSequence0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final void setHomeAsUpIndicator(int v) {
        this.a.setNavigationIcon(v);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final void setHomeAsUpIndicator(Drawable drawable0) {
        this.a.setNavigationIcon(drawable0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final void setHomeButtonEnabled(boolean z) {
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final void setIcon(int v) {
        this.a.setIcon(v);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final void setIcon(Drawable drawable0) {
        this.a.setIcon(drawable0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final void setListNavigationCallbacks(SpinnerAdapter spinnerAdapter0, OnNavigationListener actionBar$OnNavigationListener0) {
        o0 o00 = new o0(actionBar$OnNavigationListener0);
        this.a.setDropdownParams(spinnerAdapter0, o00);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final void setLogo(int v) {
        this.a.setLogo(v);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final void setLogo(Drawable drawable0) {
        this.a.setLogo(drawable0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final void setNavigationMode(int v) {
        if(v == 2) {
            throw new IllegalArgumentException("Tabs not supported in this configuration");
        }
        this.a.setNavigationMode(v);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final void setSelectedNavigationItem(int v) {
        ToolbarWidgetWrapper toolbarWidgetWrapper0 = this.a;
        if(toolbarWidgetWrapper0.getNavigationMode() != 1) {
            throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
        }
        toolbarWidgetWrapper0.setDropdownSelectedPosition(v);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final void setShowHideAnimationEnabled(boolean z) {
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final void setSplitBackgroundDrawable(Drawable drawable0) {
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final void setStackedBackgroundDrawable(Drawable drawable0) {
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final void setSubtitle(int v) {
        CharSequence charSequence0 = v == 0 ? null : this.a.getContext().getText(v);
        this.a.setSubtitle(charSequence0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final void setSubtitle(CharSequence charSequence0) {
        this.a.setSubtitle(charSequence0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final void setTitle(int v) {
        CharSequence charSequence0 = v == 0 ? null : this.a.getContext().getText(v);
        this.a.setTitle(charSequence0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final void setTitle(CharSequence charSequence0) {
        this.a.setTitle(charSequence0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final void setWindowTitle(CharSequence charSequence0) {
        this.a.setWindowTitle(charSequence0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public final void show() {
        this.a.setVisibility(0);
    }
}

