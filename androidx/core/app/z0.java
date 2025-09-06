package androidx.core.app;

import android.app.Notification.BigPictureStyle;
import android.graphics.drawable.Icon;
import androidx.annotation.RequiresApi;

public abstract class z0 {
    @RequiresApi(0x1F)
    public static void a(Notification.BigPictureStyle notification$BigPictureStyle0, Icon icon0) {
        notification$BigPictureStyle0.bigPicture(icon0);
    }

    @RequiresApi(0x1F)
    public static void b(Notification.BigPictureStyle notification$BigPictureStyle0, CharSequence charSequence0) {
        notification$BigPictureStyle0.setContentDescription(charSequence0);
    }

    @RequiresApi(0x1F)
    public static void c(Notification.BigPictureStyle notification$BigPictureStyle0, boolean z) {
        notification$BigPictureStyle0.showBigPictureWhenCollapsed(z);
    }
}

