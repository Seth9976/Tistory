package androidx.compose.foundation.gestures;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/gestures/DragEvent;", "", "DragCancelled", "DragDelta", "DragStarted", "DragStopped", "Landroidx/compose/foundation/gestures/DragEvent$DragCancelled;", "Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "Landroidx/compose/foundation/gestures/DragEvent$DragStarted;", "Landroidx/compose/foundation/gestures/DragEvent$DragStopped;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class DragEvent {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/DragEvent$DragCancelled;", "Landroidx/compose/foundation/gestures/DragEvent;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class DragCancelled extends DragEvent {
        public static final int $stable;
        @NotNull
        public static final DragCancelled INSTANCE;

        static {
            DragCancelled.INSTANCE = new DragCancelled(null);  // 初始化器: Landroidx/compose/foundation/gestures/DragEvent;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001A\u0004\b\b\u0010\t\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "Landroidx/compose/foundation/gestures/DragEvent;", "Landroidx/compose/ui/geometry/Offset;", "delta", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "J", "getDelta-F1C5BW0", "()J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class DragDelta extends DragEvent {
        public static final int $stable;
        public final long a;

        public DragDelta(long v, DefaultConstructorMarker defaultConstructorMarker0) {
            super(null);
            this.a = v;
        }

        public final long getDelta-F1C5BW0() {
            return this.a;
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001A\u0004\b\b\u0010\t\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/gestures/DragEvent$DragStarted;", "Landroidx/compose/foundation/gestures/DragEvent;", "Landroidx/compose/ui/geometry/Offset;", "startPoint", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "J", "getStartPoint-F1C5BW0", "()J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class DragStarted extends DragEvent {
        public static final int $stable;
        public final long a;

        public DragStarted(long v, DefaultConstructorMarker defaultConstructorMarker0) {
            super(null);
            this.a = v;
        }

        public final long getStartPoint-F1C5BW0() {
            return this.a;
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001A\u0004\b\b\u0010\t\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/gestures/DragEvent$DragStopped;", "Landroidx/compose/foundation/gestures/DragEvent;", "Landroidx/compose/ui/unit/Velocity;", "velocity", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "J", "getVelocity-9UxMQ8M", "()J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class DragStopped extends DragEvent {
        public static final int $stable;
        public final long a;

        public DragStopped(long v, DefaultConstructorMarker defaultConstructorMarker0) {
            super(null);
            this.a = v;
        }

        public final long getVelocity-9UxMQ8M() {
            return this.a;
        }
    }

    public static final int $stable;

    public DragEvent(DefaultConstructorMarker defaultConstructorMarker0) {
    }
}

