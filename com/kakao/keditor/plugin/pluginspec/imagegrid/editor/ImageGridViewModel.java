package com.kakao.keditor.plugin.pluginspec.imagegrid.editor;

import android.view.View;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.kakao.keditor.plugin.pluginspec.imagegrid.editor.actions.OnAddClicked;
import com.kakao.keditor.plugin.pluginspec.imagegrid.editor.actions.OnCloseClicked;
import com.kakao.keditor.plugin.pluginspec.imagegrid.editor.actions.OnConfirmClicked;
import com.kakao.keditor.plugin.pluginspec.imagegrid.editor.actions.OnDeleteClicked;
import com.kakao.keditor.plugin.pluginspec.imagegrid.editor.actions.OnEditClicked;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000E\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\rJ\u000E\u0010\u000E\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\rJ\u000E\u0010\u000F\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\rJ\u000E\u0010\u0010\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\rJ\u000E\u0010\u0011\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\rR\u0014\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/imagegrid/editor/ImageGridViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_action", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/editor/actions/Action;", "action", "Lkotlinx/coroutines/flow/SharedFlow;", "getAction", "()Lkotlinx/coroutines/flow/SharedFlow;", "onAddClicked", "", "v", "Landroid/view/View;", "onCloseClicked", "onConfirmClicked", "onDeleteClicked", "onEditClicked", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ImageGridViewModel extends ViewModel {
    @NotNull
    private final MutableSharedFlow _action;
    @NotNull
    private final SharedFlow action;

    public ImageGridViewModel() {
        MutableSharedFlow mutableSharedFlow0 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._action = mutableSharedFlow0;
        this.action = FlowKt.asSharedFlow(mutableSharedFlow0);
    }

    @NotNull
    public final SharedFlow getAction() {
        return this.action;
    }

    public final void onAddClicked(@NotNull View view0) {
        Intrinsics.checkNotNullParameter(view0, "v");
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new Function2(null) {
            int label;

            {
                ImageGridViewModel.this = imageGridViewModel0;
                super(2, continuation0);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation create(@Nullable Object object0, @NotNull Continuation continuation0) {
                return new com.kakao.keditor.plugin.pluginspec.imagegrid.editor.ImageGridViewModel.onAddClicked.1(ImageGridViewModel.this, continuation0);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((CoroutineScope)object0), ((Continuation)object1));
            }

            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope0, @Nullable Continuation continuation0) {
                return ((com.kakao.keditor.plugin.pluginspec.imagegrid.editor.ImageGridViewModel.onAddClicked.1)this.create(coroutineScope0, continuation0)).invokeSuspend(Unit.INSTANCE);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object object0) {
                Object object1 = a.getCOROUTINE_SUSPENDED();
                switch(this.label) {
                    case 0: {
                        ResultKt.throwOnFailure(object0);
                        this.label = 1;
                        return ImageGridViewModel.this._action.emit(OnAddClicked.INSTANCE, this) == object1 ? object1 : Unit.INSTANCE;
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
    }

    public final void onCloseClicked(@NotNull View view0) {
        Intrinsics.checkNotNullParameter(view0, "v");
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new Function2(null) {
            int label;

            {
                ImageGridViewModel.this = imageGridViewModel0;
                super(2, continuation0);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation create(@Nullable Object object0, @NotNull Continuation continuation0) {
                return new com.kakao.keditor.plugin.pluginspec.imagegrid.editor.ImageGridViewModel.onCloseClicked.1(ImageGridViewModel.this, continuation0);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((CoroutineScope)object0), ((Continuation)object1));
            }

            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope0, @Nullable Continuation continuation0) {
                return ((com.kakao.keditor.plugin.pluginspec.imagegrid.editor.ImageGridViewModel.onCloseClicked.1)this.create(coroutineScope0, continuation0)).invokeSuspend(Unit.INSTANCE);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object object0) {
                Object object1 = a.getCOROUTINE_SUSPENDED();
                switch(this.label) {
                    case 0: {
                        ResultKt.throwOnFailure(object0);
                        this.label = 1;
                        return ImageGridViewModel.this._action.emit(OnCloseClicked.INSTANCE, this) == object1 ? object1 : Unit.INSTANCE;
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
    }

    public final void onConfirmClicked(@NotNull View view0) {
        Intrinsics.checkNotNullParameter(view0, "v");
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new Function2(null) {
            int label;

            {
                ImageGridViewModel.this = imageGridViewModel0;
                super(2, continuation0);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation create(@Nullable Object object0, @NotNull Continuation continuation0) {
                return new com.kakao.keditor.plugin.pluginspec.imagegrid.editor.ImageGridViewModel.onConfirmClicked.1(ImageGridViewModel.this, continuation0);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((CoroutineScope)object0), ((Continuation)object1));
            }

            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope0, @Nullable Continuation continuation0) {
                return ((com.kakao.keditor.plugin.pluginspec.imagegrid.editor.ImageGridViewModel.onConfirmClicked.1)this.create(coroutineScope0, continuation0)).invokeSuspend(Unit.INSTANCE);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object object0) {
                Object object1 = a.getCOROUTINE_SUSPENDED();
                switch(this.label) {
                    case 0: {
                        ResultKt.throwOnFailure(object0);
                        this.label = 1;
                        return ImageGridViewModel.this._action.emit(OnConfirmClicked.INSTANCE, this) == object1 ? object1 : Unit.INSTANCE;
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
    }

    public final void onDeleteClicked(@NotNull View view0) {
        Intrinsics.checkNotNullParameter(view0, "v");
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new Function2(null) {
            int label;

            {
                ImageGridViewModel.this = imageGridViewModel0;
                super(2, continuation0);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation create(@Nullable Object object0, @NotNull Continuation continuation0) {
                return new com.kakao.keditor.plugin.pluginspec.imagegrid.editor.ImageGridViewModel.onDeleteClicked.1(ImageGridViewModel.this, continuation0);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((CoroutineScope)object0), ((Continuation)object1));
            }

            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope0, @Nullable Continuation continuation0) {
                return ((com.kakao.keditor.plugin.pluginspec.imagegrid.editor.ImageGridViewModel.onDeleteClicked.1)this.create(coroutineScope0, continuation0)).invokeSuspend(Unit.INSTANCE);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object object0) {
                Object object1 = a.getCOROUTINE_SUSPENDED();
                switch(this.label) {
                    case 0: {
                        ResultKt.throwOnFailure(object0);
                        this.label = 1;
                        return ImageGridViewModel.this._action.emit(OnDeleteClicked.INSTANCE, this) == object1 ? object1 : Unit.INSTANCE;
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
    }

    public final void onEditClicked(@NotNull View view0) {
        Intrinsics.checkNotNullParameter(view0, "v");
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new Function2(null) {
            int label;

            {
                ImageGridViewModel.this = imageGridViewModel0;
                super(2, continuation0);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation create(@Nullable Object object0, @NotNull Continuation continuation0) {
                return new com.kakao.keditor.plugin.pluginspec.imagegrid.editor.ImageGridViewModel.onEditClicked.1(ImageGridViewModel.this, continuation0);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((CoroutineScope)object0), ((Continuation)object1));
            }

            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope0, @Nullable Continuation continuation0) {
                return ((com.kakao.keditor.plugin.pluginspec.imagegrid.editor.ImageGridViewModel.onEditClicked.1)this.create(coroutineScope0, continuation0)).invokeSuspend(Unit.INSTANCE);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object object0) {
                Object object1 = a.getCOROUTINE_SUSPENDED();
                switch(this.label) {
                    case 0: {
                        ResultKt.throwOnFailure(object0);
                        this.label = 1;
                        return ImageGridViewModel.this._action.emit(OnEditClicked.INSTANCE, this) == object1 ? object1 : Unit.INSTANCE;
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
    }
}

