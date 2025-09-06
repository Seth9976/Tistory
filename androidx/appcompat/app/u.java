package androidx.appcompat.app;

import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;

public final class u implements Runnable {
    public final i0 a;

    public u(i0 i00) {
        this.a = i00;
    }

    @Override
    public final void run() {
        i0 i00 = this.a;
        i00.w.showAtLocation(i00.v, 55, 0, 0);
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat0 = i00.y;
        if(viewPropertyAnimatorCompat0 != null) {
            viewPropertyAnimatorCompat0.cancel();
        }
        if(i00.A && (i00.B != null && ViewCompat.isLaidOut(i00.B))) {
            i00.v.setAlpha(0.0f);
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompat1 = ViewCompat.animate(i00.v).alpha(1.0f);
            i00.y = viewPropertyAnimatorCompat1;
            viewPropertyAnimatorCompat1.setListener(new t(this, 0));
            return;
        }
        i00.v.setAlpha(1.0f);
        i00.v.setVisibility(0);
    }
}

