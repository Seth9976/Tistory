package com.kakao.keditor.plugin.pluginspec.grammarcheck;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
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
import com.kakao.keditor.plugin.EditorSupporter;
import com.kakao.keditor.plugin.KeditorPluginType;
import com.kakao.keditor.plugin.PickerOpener.IntentLauncher;
import com.kakao.keditor.plugin.PickerOpener;
import com.kakao.keditor.plugin.PickerResultHandler;
import com.kakao.keditor.plugin.PickerSupporter;
import com.kakao.keditor.plugin.itemspec.ItemSpecs;
import com.kakao.keditor.plugin.itemspec.grammarcheck.GrammarCheckResponse;
import com.kakao.keditor.plugin.itemspec.paragraph.GrammarCheckTextItem;
import com.kakao.keditor.plugin.pluginspec.PluginSpec.DefaultImpls;
import com.kakao.keditor.plugin.pluginspec.PluginSpec;
import com.kakao.keditor.toolbar.toolbaroverlay.ToolbarOverlayMenuItem;
import com.kakao.keditor.util.eventbus.PluginSpecRequest;
import com.kakao.keditor.widget.KeditorEditText;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@KeditorPluginType(type = "grammar_check")
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00A2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001A\u00020\u0006H\u0016J\u0018\u0010H\u001A\u00020I2\u0006\u0010J\u001A\u00020K2\u0006\u0010-\u001A\u00020.H\u0016J\b\u0010L\u001A\u00020IH\u0016J\u0010\u0010M\u001A\u00020I2\u0006\u0010N\u001A\u00020OH\u0002R\u001A\u0010\u0005\u001A\u00020\u0006X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001E\u0010\u000B\u001A\u0004\u0018\u00010\fX\u0096\u000E\u00A2\u0006\u0010\n\u0002\u0010\u0011\u001A\u0004\b\r\u0010\u000E\"\u0004\b\u000F\u0010\u0010R\u001C\u0010\u0012\u001A\u0004\u0018\u00010\u0013X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001E\u0010\u0018\u001A\u0004\u0018\u00010\fX\u0096\u000E\u00A2\u0006\u0010\n\u0002\u0010\u0011\u001A\u0004\b\u0019\u0010\u000E\"\u0004\b\u001A\u0010\u0010R\u001A\u0010\u001B\u001A\u00020\fX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001C\u0010\u001D\"\u0004\b\u001E\u0010\u001FR\u001C\u0010 \u001A\u0004\u0018\u00010!X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010&\u001A\n\u0012\u0004\u0012\u00020(\u0018\u00010\'X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001C\u0010-\u001A\u0004\u0018\u00010.X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b/\u00100\"\u0004\b1\u00102R\u001C\u00103\u001A\u0004\u0018\u000104X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b5\u00106\"\u0004\b7\u00108R\u001A\u00109\u001A\u00020\fX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b:\u0010\u001D\"\u0004\b;\u0010\u001FR\u001C\u0010<\u001A\u0004\u0018\u00010=X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001C\u0010B\u001A\u0004\u0018\u00010CX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\bD\u0010E\"\u0004\bF\u0010G\u00A8\u0006P"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/grammarcheck/GrammarCheckPluginSpec;", "Lcom/kakao/keditor/plugin/pluginspec/PluginSpec;", "Lcom/kakao/keditor/plugin/PickerSupporter;", "Lcom/kakao/keditor/plugin/ActivityResultHandler;", "()V", "addToolbarOverlayMenu", "", "getAddToolbarOverlayMenu", "()Z", "setAddToolbarOverlayMenu", "(Z)V", "contextMenuDescription", "", "getContextMenuDescription", "()Ljava/lang/Integer;", "setContextMenuDescription", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "contextMenuIcon", "Landroid/view/View;", "getContextMenuIcon", "()Landroid/view/View;", "setContextMenuIcon", "(Landroid/view/View;)V", "contextMenuResource", "getContextMenuResource", "setContextMenuResource", "editorId", "getEditorId", "()I", "setEditorId", "(I)V", "grammarChecker", "Lcom/kakao/keditor/plugin/pluginspec/grammarcheck/GrammarChecker;", "getGrammarChecker", "()Lcom/kakao/keditor/plugin/pluginspec/grammarcheck/GrammarChecker;", "setGrammarChecker", "(Lcom/kakao/keditor/plugin/pluginspec/grammarcheck/GrammarChecker;)V", "itemSpecKeys", "", "", "getItemSpecKeys", "()Ljava/util/List;", "setItemSpecKeys", "(Ljava/util/List;)V", "itemSpecs", "Lcom/kakao/keditor/plugin/itemspec/ItemSpecs;", "getItemSpecs", "()Lcom/kakao/keditor/plugin/itemspec/ItemSpecs;", "setItemSpecs", "(Lcom/kakao/keditor/plugin/itemspec/ItemSpecs;)V", "pickerOpener", "Lcom/kakao/keditor/plugin/PickerOpener;", "getPickerOpener", "()Lcom/kakao/keditor/plugin/PickerOpener;", "setPickerOpener", "(Lcom/kakao/keditor/plugin/PickerOpener;)V", "pickerRequestCode", "getPickerRequestCode", "setPickerRequestCode", "pickerResultHandler", "Lcom/kakao/keditor/plugin/PickerResultHandler;", "getPickerResultHandler", "()Lcom/kakao/keditor/plugin/PickerResultHandler;", "setPickerResultHandler", "(Lcom/kakao/keditor/plugin/PickerResultHandler;)V", "toolbarOverlayMenuItem", "Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuItem;", "getToolbarOverlayMenuItem", "()Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuItem;", "setToolbarOverlayMenuItem", "(Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuItem;)V", "initPluginSpec", "", "context", "Landroid/content/Context;", "runIconClick", "startGrammarCheck", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nGrammarCheckPluginSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrammarCheckPluginSpec.kt\ncom/kakao/keditor/plugin/pluginspec/grammarcheck/GrammarCheckPluginSpec\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,97:1\n1360#2:98\n1446#2,5:99\n*S KotlinDebug\n*F\n+ 1 GrammarCheckPluginSpec.kt\ncom/kakao/keditor/plugin/pluginspec/grammarcheck/GrammarCheckPluginSpec\n*L\n60#1:98\n60#1:99,5\n*E\n"})
public final class GrammarCheckPluginSpec implements ActivityResultHandler, PickerSupporter, PluginSpec {
    private boolean addToolbarOverlayMenu;
    @Nullable
    private Integer contextMenuDescription;
    @Nullable
    private View contextMenuIcon;
    @Nullable
    private Integer contextMenuResource;
    private int editorId;
    @Nullable
    private GrammarChecker grammarChecker;
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

