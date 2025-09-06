package g3;

import android.location.GnssStatus;
import androidx.annotation.DoNotInline;

public abstract class b {
    @DoNotInline
    public static float a(GnssStatus gnssStatus0, int v) {
        return gnssStatus0.getBasebandCn0DbHz(v);
    }

    @DoNotInline
    public static boolean b(GnssStatus gnssStatus0, int v) {
        return gnssStatus0.hasBasebandCn0DbHz(v);
    }
}

