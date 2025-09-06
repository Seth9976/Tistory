package com.kakao.tistory.presentation.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kakao.tistory.domain.entity.CategoryItem;
import com.kakao.tistory.domain.repository.OldBlogRepository;
import com.kakao.tistory.presentation.common.extension.Event;
import com.kakao.tistory.presentation.view.editor.EditorSettingTiara;
import com.kakao.tistory.presentation.viewmodel.base.TistoryViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.IntRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;
import sc.a;

@StabilityInferred(parameters = 0)
@HiltViewModel
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001A\u00020\b2\u0006\u0010\f\u001A\u00020\u000B¢\u0006\u0004\b\r\u0010\u000ER\"\u0010\u0016\u001A\u00020\u000F8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R#\u0010\u001C\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000B0\u00180\u00178\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\t\u0010\u001BR\u001D\u0010!\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000B0\u001E0\u001D8F¢\u0006\u0006\u001A\u0004\b\u001F\u0010 ¨\u0006\""}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/BlogCategoryViewModel;", "Lcom/kakao/tistory/presentation/viewmodel/base/TistoryViewModel;", "Lcom/kakao/tistory/domain/repository/OldBlogRepository;", "oldBlogRepository", "<init>", "(Lcom/kakao/tistory/domain/repository/OldBlogRepository;)V", "", "blogName", "", "getCategories", "(Ljava/lang/String;)V", "Lcom/kakao/tistory/domain/entity/CategoryItem;", "item", "onClickCategoryItem", "(Lcom/kakao/tistory/domain/entity/CategoryItem;)V", "", "h", "Z", "getEditMode", "()Z", "setEditMode", "(Z)V", "editMode", "Landroidx/lifecycle/MutableLiveData;", "", "i", "Landroidx/lifecycle/MutableLiveData;", "()Landroidx/lifecycle/MutableLiveData;", "categories", "Landroidx/lifecycle/LiveData;", "Lcom/kakao/tistory/presentation/common/extension/Event;", "getSelectedCategoryItem", "()Landroidx/lifecycle/LiveData;", "selectedCategoryItem", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBlogCategoryViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogCategoryViewModel.kt\ncom/kakao/tistory/presentation/viewmodel/BlogCategoryViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,98:1\n1747#2,3:99\n*S KotlinDebug\n*F\n+ 1 BlogCategoryViewModel.kt\ncom/kakao/tistory/presentation/viewmodel/BlogCategoryViewModel\n*L\n51#1:99,3\n*E\n"})
public final class BlogCategoryViewModel extends TistoryViewModel {
    public static final int $stable = 8;
    public final OldBlogRepository g;
    public boolean h;
    public final MutableLiveData i;
    public final MutableLiveData j;

    @Inject
    public BlogCategoryViewModel(@NotNull OldBlogRepository oldBlogRepository0) {
        Intrinsics.checkNotNullParameter(oldBlogRepository0, "oldBlogRepository");
        super();
        this.g = oldBlogRepository0;
        this.i = new MutableLiveData();
        this.j = new MutableLiveData();
    }

    public static final ObservableSource a(Function1 function10, Object object0) {
        Intrinsics.checkNotNullParameter(function10, "$tmp0");
        Intrinsics.checkNotNullParameter(object0, "p0");
        return (ObservableSource)function10.invoke(object0);
    }

    public final void a(List list0) {
        this.isShowProgress().setValue(Boolean.TRUE);
        IntRef ref$IntRef0 = new IntRef();
        if(!(list0 instanceof Collection) || !list0.isEmpty()) {
            for(Object object0: list0) {
                if(((CategoryItem)object0).getId() != -3) {
                    continue;
                }
                goto label_9;
            }
        }
        list0.add(0, new CategoryItem(-3, null, null, null, null, null, null, 0, 0, null, false, null, null, 0x1FFE, null));
    label_9:
        Disposable disposable0 = Observable.fromIterable(list0).concatMap(new a(new d(ref$IntRef0), 0)).toList().subscribe(new hc.d(new e(this), 7), new hc.d(new f(this), 8));
        Intrinsics.checkNotNullExpressionValue(disposable0, "subscribe(...)");
        DisposableKt.plusAssign(this.getDisposable(), disposable0);
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
        return this.i;
    }

    public final void getCategories(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new c(this, s, null), 3, null);
    }

    public final boolean getEditMode() {
        return this.h;
    }

    @NotNull
    public final LiveData getSelectedCategoryItem() {
        return this.j;
    }

    public final void onClickCategoryItem(@NotNull CategoryItem categoryItem0) {
        Intrinsics.checkNotNullParameter(categoryItem0, "item");
        EditorSettingTiara.INSTANCE.trackClickCategoryItem(String.valueOf(categoryItem0.getParentOrder()), String.valueOf(categoryItem0.getChildOrder()), (categoryItem0.getName() == null ? "" : categoryItem0.getName()));
        Event event0 = new Event(categoryItem0);
        this.j.setValue(event0);
    }

    public final void setEditMode(boolean z) {
        this.h = z;
    }
}

