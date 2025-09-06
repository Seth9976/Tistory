package com.kakao.keditor.plugin.pluginspec;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.room.a;
import com.google.android.material.datepicker.t;
import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.KeditorView;
import com.kakao.keditor.plugin.itemspec.ItemSpecs;
import com.kakao.keditor.plugin.itemspec.KeditorBridge;
import com.kakao.keditor.plugin.itemspec.RootItemSpec;
import com.kakao.keditor.toolbar.ToolbarIconFactory;
import com.kakao.keditor.toolbar.toolbaroverlay.ToolbarOverlayMenuItem;
import com.kakao.keditor.util.eventbus.KeEvent;
import com.kakao.keditor.util.eventbus.PluginSpecRequest;
import com.kakao.keditor.util.eventbus.ViewRequest.AddKeditorItems;
import com.kakao.keditor.widget.KeditorEditText;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010%\u001A\u00020&H\u0016J\u0012\u0010\'\u001A\u0004\u0018\u00010\n2\u0006\u0010(\u001A\u00020)H\u0016J\u0018\u0010*\u001A\b\u0012\u0004\u0012\u00020+0\u00132\b\b\u0002\u0010,\u001A\u00020\u0004H\u0016J\u0018\u0010-\u001A\u00020.2\u0006\u0010(\u001A\u00020)2\u0006\u0010\u0019\u001A\u00020\u001AH\u0016J\u0012\u0010/\u001A\u00020\u00042\b\b\u0002\u00100\u001A\u00020\u0004H\u0016J\b\u00101\u001A\u00020.H\u0016J\b\u00102\u001A\u00020\u0014H\u0016J\u0010\u00103\u001A\u00020&2\u0006\u00102\u001A\u00020\u0014H\u0016R\u001A\u0010\u0003\u001A\u0004\u0018\u00010\u0004X¦\u000E¢\u0006\f\u001A\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001A\u0010\t\u001A\u0004\u0018\u00010\nX¦\u000E¢\u0006\f\u001A\u0004\b\u000B\u0010\f\"\u0004\b\r\u0010\u000ER\u001A\u0010\u000F\u001A\u0004\u0018\u00010\u0004X¦\u000E¢\u0006\f\u001A\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR \u0010\u0012\u001A\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X¦\u000E¢\u0006\f\u001A\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001A\u0010\u0019\u001A\u0004\u0018\u00010\u001AX¦\u000E¢\u0006\f\u001A\u0004\b\u001B\u0010\u001C\"\u0004\b\u001D\u0010\u001ER\u001A\u0010\u001F\u001A\u0004\u0018\u00010 X¦\u000E¢\u0006\f\u001A\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u00064"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/PluginSpec;", "Lcom/kakao/keditor/plugin/itemspec/KeditorBridge;", "Lcom/kakao/keditor/plugin/pluginspec/RequestHandler;", "contextMenuDescription", "", "getContextMenuDescription", "()Ljava/lang/Integer;", "setContextMenuDescription", "(Ljava/lang/Integer;)V", "contextMenuIcon", "Landroid/view/View;", "getContextMenuIcon", "()Landroid/view/View;", "setContextMenuIcon", "(Landroid/view/View;)V", "contextMenuResource", "getContextMenuResource", "setContextMenuResource", "itemSpecKeys", "", "", "getItemSpecKeys", "()Ljava/util/List;", "setItemSpecKeys", "(Ljava/util/List;)V", "itemSpecs", "Lcom/kakao/keditor/plugin/itemspec/ItemSpecs;", "getItemSpecs", "()Lcom/kakao/keditor/plugin/itemspec/ItemSpecs;", "setItemSpecs", "(Lcom/kakao/keditor/plugin/itemspec/ItemSpecs;)V", "toolbarOverlayMenuItem", "Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuItem;", "getToolbarOverlayMenuItem", "()Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuItem;", "setToolbarOverlayMenuItem", "(Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuItem;)V", "addToolbarOverlayMenu", "", "createIconForContextMenu", "context", "Landroid/content/Context;", "createKeditorItems", "Lcom/kakao/keditor/KeditorItem;", "focusPosition", "initPluginSpec", "", "pluginId", "ifNotFound", "runIconClick", "type", "typeOf", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface PluginSpec extends KeditorBridge, RequestHandler {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nPluginSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PluginSpec.kt\ncom/kakao/keditor/plugin/pluginspec/PluginSpec$DefaultImpls\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n1747#2,2:104\n1749#2:107\n1#3:106\n*S KotlinDebug\n*F\n+ 1 PluginSpec.kt\ncom/kakao/keditor/plugin/pluginspec/PluginSpec$DefaultImpls\n*L\n61#1:104,2\n61#1:107\n*E\n"})
    public static final class DefaultImpls {
        public static void a(PluginSpec pluginSpec0, View view0) {
            DefaultImpls.initPluginSpec$lambda$3$lambda$2(pluginSpec0, view0);
        }

        public static boolean addToolbarOverlayMenu(@NotNull PluginSpec pluginSpec0) [...] // Inlined contents

        @Nullable
        public static View createIconForContextMenu(@NotNull PluginSpec pluginSpec0, @NotNull Context context0) {
            Intrinsics.checkNotNullParameter(context0, "context");
            Integer integer0 = pluginSpec0.getContextMenuResource();
            Integer integer1 = pluginSpec0.getContextMenuDescription();
            return ToolbarIconFactory.INSTANCE.createContextMenuIcon(context0, integer0, integer1);
        }

        @NotNull
        public static List createKeditorItems(@NotNull PluginSpec pluginSpec0, int v) {
            return CollectionsKt__CollectionsKt.emptyList();
        }

        public static List createKeditorItems$default(PluginSpec pluginSpec0, int v, int v1, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createKeditorItems");
            }
            if((v1 & 1) != 0) {
                v = -1;
            }
            return pluginSpec0.createKeditorItems(v);
        }

        @Nullable
        public static Activity findActivity(@NotNull PluginSpec pluginSpec0) {
            return com.kakao.keditor.plugin.itemspec.KeditorBridge.DefaultImpls.findActivity(pluginSpec0);
        }

        @Nullable
        public static KeditorView findKeditorView(@NotNull PluginSpec pluginSpec0) {
            return com.kakao.keditor.plugin.itemspec.KeditorBridge.DefaultImpls.findKeditorView(pluginSpec0);
        }

        @Nullable
        public static ViewHolder getHolder(@NotNull PluginSpec pluginSpec0, @NotNull View view0) {
            Intrinsics.checkNotNullParameter(view0, "view");
            return com.kakao.keditor.plugin.itemspec.KeditorBridge.DefaultImpls.getHolder(pluginSpec0, view0);
        }

        @Nullable
        public static KeditorItem getItem(@NotNull PluginSpec pluginSpec0, int v) {
            return com.kakao.keditor.plugin.itemspec.KeditorBridge.DefaultImpls.getItem(pluginSpec0, v);
        }

        @Nullable
        public static KeditorItem getItem(@NotNull PluginSpec pluginSpec0, @NotNull View view0) {
            Intrinsics.checkNotNullParameter(view0, "view");
            return com.kakao.keditor.plugin.itemspec.KeditorBridge.DefaultImpls.getItem(pluginSpec0, view0);
        }

        @Nullable
        public static Integer getPosition(@NotNull PluginSpec pluginSpec0, @NotNull View view0) {
            Intrinsics.checkNotNullParameter(view0, "view");
            return com.kakao.keditor.plugin.itemspec.KeditorBridge.DefaultImpls.getPosition(pluginSpec0, view0);
        }

        public static boolean hasItemSpec(@NotNull PluginSpec pluginSpec0, @NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "type");
            return com.kakao.keditor.plugin.itemspec.KeditorBridge.DefaultImpls.hasItemSpec(pluginSpec0, s);
        }

        @Nullable
        public static Unit ifFoundItem(@NotNull PluginSpec pluginSpec0, @NotNull View view0, @NotNull Function1 function10) {
            Intrinsics.checkNotNullParameter(view0, "view");
            Intrinsics.checkNotNullParameter(function10, "block");
            return com.kakao.keditor.plugin.itemspec.KeditorBridge.DefaultImpls.ifFoundItem(pluginSpec0, view0, function10);
        }

        @Nullable
        public static Unit ifFoundPosition(@NotNull PluginSpec pluginSpec0, @NotNull View view0, @NotNull Function1 function10) {
            Intrinsics.checkNotNullParameter(view0, "view");
            Intrinsics.checkNotNullParameter(function10, "block");
            return com.kakao.keditor.plugin.itemspec.KeditorBridge.DefaultImpls.ifFoundPosition(pluginSpec0, view0, function10);
        }

        public static int indexOf(@NotNull PluginSpec pluginSpec0, @NotNull KeditorItem keditorItem0) {
            Intrinsics.checkNotNullParameter(keditorItem0, "item");
            return com.kakao.keditor.plugin.itemspec.KeditorBridge.DefaultImpls.indexOf(pluginSpec0, keditorItem0);
        }

        public static void initPluginSpec(@NotNull PluginSpec pluginSpec0, @NotNull Context context0, @NotNull ItemSpecs itemSpecs0) {
            Intrinsics.checkNotNullParameter(context0, "context");
            Intrinsics.checkNotNullParameter(itemSpecs0, "itemSpecs");
            if(pluginSpec0.getItemSpecKeys() == null) {
                throw new Exception("PluginSpec must required itemSpecKeys");
            }
            List list0 = pluginSpec0.getItemSpecKeys();
            Intrinsics.checkNotNull(list0);
            View view0 = null;
            if(!list0.isEmpty()) {
                List list1 = pluginSpec0.getItemSpecKeys();
                Intrinsics.checkNotNull(list1);
                if(!(list1 instanceof Collection) || !list1.isEmpty()) {
                    for(Object object0: list1) {
                        String s = (String)object0;
                        for(Object object1: itemSpecs0.getItemSpecList()) {
                            if(!((RootItemSpec)object1).typeOf(s)) {
                                continue;
                            }
                            goto label_20;
                        }
                        object1 = null;
                    label_20:
                        if(object1 == null) {
                            continue;
                        }
                        goto label_25;
                    }
                }
                List list2 = pluginSpec0.getItemSpecKeys();
                Intrinsics.checkNotNull(list2);
                throw new Exception(a.z(CollectionsKt___CollectionsKt.joinToString$default(list2, null, null, null, 0, null, PluginSpec.initPluginSpec.2.INSTANCE, 0x1F, null), " cannot found in itemSpecs"));
            }
        label_25:
            pluginSpec0.setItemSpecs(itemSpecs0);
            View view1 = pluginSpec0.createIconForContextMenu(context0);
            if(view1 != null) {
                view1.setOnClickListener(new t(pluginSpec0, 4));
                view0 = view1;
            }
            pluginSpec0.setContextMenuIcon(view0);
        }

        private static void initPluginSpec$lambda$3$lambda$2(PluginSpec pluginSpec0, View view0) {
            Intrinsics.checkNotNullParameter(pluginSpec0, "this$0");
            pluginSpec0.runIconClick();
        }

        public static void onRequest(@NotNull PluginSpec pluginSpec0, @NotNull PluginSpecRequest pluginSpecRequest0) {
            Intrinsics.checkNotNullParameter(pluginSpecRequest0, "request");
            com.kakao.keditor.plugin.pluginspec.RequestHandler.DefaultImpls.onRequest(pluginSpec0, pluginSpecRequest0);
        }

        public static int pluginId(@NotNull PluginSpec pluginSpec0, int v) {
            KeditorView keditorView0 = pluginSpec0.findKeditorView();
            return keditorView0 == null ? v : keditorView0.getPluginId(pluginSpec0);
        }

        public static int pluginId$default(PluginSpec pluginSpec0, int v, int v1, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pluginId");
            }
            if((v1 & 1) != 0) {
                v = -1;
            }
            return pluginSpec0.pluginId(v);
        }

        public static void renderEditTextScrollToOffset(@NotNull PluginSpec pluginSpec0, @NotNull KeditorEditText keditorEditText0, int v) {
            Intrinsics.checkNotNullParameter(keditorEditText0, "keItemEdit");
            com.kakao.keditor.plugin.itemspec.KeditorBridge.DefaultImpls.renderEditTextScrollToOffset(pluginSpec0, keditorEditText0, v);
        }

        public static void runIconClick(@NotNull PluginSpec pluginSpec0) {
            AddKeditorItems viewRequest$AddKeditorItems0 = new AddKeditorItems(DefaultImpls.createKeditorItems$default(pluginSpec0, 0, 1, null), 0, false, false, 14, null);
            KeEvent.INSTANCE.postInScope(viewRequest$AddKeditorItems0);
        }

        @NotNull
        public static String type(@NotNull PluginSpec pluginSpec0) {
            return PluginSpecKt.type(pluginSpec0.getClass());
        }

        public static boolean typeOf(@NotNull PluginSpec pluginSpec0, @NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "type");
            return Intrinsics.areEqual(s, PluginSpecKt.type(pluginSpec0.getClass()));
        }
    }

    boolean addToolbarOverlayMenu();

    @Nullable
    View createIconForContextMenu(@NotNull Context arg1);

    @NotNull
    List createKeditorItems(int arg1);

    @Nullable
    Integer getContextMenuDescription();

    @Nullable
    View getContextMenuIcon();

    @Nullable
    Integer getContextMenuResource();

    @Nullable
    List getItemSpecKeys();

    @Nullable
    ItemSpecs getItemSpecs();

    @Nullable
    ToolbarOverlayMenuItem getToolbarOverlayMenuItem();

    void initPluginSpec(@NotNull Context arg1, @NotNull ItemSpecs arg2);

    int pluginId(int arg1);

    void runIconClick();

    void setContextMenuDescription(@Nullable Integer arg1);

    void setContextMenuIcon(@Nullable View arg1);

    void setContextMenuResource(@Nullable Integer arg1);

    void setItemSpecKeys(@Nullable List arg1);

    void setItemSpecs(@Nullable ItemSpecs arg1);

    void setToolbarOverlayMenuItem(@Nullable ToolbarOverlayMenuItem arg1);

    @NotNull
    String type();

    boolean typeOf(@NotNull String arg1);
}

