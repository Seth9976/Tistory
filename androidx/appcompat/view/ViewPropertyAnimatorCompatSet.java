package androidx.appcompat.view;

import android.view.animation.Interpolator;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.o3;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListener;
import java.util.ArrayList;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public class ViewPropertyAnimatorCompatSet {
    public final ArrayList a;
    public long b;
    public Interpolator c;
    public ViewPropertyAnimatorListener d;
    public boolean e;
    public final o3 f;

    public ViewPropertyAnimatorCompatSet() {
        this.b = -1L;
        this.f = new o3(this);
        this.a = new ArrayList();
    }

    public void cancel() {
        if(!this.e) {
            return;
        }
        for(Object object0: this.a) {
            ((ViewPropertyAnimatorCompat)object0).cancel();
        }
        this.e = false;
    }

    public ViewPropertyAnimatorCompatSet play(ViewPropertyAnimatorCompat viewPropertyAnimatorCompat0) {
        if(!this.e) {
            this.a.add(viewPropertyAnimatorCompat0);
        }
        return this;
    }

    public ViewPropertyAnimatorCompatSet playSequentially(ViewPropertyAnimatorCompat viewPropertyAnimatorCompat0, ViewPropertyAnimatorCompat viewPropertyAnimatorCompat1) {
        this.a.add(viewPropertyAnimatorCompat0);
        viewPropertyAnimatorCompat1.setStartDelay(viewPropertyAnimatorCompat0.getDuration());
        this.a.add(viewPropertyAnimatorCompat1);
        return this;
    }

    public ViewPropertyAnimatorCompatSet setDuration(long v) {
        if(!this.e) {
            this.b = v;
        }
        return this;
    }

    public ViewPropertyAnimatorCompatSet setInterpolator(Interpolator interpolator0) {
        if(!this.e) {
            this.c = interpolator0;
        }
        return this;
    }

    public ViewPropertyAnimatorCompatSet setListener(ViewPropertyAnimatorListener viewPropertyAnimatorListener0) {
        if(!this.e) {
            this.d = viewPropertyAnimatorListener0;
        }
        return this;
    }

    public void start() {
        if(this.e) {
            return;
        }
        for(Object object0: this.a) {
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompat0 = (ViewPropertyAnimatorCompat)object0;
            long v = this.b;
            if(v >= 0L) {
                viewPropertyAnimatorCompat0.setDuration(v);
            }
            Interpolator interpolator0 = this.c;
            if(interpolator0 != null) {
                viewPropertyAnimatorCompat0.setInterpolator(interpolator0);
            }
            if(this.d != null) {
                viewPropertyAnimatorCompat0.setListener(this.f);
            }
            viewPropertyAnimatorCompat0.start();
        }
        this.e = true;
    }
}

