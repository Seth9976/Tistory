package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.runtime.MutableState;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function1 {
    public final ComposeNavigator w;
    public final Function1 x;
    public final Function1 y;
    public final MutableState z;

    public e(ComposeNavigator composeNavigator0, Function1 function10, Function1 function11, MutableState mutableState0) {
        this.w = composeNavigator0;
        this.x = function10;
        this.y = function11;
        this.z = mutableState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        NavDestination navDestination0 = ((NavBackStackEntry)((AnimatedContentTransitionScope)object0).getTargetState()).getDestination();
        Intrinsics.checkNotNull(navDestination0, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
        if(!((Boolean)this.w.isPop$navigation_compose_release().getValue()).booleanValue() && !NavHostKt.access$NavHost$lambda$11(this.z)) {
            for(Object object1: NavDestination.Companion.getHierarchy(((Destination)navDestination0))) {
                EnterTransition enterTransition0 = NavHostKt.access$createEnterTransition(((NavDestination)object1), ((AnimatedContentTransitionScope)object0));
                if(enterTransition0 != null) {
                    return enterTransition0 == null ? ((EnterTransition)this.y.invoke(((AnimatedContentTransitionScope)object0))) : enterTransition0;
                }
                if(false) {
                    break;
                }
            }
            return (EnterTransition)this.y.invoke(((AnimatedContentTransitionScope)object0));
        }
        for(Object object2: NavDestination.Companion.getHierarchy(((Destination)navDestination0))) {
            EnterTransition enterTransition1 = NavHostKt.access$createPopEnterTransition(((NavDestination)object2), ((AnimatedContentTransitionScope)object0));
            if(enterTransition1 != null) {
                return enterTransition1 == null ? ((EnterTransition)this.x.invoke(((AnimatedContentTransitionScope)object0))) : enterTransition1;
            }
            if(false) {
                break;
            }
        }
        return (EnterTransition)this.x.invoke(((AnimatedContentTransitionScope)object0));
    }
}

