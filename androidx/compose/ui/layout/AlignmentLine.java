package androidx.compose.ui.layout;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \t2\u00020\u0001:\u0001\tR,\u0010\b\u001A\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000B¨\u0006\f"}, d2 = {"Landroidx/compose/ui/layout/AlignmentLine;", "", "Lkotlin/Function2;", "", "a", "Lkotlin/jvm/functions/Function2;", "getMerger$ui_release", "()Lkotlin/jvm/functions/Function2;", "merger", "Companion", "Landroidx/compose/ui/layout/HorizontalAlignmentLine;", "Landroidx/compose/ui/layout/VerticalAlignmentLine;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class AlignmentLine {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/layout/AlignmentLine$Companion;", "", "", "Unspecified", "I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = null;
    public static final int Unspecified = 0x80000000;
    public final Function2 a;

    static {
        AlignmentLine.Companion = new Companion(null);
    }

    public AlignmentLine(Function2 function20, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = function20;
    }

    @NotNull
    public final Function2 getMerger$ui_release() {
        return this.a;
    }
}

