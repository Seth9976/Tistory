package u;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class p extends Lambda implements Function1 {
    public final long w;
    public final m x;
    public final boolean y;
    public final float[] z;

    public p(long v, m m0, boolean z, float[] arr_f) {
        this.w = v;
        this.x = m0;
        this.y = z;
        this.z = arr_f;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Matrix matrix0;
        long v = this.w;
        if(!IntSize.equals-impl0(v, 0L)) {
            SurfaceTexture surfaceTexture0 = ((TextureView)object0).getSurfaceTexture();
            if(surfaceTexture0 != null) {
                surfaceTexture0.setDefaultBufferSize(IntSize.getWidth-impl(v), IntSize.getHeight-impl(v));
            }
        }
        m m0 = this.x;
        m0.f = v;
        ((TextureView)object0).setOpaque(this.y);
        float[] arr_f = this.z;
        if(arr_f == null) {
            matrix0 = null;
        }
        else {
            matrix0 = m0.g;
            AndroidMatrixConversions_androidKt.setFrom-EL8BTi8(matrix0, arr_f);
        }
        ((TextureView)object0).setTransform(matrix0);
        return Unit.INSTANCE;
    }
}

