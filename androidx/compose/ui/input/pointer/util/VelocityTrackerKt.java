package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.HistoricalChange;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.internal.InlineClassHelperKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u000F\n\u0002\u0010\u0011\n\u0002\b\u0003\u001A\u0019\u0010\u0004\u001A\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001A9\u0010\r\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u000B\u001A\u00020\t2\b\b\u0002\u0010\f\u001A\u00020\u0006H\u0000¢\u0006\u0004\b\r\u0010\u000E\"0\u0010\u0019\u001A\u00020\u000F2\u0006\u0010\u0010\u001A\u00020\u000F8G@GX\u0087\u000E¢\u0006\u0018\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\"0\u0010\u001E\u001A\u00020\u000F2\u0006\u0010\u0010\u001A\u00020\u000F8G@GX\u0087\u000E¢\u0006\u0018\n\u0004\b\u001A\u0010\u0012\u0012\u0004\b\u001D\u0010\u0018\u001A\u0004\b\u001B\u0010\u0014\"\u0004\b\u001C\u0010\u0016*\u0018\b\u0002\u0010 \"\b\u0012\u0004\u0012\u00020\u00060\u001F2\b\u0012\u0004\u0012\u00020\u00060\u001F*\f\b\u0002\u0010!\"\u00020\u00062\u00020\u0006¨\u0006\""}, d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "event", "", "addPointerInputChange", "(Landroidx/compose/ui/input/pointer/util/VelocityTracker;Landroidx/compose/ui/input/pointer/PointerInputChange;)V", "", "x", "y", "", "sampleCount", "degree", "coefficients", "polyFitLeastSquares", "([F[FII[F)[F", "", "<set-?>", "a", "Z", "getVelocityTrackerAddPointsFix", "()Z", "setVelocityTrackerAddPointsFix", "(Z)V", "getVelocityTrackerAddPointsFix$annotations", "()V", "VelocityTrackerAddPointsFix", "b", "getVelocityTrackerStrategyUseImpulse", "setVelocityTrackerStrategyUseImpulse", "getVelocityTrackerStrategyUseImpulse$annotations", "VelocityTrackerStrategyUseImpulse", "", "Matrix", "Vector", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nVelocityTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTrackerKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,734:1\n696#1:747\n703#1,2:748\n699#1,6:750\n696#1:756\n696#1:757\n691#1:758\n677#1:760\n677#1:761\n33#2,6:735\n33#2,6:741\n78#3:759\n*S KotlinDebug\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTrackerKt\n*L\n498#1:747\n500#1:748,2\n502#1:750,6\n509#1:756\n511#1:757\n524#1:758\n661#1:760\n667#1:761\n396#1:735,6\n432#1:741,6\n524#1:759\n*E\n"})
public final class VelocityTrackerKt {
    public static boolean a = true;
    public static boolean b;

    public static final float a(float[] arr_f, float[] arr_f1) {
        float f = 0.0f;
        for(int v = 0; v < arr_f.length; ++v) {
            f += arr_f[v] * arr_f1[v];
        }
        return f;
    }

    public static final float access$calculateImpulseVelocity(float[] arr_f, float[] arr_f1, int v, boolean z) {
        float f = arr_f1[v - 1];
        float f1 = 0.0f;
        int v1 = v - 1;
        while(v1 > 0) {
            float f2 = arr_f1[v1 - 1];
            if(f != f2) {
                float f3 = (z ? -arr_f[v1 - 1] : arr_f[v1] - arr_f[v1 - 1]) / (f - f2);
                f1 = v1 == v - 1 ? (Math.abs(f3) * (f3 - Math.signum(f1) * ((float)Math.sqrt(Math.abs(f1) * 2.0f))) + f1) * 0.5f : Math.abs(f3) * (f3 - Math.signum(f1) * ((float)Math.sqrt(Math.abs(f1) * 2.0f))) + f1;
            }
            --v1;
            f = f2;
        }
        return Math.signum(f1) * ((float)Math.sqrt(Math.abs(f1) * 2.0f));
    }

