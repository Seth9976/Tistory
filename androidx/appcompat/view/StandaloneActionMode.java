package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder.Callback;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public class StandaloneActionMode extends ActionMode implements Callback {
    public final Context c;
    public final ActionBarContextView d;
    public final androidx.appcompat.view.ActionMode.Callback e;
    public WeakReference f;
    public boolean g;
    public final boolean h;
    public final MenuBuilder i;

    public StandaloneActionMode(Context context0, ActionBarContextView actionBarContextView0, androidx.appcompat.view.ActionMode.Callback actionMode$Callback0, boolean z) {
        this.c = context0;
        this.d = actionBarContextView0;
        this.e = actionMode$Callback0;
        MenuBuilder menuBuilder0 = new MenuBuilder(actionBarContextView0.getContext()).setDefaultShowAsAction(1);
        this.i = menuBuilder0;
        menuBuilder0.setCallback(this);
        this.h = z;
    }

    @Override  // androidx.appcompat.view.ActionMode
    public void finish() {
        if(this.g) {
            return;
        }
        this.g = true;
        this.e.onDestroyActionMode(this);
    }

    @Override  // androidx.appcompat.view.ActionMode
    public View getCustomView() {
        return this.f == null ? null : ((View)this.f.get());
    }

    @Override  // androidx.appcompat.view.ActionMode
    public Menu getMenu() {
        return this.i;
    }

    @Override  // androidx.appcompat.view.ActionMode
    public MenuInflater getMenuInflater() {
        return new SupportMenuInflater(this.d.getContext());
    }

    @Override  // androidx.appcompat.view.ActionMode
    public CharSequence getSubtitle() {
        return this.d.getSubtitle();
    }

    @Override  // androidx.appcompat.view.ActionMode
    public CharSequence getTitle() {
        return this.d.getTitle();
    }

    @Override  // androidx.appcompat.view.ActionMode
    public void invalidate() {
        this.e.onPrepareActionMode(this, this.i);
    }

    @Override  // androidx.appcompat.view.ActionMode
    public boolean isTitleOptional() {
        return this.d.isTitleOptional();
    }

    @Override  // androidx.appcompat.view.ActionMode
    public boolean isUiFocusable() {
        return this.h;
    }

    public void onCloseMenu(MenuBuilder menuBuilder0, boolean z) {
    }

    public void onCloseSubMenu(SubMenuBuilder subMenuBuilder0) {
    }

    @Override  // androidx.appcompat.view.menu.MenuBuilder$Callback
    public boolean onMenuItemSelected(@NonNull MenuBuilder menuBuilder0, @NonNull MenuItem menuItem0) {
        return this.e.onActionItemClicked(this, menuItem0);
    }

    @Override  // androidx.appcompat.view.menu.MenuBuilder$Callback
    public void onMenuModeChange(@NonNull MenuBuilder menuBuilder0) {
        this.invalidate();
        this.d.showOverflowMenu();
    }

    public boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder0) {
        if(!subMenuBuilder0.hasVisibleItems()) {
            return true;
        }
        new MenuPopupHelper(this.d.getContext(), subMenuBuilder0).show();
        return true;
    }

    @Override  // androidx.appcompat.view.ActionMode
    public void setCustomView(View view0) {
        this.d.setCustomView(view0);
        this.f = view0 == null ? null : new WeakReference(view0);
    }

    @Override  // androidx.appcompat.view.ActionMode
    public void setSubtitle(int v) {
        this.setSubtitle(this.c.getString(v));
    }

    @Override  // androidx.appcompat.view.ActionMode
    public void setSubtitle(CharSequence charSequence0) {
        this.d.setSubtitle(charSequence0);
    }

    @Override  // androidx.appcompat.view.ActionMode
    public void setTitle(int v) {
        this.setTitle(this.c.getString(v));
    }

    @Override  // androidx.appcompat.view.ActionMode
    public void setTitle(CharSequence charSequence0) {
        this.d.setTitle(charSequence0);
    }

    @Override  // androidx.appcompat.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        super.setTitleOptionalHint(z);
        this.d.setTitleOptional(z);
    }
}

