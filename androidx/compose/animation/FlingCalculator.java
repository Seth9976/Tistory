package androidx.compose.animation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001A\u00020\t2\u0006\u0010\b\u001A\u00020\u0002¢\u0006\u0004\b\n\u0010\u000BJ\u0015\u0010\f\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\b\u001A\u00020\u0002¢\u0006\u0004\b\u000F\u0010\u0010R\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/animation/FlingCalculator;", "", "", "friction", "Landroidx/compose/ui/unit/Density;", "density", "<init>", "(FLandroidx/compose/ui/unit/Density;)V", "velocity", "", "flingDuration", "(F)J", "flingDistance", "(F)F", "Landroidx/compose/animation/FlingCalculator$FlingInfo;", "flingInfo", "(F)Landroidx/compose/animation/FlingCalculator$FlingInfo;", "b", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "FlingInfo", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class FlingCalculator {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000E\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u000B\b\u0087\b\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001A\u00020\u00022\u0006\u0010\t\u001A\u00020\u0005¢\u0006\u0004\b\n\u0010\u000BJ\u0015\u0010\f\u001A\u00020\u00022\u0006\u0010\t\u001A\u00020\u0005¢\u0006\u0004\b\f\u0010\u000BJ\u0010\u0010\r\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000F\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J.\u0010\u0012\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001A\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001A\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001A\u0010\u001C\u001A\u00020\u001B2\b\u0010\u001A\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001C\u0010\u001DR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010\u000ER\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001F\u001A\u0004\b\"\u0010\u000ER\u0017\u0010\u0006\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b%\u0010\u0011¨\u0006&"}, d2 = {"Landroidx/compose/animation/FlingCalculator$FlingInfo;", "", "", "initialVelocity", "distance", "", "duration", "<init>", "(FFJ)V", "time", "position", "(J)F", "velocity", "component1", "()F", "component2", "component3", "()J", "copy", "(FFJ)Landroidx/compose/animation/FlingCalculator$FlingInfo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "getInitialVelocity", "b", "getDistance", "c", "J", "getDuration", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class FlingInfo {
        public static final int $stable;
        public final float a;
        public final float b;
        public final long c;

        public FlingInfo(float f, float f1, long v) {
            this.a = f;
            this.b = f1;
            this.c = v;
        }

        public final float component1() {
            return this.a;
        }

        public final float component2() {
            return this.b;
        }

        public final long component3() {
            return this.c;
        }

        @NotNull
        public final FlingInfo copy(float f, float f1, long v) {
            return new FlingInfo(f, f1, v);
        }

        public static FlingInfo copy$default(FlingInfo flingCalculator$FlingInfo0, float f, float f1, long v, int v1, Object object0) {
            if((v1 & 1) != 0) {
                f = flingCalculator$FlingInfo0.a;
            }
            if((v1 & 2) != 0) {
                f1 = flingCalculator$FlingInfo0.b;
            }
            if((v1 & 4) != 0) {
                v = flingCalculator$FlingInfo0.c;
            }
            return flingCalculator$FlingInfo0.copy(f, f1, v);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof FlingInfo)) {
                return false;
            }
            if(Float.compare(this.a, ((FlingInfo)object0).a) != 0) {
                return false;
            }
            return Float.compare(this.b, ((FlingInfo)object0).b) == 0 ? this.c == ((FlingInfo)object0).c : false;
        }

        public final float getDistance() {
            return this.b;
        }

        public final long getDuration() {
            return this.c;
        }

        public final float getInitialVelocity() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return Long.hashCode(this.c) + a.b(this.b, Float.hashCode(this.a) * 0x1F, 0x1F);
        }

        public final float position(long v) {
            return this.c <= 0L ? AndroidFlingSpline.INSTANCE.flingPosition(1.0f).getDistanceCoefficient() * (Math.signum(this.a) * this.b) : AndroidFlingSpline.INSTANCE.flingPosition(((float)v) / ((float)this.c)).getDistanceCoefficient() * (Math.signum(this.a) * this.b);
        }

        @Override
        @NotNull
        public String toString() {
            return "FlingInfo(initialVelocity=" + this.a + ", distance=" + this.b + ", duration=" + this.c + ')';
        }

        public final float velocity(long v) {
            float f = AndroidFlingSpline.INSTANCE.flingPosition((this.c <= 0L ? 1.0f : ((float)v) / ((float)this.c))).getVelocityCoefficient();
            return Math.signum(this.a) * f * this.b / ((float)this.c) * 1000.0f;
        }
    }

    public static final int $stable;
    public final float a;
    public final Density b;
    public final float c;

    public FlingCalculator(float f, @NotNull Density density0) {
        this.a = f;
        this.b = density0;
        this.c = FlingCalculatorKt.access$computeDeceleration(0.84f, density0.getDensity());
    }

    // 去混淆评级： 低(40)
    public final float flingDistance(float f) {
        return (float)(Math.exp(1.736268 * AndroidFlingSpline.INSTANCE.deceleration(f, this.a * this.c)) * ((double)(this.a * this.c)));
    }

    // 去混淆评级： 低(20)
    public final long flingDuration(float f) {
        return (long)(Math.exp(AndroidFlingSpline.INSTANCE.deceleration(f, this.a * this.c) / 1.358202) * 1000.0);
    }

    // 去混淆评级： 低(20)
    @NotNull
    public final FlingInfo flingInfo(float f) {
        double f1 = AndroidFlingSpline.INSTANCE.deceleration(f, this.a * this.c);
        return new FlingInfo(f, ((float)(Math.exp(1.736268 * f1) * ((double)(this.a * this.c)))), ((long)(Math.exp(f1 / 1.358202) * 1000.0)));
    }

    @NotNull
    public final Density getDensity() {
        return this.b;
    }
}

