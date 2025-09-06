package androidx.compose.material3;

import androidx.compose.runtime.State;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlinx.coroutines.DebugStringsKt;

public final class rg extends PropertyReference0Impl {
    public final int b;

    public rg(int v, Object object0, Class class0, String s, String s1, int v1) {
        this.b = v1;
        super(object0, class0, s, s1, v);
    }

    @Override  // kotlin.jvm.internal.PropertyReference0Impl
    public final Object get() {
        switch(this.b) {
            case 0: {
                return ((State)this.receiver).getValue();
            }
            case 1: {
                return ((State)this.receiver).getValue();
            }
            case 2: {
                return ((State)this.receiver).getValue();
            }
            case 3: {
                return ((State)this.receiver).getValue();
            }
            case 4: {
                return ((State)this.receiver).getValue();
            }
            case 5: {
                return ((State)this.receiver).getValue();
            }
            default: {
                return DebugStringsKt.getClassSimpleName(this.receiver);
            }
        }
    }
}

