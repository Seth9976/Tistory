package q7;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener;
import com.google.android.material.internal.ViewUtils.RelativePadding;

public final class a implements OnApplyWindowInsetsListener {
    @Override  // com.google.android.material.internal.ViewUtils$OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view0, WindowInsetsCompat windowInsetsCompat0, RelativePadding viewUtils$RelativePadding0) {
        int v = viewUtils$RelativePadding0.bottom;
        viewUtils$RelativePadding0.bottom = windowInsetsCompat0.getSystemWindowInsetBottom() + v;
        boolean z = ViewCompat.getLayoutDirection(view0) == 1;
        int v1 = windowInsetsCompat0.getSystemWindowInsetLeft();
        int v2 = windowInsetsCompat0.getSystemWindowInsetRight();
        viewUtils$RelativePadding0.start += (z ? v2 : v1);
        int v3 = viewUtils$RelativePadding0.end;
        if(!z) {
            v1 = v2;
        }
        viewUtils$RelativePadding0.end = v3 + v1;
        viewUtils$RelativePadding0.applyToView(view0);
        return windowInsetsCompat0;
    }
}

