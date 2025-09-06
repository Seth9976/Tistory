package androidx.core.view;

import android.os.Build.VERSION;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.core.internal.view.SupportMenu;

public final class MenuCompat {
    public static void setGroupDividerEnabled(@NonNull Menu menu0, boolean z) {
        if(menu0 instanceof SupportMenu) {
            ((SupportMenu)menu0).setGroupDividerEnabled(z);
            return;
        }
        if(Build.VERSION.SDK_INT >= 28) {
            q.a(menu0, z);
        }
    }

    @Deprecated
    public static void setShowAsAction(MenuItem menuItem0, int v) {
        menuItem0.setShowAsAction(v);
    }
}

