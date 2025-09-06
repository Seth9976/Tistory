package androidx.fragment.app;

import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class x1 extends Lambda implements Function0 {
    public final int w;
    public final Fragment x;

    public x1(Fragment fragment0, int v) {
        this.w = v;
        this.x = fragment0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.w != 0) {
            CreationExtras creationExtras0 = this.x.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(creationExtras0, "defaultViewModelCreationExtras");
            return creationExtras0;
        }
        CreationExtras creationExtras1 = this.x.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullExpressionValue(creationExtras1, "defaultViewModelCreationExtras");
        return creationExtras1;
    }
}

