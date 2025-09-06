package androidx.viewpager2.widget;

import android.os.Build.VERSION;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import g5.m;

public final class WindowInsetsApplier implements OnApplyWindowInsetsListener {
    public static boolean install(@NonNull ViewPager2 viewPager20) {
        viewPager20.getContext().getApplicationInfo();
        if(Build.VERSION.SDK_INT >= 30) {
            return false;
        }
        ViewCompat.setOnApplyWindowInsetsListener(viewPager20, new WindowInsetsApplier());  // 初始化器: Ljava/lang/Object;-><init>()V
        return true;
    }

    @Override  // androidx.core.view.OnApplyWindowInsetsListener
    @NonNull
    public WindowInsetsCompat onApplyWindowInsets(@NonNull View view0, @NonNull WindowInsetsCompat windowInsetsCompat0) {
        WindowInsetsCompat windowInsetsCompat1 = ViewCompat.onApplyWindowInsets(((ViewPager2)view0), windowInsetsCompat0);
        if(windowInsetsCompat1.isConsumed()) {
            return windowInsetsCompat1;
        }
        m m0 = ((ViewPager2)view0).j;
        int v = m0.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            ViewCompat.dispatchApplyWindowInsets(m0.getChildAt(v1), new WindowInsetsCompat(windowInsetsCompat1));
        }
        return WindowInsetsCompat.CONSUMED.toWindowInsets() == null ? windowInsetsCompat1.consumeSystemWindowInsets().consumeStableInsets() : WindowInsetsCompat.CONSUMED;
    }
}

