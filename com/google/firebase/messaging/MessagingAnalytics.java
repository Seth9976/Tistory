package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.compose.ui.text.n0;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.TransportFactory;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.messaging.reporting.MessagingClientEvent.Builder;
import com.google.firebase.messaging.reporting.MessagingClientEvent.Event;
import com.google.firebase.messaging.reporting.MessagingClientEvent.MessageType;
import com.google.firebase.messaging.reporting.MessagingClientEvent.SDKPlatform;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
import java.util.concurrent.ExecutionException;

public class MessagingAnalytics {
    public static boolean a() {
        try {
            FirebaseApp.getInstance();
        }
        catch(IllegalStateException unused_ex) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
        Context context0 = FirebaseApp.getInstance().getApplicationContext();
        SharedPreferences sharedPreferences0 = context0.getSharedPreferences("com.google.firebase.messaging", 0);
        if(sharedPreferences0.contains("export_to_big_query")) {
            return sharedPreferences0.getBoolean("export_to_big_query", false);
        }
        try {
            PackageManager packageManager0 = context0.getPackageManager();
            if(packageManager0 != null) {
                ApplicationInfo applicationInfo0 = packageManager0.getApplicationInfo("net.daum.android.tistoryapp", 0x80);
                return applicationInfo0 == null || (applicationInfo0.metaData == null || !applicationInfo0.metaData.containsKey("delivery_metrics_exported_to_big_query_enabled")) ? false : applicationInfo0.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        return false;
    }

    public static void b(String s, Bundle bundle0) {
        try {
            FirebaseApp.getInstance();
        }
        catch(IllegalStateException unused_ex) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
            return;
        }
        if(bundle0 == null) {
            bundle0 = new Bundle();
        }
        Bundle bundle1 = new Bundle();
        String s1 = bundle0.getString("google.c.a.c_id");
        if(s1 != null) {
            bundle1.putString("_nmid", s1);
        }
        String s2 = bundle0.getString("google.c.a.c_l");
        if(s2 != null) {
            bundle1.putString("_nmn", s2);
        }
        String s3 = bundle0.getString("google.c.a.m_l");
        if(!TextUtils.isEmpty(s3)) {
            bundle1.putString("label", s3);
        }
        String s4 = bundle0.getString("google.c.a.m_c");
        if(!TextUtils.isEmpty(s4)) {
            bundle1.putString("message_channel", s4);
        }
        String s5 = bundle0.getString("from");
        String s6 = null;
        if(s5 == null || !s5.startsWith("/topics/")) {
            s5 = null;
        }
        if(s5 != null) {
            bundle1.putString("_nt", s5);
        }
        String s7 = bundle0.getString("google.c.a.ts");
        if(s7 != null) {
            try {
                bundle1.putInt("_nmt", Integer.parseInt(s7));
            }
            catch(NumberFormatException numberFormatException0) {
                Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", numberFormatException0);
            }
        }
        if(bundle0.containsKey("google.c.a.udt")) {
            s6 = bundle0.getString("google.c.a.udt");
        }
        if(s6 != null) {
            try {
                bundle1.putInt("_ndt", Integer.parseInt(s6));
            }
            catch(NumberFormatException numberFormatException1) {
                Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", numberFormatException1);
            }
        }
        String s8 = NotificationParams.isNotification(bundle0) ? "display" : "data";
        if("_nr".equals(s) || "_nf".equals(s)) {
            bundle1.putString("_nmc", s8);
        }
        if(Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Logging to scion event=" + s + " scionPayload=" + bundle1);
        }
        AnalyticsConnector analyticsConnector0 = (AnalyticsConnector)FirebaseApp.getInstance().get(AnalyticsConnector.class);
        if(analyticsConnector0 != null) {
            analyticsConnector0.logEvent("fcm", s, bundle1);
            return;
        }
        Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
    }

    public static void logNotificationDismiss(Intent intent0) {
        MessagingAnalytics.b("_nd", intent0.getExtras());
    }

    public static void logNotificationForeground(Intent intent0) {
        MessagingAnalytics.b("_nf", intent0.getExtras());
    }

    public static void logNotificationOpen(Bundle bundle0) {
        if(bundle0 != null) {
            if("1".equals(bundle0.getString("google.c.a.tc"))) {
                AnalyticsConnector analyticsConnector0 = (AnalyticsConnector)FirebaseApp.getInstance().get(AnalyticsConnector.class);
                if(Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                }
                if(analyticsConnector0 == null) {
                    Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                }
                else {
                    String s = bundle0.getString("google.c.a.c_id");
                    analyticsConnector0.setUserProperty("fcm", "_ln", s);
                    Bundle bundle1 = new Bundle();
                    bundle1.putString("source", "Firebase");
                    bundle1.putString("medium", "notification");
                    bundle1.putString("campaign", s);
                    analyticsConnector0.logEvent("fcm", "_cmp", bundle1);
                }
            }
            else if(Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
            }
        }
        MessagingAnalytics.b("_no", bundle0);
    }

    public static void logNotificationReceived(Intent intent0) {
        long v1;
        int v;
        if(MessagingAnalytics.shouldUploadScionMetrics(intent0)) {
            MessagingAnalytics.b("_nr", intent0.getExtras());
        }
        if(MessagingAnalytics.shouldUploadFirelogAnalytics(intent0)) {
            MessagingClientEvent messagingClientEvent0 = null;
            Event messagingClientEvent$Event0 = Event.MESSAGE_DELIVERED;
            TransportFactory transportFactory0 = FirebaseMessaging.getTransportFactory();
            if(transportFactory0 == null) {
                Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                return;
            }
            if(intent0 != null) {
                Bundle bundle0 = intent0.getExtras();
                if(bundle0 == null) {
                    bundle0 = Bundle.EMPTY;
                }
                Builder messagingClientEvent$Builder0 = MessagingClientEvent.newBuilder();
                Object object0 = bundle0.get("google.ttl");
                if(object0 instanceof Integer) {
                    v = (int)(((Integer)object0));
                }
                else if(object0 instanceof String) {
                    try {
                        v = Integer.parseInt(((String)object0));
                    }
                    catch(NumberFormatException unused_ex) {
                        Log.w("FirebaseMessaging", "Invalid TTL: " + object0);
                        v = 0;
                    }
                }
                else {
                    v = 0;
                }
                Builder messagingClientEvent$Builder1 = messagingClientEvent$Builder0.setTtl(v).setEvent(messagingClientEvent$Event0);
                String s = bundle0.getString("google.to");
                if(TextUtils.isEmpty(s)) {
                    try {
                        s = (String)Tasks.await(FirebaseInstallations.getInstance(FirebaseApp.getInstance()).getId());
                    }
                    catch(ExecutionException | InterruptedException executionException0) {
                        throw new RuntimeException(executionException0);
                    }
                }
                Builder messagingClientEvent$Builder2 = messagingClientEvent$Builder1.setInstanceId(s).setPackageName("net.daum.android.tistoryapp").setSdkPlatform(SDKPlatform.ANDROID).setMessageType((NotificationParams.isNotification(bundle0) ? MessageType.DISPLAY_NOTIFICATION : MessageType.DATA_MESSAGE));
                String s1 = bundle0.getString("google.message_id");
                if(s1 == null) {
                    s1 = bundle0.getString("message_id");
                }
                if(s1 != null) {
                    messagingClientEvent$Builder2.setMessageId(s1);
                }
                String s2 = bundle0.getString("from");
                if(s2 != null && s2.startsWith("/topics/")) {
                    messagingClientEvent0 = s2;
                }
                if(messagingClientEvent0 != null) {
                    messagingClientEvent$Builder2.setTopic(((String)messagingClientEvent0));
                }
                String s3 = bundle0.getString("collapse_key");
                if(s3 != null) {
                    messagingClientEvent$Builder2.setCollapseKey(s3);
                }
                String s4 = bundle0.getString("google.c.a.m_l");
                if(s4 != null) {
                    messagingClientEvent$Builder2.setAnalyticsLabel(s4);
                }
                String s5 = bundle0.getString("google.c.a.c_l");
                if(s5 != null) {
                    messagingClientEvent$Builder2.setComposerLabel(s5);
                }
                if(bundle0.containsKey("google.c.sender.id")) {
                    try {
                        v1 = Long.parseLong(bundle0.getString("google.c.sender.id"));
                    }
                    catch(NumberFormatException numberFormatException0) {
                        Log.w("FirebaseMessaging", "error parsing project number", numberFormatException0);
                        goto label_57;
                    }
                }
                else {
                label_57:
                    FirebaseApp firebaseApp0 = FirebaseApp.getInstance();
                    String s6 = firebaseApp0.getOptions().getGcmSenderId();
                    if(s6 == null) {
                    label_64:
                        String s7 = firebaseApp0.getOptions().getApplicationId();
                        if(s7.startsWith("1:")) {
                            String[] arr_s = s7.split(":");
                            if(arr_s.length >= 2) {
                                String s8 = arr_s[1];
                                if(s8.isEmpty()) {
                                    v1 = 0L;
                                }
                                else {
                                    try {
                                        v1 = Long.parseLong(s8);
                                    }
                                    catch(NumberFormatException numberFormatException3) {
                                        Log.w("FirebaseMessaging", "error parsing app ID", numberFormatException3);
                                        v1 = 0L;
                                    }
                                }
                            }
                            else {
                                v1 = 0L;
                            }
                        }
                        else {
                            try {
                                v1 = Long.parseLong(s7);
                            }
                            catch(NumberFormatException numberFormatException2) {
                                Log.w("FirebaseMessaging", "error parsing app ID", numberFormatException2);
                                v1 = 0L;
                            }
                        }
                    }
                    else {
                        try {
                            v1 = Long.parseLong(s6);
                        }
                        catch(NumberFormatException numberFormatException1) {
                            Log.w("FirebaseMessaging", "error parsing sender ID", numberFormatException1);
                            goto label_64;
                        }
                    }
                }
                if(v1 > 0L) {
                    messagingClientEvent$Builder2.setProjectNumber(v1);
                }
                messagingClientEvent0 = messagingClientEvent$Builder2.build();
            }
            if(messagingClientEvent0 != null) {
                try {
                    Encoding encoding0 = Encoding.of("proto");
                    n0 n00 = new n0(17);
                    transportFactory0.getTransport("FCM_CLIENT_EVENT_LOGGING", MessagingClientEventExtension.class, encoding0, n00).send(com.google.android.datatransport.Event.ofData(MessagingClientEventExtension.newBuilder().setMessagingClientEvent(messagingClientEvent0).build()));
                }
                catch(RuntimeException runtimeException0) {
                    Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", runtimeException0);
                }
            }
        }
    }

    public static boolean shouldUploadFirelogAnalytics(Intent intent0) {
        return intent0 == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent0.getAction()) ? false : MessagingAnalytics.a();
    }

    public static boolean shouldUploadScionMetrics(Intent intent0) {
        return intent0 == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent0.getAction()) ? false : MessagingAnalytics.shouldUploadScionMetrics(intent0.getExtras());
    }

    public static boolean shouldUploadScionMetrics(Bundle bundle0) {
        return bundle0 == null ? false : "1".equals(bundle0.getString("google.c.a.e"));
    }
}

