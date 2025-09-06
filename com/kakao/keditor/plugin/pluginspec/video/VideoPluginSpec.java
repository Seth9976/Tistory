package com.kakao.keditor.plugin.pluginspec.video;

import android.app.Activity;
import android.content.ClipData;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.provider.MediaStore.Video.Media;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.kakao.keditor.Keditor;
import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.KeditorView;
import com.kakao.keditor.R.drawable;
import com.kakao.keditor.R.string;
import com.kakao.keditor.event.EventFlow;
import com.kakao.keditor.plugin.ActivityResultHandler;
import com.kakao.keditor.plugin.EditorSupporter;
import com.kakao.keditor.plugin.KeditorPluginType;
import com.kakao.keditor.plugin.PickerOpener.IntentLauncher;
import com.kakao.keditor.plugin.PickerOpener;
import com.kakao.keditor.plugin.PickerResultHandler;
import com.kakao.keditor.plugin.PickerSupporter;
import com.kakao.keditor.plugin.attrs.Style;
import com.kakao.keditor.plugin.attrs.item.MobileStyle;
import com.kakao.keditor.plugin.itemspec.ItemSpecs;
import com.kakao.keditor.plugin.itemspec.opengraph.OpenGraphItem;
import com.kakao.keditor.plugin.itemspec.video.VideoItem;
import com.kakao.keditor.plugin.pluginspec.PluginSpec.DefaultImpls;
import com.kakao.keditor.plugin.pluginspec.PluginSpec;
import com.kakao.keditor.plugin.pluginspec.RequestHandler;
import com.kakao.keditor.toolbar.toolbaroverlay.ToolbarOverlayMenuItem;
import com.kakao.keditor.util.eventbus.KeEvent;
import com.kakao.keditor.util.eventbus.PluginSpecRequest.ConvertContentSearchToVideo;
import com.kakao.keditor.util.eventbus.PluginSpecRequest.ConvertOpenGraphToVideo;
import com.kakao.keditor.util.eventbus.PluginSpecRequest;
import com.kakao.keditor.util.eventbus.ViewRequest.AddKeditorItems;
import com.kakao.keditor.util.eventbus.ViewRequest.ReplaceItems;
import com.kakao.keditor.widget.KeditorEditText;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.k;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@KeditorPluginType(type = "video")
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00A2\u0006\u0002\u0010\u0005J\u0010\u0010=\u001A\u00020>2\u0006\u0010?\u001A\u00020@H\u0016J\u0010\u0010A\u001A\u00020B2\u0006\u0010C\u001A\u00020DH\u0002J\b\u0010E\u001A\u00020>H\u0016J\"\u0010F\u001A\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010G2\u0006\u0010H\u001A\u00020\u001DH\u0002R\u001E\u0010\u0006\u001A\u0004\u0018\u00010\u0007X\u0096\u000E\u00A2\u0006\u0010\n\u0002\u0010\f\u001A\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000BR\u001C\u0010\r\u001A\u0004\u0018\u00010\u000EX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u000F\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001E\u0010\u0013\u001A\u0004\u0018\u00010\u0007X\u0096\u000E\u00A2\u0006\u0010\n\u0002\u0010\f\u001A\u0004\b\u0014\u0010\t\"\u0004\b\u0015\u0010\u000BR\u001A\u0010\u0016\u001A\u00020\u0007X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001AR\"\u0010\u001B\u001A\n\u0012\u0004\u0012\u00020\u001D\u0018\u00010\u001CX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001E\u0010\u001F\"\u0004\b \u0010!R\u001C\u0010\"\u001A\u0004\u0018\u00010#X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001C\u0010(\u001A\u0004\u0018\u00010)X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001C\u0010.\u001A\u00020\u00078VX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b/\u0010\u0018\"\u0004\b0\u0010\u001AR\u001C\u00101\u001A\u0004\u0018\u000102X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b3\u00104\"\u0004\b5\u00106R\u001C\u00107\u001A\u0004\u0018\u000108X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b9\u0010:\"\u0004\b;\u0010<\u00A8\u0006I"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/video/VideoPluginSpec;", "Lcom/kakao/keditor/plugin/pluginspec/PluginSpec;", "Lcom/kakao/keditor/plugin/PickerSupporter;", "Lcom/kakao/keditor/plugin/ActivityResultHandler;", "Lcom/kakao/keditor/plugin/pluginspec/RequestHandler;", "()V", "contextMenuDescription", "", "getContextMenuDescription", "()Ljava/lang/Integer;", "setContextMenuDescription", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "contextMenuIcon", "Landroid/view/View;", "getContextMenuIcon", "()Landroid/view/View;", "setContextMenuIcon", "(Landroid/view/View;)V", "contextMenuResource", "getContextMenuResource", "setContextMenuResource", "editorId", "getEditorId", "()I", "setEditorId", "(I)V", "itemSpecKeys", "", "", "getItemSpecKeys", "()Ljava/util/List;", "setItemSpecKeys", "(Ljava/util/List;)V", "itemSpecs", "Lcom/kakao/keditor/plugin/itemspec/ItemSpecs;", "getItemSpecs", "()Lcom/kakao/keditor/plugin/itemspec/ItemSpecs;", "setItemSpecs", "(Lcom/kakao/keditor/plugin/itemspec/ItemSpecs;)V", "pickerOpener", "Lcom/kakao/keditor/plugin/PickerOpener;", "getPickerOpener", "()Lcom/kakao/keditor/plugin/PickerOpener;", "setPickerOpener", "(Lcom/kakao/keditor/plugin/PickerOpener;)V", "pickerRequestCode", "getPickerRequestCode", "setPickerRequestCode", "pickerResultHandler", "Lcom/kakao/keditor/plugin/PickerResultHandler;", "getPickerResultHandler", "()Lcom/kakao/keditor/plugin/PickerResultHandler;", "setPickerResultHandler", "(Lcom/kakao/keditor/plugin/PickerResultHandler;)V", "toolbarOverlayMenuItem", "Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuItem;", "getToolbarOverlayMenuItem", "()Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuItem;", "setToolbarOverlayMenuItem", "(Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuItem;)V", "onRequest", "", "request", "Lcom/kakao/keditor/util/eventbus/PluginSpecRequest;", "pathToItem", "Lcom/kakao/keditor/plugin/itemspec/video/VideoItem;", "uri", "Landroid/net/Uri;", "runIconClick", "videoSize", "Lkotlin/Pair;", "data", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nVideoPluginSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoPluginSpec.kt\ncom/kakao/keditor/plugin/pluginspec/video/VideoPluginSpec\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,162:1\n1#2:163\n*E\n"})
public final class VideoPluginSpec implements ActivityResultHandler, PickerSupporter, PluginSpec, RequestHandler {
    @Nullable
    private Integer contextMenuDescription;
    @Nullable
    private View contextMenuIcon;
    @Nullable
    private Integer contextMenuResource;
    private int editorId;
    @Nullable
    private List itemSpecKeys;
    @Nullable
    private ItemSpecs itemSpecs;
    @Nullable
    private PickerOpener pickerOpener;
    private int pickerRequestCode;
    @Nullable
    private PickerResultHandler pickerResultHandler;
    @Nullable
    private ToolbarOverlayMenuItem toolbarOverlayMenuItem;

