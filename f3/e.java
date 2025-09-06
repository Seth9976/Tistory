package f3;

import android.graphics.drawable.Icon;
import android.net.Uri;
import androidx.annotation.DoNotInline;

public abstract class e {
    @DoNotInline
    public static int a(Object object0) {
        return ((Icon)object0).getResId();
    }

    @DoNotInline
    public static String b(Object object0) {
        return ((Icon)object0).getResPackage();
    }

    @DoNotInline
    public static int c(Object object0) {
        return ((Icon)object0).getType();
    }

    @DoNotInline
    public static Uri d(Object object0) {
        return ((Icon)object0).getUri();
    }
}

