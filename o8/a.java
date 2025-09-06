package o8;

import android.os.Bundle;
import com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.crashlytics.AnalyticsDeferredProxy;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.BlockingAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.BreadcrumbAnalyticsEventReceiver;
import com.google.firebase.crashlytics.internal.analytics.CrashlyticsOriginAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import com.google.firebase.crashlytics.internal.breadcrumbs.DisabledBreadcrumbSource;
import com.google.firebase.inject.Deferred.DeferredHandler;
import com.google.firebase.inject.Provider;
import java.util.concurrent.TimeUnit;

public final class a implements AnalyticsEventLogger, BreadcrumbSource, DeferredHandler {
    public final AnalyticsDeferredProxy a;

    public a(AnalyticsDeferredProxy analyticsDeferredProxy0) {
        this.a = analyticsDeferredProxy0;
        super();
    }

    @Override  // com.google.firebase.inject.Deferred$DeferredHandler
    public void handle(Provider provider0) {
        AnalyticsDeferredProxy analyticsDeferredProxy0 = this.a;
        analyticsDeferredProxy0.getClass();
        Logger.getLogger().d("AnalyticsConnector now available.");
        AnalyticsConnector analyticsConnector0 = (AnalyticsConnector)provider0.get();
        CrashlyticsOriginAnalyticsEventLogger crashlyticsOriginAnalyticsEventLogger0 = new CrashlyticsOriginAnalyticsEventLogger(analyticsConnector0);
        b b0 = new b();  // 初始化器: Ljava/lang/Object;-><init>()V
        AnalyticsConnectorHandle analyticsConnector$AnalyticsConnectorHandle0 = analyticsConnector0.registerAnalyticsConnectorListener("clx", b0);
        if(analyticsConnector$AnalyticsConnectorHandle0 == null) {
            Logger.getLogger().d("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            analyticsConnector$AnalyticsConnectorHandle0 = analyticsConnector0.registerAnalyticsConnectorListener("crash", b0);
            if(analyticsConnector$AnalyticsConnectorHandle0 != null) {
                Logger.getLogger().w("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        if(analyticsConnector$AnalyticsConnectorHandle0 != null) {
            Logger.getLogger().d("Registered Firebase Analytics listener.");
            BreadcrumbAnalyticsEventReceiver breadcrumbAnalyticsEventReceiver0 = new BreadcrumbAnalyticsEventReceiver();
            BlockingAnalyticsEventLogger blockingAnalyticsEventLogger0 = new BlockingAnalyticsEventLogger(crashlyticsOriginAnalyticsEventLogger0, 500, TimeUnit.MILLISECONDS);
            synchronized(analyticsDeferredProxy0) {
                for(Object object0: analyticsDeferredProxy0.d) {
                    breadcrumbAnalyticsEventReceiver0.registerBreadcrumbHandler(((BreadcrumbHandler)object0));
                }
                b0.b = breadcrumbAnalyticsEventReceiver0;
                b0.a = blockingAnalyticsEventLogger0;
                analyticsDeferredProxy0.c = breadcrumbAnalyticsEventReceiver0;
                analyticsDeferredProxy0.b = blockingAnalyticsEventLogger0;
            }
            return;
        }
        Logger.getLogger().w("Could not register Firebase Analytics listener; a listener is already registered.");
    }

    @Override  // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
    public void logEvent(String s, Bundle bundle0) {
        this.a.b.logEvent(s, bundle0);
    }

    @Override  // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource
    public void registerBreadcrumbHandler(BreadcrumbHandler breadcrumbHandler0) {
        AnalyticsDeferredProxy analyticsDeferredProxy0 = this.a;
        synchronized(analyticsDeferredProxy0) {
            if(analyticsDeferredProxy0.c instanceof DisabledBreadcrumbSource) {
                analyticsDeferredProxy0.d.add(breadcrumbHandler0);
            }
            analyticsDeferredProxy0.c.registerBreadcrumbHandler(breadcrumbHandler0);
        }
    }
}

