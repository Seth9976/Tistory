package androidx.core.app;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;

public final class j extends ActivityOptionsCompat {
    public final ActivityOptions a;

    public j(ActivityOptions activityOptions0) {
        this.a = activityOptions0;
    }

    @Override  // androidx.core.app.ActivityOptionsCompat
    public final Rect getLaunchBounds() {
        return m.a(this.a);
    }

    @Override  // androidx.core.app.ActivityOptionsCompat
    public final void requestUsageTimeReport(PendingIntent pendingIntent0) {
        l.c(this.a, pendingIntent0);
    }

    @Override  // androidx.core.app.ActivityOptionsCompat
    public final ActivityOptionsCompat setLaunchBounds(Rect rect0) {
        return new j(m.b(this.a, rect0));
    }

    @Override  // androidx.core.app.ActivityOptionsCompat
    public final ActivityOptionsCompat setShareIdentityEnabled(boolean z) {
        return Build.VERSION.SDK_INT >= 34 ? new j(n.a(this.a, z)) : this;
    }

    @Override  // androidx.core.app.ActivityOptionsCompat
    public final Bundle toBundle() {
        return this.a.toBundle();
    }

    @Override  // androidx.core.app.ActivityOptionsCompat
    public final void update(ActivityOptionsCompat activityOptionsCompat0) {
        if(activityOptionsCompat0 instanceof j) {
            this.a.update(((j)activityOptionsCompat0).a);
        }
    }
}

