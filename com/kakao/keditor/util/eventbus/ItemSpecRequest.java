package com.kakao.keditor.util.eventbus;

import android.text.Editable;
import android.view.View;
import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.plugin.attrs.Alignment;
import com.kakao.keditor.plugin.itemspec.ItemSpec;
import com.kakao.keditor.request.KeditorRequest;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/kakao/keditor/util/eventbus/ItemSpecRequest;", "Lcom/kakao/keditor/request/KeditorRequest;", "()V", "FocusCategory", "TextSelectionChanged", "UpdateItemSpec", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public class ItemSpecRequest implements KeditorRequest {
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001D\u0012\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000B\u0010\u000B\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\f\u001A\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000E\u001A\u00020\u000F2\b\u0010\u0010\u001A\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001A\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/kakao/keditor/util/eventbus/ItemSpecRequest$FocusCategory;", "Lcom/kakao/keditor/util/eventbus/ItemSpecRequest;", "item", "Lcom/kakao/keditor/KeditorItem;", "view", "Landroid/view/View;", "(Lcom/kakao/keditor/KeditorItem;Landroid/view/View;)V", "getItem", "()Lcom/kakao/keditor/KeditorItem;", "getView", "()Landroid/view/View;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class FocusCategory extends ItemSpecRequest {
        @Nullable
        private final KeditorItem item;
        @Nullable
        private final View view;

        public FocusCategory() {
            this(null, null, 3, null);
        }

        public FocusCategory(@Nullable KeditorItem keditorItem0, @Nullable View view0) {
            this.item = keditorItem0;
            this.view = view0;
        }

        public FocusCategory(KeditorItem keditorItem0, View view0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 1) != 0) {
                keditorItem0 = null;
            }
            if((v & 2) != 0) {
                view0 = null;
            }
            this(keditorItem0, view0);
        }

        @Nullable
        public final KeditorItem component1() {
            return this.item;
        }

        @Nullable
        public final View component2() {
            return this.view;
        }

        @NotNull
        public final FocusCategory copy(@Nullable KeditorItem keditorItem0, @Nullable View view0) {
            return new FocusCategory(keditorItem0, view0);
        }

        public static FocusCategory copy$default(FocusCategory itemSpecRequest$FocusCategory0, KeditorItem keditorItem0, View view0, int v, Object object0) {
            if((v & 1) != 0) {
                keditorItem0 = itemSpecRequest$FocusCategory0.item;
            }
            if((v & 2) != 0) {
                view0 = itemSpecRequest$FocusCategory0.view;
            }
            return itemSpecRequest$FocusCategory0.copy(keditorItem0, view0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof FocusCategory)) {
                return false;
            }
            return Intrinsics.areEqual(this.item, ((FocusCategory)object0).item) ? Intrinsics.areEqual(this.view, ((FocusCategory)object0).view) : false;
        }

        @Nullable
        public final KeditorItem getItem() {
            return this.item;
        }

        @Nullable
        public final View getView() {
            return this.view;
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = this.item == null ? 0 : this.item.hashCode();
            View view0 = this.view;
            if(view0 != null) {
                v = view0.hashCode();
            }
            return v1 * 0x1F + v;
        }

        @Override
        @NotNull
        public String toString() {
            return "FocusCategory(item=" + this.item + ", view=" + this.view + ")";
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006\u0012\u0006\u0010\u0007\u001A\u00020\b\u0012\u0006\u0010\t\u001A\u00020\n\u0012\u0006\u0010\u000B\u001A\u00020\n¢\u0006\u0002\u0010\fJ\u000F\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0017\u001A\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001A\u00020\bHÆ\u0003J\t\u0010\u0019\u001A\u00020\nHÆ\u0003J\t\u0010\u001A\u001A\u00020\nHÆ\u0003JA\u0010\u001B\u001A\u00020\u00002\u000E\b\u0002\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00062\b\b\u0002\u0010\u0007\u001A\u00020\b2\b\b\u0002\u0010\t\u001A\u00020\n2\b\b\u0002\u0010\u000B\u001A\u00020\nHÆ\u0001J\u0013\u0010\u001C\u001A\u00020\u001D2\b\u0010\u001E\u001A\u0004\u0018\u00010\u001FHÖ\u0003J\u0006\u0010 \u001A\u00020\u001DJ\t\u0010!\u001A\u00020\nHÖ\u0001J\t\u0010\"\u001A\u00020#HÖ\u0001R\u0011\u0010\u0007\u001A\u00020\b¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0011\u0010\u000B\u001A\u00020\n¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u0010R\u0011\u0010\u0005\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001A\u00020\n¢\u0006\b\n\u0000\u001A\u0004\b\u0015\u0010\u0010¨\u0006$"}, d2 = {"Lcom/kakao/keditor/util/eventbus/ItemSpecRequest$TextSelectionChanged;", "Lcom/kakao/keditor/util/eventbus/ItemSpecRequest;", "spans", "", "Landroid/text/style/CharacterStyle;", "s", "Landroid/text/Editable;", "alignment", "Lcom/kakao/keditor/plugin/attrs/Alignment;", "start", "", "end", "(Ljava/util/List;Landroid/text/Editable;Lcom/kakao/keditor/plugin/attrs/Alignment;II)V", "getAlignment", "()Lcom/kakao/keditor/plugin/attrs/Alignment;", "getEnd", "()I", "getS", "()Landroid/text/Editable;", "getSpans", "()Ljava/util/List;", "getStart", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hasLength", "hashCode", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class TextSelectionChanged extends ItemSpecRequest {
        @NotNull
        private final Alignment alignment;
        private final int end;
        @NotNull
        private final Editable s;
        @NotNull
        private final List spans;
        private final int start;

        public TextSelectionChanged(@NotNull List list0, @NotNull Editable editable0, @NotNull Alignment alignment0, int v, int v1) {
            Intrinsics.checkNotNullParameter(list0, "spans");
            Intrinsics.checkNotNullParameter(editable0, "s");
            Intrinsics.checkNotNullParameter(alignment0, "alignment");
            super();
            this.spans = list0;
            this.s = editable0;
            this.alignment = alignment0;
            this.start = v;
            this.end = v1;
        }

        @NotNull
        public final List component1() {
            return this.spans;
        }

        @NotNull
        public final Editable component2() {
            return this.s;
        }

        @NotNull
        public final Alignment component3() {
            return this.alignment;
        }

        public final int component4() {
            return this.start;
        }

        public final int component5() {
            return this.end;
        }

        @NotNull
        public final TextSelectionChanged copy(@NotNull List list0, @NotNull Editable editable0, @NotNull Alignment alignment0, int v, int v1) {
            Intrinsics.checkNotNullParameter(list0, "spans");
            Intrinsics.checkNotNullParameter(editable0, "s");
            Intrinsics.checkNotNullParameter(alignment0, "alignment");
            return new TextSelectionChanged(list0, editable0, alignment0, v, v1);
        }

        public static TextSelectionChanged copy$default(TextSelectionChanged itemSpecRequest$TextSelectionChanged0, List list0, Editable editable0, Alignment alignment0, int v, int v1, int v2, Object object0) {
            if((v2 & 1) != 0) {
                list0 = itemSpecRequest$TextSelectionChanged0.spans;
            }
            if((v2 & 2) != 0) {
                editable0 = itemSpecRequest$TextSelectionChanged0.s;
            }
            if((v2 & 4) != 0) {
                alignment0 = itemSpecRequest$TextSelectionChanged0.alignment;
            }
            if((v2 & 8) != 0) {
                v = itemSpecRequest$TextSelectionChanged0.start;
            }
            if((v2 & 16) != 0) {
                v1 = itemSpecRequest$TextSelectionChanged0.end;
            }
            return itemSpecRequest$TextSelectionChanged0.copy(list0, editable0, alignment0, v, v1);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof TextSelectionChanged)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.spans, ((TextSelectionChanged)object0).spans)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.s, ((TextSelectionChanged)object0).s)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.alignment, ((TextSelectionChanged)object0).alignment)) {
                return false;
            }
            return this.start == ((TextSelectionChanged)object0).start ? this.end == ((TextSelectionChanged)object0).end : false;
        }

        @NotNull
        public final Alignment getAlignment() {
            return this.alignment;
        }

        public final int getEnd() {
            return this.end;
        }

        @NotNull
        public final Editable getS() {
            return this.s;
        }

        @NotNull
        public final List getSpans() {
            return this.spans;
        }

        public final int getStart() {
            return this.start;
        }

        public final boolean hasLength() {
            return this.end > this.start;
        }

        @Override
        public int hashCode() {
            return this.end + a.c(this.start, (this.alignment.hashCode() + (this.s.hashCode() + this.spans.hashCode() * 0x1F) * 0x1F) * 0x1F, 0x1F);
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("TextSelectionChanged(spans=");
            stringBuilder0.append(this.spans);
            stringBuilder0.append(", s=");
            stringBuilder0.append(this.s);
            stringBuilder0.append(", alignment=");
            stringBuilder0.append(this.alignment);
            stringBuilder0.append(", start=");
            stringBuilder0.append(this.start);
            stringBuilder0.append(", end=");
            return wb.a.c(this.end, ")", stringBuilder0);
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u0019*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u0003:\u0001\u0019B\'\u0012\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\u0010\tJ\u0015\u0010\u000E\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000F\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\bHÆ\u0003J5\u0010\u0010\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0014\b\u0002\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u00052\u000E\b\u0002\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00000\bHÆ\u0001J\u0013\u0010\u0011\u001A\u00020\u00122\b\u0010\u0013\u001A\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001A\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001A\u00020\u0018HÖ\u0001R\u0017\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u001D\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\r¨\u0006\u001A"}, d2 = {"Lcom/kakao/keditor/util/eventbus/ItemSpecRequest$UpdateItemSpec;", "T", "Lcom/kakao/keditor/plugin/itemspec/ItemSpec;", "Lcom/kakao/keditor/util/eventbus/ItemSpecRequest;", "update", "Lkotlin/Function1;", "", "type", "Lkotlin/reflect/KClass;", "(Lkotlin/jvm/functions/Function1;Lkotlin/reflect/KClass;)V", "getType", "()Lkotlin/reflect/KClass;", "getUpdate", "()Lkotlin/jvm/functions/Function1;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class UpdateItemSpec extends ItemSpecRequest {
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u0003\u001A\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u000E\b\u0001\u0010\u0005\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00062\u0014\b\b\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u00020\t0\bH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"Lcom/kakao/keditor/util/eventbus/ItemSpecRequest$UpdateItemSpec$Companion;", "", "()V", "create", "Lcom/kakao/keditor/util/eventbus/ItemSpecRequest$UpdateItemSpec;", "T", "Lcom/kakao/keditor/plugin/itemspec/ItemSpec;", "update", "Lkotlin/Function1;", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class Companion {
            private Companion() {
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            public final UpdateItemSpec create(Function1 function10) {
                Intrinsics.checkNotNullParameter(function10, "update");
                Intrinsics.reifiedOperationMarker(4, "T");
                return new UpdateItemSpec(function10, Reflection.getOrCreateKotlinClass(ItemSpec.class));
            }
        }

        @NotNull
        public static final Companion Companion;
        @NotNull
        private final KClass type;
        @NotNull
        private final Function1 update;

        static {
            UpdateItemSpec.Companion = new Companion(null);
        }

        public UpdateItemSpec(@NotNull Function1 function10, @NotNull KClass kClass0) {
            Intrinsics.checkNotNullParameter(function10, "update");
            Intrinsics.checkNotNullParameter(kClass0, "type");
            super();
            this.update = function10;
            this.type = kClass0;
        }

        @NotNull
        public final Function1 component1() {
            return this.update;
        }

        @NotNull
        public final KClass component2() {
            return this.type;
        }

        @NotNull
        public final UpdateItemSpec copy(@NotNull Function1 function10, @NotNull KClass kClass0) {
            Intrinsics.checkNotNullParameter(function10, "update");
            Intrinsics.checkNotNullParameter(kClass0, "type");
            return new UpdateItemSpec(function10, kClass0);
        }

        public static UpdateItemSpec copy$default(UpdateItemSpec itemSpecRequest$UpdateItemSpec0, Function1 function10, KClass kClass0, int v, Object object0) {
            if((v & 1) != 0) {
                function10 = itemSpecRequest$UpdateItemSpec0.update;
            }
            if((v & 2) != 0) {
                kClass0 = itemSpecRequest$UpdateItemSpec0.type;
            }
            return itemSpecRequest$UpdateItemSpec0.copy(function10, kClass0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof UpdateItemSpec)) {
                return false;
            }
            return Intrinsics.areEqual(this.update, ((UpdateItemSpec)object0).update) ? Intrinsics.areEqual(this.type, ((UpdateItemSpec)object0).type) : false;
        }

        @NotNull
        public final KClass getType() {
            return this.type;
        }

        @NotNull
        public final Function1 getUpdate() {
            return this.update;
        }

        @Override
        public int hashCode() {
            return this.type.hashCode() + this.update.hashCode() * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "UpdateItemSpec(update=" + this.update + ", type=" + this.type + ")";
        }
    }

}

