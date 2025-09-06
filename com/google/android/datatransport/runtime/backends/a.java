package com.google.android.datatransport.runtime.backends;

public final class a extends Builder {
    public Iterable a;
    public byte[] b;

    @Override  // com.google.android.datatransport.runtime.backends.BackendRequest$Builder
    public final BackendRequest build() {
        String s = this.a == null ? " events" : "";
        if(!s.isEmpty()) {
            throw new IllegalStateException("Missing required properties:" + s);
        }
        return new t6.a(this.b, this.a);
    }

    @Override  // com.google.android.datatransport.runtime.backends.BackendRequest$Builder
    public final Builder setEvents(Iterable iterable0) {
        if(iterable0 == null) {
            throw new NullPointerException("Null events");
        }
        this.a = iterable0;
        return this;
    }

    @Override  // com.google.android.datatransport.runtime.backends.BackendRequest$Builder
    public final Builder setExtras(byte[] arr_b) {
        this.b = arr_b;
        return this;
    }
}

