package com.google.firebase.components;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.crashlytics.AnalyticsDeferredProxy;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.AppData;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.common.DataCollectionArbiter;
import com.google.firebase.crashlytics.internal.common.ExecutorUtils;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.SettingsController;
import com.google.firebase.inject.Deferred;
import com.google.firebase.installations.FirebaseInstallationsApi;
import j7.d;
import java.util.concurrent.ExecutorService;
import o8.c;

public final class a implements ComponentFactory {
    public final int a;
    public final Object b;

    public a(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer0) {
        AppData appData0;
        if(this.a != 0) {
            ((CrashlyticsRegistrar)this.b).getClass();
            FirebaseApp firebaseApp0 = (FirebaseApp)componentContainer0.get(FirebaseApp.class);
            Deferred deferred0 = componentContainer0.getDeferred(CrashlyticsNativeComponent.class);
            Deferred deferred1 = componentContainer0.getDeferred(AnalyticsConnector.class);
            FirebaseInstallationsApi firebaseInstallationsApi0 = (FirebaseInstallationsApi)componentContainer0.get(FirebaseInstallationsApi.class);
            Context context0 = firebaseApp0.getApplicationContext();
            Logger.getLogger().i("Initializing Firebase Crashlytics 18.3.2 for net.daum.android.tistoryapp");
            FileStore fileStore0 = new FileStore(context0);
            DataCollectionArbiter dataCollectionArbiter0 = new DataCollectionArbiter(firebaseApp0);
            IdManager idManager0 = new IdManager(context0, "net.daum.android.tistoryapp", firebaseInstallationsApi0, dataCollectionArbiter0);
            CrashlyticsNativeComponentDeferredProxy crashlyticsNativeComponentDeferredProxy0 = new CrashlyticsNativeComponentDeferredProxy(deferred0);
            AnalyticsDeferredProxy analyticsDeferredProxy0 = new AnalyticsDeferredProxy(deferred1);
            ExecutorService executorService0 = ExecutorUtils.buildSingleThreadExecutorService("Crashlytics Exception Handler");
            CrashlyticsCore crashlyticsCore0 = new CrashlyticsCore(firebaseApp0, idManager0, crashlyticsNativeComponentDeferredProxy0, dataCollectionArbiter0, analyticsDeferredProxy0.getDeferredBreadcrumbSource(), analyticsDeferredProxy0.getAnalyticsEventLogger(), fileStore0, executorService0);
            String s = firebaseApp0.getOptions().getApplicationId();
            String s1 = CommonUtils.getMappingFileId(context0);
            Logger.getLogger().d("Mapping file ID is: " + s1);
            DevelopmentPlatformProvider developmentPlatformProvider0 = new DevelopmentPlatformProvider(context0);
            try {
                appData0 = AppData.create(context0, idManager0, s, s1, developmentPlatformProvider0);
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                Logger.getLogger().e("Error retrieving app package info.", packageManager$NameNotFoundException0);
                return null;
            }
            Logger.getLogger().v("Installer package name is: " + appData0.installerPackageName);
            ExecutorService executorService1 = ExecutorUtils.buildSingleThreadExecutorService("com.google.firebase.crashlytics.startup");
            SettingsController settingsController0 = SettingsController.create(context0, s, idManager0, new HttpRequestFactory(), appData0.versionCode, appData0.versionName, fileStore0, dataCollectionArbiter0);
            settingsController0.loadSettingsData(executorService1).continueWith(executorService1, new d(8));
            Tasks.call(executorService1, new c(crashlyticsCore0.onPreExecute(appData0, settingsController0), crashlyticsCore0, settingsController0));
            return new FirebaseCrashlytics(crashlyticsCore0);
        }
        return this.b;
    }
}

