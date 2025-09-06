package androidx.core.app;

import android.app.Notification.MessagingStyle.Message;
import android.app.Notification.MessagingStyle;
import androidx.annotation.DoNotInline;

public abstract class n1 {
    @DoNotInline
    public static Notification.MessagingStyle a(Notification.MessagingStyle notification$MessagingStyle0, Notification.MessagingStyle.Message notification$MessagingStyle$Message0) {
        return notification$MessagingStyle0.addHistoricMessage(notification$MessagingStyle$Message0);
    }
}

