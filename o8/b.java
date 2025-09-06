package o8;

import android.os.Bundle;
import com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.analytics.BlockingAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.BreadcrumbAnalyticsEventReceiver;

public final class b implements AnalyticsConnectorListener {
    public BlockingAnalyticsEventLogger a;
    public BreadcrumbAnalyticsEventReceiver b;

    @Override  // com.google.firebase.analytics.connector.AnalyticsConnector$AnalyticsConnectorListener
    public final void onMessageTriggered(int v, Bundle bundle0) {
        Logger.getLogger().v("Analytics listener received message. ID: " + v + ", Extras: " + bundle0);
        if(bundle0 == null) {
            return;
        }
        String s = bundle0.getString("name");
        if(s != null) {
            Bundle bundle1 = bundle0.getBundle("params");
            if(bundle1 == null) {
                bundle1 = new Bundle();
            }
            BlockingAnalyticsEventLogger blockingAnalyticsEventLogger0 = "clx".equals(bundle1.getString("_o")) ? this.a : this.b;
            if(blockingAnalyticsEventLogger0 != null) {
                blockingAnalyticsEventLogger0.onEvent(s, bundle1);
            }
        }
    }
}

