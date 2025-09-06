package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.dimen;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public class MenuPopupHelper implements MenuHelper {
    public final Context a;
    public final MenuBuilder b;
    public final boolean c;
    public final int d;
    public final int e;
    public View f;
    public int g;
    public boolean h;
    public Callback i;
    public q j;
    public PopupWindow.OnDismissListener k;
    public final r l;

    public MenuPopupHelper(@NonNull Context context0, @NonNull MenuBuilder menuBuilder0) {
        this(context0, menuBuilder0, null, false, attr.popupMenuStyle, 0);
    }

    public MenuPopupHelper(@NonNull Context context0, @NonNull MenuBuilder menuBuilder0, @NonNull View view0) {
        this(context0, menuBuilder0, view0, false, attr.popupMenuStyle, 0);
    }

    public MenuPopupHelper(@NonNull Context context0, @NonNull MenuBuilder menuBuilder0, @NonNull View view0, boolean z, @AttrRes int v) {
        this(context0, menuBuilder0, view0, z, v, 0);
    }

    public MenuPopupHelper(@NonNull Context context0, @NonNull MenuBuilder menuBuilder0, @NonNull View view0, boolean z, @AttrRes int v, @StyleRes int v1) {
        this.g = 0x800003;
        this.l = () -> {
            this.j = null;
            PopupWindow.OnDismissListener popupWindow$OnDismissListener0 = this.k;
            if(popupWindow$OnDismissListener0 != null) {
                popupWindow$OnDismissListener0.onDismiss();
            }
        };
        this.a = context0;
        this.b = menuBuilder0;
        this.f = view0;
        this.c = z;
        this.d = v;
        this.e = v1;
    }

    public final void a(int v, int v1, boolean z, boolean z1) {
        q q0 = this.getPopup();
        q0.h(z1);
        if(z) {
            if((GravityCompat.getAbsoluteGravity(this.g, ViewCompat.getLayoutDirection(this.f)) & 7) == 5) {
                v -= this.f.getWidth();
            }
            q0.f(v);
            q0.i(v1);
            int v2 = (int)(this.a.getResources().getDisplayMetrics().density * 48.0f / 2.0f);
            q0.a = new Rect(v - v2, v1 - v2, v + v2, v1 + v2);
        }
        q0.show();
    }

    @Override  // androidx.appcompat.view.menu.MenuHelper
    public void dismiss() {
        if(this.isShowing()) {
            this.j.dismiss();
        }
    }

    public int getGravity() {
        return this.g;
    }

    public ListView getListView() {
        return this.getPopup().getListView();
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY})
    public q getPopup() {
        if(this.j == null) {
            Display display0 = ((WindowManager)this.a.getSystemService("window")).getDefaultDisplay();
            Point point0 = new Point();
            s.a(display0, point0);
            h h0 = Math.min(point0.x, point0.y) >= this.a.getResources().getDimensionPixelSize(dimen.abc_cascading_menus_min_smallest_width) ? new h(this.a, this.f, this.d, this.e, this.c) : new t(this.a, this.b, this.f, this.c, this.d, this.e);
            h0.a(this.b);
            h0.g(this.l);
            h0.c(this.f);
            h0.setCallback(this.i);
            h0.d(this.h);
            h0.e(this.g);
            this.j = h0;
        }
        return this.j;
    }

    public boolean isShowing() {
        return this.j != null && this.j.isShowing();
    }

    // 检测为 Lambda 实现
    public void onDismiss() [...]

    public void setAnchorView(@NonNull View view0) {
        this.f = view0;
    }

    public void setForceShowIcon(boolean z) {
        this.h = z;
        q q0 = this.j;
        if(q0 != null) {
            q0.d(z);
        }
    }

    public void setGravity(int v) {
        this.g = v;
    }

    public void setOnDismissListener(@Nullable PopupWindow.OnDismissListener popupWindow$OnDismissListener0) {
        this.k = popupWindow$OnDismissListener0;
    }

    @Override  // androidx.appcompat.view.menu.MenuHelper
    public void setPresenterCallback(@Nullable Callback menuPresenter$Callback0) {
        this.i = menuPresenter$Callback0;
        q q0 = this.j;
        if(q0 != null) {
            q0.setCallback(menuPresenter$Callback0);
        }
    }

    public void show() {
        if(!this.tryShow()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public void show(int v, int v1) {
        if(!this.tryShow(v, v1)) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean tryShow() {
        if(this.isShowing()) {
            return true;
        }
        if(this.f == null) {
            return false;
        }
        this.a(0, 0, false, false);
        return true;
    }

    public boolean tryShow(int v, int v1) {
        if(this.isShowing()) {
            return true;
        }
        if(this.f == null) {
            return false;
        }
        this.a(v, v1, true, true);
        return true;
    }
}

