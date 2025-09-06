package n8;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener;
import com.google.firebase.analytics.connector.internal.zzc;
import com.google.firebase.analytics.connector.internal.zze;

public final class a implements OnEventListener {
    public final zze a;

    public a(zze zze0) {
        this.a = zze0;
    }

    @Override  // com.google.android.gms.measurement.api.AppMeasurementSdk$OnEventListener
    public final void onEvent(String s, String s1, Bundle bundle0, long v) {
        zze zze0 = this.a;
        if(!zze0.a.contains(s1)) {
            return;
        }
        Bundle bundle1 = new Bundle();
        bundle1.putString("events", zzc.zzc(s1));
        zze0.b.onMessageTriggered(2, bundle1);
    }
}

