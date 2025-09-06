package y7;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout.SimpleDrawerListener;
import com.google.android.material.navigation.NavigationView;
import java.util.Objects;
import m5.a;

public final class f extends SimpleDrawerListener {
    public final NavigationView a;

    public f(NavigationView navigationView0) {
        this.a = navigationView0;
        super();
    }

    @Override  // androidx.drawerlayout.widget.DrawerLayout$SimpleDrawerListener
    public final void onDrawerClosed(View view0) {
        NavigationView navigationView0 = this.a;
        if(view0 == navigationView0) {
            navigationView0.t.stopListeningForBackCallbacks();
        }
    }

    @Override  // androidx.drawerlayout.widget.DrawerLayout$SimpleDrawerListener
    public final void onDrawerOpened(View view0) {
        NavigationView navigationView0 = this.a;
        if(view0 == navigationView0) {
            Objects.requireNonNull(navigationView0.t);
            view0.post(new a(navigationView0.t, 5));
        }
    }
}

