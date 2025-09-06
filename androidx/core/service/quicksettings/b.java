package androidx.core.service.quicksettings;

import android.app.PendingIntent;
import android.service.quicksettings.TileService;
import androidx.annotation.DoNotInline;

public abstract class b {
    @DoNotInline
    public static void a(TileService tileService0, PendingIntent pendingIntent0) {
        tileService0.startActivityAndCollapse(pendingIntent0);
    }
}

