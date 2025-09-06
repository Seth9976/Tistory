package dc;

import android.os.Bundle;
import androidx.navigation.NavController.OnDestinationChangedListener;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import com.kakao.tistory.presentation.main.MainAppState;

public final class a implements OnDestinationChangedListener {
    public final MainAppState a;

    public a(MainAppState mainAppState0) {
        this.a = mainAppState0;
    }

    @Override  // androidx.navigation.NavController$OnDestinationChangedListener
    public final void onDestinationChanged(NavController navController0, NavDestination navDestination0, Bundle bundle0) {
        MainAppState.a(this.a, navController0, navDestination0, bundle0);
    }
}

