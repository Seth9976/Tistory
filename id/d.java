package id;

import java.io.Serializable;
import org.reactivestreams.Subscription;

public final class d implements Serializable {
    public final Subscription a;

    public d(Subscription subscription0) {
        this.a = subscription0;
    }

    @Override
    public final String toString() {
        return "NotificationLite.Subscription[" + this.a + "]";
    }
}

