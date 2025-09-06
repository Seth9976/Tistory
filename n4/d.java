package n4;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.navigation.NavBackStackEntry;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function0 {
    public final NavBackStackEntry w;

    public d(NavBackStackEntry navBackStackEntry0) {
        this.w = navBackStackEntry0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        NavBackStackEntry navBackStackEntry0 = this.w;
        Context context0 = navBackStackEntry0.a;
        Application application0 = null;
        Context context1 = context0 == null ? null : context0.getApplicationContext();
        if(context1 instanceof Application) {
            application0 = (Application)context1;
        }
        return new SavedStateViewModelFactory(application0, navBackStackEntry0, navBackStackEntry0.getArguments());
    }
}

