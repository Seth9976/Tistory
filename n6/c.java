package n6;

import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavigatorState;
import com.google.accompanist.navigation.material.BottomSheetNavigator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function1 {
    public final int w;
    public final BottomSheetNavigator x;
    public final State y;

    public c(BottomSheetNavigator bottomSheetNavigator0, State state0, int v) {
        this.w = v;
        this.x = bottomSheetNavigator0;
        this.y = state0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            Intrinsics.checkNotNullParameter(((NavBackStackEntry)object0), "backStackEntry");
            boolean z = ((Set)this.y.getValue()).contains(((NavBackStackEntry)object0));
            BottomSheetNavigator bottomSheetNavigator0 = this.x;
            if(z) {
                bottomSheetNavigator0.getState().markTransitionComplete(((NavBackStackEntry)object0));
                return Unit.INSTANCE;
            }
            bottomSheetNavigator0.getState().pop(((NavBackStackEntry)object0), false);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(((NavBackStackEntry)object0), "it");
        Iterable iterable0 = (Set)this.y.getValue();
        NavigatorState navigatorState0 = this.x.getState();
        for(Object object1: iterable0) {
            navigatorState0.markTransitionComplete(((NavBackStackEntry)object1));
        }
        return Unit.INSTANCE;
    }
}

