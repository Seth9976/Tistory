package androidx.compose.foundation.text.input.internal;

import a5.b;
import androidx.compose.foundation.text.input.TextHighlightType;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0000\u0018\u0000 P2\u00020\u0001:\u0001PB\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\b\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0006\u0010\tJ\r\u0010\u000B\u001A\u00020\n\u00A2\u0006\u0004\b\u000B\u0010\fJ\u0018\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u000E\u001A\u00020\rH\u0086\u0002\u00A2\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0012\u001A\u00020\r2\u0006\u0010\u0013\u001A\u00020\r2\u0006\u0010\u0003\u001A\u00020\u0014\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u001D\u0010\u0018\u001A\u00020\u00152\u0006\u0010\u0012\u001A\u00020\r2\u0006\u0010\u0013\u001A\u00020\r\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u001D\u0010\u001A\u001A\u00020\u00152\u0006\u0010\u0012\u001A\u00020\r2\u0006\u0010\u0013\u001A\u00020\r\u00A2\u0006\u0004\b\u001A\u0010\u0019J(\u0010\u001F\u001A\u00020\u00152\u0006\u0010\u001C\u001A\u00020\u001B2\u0006\u0010\u0012\u001A\u00020\r2\u0006\u0010\u0013\u001A\u00020\r\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\r\u0010 \u001A\u00020\u0015\u00A2\u0006\u0004\b \u0010!J\u001D\u0010\"\u001A\u00020\u00152\u0006\u0010\u0012\u001A\u00020\r2\u0006\u0010\u0013\u001A\u00020\r\u00A2\u0006\u0004\b\"\u0010\u0019J\r\u0010#\u001A\u00020\u0015\u00A2\u0006\u0004\b#\u0010!J\u000F\u0010$\u001A\u00020\bH\u0016\u00A2\u0006\u0004\b$\u0010%J\r\u0010&\u001A\u00020\u0002\u00A2\u0006\u0004\b&\u0010\'R\u0017\u0010-\u001A\u00020(8\u0006\u00A2\u0006\f\n\u0004\b)\u0010*\u001A\u0004\b+\u0010,R*\u00104\u001A\u00020\r2\u0006\u0010.\u001A\u00020\r8\u0006@BX\u0086\u000E\u00A2\u0006\u0012\n\u0004\b/\u00100\u001A\u0004\b1\u00102\"\u0004\b/\u00103R*\u00107\u001A\u00020\r2\u0006\u0010.\u001A\u00020\r8\u0006@BX\u0086\u000E\u00A2\u0006\u0012\n\u0004\b5\u00100\u001A\u0004\b6\u00102\"\u0004\b)\u00103R0\u0010>\u001A\u0010\u0012\u0004\u0012\u00020\u001B\u0012\u0004\u0012\u00020\u0004\u0018\u0001088\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b9\u0010:\u001A\u0004\b;\u0010<\"\u0004\b\u001F\u0010=R$\u0010B\u001A\u00020\r2\u0006\u0010?\u001A\u00020\r8\u0006@BX\u0086\u000E\u00A2\u0006\f\n\u0004\b@\u00100\u001A\u0004\bA\u00102R$\u0010E\u001A\u00020\r2\u0006\u0010?\u001A\u00020\r8\u0006@BX\u0086\u000E\u00A2\u0006\f\n\u0004\bC\u00100\u001A\u0004\bD\u00102R\u0019\u0010H\u001A\u0004\u0018\u00010\u00048F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\bF\u0010GR\u0017\u0010\u0005\u001A\u00020\u00048F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\bI\u0010JR$\u0010K\u001A\u00020\r2\u0006\u0010K\u001A\u00020\r8F@FX\u0086\u000E\u00A2\u0006\f\u001A\u0004\bL\u00102\"\u0004\bM\u00103R\u0011\u0010O\u001A\u00020\r8F\u00A2\u0006\u0006\u001A\u0004\bN\u00102\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006Q"}, d2 = {"Landroidx/compose/foundation/text/input/internal/EditingBuffer;", "", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/TextRange;", "selection", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "hasComposition", "()Z", "", "index", "", "get", "(I)C", "start", "end", "", "", "replace", "(IILjava/lang/CharSequence;)V", "delete", "(II)V", "setSelection", "Landroidx/compose/foundation/text/input/TextHighlightType;", "type", "setHighlight-K7f2yys", "(III)V", "setHighlight", "clearHighlight", "()V", "setComposition", "commitComposition", "toString", "()Ljava/lang/String;", "toAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/foundation/text/input/internal/ChangeTracker;", "b", "Landroidx/compose/foundation/text/input/internal/ChangeTracker;", "getChangeTracker", "()Landroidx/compose/foundation/text/input/internal/ChangeTracker;", "changeTracker", "value", "c", "I", "getSelectionStart", "()I", "(I)V", "selectionStart", "d", "getSelectionEnd", "selectionEnd", "Lkotlin/Pair;", "e", "Lkotlin/Pair;", "getHighlight", "()Lkotlin/Pair;", "(Lkotlin/Pair;)V", "highlight", "<set-?>", "f", "getCompositionStart", "compositionStart", "g", "getCompositionEnd", "compositionEnd", "getComposition-MzsxiRA", "()Landroidx/compose/ui/text/TextRange;", "composition", "getSelection-d9O1mEE", "()J", "cursor", "getCursor", "setCursor", "getLength", "length", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEditingBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditingBuffer.kt\nandroidx/compose/foundation/text/input/internal/EditingBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,423:1\n1#2:424\n*E\n"})
public final class EditingBuffer {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/text/input/internal/EditingBuffer$Companion;", "", "", "NOWHERE", "I", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = null;
    public static final int NOWHERE = -1;
    public final PartialGapBuffer a;
    public final ChangeTracker b;
    public int c;
    public int d;
    public Pair e;
    public int f;
    public int g;

