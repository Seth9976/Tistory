package androidx.fragment.app;

import androidx.lifecycle.ViewModelProvider.Factory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class y1 extends Lambda implements Function0 {
    public final Fragment w;

    public y1(Fragment fragment0) {
        this.w = fragment0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Factory viewModelProvider$Factory0 = this.w.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullExpressionValue(viewModelProvider$Factory0, "defaultViewModelProviderFactory");
        return viewModelProvider$Factory0;
    }
}

