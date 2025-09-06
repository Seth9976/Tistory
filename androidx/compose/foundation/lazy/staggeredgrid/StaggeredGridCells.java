package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001:\u0003\b\t\nJ\u001C\u0010\u0002\u001A\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u0006H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000BÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;", "", "calculateCrossAxisCellSizes", "", "Landroidx/compose/ui/unit/Density;", "availableSize", "", "spacing", "Adaptive", "Fixed", "FixedSize", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface StaggeredGridCells {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000B\u001A\u00020\n*\u00020\u00062\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\r\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u001A\u0010\u0012\u001A\u00020\u00112\b\u0010\u0010\u001A\u0004\u0018\u00010\u000FH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells$Adaptive;", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;", "Landroidx/compose/ui/unit/Dp;", "minSize", "<init>", "(FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/unit/Density;", "", "availableSize", "spacing", "", "calculateCrossAxisCellSizes", "(Landroidx/compose/ui/unit/Density;II)[I", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nLazyStaggeredGridCells.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridCells.kt\nandroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells$Adaptive\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,158:1\n148#2:159\n1#3:160\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridCells.kt\nandroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells$Adaptive\n*L\n87#1:159\n*E\n"})
    public static final class Adaptive implements StaggeredGridCells {
        public static final int $stable;
        public final float a;

        public Adaptive(float f, DefaultConstructorMarker defaultConstructorMarker0) {
            this.a = f;
            if(Dp.compareTo-0680j_4(f, 0.0f) <= 0) {
                throw new IllegalArgumentException("invalid minSize");
            }
        }

        @Override  // androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
        @NotNull
        public int[] calculateCrossAxisCellSizes(@NotNull Density density0, int v, int v1) {
            return LazyStaggeredGridCellsKt.access$calculateCellsCrossAxisSizeImpl(v, Math.max((v + v1) / (density0.roundToPx-0680j_4(this.a) + v1), 1), v1);
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return object0 instanceof Adaptive && Dp.equals-impl0(this.a, ((Adaptive)object0).a);
        }

        @Override
        public int hashCode() {
            return Dp.hashCode-impl(this.a);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001A\u00020\t*\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\f\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001A\u0010\u0011\u001A\u00020\u00102\b\u0010\u000F\u001A\u0004\u0018\u00010\u000EH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells$Fixed;", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;", "", "count", "<init>", "(I)V", "Landroidx/compose/ui/unit/Density;", "availableSize", "spacing", "", "calculateCrossAxisCellSizes", "(Landroidx/compose/ui/unit/Density;II)[I", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nLazyStaggeredGridCells.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridCells.kt\nandroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells$Fixed\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,158:1\n1#2:159\n*E\n"})
    public static final class Fixed implements StaggeredGridCells {
        public static final int $stable;
        public final int a;

        public Fixed(int v) {
            this.a = v;
            if(v <= 0) {
                throw new IllegalArgumentException("grid with no rows/columns");
            }
        }

        @Override  // androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
        @NotNull
        public int[] calculateCrossAxisCellSizes(@NotNull Density density0, int v, int v1) {
            return LazyStaggeredGridCellsKt.access$calculateCellsCrossAxisSizeImpl(v, this.a, v1);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            return object0 instanceof Fixed && this.a == ((Fixed)object0).a;
        }

        @Override
        public int hashCode() {
            return -this.a;
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000B\u001A\u00020\n*\u00020\u00062\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\r\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u001A\u0010\u0012\u001A\u00020\u00112\b\u0010\u0010\u001A\u0004\u0018\u00010\u000FH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells$FixedSize;", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;", "Landroidx/compose/ui/unit/Dp;", "size", "<init>", "(FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/unit/Density;", "", "availableSize", "spacing", "", "calculateCrossAxisCellSizes", "(Landroidx/compose/ui/unit/Density;II)[I", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class FixedSize implements StaggeredGridCells {
        public static final int $stable;
        public final float a;

        public FixedSize(float f, DefaultConstructorMarker defaultConstructorMarker0) {
            this.a = f;
        }

        @Override  // androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
        @NotNull
        public int[] calculateCrossAxisCellSizes(@NotNull Density density0, int v, int v1) {
            int v2 = density0.roundToPx-0680j_4(this.a);
            int v3 = v2 + v1;
            int v4 = v1 + v;
            if(v3 < v4) {
                int v5 = v4 / v3;
                int[] arr_v = new int[v5];
                for(int v6 = 0; v6 < v5; ++v6) {
                    arr_v[v6] = v2;
                }
                return arr_v;
            }
            return new int[]{v};
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return object0 instanceof FixedSize && Dp.equals-impl0(this.a, ((FixedSize)object0).a);
        }

        @Override
        public int hashCode() {
            return Dp.hashCode-impl(this.a);
        }
    }

    @NotNull
    int[] calculateCrossAxisCellSizes(@NotNull Density arg1, int arg2, int arg3);
}

