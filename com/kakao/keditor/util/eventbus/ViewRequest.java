package com.kakao.keditor.util.eventbus;

import a5.b;
import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.plugin.attrs.Alignment;
import com.kakao.keditor.plugin.itemspec.paragraph.TextItem;
import com.kakao.keditor.request.KeditorRequest;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0016\u0018\u00002\u00020\u0001:\u0012\u0003\u0004\u0005\u0006\u0007\b\t\n\u000B\f\r\u000E\u000F\u0010\u0011\u0012\u0013\u0014B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0015"}, d2 = {"Lcom/kakao/keditor/util/eventbus/ViewRequest;", "Lcom/kakao/keditor/request/KeditorRequest;", "()V", "AddKeditorItems", "AdjustItem", "EditorSortRequest", "GetFocusedItem", "InsertKeditorItem", "MergeText", "RefreshAll", "RefreshFocus", "RefreshPosition", "RemoveFocusItem", "RemoveItem", "ReplaceItems", "RequestFocus", "RequestFocusToFirstTextItem", "ResetAllItems", "ScrollTo", "ScrollToSpecificTextIndex", "UpdateRepresentState", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public class ViewRequest implements KeditorRequest {
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001A\u00020\b\u0012\b\b\u0002\u0010\t\u001A\u00020\b¢\u0006\u0002\u0010\nJ\u000F\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0013\u001A\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001A\u00020\bHÆ\u0003J\t\u0010\u0015\u001A\u00020\bHÆ\u0003J7\u0010\u0016\u001A\u00020\u00002\u000E\b\u0002\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00062\b\b\u0002\u0010\u0007\u001A\u00020\b2\b\b\u0002\u0010\t\u001A\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001A\u00020\b2\b\u0010\u0018\u001A\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001A\u001A\u00020\u0006HÖ\u0001J\t\u0010\u001B\u001A\u00020\u001CHÖ\u0001R\u0011\u0010\u0007\u001A\u00020\b¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0017\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0011\u0010\t\u001A\u00020\b¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\fR\u0011\u0010\u0005\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u0011¨\u0006\u001D"}, d2 = {"Lcom/kakao/keditor/util/eventbus/ViewRequest$AddKeditorItems;", "Lcom/kakao/keditor/util/eventbus/ViewRequest;", "items", "", "Lcom/kakao/keditor/KeditorItem;", "position", "", "focusOnNextParagraph", "", "needScroll", "(Ljava/util/List;IZZ)V", "getFocusOnNextParagraph", "()Z", "getItems", "()Ljava/util/List;", "getNeedScroll", "getPosition", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class AddKeditorItems extends ViewRequest {
        private final boolean focusOnNextParagraph;
        @NotNull
        private final List items;
        private final boolean needScroll;
        private final int position;

        public AddKeditorItems(@NotNull List list0, int v, boolean z, boolean z1) {
            Intrinsics.checkNotNullParameter(list0, "items");
            super();
            this.items = list0;
            this.position = v;
            this.focusOnNextParagraph = z;
            this.needScroll = z1;
        }

        public AddKeditorItems(List list0, int v, boolean z, boolean z1, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v1 & 2) != 0) {
                v = -1;
            }
            if((v1 & 4) != 0) {
                z = true;
            }
            if((v1 & 8) != 0) {
                z1 = false;
            }
            this(list0, v, z, z1);
        }

        @NotNull
        public final List component1() {
            return this.items;
        }

        public final int component2() {
            return this.position;
        }

        public final boolean component3() {
            return this.focusOnNextParagraph;
        }

        public final boolean component4() {
            return this.needScroll;
        }

        @NotNull
        public final AddKeditorItems copy(@NotNull List list0, int v, boolean z, boolean z1) {
            Intrinsics.checkNotNullParameter(list0, "items");
            return new AddKeditorItems(list0, v, z, z1);
        }

        public static AddKeditorItems copy$default(AddKeditorItems viewRequest$AddKeditorItems0, List list0, int v, boolean z, boolean z1, int v1, Object object0) {
            if((v1 & 1) != 0) {
                list0 = viewRequest$AddKeditorItems0.items;
            }
            if((v1 & 2) != 0) {
                v = viewRequest$AddKeditorItems0.position;
            }
            if((v1 & 4) != 0) {
                z = viewRequest$AddKeditorItems0.focusOnNextParagraph;
            }
            if((v1 & 8) != 0) {
                z1 = viewRequest$AddKeditorItems0.needScroll;
            }
            return viewRequest$AddKeditorItems0.copy(list0, v, z, z1);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof AddKeditorItems)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.items, ((AddKeditorItems)object0).items)) {
                return false;
            }
            if(this.position != ((AddKeditorItems)object0).position) {
                return false;
            }
            return this.focusOnNextParagraph == ((AddKeditorItems)object0).focusOnNextParagraph ? this.needScroll == ((AddKeditorItems)object0).needScroll : false;
        }

        public final boolean getFocusOnNextParagraph() {
            return this.focusOnNextParagraph;
        }

        @NotNull
        public final List getItems() {
            return this.items;
        }

        public final boolean getNeedScroll() {
            return this.needScroll;
        }

        public final int getPosition() {
            return this.position;
        }

        @Override
        public int hashCode() {
            return Boolean.hashCode(this.needScroll) + a.e(a.c(this.position, this.items.hashCode() * 0x1F, 0x1F), 0x1F, this.focusOnNextParagraph);
        }

        @Override
        @NotNull
        public String toString() {
            return "AddKeditorItems(items=" + this.items + ", position=" + this.position + ", focusOnNextParagraph=" + this.focusOnNextParagraph + ", needScroll=" + this.needScroll + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/kakao/keditor/util/eventbus/ViewRequest$AdjustItem;", "Lcom/kakao/keditor/util/eventbus/ViewRequest;", "()V", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class AdjustItem extends ViewRequest {
        @NotNull
        public static final AdjustItem INSTANCE;

        static {
            AdjustItem.INSTANCE = new AdjustItem();
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001A\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001A\u00020\n2\b\u0010\u000B\u001A\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001A\u00020\u000EHÖ\u0001J\t\u0010\u000F\u001A\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/kakao/keditor/util/eventbus/ViewRequest$EditorSortRequest;", "Lcom/kakao/keditor/util/eventbus/ViewRequest;", "alignment", "Lcom/kakao/keditor/plugin/attrs/Alignment;", "(Lcom/kakao/keditor/plugin/attrs/Alignment;)V", "getAlignment", "()Lcom/kakao/keditor/plugin/attrs/Alignment;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class EditorSortRequest extends ViewRequest {
        @NotNull
        private final Alignment alignment;

        public EditorSortRequest(@NotNull Alignment alignment0) {
            Intrinsics.checkNotNullParameter(alignment0, "alignment");
            super();
            this.alignment = alignment0;
        }

        @NotNull
        public final Alignment component1() {
            return this.alignment;
        }

        @NotNull
        public final EditorSortRequest copy(@NotNull Alignment alignment0) {
            Intrinsics.checkNotNullParameter(alignment0, "alignment");
            return new EditorSortRequest(alignment0);
        }

        public static EditorSortRequest copy$default(EditorSortRequest viewRequest$EditorSortRequest0, Alignment alignment0, int v, Object object0) {
            if((v & 1) != 0) {
                alignment0 = viewRequest$EditorSortRequest0.alignment;
            }
            return viewRequest$EditorSortRequest0.copy(alignment0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof EditorSortRequest ? Intrinsics.areEqual(this.alignment, ((EditorSortRequest)object0).alignment) : false;
        }

        @NotNull
        public final Alignment getAlignment() {
            return this.alignment;
        }

        @Override
        public int hashCode() {
            return this.alignment.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "EditorSortRequest(alignment=" + this.alignment + ")";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001B\u0012\u0014\u0010\u0002\u001A\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0017\u0010\t\u001A\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J!\u0010\n\u001A\u00020\u00002\u0016\b\u0002\u0010\u0002\u001A\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0013\u0010\u000B\u001A\u00020\f2\b\u0010\r\u001A\u0004\u0018\u00010\u000EHÖ\u0003J\t\u0010\u000F\u001A\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001A\u00020\u0012HÖ\u0001R\u001F\u0010\u0002\u001A\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/kakao/keditor/util/eventbus/ViewRequest$GetFocusedItem;", "Lcom/kakao/keditor/util/eventbus/ViewRequest;", "doWithItem", "Lkotlin/Function1;", "Lcom/kakao/keditor/KeditorItem;", "", "(Lkotlin/jvm/functions/Function1;)V", "getDoWithItem", "()Lkotlin/jvm/functions/Function1;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class GetFocusedItem extends ViewRequest {
        @NotNull
        private final Function1 doWithItem;

        public GetFocusedItem(@NotNull Function1 function10) {
            Intrinsics.checkNotNullParameter(function10, "doWithItem");
            super();
            this.doWithItem = function10;
        }

        @NotNull
        public final Function1 component1() {
            return this.doWithItem;
        }

        @NotNull
        public final GetFocusedItem copy(@NotNull Function1 function10) {
            Intrinsics.checkNotNullParameter(function10, "doWithItem");
            return new GetFocusedItem(function10);
        }

        public static GetFocusedItem copy$default(GetFocusedItem viewRequest$GetFocusedItem0, Function1 function10, int v, Object object0) {
            if((v & 1) != 0) {
                function10 = viewRequest$GetFocusedItem0.doWithItem;
            }
            return viewRequest$GetFocusedItem0.copy(function10);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof GetFocusedItem ? Intrinsics.areEqual(this.doWithItem, ((GetFocusedItem)object0).doWithItem) : false;
        }

        @NotNull
        public final Function1 getDoWithItem() {
            return this.doWithItem;
        }

        @Override
        public int hashCode() {
            return this.doWithItem.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "GetFocusedItem(doWithItem=" + this.doWithItem + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001A\u00020\u0007HÆ\u0003J\'\u0010\u0012\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001A\u00020\u00072\b\u0010\u0014\u001A\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001A\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001A\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000E¨\u0006\u0019"}, d2 = {"Lcom/kakao/keditor/util/eventbus/ViewRequest$InsertKeditorItem;", "Lcom/kakao/keditor/util/eventbus/ViewRequest;", "item", "Lcom/kakao/keditor/KeditorItem;", "position", "", "skipScroll", "", "(Lcom/kakao/keditor/KeditorItem;IZ)V", "getItem", "()Lcom/kakao/keditor/KeditorItem;", "getPosition", "()I", "getSkipScroll", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class InsertKeditorItem extends ViewRequest {
        @NotNull
        private final KeditorItem item;
        private final int position;
        private final boolean skipScroll;

        public InsertKeditorItem(@NotNull KeditorItem keditorItem0, int v, boolean z) {
            Intrinsics.checkNotNullParameter(keditorItem0, "item");
            super();
            this.item = keditorItem0;
            this.position = v;
            this.skipScroll = z;
        }

        public InsertKeditorItem(KeditorItem keditorItem0, int v, boolean z, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v1 & 2) != 0) {
                v = -1;
            }
            if((v1 & 4) != 0) {
                z = false;
            }
            this(keditorItem0, v, z);
        }

        @NotNull
        public final KeditorItem component1() {
            return this.item;
        }

        public final int component2() {
            return this.position;
        }

        public final boolean component3() {
            return this.skipScroll;
        }

        @NotNull
        public final InsertKeditorItem copy(@NotNull KeditorItem keditorItem0, int v, boolean z) {
            Intrinsics.checkNotNullParameter(keditorItem0, "item");
            return new InsertKeditorItem(keditorItem0, v, z);
        }

        public static InsertKeditorItem copy$default(InsertKeditorItem viewRequest$InsertKeditorItem0, KeditorItem keditorItem0, int v, boolean z, int v1, Object object0) {
            if((v1 & 1) != 0) {
                keditorItem0 = viewRequest$InsertKeditorItem0.item;
            }
            if((v1 & 2) != 0) {
                v = viewRequest$InsertKeditorItem0.position;
            }
            if((v1 & 4) != 0) {
                z = viewRequest$InsertKeditorItem0.skipScroll;
            }
            return viewRequest$InsertKeditorItem0.copy(keditorItem0, v, z);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof InsertKeditorItem)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.item, ((InsertKeditorItem)object0).item)) {
                return false;
            }
            return this.position == ((InsertKeditorItem)object0).position ? this.skipScroll == ((InsertKeditorItem)object0).skipScroll : false;
        }

        @NotNull
        public final KeditorItem getItem() {
            return this.item;
        }

        public final int getPosition() {
            return this.position;
        }

        public final boolean getSkipScroll() {
            return this.skipScroll;
        }

        @Override
        public int hashCode() {
            return Boolean.hashCode(this.skipScroll) + a.c(this.position, this.item.hashCode() * 0x1F, 0x1F);
        }

        @Override
        @NotNull
        public String toString() {
            return "InsertKeditorItem(item=" + this.item + ", position=" + this.position + ", skipScroll=" + this.skipScroll + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\f\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000E\u001A\u00020\u0005HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\'\u0010\u0010\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001A\u00020\u00122\b\u0010\u0013\u001A\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001A\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001A\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/kakao/keditor/util/eventbus/ViewRequest$MergeText;", "Lcom/kakao/keditor/util/eventbus/ViewRequest;", "from", "", "text", "", "to", "(ILjava/lang/CharSequence;I)V", "getFrom", "()I", "getText", "()Ljava/lang/CharSequence;", "getTo", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class MergeText extends ViewRequest {
        private final int from;
        @NotNull
        private final CharSequence text;
        private final int to;

        public MergeText(int v, @NotNull CharSequence charSequence0, int v1) {
            Intrinsics.checkNotNullParameter(charSequence0, "text");
            super();
            this.from = v;
            this.text = charSequence0;
            this.to = v1;
        }

        public final int component1() {
            return this.from;
        }

        @NotNull
        public final CharSequence component2() {
            return this.text;
        }

        public final int component3() {
            return this.to;
        }

        @NotNull
        public final MergeText copy(int v, @NotNull CharSequence charSequence0, int v1) {
            Intrinsics.checkNotNullParameter(charSequence0, "text");
            return new MergeText(v, charSequence0, v1);
        }

        public static MergeText copy$default(MergeText viewRequest$MergeText0, int v, CharSequence charSequence0, int v1, int v2, Object object0) {
            if((v2 & 1) != 0) {
                v = viewRequest$MergeText0.from;
            }
            if((v2 & 2) != 0) {
                charSequence0 = viewRequest$MergeText0.text;
            }
            if((v2 & 4) != 0) {
                v1 = viewRequest$MergeText0.to;
            }
            return viewRequest$MergeText0.copy(v, charSequence0, v1);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof MergeText)) {
                return false;
            }
            if(this.from != ((MergeText)object0).from) {
                return false;
            }
            return Intrinsics.areEqual(this.text, ((MergeText)object0).text) ? this.to == ((MergeText)object0).to : false;
        }

        public final int getFrom() {
            return this.from;
        }

        @NotNull
        public final CharSequence getText() {
            return this.text;
        }

        public final int getTo() {
            return this.to;
        }

        @Override
        public int hashCode() {
            return this.to + (this.text.hashCode() + this.from * 0x1F) * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("MergeText(from=");
            stringBuilder0.append(this.from);
            stringBuilder0.append(", text=");
            stringBuilder0.append(this.text);
            stringBuilder0.append(", to=");
            return wb.a.c(this.to, ")", stringBuilder0);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001A\u00020\u00042\b\u0010\u0005\u001A\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001A\u00020\bHÖ\u0001J\t\u0010\t\u001A\u00020\nHÖ\u0001¨\u0006\u000B"}, d2 = {"Lcom/kakao/keditor/util/eventbus/ViewRequest$RefreshAll;", "Lcom/kakao/keditor/util/eventbus/ViewRequest;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class RefreshAll extends ViewRequest {
        @NotNull
        public static final RefreshAll INSTANCE;

        static {
            RefreshAll.INSTANCE = new RefreshAll();
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof RefreshAll;
        }

        @Override
        public int hashCode() {
            return 0xA9C03414;
        }

        @Override
        @NotNull
        public String toString() {
            return "RefreshAll";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/kakao/keditor/util/eventbus/ViewRequest$RefreshFocus;", "Lcom/kakao/keditor/util/eventbus/ViewRequest;", "()V", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class RefreshFocus extends ViewRequest {
        @NotNull
        public static final RefreshFocus INSTANCE;

        static {
            RefreshFocus.INSTANCE = new RefreshFocus();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000F\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001A\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001A\u00020\n2\b\u0010\u000B\u001A\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001A\u00020\u0003HÖ\u0001J\t\u0010\u000E\u001A\u00020\u000FHÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/kakao/keditor/util/eventbus/ViewRequest$RefreshPosition;", "Lcom/kakao/keditor/util/eventbus/ViewRequest;", "position", "", "(I)V", "getPosition", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class RefreshPosition extends ViewRequest {
        private final int position;

        public RefreshPosition() {
            this(0, 1, null);
        }

        public RefreshPosition(int v) {
            this.position = v;
        }

        public RefreshPosition(int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v1 & 1) != 0) {
                v = -1;
            }
            this(v);
        }

        public final int component1() {
            return this.position;
        }

        @NotNull
        public final RefreshPosition copy(int v) {
            return new RefreshPosition(v);
        }

        public static RefreshPosition copy$default(RefreshPosition viewRequest$RefreshPosition0, int v, int v1, Object object0) {
            if((v1 & 1) != 0) {
                v = viewRequest$RefreshPosition0.position;
            }
            return viewRequest$RefreshPosition0.copy(v);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof RefreshPosition ? this.position == ((RefreshPosition)object0).position : false;
        }

        public final int getPosition() {
            return this.position;
        }

        @Override
        public int hashCode() {
            return this.position;
        }

        @Override
        @NotNull
        public String toString() {
            return "RefreshPosition(position=" + this.position + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/kakao/keditor/util/eventbus/ViewRequest$RemoveFocusItem;", "Lcom/kakao/keditor/util/eventbus/ViewRequest;", "()V", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class RemoveFocusItem extends ViewRequest {
        @NotNull
        public static final RemoveFocusItem INSTANCE;

        static {
            RemoveFocusItem.INSTANCE = new RemoveFocusItem();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000B\u001A\u00020\u0003HÆ\u0003J\t\u0010\f\u001A\u00020\u0005HÆ\u0003J\u001D\u0010\r\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0005HÆ\u0001J\u0013\u0010\u000E\u001A\u00020\u00052\b\u0010\u000F\u001A\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001A\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/kakao/keditor/util/eventbus/ViewRequest$RemoveItem;", "Lcom/kakao/keditor/util/eventbus/ViewRequest;", "position", "", "ignoreAdjust", "", "(IZ)V", "getIgnoreAdjust", "()Z", "getPosition", "()I", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class RemoveItem extends ViewRequest {
        private final boolean ignoreAdjust;
        private final int position;

        public RemoveItem(int v, boolean z) {
            this.position = v;
            this.ignoreAdjust = z;
        }

        public RemoveItem(int v, boolean z, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v1 & 2) != 0) {
                z = false;
            }
            this(v, z);
        }

        public final int component1() {
            return this.position;
        }

        public final boolean component2() {
            return this.ignoreAdjust;
        }

        @NotNull
        public final RemoveItem copy(int v, boolean z) {
            return new RemoveItem(v, z);
        }

        public static RemoveItem copy$default(RemoveItem viewRequest$RemoveItem0, int v, boolean z, int v1, Object object0) {
            if((v1 & 1) != 0) {
                v = viewRequest$RemoveItem0.position;
            }
            if((v1 & 2) != 0) {
                z = viewRequest$RemoveItem0.ignoreAdjust;
            }
            return viewRequest$RemoveItem0.copy(v, z);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof RemoveItem)) {
                return false;
            }
            return this.position == ((RemoveItem)object0).position ? this.ignoreAdjust == ((RemoveItem)object0).ignoreAdjust : false;
        }

        public final boolean getIgnoreAdjust() {
            return this.ignoreAdjust;
        }

        public final int getPosition() {
            return this.position;
        }

        @Override
        public int hashCode() {
            return Boolean.hashCode(this.ignoreAdjust) + this.position * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "RemoveItem(position=" + this.position + ", ignoreAdjust=" + this.ignoreAdjust + ")";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u000F\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0003\u0012\b\b\u0002\u0010\b\u001A\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001A\u00020\u0003HÆ\u0003J\u000F\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0014\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001A\u00020\tHÆ\u0003J7\u0010\u0016\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\u000E\b\u0002\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00032\b\b\u0002\u0010\b\u001A\u00020\tHÆ\u0001J\u0013\u0010\u0017\u001A\u00020\t2\b\u0010\u0018\u001A\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001A\u001A\u00020\u0003HÖ\u0001J\t\u0010\u001B\u001A\u00020\u001CHÖ\u0001R\u0017\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\b\u001A\u00020\t¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u0010R\u0011\u0010\u0007\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u0010¨\u0006\u001D"}, d2 = {"Lcom/kakao/keditor/util/eventbus/ViewRequest$ReplaceItems;", "Lcom/kakao/keditor/util/eventbus/ViewRequest;", "position", "", "items", "", "Lcom/kakao/keditor/KeditorItem;", "toPosition", "notify", "", "(ILjava/util/List;IZ)V", "getItems", "()Ljava/util/List;", "getNotify", "()Z", "getPosition", "()I", "getToPosition", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ReplaceItems extends ViewRequest {
        @NotNull
        private final List items;
        private final boolean notify;
        private final int position;
        private final int toPosition;

        public ReplaceItems(int v, @NotNull List list0, int v1, boolean z) {
            Intrinsics.checkNotNullParameter(list0, "items");
            super();
            this.position = v;
            this.items = list0;
            this.toPosition = v1;
            this.notify = z;
        }

        public ReplaceItems(int v, List list0, int v1, boolean z, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v2 & 1) != 0) {
                v = -1;
            }
            if((v2 & 4) != 0) {
                v1 = -1;
            }
            if((v2 & 8) != 0) {
                z = true;
            }
            this(v, list0, v1, z);
        }

        public final int component1() {
            return this.position;
        }

        @NotNull
        public final List component2() {
            return this.items;
        }

        public final int component3() {
            return this.toPosition;
        }

        public final boolean component4() {
            return this.notify;
        }

        @NotNull
        public final ReplaceItems copy(int v, @NotNull List list0, int v1, boolean z) {
            Intrinsics.checkNotNullParameter(list0, "items");
            return new ReplaceItems(v, list0, v1, z);
        }

        public static ReplaceItems copy$default(ReplaceItems viewRequest$ReplaceItems0, int v, List list0, int v1, boolean z, int v2, Object object0) {
            if((v2 & 1) != 0) {
                v = viewRequest$ReplaceItems0.position;
            }
            if((v2 & 2) != 0) {
                list0 = viewRequest$ReplaceItems0.items;
            }
            if((v2 & 4) != 0) {
                v1 = viewRequest$ReplaceItems0.toPosition;
            }
            if((v2 & 8) != 0) {
                z = viewRequest$ReplaceItems0.notify;
            }
            return viewRequest$ReplaceItems0.copy(v, list0, v1, z);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof ReplaceItems)) {
                return false;
            }
            if(this.position != ((ReplaceItems)object0).position) {
                return false;
            }
            if(!Intrinsics.areEqual(this.items, ((ReplaceItems)object0).items)) {
                return false;
            }
            return this.toPosition == ((ReplaceItems)object0).toPosition ? this.notify == ((ReplaceItems)object0).notify : false;
        }

        @NotNull
        public final List getItems() {
            return this.items;
        }

        public final boolean getNotify() {
            return this.notify;
        }

        public final int getPosition() {
            return this.position;
        }

        public final int getToPosition() {
            return this.toPosition;
        }

        @Override
        public int hashCode() {
            return Boolean.hashCode(this.notify) + a.c(this.toPosition, b.c(this.items, this.position * 0x1F, 0x1F), 0x1F);
        }

        @Override
        @NotNull
        public String toString() {
            return "ReplaceItems(position=" + this.position + ", items=" + this.items + ", toPosition=" + this.toPosition + ", notify=" + this.notify + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000B\u001A\u00020\u0003HÆ\u0003J\t\u0010\f\u001A\u00020\u0005HÆ\u0003J\u001D\u0010\r\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0005HÆ\u0001J\u0013\u0010\u000E\u001A\u00020\u00052\b\u0010\u000F\u001A\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001A\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/kakao/keditor/util/eventbus/ViewRequest$RequestFocus;", "Lcom/kakao/keditor/util/eventbus/ViewRequest;", "position", "", "needAdjust", "", "(IZ)V", "getNeedAdjust", "()Z", "getPosition", "()I", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class RequestFocus extends ViewRequest {
        private final boolean needAdjust;
        private final int position;

        public RequestFocus() {
            this(0, false, 3, null);
        }

        public RequestFocus(int v, boolean z) {
            this.position = v;
            this.needAdjust = z;
        }

        public RequestFocus(int v, boolean z, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v1 & 1) != 0) {
                v = -1;
            }
            if((v1 & 2) != 0) {
                z = false;
            }
            this(v, z);
        }

        public final int component1() {
            return this.position;
        }

        public final boolean component2() {
            return this.needAdjust;
        }

        @NotNull
        public final RequestFocus copy(int v, boolean z) {
            return new RequestFocus(v, z);
        }

        public static RequestFocus copy$default(RequestFocus viewRequest$RequestFocus0, int v, boolean z, int v1, Object object0) {
            if((v1 & 1) != 0) {
                v = viewRequest$RequestFocus0.position;
            }
            if((v1 & 2) != 0) {
                z = viewRequest$RequestFocus0.needAdjust;
            }
            return viewRequest$RequestFocus0.copy(v, z);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof RequestFocus)) {
                return false;
            }
            return this.position == ((RequestFocus)object0).position ? this.needAdjust == ((RequestFocus)object0).needAdjust : false;
        }

        public final boolean getNeedAdjust() {
            return this.needAdjust;
        }

        public final int getPosition() {
            return this.position;
        }

        @Override
        public int hashCode() {
            return Boolean.hashCode(this.needAdjust) + this.position * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "RequestFocus(position=" + this.position + ", needAdjust=" + this.needAdjust + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/kakao/keditor/util/eventbus/ViewRequest$RequestFocusToFirstTextItem;", "Lcom/kakao/keditor/util/eventbus/ViewRequest;", "()V", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class RequestFocusToFirstTextItem extends ViewRequest {
        @NotNull
        public static final RequestFocusToFirstTextItem INSTANCE;

        static {
            RequestFocusToFirstTextItem.INSTANCE = new RequestFocusToFirstTextItem();
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001A\u00020\u00042\b\u0010\u0005\u001A\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001A\u00020\bHÖ\u0001J\t\u0010\t\u001A\u00020\nHÖ\u0001¨\u0006\u000B"}, d2 = {"Lcom/kakao/keditor/util/eventbus/ViewRequest$ResetAllItems;", "Lcom/kakao/keditor/util/eventbus/ViewRequest;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ResetAllItems extends ViewRequest {
        @NotNull
        public static final ResetAllItems INSTANCE;

        static {
            ResetAllItems.INSTANCE = new ResetAllItems();
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof ResetAllItems;
        }

        @Override
        public int hashCode() {
            return 0xBEE7BB00;
        }

        @Override
        @NotNull
        public String toString() {
            return "ResetAllItems";
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0007\u0012\u0010\b\u0002\u0010\b\u001A\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\u0010\u000BJ\t\u0010\u0014\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001A\u00020\u0007HÆ\u0003J\u0011\u0010\u0017\u001A\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J9\u0010\u0018\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\u0010\b\u0002\u0010\b\u001A\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001A\u00020\u00072\b\u0010\u001A\u001A\u0004\u0018\u00010\u001BHÖ\u0003J\t\u0010\u001C\u001A\u00020\u0003HÖ\u0001J\t\u0010\u001D\u001A\u00020\u001EHÖ\u0001R\u0019\u0010\b\u001A\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000FR\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u001F"}, d2 = {"Lcom/kakao/keditor/util/eventbus/ViewRequest$ScrollTo;", "Lcom/kakao/keditor/util/eventbus/ViewRequest;", "position", "", "item", "Lcom/kakao/keditor/KeditorItem;", "notScrollIfVisible", "", "doAfterScroll", "Lkotlin/Function0;", "", "(ILcom/kakao/keditor/KeditorItem;ZLkotlin/jvm/functions/Function0;)V", "getDoAfterScroll", "()Lkotlin/jvm/functions/Function0;", "getItem", "()Lcom/kakao/keditor/KeditorItem;", "getNotScrollIfVisible", "()Z", "getPosition", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ScrollTo extends ViewRequest {
        @Nullable
        private final Function0 doAfterScroll;
        @NotNull
        private final KeditorItem item;
        private final boolean notScrollIfVisible;
        private final int position;

        public ScrollTo(int v, @NotNull KeditorItem keditorItem0, boolean z, @Nullable Function0 function00) {
            Intrinsics.checkNotNullParameter(keditorItem0, "item");
            super();
            this.position = v;
            this.item = keditorItem0;
            this.notScrollIfVisible = z;
            this.doAfterScroll = function00;
        }

        public ScrollTo(int v, KeditorItem keditorItem0, boolean z, Function0 function00, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v1 & 1) != 0) {
                v = -1;
            }
            if((v1 & 4) != 0) {
                z = false;
            }
            if((v1 & 8) != 0) {
                function00 = null;
            }
            this(v, keditorItem0, z, function00);
        }

        public final int component1() {
            return this.position;
        }

        @NotNull
        public final KeditorItem component2() {
            return this.item;
        }

        public final boolean component3() {
            return this.notScrollIfVisible;
        }

        @Nullable
        public final Function0 component4() {
            return this.doAfterScroll;
        }

        @NotNull
        public final ScrollTo copy(int v, @NotNull KeditorItem keditorItem0, boolean z, @Nullable Function0 function00) {
            Intrinsics.checkNotNullParameter(keditorItem0, "item");
            return new ScrollTo(v, keditorItem0, z, function00);
        }

        public static ScrollTo copy$default(ScrollTo viewRequest$ScrollTo0, int v, KeditorItem keditorItem0, boolean z, Function0 function00, int v1, Object object0) {
            if((v1 & 1) != 0) {
                v = viewRequest$ScrollTo0.position;
            }
            if((v1 & 2) != 0) {
                keditorItem0 = viewRequest$ScrollTo0.item;
            }
            if((v1 & 4) != 0) {
                z = viewRequest$ScrollTo0.notScrollIfVisible;
            }
            if((v1 & 8) != 0) {
                function00 = viewRequest$ScrollTo0.doAfterScroll;
            }
            return viewRequest$ScrollTo0.copy(v, keditorItem0, z, function00);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof ScrollTo)) {
                return false;
            }
            if(this.position != ((ScrollTo)object0).position) {
                return false;
            }
            if(!Intrinsics.areEqual(this.item, ((ScrollTo)object0).item)) {
                return false;
            }
            return this.notScrollIfVisible == ((ScrollTo)object0).notScrollIfVisible ? Intrinsics.areEqual(this.doAfterScroll, ((ScrollTo)object0).doAfterScroll) : false;
        }

        @Nullable
        public final Function0 getDoAfterScroll() {
            return this.doAfterScroll;
        }

        @NotNull
        public final KeditorItem getItem() {
            return this.item;
        }

        public final boolean getNotScrollIfVisible() {
            return this.notScrollIfVisible;
        }

        public final int getPosition() {
            return this.position;
        }

        @Override
        public int hashCode() {
            int v = a.e((this.item.hashCode() + this.position * 0x1F) * 0x1F, 0x1F, this.notScrollIfVisible);
            return this.doAfterScroll == null ? v : v + this.doAfterScroll.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "ScrollTo(position=" + this.position + ", item=" + this.item + ", notScrollIfVisible=" + this.notScrollIfVisible + ", doAfterScroll=" + this.doAfterScroll + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000E\u001A\u00020\u0005HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0005HÆ\u0003J\'\u0010\u0010\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001A\u00020\u00122\b\u0010\u0013\u001A\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001A\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001A\u00020\u0017HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0006\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/kakao/keditor/util/eventbus/ViewRequest$ScrollToSpecificTextIndex;", "Lcom/kakao/keditor/util/eventbus/ViewRequest;", "item", "Lcom/kakao/keditor/plugin/itemspec/paragraph/TextItem;", "innerItemIndex", "", "offset", "(Lcom/kakao/keditor/plugin/itemspec/paragraph/TextItem;II)V", "getInnerItemIndex", "()I", "getItem", "()Lcom/kakao/keditor/plugin/itemspec/paragraph/TextItem;", "getOffset", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ScrollToSpecificTextIndex extends ViewRequest {
        private final int innerItemIndex;
        @NotNull
        private final TextItem item;
        private final int offset;

        public ScrollToSpecificTextIndex(@NotNull TextItem textItem0, int v, int v1) {
            Intrinsics.checkNotNullParameter(textItem0, "item");
            super();
            this.item = textItem0;
            this.innerItemIndex = v;
            this.offset = v1;
        }

        @NotNull
        public final TextItem component1() {
            return this.item;
        }

        public final int component2() {
            return this.innerItemIndex;
        }

        public final int component3() {
            return this.offset;
        }

        @NotNull
        public final ScrollToSpecificTextIndex copy(@NotNull TextItem textItem0, int v, int v1) {
            Intrinsics.checkNotNullParameter(textItem0, "item");
            return new ScrollToSpecificTextIndex(textItem0, v, v1);
        }

        public static ScrollToSpecificTextIndex copy$default(ScrollToSpecificTextIndex viewRequest$ScrollToSpecificTextIndex0, TextItem textItem0, int v, int v1, int v2, Object object0) {
            if((v2 & 1) != 0) {
                textItem0 = viewRequest$ScrollToSpecificTextIndex0.item;
            }
            if((v2 & 2) != 0) {
                v = viewRequest$ScrollToSpecificTextIndex0.innerItemIndex;
            }
            if((v2 & 4) != 0) {
                v1 = viewRequest$ScrollToSpecificTextIndex0.offset;
            }
            return viewRequest$ScrollToSpecificTextIndex0.copy(textItem0, v, v1);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof ScrollToSpecificTextIndex)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.item, ((ScrollToSpecificTextIndex)object0).item)) {
                return false;
            }
            return this.innerItemIndex == ((ScrollToSpecificTextIndex)object0).innerItemIndex ? this.offset == ((ScrollToSpecificTextIndex)object0).offset : false;
        }

        public final int getInnerItemIndex() {
            return this.innerItemIndex;
        }

        @NotNull
        public final TextItem getItem() {
            return this.item;
        }

        public final int getOffset() {
            return this.offset;
        }

        @Override
        public int hashCode() {
            return this.offset + a.c(this.innerItemIndex, this.item.hashCode() * 0x1F, 0x1F);
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("ScrollToSpecificTextIndex(item=");
            stringBuilder0.append(this.item);
            stringBuilder0.append(", innerItemIndex=");
            stringBuilder0.append(this.innerItemIndex);
            stringBuilder0.append(", offset=");
            return wb.a.c(this.offset, ")", stringBuilder0);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001A2\u00020\u0001:\u0001\u001AB!\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001A\u00020\u0005HÆ\u0003J\u000B\u0010\u0012\u001A\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001A\u00020\u00052\b\u0010\u0015\u001A\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001A\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001A\u00020\u0019HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0004\u0010\tR\u001C\u0010\u0006\u001A\u0004\u0018\u00010\u0007X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\n\u0010\u000B\"\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u001B"}, d2 = {"Lcom/kakao/keditor/util/eventbus/ViewRequest$UpdateRepresentState;", "Lcom/kakao/keditor/util/eventbus/ViewRequest;", "position", "", "isSet", "", "item", "Lcom/kakao/keditor/KeditorItem;", "(IZLcom/kakao/keditor/KeditorItem;)V", "()Z", "getItem", "()Lcom/kakao/keditor/KeditorItem;", "setItem", "(Lcom/kakao/keditor/KeditorItem;)V", "getPosition", "()I", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "", "Companion", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class UpdateRepresentState extends ViewRequest {
        @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/kakao/keditor/util/eventbus/ViewRequest$UpdateRepresentState$Companion;", "", "()V", "newInstance", "Lcom/kakao/keditor/util/eventbus/ViewRequest$UpdateRepresentState;", "position", "", "isSet", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class Companion {
            private Companion() {
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            @JvmStatic
            @NotNull
            public final UpdateRepresentState newInstance(int v, boolean z) {
                return new UpdateRepresentState(v, z, null, 4, null);
            }
        }

        @NotNull
        public static final Companion Companion;
        private final boolean isSet;
        @Nullable
        private KeditorItem item;
        private final int position;

        static {
            UpdateRepresentState.Companion = new Companion(null);
        }

        public UpdateRepresentState(int v, boolean z, @Nullable KeditorItem keditorItem0) {
            this.position = v;
            this.isSet = z;
            this.item = keditorItem0;
        }

        public UpdateRepresentState(int v, boolean z, KeditorItem keditorItem0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v1 & 4) != 0) {
                keditorItem0 = null;
            }
            this(v, z, keditorItem0);
        }

        public final int component1() {
            return this.position;
        }

        public final boolean component2() {
            return this.isSet;
        }

        @Nullable
        public final KeditorItem component3() {
            return this.item;
        }

        @NotNull
        public final UpdateRepresentState copy(int v, boolean z, @Nullable KeditorItem keditorItem0) {
            return new UpdateRepresentState(v, z, keditorItem0);
        }

        public static UpdateRepresentState copy$default(UpdateRepresentState viewRequest$UpdateRepresentState0, int v, boolean z, KeditorItem keditorItem0, int v1, Object object0) {
            if((v1 & 1) != 0) {
                v = viewRequest$UpdateRepresentState0.position;
            }
            if((v1 & 2) != 0) {
                z = viewRequest$UpdateRepresentState0.isSet;
            }
            if((v1 & 4) != 0) {
                keditorItem0 = viewRequest$UpdateRepresentState0.item;
            }
            return viewRequest$UpdateRepresentState0.copy(v, z, keditorItem0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof UpdateRepresentState)) {
                return false;
            }
            if(this.position != ((UpdateRepresentState)object0).position) {
                return false;
            }
            return this.isSet == ((UpdateRepresentState)object0).isSet ? Intrinsics.areEqual(this.item, ((UpdateRepresentState)object0).item) : false;
        }

        @Nullable
        public final KeditorItem getItem() {
            return this.item;
        }

        public final int getPosition() {
            return this.position;
        }

        @Override
        public int hashCode() {
            int v = a.e(this.position * 0x1F, 0x1F, this.isSet);
            return this.item == null ? v : v + this.item.hashCode();
        }

        public final boolean isSet() {
            return this.isSet;
        }

        @JvmStatic
        @NotNull
        public static final UpdateRepresentState newInstance(int v, boolean z) {
            return UpdateRepresentState.Companion.newInstance(v, z);
        }

        public final void setItem(@Nullable KeditorItem keditorItem0) {
            this.item = keditorItem0;
        }

        @Override
        @NotNull
        public String toString() {
            return "UpdateRepresentState(position=" + this.position + ", isSet=" + this.isSet + ", item=" + this.item + ")";
        }
    }

}

