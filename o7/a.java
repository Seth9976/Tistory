package o7;

import android.content.res.Resources;
import android.os.Build.VERSION;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.dimen;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.internal.ToolbarUtils;

public final class a implements Runnable {
    public final Toolbar a;
    public final int b;
    public final BadgeDrawable c;
    public final FrameLayout d;

    public a(BadgeDrawable badgeDrawable0, Toolbar toolbar0, int v, FrameLayout frameLayout0) {
        this.a = toolbar0;
        this.b = v;
        this.c = badgeDrawable0;
        this.d = frameLayout0;
    }

    @Override
    public final void run() {
        Toolbar toolbar0 = this.a;
        ActionMenuItemView actionMenuItemView0 = ToolbarUtils.getActionMenuItemView(toolbar0, this.b);
        if(actionMenuItemView0 != null) {
            Resources resources0 = toolbar0.getResources();
            int v = resources0.getDimensionPixelOffset(dimen.mtrl_badge_toolbar_action_menu_item_horizontal_offset);
            BadgeDrawable badgeDrawable0 = this.c;
            badgeDrawable0.e.a.A = v;
            badgeDrawable0.e.b.A = v;
            badgeDrawable0.k();
            int v1 = resources0.getDimensionPixelOffset(dimen.mtrl_badge_toolbar_action_menu_item_vertical_offset);
            badgeDrawable0.e.a.B = v1;
            badgeDrawable0.e.b.B = v1;
            badgeDrawable0.k();
            BadgeUtils.attachBadgeDrawable(badgeDrawable0, actionMenuItemView0, this.d);
            if(Build.VERSION.SDK_INT >= 29 && ViewCompat.hasAccessibilityDelegate(actionMenuItemView0)) {
                ViewCompat.setAccessibilityDelegate(actionMenuItemView0, new b(actionMenuItemView0.getAccessibilityDelegate(), badgeDrawable0));
                return;
            }
            ViewCompat.setAccessibilityDelegate(actionMenuItemView0, new b(badgeDrawable0));
        }
    }
}

