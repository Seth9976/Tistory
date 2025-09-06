package androidx.navigation;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import n4.a;

public final class c extends Lambda implements Function1 {
    public final NavDestination w;
    public final NavController x;

    public c(NavDestination navDestination0, NavController navController0) {
        this.w = navDestination0;
        this.x = navController0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        NavController navController0;
        Intrinsics.checkNotNullParameter(((NavOptionsBuilder)object0), "$this$navOptions");
        ((NavOptionsBuilder)object0).anim(a.C);
        NavDestination navDestination0 = this.w;
        if(navDestination0 instanceof NavGraph) {
            Iterator iterator0 = NavDestination.Companion.getHierarchy(navDestination0).iterator();
            while(true) {
                boolean z = iterator0.hasNext();
                navController0 = this.x;
                if(!z) {
                    break;
                }
                Object object1 = iterator0.next();
                NavDestination navDestination1 = navController0.getCurrentDestination();
                if(Intrinsics.areEqual(((NavDestination)object1), (navDestination1 == null ? null : navDestination1.getParent()))) {
                    return Unit.INSTANCE;
                }
            }
            NavGraph navGraph0 = navController0.getGraph();
            ((NavOptionsBuilder)object0).popUpTo(NavGraph.Companion.findStartDestination(navGraph0).getId(), a.D);
        }
        return Unit.INSTANCE;
    }
}

