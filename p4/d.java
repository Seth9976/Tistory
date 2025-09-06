package p4;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.fragment.FragmentNavigator;
import java.util.Collection;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function1 {
    public final FragmentNavigator w;
    public final Fragment x;
    public final NavBackStackEntry y;

    public d(FragmentNavigator fragmentNavigator0, Fragment fragment0, NavBackStackEntry navBackStackEntry0) {
        this.w = fragmentNavigator0;
        this.x = fragment0;
        this.y = navBackStackEntry0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        FragmentNavigator fragmentNavigator0 = this.w;
        Iterable iterable0 = fragmentNavigator0.getPendingOps$navigation_fragment_release();
        boolean z = false;
        Fragment fragment0 = this.x;
        if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
            for(Object object1: iterable0) {
                if(Intrinsics.areEqual(((Pair)object1).getFirst(), fragment0.getTag())) {
                    z = true;
                    break;
                }
                if(false) {
                    break;
                }
            }
        }
        if(((LifecycleOwner)object0) != null && !z) {
            Lifecycle lifecycle0 = fragment0.getViewLifecycleOwner().getLifecycle();
            if(lifecycle0.getCurrentState().isAtLeast(State.CREATED)) {
                lifecycle0.addObserver(((LifecycleObserver)fragmentNavigator0.i.invoke(this.y)));
            }
        }
        return Unit.INSTANCE;
    }
}

