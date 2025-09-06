package androidx.compose.ui.platform;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.fragment.FragmentNavigator;
import androidx.savedstate.SavedStateRegistry;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.MutableStateFlow;

public final class t1 implements LifecycleEventObserver {
    public final int a;
    public final Object b;

    public t1(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) {
        Object object0 = this.b;
        switch(this.a) {
            case 0: {
                if(lifecycle$Event0 == Event.ON_DESTROY) {
                    ((AbstractComposeView)object0).disposeComposition();
                }
                return;
            }
            case 1: {
                Intrinsics.checkNotNullParameter(((MutableStateFlow)object0), "$mutableStateFlow");
                Intrinsics.checkNotNullParameter(lifecycleOwner0, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(lifecycle$Event0, "event");
                ((MutableStateFlow)object0).setValue(lifecycle$Event0.getTargetState());
                return;
            }
            case 2: {
                ((ProducerScope)object0).trySend-JP2dKIU(lifecycle$Event0);
                return;
            }
            case 3: {
                Intrinsics.checkNotNullParameter(((NavController)object0), "this$0");
                Intrinsics.checkNotNullParameter(lifecycleOwner0, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(lifecycle$Event0, "event");
                ((NavController)object0).t = lifecycle$Event0.getTargetState();
                if(((NavController)object0).c != null) {
                    for(Object object1: ((NavController)object0).g) {
                        ((NavBackStackEntry)object1).handleLifecycleEvent(lifecycle$Event0);
                    }
                }
                return;
            }
            case 4: {
                Intrinsics.checkNotNullParameter(((FragmentNavigator)object0), "this$0");
                Intrinsics.checkNotNullParameter(lifecycleOwner0, "source");
                Intrinsics.checkNotNullParameter(lifecycle$Event0, "event");
                if(lifecycle$Event0 == Event.ON_DESTROY) {
                    Object object2 = null;
                    for(Object object3: ((Iterable)((FragmentNavigator)object0).getState().getTransitionsInProgress().getValue())) {
                        if(Intrinsics.areEqual(((NavBackStackEntry)object3).getId(), ((Fragment)lifecycleOwner0).getTag())) {
                            object2 = object3;
                        }
                    }
                    if(((NavBackStackEntry)object2) != null) {
                        if(FragmentNavigator.c(2)) {
                            Log.v("FragmentNavigator", "Marking transition complete for entry " + ((NavBackStackEntry)object2) + " due to fragment " + lifecycleOwner0 + " lifecycle reaching DESTROYED");
                        }
                        ((FragmentNavigator)object0).getState().markTransitionComplete(((NavBackStackEntry)object2));
                    }
                }
                return;
            }
            case 5: {
                ((Function1)object0).invoke(lifecycle$Event0);
                return;
            }
            default: {
                Intrinsics.checkNotNullParameter(((SavedStateRegistry)object0), "this$0");
                Intrinsics.checkNotNullParameter(lifecycleOwner0, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(lifecycle$Event0, "event");
                if(lifecycle$Event0 == Event.ON_START) {
                    ((SavedStateRegistry)object0).f = true;
                    return;
                }
                if(lifecycle$Event0 == Event.ON_STOP) {
                    ((SavedStateRegistry)object0).f = false;
                }
            }
        }
    }
}

