package com.kakao.keditor.plugin.pluginspec;

import com.kakao.keditor.util.eventbus.PluginSpecRequest;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u00052\u0006\u0010\u000B\u001A\u00020\fJ\u0016\u0010\r\u001A\u00020\t2\u0006\u0010\r\u001A\u00020\u000E2\u0006\u0010\n\u001A\u00020\u0005J\u000E\u0010\u000F\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u0005R \u0010\u0003\u001A\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004X\u0082\u000E¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/PluginSpecRequester;", "", "()V", "requestHandlers", "", "", "", "Lcom/kakao/keditor/plugin/pluginspec/PluginSpec;", "registerPlugins", "", "editorId", "pluginSpecs", "Lcom/kakao/keditor/plugin/pluginspec/PluginSpecs;", "request", "Lcom/kakao/keditor/util/eventbus/PluginSpecRequest;", "unregisterPlugins", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPluginSpecRequester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PluginSpecRequester.kt\ncom/kakao/keditor/plugin/pluginspec/PluginSpecRequester\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,25:1\n1#2:26\n*E\n"})
public final class PluginSpecRequester {
    @NotNull
    public static final PluginSpecRequester INSTANCE;
    @NotNull
    private static Map requestHandlers;

    static {
        PluginSpecRequester.INSTANCE = new PluginSpecRequester();
        PluginSpecRequester.requestHandlers = new LinkedHashMap();
    }

    public final void registerPlugins(int v, @NotNull PluginSpecs pluginSpecs0) {
        Intrinsics.checkNotNullParameter(pluginSpecs0, "pluginSpecs");
        if(!PluginSpecRequester.requestHandlers.containsKey(v)) {
            PluginSpecRequester.requestHandlers.put(v, new ArrayList());
        }
        List list0 = (List)PluginSpecRequester.requestHandlers.get(v);
        if(list0 != null) {
            list0.addAll(pluginSpecs0.getPlugins());
        }
    }

    public final void request(@NotNull PluginSpecRequest pluginSpecRequest0, int v) {
        Intrinsics.checkNotNullParameter(pluginSpecRequest0, "request");
        List list0 = (List)PluginSpecRequester.requestHandlers.get(v);
        if(list0 != null) {
            Object object0 = null;
            for(Object object1: list0) {
                if(((PluginSpec)object1).typeOf(pluginSpecRequest0.getRequestType())) {
                    object0 = object1;
                    break;
                }
            }
            if(((PluginSpec)object0) != null) {
                ((PluginSpec)object0).onRequest(pluginSpecRequest0);
            }
        }
    }

    public final void unregisterPlugins(int v) {
        PluginSpecRequester.requestHandlers.remove(v);
    }
}

