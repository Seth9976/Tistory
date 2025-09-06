package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

public final class vp extends Lambda implements Function1 {
    public final boolean A;
    public final MutableState B;
    public final MutableState C;
    public final boolean w;
    public final CoroutineScope x;
    public final AnalogTimePickerState y;
    public final float z;

    public vp(boolean z, CoroutineScope coroutineScope0, AnalogTimePickerState analogTimePickerState0, float f, boolean z1, MutableState mutableState0, MutableState mutableState1) {
        this.w = z;
        this.x = coroutineScope0;
        this.y = analogTimePickerState0;
        this.z = f;
        this.A = z1;
        this.B = mutableState0;
        this.C = mutableState1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        SemanticsPropertiesKt.onClick$default(((SemanticsPropertyReceiver)object0), null, new up(this.x, this.y, this.z, this.A, this.B, this.C), 1, null);
        SemanticsPropertiesKt.setSelected(((SemanticsPropertyReceiver)object0), this.w);
        return Unit.INSTANCE;
    }
}

