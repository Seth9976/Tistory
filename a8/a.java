package a8;

import android.os.SystemClock;
import com.google.android.material.progressindicator.BaseProgressIndicator;

public final class a implements Runnable {
    public final int a;
    public final BaseProgressIndicator b;

    public a(BaseProgressIndicator baseProgressIndicator0, int v) {
        this.a = v;
        this.b = baseProgressIndicator0;
        super();
    }

    @Override
    public final void run() {
        BaseProgressIndicator baseProgressIndicator0 = this.b;
        if(this.a != 0) {
            ((com.google.android.material.progressindicator.a)baseProgressIndicator0.getCurrentDrawable()).setVisible(false, false, true);
            if((baseProgressIndicator0.getProgressDrawable() == null || !baseProgressIndicator0.getProgressDrawable().isVisible()) && (baseProgressIndicator0.getIndeterminateDrawable() == null || !baseProgressIndicator0.getIndeterminateDrawable().isVisible())) {
                baseProgressIndicator0.setVisibility(4);
            }
            baseProgressIndicator0.g = -1L;
            return;
        }
        if(baseProgressIndicator0.f > 0) {
            baseProgressIndicator0.g = SystemClock.uptimeMillis();
        }
        baseProgressIndicator0.setVisibility(0);
    }
}

