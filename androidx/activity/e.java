package androidx.activity;

import android.util.Log;
import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import androidx.lifecycle.DispatchQueue;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.LifecycleController;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LifecycleEffectKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.fragment.FragmentNavigator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job.DefaultImpls;
import kotlinx.coroutines.Job;

public final class e implements LifecycleEventObserver {
    public final int a;
    public final Object b;
    public final Object c;

    public e(int v, Object object0, Object object1) {
        this.a = v;
        this.b = object0;
        this.c = object1;
        super();
    }

    @Override  // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) {
        Object object0 = this.c;
        Object object1 = this.b;
        switch(this.a) {
            case 0: {
                Intrinsics.checkNotNullParameter(((OnBackPressedDispatcher)object1), "$dispatcher");
                Intrinsics.checkNotNullParameter(((ComponentActivity)object0), "this$0");
                Intrinsics.checkNotNullParameter(lifecycleOwner0, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(lifecycle$Event0, "event");
                if(lifecycle$Event0 == Event.ON_CREATE) {
                    ((OnBackPressedDispatcher)object1).setOnBackInvokedDispatcher(f.a.a(((ComponentActivity)object0)));
                }
                return;
            }
            case 1: {
                ((MenuHostHelper)object1).getClass();
                if(lifecycle$Event0 == Event.ON_DESTROY) {
                    ((MenuHostHelper)object1).removeMenuProvider(((MenuProvider)object0));
                }
                return;
            }
            case 2: {
                Intrinsics.checkNotNullParameter(((LifecycleController)object1), "this$0");
                Intrinsics.checkNotNullParameter(((Job)object0), "$parentJob");
                Intrinsics.checkNotNullParameter(lifecycleOwner0, "source");
                Intrinsics.checkNotNullParameter(lifecycle$Event0, "<anonymous parameter 1>");
                if(lifecycleOwner0.getLifecycle().getCurrentState() == State.DESTROYED) {
                    DefaultImpls.cancel$default(((Job)object0), null, 1, null);
                    ((LifecycleController)object1).finish();
                    return;
                }
                int v = lifecycleOwner0.getLifecycle().getCurrentState().compareTo(((LifecycleController)object1).b);
                DispatchQueue dispatchQueue0 = ((LifecycleController)object1).c;
                if(v < 0) {
                    dispatchQueue0.pause();
                    return;
                }
                dispatchQueue0.resume();
                return;
            }
            case 3: {
                if(lifecycle$Event0 == ((Event)object1)) {
                    LifecycleEffectKt.access$LifecycleEventEffect$lambda$0(((androidx.compose.runtime.State)object0)).invoke();
                }
                return;
            }
            default: {
                Intrinsics.checkNotNullParameter(((FragmentNavigator)object1), "this$0");
                Intrinsics.checkNotNullParameter(((NavBackStackEntry)object0), "$entry");
                Intrinsics.checkNotNullParameter(lifecycleOwner0, "owner");
                Intrinsics.checkNotNullParameter(lifecycle$Event0, "event");
                if(lifecycle$Event0 == Event.ON_RESUME && ((List)((FragmentNavigator)object1).getState().getBackStack().getValue()).contains(((NavBackStackEntry)object0))) {
                    if(FragmentNavigator.access$isLoggingEnabled(((FragmentNavigator)object1), 2)) {
                        Log.v("FragmentNavigator", "Marking transition complete for entry " + ((NavBackStackEntry)object0) + " due to fragment " + lifecycleOwner0 + " view lifecycle reaching RESUMED");
                    }
                    ((FragmentNavigator)object1).getState().markTransitionComplete(((NavBackStackEntry)object0));
                }
                if(lifecycle$Event0 == Event.ON_DESTROY) {
                    if(FragmentNavigator.access$isLoggingEnabled(((FragmentNavigator)object1), 2)) {
                        Log.v("FragmentNavigator", "Marking transition complete for entry " + ((NavBackStackEntry)object0) + " due to fragment " + lifecycleOwner0 + " view lifecycle reaching DESTROYED");
                    }
                    ((FragmentNavigator)object1).getState().markTransitionComplete(((NavBackStackEntry)object0));
                }
            }
        }
    }
}

