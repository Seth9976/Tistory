package com.google.firebase;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArrayMap;
import androidx.core.os.UserManagerCompat;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentDiscovery;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.components.Lazy;
import com.google.firebase.components.e;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.inject.Provider;
import com.google.firebase.internal.DataCollectionConfigStorage;
import com.google.firebase.tracing.ComponentMonitor;
import com.google.firebase.tracing.FirebaseTrace;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import l8.a;
import l8.b;
import l8.c;
import l8.d;

public class FirebaseApp {
    @KeepForSdk
    public interface BackgroundStateChangeListener {
        @KeepForSdk
        void onBackgroundStateChanged(boolean arg1);
    }

    @NonNull
    public static final String DEFAULT_APP_NAME = "[DEFAULT]";
    public final Context a;
    public final String b;
    public final FirebaseOptions c;
    public final ComponentRuntime d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;
    public final Lazy g;
    public final Provider h;
    public final CopyOnWriteArrayList i;
    public final CopyOnWriteArrayList j;
    public static final Object k;
    public static final c l;
    public static final ArrayMap m;

    static {
        FirebaseApp.k = new Object();
        FirebaseApp.l = new c();  // 初始化器: Ljava/lang/Object;-><init>()V
        FirebaseApp.m = new ArrayMap();
    }

    public FirebaseApp(Context context0, String s, FirebaseOptions firebaseOptions0) {
        this.e = new AtomicBoolean(false);
        this.f = new AtomicBoolean();
        this.i = new CopyOnWriteArrayList();
        this.j = new CopyOnWriteArrayList();
        this.a = (Context)Preconditions.checkNotNull(context0);
        this.b = Preconditions.checkNotEmpty(s);
        this.c = (FirebaseOptions)Preconditions.checkNotNull(firebaseOptions0);
        FirebaseTrace.pushTrace("Firebase");
        FirebaseTrace.pushTrace("ComponentDiscovery");
        List list0 = ComponentDiscovery.forContext(context0, ComponentDiscoveryService.class).discoverLazy();
        FirebaseTrace.popTrace();
        FirebaseTrace.pushTrace("Runtime");
        ComponentRuntime componentRuntime0 = ComponentRuntime.builder(FirebaseApp.l).addLazyComponentRegistrars(list0).addComponentRegistrar(new FirebaseCommonRegistrar()).addComponent(Component.of(context0, Context.class, new Class[0])).addComponent(Component.of(this, FirebaseApp.class, new Class[0])).addComponent(Component.of(firebaseOptions0, FirebaseOptions.class, new Class[0])).setProcessor(new ComponentMonitor()).build();
        this.d = componentRuntime0;
        FirebaseTrace.popTrace();
        this.g = new Lazy(new e(1, this, context0));
        this.h = componentRuntime0.getProvider(DefaultHeartBeatController.class);
        this.addBackgroundStateChangeListener(new a(this));
        FirebaseTrace.popTrace();
    }

    public final void a() {
        Preconditions.checkState(!this.f.get(), "FirebaseApp was deleted");
    }

    @KeepForSdk
    public void addBackgroundStateChangeListener(BackgroundStateChangeListener firebaseApp$BackgroundStateChangeListener0) {
        this.a();
        if(this.e.get() && BackgroundDetector.getInstance().isInBackground()) {
            firebaseApp$BackgroundStateChangeListener0.onBackgroundStateChanged(true);
        }
        this.i.add(firebaseApp$BackgroundStateChangeListener0);
    }

    @KeepForSdk
    public void addLifecycleEventListener(@NonNull FirebaseAppLifecycleListener firebaseAppLifecycleListener0) {
        this.a();
        Preconditions.checkNotNull(firebaseAppLifecycleListener0);
        this.j.add(firebaseAppLifecycleListener0);
    }

    public static ArrayList b() {
        ArrayList arrayList0 = new ArrayList();
        synchronized(FirebaseApp.k) {
            for(Object object1: FirebaseApp.m.values()) {
                arrayList0.add(((FirebaseApp)object1).getName());
            }
        }
        Collections.sort(arrayList0);
        return arrayList0;
    }

