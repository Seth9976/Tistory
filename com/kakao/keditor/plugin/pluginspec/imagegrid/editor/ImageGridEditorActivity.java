package com.kakao.keditor.plugin.pluginspec.imagegrid.editor;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore.Images.Media;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.kakao.common.widget.KeditorAlertDialog.Companion;
import com.kakao.common.widget.KeditorAlertDialog;
import com.kakao.keditor.Keditor;
import com.kakao.keditor.R.color;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.R.string;
import com.kakao.keditor.base.KeditorBaseAppCompatActivity;
import com.kakao.keditor.databinding.KeActivityImageGridEditorBinding;
import com.kakao.keditor.plugin.extension.IntentKt;
import com.kakao.keditor.plugin.itemspec.imagegrid.ImageGridCellItem;
import com.kakao.keditor.plugin.itemspec.imagegrid.ImageGridItem;
import com.kakao.keditor.plugin.pluginspec.PluginSpecRequester;
import com.kakao.keditor.plugin.pluginspec.imagegrid.CellEditorOpener;
import com.kakao.keditor.plugin.pluginspec.imagegrid.CellEditorResultHandler;
import com.kakao.keditor.plugin.pluginspec.imagegrid.CellPickerOpener.IntentLauncher;
import com.kakao.keditor.plugin.pluginspec.imagegrid.CellPickerOpener;
import com.kakao.keditor.plugin.pluginspec.imagegrid.CellPickerResultHandler;
import com.kakao.keditor.plugin.pluginspec.imagegrid.ImageGridAdapter;
import com.kakao.keditor.plugin.pluginspec.imagegrid.ImageGridCellEditorSupporter.DefaultImpls;
import com.kakao.keditor.plugin.pluginspec.imagegrid.ImageGridCellEditorSupporter;
import com.kakao.keditor.plugin.pluginspec.imagegrid.ImageGridCellPickerSupporter;
import com.kakao.keditor.plugin.pluginspec.imagegrid.OnImageGridSpecCellEditorResult;
import com.kakao.keditor.plugin.pluginspec.imagegrid.OnImageGridSpecCellPickerResult;
import com.kakao.keditor.plugin.pluginspec.imagegrid.OpenImageGridSpecCellEditor;
import com.kakao.keditor.plugin.pluginspec.imagegrid.OpenImageGridSpecCellPicker;
import com.kakao.keditor.plugin.pluginspec.imagegrid.editor.actions.Action;
import com.kakao.keditor.plugin.pluginspec.imagegrid.editor.actions.OnAddClicked;
import com.kakao.keditor.plugin.pluginspec.imagegrid.editor.actions.OnCloseClicked;
import com.kakao.keditor.plugin.pluginspec.imagegrid.editor.actions.OnConfirmClicked;
import com.kakao.keditor.plugin.pluginspec.imagegrid.editor.actions.OnDeleteClicked;
import com.kakao.keditor.plugin.pluginspec.imagegrid.editor.actions.OnEditClicked;
import com.kakao.keditor.plugin.pluginspec.imagegrid.layout.AutoTemplateLayout.OnCellDragListener;
import com.kakao.keditor.plugin.pluginspec.imagegrid.layout.KeditorImageGridLayout;
import com.kakao.keditor.standard.KeditorStandardKt;
import com.kakao.keditor.util.eventbus.PluginSpecRequest;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00A2\u0006\u0002\u0010\u0004J\b\u0010N\u001A\u00020OH\u0002J\b\u0010P\u001A\u00020OH\u0002J\"\u0010Q\u001A\u00020O2\u0006\u0010R\u001A\u00020\u00122\u0006\u0010S\u001A\u00020\u00122\b\u0010T\u001A\u0004\u0018\u000102H\u0014J\b\u0010U\u001A\u00020OH\u0002J\u0012\u0010V\u001A\u00020O2\b\u0010W\u001A\u0004\u0018\u00010XH\u0014J\b\u0010Y\u001A\u00020OH\u0002J\b\u0010Z\u001A\u00020OH\u0002J\u0010\u0010[\u001A\u00020O2\u0006\u0010\\\u001A\u00020]H\u0002R\u001A\u0010\u0005\u001A\u00020\u0006X\u0086.\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001C\u0010\u000B\u001A\u0004\u0018\u00010\fX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\r\u0010\u000E\"\u0004\b\u000F\u0010\u0010R\u001A\u0010\u0011\u001A\u00020\u0012X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001C\u0010\u0017\u001A\u0004\u0018\u00010\u0018X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0019\u0010\u001A\"\u0004\b\u001B\u0010\u001CR\u001C\u0010\u001D\u001A\u0004\u0018\u00010\u001EX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001F\u0010 \"\u0004\b!\u0010\"R\u001A\u0010#\u001A\u00020\u0012X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b$\u0010\u0014\"\u0004\b%\u0010\u0016R\u001C\u0010&\u001A\u0004\u0018\u00010\'X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001B\u0010,\u001A\u00020\u00128BX\u0082\u0084\u0002\u00A2\u0006\f\n\u0004\b.\u0010/\u001A\u0004\b-\u0010\u0014R\u0016\u00100\u001A\n\u0012\u0004\u0012\u000202\u0018\u000101X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u00103\u001A\u000204X\u0082.\u00A2\u0006\u0002\n\u0000R\u000E\u00105\u001A\u000206X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u00107\u001A\u000206X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u001B\u00108\u001A\u0002098BX\u0082\u0084\u0002\u00A2\u0006\f\n\u0004\b<\u0010/\u001A\u0004\b:\u0010;R\u001B\u0010=\u001A\u00020\u00128BX\u0082\u0084\u0002\u00A2\u0006\f\n\u0004\b?\u0010/\u001A\u0004\b>\u0010\u0014R\u001C\u0010@\u001A\u0004\u0018\u00010AX\u0094\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\bB\u0010C\"\u0004\bD\u0010ER\u0010\u0010F\u001A\u0004\u0018\u00010GX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0016\u0010H\u001A\n\u0012\u0004\u0012\u000202\u0018\u000101X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u001B\u0010I\u001A\u00020J8BX\u0082\u0084\u0002\u00A2\u0006\f\n\u0004\bM\u0010/\u001A\u0004\bK\u0010L\u00A8\u0006^"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/imagegrid/editor/ImageGridEditorActivity;", "Lcom/kakao/keditor/base/KeditorBaseAppCompatActivity;", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/ImageGridCellPickerSupporter;", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/ImageGridCellEditorSupporter;", "()V", "binding", "Lcom/kakao/keditor/databinding/KeActivityImageGridEditorBinding;", "getBinding", "()Lcom/kakao/keditor/databinding/KeActivityImageGridEditorBinding;", "setBinding", "(Lcom/kakao/keditor/databinding/KeActivityImageGridEditorBinding;)V", "cellEditorOpener", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/CellEditorOpener;", "getCellEditorOpener", "()Lcom/kakao/keditor/plugin/pluginspec/imagegrid/CellEditorOpener;", "setCellEditorOpener", "(Lcom/kakao/keditor/plugin/pluginspec/imagegrid/CellEditorOpener;)V", "cellEditorRequestCode", "", "getCellEditorRequestCode", "()I", "setCellEditorRequestCode", "(I)V", "cellEditorResultHandler", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/CellEditorResultHandler;", "getCellEditorResultHandler", "()Lcom/kakao/keditor/plugin/pluginspec/imagegrid/CellEditorResultHandler;", "setCellEditorResultHandler", "(Lcom/kakao/keditor/plugin/pluginspec/imagegrid/CellEditorResultHandler;)V", "cellPickerOpener", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/CellPickerOpener;", "getCellPickerOpener", "()Lcom/kakao/keditor/plugin/pluginspec/imagegrid/CellPickerOpener;", "setCellPickerOpener", "(Lcom/kakao/keditor/plugin/pluginspec/imagegrid/CellPickerOpener;)V", "cellPickerRequestCode", "getCellPickerRequestCode", "setCellPickerRequestCode", "cellPickerResultHandler", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/CellPickerResultHandler;", "getCellPickerResultHandler", "()Lcom/kakao/keditor/plugin/pluginspec/imagegrid/CellPickerResultHandler;", "setCellPickerResultHandler", "(Lcom/kakao/keditor/plugin/pluginspec/imagegrid/CellPickerResultHandler;)V", "editorId", "getEditorId", "editorId$delegate", "Lkotlin/Lazy;", "editorResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "imageGridAdapter", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/ImageGridAdapter;", "isEditorIntentLauncher", "", "isPickerIntentLauncher", "item", "Lcom/kakao/keditor/plugin/itemspec/imagegrid/ImageGridItem;", "getItem", "()Lcom/kakao/keditor/plugin/itemspec/imagegrid/ImageGridItem;", "item$delegate", "keditorItemIndex", "getKeditorItemIndex", "keditorItemIndex$delegate", "onBackPressedCallback", "Landroidx/activity/OnBackPressedCallback;", "getOnBackPressedCallback", "()Landroidx/activity/OnBackPressedCallback;", "setOnBackPressedCallback", "(Landroidx/activity/OnBackPressedCallback;)V", "origin", "", "pickerResultLauncher", "vm", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/editor/ImageGridViewModel;", "getVm", "()Lcom/kakao/keditor/plugin/pluginspec/imagegrid/editor/ImageGridViewModel;", "vm$delegate", "close", "", "dndStateIdle", "onActivityResult", "requestCode", "resultCode", "intent", "onConfirmClicked", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDeleteClicked", "onUpdatedImageCount", "sendRequestToImageGrid", "request", "Lcom/kakao/keditor/util/eventbus/PluginSpecRequest;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nImageGridEditorActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageGridEditorActivity.kt\ncom/kakao/keditor/plugin/pluginspec/imagegrid/editor/ImageGridEditorActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 Keditor.kt\ncom/kakao/keditor/Keditor\n*L\n1#1,256:1\n75#2,13:257\n136#3,12:270\n*S KotlinDebug\n*F\n+ 1 ImageGridEditorActivity.kt\ncom/kakao/keditor/plugin/pluginspec/imagegrid/editor/ImageGridEditorActivity\n*L\n63#1:257,13\n85#1:270,12\n*E\n"})
public final class ImageGridEditorActivity extends KeditorBaseAppCompatActivity implements ImageGridCellEditorSupporter, ImageGridCellPickerSupporter {
    public KeActivityImageGridEditorBinding binding;
    @Nullable
    private CellEditorOpener cellEditorOpener;
    private int cellEditorRequestCode;
    @Nullable
    private CellEditorResultHandler cellEditorResultHandler;
    @Nullable
    private CellPickerOpener cellPickerOpener;
    private int cellPickerRequestCode;
    @Nullable
    private CellPickerResultHandler cellPickerResultHandler;
    @NotNull
    private final Lazy editorId$delegate;
    @Nullable
    private ActivityResultLauncher editorResultLauncher;
    private ImageGridAdapter imageGridAdapter;
    private boolean isEditorIntentLauncher;
    private boolean isPickerIntentLauncher;
    @NotNull
    private final Lazy item$delegate;
    @NotNull
    private final Lazy keditorItemIndex$delegate;
    @Nullable
    private OnBackPressedCallback onBackPressedCallback;
    @Nullable
    private String origin;
    @Nullable
    private ActivityResultLauncher pickerResultLauncher;
    @NotNull
    private final Lazy vm$delegate;

