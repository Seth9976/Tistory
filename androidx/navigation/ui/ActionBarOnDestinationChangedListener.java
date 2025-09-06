package androidx.navigation.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.annotation.StringRes;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle.Delegate;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u000B\u0010\fJ#\u0010\u0011\u001A\u00020\n2\b\u0010\u000E\u001A\u0004\u0018\u00010\r2\b\b\u0001\u0010\u0010\u001A\u00020\u000FH\u0014¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/navigation/ui/ActionBarOnDestinationChangedListener;", "Landroidx/navigation/ui/AbstractAppBarOnDestinationChangedListener;", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "Landroidx/navigation/ui/AppBarConfiguration;", "configuration", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;Landroidx/navigation/ui/AppBarConfiguration;)V", "", "title", "", "setTitle", "(Ljava/lang/CharSequence;)V", "Landroid/graphics/drawable/Drawable;", "icon", "", "contentDescription", "setNavigationIcon", "(Landroid/graphics/drawable/Drawable;I)V", "navigation-ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ActionBarOnDestinationChangedListener extends AbstractAppBarOnDestinationChangedListener {
    public final AppCompatActivity f;

    public ActionBarOnDestinationChangedListener(@NotNull AppCompatActivity appCompatActivity0, @NotNull AppBarConfiguration appBarConfiguration0) {
        Intrinsics.checkNotNullParameter(appCompatActivity0, "activity");
        Intrinsics.checkNotNullParameter(appBarConfiguration0, "configuration");
        Delegate actionBarDrawerToggle$Delegate0 = appCompatActivity0.getDrawerToggleDelegate();
        if(actionBarDrawerToggle$Delegate0 == null) {
            throw new IllegalStateException(("Activity " + appCompatActivity0 + " does not have a DrawerToggleDelegate set").toString());
        }
        Context context0 = actionBarDrawerToggle$Delegate0.getActionBarThemedContext();
        Intrinsics.checkNotNullExpressionValue(context0, "checkNotNull(activity.dr…  .actionBarThemedContext");
        super(context0, appBarConfiguration0);
        this.f = appCompatActivity0;
    }

    @Override  // androidx.navigation.ui.AbstractAppBarOnDestinationChangedListener
    public void setNavigationIcon(@Nullable Drawable drawable0, @StringRes int v) {
        AppCompatActivity appCompatActivity0 = this.f;
        ActionBar actionBar0 = appCompatActivity0.getSupportActionBar();
        if(actionBar0 == null) {
            throw new IllegalStateException(("Activity " + appCompatActivity0 + " does not have an ActionBar set via setSupportActionBar()").toString());
        }
        Intrinsics.checkNotNullExpressionValue(actionBar0, "checkNotNull(activity.su…ctionBar()\"\n            }");
        actionBar0.setDisplayHomeAsUpEnabled(drawable0 != null);
        Delegate actionBarDrawerToggle$Delegate0 = appCompatActivity0.getDrawerToggleDelegate();
        if(actionBarDrawerToggle$Delegate0 == null) {
            throw new IllegalStateException(("Activity " + appCompatActivity0 + " does not have a DrawerToggleDelegate set").toString());
        }
        Intrinsics.checkNotNullExpressionValue(actionBarDrawerToggle$Delegate0, "checkNotNull(activity.dr…legate set\"\n            }");
        actionBarDrawerToggle$Delegate0.setActionBarUpIndicator(drawable0, v);
    }

    @Override  // androidx.navigation.ui.AbstractAppBarOnDestinationChangedListener
    public void setTitle(@Nullable CharSequence charSequence0) {
        AppCompatActivity appCompatActivity0 = this.f;
        ActionBar actionBar0 = appCompatActivity0.getSupportActionBar();
        if(actionBar0 == null) {
            throw new IllegalStateException(("Activity " + appCompatActivity0 + " does not have an ActionBar set via setSupportActionBar()").toString());
        }
        Intrinsics.checkNotNullExpressionValue(actionBar0, "checkNotNull(activity.su…ctionBar()\"\n            }");
        actionBar0.setTitle(charSequence0);
    }
}

