package com.kakao.keditor.plugin;

import com.kakao.keditor.event.EventFlow;
import com.kakao.keditor.request.PluginRequest;
import com.kakao.keditor.request.RenderingRequestHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u000E\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u0005J\b\u0010\n\u001A\u00020\u000BH\u0016J\u0010\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u000EH\u0016J\u0010\u0010\u000F\u001A\u00020\u00102\u0006\u0010\u0011\u001A\u00020\u0012H&R\u0012\u0010\u0006\u001A\u00020\u0007X¦\u0004¢\u0006\u0006\u001A\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/kakao/keditor/plugin/Plugin;", "T", "Lcom/kakao/keditor/KeditorItem;", "Lcom/kakao/keditor/plugin/ModelConverter;", "Lcom/kakao/keditor/plugin/ItemViewHandler;", "Lcom/kakao/keditor/request/RenderingRequestHandler;", "flow", "Lcom/kakao/keditor/event/EventFlow;", "getFlow", "()Lcom/kakao/keditor/event/EventFlow;", "onItemDeleted", "", "onPluginRequest", "request", "Lcom/kakao/keditor/request/PluginRequest;", "typeOf", "", "type", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface Plugin extends ItemViewHandler, ModelConverter, RenderingRequestHandler {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static void onItemDeleted(@NotNull Plugin plugin0) {
        }

        public static void onPluginRequest(@NotNull Plugin plugin0, @NotNull PluginRequest pluginRequest0) {
            Intrinsics.checkNotNullParameter(pluginRequest0, "request");
        }
    }

    @NotNull
    EventFlow getFlow();

    void onItemDeleted();

    void onPluginRequest(@NotNull PluginRequest arg1);

    boolean typeOf(@NotNull String arg1);
}

