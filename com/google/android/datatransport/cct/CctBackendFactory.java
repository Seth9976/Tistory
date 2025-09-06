package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import com.google.android.datatransport.runtime.backends.BackendFactory;
import com.google.android.datatransport.runtime.backends.CreationContext;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import r6.c;

@Keep
public class CctBackendFactory implements BackendFactory {
    @Override  // com.google.android.datatransport.runtime.backends.BackendFactory
    public TransportBackend create(CreationContext creationContext0) {
        return new c(creationContext0.getApplicationContext(), creationContext0.getWallClock(), creationContext0.getMonotonicClock());
    }
}

