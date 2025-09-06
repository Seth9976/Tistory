package r4;

import android.view.View.OnClickListener;
import android.view.View;
import androidx.navigation.NavController;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import kotlin.jvm.internal.Intrinsics;

public final class b implements View.OnClickListener {
    public final int a;
    public final NavController b;
    public final AppBarConfiguration c;

    public b(NavController navController0, AppBarConfiguration appBarConfiguration0, int v) {
        this.a = v;
        this.b = navController0;
        this.c = appBarConfiguration0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        if(this.a != 0) {
            Intrinsics.checkNotNullParameter(this.b, "$navController");
            Intrinsics.checkNotNullParameter(this.c, "$configuration");
            NavigationUI.navigateUp(this.b, this.c);
            return;
        }
        Intrinsics.checkNotNullParameter(this.b, "$navController");
        Intrinsics.checkNotNullParameter(this.c, "$configuration");
        NavigationUI.navigateUp(this.b, this.c);
    }
}

