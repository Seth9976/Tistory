package com.kakao.keditor.plugin.pluginspec.contentsearch.webview;

import android.webkit.JavascriptInterface;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kakao.keditor.delegate.JsonConverterKt;
import com.kakao.keditor.exception.MissingJsonConverterException;
import com.squareup.moshi.Moshi.Builder;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\fH\u0007R\u001C\u0010\u0003\u001A\u0004\u0018\u00010\u0004X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000E"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/contentsearch/webview/ContentSearchWebViewJavascriptInterface;", "", "()V", "onActionListener", "Lcom/kakao/keditor/plugin/pluginspec/contentsearch/webview/ContentSearchWebViewJavascriptInterface$OnActionListener;", "getOnActionListener", "()Lcom/kakao/keditor/plugin/pluginspec/contentsearch/webview/ContentSearchWebViewJavascriptInterface$OnActionListener;", "setOnActionListener", "(Lcom/kakao/keditor/plugin/pluginspec/contentsearch/webview/ContentSearchWebViewJavascriptInterface$OnActionListener;)V", "postMessage", "", "messageJson", "", "OnActionListener", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nContentSearchWebViewJavascriptInterface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentSearchWebViewJavascriptInterface.kt\ncom/kakao/keditor/plugin/pluginspec/contentsearch/webview/ContentSearchWebViewJavascriptInterface\n+ 2 JsonConverter.kt\ncom/kakao/keditor/delegate/JsonConverterKt\n*L\n1#1,30:1\n13#2,12:31\n26#2,14:43\n*S KotlinDebug\n*F\n+ 1 ContentSearchWebViewJavascriptInterface.kt\ncom/kakao/keditor/plugin/pluginspec/contentsearch/webview/ContentSearchWebViewJavascriptInterface\n*L\n14#1:31,12\n18#1:43,14\n*E\n"})
public final class ContentSearchWebViewJavascriptInterface {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001A\u00020\u0003H&J\u0010\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/contentsearch/webview/ContentSearchWebViewJavascriptInterface$OnActionListener;", "", "close", "", "onInsertContent", "cdmItemJson", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public interface OnActionListener {
        void close();

        void onInsertContent(@NotNull String arg1);
    }

    @Nullable
    private OnActionListener onActionListener;

    @Nullable
    public final OnActionListener getOnActionListener() {
        return this.onActionListener;
    }

    @JavascriptInterface
    public final void postMessage(@NotNull String s) {
        String s2;
        Object object0;
        Intrinsics.checkNotNullParameter(s, "messageJson");
        Class class0 = JsonConverterKt.jsonConverterClass();
        Class class1 = Moshi.class;
        boolean z = Intrinsics.areEqual(class0, class1);
        Class class2 = Gson.class;
        Class class3 = ContentSearchWebViewMessage.class;
        if(z) {
            object0 = new Builder().add(new KotlinJsonAdapterFactory()).build().adapter(class3).fromJson(s);
        }
        else if(Intrinsics.areEqual(class0, class2)) {
            object0 = new GsonBuilder().create().fromJson(s, class3);
        }
        else {
            throw new MissingJsonConverterException();
        }
        Map map0 = null;
        String s1 = ((ContentSearchWebViewMessage)object0) == null ? null : ((ContentSearchWebViewMessage)object0).getType();
        if(Intrinsics.areEqual(s1, "close")) {
            OnActionListener contentSearchWebViewJavascriptInterface$OnActionListener0 = this.onActionListener;
            if(contentSearchWebViewJavascriptInterface$OnActionListener0 != null) {
                contentSearchWebViewJavascriptInterface$OnActionListener0.close();
            }
        }
        else if(Intrinsics.areEqual(s1, "insertContent")) {
            Object object1 = ((ContentSearchWebViewMessage)object0).getPayload();
            if(object1 instanceof Map) {
                map0 = (Map)object1;
            }
            Class class4 = JsonConverterKt.jsonConverterClass();
            if(Intrinsics.areEqual(class4, class2)) {
                s2 = new GsonBuilder().create().toJson(map0);
            }
            else {
                if(!Intrinsics.areEqual(class4, class1)) {
                    throw new MissingJsonConverterException();
                }
                s2 = new Builder().add(new KotlinJsonAdapterFactory()).build().adapter(Map.class).toJson(map0);
            }
            Intrinsics.checkNotNull(s2);
            OnActionListener contentSearchWebViewJavascriptInterface$OnActionListener1 = this.onActionListener;
            if(contentSearchWebViewJavascriptInterface$OnActionListener1 != null) {
                contentSearchWebViewJavascriptInterface$OnActionListener1.onInsertContent(s2);
            }
        }
        else {
            OnActionListener contentSearchWebViewJavascriptInterface$OnActionListener2 = this.onActionListener;
            if(contentSearchWebViewJavascriptInterface$OnActionListener2 != null) {
                contentSearchWebViewJavascriptInterface$OnActionListener2.close();
            }
        }
    }

    public final void setOnActionListener(@Nullable OnActionListener contentSearchWebViewJavascriptInterface$OnActionListener0) {
        this.onActionListener = contentSearchWebViewJavascriptInterface$OnActionListener0;
    }
}

