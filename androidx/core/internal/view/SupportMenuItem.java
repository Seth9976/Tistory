package androidx.core.internal.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.view.ActionProvider;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public interface SupportMenuItem extends MenuItem {
    public static final int SHOW_AS_ACTION_ALWAYS = 2;
    public static final int SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW = 8;
    public static final int SHOW_AS_ACTION_IF_ROOM = 1;
    public static final int SHOW_AS_ACTION_NEVER = 0;
    public static final int SHOW_AS_ACTION_WITH_TEXT = 4;

    @Override  // android.view.MenuItem
    boolean collapseActionView();

    @Override  // android.view.MenuItem
    boolean expandActionView();

    @Override  // android.view.MenuItem
    @Nullable
    View getActionView();

    @Override  // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override  // android.view.MenuItem
    @Nullable
    CharSequence getContentDescription();

    @Override  // android.view.MenuItem
    @Nullable
    ColorStateList getIconTintList();

    @Override  // android.view.MenuItem
    @Nullable
    PorterDuff.Mode getIconTintMode();

    @Override  // android.view.MenuItem
    int getNumericModifiers();

    @Nullable
    ActionProvider getSupportActionProvider();

    @Override  // android.view.MenuItem
    @Nullable
    CharSequence getTooltipText();

    @Override  // android.view.MenuItem
    boolean isActionViewExpanded();

    boolean requiresActionButton();

    boolean requiresOverflow();

    @Override  // android.view.MenuItem
    @NonNull
    MenuItem setActionView(int arg1);

    @Override  // android.view.MenuItem
    @NonNull
    MenuItem setActionView(@Nullable View arg1);

    @Override  // android.view.MenuItem
    @NonNull
    MenuItem setAlphabeticShortcut(char arg1, int arg2);

    @Override  // android.view.MenuItem
    @NonNull
    default MenuItem setContentDescription(@Nullable CharSequence charSequence0) {
        return this.setContentDescription(charSequence0);
    }

    @NonNull
    SupportMenuItem setContentDescription(@Nullable CharSequence arg1);

    @Override  // android.view.MenuItem
    @NonNull
    MenuItem setIconTintList(@Nullable ColorStateList arg1);

    @Override  // android.view.MenuItem
    @NonNull
    MenuItem setIconTintMode(@Nullable PorterDuff.Mode arg1);

    @Override  // android.view.MenuItem
    @NonNull
    MenuItem setNumericShortcut(char arg1, int arg2);

    @Override  // android.view.MenuItem
    @NonNull
    MenuItem setShortcut(char arg1, char arg2, int arg3, int arg4);

    @Override  // android.view.MenuItem
    void setShowAsAction(int arg1);

    @Override  // android.view.MenuItem
    @NonNull
    MenuItem setShowAsActionFlags(int arg1);

    @NonNull
    SupportMenuItem setSupportActionProvider(@Nullable ActionProvider arg1);

    @Override  // android.view.MenuItem
    @NonNull
    default MenuItem setTooltipText(@Nullable CharSequence charSequence0) {
        return this.setTooltipText(charSequence0);
    }

    @NonNull
    SupportMenuItem setTooltipText(@Nullable CharSequence arg1);
}

