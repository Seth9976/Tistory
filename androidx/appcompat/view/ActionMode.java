package androidx.appcompat.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

public abstract class ActionMode {
    public interface Callback {
        boolean onActionItemClicked(ActionMode arg1, MenuItem arg2);

        boolean onCreateActionMode(ActionMode arg1, Menu arg2);

        void onDestroyActionMode(ActionMode arg1);

        boolean onPrepareActionMode(ActionMode arg1, Menu arg2);
    }

    public Object a;
    public boolean b;

    public abstract void finish();

    public abstract View getCustomView();

    public abstract Menu getMenu();

    public abstract MenuInflater getMenuInflater();

    public abstract CharSequence getSubtitle();

    public Object getTag() {
        return this.a;
    }

    public abstract CharSequence getTitle();

    public boolean getTitleOptionalHint() {
        return this.b;
    }

    public abstract void invalidate();

    public boolean isTitleOptional() {
        return false;
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public boolean isUiFocusable() {
        return true;
    }

    public abstract void setCustomView(View arg1);

    public abstract void setSubtitle(int arg1);

    public abstract void setSubtitle(CharSequence arg1);

    public void setTag(Object object0) {
        this.a = object0;
    }

    public abstract void setTitle(int arg1);

    public abstract void setTitle(CharSequence arg1);

    public void setTitleOptionalHint(boolean z) {
        this.b = z;
    }
}