    public GrammarCheckPluginSpec() {
        int v;
        this.itemSpecKeys = CollectionsKt__CollectionsKt.emptyList();
        this.toolbarOverlayMenuItem = new ToolbarOverlayMenuItem(id.ke_overlay_grammar, drawable.btn_grammar_wordcheck, string.grammar, string.grammar, null, 16, null);
        this.addToolbarOverlayMenu = true;
        GrammarChecker grammarChecker0 = this.grammarChecker;
        if(grammarChecker0 == null) {
            v = 0;
        }
        else {
            Integer integer0 = grammarChecker0.getRequestCode();
            v = integer0 == null ? 0 : ((int)integer0);
        }
        this.pickerRequestCode = v;
        this.pickerOpener = new com.kakao.keditor.plugin.pluginspec.grammarcheck.GrammarCheckPluginSpec.pickerOpener.1();
        this.pickerResultHandler = new PickerResultHandler() {
            @Override  // com.kakao.keditor.plugin.PickerResultHandler
            public void onPickerResult(int v, @Nullable Intent intent0) {
                if(v != -1) {
                    return;
                }
                boolean z = false;
                GrammarChecker grammarChecker0 = GrammarCheckPluginSpec.this.getGrammarChecker();
                if(grammarChecker0 != null) {
                    if(intent0 != null) {
                        z = intent0.getBooleanExtra("grammar_checked_all", false);
                    }
                    grammarChecker0.onGrammarCheckerClosed(z, new Function0() {
                        {
                            GrammarCheckPluginSpec.this = grammarCheckPluginSpec0;
                            super(0);
                        }

                        @Override  // kotlin.jvm.functions.Function0
                        public Object invoke() {
                            this.invoke();
                            return Unit.INSTANCE;
                        }

                        public final void invoke() {
                            KeditorView keditorView0 = GrammarCheckPluginSpec.this.findKeditorView();
                            if(keditorView0 != null) {
                                Context context0 = keditorView0.getContext();
                                Intrinsics.checkNotNullExpressionValue(context0, "getContext(...)");
                                String s = new GrammarCheckRepository(context0).getSavedCDMJson();
                                if(s == null) {
                                    s = "";
                                }
                                keditorView0.loadWithKeepOriginal(s);
                            }
                        }
                    });
                }
            }
        };

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/kakao/keditor/plugin/pluginspec/grammarcheck/GrammarCheckPluginSpec$pickerOpener$1", "Lcom/kakao/keditor/plugin/PickerOpener$IntentLauncher;", "getPickerIntent", "Landroid/content/Intent;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public final class com.kakao.keditor.plugin.pluginspec.grammarcheck.GrammarCheckPluginSpec.pickerOpener.1 extends IntentLauncher {
            @Override  // com.kakao.keditor.plugin.PickerOpener$IntentLauncher
            @Nullable
            public Intent getPickerIntent(@NotNull AppCompatActivity appCompatActivity0) {
                Intrinsics.checkNotNullParameter(appCompatActivity0, "activity");
                return new Intent(appCompatActivity0, GrammarCheckActivity.class);
            }
        }

    }

