package androidx.compose.foundation.text.input;

import a5.b;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.text.input.internal.ChangeTracker;
import androidx.compose.foundation.text.input.internal.OffsetMappingCalculator;
import androidx.compose.foundation.text.input.internal.PartialGapBuffer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\b\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001MB3\b\u0000\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0003\u0012\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\b\u00A2\u0006\u0004\b\n\u0010\u000BJ%\u0010\u0012\u001A\u00020\u00112\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000E\u001A\u00020\f2\u0006\u0010\u0010\u001A\u00020\u000F\u00A2\u0006\u0004\b\u0012\u0010\u0013J;\u0010\u0012\u001A\u00020\u00112\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000E\u001A\u00020\f2\u0006\u0010\u0010\u001A\u00020\u000F2\b\b\u0002\u0010\u0014\u001A\u00020\f2\b\b\u0002\u0010\u0015\u001A\u00020\fH\u0000\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001B\u001A\u00020\u00112\u0006\u0010\u0018\u001A\u00020\u000FH\u0000\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u001D\u0010\u001C\u001A\u00060\u0001j\u0002`\u00022\b\u0010\u0010\u001A\u0004\u0018\u00010\u000FH\u0016\u00A2\u0006\u0004\b\u001C\u0010\u001DJ-\u0010\u001C\u001A\u00060\u0001j\u0002`\u00022\b\u0010\u0010\u001A\u0004\u0018\u00010\u000F2\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000E\u001A\u00020\fH\u0016\u00A2\u0006\u0004\b\u001C\u0010\u001EJ\u001B\u0010\u001C\u001A\u00060\u0001j\u0002`\u00022\u0006\u0010 \u001A\u00020\u001FH\u0016\u00A2\u0006\u0004\b\u001C\u0010!J\u0015\u0010#\u001A\u00020\u001F2\u0006\u0010\"\u001A\u00020\f\u00A2\u0006\u0004\b#\u0010$J\u000F\u0010&\u001A\u00020%H\u0016\u00A2\u0006\u0004\b&\u0010\'J\r\u0010(\u001A\u00020\u000F\u00A2\u0006\u0004\b(\u0010)J\r\u0010*\u001A\u00020\u0011\u00A2\u0006\u0004\b*\u0010+J\u0015\u0010,\u001A\u00020\u00112\u0006\u0010\"\u001A\u00020\f\u00A2\u0006\u0004\b,\u0010-J\u0015\u0010.\u001A\u00020\u00112\u0006\u0010\"\u001A\u00020\f\u00A2\u0006\u0004\b.\u0010-J(\u00104\u001A\u00020\u00032\b\b\u0002\u00100\u001A\u00020/2\n\b\u0002\u00101\u001A\u0004\u0018\u00010/H\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\b2\u00103R\u001A\u0010\u0007\u001A\u00020\u00038\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b5\u00106\u001A\u0004\b7\u00108R\u0011\u0010;\u001A\u00020\f8F\u00A2\u0006\u0006\u001A\u0004\b9\u0010:R\u0011\u0010=\u001A\u00020\u000F8F\u00A2\u0006\u0006\u001A\u0004\b<\u0010)R\u0017\u0010@\u001A\u00020/8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\b>\u0010?R\u001A\u0010E\u001A\u00020A8FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\bD\u0010+\u001A\u0004\bB\u0010CR\u0011\u0010G\u001A\u00020F8G\u00A2\u0006\u0006\u001A\u0004\bG\u0010HR*\u00100\u001A\u00020/2\u0006\u0010I\u001A\u00020/8F@FX\u0086\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\u001A\u0004\bJ\u0010?\"\u0004\bK\u0010L\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006N"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldBuffer;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "initialValue", "Landroidx/compose/foundation/text/input/internal/ChangeTracker;", "initialChanges", "originalValue", "Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;", "offsetMappingCalculator", "<init>", "(Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/internal/ChangeTracker;Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;)V", "", "start", "end", "", "text", "", "replace", "(IILjava/lang/CharSequence;)V", "textStart", "textEnd", "replace$foundation_release", "(IILjava/lang/CharSequence;II)V", "newText", "setTextIfChanged$foundation_release", "(Ljava/lang/CharSequence;)V", "setTextIfChanged", "append", "(Ljava/lang/CharSequence;)Ljava/lang/Appendable;", "(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;", "", "char", "(C)Ljava/lang/Appendable;", "index", "charAt", "(I)C", "", "toString", "()Ljava/lang/String;", "asCharSequence", "()Ljava/lang/CharSequence;", "revertAllChanges", "()V", "placeCursorBeforeCharAt", "(I)V", "placeCursorAfterCharAt", "Landroidx/compose/ui/text/TextRange;", "selection", "composition", "toTextFieldCharSequence-udt6zUU$foundation_release", "(JLandroidx/compose/ui/text/TextRange;)Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "toTextFieldCharSequence", "a", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "getOriginalValue$foundation_release", "()Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "getLength", "()I", "length", "getOriginalText", "originalText", "getOriginalSelection-d9O1mEE", "()J", "originalSelection", "Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;", "getChanges", "()Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;", "getChanges$annotations", "changes", "", "hasSelection", "()Z", "value", "getSelection-d9O1mEE", "setSelection-5zc-tL8", "(J)V", "ChangeList", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextFieldBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldBuffer.kt\nandroidx/compose/foundation/text/input/TextFieldBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TextFieldBuffer.kt\nandroidx/compose/foundation/text/input/TextFieldBufferKt\n*L\n1#1,548:1\n1#2:549\n505#3,43:550\n*S KotlinDebug\n*F\n+ 1 TextFieldBuffer.kt\nandroidx/compose/foundation/text/input/TextFieldBuffer\n*L\n181#1:550,43\n*E\n"})
public final class TextFieldBuffer implements Appendable {
    @ExperimentalFoundationApi
    @Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u001D\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\u0003H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u001D\u0010\u000B\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\u0003H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\nR\u0012\u0010\u0002\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005ø\u0001\u0002\u0082\u0002\u0011\n\u0002\b!\n\u0005\b¡\u001E0\u0001\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;", "", "changeCount", "", "getChangeCount", "()I", "getOriginalRange", "Landroidx/compose/ui/text/TextRange;", "changeIndex", "getOriginalRange--jx7JFs", "(I)J", "getRange", "getRange--jx7JFs", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public interface ChangeList {
        int getChangeCount();

        long getOriginalRange--jx7JFs(int arg1);

        long getRange--jx7JFs(int arg1);
    }

    public static final int $stable = 8;
    public final TextFieldCharSequence a;
    public final OffsetMappingCalculator b;
    public final PartialGapBuffer c;
    public ChangeTracker d;
    public long e;

    public TextFieldBuffer(@NotNull TextFieldCharSequence textFieldCharSequence0, @Nullable ChangeTracker changeTracker0, @NotNull TextFieldCharSequence textFieldCharSequence1, @Nullable OffsetMappingCalculator offsetMappingCalculator0) {
        this.a = textFieldCharSequence1;
        this.b = offsetMappingCalculator0;
        this.c = new PartialGapBuffer(textFieldCharSequence0);
        this.d = changeTracker0 == null ? null : new ChangeTracker(changeTracker0);
        this.e = textFieldCharSequence0.getSelection-d9O1mEE();
    }

    public TextFieldBuffer(TextFieldCharSequence textFieldCharSequence0, ChangeTracker changeTracker0, TextFieldCharSequence textFieldCharSequence1, OffsetMappingCalculator offsetMappingCalculator0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            changeTracker0 = null;
        }
        if((v & 4) != 0) {
            textFieldCharSequence1 = textFieldCharSequence0;
        }
        if((v & 8) != 0) {
            offsetMappingCalculator0 = null;
        }
        this(textFieldCharSequence0, changeTracker0, textFieldCharSequence1, offsetMappingCalculator0);
    }

    public final void a(int v, int v1, int v2) {
        int v7;
        ChangeTracker changeTracker0 = this.d;
        if(changeTracker0 == null) {
            changeTracker0 = new ChangeTracker(null, 1, null);
            this.d = changeTracker0;
        }
        changeTracker0.trackChange(v, v1, v2);
        OffsetMappingCalculator offsetMappingCalculator0 = this.b;
        if(offsetMappingCalculator0 != null) {
            offsetMappingCalculator0.recordEditOperation(v, v1, v2);
        }
        int v3 = Math.min(v, v1);
        int v4 = Math.max(v, v1);
        int v5 = TextRange.getMin-impl(this.getSelection-d9O1mEE());
        int v6 = TextRange.getMax-impl(this.getSelection-d9O1mEE());
        if(v6 < v3) {
            return;
        }
        if(v5 <= v3 && v4 <= v6) {
            v7 = v2 - (v4 - v3);
            if(v5 == v6) {
                v5 += v7;
            }
            v3 = v6 + v7;
        }
        else if(v5 > v3 && v6 < v4) {
            v3 += v2;
            v5 = v3;
        }
        else if(v5 >= v4) {
            v7 = v2 - (v4 - v3);
            v5 += v7;
            v3 = v6 + v7;
        }
        else if(v3 < v5) {
            v5 = v3 + v2;
            v3 = v2 - (v4 - v3) + v6;
        }
        this.e = TextRangeKt.TextRange(v5, v3);
    }

    @Override
    @NotNull
    public Appendable append(char c) {
        this.a(this.getLength(), this.getLength(), 1);
        int v = this.c.length();
        int v1 = this.c.length();
        PartialGapBuffer.replace$default(this.c, v, v1, String.valueOf(c), 0, 0, 24, null);
        return this;
    }

    @Override
    @NotNull
    public Appendable append(@Nullable CharSequence charSequence0) {
        if(charSequence0 != null) {
            this.a(this.getLength(), this.getLength(), charSequence0.length());
            int v = this.c.length();
            int v1 = this.c.length();
            PartialGapBuffer.replace$default(this.c, v, v1, charSequence0, 0, 0, 24, null);
        }
        return this;
    }

    @Override
    @NotNull
    public Appendable append(@Nullable CharSequence charSequence0, int v, int v1) {
        if(charSequence0 != null) {
            this.a(this.getLength(), this.getLength(), v1 - v);
            int v2 = this.c.length();
            int v3 = this.c.length();
            CharSequence charSequence1 = charSequence0.subSequence(v, v1);
            PartialGapBuffer.replace$default(this.c, v2, v3, charSequence1, 0, 0, 24, null);
        }
        return this;
    }

    @NotNull
    public final CharSequence asCharSequence() {
        return this.c;
    }

    public final void b(int v, boolean z, boolean z1) {
        int v1 = z1 ? this.getLength() : this.getLength() + 1;
        if((z ? 0 : -1) > v || v >= v1) {
            throw new IllegalArgumentException(b.p(q.u("Expected ", v, " to be in [", (z ? 0 : -1), ", "), v1, ')').toString());
        }
    }

    public final char charAt(int v) {
        return this.c.charAt(v);
    }

    @NotNull
    public final ChangeList getChanges() {
        ChangeTracker changeTracker0 = this.d;
        if(changeTracker0 == null) {
            changeTracker0 = new ChangeTracker(null, 1, null);
            this.d = changeTracker0;
        }
        return changeTracker0;
    }

    @ExperimentalFoundationApi
    public static void getChanges$annotations() {
    }

    public final int getLength() {
        return this.c.length();
    }

    public final long getOriginalSelection-d9O1mEE() {
        return this.a.getSelection-d9O1mEE();
    }

    @NotNull
    public final CharSequence getOriginalText() {
        return this.a.getText();
    }

    @NotNull
    public final TextFieldCharSequence getOriginalValue$foundation_release() {
        return this.a;
    }

    public final long getSelection-d9O1mEE() {
        return this.e;
    }

    @JvmName(name = "hasSelection")
    public final boolean hasSelection() {
        return !TextRange.getCollapsed-impl(this.getSelection-d9O1mEE());
    }

    public final void placeCursorAfterCharAt(int v) {
        this.b(v, false, true);
        this.e = TextRangeKt.TextRange(c.coerceAtMost(v + 1, this.getLength()));
    }

    public final void placeCursorBeforeCharAt(int v) {
        this.b(v, true, false);
        this.e = TextRangeKt.TextRange(v);
    }

    public final void replace(int v, int v1, @NotNull CharSequence charSequence0) {
        this.replace$foundation_release(v, v1, charSequence0, 0, charSequence0.length());
    }

    public final void replace$foundation_release(int v, int v1, @NotNull CharSequence charSequence0, int v2, int v3) {
        if(v > v1) {
            throw new IllegalArgumentException(("Expected start=" + v + " <= end=" + v1).toString());
        }
        if(v2 > v3) {
            throw new IllegalArgumentException(("Expected textStart=" + v2 + " <= textEnd=" + v3).toString());
        }
        this.a(v, v1, v3 - v2);
        this.c.replace(v, v1, charSequence0, v2, v3);
    }

    public static void replace$foundation_release$default(TextFieldBuffer textFieldBuffer0, int v, int v1, CharSequence charSequence0, int v2, int v3, int v4, Object object0) {
        if((v4 & 8) != 0) {
            v2 = 0;
        }
        if((v4 & 16) != 0) {
            v3 = charSequence0.length();
        }
        textFieldBuffer0.replace$foundation_release(v, v1, charSequence0, v2, v3);
    }

    public final void revertAllChanges() {
        this.replace(0, this.getLength(), this.a.toString());
        this.setSelection-5zc-tL8(this.a.getSelection-d9O1mEE());
        ChangeTracker changeTracker0 = this.d;
        if(changeTracker0 == null) {
            changeTracker0 = new ChangeTracker(null, 1, null);
            this.d = changeTracker0;
        }
        changeTracker0.clearChanges();
    }

    public final void setSelection-5zc-tL8(long v) {
        long v1 = TextRangeKt.TextRange(0, this.getLength());
        if(!TextRange.contains-5zc-tL8(v1, v)) {
            throw new IllegalArgumentException(("Expected " + TextRange.toString-impl(v) + " to be in " + TextRange.toString-impl(v1)).toString());
        }
        this.e = v;
    }

    public final void setTextIfChanged$foundation_release(@NotNull CharSequence charSequence0) {
        int v7;
        int v6;
        int v5;
        int v4;
        PartialGapBuffer partialGapBuffer0 = this.c;
        int v = partialGapBuffer0.length();
        int v1 = charSequence0.length();
        boolean z = false;
        if(partialGapBuffer0.length() <= 0 || charSequence0.length() <= 0) {
            v4 = v;
            v5 = v1;
            v6 = 0;
            v7 = 0;
        }
        else {
            int v2 = 0;
            int v3 = 0;
            boolean z1 = false;
            do {
                if(!z) {
                    if(partialGapBuffer0.charAt(v2) == charSequence0.charAt(v3)) {
                        ++v2;
                        ++v3;
                    }
                    else {
                        z = true;
                    }
                }
                if(!z1) {
                    if(partialGapBuffer0.charAt(v - 1) == charSequence0.charAt(v1 - 1)) {
                        --v;
                        --v1;
                    }
                    else {
                        z1 = true;
                    }
                }
            }
            while(v2 < v && v3 < v1 && (!z || !z1));
            v4 = v;
            v5 = v1;
            v6 = v2;
            v7 = v3;
        }
        if(v6 < v4 || v7 < v5) {
            this.replace$foundation_release(v6, v4, charSequence0, v7, v5);
        }
    }

    @Override
    @NotNull
    public String toString() {
        return this.c.toString();
    }

    @NotNull
    public final TextFieldCharSequence toTextFieldCharSequence-udt6zUU$foundation_release(long v, @Nullable TextRange textRange0) {
        return new TextFieldCharSequence(this.c.toString(), v, textRange0, null, 8, null);
    }

    public static TextFieldCharSequence toTextFieldCharSequence-udt6zUU$foundation_release$default(TextFieldBuffer textFieldBuffer0, long v, TextRange textRange0, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = textFieldBuffer0.getSelection-d9O1mEE();
        }
        if((v1 & 2) != 0) {
            textRange0 = null;
        }
        return textFieldBuffer0.toTextFieldCharSequence-udt6zUU$foundation_release(v, textRange0);
    }
}

