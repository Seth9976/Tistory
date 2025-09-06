package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.presentation.common.BlogRoleType;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class z1 extends Lambda implements Function1 {
    public final EntryViewModel a;

    public z1(EntryViewModel entryViewModel0) {
        this.a = entryViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        BlogRoleType blogRoleType0 = (BlogRoleType)this.a.F.getValue();
        if(EntryViewModel.access$hasBlogRolePermission(this.a, blogRoleType0)) {
            Intrinsics.checkNotNull(((Boolean)object0));
            return ((Boolean)object0).booleanValue();
        }
        return false;
    }
}

