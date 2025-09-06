package r4;

import android.view.MenuItem;
import androidx.navigation.NavController;
import androidx.navigation.ui.NavigationUI;
import com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener;
import kotlin.jvm.internal.Intrinsics;

public final class a implements OnItemSelectedListener {
    public final NavController a;
    public final boolean b;

    public a(NavController navController0, boolean z) {
        this.a = navController0;
        this.b = z;
    }

    @Override  // com.google.android.material.navigation.NavigationBarView$OnItemSelectedListener
    public final boolean onNavigationItemSelected(MenuItem menuItem0) {
        Intrinsics.checkNotNullParameter(this.a, "$navController");
        Intrinsics.checkNotNullParameter(menuItem0, "item");
        return NavigationUI.onNavDestinationSelected(menuItem0, this.a, this.b);
    }
}

