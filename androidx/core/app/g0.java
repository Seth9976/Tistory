package androidx.core.app;

import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import androidx.annotation.DoNotInline;

public abstract class g0 {
    @DoNotInline
    public static boolean a(NotificationChannel notificationChannel0) {
        return notificationChannel0.canBypassDnd();
    }

    @DoNotInline
    public static boolean b(NotificationChannel notificationChannel0) {
        return notificationChannel0.canShowBadge();
    }

    @DoNotInline
    public static NotificationChannel c(String s, CharSequence charSequence0, int v) {
        return new NotificationChannel(s, charSequence0, v);
    }

    @DoNotInline
    public static void d(NotificationChannel notificationChannel0, boolean z) {
        notificationChannel0.enableLights(z);
    }

    @DoNotInline
    public static void e(NotificationChannel notificationChannel0, boolean z) {
        notificationChannel0.enableVibration(z);
    }

    @DoNotInline
    public static AudioAttributes f(NotificationChannel notificationChannel0) {
        return notificationChannel0.getAudioAttributes();
    }

    @DoNotInline
    public static String g(NotificationChannel notificationChannel0) {
        return notificationChannel0.getDescription();
    }

    @DoNotInline
    public static String h(NotificationChannel notificationChannel0) {
        return notificationChannel0.getGroup();
    }

    @DoNotInline
    public static String i(NotificationChannel notificationChannel0) {
        return notificationChannel0.getId();
    }

    @DoNotInline
    public static int j(NotificationChannel notificationChannel0) {
        return notificationChannel0.getImportance();
    }

    @DoNotInline
    public static int k(NotificationChannel notificationChannel0) {
        return notificationChannel0.getLightColor();
    }

    @DoNotInline
    public static int l(NotificationChannel notificationChannel0) {
        return notificationChannel0.getLockscreenVisibility();
    }

    @DoNotInline
    public static CharSequence m(NotificationChannel notificationChannel0) {
        return notificationChannel0.getName();
    }

    @DoNotInline
    public static Uri n(NotificationChannel notificationChannel0) {
        return notificationChannel0.getSound();
    }

    @DoNotInline
    public static long[] o(NotificationChannel notificationChannel0) {
        return notificationChannel0.getVibrationPattern();
    }

    @DoNotInline
    public static void p(NotificationChannel notificationChannel0, String s) {
        notificationChannel0.setDescription(s);
    }

    @DoNotInline
    public static void q(NotificationChannel notificationChannel0, String s) {
        notificationChannel0.setGroup(s);
    }

    @DoNotInline
    public static void r(NotificationChannel notificationChannel0, int v) {
        notificationChannel0.setLightColor(v);
    }

    @DoNotInline
    public static void s(NotificationChannel notificationChannel0, boolean z) {
        notificationChannel0.setShowBadge(z);
    }

    @DoNotInline
    public static void t(NotificationChannel notificationChannel0, Uri uri0, AudioAttributes audioAttributes0) {
        notificationChannel0.setSound(uri0, audioAttributes0);
    }

    @DoNotInline
    public static void u(NotificationChannel notificationChannel0, long[] arr_v) {
        notificationChannel0.setVibrationPattern(arr_v);
    }

    @DoNotInline
    public static boolean v(NotificationChannel notificationChannel0) {
        return notificationChannel0.shouldShowLights();
    }

    @DoNotInline
    public static boolean w(NotificationChannel notificationChannel0) {
        return notificationChannel0.shouldVibrate();
    }
}

