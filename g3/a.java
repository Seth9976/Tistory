package g3;

import android.location.GnssStatus;
import androidx.annotation.DoNotInline;

public abstract class a {
    @DoNotInline
    public static float a(GnssStatus gnssStatus0, int v) {
        return gnssStatus0.getCarrierFrequencyHz(v);
    }

    @DoNotInline
    public static boolean b(GnssStatus gnssStatus0, int v) {
        return gnssStatus0.hasCarrierFrequencyHz(v);
    }
}

