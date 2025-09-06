package com.kakao.keditor.plugin.pluginspec;

import com.kakao.keditor.util.eventbus.PluginSpecRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/RequestHandler;", "", "onRequest", "", "request", "Lcom/kakao/keditor/util/eventbus/PluginSpecRequest;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface RequestHandler {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static void onRequest(@NotNull RequestHandler requestHandler0, @NotNull PluginSpecRequest pluginSpecRequest0) {
            Intrinsics.checkNotNullParameter(pluginSpecRequest0, "request");
        }
    }

    void onRequest(@NotNull PluginSpecRequest arg1);
}

