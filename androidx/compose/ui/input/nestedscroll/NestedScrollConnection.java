package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J#\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\b\u001A\u00020\t2\u0006\u0010\u0004\u001A\u00020\t2\u0006\u0010\u0005\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000BH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001B\u0010\u000E\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000F\u0010\u0010J\"\u0010\u0011\u001A\u00020\t2\u0006\u0010\u0005\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000BH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001E0\u0001\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreFling", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface NestedScrollConnection {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @Deprecated
        @Nullable
        public static Object onPostFling-RZ2iAVY(@NotNull NestedScrollConnection nestedScrollConnection0, long v, long v1, @NotNull Continuation continuation0) {
            return nestedScrollConnection0.super.onPostFling-RZ2iAVY(v, v1, continuation0);
        }

        @Deprecated
        public static long onPostScroll-DzOQY0M(@NotNull NestedScrollConnection nestedScrollConnection0, long v, long v1, int v2) {
            return nestedScrollConnection0.super.onPostScroll-DzOQY0M(v, v1, v2);
        }

        @Deprecated
        @Nullable
        public static Object onPreFling-QWom1Mo(@NotNull NestedScrollConnection nestedScrollConnection0, long v, @NotNull Continuation continuation0) {
            return nestedScrollConnection0.super.onPreFling-QWom1Mo(v, continuation0);
        }

        @Deprecated
        public static long onPreScroll-OzD1aCk(@NotNull NestedScrollConnection nestedScrollConnection0, long v, int v1) {
            return nestedScrollConnection0.super.onPreScroll-OzD1aCk(v, v1);
        }
    }

    @Nullable
    default Object onPostFling-RZ2iAVY(long v, long v1, @NotNull Continuation continuation0) {
        return NestedScrollConnection.onPostFling-RZ2iAVY$suspendImpl(this, v, v1, continuation0);
    }

    // 去混淆评级： 低(20)
    static Object onPostFling-RZ2iAVY$suspendImpl(NestedScrollConnection nestedScrollConnection0, long v, long v1, Continuation continuation0) {
        return Velocity.box-impl(0L);
    }

    // 去混淆评级： 低(20)
    default long onPostScroll-DzOQY0M(long v, long v1, int v2) {
        return 0L;
    }

    @Nullable
    default Object onPreFling-QWom1Mo(long v, @NotNull Continuation continuation0) {
        return NestedScrollConnection.onPreFling-QWom1Mo$suspendImpl(this, v, continuation0);
    }

    // 去混淆评级： 低(20)
    static Object onPreFling-QWom1Mo$suspendImpl(NestedScrollConnection nestedScrollConnection0, long v, Continuation continuation0) {
        return Velocity.box-impl(0L);
    }

    // 去混淆评级： 低(20)
    default long onPreScroll-OzD1aCk(long v, int v1) {
        return 0L;
    }
}

