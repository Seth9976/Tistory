package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File;
import java.io.InputStream;

interface NativeSessionFile {
    @Nullable
    File asFilePayload();

    @NonNull
    String getReportsEndpointFilename();

    @Nullable
    InputStream getStream();
}

