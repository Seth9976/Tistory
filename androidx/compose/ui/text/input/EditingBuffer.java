package androidx.compose.ui.text.input;

import a5.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b3\b\u0007\u0018\u0000 H2\u00020\u0001:\u0001HB\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0010\u0012\u0006\u0010\u0003\u001A\u00020\b\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0006\u0010\tJ\u000F\u0010\r\u001A\u00020\nH\u0000\u00A2\u0006\u0004\b\u000B\u0010\fJ\u0018\u0010\u0013\u001A\u00020\u00102\u0006\u0010\u000F\u001A\u00020\u000EH\u0080\u0002\u00A2\u0006\u0004\b\u0011\u0010\u0012J\'\u0010\u0019\u001A\u00020\u00162\u0006\u0010\u0014\u001A\u00020\u000E2\u0006\u0010\u0015\u001A\u00020\u000E2\u0006\u0010\u0003\u001A\u00020\u0002H\u0000\u00A2\u0006\u0004\b\u0017\u0010\u0018J\'\u0010\u0019\u001A\u00020\u00162\u0006\u0010\u0014\u001A\u00020\u000E2\u0006\u0010\u0015\u001A\u00020\u000E2\u0006\u0010\u0003\u001A\u00020\bH\u0000\u00A2\u0006\u0004\b\u0017\u0010\u001AJ\u001F\u0010\u001D\u001A\u00020\u00162\u0006\u0010\u0014\u001A\u00020\u000E2\u0006\u0010\u0015\u001A\u00020\u000EH\u0000\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u001F\u0010\u001F\u001A\u00020\u00162\u0006\u0010\u0014\u001A\u00020\u000E2\u0006\u0010\u0015\u001A\u00020\u000EH\u0000\u00A2\u0006\u0004\b\u001E\u0010\u001CJ\u001F\u0010!\u001A\u00020\u00162\u0006\u0010\u0014\u001A\u00020\u000E2\u0006\u0010\u0015\u001A\u00020\u000EH\u0000\u00A2\u0006\u0004\b \u0010\u001CJ\u000F\u0010$\u001A\u00020\u0016H\u0000\u00A2\u0006\u0004\b\"\u0010#J\u000F\u0010&\u001A\u00020\u0016H\u0000\u00A2\u0006\u0004\b%\u0010#J\u000F\u0010\'\u001A\u00020\bH\u0016\u00A2\u0006\u0004\b\'\u0010(J\u000F\u0010+\u001A\u00020\u0002H\u0000\u00A2\u0006\u0004\b)\u0010*R*\u00102\u001A\u00020\u000E2\u0006\u0010,\u001A\u00020\u000E8\u0000@BX\u0080\u000E\u00A2\u0006\u0012\n\u0004\b-\u0010.\u001A\u0004\b/\u00100\"\u0004\b-\u00101R*\u00106\u001A\u00020\u000E2\u0006\u0010,\u001A\u00020\u000E8\u0000@BX\u0080\u000E\u00A2\u0006\u0012\n\u0004\b3\u0010.\u001A\u0004\b4\u00100\"\u0004\b5\u00101R$\u0010:\u001A\u00020\u000E2\u0006\u00107\u001A\u00020\u000E8\u0000@BX\u0080\u000E\u00A2\u0006\f\n\u0004\b8\u0010.\u001A\u0004\b9\u00100R$\u0010=\u001A\u00020\u000E2\u0006\u00107\u001A\u00020\u000E8\u0000@BX\u0080\u000E\u00A2\u0006\f\n\u0004\b;\u0010.\u001A\u0004\b<\u00100R\u001C\u0010@\u001A\u0004\u0018\u00010\u00048@X\u0080\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\b>\u0010?R\u001A\u0010\u0005\u001A\u00020\u00048@X\u0080\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\bA\u0010BR$\u0010C\u001A\u00020\u000E2\u0006\u0010C\u001A\u00020\u000E8@@@X\u0080\u000E\u00A2\u0006\f\u001A\u0004\bD\u00100\"\u0004\bE\u00101R\u0014\u0010G\u001A\u00020\u000E8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\bF\u00100\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006I"}, d2 = {"Landroidx/compose/ui/text/input/EditingBuffer;", "", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/TextRange;", "selection", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "hasComposition$ui_text_release", "()Z", "hasComposition", "", "index", "", "get$ui_text_release", "(I)C", "get", "start", "end", "", "replace$ui_text_release", "(IILandroidx/compose/ui/text/AnnotatedString;)V", "replace", "(IILjava/lang/String;)V", "delete$ui_text_release", "(II)V", "delete", "setSelection$ui_text_release", "setSelection", "setComposition$ui_text_release", "setComposition", "cancelComposition$ui_text_release", "()V", "cancelComposition", "commitComposition$ui_text_release", "commitComposition", "toString", "()Ljava/lang/String;", "toAnnotatedString$ui_text_release", "()Landroidx/compose/ui/text/AnnotatedString;", "toAnnotatedString", "value", "b", "I", "getSelectionStart$ui_text_release", "()I", "(I)V", "selectionStart", "c", "getSelectionEnd$ui_text_release", "a", "selectionEnd", "<set-?>", "d", "getCompositionStart$ui_text_release", "compositionStart", "e", "getCompositionEnd$ui_text_release", "compositionEnd", "getComposition-MzsxiRA$ui_text_release", "()Landroidx/compose/ui/text/TextRange;", "composition", "getSelection-d9O1mEE$ui_text_release", "()J", "cursor", "getCursor$ui_text_release", "setCursor$ui_text_release", "getLength$ui_text_release", "length", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEditingBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditingBuffer.kt\nandroidx/compose/ui/text/input/EditingBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,402:1\n1#2:403\n*E\n"})
public final class EditingBuffer {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/input/EditingBuffer$Companion;", "", "", "NOWHERE", "I", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = null;
    public static final int NOWHERE = -1;
    public final PartialGapBuffer a;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        EditingBuffer.Companion = new Companion(null);
        EditingBuffer.$stable = 8;
    }

    public EditingBuffer(AnnotatedString annotatedString0, long v, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = new PartialGapBuffer(annotatedString0.getText());
        this.b = TextRange.getMin-impl(v);
        this.c = TextRange.getMax-impl(v);
        this.d = -1;
        this.e = -1;
        int v1 = TextRange.getMin-impl(v);
        int v2 = TextRange.getMax-impl(v);
        if(v1 >= 0 && v1 <= annotatedString0.length()) {
            if(v2 >= 0 && v2 <= annotatedString0.length()) {
                if(v1 > v2) {
                    throw new IllegalArgumentException("Do not set reversed range: " + v1 + " > " + v2);
                }
                return;
            }
            StringBuilder stringBuilder0 = b.s(v2, "end (", ") offset is outside of text region ");
            stringBuilder0.append(annotatedString0.length());
            throw new IndexOutOfBoundsException(stringBuilder0.toString());
        }
        StringBuilder stringBuilder1 = b.s(v1, "start (", ") offset is outside of text region ");
        stringBuilder1.append(annotatedString0.length());
        throw new IndexOutOfBoundsException(stringBuilder1.toString());
    }

    public EditingBuffer(String s, long v, DefaultConstructorMarker defaultConstructorMarker0) {
        this(new AnnotatedString(s, null, null, 6, null), v, null);
    }

    public final void a(int v) {
        if(v < 0) {
            throw new IllegalArgumentException(("Cannot set selectionEnd to a negative value: " + v).toString());
        }
        this.c = v;
    }

    public final void b(int v) {
        if(v < 0) {
            throw new IllegalArgumentException(("Cannot set selectionStart to a negative value: " + v).toString());
        }
        this.b = v;
    }

    public final void cancelComposition$ui_text_release() {
        this.replace$ui_text_release(this.d, this.e, "");
        this.d = -1;
        this.e = -1;
    }

    public final void commitComposition$ui_text_release() {
        this.d = -1;
        this.e = -1;
    }

    public final void delete$ui_text_release(int v, int v1) {
        long v2 = TextRangeKt.TextRange(v, v1);
        this.a.replace(v, v1, "");
        long v3 = EditingBufferKt.updateRangeAfterDelete-pWDy79M(TextRangeKt.TextRange(this.b, this.c), v2);
        this.b(TextRange.getMin-impl(v3));
        this.a(TextRange.getMax-impl(v3));
        if(this.hasComposition$ui_text_release()) {
            long v4 = EditingBufferKt.updateRangeAfterDelete-pWDy79M(TextRangeKt.TextRange(this.d, this.e), v2);
            if(TextRange.getCollapsed-impl(v4)) {
                this.commitComposition$ui_text_release();
                return;
            }
            this.d = TextRange.getMin-impl(v4);
            this.e = TextRange.getMax-impl(v4);
        }
    }

    public final char get$ui_text_release(int v) {
        return this.a.get(v);
    }

    // 去混淆评级： 低(20)
    @Nullable
    public final TextRange getComposition-MzsxiRA$ui_text_release() {
        return this.hasComposition$ui_text_release() ? TextRange.box-impl(TextRangeKt.TextRange(this.d, this.e)) : null;
    }

    public final int getCompositionEnd$ui_text_release() {
        return this.e;
    }

    public final int getCompositionStart$ui_text_release() {
        return this.d;
    }

    public final int getCursor$ui_text_release() {
        return this.b == this.c ? this.c : -1;
    }

    public final int getLength$ui_text_release() {
        return this.a.getLength();
    }

    public final long getSelection-d9O1mEE$ui_text_release() {
        return TextRangeKt.TextRange(this.b, this.c);
    }

    public final int getSelectionEnd$ui_text_release() {
        return this.c;
    }

    public final int getSelectionStart$ui_text_release() {
        return this.b;
    }

    public final boolean hasComposition$ui_text_release() {
        return this.d != -1;
    }

    public final void replace$ui_text_release(int v, int v1, @NotNull AnnotatedString annotatedString0) {
        this.replace$ui_text_release(v, v1, annotatedString0.getText());
    }

    public final void replace$ui_text_release(int v, int v1, @NotNull String s) {
        PartialGapBuffer partialGapBuffer0 = this.a;
        if(v >= 0 && v <= partialGapBuffer0.getLength()) {
            if(v1 >= 0 && v1 <= partialGapBuffer0.getLength()) {
                if(v > v1) {
                    throw new IllegalArgumentException("Do not set reversed range: " + v + " > " + v1);
                }
                partialGapBuffer0.replace(v, v1, s);
                this.b(s.length() + v);
                this.a(s.length() + v);
                this.d = -1;
                this.e = -1;
                return;
            }
            StringBuilder stringBuilder0 = b.s(v1, "end (", ") offset is outside of text region ");
            stringBuilder0.append(partialGapBuffer0.getLength());
            throw new IndexOutOfBoundsException(stringBuilder0.toString());
        }
        StringBuilder stringBuilder1 = b.s(v, "start (", ") offset is outside of text region ");
        stringBuilder1.append(partialGapBuffer0.getLength());
        throw new IndexOutOfBoundsException(stringBuilder1.toString());
    }

    public final void setComposition$ui_text_release(int v, int v1) {
        PartialGapBuffer partialGapBuffer0 = this.a;
        if(v >= 0 && v <= partialGapBuffer0.getLength()) {
            if(v1 >= 0 && v1 <= partialGapBuffer0.getLength()) {
                if(v >= v1) {
                    throw new IllegalArgumentException("Do not set reversed or empty range: " + v + " > " + v1);
                }
                this.d = v;
                this.e = v1;
                return;
            }
            StringBuilder stringBuilder0 = b.s(v1, "end (", ") offset is outside of text region ");
            stringBuilder0.append(partialGapBuffer0.getLength());
            throw new IndexOutOfBoundsException(stringBuilder0.toString());
        }
        StringBuilder stringBuilder1 = b.s(v, "start (", ") offset is outside of text region ");
        stringBuilder1.append(partialGapBuffer0.getLength());
        throw new IndexOutOfBoundsException(stringBuilder1.toString());
    }

    public final void setCursor$ui_text_release(int v) {
        this.setSelection$ui_text_release(v, v);
    }

    public final void setSelection$ui_text_release(int v, int v1) {
        PartialGapBuffer partialGapBuffer0 = this.a;
        if(v >= 0 && v <= partialGapBuffer0.getLength()) {
            if(v1 >= 0 && v1 <= partialGapBuffer0.getLength()) {
                if(v > v1) {
                    throw new IllegalArgumentException("Do not set reversed range: " + v + " > " + v1);
                }
                this.b(v);
                this.a(v1);
                return;
            }
            StringBuilder stringBuilder0 = b.s(v1, "end (", ") offset is outside of text region ");
            stringBuilder0.append(partialGapBuffer0.getLength());
            throw new IndexOutOfBoundsException(stringBuilder0.toString());
        }
        StringBuilder stringBuilder1 = b.s(v, "start (", ") offset is outside of text region ");
        stringBuilder1.append(partialGapBuffer0.getLength());
        throw new IndexOutOfBoundsException(stringBuilder1.toString());
    }

    @NotNull
    public final AnnotatedString toAnnotatedString$ui_text_release() {
        return new AnnotatedString(this.toString(), null, null, 6, null);
    }

    @Override
    @NotNull
    public String toString() {
        return this.a.toString();
    }
}