    public VideoPluginSpec() {
        this.itemSpecKeys = k.listOf("video");
        this.contextMenuResource = drawable.ke_toolbar_btn_video_menu_item;
        this.contextMenuDescription = string.cd_add_video;
        this.pickerRequestCode = -1;
        this.pickerOpener = new com.kakao.keditor.plugin.pluginspec.video.VideoPluginSpec.pickerOpener.1();
        this.pickerResultHandler = new PickerResultHandler() {
            @Override  // com.kakao.keditor.plugin.PickerResultHandler
            public void onPickerResult(int v, @Nullable Intent intent0) {
                if(v != -1) {
                    return;
                }
                if(intent0 == null) {
                    return;
                }
                ArrayList arrayList0 = new ArrayList();
                Uri uri0 = intent0.getData();
                ClipData clipData0 = intent0.getClipData();
                if(clipData0 != null) {
                    int v1 = clipData0.getItemCount();
                    for(int v2 = 0; v2 < v1; ++v2) {
                        Uri uri1 = clipData0.getItemAt(v2).getUri();
                        if(uri1 != null) {
                            arrayList0.add(VideoPluginSpec.access$pathToItem(VideoPluginSpec.this, uri1));
                        }
                    }
                }
                else if(uri0 != null) {
                    arrayList0.add(VideoPluginSpec.access$pathToItem(VideoPluginSpec.this, uri0));
                }
                AddKeditorItems viewRequest$AddKeditorItems0 = new AddKeditorItems(arrayList0, 0, false, false, 14, null);
                KeEvent.INSTANCE.postInScope(viewRequest$AddKeditorItems0);
            }
        };

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/kakao/keditor/plugin/pluginspec/video/VideoPluginSpec$pickerOpener$1", "Lcom/kakao/keditor/plugin/PickerOpener$IntentLauncher;", "getPickerIntent", "Landroid/content/Intent;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public final class com.kakao.keditor.plugin.pluginspec.video.VideoPluginSpec.pickerOpener.1 extends IntentLauncher {
            @Override  // com.kakao.keditor.plugin.PickerOpener$IntentLauncher
            @NotNull
            public Intent getPickerIntent(@NotNull AppCompatActivity appCompatActivity0) {
                Intrinsics.checkNotNullParameter(appCompatActivity0, "activity");
                Intent intent0 = new Intent("android.intent.action.PICK", MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
                intent0.setType("video/*");
                Intent intent1 = Intent.createChooser(intent0, Keditor.INSTANCE.getContext().getString(string.cd_add_video));
                Intrinsics.checkNotNullExpressionValue(intent1, "createChooser(...)");
                return intent1;
            }
        }

    }

    public static final VideoItem access$pathToItem(VideoPluginSpec videoPluginSpec0, Uri uri0) {
        return videoPluginSpec0.pathToItem(uri0);
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

    @Override  // com.kakao.keditor.plugin.PickerSupporter
    @Nullable
    public PickerOpener getPickerOpener() {
        return this.pickerOpener;
    }

    @Override  // com.kakao.keditor.plugin.PickerSupporter
    public int getPickerRequestCode() {
        return this.pickerRequestCode == -1 ? DefaultImpls.pluginId$default(this, 0, 1, null) : this.pickerRequestCode;
    }

    @Override  // com.kakao.keditor.plugin.PickerSupporter
    @Nullable
    public PickerResultHandler getPickerResultHandler() {
        return this.pickerResultHandler;
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
        String s3;
        Intrinsics.checkNotNullParameter(pluginSpecRequest0, "request");
        if(pluginSpecRequest0 instanceof ConvertOpenGraphToVideo) {
            KeditorItem keditorItem0 = ((ConvertOpenGraphToVideo)pluginSpecRequest0).getItem();
            Intrinsics.checkNotNull(keditorItem0, "null cannot be cast to non-null type com.kakao.keditor.plugin.itemspec.opengraph.OpenGraphItem");
            VideoItem videoItem0 = new VideoItem();
            videoItem0.setUrl(((OpenGraphItem)keditorItem0).getUrl());
            Float float0 = ((OpenGraphItem)keditorItem0).getVideoWidth();
            int v = 0;
            videoItem0.setOriginWidth((float0 == null ? 0 : ((int)(((float)float0)))));
            Float float1 = ((OpenGraphItem)keditorItem0).getVideoHeight();
            if(float1 != null) {
                v = (int)(((float)float1));
            }
            videoItem0.setOriginHeight(v);
            String s = ((OpenGraphItem)keditorItem0).getImage();
            if(s != null) {
                videoItem0.setThumbnail(s);
            }
            String s1 = ((OpenGraphItem)keditorItem0).getTitle();
            if(s1 != null) {
                videoItem0.setTitle(s1);
            }
            String s2 = ((OpenGraphItem)keditorItem0).getHost();
            if(s2 == null) {
                s3 = null;
            }
            else {
                switch(s2) {
                    case "tv.kakao.com": {
                        s3 = "kakaotv";
                        break;
                    }
                    case "vimeo.com": {
                        s3 = "vimeo";
                        break;
                    }
                    case "www.youtube.com": {
                        s3 = "youtube";
                        break;
                    }
                    default: {
                        s3 = null;
                    }
                }
            }
            videoItem0.updateHostInfo(s3);
            ReplaceItems viewRequest$ReplaceItems0 = new ReplaceItems(((ConvertOpenGraphToVideo)pluginSpecRequest0).getPosition(), k.listOf(videoItem0), ((ConvertOpenGraphToVideo)pluginSpecRequest0).getPosition(), false, 8, null);
            KeEvent.INSTANCE.postInScope(viewRequest$ReplaceItems0);
            return;
        }
        if(pluginSpecRequest0 instanceof ConvertContentSearchToVideo) {
            Map map0 = ((ConvertContentSearchToVideo)pluginSpecRequest0).getAttribute();
            VideoItem videoItem1 = new VideoItem();
            Object object0 = map0.get("url");
            Intrinsics.checkNotNull(object0);
            videoItem1.setUrl(object0.toString());
            Object object1 = map0.get("width");
            if(object1 != null) {
                String s4 = object1.toString();
                if(s4 != null) {
                    Float float2 = n.toFloatOrNull(s4);
                    if(float2 != null) {
                        videoItem1.setWidth(((int)float2.floatValue()));
                    }
                }
            }
            Object object2 = map0.get("height");
            if(object2 != null) {
                String s5 = object2.toString();
                if(s5 != null) {
                    Float float3 = n.toFloatOrNull(s5);
                    if(float3 != null) {
                        videoItem1.setHeight(((int)float3.floatValue()));
                    }
                }
            }
            Object object3 = map0.get("originWidth");
            Intrinsics.checkNotNull(object3);
            videoItem1.setOriginWidth(((int)Float.parseFloat(object3.toString())));
            Object object4 = map0.get("originHeight");
            Intrinsics.checkNotNull(object4);
            videoItem1.setOriginHeight(((int)Float.parseFloat(object4.toString())));
            Object object5 = map0.get("style");
            Intrinsics.checkNotNull(object5);
            videoItem1.setStyle(Style.Companion.byName(object5.toString()));
            Object object6 = map0.get("mobileStyle");
            Intrinsics.checkNotNull(object6);
            videoItem1.setMobileStyle(MobileStyle.Companion.byName(object6.toString()));
            Object object7 = map0.get("thumbnail");
            Intrinsics.checkNotNull(object7);
            videoItem1.setThumbnail(object7.toString());
            Object object8 = map0.get("caption");
            if(object8 != null) {
                String s6 = object8.toString();
                if(s6 != null) {
                    videoItem1.setCaption(s6);
                }
            }
            Object object9 = map0.get("title");
            if(object9 != null) {
                String s7 = object9.toString();
                if(s7 != null) {
                    videoItem1.setTitle(s7);
                }
            }
            Object object10 = map0.get("host");
            Intrinsics.checkNotNull(object10);
            videoItem1.updateHostInfo(object10.toString());
            AddKeditorItems viewRequest$AddKeditorItems0 = new AddKeditorItems(k.listOf(videoItem1), 0, false, false, 14, null);
            KeEvent.INSTANCE.postInScope(viewRequest$AddKeditorItems0);
        }
    }

    @Override  // com.kakao.keditor.plugin.PickerSupporter
    public void openPicker(@NotNull Activity activity0, @Nullable EventFlow eventFlow0) {
        com.kakao.keditor.plugin.PickerSupporter.DefaultImpls.openPicker(this, activity0, eventFlow0);
    }

    private final VideoItem pathToItem(Uri uri0) {
        VideoItem videoItem0 = new VideoItem();
        String s = uri0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
        videoItem0.setUrl(s);
        Pair pair0 = this.videoSize(videoItem0.getUrl());
        if(pair0 != null) {
            Integer integer0 = (Integer)pair0.getFirst();
            int v = 0;
            videoItem0.setOriginWidth((integer0 == null ? 0 : ((int)integer0)));
            Integer integer1 = (Integer)pair0.getSecond();
            if(integer1 != null) {
                v = (int)integer1;
            }
            videoItem0.setOriginHeight(v);
        }
        return videoItem0;
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
            com.kakao.keditor.plugin.PickerSupporter.DefaultImpls.openPicker$default(this, activity0, null, 2, null);
        }
        Keditor.clickEvent$default(Keditor.INSTANCE, "toolbar", "video", null, 4, null);
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

    @Override  // com.kakao.keditor.plugin.pluginspec.PluginSpec
    public void setItemSpecKeys(@Nullable List list0) {
        this.itemSpecKeys = list0;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.PluginSpec
    public void setItemSpecs(@Nullable ItemSpecs itemSpecs0) {
        this.itemSpecs = itemSpecs0;
    }

    @Override  // com.kakao.keditor.plugin.PickerSupporter
    public void setPickerOpener(@Nullable PickerOpener pickerOpener0) {
        this.pickerOpener = pickerOpener0;
    }

    @Override  // com.kakao.keditor.plugin.PickerSupporter
    public void setPickerRequestCode(int v) {
        this.pickerRequestCode = v;
    }

    @Override  // com.kakao.keditor.plugin.PickerSupporter
    public void setPickerResultHandler(@Nullable PickerResultHandler pickerResultHandler0) {
        this.pickerResultHandler = pickerResultHandler0;
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

    private final Pair videoSize(String s) {
        Pair pair0;
        Cursor cursor0;
        Activity activity0 = this.findActivity();
        if(activity0 == null) {
            cursor0 = null;
        }
        else {
            ContentResolver contentResolver0 = activity0.getContentResolver();
            cursor0 = contentResolver0 == null ? null : contentResolver0.query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data", "mime_type", "datetaken", "_size", "width", "height", "bucket_id"}, "_data = ?", new String[]{s}, null);
        }
        if(cursor0 != null) {
            try {
                if(cursor0.moveToFirst()) {
                    ContentValues contentValues0 = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(cursor0, contentValues0);
                    pair0 = TuplesKt.to(contentValues0.getAsInteger("width"), contentValues0.getAsInteger("height"));
                    goto label_18;
                }
                goto label_20;
            }
            catch(Throwable throwable0) {
                CloseableKt.closeFinally(cursor0, throwable0);
                throw throwable0;
            }
        label_18:
            CloseableKt.closeFinally(cursor0, null);
            return pair0;
        label_20:
            CloseableKt.closeFinally(cursor0, null);
            return null;
        }
        return null;
    }
}

