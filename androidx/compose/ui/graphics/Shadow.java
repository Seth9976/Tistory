package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Immutable
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0015\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B%\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001A\u0010\f\u001A\u00020\u000B2\b\u0010\n\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000F\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0012\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J.\u0010\u0016\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R&\u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u0019\u0010\u001AR&\u0010\u0005\u001A\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001D\u0010\u0018\u0012\u0004\b\u001F\u0010\u001C\u001A\u0004\b\u001E\u0010\u001AR \u0010\u0007\u001A\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b$\u0010\u001C\u001A\u0004\b\"\u0010#\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006&"}, d2 = {"Landroidx/compose/ui/graphics/Shadow;", "", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/ui/geometry/Offset;", "offset", "", "blurRadius", "<init>", "(JJFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy-qcb84PM", "(JJF)Landroidx/compose/ui/graphics/Shadow;", "copy", "a", "J", "getColor-0d7_KjU", "()J", "getColor-0d7_KjU$annotations", "()V", "b", "getOffset-F1C5BW0", "getOffset-F1C5BW0$annotations", "c", "F", "getBlurRadius", "()F", "getBlurRadius$annotations", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Shadow {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R \u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001A\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/ui/graphics/Shadow$Companion;", "", "Landroidx/compose/ui/graphics/Shadow;", "None", "Landroidx/compose/ui/graphics/Shadow;", "getNone", "()Landroidx/compose/ui/graphics/Shadow;", "getNone$annotations", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Shadow getNone() {
            return Shadow.d;
        }

        @Stable
        public static void getNone$annotations() {
        }
    }

    @NotNull
    public static final Companion Companion;
    public final long a;
    public final long b;
    public final float c;
    public static final Shadow d;

    static {
        Shadow.Companion = new Companion(null);
        Shadow.d = new Shadow(0L, 0L, 0.0f, 7, null);
    }

    public Shadow(long v, long v1, float f, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v2 & 1) != 0) {
            v = 0xFF00000000000000L;
        }
        if((v2 & 2) != 0) {
            v1 = 0L;
        }
        if((v2 & 4) != 0) {
            f = 0.0f;
        }
        this(v, v1, f, null);
    }

    public Shadow(long v, long v1, float f, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = v1;
        this.c = f;
    }

    @NotNull
    public final Shadow copy-qcb84PM(long v, long v1, float f) {
        return new Shadow(v, v1, f, null);
    }

    public static Shadow copy-qcb84PM$default(Shadow shadow0, long v, long v1, float f, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = shadow0.a;
        }
        if((v2 & 2) != 0) {
            v1 = shadow0.b;
        }
        if((v2 & 4) != 0) {
            f = shadow0.c;
        }
        return shadow0.copy-qcb84PM(v, v1, f);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Shadow)) {
            return false;
        }
        if(!Color.equals-impl0(this.a, ((Shadow)object0).a)) {
            return false;
        }
        return Offset.equals-impl0(this.b, ((Shadow)object0).b) ? this.c == ((Shadow)object0).c : false;
    }

    public final float getBlurRadius() {
        return this.c;
    }

    @Stable
    public static void getBlurRadius$annotations() {
    }

    public final long getColor-0d7_KjU() {
        return this.a;
    }

    @Stable
    public static void getColor-0d7_KjU$annotations() {
    }

    public final long getOffset-F1C5BW0() {
        return this.b;
    }

    @Stable
    public static void getOffset-F1C5BW0$annotations() {
    }

    @Override
    public int hashCode() {
        return Float.hashCode(this.c) + (Offset.hashCode-impl(this.b) + Color.hashCode-impl(this.a) * 0x1F) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Shadow(color=");
        a.x(this.a, ", offset=", stringBuilder0);
        stringBuilder0.append(Offset.toString-impl(this.b));
        stringBuilder0.append(", blurRadius=");
        return a.n(stringBuilder0, this.c, ')');
    }
}

