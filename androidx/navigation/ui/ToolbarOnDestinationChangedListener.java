package androidx.navigation.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.annotation.StringRes;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.transition.TransitionManager;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\n2\b\u0010\r\u001A\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u0019\u0010\u0013\u001A\u00020\u000E2\b\u0010\u0012\u001A\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0019\u001A\u00020\u000E2\b\u0010\u0016\u001A\u0004\u0018\u00010\u00152\b\b\u0001\u0010\u0018\u001A\u00020\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001A¨\u0006\u001B"}, d2 = {"Landroidx/navigation/ui/ToolbarOnDestinationChangedListener;", "Landroidx/navigation/ui/AbstractAppBarOnDestinationChangedListener;", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroidx/navigation/ui/AppBarConfiguration;", "configuration", "<init>", "(Landroidx/appcompat/widget/Toolbar;Landroidx/navigation/ui/AppBarConfiguration;)V", "Landroidx/navigation/NavController;", "controller", "Landroidx/navigation/NavDestination;", "destination", "Landroid/os/Bundle;", "arguments", "", "onDestinationChanged", "(Landroidx/navigation/NavController;Landroidx/navigation/NavDestination;Landroid/os/Bundle;)V", "", "title", "setTitle", "(Ljava/lang/CharSequence;)V", "Landroid/graphics/drawable/Drawable;", "icon", "", "contentDescription", "setNavigationIcon", "(Landroid/graphics/drawable/Drawable;I)V", "navigation-ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nToolbarOnDestinationChangedListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ToolbarOnDestinationChangedListener.kt\nandroidx/navigation/ui/ToolbarOnDestinationChangedListener\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n1#2:67\n*E\n"})
public final class ToolbarOnDestinationChangedListener extends AbstractAppBarOnDestinationChangedListener {
    public final WeakReference f;

    public ToolbarOnDestinationChangedListener(@NotNull Toolbar toolbar0, @NotNull AppBarConfiguration appBarConfiguration0) {
        Intrinsics.checkNotNullParameter(toolbar0, "toolbar");
        Intrinsics.checkNotNullParameter(appBarConfiguration0, "configuration");
        Context context0 = toolbar0.getContext();
        Intrinsics.checkNotNullExpressionValue(context0, "toolbar.context");
        super(context0, appBarConfiguration0);
        this.f = new WeakReference(toolbar0);
    }

    @Override  // androidx.navigation.ui.AbstractAppBarOnDestinationChangedListener
    public void onDestinationChanged(@NotNull NavController navController0, @NotNull NavDestination navDestination0, @Nullable Bundle bundle0) {
        Intrinsics.checkNotNullParameter(navController0, "controller");
        Intrinsics.checkNotNullParameter(navDestination0, "destination");
        if(((Toolbar)this.f.get()) == null) {
            navController0.removeOnDestinationChangedListener(this);
            return;
        }
        super.onDestinationChanged(navController0, navDestination0, bundle0);
    }

    @Override  // androidx.navigation.ui.AbstractAppBarOnDestinationChangedListener
    public void setNavigationIcon(@Nullable Drawable drawable0, @StringRes int v) {
        Toolbar toolbar0 = (Toolbar)this.f.get();
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
        Toolbar toolbar0 = (Toolbar)this.f.get();
        if(toolbar0 != null) {
            toolbar0.setTitle(charSequence0);
        }
    }
}

