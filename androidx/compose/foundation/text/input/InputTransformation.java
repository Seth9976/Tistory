package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bç\u0080\u0001\u0018\u0000 \u000B2\u00020\u0001:\u0001\u000BJ\f\u0010\u0006\u001A\u00020\u0007*\u00020\bH\u0016J\f\u0010\t\u001A\u00020\u0007*\u00020\nH&R\u0016\u0010\u0002\u001A\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/input/InputTransformation;", "", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "getKeyboardOptions", "()Landroidx/compose/foundation/text/KeyboardOptions;", "applySemantics", "", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "transformInput", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface InputTransformation {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001A\u00020\u0003*\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/text/input/InputTransformation$Companion;", "Landroidx/compose/foundation/text/input/InputTransformation;", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "", "transformInput", "(Landroidx/compose/foundation/text/input/TextFieldBuffer;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion implements InputTransformation {
        public static final Companion a;

        static {
            Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @Override  // androidx.compose.foundation.text.input.InputTransformation
        public void transformInput(@NotNull TextFieldBuffer textFieldBuffer0) {
        }
    }

    @NotNull
    public static final Companion Companion;

    static {
        InputTransformation.Companion = Companion.a;
    }

    default void applySemantics(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0) {
    }

    @Nullable
    default KeyboardOptions getKeyboardOptions() {
        return null;
    }

    void transformInput(@NotNull TextFieldBuffer arg1);
}

