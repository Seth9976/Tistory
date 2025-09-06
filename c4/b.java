package c4;

import android.view.View.OnApplyWindowInsetsListener;
import android.view.View;
import android.view.WindowInsets;
import androidx.drawerlayout.widget.DrawerLayout;

public final class b implements View.OnApplyWindowInsetsListener {
    @Override  // android.view.View$OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view0, WindowInsets windowInsets0) {
        ((DrawerLayout)view0).setChildInsets(windowInsets0, windowInsets0.getSystemWindowInsetTop() > 0);
        return windowInsets0.consumeSystemWindowInsets();
    }
}

