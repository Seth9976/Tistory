package androidx.core.app;

import android.app.Notification.BigPictureStyle;
import android.graphics.drawable.Icon;
import androidx.annotation.RequiresApi;

public abstract class y0 {
    @RequiresApi(23)
    public static void a(Notification.BigPictureStyle notification$BigPictureStyle0, Icon icon0) {
        notification$BigPictureStyle0.bigLargeIcon(icon0);
    }
}

