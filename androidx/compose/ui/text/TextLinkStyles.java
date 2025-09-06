package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u000E\u0010\u000FR\u0019\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001A\u0004\b\u0015\u0010\u0013R\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001A\u0004\b\u0017\u0010\u0013R\u0019\u0010\u0006\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001A\u0004\b\u0019\u0010\u0013¨\u0006\u001A"}, d2 = {"Landroidx/compose/ui/text/TextLinkStyles;", "", "Landroidx/compose/ui/text/SpanStyle;", "style", "focusedStyle", "hoveredStyle", "pressedStyle", "<init>", "(Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/SpanStyle;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Landroidx/compose/ui/text/SpanStyle;", "getStyle", "()Landroidx/compose/ui/text/SpanStyle;", "b", "getFocusedStyle", "c", "getHoveredStyle", "d", "getPressedStyle", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TextLinkStyles {
    public static final int $stable;
    public final SpanStyle a;
    public final SpanStyle b;
    public final SpanStyle c;
    public final SpanStyle d;

    public TextLinkStyles() {
        this(null, null, null, null, 15, null);
    }

    public TextLinkStyles(@Nullable SpanStyle spanStyle0, @Nullable SpanStyle spanStyle1, @Nullable SpanStyle spanStyle2, @Nullable SpanStyle spanStyle3) {
        this.a = spanStyle0;
        this.b = spanStyle1;
        this.c = spanStyle2;
        this.d = spanStyle3;
    }

    public TextLinkStyles(SpanStyle spanStyle0, SpanStyle spanStyle1, SpanStyle spanStyle2, SpanStyle spanStyle3, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            spanStyle0 = null;
        }
        if((v & 2) != 0) {
            spanStyle1 = null;
        }
        if((v & 4) != 0) {
            spanStyle2 = null;
        }
        if((v & 8) != 0) {
            spanStyle3 = null;
        }
        this(spanStyle0, spanStyle1, spanStyle2, spanStyle3);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null || !(object0 instanceof TextLinkStyles) || !Intrinsics.areEqual(this.a, ((TextLinkStyles)object0).a)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((TextLinkStyles)object0).b)) {
            return false;
        }
        return Intrinsics.areEqual(this.c, ((TextLinkStyles)object0).c) ? Intrinsics.areEqual(this.d, ((TextLinkStyles)object0).d) : false;
    }

    @Nullable
    public final SpanStyle getFocusedStyle() {
        return this.b;
    }

    @Nullable
    public final SpanStyle getHoveredStyle() {
        return this.c;
    }

    @Nullable
    public final SpanStyle getPressedStyle() {
        return this.d;
    }

    @Nullable
    public final SpanStyle getStyle() {
        return this.a;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        SpanStyle spanStyle0 = this.d;
        if(spanStyle0 != null) {
            v = spanStyle0.hashCode();
        }
        return ((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v;
    }
}

