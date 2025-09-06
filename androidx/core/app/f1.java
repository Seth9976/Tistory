package androidx.core.app;

import android.app.Notification.Builder;
import androidx.annotation.DoNotInline;

public abstract class f1 {
    @DoNotInline
    public static Notification.Builder a(Notification.Builder notification$Builder0, String s) {
        return notification$Builder0.addPerson(s);
    }

    @DoNotInline
    public static Notification.Builder b(Notification.Builder notification$Builder0, String s) {
        return notification$Builder0.setCategory(s);
    }
}

