package r4;

import android.view.MenuItem;
import android.view.ViewParent;
import androidx.customview.widget.Openable;
import androidx.navigation.NavController;
import androidx.navigation.ui.NavigationUI;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener;
import com.google.android.material.navigation.NavigationView;
import kotlin.jvm.internal.Intrinsics;

public final class c implements OnNavigationItemSelectedListener {
    public final NavController a;
    public final boolean b;
    public final NavigationView c;

    public c(NavigationView navigationView0, NavController navController0, boolean z) {
        this.a = navController0;
        this.b = z;
        this.c = navigationView0;
    }

    @Override  // com.google.android.material.navigation.NavigationView$OnNavigationItemSelectedListener
    public final boolean onNavigationItemSelected(MenuItem menuItem0) {
        Intrinsics.checkNotNullParameter(this.a, "$navController");
        NavigationView navigationView0 = this.c;
        Intrinsics.checkNotNullParameter(navigationView0, "$navigationView");
        Intrinsics.checkNotNullParameter(menuItem0, "item");
        boolean z = NavigationUI.onNavDestinationSelected(menuItem0, this.a, this.b);
        if(z) {
            ViewParent viewParent0 = navigationView0.getParent();
            if(viewParent0 instanceof Openable) {
                ((Openable)viewParent0).close();
                return true;
            }
            BottomSheetBehavior bottomSheetBehavior0 = NavigationUI.findBottomSheetBehavior(navigationView0);
            if(bottomSheetBehavior0 != null) {
                bottomSheetBehavior0.setState(5);
            }
        }
        return z;
    }
}

