package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001D\u0010\b\u001A\u00020\u00022\u0006\u0010\u0006\u001A\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ-\u0010\u000F\u001A\u00020\f2\u0006\u0010\u0006\u001A\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u00022\u0006\u0010\u000B\u001A\u00020\nH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000ER\"\u0010\u0003\u001A\u00020\u00028\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0005R*\u0010\u0019\u001A\u00020\u00022\u0006\u0010\u0015\u001A\u00020\u00028\u0006@FX\u0086\u000E¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001A\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0005R$\u0010\u001C\u001A\u00020\u00022\u0006\u0010\u0015\u001A\u00020\u00028F@FX\u0086\u000E¢\u0006\f\u001A\u0004\b\u001A\u0010\u0013\"\u0004\b\u001B\u0010\u0005\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006\u001D"}, d2 = {"Landroidx/compose/animation/core/SpringSimulation;", "", "", "finalPosition", "<init>", "(F)V", "lastDisplacement", "lastVelocity", "getAcceleration", "(FF)F", "", "timeElapsed", "Landroidx/compose/animation/core/Motion;", "updateValues-IJZedt4$animation_core_release", "(FFJ)J", "updateValues", "a", "F", "getFinalPosition", "()F", "setFinalPosition", "value", "g", "getDampingRatio", "setDampingRatio", "dampingRatio", "getStiffness", "setStiffness", "stiffness", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SpringSimulation {
    public static final int $stable = 8;
    public float a;
    public double b;
    public boolean c;
    public double d;
    public double e;
    public double f;
    public float g;

    public SpringSimulation(float f) {
        this.a = f;
        this.b = 7.071068;
        this.g = 1.0f;
    }

    public final float getAcceleration(float f, float f1) {
        return (float)(-(this.b * this.b) * ((double)(f - this.a)) - this.b * 2.0 * ((double)this.g) * ((double)f1));
    }

    public final float getDampingRatio() {
        return this.g;
    }

    public final float getFinalPosition() {
        return this.a;
    }

    public final float getStiffness() {
        return (float)(this.b * this.b);
    }

    public final void setDampingRatio(float f) {
        if(f < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.g = f;
        this.c = false;
    }

    public final void setFinalPosition(float f) {
        this.a = f;
    }

    public final void setStiffness(float f) {
        if(this.getStiffness() <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.b = Math.sqrt(f);
        this.c = false;
    }

    public final long updateValues-IJZedt4$animation_core_release(float f, float f1, long v) {
        if(!this.c) {
            if(this.a == 3.402823E+38f) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            float f2 = this.g;
            double f3 = ((double)f2) * ((double)f2);
            if(f2 > 1.0f) {
                this.d = Math.sqrt(f3 - 1.0) * this.b + ((double)(-f2)) * this.b;
                this.e = ((double)(-this.g)) * this.b - Math.sqrt(f3 - 1.0) * this.b;
            }
            else if(f2 >= 0.0f && f2 < 1.0f) {
                this.f = Math.sqrt(1.0 - f3) * this.b;
            }
            this.c = true;
        }
        float f4 = f - this.a;
        float f5 = this.g;
        if(f5 > 1.0f) {
            double f6 = this.e;
            double f7 = (f6 * ((double)f4) - ((double)f1)) / (f6 - this.d);
            double f8 = ((double)f4) - f7;
            return SpringSimulationKt.Motion(((float)(Math.exp(this.d * (((double)v) / 1000.0)) * f7 + Math.exp(f6 * (((double)v) / 1000.0)) * f8 + ((double)this.a))), ((float)(Math.exp(this.d * (((double)v) / 1000.0)) * (f7 * this.d) + Math.exp(this.e * (((double)v) / 1000.0)) * (f8 * this.e))));
        }
        if(f5 == 1.0f) {
            double f9 = this.b * ((double)f4) + ((double)f1);
            double f10 = f9 * (((double)v) / 1000.0) + ((double)f4);
            return SpringSimulationKt.Motion(((float)(Math.exp(-this.b * (((double)v) / 1000.0)) * f10 + ((double)this.a))), ((float)(Math.exp(-this.b * (((double)v) / 1000.0)) * f10 * -this.b + Math.exp(-this.b * (((double)v) / 1000.0)) * f9)));
        }
        double f11 = this.b;
        double f12 = (((double)f5) * f11 * ((double)f4) + ((double)f1)) * (1.0 / this.f);
        double f13 = Math.exp(((double)(-f5)) * f11 * (((double)v) / 1000.0)) * (Math.sin(this.f * (((double)v) / 1000.0)) * f12 + Math.cos(this.f * (((double)v) / 1000.0)) * ((double)f4));
        return SpringSimulationKt.Motion(((float)(f13 + ((double)this.a))), ((float)((Math.cos(this.f * (((double)v) / 1000.0)) * (f12 * this.f) + Math.sin(this.f * (((double)v) / 1000.0)) * (-this.f * ((double)f4))) * Math.exp(((double)(-this.g)) * this.b * (((double)v) / 1000.0)) + -this.b * f13 * ((double)this.g))));
    }
}

