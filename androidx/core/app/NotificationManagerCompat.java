package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.RemoteException;
import android.provider.Settings.Secure;
import android.support.v4.app.INotificationSideChannel;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class NotificationManagerCompat {
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterruptionFilter {
    }

    public static class NotificationWithIdAndTag {
        public final String a;
        public final int b;
        public final Notification c;

        public NotificationWithIdAndTag(int v, @NonNull Notification notification0) {
            this(null, v, notification0);
        }

        public NotificationWithIdAndTag(@Nullable String s, int v, @NonNull Notification notification0) {
            this.a = s;
            this.b = v;
            this.c = notification0;
        }
    }

    interface Task {
        void send(INotificationSideChannel arg1) throws RemoteException;
    }

    public static final String ACTION_BIND_SIDE_CHANNEL = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";
    public static final String EXTRA_USE_SIDE_CHANNEL = "android.support.useSideChannel";
    public static final int IMPORTANCE_DEFAULT = 3;
    public static final int IMPORTANCE_HIGH = 4;
    public static final int IMPORTANCE_LOW = 2;
    public static final int IMPORTANCE_MAX = 5;
    public static final int IMPORTANCE_MIN = 1;
    public static final int IMPORTANCE_NONE = 0;
    public static final int IMPORTANCE_UNSPECIFIED = -1000;
    public static final int INTERRUPTION_FILTER_ALARMS = 4;
    public static final int INTERRUPTION_FILTER_ALL = 1;
    public static final int INTERRUPTION_FILTER_NONE = 3;
    public static final int INTERRUPTION_FILTER_PRIORITY = 2;
    public static final int INTERRUPTION_FILTER_UNKNOWN;
    public final Context a;
    public final NotificationManager b;
    public static final Object c;
    public static String d;
    public static HashSet e;
    public static final Object f;
    public static p2 g;

    static {
        NotificationManagerCompat.c = new Object();
        NotificationManagerCompat.e = new HashSet();
        NotificationManagerCompat.f = new Object();
    }

    public NotificationManagerCompat(Context context0) {
        this.a = context0;
        this.b = (NotificationManager)context0.getSystemService("notification");
    }

    public boolean areNotificationsEnabled() {
        return h2.a(this.b);
    }

    public boolean canUseFullScreenIntent() {
        int v = Build.VERSION.SDK_INT;
        if(v < 29) {
            return true;
        }
        return v >= 34 ? l2.a(this.b) : this.a.checkSelfPermission("android.permission.USE_FULL_SCREEN_INTENT") == 0;
    }

    public void cancel(int v) {
        this.cancel(null, v);
    }

    public void cancel(@Nullable String s, int v) {
        this.b.cancel(s, v);
    }

    public void cancelAll() {
        this.b.cancelAll();
    }

    public void createNotificationChannel(@NonNull NotificationChannel notificationChannel0) {
        i2.a(this.b, notificationChannel0);
    }

    public void createNotificationChannel(@NonNull NotificationChannelCompat notificationChannelCompat0) {
        this.createNotificationChannel(notificationChannelCompat0.a());
    }

    public void createNotificationChannelGroup(@NonNull NotificationChannelGroup notificationChannelGroup0) {
        i2.b(this.b, notificationChannelGroup0);
    }

    public void createNotificationChannelGroup(@NonNull NotificationChannelGroupCompat notificationChannelGroupCompat0) {
        int v = Build.VERSION.SDK_INT;
        NotificationChannelGroup notificationChannelGroup0 = j0.a(notificationChannelGroupCompat0.a, notificationChannelGroupCompat0.b);
        if(v >= 28) {
            k0.c(notificationChannelGroup0, notificationChannelGroupCompat0.c);
        }
        this.createNotificationChannelGroup(notificationChannelGroup0);
    }

    public void createNotificationChannelGroups(@NonNull List list0) {
        i2.c(this.b, list0);
    }

    public void createNotificationChannelGroupsCompat(@NonNull List list0) {
        if(!list0.isEmpty()) {
            ArrayList arrayList0 = new ArrayList(list0.size());
            for(Object object0: list0) {
                NotificationChannelGroupCompat notificationChannelGroupCompat0 = (NotificationChannelGroupCompat)object0;
                int v = Build.VERSION.SDK_INT;
                NotificationChannelGroup notificationChannelGroup0 = j0.a(notificationChannelGroupCompat0.a, notificationChannelGroupCompat0.b);
                if(v >= 28) {
                    k0.c(notificationChannelGroup0, notificationChannelGroupCompat0.c);
                }
                arrayList0.add(notificationChannelGroup0);
            }
            i2.c(this.b, arrayList0);
        }
    }

    public void createNotificationChannels(@NonNull List list0) {
        i2.d(this.b, list0);
    }

    public void createNotificationChannelsCompat(@NonNull List list0) {
        if(!list0.isEmpty()) {
            ArrayList arrayList0 = new ArrayList(list0.size());
            for(Object object0: list0) {
                arrayList0.add(((NotificationChannelCompat)object0).a());
            }
            i2.d(this.b, arrayList0);
        }
    }

    public void deleteNotificationChannel(@NonNull String s) {
        i2.e(this.b, s);
    }

    public void deleteNotificationChannelGroup(@NonNull String s) {
        i2.f(this.b, s);
    }

    public void deleteUnlistedNotificationChannels(@NonNull Collection collection0) {
        NotificationManager notificationManager0 = this.b;
        for(Object object0: i2.k(notificationManager0)) {
            NotificationChannel notificationChannel0 = (NotificationChannel)object0;
            if(!collection0.contains(i2.g(notificationChannel0)) && (Build.VERSION.SDK_INT < 30 || !collection0.contains(k2.b(notificationChannel0)))) {
                i2.e(notificationManager0, i2.g(notificationChannel0));
            }
        }
    }

    @NonNull
    public static NotificationManagerCompat from(@NonNull Context context0) {
        return new NotificationManagerCompat(context0);
    }

    @NonNull
    public List getActiveNotifications() {
        return g2.a(this.b);
    }

    public int getCurrentInterruptionFilter() {
        return g2.b(this.b);
    }

    @NonNull
    public static Set getEnabledListenerPackages(@NonNull Context context0) {
        String s = Settings.Secure.getString(context0.getContentResolver(), "enabled_notification_listeners");
        synchronized(NotificationManagerCompat.c) {
            if(s != null && !s.equals(NotificationManagerCompat.d)) {
                String[] arr_s = s.split(":", -1);
                HashSet hashSet0 = new HashSet(arr_s.length);
                for(int v1 = 0; v1 < arr_s.length; ++v1) {
                    ComponentName componentName0 = ComponentName.unflattenFromString(arr_s[v1]);
                    if(componentName0 != null) {
                        hashSet0.add(componentName0.getPackageName());
                    }
                }
                NotificationManagerCompat.e = hashSet0;
                NotificationManagerCompat.d = s;
            }
            return NotificationManagerCompat.e;
        }
    }

    public int getImportance() {
        return h2.b(this.b);
    }

    @Nullable
    public NotificationChannel getNotificationChannel(@NonNull String s) {
        return i2.i(this.b, s);
    }

    @Nullable
    public NotificationChannel getNotificationChannel(@NonNull String s, @NonNull String s1) {
        return Build.VERSION.SDK_INT < 30 ? this.getNotificationChannel(s) : k2.a(this.b, s, s1);
    }

    @Nullable
    public NotificationChannelCompat getNotificationChannelCompat(@NonNull String s) {
        NotificationChannel notificationChannel0 = this.getNotificationChannel(s);
        return notificationChannel0 == null ? null : new NotificationChannelCompat(notificationChannel0);
    }

    @Nullable
    public NotificationChannelCompat getNotificationChannelCompat(@NonNull String s, @NonNull String s1) {
        NotificationChannel notificationChannel0 = this.getNotificationChannel(s, s1);
        return notificationChannel0 == null ? null : new NotificationChannelCompat(notificationChannel0);
    }

    @Nullable
    public NotificationChannelGroup getNotificationChannelGroup(@NonNull String s) {
        if(Build.VERSION.SDK_INT >= 28) {
            return j2.a(this.b, s);
        }
        for(Object object0: this.getNotificationChannelGroups()) {
            NotificationChannelGroup notificationChannelGroup0 = (NotificationChannelGroup)object0;
            if(i2.h(notificationChannelGroup0).equals(s)) {
                return notificationChannelGroup0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    @Nullable
    public NotificationChannelGroupCompat getNotificationChannelGroupCompat(@NonNull String s) {
        if(Build.VERSION.SDK_INT >= 28) {
            NotificationChannelGroup notificationChannelGroup0 = this.getNotificationChannelGroup(s);
            return notificationChannelGroup0 == null ? null : new NotificationChannelGroupCompat(notificationChannelGroup0);
        }
        NotificationChannelGroup notificationChannelGroup1 = this.getNotificationChannelGroup(s);
        return notificationChannelGroup1 == null ? null : new NotificationChannelGroupCompat(notificationChannelGroup1, this.getNotificationChannels());
    }

    @NonNull
    public List getNotificationChannelGroups() {
        return i2.j(this.b);
    }

    @NonNull
    public List getNotificationChannelGroupsCompat() {
        int v = Build.VERSION.SDK_INT;
        List list0 = this.getNotificationChannelGroups();
        if(!list0.isEmpty()) {
            List list1 = v < 28 ? this.getNotificationChannels() : Collections.emptyList();
            List list2 = new ArrayList(list0.size());
            for(Object object0: list0) {
                NotificationChannelGroup notificationChannelGroup0 = (NotificationChannelGroup)object0;
                if(Build.VERSION.SDK_INT >= 28) {
                    ((ArrayList)list2).add(new NotificationChannelGroupCompat(notificationChannelGroup0));
                }
                else {
                    ((ArrayList)list2).add(new NotificationChannelGroupCompat(notificationChannelGroup0, list1));
                }
            }
            return list2;
        }
        return Collections.emptyList();
    }

    @NonNull
    public List getNotificationChannels() {
        return i2.k(this.b);
    }

    @NonNull
    public List getNotificationChannelsCompat() {
        List list0 = this.getNotificationChannels();
        if(!list0.isEmpty()) {
            List list1 = new ArrayList(list0.size());
            for(Object object0: list0) {
                ((ArrayList)list1).add(new NotificationChannelCompat(((NotificationChannel)object0)));
            }
            return list1;
        }
        return Collections.emptyList();
    }

    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    public void notify(int v, @NonNull Notification notification0) {
        this.notify(null, v, notification0);
    }

    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    public void notify(@Nullable String s, int v, @NonNull Notification notification0) {
        Bundle bundle0 = NotificationCompat.getExtras(notification0);
        NotificationManager notificationManager0 = this.b;
        if(bundle0 != null && bundle0.getBoolean("android.support.useSideChannel")) {
            m2 m20 = new m2("net.daum.android.tistoryapp", v, s, notification0);
            synchronized(NotificationManagerCompat.f) {
                if(NotificationManagerCompat.g == null) {
                    NotificationManagerCompat.g = new p2(this.a.getApplicationContext());
                }
                NotificationManagerCompat.g.b.obtainMessage(0, m20).sendToTarget();
            }
            notificationManager0.cancel(s, v);
            return;
        }
        notificationManager0.notify(s, v, notification0);
    }

    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    public void notify(@NonNull List list0) {
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            NotificationWithIdAndTag notificationManagerCompat$NotificationWithIdAndTag0 = (NotificationWithIdAndTag)list0.get(v1);
            this.notify(notificationManagerCompat$NotificationWithIdAndTag0.a, notificationManagerCompat$NotificationWithIdAndTag0.b, notificationManagerCompat$NotificationWithIdAndTag0.c);
        }
    }
}

