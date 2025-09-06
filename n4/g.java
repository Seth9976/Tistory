package n4;

import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function1 {
    public final int w;
    public final NavController x;

    public g(NavController navController0, int v) {
        this.w = v;
        this.x = navController0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            Intrinsics.checkNotNullParameter(((NavDestination)object0), "destination");
            return Boolean.valueOf(!this.x.n.containsKey(((NavDestination)object0).getId()));
        }
        Intrinsics.checkNotNullParameter(((NavDestination)object0), "destination");
        return Boolean.valueOf(!this.x.n.containsKey(((NavDestination)object0).getId()));
    }
}

