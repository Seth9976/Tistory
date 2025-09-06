package com.kakao.keditor.plugin.pluginspec.codeblock.editor;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.android.material.snackbar.p;
import com.kakao.keditor.databinding.KeItemCodeBlockEditorLanguageBinding;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001FB(\u0012!\u0010\u0003\u001A\u001D\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0002\u0010\nJ\b\u0010\u0016\u001A\u00020\u0017H\u0016J\u0018\u0010\u0018\u001A\u00020\t2\u0006\u0010\u0019\u001A\u00020\u00022\u0006\u0010\u001A\u001A\u00020\u0017H\u0016J\u0018\u0010\u001B\u001A\u00020\u00022\u0006\u0010\u001C\u001A\u00020\u001D2\u0006\u0010\u001E\u001A\u00020\u0017H\u0016R)\u0010\u0003\u001A\u001D\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001C\u0010\u000B\u001A\u0004\u0018\u00010\u0005X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\f\u0010\r\"\u0004\b\u000E\u0010\u000FR \u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u00050\u0011X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/codeblock/editor/LanguageAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/kakao/keditor/plugin/pluginspec/codeblock/editor/LanguageAdapter$LanguageViewHolder;", "onItemClicked", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "language", "", "(Lkotlin/jvm/functions/Function1;)V", "selectedLanguage", "getSelectedLanguage", "()Ljava/lang/String;", "setSelectedLanguage", "(Ljava/lang/String;)V", "supportedLanguages", "", "getSupportedLanguages", "()Ljava/util/List;", "setSupportedLanguages", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "LanguageViewHolder", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class LanguageAdapter extends Adapter {
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/codeblock/editor/LanguageAdapter$LanguageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/kakao/keditor/databinding/KeItemCodeBlockEditorLanguageBinding;", "(Lcom/kakao/keditor/databinding/KeItemCodeBlockEditorLanguageBinding;)V", "getBinding", "()Lcom/kakao/keditor/databinding/KeItemCodeBlockEditorLanguageBinding;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class LanguageViewHolder extends ViewHolder {
        @NotNull
        private final KeItemCodeBlockEditorLanguageBinding binding;

        public LanguageViewHolder(@NotNull KeItemCodeBlockEditorLanguageBinding keItemCodeBlockEditorLanguageBinding0) {
            Intrinsics.checkNotNullParameter(keItemCodeBlockEditorLanguageBinding0, "binding");
            super(keItemCodeBlockEditorLanguageBinding0.getRoot());
            this.binding = keItemCodeBlockEditorLanguageBinding0;
        }

        @NotNull
        public final KeItemCodeBlockEditorLanguageBinding getBinding() {
            return this.binding;
        }
    }

    @NotNull
    private final Function1 onItemClicked;
    @Nullable
    private String selectedLanguage;
    @NotNull
    private List supportedLanguages;

    public LanguageAdapter(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "onItemClicked");
        super();
        this.onItemClicked = function10;
        this.supportedLanguages = CollectionsKt__CollectionsKt.emptyList();
    }

    public static void a(LanguageAdapter languageAdapter0, String s, View view0) {
        LanguageAdapter.onBindViewHolder$lambda$0(languageAdapter0, s, view0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.supportedLanguages.size();
    }

    @Nullable
    public final String getSelectedLanguage() {
        return this.selectedLanguage;
    }

    @NotNull
    public final List getSupportedLanguages() {
        return this.supportedLanguages;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
        this.onBindViewHolder(((LanguageViewHolder)recyclerView$ViewHolder0), v);
    }

    public void onBindViewHolder(@NotNull LanguageViewHolder languageAdapter$LanguageViewHolder0, int v) {
        Intrinsics.checkNotNullParameter(languageAdapter$LanguageViewHolder0, "holder");
        String s = (String)this.supportedLanguages.get(v);
        languageAdapter$LanguageViewHolder0.getBinding().setLanguage(s);
        languageAdapter$LanguageViewHolder0.getBinding().setIsSelected(Intrinsics.areEqual(s, this.selectedLanguage));
        languageAdapter$LanguageViewHolder0.getBinding().getRoot().setOnClickListener(new p(1, this, s));
    }

    private static final void onBindViewHolder$lambda$0(LanguageAdapter languageAdapter0, String s, View view0) {
        Intrinsics.checkNotNullParameter(languageAdapter0, "this$0");
        Intrinsics.checkNotNullParameter(s, "$language");
        languageAdapter0.onItemClicked.invoke(s);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
        return this.onCreateViewHolder(viewGroup0, v);
    }

    @NotNull
    public LanguageViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup0, int v) {
        Intrinsics.checkNotNullParameter(viewGroup0, "parent");
        KeItemCodeBlockEditorLanguageBinding keItemCodeBlockEditorLanguageBinding0 = KeItemCodeBlockEditorLanguageBinding.inflate(LayoutInflater.from(viewGroup0.getContext()), viewGroup0, false);
        Intrinsics.checkNotNullExpressionValue(keItemCodeBlockEditorLanguageBinding0, "inflate(...)");
        return new LanguageViewHolder(keItemCodeBlockEditorLanguageBinding0);
    }

    public final void setSelectedLanguage(@Nullable String s) {
        this.selectedLanguage = s;
    }

    public final void setSupportedLanguages(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "<set-?>");
        this.supportedLanguages = list0;
    }
}

