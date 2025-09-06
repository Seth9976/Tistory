package androidx.work.impl;

import androidx.arch.core.util.Function;
import androidx.work.impl.model.WorkSpec.WorkInfoPojo;
import java.util.List;

public final class g implements Function {
    @Override  // androidx.arch.core.util.Function
    public final Object apply(Object object0) {
        return ((List)object0) != null && ((List)object0).size() > 0 ? ((WorkInfoPojo)((List)object0).get(0)).toWorkInfo() : null;
    }
}

