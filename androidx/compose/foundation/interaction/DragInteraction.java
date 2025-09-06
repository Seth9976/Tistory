package androidx.compose.foundation.interaction;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/interaction/DragInteraction;", "Landroidx/compose/foundation/interaction/Interaction;", "Cancel", "Start", "Stop", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface DragInteraction extends Interaction {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001A\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/interaction/DragInteraction$Cancel;", "Landroidx/compose/foundation/interaction/DragInteraction;", "Landroidx/compose/foundation/interaction/DragInteraction$Start;", "start", "<init>", "(Landroidx/compose/foundation/interaction/DragInteraction$Start;)V", "a", "Landroidx/compose/foundation/interaction/DragInteraction$Start;", "getStart", "()Landroidx/compose/foundation/interaction/DragInteraction$Start;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Cancel implements DragInteraction {
        public static final int $stable;
        public final Start a;

        public Cancel(@NotNull Start dragInteraction$Start0) {
            this.a = dragInteraction$Start0;
        }

        @NotNull
        public final Start getStart() {
            return this.a;
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/interaction/DragInteraction$Start;", "Landroidx/compose/foundation/interaction/DragInteraction;", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Start implements DragInteraction {
        public static final int $stable;

    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001A\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/interaction/DragInteraction$Stop;", "Landroidx/compose/foundation/interaction/DragInteraction;", "Landroidx/compose/foundation/interaction/DragInteraction$Start;", "start", "<init>", "(Landroidx/compose/foundation/interaction/DragInteraction$Start;)V", "a", "Landroidx/compose/foundation/interaction/DragInteraction$Start;", "getStart", "()Landroidx/compose/foundation/interaction/DragInteraction$Start;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Stop implements DragInteraction {
        public static final int $stable;
        public final Start a;

        public Stop(@NotNull Start dragInteraction$Start0) {
            this.a = dragInteraction$Start0;
        }

        @NotNull
        public final Start getStart() {
            return this.a;
        }
    }

}

