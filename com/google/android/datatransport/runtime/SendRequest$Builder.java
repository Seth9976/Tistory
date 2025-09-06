package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.auto.value.AutoValue.Builder;

@AutoValue.Builder
public abstract class SendRequest.Builder {
    public abstract j a(Encoding arg1);

    public abstract j b(Event arg1);

    public abstract t build();

    public abstract j c(Transformer arg1);

    public SendRequest.Builder setEvent(Event event0, Encoding encoding0, Transformer transformer0) {
        this.b(event0);
        this.a(encoding0);
        this.c(transformer0);
        return this;
    }

    public abstract SendRequest.Builder setTransportContext(TransportContext arg1);

    public abstract SendRequest.Builder setTransportName(String arg1);
}

