package n4;

import androidx.navigation.NavDeepLinkBuilder.PermissiveNavigatorProvider.mDestNavigator.1;
import androidx.navigation.NavGraphNavigator;
import androidx.navigation.Navigator;
import androidx.navigation.NavigatorProvider;
import kotlin.jvm.internal.Intrinsics;

public final class m extends NavigatorProvider {
    public final NavDeepLinkBuilder.PermissiveNavigatorProvider.mDestNavigator.1 c;

    public m() {
        this.c = new NavDeepLinkBuilder.PermissiveNavigatorProvider.mDestNavigator.1();
        this.addNavigator(new NavGraphNavigator(this));
    }

    @Override  // androidx.navigation.NavigatorProvider
    public final Navigator getNavigator(String s) {
        Intrinsics.checkNotNullParameter(s, "name");
        try {
            return super.getNavigator(s);
        }
        catch(IllegalStateException unused_ex) {
            Intrinsics.checkNotNull(this.c, "null cannot be cast to non-null type T of androidx.navigation.NavDeepLinkBuilder.PermissiveNavigatorProvider.getNavigator");
            return this.c;
        }
    }
}

