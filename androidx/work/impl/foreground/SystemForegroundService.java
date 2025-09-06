package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.w0;
import androidx.core.app.o;
import androidx.lifecycle.LifecycleService;
import androidx.work.Logger;
import java.util.UUID;

@RestrictTo({Scope.LIBRARY_GROUP})
public class SystemForegroundService extends LifecycleService implements Callback {
    public Handler b;
    public boolean c;
    public SystemForegroundDispatcher d;
    public NotificationManager e;
    public static final String f;
    public static SystemForegroundService g;

    static {
        SystemForegroundService.f = "WM-SystemFgService";
        SystemForegroundService.g = null;
    }

    public final void a() {
        this.b = new Handler(Looper.getMainLooper());
        this.e = (NotificationManager)this.getApplicationContext().getSystemService("notification");
        SystemForegroundDispatcher systemForegroundDispatcher0 = new SystemForegroundDispatcher(this.getApplicationContext());
        this.d = systemForegroundDispatcher0;
        if(systemForegroundDispatcher0.i != null) {
            Logger.get().error("WM-SystemFgDispatcher", "A callback already exists.");
            return;
        }
        systemForegroundDispatcher0.i = this;
    }

    @Override  // androidx.work.impl.foreground.SystemForegroundDispatcher$Callback
    public void cancelNotification(int v) {
        this.b.post(new b(this, v, 0));
    }

    @Nullable
    public static SystemForegroundService getInstance() {
        return SystemForegroundService.g;
    }

    @Override  // androidx.work.impl.foreground.SystemForegroundDispatcher$Callback
    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    public void notify(int v, @NonNull Notification notification0) {
        this.b.post(new w0(this, v, notification0, 2));
    }

    @Override  // androidx.lifecycle.LifecycleService
    public void onCreate() {
        super.onCreate();
        SystemForegroundService.g = this;
        this.a();
    }

    @Override  // androidx.lifecycle.LifecycleService
    public void onDestroy() {
        super.onDestroy();
        this.d.b();
    }

    @Override  // androidx.lifecycle.LifecycleService
    public int onStartCommand(@Nullable Intent intent0, int v, int v1) {
        super.onStartCommand(intent0, v, v1);
        if(this.c) {
            Logger.get().info("WM-SystemFgService", "Re-initializing SystemForegroundService after a request to shut-down.");
            this.d.b();
            this.a();
            this.c = false;
        }
        if(intent0 != null) {
            SystemForegroundDispatcher systemForegroundDispatcher0 = this.d;
            systemForegroundDispatcher0.getClass();
            String s = intent0.getAction();
            if("ACTION_START_FOREGROUND".equals(s)) {
                Logger.get().info("WM-SystemFgDispatcher", "Started foreground service " + intent0);
                o o0 = new o(systemForegroundDispatcher0, intent0.getStringExtra("KEY_WORKSPEC_ID"), false, 7);
                systemForegroundDispatcher0.b.executeOnTaskThread(o0);
                systemForegroundDispatcher0.a(intent0);
                return 3;
            }
            if("ACTION_NOTIFY".equals(s)) {
                systemForegroundDispatcher0.a(intent0);
                return 3;
            }
            if("ACTION_CANCEL_WORK".equals(s)) {
                Logger.get().info("WM-SystemFgDispatcher", "Stopping foreground work for " + intent0);
                String s1 = intent0.getStringExtra("KEY_WORKSPEC_ID");
                if(s1 != null && !TextUtils.isEmpty(s1)) {
                    UUID uUID0 = UUID.fromString(s1);
                    systemForegroundDispatcher0.a.cancelWorkById(uUID0);
                    return 3;
                }
            }
            else if("ACTION_STOP_FOREGROUND".equals(s)) {
                Logger.get().info("WM-SystemFgDispatcher", "Stopping foreground service");
                SystemForegroundService systemForegroundService0 = systemForegroundDispatcher0.i;
                if(systemForegroundService0 != null) {
                    systemForegroundService0.stop();
                }
            }
        }
        return 3;
    }

    @Override  // androidx.work.impl.foreground.SystemForegroundDispatcher$Callback
    public void startForeground(int v, int v1, @NonNull Notification notification0) {
        this.b.post(new a(this, v, notification0, v1));
    }

    @Override  // androidx.work.impl.foreground.SystemForegroundDispatcher$Callback
    @MainThread
    public void stop() {
        this.c = true;
        Logger.get().debug("WM-SystemFgService", "All commands completed.");
        this.stopForeground(true);
        SystemForegroundService.g = null;
        this.stopSelf();
    }
}

