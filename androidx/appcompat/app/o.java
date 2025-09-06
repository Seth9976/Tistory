package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build.VERSION;
import androidx.profileinstaller.ProfileInstaller;
import g.a;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class o implements Runnable {
    public final int a;
    public final Context b;

    public o(Context context0, int v) {
        this.a = v;
        this.b = context0;
        super();
    }

    @Override
    public final void run() {
        Context context0 = this.b;
        switch(this.a) {
            case 0: {
                if(Build.VERSION.SDK_INT >= 33) {
                    ComponentName componentName0 = new ComponentName(context0, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if(context0.getPackageManager().getComponentEnabledSetting(componentName0) != 1) {
                        if(AppCompatDelegate.getApplicationLocales().isEmpty()) {
                            String s = a.V(context0);
                            Object object0 = context0.getSystemService("locale");
                            if(object0 != null) {
                                q.b(object0, p.a(s));
                            }
                        }
                        context0.getPackageManager().setComponentEnabledSetting(componentName0, 1, 1);
                    }
                }
                AppCompatDelegate.f = true;
                return;
            }
            case 1: {
                AppCompatDelegate.e(context0);
                return;
            }
            case 2: {
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new o(context0, 3));
                return;
            }
            default: {
                ProfileInstaller.writeProfile(context0);
            }
        }
    }
}

