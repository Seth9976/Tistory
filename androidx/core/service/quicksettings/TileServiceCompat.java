package androidx.core.service.quicksettings;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build.VERSION;
import android.service.quicksettings.TileService;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

public class TileServiceCompat {
    interface TileServiceWrapper {
        void startActivityAndCollapse(PendingIntent arg1);

        void startActivityAndCollapse(Intent arg1);
    }

    public static TileServiceWrapper a;

    @RestrictTo({Scope.LIBRARY})
    public static void clearTileServiceWrapper() {
        TileServiceCompat.a = null;
    }

    @RestrictTo({Scope.LIBRARY})
    public static void setTileServiceWrapper(@NonNull TileServiceWrapper tileServiceCompat$TileServiceWrapper0) {
        TileServiceCompat.a = tileServiceCompat$TileServiceWrapper0;
    }

    public static void startActivityAndCollapse(@NonNull TileService tileService0, @NonNull PendingIntentActivityWrapper pendingIntentActivityWrapper0) {
        if(Build.VERSION.SDK_INT >= 34) {
            TileServiceWrapper tileServiceCompat$TileServiceWrapper0 = TileServiceCompat.a;
            if(tileServiceCompat$TileServiceWrapper0 != null) {
                tileServiceCompat$TileServiceWrapper0.startActivityAndCollapse(pendingIntentActivityWrapper0.getPendingIntent());
                return;
            }
            b.a(tileService0, pendingIntentActivityWrapper0.getPendingIntent());
            return;
        }
        TileServiceWrapper tileServiceCompat$TileServiceWrapper1 = TileServiceCompat.a;
        if(tileServiceCompat$TileServiceWrapper1 != null) {
            tileServiceCompat$TileServiceWrapper1.startActivityAndCollapse(pendingIntentActivityWrapper0.getIntent());
            return;
        }
        a.a(tileService0, pendingIntentActivityWrapper0.getIntent());
    }
}

