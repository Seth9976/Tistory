package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ExitTransition;
import androidx.compose.runtime.MutableState;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function1 {
    public final ComposeNavigator w;
    public final Function1 x;
    public final Function1 y;
    public final MutableState z;

    public f(ComposeNavigator composeNavigator0, Function1 function10, Function1 function11, MutableState mutableState0) {
        this.w = composeNavigator0;
        this.x = function10;
        this.y = function11;
        this.z = mutableState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        NavDestination navDestination0 = ((NavBackStackEntry)((AnimatedContentTransitionScope)object0).getInitialState()).getDestination();
        Intrinsics.checkNotNull(navDestination0, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
        if(!((Boolean)this.w.isPop$navigation_compose_release().getValue()).booleanValue() && !NavHostKt.access$NavHost$lambda$11(this.z)) {
            for(Object object1: NavDestination.Companion.getHierarchy(((Destination)navDestination0))) {
                ExitTransition exitTransition0 = NavHostKt.access$createExitTransition(((NavDestination)object1), ((AnimatedContentTransitionScope)object0));
                if(exitTransition0 != null) {
                    return exitTransition0 == null ? ((ExitTransition)this.y.invoke(((AnimatedContentTransitionScope)object0))) : exitTransition0;
                }
                if(false) {
                    break;
                }
            }
            return (ExitTransition)this.y.invoke(((AnimatedContentTransitionScope)object0));
        }
        for(Object object2: NavDestination.Companion.getHierarchy(((Destination)navDestination0))) {
            ExitTransition exitTransition1 = NavHostKt.access$createPopExitTransition(((NavDestination)object2), ((AnimatedContentTransitionScope)object0));
            if(exitTransition1 != null) {
                return exitTransition1 == null ? ((ExitTransition)this.x.invoke(((AnimatedContentTransitionScope)object0))) : exitTransition1;
            }
            if(false) {
                break;
            }
        }
        return (ExitTransition)this.x.invoke(((AnimatedContentTransitionScope)object0));
    }
}

