package com.kakao.tistory.presentation.screen.blog.setting;

import androidx.lifecycle.ViewModelKt;
import com.kakao.tistory.presentation.screen.blog.setting.contract.BlogSettingIntent.ChangeNicknameValidation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;

public final class a0 extends Lambda implements Function0 {
    public final String a;
    public final String b;
    public final BlogSettingViewModel c;

    public a0(String s, String s1, BlogSettingViewModel blogSettingViewModel0) {
        this.a = s;
        this.b = s1;
        this.c = blogSettingViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(Intrinsics.areEqual(this.a, this.b)) {
            ChangeNicknameValidation blogSettingIntent$ChangeNicknameValidation0 = new ChangeNicknameValidation(true, null, 2, null);
            this.c.sendIntent(blogSettingIntent$ChangeNicknameValidation0);
            return Unit.INSTANCE;
        }
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this.c), null, null, new z(this.c, this.b, null), 3, null);
        return Unit.INSTANCE;
    }
}

