package androidx.compose.animation.core;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import t.j;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\bi\"\u0017\u0010\u0005\u001A\u00020\u00008\u0006\u00A2\u0006\f\n\u0004\b\u0001\u0010\u0002\u001A\u0004\b\u0003\u0010\u0004\"\u0017\u0010\b\u001A\u00020\u00008\u0006\u00A2\u0006\f\n\u0004\b\u0006\u0010\u0002\u001A\u0004\b\u0007\u0010\u0004\"\u0017\u0010\u000B\u001A\u00020\u00008\u0006\u00A2\u0006\f\n\u0004\b\t\u0010\u0002\u001A\u0004\b\n\u0010\u0004\"\u0017\u0010\u000E\u001A\u00020\u00008\u0006\u00A2\u0006\f\n\u0004\b\f\u0010\u0002\u001A\u0004\b\r\u0010\u0004\"\u0017\u0010\u0011\u001A\u00020\u00008\u0006\u00A2\u0006\f\n\u0004\b\u000F\u0010\u0002\u001A\u0004\b\u0010\u0010\u0004\"\u0017\u0010\u0014\u001A\u00020\u00008\u0006\u00A2\u0006\f\n\u0004\b\u0012\u0010\u0002\u001A\u0004\b\u0013\u0010\u0004\"\u0017\u0010\u0017\u001A\u00020\u00008\u0006\u00A2\u0006\f\n\u0004\b\u0015\u0010\u0002\u001A\u0004\b\u0016\u0010\u0004\"\u0017\u0010\u001A\u001A\u00020\u00008\u0006\u00A2\u0006\f\n\u0004\b\u0018\u0010\u0002\u001A\u0004\b\u0019\u0010\u0004\"\u0017\u0010\u001D\u001A\u00020\u00008\u0006\u00A2\u0006\f\n\u0004\b\u001B\u0010\u0002\u001A\u0004\b\u001C\u0010\u0004\"\u0017\u0010 \u001A\u00020\u00008\u0006\u00A2\u0006\f\n\u0004\b\u001E\u0010\u0002\u001A\u0004\b\u001F\u0010\u0004\"\u0017\u0010#\u001A\u00020\u00008\u0006\u00A2\u0006\f\n\u0004\b!\u0010\u0002\u001A\u0004\b\"\u0010\u0004\"\u0017\u0010&\u001A\u00020\u00008\u0006\u00A2\u0006\f\n\u0004\b$\u0010\u0002\u001A\u0004\b%\u0010\u0004\"\u0017\u0010)\u001A\u00020\u00008\u0006\u00A2\u0006\f\n\u0004\b\'\u0010\u0002\u001A\u0004\b(\u0010\u0004\"\u0017\u0010,\u001A\u00020\u00008\u0006\u00A2\u0006\f\n\u0004\b*\u0010\u0002\u001A\u0004\b+\u0010\u0004\"\u0017\u0010/\u001A\u00020\u00008\u0006\u00A2\u0006\f\n\u0004\b-\u0010\u0002\u001A\u0004\b.\u0010\u0004\"\u0017\u00102\u001A\u00020\u00008\u0006\u00A2\u0006\f\n\u0004\b0\u0010\u0002\u001A\u0004\b1\u0010\u0004\"\u0017\u00105\u001A\u00020\u00008\u0006\u00A2\u0006\f\n\u0004\b3\u0010\u0002\u001A\u0004\b4\u0010\u0004\"\u0017\u00108\u001A\u00020\u00008\u0006\u00A2\u0006\f\n\u0004\b6\u0010\u0002\u001A\u0004\b7\u0010\u0004\"\u0017\u0010;\u001A\u00020\u00008\u0006\u00A2\u0006\f\n\u0004\b9\u0010\u0002\u001A\u0004\b:\u0010\u0004\"\u0017\u0010>\u001A\u00020\u00008\u0006\u00A2\u0006\f\n\u0004\b<\u0010\u0002\u001A\u0004\b=\u0010\u0004\"\u0017\u0010A\u001A\u00020\u00008\u0006\u00A2\u0006\f\n\u0004\b?\u0010\u0002\u001A\u0004\b@\u0010\u0004\"\u0017\u0010D\u001A\u00020\u00008\u0006\u00A2\u0006\f\n\u0004\bB\u0010\u0002\u001A\u0004\bC\u0010\u0004\"\u0017\u0010G\u001A\u00020\u00008\u0006\u00A2\u0006\f\n\u0004\bE\u0010\u0002\u001A\u0004\bF\u0010\u0004\"\u0017\u0010J\u001A\u00020\u00008\u0006\u00A2\u0006\f\n\u0004\bH\u0010\u0002\u001A\u0004\bI\u0010\u0004\"\u0017\u0010M\u001A\u00020\u00008\u0006\u00A2\u0006\f\n\u0004\bK\u0010\u0002\u001A\u0004\bL\u0010\u0004\"\u0017\u0010P\u001A\u00020\u00008\u0006\u00A2\u0006\f\n\u0004\bN\u0010\u0002\u001A\u0004\bO\u0010\u0004\"\u0017\u0010S\u001A\u00020\u00008\u0006\u00A2\u0006\f\n\u0004\bQ\u0010\u0002\u001A\u0004\bR\u0010\u0004\"\u0017\u0010V\u001A\u00020\u00008\u0006\u00A2\u0006\f\n\u0004\bT\u0010\u0002\u001A\u0004\bU\u0010\u0004\"\u0017\u0010Y\u001A\u00020\u00008\u0006\u00A2\u0006\f\n\u0004\bW\u0010\u0002\u001A\u0004\bX\u0010\u0004\"\u0017\u0010\\\u001A\u00020\u00008\u0006\u00A2\u0006\f\n\u0004\bZ\u0010\u0002\u001A\u0004\b[\u0010\u0004\"\u0017\u0010_\u001A\u00020\u00008\u0006\u00A2\u0006\f\n\u0004\b]\u0010\u0002\u001A\u0004\b^\u0010\u0004\"\u0017\u0010b\u001A\u00020\u00008\u0006\u00A2\u0006\f\n\u0004\b`\u0010\u0002\u001A\u0004\ba\u0010\u0004\"\u0017\u0010e\u001A\u00020\u00008\u0006\u00A2\u0006\f\n\u0004\bc\u0010\u0002\u001A\u0004\bd\u0010\u0004\"\u0017\u0010h\u001A\u00020\u00008\u0006\u00A2\u0006\f\n\u0004\bf\u0010\u0002\u001A\u0004\bg\u0010\u0004\u00A8\u0006i"}, d2 = {"Landroidx/compose/animation/core/Easing;", "a", "Landroidx/compose/animation/core/Easing;", "getEase", "()Landroidx/compose/animation/core/Easing;", "Ease", "b", "getEaseOut", "EaseOut", "c", "getEaseIn", "EaseIn", "d", "getEaseInOut", "EaseInOut", "e", "getEaseInSine", "EaseInSine", "f", "getEaseOutSine", "EaseOutSine", "g", "getEaseInOutSine", "EaseInOutSine", "h", "getEaseInCubic", "EaseInCubic", "i", "getEaseOutCubic", "EaseOutCubic", "j", "getEaseInOutCubic", "EaseInOutCubic", "k", "getEaseInQuint", "EaseInQuint", "l", "getEaseOutQuint", "EaseOutQuint", "m", "getEaseInOutQuint", "EaseInOutQuint", "n", "getEaseInCirc", "EaseInCirc", "o", "getEaseOutCirc", "EaseOutCirc", "p", "getEaseInOutCirc", "EaseInOutCirc", "q", "getEaseInQuad", "EaseInQuad", "r", "getEaseOutQuad", "EaseOutQuad", "s", "getEaseInOutQuad", "EaseInOutQuad", "t", "getEaseInQuart", "EaseInQuart", "u", "getEaseOutQuart", "EaseOutQuart", "v", "getEaseInOutQuart", "EaseInOutQuart", "w", "getEaseInExpo", "EaseInExpo", "x", "getEaseOutExpo", "EaseOutExpo", "y", "getEaseInOutExpo", "EaseInOutExpo", "z", "getEaseInBack", "EaseInBack", "A", "getEaseOutBack", "EaseOutBack", "B", "getEaseInOutBack", "EaseInOutBack", "C", "getEaseInElastic", "EaseInElastic", "D", "getEaseOutElastic", "EaseOutElastic", "E", "getEaseInOutElastic", "EaseInOutElastic", "F", "getEaseOutBounce", "EaseOutBounce", "G", "getEaseInBounce", "EaseInBounce", "H", "getEaseInOutBounce", "EaseInOutBounce", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class EasingFunctionsKt {
    public static final CubicBezierEasing A;
    public static final CubicBezierEasing B;
    public static final j C;
    public static final j D;
    public static final j E;
    public static final j F;
    public static final j G;
    public static final j H;
    public static final CubicBezierEasing a;
    public static final CubicBezierEasing b;
    public static final CubicBezierEasing c;
    public static final CubicBezierEasing d;
    public static final CubicBezierEasing e;
    public static final CubicBezierEasing f;
    public static final CubicBezierEasing g;
    public static final CubicBezierEasing h;
    public static final CubicBezierEasing i;
    public static final CubicBezierEasing j;
    public static final CubicBezierEasing k;
    public static final CubicBezierEasing l;
    public static final CubicBezierEasing m;
    public static final CubicBezierEasing n;
    public static final CubicBezierEasing o;
    public static final CubicBezierEasing p;
    public static final CubicBezierEasing q;
    public static final CubicBezierEasing r;
    public static final CubicBezierEasing s;
    public static final CubicBezierEasing t;
    public static final CubicBezierEasing u;
    public static final CubicBezierEasing v;
    public static final CubicBezierEasing w;
    public static final CubicBezierEasing x;
    public static final CubicBezierEasing y;
    public static final CubicBezierEasing z;

    static {
        EasingFunctionsKt.a = new CubicBezierEasing(0.25f, 0.1f, 0.25f, 1.0f);
        EasingFunctionsKt.b = new CubicBezierEasing(0.0f, 0.0f, 0.58f, 1.0f);
        EasingFunctionsKt.c = new CubicBezierEasing(0.42f, 0.0f, 1.0f, 1.0f);
        EasingFunctionsKt.d = new CubicBezierEasing(0.42f, 0.0f, 0.58f, 1.0f);
        EasingFunctionsKt.e = new CubicBezierEasing(0.12f, 0.0f, 0.39f, 0.0f);
        EasingFunctionsKt.f = new CubicBezierEasing(0.61f, 1.0f, 0.88f, 1.0f);
        EasingFunctionsKt.g = new CubicBezierEasing(0.37f, 0.0f, 0.63f, 1.0f);
        EasingFunctionsKt.h = new CubicBezierEasing(0.32f, 0.0f, 0.67f, 0.0f);
        EasingFunctionsKt.i = new CubicBezierEasing(0.33f, 1.0f, 0.68f, 1.0f);
        EasingFunctionsKt.j = new CubicBezierEasing(0.65f, 0.0f, 0.35f, 1.0f);
        EasingFunctionsKt.k = new CubicBezierEasing(0.64f, 0.0f, 0.78f, 0.0f);
        EasingFunctionsKt.l = new CubicBezierEasing(0.22f, 1.0f, 0.36f, 1.0f);
        EasingFunctionsKt.m = new CubicBezierEasing(0.83f, 0.0f, 0.17f, 1.0f);
        EasingFunctionsKt.n = new CubicBezierEasing(0.55f, 0.0f, 1.0f, 0.45f);
        EasingFunctionsKt.o = new CubicBezierEasing(0.0f, 0.55f, 0.45f, 1.0f);
        EasingFunctionsKt.p = new CubicBezierEasing(0.85f, 0.0f, 0.15f, 1.0f);
        EasingFunctionsKt.q = new CubicBezierEasing(0.11f, 0.0f, 0.5f, 0.0f);
        EasingFunctionsKt.r = new CubicBezierEasing(0.5f, 1.0f, 0.89f, 1.0f);
        EasingFunctionsKt.s = new CubicBezierEasing(0.45f, 0.0f, 0.55f, 1.0f);
        EasingFunctionsKt.t = new CubicBezierEasing(0.5f, 0.0f, 0.75f, 0.0f);
        EasingFunctionsKt.u = new CubicBezierEasing(0.25f, 1.0f, 0.5f, 1.0f);
        EasingFunctionsKt.v = new CubicBezierEasing(0.76f, 0.0f, 0.24f, 1.0f);
        EasingFunctionsKt.w = new CubicBezierEasing(0.7f, 0.0f, 0.84f, 0.0f);
        EasingFunctionsKt.x = new CubicBezierEasing(0.16f, 1.0f, 0.3f, 1.0f);
        EasingFunctionsKt.y = new CubicBezierEasing(0.87f, 0.0f, 0.13f, 1.0f);
        EasingFunctionsKt.z = new CubicBezierEasing(0.36f, 0.0f, 0.66f, -0.56f);
        EasingFunctionsKt.A = new CubicBezierEasing(0.34f, 1.56f, 0.64f, 1.0f);
        EasingFunctionsKt.B = new CubicBezierEasing(0.68f, -0.6f, 0.32f, 1.6f);
        EasingFunctionsKt.C = new j(0);
        EasingFunctionsKt.D = new j(1);
        EasingFunctionsKt.E = new j(2);
        EasingFunctionsKt.F = new j(3);
        EasingFunctionsKt.G = new j(4);
        EasingFunctionsKt.H = new j(5);
    }

    @NotNull
    public static final Easing getEase() {
        return EasingFunctionsKt.a;
    }

    @NotNull
    public static final Easing getEaseIn() {
        return EasingFunctionsKt.c;
    }

    @NotNull
    public static final Easing getEaseInBack() {
        return EasingFunctionsKt.z;
    }

    @NotNull
    public static final Easing getEaseInBounce() {
        return EasingFunctionsKt.G;
    }

    @NotNull
    public static final Easing getEaseInCirc() {
        return EasingFunctionsKt.n;
    }

    @NotNull
    public static final Easing getEaseInCubic() {
        return EasingFunctionsKt.h;
    }

    @NotNull
    public static final Easing getEaseInElastic() {
        return EasingFunctionsKt.C;
    }

    @NotNull
    public static final Easing getEaseInExpo() {
        return EasingFunctionsKt.w;
    }

    @NotNull
    public static final Easing getEaseInOut() {
        return EasingFunctionsKt.d;
    }

    @NotNull
    public static final Easing getEaseInOutBack() {
        return EasingFunctionsKt.B;
    }

    @NotNull
    public static final Easing getEaseInOutBounce() {
        return EasingFunctionsKt.H;
    }

    @NotNull
    public static final Easing getEaseInOutCirc() {
        return EasingFunctionsKt.p;
    }

    @NotNull
    public static final Easing getEaseInOutCubic() {
        return EasingFunctionsKt.j;
    }

    @NotNull
    public static final Easing getEaseInOutElastic() {
        return EasingFunctionsKt.E;
    }

    @NotNull
    public static final Easing getEaseInOutExpo() {
        return EasingFunctionsKt.y;
    }

    @NotNull
    public static final Easing getEaseInOutQuad() {
        return EasingFunctionsKt.s;
    }

    @NotNull
    public static final Easing getEaseInOutQuart() {
        return EasingFunctionsKt.v;
    }

    @NotNull
    public static final Easing getEaseInOutQuint() {
        return EasingFunctionsKt.m;
    }

    @NotNull
    public static final Easing getEaseInOutSine() {
        return EasingFunctionsKt.g;
    }

    @NotNull
    public static final Easing getEaseInQuad() {
        return EasingFunctionsKt.q;
    }

    @NotNull
    public static final Easing getEaseInQuart() {
        return EasingFunctionsKt.t;
    }

    @NotNull
    public static final Easing getEaseInQuint() {
        return EasingFunctionsKt.k;
    }

    @NotNull
    public static final Easing getEaseInSine() {
        return EasingFunctionsKt.e;
    }

    @NotNull
    public static final Easing getEaseOut() {
        return EasingFunctionsKt.b;
    }

    @NotNull
    public static final Easing getEaseOutBack() {
        return EasingFunctionsKt.A;
    }

    @NotNull
    public static final Easing getEaseOutBounce() {
        return EasingFunctionsKt.F;
    }

    @NotNull
    public static final Easing getEaseOutCirc() {
        return EasingFunctionsKt.o;
    }

    @NotNull
    public static final Easing getEaseOutCubic() {
        return EasingFunctionsKt.i;
    }

    @NotNull
    public static final Easing getEaseOutElastic() {
        return EasingFunctionsKt.D;
    }

    @NotNull
    public static final Easing getEaseOutExpo() {
        return EasingFunctionsKt.x;
    }

    @NotNull
    public static final Easing getEaseOutQuad() {
        return EasingFunctionsKt.r;
    }

    @NotNull
    public static final Easing getEaseOutQuart() {
        return EasingFunctionsKt.u;
    }

    @NotNull
    public static final Easing getEaseOutQuint() {
        return EasingFunctionsKt.l;
    }

    @NotNull
    public static final Easing getEaseOutSine() {
        return EasingFunctionsKt.f;
    }
}

