package com.kakao.keditor.plugin.pluginspec.poll;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.provider.MediaStore.Images.Media;
import android.view.View;
import android.widget.Toast;
import androidx.annotation.CallSuper;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.kakao.keditor.Keditor;
import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.KeditorView;
import com.kakao.keditor.R.drawable;
import com.kakao.keditor.R.id;
import com.kakao.keditor.R.string;
import com.kakao.keditor.event.EventFlow;
import com.kakao.keditor.plugin.ActivityResultHandler;
import com.kakao.keditor.plugin.EditorOpener.IntentLauncher;
import com.kakao.keditor.plugin.EditorOpener;
import com.kakao.keditor.plugin.EditorResultHandler;
import com.kakao.keditor.plugin.EditorSupporter;
import com.kakao.keditor.plugin.KeditorPluginType;
import com.kakao.keditor.plugin.PickerSupporter;
import com.kakao.keditor.plugin.attrs.item.ImageUploadable;
import com.kakao.keditor.plugin.attrs.item.Uploadable;
import com.kakao.keditor.plugin.extension.IntentKt;
import com.kakao.keditor.plugin.itemspec.ItemSpecs;
import com.kakao.keditor.plugin.itemspec.poll.PollItem;
import com.kakao.keditor.plugin.itemspec.poll.PollSubItem;
import com.kakao.keditor.plugin.pluginspec.PluginSpec.DefaultImpls;
import com.kakao.keditor.plugin.pluginspec.PluginSpec;
import com.kakao.keditor.plugin.pluginspec.poll.creator.PollCreatorActivity;
import com.kakao.keditor.plugin.pluginspec.poll.creator.PollCreatorAdapter;
import com.kakao.keditor.toolbar.toolbaroverlay.ToolbarOverlayMenuItem;
import com.kakao.keditor.util.eventbus.KeEvent;
import com.kakao.keditor.util.eventbus.PluginSpecRequest.EditKeditorItem;
import com.kakao.keditor.util.eventbus.PluginSpecRequest;
import com.kakao.keditor.util.eventbus.ViewRequest.AddKeditorItems;
import com.kakao.keditor.util.eventbus.ViewRequest.ReplaceItems;
import com.kakao.keditor.widget.KeditorEditText;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@KeditorPluginType(type = "poll")
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\u00020\u0005B\u0005\u00A2\u0006\u0002\u0010\u0006J\u0010\u0010M\u001A\u00020N2\u0006\u0010O\u001A\u00020PH\u0016J\b\u0010Q\u001A\u00020NH\u0016R\u001E\u0010\u0007\u001A\u0004\u0018\u00010\bX\u0096\u000E\u00A2\u0006\u0010\n\u0002\u0010\r\u001A\u0004\b\t\u0010\n\"\u0004\b\u000B\u0010\fR\u001C\u0010\u000E\u001A\u0004\u0018\u00010\u000FX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001E\u0010\u0014\u001A\u0004\u0018\u00010\bX\u0096\u000E\u00A2\u0006\u0010\n\u0002\u0010\r\u001A\u0004\b\u0015\u0010\n\"\u0004\b\u0016\u0010\fR\u001A\u0010\u0017\u001A\u00020\bX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0018\u0010\u0019\"\u0004\b\u001A\u0010\u001BR\"\u0010\u001C\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001DX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001E\u0010\u001F\"\u0004\b \u0010!R\u001C\u0010\"\u001A\u00020\b8VX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b#\u0010\u0019\"\u0004\b$\u0010\u001BR\u001C\u0010%\u001A\u0004\u0018\u00010&X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\'\u0010(\"\u0004\b)\u0010*R\"\u0010+\u001A\n\u0012\u0004\u0012\u00020-\u0018\u00010,X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b.\u0010/\"\u0004\b0\u00101R\u001C\u00102\u001A\u0004\u0018\u000103X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b4\u00105\"\u0004\b6\u00107R\u001C\u00108\u001A\u0004\u0018\u000109X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001A\u0010>\u001A\u00020\bX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b?\u0010\u0019\"\u0004\b@\u0010\u001BR\u001C\u0010A\u001A\u0004\u0018\u00010BX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001C\u0010G\u001A\u0004\u0018\u00010HX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\bI\u0010J\"\u0004\bK\u0010L\u00A8\u0006R"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/poll/PollPluginSpec;", "Lcom/kakao/keditor/plugin/pluginspec/PluginSpec;", "Lcom/kakao/keditor/plugin/EditorSupporter;", "Lcom/kakao/keditor/plugin/itemspec/poll/PollItem;", "Lcom/kakao/keditor/plugin/ActivityResultHandler;", "Lcom/kakao/keditor/plugin/pluginspec/poll/PollImagePickerSupporter;", "()V", "contextMenuDescription", "", "getContextMenuDescription", "()Ljava/lang/Integer;", "setContextMenuDescription", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "contextMenuIcon", "Landroid/view/View;", "getContextMenuIcon", "()Landroid/view/View;", "setContextMenuIcon", "(Landroid/view/View;)V", "contextMenuResource", "getContextMenuResource", "setContextMenuResource", "editorId", "getEditorId", "()I", "setEditorId", "(I)V", "editorOpener", "Lcom/kakao/keditor/plugin/EditorOpener;", "getEditorOpener", "()Lcom/kakao/keditor/plugin/EditorOpener;", "setEditorOpener", "(Lcom/kakao/keditor/plugin/EditorOpener;)V", "editorRequestCode", "getEditorRequestCode", "setEditorRequestCode", "editorResultHandler", "Lcom/kakao/keditor/plugin/EditorResultHandler;", "getEditorResultHandler", "()Lcom/kakao/keditor/plugin/EditorResultHandler;", "setEditorResultHandler", "(Lcom/kakao/keditor/plugin/EditorResultHandler;)V", "itemSpecKeys", "", "", "getItemSpecKeys", "()Ljava/util/List;", "setItemSpecKeys", "(Ljava/util/List;)V", "itemSpecs", "Lcom/kakao/keditor/plugin/itemspec/ItemSpecs;", "getItemSpecs", "()Lcom/kakao/keditor/plugin/itemspec/ItemSpecs;", "setItemSpecs", "(Lcom/kakao/keditor/plugin/itemspec/ItemSpecs;)V", "pollImagePickerOpener", "Lcom/kakao/keditor/plugin/pluginspec/poll/PollImagePickerOpener;", "getPollImagePickerOpener", "()Lcom/kakao/keditor/plugin/pluginspec/poll/PollImagePickerOpener;", "setPollImagePickerOpener", "(Lcom/kakao/keditor/plugin/pluginspec/poll/PollImagePickerOpener;)V", "pollImagePickerRequestCode", "getPollImagePickerRequestCode", "setPollImagePickerRequestCode", "pollImagePickerResultHandler", "Lcom/kakao/keditor/plugin/pluginspec/poll/PollImagePickerResultHandler;", "getPollImagePickerResultHandler", "()Lcom/kakao/keditor/plugin/pluginspec/poll/PollImagePickerResultHandler;", "setPollImagePickerResultHandler", "(Lcom/kakao/keditor/plugin/pluginspec/poll/PollImagePickerResultHandler;)V", "toolbarOverlayMenuItem", "Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuItem;", "getToolbarOverlayMenuItem", "()Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuItem;", "setToolbarOverlayMenuItem", "(Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuItem;)V", "onRequest", "", "request", "Lcom/kakao/keditor/util/eventbus/PluginSpecRequest;", "runIconClick", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PollPluginSpec implements ActivityResultHandler, EditorSupporter, PluginSpec, PollImagePickerSupporter {
    @Nullable
    private Integer contextMenuDescription;
    @Nullable
    private View contextMenuIcon;
    @Nullable
    private Integer contextMenuResource;
    private int editorId;
    @Nullable
    private EditorOpener editorOpener;
    private int editorRequestCode;
    @Nullable
    private EditorResultHandler editorResultHandler;
    @Nullable
    private List itemSpecKeys;
    @Nullable
    private ItemSpecs itemSpecs;
    @Nullable
    private PollImagePickerOpener pollImagePickerOpener;
    private int pollImagePickerRequestCode;
    @Nullable
    private PollImagePickerResultHandler pollImagePickerResultHandler;
    @Nullable
    private ToolbarOverlayMenuItem toolbarOverlayMenuItem;

    public PollPluginSpec() {
        this.itemSpecKeys = k.listOf("poll");
        this.toolbarOverlayMenuItem = new ToolbarOverlayMenuItem(id.ke_overlay_poll, drawable.ke_toolbar_btn_menu_item_poll, string.cd_add_poll, string.plugin_more_poll, null, 16, null);
        this.editorRequestCode = -1;
        this.editorOpener = new IntentLauncher() {
            @Override  // com.kakao.keditor.plugin.EditorOpener$IntentLauncher
            public Intent getEditorIntent(AppCompatActivity appCompatActivity0, KeditorItem keditorItem0) {
                return this.getEditorIntent(appCompatActivity0, ((PollItem)keditorItem0));
            }

            @NotNull
            public Intent getEditorIntent(@NotNull AppCompatActivity appCompatActivity0, @Nullable PollItem pollItem0) {
                int v1;
                Intrinsics.checkNotNullParameter(appCompatActivity0, "activity");
                Intent intent0 = new Intent(appCompatActivity0, PollCreatorActivity.class);
                PollPluginSpec pollPluginSpec0 = PollPluginSpec.this;
                if(pollItem0 != null) {
                    intent0.putExtra("data", pollItem0);
                    intent0.putExtra("keditor_item_index", pollPluginSpec0.indexOf(pollItem0));
                }
                int v = 0;
                if(pollItem0 == null) {
                    v1 = 0;
                }
                else {
                    List list0 = pollItem0.getSubItems();
                    if(list0 == null || list0 instanceof Collection && list0.isEmpty()) {
                        v1 = 0;
                    }
                    else {
                        v1 = 0;
                        for(Object object0: list0) {
                            if(((PollSubItem)object0).getImage().length() > 0) {
                                ++v1;
                                if(v1 < 0) {
                                    CollectionsKt__CollectionsKt.throwCountOverflow();
                                }
                            }
                        }
                    }
                }
                KeditorView keditorView0 = pollPluginSpec0.findKeditorView();
                if(keditorView0 != null) {
                    List list1 = keditorView0.allUploadableItems();
                    if(list1 != null) {
                        if(!(list1 instanceof Collection) || !list1.isEmpty()) {
                            for(Object object1: list1) {
                                if(((Uploadable)object1) instanceof ImageUploadable) {
                                    ++v;
                                    if(v < 0) {
                                        CollectionsKt__CollectionsKt.throwCountOverflow();
                                    }
                                }
                            }
                        }
                        if(v >= v1) {
                            intent0.putExtra("other_image_uploadable_count", v - v1);
                        }
                    }
                }
                intent0.putExtra("attached_poll_image_count", v1);
                intent0.putExtra("editor_id", pollPluginSpec0.getEditorId());
                intent0.putExtra("request_code", pollPluginSpec0.getPollImagePickerRequestCode());
                return intent0;
            }
        };
        this.editorResultHandler = new com.kakao.keditor.plugin.pluginspec.poll.PollPluginSpec.editorResultHandler.1();
        this.pollImagePickerRequestCode = 1000;
        this.pollImagePickerOpener = new com.kakao.keditor.plugin.pluginspec.poll.PollPluginSpec.pollImagePickerOpener.1();
        this.pollImagePickerResultHandler = new com.kakao.keditor.plugin.pluginspec.poll.PollPluginSpec.pollImagePickerResultHandler.1();

        @Metadata(d1 = {"\u0000\u001D\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001A\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\b\u0010\u0006\u001A\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/kakao/keditor/plugin/pluginspec/poll/PollPluginSpec$editorResultHandler$1", "Lcom/kakao/keditor/plugin/EditorResultHandler;", "onEditorResult", "", "resultCode", "", "data", "Landroid/content/Intent;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public final class com.kakao.keditor.plugin.pluginspec.poll.PollPluginSpec.editorResultHandler.1 implements EditorResultHandler {
            @Override  // com.kakao.keditor.plugin.EditorResultHandler
            public void onEditorResult(int v, @Nullable Intent intent0) {
                if(v != -1) {
                    return;
                }
                if(intent0 != null) {
                    PollItem pollItem0 = (PollItem)IntentKt.getSerializableExtraCompat(intent0, "data", PollItem.class);
                    if(pollItem0 != null) {
                        if(intent0.getBooleanExtra("is_edit_flag", false)) {
                            ReplaceItems viewRequest$ReplaceItems0 = new ReplaceItems(0, k.listOf(pollItem0), 0, false, 13, null);
                            KeEvent.INSTANCE.postInScope(viewRequest$ReplaceItems0);
                            return;
                        }
                        AddKeditorItems viewRequest$AddKeditorItems0 = new AddKeditorItems(k.listOf(pollItem0), 0, false, false, 14, null);
                        KeEvent.INSTANCE.postInScope(viewRequest$AddKeditorItems0);
                    }
                }
            }
        }


        @Metadata(d1 = {"\u0000\'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J0\u0010\u0002\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u000E\u0010\u0006\u001A\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\n0\u0007H\u0016¨\u0006\u000B"}, d2 = {"com/kakao/keditor/plugin/pluginspec/poll/PollPluginSpec$pollImagePickerOpener$1", "Lcom/kakao/keditor/plugin/pluginspec/poll/PollImagePickerOpener$IntentLauncher;", "getPollImagePickerIntent", "Landroid/content/Intent;", "pollCreatorActivity", "Landroidx/appcompat/app/AppCompatActivity;", "otherImages", "", "Lcom/kakao/keditor/plugin/attrs/item/ImageUploadable;", "currentPollImages", "Lcom/kakao/keditor/plugin/itemspec/poll/PollSubItem;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public final class com.kakao.keditor.plugin.pluginspec.poll.PollPluginSpec.pollImagePickerOpener.1 extends com.kakao.keditor.plugin.pluginspec.poll.PollImagePickerOpener.IntentLauncher {
            @Override  // com.kakao.keditor.plugin.pluginspec.poll.PollImagePickerOpener$IntentLauncher
            @Nullable
            public Intent getPollImagePickerIntent(@NotNull AppCompatActivity appCompatActivity0, @Nullable List list0, @NotNull List list1) {
                Intrinsics.checkNotNullParameter(appCompatActivity0, "pollCreatorActivity");
                Intrinsics.checkNotNullParameter(list1, "currentPollImages");
                Intent intent0 = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                intent0.setType("image/*");
                return Intent.createChooser(intent0, Keditor.INSTANCE.getContext().getString(string.cd_add_image));
            }
        }


        @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\t2\b\u0010\n\u001A\u0004\u0018\u00010\u000BH\u0016¨\u0006\f"}, d2 = {"com/kakao/keditor/plugin/pluginspec/poll/PollPluginSpec$pollImagePickerResultHandler$1", "Lcom/kakao/keditor/plugin/pluginspec/poll/PollImagePickerResultHandler;", "onPollImagePickerResult", "", "activity", "Landroid/app/Activity;", "pollAdapter", "Lcom/kakao/keditor/plugin/pluginspec/poll/creator/PollCreatorAdapter;", "resultCode", "", "data", "Landroid/content/Intent;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public final class com.kakao.keditor.plugin.pluginspec.poll.PollPluginSpec.pollImagePickerResultHandler.1 implements PollImagePickerResultHandler {
            @Override  // com.kakao.keditor.plugin.pluginspec.poll.PollImagePickerResultHandler
            public void onPollImagePickerResult(@NotNull Activity activity0, @NotNull PollCreatorAdapter pollCreatorAdapter0, int v, @Nullable Intent intent0) {
                Intrinsics.checkNotNullParameter(activity0, "activity");
                Intrinsics.checkNotNullParameter(pollCreatorAdapter0, "pollAdapter");
                if(v != -1) {
                    return;
                }
                if(Build.VERSION.SDK_INT <= 26) {
                    View view0 = activity0.getCurrentFocus();
                    if(view0 != null) {
                        view0.clearFocus();
                    }
                }
                if(intent0 != null && intent0.getData() != null) {
                    pollCreatorAdapter0.setPollImage(String.valueOf(intent0.getData()));
                }
            }
        }

    }

    @Override  // com.kakao.keditor.plugin.pluginspec.PluginSpec
    public boolean addToolbarOverlayMenu() {
        return true;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.PluginSpec
    @Nullable
    public View createIconForContextMenu(@NotNull Context context0) {
        return DefaultImpls.createIconForContextMenu(this, context0);
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.PluginSpec
    @NotNull
    public List createKeditorItems(int v) {
        return DefaultImpls.createKeditorItems(this, v);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.KeditorBridge
    @Nullable
    public Activity findActivity() {
        return DefaultImpls.findActivity(this);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.KeditorBridge
    @Nullable
    public KeditorView findKeditorView() {
        return DefaultImpls.findKeditorView(this);
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.PluginSpec
    @Nullable
    public Integer getContextMenuDescription() {
        return this.contextMenuDescription;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.PluginSpec
    @Nullable
    public View getContextMenuIcon() {
        return this.contextMenuIcon;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.PluginSpec
    @Nullable
    public Integer getContextMenuResource() {
        return this.contextMenuResource;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.KeditorBridge
    public int getEditorId() {
        return this.editorId;
    }

    @Override  // com.kakao.keditor.plugin.EditorSupporter
    @Nullable
    public EditorOpener getEditorOpener() {
        return this.editorOpener;
    }

    @Override  // com.kakao.keditor.plugin.EditorSupporter
    public int getEditorRequestCode() {
        return this.editorRequestCode == -1 ? DefaultImpls.pluginId$default(this, 0, 1, null) : this.editorRequestCode;
    }

    @Override  // com.kakao.keditor.plugin.EditorSupporter
    @Nullable
    public EditorResultHandler getEditorResultHandler() {
        return this.editorResultHandler;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.KeditorBridge
    @Nullable
    public ViewHolder getHolder(@NotNull View view0) {
        return DefaultImpls.getHolder(this, view0);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.KeditorBridge
    @Nullable
    public KeditorItem getItem(int v) {
        return DefaultImpls.getItem(this, v);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.KeditorBridge
    @Nullable
    public KeditorItem getItem(@NotNull View view0) {
        return DefaultImpls.getItem(this, view0);
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.PluginSpec
    @Nullable
    public List getItemSpecKeys() {
        return this.itemSpecKeys;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.PluginSpec
    @Nullable
    public ItemSpecs getItemSpecs() {
        return this.itemSpecs;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.poll.PollImagePickerSupporter
    @Nullable
    public PollImagePickerOpener getPollImagePickerOpener() {
        return this.pollImagePickerOpener;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.poll.PollImagePickerSupporter
    public int getPollImagePickerRequestCode() {
        return this.pollImagePickerRequestCode;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.poll.PollImagePickerSupporter
    @Nullable
    public PollImagePickerResultHandler getPollImagePickerResultHandler() {
        return this.pollImagePickerResultHandler;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.KeditorBridge
    @Nullable
    public Integer getPosition(@NotNull View view0) {
        return DefaultImpls.getPosition(this, view0);
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.PluginSpec
    @Nullable
    public ToolbarOverlayMenuItem getToolbarOverlayMenuItem() {
        return this.toolbarOverlayMenuItem;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.KeditorBridge
    public boolean hasItemSpec(@NotNull String s) {
        return DefaultImpls.hasItemSpec(this, s);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.KeditorBridge
    @Nullable
    public Unit ifFoundItem(@NotNull View view0, @NotNull Function1 function10) {
        return DefaultImpls.ifFoundItem(this, view0, function10);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.KeditorBridge
    @Nullable
    public Unit ifFoundPosition(@NotNull View view0, @NotNull Function1 function10) {
        return DefaultImpls.ifFoundPosition(this, view0, function10);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.KeditorBridge
    public int indexOf(@NotNull KeditorItem keditorItem0) {
        return DefaultImpls.indexOf(this, keditorItem0);
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.PluginSpec
    public void initPluginSpec(@NotNull Context context0, @NotNull ItemSpecs itemSpecs0) {
        DefaultImpls.initPluginSpec(this, context0, itemSpecs0);
    }

    @Override  // com.kakao.keditor.plugin.ActivityResultHandler
    @CallSuper
    public void onActivityResult(int v, int v1, @Nullable Intent intent0) {
        com.kakao.keditor.plugin.ActivityResultHandler.DefaultImpls.onActivityResult(this, v, v1, intent0);
    }

    @Override  // com.kakao.keditor.plugin.ActivityResultHandler
    @Nullable
    public Unit onEditorActivityResult(@NotNull EditorSupporter editorSupporter0, int v, @Nullable Intent intent0) {
        return com.kakao.keditor.plugin.ActivityResultHandler.DefaultImpls.onEditorActivityResult(this, editorSupporter0, v, intent0);
    }

    @Override  // com.kakao.keditor.plugin.ActivityResultHandler
    @Nullable
    public Unit onPickerActivityResult(@NotNull PickerSupporter pickerSupporter0, int v, @Nullable Intent intent0) {
        return com.kakao.keditor.plugin.ActivityResultHandler.DefaultImpls.onPickerActivityResult(this, pickerSupporter0, v, intent0);
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.RequestHandler
    public void onRequest(@NotNull PluginSpecRequest pluginSpecRequest0) {
        Intrinsics.checkNotNullParameter(pluginSpecRequest0, "request");
        if(pluginSpecRequest0 instanceof EditKeditorItem) {
            Activity activity0 = this.findActivity();
            if(activity0 != null) {
                KeditorItem keditorItem0 = ((EditKeditorItem)pluginSpecRequest0).getItem();
                Intrinsics.checkNotNull(keditorItem0, "null cannot be cast to non-null type com.kakao.keditor.plugin.itemspec.poll.PollItem");
                if(!((PollItem)keditorItem0).getEditable()) {
                    Toast.makeText(activity0, string.ke_poll_edit_disable_alert, 0).show();
                    return;
                }
                KeditorItem keditorItem1 = ((EditKeditorItem)pluginSpecRequest0).getItem();
                Intrinsics.checkNotNull(keditorItem1, "null cannot be cast to non-null type com.kakao.keditor.plugin.itemspec.poll.PollItem");
                com.kakao.keditor.plugin.EditorSupporter.DefaultImpls.openEditor$default(this, activity0, null, ((PollItem)keditorItem1), 2, null);
            }
        }
        else {
            if(pluginSpecRequest0 instanceof OpenPollImagePicker) {
                this.openPollImagePicker(((OpenPollImagePicker)pluginSpecRequest0).getActivity(), null, ((OpenPollImagePicker)pluginSpecRequest0).getPollImages());
                return;
            }
            if(pluginSpecRequest0 instanceof OnPollImagePickerResult) {
                PollImagePickerResultHandler pollImagePickerResultHandler0 = this.getPollImagePickerResultHandler();
                if(pollImagePickerResultHandler0 != null) {
                    pollImagePickerResultHandler0.onPollImagePickerResult(((OnPollImagePickerResult)pluginSpecRequest0).getActivity(), ((OnPollImagePickerResult)pluginSpecRequest0).getPollAdapter(), ((OnPollImagePickerResult)pluginSpecRequest0).getResultCode(), ((OnPollImagePickerResult)pluginSpecRequest0).getIntent());
                }
            }
        }
    }

    @Override  // com.kakao.keditor.plugin.EditorSupporter
    public void openEditor(Activity activity0, EventFlow eventFlow0, KeditorItem keditorItem0) {
        this.openEditor(activity0, eventFlow0, ((PollItem)keditorItem0));
    }

    public void openEditor(@NotNull Activity activity0, @Nullable EventFlow eventFlow0, @Nullable PollItem pollItem0) {
        com.kakao.keditor.plugin.EditorSupporter.DefaultImpls.openEditor(this, activity0, eventFlow0, pollItem0);
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.poll.PollImagePickerSupporter
    public void openPollImagePicker(@NotNull Activity activity0, @Nullable List list0, @NotNull List list1) {
        com.kakao.keditor.plugin.pluginspec.poll.PollImagePickerSupporter.DefaultImpls.openPollImagePicker(this, activity0, list0, list1);
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.PluginSpec
    public int pluginId(int v) {
        return DefaultImpls.pluginId(this, v);
    }

    @Override  // com.kakao.keditor.plugin.ActivityResultHandler
    @CallSuper
    public void registerForActivityResult(@NotNull AppCompatActivity appCompatActivity0) {
        com.kakao.keditor.plugin.ActivityResultHandler.DefaultImpls.registerForActivityResult(this, appCompatActivity0);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.KeditorBridge
    public void renderEditTextScrollToOffset(@NotNull KeditorEditText keditorEditText0, int v) {
        DefaultImpls.renderEditTextScrollToOffset(this, keditorEditText0, v);
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.PluginSpec
    public void runIconClick() {
        Activity activity0 = this.findActivity();
        if(activity0 != null) {
            com.kakao.keditor.plugin.EditorSupporter.DefaultImpls.openEditor$default(this, activity0, null, null, 2, null);
        }
        Keditor.clickEvent$default(Keditor.INSTANCE, "moremenu", "poll", null, 4, null);
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.PluginSpec
    public void setContextMenuDescription(@Nullable Integer integer0) {
        this.contextMenuDescription = integer0;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.PluginSpec
    public void setContextMenuIcon(@Nullable View view0) {
        this.contextMenuIcon = view0;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.PluginSpec
    public void setContextMenuResource(@Nullable Integer integer0) {
        this.contextMenuResource = integer0;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.KeditorBridge
    public void setEditorId(int v) {
        this.editorId = v;
    }

    @Override  // com.kakao.keditor.plugin.EditorSupporter
    public void setEditorOpener(@Nullable EditorOpener editorOpener0) {
        this.editorOpener = editorOpener0;
    }

    @Override  // com.kakao.keditor.plugin.EditorSupporter
    public void setEditorRequestCode(int v) {
        this.editorRequestCode = v;
    }

    @Override  // com.kakao.keditor.plugin.EditorSupporter
    public void setEditorResultHandler(@Nullable EditorResultHandler editorResultHandler0) {
        this.editorResultHandler = editorResultHandler0;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.PluginSpec
    public void setItemSpecKeys(@Nullable List list0) {
        this.itemSpecKeys = list0;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.PluginSpec
    public void setItemSpecs(@Nullable ItemSpecs itemSpecs0) {
        this.itemSpecs = itemSpecs0;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.poll.PollImagePickerSupporter
    public void setPollImagePickerOpener(@Nullable PollImagePickerOpener pollImagePickerOpener0) {
        this.pollImagePickerOpener = pollImagePickerOpener0;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.poll.PollImagePickerSupporter
    public void setPollImagePickerRequestCode(int v) {
        this.pollImagePickerRequestCode = v;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.poll.PollImagePickerSupporter
    public void setPollImagePickerResultHandler(@Nullable PollImagePickerResultHandler pollImagePickerResultHandler0) {
        this.pollImagePickerResultHandler = pollImagePickerResultHandler0;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.PluginSpec
    public void setToolbarOverlayMenuItem(@Nullable ToolbarOverlayMenuItem toolbarOverlayMenuItem0) {
        this.toolbarOverlayMenuItem = toolbarOverlayMenuItem0;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.PluginSpec
    @NotNull
    public String type() {
        return DefaultImpls.type(this);
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.PluginSpec
    public boolean typeOf(@NotNull String s) {
        return DefaultImpls.typeOf(this, s);
    }
}

