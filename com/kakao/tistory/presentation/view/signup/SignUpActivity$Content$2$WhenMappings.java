package com.kakao.tistory.presentation.view.signup;

import com.kakao.tistory.presentation.view.signup.contract.SignUpPageType;
import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
public final class SignUpActivity.Content.2.WhenMappings {
    public static final int[] $EnumSwitchMapping$0;

    static {
        int[] arr_v = new int[SignUpPageType.values().length];
        try {
            arr_v[SignUpPageType.SIGNUP.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[SignUpPageType.USED_EMAIL.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        SignUpActivity.Content.2.WhenMappings.$EnumSwitchMapping$0 = arr_v;
    }
}

