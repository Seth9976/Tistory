package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.Settings.System;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Preconditions;

public class NotificationChannelCompat {
    public static class Builder {
        public final NotificationChannelCompat a;

        public Builder(@NonNull String s, int v) {
            this.a = new NotificationChannelCompat(s, v);
        }

        @NonNull
        public NotificationChannelCompat build() {
            return this.a;
        }

        @NonNull
        public Builder setConversationId(@NonNull String s, @NonNull String s1) {
            if(Build.VERSION.SDK_INT >= 30) {
                this.a.m = s;
                this.a.n = s1;
            }
            return this;
        }

        @NonNull
        public Builder setDescription(@Nullable String s) {
            this.a.d = s;
            return this;
        }

        @NonNull
        public Builder setGroup(@Nullable String s) {
            this.a.e = s;
            return this;
        }

        @NonNull
        public Builder setImportance(int v) {
            this.a.c = v;
            return this;
        }

        @NonNull
        public Builder setLightColor(int v) {
            this.a.j = v;
            return this;
        }

        @NonNull
        public Builder setLightsEnabled(boolean z) {
            this.a.i = z;
            return this;
        }

        @NonNull
        public Builder setName(@Nullable CharSequence charSequence0) {
            this.a.b = charSequence0;
            return this;
        }

        @NonNull
        public Builder setShowBadge(boolean z) {
            this.a.f = z;
            return this;
        }

        @NonNull
        public Builder setSound(@Nullable Uri uri0, @Nullable AudioAttributes audioAttributes0) {
            this.a.g = uri0;
            this.a.h = audioAttributes0;
            return this;
        }

        @NonNull
        public Builder setVibrationEnabled(boolean z) {
            this.a.k = z;
            return this;
        }

        @NonNull
        public Builder setVibrationPattern(@Nullable long[] arr_v) {
            this.a.k = arr_v != null && arr_v.length > 0;
            this.a.l = arr_v;
            return this;
        }
    }

    public static final String DEFAULT_CHANNEL_ID = "miscellaneous";
    public final String a;
    public CharSequence b;
    public int c;
    public String d;
    public String e;
    public boolean f;
    public Uri g;
    public AudioAttributes h;
    public boolean i;
    public int j;
    public boolean k;
    public long[] l;
    public String m;
    public String n;
    public final boolean o;
    public final int p;
    public final boolean q;
    public final boolean r;

    public NotificationChannelCompat(NotificationChannel notificationChannel0) {
        this(g0.i(notificationChannel0), g0.j(notificationChannel0));
        this.b = g0.m(notificationChannel0);
        this.d = g0.g(notificationChannel0);
        this.e = g0.h(notificationChannel0);
        this.f = g0.b(notificationChannel0);
        this.g = g0.n(notificationChannel0);
        this.h = g0.f(notificationChannel0);
        this.i = g0.v(notificationChannel0);
        this.j = g0.k(notificationChannel0);
        this.k = g0.w(notificationChannel0);
        this.l = g0.o(notificationChannel0);
        int v = Build.VERSION.SDK_INT;
        if(v >= 30) {
            this.m = i0.b(notificationChannel0);
            this.n = i0.a(notificationChannel0);
        }
        this.o = g0.a(notificationChannel0);
        this.p = g0.l(notificationChannel0);
        if(v >= 29) {
            this.q = h0.a(notificationChannel0);
        }
        if(v >= 30) {
            this.r = i0.c(notificationChannel0);
        }
    }

    public NotificationChannelCompat(String s, int v) {
        this.f = true;
        this.g = Settings.System.DEFAULT_NOTIFICATION_URI;
        this.j = 0;
        this.a = (String)Preconditions.checkNotNull(s);
        this.c = v;
        this.h = Notification.AUDIO_ATTRIBUTES_DEFAULT;
    }

    public final NotificationChannel a() {
        int v = Build.VERSION.SDK_INT;
        NotificationChannel notificationChannel0 = g0.c(this.a, this.b, this.c);
        g0.p(notificationChannel0, this.d);
        g0.q(notificationChannel0, this.e);
        g0.s(notificationChannel0, this.f);
        g0.t(notificationChannel0, this.g, this.h);
        g0.d(notificationChannel0, this.i);
        g0.r(notificationChannel0, this.j);
        g0.u(notificationChannel0, this.l);
        g0.e(notificationChannel0, this.k);
        if(v >= 30) {
            String s = this.m;
            if(s != null) {
                String s1 = this.n;
                if(s1 != null) {
                    i0.d(notificationChannel0, s, s1);
                }
            }
        }
        return notificationChannel0;
    }

    public boolean canBubble() {
        return this.q;
    }

    public boolean canBypassDnd() {
        return this.o;
    }

    public boolean canShowBadge() {
        return this.f;
    }

    @Nullable
    public AudioAttributes getAudioAttributes() {
        return this.h;
    }

    @Nullable
    public String getConversationId() {
        return this.n;
    }

    @Nullable
    public String getDescription() {
        return this.d;
    }

    @Nullable
    public String getGroup() {
        return this.e;
    }

    @NonNull
    public String getId() {
        return this.a;
    }

    public int getImportance() {
        return this.c;
    }

    public int getLightColor() {
        return this.j;
    }

    public int getLockscreenVisibility() {
        return this.p;
    }

    @Nullable
    public CharSequence getName() {
        return this.b;
    }

    @Nullable
    public String getParentChannelId() {
        return this.m;
    }

    @Nullable
    public Uri getSound() {
        return this.g;
    }

    @Nullable
    public long[] getVibrationPattern() {
        return this.l;
    }

    public boolean isImportantConversation() {
        return this.r;
    }

    public boolean shouldShowLights() {
        return this.i;
    }

    public boolean shouldVibrate() {
        return this.k;
    }

    @NonNull
    public Builder toBuilder() {
        return new Builder(this.a, this.c).setName(this.b).setDescription(this.d).setGroup(this.e).setShowBadge(this.f).setSound(this.g, this.h).setLightsEnabled(this.i).setLightColor(this.j).setVibrationEnabled(this.k).setVibrationPattern(this.l).setConversationId(this.m, this.n);
    }
}

