package s1;

import android.graphics.Canvas;
import android.graphics.Picture;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.IntSize;

public final class h extends Picture {
    public final GraphicsLayer a;

    public h(GraphicsLayer graphicsLayer0) {
        this.a = graphicsLayer0;
    }

    @Override  // android.graphics.Picture
    public final Canvas beginRecording(int v, int v1) {
        return new Canvas();
    }

    @Override  // android.graphics.Picture
    public final void draw(Canvas canvas0) {
        androidx.compose.ui.graphics.Canvas canvas1 = AndroidCanvas_androidKt.Canvas(canvas0);
        this.a.draw$ui_graphics_release(canvas1, null);
    }

    @Override  // android.graphics.Picture
    public final void endRecording() {
    }

    @Override  // android.graphics.Picture
    public final int getHeight() {
        return IntSize.getHeight-impl(this.a.getSize-YbymL2g());
    }

    @Override  // android.graphics.Picture
    public final int getWidth() {
        return IntSize.getWidth-impl(this.a.getSize-YbymL2g());
    }

    @Override  // android.graphics.Picture
    public final boolean requiresHardwareAcceleration() {
        return true;
    }
}

