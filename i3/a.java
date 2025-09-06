package i3;

import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader.TileMode;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import android.window.SplashScreenView;

public abstract class a {
    public static Shader.TileMode f() {
        return Shader.TileMode.DECAL;
    }

    public static RoundedCorner g(WindowInsets windowInsets0) {
        return windowInsets0.getRoundedCorner(0);
    }

    public static View h(SplashScreenView splashScreenView0) {
        return splashScreenView0.getRootView();
    }

    public static SplashScreenView j(View view0) [...] // Inlined contents

    public static void m(RenderNode renderNode0, RenderEffect renderEffect0) {
        renderNode0.setRenderEffect(renderEffect0);
    }

    public static boolean q(View view0) {
        return view0 instanceof SplashScreenView;
    }

    public static RoundedCorner r(WindowInsets windowInsets0) {
        return windowInsets0.getRoundedCorner(1);
    }
}

