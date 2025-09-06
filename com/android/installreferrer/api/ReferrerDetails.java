package com.android.installreferrer.api;

import android.os.Bundle;

public class ReferrerDetails {
    public final Bundle a;

    public ReferrerDetails(Bundle bundle0) {
        this.a = bundle0;
    }

    public boolean getGooglePlayInstantParam() {
        return this.a.getBoolean("google_play_instant");
    }

    public long getInstallBeginTimestampSeconds() {
        return this.a.getLong("install_begin_timestamp_seconds");
    }

    public String getInstallReferrer() {
        return this.a.getString("install_referrer");
    }

    public long getReferrerClickTimestampSeconds() {
        return this.a.getLong("referrer_click_timestamp_seconds");
    }
}

