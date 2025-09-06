package com.kakao.keditor.internal;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.room.a;
import com.kakao.keditor.Keditor;
import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.KeditorState;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.plugin.attrs.item.RepresentativeImageProvider;
import com.kakao.keditor.plugin.itemspec.ItemSpecs;
import com.kakao.keditor.plugin.itemspec.ItemViewHandler.DefaultImpls;
import com.kakao.keditor.plugin.itemspec.RootItemSpec;
import com.kakao.keditor.plugin.itemspec.paragraph.ParagraphItem;
import com.kakao.keditor.plugin.itemspec.paragraph.ParagraphItemKt;
import com.kakao.keditor.standard.IntStandardKt;
import com.kakao.keditor.standard.KeditorStandardKt;
import com.kakao.keditor.standard.ViewStandardKt;
import com.kakao.keditor.util.eventbus.KeEvent;
import com.kakao.keditor.util.eventbus.ViewRequest.AddKeditorItems;
import com.kakao.keditor.util.eventbus.ViewRequest.AdjustItem;
import com.kakao.keditor.util.eventbus.ViewRequest.RequestFocus;
import com.kakao.keditor.util.eventbus.ViewRequest.UpdateRepresentState;
import com.kakao.keditor.util.eventbus.ViewRequest;
import com.kakao.keditor.widget.KeditorEditText;
import com.kakao.keditor.widget.extention.ItemActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.k;
import kotlin.collections.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u000B\u0018\u0000 W2\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001WB1\u0012\u0006\u0010\u0005\u001A\u00020\u0006\u0012\u0006\u0010\u0007\u001A\u00020\b\u0012\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00060\n\u00A2\u0006\u0002\u0010\fJ)\u0010\'\u001A\u00020\u00062\u0006\u0010(\u001A\u00020\u00062\u0012\u0010)\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00020*\"\u00020\u0002H\u0016\u00A2\u0006\u0002\u0010+J%\u0010)\u001A\u00020\u00062\u000E\u0010)\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00020*2\u0006\u0010,\u001A\u00020\u0006H\u0002\u00A2\u0006\u0002\u0010-J\r\u0010.\u001A\u00020/H\u0000\u00A2\u0006\u0002\b0J\u0010\u00101\u001A\u00020/2\u0006\u0010(\u001A\u00020\u0006H\u0016J\b\u00102\u001A\u0004\u0018\u00010!J\b\u00103\u001A\u00020\u0006H\u0016J\u0010\u00104\u001A\u00020\u00062\u0006\u0010(\u001A\u00020\u0006H\u0016J\'\u00105\u001A\u00020\u00062\u0006\u0010(\u001A\u00020\u00062\u0012\u0010)\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00020*\"\u00020\u0002\u00A2\u0006\u0002\u0010+J\u0006\u00106\u001A\u00020\u001BJ\u000E\u00107\u001A\u00020\u00062\u0006\u00108\u001A\u00020\u0006J\u0006\u00109\u001A\u00020\u0006J\u0018\u0010:\u001A\u00020/2\u0006\u0010;\u001A\u00020\u00032\u0006\u0010(\u001A\u00020\u0006H\u0016J\u0018\u0010<\u001A\u00020\u00032\u0006\u0010=\u001A\u00020>2\u0006\u0010?\u001A\u00020\u0006H\u0016J\u0010\u0010@\u001A\u00020/2\u0006\u0010(\u001A\u00020\u0006H\u0016J\b\u0010A\u001A\u00020/H\u0016J\u0018\u0010B\u001A\u00020/2\u0006\u0010C\u001A\u00020\u00062\u0006\u0010D\u001A\u00020\u0006H\u0016J\u000E\u0010E\u001A\u00020/2\u0006\u0010F\u001A\u00020GJ\u0006\u0010H\u001A\u00020/J\u0018\u0010I\u001A\u00020/2\u0006\u0010\u000B\u001A\u00020\u00062\b\b\u0002\u0010J\u001A\u00020\u001BJ$\u0010K\u001A\u00020/2\u0006\u0010(\u001A\u00020\u00062\f\u0010L\u001A\b\u0012\u0004\u0012\u00020\u00020M2\u0006\u0010N\u001A\u00020\u001BJ\u0006\u0010O\u001A\u00020/J\u000E\u0010P\u001A\u00020/2\u0006\u0010Q\u001A\u00020!J\u0018\u0010R\u001A\u00020/2\u0006\u0010(\u001A\u00020\u00062\u0006\u0010S\u001A\u00020\u0002H\u0016J\u0016\u0010T\u001A\u00020/2\u0006\u0010(\u001A\u00020\u00062\u0006\u0010S\u001A\u00020\u0002J\u000E\u0010U\u001A\u00020\u00062\u0006\u0010V\u001A\u00020\u0006R\u0011\u0010\u0005\u001A\u00020\u0006\u00A2\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0017\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00060\n\u00A2\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u0010R\u0011\u0010\u0011\u001A\u00020\u00068F\u00A2\u0006\u0006\u001A\u0004\b\u0012\u0010\u000ER\u0017\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00060\n\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u0010R\u001B\u0010\u0014\u001A\u00020\u00158BX\u0082\u0084\u0002\u00A2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001A\u001A\u00020\u001B8F\u00A2\u0006\u0006\u001A\u0004\b\u001C\u0010\u001DR\u0014\u0010\u001E\u001A\u00020\u00068BX\u0082\u0004\u00A2\u0006\u0006\u001A\u0004\b\u001F\u0010\u000ER\u0010\u0010 \u001A\u0004\u0018\u00010!X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001A\u00020\b\u00A2\u0006\b\n\u0000\u001A\u0004\b\"\u0010#R\u0011\u0010$\u001A\u00020\u00068F\u00A2\u0006\u0006\u001A\u0004\b%\u0010\u000ER\u0010\u0010&\u001A\u0004\u0018\u00010\u0002X\u0082\u000E\u00A2\u0006\u0002\n\u0000\u00A8\u0006X"}, d2 = {"Lcom/kakao/keditor/internal/KeditorAdapter;", "Lcom/kakao/keditor/internal/BaseAdapter;", "Lcom/kakao/keditor/KeditorItem;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/kakao/keditor/widget/extention/ItemActionListener;", "editorId", "", "itemSpecs", "Lcom/kakao/keditor/plugin/itemspec/ItemSpecs;", "editorState", "Lkotlin/Function0;", "focusedPosition", "(ILcom/kakao/keditor/plugin/itemspec/ItemSpecs;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getEditorId", "()I", "getEditorState", "()Lkotlin/jvm/functions/Function0;", "firstItemViewPosition", "getFirstItemViewPosition", "getFocusedPosition", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "handler$delegate", "Lkotlin/Lazy;", "hasHeaderView", "", "getHasHeaderView", "()Z", "headerCount", "getHeaderCount", "headerView", "Landroid/view/View;", "getItemSpecs", "()Lcom/kakao/keditor/plugin/itemspec/ItemSpecs;", "keditorItemCount", "getKeditorItemCount", "savedFocusedItemOnDrag", "add", "position", "addItems", "", "(I[Lcom/kakao/keditor/KeditorItem;)I", "index", "([Lcom/kakao/keditor/KeditorItem;I)I", "adjustItems", "", "adjustItems$keditor_release", "delete", "getHeaderView", "getItemCount", "getItemViewType", "insert", "isEmpty", "itemIndexAt", "viewPosition", "lastItemIndex", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onDragEnd", "onDragStart", "onItemMoved", "from", "to", "onViewRequest", "request", "Lcom/kakao/keditor/util/eventbus/ViewRequest;", "removeHeaderView", "removeItem", "needAdjust", "replaceItem", "items", "", "notify", "resetAllItems", "setHeaderView", "view", "setItem", "item", "setItemWithSkipRendering", "viewPositionAt", "itemIndex", "Companion", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nKeditorAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeditorAdapter.kt\ncom/kakao/keditor/internal/KeditorAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Keditor.kt\ncom/kakao/keditor/Keditor\n*L\n1#1,288:1\n1559#2:289\n1590#2,4:290\n766#2:294\n857#2,2:295\n1855#2,2:297\n141#3,7:299\n*S KotlinDebug\n*F\n+ 1 KeditorAdapter.kt\ncom/kakao/keditor/internal/KeditorAdapter\n*L\n134#1:289\n134#1:290,4\n135#1:294\n135#1:295,2\n137#1:297,2\n150#1:299,7\n*E\n"})
public final class KeditorAdapter extends BaseAdapter implements ItemActionListener {
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000E\u0010\u0003\u001A\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/kakao/keditor/internal/KeditorAdapter$Companion;", "", "()V", "HEADER", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion;
    public static final int HEADER;
    private final int editorId;
    @NotNull
    private final Function0 editorState;
    @NotNull
    private final Function0 focusedPosition;
    @NotNull
    private final Lazy handler$delegate;
    @Nullable
    private View headerView;
    @NotNull
    private final ItemSpecs itemSpecs;
    @Nullable
    private KeditorItem savedFocusedItemOnDrag;

