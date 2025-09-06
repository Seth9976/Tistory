package o8;

import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.settings.SettingsController;
import java.util.concurrent.Callable;

public final class c implements Callable {
    public final boolean a;
    public final CrashlyticsCore b;
    public final SettingsController c;

    public c(boolean z, CrashlyticsCore crashlyticsCore0, SettingsController settingsController0) {
        this.a = z;
        this.b = crashlyticsCore0;
        this.c = settingsController0;
    }

    @Override
    public final Object call() {
        if(this.a) {
            this.b.doBackgroundInitializationAsync(this.c);
        }
        return null;
    }
}

