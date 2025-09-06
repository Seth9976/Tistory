package com.google.firebase.messaging;

import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import androidx.core.app.NotificationCompat.BigPictureStyle;
import androidx.core.app.NotificationCompat.Builder;
import com.google.android.gms.tasks.Tasks;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class e {
    public final ExecutorService a;
    public final FirebaseMessagingService b;
    public final NotificationParams c;

    public e(FirebaseMessagingService firebaseMessagingService0, NotificationParams notificationParams0, ExecutorService executorService0) {
        this.a = executorService0;
        this.b = firebaseMessagingService0;
        this.c = notificationParams0;
    }

    public final boolean a() {
        Bundle bundle0;
        ApplicationInfo applicationInfo0;
        NotificationParams notificationParams0 = this.c;
        if(notificationParams0.getBoolean("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService0 = this.b;
        if(!((KeyguardManager)firebaseMessagingService0.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int v = Process.myPid();
            List list0 = ((ActivityManager)firebaseMessagingService0.getSystemService("activity")).getRunningAppProcesses();
            if(list0 != null) {
                for(Object object0: list0) {
                    ActivityManager.RunningAppProcessInfo activityManager$RunningAppProcessInfo0 = (ActivityManager.RunningAppProcessInfo)object0;
                    if(activityManager$RunningAppProcessInfo0.pid == v) {
                        if(activityManager$RunningAppProcessInfo0.importance != 100) {
                            break;
                        }
                        return false;
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
        ImageDownload imageDownload0 = ImageDownload.create(notificationParams0.getString("gcm.n.image"));
        if(imageDownload0 != null) {
            imageDownload0.start(this.a);
        }
        PackageManager packageManager0 = firebaseMessagingService0.getPackageManager();
        try {
            applicationInfo0 = packageManager0.getApplicationInfo("net.daum.android.tistoryapp", 0x80);
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            Log.w("FirebaseMessaging", "Couldn\'t get own application info: " + packageManager$NameNotFoundException0);
            bundle0 = Bundle.EMPTY;
            goto label_32;
        }
        if(applicationInfo0 == null) {
            bundle0 = Bundle.EMPTY;
        }
        else {
            bundle0 = applicationInfo0.metaData;
            if(bundle0 == null) {
                bundle0 = Bundle.EMPTY;
            }
        }
    label_32:
        DisplayNotificationInfo commonNotificationBuilder$DisplayNotificationInfo0 = CommonNotificationBuilder.createNotificationInfo(firebaseMessagingService0, firebaseMessagingService0, notificationParams0, CommonNotificationBuilder.getOrCreateChannel(firebaseMessagingService0, notificationParams0.getNotificationChannelId(), bundle0), bundle0);
        Builder notificationCompat$Builder0 = commonNotificationBuilder$DisplayNotificationInfo0.notificationBuilder;
        if(imageDownload0 != null) {
            try {
                Bitmap bitmap0 = (Bitmap)Tasks.await(imageDownload0.getTask(), 5L, TimeUnit.SECONDS);
                notificationCompat$Builder0.setLargeIcon(bitmap0);
                notificationCompat$Builder0.setStyle(new BigPictureStyle().bigPicture(bitmap0).bigLargeIcon(null));
            }
            catch(ExecutionException executionException0) {
                Log.w("FirebaseMessaging", "Failed to download image: " + executionException0.getCause());
            }
            catch(InterruptedException unused_ex) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                imageDownload0.close();
                Thread.currentThread().interrupt();
            }
            catch(TimeoutException unused_ex) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                imageDownload0.close();
            }
        }
        if(Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        NotificationManager notificationManager0 = (NotificationManager)firebaseMessagingService0.getSystemService("notification");
        Notification notification0 = commonNotificationBuilder$DisplayNotificationInfo0.notificationBuilder.build();
        notificationManager0.notify(commonNotificationBuilder$DisplayNotificationInfo0.tag, commonNotificationBuilder$DisplayNotificationInfo0.id, notification0);
        return true;
    }
}

