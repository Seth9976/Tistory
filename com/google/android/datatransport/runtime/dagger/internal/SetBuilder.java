package com.google.android.datatransport.runtime.dagger.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class SetBuilder {
    public final ArrayList a;

    public SetBuilder(int v) {
        this.a = new ArrayList(v);
    }

    public SetBuilder add(Object object0) {
        Object object1 = Preconditions.checkNotNull(object0, "Set contributions cannot be null");
        this.a.add(object1);
        return this;
    }

    public SetBuilder addAll(Collection collection0) {
        for(Object object0: collection0) {
            Preconditions.checkNotNull(object0, "Set contributions cannot be null");
        }
        this.a.addAll(collection0);
        return this;
    }

    public Set build() {
        ArrayList arrayList0 = this.a;
        switch(arrayList0.size()) {
            case 0: {
                return Collections.emptySet();
            }
            case 1: {
                return Collections.singleton(arrayList0.get(0));
            }
            default: {
                return Collections.unmodifiableSet(new HashSet(arrayList0));
            }
        }
    }

    public static SetBuilder newSetBuilder(int v) {
        return new SetBuilder(v);
    }
}

