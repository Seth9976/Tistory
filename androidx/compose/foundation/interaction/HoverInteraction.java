package androidx.compose.foundation.interaction;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/interaction/HoverInteraction;", "Landroidx/compose/foundation/interaction/Interaction;", "Enter", "Exit", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface HoverInteraction extends Interaction {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/interaction/HoverInteraction$Enter;", "Landroidx/compose/foundation/interaction/HoverInteraction;", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Enter implements HoverInteraction {
        public static final int $stable;

    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001A\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/interaction/HoverInteraction$Exit;", "Landroidx/compose/foundation/interaction/HoverInteraction;", "Landroidx/compose/foundation/interaction/HoverInteraction$Enter;", "enter", "<init>", "(Landroidx/compose/foundation/interaction/HoverInteraction$Enter;)V", "a", "Landroidx/compose/foundation/interaction/HoverInteraction$Enter;", "getEnter", "()Landroidx/compose/foundation/interaction/HoverInteraction$Enter;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Exit implements HoverInteraction {
        public static final int $stable;
        public final Enter a;

        public Exit(@NotNull Enter hoverInteraction$Enter0) {
            this.a = hoverInteraction$Enter0;
        }

        @NotNull
        public final Enter getEnter() {
            return this.a;
        }
    }

}

