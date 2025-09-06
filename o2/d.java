package o2;

import androidx.compose.ui.tooling.CompositionDataRecord;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

public final class d implements CompositionDataRecord {
    public final Set a;

    public d() {
        this.a = Collections.newSetFromMap(new WeakHashMap());
    }

    @Override  // androidx.compose.ui.tooling.CompositionDataRecord
    public final Set getStore() {
        return this.a;
    }
}

