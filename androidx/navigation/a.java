package androidx.navigation;

import android.os.Bundle;
import android.util.Log;
import androidx.compose.material3.jf;
import androidx.lifecycle.Lifecycle.State;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class a extends NavigatorState {
    public final Navigator g;
    public final NavController h;

    public a(NavController navController0, Navigator navigator0) {
        Intrinsics.checkNotNullParameter(navigator0, "navigator");
        this.h = navController0;
        super();
        this.g = navigator0;
    }

    public static final void a(a a0, NavBackStackEntry navBackStackEntry0, boolean z) {
        a0.super.pop(navBackStackEntry0, z);
    }

    public final void b(NavBackStackEntry navBackStackEntry0) {
        Intrinsics.checkNotNullParameter(navBackStackEntry0, "backStackEntry");
        super.push(navBackStackEntry0);
    }

    @Override  // androidx.navigation.NavigatorState
    public final NavBackStackEntry createBackStackEntry(NavDestination navDestination0, Bundle bundle0) {
        Intrinsics.checkNotNullParameter(navDestination0, "destination");
        State lifecycle$State0 = this.h.getHostLifecycleState$navigation_runtime_release();
        NavControllerViewModel navControllerViewModel0 = this.h.r;
        return Companion.create$default(NavBackStackEntry.Companion, this.h.getContext(), navDestination0, bundle0, lifecycle$State0, navControllerViewModel0, null, null, 0x60, null);
    }

    @Override  // androidx.navigation.NavigatorState
    public final void markTransitionComplete(NavBackStackEntry navBackStackEntry0) {
        Intrinsics.checkNotNullParameter(navBackStackEntry0, "entry");
        NavController navController0 = this.h;
        boolean z = Intrinsics.areEqual(navController0.B.get(navBackStackEntry0), Boolean.TRUE);
        super.markTransitionComplete(navBackStackEntry0);
        navController0.B.remove(navBackStackEntry0);
        if(!navController0.g.contains(navBackStackEntry0)) {
            navController0.unlinkChildFromParent$navigation_runtime_release(navBackStackEntry0);
            if(navBackStackEntry0.getLifecycle().getCurrentState().isAtLeast(State.CREATED)) {
                navBackStackEntry0.setMaxLifecycle(State.DESTROYED);
            }
            ArrayDeque arrayDeque0 = navController0.g;
            if(arrayDeque0 == null || !arrayDeque0.isEmpty()) {
                for(Object object0: arrayDeque0) {
                    if(!Intrinsics.areEqual(((NavBackStackEntry)object0).getId(), navBackStackEntry0.getId())) {
                        continue;
                    }
                    navController0.updateBackStackLifecycle$navigation_runtime_release();
                    navController0.j.tryEmit(navController0.populateVisibleEntries$navigation_runtime_release());
                    return;
                }
            }
            if(!z) {
                NavControllerViewModel navControllerViewModel0 = navController0.r;
                if(navControllerViewModel0 != null) {
                    navControllerViewModel0.clear(navBackStackEntry0.getId());
                }
            }
            navController0.updateBackStackLifecycle$navigation_runtime_release();
            navController0.j.tryEmit(navController0.populateVisibleEntries$navigation_runtime_release());
            return;
        }
        if(!this.isNavigating()) {
            navController0.updateBackStackLifecycle$navigation_runtime_release();
            navController0.h.tryEmit(CollectionsKt___CollectionsKt.toMutableList(navController0.g));
            navController0.j.tryEmit(navController0.populateVisibleEntries$navigation_runtime_release());
        }
    }

    @Override  // androidx.navigation.NavigatorState
    public final void pop(NavBackStackEntry navBackStackEntry0, boolean z) {
        Intrinsics.checkNotNullParameter(navBackStackEntry0, "popUpTo");
        NavController navController0 = this.h;
        Navigator navigator0 = navController0.x.getNavigator(navBackStackEntry0.getDestination().getNavigatorName());
        navController0.B.put(navBackStackEntry0, Boolean.valueOf(z));
        if(Intrinsics.areEqual(navigator0, this.g)) {
            Function1 function10 = navController0.A;
            if(function10 != null) {
                function10.invoke(navBackStackEntry0);
                super.pop(navBackStackEntry0, z);
                return;
            }
            navController0.popBackStackFromNavigator$navigation_runtime_release(navBackStackEntry0, new jf(this, navBackStackEntry0, z, 3));
            return;
        }
        Object object0 = navController0.y.get(navigator0);
        Intrinsics.checkNotNull(object0);
        ((a)object0).pop(navBackStackEntry0, z);
    }

    @Override  // androidx.navigation.NavigatorState
    public final void popWithTransition(NavBackStackEntry navBackStackEntry0, boolean z) {
        Intrinsics.checkNotNullParameter(navBackStackEntry0, "popUpTo");
        super.popWithTransition(navBackStackEntry0, z);
    }

    @Override  // androidx.navigation.NavigatorState
    public final void prepareForTransition(NavBackStackEntry navBackStackEntry0) {
        Intrinsics.checkNotNullParameter(navBackStackEntry0, "entry");
        super.prepareForTransition(navBackStackEntry0);
        if(!this.h.g.contains(navBackStackEntry0)) {
            throw new IllegalStateException("Cannot transition entry that is not in the back stack");
        }
        navBackStackEntry0.setMaxLifecycle(State.STARTED);
    }

    @Override  // androidx.navigation.NavigatorState
    public final void push(NavBackStackEntry navBackStackEntry0) {
        Intrinsics.checkNotNullParameter(navBackStackEntry0, "backStackEntry");
        NavController navController0 = this.h;
        Navigator navigator0 = navController0.x.getNavigator(navBackStackEntry0.getDestination().getNavigatorName());
        if(Intrinsics.areEqual(navigator0, this.g)) {
            Function1 function10 = navController0.z;
            if(function10 != null) {
                function10.invoke(navBackStackEntry0);
                Intrinsics.checkNotNullParameter(navBackStackEntry0, "backStackEntry");
                super.push(navBackStackEntry0);
                return;
            }
            Log.i("NavController", "Ignoring add of destination " + navBackStackEntry0.getDestination() + " outside of the call to navigate(). ");
            return;
        }
        Object object0 = navController0.y.get(navigator0);
        if(object0 == null) {
            throw new IllegalStateException(("NavigatorBackStack for " + navBackStackEntry0.getDestination().getNavigatorName() + " should already be created").toString());
        }
        ((a)object0).push(navBackStackEntry0);
    }
}

