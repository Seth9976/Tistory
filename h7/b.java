package h7;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;

public final class b extends Drawable {
    public static final b a;
    public static final a b;

    static {
        b.a = new b();  // 初始化器: Landroid/graphics/drawable/Drawable;-><init>()V
        b.b = new a();  // 初始化器: Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V
    }

    @Override  // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas0) {
    }

    @Override  // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return b.b;
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setAlpha(int v) {
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter0) {
    }
}