    static {
        KeditorAdapter.Companion = new Companion(null);
    }

    public KeditorAdapter(int v, @NotNull ItemSpecs itemSpecs0, @NotNull Function0 function00, @NotNull Function0 function01) {
        Intrinsics.checkNotNullParameter(itemSpecs0, "itemSpecs");
        Intrinsics.checkNotNullParameter(function00, "editorState");
        Intrinsics.checkNotNullParameter(function01, "focusedPosition");
        super();
        this.editorId = v;
        this.itemSpecs = itemSpecs0;
        this.editorState = function00;
        this.focusedPosition = function01;
        this.handler$delegate = c.lazy(com.kakao.keditor.internal.KeditorAdapter.handler.2.INSTANCE);

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001A\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/os/Handler;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 0x30)
        final class com.kakao.keditor.internal.KeditorAdapter.handler.2 extends Lambda implements Function0 {
            public static final com.kakao.keditor.internal.KeditorAdapter.handler.2 INSTANCE;

            static {
                com.kakao.keditor.internal.KeditorAdapter.handler.2.INSTANCE = new com.kakao.keditor.internal.KeditorAdapter.handler.2();
            }

            public com.kakao.keditor.internal.KeditorAdapter.handler.2() {
                super(0);
            }

            @NotNull
            public final Handler invoke() {
                return new Handler(Keditor.INSTANCE.getContext().getMainLooper());
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        }

    }

