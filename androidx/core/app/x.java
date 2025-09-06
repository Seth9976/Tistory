package androidx.core.app;

import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window.OnFrameMetricsAvailableListener;
import android.view.Window;

public final class x implements Window.OnFrameMetricsAvailableListener {
    public final y a;

    public x(y y0) {
        this.a = y0;
    }

    @Override  // android.view.Window$OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window0, FrameMetrics frameMetrics0, int v) {
        y y0 = this.a;
        if((y0.a & 1) != 0) {
            y.a(((SparseIntArray[])y0.b)[0], frameMetrics0.getMetric(8));
        }
        if((y0.a & 2) != 0) {
            y.a(((SparseIntArray[])y0.b)[1], frameMetrics0.getMetric(1));
        }
        if((y0.a & 4) != 0) {
            y.a(((SparseIntArray[])y0.b)[2], frameMetrics0.getMetric(3));
        }
        if((y0.a & 8) != 0) {
            y.a(((SparseIntArray[])y0.b)[3], frameMetrics0.getMetric(4));
        }
        if((y0.a & 16) != 0) {
            y.a(((SparseIntArray[])y0.b)[4], frameMetrics0.getMetric(5));
        }
        if((y0.a & 0x40) != 0) {
            y.a(((SparseIntArray[])y0.b)[6], frameMetrics0.getMetric(7));
        }
        if((y0.a & 0x20) != 0) {
            y.a(((SparseIntArray[])y0.b)[5], frameMetrics0.getMetric(6));
        }
        if((y0.a & 0x80) != 0) {
            y.a(((SparseIntArray[])y0.b)[7], frameMetrics0.getMetric(0));
        }
        if((y0.a & 0x100) != 0) {
            y.a(((SparseIntArray[])y0.b)[8], frameMetrics0.getMetric(2));
        }
    }
}

