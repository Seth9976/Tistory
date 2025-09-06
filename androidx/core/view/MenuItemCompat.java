package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.internal.view.SupportMenuItem;

public final class MenuItemCompat {
    @Deprecated
    public interface OnActionExpandListener {
        boolean onMenuItemActionCollapse(MenuItem arg1);

        boolean onMenuItemActionExpand(MenuItem arg1);
    }

    @Deprecated
    public static final int SHOW_AS_ACTION_ALWAYS = 2;
    @Deprecated
    public static final int SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW = 8;
    @Deprecated
    public static final int SHOW_AS_ACTION_IF_ROOM = 1;
    @Deprecated
    public static final int SHOW_AS_ACTION_NEVER = 0;
    @Deprecated
    public static final int SHOW_AS_ACTION_WITH_TEXT = 4;

    @Deprecated
    public static boolean collapseActionView(MenuItem menuItem0) {
        return menuItem0.collapseActionView();
    }

    @Deprecated
    public static boolean expandActionView(MenuItem menuItem0) {
        return menuItem0.expandActionView();
    }

    @Nullable
    public static ActionProvider getActionProvider(@NonNull MenuItem menuItem0) {
        if(menuItem0 instanceof SupportMenuItem) {
            return ((SupportMenuItem)menuItem0).getSupportActionProvider();
        }
        Log.w("MenuItemCompat", "getActionProvider: item does not implement SupportMenuItem; returning null");
        return null;
    }

    @Deprecated
    public static View getActionView(MenuItem menuItem0) {
        return menuItem0.getActionView();
    }

    // 去混淆评级： 低(20)
    public static int getAlphabeticModifiers(@NonNull MenuItem menuItem0) {
        return menuItem0 instanceof SupportMenuItem ? ((SupportMenuItem)menuItem0).getAlphabeticModifiers() : u.a(menuItem0);
    }

    // 去混淆评级： 低(20)
    @Nullable
    public static CharSequence getContentDescription(@NonNull MenuItem menuItem0) {
        return menuItem0 instanceof SupportMenuItem ? ((SupportMenuItem)menuItem0).getContentDescription() : u.b(menuItem0);
    }

    // 去混淆评级： 低(20)
    @Nullable
    public static ColorStateList getIconTintList(@NonNull MenuItem menuItem0) {
        return menuItem0 instanceof SupportMenuItem ? ((SupportMenuItem)menuItem0).getIconTintList() : u.c(menuItem0);
    }

    // 去混淆评级： 低(20)
    @Nullable
    public static PorterDuff.Mode getIconTintMode(@NonNull MenuItem menuItem0) {
        return menuItem0 instanceof SupportMenuItem ? ((SupportMenuItem)menuItem0).getIconTintMode() : u.d(menuItem0);
    }

    // 去混淆评级： 低(20)
    public static int getNumericModifiers(@NonNull MenuItem menuItem0) {
        return menuItem0 instanceof SupportMenuItem ? ((SupportMenuItem)menuItem0).getNumericModifiers() : u.e(menuItem0);
    }

    // 去混淆评级： 低(20)
    @Nullable
    public static CharSequence getTooltipText(@NonNull MenuItem menuItem0) {
        return menuItem0 instanceof SupportMenuItem ? ((SupportMenuItem)menuItem0).getTooltipText() : u.f(menuItem0);
    }

    @Deprecated
    public static boolean isActionViewExpanded(MenuItem menuItem0) {
        return menuItem0.isActionViewExpanded();
    }

    @Nullable
    public static MenuItem setActionProvider(@NonNull MenuItem menuItem0, @Nullable ActionProvider actionProvider0) {
        if(menuItem0 instanceof SupportMenuItem) {
            return ((SupportMenuItem)menuItem0).setSupportActionProvider(actionProvider0);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem0;
    }

    @Deprecated
    public static MenuItem setActionView(MenuItem menuItem0, int v) {
        return menuItem0.setActionView(v);
    }

    @Deprecated
    public static MenuItem setActionView(MenuItem menuItem0, View view0) {
        return menuItem0.setActionView(view0);
    }

    public static void setAlphabeticShortcut(@NonNull MenuItem menuItem0, char c, int v) {
        if(menuItem0 instanceof SupportMenuItem) {
            ((SupportMenuItem)menuItem0).setAlphabeticShortcut(c, v);
            return;
        }
        u.g(menuItem0, c, v);
    }

    public static void setContentDescription(@NonNull MenuItem menuItem0, @Nullable CharSequence charSequence0) {
        if(menuItem0 instanceof SupportMenuItem) {
            ((SupportMenuItem)menuItem0).setContentDescription(charSequence0);
            return;
        }
        u.h(menuItem0, charSequence0);
    }

    public static void setIconTintList(@NonNull MenuItem menuItem0, @Nullable ColorStateList colorStateList0) {
        if(menuItem0 instanceof SupportMenuItem) {
            ((SupportMenuItem)menuItem0).setIconTintList(colorStateList0);
            return;
        }
        u.i(menuItem0, colorStateList0);
    }

    public static void setIconTintMode(@NonNull MenuItem menuItem0, @Nullable PorterDuff.Mode porterDuff$Mode0) {
        if(menuItem0 instanceof SupportMenuItem) {
            ((SupportMenuItem)menuItem0).setIconTintMode(porterDuff$Mode0);
            return;
        }
        u.j(menuItem0, porterDuff$Mode0);
    }

    public static void setNumericShortcut(@NonNull MenuItem menuItem0, char c, int v) {
        if(menuItem0 instanceof SupportMenuItem) {
            ((SupportMenuItem)menuItem0).setNumericShortcut(c, v);
            return;
        }
        u.k(menuItem0, c, v);
    }

    @Deprecated
    public static MenuItem setOnActionExpandListener(MenuItem menuItem0, OnActionExpandListener menuItemCompat$OnActionExpandListener0) {
        return menuItem0.setOnActionExpandListener(new t(menuItemCompat$OnActionExpandListener0));
    }

    public static void setShortcut(@NonNull MenuItem menuItem0, char c, char c1, int v, int v1) {
        if(menuItem0 instanceof SupportMenuItem) {
            ((SupportMenuItem)menuItem0).setShortcut(c, c1, v, v1);
            return;
        }
        u.l(menuItem0, c, c1, v, v1);
    }

    @Deprecated
    public static void setShowAsAction(MenuItem menuItem0, int v) {
        menuItem0.setShowAsAction(v);
    }

    public static void setTooltipText(@NonNull MenuItem menuItem0, @Nullable CharSequence charSequence0) {
        if(menuItem0 instanceof SupportMenuItem) {
            ((SupportMenuItem)menuItem0).setTooltipText(charSequence0);
            return;
        }
        u.m(menuItem0, charSequence0);
    }
}

