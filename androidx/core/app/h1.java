package androidx.core.app;

import android.app.Notification.Builder;
import android.app.Person;
import android.os.Parcelable;
import androidx.annotation.DoNotInline;

public abstract class h1 {
    @DoNotInline
    public static Notification.Builder a(Notification.Builder notification$Builder0, Person person0) {
        return notification$Builder0.addPerson(person0);
    }

    @DoNotInline
    public static Parcelable b(Person person0) {
        return person0;
    }
}

