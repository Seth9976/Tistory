package com.kakao.keditor.plugin.pluginspec.codeblock.editor;

import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.room.a;
import com.kakao.keditor.plugin.itemspec.codeblock.CodeBlockItem;
import com.kakao.keditor.plugin.pluginspec.codeblock.editor.actions.OnChangeLanguageClicked;
import com.kakao.keditor.plugin.pluginspec.codeblock.editor.actions.OnCloseClicked;
import com.kakao.keditor.plugin.pluginspec.codeblock.editor.actions.OnConfirmClicked;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000E\u0010\u001A\u001A\u00020\u001B2\u0006\u0010\u001C\u001A\u00020\u001DJ\u000E\u0010\u001E\u001A\u00020\u001B2\u0006\u0010\u001C\u001A\u00020\u001DJ\u000E\u0010\u001F\u001A\u00020\u001B2\u0006\u0010\u001C\u001A\u00020\u001DJ\u000E\u0010 \u001A\u00020\u001B2\u0006\u0010!\u001A\u00020\u000EJ\u0010\u0010\"\u001A\u00020\u001B2\b\u0010#\u001A\u0004\u0018\u00010\u000ER\u0017\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0017\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u000B0\u0006¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\tR\"\u0010\r\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u000E0\u0006X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u000F\u0010\t\"\u0004\b\u0010\u0010\u0011R\u001F\u0010\u0012\u001A\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0006¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\tRJ\u0010\u0015\u001A2\u0012.\u0012,\u0012\u0004\u0012\u00020\u000E \u0014*\u0016\u0012\u0004\u0012\u00020\u000E\u0018\u00010\u0016j\n\u0012\u0004\u0012\u00020\u000E\u0018\u0001`\u00170\u0016j\b\u0012\u0004\u0012\u00020\u000E`\u00170\u0006X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0018\u0010\t\"\u0004\b\u0019\u0010\u0011¨\u0006$"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/codeblock/editor/CodeBlockViewModel;", "Landroidx/lifecycle/ViewModel;", "handle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "action", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kakao/keditor/plugin/pluginspec/codeblock/editor/actions/Action;", "getAction", "()Landroidx/lifecycle/MutableLiveData;", "codeBlockItem", "Lcom/kakao/keditor/plugin/itemspec/codeblock/CodeBlockItem;", "getCodeBlockItem", "currentLanguage", "", "getCurrentLanguage", "setCurrentLanguage", "(Landroidx/lifecycle/MutableLiveData;)V", "isEditMode", "", "kotlin.jvm.PlatformType", "supportedLanguages", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getSupportedLanguages", "setSupportedLanguages", "onChangeLanguageClicked", "", "v", "Landroid/view/View;", "onCloseClicked", "onConfirmClicked", "setCode", "code", "setLanguage", "language", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCodeBlockViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CodeBlockViewModel.kt\ncom/kakao/keditor/plugin/pluginspec/codeblock/editor/CodeBlockViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n1#2:59\n*E\n"})
public final class CodeBlockViewModel extends ViewModel {
    @NotNull
    private final MutableLiveData action;
    @NotNull
    private final MutableLiveData codeBlockItem;
    @NotNull
    private MutableLiveData currentLanguage;
    @NotNull
    private final MutableLiveData isEditMode;
    @NotNull
    private MutableLiveData supportedLanguages;

    public CodeBlockViewModel(@NotNull SavedStateHandle savedStateHandle0) {
        Intrinsics.checkNotNullParameter(savedStateHandle0, "handle");
        super();
        this.action = new MutableLiveData();
        this.isEditMode = new MutableLiveData(Boolean.valueOf(savedStateHandle0.get("data") != null));
        MutableLiveData mutableLiveData0 = savedStateHandle0.getLiveData("data", new CodeBlockItem());
        this.codeBlockItem = mutableLiveData0;
        ArrayList arrayList0 = (ArrayList)savedStateHandle0.get("languages");
        if(arrayList0 == null) {
            throw new IllegalArgumentException("Missing String Array extra LANGUAGES: CodeBlockItem");
        }
        this.supportedLanguages = new MutableLiveData(arrayList0);
        this.currentLanguage = new MutableLiveData();
        CodeBlockItem codeBlockItem0 = (CodeBlockItem)mutableLiveData0.getValue();
        ArrayList arrayList1 = (ArrayList)this.supportedLanguages.getValue();
        String s = null;
        if(arrayList1 == null) {
        label_23:
            ArrayList arrayList2 = (ArrayList)this.supportedLanguages.getValue();
            if(arrayList2 != null) {
                s = (String)CollectionsKt___CollectionsKt.firstOrNull(arrayList2);
            }
        }
        else {
            Object object0 = null;
            for(Object object1: arrayList1) {
                if(p.equals(((String)object1), (codeBlockItem0 == null ? null : codeBlockItem0.getLanguageName()), true)) {
                    object0 = object1;
                    break;
                }
            }
            if(((String)object0) != null) {
                s = (String)object0;
                this.setLanguage(s);
                return;
            }
            goto label_23;
        }
        this.setLanguage(s);
    }

    @NotNull
    public final MutableLiveData getAction() {
        return this.action;
    }

    @NotNull
    public final MutableLiveData getCodeBlockItem() {
        return this.codeBlockItem;
    }

    @NotNull
    public final MutableLiveData getCurrentLanguage() {
        return this.currentLanguage;
    }

    @NotNull
    public final MutableLiveData getSupportedLanguages() {
        return this.supportedLanguages;
    }

    @NotNull
    public final MutableLiveData isEditMode() {
        return this.isEditMode;
    }

    public final void onChangeLanguageClicked(@NotNull View view0) {
        Intrinsics.checkNotNullParameter(view0, "v");
        this.action.setValue(OnChangeLanguageClicked.INSTANCE);
    }

    public final void onCloseClicked(@NotNull View view0) {
        Intrinsics.checkNotNullParameter(view0, "v");
        this.action.setValue(OnCloseClicked.INSTANCE);
    }

    public final void onConfirmClicked(@NotNull View view0) {
        Intrinsics.checkNotNullParameter(view0, "v");
        this.action.setValue(OnConfirmClicked.INSTANCE);
    }

    public final void setCode(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "code");
        CodeBlockItem codeBlockItem0 = (CodeBlockItem)this.codeBlockItem.getValue();
        if(codeBlockItem0 != null) {
            codeBlockItem0.setCode(s);
        }
    }

    public final void setCurrentLanguage(@NotNull MutableLiveData mutableLiveData0) {
        Intrinsics.checkNotNullParameter(mutableLiveData0, "<set-?>");
        this.currentLanguage = mutableLiveData0;
    }

    public final void setLanguage(@Nullable String s) {
        String s1;
        CodeBlockItem codeBlockItem0 = (CodeBlockItem)this.codeBlockItem.getValue();
        if(codeBlockItem0 != null) {
            if(s == null) {
                s1 = "";
            }
            else {
                s1 = a.k(Locale.ROOT, "ROOT", s, Locale.ROOT, "toLowerCase(...)");
                if(s1 == null) {
                    s1 = "";
                }
            }
            codeBlockItem0.setLanguageName(s1);
        }
        this.currentLanguage.setValue(s);
    }

    public final void setSupportedLanguages(@NotNull MutableLiveData mutableLiveData0) {
        Intrinsics.checkNotNullParameter(mutableLiveData0, "<set-?>");
        this.supportedLanguages = mutableLiveData0;
    }
}

