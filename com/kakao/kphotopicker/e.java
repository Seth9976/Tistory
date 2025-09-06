package com.kakao.kphotopicker;

import android.os.Bundle;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function0 {
    public final PhotoPickerActivity w;

    public e(PhotoPickerActivity photoPickerActivity0) {
        this.w = photoPickerActivity0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Bundle bundle0 = this.w.getIntent().getExtras();
        return PickerViewModel.Companion.provideFactory(this.w, bundle0);
    }
}

