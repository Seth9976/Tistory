package androidx.core.app;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.os.Build.VERSION;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NotificationChannelGroupCompat {
    public static class Builder {
        public final NotificationChannelGroupCompat a;

        public Builder(@NonNull String s) {
            this.a = new NotificationChannelGroupCompat(s);
        }

        @NonNull
        public NotificationChannelGroupCompat build() {
            return this.a;
        }

        @NonNull
        public Builder setDescription(@Nullable String s) {
            this.a.c = s;
            return this;
        }

        @NonNull
        public Builder setName(@Nullable CharSequence charSequence0) {
            this.a.b = charSequence0;
            return this;
        }
    }

    public final String a;
    public CharSequence b;
    public String c;
    public final boolean d;
    public final List e;

    public NotificationChannelGroupCompat(NotificationChannelGroup notificationChannelGroup0) {
        this(notificationChannelGroup0, Collections.emptyList());
    }

    public NotificationChannelGroupCompat(NotificationChannelGroup notificationChannelGroup0, List list0) {
        this(j0.d(notificationChannelGroup0));
        this.b = j0.e(notificationChannelGroup0);
        int v = Build.VERSION.SDK_INT;
        if(v >= 28) {
            this.c = k0.a(notificationChannelGroup0);
        }
        if(v >= 28) {
            this.d = k0.b(notificationChannelGroup0);
            this.e = this.a(j0.b(notificationChannelGroup0));
            return;
        }
        this.e = this.a(list0);
    }

    public NotificationChannelGroupCompat(String s) {
        this.e = Collections.emptyList();
        this.a = (String)Preconditions.checkNotNull(s);
    }

    public final ArrayList a(List list0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            NotificationChannel notificationChannel0 = (NotificationChannel)object0;
            String s = j0.c(notificationChannel0);
            if(this.a.equals(s)) {
                arrayList0.add(new NotificationChannelCompat(notificationChannel0));
            }
        }
        return arrayList0;
    }

    @NonNull
    public List getChannels() {
        return this.e;
    }

    @Nullable
    public String getDescription() {
        return this.c;
    }

    @NonNull
    public String getId() {
        return this.a;
    }

    @Nullable
    public CharSequence getName() {
        return this.b;
    }

    public boolean isBlocked() {
        return this.d;
    }

    @NonNull
    public Builder toBuilder() {
        return new Builder(this.a).setName(this.b).setDescription(this.c);
    }
}

