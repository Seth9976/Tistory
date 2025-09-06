package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.OffsetKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011J*\u0010\u000B\u001A\u00020\b2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0006H&ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR \u0010\u0010\u001A\u00020\u00028\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000F\u0082\u0001\u0002\u0012\u0013\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/graphics/Brush;", "", "Landroidx/compose/ui/geometry/Size;", "size", "Landroidx/compose/ui/graphics/Paint;", "p", "", "alpha", "", "applyTo-Pq9zytI", "(JLandroidx/compose/ui/graphics/Paint;F)V", "applyTo", "c", "J", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize", "Companion", "Landroidx/compose/ui/graphics/ShaderBrush;", "Landroidx/compose/ui/graphics/SolidColor;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class Brush {
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0017\b\u0086\u0003\u0018\u00002\u00020\u0001J\\\u0010\u000F\u001A\u00020\f2*\u0010\u0006\u001A\u0016\u0012\u0012\b\u0001\u0012\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002\"\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\t\u001A\u00020\u00072\b\b\u0002\u0010\u000B\u001A\u00020\nH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\r\u0010\u000EJ>\u0010\u000F\u001A\u00020\f2\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u00050\u00102\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\t\u001A\u00020\u00072\b\b\u0002\u0010\u000B\u001A\u00020\nH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\r\u0010\u0012J>\u0010\u0017\u001A\u00020\f2\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u00050\u00102\b\b\u0002\u0010\u0013\u001A\u00020\u00042\b\b\u0002\u0010\u0014\u001A\u00020\u00042\b\b\u0002\u0010\u000B\u001A\u00020\nH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0015\u0010\u0016J\\\u0010\u0017\u001A\u00020\f2*\u0010\u0006\u001A\u0016\u0012\u0012\b\u0001\u0012\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002\"\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u0013\u001A\u00020\u00042\b\b\u0002\u0010\u0014\u001A\u00020\u00042\b\b\u0002\u0010\u000B\u001A\u00020\nH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0015\u0010\u0018J>\u0010\u001C\u001A\u00020\f2\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u00050\u00102\b\b\u0002\u0010\u0019\u001A\u00020\u00042\b\b\u0002\u0010\u001A\u001A\u00020\u00042\b\b\u0002\u0010\u000B\u001A\u00020\nH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001B\u0010\u0016J\\\u0010\u001C\u001A\u00020\f2*\u0010\u0006\u001A\u0016\u0012\u0012\b\u0001\u0012\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002\"\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u0019\u001A\u00020\u00042\b\b\u0002\u0010\u001A\u001A\u00020\u00042\b\b\u0002\u0010\u000B\u001A\u00020\nH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001B\u0010\u0018J\\\u0010!\u001A\u00020\f2*\u0010\u0006\u001A\u0016\u0012\u0012\b\u0001\u0012\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002\"\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u001D\u001A\u00020\u00072\b\b\u0002\u0010\u001E\u001A\u00020\u00042\b\b\u0002\u0010\u000B\u001A\u00020\nH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001F\u0010 J>\u0010!\u001A\u00020\f2\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u00050\u00102\b\b\u0002\u0010\u001D\u001A\u00020\u00072\b\b\u0002\u0010\u001E\u001A\u00020\u00042\b\b\u0002\u0010\u000B\u001A\u00020\nH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001F\u0010\"JH\u0010%\u001A\u00020\f2*\u0010\u0006\u001A\u0016\u0012\u0012\b\u0001\u0012\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002\"\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u001D\u001A\u00020\u0007H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b#\u0010$J*\u0010%\u001A\u00020\f2\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u00050\u00102\b\b\u0002\u0010\u001D\u001A\u00020\u0007H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b#\u0010&\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006\'"}, d2 = {"Landroidx/compose/ui/graphics/Brush$Companion;", "", "", "Lkotlin/Pair;", "", "Landroidx/compose/ui/graphics/Color;", "colorStops", "Landroidx/compose/ui/geometry/Offset;", "start", "end", "Landroidx/compose/ui/graphics/TileMode;", "tileMode", "Landroidx/compose/ui/graphics/Brush;", "linearGradient-mHitzGk", "([Lkotlin/Pair;JJI)Landroidx/compose/ui/graphics/Brush;", "linearGradient", "", "colors", "(Ljava/util/List;JJI)Landroidx/compose/ui/graphics/Brush;", "startX", "endX", "horizontalGradient-8A-3gB4", "(Ljava/util/List;FFI)Landroidx/compose/ui/graphics/Brush;", "horizontalGradient", "([Lkotlin/Pair;FFI)Landroidx/compose/ui/graphics/Brush;", "startY", "endY", "verticalGradient-8A-3gB4", "verticalGradient", "center", "radius", "radialGradient-P_Vx-Ks", "([Lkotlin/Pair;JFI)Landroidx/compose/ui/graphics/Brush;", "radialGradient", "(Ljava/util/List;JFI)Landroidx/compose/ui/graphics/Brush;", "sweepGradient-Uv8p0NA", "([Lkotlin/Pair;J)Landroidx/compose/ui/graphics/Brush;", "sweepGradient", "(Ljava/util/List;J)Landroidx/compose/ui/graphics/Brush;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nBrush.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Brush.kt\nandroidx/compose/ui/graphics/Brush$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,670:1\n1#2:671\n*E\n"})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @Stable
        @NotNull
        public final Brush horizontalGradient-8A-3gB4(@NotNull List list0, float f, float f1, int v) {
            return this.linearGradient-mHitzGk(list0, OffsetKt.Offset(f, 0.0f), OffsetKt.Offset(f1, 0.0f), v);
        }

        @Stable
        @NotNull
        public final Brush horizontalGradient-8A-3gB4(@NotNull Pair[] arr_pair, float f, float f1, int v) {
            return this.linearGradient-mHitzGk(((Pair[])Arrays.copyOf(arr_pair, arr_pair.length)), OffsetKt.Offset(f, 0.0f), OffsetKt.Offset(f1, 0.0f), v);
        }

        public static Brush horizontalGradient-8A-3gB4$default(Companion brush$Companion0, List list0, float f, float f1, int v, int v1, Object object0) {
            if((v1 & 2) != 0) {
                f = 0.0f;
            }
            if((v1 & 4) != 0) {
                f1 = Infinityf;
            }
            if((v1 & 8) != 0) {
                v = 0;
            }
            return brush$Companion0.horizontalGradient-8A-3gB4(list0, f, f1, v);
        }

        public static Brush horizontalGradient-8A-3gB4$default(Companion brush$Companion0, Pair[] arr_pair, float f, float f1, int v, int v1, Object object0) {
            if((v1 & 2) != 0) {
                f = 0.0f;
            }
            if((v1 & 4) != 0) {
                f1 = Infinityf;
            }
            if((v1 & 8) != 0) {
                v = 0;
            }
            return brush$Companion0.horizontalGradient-8A-3gB4(arr_pair, f, f1, v);
        }

        @Stable
        @NotNull
        public final Brush linearGradient-mHitzGk(@NotNull List list0, long v, long v1, int v2) {
            return new LinearGradient(list0, null, v, v1, v2, null);
        }

        @Stable
        @NotNull
        public final Brush linearGradient-mHitzGk(@NotNull Pair[] arr_pair, long v, long v1, int v2) {
            ArrayList arrayList0 = new ArrayList(arr_pair.length);
            for(int v4 = 0; v4 < arr_pair.length; ++v4) {
                arrayList0.add(Color.box-impl(((Color)arr_pair[v4].getSecond()).unbox-impl()));
            }
            ArrayList arrayList1 = new ArrayList(arr_pair.length);
            for(int v3 = 0; v3 < arr_pair.length; ++v3) {
                arrayList1.add(((Number)arr_pair[v3].getFirst()).floatValue());
            }
            return new LinearGradient(arrayList0, arrayList1, v, v1, v2, null);
        }

        public static Brush linearGradient-mHitzGk$default(Companion brush$Companion0, List list0, long v, long v1, int v2, int v3, Object object0) {
            if((v3 & 2) != 0) {
                v = 0L;
            }
            if((v3 & 4) != 0) {
                v1 = 0x7F8000007F800000L;
            }
            if((v3 & 8) != 0) {
                v2 = 0;
            }
            return brush$Companion0.linearGradient-mHitzGk(list0, v, v1, v2);
        }

        public static Brush linearGradient-mHitzGk$default(Companion brush$Companion0, Pair[] arr_pair, long v, long v1, int v2, int v3, Object object0) {
            if((v3 & 2) != 0) {
                v = 0L;
            }
            if((v3 & 4) != 0) {
                v1 = 0x7F8000007F800000L;
            }
            if((v3 & 8) != 0) {
                v2 = 0;
            }
            return brush$Companion0.linearGradient-mHitzGk(arr_pair, v, v1, v2);
        }

        @Stable
        @NotNull
        public final Brush radialGradient-P_Vx-Ks(@NotNull List list0, long v, float f, int v1) {
            return new RadialGradient(list0, null, v, f, v1, null);
        }

        @Stable
        @NotNull
        public final Brush radialGradient-P_Vx-Ks(@NotNull Pair[] arr_pair, long v, float f, int v1) {
            ArrayList arrayList0 = new ArrayList(arr_pair.length);
            for(int v3 = 0; v3 < arr_pair.length; ++v3) {
                arrayList0.add(Color.box-impl(((Color)arr_pair[v3].getSecond()).unbox-impl()));
            }
            ArrayList arrayList1 = new ArrayList(arr_pair.length);
            for(int v2 = 0; v2 < arr_pair.length; ++v2) {
                arrayList1.add(((Number)arr_pair[v2].getFirst()).floatValue());
            }
            return new RadialGradient(arrayList0, arrayList1, v, f, v1, null);
        }

        public static Brush radialGradient-P_Vx-Ks$default(Companion brush$Companion0, List list0, long v, float f, int v1, int v2, Object object0) {
            if((v2 & 2) != 0) {
                v = 0x7FC000007FC00000L;
            }
            if((v2 & 4) != 0) {
                f = Infinityf;
            }
            if((v2 & 8) != 0) {
                v1 = 0;
            }
            return brush$Companion0.radialGradient-P_Vx-Ks(list0, v, f, v1);
        }

        public static Brush radialGradient-P_Vx-Ks$default(Companion brush$Companion0, Pair[] arr_pair, long v, float f, int v1, int v2, Object object0) {
            if((v2 & 2) != 0) {
                v = 0x7FC000007FC00000L;
            }
            if((v2 & 4) != 0) {
                f = Infinityf;
            }
            if((v2 & 8) != 0) {
                v1 = 0;
            }
            return brush$Companion0.radialGradient-P_Vx-Ks(arr_pair, v, f, v1);
        }

        @Stable
        @NotNull
        public final Brush sweepGradient-Uv8p0NA(@NotNull List list0, long v) {
            return new SweepGradient(v, list0, null, null);
        }

        @Stable
        @NotNull
        public final Brush sweepGradient-Uv8p0NA(@NotNull Pair[] arr_pair, long v) {
            ArrayList arrayList0 = new ArrayList(arr_pair.length);
            for(int v2 = 0; v2 < arr_pair.length; ++v2) {
                arrayList0.add(Color.box-impl(((Color)arr_pair[v2].getSecond()).unbox-impl()));
            }
            ArrayList arrayList1 = new ArrayList(arr_pair.length);
            for(int v1 = 0; v1 < arr_pair.length; ++v1) {
                arrayList1.add(((Number)arr_pair[v1].getFirst()).floatValue());
            }
            return new SweepGradient(v, arrayList0, arrayList1, null);
        }

        public static Brush sweepGradient-Uv8p0NA$default(Companion brush$Companion0, List list0, long v, int v1, Object object0) {
            if((v1 & 2) != 0) {
                v = 0x7FC000007FC00000L;
            }
            return brush$Companion0.sweepGradient-Uv8p0NA(list0, v);
        }

        public static Brush sweepGradient-Uv8p0NA$default(Companion brush$Companion0, Pair[] arr_pair, long v, int v1, Object object0) {
            if((v1 & 2) != 0) {
                v = 0x7FC000007FC00000L;
            }
            return brush$Companion0.sweepGradient-Uv8p0NA(arr_pair, v);
        }

        @Stable
        @NotNull
        public final Brush verticalGradient-8A-3gB4(@NotNull List list0, float f, float f1, int v) {
            return this.linearGradient-mHitzGk(list0, OffsetKt.Offset(0.0f, f), OffsetKt.Offset(0.0f, f1), v);
        }

        @Stable
        @NotNull
        public final Brush verticalGradient-8A-3gB4(@NotNull Pair[] arr_pair, float f, float f1, int v) {
            return this.linearGradient-mHitzGk(((Pair[])Arrays.copyOf(arr_pair, arr_pair.length)), OffsetKt.Offset(0.0f, f), OffsetKt.Offset(0.0f, f1), v);
        }

        public static Brush verticalGradient-8A-3gB4$default(Companion brush$Companion0, List list0, float f, float f1, int v, int v1, Object object0) {
            if((v1 & 2) != 0) {
                f = 0.0f;
            }
            if((v1 & 4) != 0) {
                f1 = Infinityf;
            }
            if((v1 & 8) != 0) {
                v = 0;
            }
            return brush$Companion0.verticalGradient-8A-3gB4(list0, f, f1, v);
        }

        public static Brush verticalGradient-8A-3gB4$default(Companion brush$Companion0, Pair[] arr_pair, float f, float f1, int v, int v1, Object object0) {
            if((v1 & 2) != 0) {
                f = 0.0f;
            }
            if((v1 & 4) != 0) {
                f1 = Infinityf;
            }
            if((v1 & 8) != 0) {
                v = 0;
            }
            return brush$Companion0.verticalGradient-8A-3gB4(arr_pair, f, f1, v);
        }
    }

    @NotNull
    public static final Companion Companion;
    public final long c;

    static {
        Brush.Companion = new Companion(null);
    }

    public Brush(DefaultConstructorMarker defaultConstructorMarker0) {
        this.c = 0x7FC000007FC00000L;
    }

    public abstract void applyTo-Pq9zytI(long arg1, @NotNull Paint arg2, float arg3);

    public long getIntrinsicSize-NH-jbRc() {
        return this.c;
    }
}

