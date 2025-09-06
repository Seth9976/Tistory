package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.StringHelpersKt;
import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000E\b\u0000\u0018\u0000 C2\u00020\u0001:\u0001CB1\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\u000B\u001A\u00020\n\u00A2\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001A\u00020\u00112\u000E\u0010\u0010\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u000F0\u000EH\u0086\b\u00A2\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001A\u00020\u0000\u00A2\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001A\u00020\u0000\u00A2\u0006\u0004\b\u0016\u0010\u0015J\r\u0010\u0017\u001A\u00020\u0000\u00A2\u0006\u0004\b\u0017\u0010\u0015J\r\u0010\u0018\u001A\u00020\u0000\u00A2\u0006\u0004\b\u0018\u0010\u0015J\r\u0010\u0019\u001A\u00020\u0000\u00A2\u0006\u0004\b\u0019\u0010\u0015J\r\u0010\u001A\u001A\u00020\u0000\u00A2\u0006\u0004\b\u001A\u0010\u0015J&\u0010\u001E\u001A\u00020\u00002\u0017\u0010\u001D\u001A\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00110\u001B\u00A2\u0006\u0002\b\u001C\u00A2\u0006\u0004\b\u001E\u0010\u001FJ&\u0010 \u001A\u00020\u00002\u0017\u0010\u001D\u001A\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00110\u001B\u00A2\u0006\u0002\b\u001C\u00A2\u0006\u0004\b \u0010\u001FJ\r\u0010\"\u001A\u00020!\u00A2\u0006\u0004\b\"\u0010#J\r\u0010$\u001A\u00020!\u00A2\u0006\u0004\b$\u0010#J\r\u0010%\u001A\u00020\u0000\u00A2\u0006\u0004\b%\u0010\u0015J\r\u0010&\u001A\u00020\u0000\u00A2\u0006\u0004\b&\u0010\u0015J\r\u0010\'\u001A\u00020\u0000\u00A2\u0006\u0004\b\'\u0010\u0015J\r\u0010(\u001A\u00020\u0000\u00A2\u0006\u0004\b(\u0010\u0015J\r\u0010)\u001A\u00020!\u00A2\u0006\u0004\b)\u0010#J\r\u0010*\u001A\u00020!\u00A2\u0006\u0004\b*\u0010#J\r\u0010+\u001A\u00020\u0000\u00A2\u0006\u0004\b+\u0010\u0015J\r\u0010,\u001A\u00020\u0000\u00A2\u0006\u0004\b,\u0010\u0015J\r\u0010-\u001A\u00020\u0000\u00A2\u0006\u0004\b-\u0010\u0015J\r\u0010.\u001A\u00020\u0000\u00A2\u0006\u0004\b.\u0010\u0015J\r\u0010/\u001A\u00020!\u00A2\u0006\u0004\b/\u0010#J\r\u00100\u001A\u00020\u0000\u00A2\u0006\u0004\b0\u0010\u0015J\r\u00101\u001A\u00020!\u00A2\u0006\u0004\b1\u0010#J\r\u00102\u001A\u00020\u0000\u00A2\u0006\u0004\b2\u0010\u0015J\r\u00103\u001A\u00020\u0000\u00A2\u0006\u0004\b3\u0010\u0015J\r\u00104\u001A\u00020\u0000\u00A2\u0006\u0004\b4\u0010\u0015J\r\u00105\u001A\u00020\u0000\u00A2\u0006\u0004\b5\u0010\u0015R\u0017\u0010;\u001A\u0002068\u0006\u00A2\u0006\f\n\u0004\b7\u00108\u001A\u0004\b9\u0010:R(\u0010B\u001A\u00020\u000F8\u0006@\u0006X\u0086\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\b<\u0010=\u001A\u0004\b>\u0010?\"\u0004\b@\u0010A\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006D"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;", "", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "state", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "", "isFromSoftKeyboard", "", "visibleTextLayoutHeight", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;", "textPreparedSelectionState", "<init>", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/TextLayoutResult;ZFLandroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;)V", "Lkotlin/Function0;", "Landroidx/compose/ui/text/TextRange;", "block", "", "deleteIfSelectedOr", "(Lkotlin/jvm/functions/Function0;)V", "moveCursorUpByPage", "()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;", "moveCursorDownByPage", "selectAll", "deselect", "moveCursorLeft", "moveCursorRight", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "or", "collapseLeftOr", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;", "collapseRightOr", "", "getPrecedingCharacterIndex", "()I", "getNextCharacterIndex", "moveCursorToHome", "moveCursorToEnd", "moveCursorLeftByWord", "moveCursorRightByWord", "getNextWordOffset", "getPreviousWordOffset", "moveCursorPrevByParagraph", "moveCursorNextByParagraph", "moveCursorUpByLine", "moveCursorDownByLine", "getLineStartByOffset", "moveCursorToLineStart", "getLineEndByOffset", "moveCursorToLineEnd", "moveCursorToLineLeftSide", "moveCursorToLineRightSide", "selectMovement", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "f", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "getInitialValue", "()Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "initialValue", "g", "J", "getSelection-d9O1mEE", "()J", "setSelection-5zc-tL8", "(J)V", "selection", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n*L\n1#1,545:1\n181#1,7:554\n181#1,7:561\n177#1,11:568\n177#1,11:579\n177#1,11:590\n177#1,11:601\n177#1,11:612\n177#1,11:623\n177#1,11:634\n177#1,11:645\n177#1,11:656\n177#1,11:667\n177#1,11:678\n177#1,11:689\n177#1,11:700\n177#1,11:711\n177#1,11:722\n177#1,11:733\n181#1,7:744\n181#1,7:751\n177#1,11:758\n177#1,11:769\n177#1,11:780\n177#1,11:791\n181#1,7:802\n602#2,8:546\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection\n*L\n135#1:554,7\n142#1:561,7\n197#1:568,11\n201#1:579,11\n205#1:590,11\n213#1:601,11\n224#1:612,11\n239#1:623,11\n262#1:634,11\n270#1:645,11\n278#1:656,11\n282#1:667,11\n286#1:678,11\n294#1:689,11\n305#1:700,11\n311#1:711,11\n315#1:722,11\n323#1:733,11\n333#1:744,7\n340#1:751,7\n347#1:758,11\n354#1:769,11\n358#1:780,11\n366#1:791,11\n375#1:802,7\n98#1:546,8\n*E\n"})
public final class TextFieldPreparedSelection {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection$Companion;", "", "", "NoCharacterFound", "I", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = null;
    public static final int NoCharacterFound = -1;
    public final TransformedTextFieldState a;
    public final TextLayoutResult b;
    public final boolean c;
    public final float d;
    public final TextFieldPreparedSelectionState e;
    public final TextFieldCharSequence f;
    public long g;
    public final String h;