    public final void c() {
        Context context0 = this.a;
        if(UserManagerCompat.isUserUnlocked(context0)) {
            Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + this.getName());
            boolean z = this.isDefaultApp();
            this.d.initializeEagerComponents(z);
            ((DefaultHeartBeatController)this.h.get()).registerHeartBeat();
        }
        else {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + this.getName());
            AtomicReference atomicReference0 = d.b;
            if(atomicReference0.get() == null) {
                d d0 = new d(context0);
                do {
                    if(atomicReference0.compareAndSet(null, d0)) {
                        context0.registerReceiver(d0, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                        return;
                    }
                }
                while(atomicReference0.get() == null);
            }
        }
    }

    @VisibleForTesting
    public static void clearInstancesForTest() {
        synchronized(FirebaseApp.k) {
            FirebaseApp.m.clear();
        }
    }

    public final void d(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for(Object object0: this.i) {
            ((BackgroundStateChangeListener)object0).onBackgroundStateChanged(z);
        }
    }

    public void delete() {
        if(!this.f.compareAndSet(false, true)) {
            return;
        }
        synchronized(FirebaseApp.k) {
            FirebaseApp.m.remove(this.b);
        }
        for(Object object0: this.j) {
            ((FirebaseAppLifecycleListener)object0).onDeleted(this.b, this.c);
        }
    }

    @Override
    public boolean equals(Object object0) {
        if(!(object0 instanceof FirebaseApp)) {
            return false;
        }
        String s = ((FirebaseApp)object0).getName();
        return this.b.equals(s);
    }

    @KeepForSdk
    public Object get(Class class0) {
        this.a();
        return this.d.get(class0);
    }

    @NonNull
    public Context getApplicationContext() {
        this.a();
        return this.a;
    }

    @NonNull
    public static List getApps(@NonNull Context context0) {
        synchronized(FirebaseApp.k) {
        }
        return new ArrayList(FirebaseApp.m.values());
    }

    @NonNull
    public static FirebaseApp getInstance() {
        synchronized(FirebaseApp.k) {
            FirebaseApp firebaseApp0 = (FirebaseApp)FirebaseApp.m.get("[DEFAULT]");
            if(firebaseApp0 != null) {
                return firebaseApp0;
            }
        }
        throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
    }

    @NonNull
    public static FirebaseApp getInstance(@NonNull String s) {
        synchronized(FirebaseApp.k) {
            FirebaseApp firebaseApp0 = (FirebaseApp)FirebaseApp.m.get(s.trim());
            if(firebaseApp0 != null) {
                ((DefaultHeartBeatController)firebaseApp0.h.get()).registerHeartBeat();
                return firebaseApp0;
            }
            ArrayList arrayList0 = FirebaseApp.b();
            if(!arrayList0.isEmpty()) {
                String s1 = "Available app names: " + TextUtils.join(", ", arrayList0);
            }
        }
        throw new IllegalStateException("FirebaseApp with name " + s + " doesn\'t exist. " + "");
    }

    @NonNull
    public String getName() {
        this.a();
        return this.b;
    }

    @NonNull
    public FirebaseOptions getOptions() {
        this.a();
        return this.c;
    }

    @KeepForSdk
    public static String getPersistenceKey(String s, FirebaseOptions firebaseOptions0) {
        return Base64Utils.encodeUrlSafeNoPadding(s.getBytes(Charset.defaultCharset())) + "+" + Base64Utils.encodeUrlSafeNoPadding(firebaseOptions0.getApplicationId().getBytes(Charset.defaultCharset()));
    }

    @KeepForSdk
    public String getPersistenceKey() {
        return Base64Utils.encodeUrlSafeNoPadding(this.getName().getBytes(Charset.defaultCharset())) + "+" + Base64Utils.encodeUrlSafeNoPadding(this.getOptions().getApplicationId().getBytes(Charset.defaultCharset()));
    }

    @Override
    public int hashCode() {
        return this.b.hashCode();
    }

    @Nullable
    public static FirebaseApp initializeApp(@NonNull Context context0) {
        FirebaseOptions firebaseOptions0;
        synchronized(FirebaseApp.k) {
            if(FirebaseApp.m.containsKey("[DEFAULT]")) {
                return FirebaseApp.getInstance();
            }
            firebaseOptions0 = FirebaseOptions.fromResource(context0);
            if(firebaseOptions0 == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
        }
        return FirebaseApp.initializeApp(context0, firebaseOptions0);
    }

    @NonNull
    public static FirebaseApp initializeApp(@NonNull Context context0, @NonNull FirebaseOptions firebaseOptions0) {
        return FirebaseApp.initializeApp(context0, firebaseOptions0, "[DEFAULT]");
    }

    @NonNull
    public static FirebaseApp initializeApp(@NonNull Context context0, @NonNull FirebaseOptions firebaseOptions0, @NonNull String s) {
        FirebaseApp firebaseApp0;
        if(context0.getApplicationContext() instanceof Application) {
            Application application0 = (Application)context0.getApplicationContext();
            AtomicReference atomicReference0 = b.a;
            if(atomicReference0.get() == null) {
                b b0 = new b();  // 初始化器: Ljava/lang/Object;-><init>()V
                while(true) {
                    if(atomicReference0.compareAndSet(null, b0)) {
                        BackgroundDetector.initialize(application0);
                        BackgroundDetector.getInstance().addListener(b0);
                        break;
                    }
                    if(atomicReference0.get() != null) {
                        break;
                    }
                }
            }
        }
        String s1 = s.trim();
        if(context0.getApplicationContext() != null) {
            context0 = context0.getApplicationContext();
        }
        synchronized(FirebaseApp.k) {
            Preconditions.checkState(!FirebaseApp.m.containsKey(s1), "FirebaseApp name " + s1 + " already exists!");
            Preconditions.checkNotNull(context0, "Application context cannot be null.");
            firebaseApp0 = new FirebaseApp(context0, s1, firebaseOptions0);
            FirebaseApp.m.put(s1, firebaseApp0);
        }
        firebaseApp0.c();
        return firebaseApp0;
    }

    @KeepForSdk
    public boolean isDataCollectionDefaultEnabled() {
        this.a();
        return ((DataCollectionConfigStorage)this.g.get()).isEnabled();
    }

    @VisibleForTesting
    @KeepForSdk
    public boolean isDefaultApp() {
        return "[DEFAULT]".equals(this.getName());
    }

    @KeepForSdk
    public void removeBackgroundStateChangeListener(BackgroundStateChangeListener firebaseApp$BackgroundStateChangeListener0) {
        this.a();
        this.i.remove(firebaseApp$BackgroundStateChangeListener0);
    }

    @KeepForSdk
    public void removeLifecycleEventListener(@NonNull FirebaseAppLifecycleListener firebaseAppLifecycleListener0) {
        this.a();
        Preconditions.checkNotNull(firebaseAppLifecycleListener0);
        this.j.remove(firebaseAppLifecycleListener0);
    }

    public void setAutomaticResourceManagementEnabled(boolean z) {
        this.a();
        if(this.e.compareAndSet(!z, z)) {
            boolean z1 = BackgroundDetector.getInstance().isInBackground();
            if(z && z1) {
                this.d(true);
                return;
            }
            if(!z && z1) {
                this.d(false);
            }
        }
    }

    @KeepForSdk
    public void setDataCollectionDefaultEnabled(Boolean boolean0) {
        this.a();
        ((DataCollectionConfigStorage)this.g.get()).setEnabled(boolean0);
    }

    @KeepForSdk
    @Deprecated
    public void setDataCollectionDefaultEnabled(boolean z) {
        this.setDataCollectionDefaultEnabled(Boolean.valueOf(z));
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this).add("name", this.b).add("options", this.c).toString();
    }
}

