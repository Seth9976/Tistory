package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Deprecated(message = "Use PlatformTextInputModifierNode instead.")
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000E\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001A\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000E\u001A\u00020\r2\u0006\u0010\f\u001A\u00020\u000B¢\u0006\u0004\b\u000E\u0010\u000FJI\u0010\u001B\u001A\u00020\r2\u0006\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0015\u001A\u00020\u00142\u0012\u0010\u0018\u001A\u000E\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\b0\u00162\u0006\u0010\u0019\u001A\u00020\u000B2\u0006\u0010\u001A\u001A\u00020\u000B¢\u0006\u0004\b\u001B\u0010\u001CJ\u001F\u0010\u001F\u001A\u00020\r2\b\u0010\u001D\u001A\u0004\u0018\u00010\u00102\u0006\u0010\u001E\u001A\u00020\u0010¢\u0006\u0004\b\u001F\u0010 J\r\u0010!\u001A\u00020\r¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001A\u00020\r¢\u0006\u0004\b#\u0010\"R\u0011\u0010$\u001A\u00020\r8F¢\u0006\u0006\u001A\u0004\b$\u0010\"¨\u0006%"}, d2 = {"Landroidx/compose/ui/text/input/TextInputSession;", "", "Landroidx/compose/ui/text/input/TextInputService;", "textInputService", "Landroidx/compose/ui/text/input/PlatformTextInputService;", "platformTextInputService", "<init>", "(Landroidx/compose/ui/text/input/TextInputService;Landroidx/compose/ui/text/input/PlatformTextInputService;)V", "", "dispose", "()V", "Landroidx/compose/ui/geometry/Rect;", "rect", "", "notifyFocusedRect", "(Landroidx/compose/ui/geometry/Rect;)Z", "Landroidx/compose/ui/text/input/TextFieldValue;", "textFieldValue", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Matrix;", "textFieldToRootTransform", "innerTextFieldBounds", "decorationBoxBounds", "updateTextLayoutResult", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/ui/text/TextLayoutResult;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;)Z", "oldValue", "newValue", "updateState", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/TextFieldValue;)Z", "showSoftwareKeyboard", "()Z", "hideSoftwareKeyboard", "isOpen", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextInputService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextInputService.kt\nandroidx/compose/ui/text/input/TextInputSession\n*L\n1#1,375:1\n180#1,5:376\n180#1,5:381\n180#1,5:386\n180#1,5:391\n180#1,5:396\n*S KotlinDebug\n*F\n+ 1 TextInputService.kt\nandroidx/compose/ui/text/input/TextInputSession\n*L\n199#1:376,5\n223#1:381,5\n252#1:386,5\n272#1:391,5\n289#1:396,5\n*E\n"})
public final class TextInputSession {
    public static final int $stable = 8;
    public final TextInputService a;
    public final PlatformTextInputService b;

    public TextInputSession(@NotNull TextInputService textInputService0, @NotNull PlatformTextInputService platformTextInputService0) {
        this.a = textInputService0;
        this.b = platformTextInputService0;
    }

    public final void dispose() {
        this.a.stopInput(this);
    }

    public final boolean hideSoftwareKeyboard() {
        boolean z = this.isOpen();
        if(z) {
            this.b.hideSoftwareKeyboard();
        }
        return z;
    }

    public final boolean isOpen() {
        return Intrinsics.areEqual(this.a.getCurrentInputSession$ui_text_release(), this);
    }

    public final boolean notifyFocusedRect(@NotNull Rect rect0) {
        boolean z = this.isOpen();
        if(z) {
            this.b.notifyFocusedRect(rect0);
        }
        return z;
    }

    public final boolean showSoftwareKeyboard() {
        boolean z = this.isOpen();
        if(z) {
            this.b.showSoftwareKeyboard();
        }
        return z;
    }

    public final boolean updateState(@Nullable TextFieldValue textFieldValue0, @NotNull TextFieldValue textFieldValue1) {
        boolean z = this.isOpen();
        if(z) {
            this.b.updateState(textFieldValue0, textFieldValue1);
        }
        return z;
    }

    public final boolean updateTextLayoutResult(@NotNull TextFieldValue textFieldValue0, @NotNull OffsetMapping offsetMapping0, @NotNull TextLayoutResult textLayoutResult0, @NotNull Function1 function10, @NotNull Rect rect0, @NotNull Rect rect1) {
        boolean z = this.isOpen();
        if(z) {
            this.b.updateTextLayoutResult(textFieldValue0, offsetMapping0, textLayoutResult0, function10, rect0, rect1);
        }
        return z;
    }
}

