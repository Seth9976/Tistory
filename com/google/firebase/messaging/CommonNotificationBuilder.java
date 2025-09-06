package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat.BigTextStyle;
import androidx.core.app.NotificationCompat.Builder;
import androidx.core.content.ContextCompat;
import java.util.concurrent.atomic.AtomicInteger;

public final class CommonNotificationBuilder {
    public static class DisplayNotificationInfo {
        public final int id;
        public final Builder notificationBuilder;
        public final String tag;

        public DisplayNotificationInfo(Builder notificationCompat$Builder0, String s) {
            this.notificationBuilder = notificationCompat$Builder0;
            this.tag = s;
            this.id = 0;
        }
    }

    public static final String FCM_FALLBACK_NOTIFICATION_CHANNEL = "fcm_fallback_notification_channel";
    public static final String FCM_FALLBACK_NOTIFICATION_CHANNEL_LABEL = "fcm_fallback_notification_channel_label";
    public static final String METADATA_DEFAULT_CHANNEL_ID = "com.google.firebase.messaging.default_notification_channel_id";
    public static final String METADATA_DEFAULT_COLOR = "com.google.firebase.messaging.default_notification_color";
    public static final String METADATA_DEFAULT_ICON = "com.google.firebase.messaging.default_notification_icon";
    public static final AtomicInteger a;

    static {
        CommonNotificationBuilder.a = new AtomicInteger(((int)SystemClock.elapsedRealtime()));
    }

