package androidx.core.app;

import android.app.Notification.MessagingStyle.Message;
import android.app.Person;
import android.os.Parcelable;
import androidx.annotation.DoNotInline;

public abstract class q1 {
    @DoNotInline
    public static Parcelable a(Person person0) {
        return person0;
    }

    @DoNotInline
    public static Notification.MessagingStyle.Message b(CharSequence charSequence0, long v, Person person0) {
        return new Notification.MessagingStyle.Message(charSequence0, v, person0);
    }
}

