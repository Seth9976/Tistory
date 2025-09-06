package z7;

import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener;
import com.google.android.material.internal.ViewUtils.RelativePadding;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.navigationrail.NavigationRailView;

public final class b implements OnApplyWindowInsetsListener {
    public final NavigationRailView a;

    public b(NavigationRailView navigationRailView0) {
        this.a = navigationRailView0;
    }

    @Override  // com.google.android.material.internal.ViewUtils$OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view0, WindowInsetsCompat windowInsetsCompat0, RelativePadding viewUtils$RelativePadding0) {
        Insets insets0 = windowInsetsCompat0.getInsets(7);
        NavigationRailView navigationRailView0 = this.a;
        if((navigationRailView0.i == null ? ViewCompat.getFitsSystemWindows(navigationRailView0) : navigationRailView0.i.booleanValue())) {
            viewUtils$RelativePadding0.top += insets0.top;
        }
        if((navigationRailView0.j == null ? ViewCompat.getFitsSystemWindows(navigationRailView0) : navigationRailView0.j.booleanValue())) {
            viewUtils$RelativePadding0.bottom += insets0.bottom;
        }
        if((navigationRailView0.k == null ? ViewCompat.getFitsSystemWindows(navigationRailView0) : navigationRailView0.k.booleanValue())) {
            viewUtils$RelativePadding0.start += (ViewUtils.isLayoutRtl(view0) ? insets0.right : insets0.left);
        }
        viewUtils$RelativePadding0.applyToView(view0);
        return windowInsetsCompat0;
    }
}

