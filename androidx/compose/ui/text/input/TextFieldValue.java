package androidx.compose.ui.text.input;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import j2.g;
import j2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B%\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB)\b\u0016\u0012\b\b\u0002\u0010\n\u001A\u00020\t\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\u000BJ0\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0004ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000E\u001A\u00020\u00002\u0006\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\u0005\u001A\u00020\u00042\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0004ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000FJ\u001A\u0010\u0012\u001A\u00020\u00112\b\u0010\u0010\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000F\u0010\u0015\u001A\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000F\u0010\u0017\u001A\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001CR\u001D\u0010\u0005\u001A\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010 R\u001F\u0010\u0006\u001A\u0004\u0018\u00010\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010$R\u0011\u0010\n\u001A\u00020\t8F¢\u0006\u0006\u001A\u0004\b%\u0010\u0018\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\'"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", "", "Landroidx/compose/ui/text/AnnotatedString;", "annotatedString", "Landroidx/compose/ui/text/TextRange;", "selection", "composition", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextRange;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "text", "(Ljava/lang/String;JLandroidx/compose/ui/text/TextRange;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-3r_uNRQ", "(Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextRange;)Landroidx/compose/ui/text/input/TextFieldValue;", "copy", "(Ljava/lang/String;JLandroidx/compose/ui/text/TextRange;)Landroidx/compose/ui/text/input/TextFieldValue;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Landroidx/compose/ui/text/AnnotatedString;", "getAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "b", "J", "getSelection-d9O1mEE", "()J", "c", "Landroidx/compose/ui/text/TextRange;", "getComposition-MzsxiRA", "()Landroidx/compose/ui/text/TextRange;", "getText", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TextFieldValue {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R#\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue$Companion;", "", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/input/TextFieldValue;", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Saver getSaver() {
            return TextFieldValue.d;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final AnnotatedString a;
    public final long b;
    public final TextRange c;
    public static final Saver d;

    static {
        TextFieldValue.Companion = new Companion(null);
        TextFieldValue.d = SaverKt.Saver(g.w, h.w);
    }

    public TextFieldValue(AnnotatedString annotatedString0, long v, TextRange textRange0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            v = 0L;
        }
        if((v1 & 4) != 0) {
            textRange0 = null;
        }
        this(annotatedString0, v, textRange0, null);
    }

    public TextFieldValue(AnnotatedString annotatedString0, long v, TextRange textRange0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = annotatedString0;
        this.b = TextRangeKt.coerceIn-8ffj60Q(v, 0, this.getText().length());
        this.c = textRange0 == null ? null : TextRange.box-impl(TextRangeKt.coerceIn-8ffj60Q(textRange0.unbox-impl(), 0, this.getText().length()));
    }

    public TextFieldValue(String s, long v, TextRange textRange0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 1) != 0) {
            s = "";
        }
        if((v1 & 2) != 0) {
            v = 0L;
        }
        if((v1 & 4) != 0) {
            textRange0 = null;
        }
        this(s, v, textRange0, null);
    }

    public TextFieldValue(String s, long v, TextRange textRange0, DefaultConstructorMarker defaultConstructorMarker0) {
        this(new AnnotatedString(s, null, null, 6, null), v, textRange0, null);
    }

    @NotNull
    public final TextFieldValue copy-3r_uNRQ(@NotNull AnnotatedString annotatedString0, long v, @Nullable TextRange textRange0) {
        return new TextFieldValue(annotatedString0, v, textRange0, null);
    }

    @NotNull
    public final TextFieldValue copy-3r_uNRQ(@NotNull String s, long v, @Nullable TextRange textRange0) {
        return new TextFieldValue(new AnnotatedString(s, null, null, 6, null), v, textRange0, null);
    }

    public static TextFieldValue copy-3r_uNRQ$default(TextFieldValue textFieldValue0, AnnotatedString annotatedString0, long v, TextRange textRange0, int v1, Object object0) {
        if((v1 & 1) != 0) {
            annotatedString0 = textFieldValue0.a;
        }
        if((v1 & 2) != 0) {
            v = textFieldValue0.b;
        }
        if((v1 & 4) != 0) {
            textRange0 = textFieldValue0.c;
        }
        return textFieldValue0.copy-3r_uNRQ(annotatedString0, v, textRange0);
    }

    public static TextFieldValue copy-3r_uNRQ$default(TextFieldValue textFieldValue0, String s, long v, TextRange textRange0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = textFieldValue0.b;
        }
        if((v1 & 4) != 0) {
            textRange0 = textFieldValue0.c;
        }
        return textFieldValue0.copy-3r_uNRQ(s, v, textRange0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof TextFieldValue ? TextRange.equals-impl0(this.b, ((TextFieldValue)object0).b) && Intrinsics.areEqual(this.c, ((TextFieldValue)object0).c) && Intrinsics.areEqual(this.a, ((TextFieldValue)object0).a) : false;
    }

    @NotNull
    public final AnnotatedString getAnnotatedString() {
        return this.a;
    }

    @Nullable
    public final TextRange getComposition-MzsxiRA() {
        return this.c;
    }

    public final long getSelection-d9O1mEE() {
        return this.b;
    }

    @NotNull
    public final String getText() {
        return this.a.getText();
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        int v1 = TextRange.hashCode-impl(this.b);
        return this.c == null ? (v1 + v * 0x1F) * 0x1F : (v1 + v * 0x1F) * 0x1F + TextRange.hashCode-impl(this.c.unbox-impl());
    }

    @Override
    @NotNull
    public String toString() {
        return "TextFieldValue(text=\'" + this.a + "\', selection=" + TextRange.toString-impl(this.b) + ", composition=" + this.c + ')';
    }
}

