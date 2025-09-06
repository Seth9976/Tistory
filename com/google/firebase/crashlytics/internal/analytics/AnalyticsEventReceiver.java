package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import androidx.annotation.NonNull;

public interface AnalyticsEventReceiver {
    void onEvent(@NonNull String arg1, @NonNull Bundle arg2);
}

