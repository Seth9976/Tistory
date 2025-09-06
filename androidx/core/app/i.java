package androidx.core.app;

import android.app.SharedElementCallback.OnSharedElementsReadyListener;
import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Parcelable;
import android.view.View;
import java.util.List;
import java.util.Map;

public final class i extends SharedElementCallback {
    public final androidx.core.app.SharedElementCallback a;

    public i(androidx.core.app.SharedElementCallback sharedElementCallback0) {
        this.a = sharedElementCallback0;
    }

    @Override  // android.app.SharedElementCallback
    public final Parcelable onCaptureSharedElementSnapshot(View view0, Matrix matrix0, RectF rectF0) {
        return this.a.onCaptureSharedElementSnapshot(view0, matrix0, rectF0);
    }

    @Override  // android.app.SharedElementCallback
    public final View onCreateSnapshotView(Context context0, Parcelable parcelable0) {
        return this.a.onCreateSnapshotView(context0, parcelable0);
    }

    @Override  // android.app.SharedElementCallback
    public final void onMapSharedElements(List list0, Map map0) {
    }

    @Override  // android.app.SharedElementCallback
    public final void onRejectSharedElements(List list0) {
    }

    @Override  // android.app.SharedElementCallback
    public final void onSharedElementEnd(List list0, List list1, List list2) {
    }

    @Override  // android.app.SharedElementCallback
    public final void onSharedElementStart(List list0, List list1, List list2) {
    }

    @Override  // android.app.SharedElementCallback
    public final void onSharedElementsArrived(List list0, List list1, SharedElementCallback.OnSharedElementsReadyListener sharedElementCallback$OnSharedElementsReadyListener0) {
        h h0 = new h(sharedElementCallback$OnSharedElementsReadyListener0, 0);
        this.a.onSharedElementsArrived(list0, list1, h0);
    }
}