    public static final void access$set(DataPointAtTime[] arr_dataPointAtTime, int v, long v1, float f) {
        DataPointAtTime dataPointAtTime0 = arr_dataPointAtTime[v];
        if(dataPointAtTime0 == null) {
            arr_dataPointAtTime[v] = new DataPointAtTime(v1, f);
            return;
        }
        dataPointAtTime0.setTime(v1);
        dataPointAtTime0.setDataPoint(f);
    }

    public static final void addPointerInputChange(@NotNull VelocityTracker velocityTracker0, @NotNull PointerInputChange pointerInputChange0) {
        int v = 0;
        if(VelocityTrackerKt.a) {
            if(PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange0)) {
                velocityTracker0.resetTracking();
            }
            if(!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange0)) {
                List list0 = pointerInputChange0.getHistorical();
                int v1 = list0.size();
                while(v < v1) {
                    HistoricalChange historicalChange0 = (HistoricalChange)list0.get(v);
                    velocityTracker0.addPosition-Uv8p0NA(historicalChange0.getUptimeMillis(), historicalChange0.getOriginalEventPosition-F1C5BW0$ui_release());
                    ++v;
                }
                velocityTracker0.addPosition-Uv8p0NA(pointerInputChange0.getUptimeMillis(), pointerInputChange0.getOriginalEventPosition-F1C5BW0$ui_release());
            }
            if(PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange0) && pointerInputChange0.getUptimeMillis() - velocityTracker0.getLastMoveEventTimeStamp$ui_release() > 40L) {
                velocityTracker0.resetTracking();
            }
            velocityTracker0.setLastMoveEventTimeStamp$ui_release(pointerInputChange0.getUptimeMillis());
            return;
        }
        if(PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange0)) {
            velocityTracker0.setCurrentPointerPositionAccumulator-k-4lQ0M$ui_release(pointerInputChange0.getPosition-F1C5BW0());
            velocityTracker0.resetTracking();
        }
        long v2 = pointerInputChange0.getPreviousPosition-F1C5BW0();
        List list1 = pointerInputChange0.getHistorical();
        int v3 = list1.size();
        while(v < v3) {
            HistoricalChange historicalChange1 = (HistoricalChange)list1.get(v);
            velocityTracker0.setCurrentPointerPositionAccumulator-k-4lQ0M$ui_release(Offset.plus-MK-Hz9U(velocityTracker0.getCurrentPointerPositionAccumulator-F1C5BW0$ui_release(), Offset.minus-MK-Hz9U(historicalChange1.getPosition-F1C5BW0(), v2)));
            velocityTracker0.addPosition-Uv8p0NA(historicalChange1.getUptimeMillis(), velocityTracker0.getCurrentPointerPositionAccumulator-F1C5BW0$ui_release());
            ++v;
            v2 = historicalChange1.getPosition-F1C5BW0();
        }
        velocityTracker0.setCurrentPointerPositionAccumulator-k-4lQ0M$ui_release(Offset.plus-MK-Hz9U(velocityTracker0.getCurrentPointerPositionAccumulator-F1C5BW0$ui_release(), Offset.minus-MK-Hz9U(pointerInputChange0.getPosition-F1C5BW0(), v2)));
        velocityTracker0.addPosition-Uv8p0NA(pointerInputChange0.getUptimeMillis(), velocityTracker0.getCurrentPointerPositionAccumulator-F1C5BW0$ui_release());
    }

    @ExperimentalComposeUiApi
    public static final boolean getVelocityTrackerAddPointsFix() {
        return VelocityTrackerKt.a;
    }

    @ExperimentalComposeUiApi
    public static void getVelocityTrackerAddPointsFix$annotations() {
    }

    @ExperimentalComposeUiApi
    public static final boolean getVelocityTrackerStrategyUseImpulse() [...] // 潜在的解密器

    @ExperimentalComposeUiApi
    public static void getVelocityTrackerStrategyUseImpulse$annotations() {
    }

    @NotNull
    public static final float[] polyFitLeastSquares(@NotNull float[] arr_f, @NotNull float[] arr_f1, int v, int v1, @NotNull float[] arr_f2) {
        if(v1 < 1) {
            InlineClassHelperKt.throwIllegalArgumentException("The degree must be at positive integer");
        }
        if(v == 0) {
            InlineClassHelperKt.throwIllegalArgumentException("At least one point must be provided");
        }
        if(v1 >= v) {
            v1 = v - 1;
        }
        float[][] arr2_f = new float[v1 + 1][];
        for(int v2 = 0; v2 < v1 + 1; ++v2) {
            arr2_f[v2] = new float[v];
        }
        for(int v3 = 0; v3 < v; ++v3) {
            arr2_f[0][v3] = 1.0f;
            for(int v4 = 1; v4 < v1 + 1; ++v4) {
                arr2_f[v4][v3] = arr2_f[v4 - 1][v3] * arr_f[v3];
            }
        }
        float[][] arr2_f1 = new float[v1 + 1][];
        for(int v5 = 0; v5 < v1 + 1; ++v5) {
            arr2_f1[v5] = new float[v];
        }
        float[][] arr2_f2 = new float[v1 + 1][];
        for(int v6 = 0; v6 < v1 + 1; ++v6) {
            arr2_f2[v6] = new float[v1 + 1];
        }
        for(int v7 = 0; v7 < v1 + 1; ++v7) {
            float[] arr_f3 = arr2_f1[v7];
            ArraysKt___ArraysJvmKt.copyInto(arr2_f[v7], arr_f3, 0, 0, v);
            for(int v8 = 0; v8 < v7; ++v8) {
                float[] arr_f4 = arr2_f1[v8];
                float f = VelocityTrackerKt.a(arr_f3, arr_f4);
                for(int v9 = 0; v9 < v; ++v9) {
                    arr_f3[v9] -= arr_f4[v9] * f;
                }
            }
            float f1 = (float)Math.sqrt(VelocityTrackerKt.a(arr_f3, arr_f3));
            if(f1 < 0.000001f) {
                f1 = 0.000001f;
            }
            float f2 = 1.0f / f1;
            for(int v10 = 0; v10 < v; ++v10) {
                arr_f3[v10] *= f2;
            }
            float[] arr_f5 = arr2_f2[v7];
            for(int v11 = 0; v11 < v1 + 1; ++v11) {
                arr_f5[v11] = v11 >= v7 ? VelocityTrackerKt.a(arr_f3, arr2_f[v11]) : 0.0f;
            }
        }
        for(int v12 = v1; -1 < v12; --v12) {
            float f3 = VelocityTrackerKt.a(arr2_f1[v12], arr_f1);
            float[] arr_f6 = arr2_f2[v12];
            int v13 = v12 + 1;
            if(v13 <= v1) {
                for(int v14 = v1; true; --v14) {
                    f3 -= arr_f6[v14] * arr_f2[v14];
                    if(v14 == v13) {
                        break;
                    }
                }
            }
            arr_f2[v12] = f3 / arr_f6[v12];
        }
        return arr_f2;
    }

    public static float[] polyFitLeastSquares$default(float[] arr_f, float[] arr_f1, int v, int v1, float[] arr_f2, int v2, Object object0) {
        if((v2 & 16) != 0) {
            arr_f2 = new float[c.coerceAtLeast(v1 + 1, 0)];
        }
        return VelocityTrackerKt.polyFitLeastSquares(arr_f, arr_f1, v, v1, arr_f2);
    }

    @ExperimentalComposeUiApi
    public static final void setVelocityTrackerAddPointsFix(boolean z) {
        VelocityTrackerKt.a = z;
    }

    @ExperimentalComposeUiApi
    public static final void setVelocityTrackerStrategyUseImpulse(boolean z) {
        VelocityTrackerKt.b = z;
    }
}

