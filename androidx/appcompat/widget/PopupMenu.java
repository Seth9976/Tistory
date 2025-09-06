package androidx.appcompat.widget;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View.OnTouchListener;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.R.attr;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPopupHelper;

public class PopupMenu {
    public interface OnDismissListener {
        void onDismiss(PopupMenu arg1);
    }

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem arg1);
    }

    public final Context a;
    public final MenuBuilder b;
    public final View c;
    public final MenuPopupHelper d;
    public OnMenuItemClickListener e;
    public OnDismissListener f;
    public i g;

    public PopupMenu(@NonNull Context context0, @NonNull View view0) {
        this(context0, view0, 0);
    }

    public PopupMenu(@NonNull Context context0, @NonNull View view0, int v) {
        this(context0, view0, v, attr.popupMenuStyle, 0);
    }

    public PopupMenu(@NonNull Context context0, @NonNull View view0, int v, @AttrRes int v1, @StyleRes int v2) {
        this.a = context0;
        this.c = view0;
        MenuBuilder menuBuilder0 = new MenuBuilder(context0);
        this.b = menuBuilder0;
        menuBuilder0.setCallback(new e2(this));
        MenuPopupHelper menuPopupHelper0 = new MenuPopupHelper(context0, menuBuilder0, view0, false, v1, v2);
        this.d = menuPopupHelper0;
        menuPopupHelper0.setGravity(v);
        menuPopupHelper0.setOnDismissListener(new f2(this));
    }

    public void dismiss() {
        this.d.dismiss();
    }

    @NonNull
    public View.OnTouchListener getDragToOpenListener() {
        if(this.g == null) {
            this.g = new i(this, this.c, 3);
        }
        return this.g;
    }

    public int getGravity() {
        return this.d.getGravity();
    }

    @NonNull
    public Menu getMenu() {
        return this.b;
    }

    @NonNull
    public MenuInflater getMenuInflater() {
        return new SupportMenuInflater(this.a);
    }

    public void inflate(@MenuRes int v) {
        this.getMenuInflater().inflate(v, this.b);
    }

    public void setForceShowIcon(boolean z) {
        this.d.setForceShowIcon(z);
    }

    public void setGravity(int v) {
        this.d.setGravity(v);
    }

    public void setOnDismissListener(@Nullable OnDismissListener popupMenu$OnDismissListener0) {
        this.f = popupMenu$OnDismissListener0;
    }

    public void setOnMenuItemClickListener(@Nullable OnMenuItemClickListener popupMenu$OnMenuItemClickListener0) {
        this.e = popupMenu$OnMenuItemClickListener0;
    }

    public void show() {
        this.d.show();
    }
}

