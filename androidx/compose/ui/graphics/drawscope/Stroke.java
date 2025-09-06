package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0013\u0018\u0000 \'2\u00020\u0001:\u0001\'B;\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0005\u0012\b\b\u0002\u0010\b\u001A\u00020\u0007\u0012\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\t¢\u0006\u0004\b\u000B\u0010\fJ\u001A\u0010\u0010\u001A\u00020\u000F2\b\u0010\u000E\u001A\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0013\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000F\u0010\u0016\u001A\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001BR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u0019\u001A\u0004\b\u001D\u0010\u001BR\u001D\u0010\u0006\u001A\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010\u0014R\u001D\u0010\b\u001A\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b!\u0010\u001F\u001A\u0004\b\"\u0010\u0014R\u0019\u0010\n\u001A\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b%\u0010&\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Landroidx/compose/ui/graphics/drawscope/Stroke;", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "", "width", "miter", "Landroidx/compose/ui/graphics/StrokeCap;", "cap", "Landroidx/compose/ui/graphics/StrokeJoin;", "join", "Landroidx/compose/ui/graphics/PathEffect;", "pathEffect", "<init>", "(FFIILandroidx/compose/ui/graphics/PathEffect;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "F", "getWidth", "()F", "b", "getMiter", "c", "I", "getCap-KaPHkGw", "d", "getJoin-LxFBmk8", "e", "Landroidx/compose/ui/graphics/PathEffect;", "getPathEffect", "()Landroidx/compose/ui/graphics/PathEffect;", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Stroke extends DrawStyle {
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u001D\u0010\b\u001A\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001A\u0004\b\t\u0010\u0006R\u0014\u0010\u000B\u001A\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000B\u0010\fR\u0014\u0010\r\u001A\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\f\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u000E"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/Stroke$Companion;", "", "Landroidx/compose/ui/graphics/StrokeCap;", "DefaultCap", "I", "getDefaultCap-KaPHkGw", "()I", "Landroidx/compose/ui/graphics/StrokeJoin;", "DefaultJoin", "getDefaultJoin-LxFBmk8", "", "DefaultMiter", "F", "HairlineWidth", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final int getDefaultCap-KaPHkGw() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getDefaultJoin-LxFBmk8() {
            return 0;
        }
    }

    @NotNull
    public static final Companion Companion = null;
    public static final float DefaultMiter = 4.0f;
    public static final float HairlineWidth;
    public final float a;
    public final float b;
    public final int c;
    public final int d;
    public final PathEffect e;
    public static final int f;
    public static final int g;

    static {
        Stroke.Companion = new Companion(null);
        Stroke.f = 0;
        Stroke.g = 0;
    }

    public Stroke(float f, float f1, int v, int v1, PathEffect pathEffect0, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v2 & 1) != 0) {
            f = 0.0f;
        }
        if((v2 & 2) != 0) {
            f1 = 4.0f;
        }
        if((v2 & 4) != 0) {
            v = Stroke.f;
        }
        if((v2 & 8) != 0) {
            v1 = Stroke.g;
        }
        if((v2 & 16) != 0) {
            pathEffect0 = null;
        }
        this(f, f1, v, v1, pathEffect0, null);
    }

    public Stroke(float f, float f1, int v, int v1, PathEffect pathEffect0, DefaultConstructorMarker defaultConstructorMarker0) {
        super(null);
        this.a = f;
        this.b = f1;
        this.c = v;
        this.d = v1;
        this.e = pathEffect0;
    }

    public static final int access$getDefaultCap$cp() [...] // 潜在的解密器

    public static final int access$getDefaultJoin$cp() [...] // 潜在的解密器

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Stroke)) {
            return false;
        }
        if(this.a != ((Stroke)object0).a || this.b != ((Stroke)object0).b || !StrokeCap.equals-impl0(this.c, ((Stroke)object0).c)) {
            return false;
        }
        return StrokeJoin.equals-impl0(this.d, ((Stroke)object0).d) ? Intrinsics.areEqual(this.e, ((Stroke)object0).e) : false;
    }

    public final int getCap-KaPHkGw() {
        return this.c;
    }

    public final int getJoin-LxFBmk8() {
        return this.d;
    }

    public final float getMiter() {
        return this.b;
    }

    @Nullable
    public final PathEffect getPathEffect() {
        return this.e;
    }

    public final float getWidth() {
        return this.a;
    }

    @Override
    public int hashCode() {
        int v = a.b(this.b, Float.hashCode(this.a) * 0x1F, 0x1F);
        int v1 = StrokeCap.hashCode-impl(this.c);
        int v2 = StrokeJoin.hashCode-impl(this.d);
        return this.e == null ? (v2 + (v1 + v) * 0x1F) * 0x1F : (v2 + (v1 + v) * 0x1F) * 0x1F + this.e.hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        return "Stroke(width=" + this.a + ", miter=" + this.b + ", cap=" + StrokeCap.toString-impl(this.c) + ", join=" + StrokeJoin.toString-impl(this.d) + ", pathEffect=" + this.e + ')';
    }
}

