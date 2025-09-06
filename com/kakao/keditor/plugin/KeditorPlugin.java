package com.kakao.keditor.plugin;

import com.kakao.keditor.cdm.CDM.Item;
import com.kakao.keditor.event.Event;
import com.kakao.keditor.event.EventFlow;
import com.kakao.keditor.request.PluginRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0015\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0011\u001A\u00020\u00122\u0006\u0010\u0013\u001A\u00020\u0014H\u0016J\u000E\u0010\u0015\u001A\u00020\u00162\u0006\u0010\u0017\u001A\u00020\u0018J\u0010\u0010\u0019\u001A\u00020\u00122\u0006\u0010\u001A\u001A\u00020\u001BH\u0016R\u0014\u0010\u0004\u001A\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0014\u0010\u0006\u001A\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0018\u0010\r\u001A\u00020\u0005X¦\u000E¢\u0006\f\u001A\u0004\b\u000E\u0010\n\"\u0004\b\u000F\u0010\u0010¨\u0006\u001C"}, d2 = {"Lcom/kakao/keditor/plugin/KeditorPlugin;", "T", "Lcom/kakao/keditor/KeditorItem;", "Lcom/kakao/keditor/plugin/Plugin;", "editorId", "", "flow", "Lcom/kakao/keditor/event/EventFlow;", "(ILcom/kakao/keditor/event/EventFlow;)V", "getEditorId", "()I", "getFlow", "()Lcom/kakao/keditor/event/EventFlow;", "layout", "getLayout", "setLayout", "(I)V", "isSupport", "", "item", "Lcom/kakao/keditor/cdm/CDM$Item;", "post", "", "event", "Lcom/kakao/keditor/event/Event;", "typeOf", "type", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class KeditorPlugin implements Plugin {
    private final int editorId;
    @NotNull
    private final EventFlow flow;

    public KeditorPlugin(int v, @NotNull EventFlow eventFlow0) {
        Intrinsics.checkNotNullParameter(eventFlow0, "flow");
        super();
        this.editorId = v;
        this.flow = eventFlow0;
    }

    public int getEditorId() {
        return this.editorId;
    }

    @Override  // com.kakao.keditor.plugin.Plugin
    @NotNull
    public EventFlow getFlow() {
        return this.flow;
    }

    public abstract int getLayout();

    @Override  // com.kakao.keditor.plugin.ModelConverter
    public boolean isSupport(@NotNull Item cDM$Item0) {
        Intrinsics.checkNotNullParameter(cDM$Item0, "item");
        return true;
    }

    @Override  // com.kakao.keditor.plugin.Plugin
    public void onItemDeleted() {
    }

    @Override  // com.kakao.keditor.plugin.Plugin
    public void onPluginRequest(@NotNull PluginRequest pluginRequest0) {
        DefaultImpls.onPluginRequest(this, pluginRequest0);
    }

    public final void post(@NotNull Event event0) {
        Intrinsics.checkNotNullParameter(event0, "event");
        this.getFlow().post(event0);
    }

    public abstract void setLayout(int arg1);

    @Override  // com.kakao.keditor.plugin.Plugin
    public boolean typeOf(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "type");
        return Intrinsics.areEqual(s, KeditorPluginKt.type(this.getClass()));
    }
}

