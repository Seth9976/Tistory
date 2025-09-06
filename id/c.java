package id;

import io.reactivex.internal.functions.ObjectHelper;
import java.io.Serializable;

public final class c implements Serializable {
    public final Throwable a;

    public c(Throwable throwable0) {
        this.a = throwable0;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof c ? ObjectHelper.equals(this.a, ((c)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "NotificationLite.Error[" + this.a + "]";
    }
}

