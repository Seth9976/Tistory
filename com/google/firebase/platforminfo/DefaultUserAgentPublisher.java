package com.google.firebase.platforminfo;

import com.google.firebase.components.Component;
import com.google.firebase.components.Dependency;
import com.google.firebase.installations.f;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import y8.a;

public class DefaultUserAgentPublisher implements UserAgentPublisher {
    public final String a;
    public final GlobalLibraryVersionRegistrar b;

    public DefaultUserAgentPublisher(Set set0, GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar0) {
        this.a = DefaultUserAgentPublisher.a(set0);
        this.b = globalLibraryVersionRegistrar0;
    }

    public static String a(Set set0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        Iterator iterator0 = set0.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            stringBuilder0.append(((a)object0).a);
            stringBuilder0.append('/');
            stringBuilder0.append(((a)object0).b);
            if(iterator0.hasNext()) {
                stringBuilder0.append(' ');
            }
        }
        return stringBuilder0.toString();
    }

    public static Component component() {
        return Component.builder(UserAgentPublisher.class).add(Dependency.setOf(a.class)).factory(new f(4)).build();
    }

    @Override  // com.google.firebase.platforminfo.UserAgentPublisher
    public String getUserAgent() {
        Set set1;
        GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar0 = this.b;
        synchronized(globalLibraryVersionRegistrar0.a) {
            Set set0 = Collections.unmodifiableSet(globalLibraryVersionRegistrar0.a);
        }
        String s = this.a;
        if(set0.isEmpty()) {
            return s;
        }
        synchronized(globalLibraryVersionRegistrar0.a) {
            set1 = Collections.unmodifiableSet(globalLibraryVersionRegistrar0.a);
        }
        return s + ' ' + DefaultUserAgentPublisher.a(set1);
    }
}