    static {
        EditingBuffer.Companion = new Companion(null);
        EditingBuffer.$stable = 8;
    }

    public EditingBuffer(AnnotatedString annotatedString0, long v, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = new PartialGapBuffer(annotatedString0.getText());
        this.b = new ChangeTracker(null, 1, null);
        this.c = TextRange.getStart-impl(v);
        this.d = TextRange.getEnd-impl(v);
        this.f = -1;
        this.g = -1;
        this.a(TextRange.getStart-impl(v), TextRange.getEnd-impl(v));
    }

    public EditingBuffer(String s, long v, DefaultConstructorMarker defaultConstructorMarker0) {
        this(new AnnotatedString(s, null, null, 6, null), v, null);
    }

    public final void a(int v, int v1) {
        PartialGapBuffer partialGapBuffer0 = this.a;
        if(v >= 0 && v <= partialGapBuffer0.length()) {
            if(v1 >= 0 && v1 <= partialGapBuffer0.length()) {
                return;
            }
            StringBuilder stringBuilder0 = b.s(v1, "end (", ") offset is outside of text region ");
            stringBuilder0.append(partialGapBuffer0.length());
            throw new IndexOutOfBoundsException(stringBuilder0.toString());
        }
        StringBuilder stringBuilder1 = b.s(v, "start (", ") offset is outside of text region ");
        stringBuilder1.append(partialGapBuffer0.length());
        throw new IndexOutOfBoundsException(stringBuilder1.toString());
    }

    public final void b(int v) {
        if(v < 0) {
            throw new IllegalArgumentException(b.e(v, "Cannot set selectionEnd to a negative value: ").toString());
        }
        this.d = v;
        this.e = null;
    }

    public final void c(int v) {
        if(v < 0) {
            throw new IllegalArgumentException(("Cannot set selectionStart to a negative value: " + v).toString());
        }
        this.c = v;
        this.e = null;
    }

    public final void clearHighlight() {
        this.e = null;
    }

    public final void commitComposition() {
        this.f = -1;
        this.g = -1;
    }

    public final void delete(int v, int v1) {
        this.a(v, v1);
        long v2 = TextRangeKt.TextRange(v, v1);
        this.b.trackChange(v, v1, 0);
        PartialGapBuffer.replace$default(this.a, TextRange.getMin-impl(v2), TextRange.getMax-impl(v2), "", 0, 0, 24, null);
        long v3 = EditingBufferKt.updateRangeAfterDelete-pWDy79M(TextRangeKt.TextRange(this.c, this.d), v2);
        this.c(TextRange.getStart-impl(v3));
        this.b(TextRange.getEnd-impl(v3));
        if(this.hasComposition()) {
            long v4 = EditingBufferKt.updateRangeAfterDelete-pWDy79M(TextRangeKt.TextRange(this.f, this.g), v2);
            if(TextRange.getCollapsed-impl(v4)) {
                this.commitComposition();
            }
            else {
                this.f = TextRange.getMin-impl(v4);
                this.g = TextRange.getMax-impl(v4);
            }
        }
        this.e = null;
    }

