package androidx.core.view;

import android.graphics.Insets;
import android.os.CancellationSignal;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController.OnControllableInsetsChangedListener;
import android.view.WindowInsetsController;
import android.view.animation.Interpolator;

public abstract class m1 {
    public static void A(WindowInsetsController windowInsetsController0) {
        windowInsetsController0.setSystemBarsAppearance(0, 0);
    }

    public static int B() {
        return 0x20;
    }

    public static int C() {
        return 0x40;
    }

    public static int D() {
        return 0x80;
    }

    public static float a(WindowInsetsAnimationController windowInsetsAnimationController0) {
        return windowInsetsAnimationController0.getCurrentFraction();
    }

    public static int b() {
        return 1;
    }

    public static int c(WindowInsetsAnimationController windowInsetsAnimationController0) {
        return windowInsetsAnimationController0.getTypes();
    }

    public static int d(WindowInsetsController windowInsetsController0) {
        return windowInsetsController0.getSystemBarsAppearance();
    }

    public static WindowInsetsController.OnControllableInsetsChangedListener g(Object object0) {
        return (WindowInsetsController.OnControllableInsetsChangedListener)object0;
    }

    public static void k(WindowInsetsAnimationController windowInsetsAnimationController0, Insets insets0, float f, float f1) {
        windowInsetsAnimationController0.setInsetsAndAlpha(insets0, f, f1);
    }

    public static void l(WindowInsetsController windowInsetsController0) {
        windowInsetsController0.setSystemBarsAppearance(0, 8);
    }

    public static void m(WindowInsetsController windowInsetsController0, int v) {
        windowInsetsController0.setSystemBarsBehavior(v);
    }

    public static void n(WindowInsetsController windowInsetsController0, int v, long v1, Interpolator interpolator0, CancellationSignal cancellationSignal0, e2 e20) {
        windowInsetsController0.controlWindowInsetsAnimation(v, v1, interpolator0, cancellationSignal0, e20);
    }

    public static void o(WindowInsetsController windowInsetsController0, d2 d20) {
        windowInsetsController0.addOnControllableInsetsChangedListener(d20);
    }

    public static boolean q(WindowInsetsAnimationController windowInsetsAnimationController0) {
        return windowInsetsAnimationController0.isFinished();
    }

    public static float r(WindowInsetsAnimationController windowInsetsAnimationController0) {
        return windowInsetsAnimationController0.getCurrentAlpha();
    }

    public static int s() {
        return 2;
    }

    public static void v(WindowInsetsController windowInsetsController0) {
        windowInsetsController0.setSystemBarsAppearance(16, 16);
    }

    public static boolean w(WindowInsetsAnimationController windowInsetsAnimationController0) {
        return windowInsetsAnimationController0.isCancelled();
    }

    public static int x() {
        return 4;
    }

    public static void y(WindowInsetsController windowInsetsController0) {
        windowInsetsController0.setSystemBarsAppearance(0, 16);
    }

    public static int z() {
        return 16;
    }
}

