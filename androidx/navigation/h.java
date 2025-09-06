package androidx.navigation;

import android.os.Bundle;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function1 {
    public final Navigator w;
    public final NavOptions x;
    public final Extras y;

    public h(Navigator navigator0, NavOptions navOptions0, Extras navigator$Extras0) {
        this.w = navigator0;
        this.x = navOptions0;
        this.y = navigator$Extras0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((NavBackStackEntry)object0), "backStackEntry");
        NavDestination navDestination0 = ((NavBackStackEntry)object0).getDestination();
        if(navDestination0 == null) {
            navDestination0 = null;
        }
        if(navDestination0 != null) {
            Bundle bundle0 = ((NavBackStackEntry)object0).getArguments();
            Navigator navigator0 = this.w;
            NavDestination navDestination1 = navigator0.navigate(navDestination0, bundle0, this.x, this.y);
            if(navDestination1 == null) {
                return null;
            }
            return Intrinsics.areEqual(navDestination1, navDestination0) ? ((NavBackStackEntry)object0) : navigator0.getState().createBackStackEntry(navDestination1, navDestination1.addInDefaultArgs(((NavBackStackEntry)object0).getArguments()));
        }
        return null;
    }
}

