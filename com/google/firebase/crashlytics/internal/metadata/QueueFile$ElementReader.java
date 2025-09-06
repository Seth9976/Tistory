package com.google.firebase.crashlytics.internal.metadata;

import java.io.IOException;
import java.io.InputStream;

public interface QueueFile.ElementReader {
    void read(InputStream arg1, int arg2) throws IOException;
}

