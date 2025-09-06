package s1;

import android.media.ImageReader.OnImageAvailableListener;
import android.media.ImageReader;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuationImpl;

public final class g implements ImageReader.OnImageAvailableListener {
    public final CancellableContinuationImpl a;

    public g(CancellableContinuationImpl cancellableContinuationImpl0) {
        this.a = cancellableContinuationImpl0;
    }

    @Override  // android.media.ImageReader$OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader0) {
        Object object0 = Result.constructor-impl(imageReader0.acquireLatestImage());
        this.a.resumeWith(object0);
    }
}

