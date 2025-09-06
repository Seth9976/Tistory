package v4;

import android.view.Choreographer;
import androidx.annotation.DoNotInline;
import j2.k;

public abstract class b {
    @DoNotInline
    public static void a(Runnable runnable0) {
        Choreographer.getInstance().postFrameCallback(new k(runnable0, 1));
    }
}

