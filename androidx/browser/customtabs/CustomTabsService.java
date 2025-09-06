package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder.DeathRecipient;
import android.os.IBinder;
import androidx.collection.ArrayMap;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.NoSuchElementException;
import q.f;

public abstract class CustomTabsService extends Service {
    @Retention(RetentionPolicy.SOURCE)
    public @interface Relation {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Result {
    }

    public static final String ACTION_CUSTOM_TABS_CONNECTION = "android.support.customtabs.action.CustomTabsService";
    public static final String KEY_URL = "android.support.customtabs.otherurls.URL";
    public static final int RELATION_HANDLE_ALL_URLS = 2;
    public static final int RELATION_USE_AS_ORIGIN = 1;
    public static final int RESULT_FAILURE_DISALLOWED = -1;
    public static final int RESULT_FAILURE_MESSAGING_ERROR = -3;
    public static final int RESULT_FAILURE_REMOTE_ERROR = -2;
    public static final int RESULT_SUCCESS;
    public final ArrayMap a;
    public final f b;

    public CustomTabsService() {
        this.a = new ArrayMap();
        this.b = new f(this);
    }

    public boolean cleanUpSession(CustomTabsSessionToken customTabsSessionToken0) {
        try {
            synchronized(this.a) {
                IBinder iBinder0 = customTabsSessionToken0.a.asBinder();
                iBinder0.unlinkToDeath(((IBinder.DeathRecipient)this.a.get(iBinder0)), 0);
                this.a.remove(iBinder0);
                return true;
            }
        }
        catch(NoSuchElementException unused_ex) {
            return false;
        }
    }

    public abstract Bundle extraCommand(String arg1, Bundle arg2);

    public abstract boolean mayLaunchUrl(CustomTabsSessionToken arg1, Uri arg2, Bundle arg3, List arg4);

    public abstract boolean newSession(CustomTabsSessionToken arg1);

    @Override  // android.app.Service
    public IBinder onBind(Intent intent0) {
        return this.b;
    }

    public abstract int postMessage(CustomTabsSessionToken arg1, String arg2, Bundle arg3);

    public abstract boolean requestPostMessageChannel(CustomTabsSessionToken arg1, Uri arg2);

    public abstract boolean updateVisuals(CustomTabsSessionToken arg1, Bundle arg2);

    public abstract boolean validateRelationship(CustomTabsSessionToken arg1, int arg2, Uri arg3, Bundle arg4);

    public abstract boolean warmup(long arg1);
}

