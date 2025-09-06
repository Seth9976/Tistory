package com.kakao.tistory.presentation.viewmodel;

import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.TextFieldValue;
import com.kakao.android.base.tiara.TiaraUtils;
import com.kakao.tiara.data.Click;
import com.kakao.tistory.domain.entity.common.RecommendedBlogNameInfo;
import com.kakao.tistory.presentation.common.tiara.TiaraActionType;
import com.kakao.tistory.presentation.view.signup.contract.SignUpIntent.ChangeBlogName;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class j5 extends Lambda implements Function1 {
    public final SignUpViewModel a;

    public j5(SignUpViewModel signUpViewModel0) {
        this.a = signUpViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((RecommendedBlogNameInfo)object0), "it");
        Click click0 = TiaraUtils.createClick$default(TiaraUtils.INSTANCE, "address_suggestion", "bubble", null, null, null, null, null, null, null, null, 1020, null);
        Map map0 = w.mapOf(TuplesKt.to("address_source", ((RecommendedBlogNameInfo)object0).getBy()));
        TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, "가입하기", "가입하기", TiaraActionType.CLICK_SIGN_UP_RECOMMENDATION, null, click0, null, map0, null, 0xA8, null);
        ChangeBlogName signUpIntent$ChangeBlogName0 = new ChangeBlogName(new TextFieldValue(((RecommendedBlogNameInfo)object0).getName(), TextRangeKt.TextRange(((RecommendedBlogNameInfo)object0).getName().length()), null, 4, null), ((RecommendedBlogNameInfo)object0).getBy());
        this.a.sendIntent(signUpIntent$ChangeBlogName0);
        return Unit.INSTANCE;
    }
}