    public int add(int v, @NotNull KeditorItem[] arr_keditorItem) {
        Intrinsics.checkNotNullParameter(arr_keditorItem, "addItems");
        int v1 = kotlin.ranges.c.coerceAtMost(v, this.getItems().size());
        return v1 >= 0 ? this.addItems(arr_keditorItem, v1 + 1) : this.addItems(arr_keditorItem, this.getItems().size());
    }

    @Override  // com.kakao.keditor.internal.BaseAdapter
    public int add(int v, Object[] arr_object) {
        return this.add(v, ((KeditorItem[])arr_object));
    }

    private final int addItems(KeditorItem[] arr_keditorItem, int v) {
        if(arr_keditorItem.length == 1) {
            this.getItems().add(kotlin.ranges.c.coerceIn(v, 0, this.getItems().size()), arr_keditorItem[0]);
            this.notifyItemInserted(this.viewPositionAt(v));
            return v;
        }
        if(arr_keditorItem.length > 1) {
            this.getItems().addAll(kotlin.ranges.c.coerceIn(v, 0, this.getItems().size()), ArraysKt___ArraysKt.toList(arr_keditorItem));
            this.notifyDataSetChanged();
            return v;
        }
        return kotlin.ranges.c.coerceAtMost(0, this.getItems().size() - 1);
    }

