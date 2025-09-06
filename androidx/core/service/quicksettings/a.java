package androidx.core.service.quicksettings;

import android.content.Intent;
import android.service.quicksettings.TileService;
import androidx.annotation.DoNotInline;

public abstract class a {
    @DoNotInline
    public static void a(TileService tileService0, Intent intent0) {
        tileService0.startActivityAndCollapse(intent0);
    }
}