    public final char get(int v) {
        return this.a.charAt(v);
    }

    @NotNull
    public final ChangeTracker getChangeTracker() {
        return this.b;
    }

    // 去混淆评级： 低(20)
    @Nullable
    public final TextRange getComposition-MzsxiRA() {
        return this.hasComposition() ? TextRange.box-impl(TextRangeKt.TextRange(this.f, this.g)) : null;
    }

    public final int getCompositionEnd() {
        return this.g;
    }

    public final int getCompositionStart() {
        return this.f;
    }

    public final int getCursor() {
        return this.c == this.d ? this.d : -1;
    }

    @Nullable
    public final Pair getHighlight() {
        return this.e;
    }

    public final int getLength() {
        return this.a.length();
    }

    public final long getSelection-d9O1mEE() {
        return TextRangeKt.TextRange(this.c, this.d);
    }

    public final int getSelectionEnd() {
        return this.d;
    }

    public final int getSelectionStart() {
        return this.c;
    }

    public final boolean hasComposition() {
        return this.f != -1;
    }

    public final void replace(int v, int v1, @NotNull CharSequence charSequence0) {
        this.a(v, v1);
        int v2 = Math.min(v, v1);
        int v3 = Math.max(v, v1);
        int v4 = 0;
        int v5;
        for(v5 = v2; true; ++v5) {
            PartialGapBuffer partialGapBuffer0 = this.a;
            if(v5 >= v3 || v4 >= charSequence0.length() || charSequence0.charAt(v4) != partialGapBuffer0.charAt(v5)) {
                break;
            }
            ++v4;
        }
        int v6 = charSequence0.length();
        int v7;
        for(v7 = v3; v7 > v2 && v6 > v4 && charSequence0.charAt(v6 - 1) == partialGapBuffer0.charAt(v7 - 1); --v7) {
            --v6;
        }
        this.b.trackChange(v5, v7, v6 - v4);
        PartialGapBuffer.replace$default(this.a, v2, v3, charSequence0, 0, 0, 24, null);
        this.c(charSequence0.length() + v2);
        this.b(charSequence0.length() + v2);
        this.f = -1;
        this.g = -1;
        this.e = null;
    }

    public final void setComposition(int v, int v1) {
        PartialGapBuffer partialGapBuffer0 = this.a;
        if(v >= 0 && v <= partialGapBuffer0.length()) {
            if(v1 >= 0 && v1 <= partialGapBuffer0.length()) {
                if(v >= v1) {
                    throw new IllegalArgumentException("Do not set reversed or empty range: " + v + " > " + v1);
                }
                this.f = v;
                this.g = v1;
                return;
            }
            StringBuilder stringBuilder0 = b.s(v1, "end (", ") offset is outside of text region ");
            stringBuilder0.append(partialGapBuffer0.length());
            throw new IndexOutOfBoundsException(stringBuilder0.toString());
        }
        StringBuilder stringBuilder1 = b.s(v, "start (", ") offset is outside of text region ");
        stringBuilder1.append(partialGapBuffer0.length());
        throw new IndexOutOfBoundsException(stringBuilder1.toString());
    }

    public final void setCursor(int v) {
        this.setSelection(v, v);
    }

    public final void setHighlight(@Nullable Pair pair0) {
        this.e = pair0;
    }

    public final void setHighlight-K7f2yys(int v, int v1, int v2) {
        if(v1 >= v2) {
            throw new IllegalArgumentException("Do not set reversed or empty range: " + v1 + " > " + v2);
        }
        int v3 = c.coerceIn(v1, 0, this.getLength());
        int v4 = c.coerceIn(v2, 0, this.getLength());
        this.e = new Pair(TextHighlightType.box-impl(v), TextRange.box-impl(TextRangeKt.TextRange(v3, v4)));
    }

    public final void setSelection(int v, int v1) {
        int v2 = c.coerceIn(v, 0, this.getLength());
        int v3 = c.coerceIn(v1, 0, this.getLength());
        this.c(v2);
        this.b(v3);
    }

    @NotNull
    public final AnnotatedString toAnnotatedString() {
        return new AnnotatedString(this.toString(), null, null, 6, null);
    }

    @Override
    @NotNull
    public String toString() {
        return this.a.toString();
    }
}

