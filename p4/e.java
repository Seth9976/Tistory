package p4;

import androidx.navigation.NavBackStackEntry;
import androidx.navigation.fragment.FragmentNavigator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function1 {
    public final FragmentNavigator w;

    public e(FragmentNavigator fragmentNavigator0) {
        this.w = fragmentNavigator0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((NavBackStackEntry)object0), "entry");
        return new androidx.activity.e(4, this.w, ((NavBackStackEntry)object0));
    }
}

