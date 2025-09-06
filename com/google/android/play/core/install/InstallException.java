package com.google.android.play.core.install;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.play.core.install.model.InstallErrorCode;
import com.google.android.play.core.install.model.zza;
import java.util.Locale;

public class InstallException extends ApiException {
    public InstallException(@InstallErrorCode int v) {
        super(new Status(v, String.format(Locale.getDefault(), "Install Error(%d): %s", v, zza.zza(v))));
        if(v == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }

    @InstallErrorCode
    public int getErrorCode() {
        return super.getStatusCode();
    }
}