    public final void adjustItems$keditor_release() {
        Boolean boolean1;
        Keditor keditor0 = Keditor.INSTANCE;
        Integer integer0 = this.editorId;
        Boolean boolean0 = Boolean.TRUE;
        Object object0 = null;
        if(KeditorStandardKt.getOr(keditor0.getLocalConfigs(), integer0, null) == null || !((Map)a.g(keditor0, integer0)).containsKey("automatic_paragraph_merge_enabled")) {
            Object object2 = keditor0.getConfig().get("automatic_paragraph_merge_enabled");
            if(object2 instanceof Boolean) {
                object0 = object2;
            }
        }
        else {
            Object object1 = ((Map)a.g(keditor0, integer0)).get("automatic_paragraph_merge_enabled");
            if(object1 instanceof Boolean) {
                object0 = object1;
            }
        }
        boolean1 = (Boolean)object0;
        if(boolean1 != null) {
            boolean0 = boolean1;
        }
        if(Intrinsics.areEqual(boolean0, Boolean.FALSE)) {
            return;
        }
        int v = 0;
        while(v < CollectionsKt__CollectionsKt.getLastIndex(this.getItems())) {
            KeditorItem keditorItem0 = (KeditorItem)this.get(v);
            KeditorItem keditorItem1 = (KeditorItem)this.get(v + 1);
            if(keditorItem0 instanceof ParagraphItem && keditorItem1 instanceof ParagraphItem && !((ParagraphItem)keditorItem0).isParagraphHeadType() && !((ParagraphItem)keditorItem1).isParagraphHeadType() && ((ParagraphItem)keditorItem0).getParagraphStyle() == ((ParagraphItem)keditorItem1).getParagraphStyle() && Intrinsics.areEqual(((ParagraphItem)keditorItem0).getAlignment(), ((ParagraphItem)keditorItem1).getAlignment())) {
                ParagraphItemKt.merge(((ParagraphItem)keditorItem0), ((ParagraphItem)keditorItem1));
                this.delete(keditorItem1);
                this.notifyItemChanged(this.viewPositionAt(v));
            }
            else {
                ++v;
            }
        }
    }

    @Override  // com.kakao.keditor.internal.BaseAdapter
    public void delete(int v) {
        this.getItems().remove(v);
        this.notifyItemRemoved(this.viewPositionAt(v));
        if(this.getItems().isEmpty()) {
            AddKeditorItems viewRequest$AddKeditorItems0 = new AddKeditorItems(k.listOf(com.kakao.keditor.plugin.itemspec.paragraph.ParagraphItem.Companion.newInstance$default(ParagraphItem.Companion, true, false, 2, null)), 0, false, false, 14, null);
            KeEvent.INSTANCE.postInScope(viewRequest$AddKeditorItems0);
        }
    }

    public final int getEditorId() {
        return this.editorId;
    }

    @NotNull
    public final Function0 getEditorState() {
        return this.editorState;
    }

    public final int getFirstItemViewPosition() {
        return this.getHeaderCount();
    }

    @NotNull
    public final Function0 getFocusedPosition() {
        return this.focusedPosition;
    }

    private final Handler getHandler() {
        return (Handler)this.handler$delegate.getValue();
    }

    public final boolean getHasHeaderView() {
        return this.headerView != null;
    }

    private final int getHeaderCount() {
        return this.headerView == null ? 0 : 1;
    }

    @Nullable
    public final View getHeaderView() {
        return this.headerView;
    }

    @Override  // com.kakao.keditor.internal.BaseAdapter
    public int getItemCount() {
        return super.getItemCount() + this.getHeaderCount();
    }