    @Override  // com.kakao.keditor.plugin.pluginspec.PluginSpec
    public boolean addToolbarOverlayMenu() {
        return this.addToolbarOverlayMenu;
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

    public final boolean getAddToolbarOverlayMenu() {
        return this.addToolbarOverlayMenu;
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

    @Nullable
    public final GrammarChecker getGrammarChecker() {
        return this.grammarChecker;
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
        return this.pickerRequestCode;
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
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(itemSpecs0, "itemSpecs");
        if(this.grammarChecker == null) {
            throw new Exception("[" + this + "] KeditorPlugin must have grammarChecker");
        }
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
        DefaultImpls.onRequest(this, pluginSpecRequest0);
    }

    @Override  // com.kakao.keditor.plugin.PickerSupporter
    public void openPicker(@NotNull Activity activity0, @Nullable EventFlow eventFlow0) {
        com.kakao.keditor.plugin.PickerSupporter.DefaultImpls.openPicker(this, activity0, eventFlow0);
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
        KeditorView keditorView0 = this.findKeditorView();
        AppCompatActivity appCompatActivity0 = null;
        Context context0 = keditorView0 == null ? null : keditorView0.getContext();
        if(context0 instanceof AppCompatActivity) {
            appCompatActivity0 = (AppCompatActivity)context0;
        }
        if(appCompatActivity0 != null) {
            this.startGrammarCheck(appCompatActivity0);
        }
        Keditor.clickEvent$default(Keditor.INSTANCE, "moremenu", "grammarCheck", null, 4, null);
    }

    public final void setAddToolbarOverlayMenu(boolean z) {
        this.addToolbarOverlayMenu = z;
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

    public final void setGrammarChecker(@Nullable GrammarChecker grammarChecker0) {
        this.grammarChecker = grammarChecker0;
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

    private final void startGrammarCheck(AppCompatActivity appCompatActivity0) {
        String s;
        GrammarCheckingDialogFragment grammarCheckingDialogFragment0 = new GrammarCheckingDialogFragment();
        grammarCheckingDialogFragment0.show(appCompatActivity0.getSupportFragmentManager(), "grammar_checking_dialog");
        KeditorView keditorView0 = this.findKeditorView();
        if(keditorView0 == null) {
            s = "";
        }
        else {
            List list0 = keditorView0.grammarCheckItems();
            if(list0 == null) {
                s = "";
            }
            else {
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: list0) {
                    o.addAll(arrayList0, ((GrammarCheckTextItem)object0).parseGrammarCheckTexts());
                }
                s = CollectionsKt___CollectionsKt.joinToString$default(arrayList0, "\n", null, null, 0, null, null, 62, null);
                if(s == null) {
                    s = "";
                }
            }
        }
        GrammarChecker grammarChecker0 = this.grammarChecker;
        if(grammarChecker0 != null) {
            grammarChecker0.grammarCheckAsync(s, new Function1(this) {
                final AppCompatActivity $activity;

                {
                    this.$activity = appCompatActivity0;
                    GrammarCheckPluginSpec.this = grammarCheckPluginSpec0;
                    super(1);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.invoke(((GrammarCheckResponse)object0));
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull GrammarCheckResponse grammarCheckResponse0) {
                    String s;
                    Intrinsics.checkNotNullParameter(grammarCheckResponse0, "result");
                    GrammarCheckRepository grammarCheckRepository0 = new GrammarCheckRepository(this.$activity);
                    KeditorView keditorView0 = GrammarCheckPluginSpec.this.findKeditorView();
                    if(keditorView0 == null) {
                        s = "";
                    }
                    else {
                        s = keditorView0.exportToJson();
                        if(s == null) {
                            s = "";
                        }
                    }
                    grammarCheckRepository0.putSavedCDMJson(s);
                    grammarCheckRepository0.putGrammarCheckResult(grammarCheckResponse0);
                    com.kakao.keditor.plugin.PickerSupporter.DefaultImpls.openPicker$default(GrammarCheckPluginSpec.this, this.$activity, null, 2, null);
                }
            }, new Function0() {
                final GrammarCheckingDialogFragment $grammarDialog;

                {
                    this.$grammarDialog = grammarCheckingDialogFragment0;
                    super(0);
                }

                @Override  // kotlin.jvm.functions.Function0
                public Object invoke() {
                    this.invoke();
                    return Unit.INSTANCE;
                }

                public final void invoke() {
                    this.$grammarDialog.dismissAllowingStateLoss();
                }
            });
        }
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

