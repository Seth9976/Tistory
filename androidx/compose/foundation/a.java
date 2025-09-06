package androidx.compose.foundation;

import android.view.SurfaceView;
import androidx.compose.ui.unit.IntSize;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function1 {
    public final long w;
    public final boolean x;
    public final int y;
    public final boolean z;

    public a(long v, boolean z, int v1, boolean z1) {
        this.w = v;
        this.x = z;
        this.y = v1;
        this.z = z1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        long v = this.w;
        if(IntSize.equals-impl0(v, 0L)) {
            ((SurfaceView)object0).getHolder().setSizeFromLayout();
        }
        else {
            ((SurfaceView)object0).getHolder().setFixedSize(IntSize.getWidth-impl(v), IntSize.getHeight-impl(v));
        }
        ((SurfaceView)object0).getHolder().setFormat((this.x ? -1 : -3));
        int v1 = this.y;
        if(AndroidExternalSurfaceZOrder.equals-impl0(v1, 0)) {
            ((SurfaceView)object0).setZOrderOnTop(false);
        }
        else if(AndroidExternalSurfaceZOrder.equals-impl0(v1, 1)) {
            ((SurfaceView)object0).setZOrderMediaOverlay(true);
        }
        else if(AndroidExternalSurfaceZOrder.equals-impl0(v1, 2)) {
            ((SurfaceView)object0).setZOrderOnTop(true);
        }
        ((SurfaceView)object0).setSecure(this.z);
        return Unit.INSTANCE;
    }
}

