package androidx.compose.ui.text.android.animation;

import a5.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0002\u0012\u0006\u0010\b\u001A\u00020\u0002\u00A2\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000E\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u000E\u0010\fJ\u0010\u0010\u000F\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u000F\u0010\fJ\u0010\u0010\u0010\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0011\u0010\fJL\u0010\u0012\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u0002H\u00C6\u0001\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001A\u00020\u0014H\u00D6\u0001\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b\u0017\u0010\fJ\u001A\u0010\u001A\u001A\u00020\u00192\b\u0010\u0018\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b\u001A\u0010\u001BR\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\fR\u0017\u0010\u0004\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u001F\u0010\u001D\u001A\u0004\b \u0010\fR\u0017\u0010\u0005\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b!\u0010\u001D\u001A\u0004\b\"\u0010\fR\u0017\u0010\u0006\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b#\u0010\u001D\u001A\u0004\b$\u0010\fR\u0017\u0010\u0007\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b%\u0010\u001D\u001A\u0004\b&\u0010\fR\u0017\u0010\b\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\'\u0010\u001D\u001A\u0004\b(\u0010\f\u00A8\u0006)"}, d2 = {"Landroidx/compose/ui/text/android/animation/Segment;", "", "", "startOffset", "endOffset", "left", "top", "right", "bottom", "<init>", "(IIIIII)V", "component1", "()I", "component2", "component3", "component4", "component5", "component6", "copy", "(IIIIII)Landroidx/compose/ui/text/android/animation/Segment;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getStartOffset", "b", "getEndOffset", "c", "getLeft", "d", "getTop", "e", "getRight", "f", "getBottom", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Segment {
    public static final int $stable;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public Segment(int v, int v1, int v2, int v3, int v4, int v5) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
        this.f = v5;
    }

    public final int component1() {
        return this.a;
    }

    public final int component2() {
        return this.b;
    }

    public final int component3() {
        return this.c;
    }

    public final int component4() {
        return this.d;
    }

    public final int component5() {
        return this.e;
    }

    public final int component6() {
        return this.f;
    }

    @NotNull
    public final Segment copy(int v, int v1, int v2, int v3, int v4, int v5) {
        return new Segment(v, v1, v2, v3, v4, v5);
    }

    public static Segment copy$default(Segment segment0, int v, int v1, int v2, int v3, int v4, int v5, int v6, Object object0) {
        if((v6 & 1) != 0) {
            v = segment0.a;
        }
        if((v6 & 2) != 0) {
            v1 = segment0.b;
        }
        if((v6 & 4) != 0) {
            v2 = segment0.c;
        }
        if((v6 & 8) != 0) {
            v3 = segment0.d;
        }
        if((v6 & 16) != 0) {
            v4 = segment0.e;
        }
        if((v6 & 0x20) != 0) {
            v5 = segment0.f;
        }
        return segment0.copy(v, v1, v2, v3, v4, v5);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Segment)) {
            return false;
        }
        if(this.a != ((Segment)object0).a) {
            return false;
        }
        if(this.b != ((Segment)object0).b) {
            return false;
        }
        if(this.c != ((Segment)object0).c) {
            return false;
        }
        if(this.d != ((Segment)object0).d) {
            return false;
        }
        return this.e == ((Segment)object0).e ? this.f == ((Segment)object0).f : false;
    }

    public final int getBottom() {
        return this.f;
    }

    public final int getEndOffset() {
        return this.b;
    }

    public final int getLeft() {
        return this.c;
    }

    public final int getRight() {
        return this.e;
    }

    public final int getStartOffset() {
        return this.a;
    }

    public final int getTop() {
        return this.d;
    }

    @Override
    public int hashCode() {
        return this.f + a.c(this.e, a.c(this.d, a.c(this.c, a.c(this.b, this.a * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Segment(startOffset=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", endOffset=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", left=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", top=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", right=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", bottom=");
        return b.p(stringBuilder0, this.f, ')');
    }
}

