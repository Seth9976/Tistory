package u4;

import android.os.CancellationSignal.OnCancelListener;
import androidx.print.PrintHelper;

public final class b implements CancellationSignal.OnCancelListener {
    public final c a;

    public b(c c0) {
        this.a = c0;
    }

    @Override  // android.os.CancellationSignal$OnCancelListener
    public final void onCancel() {
        c c0 = this.a;
        synchronized(c0.e.h.c) {
            PrintHelper printHelper0 = c0.e.h;
            if(printHelper0.b != null) {
                printHelper0.b = null;
            }
        }
        c0.cancel(false);
    }
}

