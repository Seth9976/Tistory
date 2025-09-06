package com.kakao.tistory.presentation.common.extension.ke;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.kakao.keditor.Keditor;
import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.delegate.ImageLoader;
import com.kakao.keditor.event.EventFlow;
import com.kakao.keditor.plugin.EditorResultHandler;
import com.kakao.keditor.plugin.PickerOpener.Requester;
import com.kakao.keditor.plugin.pluginspec.image.ImageItem;
import com.kakao.keditor.plugin.pluginspec.image.ImagePluginSpec;
import com.kakao.keditor.util.eventbus.KeEvent;
import com.kakao.keditor.util.eventbus.PluginSpecRequest.UpdateFocusedImageUri;
import com.kakao.kphotopicker.GalleryPicker;
import com.kakao.tistory.presentation.TistoryPhotoEditor;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.k;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A\u001B\u0010\u0004\u001A\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001A\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001A!\u0010\n\u001A\u00020\u0003*\u00020\u00062\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\u0001¢\u0006\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/image/ImagePluginSpec;", "", "defaultSignature", "", "setImageConfigs", "(Lcom/kakao/keditor/plugin/pluginspec/image/ImagePluginSpec;Ljava/lang/String;)V", "Lcom/kakao/tistory/presentation/TistoryPhotoEditor;", "Landroid/app/Activity;", "activity", "url", "open", "(Lcom/kakao/tistory/presentation/TistoryPhotoEditor;Landroid/app/Activity;Ljava/lang/String;)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class KeImagePluginExtensionKt {
    public static final void open(@NotNull TistoryPhotoEditor tistoryPhotoEditor0, @NotNull Activity activity0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(tistoryPhotoEditor0, "<this>");
        Intrinsics.checkNotNullParameter(activity0, "activity");
        Intrinsics.checkNotNullParameter(s, "url");
        List list0 = k.listOf(s);
        File file0 = activity0.getCacheDir();
        String s1 = file0 == null ? null : file0.getAbsolutePath();
        if(s1 == null) {
            s1 = "";
        }
        activity0.startActivityForResult(tistoryPhotoEditor0.newIntent(activity0, list0, s1), 10423);
    }

    public static final void setImageConfigs(@NotNull ImagePluginSpec imagePluginSpec0, @Nullable String s) {
        Intrinsics.checkNotNullParameter(imagePluginSpec0, "<this>");
        TistoryPhotoEditor tistoryPhotoEditor0 = new TistoryPhotoEditor(new c(s));
        imagePluginSpec0.setEditorRequestCode(10423);
        imagePluginSpec0.setPickerOpener(new Requester() {
            @Override  // com.kakao.keditor.plugin.PickerOpener$Requester
            public void openPicker(@NotNull Activity activity0, @Nullable EventFlow eventFlow0) {
                Intrinsics.checkNotNullParameter(activity0, "activity");
                activity0.startActivityForResult(GalleryPicker.INSTANCE.newIntent(activity0, 10, a.a), imagePluginSpec0.getPickerRequestCode());
            }
        });
        imagePluginSpec0.setEditorOpener(new com.kakao.keditor.plugin.EditorOpener.Requester() {
            @Override  // com.kakao.keditor.plugin.EditorOpener$Requester
            public void openEditor(Activity activity0, EventFlow eventFlow0, KeditorItem keditorItem0) {
                this.openEditor(activity0, eventFlow0, ((ImageItem)keditorItem0));
            }

            public void openEditor(@NotNull Activity activity0, @Nullable EventFlow eventFlow0, @Nullable ImageItem imageItem0) {
                Intrinsics.checkNotNullParameter(activity0, "activity");
                if(imageItem0 != null) {
                    TistoryPhotoEditor tistoryPhotoEditor0 = tistoryPhotoEditor0;
                    if(p.startsWith$default(imageItem0.getSrc(), "http", false, 2, null)) {
                        ImageLoader imageLoader0 = Keditor.INSTANCE.getImageLoader();
                        if(imageLoader0 != null) {
                            imageLoader0.downloadImage(imageItem0.getSrc(), activity0, new b(tistoryPhotoEditor0, activity0));
                        }
                    }
                    else {
                        KeImagePluginExtensionKt.open(tistoryPhotoEditor0, activity0, imageItem0.getSrc());
                    }
                }
            }
        });
        imagePluginSpec0.setEditorResultHandler(new EditorResultHandler() {
            @Override  // com.kakao.keditor.plugin.EditorResultHandler
            public void onEditorResult(int v, @Nullable Intent intent0) {
                if(v != -1) {
                    return;
                }
                String s = (String)CollectionsKt___CollectionsKt.firstOrNull(tistoryPhotoEditor0.onActivityResult(-1, intent0).values());
                if(s != null) {
                    Uri uri0 = Uri.parse(s);
                    Intrinsics.checkNotNullExpressionValue(uri0, "parse(...)");
                    UpdateFocusedImageUri pluginSpecRequest$UpdateFocusedImageUri0 = new UpdateFocusedImageUri(uri0);
                    KeEvent.INSTANCE.postInScope(pluginSpecRequest$UpdateFocusedImageUri0);
                }
            }
        });
    }
}

