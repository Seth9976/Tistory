package com.kakao.keditor.plugin;

import android.app.Activity;
import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;
import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.event.EventFlow;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0002\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/kakao/keditor/plugin/EditorOpener;", "T", "Lcom/kakao/keditor/KeditorItem;", "", "()V", "IntentLauncher", "Requester", "Lcom/kakao/keditor/plugin/EditorOpener$IntentLauncher;", "Lcom/kakao/keditor/plugin/EditorOpener$Requester;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class EditorOpener {
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0004J!\u0010\f\u001A\u0004\u0018\u00010\u00072\u0006\u0010\r\u001A\u00020\u000E2\b\u0010\u000F\u001A\u0004\u0018\u00018\u0001H&¢\u0006\u0002\u0010\u0010R\"\u0010\u0005\u001A\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000B¨\u0006\u0011"}, d2 = {"Lcom/kakao/keditor/plugin/EditorOpener$IntentLauncher;", "T", "Lcom/kakao/keditor/KeditorItem;", "Lcom/kakao/keditor/plugin/EditorOpener;", "()V", "editorResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "getEditorResultLauncher", "()Landroidx/activity/result/ActivityResultLauncher;", "setEditorResultLauncher", "(Landroidx/activity/result/ActivityResultLauncher;)V", "getEditorIntent", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "item", "(Landroidx/appcompat/app/AppCompatActivity;Lcom/kakao/keditor/KeditorItem;)Landroid/content/Intent;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static abstract class IntentLauncher extends EditorOpener {
        @Nullable
        private ActivityResultLauncher editorResultLauncher;

        public IntentLauncher() {
            super(null);
        }

        @Nullable
        public abstract Intent getEditorIntent(@NotNull AppCompatActivity arg1, @Nullable KeditorItem arg2);

        @Nullable
        public ActivityResultLauncher getEditorResultLauncher() {
            return this.editorResultLauncher;
        }

        public void setEditorResultLauncher(@Nullable ActivityResultLauncher activityResultLauncher0) {
            this.editorResultLauncher = activityResultLauncher0;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0004J+\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\n2\b\u0010\u000B\u001A\u0004\u0018\u00018\u0001H&¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/keditor/plugin/EditorOpener$Requester;", "T", "Lcom/kakao/keditor/KeditorItem;", "Lcom/kakao/keditor/plugin/EditorOpener;", "()V", "openEditor", "", "activity", "Landroid/app/Activity;", "flow", "Lcom/kakao/keditor/event/EventFlow;", "item", "(Landroid/app/Activity;Lcom/kakao/keditor/event/EventFlow;Lcom/kakao/keditor/KeditorItem;)V", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static abstract class Requester extends EditorOpener {
        public Requester() {
            super(null);
        }

        public abstract void openEditor(@NotNull Activity arg1, @Nullable EventFlow arg2, @Nullable KeditorItem arg3);

        public static void openEditor$default(Requester editorOpener$Requester0, Activity activity0, EventFlow eventFlow0, KeditorItem keditorItem0, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openEditor");
            }
            if((v & 2) != 0) {
                eventFlow0 = null;
            }
            editorOpener$Requester0.openEditor(activity0, eventFlow0, keditorItem0);
        }
    }

    private EditorOpener() {
    }

    public EditorOpener(DefaultConstructorMarker defaultConstructorMarker0) {
    }
}

