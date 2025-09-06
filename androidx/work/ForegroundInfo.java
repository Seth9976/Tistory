package androidx.work;

import android.app.Notification;
import androidx.annotation.NonNull;

public final class ForegroundInfo {
    public final int a;
    public final int b;
    public final Notification c;

    public ForegroundInfo(int v, @NonNull Notification notification0) {
        this(v, notification0, 0);
    }

    public ForegroundInfo(int v, @NonNull Notification notification0, int v1) {
        this.a = v;
        this.c = notification0;
        this.b = v1;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(ForegroundInfo.class != class0 || this.a != ((ForegroundInfo)object0).a) {
                return false;
            }
            return this.b == ((ForegroundInfo)object0).b ? this.c.equals(((ForegroundInfo)object0).c) : false;
        }
        return false;
    }

    public int getForegroundServiceType() {
        return this.b;
    }

    @NonNull
    public Notification getNotification() {
        return this.c;
    }

    public int getNotificationId() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.c.hashCode() + (this.a * 0x1F + this.b) * 0x1F;
    }

    @Override
    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.c + '}';
    }
}

