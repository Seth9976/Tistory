package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FirebaseMessagingService extends EnhancedIntentService {
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    public static final ArrayDeque k;

    static {
        FirebaseMessagingService.k = new ArrayDeque(10);
    }

    @Override  // com.google.firebase.messaging.EnhancedIntentService
    public Intent getStartCommandIntent(Intent intent0) {
        return (Intent)ServiceStarter.a().d.poll();
    }

    @Override  // com.google.firebase.messaging.EnhancedIntentService
    public void handleIntent(Intent intent0) {
        String s = intent0.getAction();
        if(!"com.google.android.c2dm.intent.RECEIVE".equals(s) && !"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(s)) {
            if("com.google.firebase.messaging.NEW_TOKEN".equals(s)) {
                this.onNewToken(intent0.getStringExtra("token"));
                return;
            }
            Log.d("FirebaseMessaging", "Unknown intent action: " + intent0.getAction());
            return;
        }
        String s1 = intent0.getStringExtra("google.message_id");
        if(TextUtils.isEmpty(s1)) {
        label_17:
            String s2 = intent0.getStringExtra("message_type");
            if(s2 == null) {
                s2 = "gcm";
            }
            switch(s2) {
                case "deleted_messages": {
                    return;
                }
                case "gcm": {
                    MessagingAnalytics.logNotificationReceived(intent0);
                    Bundle bundle0 = intent0.getExtras();
                    if(bundle0 == null) {
                        bundle0 = new Bundle();
                    }
                    bundle0.remove("androidx.content.wakelockid");
                    if(NotificationParams.isNotification(bundle0)) {
                        NotificationParams notificationParams0 = new NotificationParams(bundle0);
                        ExecutorService executorService0 = Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Network-Io"));
                        e e0 = new e(this, notificationParams0, executorService0);
                        try {
                            if(e0.a()) {
                                return;
                            }
                        }
                        finally {
                            executorService0.shutdown();
                        }
                        if(MessagingAnalytics.shouldUploadScionMetrics(intent0)) {
                            MessagingAnalytics.logNotificationForeground(intent0);
                        }
                    }
                    this.onMessageReceived(new RemoteMessage(bundle0));
                    break;
                }
                case "send_error": {
                    String s3 = intent0.getStringExtra("google.message_id");
                    if(s3 == null) {
                        s3 = intent0.getStringExtra("message_id");
                    }
                    this.onSendError(s3, new SendException(intent0.getStringExtra("error")));
                    return;
                }
                case "send_event": {
                    this.onMessageSent(intent0.getStringExtra("google.message_id"));
                    return;
                }
                default: {
                    Log.w("FirebaseMessaging", "Received message with unknown type: " + s2);
                }
            }
        }
        else {
            ArrayDeque arrayDeque0 = FirebaseMessagingService.k;
            if(!arrayDeque0.contains(s1)) {
                if(arrayDeque0.size() >= 10) {
                    arrayDeque0.remove();
                }
                arrayDeque0.add(s1);
                goto label_17;
            }
            else if(Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received duplicate message: " + s1);
            }
        }
    }

    @WorkerThread
    public void onDeletedMessages() {
    }

    @WorkerThread
    public void onMessageReceived(@NonNull RemoteMessage remoteMessage0) {
    }

    @WorkerThread
    public void onMessageSent(@NonNull String s) {
    }

    @WorkerThread
    public void onNewToken(@NonNull String s) {
    }

    @WorkerThread
    public void onSendError(@NonNull String s, @NonNull Exception exception0) {
    }
}

