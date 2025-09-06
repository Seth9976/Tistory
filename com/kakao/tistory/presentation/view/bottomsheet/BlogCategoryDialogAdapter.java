package com.kakao.tistory.presentation.view.bottomsheet;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.kakao.android.base.ui.recyclerview.BaseRecyclerAdapter;
import com.kakao.tistory.domain.entity.CategoryItem;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 \u001C2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u001D\u001E\u001F \u001CB\u001B\u0012\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001F\u0010\r\u001A\u00020\f2\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u0017\u0010\u0010\u001A\u00020\n2\u0006\u0010\u000F\u001A\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001F\u0010\u0013\u001A\u00020\u00042\u0006\u0010\u0012\u001A\u00020\f2\u0006\u0010\u000F\u001A\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u001B\u001A\u00020\n8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001A¨\u0006!"}, d2 = {"Lcom/kakao/tistory/presentation/view/bottomsheet/BlogCategoryDialogAdapter;", "Lcom/kakao/android/base/ui/recyclerview/BaseRecyclerAdapter;", "Lcom/kakao/tistory/domain/entity/CategoryItem;", "Lkotlin/Function1;", "", "onClick", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "position", "getItemViewType", "(I)I", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "b", "I", "getSelectedCategoryId", "()I", "setSelectedCategoryId", "(I)V", "selectedCategoryId", "Companion", "BlogCategoryChildItemCreateModeViewHolder", "BlogCategoryEmptyItemViewHolder", "BlogCategoryNormalItemCreateModeViewHolder", "CategoryViewHolder", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BlogCategoryDialogAdapter extends BaseRecyclerAdapter {
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J+\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\n2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00060\fH\u0017¢\u0006\u0002\u0010\r¨\u0006\u000E"}, d2 = {"Lcom/kakao/tistory/presentation/view/bottomsheet/BlogCategoryDialogAdapter$BlogCategoryChildItemCreateModeViewHolder;", "Lcom/kakao/tistory/presentation/view/bottomsheet/BlogCategoryDialogAdapter$CategoryViewHolder;", "composeView", "Landroidx/compose/ui/platform/ComposeView;", "(Lcom/kakao/tistory/presentation/view/bottomsheet/BlogCategoryDialogAdapter;Landroidx/compose/ui/platform/ComposeView;)V", "Content", "", "item", "Lcom/kakao/tistory/domain/entity/CategoryItem;", "isSelected", "", "onClick", "Lkotlin/Function0;", "(Lcom/kakao/tistory/domain/entity/CategoryItem;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public final class BlogCategoryChildItemCreateModeViewHolder extends CategoryViewHolder {
        public BlogCategoryChildItemCreateModeViewHolder(@NotNull ComposeView composeView0) {
            Intrinsics.checkNotNullParameter(composeView0, "composeView");
            super(composeView0);
        }

        @Override  // com.kakao.tistory.presentation.view.bottomsheet.BlogCategoryDialogAdapter$CategoryViewHolder
        @Composable
        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        public void Content(@NotNull CategoryItem categoryItem0, boolean z, @NotNull Function0 function00, @Nullable Composer composer0, int v) {
            Intrinsics.checkNotNullParameter(categoryItem0, "item");
            Intrinsics.checkNotNullParameter(function00, "onClick");
            Composer composer1 = composer0.startRestartGroup(0x92076F50);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x92076F50, v, -1, "com.kakao.tistory.presentation.view.bottomsheet.BlogCategoryDialogAdapter.BlogCategoryChildItemCreateModeViewHolder.Content (BlogCategoryDialogAdapter.kt:97)");
            }
            BlogCategoryDialogAdapterKt.access$Category(categoryItem0, new TextStyle(0L, 0x141600000L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFC, null), z, function00, ComposableLambdaKt.rememberComposableLambda(1404013383, true, new a(z), composer1, 54), composer1, v << 3 & 0x380 | 0x6008 | v << 3 & 0x1C00, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
            if(scopeUpdateScope0 != null) {
                scopeUpdateScope0.updateScope(new b(this, categoryItem0, z, function00, v));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/presentation/view/bottomsheet/BlogCategoryDialogAdapter$BlogCategoryEmptyItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "composeView", "Landroidx/compose/ui/platform/ComposeView;", "(Lcom/kakao/tistory/presentation/view/bottomsheet/BlogCategoryDialogAdapter;Landroidx/compose/ui/platform/ComposeView;)V", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public final class BlogCategoryEmptyItemViewHolder extends ViewHolder {
        public BlogCategoryEmptyItemViewHolder(@NotNull ComposeView composeView0) {
            Intrinsics.checkNotNullParameter(composeView0, "composeView");
            super(composeView0);
            composeView0.setViewCompositionStrategy(DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J+\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\n2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00060\fH\u0017¢\u0006\u0002\u0010\r¨\u0006\u000E"}, d2 = {"Lcom/kakao/tistory/presentation/view/bottomsheet/BlogCategoryDialogAdapter$BlogCategoryNormalItemCreateModeViewHolder;", "Lcom/kakao/tistory/presentation/view/bottomsheet/BlogCategoryDialogAdapter$CategoryViewHolder;", "composeView", "Landroidx/compose/ui/platform/ComposeView;", "(Lcom/kakao/tistory/presentation/view/bottomsheet/BlogCategoryDialogAdapter;Landroidx/compose/ui/platform/ComposeView;)V", "Content", "", "item", "Lcom/kakao/tistory/domain/entity/CategoryItem;", "isSelected", "", "onClick", "Lkotlin/Function0;", "(Lcom/kakao/tistory/domain/entity/CategoryItem;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public final class BlogCategoryNormalItemCreateModeViewHolder extends CategoryViewHolder {
        public BlogCategoryNormalItemCreateModeViewHolder(@NotNull ComposeView composeView0) {
            Intrinsics.checkNotNullParameter(composeView0, "composeView");
            super(composeView0);
        }

        @Override  // com.kakao.tistory.presentation.view.bottomsheet.BlogCategoryDialogAdapter$CategoryViewHolder
        @Composable
        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        public void Content(@NotNull CategoryItem categoryItem0, boolean z, @NotNull Function0 function00, @Nullable Composer composer0, int v) {
            Intrinsics.checkNotNullParameter(categoryItem0, "item");
            Intrinsics.checkNotNullParameter(function00, "onClick");
            Composer composer1 = composer0.startRestartGroup(2017970773);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2017970773, v, -1, "com.kakao.tistory.presentation.view.bottomsheet.BlogCategoryDialogAdapter.BlogCategoryNormalItemCreateModeViewHolder.Content (BlogCategoryDialogAdapter.kt:79)");
            }
            BlogCategoryDialogAdapterKt.access$Category(categoryItem0, new TextStyle(0L, 0x141800000L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFC, null), z, function00, null, composer1, v << 3 & 0x380 | 8 | v << 3 & 0x1C00, 16);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
            if(scopeUpdateScope0 != null) {
                scopeUpdateScope0.updateScope(new c(this, categoryItem0, z, function00, v));
            }
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\'\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\r\u001A\u00020\u000B2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b2\f\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000B0\n¢\u0006\u0004\b\r\u0010\u000EJ-\u0010\u000F\u001A\u00020\u000B2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b2\f\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000B0\nH\'¢\u0006\u0004\b\u000F\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/kakao/tistory/presentation/view/bottomsheet/BlogCategoryDialogAdapter$CategoryViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/compose/ui/platform/ComposeView;", "composeView", "<init>", "(Landroidx/compose/ui/platform/ComposeView;)V", "Lcom/kakao/tistory/domain/entity/CategoryItem;", "item", "", "isSelected", "Lkotlin/Function0;", "", "onClick", "bind", "(Lcom/kakao/tistory/domain/entity/CategoryItem;ZLkotlin/jvm/functions/Function0;)V", "Content", "(Lcom/kakao/tistory/domain/entity/CategoryItem;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static abstract class CategoryViewHolder extends ViewHolder {
        public static final int $stable;
        public final ComposeView a;

        static {
            CategoryViewHolder.$stable = ComposeView.$stable;
        }

        public CategoryViewHolder(@NotNull ComposeView composeView0) {
            Intrinsics.checkNotNullParameter(composeView0, "composeView");
            super(composeView0);
            this.a = composeView0;
            composeView0.setViewCompositionStrategy(DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        }

        @Composable
        public abstract void Content(@NotNull CategoryItem arg1, boolean arg2, @NotNull Function0 arg3, @Nullable Composer arg4, int arg5);

        public final void bind(@NotNull CategoryItem categoryItem0, boolean z, @NotNull Function0 function00) {
            Intrinsics.checkNotNullParameter(categoryItem0, "item");
            Intrinsics.checkNotNullParameter(function00, "onClick");
            ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(750949598, true, new d(this, categoryItem0, z, function00));
            this.a.setContent(composableLambda0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/kakao/tistory/presentation/view/bottomsheet/BlogCategoryDialogAdapter$Companion;", "", "", "VIEW_TYPE_CHILD", "I", "VIEW_TYPE_EMPTY", "VIEW_TYPE_NORMAL", "VIEW_TYPE_PARENT", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = null;
    public static final int VIEW_TYPE_CHILD = 2;
    public static final int VIEW_TYPE_EMPTY = 3;
    public static final int VIEW_TYPE_NORMAL = 0;
    public static final int VIEW_TYPE_PARENT = 1;
    public final Function1 a;
    public int b;

    static {
        BlogCategoryDialogAdapter.Companion = new Companion(null);
        BlogCategoryDialogAdapter.$stable = 8;
    }

    public BlogCategoryDialogAdapter(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "onClick");
        super();
        this.a = function10;
        this.b = -3;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemViewType(int v) {
        CategoryItem categoryItem0 = (CategoryItem)CollectionsKt___CollectionsKt.getOrNull(this.getItems(), v);
        if(categoryItem0 == null) {
            return 3;
        }
        return categoryItem0.getChildOrder() == 0 ? 1 : 2;
    }

    public final int getSelectedCategoryId() {
        return this.b;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(@NotNull ViewHolder recyclerView$ViewHolder0, int v) {
        Intrinsics.checkNotNullParameter(recyclerView$ViewHolder0, "holder");
        CategoryItem categoryItem0 = (CategoryItem)this.getItems().get(v);
        boolean z = categoryItem0.getId() == this.b;
        if(recyclerView$ViewHolder0 instanceof CategoryViewHolder) {
            ((CategoryViewHolder)recyclerView$ViewHolder0).bind(categoryItem0, z, new e(this, categoryItem0));
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup0, int v) {
        Intrinsics.checkNotNullParameter(viewGroup0, "parent");
        switch(v) {
            case 1: {
                Context context1 = viewGroup0.getContext();
                Intrinsics.checkNotNullExpressionValue(context1, "getContext(...)");
                return new BlogCategoryNormalItemCreateModeViewHolder(this, new ComposeView(context1, null, 0, 6, null));
            }
            case 2: {
                Context context2 = viewGroup0.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                return new BlogCategoryChildItemCreateModeViewHolder(this, new ComposeView(context2, null, 0, 6, null));
            }
            default: {
                Context context0 = viewGroup0.getContext();
                Intrinsics.checkNotNullExpressionValue(context0, "getContext(...)");
                return new BlogCategoryEmptyItemViewHolder(this, new ComposeView(context0, null, 0, 6, null));
            }
        }
    }

    public final void setSelectedCategoryId(int v) {
        this.b = v;
    }
}

