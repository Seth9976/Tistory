package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Rect;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u000B\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0017\u001A\u00020\u00182\u0006\u0010\u0019\u001A\u00020\u0010H\u00A6\u0002J\u001A\u0010\u001A\u001A\u00020\u001B2\u0006\u0010\u001C\u001A\u00020\u00002\b\b\u0002\u0010\u001D\u001A\u00020\u0003H&J\"\u0010\u001E\u001A\u00020\u001F2\u0006\u0010\u001C\u001A\u00020\u00002\u0006\u0010 \u001A\u00020\u001FH&\u00F8\u0001\u0000\u00A2\u0006\u0004\b!\u0010\"J.\u0010\u001E\u001A\u00020\u001F2\u0006\u0010\u001C\u001A\u00020\u00002\b\b\u0002\u0010 \u001A\u00020\u001F2\b\b\u0002\u0010#\u001A\u00020\u0003H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b$\u0010%J\u001A\u0010&\u001A\u00020\u001F2\u0006\u0010\'\u001A\u00020\u001FH&\u00F8\u0001\u0000\u00A2\u0006\u0004\b(\u0010)J\u001A\u0010*\u001A\u00020\u001F2\u0006\u0010\'\u001A\u00020\u001FH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b+\u0010)J\u001A\u0010,\u001A\u00020\u001F2\u0006\u0010\'\u001A\u00020\u001FH&\u00F8\u0001\u0000\u00A2\u0006\u0004\b-\u0010)J\u001A\u0010.\u001A\u00020\u001F2\u0006\u0010/\u001A\u00020\u001FH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b0\u0010)J\"\u00101\u001A\u0002022\u0006\u0010\u001C\u001A\u00020\u00002\u0006\u00103\u001A\u000204H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b5\u00106J\u001A\u00107\u001A\u0002022\u0006\u00103\u001A\u000204H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b8\u00109J\u001A\u0010:\u001A\u00020\u001F2\u0006\u0010;\u001A\u00020\u001FH&\u00F8\u0001\u0000\u00A2\u0006\u0004\b<\u0010)R\u001A\u0010\u0002\u001A\u00020\u00038VX\u0096\u0004\u00A2\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001A\u00020\u0003X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001A\u0004\u0018\u00010\u0000X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\n\u0010\u000BR\u0014\u0010\f\u001A\u0004\u0018\u00010\u0000X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\r\u0010\u000BR\u0018\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\u00100\u000FX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001A\u00020\u0014X\u00A6\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\b\u0015\u0010\u0016\u00F8\u0001\u0002\u0082\u0002\u0011\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\n\u0004\b!0\u0001\u00A8\u0006=\u00C0\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/LayoutCoordinates;", "", "introducesMotionFrameOfReference", "", "getIntroducesMotionFrameOfReference$annotations", "()V", "getIntroducesMotionFrameOfReference", "()Z", "isAttached", "parentCoordinates", "getParentCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "parentLayoutCoordinates", "getParentLayoutCoordinates", "providedAlignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getProvidedAlignmentLines", "()Ljava/util/Set;", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", "get", "", "alignmentLine", "localBoundingBoxOf", "Landroidx/compose/ui/geometry/Rect;", "sourceCoordinates", "clipBounds", "localPositionOf", "Landroidx/compose/ui/geometry/Offset;", "relativeToSource", "localPositionOf-R5De75A", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)J", "includeMotionFrameOfReference", "localPositionOf-S_NoaFU", "(Landroidx/compose/ui/layout/LayoutCoordinates;JZ)J", "localToRoot", "relativeToLocal", "localToRoot-MK-Hz9U", "(J)J", "localToScreen", "localToScreen-MK-Hz9U", "localToWindow", "localToWindow-MK-Hz9U", "screenToLocal", "relativeToScreen", "screenToLocal-MK-Hz9U", "transformFrom", "", "matrix", "Landroidx/compose/ui/graphics/Matrix;", "transformFrom-EL8BTi8", "(Landroidx/compose/ui/layout/LayoutCoordinates;[F)V", "transformToScreen", "transformToScreen-58bKbWc", "([F)V", "windowToLocal", "relativeToWindow", "windowToLocal-MK-Hz9U", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface LayoutCoordinates {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean getIntroducesMotionFrameOfReference(@NotNull LayoutCoordinates layoutCoordinates0) {
            return layoutCoordinates0.super.getIntroducesMotionFrameOfReference();
        }

        public static void getIntroducesMotionFrameOfReference$annotations() {
        }

        public static Rect localBoundingBoxOf$default(LayoutCoordinates layoutCoordinates0, LayoutCoordinates layoutCoordinates1, boolean z, int v, Object object0) {
            return LayoutCoordinates.localBoundingBoxOf$default(layoutCoordinates0, layoutCoordinates1, z, v, object0);
        }

        @Deprecated
        public static long localPositionOf-S_NoaFU(@NotNull LayoutCoordinates layoutCoordinates0, @NotNull LayoutCoordinates layoutCoordinates1, long v, boolean z) {
            return layoutCoordinates0.super.localPositionOf-S_NoaFU(layoutCoordinates1, v, z);
        }

        public static long localPositionOf-S_NoaFU$default(LayoutCoordinates layoutCoordinates0, LayoutCoordinates layoutCoordinates1, long v, boolean z, int v1, Object object0) {
            return LayoutCoordinates.localPositionOf-S_NoaFU$default(layoutCoordinates0, layoutCoordinates1, v, z, v1, object0);
        }

        @Deprecated
        public static long localToScreen-MK-Hz9U(@NotNull LayoutCoordinates layoutCoordinates0, long v) {
            return layoutCoordinates0.super.localToScreen-MK-Hz9U(v);
        }

        @Deprecated
        public static long screenToLocal-MK-Hz9U(@NotNull LayoutCoordinates layoutCoordinates0, long v) {
            return layoutCoordinates0.super.screenToLocal-MK-Hz9U(v);
        }

        @Deprecated
        public static void transformFrom-EL8BTi8(@NotNull LayoutCoordinates layoutCoordinates0, @NotNull LayoutCoordinates layoutCoordinates1, @NotNull float[] arr_f) {
            layoutCoordinates0.super.transformFrom-EL8BTi8(layoutCoordinates1, arr_f);
        }

        @Deprecated
        public static void transformToScreen-58bKbWc(@NotNull LayoutCoordinates layoutCoordinates0, @NotNull float[] arr_f) {
            layoutCoordinates0.super.transformToScreen-58bKbWc(arr_f);
        }
    }

    int get(@NotNull AlignmentLine arg1);

    default boolean getIntroducesMotionFrameOfReference() {
        return false;
    }

    @Nullable
    LayoutCoordinates getParentCoordinates();

    @Nullable
    LayoutCoordinates getParentLayoutCoordinates();

    @NotNull
    Set getProvidedAlignmentLines();

    long getSize-YbymL2g();

    boolean isAttached();

    @NotNull
    Rect localBoundingBoxOf(@NotNull LayoutCoordinates arg1, boolean arg2);

    static Rect localBoundingBoxOf$default(LayoutCoordinates layoutCoordinates0, LayoutCoordinates layoutCoordinates1, boolean z, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localBoundingBoxOf");
        }
        if((v & 2) != 0) {
            z = true;
        }
        return layoutCoordinates0.localBoundingBoxOf(layoutCoordinates1, z);
    }

    long localPositionOf-R5De75A(@NotNull LayoutCoordinates arg1, long arg2);

    default long localPositionOf-S_NoaFU(@NotNull LayoutCoordinates layoutCoordinates0, long v, boolean z) {
        throw new UnsupportedOperationException("localPositionOf is not implemented on this LayoutCoordinates");
    }

    static long localPositionOf-S_NoaFU$default(LayoutCoordinates layoutCoordinates0, LayoutCoordinates layoutCoordinates1, long v, boolean z, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localPositionOf-S_NoaFU");
        }
        if((v1 & 2) != 0) {
            v = 0L;
        }
        if((v1 & 4) != 0) {
            z = true;
        }
        return layoutCoordinates0.localPositionOf-S_NoaFU(layoutCoordinates1, v, z);
    }

    long localToRoot-MK-Hz9U(long arg1);

    // 去混淆评级： 低(20)
    default long localToScreen-MK-Hz9U(long v) {
        return 0x7FC000007FC00000L;
    }

    long localToWindow-MK-Hz9U(long arg1);

    // 去混淆评级： 低(20)
    default long screenToLocal-MK-Hz9U(long v) {
        return 0x7FC000007FC00000L;
    }

    default void transformFrom-EL8BTi8(@NotNull LayoutCoordinates layoutCoordinates0, @NotNull float[] arr_f) {
        throw new UnsupportedOperationException("transformFrom is not implemented on this LayoutCoordinates");
    }

    default void transformToScreen-58bKbWc(@NotNull float[] arr_f) {
        throw new UnsupportedOperationException("transformToScreen is not implemented on this LayoutCoordinates");
    }

    long windowToLocal-MK-Hz9U(long arg1);
}

