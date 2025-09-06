package com.google.firebase.installations;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import com.google.firebase.installations.time.Clock;
import com.google.firebase.installations.time.SystemClock;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public final class Utils {
    public static final long AUTH_TOKEN_EXPIRATION_BUFFER_IN_SECS;
    public final Clock a;
    public static final Pattern b;
    public static Utils c;

    static {
        Utils.AUTH_TOKEN_EXPIRATION_BUFFER_IN_SECS = TimeUnit.HOURS.toSeconds(1L);
        Utils.b = Pattern.compile("\\AA[\\w-]{38}\\z");
    }

    public Utils(Clock clock0) {
        this.a = clock0;
    }

    public long currentTimeInMillis() {
        return this.a.currentTimeMillis();
    }

    public long currentTimeInSecs() {
        return TimeUnit.MILLISECONDS.toSeconds(this.currentTimeInMillis());
    }

    public static Utils getInstance() {
        return Utils.getInstance(SystemClock.getInstance());
    }

    public static Utils getInstance(Clock clock0) {
        if(Utils.c == null) {
            Utils.c = new Utils(clock0);
        }
        return Utils.c;
    }

    public long getRandomDelayForSyncPrevention() [...] // 潜在的解密器

    public boolean isAuthTokenExpired(@NonNull PersistedInstallationEntry persistedInstallationEntry0) {
        if(TextUtils.isEmpty(persistedInstallationEntry0.getAuthToken())) {
            return true;
        }
        long v = persistedInstallationEntry0.getTokenCreationEpochInSecs();
        return persistedInstallationEntry0.getExpiresInSecs() + v < this.currentTimeInSecs() + Utils.AUTH_TOKEN_EXPIRATION_BUFFER_IN_SECS;
    }
}