    static {
        TextFieldPreparedSelection.Companion = new Companion(null);
        TextFieldPreparedSelection.$stable = 8;
    }

    public TextFieldPreparedSelection(@NotNull TransformedTextFieldState transformedTextFieldState0, @Nullable TextLayoutResult textLayoutResult0, boolean z, float f, @NotNull TextFieldPreparedSelectionState textFieldPreparedSelectionState0) {
        TextFieldCharSequence textFieldCharSequence0;
        this.a = transformedTextFieldState0;
        this.b = textLayoutResult0;
        this.c = z;
        this.d = f;
        this.e = textFieldPreparedSelectionState0;
        Snapshot snapshot0 = Snapshot.Companion.getCurrentThreadSnapshot();
        Function1 function10 = snapshot0 == null ? null : snapshot0.getReadObserver();
        Snapshot snapshot1 = Snapshot.Companion.makeCurrentNonObservable(snapshot0);
        try {
            textFieldCharSequence0 = transformedTextFieldState0.getVisualText();
        }
        finally {
            Snapshot.Companion.restoreNonObservable(snapshot0, snapshot1, function10);
        }
        this.f = textFieldCharSequence0;
        this.g = textFieldCharSequence0.getSelection-d9O1mEE();
        this.h = textFieldCharSequence0.toString();
    }

