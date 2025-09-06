package androidx.core.app;

import android.app.Notification.MessagingStyle.Message;
import android.app.Notification.MessagingStyle;
import androidx.annotation.DoNotInline;

public abstract class m1 {
    @DoNotInline
    public static Notification.MessagingStyle a(Notification.MessagingStyle notification$MessagingStyle0, Notification.MessagingStyle.Message notification$MessagingStyle$Message0) {
        return notification$MessagingStyle0.addMessage(notification$MessagingStyle$Message0);
    }

    @DoNotInline
    public static Notification.MessagingStyle b(CharSequence charSequence0) {
        return new Notification.MessagingStyle(charSequence0);
    }

    @DoNotInline
    public static Notification.MessagingStyle c(Notification.MessagingStyle notification$MessagingStyle0, CharSequence charSequence0) {
        return notification$MessagingStyle0.setConversationTitle(charSequence0);
    }
}

