package androidx.compose.ui.text.style;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.TextUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\n\b\u0007\u0018\u0000 \u001A2\u00020\u0001:\u0001\u001AB\u001B\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\t\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001A\u0010\f\u001A\u00020\u000B2\b\u0010\n\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000F\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0012\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017R\u001D\u0010\u0004\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001A\u0004\b\u0019\u0010\u0017\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u001B"}, d2 = {"Landroidx/compose/ui/text/style/TextIndent;", "", "Landroidx/compose/ui/unit/TextUnit;", "firstLine", "restLine", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-NB67dxo", "(JJ)Landroidx/compose/ui/text/style/TextIndent;", "copy", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "J", "getFirstLine-XSAIIZE", "()J", "b", "getRestLine-XSAIIZE", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TextIndent {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R \u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001A\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/style/TextIndent$Companion;", "", "Landroidx/compose/ui/text/style/TextIndent;", "None", "Landroidx/compose/ui/text/style/TextIndent;", "getNone", "()Landroidx/compose/ui/text/style/TextIndent;", "getNone$annotations", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final TextIndent getNone() {
            return TextIndent.c;
        }

        @Stable
        public static void getNone$annotations() {
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final long a;
    public final long b;
    public static final TextIndent c;

    static {
        TextIndent.Companion = new Companion(null);
        TextIndent.c = new TextIndent(0L, 0L, 3, null);
    }

    public TextIndent(long v, long v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v2 & 1) != 0) {
            v = 0x100000000L;
        }
        if((v2 & 2) != 0) {
            v1 = 0x100000000L;
        }
        this(v, v1, null);
    }

    public TextIndent(long v, long v1, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = v1;
    }

    @NotNull
    public final TextIndent copy-NB67dxo(long v, long v1) {
        return new TextIndent(v, v1, null);
    }

    public static TextIndent copy-NB67dxo$default(TextIndent textIndent0, long v, long v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = textIndent0.a;
        }
        if((v2 & 2) != 0) {
            v1 = textIndent0.b;
        }
        return textIndent0.copy-NB67dxo(v, v1);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TextIndent)) {
            return false;
        }
        return TextUnit.equals-impl0(this.a, ((TextIndent)object0).a) ? TextUnit.equals-impl0(this.b, ((TextIndent)object0).b) : false;
    }

    public final long getFirstLine-XSAIIZE() {
        return this.a;
    }

    public final long getRestLine-XSAIIZE() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return TextUnit.hashCode-impl(this.b) + TextUnit.hashCode-impl(this.a) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "TextIndent(firstLine=" + TextUnit.toString-impl(this.a) + ", restLine=" + TextUnit.toString-impl(this.b) + ')';
    }
}

