package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.SizeTransform;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function1 {
    public final Function1 w;

    public g(Function1 function10) {
        this.w = function10;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        SizeTransform sizeTransform0 = null;
        NavDestination navDestination0 = ((NavBackStackEntry)((AnimatedContentTransitionScope)object0).getTargetState()).getDestination();
        Intrinsics.checkNotNull(navDestination0, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
        for(Object object1: NavDestination.Companion.getHierarchy(((Destination)navDestination0))) {
            SizeTransform sizeTransform1 = NavHostKt.access$createSizeTransform(((NavDestination)object1), ((AnimatedContentTransitionScope)object0));
            if(sizeTransform1 != null) {
                sizeTransform0 = sizeTransform1;
                break;
            }
        }
        if(sizeTransform0 == null) {
            return this.w == null ? null : ((SizeTransform)this.w.invoke(((AnimatedContentTransitionScope)object0)));
        }
        return sizeTransform0;
    }
}

