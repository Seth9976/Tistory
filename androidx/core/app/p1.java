package androidx.core.app;

import android.app.Notification.MessagingStyle.Message;
import android.net.Uri;
import androidx.annotation.DoNotInline;

public abstract class p1 {
    @DoNotInline
    public static Notification.MessagingStyle.Message a(CharSequence charSequence0, long v, CharSequence charSequence1) {
        return new Notification.MessagingStyle.Message(charSequence0, v, charSequence1);
    }

    @DoNotInline
    public static Notification.MessagingStyle.Message b(Notification.MessagingStyle.Message notification$MessagingStyle$Message0, String s, Uri uri0) {
        return notification$MessagingStyle$Message0.setData(s, uri0);
    }
}

