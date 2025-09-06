package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

public final class up extends Lambda implements Function0 {
    public final MutableState A;
    public final MutableState B;
    public final CoroutineScope w;
    public final AnalogTimePickerState x;
    public final float y;
    public final boolean z;

    public up(CoroutineScope coroutineScope0, AnalogTimePickerState analogTimePickerState0, float f, boolean z, MutableState mutableState0, MutableState mutableState1) {
        this.w = coroutineScope0;
        this.x = analogTimePickerState0;
        this.y = f;
        this.z = z;
        this.A = mutableState0;
        this.B = mutableState1;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        tp tp0 = new tp(this.x, this.y, this.z, this.A, this.B, null);
        BuildersKt.launch$default(this.w, null, null, tp0, 3, null);
        return true;
    }
}

