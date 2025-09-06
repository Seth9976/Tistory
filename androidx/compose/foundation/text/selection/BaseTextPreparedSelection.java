package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.StringHelpersKt;
import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\bC\n\u0002\u0010\u000E\n\u0002\b\u0005\b \u0018\u0000 `*\u000E\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002:\u0001`B1\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u0006\u0010\f\u001A\u00020\u000B\u00A2\u0006\u0004\b\r\u0010\u000EJ=\u0010\u0016\u001A\u00028\u0000\"\u0004\b\u0001\u0010\u000F*\u00028\u00012\b\b\u0002\u0010\u0011\u001A\u00020\u00102\u0017\u0010\u0015\u001A\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00130\u0012\u00A2\u0006\u0002\b\u0014H\u0084\b\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001A\u001A\u00020\u00132\u0006\u0010\u0019\u001A\u00020\u0018H\u0004\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u001F\u0010\u001E\u001A\u00020\u00132\u0006\u0010\u001C\u001A\u00020\u00182\u0006\u0010\u001D\u001A\u00020\u0018H\u0004\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\r\u0010 \u001A\u00028\u0000\u00A2\u0006\u0004\b \u0010!J\r\u0010\"\u001A\u00028\u0000\u00A2\u0006\u0004\b\"\u0010!J\r\u0010#\u001A\u00028\u0000\u00A2\u0006\u0004\b#\u0010!J\r\u0010$\u001A\u00028\u0000\u00A2\u0006\u0004\b$\u0010!J&\u0010&\u001A\u00028\u00002\u0017\u0010%\u001A\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u0012\u00A2\u0006\u0002\b\u0014\u00A2\u0006\u0004\b&\u0010\'J&\u0010(\u001A\u00028\u00002\u0017\u0010%\u001A\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u0012\u00A2\u0006\u0002\b\u0014\u00A2\u0006\u0004\b(\u0010\'J\r\u0010)\u001A\u00020\u0018\u00A2\u0006\u0004\b)\u0010*J\r\u0010+\u001A\u00020\u0018\u00A2\u0006\u0004\b+\u0010*J\r\u0010,\u001A\u00028\u0000\u00A2\u0006\u0004\b,\u0010!J\r\u0010-\u001A\u00028\u0000\u00A2\u0006\u0004\b-\u0010!J\r\u0010.\u001A\u00028\u0000\u00A2\u0006\u0004\b.\u0010!J\r\u0010/\u001A\u00028\u0000\u00A2\u0006\u0004\b/\u0010!J\u000F\u00100\u001A\u0004\u0018\u00010\u0018\u00A2\u0006\u0004\b0\u00101J\u000F\u00102\u001A\u0004\u0018\u00010\u0018\u00A2\u0006\u0004\b2\u00101J\r\u00103\u001A\u00028\u0000\u00A2\u0006\u0004\b3\u0010!J\r\u00104\u001A\u00028\u0000\u00A2\u0006\u0004\b4\u0010!J\r\u00105\u001A\u00028\u0000\u00A2\u0006\u0004\b5\u0010!J\r\u00106\u001A\u00028\u0000\u00A2\u0006\u0004\b6\u0010!J\u000F\u00107\u001A\u0004\u0018\u00010\u0018\u00A2\u0006\u0004\b7\u00101J\r\u00108\u001A\u00028\u0000\u00A2\u0006\u0004\b8\u0010!J\u000F\u00109\u001A\u0004\u0018\u00010\u0018\u00A2\u0006\u0004\b9\u00101J\r\u0010:\u001A\u00028\u0000\u00A2\u0006\u0004\b:\u0010!J\r\u0010;\u001A\u00028\u0000\u00A2\u0006\u0004\b;\u0010!J\r\u0010<\u001A\u00028\u0000\u00A2\u0006\u0004\b<\u0010!J\r\u0010=\u001A\u00028\u0000\u00A2\u0006\u0004\b=\u0010!R\u0017\u0010\u0004\u001A\u00020\u00038\u0006\u00A2\u0006\f\n\u0004\b>\u0010?\u001A\u0004\b@\u0010AR\u001D\u0010\u0006\u001A\u00020\u00058\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bB\u0010C\u001A\u0004\bD\u0010ER\u0019\u0010\b\u001A\u0004\u0018\u00010\u00078\u0006\u00A2\u0006\f\n\u0004\bF\u0010G\u001A\u0004\bH\u0010IR\u0017\u0010\n\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\bJ\u0010K\u001A\u0004\bL\u0010MR\u0017\u0010\f\u001A\u00020\u000B8\u0006\u00A2\u0006\f\n\u0004\bN\u0010O\u001A\u0004\bP\u0010QR(\u0010V\u001A\u00020\u00058\u0006@\u0006X\u0086\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\bR\u0010C\u001A\u0004\bS\u0010E\"\u0004\bT\u0010UR\"\u0010[\u001A\u00020\u00038\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bW\u0010?\u001A\u0004\bX\u0010A\"\u0004\bY\u0010ZR\u0014\u0010_\u001A\u00020\\8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b]\u0010^\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006a"}, d2 = {"Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "T", "", "Landroidx/compose/ui/text/AnnotatedString;", "originalText", "Landroidx/compose/ui/text/TextRange;", "originalSelection", "Landroidx/compose/ui/text/TextLayoutResult;", "layoutResult", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "state", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "U", "", "resetCachedX", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "block", "apply", "(Ljava/lang/Object;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "", "offset", "setCursor", "(I)V", "start", "end", "setSelection", "(II)V", "selectAll", "()Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "deselect", "moveCursorLeft", "moveCursorRight", "or", "collapseLeftOr", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "collapseRightOr", "getPrecedingCharacterIndex", "()I", "getNextCharacterIndex", "moveCursorToHome", "moveCursorToEnd", "moveCursorLeftByWord", "moveCursorRightByWord", "getNextWordOffset", "()Ljava/lang/Integer;", "getPreviousWordOffset", "moveCursorPrevByParagraph", "moveCursorNextByParagraph", "moveCursorUpByLine", "moveCursorDownByLine", "getLineStartByOffset", "moveCursorToLineStart", "getLineEndByOffset", "moveCursorToLineEnd", "moveCursorToLineLeftSide", "moveCursorToLineRightSide", "selectMovement", "a", "Landroidx/compose/ui/text/AnnotatedString;", "getOriginalText", "()Landroidx/compose/ui/text/AnnotatedString;", "b", "J", "getOriginalSelection-d9O1mEE", "()J", "c", "Landroidx/compose/ui/text/TextLayoutResult;", "getLayoutResult", "()Landroidx/compose/ui/text/TextLayoutResult;", "d", "Landroidx/compose/ui/text/input/OffsetMapping;", "getOffsetMapping", "()Landroidx/compose/ui/text/input/OffsetMapping;", "e", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "getState", "()Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "f", "getSelection-d9O1mEE", "setSelection-5zc-tL8", "(J)V", "selection", "g", "getAnnotatedString", "setAnnotatedString", "(Landroidx/compose/ui/text/AnnotatedString;)V", "annotatedString", "", "getText$foundation_release", "()Ljava/lang/String;", "text", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/BaseTextPreparedSelection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,437:1\n73#1,8:438\n73#1,8:446\n73#1,8:454\n73#1,8:462\n73#1,8:470\n73#1,8:478\n73#1,8:486\n73#1,8:494\n73#1,8:502\n73#1,8:510\n73#1,8:518\n73#1,8:526\n73#1,6:534\n80#1:541\n73#1,8:542\n73#1,8:550\n73#1,8:558\n74#1,7:566\n74#1,7:573\n73#1,8:580\n73#1,8:588\n73#1,8:596\n73#1,8:604\n74#1,7:612\n1#2:540\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/BaseTextPreparedSelection\n*L\n91#1:438,8\n95#1:446,8\n99#1:454,8\n107#1:462,8\n118#1:470,8\n134#1:478,8\n158#1:486,8\n163#1:494,8\n168#1:502,8\n172#1:510,8\n176#1:518,8\n184#1:526,8\n194#1:534,6\n194#1:541\n200#1:542,8\n204#1:550,8\n212#1:558,8\n220#1:566,7\n224#1:573,7\n230#1:580,8\n236#1:588,8\n240#1:596,8\n248#1:604,8\n257#1:612,7\n*E\n"})
public abstract class BaseTextPreparedSelection {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection$Companion;", "", "", "NoCharacterFound", "I", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = null;
    public static final int NoCharacterFound = -1;
    public final AnnotatedString a;
    public final long b;
    public final TextLayoutResult c;
    public final OffsetMapping d;
    public final TextPreparedSelectionState e;
    public long f;
    public AnnotatedString g;

    static {
        BaseTextPreparedSelection.Companion = new Companion(null);
        BaseTextPreparedSelection.$stable = 8;
    }

    public BaseTextPreparedSelection(AnnotatedString annotatedString0, long v, TextLayoutResult textLayoutResult0, OffsetMapping offsetMapping0, TextPreparedSelectionState textPreparedSelectionState0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = annotatedString0;
        this.b = v;
        this.c = textLayoutResult0;
        this.d = offsetMapping0;
        this.e = textPreparedSelectionState0;
        this.f = v;
        this.g = annotatedString0;
    }

    public final boolean a() {
        return (this.c == null ? null : this.c.getParagraphDirection(this.d.originalToTransformed(TextRange.getEnd-impl(this.f)))) != ResolvedTextDirection.Rtl;
    }

    @NotNull
    public final BaseTextPreparedSelection apply(Object object0, boolean z, @NotNull Function1 function10) {
        if(z) {
            this.getState().resetCachedX();
        }
        if(this.getText$foundation_release().length() > 0) {
            function10.invoke(object0);
        }
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return (BaseTextPreparedSelection)object0;
    }

    public static BaseTextPreparedSelection apply$default(BaseTextPreparedSelection baseTextPreparedSelection0, Object object0, boolean z, Function1 function10, int v, Object object1) {
        if(object1 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: apply");
        }
        if((v & 1) != 0) {
            z = true;
        }
        if(z) {
            baseTextPreparedSelection0.getState().resetCachedX();
        }
        if(baseTextPreparedSelection0.getText$foundation_release().length() > 0) {
            function10.invoke(object0);
        }
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return (BaseTextPreparedSelection)object0;
    }

    public final int b(TextLayoutResult textLayoutResult0, int v) {
        OffsetMapping offsetMapping0 = this.d;
        int v1 = offsetMapping0.originalToTransformed(TextRange.getEnd-impl(this.f));
        TextPreparedSelectionState textPreparedSelectionState0 = this.e;
        if(textPreparedSelectionState0.getCachedX() == null) {
            textPreparedSelectionState0.setCachedX(textLayoutResult0.getCursorRect(v1).getLeft());
        }
        int v2 = textLayoutResult0.getLineForOffset(v1) + v;
        if(v2 < 0) {
            return 0;
        }
        if(v2 >= textLayoutResult0.getLineCount()) {
            return this.getText$foundation_release().length();
        }
        float f = textLayoutResult0.getLineBottom(v2);
        Float float0 = textPreparedSelectionState0.getCachedX();
        Intrinsics.checkNotNull(float0);
        float f1 = float0.floatValue();
        return (!this.a() || f1 < textLayoutResult0.getLineRight(v2)) && (this.a() || f1 > textLayoutResult0.getLineLeft(v2)) ? offsetMapping0.transformedToOriginal(textLayoutResult0.getOffsetForPosition-k-4lQ0M(OffsetKt.Offset(float0.floatValue(), f - 1.0f))) : textLayoutResult0.getLineEnd(v2, true);
    }

    public final void c() {
        this.getState().resetCachedX();
        if(this.getText$foundation_release().length() > 0) {
            int v = this.getNextCharacterIndex();
            if(v != -1) {
                this.setCursor(v);
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
    }

    @NotNull
    public final BaseTextPreparedSelection collapseLeftOr(@NotNull Function1 function10) {
        this.getState().resetCachedX();
        if(this.getText$foundation_release().length() > 0) {
            if(TextRange.getCollapsed-impl(this.f)) {
                Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection.collapseLeftOr$lambda$4");
                function10.invoke(this);
            }
            else if(this.a()) {
                this.setCursor(TextRange.getMin-impl(this.f));
            }
            else {
                this.setCursor(TextRange.getMax-impl(this.f));
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final BaseTextPreparedSelection collapseRightOr(@NotNull Function1 function10) {
        this.getState().resetCachedX();
        if(this.getText$foundation_release().length() > 0) {
            if(TextRange.getCollapsed-impl(this.f)) {
                Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection.collapseRightOr$lambda$5");
                function10.invoke(this);
            }
            else if(this.a()) {
                this.setCursor(TextRange.getMax-impl(this.f));
            }
            else {
                this.setCursor(TextRange.getMin-impl(this.f));
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final void d() {
        this.getState().resetCachedX();
        if(this.getText$foundation_release().length() > 0) {
            Integer integer0 = this.getNextWordOffset();
            if(integer0 != null) {
                this.setCursor(integer0.intValue());
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
    }

    @NotNull
    public final BaseTextPreparedSelection deselect() {
        this.getState().resetCachedX();
        if(this.getText$foundation_release().length() > 0) {
            this.setCursor(TextRange.getEnd-impl(this.f));
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final void e() {
        this.getState().resetCachedX();
        if(this.getText$foundation_release().length() > 0) {
            int v = this.getPrecedingCharacterIndex();
            if(v != -1) {
                this.setCursor(v);
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
    }

    public final void f() {
        this.getState().resetCachedX();
        if(this.getText$foundation_release().length() > 0) {
            Integer integer0 = this.getPreviousWordOffset();
            if(integer0 != null) {
                this.setCursor(integer0.intValue());
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
    }

    @NotNull
    public final AnnotatedString getAnnotatedString() {
        return this.g;
    }

    @Nullable
    public final TextLayoutResult getLayoutResult() {
        return this.c;
    }

    @Nullable
    public final Integer getLineEndByOffset() {
        TextLayoutResult textLayoutResult0 = this.c;
        if(textLayoutResult0 != null) {
            int v = textLayoutResult0.getLineEnd(textLayoutResult0.getLineForOffset(this.d.originalToTransformed(TextRange.getMax-impl(this.f))), true);
            return this.d.transformedToOriginal(v);
        }
        return null;
    }

    @Nullable
    public final Integer getLineStartByOffset() {
        TextLayoutResult textLayoutResult0 = this.c;
        if(textLayoutResult0 != null) {
            int v = textLayoutResult0.getLineStart(textLayoutResult0.getLineForOffset(this.d.originalToTransformed(TextRange.getMin-impl(this.f))));
            return this.d.transformedToOriginal(v);
        }
        return null;
    }

    public final int getNextCharacterIndex() {
        return StringHelpers_androidKt.findFollowingBreak(this.g.getText(), TextRange.getEnd-impl(this.f));
    }

    @Nullable
    public final Integer getNextWordOffset() {
        long v1;
        TextLayoutResult textLayoutResult0 = this.c;
        if(textLayoutResult0 != null) {
            OffsetMapping offsetMapping0 = this.d;
            for(int v = offsetMapping0.originalToTransformed(TextRange.getEnd-impl(this.f)); true; ++v) {
                AnnotatedString annotatedString0 = this.a;
                if(v >= annotatedString0.length()) {
                    return annotatedString0.length();
                }
                v1 = textLayoutResult0.getWordBoundary--jx7JFs(c.coerceAtMost(v, this.getText$foundation_release().length() - 1));
                if(TextRange.getEnd-impl(v1) > v) {
                    break;
                }
            }
            return offsetMapping0.transformedToOriginal(TextRange.getEnd-impl(v1));
        }
        return null;
    }

    @NotNull
    public final OffsetMapping getOffsetMapping() {
        return this.d;
    }

    public final long getOriginalSelection-d9O1mEE() {
        return this.b;
    }

    @NotNull
    public final AnnotatedString getOriginalText() {
        return this.a;
    }

    public final int getPrecedingCharacterIndex() {
        return StringHelpers_androidKt.findPrecedingBreak(this.g.getText(), TextRange.getEnd-impl(this.f));
    }

    @Nullable
    public final Integer getPreviousWordOffset() {
        long v1;
        TextLayoutResult textLayoutResult0 = this.c;
        if(textLayoutResult0 != null) {
            OffsetMapping offsetMapping0 = this.d;
            for(int v = offsetMapping0.originalToTransformed(TextRange.getEnd-impl(this.f)); true; --v) {
                if(v <= 0) {
                    return 0;
                }
                v1 = textLayoutResult0.getWordBoundary--jx7JFs(c.coerceAtMost(v, this.getText$foundation_release().length() - 1));
                if(TextRange.getStart-impl(v1) < v) {
                    break;
                }
            }
            return offsetMapping0.transformedToOriginal(TextRange.getStart-impl(v1));
        }
        return null;
    }

    public final long getSelection-d9O1mEE() {
        return this.f;
    }

    @NotNull
    public final TextPreparedSelectionState getState() {
        return this.e;
    }

    @NotNull
    public final String getText$foundation_release() {
        return this.g.getText();
    }

    @NotNull
    public final BaseTextPreparedSelection moveCursorDownByLine() {
        if(this.getText$foundation_release().length() > 0) {
            TextLayoutResult textLayoutResult0 = this.c;
            if(textLayoutResult0 != null) {
                this.setCursor(this.b(textLayoutResult0, 1));
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final BaseTextPreparedSelection moveCursorLeft() {
        this.getState().resetCachedX();
        if(this.getText$foundation_release().length() > 0) {
            if(this.a()) {
                this.e();
            }
            else {
                this.c();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final BaseTextPreparedSelection moveCursorLeftByWord() {
        this.getState().resetCachedX();
        if(this.getText$foundation_release().length() > 0) {
            if(this.a()) {
                this.f();
            }
            else {
                this.d();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final BaseTextPreparedSelection moveCursorNextByParagraph() {
        this.getState().resetCachedX();
        if(this.getText$foundation_release().length() > 0) {
            int v = StringHelpersKt.findParagraphEnd(this.getText$foundation_release(), TextRange.getMax-impl(this.f));
            if(v == TextRange.getMax-impl(this.f) && v != this.getText$foundation_release().length()) {
                v = StringHelpersKt.findParagraphEnd(this.getText$foundation_release(), v + 1);
            }
            this.setCursor(v);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final BaseTextPreparedSelection moveCursorPrevByParagraph() {
        this.getState().resetCachedX();
        if(this.getText$foundation_release().length() > 0) {
            int v = StringHelpersKt.findParagraphStart(this.getText$foundation_release(), TextRange.getMin-impl(this.f));
            if(v == TextRange.getMin-impl(this.f) && v != 0) {
                v = StringHelpersKt.findParagraphStart(this.getText$foundation_release(), v - 1);
            }
            this.setCursor(v);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final BaseTextPreparedSelection moveCursorRight() {
        this.getState().resetCachedX();
        if(this.getText$foundation_release().length() > 0) {
            if(this.a()) {
                this.c();
            }
            else {
                this.e();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final BaseTextPreparedSelection moveCursorRightByWord() {
        this.getState().resetCachedX();
        if(this.getText$foundation_release().length() > 0) {
            if(this.a()) {
                this.d();
            }
            else {
                this.f();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final BaseTextPreparedSelection moveCursorToEnd() {
        this.getState().resetCachedX();
        if(this.getText$foundation_release().length() > 0) {
            this.setCursor(this.getText$foundation_release().length());
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final BaseTextPreparedSelection moveCursorToHome() {
        this.getState().resetCachedX();
        if(this.getText$foundation_release().length() > 0) {
            this.setCursor(0);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final BaseTextPreparedSelection moveCursorToLineEnd() {
        this.getState().resetCachedX();
        if(this.getText$foundation_release().length() > 0) {
            Integer integer0 = this.getLineEndByOffset();
            if(integer0 != null) {
                this.setCursor(integer0.intValue());
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final BaseTextPreparedSelection moveCursorToLineLeftSide() {
        this.getState().resetCachedX();
        if(this.getText$foundation_release().length() > 0) {
            if(this.a()) {
                this.moveCursorToLineStart();
            }
            else {
                this.moveCursorToLineEnd();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final BaseTextPreparedSelection moveCursorToLineRightSide() {
        this.getState().resetCachedX();
        if(this.getText$foundation_release().length() > 0) {
            if(this.a()) {
                this.moveCursorToLineEnd();
            }
            else {
                this.moveCursorToLineStart();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final BaseTextPreparedSelection moveCursorToLineStart() {
        this.getState().resetCachedX();
        if(this.getText$foundation_release().length() > 0) {
            Integer integer0 = this.getLineStartByOffset();
            if(integer0 != null) {
                this.setCursor(integer0.intValue());
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final BaseTextPreparedSelection moveCursorUpByLine() {
        if(this.getText$foundation_release().length() > 0) {
            TextLayoutResult textLayoutResult0 = this.c;
            if(textLayoutResult0 != null) {
                this.setCursor(this.b(textLayoutResult0, -1));
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final BaseTextPreparedSelection selectAll() {
        this.getState().resetCachedX();
        if(this.getText$foundation_release().length() > 0) {
            this.setSelection(0, this.getText$foundation_release().length());
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final BaseTextPreparedSelection selectMovement() {
        if(this.getText$foundation_release().length() > 0) {
            this.f = TextRangeKt.TextRange(TextRange.getStart-impl(this.b), TextRange.getEnd-impl(this.f));
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final void setAnnotatedString(@NotNull AnnotatedString annotatedString0) {
        this.g = annotatedString0;
    }

    public final void setCursor(int v) {
        this.setSelection(v, v);
    }

    public final void setSelection(int v, int v1) {
        this.f = TextRangeKt.TextRange(v, v1);
    }

    public final void setSelection-5zc-tL8(long v) {
        this.f = v;
    }
}

