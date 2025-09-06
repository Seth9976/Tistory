package androidx.core.graphics;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;
import r0.a;

public final class PathSegment {
    public final PointF a;
    public final float b;
    public final PointF c;
    public final float d;

    public PathSegment(@NonNull PointF pointF0, float f, @NonNull PointF pointF1, float f1) {
        this.a = (PointF)Preconditions.checkNotNull(pointF0, "start == null");
        this.b = f;
        this.c = (PointF)Preconditions.checkNotNull(pointF1, "end == null");
        this.d = f1;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof PathSegment ? Float.compare(this.b, ((PathSegment)object0).b) == 0 && Float.compare(this.d, ((PathSegment)object0).d) == 0 && this.a.equals(((PathSegment)object0).a) && this.c.equals(((PathSegment)object0).c) : false;
    }

    @NonNull
    public PointF getEnd() {
        return this.c;
    }

    public float getEndFraction() {
        return this.d;
    }

    @NonNull
    public PointF getStart() {
        return this.a;
    }

    public float getStartFraction() {
        return this.b;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        int v1 = 0;
        int v2 = Float.compare(this.b, 0.0f) == 0 ? 0 : Float.floatToIntBits(this.b);
        int v3 = this.c.hashCode();
        float f = this.d;
        if(f != 0.0f) {
            v1 = Float.floatToIntBits(f);
        }
        return (v3 + (v * 0x1F + v2) * 0x1F) * 0x1F + v1;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("PathSegment{start=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", startFraction=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", end=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", endFraction=");
        return a.n(stringBuilder0, this.d, '}');
    }
}

