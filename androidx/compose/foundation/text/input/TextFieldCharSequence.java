package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.input.internal.ToCharArray_androidKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0000\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0001\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\b\u001A\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u00A2\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000E\u001A\u00020\r2\u0006\u0010\f\u001A\u00020\u000BH\u0096\u0002\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u001F\u0010\u0012\u001A\u00020\u00012\u0006\u0010\u0010\u001A\u00020\u000B2\u0006\u0010\u0011\u001A\u00020\u000BH\u0016\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u000F\u0010\u0015\u001A\u00020\u0014H\u0016\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u0017\u001A\u00020\u0001\u00A2\u0006\u0004\b\u0019\u0010\u001AJ-\u0010!\u001A\u00020 2\u0006\u0010\u001C\u001A\u00020\u001B2\u0006\u0010\u001D\u001A\u00020\u000B2\u0006\u0010\u001E\u001A\u00020\u000B2\u0006\u0010\u001F\u001A\u00020\u000B\u00A2\u0006\u0004\b!\u0010\"J\r\u0010#\u001A\u00020\u0018\u00A2\u0006\u0004\b#\u0010$J\u001A\u0010&\u001A\u00020\u00182\b\u0010\u0017\u001A\u0004\u0018\u00010%H\u0096\u0002\u00A2\u0006\u0004\b&\u0010\'J\u000F\u0010(\u001A\u00020\u000BH\u0016\u00A2\u0006\u0004\b(\u0010)R\u0017\u0010\u0002\u001A\u00020\u00018\u0006\u00A2\u0006\f\n\u0004\b*\u0010+\u001A\u0004\b,\u0010-R\u001D\u0010\u0004\u001A\u00020\u00038\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b.\u0010/\u001A\u0004\b0\u00101R\u001F\u0010\u0005\u001A\u0004\u0018\u00010\u00038\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b2\u00103\u001A\u0004\b4\u00105R%\u0010\b\u001A\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00068\u0006\u00A2\u0006\f\n\u0004\b6\u00107\u001A\u0004\b8\u00109R\u0014\u0010;\u001A\u00020\u000B8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b:\u0010)\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006<"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "", "text", "Landroidx/compose/ui/text/TextRange;", "selection", "composition", "Lkotlin/Pair;", "Landroidx/compose/foundation/text/input/TextHighlightType;", "highlight", "<init>", "(Ljava/lang/CharSequence;JLandroidx/compose/ui/text/TextRange;Lkotlin/Pair;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "index", "", "get", "(I)C", "startIndex", "endIndex", "subSequence", "(II)Ljava/lang/CharSequence;", "", "toString", "()Ljava/lang/String;", "other", "", "contentEquals", "(Ljava/lang/CharSequence;)Z", "", "destination", "destinationOffset", "sourceStartIndex", "sourceEndIndex", "", "toCharArray", "([CIII)V", "shouldShowSelection", "()Z", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Ljava/lang/CharSequence;", "getText", "()Ljava/lang/CharSequence;", "b", "J", "getSelection-d9O1mEE", "()J", "c", "Landroidx/compose/ui/text/TextRange;", "getComposition-MzsxiRA", "()Landroidx/compose/ui/text/TextRange;", "d", "Lkotlin/Pair;", "getHighlight", "()Lkotlin/Pair;", "getLength", "length", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TextFieldCharSequence implements CharSequence {
    public static final int $stable = 8;
    public final CharSequence a;
    public final long b;
    public final TextRange c;
    public final Pair d;

    public TextFieldCharSequence(CharSequence charSequence0, long v, TextRange textRange0, Pair pair0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 1) != 0) {
            charSequence0 = "";
        }
        if((v1 & 2) != 0) {
            v = 0L;
        }
        this(charSequence0, v, ((v1 & 4) == 0 ? textRange0 : null), ((v1 & 8) == 0 ? pair0 : null), null);
    }

    public TextFieldCharSequence(CharSequence charSequence0, long v, TextRange textRange0, Pair pair0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = charSequence0 instanceof TextFieldCharSequence ? ((TextFieldCharSequence)charSequence0).a : charSequence0;
        this.b = TextRangeKt.coerceIn-8ffj60Q(v, 0, charSequence0.length());
        Pair pair1 = null;
        this.c = textRange0 == null ? null : TextRange.box-impl(TextRangeKt.coerceIn-8ffj60Q(textRange0.unbox-impl(), 0, charSequence0.length()));
        if(pair0 != null) {
            pair1 = Pair.copy$default(pair0, null, TextRange.box-impl(TextRangeKt.coerceIn-8ffj60Q(((TextRange)pair0.getSecond()).unbox-impl(), 0, charSequence0.length())), 1, null);
        }
        this.d = pair1;
    }

    @Override
    public final char charAt(int v) {
        return this.get(v);
    }

    public final boolean contentEquals(@NotNull CharSequence charSequence0) {
        return p.contentEquals(this.a, charSequence0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null) {
            return false;
        }
        Class class0 = object0.getClass();
        if(TextFieldCharSequence.class != class0) {
            return false;
        }
        if(!TextRange.equals-impl0(this.b, ((TextFieldCharSequence)object0).b)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((TextFieldCharSequence)object0).c)) {
            return false;
        }
        return Intrinsics.areEqual(this.d, ((TextFieldCharSequence)object0).d) ? this.contentEquals(((TextFieldCharSequence)object0).a) : false;
    }

    public char get(int v) {
        return this.a.charAt(v);
    }

    @Nullable
    public final TextRange getComposition-MzsxiRA() {
        return this.c;
    }

    @Nullable
    public final Pair getHighlight() {
        return this.d;
    }

    public int getLength() {
        return this.a.length();
    }

    public final long getSelection-d9O1mEE() {
        return this.b;
    }

    @NotNull
    public final CharSequence getText() {
        return this.a;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        int v1 = TextRange.hashCode-impl(this.b);
        int v2 = 0;
        int v3 = this.c == null ? 0 : TextRange.hashCode-impl(this.c.unbox-impl());
        Pair pair0 = this.d;
        if(pair0 != null) {
            v2 = pair0.hashCode();
        }
        return ((v1 + v * 0x1F) * 0x1F + v3) * 0x1F + v2;
    }

    @Override
    public final int length() {
        return this.getLength();
    }

    public final boolean shouldShowSelection() {
        return this.d == null;
    }

    @Override
    @NotNull
    public CharSequence subSequence(int v, int v1) {
        return this.a.subSequence(v, v1);
    }

    public final void toCharArray(@NotNull char[] arr_c, int v, int v1, int v2) {
        ToCharArray_androidKt.toCharArray(this.a, arr_c, v, v1, v2);
    }

    @Override
    @NotNull
    public String toString() {
        return this.a.toString();
    }
}

