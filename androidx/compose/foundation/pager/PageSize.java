package androidx.compose.foundation.pager;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001:\u0002\u0007\bJ\u001C\u0010\u0002\u001A\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/pager/PageSize;", "", "calculateMainAxisPageSize", "", "Landroidx/compose/ui/unit/Density;", "availableSpace", "pageSpacing", "Fill", "Fixed", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface PageSize {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001J#\u0010\u0006\u001A\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/pager/PageSize$Fill;", "Landroidx/compose/foundation/pager/PageSize;", "Landroidx/compose/ui/unit/Density;", "", "availableSpace", "pageSpacing", "calculateMainAxisPageSize", "(Landroidx/compose/ui/unit/Density;II)I", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Fill implements PageSize {
        public static final int $stable;
        @NotNull
        public static final Fill INSTANCE;

        static {
            Fill.INSTANCE = new Fill();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        // 检测为 Lambda 实现
        @Override  // androidx.compose.foundation.pager.PageSize
        public int calculateMainAxisPageSize(@NotNull Density density0, int v, int v1) [...]
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001A\u00020\u0007*\u00020\u00062\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u001A\u0010\u000F\u001A\u00020\u000E2\b\u0010\r\u001A\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0011\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/pager/PageSize$Fixed;", "Landroidx/compose/foundation/pager/PageSize;", "Landroidx/compose/ui/unit/Dp;", "pageSize", "<init>", "(FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/unit/Density;", "", "availableSpace", "pageSpacing", "calculateMainAxisPageSize", "(Landroidx/compose/ui/unit/Density;II)I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "F", "getPageSize-D9Ej5fM", "()F", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Fixed implements PageSize {
        public static final int $stable;
        public final float a;

        public Fixed(float f, DefaultConstructorMarker defaultConstructorMarker0) {
            this.a = f;
        }

        @Override  // androidx.compose.foundation.pager.PageSize
        public int calculateMainAxisPageSize(@NotNull Density density0, int v, int v1) {
            return density0.roundToPx-0680j_4(this.a);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof Fixed ? Dp.equals-impl0(this.a, ((Fixed)object0).a) : false;
        }

        public final float getPageSize-D9Ej5fM() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return Dp.hashCode-impl(this.a);
        }
    }

    int calculateMainAxisPageSize(@NotNull Density arg1, int arg2, int arg3);
}

