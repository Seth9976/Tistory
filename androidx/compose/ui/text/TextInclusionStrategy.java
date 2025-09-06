package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0018\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/TextInclusionStrategy;", "", "isIncluded", "", "textBounds", "Landroidx/compose/ui/geometry/Rect;", "rect", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface TextInclusionStrategy {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001A\u0004\b\t\u0010\u0006R\u0017\u0010\r\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000B\u0010\u0004\u001A\u0004\b\f\u0010\u0006¨\u0006\u000E"}, d2 = {"Landroidx/compose/ui/text/TextInclusionStrategy$Companion;", "", "Landroidx/compose/ui/text/TextInclusionStrategy;", "b", "Landroidx/compose/ui/text/TextInclusionStrategy;", "getAnyOverlap", "()Landroidx/compose/ui/text/TextInclusionStrategy;", "AnyOverlap", "c", "getContainsAll", "ContainsAll", "d", "getContainsCenter", "ContainsCenter", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public static final Companion a;
        public static final n0 b;
        public static final n0 c;
        public static final n0 d;

        static {
            Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
            Companion.b = new n0(0);
            Companion.c = new n0(1);
            Companion.d = new n0(2);
        }

        @NotNull
        public final TextInclusionStrategy getAnyOverlap() {
            return Companion.b;
        }

        @NotNull
        public final TextInclusionStrategy getContainsAll() {
            return Companion.c;
        }

        @NotNull
        public final TextInclusionStrategy getContainsCenter() {
            return Companion.d;
        }
    }

    @NotNull
    public static final Companion Companion;

    static {
        TextInclusionStrategy.Companion = Companion.a;
    }

    boolean isIncluded(@NotNull Rect arg1, @NotNull Rect arg2);
}

