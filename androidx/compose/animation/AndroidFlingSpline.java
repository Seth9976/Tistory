package androidx.compose.animation;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\fJ\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001D\u0010\n\u001A\u00020\t2\u0006\u0010\u0007\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0002¢\u0006\u0004\b\n\u0010\u000B¨\u0006\r"}, d2 = {"Landroidx/compose/animation/AndroidFlingSpline;", "", "", "time", "Landroidx/compose/animation/AndroidFlingSpline$FlingResult;", "flingPosition", "(F)Landroidx/compose/animation/AndroidFlingSpline$FlingResult;", "velocity", "friction", "", "deceleration", "(FF)D", "FlingResult", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AndroidFlingSpline {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\r\u001A\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0014\u001A\u00020\u00132\b\u0010\u0012\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\bR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001A\u0004\b\u001A\u0010\b¨\u0006\u001B"}, d2 = {"Landroidx/compose/animation/AndroidFlingSpline$FlingResult;", "", "", "distanceCoefficient", "velocityCoefficient", "<init>", "(FF)V", "component1", "()F", "component2", "copy", "(FF)Landroidx/compose/animation/AndroidFlingSpline$FlingResult;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "getDistanceCoefficient", "b", "getVelocityCoefficient", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class FlingResult {
        public static final int $stable;
        public final float a;
        public final float b;

        public FlingResult(float f, float f1) {
            this.a = f;
            this.b = f1;
        }

        public final float component1() {
            return this.a;
        }

        public final float component2() {
            return this.b;
        }

        @NotNull
        public final FlingResult copy(float f, float f1) {
            return new FlingResult(f, f1);
        }

        public static FlingResult copy$default(FlingResult androidFlingSpline$FlingResult0, float f, float f1, int v, Object object0) {
            if((v & 1) != 0) {
                f = androidFlingSpline$FlingResult0.a;
            }
            if((v & 2) != 0) {
                f1 = androidFlingSpline$FlingResult0.b;
            }
            return androidFlingSpline$FlingResult0.copy(f, f1);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof FlingResult)) {
                return false;
            }
            return Float.compare(this.a, ((FlingResult)object0).a) == 0 ? Float.compare(this.b, ((FlingResult)object0).b) == 0 : false;
        }

        public final float getDistanceCoefficient() {
            return this.a;
        }

        public final float getVelocityCoefficient() {
            return this.b;
        }

        @Override
        public int hashCode() {
            return Float.hashCode(this.b) + Float.hashCode(this.a) * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("FlingResult(distanceCoefficient=");
            stringBuilder0.append(this.a);
            stringBuilder0.append(", velocityCoefficient=");
            return a.n(stringBuilder0, this.b, ')');
        }
    }

    public static final int $stable;
    @NotNull
    public static final AndroidFlingSpline INSTANCE;
    public static final float[] a;

    static {
        AndroidFlingSpline.INSTANCE = new AndroidFlingSpline();  // 初始化器: Ljava/lang/Object;-><init>()V
        float[] arr_f = new float[101];
        AndroidFlingSpline.a = arr_f;
        SplineBasedDecayKt.access$computeSplineInfo(arr_f, new float[101], 100);
        AndroidFlingSpline.$stable = 8;
    }

    public final double deceleration(float f, float f1) {
        return Math.log(((double)(Math.abs(f) * 0.35f)) / ((double)f1));
    }

    @NotNull
    public final FlingResult flingPosition(float f) {
        int v = (int)(100.0f * f);
        if(v < 100) {
            float f1 = AndroidFlingSpline.a[v];
            float f2 = (AndroidFlingSpline.a[v + 1] - f1) / (((float)(v + 1)) / 100.0f - ((float)v) / 100.0f);
            return new FlingResult((f - ((float)v) / 100.0f) * f2 + f1, f2);
        }
        return new FlingResult(1.0f, 0.0f);
    }
}

