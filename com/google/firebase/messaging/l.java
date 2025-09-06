package com.google.firebase.messaging;

import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;

public final class l implements EventHandler {
    public final m a;

    public l(m m0) {
        this.a = m0;
    }

    @Override  // com.google.firebase.events.EventHandler
    public final void handle(Event event0) {
        m m0 = this.a;
        if(m0.b()) {
            m0.e.g();
        }
    }
}

