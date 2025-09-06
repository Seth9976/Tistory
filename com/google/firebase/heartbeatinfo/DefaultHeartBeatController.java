package com.google.firebase.heartbeatinfo;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.core.os.UserManagerCompat;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Component;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.e;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.f;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import v8.c;
import v8.d;

public class DefaultHeartBeatController implements HeartBeatController, HeartBeatInfo {
    public final e a;
    public final Context b;
    public final Provider c;
    public final Set d;
    public final ThreadPoolExecutor e;
    public static final d f;

    static {
        DefaultHeartBeatController.f = new d();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public DefaultHeartBeatController(Context context0, String s, Set set0, Provider provider0) {
        e e0 = new e(2, context0, s);
        ThreadPoolExecutor threadPoolExecutor0 = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), DefaultHeartBeatController.f);
        super();
        this.a = e0;
        this.d = set0;
        this.e = threadPoolExecutor0;
        this.c = provider0;
        this.b = context0;
    }

    @NonNull
    public static Component component() {
        return Component.builder(DefaultHeartBeatController.class, new Class[]{HeartBeatController.class, HeartBeatInfo.class}).add(Dependency.required(Context.class)).add(Dependency.required(FirebaseApp.class)).add(Dependency.setOf(HeartBeatConsumer.class)).add(Dependency.requiredProvider(UserAgentPublisher.class)).factory(new f(3)).build();
    }

    @Override  // com.google.firebase.heartbeatinfo.HeartBeatInfo
    @NonNull
    public HeartBeat getHeartBeatCode(@NonNull String s) {
        synchronized(this) {
            v8.e e0 = (v8.e)this.a.get();
            synchronized(e0) {
                boolean z = e0.g(System.currentTimeMillis());
            }
            if(z) {
                synchronized(e0) {
                    e0.a.edit().putString("last-used-date", "2025-09-06").commit();
                    e0.f("2025-09-06");
                    return HeartBeat.GLOBAL;
                }
            }
            return HeartBeat.NONE;
        }
    }

    @Override  // com.google.firebase.heartbeatinfo.HeartBeatController
    public Task getHeartBeatsHeader() {
        if(!UserManagerCompat.isUserUnlocked(this.b)) {
            return Tasks.forResult("");
        }
        c c0 = new c(this, 0);
        return Tasks.call(this.e, c0);
    }

    public Task registerHeartBeat() {
        if(this.d.size() <= 0) {
            return Tasks.forResult(null);
        }
        if(!UserManagerCompat.isUserUnlocked(this.b)) {
            return Tasks.forResult(null);
        }
        c c0 = new c(this, 1);
        return Tasks.call(this.e, c0);
    }
}

