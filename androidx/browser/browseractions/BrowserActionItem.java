package androidx.browser.browseractions;

import android.app.PendingIntent;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;

public class BrowserActionItem {
    public final String a;
    public final PendingIntent b;
    public final int c;

    public BrowserActionItem(@NonNull String s, @NonNull PendingIntent pendingIntent0) {
        this(s, pendingIntent0, 0);
    }

    public BrowserActionItem(@NonNull String s, @NonNull PendingIntent pendingIntent0, @DrawableRes int v) {
        this.a = s;
        this.b = pendingIntent0;
        this.c = v;
    }

    public PendingIntent getAction() {
        return this.b;
    }

    public int getIconId() {
        return this.c;
    }

    public String getTitle() {
        return this.a;
    }
}

