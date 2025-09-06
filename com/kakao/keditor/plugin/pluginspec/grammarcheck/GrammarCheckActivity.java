package com.kakao.keditor.plugin.pluginspec.grammarcheck;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.OnBackPressedCallback;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import com.google.android.material.datepicker.t;
import com.kakao.common.widget.KeditorAlertDialog.Companion;
import com.kakao.common.widget.KeditorAlertDialog;
import com.kakao.keditor.Keditor;
import com.kakao.keditor.KeditorView;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.R.string;
import com.kakao.keditor.base.KeditorBaseAppCompatActivity;
import com.kakao.keditor.databinding.KeActivityGrammarCheckBinding;
import com.kakao.keditor.plugin.itemspec.grammarcheck.ClearGrammarError;
import com.kakao.keditor.plugin.itemspec.grammarcheck.HighlightGrammarError;
import com.kakao.keditor.plugin.itemspec.grammarcheck.KeditorGrammarError;
import com.kakao.keditor.plugin.itemspec.grammarcheck.ReplaceText;
import com.kakao.keditor.util.eventbus.KeEvent;
import com.kakao.keditor.util.eventbus.ViewRequest.ScrollTo;
import com.kakao.keditor.util.eventbus.ViewRequest.ScrollToSpecificTextIndex;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0016\u001A\u00020\u00172\u0006\u0010\u0018\u001A\u00020\u0019H\u0002J\u0010\u0010\u001A\u001A\u00020\u00172\u0006\u0010\u001B\u001A\u00020\u001CH\u0002J\u0018\u0010\u001D\u001A\u00020\u00172\u0006\u0010\u0018\u001A\u00020\u00192\u0006\u0010\u001E\u001A\u00020\u001CH\u0002J\b\u0010\u001F\u001A\u00020\u0017H\u0002J\b\u0010 \u001A\u00020\u0017H\u0002J\u0010\u0010!\u001A\u00020\u00172\u0006\u0010\"\u001A\u00020#H\u0002J\b\u0010$\u001A\u00020\u0017H\u0002J\u0012\u0010%\u001A\u00020\u00172\b\u0010&\u001A\u0004\u0018\u00010\'H\u0014J\b\u0010(\u001A\u00020\u0017H\u0002J\u0010\u0010)\u001A\u00020\u00172\u0006\u0010\u0018\u001A\u00020\u0019H\u0002J\b\u0010*\u001A\u00020\u0017H\u0002R\u000E\u0010\u0003\u001A\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u001C\u0010\u0005\u001A\u0004\u0018\u00010\u0006X\u0094\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001B\u0010\u000B\u001A\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\r\u0010\u000ER\u001B\u0010\u0011\u001A\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001A\u0004\b\u0013\u0010\u0014¨\u0006+"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/grammarcheck/GrammarCheckActivity;", "Lcom/kakao/keditor/base/KeditorBaseAppCompatActivity;", "()V", "binding", "Lcom/kakao/keditor/databinding/KeActivityGrammarCheckBinding;", "onBackPressedCallback", "Landroidx/activity/OnBackPressedCallback;", "getOnBackPressedCallback", "()Landroidx/activity/OnBackPressedCallback;", "setOnBackPressedCallback", "(Landroidx/activity/OnBackPressedCallback;)V", "repository", "Lcom/kakao/keditor/plugin/pluginspec/grammarcheck/GrammarCheckRepository;", "getRepository", "()Lcom/kakao/keditor/plugin/pluginspec/grammarcheck/GrammarCheckRepository;", "repository$delegate", "Lkotlin/Lazy;", "vm", "Lcom/kakao/keditor/plugin/pluginspec/grammarcheck/GrammarCheckViewModel;", "getVm", "()Lcom/kakao/keditor/plugin/pluginspec/grammarcheck/GrammarCheckViewModel;", "vm$delegate", "clearGrammarError", "", "error", "Lcom/kakao/keditor/plugin/itemspec/grammarcheck/KeditorGrammarError;", "finishGrammarCheck", "checkedAll", "", "highlightGrammarError", "isFocused", "initBottomEditWindow", "initEditorView", "initKeditor", "keditorView", "Lcom/kakao/keditor/KeditorView;", "initViewModel", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "saveCDMData", "setGrammarError", "showExitDialog", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class GrammarCheckActivity extends KeditorBaseAppCompatActivity {
    private KeActivityGrammarCheckBinding binding;
    @Nullable
    private OnBackPressedCallback onBackPressedCallback;
    @NotNull
    private final Lazy repository$delegate;
    @NotNull
    private final Lazy vm$delegate;

    public GrammarCheckActivity() {
        this.repository$delegate = c.lazy(new Function0() {
            {
                GrammarCheckActivity.this = grammarCheckActivity0;
                super(0);
            }

            @NotNull
            public final GrammarCheckRepository invoke() {
                return new GrammarCheckRepository(GrammarCheckActivity.this);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        });
        this.vm$delegate = c.lazy(new Function0() {
            {
                GrammarCheckActivity.this = grammarCheckActivity0;
                super(0);
            }

            @NotNull
            public final GrammarCheckViewModel invoke() {
                GrammarCheckViewModelFactory grammarCheckViewModelFactory0 = new GrammarCheckViewModelFactory(GrammarCheckActivity.access$getRepository(GrammarCheckActivity.this));
                return (GrammarCheckViewModel)new ViewModelProvider(GrammarCheckActivity.this, grammarCheckViewModelFactory0).get(GrammarCheckViewModel.class);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        });
        this.onBackPressedCallback = new OnBackPressedCallback() {
            {
                GrammarCheckActivity.this = grammarCheckActivity0;
                super(true);
            }

            @Override  // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                GrammarCheckActivity.access$showExitDialog(GrammarCheckActivity.this);
            }
        };
    }

    public static final GrammarCheckRepository access$getRepository(GrammarCheckActivity grammarCheckActivity0) {
        return grammarCheckActivity0.getRepository();
    }

    public static final void access$showExitDialog(GrammarCheckActivity grammarCheckActivity0) {
        grammarCheckActivity0.showExitDialog();
    }

    private final void clearGrammarError(KeditorGrammarError keditorGrammarError0) {
        ClearGrammarError clearGrammarError0 = new ClearGrammarError(keditorGrammarError0);
        KeEvent.INSTANCE.postInScope(clearGrammarError0);
    }

    private final void finishGrammarCheck(boolean z) {
        Intent intent0 = new Intent();
        intent0.putExtra("grammar_checked_all", z);
        this.setResult(-1, intent0);
        this.finish();
    }

    public static void g(GrammarCheckActivity grammarCheckActivity0, View view0) {
        GrammarCheckActivity.onCreate$lambda$0(grammarCheckActivity0, view0);
    }

    @Override  // com.kakao.keditor.base.KeditorBaseAppCompatActivity
    @Nullable
    public OnBackPressedCallback getOnBackPressedCallback() {
        return this.onBackPressedCallback;
    }

    private final GrammarCheckRepository getRepository() {
        return (GrammarCheckRepository)this.repository$delegate.getValue();
    }

    private final GrammarCheckViewModel getVm() {
        return (GrammarCheckViewModel)this.vm$delegate.getValue();
    }

    private final void highlightGrammarError(KeditorGrammarError keditorGrammarError0, boolean z) {
        HighlightGrammarError highlightGrammarError0 = new HighlightGrammarError(keditorGrammarError0, z, this, new Function1(keditorGrammarError0) {
            final KeditorGrammarError $error;

            {
                GrammarCheckActivity.this = grammarCheckActivity0;
                this.$error = keditorGrammarError0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((View)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull View view0) {
                Intrinsics.checkNotNullParameter(view0, "it");
                GrammarCheckActivity.this.getVm().onGrammarErrorClicked(this.$error);
            }
        });
        KeEvent.INSTANCE.postInScope(highlightGrammarError0);
    }

    private final void initBottomEditWindow() {
        KeActivityGrammarCheckBinding keActivityGrammarCheckBinding0 = this.binding;
        if(keActivityGrammarCheckBinding0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            keActivityGrammarCheckBinding0 = null;
        }
        com.kakao.keditor.plugin.pluginspec.grammarcheck.GrammarCheckActivity.initBottomEditWindow.1.1 grammarCheckActivity$initBottomEditWindow$1$10 = new Function0() {
            {
                GrammarCheckActivity.this = grammarCheckActivity0;
                super(0);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                this.invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                GrammarCheckActivity.this.getVm().iterateToNextGrammarError();
            }
        };
        keActivityGrammarCheckBinding0.keGrammarEditWindow.setOnPassClickListener(grammarCheckActivity$initBottomEditWindow$1$10);
        com.kakao.keditor.plugin.pluginspec.grammarcheck.GrammarCheckActivity.initBottomEditWindow.1.2 grammarCheckActivity$initBottomEditWindow$1$20 = new Function0(keActivityGrammarCheckBinding0.keGrammarEditWindow) {
            final GrammarEditBottomView $this_apply;

            {
                GrammarCheckActivity.this = grammarCheckActivity0;
                this.$this_apply = grammarEditBottomView0;
                super(0);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                this.invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                GrammarCheckActivity.this.getVm().editCurrentGrammarError(this.$this_apply.getEditTextString());
            }
        };
        keActivityGrammarCheckBinding0.keGrammarEditWindow.setOnEditClickListener(grammarCheckActivity$initBottomEditWindow$1$20);
    }

    private final void initEditorView() {
        KeActivityGrammarCheckBinding keActivityGrammarCheckBinding0 = this.binding;
        if(keActivityGrammarCheckBinding0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            keActivityGrammarCheckBinding0 = null;
        }
        Intrinsics.checkNotNull(keActivityGrammarCheckBinding0.keGrammarEditorView);
        this.initKeditor(keActivityGrammarCheckBinding0.keGrammarEditorView);
        keActivityGrammarCheckBinding0.keGrammarEditorView.setRequestOnly();
    }

    private final void initKeditor(KeditorView keditorView0) {
        Keditor.INSTANCE.initEditorView(keditorView0);
    }

    private final void initViewModel() {
        this.getVm().getOriginalCdmJson().observe(this, new GrammarCheckActivity.sam.androidx_lifecycle_Observer.0(new Function1() {
            {
                GrammarCheckActivity.this = grammarCheckActivity0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((String)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(String s) {
                KeActivityGrammarCheckBinding keActivityGrammarCheckBinding0 = GrammarCheckActivity.this.binding;
                KeActivityGrammarCheckBinding keActivityGrammarCheckBinding1 = null;
                if(keActivityGrammarCheckBinding0 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    keActivityGrammarCheckBinding0 = null;
                }
                Intrinsics.checkNotNullExpressionValue(keActivityGrammarCheckBinding0.keGrammarEditorView, "keGrammarEditorView");
                Intrinsics.checkNotNull(s);
                KeditorView.load$default(keActivityGrammarCheckBinding0.keGrammarEditorView, s, null, 2, null);
                GrammarCheckViewModel grammarCheckViewModel0 = GrammarCheckActivity.this.getVm();
                KeActivityGrammarCheckBinding keActivityGrammarCheckBinding2 = GrammarCheckActivity.this.binding;
                if(keActivityGrammarCheckBinding2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                }
                else {
                    keActivityGrammarCheckBinding1 = keActivityGrammarCheckBinding2;
                }
                grammarCheckViewModel0.initGrammarErrors(keActivityGrammarCheckBinding1.keGrammarEditorView.grammarCheckItems(), new Function1() {
                    {
                        GrammarCheckActivity.this = grammarCheckActivity0;
                        super(1);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.invoke(((List)object0));
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull List list0) {
                        Intrinsics.checkNotNullParameter(list0, "it");
                        GrammarCheckActivity.this.getVm().iterateToNextGrammarError();
                    }
                });
            }
        }));
        this.getVm().getGrammarRequest().observe(this, new GrammarCheckActivity.sam.androidx_lifecycle_Observer.0(new Function1() {
            {
                GrammarCheckActivity.this = grammarCheckActivity0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((GrammarRequest)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(GrammarRequest grammarRequest0) {
                KeActivityGrammarCheckBinding keActivityGrammarCheckBinding0 = null;
                if(grammarRequest0 instanceof ChangeFocusedGrammar) {
                    KeditorGrammarError keditorGrammarError0 = ((ChangeFocusedGrammar)grammarRequest0).getPrevious();
                    if(keditorGrammarError0 != null) {
                        GrammarCheckActivity.this.highlightGrammarError(keditorGrammarError0, false);
                    }
                    KeditorGrammarError keditorGrammarError1 = ((ChangeFocusedGrammar)grammarRequest0).getCurrent();
                    GrammarCheckActivity.this.setGrammarError(keditorGrammarError1);
                    GrammarCheckActivity.this.getVm().updateGrammarIndex();
                    Keditor.clickEvent$default(Keditor.INSTANCE, "kGrammarCheck", "next", null, 4, null);
                    return;
                }
                if(grammarRequest0 instanceof EditGrammarText) {
                    KeActivityGrammarCheckBinding keActivityGrammarCheckBinding1 = GrammarCheckActivity.this.binding;
                    if(keActivityGrammarCheckBinding1 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    }
                    else {
                        keActivityGrammarCheckBinding0 = keActivityGrammarCheckBinding1;
                    }
                    ReplaceText replaceText0 = new ReplaceText(((EditGrammarText)grammarRequest0).getError().getItem(), ((EditGrammarText)grammarRequest0).getError().getItemInnerIndex(), ((EditGrammarText)grammarRequest0).getError().getStartIndex(), ((EditGrammarText)grammarRequest0).getError().getLength() + ((EditGrammarText)grammarRequest0).getError().getStartIndex(), keActivityGrammarCheckBinding0.keGrammarEditWindow.getEditTextString());
                    KeEvent.INSTANCE.postInScope(replaceText0);
                    Keditor.clickEvent$default(Keditor.INSTANCE, "kGrammarCheck", "replace", null, 4, null);
                    return;
                }
                if(grammarRequest0 instanceof RemoveGrammarError) {
                    KeditorGrammarError keditorGrammarError2 = ((RemoveGrammarError)grammarRequest0).getError();
                    GrammarCheckActivity.this.clearGrammarError(keditorGrammarError2);
                    return;
                }
                if(grammarRequest0 instanceof UpdateGrammarIndex) {
                    KeActivityGrammarCheckBinding keActivityGrammarCheckBinding2 = GrammarCheckActivity.this.binding;
                    if(keActivityGrammarCheckBinding2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        keActivityGrammarCheckBinding2 = null;
                    }
                    keActivityGrammarCheckBinding2.setTotalCount(((UpdateGrammarIndex)grammarRequest0).getTotalCount());
                    KeActivityGrammarCheckBinding keActivityGrammarCheckBinding3 = GrammarCheckActivity.this.binding;
                    if(keActivityGrammarCheckBinding3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    }
                    else {
                        keActivityGrammarCheckBinding0 = keActivityGrammarCheckBinding3;
                    }
                    keActivityGrammarCheckBinding0.setCurrentIndex(((UpdateGrammarIndex)grammarRequest0).getCurrentIndex() + 1);
                    return;
                }
                if(grammarRequest0 instanceof FinishGrammarCheck) {
                    Keditor.clickEvent$default(Keditor.INSTANCE, "kGrammarCheck", "close", null, 4, null);
                    KeActivityGrammarCheckBinding keActivityGrammarCheckBinding4 = GrammarCheckActivity.this.binding;
                    if(keActivityGrammarCheckBinding4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    }
                    else {
                        keActivityGrammarCheckBinding0 = keActivityGrammarCheckBinding4;
                    }
                    a a0 = new a(GrammarCheckActivity.this, grammarRequest0);
                    keActivityGrammarCheckBinding0.keGrammarEditorView.postDelayed(a0, 500L);
                }
            }

            private static final void invoke$lambda$1(GrammarCheckActivity grammarCheckActivity0, GrammarRequest grammarRequest0) {
                Intrinsics.checkNotNullParameter(grammarCheckActivity0, "this$0");
                grammarCheckActivity0.saveCDMData();
                grammarCheckActivity0.finishGrammarCheck(((FinishGrammarCheck)grammarRequest0).getCheckedAllErrors());
            }
        }));
    }

    @Override  // com.kakao.keditor.base.KeditorBaseAppCompatActivity
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        ViewDataBinding viewDataBinding0 = DataBindingUtil.setContentView(this, layout.ke_activity_grammar_check);
        Intrinsics.checkNotNullExpressionValue(viewDataBinding0, "setContentView(...)");
        KeActivityGrammarCheckBinding keActivityGrammarCheckBinding0 = (KeActivityGrammarCheckBinding)viewDataBinding0;
        this.binding = keActivityGrammarCheckBinding0;
        if(keActivityGrammarCheckBinding0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            keActivityGrammarCheckBinding0 = null;
        }
        t t0 = new t(this, 5);
        keActivityGrammarCheckBinding0.keClose.setOnClickListener(t0);
        this.initViewModel();
        this.initEditorView();
        this.initBottomEditWindow();
    }

    private static final void onCreate$lambda$0(GrammarCheckActivity grammarCheckActivity0, View view0) {
        Intrinsics.checkNotNullParameter(grammarCheckActivity0, "this$0");
        grammarCheckActivity0.showExitDialog();
    }

    private final void saveCDMData() {
        GrammarCheckViewModel grammarCheckViewModel0 = this.getVm();
        KeActivityGrammarCheckBinding keActivityGrammarCheckBinding0 = this.binding;
        if(keActivityGrammarCheckBinding0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            keActivityGrammarCheckBinding0 = null;
        }
        grammarCheckViewModel0.saveCDMData(keActivityGrammarCheckBinding0.keGrammarEditorView.exportToJson());
    }

    private final void setGrammarError(KeditorGrammarError keditorGrammarError0) {
        ScrollTo viewRequest$ScrollTo0 = new ScrollTo(0, keditorGrammarError0.getItem(), true, new Function0(this) {
            final KeditorGrammarError $error;

            {
                this.$error = keditorGrammarError0;
                GrammarCheckActivity.this = grammarCheckActivity0;
                super(0);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                this.invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                ScrollToSpecificTextIndex viewRequest$ScrollToSpecificTextIndex0 = new ScrollToSpecificTextIndex(this.$error.getItem(), this.$error.getItemInnerIndex(), this.$error.getStartIndex());
                KeEvent.INSTANCE.postInScope(viewRequest$ScrollToSpecificTextIndex0);
                GrammarCheckActivity.this.highlightGrammarError(this.$error, true);
            }
        }, 1, null);
        KeEvent.INSTANCE.postInScope(viewRequest$ScrollTo0);
        KeActivityGrammarCheckBinding keActivityGrammarCheckBinding0 = this.binding;
        if(keActivityGrammarCheckBinding0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            keActivityGrammarCheckBinding0 = null;
        }
        keActivityGrammarCheckBinding0.keGrammarEditWindow.setGrammarError(keditorGrammarError0.getGrammarError());
    }

    @Override  // com.kakao.keditor.base.KeditorBaseAppCompatActivity
    public void setOnBackPressedCallback(@Nullable OnBackPressedCallback onBackPressedCallback0) {
        this.onBackPressedCallback = onBackPressedCallback0;
    }

    private final void showExitDialog() {
        Keditor.clickEvent$default(Keditor.INSTANCE, "kGrammarCheck", "close", null, 4, null);
        Integer integer0 = string.grammar_check_exit_title;
        Integer integer1 = string.grammar_check_exit_content;
        com.kakao.keditor.plugin.pluginspec.grammarcheck.GrammarCheckActivity.showExitDialog.1 grammarCheckActivity$showExitDialog$10 = new Function0() {
            {
                GrammarCheckActivity.this = grammarCheckActivity0;
                super(0);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                this.invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                GrammarCheckActivity.this.saveCDMData();
                GrammarCheckActivity.this.finishGrammarCheck(false);
            }
        };
        Companion.newInstance$default(KeditorAlertDialog.Companion, integer0, integer1, 0, 0, false, grammarCheckActivity$showExitDialog$10, 28, null).show(this.getSupportFragmentManager(), null);
    }
}

