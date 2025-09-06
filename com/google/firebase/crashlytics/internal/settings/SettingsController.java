package com.google.firebase.crashlytics.internal.settings;

import android.content.Context;
import androidx.appcompat.view.menu.f;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.DataCollectionArbiter;
import com.google.firebase.crashlytics.internal.common.DeliveryMechanism;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.crashlytics.internal.common.SystemCurrentTimeProvider;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

public class SettingsController implements SettingsProvider {
    public final Context a;
    public final d b;
    public final SettingsJsonParser c;
    public final SystemCurrentTimeProvider d;
    public final CachedSettingsIo e;
    public final b f;
    public final DataCollectionArbiter g;
    public final AtomicReference h;
    public final AtomicReference i;

    public SettingsController(Context context0, d d0, SystemCurrentTimeProvider systemCurrentTimeProvider0, SettingsJsonParser settingsJsonParser0, CachedSettingsIo cachedSettingsIo0, b b0, DataCollectionArbiter dataCollectionArbiter0) {
        AtomicReference atomicReference0 = new AtomicReference();
        this.h = atomicReference0;
        this.i = new AtomicReference(new TaskCompletionSource());
        this.a = context0;
        this.b = d0;
        this.d = systemCurrentTimeProvider0;
        this.c = settingsJsonParser0;
        this.e = cachedSettingsIo0;
        this.f = b0;
        this.g = dataCollectionArbiter0;
        atomicReference0.set(a.a(systemCurrentTimeProvider0));
    }

    public final Settings a(c c0) {
        Settings settings1;
        Settings settings0 = null;
        try {
            if(!c.b.equals(c0)) {
                JSONObject jSONObject0 = this.e.readCachedSettings();
                if(jSONObject0 == null) {
                    Logger.getLogger().d("No cached settings data found.");
                    return null;
                }
                settings1 = this.c.parseSettingsJson(jSONObject0);
                if(settings1 == null) {
                    Logger.getLogger().e("Failed to parse cached settings data.", null);
                    return null;
                }
                Logger.getLogger().d("Loaded cached settings: " + jSONObject0.toString());
                long v = this.d.getCurrentTimeMillis();
                if(!c.c.equals(c0) && settings1.isExpired(v)) {
                    Logger.getLogger().v("Cached settings have expired.");
                    return null;
                }
                goto label_17;
            }
        }
        catch(Exception exception0) {
            Logger.getLogger().e("Failed to get cached settings", exception0);
        }
        return settings0;
        try {
        label_17:
            Logger.getLogger().v("Returning cached settings.");
            return settings1;
        }
        catch(Exception exception0) {
            settings0 = settings1;
        }
        Logger.getLogger().e("Failed to get cached settings", exception0);
        return settings0;
    }

    public static SettingsController create(Context context0, String s, IdManager idManager0, HttpRequestFactory httpRequestFactory0, String s1, String s2, FileStore fileStore0, DataCollectionArbiter dataCollectionArbiter0) {
        String s3 = idManager0.getInstallerPackageName();
        SystemCurrentTimeProvider systemCurrentTimeProvider0 = new SystemCurrentTimeProvider();
        SettingsJsonParser settingsJsonParser0 = new SettingsJsonParser(systemCurrentTimeProvider0);
        CachedSettingsIo cachedSettingsIo0 = new CachedSettingsIo(fileStore0);
        b b0 = new b("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/" + s + "/settings", httpRequestFactory0);
        return new SettingsController(context0, new d(s, idManager0.getModelName(), idManager0.getOsBuildVersionString(), idManager0.getOsDisplayVersionString(), idManager0, CommonUtils.createInstanceIdFrom(new String[]{CommonUtils.getMappingFileId(context0), s, s2, s1}), s2, s1, DeliveryMechanism.determineFrom(s3).getId()), systemCurrentTimeProvider0, settingsJsonParser0, cachedSettingsIo0, b0, dataCollectionArbiter0);
    }

    @Override  // com.google.firebase.crashlytics.internal.settings.SettingsProvider
    public Task getSettingsAsync() {
        return ((TaskCompletionSource)this.i.get()).getTask();
    }

    @Override  // com.google.firebase.crashlytics.internal.settings.SettingsProvider
    public Settings getSettingsSync() {
        return (Settings)this.h.get();
    }

    public Task loadSettingsData(c c0, Executor executor0) {
        boolean z = CommonUtils.getSharedPrefs(this.a).getString("existing_instance_identifier", "").equals(this.b.f);
        AtomicReference atomicReference0 = this.i;
        AtomicReference atomicReference1 = this.h;
        if(z) {
            Settings settings0 = this.a(c0);
            if(settings0 != null) {
                atomicReference1.set(settings0);
                ((TaskCompletionSource)atomicReference0.get()).trySetResult(settings0);
                return Tasks.forResult(null);
            }
        }
        Settings settings1 = this.a(c.c);
        if(settings1 != null) {
            atomicReference1.set(settings1);
            ((TaskCompletionSource)atomicReference0.get()).trySetResult(settings1);
        }
        return this.g.waitForDataCollectionPermission(executor0).onSuccessTask(executor0, new f(this, 18));
    }

    public Task loadSettingsData(Executor executor0) {
        return this.loadSettingsData(c.a, executor0);
    }
}

