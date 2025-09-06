package androidx.compose.material3.carousel;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u001B\b\u0000\u0018\u0000 \u001E2\u00020\u0001:\u0001\u001EB?\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0004\u0012\u0006\u0010\b\u001A\u00020\u0002\u0012\u0006\u0010\t\u001A\u00020\u0004\u0012\u0006\u0010\n\u001A\u00020\u0002¢\u0006\u0004\b\u000B\u0010\fJ\r\u0010\r\u001A\u00020\u0002¢\u0006\u0004\b\r\u0010\u000ER\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u000ER\u0017\u0010\u0007\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u001A\u0004\b\u0017\u0010\u0012R\u0017\u0010\b\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001A\u0004\b\u0019\u0010\u000ER\u0017\u0010\t\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u0010\u001A\u0004\b\u001B\u0010\u0012R\u0017\u0010\n\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u0014\u001A\u0004\b\u001D\u0010\u000E¨\u0006\u001F"}, d2 = {"Landroidx/compose/material3/carousel/Arrangement;", "", "", "priority", "", "smallSize", "smallCount", "mediumSize", "mediumCount", "largeSize", "largeCount", "<init>", "(IFIFIFI)V", "itemCount", "()I", "b", "F", "getSmallSize", "()F", "c", "I", "getSmallCount", "d", "getMediumSize", "e", "getMediumCount", "f", "getLargeSize", "g", "getLargeCount", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Arrangement {
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001J_\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00022\u0006\u0010\u0006\u001A\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u00022\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\u00022\u0006\u0010\u000B\u001A\u00020\b2\u0006\u0010\f\u001A\u00020\u00022\u0006\u0010\r\u001A\u00020\b¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0011\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/material3/carousel/Arrangement$Companion;", "", "", "availableSpace", "itemSpacing", "targetSmallSize", "minSmallSize", "maxSmallSize", "", "smallCounts", "targetMediumSize", "mediumCounts", "targetLargeSize", "largeCounts", "Landroidx/compose/material3/carousel/Arrangement;", "findLowestCostArrangement", "(FFFFF[IF[IF[I)Landroidx/compose/material3/carousel/Arrangement;", "MediumItemFlexPercentage", "F", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @Nullable
        public final Arrangement findLowestCostArrangement(float f, float f1, float f2, float f3, float f4, @NotNull int[] arr_v, float f5, @NotNull int[] arr_v1, float f6, @NotNull int[] arr_v2) {
            int v9;
            int v8;
            Arrangement arrangement0 = null;
            int v = 1;
            for(int v1 = 0; v1 < arr_v2.length; ++v1) {
                int v2 = arr_v2[v1];
                for(int v3 = 0; v3 < arr_v1.length; ++v3) {
                    int v4 = arr_v1[v3];
                    int v5 = arr_v.length;
                    int v6 = 0;
                    while(v6 < v5) {
                        int v7 = arr_v[v6];
                        float f7 = f - ((float)(v2 + v4 + v7 - 1)) * f1;
                        float f8 = c.coerceIn(f2, f3, f4);
                        float f9 = (float)v7;
                        float f10 = f7 - (f8 * f9 + (f5 * ((float)v4) + f6 * ((float)v2)));
                        if(v7 <= 0 || f10 <= 0.0f) {
                            v8 = v6;
                            if(v7 > 0 && f10 < 0.0f) {
                                f8 = Math.max(f10 / f9, f3 - f8) + f8;
                            }
                        }
                        else {
                            v8 = v6;
                            f8 = Math.min(f10 / f9, f4 - f8) + f8;
                        }
                        if(v7 <= 0) {
                            f8 = 0.0f;
                        }
                        float f11 = (f7 - (f9 + ((float)v4) / 2.0f) * f8) / (((float)v4) / 2.0f + ((float)v2));
                        float f12 = (f11 + f8) / 2.0f;
                        if(v4 > 0 && f11 != f6) {
                            float f13 = (f6 - f11) * ((float)v2);
                            v9 = v5;
                            float f14 = Math.min(Math.abs(f13), 0.1f * f12 * ((float)v4));
                            if(f13 > 0.0f) {
                                f12 -= f14 / ((float)v4);
                                f11 = f14 / ((float)v2) + f11;
                            }
                            else {
                                f11 -= f14 / ((float)v2);
                                f12 = f14 / ((float)v4) + f12;
                            }
                        }
                        else {
                            v9 = v5;
                        }
                        Arrangement arrangement1 = new Arrangement(v, f8, v7, f12, v4, f11, v2);
                        if(arrangement0 == null || Arrangement.access$cost(arrangement1, f6) < Arrangement.access$cost(arrangement0, f6)) {
                            if(Arrangement.access$cost(arrangement1, f6) == 0.0f) {
                                return arrangement1;
                            }
                            arrangement0 = arrangement1;
                        }
                        ++v;
                        v6 = v8 + 1;
                        v5 = v9;
                    }
                }
            }
            return arrangement0;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final int a;
    public final float b;
    public final int c;
    public final float d;
    public final int e;
    public final float f;
    public final int g;

    static {
        Arrangement.Companion = new Companion(null);
    }

    public Arrangement(int v, float f, int v1, float f1, int v2, float f2, int v3) {
        this.a = v;
        this.b = f;
        this.c = v1;
        this.d = f1;
        this.e = v2;
        this.f = f2;
        this.g = v3;
    }

    public static final float access$cost(Arrangement arrangement0, float f) {
        float f1 = arrangement0.b;
        float f2 = arrangement0.f;
        int v = arrangement0.c;
        int v1 = arrangement0.g;
        if(v1 > 0 && v > 0 && arrangement0.e > 0) {
            return f2 <= arrangement0.d || arrangement0.d <= f1 ? 3.402823E+38f : ((float)arrangement0.a) * Math.abs(f - f2);
        }
        return v1 <= 0 || v <= 0 || f2 > f1 ? ((float)arrangement0.a) * Math.abs(f - f2) : 3.402823E+38f;
    }

    public final int getLargeCount() {
        return this.g;
    }

    public final float getLargeSize() {
        return this.f;
    }

    public final int getMediumCount() {
        return this.e;
    }

    public final float getMediumSize() {
        return this.d;
    }

    public final int getSmallCount() {
        return this.c;
    }

    public final float getSmallSize() {
        return this.b;
    }

    public final int itemCount() {
        return this.g + this.e + this.c;
    }
}

