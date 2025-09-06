package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\u000B\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001A\u0010\u000E\u001A\u00020\r2\b\u0010\f\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0011\u001A\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0014\u001A\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019R\u001D\u0010\u0004\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001A\u0010\u0017\u001A\u0004\b\u001B\u0010\u0019R\u001D\u0010\u0006\u001A\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u0012\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u001F"}, d2 = {"Landroidx/compose/ui/text/Placeholder;", "", "Landroidx/compose/ui/unit/TextUnit;", "width", "height", "Landroidx/compose/ui/text/PlaceholderVerticalAlign;", "placeholderVerticalAlign", "<init>", "(JJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-K8Q-__8", "(JJI)Landroidx/compose/ui/text/Placeholder;", "copy", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "J", "getWidth-XSAIIZE", "()J", "b", "getHeight-XSAIIZE", "c", "I", "getPlaceholderVerticalAlign-J6kI3mc", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPlaceholder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Placeholder.kt\nandroidx/compose/ui/text/Placeholder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,137:1\n1#2:138\n*E\n"})
public final class Placeholder {
    public static final int $stable;
    public final long a;
    public final long b;
    public final int c;

    public Placeholder(long v, long v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        if(TextUnitKt.isUnspecified--R2X_6o(v)) {
            throw new IllegalArgumentException("width cannot be TextUnit.Unspecified");
        }
        if(TextUnitKt.isUnspecified--R2X_6o(v1)) {
            throw new IllegalArgumentException("height cannot be TextUnit.Unspecified");
        }
    }

    @NotNull
    public final Placeholder copy-K8Q-__8(long v, long v1, int v2) {
        return new Placeholder(v, v1, v2, null);
    }

    public static Placeholder copy-K8Q-__8$default(Placeholder placeholder0, long v, long v1, int v2, int v3, Object object0) {
        if((v3 & 1) != 0) {
            v = placeholder0.a;
        }
        if((v3 & 2) != 0) {
            v1 = placeholder0.b;
        }
        if((v3 & 4) != 0) {
            v2 = placeholder0.c;
        }
        return placeholder0.copy-K8Q-__8(v, v1, v2);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Placeholder)) {
            return false;
        }
        if(!TextUnit.equals-impl0(this.a, ((Placeholder)object0).a)) {
            return false;
        }
        return TextUnit.equals-impl0(this.b, ((Placeholder)object0).b) ? PlaceholderVerticalAlign.equals-impl0(this.c, ((Placeholder)object0).c) : false;
    }

    public final long getHeight-XSAIIZE() {
        return this.b;
    }

    public final int getPlaceholderVerticalAlign-J6kI3mc() {
        return this.c;
    }

    public final long getWidth-XSAIIZE() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return PlaceholderVerticalAlign.hashCode-impl(this.c) + (TextUnit.hashCode-impl(this.b) + TextUnit.hashCode-impl(this.a) * 0x1F) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "Placeholder(width=" + TextUnit.toString-impl(this.a) + ", height=" + TextUnit.toString-impl(this.b) + ", placeholderVerticalAlign=" + PlaceholderVerticalAlign.toString-impl(this.c) + ')';
    }
}

