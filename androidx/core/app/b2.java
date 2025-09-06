package androidx.core.app;

import android.app.Notification.Action.Builder;
import android.app.Notification.Builder;
import android.app.Person;
import androidx.annotation.DoNotInline;

public abstract class b2 {
    @DoNotInline
    public static Notification.Builder a(Notification.Builder notification$Builder0, Person person0) {
        return notification$Builder0.addPerson(person0);
    }

    @DoNotInline
    public static Notification.Action.Builder b(Notification.Action.Builder notification$Action$Builder0, int v) {
        return notification$Action$Builder0.setSemanticAction(v);
    }
}

