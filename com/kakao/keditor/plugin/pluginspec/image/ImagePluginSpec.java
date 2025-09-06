package com.kakao.keditor.plugin.pluginspec.image;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore.Images.Media;
import android.view.View;
import android.webkit.MimeTypeMap;
import androidx.annotation.CallSuper;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.kakao.keditor.Keditor;
import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.KeditorView;
import com.kakao.keditor.R.drawable;
import com.kakao.keditor.R.string;
import com.kakao.keditor.event.EventFlow;
import com.kakao.keditor.media.MediaSupportKt;
import com.kakao.keditor.plugin.ActivityResultHandler;
import com.kakao.keditor.plugin.EditorOpener;
import com.kakao.keditor.plugin.EditorResultHandler;
import com.kakao.keditor.plugin.EditorSupporter;
import com.kakao.keditor.plugin.KeditorPluginType;
import com.kakao.keditor.plugin.PickerOpener.IntentLauncher;
import com.kakao.keditor.plugin.PickerOpener;
import com.kakao.keditor.plugin.PickerResultHandler;
import com.kakao.keditor.plugin.PickerSupporter;
import com.kakao.keditor.plugin.attrs.item.Location;
import com.kakao.keditor.plugin.itemspec.ItemSpecs;
import com.kakao.keditor.plugin.pluginspec.PluginSpec.DefaultImpls;
import com.kakao.keditor.plugin.pluginspec.PluginSpec;
import com.kakao.keditor.plugin.pluginspec.RequestHandler;
import com.kakao.keditor.plugin.pluginspec.imagegrid.OnPickerActivityResult;
import com.kakao.keditor.toolbar.toolbaroverlay.ToolbarOverlayMenuItem;
import com.kakao.keditor.util.eventbus.KeEvent;
import com.kakao.keditor.util.eventbus.PluginSpecRequest.EditKeditorItem;
import com.kakao.keditor.util.eventbus.PluginSpecRequest.UpdateFocusedImageUri;
import com.kakao.keditor.util.eventbus.PluginSpecRequest;
import com.kakao.keditor.util.eventbus.ViewRequest.AddKeditorItems;
import com.kakao.keditor.util.eventbus.ViewRequest.GetFocusedItem;
import com.kakao.keditor.util.eventbus.ViewRequest.RefreshFocus;
import com.kakao.keditor.widget.KeditorEditText;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.k;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@KeditorPluginType(type = "image")
@Metadata(d1 = {"\u0000\u008E\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006B\u0005\u00A2\u0006\u0002\u0010\u0007J\u001E\u0010N\u001A\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010O2\u0006\u0010P\u001A\u00020QH\u0002J\u0010\u0010R\u001A\u00020S2\u0006\u0010T\u001A\u00020UH\u0016J\b\u0010V\u001A\u00020SH\u0016J%\u0010W\u001A\u0004\u0018\u00010S*\u00020\u00022\u0006\u0010X\u001A\u00020\t2\b\u0010Y\u001A\u0004\u0018\u00010ZH\u0016\u00A2\u0006\u0002\u0010[J\n\u0010\\\u001A\u00020\u0004*\u00020QR\u001E\u0010\b\u001A\u0004\u0018\u00010\tX\u0096\u000E\u00A2\u0006\u0010\n\u0002\u0010\u000E\u001A\u0004\b\n\u0010\u000B\"\u0004\b\f\u0010\rR\u001C\u0010\u000F\u001A\u0004\u0018\u00010\u0010X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001E\u0010\u0015\u001A\u0004\u0018\u00010\tX\u0096\u000E\u00A2\u0006\u0010\n\u0002\u0010\u000E\u001A\u0004\b\u0016\u0010\u000B\"\u0004\b\u0017\u0010\rR\u001A\u0010\u0018\u001A\u00020\tX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0019\u0010\u001A\"\u0004\b\u001B\u0010\u001CR\"\u0010\u001D\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001EX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001F\u0010 \"\u0004\b!\u0010\"R\u001C\u0010#\u001A\u00020\t8VX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b$\u0010\u001A\"\u0004\b%\u0010\u001CR\u001C\u0010&\u001A\u0004\u0018\u00010\'X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010,\u001A\n\u0012\u0004\u0012\u00020.\u0018\u00010-X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b/\u00100\"\u0004\b1\u00102R\u001C\u00103\u001A\u0004\u0018\u000104X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b5\u00106\"\u0004\b7\u00108R\u001C\u00109\u001A\u0004\u0018\u00010:X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001C\u0010?\u001A\u00020\t8VX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b@\u0010\u001A\"\u0004\bA\u0010\u001CR\u001C\u0010B\u001A\u0004\u0018\u00010CX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001C\u0010H\u001A\u0004\u0018\u00010IX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\bJ\u0010K\"\u0004\bL\u0010M\u00A8\u0006]"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/image/ImagePluginSpec;", "Lcom/kakao/keditor/plugin/pluginspec/PluginSpec;", "Lcom/kakao/keditor/plugin/PickerSupporter;", "Lcom/kakao/keditor/plugin/EditorSupporter;", "Lcom/kakao/keditor/plugin/pluginspec/image/ImageItem;", "Lcom/kakao/keditor/plugin/ActivityResultHandler;", "Lcom/kakao/keditor/plugin/pluginspec/RequestHandler;", "()V", "contextMenuDescription", "", "getContextMenuDescription", "()Ljava/lang/Integer;", "setContextMenuDescription", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "contextMenuIcon", "Landroid/view/View;", "getContextMenuIcon", "()Landroid/view/View;", "setContextMenuIcon", "(Landroid/view/View;)V", "contextMenuResource", "getContextMenuResource", "setContextMenuResource", "editorId", "getEditorId", "()I", "setEditorId", "(I)V", "editorOpener", "Lcom/kakao/keditor/plugin/EditorOpener;", "getEditorOpener", "()Lcom/kakao/keditor/plugin/EditorOpener;", "setEditorOpener", "(Lcom/kakao/keditor/plugin/EditorOpener;)V", "editorRequestCode", "getEditorRequestCode", "setEditorRequestCode", "editorResultHandler", "Lcom/kakao/keditor/plugin/EditorResultHandler;", "getEditorResultHandler", "()Lcom/kakao/keditor/plugin/EditorResultHandler;", "setEditorResultHandler", "(Lcom/kakao/keditor/plugin/EditorResultHandler;)V", "itemSpecKeys", "", "", "getItemSpecKeys", "()Ljava/util/List;", "setItemSpecKeys", "(Ljava/util/List;)V", "itemSpecs", "Lcom/kakao/keditor/plugin/itemspec/ItemSpecs;", "getItemSpecs", "()Lcom/kakao/keditor/plugin/itemspec/ItemSpecs;", "setItemSpecs", "(Lcom/kakao/keditor/plugin/itemspec/ItemSpecs;)V", "pickerOpener", "Lcom/kakao/keditor/plugin/PickerOpener;", "getPickerOpener", "()Lcom/kakao/keditor/plugin/PickerOpener;", "setPickerOpener", "(Lcom/kakao/keditor/plugin/PickerOpener;)V", "pickerRequestCode", "getPickerRequestCode", "setPickerRequestCode", "pickerResultHandler", "Lcom/kakao/keditor/plugin/PickerResultHandler;", "getPickerResultHandler", "()Lcom/kakao/keditor/plugin/PickerResultHandler;", "setPickerResultHandler", "(Lcom/kakao/keditor/plugin/PickerResultHandler;)V", "toolbarOverlayMenuItem", "Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuItem;", "getToolbarOverlayMenuItem", "()Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuItem;", "setToolbarOverlayMenuItem", "(Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuItem;)V", "imageSize", "Lkotlin/Pair;", "uri", "Landroid/net/Uri;", "onRequest", "", "request", "Lcom/kakao/keditor/util/eventbus/PluginSpecRequest;", "runIconClick", "onPickerActivityResult", "resultCode", "data", "Landroid/content/Intent;", "(Lcom/kakao/keditor/plugin/PickerSupporter;ILandroid/content/Intent;)Lkotlin/Unit;", "pathToItem", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ImagePluginSpec implements ActivityResultHandler, EditorSupporter, PickerSupporter, PluginSpec, RequestHandler {
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
    private PickerOpener pickerOpener;
    private int pickerRequestCode;
    @Nullable
    private PickerResultHandler pickerResultHandler;
    @Nullable
    private ToolbarOverlayMenuItem toolbarOverlayMenuItem;

    public ImagePluginSpec() {
        this.itemSpecKeys = k.listOf("image");
        this.contextMenuResource = drawable.ke_toolbar_btn_image_menu_item;
        this.contextMenuDescription = string.cd_add_image;
        this.pickerRequestCode = -1;
        this.pickerOpener = new com.kakao.keditor.plugin.pluginspec.image.ImagePluginSpec.pickerOpener.1();
        this.pickerResultHandler = new PickerResultHandler() {
            @Override  // com.kakao.keditor.plugin.PickerResultHandler
            public void onPickerResult(int v, @Nullable Intent intent0) {
                if(v != -1) {
                    return;
                }
                ArrayList arrayList0 = new ArrayList();
                Uri uri0 = null;
                ClipData clipData0 = intent0 == null ? null : intent0.getClipData();
                if(intent0 != null) {
                    uri0 = intent0.getData();
                }
                if(clipData0 != null) {
                    int v1 = clipData0.getItemCount();
                    for(int v2 = 0; v2 < v1; ++v2) {
                        Uri uri1 = clipData0.getItemAt(v2).getUri();
                        if(uri1 != null) {
                            ImagePluginSpec imagePluginSpec0 = ImagePluginSpec.this;
                            if(imagePluginSpec0.findActivity() != null) {
                                arrayList0.add(imagePluginSpec0.pathToItem(uri1));
                            }
                        }
                    }
                }
                else if(uri0 != null && ImagePluginSpec.this.findActivity() != null) {
                    arrayList0.add(ImagePluginSpec.this.pathToItem(uri0));
                }
                AddKeditorItems viewRequest$AddKeditorItems0 = new AddKeditorItems(arrayList0, 0, false, false, 14, null);
                KeEvent.INSTANCE.postInScope(viewRequest$AddKeditorItems0);
            }
        };
        this.editorRequestCode = -1;

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/kakao/keditor/plugin/pluginspec/image/ImagePluginSpec$pickerOpener$1", "Lcom/kakao/keditor/plugin/PickerOpener$IntentLauncher;", "getPickerIntent", "Landroid/content/Intent;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public final class com.kakao.keditor.plugin.pluginspec.image.ImagePluginSpec.pickerOpener.1 extends IntentLauncher {
            @Override  // com.kakao.keditor.plugin.PickerOpener$IntentLauncher
            @NotNull
            public Intent getPickerIntent(@NotNull AppCompatActivity appCompatActivity0) {
                Intrinsics.checkNotNullParameter(appCompatActivity0, "activity");
                Intent intent0 = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                intent0.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent0.setType("image/*");
                Intent intent1 = Intent.createChooser(intent0, Keditor.INSTANCE.getContext().getString(string.cd_add_image));
                Intrinsics.checkNotNullExpressionValue(intent1, "createChooser(...)");
                return intent1;
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
        int v = this.editorRequestCode;
        if(v == -1) {
            int v1 = this.getPickerRequestCode();
            KeditorView keditorView0 = this.findKeditorView();
            if(keditorView0 != null) {
                List list0 = keditorView0.activeAllPluginTypes();
                return list0 == null ? v1 + 1 : v1 + list0.size();
            }
            return v1 + 1;
        }
        return v;
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

    private final Pair imageSize(Uri uri0) {
        Pair pair0;
        Activity activity0 = this.findActivity();
        if(activity0 != null) {
            try {
                String s = uri0.toString();
                Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
                if(!p.startsWith$default(s, "content", false, 2, null)) {
                    BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
                    bitmapFactory$Options0.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(uri0.toString(), bitmapFactory$Options0);
                    return MediaSupportKt.byOrientation(bitmapFactory$Options0, new ExifInterface(uri0.toString()));
                }
                ParcelFileDescriptor parcelFileDescriptor0 = activity0.getContentResolver().openFileDescriptor(uri0, "r");
                if(parcelFileDescriptor0 != null) {
                    try {
                        BitmapFactory.Options bitmapFactory$Options1 = new BitmapFactory.Options();
                        bitmapFactory$Options1.inJustDecodeBounds = true;
                        BitmapFactory.decodeFileDescriptor(parcelFileDescriptor0.getFileDescriptor(), null, bitmapFactory$Options1);
                        pair0 = MediaSupportKt.byOrientation(bitmapFactory$Options1, new ExifInterface(parcelFileDescriptor0.getFileDescriptor()));
                    }
                    catch(Throwable throwable0) {
                        CloseableKt.closeFinally(parcelFileDescriptor0, throwable0);
                        throw throwable0;
                    }
                    CloseableKt.closeFinally(parcelFileDescriptor0, null);
                    return pair0;
                }
            }
            catch(Exception exception0) {
                Keditor.INSTANCE.log(this, "Fail to found uri [" + uri0 + "]: " + exception0.getMessage());
            }
        }
        return null;
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
        Intrinsics.checkNotNullParameter(pickerSupporter0, "<this>");
        if(this.hasItemSpec("imageGrid") && intent0 != null && intent0.getBooleanExtra("ke_image_grid", false)) {
            OnPickerActivityResult onPickerActivityResult0 = new OnPickerActivityResult("imageGrid", intent0);
            KeEvent.INSTANCE.postInScope(onPickerActivityResult0);
            return null;
        }
        PickerResultHandler pickerResultHandler0 = pickerSupporter0.getPickerResultHandler();
        if(pickerResultHandler0 != null) {
            pickerResultHandler0.onPickerResult(v, intent0);
        }
        return null;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.RequestHandler
    public void onRequest(@NotNull PluginSpecRequest pluginSpecRequest0) {
        Intrinsics.checkNotNullParameter(pluginSpecRequest0, "request");
        if(pluginSpecRequest0 instanceof EditKeditorItem) {
            Activity activity0 = this.findActivity();
            KeditorItem keditorItem0 = ((EditKeditorItem)pluginSpecRequest0).getItem();
            String s = null;
            ImageItem imageItem0 = keditorItem0 instanceof ImageItem ? ((ImageItem)keditorItem0) : null;
            if(activity0 != null) {
                if(imageItem0 != null) {
                    s = imageItem0.getSrc();
                }
                if(s != null && s.length() != 0) {
                    com.kakao.keditor.plugin.EditorSupporter.DefaultImpls.openEditor$default(this, activity0, null, imageItem0, 2, null);
                }
            }
        }
        else if(pluginSpecRequest0 instanceof UpdateFocusedImageUri) {
            GetFocusedItem viewRequest$GetFocusedItem0 = new GetFocusedItem(new Function1(this) {
                final PluginSpecRequest $request;

                {
                    this.$request = pluginSpecRequest0;
                    ImagePluginSpec.this = imagePluginSpec0;
                    super(1);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.invoke(((KeditorItem)object0));
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable KeditorItem keditorItem0) {
                    ImageItem imageItem0 = keditorItem0 instanceof ImageItem ? ((ImageItem)keditorItem0) : null;
                    if(imageItem0 != null) {
                        String s = ((UpdateFocusedImageUri)this.$request).getUri().toString();
                        Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
                        imageItem0.setSrc(s);
                        Uri uri0 = ((UpdateFocusedImageUri)this.$request).getUri();
                        Pair pair0 = ImagePluginSpec.this.imageSize(uri0);
                        if(pair0 != null) {
                            imageItem0.setOriginWidth(((Number)pair0.getFirst()).intValue());
                            imageItem0.setOriginHeight(((Number)pair0.getSecond()).intValue());
                        }
                        imageItem0.setLocation(Location.LOCAL);
                        String s1 = MimeTypeMap.getFileExtensionFromUrl(imageItem0.getSrc());
                        if(s1 == null) {
                            s1 = "jpg";
                        }
                        else {
                            Intrinsics.checkNotNull(s1);
                        }
                        imageItem0.setMimeType("image/" + s1);
                    }
                    KeEvent.INSTANCE.postInScope(RefreshFocus.INSTANCE);
                }
            });
            KeEvent.INSTANCE.postInScope(viewRequest$GetFocusedItem0);
            Keditor.clickEventWithVersion$default(Keditor.INSTANCE, "photos-android-0.0.0", "photoeditor", "photo_edit_success", null, 8, null);
        }
    }

    @Override  // com.kakao.keditor.plugin.EditorSupporter
    public void openEditor(Activity activity0, EventFlow eventFlow0, KeditorItem keditorItem0) {
        this.openEditor(activity0, eventFlow0, ((ImageItem)keditorItem0));
    }

    public void openEditor(@NotNull Activity activity0, @Nullable EventFlow eventFlow0, @Nullable ImageItem imageItem0) {
        com.kakao.keditor.plugin.EditorSupporter.DefaultImpls.openEditor(this, activity0, eventFlow0, imageItem0);
    }

    @Override  // com.kakao.keditor.plugin.PickerSupporter
    public void openPicker(@NotNull Activity activity0, @Nullable EventFlow eventFlow0) {
        com.kakao.keditor.plugin.PickerSupporter.DefaultImpls.openPicker(this, activity0, eventFlow0);
    }

    @NotNull
    public final ImageItem pathToItem(@NotNull Uri uri0) {
        Intrinsics.checkNotNullParameter(uri0, "<this>");
        ImageItem imageItem0 = new ImageItem();
        String s = uri0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
        imageItem0.setSrc(s);
        Pair pair0 = this.imageSize(uri0);
        if(pair0 != null) {
            imageItem0.setOriginWidth(((Number)pair0.getFirst()).intValue());
            imageItem0.setOriginHeight(((Number)pair0.getSecond()).intValue());
        }
        imageItem0.setLocation(Location.LOCAL);
        String s1 = MimeTypeMap.getFileExtensionFromUrl(imageItem0.getSrc());
        if(s1 == null) {
            s1 = "jpg";
        }
        else {
            Intrinsics.checkNotNull(s1);
        }
        imageItem0.setMimeType("image/" + s1);
        return imageItem0;
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
        Keditor.clickEvent$default(Keditor.INSTANCE, "toolbar", "image", null, 4, null);
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
}

