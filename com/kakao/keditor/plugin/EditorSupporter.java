package com.kakao.keditor.plugin;

import android.app.Activity;
import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;
import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.event.EventFlow;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J+\u0010\u0016\u001A\u00020\u00172\u0006\u0010\u0018\u001A\u00020\u00192\n\b\u0002\u0010\u001A\u001A\u0004\u0018\u00010\u001B2\b\u0010\u001C\u001A\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u001DR \u0010\u0004\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005X¦\u000E¢\u0006\f\u001A\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0018\u0010\n\u001A\u00020\u000BX¦\u000E¢\u0006\f\u001A\u0004\b\f\u0010\r\"\u0004\b\u000E\u0010\u000FR\u001A\u0010\u0010\u001A\u0004\u0018\u00010\u0011X¦\u000E¢\u0006\f\u001A\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001E"}, d2 = {"Lcom/kakao/keditor/plugin/EditorSupporter;", "T", "Lcom/kakao/keditor/KeditorItem;", "", "editorOpener", "Lcom/kakao/keditor/plugin/EditorOpener;", "getEditorOpener", "()Lcom/kakao/keditor/plugin/EditorOpener;", "setEditorOpener", "(Lcom/kakao/keditor/plugin/EditorOpener;)V", "editorRequestCode", "", "getEditorRequestCode", "()I", "setEditorRequestCode", "(I)V", "editorResultHandler", "Lcom/kakao/keditor/plugin/EditorResultHandler;", "getEditorResultHandler", "()Lcom/kakao/keditor/plugin/EditorResultHandler;", "setEditorResultHandler", "(Lcom/kakao/keditor/plugin/EditorResultHandler;)V", "openEditor", "", "activity", "Landroid/app/Activity;", "flow", "Lcom/kakao/keditor/event/EventFlow;", "item", "(Landroid/app/Activity;Lcom/kakao/keditor/event/EventFlow;Lcom/kakao/keditor/KeditorItem;)V", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface EditorSupporter {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static void openEditor(@NotNull EditorSupporter editorSupporter0, @NotNull Activity activity0, @Nullable EventFlow eventFlow0, @Nullable KeditorItem keditorItem0) {
            Intrinsics.checkNotNullParameter(activity0, "activity");
            if(editorSupporter0.getEditorOpener() instanceof Requester) {
                EditorOpener editorOpener0 = editorSupporter0.getEditorOpener();
                Intrinsics.checkNotNull(editorOpener0, "null cannot be cast to non-null type com.kakao.keditor.plugin.EditorOpener.Requester<T of com.kakao.keditor.plugin.EditorSupporter>");
                ((Requester)editorOpener0).openEditor(activity0, eventFlow0, keditorItem0);
                return;
            }
            if(activity0 instanceof AppCompatActivity) {
                EditorOpener editorOpener1 = editorSupporter0.getEditorOpener();
                Intrinsics.checkNotNull(editorOpener1, "null cannot be cast to non-null type com.kakao.keditor.plugin.EditorOpener.IntentLauncher<T of com.kakao.keditor.plugin.EditorSupporter>");
                Intent intent0 = ((IntentLauncher)editorOpener1).getEditorIntent(((AppCompatActivity)activity0), keditorItem0);
                if(intent0 != null) {
                    ActivityResultLauncher activityResultLauncher0 = ((IntentLauncher)editorOpener1).getEditorResultLauncher();
                    if(activityResultLauncher0 != null) {
                        activityResultLauncher0.launch(intent0);
                    }
                }
            }
        }

        public static void openEditor$default(EditorSupporter editorSupporter0, Activity activity0, EventFlow eventFlow0, KeditorItem keditorItem0, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openEditor");
            }
            if((v & 2) != 0) {
                eventFlow0 = null;
            }
            editorSupporter0.openEditor(activity0, eventFlow0, keditorItem0);
        }
    }

    @Nullable
    EditorOpener getEditorOpener();

    int getEditorRequestCode();

    @Nullable
    EditorResultHandler getEditorResultHandler();

    void openEditor(@NotNull Activity arg1, @Nullable EventFlow arg2, @Nullable KeditorItem arg3);

    void setEditorOpener(@Nullable EditorOpener arg1);

    void setEditorRequestCode(int arg1);

    void setEditorResultHandler(@Nullable EditorResultHandler arg1);
}

