package n8;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener;
import com.google.firebase.analytics.connector.internal.zzc;
import com.google.firebase.analytics.connector.internal.zzg;

public final class b implements OnEventListener {
    public final zzg a;

    public b(zzg zzg0) {
        this.a = zzg0;
    }

    @Override  // com.google.android.gms.measurement.api.AppMeasurementSdk$OnEventListener
    public final void onEvent(String s, String s1, Bundle bundle0, long v) {
        if(s != null && zzc.zzk(s1)) {
            Bundle bundle1 = new Bundle();
            bundle1.putString("name", s1);
            bundle1.putLong("timestampInMillis", v);
            bundle1.putBundle("params", bundle0);
            this.a.a.onMessageTriggered(3, bundle1);
        }
    }
}

