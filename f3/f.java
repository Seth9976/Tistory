package f3;

import android.graphics.drawable.Icon;
import android.net.Uri;
import androidx.annotation.DoNotInline;

public abstract class f {
    @DoNotInline
    public static Icon a(Uri uri0) {
        return Icon.createWithAdaptiveBitmapContentUri(uri0);
    }
}

