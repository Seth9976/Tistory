package com.kakao.keditor.toolbar;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.kakao.keditor.plugin.attrs.Alignment.Left;
import com.kakao.keditor.toolbar.category.ToolbarCategory.Idle;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001A\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u0007¨\u0006\u000B"}, d2 = {"Lcom/kakao/keditor/toolbar/KeditorToolbarViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "sort", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kakao/keditor/plugin/attrs/Alignment;", "getSort", "()Landroidx/lifecycle/MutableLiveData;", "toolbarCategory", "Lcom/kakao/keditor/toolbar/category/ToolbarCategory;", "getToolbarCategory", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class KeditorToolbarViewModel extends ViewModel {
    @NotNull
    private final MutableLiveData sort;
    @NotNull
    private final MutableLiveData toolbarCategory;

    public KeditorToolbarViewModel() {
        this.toolbarCategory = new MutableLiveData(Idle.INSTANCE);
        this.sort = new MutableLiveData(Left.INSTANCE);
    }

    @NotNull
    public final MutableLiveData getSort() {
        return this.sort;
    }

    @NotNull
    public final MutableLiveData getToolbarCategory() {
        return this.toolbarCategory;
    }
}

