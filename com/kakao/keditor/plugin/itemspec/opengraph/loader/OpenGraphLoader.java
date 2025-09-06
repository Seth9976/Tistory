package com.kakao.keditor.plugin.itemspec.opengraph.loader;

import com.kakao.keditor.plugin.itemspec.opengraph.OpenGraphItem;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/opengraph/loader/OpenGraphLoader;", "Lcom/kakao/keditor/plugin/itemspec/opengraph/loader/Loader;", "load", "Lcom/kakao/keditor/plugin/itemspec/opengraph/OpenGraphItem;", "item", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface OpenGraphLoader extends Loader {
    @NotNull
    OpenGraphItem load(@NotNull OpenGraphItem arg1);
}

