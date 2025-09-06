package androidx.navigation.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.annotation.StringRes;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.transition.TransitionManager;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\f2\b\u0010\u000F\u001A\u0004\u0018\u00010\u000EH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001A\u00020\u00102\b\u0010\u0014\u001A\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001B\u001A\u00020\u00102\b\u0010\u0018\u001A\u0004\u0018\u00010\u00172\b\b\u0001\u0010\u001A\u001A\u00020\u0019H\u0014¢\u0006\u0004\b\u001B\u0010\u001C¨\u0006\u001D"}, d2 = {"Landroidx/navigation/ui/CollapsingToolbarOnDestinationChangedListener;", "Landroidx/navigation/ui/AbstractAppBarOnDestinationChangedListener;", "Lcom/google/android/material/appbar/CollapsingToolbarLayout;", "collapsingToolbarLayout", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroidx/navigation/ui/AppBarConfiguration;", "configuration", "<init>", "(Lcom/google/android/material/appbar/CollapsingToolbarLayout;Landroidx/appcompat/widget/Toolbar;Landroidx/navigation/ui/AppBarConfiguration;)V", "Landroidx/navigation/NavController;", "controller", "Landroidx/navigation/NavDestination;", "destination", "Landroid/os/Bundle;", "arguments", "", "onDestinationChanged", "(Landroidx/navigation/NavController;Landroidx/navigation/NavDestination;Landroid/os/Bundle;)V", "", "title", "setTitle", "(Ljava/lang/CharSequence;)V", "Landroid/graphics/drawable/Drawable;", "icon", "", "contentDescription", "setNavigationIcon", "(Landroid/graphics/drawable/Drawable;I)V", "navigation-ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class CollapsingToolbarOnDestinationChangedListener extends AbstractAppBarOnDestinationChangedListener {
    public final WeakReference f;
    public final WeakReference g;

    public CollapsingToolbarOnDestinationChangedListener(@NotNull CollapsingToolbarLayout collapsingToolbarLayout0, @NotNull Toolbar toolbar0, @NotNull AppBarConfiguration appBarConfiguration0) {
        Intrinsics.checkNotNullParameter(collapsingToolbarLayout0, "collapsingToolbarLayout");
        Intrinsics.checkNotNullParameter(toolbar0, "toolbar");
        Intrinsics.checkNotNullParameter(appBarConfiguration0, "configuration");
        Context context0 = collapsingToolbarLayout0.getContext();
        Intrinsics.checkNotNullExpressionValue(context0, "collapsingToolbarLayout.context");
        super(context0, appBarConfiguration0);
        this.f = new WeakReference(collapsingToolbarLayout0);
        this.g = new WeakReference(toolbar0);
    }

    @Override  // androidx.navigation.ui.AbstractAppBarOnDestinationChangedListener
    public void onDestinationChanged(@NotNull NavController navController0, @NotNull NavDestination navDestination0, @Nullable Bundle bundle0) {
        Intrinsics.checkNotNullParameter(navController0, "controller");
        Intrinsics.checkNotNullParameter(navDestination0, "destination");
        if(((CollapsingToolbarLayout)this.f.get()) != null && ((Toolbar)this.g.get()) != null) {
            super.onDestinationChanged(navController0, navDestination0, bundle0);
            return;
        }
        navController0.removeOnDestinationChangedListener(this);
    }

    @Override  // androidx.navigation.ui.AbstractAppBarOnDestinationChangedListener
    public void setNavigationIcon(@Nullable Drawable drawable0, @StringRes int v) {
        Toolbar toolbar0 = (Toolbar)this.g.get();
        if(toolbar0 != null) {
            boolean z = drawable0 == null && toolbar0.getNavigationIcon() != null;
            toolbar0.setNavigationIcon(drawable0);
            toolbar0.setNavigationContentDescription(v);
            if(z) {
                TransitionManager.beginDelayedTransition(toolbar0);
            }
        }
    }

    @Override  // androidx.navigation.ui.AbstractAppBarOnDestinationChangedListener
    public void setTitle(@Nullable CharSequence charSequence0) {
        CollapsingToolbarLayout collapsingToolbarLayout0 = (CollapsingToolbarLayout)this.f.get();
        if(collapsingToolbarLayout0 != null) {
            collapsingToolbarLayout0.setTitle(charSequence0);
        }
    }
}

