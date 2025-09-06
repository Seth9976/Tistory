package com.google.android.gms.signin;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api.ApiOptions.Optional;
import com.google.android.gms.common.internal.Objects;

public final class SignInOptions implements Optional {
    @NonNull
    public static final SignInOptions zaa;

    static {
        SignInOptions.zaa = new SignInOptions();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof SignInOptions)) {
            return false;
        }
        ((SignInOptions)object0).getClass();
        return Objects.equal(null, null) && Objects.equal(null, null) && Objects.equal(null, null) && Objects.equal(null, null) && Objects.equal(null, null);
    }

    @Override
    public final int hashCode() {
        return Objects.hashCode(new Object[]{Boolean.FALSE, Boolean.FALSE, 0, Boolean.FALSE, Boolean.FALSE, 0, 0, 0, 0});
    }
}

