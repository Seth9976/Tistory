package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bà\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "", "adjust", "Landroidx/compose/foundation/text/selection/Selection;", "layout", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface SelectionAdjustment {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001A\u0004\b\t\u0010\u0006R\u0017\u0010\r\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000B\u0010\u0004\u001A\u0004\b\f\u0010\u0006R\u0017\u0010\u0010\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000E\u0010\u0004\u001A\u0004\b\u000F\u0010\u0006R\u0017\u0010\u0013\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001A\u0004\b\u0012\u0010\u0006¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionAdjustment$Companion;", "", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "b", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "getNone", "()Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "None", "c", "getCharacter", "Character", "d", "getWord", "Word", "e", "getParagraph", "Paragraph", "f", "getCharacterWithWordAccelerate", "CharacterWithWordAccelerate", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public static final Companion a;
        public static final n b;
        public static final n c;
        public static final n d;
        public static final n e;
        public static final n f;

        static {
            Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
            Companion.b = new n(0);
            Companion.c = new n(1);
            Companion.d = new n(2);
            Companion.e = new n(3);
            Companion.f = new n(4);
        }

        @NotNull
        public final SelectionAdjustment getCharacter() {
            return Companion.c;
        }

        @NotNull
        public final SelectionAdjustment getCharacterWithWordAccelerate() {
            return Companion.f;
        }

        @NotNull
        public final SelectionAdjustment getNone() {
            return Companion.b;
        }

        @NotNull
        public final SelectionAdjustment getParagraph() {
            return Companion.e;
        }

        @NotNull
        public final SelectionAdjustment getWord() {
            return Companion.d;
        }
    }

    @NotNull
    public static final Companion Companion;

    static {
        SelectionAdjustment.Companion = Companion.a;
    }

    @NotNull
    Selection adjust(@NotNull SelectionLayout arg1);
}