    @NotNull
    public final ItemSpecs getItemSpecs() {
        return this.itemSpecs;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemViewType(int v) {
        if(this.getHasHeaderView() && v == 0) {
            return 0;
        }
        String s = ((KeditorItem)this.getItems().get(this.itemIndexAt(v))).getType();
        return this.itemSpecs.indexByType(s) + this.getHeaderCount();
    }

    public final int getKeditorItemCount() {
        return this.getItems().size();
    }

    public final int insert(int v, @NotNull KeditorItem[] arr_keditorItem) {
        Intrinsics.checkNotNullParameter(arr_keditorItem, "addItems");
        int v1 = kotlin.ranges.c.coerceAtMost(v, this.getItems().size());
        if(v1 < 0) {
            v1 = this.getItems().size();
        }
        return this.addItems(arr_keditorItem, v1);
    }

    public final boolean isEmpty() {
        return this.getItems().isEmpty();
    }

    public final int itemIndexAt(int v) {
        return Math.max(v - this.getHeaderCount(), -1);
    }

    public final int lastItemIndex() {
        return CollectionsKt__CollectionsKt.getLastIndex(this.getItems());
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(@NotNull ViewHolder recyclerView$ViewHolder0, int v) {
        Intrinsics.checkNotNullParameter(recyclerView$ViewHolder0, "holder");
        if(!this.getHasHeaderView() || this.getItemViewType(v) != 0) {
            int v1 = this.itemIndexAt(v);
            KeditorItem keditorItem0 = (KeditorItem)this.getItems().get(v1);
            String s = keditorItem0.getType();
            RootItemSpec rootItemSpec0 = this.itemSpecs.byType(s);
            Intrinsics.checkNotNullExpressionValue(recyclerView$ViewHolder0.itemView, "itemView");
            KeditorState keditorState0 = new KeditorState(((Number)this.editorState.invoke()).intValue(), this.getItemCount() - this.getHeaderCount(), ((Number)this.focusedPosition.invoke()).intValue());
            rootItemSpec0.onItemBound(recyclerView$ViewHolder0.itemView, keditorItem0, v1, keditorState0);
            boolean z = IntStandardKt.containsFlag(((Number)this.editorState.invoke()).intValue(), 2);
            boolean z1 = IntStandardKt.containsFlag(((Number)this.editorState.invoke()).intValue(), 4);
            if(z) {
                Intrinsics.checkNotNullExpressionValue(recyclerView$ViewHolder0.itemView, "itemView");
                ViewStandardKt.disableWithChild(recyclerView$ViewHolder0.itemView);
            }
            else if(z1) {
                Intrinsics.checkNotNullExpressionValue(recyclerView$ViewHolder0.itemView, "itemView");
                ViewStandardKt.disableFocusableWithChild(recyclerView$ViewHolder0.itemView);
            }
            if(z || z1) {
                Intrinsics.checkNotNullExpressionValue(recyclerView$ViewHolder0.itemView, "itemView");
                ViewStandardKt.findAllKeditorEditText$default(recyclerView$ViewHolder0.itemView, null, com.kakao.keditor.internal.KeditorAdapter.onBindViewHolder.1.1.INSTANCE, 1, null);
            }
        }

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/kakao/keditor/widget/KeditorEditText;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 0x30)
        final class com.kakao.keditor.internal.KeditorAdapter.onBindViewHolder.1.1 extends Lambda implements Function1 {
            public static final com.kakao.keditor.internal.KeditorAdapter.onBindViewHolder.1.1 INSTANCE;

            static {
                com.kakao.keditor.internal.KeditorAdapter.onBindViewHolder.1.1.INSTANCE = new com.kakao.keditor.internal.KeditorAdapter.onBindViewHolder.1.1();
            }

            public com.kakao.keditor.internal.KeditorAdapter.onBindViewHolder.1.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((KeditorEditText)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull KeditorEditText keditorEditText0) {
                Intrinsics.checkNotNullParameter(keditorEditText0, "it");
                keditorEditText0.enableClickableSpans();
            }
        }

    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup0, int v) {
        Intrinsics.checkNotNullParameter(viewGroup0, "parent");
        if(this.getHasHeaderView() && v == 0) {
            View view0 = this.headerView == null ? LayoutInflater.from(viewGroup0.getContext()).inflate(layout.ke_sample_header, viewGroup0, false) : this.headerView;
            Intrinsics.checkNotNull(view0);
            return new HeaderViewHolder(view0);
        }
        int v1 = this.getHeaderCount();
        return new KeditorViewHolder(DefaultImpls.onViewCreated$default(this.itemSpecs.byIndex(v - v1), viewGroup0, null, 2, null));
    }

    @Override  // com.kakao.keditor.widget.extention.ItemActionListener
    public void onDragEnd(int v) {
        KeEvent keEvent0 = KeEvent.INSTANCE;
        keEvent0.postInScope(new RequestFocus(this.itemIndexAt(v), false, 2, null));
        int v1 = CollectionsKt___CollectionsKt.indexOf(this.getItems(), this.savedFocusedItemOnDrag);
        if(v1 >= 0) {
            this.notifyItemChanged(this.viewPositionAt(v1));
        }
        this.savedFocusedItemOnDrag = null;
        keEvent0.postInScope(AdjustItem.INSTANCE);
    }

    @Override  // com.kakao.keditor.widget.extention.ItemActionListener
    public void onDragStart() {
        this.savedFocusedItemOnDrag = (KeditorItem)CollectionsKt___CollectionsKt.getOrNull(this.getItems(), ((Number)this.focusedPosition.invoke()).intValue());
    }

    @Override  // com.kakao.keditor.widget.extention.ItemActionListener
    public void onItemMoved(int v, int v1) {
        if(this.getHasHeaderView() && this.getItemViewType(v1) == 0) {
            return;
        }
        if(v == v1) {
            return;
        }
        this.getItems().add(this.itemIndexAt(v1), ((KeditorItem)this.getItems().remove(this.itemIndexAt(v))));
        this.notifyItemMoved(v, v1);
    }

    public final void onViewRequest(@NotNull ViewRequest viewRequest0) {
        Intrinsics.checkNotNullParameter(viewRequest0, "request");
        if(viewRequest0 instanceof UpdateRepresentState && ((UpdateRepresentState)viewRequest0).isSet()) {
            Iterable iterable0 = this.getItems();
            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
            int v = 0;
            for(Object object0: iterable0) {
                if(v < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                arrayList0.add(new Pair(v, ((KeditorItem)object0)));
                ++v;
            }
            ArrayList arrayList1 = new ArrayList();
            for(Object object1: arrayList0) {
                Object object2 = ((Pair)object1).getSecond();
                RepresentativeImageProvider representativeImageProvider0 = object2 instanceof RepresentativeImageProvider ? ((RepresentativeImageProvider)object2) : null;
                if((representativeImageProvider0 == null ? false : representativeImageProvider0.containsRepresentativeImage())) {
                    arrayList1.add(object1);
                }
            }
            for(Object object3: arrayList1) {
                int v1 = ((Number)((Pair)object3).getFirst()).intValue();
                if(v1 != ((UpdateRepresentState)viewRequest0).getPosition()) {
                    UpdateRepresentState viewRequest$UpdateRepresentState0 = new UpdateRepresentState(v1, false, null, 4, null);
                    KeEvent.INSTANCE.postInScope(viewRequest$UpdateRepresentState0);
                }
            }
        }
    }

    public final void removeHeaderView() {
        this.headerView = null;
    }

    public final void removeItem(int v, boolean z) {
        if(!this.isValidIndex(v)) {
            return;
        }
        this.delete(v);
        if(z) {
            this.adjustItems$keditor_release();
        }
    }

    public static void removeItem$default(KeditorAdapter keditorAdapter0, int v, boolean z, int v1, Object object0) {
        if((v1 & 2) != 0) {
            z = true;
        }
        keditorAdapter0.removeItem(v, z);
    }

    public final void replaceItem(int v, @NotNull List list0, boolean z) {
        Intrinsics.checkNotNullParameter(list0, "items");
        if(this.isValidIndex(v)) {
            if(z) {
                if(list0.size() == 1) {
                    this.setItem(v, ((KeditorItem)list0.get(0)));
                }
                else {
                    this.getItems().remove(v);
                    this.getItems().addAll(v, list0);
                    this.notifyDataSetChanged();
                }
                this.adjustItems$keditor_release();
                return;
            }
            if(list0.size() == 1) {
                this.setItemWithSkipRendering(v, ((KeditorItem)list0.get(0)));
                return;
            }
            this.getItems().remove(v);
            this.getItems().addAll(v, list0);
        }
    }

    public final void resetAllItems() {
        this.setItems(k.listOf(com.kakao.keditor.plugin.itemspec.paragraph.ParagraphItem.Companion.newInstance$default(ParagraphItem.Companion, true, false, 2, null)));
    }

    public final void setHeaderView(@NotNull View view0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        this.headerView = view0;
    }

    public void setItem(int v, @NotNull KeditorItem keditorItem0) {
        Intrinsics.checkNotNullParameter(keditorItem0, "item");
        this.getItems().set(v, keditorItem0);
        this.notifyItemChanged(this.viewPositionAt(v));
    }

    @Override  // com.kakao.keditor.internal.BaseAdapter
    public void setItem(int v, Object object0) {
        this.setItem(v, ((KeditorItem)object0));
    }

    public final void setItemWithSkipRendering(int v, @NotNull KeditorItem keditorItem0) {
        Intrinsics.checkNotNullParameter(keditorItem0, "item");
        this.getItems().set(v, keditorItem0);
    }

    public final int viewPositionAt(int v) {
        return v + this.getHeaderCount();
    }
}

