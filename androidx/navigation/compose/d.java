package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function2 {
    public final NavBackStackEntry w;
    public final AnimatedContentScope x;

    public d(NavBackStackEntry navBackStackEntry0, AnimatedContentScope animatedContentScope0) {
        this.w = navBackStackEntry0;
        this.x = animatedContentScope0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 3) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xB4B00A4D, v, -1, "androidx.navigation.compose.NavHost.<anonymous>.<anonymous> (NavHost.kt:693)");
        }
        NavDestination navDestination0 = this.w.getDestination();
        Intrinsics.checkNotNull(navDestination0, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
        ((Destination)navDestination0).getContent$navigation_compose_release().invoke(this.x, this.w, ((Composer)object0), 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

