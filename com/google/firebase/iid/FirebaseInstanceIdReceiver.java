package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FcmBroadcastProcessor;
import com.google.firebase.messaging.MessagingAnalytics;
import java.util.concurrent.ExecutionException;

public final class FirebaseInstanceIdReceiver extends CloudMessagingReceiver {
    @Override  // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    @WorkerThread
    public int onMessageReceive(@NonNull Context context0, @NonNull CloudMessage cloudMessage0) {
        try {
            return (int)(((Integer)Tasks.await(new FcmBroadcastProcessor(context0).process(cloudMessage0.getIntent()))));
        }
        catch(ExecutionException | InterruptedException executionException0) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", executionException0);
            return 500;
        }
    }

    @Override  // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    @WorkerThread
    public void onNotificationDismissed(@NonNull Context context0, @NonNull Bundle bundle0) {
        Intent intent0 = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(bundle0);
        if(MessagingAnalytics.shouldUploadScionMetrics(intent0)) {
            MessagingAnalytics.logNotificationDismiss(intent0);
        }
    }
}