    public final boolean a() {
        TextLayoutResult textLayoutResult0 = this.b;
        if(textLayoutResult0 != null) {
            ResolvedTextDirection resolvedTextDirection0 = textLayoutResult0.getParagraphDirection(TextRange.getEnd-impl(this.g));
            return resolvedTextDirection0 == null || resolvedTextDirection0 == ResolvedTextDirection.Ltr;
        }
        return true;
    }

    public final int b(TextLayoutResult textLayoutResult0, int v) {
        int v1 = TextRange.getEnd-impl(this.g);
        TextFieldPreparedSelectionState textFieldPreparedSelectionState0 = this.e;
        if(Float.isNaN(textFieldPreparedSelectionState0.getCachedX())) {
            textFieldPreparedSelectionState0.setCachedX(textLayoutResult0.getCursorRect(v1).getLeft());
        }
        int v2 = textLayoutResult0.getLineForOffset(v1) + v;
        if(v2 < 0) {
            return 0;
        }
        if(v2 >= textLayoutResult0.getLineCount()) {
            return this.h.length();
        }
        float f = textLayoutResult0.getLineBottom(v2);
        float f1 = textFieldPreparedSelectionState0.getCachedX();
        return (!this.a() || f1 < textLayoutResult0.getLineRight(v2)) && (this.a() || f1 > textLayoutResult0.getLineLeft(v2)) ? textLayoutResult0.getOffsetForPosition-k-4lQ0M(OffsetKt.Offset(f1, f - 1.0f)) : textLayoutResult0.getLineEnd(v2, true);
    }

    public final int c(int v) {
        int v1 = TextRange.getEnd-impl(this.f.getSelection-d9O1mEE());
        TextLayoutResult textLayoutResult0 = this.b;
        if(textLayoutResult0 != null) {
            float f = this.d;
            if(!Float.isNaN(f)) {
                Rect rect0 = textLayoutResult0.getCursorRect(v1).translate(0.0f, f * ((float)v));
                float f1 = textLayoutResult0.getLineBottom(textLayoutResult0.getLineForVerticalPosition(rect0.getTop()));
                return Math.abs(rect0.getTop() - f1) > Math.abs(rect0.getBottom() - f1) ? textLayoutResult0.getOffsetForPosition-k-4lQ0M(rect0.getTopLeft-F1C5BW0()) : textLayoutResult0.getOffsetForPosition-k-4lQ0M(rect0.getBottomLeft-F1C5BW0());
            }
        }
        return v1;
    }

