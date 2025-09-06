package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Priority;

public final class l extends Builder {
    public String a;
    public byte[] b;
    public Priority c;

    @Override  // com.google.android.datatransport.runtime.TransportContext$Builder
    public final TransportContext build() {
        String s = this.a == null ? " backendName" : "";
        if(this.c == null) {
            s = s + " priority";
        }
        if(!s.isEmpty()) {
            throw new IllegalStateException("Missing required properties:" + s);
        }
        return new m(this.a, this.b, this.c);
    }

    @Override  // com.google.android.datatransport.runtime.TransportContext$Builder
    public final Builder setBackendName(String s) {
        if(s == null) {
            throw new NullPointerException("Null backendName");
        }
        this.a = s;
        return this;
    }

    @Override  // com.google.android.datatransport.runtime.TransportContext$Builder
    public final Builder setExtras(byte[] arr_b) {
        this.b = arr_b;
        return this;
    }

    @Override  // com.google.android.datatransport.runtime.TransportContext$Builder
    public final Builder setPriority(Priority priority0) {
        if(priority0 == null) {
            throw new NullPointerException("Null priority");
        }
        this.c = priority0;
        return this;
    }
}

