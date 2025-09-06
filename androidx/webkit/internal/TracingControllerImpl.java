package androidx.webkit.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.webkit.TracingConfig;
import androidx.webkit.TracingController;
import java.io.OutputStream;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;

public class TracingControllerImpl extends TracingController {
    public android.webkit.TracingController a;
    public TracingControllerBoundaryInterface b;

    public TracingControllerImpl() {
        this.a = ApiHelperForP.getTracingControllerInstance();
        this.b = null;
    }

    @Override  // androidx.webkit.TracingController
    public boolean isTracing() {
        if(this.a == null) {
            this.a = ApiHelperForP.getTracingControllerInstance();
        }
        return ApiHelperForP.isTracing(this.a);
    }

    @Override  // androidx.webkit.TracingController
    public void start(@NonNull TracingConfig tracingConfig0) {
        if(tracingConfig0 == null) {
            throw new IllegalArgumentException("Tracing config must be non null");
        }
        if(this.a == null) {
            this.a = ApiHelperForP.getTracingControllerInstance();
        }
        ApiHelperForP.start(this.a, tracingConfig0);
    }

    @Override  // androidx.webkit.TracingController
    public boolean stop(@Nullable OutputStream outputStream0, @NonNull Executor executor0) {
        if(this.a == null) {
            this.a = ApiHelperForP.getTracingControllerInstance();
        }
        return ApiHelperForP.stop(this.a, outputStream0, executor0);
    }
}

