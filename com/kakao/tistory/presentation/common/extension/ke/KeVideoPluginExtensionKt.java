package com.kakao.tistory.presentation.common.extension.ke;

import android.app.Activity;
import com.kakao.keditor.event.EventFlow;
import com.kakao.keditor.plugin.PickerOpener.Requester;
import com.kakao.keditor.plugin.pluginspec.video.VideoPluginSpec;
import com.kakao.kphotopicker.GalleryPicker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001A\u0011\u0010\u0002\u001A\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/video/VideoPluginSpec;", "", "setVideoConfigs", "(Lcom/kakao/keditor/plugin/pluginspec/video/VideoPluginSpec;)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class KeVideoPluginExtensionKt {
    public static final void setVideoConfigs(@NotNull VideoPluginSpec videoPluginSpec0) {
        Intrinsics.checkNotNullParameter(videoPluginSpec0, "<this>");
        videoPluginSpec0.setPickerOpener(new Requester() {
            @Override  // com.kakao.keditor.plugin.PickerOpener$Requester
            public void openPicker(@NotNull Activity activity0, @Nullable EventFlow eventFlow0) {
                Intrinsics.checkNotNullParameter(activity0, "activity");
                activity0.startActivityForResult(GalleryPicker.INSTANCE.newIntent(activity0, 10, d.a), videoPluginSpec0.getPickerRequestCode());
            }
        });
    }
}

