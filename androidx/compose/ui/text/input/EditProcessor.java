package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import j0.b2;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001F\u0010\t\u001A\u00020\b2\u0006\u0010\u0005\u001A\u00020\u00042\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u001B\u0010\u000E\u001A\u00020\u00042\f\u0010\r\u001A\b\u0012\u0004\u0012\u00020\f0\u000B¢\u0006\u0004\b\u000E\u0010\u000FJ\r\u0010\u0010\u001A\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0016\u001A\u00020\u00042\u0006\u0010\u0012\u001A\u00020\u00048\u0000@BX\u0080\u000E¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0011R$\u0010\u001C\u001A\u00020\u00172\u0006\u0010\u0012\u001A\u00020\u00178\u0000@BX\u0080\u000E¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001B¨\u0006\u001D"}, d2 = {"Landroidx/compose/ui/text/input/EditProcessor;", "", "<init>", "()V", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "Landroidx/compose/ui/text/input/TextInputSession;", "textInputSession", "", "reset", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/TextInputSession;)V", "", "Landroidx/compose/ui/text/input/EditCommand;", "editCommands", "apply", "(Ljava/util/List;)Landroidx/compose/ui/text/input/TextFieldValue;", "toTextFieldValue", "()Landroidx/compose/ui/text/input/TextFieldValue;", "<set-?>", "a", "Landroidx/compose/ui/text/input/TextFieldValue;", "getMBufferState$ui_text_release", "mBufferState", "Landroidx/compose/ui/text/input/EditingBuffer;", "b", "Landroidx/compose/ui/text/input/EditingBuffer;", "getMBuffer$ui_text_release", "()Landroidx/compose/ui/text/input/EditingBuffer;", "mBuffer", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEditProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditProcessor.kt\nandroidx/compose/ui/text/input/EditProcessor\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n33#2,6:183\n1#3:189\n*S KotlinDebug\n*F\n+ 1 EditProcessor.kt\nandroidx/compose/ui/text/input/EditProcessor\n*L\n115#1:183,6\n*E\n"})
public final class EditProcessor {
    public static final int $stable = 8;
    public TextFieldValue a;
    public EditingBuffer b;

    public EditProcessor() {
        this.a = new TextFieldValue(AnnotatedStringKt.emptyAnnotatedString(), 0L, null, null);
        this.b = new EditingBuffer(this.a.getAnnotatedString(), this.a.getSelection-d9O1mEE(), null);
    }

    public static final String access$toStringForLog(EditProcessor editProcessor0, EditCommand editCommand0) {
        editProcessor0.getClass();
        if(editCommand0 instanceof CommitTextCommand) {
            return "CommitTextCommand(text.length=" + ((CommitTextCommand)editCommand0).getText().length() + ", newCursorPosition=" + ((CommitTextCommand)editCommand0).getNewCursorPosition() + ')';
        }
        if(editCommand0 instanceof SetComposingTextCommand) {
            return "SetComposingTextCommand(text.length=" + ((SetComposingTextCommand)editCommand0).getText().length() + ", newCursorPosition=" + ((SetComposingTextCommand)editCommand0).getNewCursorPosition() + ')';
        }
        if(editCommand0 instanceof SetComposingRegionCommand) {
            return editCommand0.toString();
        }
        if(editCommand0 instanceof DeleteSurroundingTextCommand) {
            return editCommand0.toString();
        }
        if(editCommand0 instanceof DeleteSurroundingTextInCodePointsCommand) {
            return editCommand0.toString();
        }
        if(editCommand0 instanceof SetSelectionCommand) {
            return editCommand0.toString();
        }
        if(editCommand0 instanceof FinishComposingTextCommand) {
            return editCommand0.toString();
        }
        if(editCommand0 instanceof BackspaceCommand) {
            return editCommand0.toString();
        }
        if(editCommand0 instanceof MoveCursorCommand) {
            return editCommand0.toString();
        }
        if(editCommand0 instanceof DeleteAllCommand) {
            return editCommand0.toString();
        }
        String s = Reflection.getOrCreateKotlinClass(editCommand0.getClass()).getSimpleName();
        if(s == null) {
            s = "{anonymous EditCommand}";
        }
        return "Unknown EditCommand: " + s;
    }

