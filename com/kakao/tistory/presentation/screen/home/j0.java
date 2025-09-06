package com.kakao.tistory.presentation.screen.home;

import androidx.lifecycle.ViewModelKt;
import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.presentation.screen.home.contract.HomeIntent.ShowErrorDialog;
import com.kakao.tistory.presentation.screen.home.contract.HomeIntent.UpdateCategory;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.Category;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;

public final class j0 extends Lambda implements Function1 {
    public final HomeViewModel a;
    public final Category b;

    public j0(HomeViewModel homeViewModel0, Category homeSlotUiState$Category0) {
        this.a = homeViewModel0;
        this.b = homeSlotUiState$Category0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((ErrorModel)object0), "error");
        ShowErrorDialog homeIntent$ShowErrorDialog0 = new ShowErrorDialog(((ErrorModel)object0));
        this.a.sendIntent(homeIntent$ShowErrorDialog0);
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this.a), null, null, new i0(this.a, this.b, null), 3, null);
        UpdateCategory homeIntent$UpdateCategory0 = new UpdateCategory(this.b);
        this.a.sendIntent(homeIntent$UpdateCategory0);
        return Unit.INSTANCE;
    }
}

