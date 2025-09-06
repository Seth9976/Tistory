package com.kakao.keditor.plugin.itemspec.opengraph.loader;

import com.kakao.keditor.plugin.itemspec.opengraph.OpenGraphItem;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u0007H&¨\u0006\b"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/opengraph/loader/OpenGraphAsyncLoader;", "Lcom/kakao/keditor/plugin/itemspec/opengraph/loader/Loader;", "loadAsync", "", "item", "Lcom/kakao/keditor/plugin/itemspec/opengraph/OpenGraphItem;", "callback", "Lkotlin/Function1;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface OpenGraphAsyncLoader extends Loader {
    void loadAsync(@NotNull OpenGraphItem arg1, @NotNull Function1 arg2);
}

