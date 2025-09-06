package androidx.compose.foundation.text.input;

import androidx.compose.material3.p6;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u001A\u0010\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\u0000\u001A&\u0010\u0004\u001A\u00020\u00012\b\b\u0002\u0010\u0005\u001A\u00020\u00062\b\b\u0002\u0010\u0007\u001A\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001A\n\u0010\u000B\u001A\u00020\f*\u00020\u0001\u001A\u0012\u0010\r\u001A\u00020\f*\u00020\u00012\u0006\u0010\u000E\u001A\u00020\u0006\u001A\u0012\u0010\u000F\u001A\u00020\f*\u00020\u00012\u0006\u0010\u000E\u001A\u00020\u0006\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0010"}, d2 = {"TextFieldState", "Landroidx/compose/foundation/text/input/TextFieldState;", "initialValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "rememberTextFieldState", "initialText", "", "initialSelection", "Landroidx/compose/ui/text/TextRange;", "rememberTextFieldState-Le-punE", "(Ljava/lang/String;JLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/text/input/TextFieldState;", "clearText", "", "setTextAndPlaceCursorAtEnd", "text", "setTextAndSelectAll", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextFieldState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n*L\n1#1,694:1\n1223#2,6:695\n175#3,8:701\n175#3,8:709\n175#3,8:717\n*S KotlinDebug\n*F\n+ 1 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldStateKt\n*L\n621#1:695,6\n643#1:701,8\n667#1:709,8\n689#1:717,8\n*E\n"})
public final class TextFieldStateKt {
    @NotNull
    public static final TextFieldState TextFieldState(@NotNull TextFieldValue textFieldValue0) {
        return new TextFieldState(textFieldValue0.getText(), textFieldValue0.getSelection-d9O1mEE(), null);
    }

    public static final void clearText(@NotNull TextFieldState textFieldState0) {
        TextFieldBuffer textFieldBuffer0 = textFieldState0.startEdit();
        try {
            TextFieldBufferKt.delete(textFieldBuffer0, 0, textFieldBuffer0.getLength());
            TextFieldBufferKt.placeCursorAtEnd(textFieldBuffer0);
            textFieldState0.commitEdit(textFieldBuffer0);
        }
        finally {
            textFieldState0.finishEditing();
        }
    }

    @Composable
    @NotNull
    public static final TextFieldState rememberTextFieldState-Le-punE(@Nullable String s, long v, @Nullable Composer composer0, int v1, int v2) {
        if((v2 & 1) != 0) {
            s = "";
        }
        if((v2 & 2) != 0) {
            v = TextRangeKt.TextRange(s.length());
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x431414AD, v1, -1, "androidx.compose.foundation.text.input.rememberTextFieldState (TextFieldState.kt:620)");
        }
        int v3 = 0;
        Saver textFieldState$Saver0 = Saver.INSTANCE;
        int v4 = ((v1 & 14 ^ 6) <= 4 || !composer0.changed(s)) && (v1 & 6) != 4 ? 0 : 1;
        if((v1 & 0x70 ^ 0x30) > 0x20 && composer0.changed(v) || (v1 & 0x30) == 0x20) {
            v3 = 1;
        }
        p6 p60 = composer0.rememberedValue();
        if((v4 | v3) != 0 || p60 == Composer.Companion.getEmpty()) {
            p60 = new p6(3, v, s);
            composer0.updateRememberedValue(p60);
        }
        TextFieldState textFieldState0 = (TextFieldState)RememberSaveableKt.rememberSaveable(new Object[0], textFieldState$Saver0, null, p60, composer0, 0x30, 4);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldState0;
    }

    public static final void setTextAndPlaceCursorAtEnd(@NotNull TextFieldState textFieldState0, @NotNull String s) {
        TextFieldBuffer textFieldBuffer0 = textFieldState0.startEdit();
        try {
            textFieldBuffer0.replace(0, textFieldBuffer0.getLength(), s);
            TextFieldBufferKt.placeCursorAtEnd(textFieldBuffer0);
            textFieldState0.commitEdit(textFieldBuffer0);
        }
        finally {
            textFieldState0.finishEditing();
        }
    }

    public static final void setTextAndSelectAll(@NotNull TextFieldState textFieldState0, @NotNull String s) {
        TextFieldBuffer textFieldBuffer0 = textFieldState0.startEdit();
        try {
            textFieldBuffer0.replace(0, textFieldBuffer0.getLength(), s);
            TextFieldBufferKt.selectAll(textFieldBuffer0);
            textFieldState0.commitEdit(textFieldBuffer0);
        }
        finally {
            textFieldState0.finishEditing();
        }
    }
}

