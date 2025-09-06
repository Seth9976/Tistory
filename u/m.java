package u;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job.DefaultImpls;
import kotlinx.coroutines.Job;

public final class m extends w implements TextureView.SurfaceTextureListener {
    public long f;
    public final Matrix g;
    public Surface h;

    public m(CoroutineScope coroutineScope0) {
        super(coroutineScope0);
        this.f = 0L;
        this.g = new Matrix();
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture0, int v, int v1) {
        if(!IntSize.equals-impl0(this.f, 0L)) {
            v = IntSize.getWidth-impl(this.f);
            v1 = IntSize.getHeight-impl(this.f);
            surfaceTexture0.setDefaultBufferSize(v, v1);
        }
        Surface surface0 = new Surface(surfaceTexture0);
        this.h = surface0;
        if(this.b != null) {
            v v2 = new v(this, surface0, v, v1, null);
            this.e = BuildersKt.launch$default(this.a, null, CoroutineStart.UNDISPATCHED, v2, 1, null);
        }
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture0) {
        Surface surface0 = this.h;
        Intrinsics.checkNotNull(surface0);
        Function1 function10 = this.d;
        if(function10 != null) {
            function10.invoke(surface0);
        }
        Job job0 = this.e;
        if(job0 != null) {
            DefaultImpls.cancel$default(job0, null, 1, null);
        }
        this.e = null;
        this.h = null;
        return true;
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture0, int v, int v1) {
        if(!IntSize.equals-impl0(this.f, 0L)) {
            v = IntSize.getWidth-impl(this.f);
            v1 = IntSize.getHeight-impl(this.f);
            surfaceTexture0.setDefaultBufferSize(v, v1);
        }
        Surface surface0 = this.h;
        Intrinsics.checkNotNull(surface0);
        Function3 function30 = this.c;
        if(function30 != null) {
            function30.invoke(surface0, v, v1);
        }
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture0) {
    }
}