    @NotNull
    public final TextFieldValue apply(@NotNull List list0) {
        Exception exception1;
        int v1;
        EditCommand editCommand0;
        TextRange textRange0 = null;
        try {
            editCommand0 = null;
            int v = list0.size();
            v1 = 0;
        }
        catch(Exception exception0) {
            exception1 = exception0;
            goto label_16;
        }
        while(v1 < v) {
            try {
                EditCommand editCommand1 = (EditCommand)list0.get(v1);
                editCommand0 = editCommand1;
                editCommand1.applyTo(this.b);
                ++v1;
                editCommand0 = editCommand1;
                continue;
            }
            catch(Exception exception1) {
            }
        label_16:
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append("Error while applying EditCommand batch to buffer (length=" + this.b.getLength$ui_text_release() + ", composition=" + this.b.getComposition-MzsxiRA$ui_text_release() + ", selection=" + TextRange.toString-impl(this.b.getSelection-d9O1mEE$ui_text_release()) + "):");
            Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(value)");
            stringBuilder0.append('\n');
            Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(\'\\n\')");
            CollectionsKt___CollectionsKt.joinTo$default(list0, stringBuilder0, "\n", null, null, 0, null, new b2(2, editCommand0, this), 60, null);
            String s = stringBuilder0.toString();
            Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
            throw new RuntimeException(s, exception1);
        }
        AnnotatedString annotatedString0 = this.b.toAnnotatedString$ui_text_release();
        long v2 = this.b.getSelection-d9O1mEE$ui_text_release();
        TextRange textRange1 = TextRange.box-impl(v2);
        if(!TextRange.getReversed-impl(this.a.getSelection-d9O1mEE())) {
            textRange0 = textRange1;
        }
        TextFieldValue textFieldValue0 = new TextFieldValue(annotatedString0, (textRange0 == null ? TextRangeKt.TextRange(TextRange.getMax-impl(v2), TextRange.getMin-impl(v2)) : textRange0.unbox-impl()), this.b.getComposition-MzsxiRA$ui_text_release(), null);
        this.a = textFieldValue0;
        return textFieldValue0;
    }

    @NotNull
    public final EditingBuffer getMBuffer$ui_text_release() {
        return this.b;
    }

    @NotNull
    public final TextFieldValue getMBufferState$ui_text_release() {
        return this.a;
    }

    public final void reset(@NotNull TextFieldValue textFieldValue0, @Nullable TextInputSession textInputSession0) {
        boolean z = Intrinsics.areEqual(textFieldValue0.getComposition-MzsxiRA(), this.b.getComposition-MzsxiRA$ui_text_release());
        boolean z1 = true;
        boolean z2 = false;
        if(Intrinsics.areEqual(this.a.getAnnotatedString(), textFieldValue0.getAnnotatedString())) {
            if(!TextRange.equals-impl0(this.a.getSelection-d9O1mEE(), textFieldValue0.getSelection-d9O1mEE())) {
                this.b.setSelection$ui_text_release(TextRange.getMin-impl(textFieldValue0.getSelection-d9O1mEE()), TextRange.getMax-impl(textFieldValue0.getSelection-d9O1mEE()));
                z2 = true;
            }
            z1 = false;
        }
        else {
            this.b = new EditingBuffer(textFieldValue0.getAnnotatedString(), textFieldValue0.getSelection-d9O1mEE(), null);
        }
        if(textFieldValue0.getComposition-MzsxiRA() == null) {
            this.b.commitComposition$ui_text_release();
        }
        else if(!TextRange.getCollapsed-impl(textFieldValue0.getComposition-MzsxiRA().unbox-impl())) {
            this.b.setComposition$ui_text_release(TextRange.getMin-impl(textFieldValue0.getComposition-MzsxiRA().unbox-impl()), TextRange.getMax-impl(textFieldValue0.getComposition-MzsxiRA().unbox-impl()));
        }
        if(z1 || !z2 && !z) {
            this.b.commitComposition$ui_text_release();
            textFieldValue0 = TextFieldValue.copy-3r_uNRQ$default(textFieldValue0, null, 0L, null, 3, null);
        }
        TextFieldValue textFieldValue1 = this.a;
        this.a = textFieldValue0;
        if(textInputSession0 != null) {
            textInputSession0.updateState(textFieldValue1, textFieldValue0);
        }
    }

    @NotNull
    public final TextFieldValue toTextFieldValue() {
        return this.a;
    }
}

