package androidx.compose.ui.graphics.colorspace;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u001D\n\u0002\u0010\u0014\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001A\u0004\b\t\u0010\u0006R\u0017\u0010\r\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000B\u0010\u0004\u001A\u0004\b\f\u0010\u0006R\u0017\u0010\u0010\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000E\u0010\u0004\u001A\u0004\b\u000F\u0010\u0006R\u0017\u0010\u0013\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001A\u0004\b\u0012\u0010\u0006R\u0017\u0010\u0016\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001A\u0004\b\u0015\u0010\u0006R\u0017\u0010\u0019\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001A\u0004\b\u0018\u0010\u0006R\u0017\u0010\u001C\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u0004\u001A\u0004\b\u001B\u0010\u0006R\u0017\u0010\u001F\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u0004\u001A\u0004\b\u001E\u0010\u0006R\u001A\u0010%\u001A\u00020 8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010$¨\u0006&"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Illuminant;", "", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "a", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "getA", "()Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "A", "b", "getB", "B", "c", "getC", "C", "d", "getD50", "D50", "e", "getD55", "D55", "f", "getD60", "D60", "g", "getD65", "D65", "h", "getD75", "D75", "i", "getE", "E", "", "j", "[F", "getD50Xyz$ui_graphics_release", "()[F", "D50Xyz", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Illuminant {
    @NotNull
    public static final Illuminant INSTANCE;
    public static final WhitePoint a;
    public static final WhitePoint b;
    public static final WhitePoint c;
    public static final WhitePoint d;
    public static final WhitePoint e;
    public static final WhitePoint f;
    public static final WhitePoint g;
    public static final WhitePoint h;
    public static final WhitePoint i;
    public static final float[] j;

    static {
        Illuminant.INSTANCE = new Illuminant();  // 初始化器: Ljava/lang/Object;-><init>()V
        Illuminant.a = new WhitePoint(0.44757f, 0.40745f);
        Illuminant.b = new WhitePoint(0.34842f, 0.35161f);
        Illuminant.c = new WhitePoint(0.31006f, 0.31616f);
        Illuminant.d = new WhitePoint(0.34567f, 0.3585f);
        Illuminant.e = new WhitePoint(0.33242f, 0.34743f);
        Illuminant.f = new WhitePoint(0.32168f, 0.33767f);
        Illuminant.g = new WhitePoint(0.31271f, 0.32902f);
        Illuminant.h = new WhitePoint(0.29902f, 0.31485f);
        Illuminant.i = new WhitePoint(0.33333f, 0.33333f);
        Illuminant.j = new float[]{0.964212f, 1.0f, 0.825188f};
    }

    @NotNull
    public final WhitePoint getA() {
        return Illuminant.a;
    }

    @NotNull
    public final WhitePoint getB() {
        return Illuminant.b;
    }

    @NotNull
    public final WhitePoint getC() {
        return Illuminant.c;
    }

    @NotNull
    public final WhitePoint getD50() {
        return Illuminant.d;
    }

    @NotNull
    public final float[] getD50Xyz$ui_graphics_release() {
        return Illuminant.j;
    }

    @NotNull
    public final WhitePoint getD55() {
        return Illuminant.e;
    }

    @NotNull
    public final WhitePoint getD60() {
        return Illuminant.f;
    }

    @NotNull
    public final WhitePoint getD65() {
        return Illuminant.g;
    }

    @NotNull
    public final WhitePoint getD75() {
        return Illuminant.h;
    }

    @NotNull
    public final WhitePoint getE() {
        return Illuminant.i;
    }
}

