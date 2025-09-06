package p4;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentOnAttachListener;
import androidx.navigation.fragment.DialogFragmentNavigator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

public final class b implements FragmentOnAttachListener {
    public final DialogFragmentNavigator a;

    public b(DialogFragmentNavigator dialogFragmentNavigator0) {
        this.a = dialogFragmentNavigator0;
    }

    @Override  // androidx.fragment.app.FragmentOnAttachListener
    public final void onAttachFragment(FragmentManager fragmentManager0, Fragment fragment0) {
        DialogFragmentNavigator dialogFragmentNavigator0 = this.a;
        Intrinsics.checkNotNullParameter(dialogFragmentNavigator0, "this$0");
        Intrinsics.checkNotNullParameter(fragmentManager0, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(fragment0, "childFragment");
        if(TypeIntrinsics.asMutableCollection(dialogFragmentNavigator0.e).remove(fragment0.getTag())) {
            fragment0.getLifecycle().addObserver(dialogFragmentNavigator0.f);
        }
        TypeIntrinsics.asMutableMap(dialogFragmentNavigator0.g).remove(fragment0.getTag());
    }
}

