package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001R\u001A\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001A\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\t\u0010\nR\u0016\u0010\u000B\u001A\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000EÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/InspectableValue;", "", "inspectableElements", "Lkotlin/sequences/Sequence;", "Landroidx/compose/ui/platform/ValueElement;", "getInspectableElements", "()Lkotlin/sequences/Sequence;", "nameFallback", "", "getNameFallback", "()Ljava/lang/String;", "valueOverride", "getValueOverride", "()Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface InspectableValue {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @Deprecated
        @NotNull
        public static Sequence getInspectableElements(@NotNull InspectableValue inspectableValue0) {
            return inspectableValue0.super.getInspectableElements();
        }

        @Deprecated
        @Nullable
        public static String getNameFallback(@NotNull InspectableValue inspectableValue0) {
            return inspectableValue0.super.getNameFallback();
        }

        @Deprecated
        @Nullable
        public static Object getValueOverride(@NotNull InspectableValue inspectableValue0) {
            return inspectableValue0.super.getValueOverride();
        }
    }

    @NotNull
    default Sequence getInspectableElements() {
        return SequencesKt__SequencesKt.emptySequence();
    }

    @Nullable
    default String getNameFallback() {
        return null;
    }

    @Nullable
    default Object getValueOverride() {
        return null;
    }
}

