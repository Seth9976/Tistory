package com.kakao.keditor.plugin.pluginspec.imagegrid.layout;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.DragEvent;
import android.view.View.DragShadowBuilder;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.drawable.DrawableKt;
import androidx.core.view.ViewGroupKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.enums.EnumEntries;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import kotlin.sequences.Sequence;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.a;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 K2\u00020\u0001:\tHIJKLMNOPB%\b\u0007\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0007\u00A2\u0006\u0002\u0010\bJ\u001A\u0010;\u001A\u0004\u0018\u0001062\u0006\u0010<\u001A\u00020=2\u0006\u0010>\u001A\u00020=H\u0002J\u0012\u0010?\u001A\u0004\u0018\u00010\f2\u0006\u0010@\u001A\u00020\u0007H\u0002J\u0016\u0010A\u001A\b\u0012\u0004\u0012\u00020\u00070B2\u0006\u0010C\u001A\u00020\u0007H\u0014J\u0010\u0010D\u001A\u00020E2\u0006\u0010F\u001A\u00020GH\u0014RH\u0010\r\u001A\u0014\u0012\u0006\b\u0001\u0012\u00020\u000B\u0012\u0006\b\u0001\u0012\u00020\f\u0018\u00010\n2\u0018\u0010\t\u001A\u0014\u0012\u0006\b\u0001\u0012\u00020\u000B\u0012\u0006\b\u0001\u0012\u00020\f\u0018\u00010\n@FX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u000E\u0010\u000F\"\u0004\b\u0010\u0010\u0011R\u001C\u0010\u0012\u001A\u0004\u0018\u00010\u0013X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001C\u0010\u0018\u001A\u0004\u0018\u00010\u0019X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001A\u0010\u001B\"\u0004\b\u001C\u0010\u001DR\u001E\u0010\u001E\u001A\u0004\u0018\u00010\u0007X\u0096\u000E\u00A2\u0006\u0010\n\u0002\u0010#\u001A\u0004\b\u001F\u0010 \"\u0004\b!\u0010\"R$\u0010$\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\u0007@VX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b%\u0010&\"\u0004\b\'\u0010(R$\u0010*\u001A\u00020)2\u0006\u0010\t\u001A\u00020)@FX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u0010.\u001A\u00020)2\u0006\u0010\t\u001A\u00020)@FX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b.\u0010+\"\u0004\b/\u0010-R\u000E\u00100\u001A\u000201X\u0082\u000E\u00A2\u0006\u0002\n\u0000R$\u00102\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\u0007@VX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b3\u0010&\"\u0004\b4\u0010(R\u001C\u00105\u001A\u0004\u0018\u000106X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b7\u00108\"\u0004\b9\u0010:\u00A8\u0006Q"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout$Adapter;", "", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout$Cell;", "adapter", "getAdapter", "()Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout$Adapter;", "setAdapter", "(Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout$Adapter;)V", "cellDragListener", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout$OnCellDragListener;", "getCellDragListener", "()Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout$OnCellDragListener;", "setCellDragListener", "(Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout$OnCellDragListener;)V", "guideLineDrawable", "Landroid/graphics/drawable/Drawable;", "getGuideLineDrawable", "()Landroid/graphics/drawable/Drawable;", "setGuideLineDrawable", "(Landroid/graphics/drawable/Drawable;)V", "guideLineTint", "getGuideLineTint", "()Ljava/lang/Integer;", "setGuideLineTint", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "innerPadding", "getInnerPadding", "()I", "setInnerPadding", "(I)V", "", "isAnimationEnabled", "()Z", "setAnimationEnabled", "(Z)V", "isDragAndDropEnabled", "setDragAndDropEnabled", "layoutManager", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout$LayoutManager;", "minSingleCellWidth", "getMinSingleCellWidth", "setMinSingleCellWidth", "scrollableLayout", "Landroid/view/View;", "getScrollableLayout", "()Landroid/view/View;", "setScrollableLayout", "(Landroid/view/View;)V", "findCellAtPosition", "x", "", "y", "getViewHolderAt", "position", "makeTemplate", "", "count", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "Adapter", "Cell", "CellSize", "Companion", "DragState", "GuideLineInfo", "LayoutManager", "LayoutParams", "OnCellDragListener", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAutoTemplateLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoTemplateLayout.kt\ncom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,884:1\n1313#2,2:885\n*S KotlinDebug\n*F\n+ 1 AutoTemplateLayout.kt\ncom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout\n*L\n121#1:885,2\n*E\n"})
public class AutoTemplateLayout extends ConstraintLayout {
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u00020\u0004B\r\u0012\u0006\u0010\u0005\u001A\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000F\u001A\u0004\u0018\u00010\u0003J\u0006\u0010\u0010\u001A\u00020\u0011J\u000E\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0013\u001A\u00020\u0014J\u000E\u0010\u0015\u001A\u00020\u00112\u0006\u0010\u0013\u001A\u00020\u0014J\u000E\u0010\u0016\u001A\u00020\u00112\u0006\u0010\u0013\u001A\u00020\u0014J\u0016\u0010\u0017\u001A\u00020\u00112\u0006\u0010\u0013\u001A\u00020\u00142\u0006\u0010\u0018\u001A\u00020\u0014J\u0016\u0010\u0019\u001A\u00020\u00112\u0006\u0010\u0013\u001A\u00020\u00142\u0006\u0010\u0018\u001A\u00020\u0014J\u0016\u0010\u001A\u001A\u00020\u00112\u0006\u0010\u0013\u001A\u00020\u00142\u0006\u0010\u0018\u001A\u00020\u0014J\u000E\u0010\u001B\u001A\u00020\u00112\u0006\u0010\u0013\u001A\u00020\u0014J\u0010\u0010\u001C\u001A\u00020\u00112\u0006\u0010\u0005\u001A\u00020\u0006H\u0017J\u0018\u0010\u001D\u001A\u00020\u00112\u0006\u0010\u001E\u001A\u00020\u00032\u0006\u0010\u0013\u001A\u00020\u0014H&J\b\u0010\u001F\u001A\u00020\u0011H\u0016J\u0010\u0010 \u001A\u00020\u00032\u0006\u0010!\u001A\u00020\"H&J\u0018\u0010#\u001A\u00020\u00112\u0006\u0010$\u001A\u00020\u00142\u0006\u0010%\u001A\u00020\u0014H\u0016J\u0016\u0010&\u001A\u00020\u00112\f\u0010\'\u001A\b\u0012\u0004\u0012\u00020\u00140\tH\u0016J\u0011\u0010(\u001A\u00020\u0014*\u00028\u0000H$¢\u0006\u0002\u0010)J\u0011\u0010*\u001A\u00020\u0014*\u00028\u0000H$¢\u0006\u0002\u0010)R\u0018\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\tX¦\u0004¢\u0006\u0006\u001A\u0004\b\n\u0010\u000BR\u001A\u0010\u0005\u001A\u00020\u0006X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\f\u0010\r\"\u0004\b\u000E\u0010\u0007¨\u0006+"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout$Adapter;", "T", "VH", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout$Cell;", "", "layout", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout;", "(Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout;)V", "items", "", "getItems", "()Ljava/util/List;", "getLayout", "()Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout;", "setLayout", "createViewHolder", "notifyDataSetChanged", "", "notifyItemChanged", "position", "", "notifyItemChangedWithSameSize", "notifyItemInserted", "notifyItemRangeChanged", "count", "notifyItemRangeInserted", "notifyItemRangeRemoved", "notifyItemRemoved", "onAttachedToLayout", "onBindViewHolder", "holder", "onChildrenSizesChanged", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "onMoveCell", "fromIndex", "toIndex", "onTemplateChanged", "template", "getHeight", "(Ljava/lang/Object;)I", "getWidth", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nAutoTemplateLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoTemplateLayout.kt\ncom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout$Adapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,884:1\n1549#2:885\n1620#2,3:886\n1549#2:889\n1620#2,3:890\n1549#2:893\n1620#2,3:894\n1549#2:897\n1620#2,3:898\n*S KotlinDebug\n*F\n+ 1 AutoTemplateLayout.kt\ncom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout$Adapter\n*L\n143#1:885\n143#1:886,3\n176#1:889\n176#1:890,3\n187#1:893\n187#1:894,3\n191#1:897\n191#1:898,3\n*E\n"})
    public static abstract class Adapter {
        @NotNull
        private AutoTemplateLayout layout;

        public Adapter(@NotNull AutoTemplateLayout autoTemplateLayout0) {
            Intrinsics.checkNotNullParameter(autoTemplateLayout0, "layout");
            super();
            this.layout = autoTemplateLayout0;
        }

        @Nullable
        public final Cell createViewHolder() {
            Cell autoTemplateLayout$Cell0 = this.onCreateViewHolder(this.layout);
            if(this.layout.isDragAndDropEnabled()) {
                this.layout.layoutManager.enableDragAndDropForChild(autoTemplateLayout$Cell0.getView(), true);
            }
            return autoTemplateLayout$Cell0;
        }

        public abstract int getHeight(Object arg1);

        @NotNull
        public abstract List getItems();

        @NotNull
        public final AutoTemplateLayout getLayout() {
            return this.layout;
        }

        public abstract int getWidth(Object arg1);

        public final void notifyDataSetChanged() {
            LayoutManager autoTemplateLayout$LayoutManager0 = this.layout.layoutManager;
            Iterable iterable0 = this.getItems();
            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
            for(Object object0: iterable0) {
                arrayList0.add(new CellSize(this.getWidth(object0), this.getHeight(object0)));
            }
            autoTemplateLayout$LayoutManager0.initAllCells(CollectionsKt___CollectionsKt.toMutableList(arrayList0));
        }

        public final void notifyItemChanged(int v) {
            this.layout.layoutManager.updateCellAt(v, new CellSize(this.getWidth(this.getItems().get(v)), this.getHeight(this.getItems().get(v))));
        }

        public final void notifyItemChangedWithSameSize(int v) {
            this.layout.layoutManager.updateCellWithSameSizeAt(v);
        }

        public final void notifyItemInserted(int v) {
            this.layout.layoutManager.addCellAt(v, new CellSize(this.getWidth(this.getItems().get(v)), this.getHeight(this.getItems().get(v))));
        }

        public final void notifyItemRangeChanged(int v, int v1) {
            LayoutManager autoTemplateLayout$LayoutManager0 = this.layout.layoutManager;
            Iterable iterable0 = this.getItems().subList(v, v + v1);
            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
            for(Object object0: iterable0) {
                arrayList0.add(new CellSize(this.getWidth(object0), this.getHeight(object0)));
            }
            autoTemplateLayout$LayoutManager0.updateCellsAt(v, v1, arrayList0);
        }

        public final void notifyItemRangeInserted(int v, int v1) {
            LayoutManager autoTemplateLayout$LayoutManager0 = this.layout.layoutManager;
            Iterable iterable0 = this.getItems().subList(v, v1 + v);
            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
            for(Object object0: iterable0) {
                arrayList0.add(new CellSize(this.getWidth(object0), this.getHeight(object0)));
            }
            autoTemplateLayout$LayoutManager0.addCellsAt(v, arrayList0);
        }

        public final void notifyItemRangeRemoved(int v, int v1) {
            this.layout.layoutManager.removeCellsAt(v, v1);
        }

        public final void notifyItemRemoved(int v) {
            this.layout.layoutManager.removeCellAt(v);
        }

        @CallSuper
        public void onAttachedToLayout(@NotNull AutoTemplateLayout autoTemplateLayout0) {
            Intrinsics.checkNotNullParameter(autoTemplateLayout0, "layout");
            this.layout = autoTemplateLayout0;
            LayoutManager autoTemplateLayout$LayoutManager0 = autoTemplateLayout0.layoutManager;
            Iterable iterable0 = this.getItems();
            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
            for(Object object0: iterable0) {
                arrayList0.add(new CellSize(this.getWidth(object0), this.getHeight(object0)));
            }
            autoTemplateLayout$LayoutManager0.initAllCells(CollectionsKt___CollectionsKt.toMutableList(arrayList0));
        }

        public abstract void onBindViewHolder(@NotNull Cell arg1, int arg2);

        public void onChildrenSizesChanged() {
        }

        @NotNull
        public abstract Cell onCreateViewHolder(@NotNull ViewGroup arg1);

        public void onMoveCell(int v, int v1) {
        }

        public void onTemplateChanged(@NotNull List list0) {
            Intrinsics.checkNotNullParameter(list0, "template");
        }

        public final void setLayout(@NotNull AutoTemplateLayout autoTemplateLayout0) {
            Intrinsics.checkNotNullParameter(autoTemplateLayout0, "<set-?>");
            this.layout = autoTemplateLayout0;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout$Cell;", "", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "getView", "()Landroid/view/View;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static class Cell {
        @NotNull
        private final View view;

        public Cell(@NotNull View view0) {
            Intrinsics.checkNotNullParameter(view0, "view");
            super();
            this.view = view0;
            if(view0.getId() == -1) {
                view0.setId(View.generateViewId());
            }
            LayoutParams autoTemplateLayout$LayoutParams0 = new LayoutParams(0, 0);
            autoTemplateLayout$LayoutParams0.setCell(this);
            view0.setLayoutParams(autoTemplateLayout$LayoutParams0);
        }

        @NotNull
        public final View getView() {
            return this.view;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001A\u00020\u0003HÆ\u0003J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\u001D\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u000F\u001A\u00020\u00102\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001A\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001A\u00020\u0014HÖ\u0001R\u001A\u0010\u0004\u001A\u00020\u0003X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001A\u0010\u0002\u001A\u00020\u0003X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\n\u0010\u0007\"\u0004\b\u000B\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout$CellSize;", "", "cellWidth", "", "cellHeight", "(II)V", "getCellHeight", "()I", "setCellHeight", "(I)V", "getCellWidth", "setCellWidth", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class CellSize {
        private int cellHeight;
        private int cellWidth;

        public CellSize(int v, int v1) {
            this.cellWidth = v;
            this.cellHeight = v1;
        }

        public final int component1() {
            return this.cellWidth;
        }

        public final int component2() {
            return this.cellHeight;
        }

        @NotNull
        public final CellSize copy(int v, int v1) {
            return new CellSize(v, v1);
        }

        public static CellSize copy$default(CellSize autoTemplateLayout$CellSize0, int v, int v1, int v2, Object object0) {
            if((v2 & 1) != 0) {
                v = autoTemplateLayout$CellSize0.cellWidth;
            }
            if((v2 & 2) != 0) {
                v1 = autoTemplateLayout$CellSize0.cellHeight;
            }
            return autoTemplateLayout$CellSize0.copy(v, v1);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof CellSize)) {
                return false;
            }
            return this.cellWidth == ((CellSize)object0).cellWidth ? this.cellHeight == ((CellSize)object0).cellHeight : false;
        }

        public final int getCellHeight() {
            return this.cellHeight;
        }

        public final int getCellWidth() {
            return this.cellWidth;
        }

        @Override
        public int hashCode() {
            return this.cellHeight + this.cellWidth * 0x1F;
        }

        public final void setCellHeight(int v) {
            this.cellHeight = v;
        }

        public final void setCellWidth(int v) {
            this.cellWidth = v;
        }

        @Override
        @NotNull
        public String toString() {
            return "CellSize(cellWidth=" + this.cellWidth + ", cellHeight=" + this.cellHeight + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\t\u001A\u00020\u0006*\u00020\u0006H\u0002R\u000E\u0010\u0003\u001A\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000E\u0010\u0005\u001A\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000E\u0010\u0007\u001A\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000E\u0010\b\u001A\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout$Companion;", "", "()V", "AUTO_SCROLL_DELAY", "", "CELL_HOTSPOT_WIDTH_DP", "", "DEFAULT_GUIDELINE_WIDTH", "SCROLL_HOTSPOT_HEIGHT_DP", "dp2px", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        private final float dp2px(float f) {
            return TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout$DragState;", "", "(Ljava/lang/String;I)V", "IDLE", "START_DRAG", "ON_DRAG", "DROP_ON_LAYOUT", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static enum DragState {
        IDLE,
        START_DRAG,
        ON_DRAG,
        DROP_ON_LAYOUT;

        private static final EnumEntries $ENTRIES;
        private static final DragState[] $VALUES;

        private static final DragState[] $values() [...] // Inlined contents

        static {
            DragState.$VALUES = arr_autoTemplateLayout$DragState;
            Intrinsics.checkNotNullParameter(arr_autoTemplateLayout$DragState, "entries");
            DragState.$ENTRIES = new a(arr_autoTemplateLayout$DragState);
        }

        @NotNull
        public static EnumEntries getEntries() {
            return DragState.$ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0005HÆ\u0003J\u001D\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001A\u00020\u00132\b\u0010\u0014\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001A\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001A\u00020\u0017HÖ\u0001R\u001A\u0010\u0002\u001A\u00020\u0003X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001A\u0010\u0004\u001A\u00020\u0005X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u000B\u0010\f\"\u0004\b\r\u0010\u000E¨\u0006\u0019"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout$GuideLineInfo;", "", "hoverIndex", "", "orientation", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout$GuideLineInfo$Orientation;", "(ILcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout$GuideLineInfo$Orientation;)V", "getHoverIndex", "()I", "setHoverIndex", "(I)V", "getOrientation", "()Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout$GuideLineInfo$Orientation;", "setOrientation", "(Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout$GuideLineInfo$Orientation;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "Orientation", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    static final class GuideLineInfo {
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout$GuideLineInfo$Orientation;", "", "(Ljava/lang/String;I)V", "TO_LEFT", "TO_RIGHT", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static enum Orientation {
            TO_LEFT,
            TO_RIGHT;

            private static final EnumEntries $ENTRIES;
            private static final Orientation[] $VALUES;

            private static final Orientation[] $values() [...] // Inlined contents

            static {
                Orientation.$VALUES = arr_autoTemplateLayout$GuideLineInfo$Orientation;
                Intrinsics.checkNotNullParameter(arr_autoTemplateLayout$GuideLineInfo$Orientation, "entries");
                Orientation.$ENTRIES = new a(arr_autoTemplateLayout$GuideLineInfo$Orientation);
            }

            @NotNull
            public static EnumEntries getEntries() {
                return Orientation.$ENTRIES;
            }
        }

        private int hoverIndex;
        @NotNull
        private Orientation orientation;

        public GuideLineInfo(int v, @NotNull Orientation autoTemplateLayout$GuideLineInfo$Orientation0) {
            Intrinsics.checkNotNullParameter(autoTemplateLayout$GuideLineInfo$Orientation0, "orientation");
            super();
            this.hoverIndex = v;
            this.orientation = autoTemplateLayout$GuideLineInfo$Orientation0;
        }

        public final int component1() {
            return this.hoverIndex;
        }

        @NotNull
        public final Orientation component2() {
            return this.orientation;
        }

        @NotNull
        public final GuideLineInfo copy(int v, @NotNull Orientation autoTemplateLayout$GuideLineInfo$Orientation0) {
            Intrinsics.checkNotNullParameter(autoTemplateLayout$GuideLineInfo$Orientation0, "orientation");
            return new GuideLineInfo(v, autoTemplateLayout$GuideLineInfo$Orientation0);
        }

        public static GuideLineInfo copy$default(GuideLineInfo autoTemplateLayout$GuideLineInfo0, int v, Orientation autoTemplateLayout$GuideLineInfo$Orientation0, int v1, Object object0) {
            if((v1 & 1) != 0) {
                v = autoTemplateLayout$GuideLineInfo0.hoverIndex;
            }
            if((v1 & 2) != 0) {
                autoTemplateLayout$GuideLineInfo$Orientation0 = autoTemplateLayout$GuideLineInfo0.orientation;
            }
            return autoTemplateLayout$GuideLineInfo0.copy(v, autoTemplateLayout$GuideLineInfo$Orientation0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof GuideLineInfo)) {
                return false;
            }
            return this.hoverIndex == ((GuideLineInfo)object0).hoverIndex ? this.orientation == ((GuideLineInfo)object0).orientation : false;
        }

        public final int getHoverIndex() {
            return this.hoverIndex;
        }

        @NotNull
        public final Orientation getOrientation() {
            return this.orientation;
        }

        @Override
        public int hashCode() {
            return this.orientation.hashCode() + this.hoverIndex * 0x1F;
        }

        public final void setHoverIndex(int v) {
            this.hoverIndex = v;
        }

        public final void setOrientation(@NotNull Orientation autoTemplateLayout$GuideLineInfo$Orientation0) {
            Intrinsics.checkNotNullParameter(autoTemplateLayout$GuideLineInfo$Orientation0, "<set-?>");
            this.orientation = autoTemplateLayout$GuideLineInfo$Orientation0;
        }

        @Override
        @NotNull
        public String toString() {
            return "GuideLineInfo(hoverIndex=" + this.hoverIndex + ", orientation=" + this.orientation + ")";
        }
    }

    @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001:\u0002KLB\u0005\u00A2\u0006\u0002\u0010\u0002J\u0016\u0010\u0018\u001A\u00020\u00192\u0006\u0010\u001A\u001A\u00020\u00142\u0006\u0010\u001B\u001A\u00020\u0012J\u001C\u0010\u001C\u001A\u00020\u00192\u0006\u0010\u001D\u001A\u00020\u00142\f\u0010\u001E\u001A\b\u0012\u0004\u0012\u00020\u00120\u0013J\b\u0010\u001F\u001A\u00020\u0019H\u0002J\u0010\u0010 \u001A\u00020\u00192\b\u0010!\u001A\u0004\u0018\u00010\"J\u000E\u0010#\u001A\u00020\u00192\u0006\u0010$\u001A\u00020%J\u000E\u0010&\u001A\u00020\u00192\u0006\u0010$\u001A\u00020%J\u0016\u0010\'\u001A\u00020\u00192\u0006\u0010(\u001A\u00020)2\u0006\u0010$\u001A\u00020%J\u0010\u0010*\u001A\u00020\u00142\u0006\u0010\u001A\u001A\u00020\u0014H\u0002J\u0014\u0010+\u001A\u00020\u00192\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u00120\u0013J\u000E\u0010,\u001A\u00020%2\u0006\u0010\u001A\u001A\u00020\u0014J\u000E\u0010-\u001A\u00020%2\u0006\u0010\u001A\u001A\u00020\u0014J\u000E\u0010.\u001A\u00020%2\u0006\u0010\u001A\u001A\u00020\u0014J\u000E\u0010/\u001A\u00020%2\u0006\u0010\u001A\u001A\u00020\u0014J\u0016\u00100\u001A\u00020\u00192\u0006\u00101\u001A\u00020\u00142\u0006\u00102\u001A\u00020\u0014J\u000E\u00103\u001A\u00020\u00192\u0006\u0010\u001A\u001A\u00020\u0014J\u0016\u00104\u001A\u00020\u00192\u0006\u0010\u001D\u001A\u00020\u00142\u0006\u00105\u001A\u00020\u0014J\u0006\u00106\u001A\u00020\u0019J\u0016\u00107\u001A\u00020\u00192\u0006\u00108\u001A\u0002092\u0006\u0010:\u001A\u000209J\u0016\u0010;\u001A\u00020\u00192\u0006\u00108\u001A\u0002092\u0006\u0010:\u001A\u000209J\u0016\u0010<\u001A\u00020\u00192\u0006\u0010\u001A\u001A\u00020\u00142\u0006\u0010\u001B\u001A\u00020\u0012J\u000E\u0010=\u001A\u00020\u00192\u0006\u0010\u001A\u001A\u00020\u0014J\u000E\u0010>\u001A\u00020\u00192\u0006\u0010\u001A\u001A\u00020\u0014J$\u0010?\u001A\u00020\u00192\u0006\u0010\u001D\u001A\u00020\u00142\u0006\u00105\u001A\u00020\u00142\f\u0010\u001E\u001A\b\u0012\u0004\u0012\u00020\u00120\u0013J\u0016\u0010@\u001A\u00020\u00192\u0006\u0010\u001D\u001A\u00020\u00142\u0006\u0010A\u001A\u00020\u0014J\u0018\u0010B\u001A\u00020\u00192\u0006\u0010C\u001A\u00020\u00142\u0006\u0010D\u001A\u00020\u0014H\u0002J\u0014\u0010E\u001A\u00020%*\u00020F2\u0006\u0010G\u001A\u00020\u0014H\u0002J\u0014\u0010H\u001A\u00020%*\u00020F2\u0006\u0010G\u001A\u00020\u0014H\u0002J&\u0010I\u001A\b\u0012\u0004\u0012\u0002HJ0\u0013\"\u0004\b\u0000\u0010J*\b\u0012\u0004\u0012\u0002HJ0\u00112\u0006\u00105\u001A\u00020\u0014H\u0002R\u000E\u0010\u0003\u001A\u00020\u0004X\u0082\u0004\u00A2\u0006\u0002\n\u0000R(\u0010\u0007\u001A\u0004\u0018\u00010\u00062\b\u0010\u0005\u001A\u0004\u0018\u00010\u0006@FX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000BR\u000E\u0010\f\u001A\u00020\rX\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u000E\u001A\u00020\u000FX\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u000E\u00A2\u0006\u0002\n\u0000R*\u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00140\u0013@BX\u0082\u000E\u00A2\u0006\b\n\u0000\"\u0004\b\u0016\u0010\u0017\u00A8\u0006M"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout$LayoutManager;", "", "()V", "animation", "Landroid/animation/LayoutTransition;", "value", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout;", "autoTemplateLayout", "getAutoTemplateLayout", "()Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout;", "setAutoTemplateLayout", "(Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout;)V", "dragAndDropManager", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout$LayoutManager$DragAndDropManager;", "scroller", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout$LayoutManager$Scroller;", "sizes", "", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout$CellSize;", "", "", "template", "setTemplate", "(Ljava/util/List;)V", "addCellAt", "", "index", "size", "addCellsAt", "startIndex", "items", "createEmptyChildren", "drawGuideLine", "canvas", "Landroid/graphics/Canvas;", "enableAnimation", "enable", "", "enableDragAndDrop", "enableDragAndDropForChild", "view", "Landroid/view/View;", "findLineWith", "initAllCells", "isAtBottom", "isAtEnd", "isAtStart", "isAtTop", "moveCellTo", "fromIndex", "toIndex", "removeCellAt", "removeCellsAt", "count", "stopScroll", "tryScrollDown", "y", "", "threshold", "tryScrollUp", "updateCellAt", "updateCellPaddingAndMargins", "updateCellWithSameSizeAt", "updateCellsAt", "updateChildCellsInRange", "endIndex", "updateLinesIn", "startLine", "endLine", "isLeftTo", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout$GuideLineInfo;", "cellIndex", "isRightTo", "popAsList", "T", "DragAndDropManager", "Scroller", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nAutoTemplateLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoTemplateLayout.kt\ncom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout$LayoutManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,884:1\n1864#2,3:885\n1864#2,3:888\n1549#2:891\n1620#2,3:892\n1549#2:895\n1620#2,3:896\n1864#2,3:899\n1864#2,2:902\n1864#2,3:904\n1866#2:907\n1864#2,3:908\n1559#2:911\n1590#2,4:912\n1559#2:916\n1590#2,4:917\n*S KotlinDebug\n*F\n+ 1 AutoTemplateLayout.kt\ncom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout$LayoutManager\n*L\n292#1:885,3\n317#1:888,3\n376#1:891\n376#1:892,3\n381#1:895\n381#1:896,3\n396#1:899,3\n410#1:902,2\n422#1:904,3\n410#1:907\n517#1:908,3\n831#1:911\n831#1:912,4\n834#1:916\n834#1:917,4\n*E\n"})
    static final class LayoutManager {
        @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001E\u001A\u00020\u001F2\b\u0010 \u001A\u0004\u0018\u00010!J\u000E\u0010\"\u001A\u00020\u001F2\u0006\u0010#\u001A\u00020$J\u0016\u0010%\u001A\u00020\u001F2\u0006\u0010&\u001A\u00020\'2\u0006\u0010#\u001A\u00020$J\u0015\u0010(\u001A\u0004\u0018\u00010\u001F2\u0006\u0010#\u001A\u00020$¢\u0006\u0002\u0010)J\u000E\u0010*\u001A\u00020\u001F2\u0006\u0010#\u001A\u00020$J\u0012\u0010+\u001A\u00020\u001F2\b\u0010,\u001A\u0004\u0018\u00010\u000EH\u0002R\u0013\u0010\u0003\u001A\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001A\u00020\b¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u000E\u0010\u000B\u001A\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\b\u0010\r\u001A\u0004\u0018\u00010\u000E@FX\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001C\u0010\u0014\u001A\u0004\u0018\u00010\u0015X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000E\u0010\u001A\u001A\u00020\u001BX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001C\u001A\u00020\b¢\u0006\b\n\u0000\u001A\u0004\b\u001D\u0010\n¨\u0006-"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout$LayoutManager$DragAndDropManager;", "", "()V", "autoTemplateLayout", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout;", "getAutoTemplateLayout", "()Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout;", "cellHotSpotWidth", "", "getCellHotSpotWidth", "()F", "guideLineArea", "Landroid/graphics/Rect;", "value", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout$GuideLineInfo;", "guideLineInfo", "getGuideLineInfo", "()Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout$GuideLineInfo;", "setGuideLineInfo", "(Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout$GuideLineInfo;)V", "layoutManager", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout$LayoutManager;", "getLayoutManager", "()Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout$LayoutManager;", "setLayoutManager", "(Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout$LayoutManager;)V", "paint", "Landroid/graphics/Paint;", "scrollHotSpotHeight", "getScrollHotSpotHeight", "drawGuideLine", "", "canvas", "Landroid/graphics/Canvas;", "enableDragAndDrop", "enable", "", "enableDragAndDropForChild", "cell", "Landroid/view/View;", "enableDragAndDropForChildren", "(Z)Lkotlin/Unit;", "enableDragAndDropForLayout", "updateLayoutWithGuideLine", "previous", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nAutoTemplateLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoTemplateLayout.kt\ncom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout$LayoutManager$DragAndDropManager\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,884:1\n1313#2,2:885\n*S KotlinDebug\n*F\n+ 1 AutoTemplateLayout.kt\ncom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout$LayoutManager$DragAndDropManager\n*L\n572#1:885,2\n*E\n"})
        static final class DragAndDropManager {
            private final float cellHotSpotWidth;
            @NotNull
            private final Rect guideLineArea;
            @Nullable
            private GuideLineInfo guideLineInfo;
            @Nullable
            private LayoutManager layoutManager;
            @NotNull
            private final Paint paint;
            private final float scrollHotSpotHeight;

            public DragAndDropManager() {
                this.scrollHotSpotHeight = AutoTemplateLayout.Companion.dp2px(50.0f);
                this.cellHotSpotWidth = AutoTemplateLayout.Companion.dp2px(30.0f);
                this.paint = new Paint();
                this.guideLineArea = new Rect();
            }

            // 检测为 Lambda 实现
            public static boolean a(DragAndDropManager autoTemplateLayout$LayoutManager$DragAndDropManager0, View view0, DragEvent dragEvent0) [...]

            // 检测为 Lambda 实现
            public static boolean b(DragAndDropManager autoTemplateLayout$LayoutManager$DragAndDropManager0, View view0, View view1) [...]

            public final void drawGuideLine(@Nullable Canvas canvas0) {
                int v3;
                View view0;
                AutoTemplateLayout autoTemplateLayout0 = this.getAutoTemplateLayout();
                if(autoTemplateLayout0 == null) {
                    return;
                }
                GuideLineInfo autoTemplateLayout$GuideLineInfo0 = this.guideLineInfo;
                if(autoTemplateLayout$GuideLineInfo0 != null) {
                    Intrinsics.checkNotNull(autoTemplateLayout$GuideLineInfo0);
                    if(autoTemplateLayout$GuideLineInfo0.getHoverIndex() >= 0) {
                        AutoTemplateLayout autoTemplateLayout1 = this.getAutoTemplateLayout();
                        if(autoTemplateLayout1 == null) {
                            view0 = null;
                        }
                        else {
                            GuideLineInfo autoTemplateLayout$GuideLineInfo1 = this.guideLineInfo;
                            Intrinsics.checkNotNull(autoTemplateLayout$GuideLineInfo1);
                            view0 = autoTemplateLayout1.getChildAt(autoTemplateLayout$GuideLineInfo1.getHoverIndex());
                        }
                        if(view0 == null) {
                            return;
                        }
                        GuideLineInfo autoTemplateLayout$GuideLineInfo2 = this.guideLineInfo;
                        Intrinsics.checkNotNull(autoTemplateLayout$GuideLineInfo2);
                        int v = 0;
                        int v1 = autoTemplateLayout0.layoutManager.isAtBottom(autoTemplateLayout$GuideLineInfo2.getHoverIndex()) ? 0 : autoTemplateLayout0.getInnerPadding() / 2;
                        GuideLineInfo autoTemplateLayout$GuideLineInfo3 = this.guideLineInfo;
                        Intrinsics.checkNotNull(autoTemplateLayout$GuideLineInfo3);
                        if(!autoTemplateLayout0.layoutManager.isAtTop(autoTemplateLayout$GuideLineInfo3.getHoverIndex())) {
                            v = autoTemplateLayout0.getInnerPadding() / 2;
                        }
                        int v2 = view0.getMeasuredHeight() - v - v1;
                        if(autoTemplateLayout0.getGuideLineDrawable() == null) {
                            v3 = 10;
                        }
                        else {
                            Drawable drawable0 = autoTemplateLayout0.getGuideLineDrawable();
                            Intrinsics.checkNotNull(drawable0);
                            if(drawable0.getIntrinsicWidth() > 0) {
                                Drawable drawable1 = autoTemplateLayout0.getGuideLineDrawable();
                                Intrinsics.checkNotNull(drawable1);
                                v3 = drawable1.getIntrinsicWidth();
                            }
                            else {
                                v3 = 10;
                            }
                        }
                        if((this.guideLineInfo == null ? null : this.guideLineInfo.getOrientation()) == Orientation.TO_LEFT) {
                            int v4 = ((int)view0.getX()) - v3;
                            int v5 = ((int)view0.getY()) + v;
                            int v6 = (int)view0.getX();
                            int v7 = ((int)view0.getY()) + v2 + v;
                            this.guideLineArea.set(v4, v5, v6, v7);
                        }
                        else {
                            int v8 = (int)view0.getX();
                            int v9 = view0.getMeasuredWidth();
                            int v10 = ((int)view0.getY()) + v;
                            int v11 = (int)view0.getX();
                            int v12 = view0.getMeasuredWidth();
                            int v13 = ((int)view0.getY()) + v2 + v;
                            this.guideLineArea.set(v9 + v8, v10, v12 + v11 + v3, v13);
                        }
                        if(autoTemplateLayout0.getGuideLineDrawable() == null) {
                            Integer integer1 = autoTemplateLayout0.getGuideLineTint();
                            this.paint.setColor((integer1 == null ? 0xFF000000 : ((int)integer1)));
                            if(canvas0 != null) {
                                canvas0.drawRect(this.guideLineArea, this.paint);
                            }
                        }
                        else {
                            Drawable drawable2 = autoTemplateLayout0.getGuideLineDrawable();
                            Intrinsics.checkNotNull(drawable2);
                            Bitmap bitmap0 = DrawableKt.toBitmap$default(drawable2, v3, v2, null, 4, null);
                            Integer integer0 = autoTemplateLayout0.getGuideLineTint();
                            if(integer0 != null) {
                                PorterDuffColorFilter porterDuffColorFilter0 = new PorterDuffColorFilter(integer0.intValue(), PorterDuff.Mode.SRC_IN);
                                this.paint.setColorFilter(porterDuffColorFilter0);
                            }
                            if(canvas0 != null) {
                                canvas0.drawBitmap(bitmap0, null, this.guideLineArea, this.paint);
                            }
                        }
                    }
                }
            }

            public final void enableDragAndDrop(boolean z) {
                this.enableDragAndDropForChildren(z);
                this.enableDragAndDropForLayout(z);
            }

            public final void enableDragAndDropForChild(@NotNull View view0, boolean z) {
                Intrinsics.checkNotNullParameter(view0, "cell");
                if(!z) {
                    view0.setOnLongClickListener(null);
                    return;
                }
                view0.setOnLongClickListener((View view1) -> DragAndDropManager.enableDragAndDropForChild$lambda$2(this, view0, view1));
            }

            private static final boolean enableDragAndDropForChild$lambda$2(DragAndDropManager autoTemplateLayout$LayoutManager$DragAndDropManager0, View view0, View view1) {
                Intrinsics.checkNotNullParameter(autoTemplateLayout$LayoutManager$DragAndDropManager0, "this$0");
                Intrinsics.checkNotNullParameter(view0, "$cell");
                AutoTemplateLayout autoTemplateLayout0 = autoTemplateLayout$LayoutManager$DragAndDropManager0.getAutoTemplateLayout();
                if(autoTemplateLayout0 != null) {
                    View.DragShadowBuilder view$DragShadowBuilder0 = new View.DragShadowBuilder(view1);
                    OnCellDragListener autoTemplateLayout$OnCellDragListener0 = autoTemplateLayout0.getCellDragListener();
                    if(autoTemplateLayout$OnCellDragListener0 != null) {
                        autoTemplateLayout$OnCellDragListener0.onDragStateChanged(DragState.START_DRAG);
                    }
                    return autoTemplateLayout0.startDragAndDrop(null, view$DragShadowBuilder0, view0, 0);
                }
                return false;
            }

            @Nullable
            public final Unit enableDragAndDropForChildren(boolean z) {
                AutoTemplateLayout autoTemplateLayout0 = this.getAutoTemplateLayout();
                if(autoTemplateLayout0 != null) {
                    Sequence sequence0 = ViewGroupKt.getChildren(autoTemplateLayout0);
                    if(sequence0 != null) {
                        for(Object object0: sequence0) {
                            this.enableDragAndDropForChild(((View)object0), z);
                        }
                        return Unit.INSTANCE;
                    }
                }
                return null;
            }

            public final void enableDragAndDropForLayout(boolean z) {
                if(!z) {
                    AutoTemplateLayout autoTemplateLayout0 = this.getAutoTemplateLayout();
                    if(autoTemplateLayout0 != null) {
                        autoTemplateLayout0.setOnDragListener(null);
                    }
                    return;
                }
                AutoTemplateLayout autoTemplateLayout1 = this.getAutoTemplateLayout();
                if(autoTemplateLayout1 != null) {
                    autoTemplateLayout1.setOnDragListener((View view0, DragEvent dragEvent0) -> DragAndDropManager.enableDragAndDropForLayout$lambda$5(this, view0, dragEvent0));
                }
            }

            private static final boolean enableDragAndDropForLayout$lambda$5(DragAndDropManager autoTemplateLayout$LayoutManager$DragAndDropManager0, View view0, DragEvent dragEvent0) {
                int v3;
                GuideLineInfo autoTemplateLayout$GuideLineInfo0 = null;
                Intrinsics.checkNotNullParameter(autoTemplateLayout$LayoutManager$DragAndDropManager0, "this$0");
                int v = dragEvent0.getAction();
                if(v == 1) {
                    Object object2 = dragEvent0.getLocalState();
                    Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type android.view.View");
                    ((View)object2).setAlpha(0.5f);
                    AutoTemplateLayout autoTemplateLayout6 = autoTemplateLayout$LayoutManager$DragAndDropManager0.getAutoTemplateLayout();
                    if(autoTemplateLayout6 != null) {
                        OnCellDragListener autoTemplateLayout$OnCellDragListener2 = autoTemplateLayout6.getCellDragListener();
                        if(autoTemplateLayout$OnCellDragListener2 != null) {
                            autoTemplateLayout$OnCellDragListener2.onDragStateChanged(DragState.ON_DRAG);
                        }
                    }
                }
                else {
                    switch(v) {
                        case 2: {
                            Rect rect0 = new Rect();
                            AutoTemplateLayout autoTemplateLayout0 = autoTemplateLayout$LayoutManager$DragAndDropManager0.getAutoTemplateLayout();
                            if(autoTemplateLayout0 != null) {
                                autoTemplateLayout0.getLocalVisibleRect(rect0);
                            }
                            LayoutManager autoTemplateLayout$LayoutManager0 = autoTemplateLayout$LayoutManager$DragAndDropManager0.layoutManager;
                            if(autoTemplateLayout$LayoutManager0 != null) {
                                if(dragEvent0.getY() > ((float)rect0.top) && dragEvent0.getY() < ((float)rect0.top) + autoTemplateLayout$LayoutManager$DragAndDropManager0.scrollHotSpotHeight) {
                                    autoTemplateLayout$LayoutManager0.tryScrollUp(dragEvent0.getY(), ((float)rect0.top) + autoTemplateLayout$LayoutManager$DragAndDropManager0.scrollHotSpotHeight);
                                }
                                else if(dragEvent0.getY() >= ((float)rect0.bottom) || dragEvent0.getY() <= ((float)rect0.bottom) - autoTemplateLayout$LayoutManager$DragAndDropManager0.scrollHotSpotHeight) {
                                    autoTemplateLayout$LayoutManager0.stopScroll();
                                }
                                else {
                                    autoTemplateLayout$LayoutManager0.tryScrollDown(dragEvent0.getY(), ((float)rect0.bottom) - autoTemplateLayout$LayoutManager$DragAndDropManager0.scrollHotSpotHeight);
                                }
                            }
                            AutoTemplateLayout autoTemplateLayout1 = autoTemplateLayout$LayoutManager$DragAndDropManager0.getAutoTemplateLayout();
                            View view1 = autoTemplateLayout1 == null ? null : autoTemplateLayout1.findCellAtPosition(dragEvent0.getX(), dragEvent0.getY());
                            AutoTemplateLayout autoTemplateLayout2 = autoTemplateLayout$LayoutManager$DragAndDropManager0.getAutoTemplateLayout();
                            int v1 = autoTemplateLayout2 == null ? -1 : autoTemplateLayout2.indexOfChild(view1);
                            boolean z = false;
                            if(view1 != null && v1 != -1) {
                                boolean z1 = Float.compare(dragEvent0.getX(), view1.getX()) > 0 && dragEvent0.getX() < view1.getX() + autoTemplateLayout$LayoutManager$DragAndDropManager0.cellHotSpotWidth && dragEvent0.getY() > view1.getY() && dragEvent0.getY() < view1.getY() + ((float)view1.getMeasuredHeight());
                                if(dragEvent0.getX() < view1.getX() + ((float)view1.getMeasuredWidth()) && dragEvent0.getX() > view1.getX() + ((float)view1.getMeasuredWidth()) - autoTemplateLayout$LayoutManager$DragAndDropManager0.cellHotSpotWidth && dragEvent0.getY() > view1.getY() && dragEvent0.getY() < view1.getY() + ((float)view1.getMeasuredHeight())) {
                                    z = true;
                                }
                                if(z1) {
                                    autoTemplateLayout$GuideLineInfo0 = new GuideLineInfo(v1, Orientation.TO_LEFT);
                                }
                                else if(z) {
                                    autoTemplateLayout$GuideLineInfo0 = new GuideLineInfo(v1, Orientation.TO_RIGHT);
                                }
                                autoTemplateLayout$LayoutManager$DragAndDropManager0.setGuideLineInfo(autoTemplateLayout$GuideLineInfo0);
                                return true;
                            }
                            return true;
                        }
                        case 3: {
                            LayoutManager autoTemplateLayout$LayoutManager2 = autoTemplateLayout$LayoutManager$DragAndDropManager0.layoutManager;
                            if(autoTemplateLayout$LayoutManager2 != null) {
                                autoTemplateLayout$LayoutManager2.stopScroll();
                            }
                            if(autoTemplateLayout$LayoutManager$DragAndDropManager0.guideLineInfo == null) {
                                return true;
                            }
                            Object object0 = dragEvent0.getLocalState();
                            Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type android.view.View");
                            AutoTemplateLayout autoTemplateLayout3 = autoTemplateLayout$LayoutManager$DragAndDropManager0.getAutoTemplateLayout();
                            if(autoTemplateLayout3 == null) {
                                return true;
                            }
                            int v2 = autoTemplateLayout3.indexOfChild(((View)object0));
                            ((View)object0).setAlpha(1.0f);
                            GuideLineInfo autoTemplateLayout$GuideLineInfo1 = autoTemplateLayout$LayoutManager$DragAndDropManager0.guideLineInfo;
                            Intrinsics.checkNotNull(autoTemplateLayout$GuideLineInfo1);
                            if(autoTemplateLayout$GuideLineInfo1.getHoverIndex() >= 0) {
                                GuideLineInfo autoTemplateLayout$GuideLineInfo2 = autoTemplateLayout$LayoutManager$DragAndDropManager0.guideLineInfo;
                                Intrinsics.checkNotNull(autoTemplateLayout$GuideLineInfo2);
                                if(autoTemplateLayout$GuideLineInfo2.getOrientation() == Orientation.TO_RIGHT) {
                                    GuideLineInfo autoTemplateLayout$GuideLineInfo3 = autoTemplateLayout$LayoutManager$DragAndDropManager0.guideLineInfo;
                                    Intrinsics.checkNotNull(autoTemplateLayout$GuideLineInfo3);
                                    v3 = autoTemplateLayout$GuideLineInfo3.getHoverIndex() + 1;
                                }
                                else {
                                    GuideLineInfo autoTemplateLayout$GuideLineInfo4 = autoTemplateLayout$LayoutManager$DragAndDropManager0.guideLineInfo;
                                    Intrinsics.checkNotNull(autoTemplateLayout$GuideLineInfo4);
                                    v3 = autoTemplateLayout$GuideLineInfo4.getHoverIndex();
                                }
                                LayoutManager autoTemplateLayout$LayoutManager3 = autoTemplateLayout$LayoutManager$DragAndDropManager0.layoutManager;
                                if(autoTemplateLayout$LayoutManager3 != null) {
                                    autoTemplateLayout$LayoutManager3.moveCellTo(v2, v3);
                                }
                            }
                            autoTemplateLayout$LayoutManager$DragAndDropManager0.setGuideLineInfo(null);
                            AutoTemplateLayout autoTemplateLayout4 = autoTemplateLayout$LayoutManager$DragAndDropManager0.getAutoTemplateLayout();
                            if(autoTemplateLayout4 != null) {
                                OnCellDragListener autoTemplateLayout$OnCellDragListener0 = autoTemplateLayout4.getCellDragListener();
                                if(autoTemplateLayout$OnCellDragListener0 != null) {
                                    autoTemplateLayout$OnCellDragListener0.onDragStateChanged(DragState.DROP_ON_LAYOUT);
                                    return true;
                                }
                            }
                            break;
                        }
                        case 4: {
                            Object object1 = dragEvent0.getLocalState();
                            Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type android.view.View");
                            ((View)object1).setAlpha(1.0f);
                            autoTemplateLayout$LayoutManager$DragAndDropManager0.setGuideLineInfo(null);
                            AutoTemplateLayout autoTemplateLayout5 = autoTemplateLayout$LayoutManager$DragAndDropManager0.getAutoTemplateLayout();
                            if(autoTemplateLayout5 != null) {
                                OnCellDragListener autoTemplateLayout$OnCellDragListener1 = autoTemplateLayout5.getCellDragListener();
                                if(autoTemplateLayout$OnCellDragListener1 != null) {
                                    autoTemplateLayout$OnCellDragListener1.onDragStateChanged(DragState.IDLE);
                                    return true;
                                }
                            }
                            break;
                        }
                        case 6: {
                            LayoutManager autoTemplateLayout$LayoutManager1 = autoTemplateLayout$LayoutManager$DragAndDropManager0.layoutManager;
                            if(autoTemplateLayout$LayoutManager1 != null) {
                                autoTemplateLayout$LayoutManager1.stopScroll();
                            }
                            autoTemplateLayout$LayoutManager$DragAndDropManager0.setGuideLineInfo(null);
                            return true;
                        }
                        default: {
                            return true;
                        }
                    }
                }
                return true;
            }

            @Nullable
            public final AutoTemplateLayout getAutoTemplateLayout() {
                return this.layoutManager == null ? null : this.layoutManager.getAutoTemplateLayout();
            }

            public final float getCellHotSpotWidth() {
                return this.cellHotSpotWidth;
            }

            @Nullable
            public final GuideLineInfo getGuideLineInfo() {
                return this.guideLineInfo;
            }

            @Nullable
            public final LayoutManager getLayoutManager() {
                return this.layoutManager;
            }

            public final float getScrollHotSpotHeight() {
                return this.scrollHotSpotHeight;
            }

            public final void setGuideLineInfo(@Nullable GuideLineInfo autoTemplateLayout$GuideLineInfo0) {
                GuideLineInfo autoTemplateLayout$GuideLineInfo1 = this.guideLineInfo;
                this.guideLineInfo = autoTemplateLayout$GuideLineInfo0;
                this.updateLayoutWithGuideLine(autoTemplateLayout$GuideLineInfo1);
            }

            public final void setLayoutManager(@Nullable LayoutManager autoTemplateLayout$LayoutManager0) {
                this.layoutManager = autoTemplateLayout$LayoutManager0;
            }

            private final void updateLayoutWithGuideLine(GuideLineInfo autoTemplateLayout$GuideLineInfo0) {
                if(autoTemplateLayout$GuideLineInfo0 != null) {
                    LayoutManager autoTemplateLayout$LayoutManager0 = this.layoutManager;
                    if(autoTemplateLayout$LayoutManager0 != null) {
                        autoTemplateLayout$LayoutManager0.updateCellPaddingAndMargins(autoTemplateLayout$GuideLineInfo0.getHoverIndex());
                        if(!autoTemplateLayout$LayoutManager0.isAtStart(autoTemplateLayout$GuideLineInfo0.getHoverIndex()) && autoTemplateLayout$GuideLineInfo0.getOrientation() == Orientation.TO_LEFT) {
                            autoTemplateLayout$LayoutManager0.updateCellPaddingAndMargins(autoTemplateLayout$GuideLineInfo0.getHoverIndex() - 1);
                        }
                        else if(!autoTemplateLayout$LayoutManager0.isAtEnd(autoTemplateLayout$GuideLineInfo0.getHoverIndex()) && autoTemplateLayout$GuideLineInfo0.getOrientation() == Orientation.TO_RIGHT) {
                            autoTemplateLayout$LayoutManager0.updateCellPaddingAndMargins(autoTemplateLayout$GuideLineInfo0.getHoverIndex() + 1);
                        }
                    }
                }
                GuideLineInfo autoTemplateLayout$GuideLineInfo1 = this.guideLineInfo;
                if(autoTemplateLayout$GuideLineInfo1 != null) {
                    LayoutManager autoTemplateLayout$LayoutManager1 = this.layoutManager;
                    if(autoTemplateLayout$LayoutManager1 != null) {
                        autoTemplateLayout$LayoutManager1.updateCellPaddingAndMargins(autoTemplateLayout$GuideLineInfo1.getHoverIndex());
                        if(!autoTemplateLayout$LayoutManager1.isAtStart(autoTemplateLayout$GuideLineInfo1.getHoverIndex()) && autoTemplateLayout$GuideLineInfo1.getOrientation() == Orientation.TO_LEFT) {
                            autoTemplateLayout$LayoutManager1.updateCellPaddingAndMargins(autoTemplateLayout$GuideLineInfo1.getHoverIndex() - 1);
                        }
                        else if(!autoTemplateLayout$LayoutManager1.isAtEnd(autoTemplateLayout$GuideLineInfo1.getHoverIndex()) && autoTemplateLayout$GuideLineInfo1.getOrientation() == Orientation.TO_RIGHT) {
                            autoTemplateLayout$LayoutManager1.updateCellPaddingAndMargins(autoTemplateLayout$GuideLineInfo1.getHoverIndex() + 1);
                        }
                    }
                }
                AutoTemplateLayout autoTemplateLayout0 = this.getAutoTemplateLayout();
                if(autoTemplateLayout0 != null) {
                    autoTemplateLayout0.invalidate();
                }
            }
        }

        @Metadata(d1 = {"\u0000?\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b*\u0001\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0015\u001A\u00020\u00162\u0006\u0010\u0017\u001A\u00020\u00182\u0006\u0010\u0019\u001A\u00020\u0018H\u0002J\b\u0010\u001A\u001A\u00020\u000FH\u0002J\b\u0010\u001B\u001A\u00020\u000FH\u0002J\b\u0010\u001C\u001A\u00020\u0016H\u0002J\u0006\u0010\u001D\u001A\u00020\u0016J\u0016\u0010\u001E\u001A\u00020\u00162\u0006\u0010\u0017\u001A\u00020\u00182\u0006\u0010\u0019\u001A\u00020\u0018J\u0016\u0010\u001F\u001A\u00020\u00162\u0006\u0010\u0017\u001A\u00020\u00182\u0006\u0010\u0019\u001A\u00020\u0018R\u0010\u0010\u0003\u001A\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005R\u000E\u0010\u0006\u001A\u00020\u0007X\u0082\u000E¢\u0006\u0002\n\u0000R\u001C\u0010\b\u001A\u0004\u0018\u00010\tX\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\n\u0010\u000B\"\u0004\b\f\u0010\rR\u000E\u0010\u000E\u001A\u00020\u000FX\u0082\u000E¢\u0006\u0002\n\u0000R\u000E\u0010\u0010\u001A\u00020\u000FX\u0082\u000E¢\u0006\u0002\n\u0000R\u0013\u0010\u0011\u001A\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001A\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout$LayoutManager$Scroller;", "", "()V", "autoScrollRunnable", "com/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout$LayoutManager$Scroller$autoScrollRunnable$1", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout$LayoutManager$Scroller$autoScrollRunnable$1;", "autoScrollVelocity", "", "autoTemplateLayout", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout;", "getAutoTemplateLayout", "()Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout;", "setAutoTemplateLayout", "(Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout;)V", "isInBottomScrollHotSpot", "", "isInTopScrollHotSpot", "scrollableLayout", "Landroid/view/View;", "getScrollableLayout", "()Landroid/view/View;", "calculateScrollVelocity", "", "y", "", "threshold", "isBottomShown", "isTopShown", "startAutoScroll", "stopScroll", "tryScrollDown", "tryScrollUp", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class Scroller {
            @NotNull
            private final com.kakao.keditor.plugin.pluginspec.imagegrid.layout.AutoTemplateLayout.LayoutManager.Scroller.autoScrollRunnable.1 autoScrollRunnable;
            private int autoScrollVelocity;
            @Nullable
            private AutoTemplateLayout autoTemplateLayout;
            private boolean isInBottomScrollHotSpot;
            private boolean isInTopScrollHotSpot;

            public Scroller() {
                this.autoScrollRunnable = new Runnable() {
                    @Override
                    public void run() {
                        if(Scroller.this.autoScrollVelocity < 0 && Scroller.this.isTopShown()) {
                            return;
                        }
                        if(Scroller.this.autoScrollVelocity > 0 && Scroller.this.isBottomShown()) {
                            return;
                        }
                        View view0 = Scroller.this.getScrollableLayout();
                        if(view0 != null) {
                            view0.scrollBy(0, Scroller.this.autoScrollVelocity);
                        }
                        View view1 = Scroller.this.getScrollableLayout();
                        if(view1 != null) {
                            Handler handler0 = view1.getHandler();
                            if(handler0 != null) {
                                handler0.postDelayed(this, 10L);
                            }
                        }
                    }
                };
            }

            private final void calculateScrollVelocity(float f, float f1) {
                this.autoScrollVelocity = (int)((f - f1) / 2.0f);
            }

            @Nullable
            public final AutoTemplateLayout getAutoTemplateLayout() {
                return this.autoTemplateLayout;
            }

            @Nullable
            public final View getScrollableLayout() {
                return this.autoTemplateLayout == null ? null : this.autoTemplateLayout.getScrollableLayout();
            }

            private final boolean isBottomShown() {
                Rect rect0 = new Rect();
                AutoTemplateLayout autoTemplateLayout0 = this.autoTemplateLayout;
                if(autoTemplateLayout0 != null) {
                    autoTemplateLayout0.getLocalVisibleRect(rect0);
                }
                return this.autoTemplateLayout != null && rect0.bottom == this.autoTemplateLayout.getMeasuredWidth();
            }

            private final boolean isTopShown() {
                Rect rect0 = new Rect();
                AutoTemplateLayout autoTemplateLayout0 = this.autoTemplateLayout;
                if(autoTemplateLayout0 != null) {
                    autoTemplateLayout0.getLocalVisibleRect(rect0);
                }
                return rect0.top == 0;
            }

            public final void setAutoTemplateLayout(@Nullable AutoTemplateLayout autoTemplateLayout0) {
                this.autoTemplateLayout = autoTemplateLayout0;
            }

            private final void startAutoScroll() {
                View view0 = this.getScrollableLayout();
                if(view0 != null) {
                    Handler handler0 = view0.getHandler();
                    if(handler0 != null) {
                        handler0.removeCallbacks(this.autoScrollRunnable);
                    }
                }
                View view1 = this.getScrollableLayout();
                if(view1 != null) {
                    Handler handler1 = view1.getHandler();
                    if(handler1 != null) {
                        handler1.post(this.autoScrollRunnable);
                    }
                }
            }

            public final void stopScroll() {
                this.isInBottomScrollHotSpot = false;
                this.isInTopScrollHotSpot = false;
                View view0 = this.getScrollableLayout();
                if(view0 != null) {
                    Handler handler0 = view0.getHandler();
                    if(handler0 != null) {
                        handler0.removeCallbacks(this.autoScrollRunnable);
                    }
                }
            }

            public final void tryScrollDown(float f, float f1) {
                this.calculateScrollVelocity(f, f1);
                if(!this.isInBottomScrollHotSpot) {
                    this.isInBottomScrollHotSpot = true;
                    this.startAutoScroll();
                }
            }

            public final void tryScrollUp(float f, float f1) {
                this.calculateScrollVelocity(f, f1);
                if(!this.isInTopScrollHotSpot) {
                    this.isInTopScrollHotSpot = true;
                    this.startAutoScroll();
                }
            }
        }

        @NotNull
        private final LayoutTransition animation;
        @Nullable
        private AutoTemplateLayout autoTemplateLayout;
        @NotNull
        private final DragAndDropManager dragAndDropManager;
        @NotNull
        private final Scroller scroller;
        @NotNull
        private List sizes;
        @NotNull
        private List template;

        public LayoutManager() {
            this.sizes = new ArrayList();
            this.template = CollectionsKt__CollectionsKt.emptyList();
            DragAndDropManager autoTemplateLayout$LayoutManager$DragAndDropManager0 = new DragAndDropManager();
            autoTemplateLayout$LayoutManager$DragAndDropManager0.setLayoutManager(this);
            this.dragAndDropManager = autoTemplateLayout$LayoutManager$DragAndDropManager0;
            Scroller autoTemplateLayout$LayoutManager$Scroller0 = new Scroller();
            autoTemplateLayout$LayoutManager$Scroller0.setAutoTemplateLayout(this.autoTemplateLayout);
            this.scroller = autoTemplateLayout$LayoutManager$Scroller0;
            this.animation = new LayoutTransition();
        }

        // 检测为 Lambda 实现
        public static void a(LayoutManager autoTemplateLayout$LayoutManager0) [...]

        public final void addCellAt(int v, @NotNull CellSize autoTemplateLayout$CellSize0) throws IndexOutOfBoundsException, ArithmeticException {
            View view0;
            Intrinsics.checkNotNullParameter(autoTemplateLayout$CellSize0, "size");
            AutoTemplateLayout autoTemplateLayout0 = this.autoTemplateLayout;
            if(autoTemplateLayout0 == null) {
                return;
            }
            this.sizes.add(v, autoTemplateLayout$CellSize0);
            Adapter autoTemplateLayout$Adapter0 = autoTemplateLayout0.getAdapter();
            if(autoTemplateLayout$Adapter0 == null) {
                view0 = null;
            }
            else {
                Cell autoTemplateLayout$Cell0 = autoTemplateLayout$Adapter0.createViewHolder();
                view0 = autoTemplateLayout$Cell0 == null ? null : autoTemplateLayout$Cell0.getView();
            }
            autoTemplateLayout0.addView(view0, v);
            this.updateChildCellsInRange(v, CollectionsKt__CollectionsKt.getLastIndex(this.sizes));
        }

        public final void addCellsAt(int v, @NotNull List list0) throws IndexOutOfBoundsException, ArithmeticException {
            View view0;
            Intrinsics.checkNotNullParameter(list0, "items");
            AutoTemplateLayout autoTemplateLayout0 = this.autoTemplateLayout;
            if(autoTemplateLayout0 == null) {
                return;
            }
            int v1 = 0;
            for(Object object0: list0) {
                if(v1 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                int v2 = v1 + v;
                this.sizes.add(v2, ((CellSize)object0));
                Adapter autoTemplateLayout$Adapter0 = autoTemplateLayout0.getAdapter();
                if(autoTemplateLayout$Adapter0 == null) {
                    view0 = null;
                }
                else {
                    Cell autoTemplateLayout$Cell0 = autoTemplateLayout$Adapter0.createViewHolder();
                    if(autoTemplateLayout$Cell0 != null) {
                        view0 = autoTemplateLayout$Cell0.getView();
                    }
                }
                autoTemplateLayout0.addView(view0, v2);
                ++v1;
            }
            this.updateChildCellsInRange(v, CollectionsKt__CollectionsKt.getLastIndex(this.sizes));
        }

        private final void createEmptyChildren() {
            View view0;
            int v1;
            AutoTemplateLayout autoTemplateLayout0 = this.autoTemplateLayout;
            if(autoTemplateLayout0 != null) {
                autoTemplateLayout0.setAnimationEnabled(false);
            }
            AutoTemplateLayout autoTemplateLayout1 = this.autoTemplateLayout;
            if(autoTemplateLayout1 != null) {
                autoTemplateLayout1.removeAllViews();
            }
            AutoTemplateLayout autoTemplateLayout2 = this.autoTemplateLayout;
            if(autoTemplateLayout2 == null) {
                v1 = 0;
            }
            else {
                Adapter autoTemplateLayout$Adapter0 = autoTemplateLayout2.getAdapter();
                if(autoTemplateLayout$Adapter0 == null) {
                    v1 = 0;
                }
                else {
                    List list0 = autoTemplateLayout$Adapter0.getItems();
                    v1 = list0 == null ? 0 : list0.size();
                }
            }
            for(int v = 0; v < v1; ++v) {
                AutoTemplateLayout autoTemplateLayout3 = this.autoTemplateLayout;
                if(autoTemplateLayout3 != null) {
                    Adapter autoTemplateLayout$Adapter1 = autoTemplateLayout3.getAdapter();
                    if(autoTemplateLayout$Adapter1 == null) {
                        view0 = null;
                    }
                    else {
                        Cell autoTemplateLayout$Cell0 = autoTemplateLayout$Adapter1.createViewHolder();
                        if(autoTemplateLayout$Cell0 != null) {
                            view0 = autoTemplateLayout$Cell0.getView();
                        }
                    }
                    autoTemplateLayout3.addView(view0);
                }
            }
            AutoTemplateLayout autoTemplateLayout4 = this.autoTemplateLayout;
            if(autoTemplateLayout4 != null) {
                autoTemplateLayout4.setAnimationEnabled(true);
            }
        }

        public final void drawGuideLine(@Nullable Canvas canvas0) {
            this.dragAndDropManager.drawGuideLine(canvas0);
        }

        public final void enableAnimation(boolean z) {
            AutoTemplateLayout autoTemplateLayout0 = this.autoTemplateLayout;
            if(autoTemplateLayout0 != null) {
                autoTemplateLayout0.setLayoutTransition((z ? this.animation : null));
            }
        }

        public final void enableDragAndDrop(boolean z) {
            AutoTemplateLayout autoTemplateLayout0 = this.autoTemplateLayout;
            if(autoTemplateLayout0 != null) {
                autoTemplateLayout0.setWillNotDraw(!z);
            }
            this.dragAndDropManager.enableDragAndDrop(z);
        }

        public final void enableDragAndDropForChild(@NotNull View view0, boolean z) {
            Intrinsics.checkNotNullParameter(view0, "view");
            this.dragAndDropManager.enableDragAndDropForChild(view0, z);
        }

        private final int findLineWith(int v) {
            int v1 = 0;
            for(Object object0: this.template) {
                if(v1 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                v -= ((Number)object0).intValue();
                if(v < 0) {
                    return v1;
                }
                ++v1;
            }
            return CollectionsKt__CollectionsKt.getLastIndex(this.template);
        }

        @Nullable
        public final AutoTemplateLayout getAutoTemplateLayout() {
            return this.autoTemplateLayout;
        }

        public final void initAllCells(@NotNull List list0) {
            Intrinsics.checkNotNullParameter(list0, "sizes");
            AutoTemplateLayout autoTemplateLayout0 = this.autoTemplateLayout;
            if(autoTemplateLayout0 == null) {
                return;
            }
            List list1 = CollectionsKt___CollectionsKt.toMutableList(list0);
            this.sizes = list1;
            this.setTemplate(autoTemplateLayout0.makeTemplate(list1.size()));
            this.createEmptyChildren();
            autoTemplateLayout0.post(() -> LayoutManager.initAllCells$lambda$2(this));
        }

        private static final void initAllCells$lambda$2(LayoutManager autoTemplateLayout$LayoutManager0) {
            Intrinsics.checkNotNullParameter(autoTemplateLayout$LayoutManager0, "this$0");
            autoTemplateLayout$LayoutManager0.updateChildCellsInRange(0, autoTemplateLayout$LayoutManager0.sizes.size());
        }

        public final boolean isAtBottom(int v) {
            int v1 = this.sizes.size();
            int v2 = ((Number)this.template.get(CollectionsKt__CollectionsKt.getLastIndex(this.template))).intValue();
            return v < this.sizes.size() && v1 - v2 <= v;
        }

        public final boolean isAtEnd(int v) {
            Iterable iterable0 = this.template;
            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
            int v1 = 0;
            for(Object object0: iterable0) {
                if(v1 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                ((Number)object0).intValue();
                arrayList0.add(((int)(CollectionsKt___CollectionsKt.sumOfInt(this.template.subList(0, v1 + 1)) - 1)));
                ++v1;
            }
            return arrayList0.contains(v);
        }

        public final boolean isAtStart(int v) {
            Iterable iterable0 = this.template;
            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
            int v1 = 0;
            for(Object object0: iterable0) {
                if(v1 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                ((Number)object0).intValue();
                arrayList0.add(CollectionsKt___CollectionsKt.sumOfInt(this.template.subList(0, v1)));
                ++v1;
            }
            return arrayList0.contains(v);
        }

        public final boolean isAtTop(int v) {
            return v >= 0 && v < ((Number)this.template.get(0)).intValue();
        }

        // 去混淆评级： 低(20)
        private final boolean isLeftTo(GuideLineInfo autoTemplateLayout$GuideLineInfo0, int v) {
            return autoTemplateLayout$GuideLineInfo0.getHoverIndex() == v && autoTemplateLayout$GuideLineInfo0.getOrientation() == Orientation.TO_LEFT || !this.isAtStart(v) && autoTemplateLayout$GuideLineInfo0.getHoverIndex() == v - 1 && autoTemplateLayout$GuideLineInfo0.getOrientation() == Orientation.TO_RIGHT;
        }

        // 去混淆评级： 低(20)
        private final boolean isRightTo(GuideLineInfo autoTemplateLayout$GuideLineInfo0, int v) {
            return autoTemplateLayout$GuideLineInfo0.getHoverIndex() == v && autoTemplateLayout$GuideLineInfo0.getOrientation() == Orientation.TO_RIGHT || !this.isAtEnd(v) && autoTemplateLayout$GuideLineInfo0.getHoverIndex() == v + 1 && autoTemplateLayout$GuideLineInfo0.getOrientation() == Orientation.TO_LEFT;
        }

        public final void moveCellTo(int v, int v1) throws IndexOutOfBoundsException, ArithmeticException {
            View view0;
            AutoTemplateLayout autoTemplateLayout0 = this.autoTemplateLayout;
            if(autoTemplateLayout0 == null) {
                return;
            }
            if(v == v1) {
                return;
            }
            Adapter autoTemplateLayout$Adapter0 = autoTemplateLayout0.getAdapter();
            if(autoTemplateLayout$Adapter0 != null) {
                autoTemplateLayout$Adapter0.onMoveCell(v, v1);
            }
            CellSize autoTemplateLayout$CellSize0 = (CellSize)this.sizes.get(v);
            this.sizes.remove(v);
            autoTemplateLayout0.removeViewAt(v);
            if(v1 > v) {
                --v1;
            }
            this.sizes.add(v1, autoTemplateLayout$CellSize0);
            Adapter autoTemplateLayout$Adapter1 = autoTemplateLayout0.getAdapter();
            if(autoTemplateLayout$Adapter1 == null) {
                view0 = null;
            }
            else {
                Cell autoTemplateLayout$Cell0 = autoTemplateLayout$Adapter1.createViewHolder();
                view0 = autoTemplateLayout$Cell0 == null ? null : autoTemplateLayout$Cell0.getView();
            }
            autoTemplateLayout0.addView(view0, v1);
            this.updateChildCellsInRange(Math.min(v, v1), Math.max(c.coerceAtMost(v + 1, CollectionsKt__CollectionsKt.getLastIndex(this.sizes)), c.coerceAtMost(v1 + 1, CollectionsKt__CollectionsKt.getLastIndex(this.sizes))));
        }

        private final List popAsList(List list0, int v) {
            if(v > 0) {
                List list1 = CollectionsKt___CollectionsKt.take(list0, v);
                for(int v1 = 0; v1 < v; ++v1) {
                    list0.remove(0);
                }
                return list1;
            }
            return CollectionsKt__CollectionsKt.emptyList();
        }

        public final void removeCellAt(int v) throws IndexOutOfBoundsException, ArithmeticException {
            AutoTemplateLayout autoTemplateLayout0 = this.autoTemplateLayout;
            if(autoTemplateLayout0 == null) {
                return;
            }
            this.sizes.remove(v);
            autoTemplateLayout0.removeViewAt(v);
            this.updateChildCellsInRange(v, CollectionsKt__CollectionsKt.getLastIndex(this.sizes));
        }

        public final void removeCellsAt(int v, int v1) throws IndexOutOfBoundsException, ArithmeticException {
            AutoTemplateLayout autoTemplateLayout0 = this.autoTemplateLayout;
            if(autoTemplateLayout0 == null) {
                return;
            }
            for(int v2 = 0; v2 < v1; ++v2) {
                this.sizes.remove(v);
            }
            autoTemplateLayout0.removeViews(v, v1);
            this.updateChildCellsInRange(v, CollectionsKt__CollectionsKt.getLastIndex(this.sizes));
        }

        public final void setAutoTemplateLayout(@Nullable AutoTemplateLayout autoTemplateLayout0) {
            this.autoTemplateLayout = autoTemplateLayout0;
            this.scroller.setAutoTemplateLayout(autoTemplateLayout0);
        }

        private final void setTemplate(List list0) {
            this.template = list0;
            AutoTemplateLayout autoTemplateLayout0 = this.autoTemplateLayout;
            if(autoTemplateLayout0 != null) {
                Adapter autoTemplateLayout$Adapter0 = autoTemplateLayout0.getAdapter();
                if(autoTemplateLayout$Adapter0 != null) {
                    autoTemplateLayout$Adapter0.onTemplateChanged(this.template);
                }
            }
        }

        public final void stopScroll() {
            this.scroller.stopScroll();
        }

        public final void tryScrollDown(float f, float f1) {
            this.scroller.tryScrollDown(f, f1);
        }

        public final void tryScrollUp(float f, float f1) {
            this.scroller.tryScrollUp(f, f1);
        }

        public final void updateCellAt(int v, @NotNull CellSize autoTemplateLayout$CellSize0) throws IndexOutOfBoundsException, ArithmeticException {
            Intrinsics.checkNotNullParameter(autoTemplateLayout$CellSize0, "size");
            if(this.autoTemplateLayout == null) {
                return;
            }
            this.sizes.set(v, autoTemplateLayout$CellSize0);
            this.updateChildCellsInRange(v, v);
        }

        public final void updateCellPaddingAndMargins(int v) {
            int v8;
            int v4;
            int v3;
            AutoTemplateLayout autoTemplateLayout0 = this.autoTemplateLayout;
            if(autoTemplateLayout0 == null) {
                return;
            }
            int v1 = autoTemplateLayout0.getInnerPadding();
            GuideLineInfo autoTemplateLayout$GuideLineInfo0 = this.dragAndDropManager.getGuideLineInfo();
            int v2 = 0;
            if(autoTemplateLayout$GuideLineInfo0 == null || !this.isLeftTo(autoTemplateLayout$GuideLineInfo0, v)) {
                v3 = this.isAtStart(v) ? 0 : v1 / 2;
            }
            else {
                v3 = autoTemplateLayout0.getInnerPadding();
            }
            GuideLineInfo autoTemplateLayout$GuideLineInfo1 = this.dragAndDropManager.getGuideLineInfo();
            if(autoTemplateLayout$GuideLineInfo1 == null || !this.isRightTo(autoTemplateLayout$GuideLineInfo1, v)) {
                v4 = this.isAtEnd(v) ? 0 : autoTemplateLayout0.getInnerPadding() - v1 / 2;
            }
            else {
                v4 = autoTemplateLayout0.getInnerPadding();
            }
            int v5 = this.isAtTop(v) ? 0 : v1 / 2;
            int v6 = this.isAtBottom(v) ? 0 : autoTemplateLayout0.getInnerPadding() - v1 / 2;
            View view0 = autoTemplateLayout0.getChildAt(v);
            if(view0 != null) {
                view0.setPadding(v3, v5, v4, v6);
            }
            Drawable drawable0 = autoTemplateLayout0.getGuideLineDrawable();
            int v7 = c.coerceAtLeast((drawable0 == null ? 0 : drawable0.getIntrinsicWidth()), 10);
            View view1 = autoTemplateLayout0.getChildAt(v);
            ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = null;
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = view1 == null ? null : view1.getLayoutParams();
            if(viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams) {
                viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0;
            }
            if(viewGroup$MarginLayoutParams0 != null) {
                GuideLineInfo autoTemplateLayout$GuideLineInfo2 = this.dragAndDropManager.getGuideLineInfo();
                if(autoTemplateLayout$GuideLineInfo2 == null || !this.isRightTo(autoTemplateLayout$GuideLineInfo2, v)) {
                    v8 = 0;
                }
                else if(this.isAtEnd(v)) {
                    v8 = (autoTemplateLayout0.getInnerPadding() + v7) * 2;
                }
                else {
                    v8 = v7 / 2;
                }
                viewGroup$MarginLayoutParams0.setMarginEnd(v8);
            }
            if(viewGroup$MarginLayoutParams0 != null) {
                GuideLineInfo autoTemplateLayout$GuideLineInfo3 = this.dragAndDropManager.getGuideLineInfo();
                if(autoTemplateLayout$GuideLineInfo3 != null && this.isLeftTo(autoTemplateLayout$GuideLineInfo3, v)) {
                    v2 = this.isAtStart(v) ? (autoTemplateLayout0.getInnerPadding() + v7) * 2 : v7 - v7 / 2;
                }
                viewGroup$MarginLayoutParams0.setMarginStart(v2);
            }
            if(view1 != null) {
                view1.setLayoutParams(viewGroup$MarginLayoutParams0);
            }
        }

        public final void updateCellWithSameSizeAt(int v) throws IndexOutOfBoundsException, ArithmeticException {
            AutoTemplateLayout autoTemplateLayout0 = this.autoTemplateLayout;
            if(autoTemplateLayout0 == null) {
                return;
            }
            if(v < 0 || v > CollectionsKt__CollectionsKt.getLastIndex(this.sizes)) {
                throw new IndexOutOfBoundsException();
            }
            Cell autoTemplateLayout$Cell0 = autoTemplateLayout0.getViewHolderAt(v);
            if(autoTemplateLayout$Cell0 != null) {
                Adapter autoTemplateLayout$Adapter0 = autoTemplateLayout0.getAdapter();
                if(autoTemplateLayout$Adapter0 != null) {
                    autoTemplateLayout$Adapter0.onBindViewHolder(autoTemplateLayout$Cell0, v);
                }
            }
        }

        public final void updateCellsAt(int v, int v1, @NotNull List list0) throws IndexOutOfBoundsException, ArithmeticException, IllegalArgumentException {
            Intrinsics.checkNotNullParameter(list0, "items");
            if(this.autoTemplateLayout == null) {
                return;
            }
            if(v1 != list0.size()) {
                throw new IllegalArgumentException("Given count(" + v1 + ") does not match item count(" + list0.size() + ").");
            }
            int v2 = 0;
            for(Object object0: list0) {
                if(v2 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                this.sizes.set(v2 + v, ((CellSize)object0));
                ++v2;
            }
            this.updateChildCellsInRange(v, v1 + v - 1);
        }

        public final void updateChildCellsInRange(int v, int v1) throws ArithmeticException {
            AutoTemplateLayout autoTemplateLayout0 = this.autoTemplateLayout;
            if(autoTemplateLayout0 == null) {
                return;
            }
            this.setTemplate(autoTemplateLayout0.makeTemplate(this.sizes.size()));
            int v2 = c.coerceAtLeast(this.findLineWith(v) - 1, 0);
            int v3 = this.findLineWith(v1);
            this.updateLinesIn(v2, v3 + 1);
            int v4 = CollectionsKt___CollectionsKt.sumOfInt(this.template.subList(0, v2));
            int v5 = CollectionsKt___CollectionsKt.sumOfInt(this.template.subList(0, v3 + 1));
            if(v4 <= v5 - 1) {
                while(true) {
                    Cell autoTemplateLayout$Cell0 = autoTemplateLayout0.getViewHolderAt(v4);
                    if(autoTemplateLayout$Cell0 != null) {
                        Adapter autoTemplateLayout$Adapter0 = autoTemplateLayout0.getAdapter();
                        if(autoTemplateLayout$Adapter0 != null) {
                            autoTemplateLayout$Adapter0.onBindViewHolder(autoTemplateLayout$Cell0, v4);
                        }
                    }
                    if(v4 == v5 - 1) {
                        break;
                    }
                    ++v4;
                }
            }
        }

        private final void updateLinesIn(int v, int v1) throws ArithmeticException {
            Iterator iterator7;
            ViewGroup.LayoutParams viewGroup$LayoutParams0;
            Iterator iterator6;
            int v9;
            View view2;
            AutoTemplateLayout autoTemplateLayout0 = this.autoTemplateLayout;
            if(autoTemplateLayout0 == null) {
                return;
            }
            if(v >= 0 && v1 >= v) {
                Iterable iterable0 = this.sizes;
                ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
                for(Object object0: iterable0) {
                    CellSize autoTemplateLayout$CellSize0 = (CellSize)object0;
                    arrayList0.add(((double)(autoTemplateLayout$CellSize0.getCellHeight() == 0 ? 0.0 : ((double)autoTemplateLayout$CellSize0.getCellWidth()) / ((double)autoTemplateLayout$CellSize0.getCellHeight()))));
                }
                List list0 = CollectionsKt___CollectionsKt.toMutableList(arrayList0);
                Iterable iterable1 = this.template;
                ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(iterable1, 10));
                for(Object object1: iterable1) {
                    arrayList1.add(CollectionsKt___CollectionsKt.toMutableList(this.popAsList(list0, c.coerceAtMost(((Number)object1).intValue(), list0.size()))));
                }
                if(autoTemplateLayout0.getMinSingleCellWidth() > 0) {
                    for(Object object2: arrayList1) {
                        List list1 = (List)object2;
                        if(list1.size() <= 1) {
                            break;
                        }
                        double f = Math.sqrt(((double)(autoTemplateLayout0.getMeasuredWidth() - autoTemplateLayout0.getMinSingleCellWidth())) / ((double)(autoTemplateLayout0.getMinSingleCellWidth() * (list1.size() - 1))));
                        int v3 = 0;
                        for(Object object3: list1) {
                            if(v3 < 0) {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                            }
                            double f1 = ((Number)object3).doubleValue();
                            if(f < 1.0) {
                                throw new ArithmeticException(q.m(autoTemplateLayout0.getMinSingleCellWidth(), "A cell in given template cannot be calculated as smaller than minSingleCellWidth(", ")."));
                            }
                            list1.set(v3, c.coerceIn(f1, 1.0 / f, f));
                            ++v3;
                        }
                    }
                }
                int v4 = CollectionsKt___CollectionsKt.sumOfInt(this.template.subList(0, v));
                View view0 = this.autoTemplateLayout == null ? null : this.autoTemplateLayout.getChildAt(v4 - 1);
                View view1 = this.autoTemplateLayout == null ? null : this.autoTemplateLayout.getChildAt(v4 - 1);
                int v5 = 0;
                Iterator iterator4 = arrayList1.subList(v, v1).iterator();
                for(int v2 = 0; iterator4.hasNext(); v2 = 0) {
                    Object object4 = iterator4.next();
                    if(v5 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    List list2 = (List)object4;
                    int v6 = v5 + v;
                    if(v6 > 0) {
                        view1 = view0;
                    }
                    double f2 = CollectionsKt___CollectionsKt.sumOfDouble(list2);
                    if(f2 == 0.0) {
                        view2 = view1;
                    }
                    else {
                        view2 = view1;
                        v2 = (int)(((double)autoTemplateLayout0.getMeasuredWidth()) / f2);
                    }
                    int v7 = 0;
                    int v8 = 0;
                    for(Iterator iterator5 = list2.iterator(); iterator5.hasNext(); iterator5 = iterator7) {
                        Object object5 = iterator5.next();
                        if(v7 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        double f3 = ((Number)object5).doubleValue();
                        View view3 = autoTemplateLayout0.getChildAt(v4);
                        if(v7 == CollectionsKt__CollectionsKt.getLastIndex(list2)) {
                            v9 = autoTemplateLayout0.getMeasuredWidth() - v8;
                            iterator6 = iterator4;
                        }
                        else {
                            iterator6 = iterator4;
                            v9 = (int)(((double)v2) * f3);
                            v8 += v9;
                        }
                        if(view3 == null) {
                            iterator7 = iterator5;
                            viewGroup$LayoutParams0 = null;
                        }
                        else {
                            viewGroup$LayoutParams0 = view3.getLayoutParams();
                            iterator7 = iterator5;
                        }
                        LayoutParams autoTemplateLayout$LayoutParams0 = viewGroup$LayoutParams0 instanceof LayoutParams ? ((LayoutParams)viewGroup$LayoutParams0) : null;
                        if(autoTemplateLayout$LayoutParams0 != null) {
                            autoTemplateLayout$LayoutParams0.resetConstraints();
                            autoTemplateLayout$LayoutParams0.width = v9;
                            autoTemplateLayout$LayoutParams0.height = v2;
                            if(v6 > 0) {
                                Intrinsics.checkNotNull(view2);
                                autoTemplateLayout$LayoutParams0.topToBottom = view2.getId();
                            }
                            else {
                                autoTemplateLayout$LayoutParams0.topToTop = autoTemplateLayout0.getId();
                            }
                            if(v7 == CollectionsKt__CollectionsKt.getLastIndex(list2)) {
                                autoTemplateLayout$LayoutParams0.endToEnd = autoTemplateLayout0.getId();
                            }
                            else if(v7 == 0) {
                                autoTemplateLayout$LayoutParams0.startToStart = autoTemplateLayout0.getId();
                            }
                            if(v7 > 0) {
                                Intrinsics.checkNotNull(view0);
                                autoTemplateLayout$LayoutParams0.startToEnd = view0.getId();
                            }
                            if(v7 < CollectionsKt__CollectionsKt.getLastIndex(list2)) {
                                autoTemplateLayout$LayoutParams0.endToStart = autoTemplateLayout0.getChildAt(v4 + 1).getId();
                            }
                        }
                        if(view3 != null) {
                            this.updateCellPaddingAndMargins(v4);
                            view0 = view3;
                        }
                        ++v4;
                        ++v7;
                        iterator4 = iterator6;
                    }
                    Adapter autoTemplateLayout$Adapter0 = autoTemplateLayout0.getAdapter();
                    if(autoTemplateLayout$Adapter0 != null) {
                        autoTemplateLayout$Adapter0.onChildrenSizesChanged();
                    }
                    view1 = view2;
                    ++v5;
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\f\u001A\u00020\rR\u001C\u0010\u0006\u001A\u0004\u0018\u00010\u0007X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000B¨\u0006\u000E"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout$LayoutParams;", "Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;", "width", "", "height", "(II)V", "cell", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout$Cell;", "getCell", "()Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout$Cell;", "setCell", "(Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout$Cell;)V", "resetConstraints", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class LayoutParams extends androidx.constraintlayout.widget.ConstraintLayout.LayoutParams {
        @Nullable
        private Cell cell;

        public LayoutParams(int v, int v1) {
            super(v, v1);
        }

        @Nullable
        public final Cell getCell() {
            return this.cell;
        }

        public final void resetConstraints() {
            this.topToBottom = -1;
            this.topToTop = -1;
            this.bottomToTop = -1;
            this.bottomToBottom = -1;
            this.startToEnd = -1;
            this.startToStart = -1;
            this.endToStart = -1;
            this.endToEnd = -1;
        }

        public final void setCell(@Nullable Cell autoTemplateLayout$Cell0) {
            this.cell = autoTemplateLayout$Cell0;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout$OnCellDragListener;", "", "onDragStateChanged", "", "dragState", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout$DragState;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public interface OnCellDragListener {
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
        public static final class DefaultImpls {
            public static void onDragStateChanged(@NotNull OnCellDragListener autoTemplateLayout$OnCellDragListener0, @NotNull DragState autoTemplateLayout$DragState0) {
                Intrinsics.checkNotNullParameter(autoTemplateLayout$DragState0, "dragState");
            }
        }

        void onDragStateChanged(@NotNull DragState arg1);
    }

    private static final int AUTO_SCROLL_DELAY = 10;
    private static final float CELL_HOTSPOT_WIDTH_DP = 30.0f;
    @NotNull
    public static final Companion Companion = null;
    private static final int DEFAULT_GUIDELINE_WIDTH = 10;
    private static final float SCROLL_HOTSPOT_HEIGHT_DP = 50.0f;
    @Nullable
    private Adapter adapter;
    @Nullable
    private OnCellDragListener cellDragListener;
    @Nullable
    private Drawable guideLineDrawable;
    @Nullable
    private Integer guideLineTint;
    private int innerPadding;
    private boolean isAnimationEnabled;
    private boolean isDragAndDropEnabled;
    @NotNull
    private LayoutManager layoutManager;
    private int minSingleCellWidth;
    @Nullable
    private View scrollableLayout;

    static {
        AutoTemplateLayout.Companion = new Companion(null);
    }

    @JvmOverloads
    public AutoTemplateLayout(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @JvmOverloads
    public AutoTemplateLayout(@NotNull Context context0, @Nullable AttributeSet attributeSet0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @JvmOverloads
    public AutoTemplateLayout(@NotNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0, attributeSet0, v);
        LayoutManager autoTemplateLayout$LayoutManager0 = new LayoutManager();
        autoTemplateLayout$LayoutManager0.setAutoTemplateLayout(this);
        this.layoutManager = autoTemplateLayout$LayoutManager0;
    }

    public AutoTemplateLayout(Context context0, AttributeSet attributeSet0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    private final View findCellAtPosition(float f, float f1) {
        for(Object object0: ViewGroupKt.getChildren(this)) {
            View view0 = (View)object0;
            if(f > view0.getX() && f < view0.getX() + ((float)view0.getMeasuredWidth()) && f1 > view0.getY() && f1 < view0.getY() + ((float)view0.getMeasuredHeight())) {
                return view0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    @Nullable
    public final Adapter getAdapter() {
        return this.adapter;
    }

    @Nullable
    public final OnCellDragListener getCellDragListener() {
        return this.cellDragListener;
    }

    @Nullable
    public Drawable getGuideLineDrawable() {
        return this.guideLineDrawable;
    }

    @Nullable
    public Integer getGuideLineTint() {
        return this.guideLineTint;
    }

    public int getInnerPadding() {
        return this.innerPadding;
    }

    public int getMinSingleCellWidth() {
        return this.minSingleCellWidth;
    }

    @Nullable
    public final View getScrollableLayout() {
        return this.scrollableLayout;
    }

    private final Cell getViewHolderAt(int v) {
        View view0 = this.getChildAt(v);
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0 == null ? null : view0.getLayoutParams();
        LayoutParams autoTemplateLayout$LayoutParams0 = viewGroup$LayoutParams0 instanceof LayoutParams ? ((LayoutParams)viewGroup$LayoutParams0) : null;
        return autoTemplateLayout$LayoutParams0 == null ? null : autoTemplateLayout$LayoutParams0.getCell();
    }

    public final boolean isAnimationEnabled() {
        return this.isAnimationEnabled;
    }

    public final boolean isDragAndDropEnabled() {
        return this.isDragAndDropEnabled;
    }

    @NotNull
    public List makeTemplate(int v) {
        List list0 = new ArrayList();
        while(true) {
            int v1 = 3;
            if(v < 3) {
                break;
            }
            if(list0.size() % 2 == 0) {
                v1 = 2;
            }
            list0.add(v1);
            v -= v1;
        }
        switch(v) {
            case 1: {
                if(list0.size() == 0) {
                    list0.add(1);
                    return list0;
                }
                switch(((Number)CollectionsKt___CollectionsKt.last(list0)).intValue()) {
                    case 2: {
                        list0.set(CollectionsKt__CollectionsKt.getLastIndex(list0), 3);
                        return list0;
                    }
                    case 3: {
                        list0.set(CollectionsKt__CollectionsKt.getLastIndex(list0), 2);
                        list0.add(2);
                        return list0;
                    }
                    default: {
                        return list0;
                    }
                }
            }
            case 2: {
                list0.add(2);
                return list0;
            }
            default: {
                return list0;
            }
        }
    }

    @Override  // android.view.View
    public void onDraw(@NotNull Canvas canvas0) {
        Intrinsics.checkNotNullParameter(canvas0, "canvas");
        super.onDraw(canvas0);
        this.layoutManager.drawGuideLine(canvas0);
    }

    public final void setAdapter(@Nullable Adapter autoTemplateLayout$Adapter0) {
        this.adapter = autoTemplateLayout$Adapter0;
        if(autoTemplateLayout$Adapter0 != null) {
            autoTemplateLayout$Adapter0.onAttachedToLayout(this);
        }
    }

    public final void setAnimationEnabled(boolean z) {
        this.isAnimationEnabled = z;
        this.layoutManager.enableAnimation(z);
    }

    public final void setCellDragListener(@Nullable OnCellDragListener autoTemplateLayout$OnCellDragListener0) {
        this.cellDragListener = autoTemplateLayout$OnCellDragListener0;
    }

    public final void setDragAndDropEnabled(boolean z) {
        this.isDragAndDropEnabled = z;
        this.layoutManager.enableDragAndDrop(z);
    }

    public void setGuideLineDrawable(@Nullable Drawable drawable0) {
        this.guideLineDrawable = drawable0;
    }

    public void setGuideLineTint(@Nullable Integer integer0) {
        this.guideLineTint = integer0;
    }

    public void setInnerPadding(int v) {
        this.innerPadding = v;
        this.requestLayout();
    }

    public void setMinSingleCellWidth(int v) {
        this.minSingleCellWidth = v;
        this.requestLayout();
    }

    public final void setScrollableLayout(@Nullable View view0) {
        this.scrollableLayout = view0;
    }
}