    @NotNull
    public final TextFieldPreparedSelection collapseLeftOr(@NotNull Function1 function10) {
        this.e.resetCachedX();
        if(this.h.length() > 0) {
            if(TextRange.getCollapsed-impl(this.g)) {
                function10.invoke(this);
                return this;
            }
            if(this.a()) {
                this.f(TextRange.getMin-impl(this.g));
                return this;
            }
            this.f(TextRange.getMax-impl(this.g));
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection collapseRightOr(@NotNull Function1 function10) {
        this.e.resetCachedX();
        if(this.h.length() > 0) {
            if(TextRange.getCollapsed-impl(this.g)) {
                function10.invoke(this);
                return this;
            }
            if(this.a()) {
                this.f(TextRange.getMax-impl(this.g));
                return this;
            }
            this.f(TextRange.getMin-impl(this.g));
        }
        return this;
    }

    public final void d() {
        this.e.resetCachedX();
        if(this.h.length() > 0) {
            int v = TextRange.getEnd-impl(this.g);
            int v1 = TextPreparedSelectionKt.calculateAdjacentCursorPosition(this.h, v, true, this.a);
            if(v1 != v) {
                this.f(v1);
            }
        }
    }

    public final void deleteIfSelectedOr(@NotNull Function0 function00) {
        if(!TextRange.getCollapsed-impl(this.getSelection-d9O1mEE())) {
            TransformedTextFieldState.replaceText-M8tDOmk$default(this.a, "", this.getSelection-d9O1mEE(), null, !this.c, 4, null);
            return;
        }
        TextRange textRange0 = (TextRange)function00.invoke();
        if(textRange0 != null) {
            TransformedTextFieldState.replaceText-M8tDOmk$default(this.a, "", textRange0.unbox-impl(), null, !this.c, 4, null);
        }
    }

    @NotNull
    public final TextFieldPreparedSelection deselect() {
        this.e.resetCachedX();
        if(this.h.length() > 0) {
            this.f(TextRange.getEnd-impl(this.g));
        }
        return this;
    }

    public final void e() {
        this.e.resetCachedX();
        if(this.h.length() > 0) {
            int v = TextRange.getEnd-impl(this.g);
            int v1 = TextPreparedSelectionKt.calculateAdjacentCursorPosition(this.h, v, false, this.a);
            if(v1 != v) {
                this.f(v1);
            }
        }
    }

    public final void f(int v) {
        this.g = TextRangeKt.TextRange(v, v);
    }

    @NotNull
    public final TextFieldCharSequence getInitialValue() {
        return this.f;
    }

    public final int getLineEndByOffset() {
        return this.b == null ? this.h.length() : this.b.getLineEnd(this.b.getLineForOffset(TextRange.getMax-impl(this.g)), true);
    }

    public final int getLineStartByOffset() {
        return this.b == null ? 0 : this.b.getLineStart(this.b.getLineForOffset(TextRange.getMin-impl(this.g)));
    }

    public final int getNextCharacterIndex() {
        return StringHelpers_androidKt.findFollowingBreak(this.h, TextRange.getEnd-impl(this.g));
    }

    public final int getNextWordOffset() {
        long v1;
        String s = this.h;
        TextLayoutResult textLayoutResult0 = this.b;
        if(textLayoutResult0 != null) {
            for(int v = TextRange.getEnd-impl(this.g); true; ++v) {
                TextFieldCharSequence textFieldCharSequence0 = this.f;
                if(v >= textFieldCharSequence0.length()) {
                    return textFieldCharSequence0.length();
                }
                v1 = textLayoutResult0.getWordBoundary--jx7JFs(c.coerceAtMost(v, s.length() - 1));
                if(TextRange.getEnd-impl(v1) > v) {
                    break;
                }
            }
            return TextRange.getEnd-impl(v1);
        }
        return s.length();
    }

    public final int getPrecedingCharacterIndex() {
        return StringHelpers_androidKt.findPrecedingBreak(this.h, TextRange.getEnd-impl(this.g));
    }

    public final int getPreviousWordOffset() {
        TextLayoutResult textLayoutResult0 = this.b;
        if(textLayoutResult0 != null) {
            int v = TextRange.getEnd-impl(this.g);
            while(v > 0) {
                long v1 = textLayoutResult0.getWordBoundary--jx7JFs(c.coerceAtMost(v, this.h.length() - 1));
                if(TextRange.getStart-impl(v1) >= v) {
                    --v;
                    continue;
                }
                return TextRange.getStart-impl(v1);
            }
        }
        return 0;
    }

    public final long getSelection-d9O1mEE() {
        return this.g;
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorDownByLine() {
        TextLayoutResult textLayoutResult0 = this.b;
        if(textLayoutResult0 == null) {
            return this;
        }
        if(this.h.length() > 0) {
            Intrinsics.checkNotNull(textLayoutResult0);
            this.f(this.b(textLayoutResult0, 1));
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorDownByPage() {
        if(this.h.length() > 0) {
            this.f(this.c(1));
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorLeft() {
        this.e.resetCachedX();
        if(this.h.length() > 0) {
            if(this.a()) {
                this.e();
                return this;
            }
            this.d();
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorLeftByWord() {
        this.e.resetCachedX();
        if(this.h.length() > 0) {
            if(this.a()) {
                this.e.resetCachedX();
                if(this.h.length() > 0) {
                    this.f(this.getPreviousWordOffset());
                    return this;
                }
            }
            else {
                this.e.resetCachedX();
                if(this.h.length() > 0) {
                    this.f(this.getNextWordOffset());
                }
            }
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorNextByParagraph() {
        this.e.resetCachedX();
        if(this.h.length() > 0) {
            String s = this.h;
            int v = StringHelpersKt.findParagraphEnd(s, TextRange.getMax-impl(this.g));
            if(v == TextRange.getMax-impl(this.g) && v != s.length()) {
                v = StringHelpersKt.findParagraphEnd(s, v + 1);
            }
            this.f(v);
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorPrevByParagraph() {
        this.e.resetCachedX();
        if(this.h.length() > 0) {
            String s = this.h;
            int v = StringHelpersKt.findParagraphStart(s, TextRange.getMin-impl(this.g));
            if(v == TextRange.getMin-impl(this.g) && v != 0) {
                v = StringHelpersKt.findParagraphStart(s, v - 1);
            }
            this.f(v);
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorRight() {
        this.e.resetCachedX();
        if(this.h.length() > 0) {
            if(this.a()) {
                this.d();
                return this;
            }
            this.e();
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorRightByWord() {
        this.e.resetCachedX();
        if(this.h.length() > 0) {
            if(this.a()) {
                this.e.resetCachedX();
                if(this.h.length() > 0) {
                    this.f(this.getNextWordOffset());
                    return this;
                }
            }
            else {
                this.e.resetCachedX();
                if(this.h.length() > 0) {
                    this.f(this.getPreviousWordOffset());
                }
            }
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorToEnd() {
        this.e.resetCachedX();
        if(this.h.length() > 0) {
            this.f(this.h.length());
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorToHome() {
        this.e.resetCachedX();
        if(this.h.length() > 0) {
            this.f(0);
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorToLineEnd() {
        this.e.resetCachedX();
        if(this.h.length() > 0) {
            this.f(this.getLineEndByOffset());
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorToLineLeftSide() {
        this.e.resetCachedX();
        if(this.h.length() > 0) {
            if(this.a()) {
                this.moveCursorToLineStart();
                return this;
            }
            this.moveCursorToLineEnd();
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorToLineRightSide() {
        this.e.resetCachedX();
        if(this.h.length() > 0) {
            if(this.a()) {
                this.moveCursorToLineEnd();
                return this;
            }
            this.moveCursorToLineStart();
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorToLineStart() {
        this.e.resetCachedX();
        if(this.h.length() > 0) {
            this.f(this.getLineStartByOffset());
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorUpByLine() {
        TextLayoutResult textLayoutResult0 = this.b;
        if(textLayoutResult0 == null) {
            return this;
        }
        if(this.h.length() > 0) {
            Intrinsics.checkNotNull(textLayoutResult0);
            this.f(this.b(textLayoutResult0, -1));
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorUpByPage() {
        if(this.h.length() > 0) {
            this.f(this.c(-1));
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection selectAll() {
        this.e.resetCachedX();
        if(this.h.length() > 0) {
            this.g = TextRangeKt.TextRange(0, this.h.length());
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection selectMovement() {
        if(this.h.length() > 0) {
            this.g = TextRangeKt.TextRange(TextRange.getStart-impl(this.f.getSelection-d9O1mEE()), TextRange.getEnd-impl(this.g));
        }
        return this;
    }

    public final void setSelection-5zc-tL8(long v) {
        this.g = v;
    }
}

