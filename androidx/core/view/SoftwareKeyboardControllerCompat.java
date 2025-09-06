package androidx.core.view;

import android.os.Build.VERSION;
import android.view.View;
import android.view.WindowInsetsController;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.f;

public final class SoftwareKeyboardControllerCompat {
    public final f a;

    public SoftwareKeyboardControllerCompat(@NonNull View view0) {
        if(Build.VERSION.SDK_INT >= 30) {
            y y0 = new y(view0, 1);  // 初始化器: Landroidx/appcompat/view/menu/f;-><init>(Ljava/lang/Object;I)V
            y0.c = view0;
            this.a = y0;
            return;
        }
        this.a = new f(view0, 1);
    }

    public SoftwareKeyboardControllerCompat(WindowInsetsController windowInsetsController0) {
        y y0 = new y(null, 1);  // 初始化器: Landroidx/appcompat/view/menu/f;-><init>(Ljava/lang/Object;I)V
        y0.d = windowInsetsController0;
        this.a = y0;
    }

    public void hide() {
        this.a.e();
    }

    public void show() {
        this.a.f();
    }
}

