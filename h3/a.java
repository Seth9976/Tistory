package h3;

import android.net.ConnectivityManager;
import androidx.annotation.DoNotInline;

public abstract class a {
    @DoNotInline
    public static int a(ConnectivityManager connectivityManager0) {
        return connectivityManager0.getRestrictBackgroundStatus();
    }
}

