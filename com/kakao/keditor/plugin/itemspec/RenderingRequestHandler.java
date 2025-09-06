package com.kakao.keditor.plugin.itemspec;

import android.view.View;
import com.kakao.keditor.util.eventbus.ViewRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001C\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001A\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/RenderingRequestHandler;", "", "onRenderingRequest", "", "itemView", "Landroid/view/View;", "request", "Lcom/kakao/keditor/util/eventbus/ViewRequest;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface RenderingRequestHandler {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static void onRenderingRequest(@NotNull RenderingRequestHandler renderingRequestHandler0, @Nullable View view0, @NotNull ViewRequest viewRequest0) {
            Intrinsics.checkNotNullParameter(viewRequest0, "request");
        }

        public static void onRenderingRequest$default(RenderingRequestHandler renderingRequestHandler0, View view0, ViewRequest viewRequest0, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRenderingRequest");
            }
            if((v & 1) != 0) {
                view0 = null;
            }
            renderingRequestHandler0.onRenderingRequest(view0, viewRequest0);
        }
    }

    void onRenderingRequest(@Nullable View arg1, @NotNull ViewRequest arg2);
}

