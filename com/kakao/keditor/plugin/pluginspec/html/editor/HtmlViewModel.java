package com.kakao.keditor.plugin.pluginspec.html.editor;

import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.kakao.keditor.plugin.itemspec.html.HtmlItem;
import com.kakao.keditor.plugin.pluginspec.html.editor.actions.OnCloseClicked;
import com.kakao.keditor.plugin.pluginspec.html.editor.actions.OnConfirmClicked;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000E\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u0013J\u000E\u0010\u0014\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u0013J\u000E\u0010\u0015\u001A\u00020\u00112\u0006\u0010\u0016\u001A\u00020\u0017R\u0017\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0017\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u000B0\u0006¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\tR\u001F\u0010\r\u001A\u0010\u0012\f\u0012\n \u000F*\u0004\u0018\u00010\u000E0\u000E0\u0006¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/html/editor/HtmlViewModel;", "Landroidx/lifecycle/ViewModel;", "handle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "action", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kakao/keditor/plugin/pluginspec/html/editor/actions/Action;", "getAction", "()Landroidx/lifecycle/MutableLiveData;", "htmlItem", "Lcom/kakao/keditor/plugin/itemspec/html/HtmlItem;", "getHtmlItem", "isEditMode", "", "kotlin.jvm.PlatformType", "onCloseClicked", "", "v", "Landroid/view/View;", "onConfirmClicked", "setCode", "code", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class HtmlViewModel extends ViewModel {
    @NotNull
    private final MutableLiveData action;
    @NotNull
    private final MutableLiveData htmlItem;
    @NotNull
    private final MutableLiveData isEditMode;

    public HtmlViewModel(@NotNull SavedStateHandle savedStateHandle0) {
        Intrinsics.checkNotNullParameter(savedStateHandle0, "handle");
        super();
        this.action = new MutableLiveData();
        this.isEditMode = new MutableLiveData(Boolean.valueOf(savedStateHandle0.get("data") != null));
        this.htmlItem = savedStateHandle0.getLiveData("data", new HtmlItem());
    }

    @NotNull
    public final MutableLiveData getAction() {
        return this.action;
    }

    @NotNull
    public final MutableLiveData getHtmlItem() {
        return this.htmlItem;
    }

    @NotNull
    public final MutableLiveData isEditMode() {
        return this.isEditMode;
    }

    public final void onCloseClicked(@NotNull View view0) {
        Intrinsics.checkNotNullParameter(view0, "v");
        this.action.setValue(OnCloseClicked.INSTANCE);
    }

    public final void onConfirmClicked(@NotNull View view0) {
        Intrinsics.checkNotNullParameter(view0, "v");
        this.action.setValue(OnConfirmClicked.INSTANCE);
    }

    public final void setCode(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "code");
        HtmlItem htmlItem0 = (HtmlItem)this.htmlItem.getValue();
        if(htmlItem0 != null) {
            htmlItem0.setSource(s);
        }
    }
}

