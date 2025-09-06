package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.SetSelectionCommand;
import androidx.compose.ui.text.input.TextFieldValue;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0010\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B-\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001A\u00020\b¢\u0006\u0004\b\n\u0010\u000BJ0\u0010\u0011\u001A\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00102\u0019\u0010\u000F\u001A\u0015\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\r0\f¢\u0006\u0002\b\u000E¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001A\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001A\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001A\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001DR\u0011\u0010\u001F\u001A\u00020\u00028F¢\u0006\u0006\u001A\u0004\b\u001E\u0010\u0019¨\u0006 "}, d2 = {"Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;", "Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "Landroidx/compose/ui/text/input/TextFieldValue;", "currentValue", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/foundation/text/TextLayoutResultProxy;", "layoutResultProxy", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "state", "<init>", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/TextLayoutResultProxy;Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;)V", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/EditCommand;", "Lkotlin/ExtensionFunctionType;", "or", "", "deleteIfSelectedOr", "(Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "moveCursorUpByPage", "()Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;", "moveCursorDownByPage", "h", "Landroidx/compose/ui/text/input/TextFieldValue;", "getCurrentValue", "()Landroidx/compose/ui/text/input/TextFieldValue;", "i", "Landroidx/compose/foundation/text/TextLayoutResultProxy;", "getLayoutResultProxy", "()Landroidx/compose/foundation/text/TextLayoutResultProxy;", "getValue", "value", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/TextFieldPreparedSelection\n+ 2 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/BaseTextPreparedSelection\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,437:1\n74#2,5:438\n80#2:444\n74#2,7:445\n1#3:443\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/TextFieldPreparedSelection\n*L\n412#1:438,5\n412#1:444\n416#1:445,7\n*E\n"})
public final class TextFieldPreparedSelection extends BaseTextPreparedSelection {
    public static final int $stable = 8;
    public final TextFieldValue h;
    public final TextLayoutResultProxy i;

    public TextFieldPreparedSelection(@NotNull TextFieldValue textFieldValue0, @NotNull OffsetMapping offsetMapping0, @Nullable TextLayoutResultProxy textLayoutResultProxy0, @NotNull TextPreparedSelectionState textPreparedSelectionState0) {
        super(textFieldValue0.getAnnotatedString(), textFieldValue0.getSelection-d9O1mEE(), (textLayoutResultProxy0 == null ? null : textLayoutResultProxy0.getValue()), offsetMapping0, textPreparedSelectionState0, null);
        this.h = textFieldValue0;
        this.i = textLayoutResultProxy0;
    }

    public TextFieldPreparedSelection(TextFieldValue textFieldValue0, OffsetMapping offsetMapping0, TextLayoutResultProxy textLayoutResultProxy0, TextPreparedSelectionState textPreparedSelectionState0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            offsetMapping0 = OffsetMapping.Companion.getIdentity();
        }
        if((v & 8) != 0) {
            textPreparedSelectionState0 = new TextPreparedSelectionState();
        }
        this(textFieldValue0, offsetMapping0, textLayoutResultProxy0, textPreparedSelectionState0);
    }

    @Nullable
    public final List deleteIfSelectedOr(@NotNull Function1 function10) {
        if(TextRange.getCollapsed-impl(this.getSelection-d9O1mEE())) {
            EditCommand editCommand0 = (EditCommand)function10.invoke(this);
            return editCommand0 == null ? null : k.listOf(editCommand0);
        }
        return CollectionsKt__CollectionsKt.listOf(new EditCommand[]{new CommitTextCommand("", 0), new SetSelectionCommand(TextRange.getMin-impl(this.getSelection-d9O1mEE()), TextRange.getMin-impl(this.getSelection-d9O1mEE()))});
    }

    public final int g(TextLayoutResultProxy textLayoutResultProxy0, int v) {
        Rect rect0;
        LayoutCoordinates layoutCoordinates0 = textLayoutResultProxy0.getInnerTextFieldCoordinates();
        if(layoutCoordinates0 == null) {
            rect0 = Rect.Companion.getZero();
        }
        else {
            LayoutCoordinates layoutCoordinates1 = textLayoutResultProxy0.getDecorationBoxCoordinates();
            rect0 = layoutCoordinates1 == null ? null : LayoutCoordinates.localBoundingBoxOf$default(layoutCoordinates1, layoutCoordinates0, false, 2, null);
            if(rect0 == null) {
                rect0 = Rect.Companion.getZero();
            }
        }
        Rect rect1 = textLayoutResultProxy0.getValue().getCursorRect(this.getOffsetMapping().originalToTransformed(TextRange.getEnd-impl(this.h.getSelection-d9O1mEE())));
        return this.getOffsetMapping().transformedToOriginal(textLayoutResultProxy0.getValue().getOffsetForPosition-k-4lQ0M(OffsetKt.Offset(rect1.getLeft(), Size.getHeight-impl(rect0.getSize-NH-jbRc()) * ((float)v) + rect1.getTop())));
    }

    @NotNull
    public final TextFieldValue getCurrentValue() {
        return this.h;
    }

    @Nullable
    public final TextLayoutResultProxy getLayoutResultProxy() {
        return this.i;
    }

    @NotNull
    public final TextFieldValue getValue() {
        return TextFieldValue.copy-3r_uNRQ$default(this.h, this.getAnnotatedString(), this.getSelection-d9O1mEE(), null, 4, null);
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorDownByPage() {
        if(this.getText$foundation_release().length() > 0) {
            TextLayoutResultProxy textLayoutResultProxy0 = this.i;
            if(textLayoutResultProxy0 != null) {
                this.setCursor(this.g(textLayoutResultProxy0, 1));
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorUpByPage() {
        if(this.getText$foundation_release().length() > 0) {
            TextLayoutResultProxy textLayoutResultProxy0 = this.i;
            if(textLayoutResultProxy0 != null) {
                this.setCursor(this.g(textLayoutResultProxy0, -1));
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }
}

