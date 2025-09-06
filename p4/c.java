package p4;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentOnAttachListener;
import androidx.lifecycle.k;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavigatorState;
import androidx.navigation.fragment.FragmentNavigator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

public final class c implements FragmentOnAttachListener {
    public final NavigatorState a;
    public final FragmentNavigator b;

    public c(NavigatorState navigatorState0, FragmentNavigator fragmentNavigator0) {
        this.a = navigatorState0;
        this.b = fragmentNavigator0;
    }

    @Override  // androidx.fragment.app.FragmentOnAttachListener
    public final void onAttachFragment(FragmentManager fragmentManager0, Fragment fragment0) {
        Object object0 = null;
        NavigatorState navigatorState0 = this.a;
        Intrinsics.checkNotNullParameter(navigatorState0, "$state");
        FragmentNavigator fragmentNavigator0 = this.b;
        Intrinsics.checkNotNullParameter(fragmentNavigator0, "this$0");
        Intrinsics.checkNotNullParameter(fragmentManager0, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(fragment0, "fragment");
        List list0 = (List)navigatorState0.getBackStack().getValue();
        ListIterator listIterator0 = list0.listIterator(list0.size());
        while(listIterator0.hasPrevious()) {
            Object object1 = listIterator0.previous();
            if(Intrinsics.areEqual(((NavBackStackEntry)object1).getId(), fragment0.getTag())) {
                object0 = object1;
                break;
            }
        }
        fragmentNavigator0.getClass();
        if(FragmentNavigator.c(2)) {
            Log.v("FragmentNavigator", "Attaching fragment " + fragment0 + " associated with entry " + ((NavBackStackEntry)object0) + " to FragmentManager " + fragmentNavigator0.d);
        }
        if(((NavBackStackEntry)object0) != null) {
            fragment0.getViewLifecycleOwnerLiveData().observe(fragment0, new k(new d(fragmentNavigator0, fragment0, ((NavBackStackEntry)object0))));
            fragment0.getLifecycle().addObserver(fragmentNavigator0.h);
            fragmentNavigator0.attachClearViewModel$navigation_fragment_release(fragment0, ((NavBackStackEntry)object0), navigatorState0);
        }
    }
}

