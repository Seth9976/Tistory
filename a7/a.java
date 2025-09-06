package a7;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.internal.base.zaq;

public final class a extends zaq {
    public final Context a;
    public final GoogleApiAvailability b;

    public a(GoogleApiAvailability googleApiAvailability0, Context context0) {
        this.b = googleApiAvailability0;
        super((Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper()));
        this.a = context0.getApplicationContext();
    }

    @Override  // android.os.Handler
    public final void handleMessage(Message message0) {
        int v = message0.what;
        if(v != 1) {
            Log.w("GoogleApiAvailability", "Don\'t know how to handle this message: " + v);
            return;
        }
        GoogleApiAvailability googleApiAvailability0 = this.b;
        Context context0 = this.a;
        int v1 = googleApiAvailability0.isGooglePlayServicesAvailable(context0);
        if(googleApiAvailability0.isUserResolvableError(v1)) {
            googleApiAvailability0.showErrorNotification(context0, v1);
        }
    }
}

