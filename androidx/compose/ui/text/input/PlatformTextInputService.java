package androidx.compose.ui.text.input;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated(message = "Use PlatformTextInputModifierNode instead.")
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001A\u00020\u0003H&J\u0010\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u0006H\u0016J\b\u0010\u0007\u001A\u00020\u0003H&J\b\u0010\b\u001A\u00020\u0003H\u0016JF\u0010\b\u001A\u00020\u00032\u0006\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\f2\u0018\u0010\r\u001A\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000F\u0012\u0004\u0012\u00020\u00030\u000E2\u0012\u0010\u0011\u001A\u000E\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u000EH&J\b\u0010\u0013\u001A\u00020\u0003H&J\u001A\u0010\u0014\u001A\u00020\u00032\b\u0010\u0015\u001A\u0004\u0018\u00010\n2\u0006\u0010\u0016\u001A\u00020\nH&JD\u0010\u0017\u001A\u00020\u00032\u0006\u0010\u0018\u001A\u00020\n2\u0006\u0010\u0019\u001A\u00020\u001A2\u0006\u0010\u001B\u001A\u00020\u001C2\u0012\u0010\u001D\u001A\u000E\u0012\u0004\u0012\u00020\u001E\u0012\u0004\u0012\u00020\u00030\u000E2\u0006\u0010\u001F\u001A\u00020\u00062\u0006\u0010 \u001A\u00020\u0006H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006!À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/input/PlatformTextInputService;", "", "hideSoftwareKeyboard", "", "notifyFocusedRect", "rect", "Landroidx/compose/ui/geometry/Rect;", "showSoftwareKeyboard", "startInput", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "imeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "onEditCommand", "Lkotlin/Function1;", "", "Landroidx/compose/ui/text/input/EditCommand;", "onImeActionPerformed", "Landroidx/compose/ui/text/input/ImeAction;", "stopInput", "updateState", "oldValue", "newValue", "updateTextLayoutResult", "textFieldValue", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "textFieldToRootTransform", "Landroidx/compose/ui/graphics/Matrix;", "innerTextFieldBounds", "decorationBoxBounds", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface PlatformTextInputService {
    void hideSoftwareKeyboard();

    default void notifyFocusedRect(@NotNull Rect rect0) {
    }

    void showSoftwareKeyboard();

    default void startInput() {
    }

    void startInput(@NotNull TextFieldValue arg1, @NotNull ImeOptions arg2, @NotNull Function1 arg3, @NotNull Function1 arg4);

    void stopInput();

    void updateState(@Nullable TextFieldValue arg1, @NotNull TextFieldValue arg2);

    default void updateTextLayoutResult(@NotNull TextFieldValue textFieldValue0, @NotNull OffsetMapping offsetMapping0, @NotNull TextLayoutResult textLayoutResult0, @NotNull Function1 function10, @NotNull Rect rect0, @NotNull Rect rect1) {
    }
}

