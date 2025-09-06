package w;

import androidx.compose.foundation.content.ReceiveContentListener;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import kotlin.jvm.internal.Intrinsics;

public final class a extends ReceiveContentConfiguration {
    public final ReceiveContentListener a;

    public a(ReceiveContentListener receiveContentListener0) {
        this.a = receiveContentListener0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof a ? Intrinsics.areEqual(this.a, ((a)object0).a) : false;
    }

    @Override  // androidx.compose.foundation.content.internal.ReceiveContentConfiguration
    public final ReceiveContentListener getReceiveContentListener() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "ReceiveContentConfigurationImpl(receiveContentListener=" + this.a + ')';
    }
}

