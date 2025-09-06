package androidx.compose.foundation.text.input;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\b\u0003\u001A{\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00032`\u0010\u0005\u001A\\\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000B\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00010\u0006H\u0080\b\u001A\u001A\u0010\u000E\u001A\u00020\u0001*\u00020\u000F2\u0006\u0010\u0010\u001A\u00020\u00072\u0006\u0010\u0011\u001A\u00020\u0007\u001AE\u0010\u0012\u001A\u00020\u0001*\u00020\u001326\u0010\u0014\u001A2\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00010\u0015H\u0087\b\u001AE\u0010\u0019\u001A\u00020\u0001*\u00020\u001326\u0010\u0014\u001A2\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00010\u0015H\u0087\b\u001A\u001A\u0010\u001A\u001A\u00020\u0001*\u00020\u000F2\u0006\u0010\u001B\u001A\u00020\u00072\u0006\u0010\u001C\u001A\u00020\u001D\u001A\n\u0010\u001E\u001A\u00020\u0001*\u00020\u000F\u001A\n\u0010\u001F\u001A\u00020\u0001*\u00020\u000F¨\u0006 "}, d2 = {"findCommonPrefixAndSuffix", "", "a", "", "b", "onFound", "Lkotlin/Function4;", "", "Lkotlin/ParameterName;", "name", "aPrefixStart", "aSuffixStart", "bPrefixStart", "bSuffixStart", "delete", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "start", "end", "forEachChange", "Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;", "block", "Lkotlin/Function2;", "Landroidx/compose/ui/text/TextRange;", "range", "originalRange", "forEachChangeReversed", "insert", "index", "text", "", "placeCursorAtEnd", "selectAll", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class TextFieldBufferKt {
    public static final void delete(@NotNull TextFieldBuffer textFieldBuffer0, int v, int v1) {
        textFieldBuffer0.replace(v, v1, "");
    }

    public static final void findCommonPrefixAndSuffix(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull Function4 function40) {
        int v4;
        int v = charSequence0.length();
        int v1 = charSequence1.length();
        int v2 = 0;
        if(charSequence0.length() <= 0 || charSequence1.length() <= 0) {
            v4 = 0;
        }
        else {
            int v3 = 0;
            v4 = 0;
            boolean z = false;
            do {
                if(v2 == 0) {
                    if(charSequence0.charAt(v3) == charSequence1.charAt(v4)) {
                        ++v3;
                        ++v4;
                    }
                    else {
                        v2 = 1;
                    }
                }
                if(!z) {
                    if(charSequence0.charAt(v - 1) == charSequence1.charAt(v1 - 1)) {
                        --v;
                        --v1;
                    }
                    else {
                        z = true;
                    }
                }
            }
            while(v3 < v && v4 < v1 && (v2 == 0 || !z));
            v2 = v3;
        }
        if(v2 >= v && v4 >= v1) {
            return;
        }
        function40.invoke(v2, v, v4, v1);
    }

    @ExperimentalFoundationApi
    public static final void forEachChange(@NotNull ChangeList textFieldBuffer$ChangeList0, @NotNull Function2 function20) {
        for(int v = 0; v < textFieldBuffer$ChangeList0.getChangeCount(); ++v) {
            function20.invoke(TextRange.box-impl(textFieldBuffer$ChangeList0.getRange--jx7JFs(v)), TextRange.box-impl(textFieldBuffer$ChangeList0.getOriginalRange--jx7JFs(v)));
        }
    }

    @ExperimentalFoundationApi
    public static final void forEachChangeReversed(@NotNull ChangeList textFieldBuffer$ChangeList0, @NotNull Function2 function20) {
        for(int v = textFieldBuffer$ChangeList0.getChangeCount() - 1; v >= 0; --v) {
            function20.invoke(TextRange.box-impl(textFieldBuffer$ChangeList0.getRange--jx7JFs(v)), TextRange.box-impl(textFieldBuffer$ChangeList0.getOriginalRange--jx7JFs(v)));
        }
    }

    public static final void insert(@NotNull TextFieldBuffer textFieldBuffer0, int v, @NotNull String s) {
        textFieldBuffer0.replace(v, v, s);
    }

    public static final void placeCursorAtEnd(@NotNull TextFieldBuffer textFieldBuffer0) {
        textFieldBuffer0.placeCursorBeforeCharAt(textFieldBuffer0.getLength());
    }

    public static final void selectAll(@NotNull TextFieldBuffer textFieldBuffer0) {
        textFieldBuffer0.setSelection-5zc-tL8(TextRangeKt.TextRange(0, textFieldBuffer0.getLength()));
    }
}

