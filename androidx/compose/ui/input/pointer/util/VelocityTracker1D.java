package androidx.compose.ui.input.pointer.util;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B\u001D\b\u0000\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ\u001D\u0010\u000E\u001A\u00020\r2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000B¢\u0006\u0004\b\u000E\u0010\u000FJ\r\u0010\u0010\u001A\u00020\u000B¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0010\u001A\u00020\u000B2\u0006\u0010\u0012\u001A\u00020\u000B¢\u0006\u0004\b\u0010\u0010\u0013J\r\u0010\u0014\u001A\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0003\u0010\u0018¨\u0006\u001A"}, d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityTracker1D;", "", "", "isDataDifferential", "Landroidx/compose/ui/input/pointer/util/VelocityTracker1D$Strategy;", "strategy", "<init>", "(ZLandroidx/compose/ui/input/pointer/util/VelocityTracker1D$Strategy;)V", "(Z)V", "", "timeMillis", "", "dataPoint", "", "addDataPoint", "(JF)V", "calculateVelocity", "()F", "maximumVelocity", "(F)F", "resetTracking", "()V", "a", "Z", "()Z", "Strategy", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nVelocityTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTracker1D\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,734:1\n42#2,7:735\n*S KotlinDebug\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTracker1D\n*L\n294#1:735,7\n*E\n"})
public final class VelocityTracker1D {
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityTracker1D$Strategy;", "", "Lsq2", "Impulse", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static enum Strategy {
        Lsq2,
        Impulse;

    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[Strategy.values().length];
            try {
                arr_v[Strategy.Impulse.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Strategy.Lsq2.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final int $stable = 8;
    public final boolean a;
    public final Strategy b;
    public final int c;
    public final DataPointAtTime[] d;
    public int e;
    public final float[] f;
    public final float[] g;
    public final float[] h;

    public VelocityTracker1D() {
        this(false, null, 3, null);
    }

    public VelocityTracker1D(boolean z) {
        this(z, Strategy.Impulse);
    }

    public VelocityTracker1D(boolean z, @NotNull Strategy velocityTracker1D$Strategy0) {
        this.a = z;
        this.b = velocityTracker1D$Strategy0;
        if(z && velocityTracker1D$Strategy0.equals(Strategy.Lsq2)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int v = WhenMappings.$EnumSwitchMapping$0[velocityTracker1D$Strategy0.ordinal()];
        int v1 = 2;
        if(v != 1) {
            if(v != 2) {
                throw new NoWhenBranchMatchedException();
            }
            v1 = 3;
        }
        this.c = v1;
        this.d = new DataPointAtTime[20];
        this.f = new float[20];
        this.g = new float[20];
        this.h = new float[3];
    }

    public VelocityTracker1D(boolean z, Strategy velocityTracker1D$Strategy0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            z = false;
        }
        if((v & 2) != 0) {
            velocityTracker1D$Strategy0 = Strategy.Lsq2;
        }
        this(z, velocityTracker1D$Strategy0);
    }

    public final void addDataPoint(long v, float f) {
        int v1 = (this.e + 1) % 20;
        this.e = v1;
        VelocityTrackerKt.access$set(this.d, v1, v, f);
    }

    public final float calculateVelocity() {
        float[] arr_f1;
        float[] arr_f;
        boolean z;
        int v = this.e;
        DataPointAtTime[] arr_dataPointAtTime = this.d;
        DataPointAtTime dataPointAtTime0 = arr_dataPointAtTime[v];
        float f = 0.0f;
        if(dataPointAtTime0 == null) {
            return 0.0f;
        }
        int v1 = 0;
        for(DataPointAtTime dataPointAtTime1 = dataPointAtTime0; true; dataPointAtTime1 = dataPointAtTime3) {
            DataPointAtTime dataPointAtTime2 = arr_dataPointAtTime[v];
            z = this.a;
            Strategy velocityTracker1D$Strategy0 = this.b;
            arr_f = this.f;
            arr_f1 = this.g;
            if(dataPointAtTime2 == null) {
                break;
            }
            float f1 = (float)(dataPointAtTime0.getTime() - dataPointAtTime2.getTime());
            DataPointAtTime dataPointAtTime3 = velocityTracker1D$Strategy0 == Strategy.Lsq2 || z ? dataPointAtTime2 : dataPointAtTime0;
            if(f1 > 100.0f || ((float)Math.abs(dataPointAtTime2.getTime() - dataPointAtTime1.getTime())) > 40.0f) {
                break;
            }
            arr_f[v1] = dataPointAtTime2.getDataPoint();
            arr_f1[v1] = -f1;
            if(v == 0) {
                v = 20;
            }
            --v;
            ++v1;
            if(v1 >= 20) {
                break;
            }
        }
        if(v1 >= this.c) {
            switch(WhenMappings.$EnumSwitchMapping$0[velocityTracker1D$Strategy0.ordinal()]) {
                case 1: {
                    f = VelocityTrackerKt.access$calculateImpulseVelocity(arr_f, arr_f1, v1, z);
                    return f * 1000.0f;
                }
                case 2: {
                    try {
                        return VelocityTrackerKt.polyFitLeastSquares(arr_f1, arr_f, v1, 2, this.h)[1] * 1000.0f;
                    }
                    catch(IllegalArgumentException unused_ex) {
                        return f * 1000.0f;
                    }
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        return 0.0f;
    }

    public final float calculateVelocity(float f) {
        if(f <= 0.0f) {
            InlineClassHelperKt.throwIllegalStateException(("maximumVelocity should be a positive value. You specified=" + f));
        }
        float f1 = this.calculateVelocity();
        if(f1 != 0.0f && !Float.isNaN(f1)) {
            return f1 > 0.0f ? c.coerceAtMost(f1, f) : c.coerceAtLeast(f1, -f);
        }
        return 0.0f;
    }

    public final boolean isDataDifferential() {
        return this.a;
    }

    public final void resetTracking() {
        ArraysKt___ArraysJvmKt.fill$default(this.d, null, 0, 0, 6, null);
        this.e = 0;
    }
}