    public ImageGridEditorActivity() {
        this.item$delegate = c.lazy(new Function0() {
            {
                ImageGridEditorActivity.this = imageGridEditorActivity0;
                super(0);
            }

            @NotNull
            public final ImageGridItem invoke() {
                Intent intent0 = ImageGridEditorActivity.this.getIntent();
                Intrinsics.checkNotNullExpressionValue(intent0, "getIntent(...)");
                ImageGridItem imageGridItem0 = (ImageGridItem)IntentKt.getSerializableExtraCompat(intent0, "data", ImageGridItem.class);
                if(imageGridItem0 == null) {
                    throw new IllegalArgumentException("Missing serializable extra DATA: ImageGridItem");
                }
                return imageGridItem0;
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        });
        this.keditorItemIndex$delegate = c.lazy(new Function0() {
            {
                ImageGridEditorActivity.this = imageGridEditorActivity0;
                super(0);
            }

            @NotNull
            public final Integer invoke() {
                return ImageGridEditorActivity.this.getIntent().getIntExtra("keditor_item_index", -1);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        });
        this.editorId$delegate = c.lazy(new Function0() {
            {
                ImageGridEditorActivity.this = imageGridEditorActivity0;
                super(0);
            }

            @NotNull
            public final Integer invoke() {
                return ImageGridEditorActivity.this.getIntent().getIntExtra("editor_id", -1);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        });
        com.kakao.keditor.plugin.pluginspec.imagegrid.editor.ImageGridEditorActivity.special..inlined.viewModels.default.1 imageGridEditorActivity$special$$inlined$viewModels$default$10 = new Function0() {
            final ComponentActivity $this_viewModels;

            {
                this.$this_viewModels = componentActivity0;
                super(0);
            }

            @NotNull
            public final Factory invoke() {
                return this.$this_viewModels.getDefaultViewModelProviderFactory();
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        };
        this.vm$delegate = new ViewModelLazy(Reflection.getOrCreateKotlinClass(ImageGridViewModel.class), new Function0() {
            final ComponentActivity $this_viewModels;

            {
                this.$this_viewModels = componentActivity0;
                super(0);
            }

            @NotNull
            public final ViewModelStore invoke() {
                return this.$this_viewModels.getViewModelStore();
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        }, imageGridEditorActivity$special$$inlined$viewModels$default$10, new Function0(this) {
            final Function0 $extrasProducer;
            final ComponentActivity $this_viewModels;

            {
                this.$extrasProducer = function00;
                this.$this_viewModels = componentActivity0;
                super(0);
            }

            @NotNull
            public final CreationExtras invoke() {
                Function0 function00 = this.$extrasProducer;
                if(function00 != null) {
                    CreationExtras creationExtras0 = (CreationExtras)function00.invoke();
                    return creationExtras0 == null ? this.$this_viewModels.getDefaultViewModelCreationExtras() : creationExtras0;
                }
                return this.$this_viewModels.getDefaultViewModelCreationExtras();
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        });
        this.onBackPressedCallback = new OnBackPressedCallback() {
            {
                ImageGridEditorActivity.this = imageGridEditorActivity0;
                super(true);
            }

            @Override  // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                ImageGridEditorActivity.access$close(ImageGridEditorActivity.this);
            }
        };
        this.cellPickerRequestCode = 2000;
        this.cellPickerOpener = new IntentLauncher() {
            @Nullable
            private ActivityResultLauncher cellPickerResultLauncher;

            {
                this.cellPickerResultLauncher = imageGridEditorActivity0.registerForActivityResult(new StartActivityForResult(), new a(imageGridEditorActivity0, 3));
            }

            private static final void cellPickerResultLauncher$lambda$1(ImageGridEditorActivity imageGridEditorActivity0, ActivityResult activityResult0) {
                Intrinsics.checkNotNullParameter(imageGridEditorActivity0, "this$0");
                ImageGridAdapter imageGridAdapter0 = ImageGridEditorActivity.access$getImageGridAdapter$p(imageGridEditorActivity0);
                if(imageGridAdapter0 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imageGridAdapter");
                    imageGridAdapter0 = null;
                }
                ImageGridEditorActivity.access$sendRequestToImageGrid(imageGridEditorActivity0, new OnImageGridSpecCellPickerResult(imageGridEditorActivity0, imageGridAdapter0, -1, activityResult0.getData()));
                ImageGridEditorActivity.access$onUpdatedImageCount(imageGridEditorActivity0);
            }

            @Override  // com.kakao.keditor.plugin.pluginspec.imagegrid.CellPickerOpener$IntentLauncher
            @Nullable
            public Intent getCellPickerIntent(@NotNull AppCompatActivity appCompatActivity0, int v, @Nullable List list0, @NotNull List list1) {
                Intrinsics.checkNotNullParameter(appCompatActivity0, "activity");
                Intrinsics.checkNotNullParameter(list1, "currentCells");
                Intent intent0 = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                intent0.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent0.setType("image/*");
                return Intent.createChooser(intent0, Keditor.INSTANCE.getContext().getString(string.cd_add_image));
            }

            @Override  // com.kakao.keditor.plugin.pluginspec.imagegrid.CellPickerOpener$IntentLauncher
            @Nullable
            public ActivityResultLauncher getCellPickerResultLauncher() {
                return this.cellPickerResultLauncher;
            }

            @Override  // com.kakao.keditor.plugin.pluginspec.imagegrid.CellPickerOpener$IntentLauncher
            public void setCellPickerResultLauncher(@Nullable ActivityResultLauncher activityResultLauncher0) {
                this.cellPickerResultLauncher = activityResultLauncher0;
            }
        };
        this.cellEditorRequestCode = 1000;
        this.cellEditorOpener = new com.kakao.keditor.plugin.pluginspec.imagegrid.CellEditorOpener.IntentLauncher() {
            @Nullable
            private ActivityResultLauncher cellEditorResultLauncher;

            {
                this.cellEditorResultLauncher = imageGridEditorActivity0.registerForActivityResult(new StartActivityForResult(), new a(imageGridEditorActivity0, 2));
            }

            private static final void cellEditorResultLauncher$lambda$1(ImageGridEditorActivity imageGridEditorActivity0, ActivityResult activityResult0) {
                Intrinsics.checkNotNullParameter(imageGridEditorActivity0, "this$0");
                ImageGridAdapter imageGridAdapter0 = ImageGridEditorActivity.access$getImageGridAdapter$p(imageGridEditorActivity0);
                if(imageGridAdapter0 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imageGridAdapter");
                    imageGridAdapter0 = null;
                }
                ImageGridEditorActivity.access$sendRequestToImageGrid(imageGridEditorActivity0, new OnImageGridSpecCellEditorResult(imageGridEditorActivity0, imageGridAdapter0, -1, activityResult0.getData()));
            }

            @Override  // com.kakao.keditor.plugin.pluginspec.imagegrid.CellEditorOpener$IntentLauncher
            @Nullable
            public Intent getCellEditorIntent(@NotNull AppCompatActivity appCompatActivity0, @Nullable ImageGridCellItem imageGridCellItem0) {
                Intrinsics.checkNotNullParameter(appCompatActivity0, "imageGridEditorActivity");
                Intent intent0 = new Intent("android.intent.action.EDIT");
                intent0.setDataAndType(Uri.parse(""), "image/*");
                intent0.setFlags(1);
                return intent0;
            }

            @Override  // com.kakao.keditor.plugin.pluginspec.imagegrid.CellEditorOpener$IntentLauncher
            @Nullable
            public ActivityResultLauncher getCellEditorResultLauncher() {
                return this.cellEditorResultLauncher;
            }

            @Override  // com.kakao.keditor.plugin.pluginspec.imagegrid.CellEditorOpener$IntentLauncher
            public void setCellEditorResultLauncher(@Nullable ActivityResultLauncher activityResultLauncher0) {
                this.cellEditorResultLauncher = activityResultLauncher0;
            }
        };
    }

    public static final void access$onUpdatedImageCount(ImageGridEditorActivity imageGridEditorActivity0) {
        imageGridEditorActivity0.onUpdatedImageCount();
    }

    private final void close() {
        String s = this.origin;
        ImageGridAdapter imageGridAdapter0 = this.imageGridAdapter;
        if(imageGridAdapter0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageGridAdapter");
            imageGridAdapter0 = null;
        }
        ImageGridItem imageGridItem0 = imageGridAdapter0.getImageGridItem();
        if(!Intrinsics.areEqual(s, (imageGridItem0 == null ? null : imageGridItem0.toComparableJsonString()))) {
            Integer integer0 = string.ke_group_cancel_edit_title;
            Integer integer1 = string.ke_group_cancel_edit_body;
            int v = string.ke_do_cancel;
            int v1 = string.ke_no;
            com.kakao.keditor.plugin.pluginspec.imagegrid.editor.ImageGridEditorActivity.close.1 imageGridEditorActivity$close$10 = new Function0() {
                {
                    ImageGridEditorActivity.this = imageGridEditorActivity0;
                    super(0);
                }

                @Override  // kotlin.jvm.functions.Function0
                public Object invoke() {
                    this.invoke();
                    return Unit.INSTANCE;
                }

                public final void invoke() {
                    ImageGridEditorActivity.this.finish();
                }
            };
            Companion.newInstance$default(KeditorAlertDialog.Companion, integer0, integer1, v, v1, false, imageGridEditorActivity$close$10, 16, null).show(this.getSupportFragmentManager(), null);
            return;
        }
        this.finish();
    }

    private final void dndStateIdle() {
        Keditor.clickEvent$default(Keditor.INSTANCE, "kImageGrid", "dnd", null, 4, null);
    }

    public static void g(ImageGridEditorActivity imageGridEditorActivity0, ActivityResult activityResult0) {
        ImageGridEditorActivity.onCreate$lambda$3$lambda$1(imageGridEditorActivity0, activityResult0);
    }

    @NotNull
    public final KeActivityImageGridEditorBinding getBinding() {
        KeActivityImageGridEditorBinding keActivityImageGridEditorBinding0 = this.binding;
        if(keActivityImageGridEditorBinding0 != null) {
            return keActivityImageGridEditorBinding0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.imagegrid.ImageGridCellEditorSupporter
    @Nullable
    public CellEditorOpener getCellEditorOpener() {
        return this.cellEditorOpener;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.imagegrid.ImageGridCellEditorSupporter
    public int getCellEditorRequestCode() {
        return this.cellEditorRequestCode;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.imagegrid.ImageGridCellEditorSupporter
    @Nullable
    public CellEditorResultHandler getCellEditorResultHandler() {
        return this.cellEditorResultHandler;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.imagegrid.ImageGridCellPickerSupporter
    @Nullable
    public CellPickerOpener getCellPickerOpener() {
        return this.cellPickerOpener;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.imagegrid.ImageGridCellPickerSupporter
    public int getCellPickerRequestCode() {
        return this.cellPickerRequestCode;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.imagegrid.ImageGridCellPickerSupporter
    @Nullable
    public CellPickerResultHandler getCellPickerResultHandler() {
        return this.cellPickerResultHandler;
    }

    private final int getEditorId() {
        return ((Number)this.editorId$delegate.getValue()).intValue();
    }

    private final ImageGridItem getItem() {
        return (ImageGridItem)this.item$delegate.getValue();
    }

    private final int getKeditorItemIndex() {
        return ((Number)this.keditorItemIndex$delegate.getValue()).intValue();
    }

    @Override  // com.kakao.keditor.base.KeditorBaseAppCompatActivity
    @Nullable
    public OnBackPressedCallback getOnBackPressedCallback() {
        return this.onBackPressedCallback;
    }

    private final ImageGridViewModel getVm() {
        return (ImageGridViewModel)this.vm$delegate.getValue();
    }

    public static void h(ImageGridEditorActivity imageGridEditorActivity0, ActivityResult activityResult0) {
        ImageGridEditorActivity.onCreate$lambda$3$lambda$2(imageGridEditorActivity0, activityResult0);
    }

    @Override  // androidx.fragment.app.FragmentActivity
    public void onActivityResult(int v, int v1, @Nullable Intent intent0) {
        ImageGridAdapter imageGridAdapter0 = null;
        super.onActivityResult(v, v1, intent0);
        if(v1 == -1) {
            if(v == this.getCellEditorRequestCode() && !this.isEditorIntentLauncher) {
                ImageGridAdapter imageGridAdapter1 = this.imageGridAdapter;
                if(imageGridAdapter1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imageGridAdapter");
                }
                else {
                    imageGridAdapter0 = imageGridAdapter1;
                }
                this.sendRequestToImageGrid(new OnImageGridSpecCellEditorResult(this, imageGridAdapter0, -1, intent0));
                return;
            }
            if(v == this.getCellPickerRequestCode() && !this.isEditorIntentLauncher) {
                ImageGridAdapter imageGridAdapter2 = this.imageGridAdapter;
                if(imageGridAdapter2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imageGridAdapter");
                }
                else {
                    imageGridAdapter0 = imageGridAdapter2;
                }
                this.sendRequestToImageGrid(new OnImageGridSpecCellPickerResult(this, imageGridAdapter0, -1, intent0));
                this.onUpdatedImageCount();
            }
        }
    }

    private final void onConfirmClicked() {
        this.setResult(-1, this.getIntent());
        Intent intent0 = this.getIntent();
        ImageGridAdapter imageGridAdapter0 = this.imageGridAdapter;
        if(imageGridAdapter0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageGridAdapter");
            imageGridAdapter0 = null;
        }
        intent0.putExtra("data", imageGridAdapter0.getImageGridItem());
        intent0.putExtra("keditor_item_index", this.getKeditorItemIndex());
        this.finish();
    }

    @Override  // com.kakao.keditor.base.KeditorBaseAppCompatActivity
    public void onCreate(@Nullable Bundle bundle0) {
        Boolean boolean0;
        super.onCreate(bundle0);
        ViewDataBinding viewDataBinding0 = DataBindingUtil.setContentView(this, layout.ke_activity_image_grid_editor);
        Intrinsics.checkNotNullExpressionValue(viewDataBinding0, "setContentView(...)");
        this.setBinding(((KeActivityImageGridEditorBinding)viewDataBinding0));
        this.getBinding().setVm(this.getVm());
        int v = this.getIntent().getIntExtra("editor_id", -1);
        if(this.getItem().getImages().size() > 0) {
            this.getItem().setFocusedImage(0);
        }
        this.origin = this.getItem().toComparableJsonString();
        KeditorImageGridLayout keditorImageGridLayout0 = this.getBinding().keImageGridLayout;
        Intrinsics.checkNotNullExpressionValue(keditorImageGridLayout0, "keImageGridLayout");
        ImageGridItem imageGridItem0 = this.getItem();
        Keditor keditor0 = Keditor.INSTANCE;
        Integer integer0 = v;
        if(KeditorStandardKt.getOr(keditor0.getLocalConfigs(), integer0, null) == null || !((Map)androidx.room.a.g(keditor0, integer0)).containsKey("representative_image_enabled")) {
            Object object1 = keditor0.getConfig().get("representative_image_enabled");
            if(!(object1 instanceof Boolean)) {
                object1 = null;
            }
            boolean0 = (Boolean)object1;
        }
        else {
            Object object0 = ((Map)androidx.room.a.g(keditor0, integer0)).get("representative_image_enabled");
            if(!(object0 instanceof Boolean)) {
                object0 = null;
            }
            boolean0 = (Boolean)object0;
        }
        if(boolean0 == null) {
            boolean0 = null;
        }
        this.imageGridAdapter = new ImageGridAdapter(keditorImageGridLayout0, imageGridItem0, true, (boolean0 == null ? false : boolean0.booleanValue()));
        this.getBinding().setImageCount(this.getItem().getImages().size());
        this.getBinding().setDragState(DragState.Idle);
        KeditorImageGridLayout keditorImageGridLayout1 = this.getBinding().keImageGridLayout;
        ImageGridAdapter imageGridAdapter0 = this.imageGridAdapter;
        if(imageGridAdapter0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageGridAdapter");
            imageGridAdapter0 = null;
        }
        keditorImageGridLayout1.setAdapter(imageGridAdapter0);
        keditorImageGridLayout1.setDragAndDropEnabled(true);
        keditorImageGridLayout1.setGuideLineTint(ContextCompat.getColor(keditorImageGridLayout1.getContext(), color.ke_imagegrid_color_guideline));
        keditorImageGridLayout1.setCellDragListener(new OnCellDragListener() {
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
            public final class WhenMappings {
                public static final int[] $EnumSwitchMapping$0;

                static {
                    int[] arr_v = new int[com.kakao.keditor.plugin.pluginspec.imagegrid.layout.AutoTemplateLayout.DragState.values().length];
                    try {
                        arr_v[com.kakao.keditor.plugin.pluginspec.imagegrid.layout.AutoTemplateLayout.DragState.IDLE.ordinal()] = 1;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    try {
                        arr_v[com.kakao.keditor.plugin.pluginspec.imagegrid.layout.AutoTemplateLayout.DragState.START_DRAG.ordinal()] = 2;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    WhenMappings.$EnumSwitchMapping$0 = arr_v;
                }
            }

            @Override  // com.kakao.keditor.plugin.pluginspec.imagegrid.layout.AutoTemplateLayout$OnCellDragListener
            public void onDragStateChanged(@NotNull com.kakao.keditor.plugin.pluginspec.imagegrid.layout.AutoTemplateLayout.DragState autoTemplateLayout$DragState0) {
                Intrinsics.checkNotNullParameter(autoTemplateLayout$DragState0, "dragState");
                switch(WhenMappings.$EnumSwitchMapping$0[autoTemplateLayout$DragState0.ordinal()]) {
                    case 1: {
                        ImageGridEditorActivity.this.getBinding().setDragState(DragState.Idle);
                        ImageGridEditorActivity.this.dndStateIdle();
                        return;
                    }
                    case 2: {
                        ImageGridEditorActivity.this.getBinding().setDragState(DragState.OnDrag);
                    }
                }
            }
        });
        keditorImageGridLayout1.setAnimationEnabled(true);
        keditorImageGridLayout1.setScrollableLayout(this.getBinding().keImageGridScrollView);
        this.setCellEditorRequestCode(this.getIntent().getIntExtra("image_editor_request_code", 2000));
        this.setCellPickerRequestCode(this.getIntent().getIntExtra("image_picker_request_code", 1000));
        this.isPickerIntentLauncher = this.getIntent().getBooleanExtra("cell_picker_is_intent_launcher", false);
        this.isEditorIntentLauncher = this.getIntent().getBooleanExtra("cell_editor_is_intent_launcher", false);
        if(this.isPickerIntentLauncher) {
            this.pickerResultLauncher = this.registerForActivityResult(new StartActivityForResult(), new a(this, 0));
        }
        if(this.isEditorIntentLauncher) {
            this.editorResultLauncher = this.registerForActivityResult(new StartActivityForResult(), new a(this, 1));
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new Function2(null) {
            int label;

            {
                ImageGridEditorActivity.this = imageGridEditorActivity0;
                super(2, continuation0);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation create(@Nullable Object object0, @NotNull Continuation continuation0) {
                return new com.kakao.keditor.plugin.pluginspec.imagegrid.editor.ImageGridEditorActivity.onCreate.3(ImageGridEditorActivity.this, continuation0);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((CoroutineScope)object0), ((Continuation)object1));
            }

            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope0, @Nullable Continuation continuation0) {
                return ((com.kakao.keditor.plugin.pluginspec.imagegrid.editor.ImageGridEditorActivity.onCreate.3)this.create(coroutineScope0, continuation0)).invokeSuspend(Unit.INSTANCE);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object object0) {
                Object object1 = qd.a.getCOROUTINE_SUSPENDED();
                switch(this.label) {
                    case 0: {
                        ResultKt.throwOnFailure(object0);
                        SharedFlow sharedFlow0 = ImageGridEditorActivity.this.getVm().getAction();
                        Lifecycle lifecycle0 = ImageGridEditorActivity.this.getLifecycle();
                        Intrinsics.checkNotNullExpressionValue(lifecycle0, "<get-lifecycle>(...)");
                        Flow flow0 = FlowExtKt.flowWithLifecycle(sharedFlow0, lifecycle0, State.CREATED);
                        com.kakao.keditor.plugin.pluginspec.imagegrid.editor.ImageGridEditorActivity.onCreate.3.1 imageGridEditorActivity$onCreate$3$10 = new FlowCollector() {
                            @Nullable
                            public final Object emit(@NotNull Action action0, @NotNull Continuation continuation0) {
                                Object object0 = null;
                                if(Intrinsics.areEqual(action0, OnCloseClicked.INSTANCE)) {
                                    Keditor.clickEvent$default(Keditor.INSTANCE, "kImageGrid", "close", null, 4, null);
                                    ImageGridEditorActivity.this.close();
                                    return Unit.INSTANCE;
                                }
                                if(Intrinsics.areEqual(action0, OnDeleteClicked.INSTANCE)) {
                                    Keditor.clickEvent$default(Keditor.INSTANCE, "kImageGrid", "removeImage", null, 4, null);
                                    ImageGridEditorActivity.this.onDeleteClicked();
                                    return Unit.INSTANCE;
                                }
                                if(action0 instanceof OnAddClicked) {
                                    Keditor.clickEvent$default(Keditor.INSTANCE, "kImageGrid", "addImage", null, 4, null);
                                    if(ImageGridEditorActivity.this.isPickerIntentLauncher) {
                                        List list0 = ImageGridEditorActivity.this.getItem().getImages();
                                        ImageGridEditorActivity.this.openCellPicker(ImageGridEditorActivity.this, 14, null, list0);
                                        return Unit.INSTANCE;
                                    }
                                    int v = ImageGridEditorActivity.this.getKeditorItemIndex();
                                    List list1 = ImageGridEditorActivity.this.getItem().getImages();
                                    OpenImageGridSpecCellPicker openImageGridSpecCellPicker0 = new OpenImageGridSpecCellPicker(ImageGridEditorActivity.this, v, list1);
                                    ImageGridEditorActivity.this.sendRequestToImageGrid(openImageGridSpecCellPicker0);
                                    return Unit.INSTANCE;
                                }
                                if(Intrinsics.areEqual(action0, OnConfirmClicked.INSTANCE)) {
                                    Keditor.clickEvent$default(Keditor.INSTANCE, "kImageGrid", "confirm", null, 4, null);
                                    ImageGridEditorActivity.this.onConfirmClicked();
                                    return Unit.INSTANCE;
                                }
                                if(Intrinsics.areEqual(action0, OnEditClicked.INSTANCE)) {
                                    Keditor.clickEvent$default(Keditor.INSTANCE, "kImageGrid", "editImage", null, 4, null);
                                    Keditor.INSTANCE.loadEventWithVersion("photos-android-0.0.0");
                                    if(ImageGridEditorActivity.this.isEditorIntentLauncher) {
                                        ImageGridEditorActivity imageGridEditorActivity0 = ImageGridEditorActivity.this;
                                        ImageGridAdapter imageGridAdapter0 = imageGridEditorActivity0.imageGridAdapter;
                                        if(imageGridAdapter0 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("imageGridAdapter");
                                            imageGridAdapter0 = null;
                                        }
                                        for(Object object1: imageGridAdapter0.getItems()) {
                                            if(((ImageGridCellItem)object1).isFocused()) {
                                                object0 = object1;
                                                break;
                                            }
                                            if(false) {
                                                break;
                                            }
                                        }
                                        imageGridEditorActivity0.openCellEditor(imageGridEditorActivity0, ((ImageGridCellItem)object0));
                                        return Unit.INSTANCE;
                                    }
                                    ImageGridEditorActivity imageGridEditorActivity1 = ImageGridEditorActivity.this;
                                    ImageGridAdapter imageGridAdapter1 = imageGridEditorActivity1.imageGridAdapter;
                                    if(imageGridAdapter1 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("imageGridAdapter");
                                        imageGridAdapter1 = null;
                                    }
                                    for(Object object2: imageGridAdapter1.getItems()) {
                                        if(((ImageGridCellItem)object2).isFocused()) {
                                            object0 = object2;
                                            break;
                                        }
                                        if(false) {
                                            break;
                                        }
                                    }
                                    imageGridEditorActivity1.sendRequestToImageGrid(new OpenImageGridSpecCellEditor(imageGridEditorActivity1, ((ImageGridCellItem)object0)));
                                }
                                return Unit.INSTANCE;
                            }

                            @Override  // kotlinx.coroutines.flow.FlowCollector
                            public Object emit(Object object0, Continuation continuation0) {
                                return this.emit(((Action)object0), continuation0);
                            }
                        };
                        this.label = 1;
                        return flow0.collect(imageGridEditorActivity$onCreate$3$10, this) == object1 ? object1 : Unit.INSTANCE;
                    }
                    case 1: {
                        ResultKt.throwOnFailure(object0);
                        return Unit.INSTANCE;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }, 3, null);
        Toast.makeText(this, string.ke_group_edit_hint, 0).show();
    }

    private static final void onCreate$lambda$3$lambda$1(ImageGridEditorActivity imageGridEditorActivity0, ActivityResult activityResult0) {
        Intrinsics.checkNotNullParameter(imageGridEditorActivity0, "this$0");
        ImageGridAdapter imageGridAdapter0 = imageGridEditorActivity0.imageGridAdapter;
        if(imageGridAdapter0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageGridAdapter");
            imageGridAdapter0 = null;
        }
        imageGridEditorActivity0.sendRequestToImageGrid(new OnImageGridSpecCellEditorResult(imageGridEditorActivity0, imageGridAdapter0, activityResult0.getResultCode(), activityResult0.getData()));
    }

    private static final void onCreate$lambda$3$lambda$2(ImageGridEditorActivity imageGridEditorActivity0, ActivityResult activityResult0) {
        Intrinsics.checkNotNullParameter(imageGridEditorActivity0, "this$0");
        ImageGridAdapter imageGridAdapter0 = imageGridEditorActivity0.imageGridAdapter;
        if(imageGridAdapter0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageGridAdapter");
            imageGridAdapter0 = null;
        }
        imageGridEditorActivity0.sendRequestToImageGrid(new OnImageGridSpecCellPickerResult(imageGridEditorActivity0, imageGridAdapter0, activityResult0.getResultCode(), activityResult0.getData()));
        imageGridEditorActivity0.onUpdatedImageCount();
    }

    private final void onDeleteClicked() {
        ImageGridAdapter imageGridAdapter0 = this.imageGridAdapter;
        ImageGridAdapter imageGridAdapter1 = null;
        if(imageGridAdapter0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageGridAdapter");
            imageGridAdapter0 = null;
        }
        ImageGridItem imageGridItem0 = imageGridAdapter0.getImageGridItem();
        if(imageGridItem0 != null) {
            int v = imageGridItem0.getFocusedImageIndex();
            imageGridItem0.removeImageAndFocusNext();
            ImageGridAdapter imageGridAdapter2 = this.imageGridAdapter;
            if(imageGridAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageGridAdapter");
            }
            else {
                imageGridAdapter1 = imageGridAdapter2;
            }
            imageGridAdapter1.notifyItemRemoved(v);
            this.onUpdatedImageCount();
        }
    }

    private final void onUpdatedImageCount() {
        int v;
        KeActivityImageGridEditorBinding keActivityImageGridEditorBinding0 = this.getBinding();
        ImageGridAdapter imageGridAdapter0 = this.imageGridAdapter;
        if(imageGridAdapter0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageGridAdapter");
            imageGridAdapter0 = null;
        }
        ImageGridItem imageGridItem0 = imageGridAdapter0.getImageGridItem();
        if(imageGridItem0 == null) {
            v = 0;
        }
        else {
            List list0 = imageGridItem0.getImages();
            v = list0 == null ? 0 : list0.size();
        }
        keActivityImageGridEditorBinding0.setImageCount(v);
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.imagegrid.ImageGridCellEditorSupporter
    public void openCellEditor(@NotNull Activity activity0, @Nullable ImageGridCellItem imageGridCellItem0) {
        DefaultImpls.openCellEditor(this, activity0, imageGridCellItem0);
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.imagegrid.ImageGridCellPickerSupporter
    public void openCellPicker(@NotNull Activity activity0, int v, @Nullable List list0, @NotNull List list1) {
        com.kakao.keditor.plugin.pluginspec.imagegrid.ImageGridCellPickerSupporter.DefaultImpls.openCellPicker(this, activity0, v, list0, list1);
    }

    private final void sendRequestToImageGrid(PluginSpecRequest pluginSpecRequest0) {
        int v = this.getEditorId();
        PluginSpecRequester.INSTANCE.request(pluginSpecRequest0, v);
    }

    public final void setBinding(@NotNull KeActivityImageGridEditorBinding keActivityImageGridEditorBinding0) {
        Intrinsics.checkNotNullParameter(keActivityImageGridEditorBinding0, "<set-?>");
        this.binding = keActivityImageGridEditorBinding0;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.imagegrid.ImageGridCellEditorSupporter
    public void setCellEditorOpener(@Nullable CellEditorOpener cellEditorOpener0) {
        this.cellEditorOpener = cellEditorOpener0;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.imagegrid.ImageGridCellEditorSupporter
    public void setCellEditorRequestCode(int v) {
        this.cellEditorRequestCode = v;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.imagegrid.ImageGridCellEditorSupporter
    public void setCellEditorResultHandler(@Nullable CellEditorResultHandler cellEditorResultHandler0) {
        this.cellEditorResultHandler = cellEditorResultHandler0;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.imagegrid.ImageGridCellPickerSupporter
    public void setCellPickerOpener(@Nullable CellPickerOpener cellPickerOpener0) {
        this.cellPickerOpener = cellPickerOpener0;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.imagegrid.ImageGridCellPickerSupporter
    public void setCellPickerRequestCode(int v) {
        this.cellPickerRequestCode = v;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.imagegrid.ImageGridCellPickerSupporter
    public void setCellPickerResultHandler(@Nullable CellPickerResultHandler cellPickerResultHandler0) {
        this.cellPickerResultHandler = cellPickerResultHandler0;
    }

    @Override  // com.kakao.keditor.base.KeditorBaseAppCompatActivity
    public void setOnBackPressedCallback(@Nullable OnBackPressedCallback onBackPressedCallback0) {
        this.onBackPressedCallback = onBackPressedCallback0;
    }
}

