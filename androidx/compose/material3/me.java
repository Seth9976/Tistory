package androidx.compose.material3;

import androidx.compose.material.ExposedDropdownMenu_androidKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.ui.unit.IntSize;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class me extends Lambda implements Function1 {
    public final int w;
    public final MutableIntState x;

    public me(MutableIntState mutableIntState0, int v) {
        this.w = v;
        this.x = mutableIntState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                int v = IntSize.getWidth-impl(((IntSize)object0).unbox-impl());
                NavigationBarKt.access$NavigationBarItem$lambda$4(this.x, v);
                return Unit.INSTANCE;
            }
            case 1: {
                int v1 = IntSize.getWidth-impl(((IntSize)object0).unbox-impl());
                NavigationItemKt.access$NavigationItem_SHbi2eg$lambda$3(this.x, v1);
                return Unit.INSTANCE;
            }
            case 2: {
                ExposedDropdownMenu_androidKt.access$ExposedDropdownMenuBox$lambda$5(this.x, ((Number)object0).intValue());
                return Unit.INSTANCE;
            }
            default: {
                ExposedDropdownMenu_androidKt.access$ExposedDropdownMenuBox$lambda$5(this.x, ((Number)object0).intValue());
                return Unit.INSTANCE;
            }
        }
    }
}

