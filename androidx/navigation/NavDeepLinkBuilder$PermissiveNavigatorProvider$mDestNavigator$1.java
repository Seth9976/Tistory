package androidx.navigation;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J7\u0010\f\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001A\u00020\u00022\b\u0010\u0007\u001A\u0004\u0018\u00010\u00062\b\u0010\t\u001A\u0004\u0018\u00010\b2\b\u0010\u000B\u001A\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000F\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u000F\u0010\u0010¨\u0006\u0011"}, d2 = {"androidx/navigation/NavDeepLinkBuilder$PermissiveNavigatorProvider$mDestNavigator$1", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "createDestination", "()Landroidx/navigation/NavDestination;", "destination", "Landroid/os/Bundle;", "args", "Landroidx/navigation/NavOptions;", "navOptions", "Landroidx/navigation/Navigator$Extras;", "navigatorExtras", "navigate", "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)Landroidx/navigation/NavDestination;", "", "popBackStack", "()Z", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class NavDeepLinkBuilder.PermissiveNavigatorProvider.mDestNavigator.1 extends Navigator {
    @Override  // androidx.navigation.Navigator
    @NotNull
    public NavDestination createDestination() {
        return new NavDestination("permissive");
    }

    @Override  // androidx.navigation.Navigator
    @Nullable
    public NavDestination navigate(@NotNull NavDestination navDestination0, @Nullable Bundle bundle0, @Nullable NavOptions navOptions0, @Nullable Extras navigator$Extras0) {
        Intrinsics.checkNotNullParameter(navDestination0, "destination");
        throw new IllegalStateException("navigate is not supported");
    }

    @Override  // androidx.navigation.Navigator
    public boolean popBackStack() {
        throw new IllegalStateException("popBackStack is not supported");
    }
}

