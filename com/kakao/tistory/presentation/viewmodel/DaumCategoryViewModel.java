package com.kakao.tistory.presentation.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kakao.tistory.domain.repository.EntryRepository;
import com.kakao.tistory.presentation.viewmodel.base.TistoryViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import hc.d;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;
import sc.a;

@StabilityInferred(parameters = 0)
@HiltViewModel
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR#\u0010\u000F\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000B0\n0\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u0007\u0010\u000E¨\u0006\u0010"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/DaumCategoryViewModel;", "Lcom/kakao/tistory/presentation/viewmodel/base/TistoryViewModel;", "Lcom/kakao/tistory/domain/repository/EntryRepository;", "entryRepository", "<init>", "(Lcom/kakao/tistory/domain/repository/EntryRepository;)V", "", "getCategories", "()V", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/kakao/tistory/domain/entity/entry/DaumLikeViewItemModel;", "h", "Landroidx/lifecycle/MutableLiveData;", "()Landroidx/lifecycle/MutableLiveData;", "categories", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class DaumCategoryViewModel extends TistoryViewModel {
    public static final int $stable = 8;
    public final EntryRepository g;
    public final MutableLiveData h;

    @Inject
    public DaumCategoryViewModel(@NotNull EntryRepository entryRepository0) {
        Intrinsics.checkNotNullParameter(entryRepository0, "entryRepository");
        super();
        this.g = entryRepository0;
        this.h = new MutableLiveData();
    }

    public static final ObservableSource a(Function1 function10, Object object0) {
        Intrinsics.checkNotNullParameter(function10, "$tmp0");
        Intrinsics.checkNotNullParameter(object0, "p0");
        return (ObservableSource)function10.invoke(object0);
    }

    public final void a(List list0) {
        this.isShowProgress().setValue(Boolean.TRUE);
        Disposable disposable0 = Observable.fromIterable(list0).concatMap(new a(new s(this), 1)).toList().subscribe(new d(new t(this), 9), new d(new u(this), 10));
        Intrinsics.checkNotNullExpressionValue(disposable0, "subscribe(...)");
        DisposableKt.plusAssign(this.getDisposable(), disposable0);
    }

    public static final List access$listToPair(DaumCategoryViewModel daumCategoryViewModel0, List list0) {
        daumCategoryViewModel0.getClass();
        List list1 = new ArrayList();
        int v1 = ProgressionUtilKt.getProgressionLastElement(0, list0.size() - 1, 2);
        if(v1 >= 0) {
            for(int v = 0; true; v += 2) {
                ((ArrayList)list1).add(new Pair(list0.get(v), (v + 1 >= list0.size() ? null : list0.get(v + 1))));
                if(v == v1) {
                    break;
                }
            }
        }
        return list1;
    }

    public static final void b(Function1 function10, Object object0) {
        Intrinsics.checkNotNullParameter(function10, "$tmp0");
        function10.invoke(object0);
    }

    public static final void c(Function1 function10, Object object0) {
        Intrinsics.checkNotNullParameter(function10, "$tmp0");
        function10.invoke(object0);
    }

    @NotNull
    public final MutableLiveData getCategories() {
        return this.h;
    }

    public final void getCategories() {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new r(this, null), 3, null);
    }
}

