package androidx.compose.ui.platform;

import androidx.compose.ui.unit.DpKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001A\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\n\u0010\u000BR\u0014\u0010\f\u001A\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\r\u0010\u000BR\u0012\u0010\u000E\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u000F\u0010\u0005R\u0014\u0010\u0010\u001A\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0011\u0010\u000BR\u001A\u0010\u0012\u001A\u00020\u00138VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0014\u0010\u0005R\u0012\u0010\u0015\u001A\u00020\tX¦\u0004¢\u0006\u0006\u001A\u0004\b\u0016\u0010\u000Bø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001E0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/ViewConfiguration;", "", "doubleTapMinTimeMillis", "", "getDoubleTapMinTimeMillis", "()J", "doubleTapTimeoutMillis", "getDoubleTapTimeoutMillis", "handwritingGestureLineMargin", "", "getHandwritingGestureLineMargin", "()F", "handwritingSlop", "getHandwritingSlop", "longPressTimeoutMillis", "getLongPressTimeoutMillis", "maximumFlingVelocity", "getMaximumFlingVelocity", "minimumTouchTargetSize", "Landroidx/compose/ui/unit/DpSize;", "getMinimumTouchTargetSize-MYxV2XQ", "touchSlop", "getTouchSlop", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nViewConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewConfiguration.kt\nandroidx/compose/ui/platform/ViewConfiguration\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,76:1\n148#2:77\n*S KotlinDebug\n*F\n+ 1 ViewConfiguration.kt\nandroidx/compose/ui/platform/ViewConfiguration\n*L\n62#1:77\n*E\n"})
public interface ViewConfiguration {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @Deprecated
        public static float getHandwritingGestureLineMargin(@NotNull ViewConfiguration viewConfiguration0) {
            return viewConfiguration0.super.getHandwritingGestureLineMargin();
        }

        @Deprecated
        public static float getHandwritingSlop(@NotNull ViewConfiguration viewConfiguration0) {
            return viewConfiguration0.super.getHandwritingSlop();
        }

        @Deprecated
        public static float getMaximumFlingVelocity(@NotNull ViewConfiguration viewConfiguration0) {
            return viewConfiguration0.super.getMaximumFlingVelocity();
        }

        @Deprecated
        public static long getMinimumTouchTargetSize-MYxV2XQ(@NotNull ViewConfiguration viewConfiguration0) {
            return viewConfiguration0.super.getMinimumTouchTargetSize-MYxV2XQ();
        }
    }

    long getDoubleTapMinTimeMillis();

    long getDoubleTapTimeoutMillis();

    default float getHandwritingGestureLineMargin() {
        return 16.0f;
    }

    default float getHandwritingSlop() {
        return 2.0f;
    }

    long getLongPressTimeoutMillis();

    default float getMaximumFlingVelocity() {
        return 3.402823E+38f;
    }

    default long getMinimumTouchTargetSize-MYxV2XQ() {
        return DpKt.DpSize-YgX7TsA(48.0f, 48.0f);
    }

    float getTouchSlop();
}

