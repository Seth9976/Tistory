package com.google.android.play.core.common;

import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.content.IntentSender;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface IntentSenderForResultStarter {
    void startIntentSenderForResult(@NonNull IntentSender arg1, int arg2, @Nullable Intent arg3, int arg4, int arg5, int arg6, @Nullable Bundle arg7) throws IntentSender.SendIntentException;
}

