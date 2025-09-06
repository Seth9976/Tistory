package androidx.core.app;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class FrameMetricsAggregator {
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface MetricType {
    }

    public static final int ANIMATION_DURATION = 0x100;
    public static final int ANIMATION_INDEX = 8;
    public static final int COMMAND_DURATION = 0x20;
    public static final int COMMAND_INDEX = 5;
    public static final int DELAY_DURATION = 0x80;
    public static final int DELAY_INDEX = 7;
    public static final int DRAW_DURATION = 8;
    public static final int DRAW_INDEX = 3;
    public static final int EVERY_DURATION = 0x1FF;
    public static final int INPUT_DURATION = 2;
    public static final int INPUT_INDEX = 1;
    public static final int LAYOUT_MEASURE_DURATION = 4;
    public static final int LAYOUT_MEASURE_INDEX = 2;
    public static final int SWAP_DURATION = 0x40;
    public static final int SWAP_INDEX = 6;
    public static final int SYNC_DURATION = 16;
    public static final int SYNC_INDEX = 4;
    public static final int TOTAL_DURATION = 1;
    public static final int TOTAL_INDEX;
    public final y a;

    public FrameMetricsAggregator() {
        this(1);
    }

    public FrameMetricsAggregator(int v) {
        this.a = new y(v);
    }

    public void add(@NonNull Activity activity0) {
        y y0 = this.a;
        y0.getClass();
        if(y.e == null) {
            HandlerThread handlerThread0 = new HandlerThread("FrameMetricsAggregator");
            y.e = handlerThread0;
            handlerThread0.start();
            y.f = new Handler(y.e.getLooper());
        }
        for(int v = 0; v <= 8; ++v) {
            SparseIntArray[] arr_sparseIntArray = (SparseIntArray[])y0.b;
            if(arr_sparseIntArray[v] == null && (y0.a & 1 << v) != 0) {
                arr_sparseIntArray[v] = new SparseIntArray();
            }
        }
        activity0.getWindow().addOnFrameMetricsAvailableListener(((x)y0.d), y.f);
        WeakReference weakReference0 = new WeakReference(activity0);
        ((ArrayList)y0.c).add(weakReference0);
    }

    @Nullable
    public SparseIntArray[] getMetrics() {
        return (SparseIntArray[])this.a.b;
    }

    @Nullable
    public SparseIntArray[] remove(@NonNull Activity activity0) {
        y y0 = this.a;
        ArrayList arrayList0 = (ArrayList)y0.c;
        for(Object object0: arrayList0) {
            WeakReference weakReference0 = (WeakReference)object0;
            if(weakReference0.get() == activity0) {
                arrayList0.remove(weakReference0);
                break;
            }
            if(false) {
                break;
            }
        }
        activity0.getWindow().removeOnFrameMetricsAvailableListener(((x)y0.d));
        return (SparseIntArray[])y0.b;
    }

    @Nullable
    public SparseIntArray[] reset() {
        SparseIntArray[] arr_sparseIntArray = (SparseIntArray[])this.a.b;
        this.a.b = new SparseIntArray[9];
        return arr_sparseIntArray;
    }

    @Nullable
    public SparseIntArray[] stop() {
        y y0 = this.a;
        ArrayList arrayList0 = (ArrayList)y0.c;
        for(int v = arrayList0.size() - 1; v >= 0; --v) {
            WeakReference weakReference0 = (WeakReference)arrayList0.get(v);
            Activity activity0 = (Activity)weakReference0.get();
            if(weakReference0.get() != null) {
                activity0.getWindow().removeOnFrameMetricsAvailableListener(((x)y0.d));
                arrayList0.remove(v);
            }
        }
        return (SparseIntArray[])y0.b;
    }
}

