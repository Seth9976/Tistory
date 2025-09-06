package com.kakao.keditor.plugin.pluginspec.grammarcheck;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J%\u0010\u0005\u001A\u0002H\u0006\"\b\b\u0000\u0010\u0006*\u00020\u00072\f\u0010\b\u001A\b\u0012\u0004\u0012\u0002H\u00060\tH\u0016¢\u0006\u0002\u0010\nR\u000E\u0010\u0002\u001A\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000B"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/grammarcheck/GrammarCheckViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "repository", "Lcom/kakao/keditor/plugin/pluginspec/grammarcheck/GrammarCheckRepository;", "(Lcom/kakao/keditor/plugin/pluginspec/grammarcheck/GrammarCheckRepository;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class GrammarCheckViewModelFactory implements Factory {
    @NotNull
    private final GrammarCheckRepository repository;

    public GrammarCheckViewModelFactory(@NotNull GrammarCheckRepository grammarCheckRepository0) {
        Intrinsics.checkNotNullParameter(grammarCheckRepository0, "repository");
        super();
        this.repository = grammarCheckRepository0;
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    @NotNull
    public ViewModel create(@NotNull Class class0) {
        Intrinsics.checkNotNullParameter(class0, "modelClass");
        if(!class0.isAssignableFrom(GrammarCheckViewModel.class)) {
            throw new IllegalArgumentException();
        }
        return new GrammarCheckViewModel(this.repository);
    }
}

