package com.kakao.tistory.presentation.view.editor;

import com.kakao.keditor.plugin.itemspec.opengraph.OpenGraphItem;
import com.kakao.keditor.plugin.itemspec.opengraph.loader.OpenGraphAsyncLoader;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J+\u0010\u0007\u001A\u00020\u00052\u0006\u0010\u0003\u001A\u00020\u00022\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/kakao/tistory/presentation/view/editor/EditorActivity$initKeditor$1", "Lcom/kakao/keditor/plugin/itemspec/opengraph/loader/OpenGraphAsyncLoader;", "Lcom/kakao/keditor/plugin/itemspec/opengraph/OpenGraphItem;", "item", "Lkotlin/Function1;", "", "callback", "loadAsync", "(Lcom/kakao/keditor/plugin/itemspec/opengraph/OpenGraphItem;Lkotlin/jvm/functions/Function1;)V", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class EditorActivity.initKeditor.1 implements OpenGraphAsyncLoader {
    public final EditorActivity a;

    public EditorActivity.initKeditor.1(EditorActivity editorActivity0) {
        this.a = editorActivity0;
        super();
    }

    @Override  // com.kakao.keditor.plugin.itemspec.opengraph.loader.OpenGraphAsyncLoader
    public void loadAsync(@NotNull OpenGraphItem openGraphItem0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(openGraphItem0, "item");
        Intrinsics.checkNotNullParameter(function10, "callback");
        EditorActivity.access$getEditorViewModel(this.a).loadOpenGraphSync(openGraphItem0, function10);
    }
}

