package com.google.firebase.components;

import com.google.firebase.events.Event;
import com.google.firebase.events.Publisher;
import java.util.Set;

public final class l implements Publisher {
    public final Set a;
    public final Publisher b;

    public l(Set set0, Publisher publisher0) {
        this.a = set0;
        this.b = publisher0;
    }

    @Override  // com.google.firebase.events.Publisher
    public final void publish(Event event0) {
        if(!this.a.contains(event0.getType())) {
            throw new DependencyException(String.format("Attempting to publish an undeclared event %s.", event0));
        }
        this.b.publish(event0);
    }
}