    public static boolean a(Resources resources0, int v) {
        if(Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if(resources0.getDrawable(v, null) instanceof AdaptiveIconDrawable) {
                Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + v);
                return false;
            }
            return true;
        }
        catch(Resources.NotFoundException unused_ex) {
            Log.e("FirebaseMessaging", "Couldn\'t find resource " + v + ", treating it as an invalid icon");
            return false;
        }
    }

    public static DisplayNotificationInfo createNotificationInfo(Context context0, Context context1, NotificationParams notificationParams0, String s, Bundle bundle0) {
        Integer integer1;
        PendingIntent pendingIntent1;
        PendingIntent pendingIntent0;
        Intent intent0;
        Uri uri0;
        int v;
        Resources resources0 = context1.getResources();
        PackageManager packageManager0 = context1.getPackageManager();
        Builder notificationCompat$Builder0 = new Builder(context1, s);
        String s1 = notificationParams0.getPossiblyLocalizedString(resources0, "net.daum.android.tistoryapp", "gcm.n.title");
        if(!TextUtils.isEmpty(s1)) {
            notificationCompat$Builder0.setContentTitle(s1);
        }
        String s2 = notificationParams0.getPossiblyLocalizedString(resources0, "net.daum.android.tistoryapp", "gcm.n.body");
        if(!TextUtils.isEmpty(s2)) {
            notificationCompat$Builder0.setContentText(s2);
            notificationCompat$Builder0.setStyle(new BigTextStyle().bigText(s2));
        }
        String s3 = notificationParams0.getString("gcm.n.icon");
        if(TextUtils.isEmpty(s3)) {
        label_17:
            int v1 = bundle0.getInt("com.google.firebase.messaging.default_notification_icon", 0);
            if(v1 == 0 || !CommonNotificationBuilder.a(resources0, v1)) {
                try {
                    v1 = packageManager0.getApplicationInfo("net.daum.android.tistoryapp", 0).icon;
                }
                catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                    Log.w("FirebaseMessaging", "Couldn\'t get own application info: " + packageManager$NameNotFoundException0);
                }
            }
            if(v1 == 0 || !CommonNotificationBuilder.a(resources0, v1)) {
                v1 = 0x1080093;
            }
            v = v1;
        }
        else {
            v = resources0.getIdentifier(s3, "drawable", "net.daum.android.tistoryapp");
            if(v == 0 || !CommonNotificationBuilder.a(resources0, v)) {
                v = resources0.getIdentifier(s3, "mipmap", "net.daum.android.tistoryapp");
                if(v == 0 || !CommonNotificationBuilder.a(resources0, v)) {
                    Log.w("FirebaseMessaging", "Icon resource " + s3 + " not found. Notification will use default icon.");
                    goto label_17;
                }
            }
        }
        notificationCompat$Builder0.setSmallIcon(v);
        String s4 = notificationParams0.getSoundResourceName();
        Integer integer0 = null;
        if(TextUtils.isEmpty(s4)) {
            uri0 = null;
        }
        else {
            uri0 = "default".equals(s4) || resources0.getIdentifier(s4, "raw", "net.daum.android.tistoryapp") == 0 ? RingtoneManager.getDefaultUri(2) : Uri.parse(("android.resource://net.daum.android.tistoryapp/raw/" + s4));
        }
        if(uri0 != null) {
            notificationCompat$Builder0.setSound(uri0);
        }
        String s5 = notificationParams0.getString("gcm.n.click_action");
        if(TextUtils.isEmpty(s5)) {
            Uri uri1 = notificationParams0.getLink();
            if(uri1 == null) {
                intent0 = packageManager0.getLaunchIntentForPackage("net.daum.android.tistoryapp");
                if(intent0 == null) {
                    Log.w("FirebaseMessaging", "No activity found to launch app");
                }
            }
            else {
                intent0 = new Intent("android.intent.action.VIEW");
                intent0.setPackage("net.daum.android.tistoryapp");
                intent0.setData(uri1);
            }
        }
        else {
            intent0 = new Intent(s5);
            intent0.setPackage("net.daum.android.tistoryapp");
            intent0.setFlags(0x10000000);
        }
        AtomicInteger atomicInteger0 = CommonNotificationBuilder.a;
        if(intent0 == null) {
            pendingIntent0 = null;
        }
        else {
            intent0.addFlags(0x4000000);
            intent0.putExtras(notificationParams0.paramsWithReservedKeysRemoved());
            if(notificationParams0.getBoolean("google.c.a.e")) {
                intent0.putExtra("gcm.n.analytics_data", notificationParams0.paramsForAnalyticsIntent());
            }
            pendingIntent0 = PendingIntent.getActivity(context0, atomicInteger0.incrementAndGet(), intent0, 0x44000000);
        }
        notificationCompat$Builder0.setContentIntent(pendingIntent0);
        if(notificationParams0.getBoolean("google.c.a.e")) {
            Intent intent1 = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(notificationParams0.paramsForAnalyticsIntent());
            pendingIntent1 = PendingIntent.getBroadcast(context0, atomicInteger0.incrementAndGet(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context1, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent1), 0x44000000);
        }
        else {
            pendingIntent1 = null;
        }
        if(pendingIntent1 != null) {
            notificationCompat$Builder0.setDeleteIntent(pendingIntent1);
        }
        String s6 = notificationParams0.getString("gcm.n.color");
        if(TextUtils.isEmpty(s6)) {
        label_72:
            int v2 = bundle0.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if(v2 == 0) {
                integer1 = null;
            }
            else {
                try {
                    integer1 = ContextCompat.getColor(context1, v2);
                }
                catch(Resources.NotFoundException unused_ex) {
                    Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                    integer1 = null;
                }
            }
        }
        else {
            try {
                integer1 = Color.parseColor(s6);
            }
            catch(IllegalArgumentException unused_ex) {
                Log.w("FirebaseMessaging", "Color is invalid: " + s6 + ". Notification will use default color.");
                goto label_72;
            }
        }
        if(integer1 != null) {
            notificationCompat$Builder0.setColor(((int)integer1));
        }
        notificationCompat$Builder0.setAutoCancel(!notificationParams0.getBoolean("gcm.n.sticky"));
        notificationCompat$Builder0.setLocalOnly(notificationParams0.getBoolean("gcm.n.local_only"));
        String s7 = notificationParams0.getString("gcm.n.ticker");
        if(s7 != null) {
            notificationCompat$Builder0.setTicker(s7);
        }
        Integer integer2 = notificationParams0.getInteger("gcm.n.notification_priority");
        if(integer2 == null) {
            integer2 = null;
        }
        else if(((int)integer2) < -2 || ((int)integer2) > 2) {
            Log.w("FirebaseMessaging", "notificationPriority is invalid " + integer2 + ". Skipping setting notificationPriority.");
            integer2 = null;
        }
        if(integer2 != null) {
            notificationCompat$Builder0.setPriority(((int)integer2));
        }
        Integer integer3 = notificationParams0.getInteger("gcm.n.visibility");
        if(integer3 == null) {
            integer3 = null;
        }
        else if(((int)integer3) < -1 || ((int)integer3) > 1) {
            Log.w("NotificationParams", "visibility is invalid: " + integer3 + ". Skipping setting visibility.");
            integer3 = null;
        }
        if(integer3 != null) {
            notificationCompat$Builder0.setVisibility(((int)integer3));
        }
        Integer integer4 = notificationParams0.getInteger("gcm.n.notification_count");
        if(integer4 != null) {
            if(((int)integer4) < 0) {
                Log.w("FirebaseMessaging", "notificationCount is invalid: " + integer4 + ". Skipping setting notificationCount.");
            }
            else {
                integer0 = integer4;
            }
        }
        if(integer0 != null) {
            notificationCompat$Builder0.setNumber(((int)integer0));
        }
        Long long0 = notificationParams0.getLong("gcm.n.event_time");
        if(long0 != null) {
            notificationCompat$Builder0.setShowWhen(true);
            notificationCompat$Builder0.setWhen(((long)long0));
        }
        long[] arr_v = notificationParams0.getVibrateTimings();
        if(arr_v != null) {
            notificationCompat$Builder0.setVibrate(arr_v);
        }
        int[] arr_v1 = notificationParams0.a();
        if(arr_v1 != null) {
            notificationCompat$Builder0.setLights(arr_v1[0], arr_v1[1], arr_v1[2]);
        }
        boolean z = notificationParams0.getBoolean("gcm.n.default_sound");
        if(notificationParams0.getBoolean("gcm.n.default_vibrate_timings")) {
            z |= 2;
        }
        if(notificationParams0.getBoolean("gcm.n.default_light_settings")) {
            z |= 4;
        }
        notificationCompat$Builder0.setDefaults(((int)z));
        String s8 = notificationParams0.getString("gcm.n.tag");
        if(TextUtils.isEmpty(s8)) {
            s8 = "FCM-Notification:" + SystemClock.uptimeMillis();
        }
        return new DisplayNotificationInfo(notificationCompat$Builder0, s8);
    }

    @TargetApi(26)
    @VisibleForTesting
    public static String getOrCreateChannel(Context context0, String s, Bundle bundle0) {
        String s2;
        try {
            context0.getPackageManager().getApplicationInfo("net.daum.android.tistoryapp", 0);
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return null;
        }
        NotificationManager notificationManager0 = (NotificationManager)context0.getSystemService(NotificationManager.class);
        if(!TextUtils.isEmpty(s)) {
            if(notificationManager0.getNotificationChannel(s) != null) {
                return s;
            }
            Log.w("FirebaseMessaging", "Notification Channel requested (" + s + ") has not been created by the app. Manifest configuration, or default, value will be used.");
        }
        String s1 = bundle0.getString("com.google.firebase.messaging.default_notification_channel_id");
        if(TextUtils.isEmpty(s1)) {
            Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
        }
        else {
            if(notificationManager0.getNotificationChannel(s1) != null) {
                return s1;
            }
            Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
        }
        if(notificationManager0.getNotificationChannel("fcm_fallback_notification_channel") == null) {
            int v = context0.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", "net.daum.android.tistoryapp");
            if(v == 0) {
                Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                s2 = "Misc";
            }
            else {
                s2 = context0.getString(v);
            }
            notificationManager0.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", s2, 3));
        }
        return "fcm_fallback_notification_channel";
    }
}

