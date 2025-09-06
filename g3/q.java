package g3;

import android.location.GnssMeasurementsEvent.Callback;
import android.location.GnssMeasurementsEvent;
import androidx.activity.j;
import androidx.emoji2.text.k;
import java.util.concurrent.Executor;

public final class q extends GnssMeasurementsEvent.Callback {
    public final GnssMeasurementsEvent.Callback a;
    public volatile Executor b;

    public q(GnssMeasurementsEvent.Callback gnssMeasurementsEvent$Callback0, Executor executor0) {
        this.a = gnssMeasurementsEvent$Callback0;
        this.b = executor0;
    }

    @Override  // android.location.GnssMeasurementsEvent$Callback
    public final void onGnssMeasurementsReceived(GnssMeasurementsEvent gnssMeasurementsEvent0) {
        Executor executor0 = this.b;
        if(executor0 == null) {
            return;
        }
        executor0.execute(new k(this, executor0, 6, gnssMeasurementsEvent0));
    }

    @Override  // android.location.GnssMeasurementsEvent$Callback
    public final void onStatusChanged(int v) {
        Executor executor0 = this.b;
        if(executor0 == null) {
            return;
        }
        executor0.execute(new j(this, executor0, v, 2));
    }
}

