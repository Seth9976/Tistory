package androidx.core.app;

import android.app.Notification.MessagingStyle;
import android.app.Person;
import androidx.annotation.DoNotInline;

public abstract class o1 {
    @DoNotInline
    public static Notification.MessagingStyle a(Person person0) {
        return new Notification.MessagingStyle(person0);
    }

    @DoNotInline
    public static Notification.MessagingStyle b(Notification.MessagingStyle notification$MessagingStyle0, boolean z) {
        return notification$MessagingStyle0.setGroupConversation(z);
    }
}

