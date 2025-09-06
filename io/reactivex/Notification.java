package io.reactivex;

import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.NotificationLite;

public final class Notification {
    public final Object a;
    public static final Notification b;

    static {
        Notification.b = new Notification(null);
    }

    public Notification(Object object0) {
        this.a = object0;
    }

    @NonNull
    public static Notification createOnComplete() {
        return Notification.b;
    }

    @NonNull
    public static Notification createOnError(@NonNull Throwable throwable0) {
        ObjectHelper.requireNonNull(throwable0, "error is null");
        return new Notification(NotificationLite.error(throwable0));
    }

    @NonNull
    public static Notification createOnNext(@NonNull Object object0) {
        ObjectHelper.requireNonNull(object0, "value is null");
        return new Notification(object0);
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof Notification ? ObjectHelper.equals(this.a, ((Notification)object0).a) : false;
    }

    // 去混淆评级： 低(20)
    @Nullable
    public Throwable getError() {
        return NotificationLite.isError(this.a) ? NotificationLite.getError(this.a) : null;
    }

    @Nullable
    public Object getValue() {
        return this.a == null || NotificationLite.isError(this.a) ? null : this.a;
    }

    @Override
    public int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    public boolean isOnComplete() {
        return this.a == null;
    }

    public boolean isOnError() {
        return NotificationLite.isError(this.a);
    }

    public boolean isOnNext() {
        return this.a != null && !NotificationLite.isError(this.a);
    }

    @Override
    public String toString() {
        Object object0 = this.a;
        if(object0 == null) {
            return "OnCompleteNotification";
        }
        return NotificationLite.isError(object0) ? "OnErrorNotification[" + NotificationLite.getError(object0) + "]" : "OnNextNotification[" + object0 + "]";
    }
}

