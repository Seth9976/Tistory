package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode.Callback;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.appcompat.view.menu.MenuWrapperICS;
import androidx.collection.SimpleArrayMap;
import androidx.core.internal.view.SupportMenu;
import androidx.core.internal.view.SupportMenuItem;
import java.util.ArrayList;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public class SupportActionModeWrapper extends ActionMode {
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public static class CallbackWrapper implements Callback {
        public final ActionMode.Callback a;
        public final Context b;
        public final ArrayList c;
        public final SimpleArrayMap d;

        public CallbackWrapper(Context context0, ActionMode.Callback actionMode$Callback0) {
            this.b = context0;
            this.a = actionMode$Callback0;
            this.c = new ArrayList();
            this.d = new SimpleArrayMap();
        }

        public ActionMode getActionModeWrapper(androidx.appcompat.view.ActionMode actionMode0) {
            ArrayList arrayList0 = this.c;
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                ActionMode actionMode1 = (SupportActionModeWrapper)arrayList0.get(v1);
                if(actionMode1 != null && actionMode1.b == actionMode0) {
                    return actionMode1;
                }
            }
            ActionMode actionMode2 = new SupportActionModeWrapper(this.b, actionMode0);
            arrayList0.add(actionMode2);
            return actionMode2;
        }

        @Override  // androidx.appcompat.view.ActionMode$Callback
        public boolean onActionItemClicked(androidx.appcompat.view.ActionMode actionMode0, MenuItem menuItem0) {
            ActionMode actionMode1 = this.getActionModeWrapper(actionMode0);
            MenuItemWrapperICS menuItemWrapperICS0 = new MenuItemWrapperICS(this.b, ((SupportMenuItem)menuItem0));
            return this.a.onActionItemClicked(actionMode1, menuItemWrapperICS0);
        }

        @Override  // androidx.appcompat.view.ActionMode$Callback
        public boolean onCreateActionMode(androidx.appcompat.view.ActionMode actionMode0, Menu menu0) {
            ActionMode actionMode1 = this.getActionModeWrapper(actionMode0);
            SimpleArrayMap simpleArrayMap0 = this.d;
            Menu menu1 = (Menu)simpleArrayMap0.get(menu0);
            if(menu1 == null) {
                menu1 = new MenuWrapperICS(this.b, ((SupportMenu)menu0));
                simpleArrayMap0.put(menu0, menu1);
            }
            return this.a.onCreateActionMode(actionMode1, menu1);
        }

        @Override  // androidx.appcompat.view.ActionMode$Callback
        public void onDestroyActionMode(androidx.appcompat.view.ActionMode actionMode0) {
            ActionMode actionMode1 = this.getActionModeWrapper(actionMode0);
            this.a.onDestroyActionMode(actionMode1);
        }

        @Override  // androidx.appcompat.view.ActionMode$Callback
        public boolean onPrepareActionMode(androidx.appcompat.view.ActionMode actionMode0, Menu menu0) {
            ActionMode actionMode1 = this.getActionModeWrapper(actionMode0);
            SimpleArrayMap simpleArrayMap0 = this.d;
            Menu menu1 = (Menu)simpleArrayMap0.get(menu0);
            if(menu1 == null) {
                menu1 = new MenuWrapperICS(this.b, ((SupportMenu)menu0));
                simpleArrayMap0.put(menu0, menu1);
            }
            return this.a.onPrepareActionMode(actionMode1, menu1);
        }
    }

    public final Context a;
    public final androidx.appcompat.view.ActionMode b;

    public SupportActionModeWrapper(Context context0, androidx.appcompat.view.ActionMode actionMode0) {
        this.a = context0;
        this.b = actionMode0;
    }

    @Override  // android.view.ActionMode
    public void finish() {
        this.b.finish();
    }

    @Override  // android.view.ActionMode
    public View getCustomView() {
        return this.b.getCustomView();
    }

    @Override  // android.view.ActionMode
    public Menu getMenu() {
        SupportMenu supportMenu0 = (SupportMenu)this.b.getMenu();
        return new MenuWrapperICS(this.a, supportMenu0);
    }

    @Override  // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.b.getMenuInflater();
    }

    @Override  // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.b.getSubtitle();
    }

    @Override  // android.view.ActionMode
    public Object getTag() {
        return this.b.getTag();
    }

    @Override  // android.view.ActionMode
    public CharSequence getTitle() {
        return this.b.getTitle();
    }

    @Override  // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.b.getTitleOptionalHint();
    }

    @Override  // android.view.ActionMode
    public void invalidate() {
        this.b.invalidate();
    }

    @Override  // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.b.isTitleOptional();
    }

    @Override  // android.view.ActionMode
    public void setCustomView(View view0) {
        this.b.setCustomView(view0);
    }

    @Override  // android.view.ActionMode
    public void setSubtitle(int v) {
        this.b.setSubtitle(v);
    }

    @Override  // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence0) {
        this.b.setSubtitle(charSequence0);
    }

    @Override  // android.view.ActionMode
    public void setTag(Object object0) {
        this.b.setTag(object0);
    }

    @Override  // android.view.ActionMode
    public void setTitle(int v) {
        this.b.setTitle(v);
    }

    @Override  // android.view.ActionMode
    public void setTitle(CharSequence charSequence0) {
        this.b.setTitle(charSequence0);
    }

    @Override  // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.b.setTitleOptionalHint(z);
    }
}

