package u;

import android.graphics.Rect;
import android.view.Surface;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceHolder;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job.DefaultImpls;
import kotlinx.coroutines.Job;

public final class n extends w implements SurfaceHolder.Callback {
    public int f;
    public int g;

    @Override  // android.view.SurfaceHolder$Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder0, int v, int v1, int v2) {
        if(this.f != v1 || this.g != v2) {
            this.f = v1;
            this.g = v2;
            Surface surface0 = surfaceHolder0.getSurface();
            Function3 function30 = this.c;
            if(function30 != null) {
                function30.invoke(surface0, v1, v2);
            }
        }
    }

    @Override  // android.view.SurfaceHolder$Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder0) {
        Rect rect0 = surfaceHolder0.getSurfaceFrame();
        this.f = rect0.width();
        this.g = rect0.height();
        Surface surface0 = surfaceHolder0.getSurface();
        int v = this.f;
        int v1 = this.g;
        if(this.b != null) {
            v v2 = new v(this, surface0, v, v1, null);
            this.e = BuildersKt.launch$default(this.a, null, CoroutineStart.UNDISPATCHED, v2, 1, null);
        }
    }

    @Override  // android.view.SurfaceHolder$Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder0) {
        Surface surface0 = surfaceHolder0.getSurface();
        Function1 function10 = this.d;
        if(function10 != null) {
            function10.invoke(surface0);
        }
        Job job0 = this.e;
        if(job0 != null) {
            DefaultImpls.cancel$default(job0, null, 1, null);
        }
        this.e = null;
    }
}

