package id;

import io.reactivex.disposables.Disposable;
import java.io.Serializable;

public final class b implements Serializable {
    public final Disposable a;

    public b(Disposable disposable0) {
        this.a = disposable0;
    }

    @Override
    public final String toString() {
        return "NotificationLite.Disposable[" + this.a + "]";
    }
}

