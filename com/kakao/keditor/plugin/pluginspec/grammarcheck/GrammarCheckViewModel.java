package com.kakao.keditor.plugin.pluginspec.grammarcheck;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.kakao.keditor.plugin.itemspec.grammarcheck.GrammarCheckResponse;
import com.kakao.keditor.plugin.itemspec.grammarcheck.KeditorGrammarError;
import com.kakao.keditor.plugin.itemspec.grammarcheck.SentenceGrammarCheck;
import com.kakao.keditor.plugin.itemspec.grammarcheck.SingleGrammarCheck;
import com.kakao.keditor.plugin.itemspec.paragraph.GrammarCheckTextItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010+\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000E\u0010\u001A\u001A\u00020\u001B2\u0006\u0010\u001C\u001A\u00020\u0015J\b\u0010\u001D\u001A\u00020\u001BH\u0002J\u0010\u0010\u001E\u001A\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001FH\u0002J.\u0010!\u001A\u00020\u001B2\f\u0010\"\u001A\b\u0012\u0004\u0012\u00020#0\u001F2\u0018\u0010$\u001A\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001F\u0012\u0004\u0012\u00020\u001B0%J\u0006\u0010&\u001A\u00020\u001BJ\u000E\u0010\'\u001A\u00020\u001B2\u0006\u0010(\u001A\u00020\u0006J\b\u0010)\u001A\u00020\u001BH\u0002J\u000E\u0010*\u001A\u00020\u001B2\u0006\u0010+\u001A\u00020\u0015J\u0006\u0010,\u001A\u00020\u001BR\u0010\u0010\u0005\u001A\u0004\u0018\u00010\u0006X\u0082\u000E¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\bX\u0082\u000E¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u000B0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\f\u001A\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001A\u0004\b\r\u0010\u000ER\u0014\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00060\u0010X\u0082.¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u000B0\n8F¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001A\b\u0012\u0004\u0012\u00020\u00150\n¢\u0006\b\n\u0000\u001A\u0004\b\u0016\u0010\u0013R\u0017\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\u00060\b8F¢\u0006\u0006\u001A\u0004\b\u0018\u0010\u0019R\u000E\u0010\u0002\u001A\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/grammarcheck/GrammarCheckViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/kakao/keditor/plugin/pluginspec/grammarcheck/GrammarCheckRepository;", "(Lcom/kakao/keditor/plugin/pluginspec/grammarcheck/GrammarCheckRepository;)V", "_currentGrammarError", "Lcom/kakao/keditor/plugin/itemspec/grammarcheck/KeditorGrammarError;", "_grammarErrors", "", "_grammarRequest", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kakao/keditor/plugin/pluginspec/grammarcheck/GrammarRequest;", "currentGrammarError", "getCurrentGrammarError", "()Lcom/kakao/keditor/plugin/itemspec/grammarcheck/KeditorGrammarError;", "errorIterator", "", "grammarRequest", "getGrammarRequest", "()Landroidx/lifecycle/MutableLiveData;", "originalCdmJson", "", "getOriginalCdmJson", "remainingGrammarErrors", "getRemainingGrammarErrors", "()Ljava/util/List;", "editCurrentGrammarError", "", "edited", "fetchOriginalCDMJson", "getSavedGrammarCheckErrors", "", "Lcom/kakao/keditor/plugin/itemspec/grammarcheck/SingleGrammarCheck;", "initGrammarErrors", "items", "Lcom/kakao/keditor/plugin/itemspec/paragraph/GrammarCheckTextItem;", "afterInit", "Lkotlin/Function1;", "iterateToNextGrammarError", "onGrammarErrorClicked", "target", "removeCurrentGrammarError", "saveCDMData", "cdmJson", "updateGrammarIndex", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nGrammarCheckViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrammarCheckViewModel.kt\ncom/kakao/keditor/plugin/pluginspec/grammarcheck/GrammarCheckViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,142:1\n1855#2:143\n1864#2,3:144\n1856#2:147\n1360#2:148\n1446#2,5:149\n819#2:154\n847#2,2:155\n*S KotlinDebug\n*F\n+ 1 GrammarCheckViewModel.kt\ncom/kakao/keditor/plugin/pluginspec/grammarcheck/GrammarCheckViewModel\n*L\n50#1:143\n51#1:144,3\n50#1:147\n139#1:148\n139#1:149,5\n139#1:154\n139#1:155,2\n*E\n"})
public final class GrammarCheckViewModel extends ViewModel {
    @Nullable
    private KeditorGrammarError _currentGrammarError;
    @NotNull
    private List _grammarErrors;
    @NotNull
    private final MutableLiveData _grammarRequest;
    private ListIterator errorIterator;
    @NotNull
    private final MutableLiveData originalCdmJson;
    @NotNull
    private final GrammarCheckRepository repository;

    public GrammarCheckViewModel(@NotNull GrammarCheckRepository grammarCheckRepository0) {
        Intrinsics.checkNotNullParameter(grammarCheckRepository0, "repository");
        super();
        this.repository = grammarCheckRepository0;
        this.originalCdmJson = new MutableLiveData();
        this._grammarRequest = new MutableLiveData();
        this._grammarErrors = new ArrayList();
        this.fetchOriginalCDMJson();
    }

    public final void editCurrentGrammarError(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "edited");
        KeditorGrammarError keditorGrammarError0 = this._currentGrammarError;
        if(keditorGrammarError0 != null) {
            EditGrammarText editGrammarText0 = new EditGrammarText(keditorGrammarError0, s);
            this._grammarRequest.setValue(editGrammarText0);
            int v = s.length();
            int v1 = keditorGrammarError0.getGrammarError().getInput().length();
            while(true) {
                ListIterator listIterator0 = this.errorIterator;
                if(listIterator0 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("errorIterator");
                    listIterator0 = null;
                }
                if(!listIterator0.hasNext()) {
                    break;
                }
                ListIterator listIterator1 = this.errorIterator;
                if(listIterator1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("errorIterator");
                    listIterator1 = null;
                }
                KeditorGrammarError keditorGrammarError1 = (KeditorGrammarError)listIterator1.next();
                if(!Intrinsics.areEqual(keditorGrammarError1.getItem(), keditorGrammarError0.getItem()) || keditorGrammarError1.getItemInnerIndex() != keditorGrammarError0.getItemInnerIndex()) {
                    break;
                }
                keditorGrammarError1.setStartIndex(keditorGrammarError1.getStartIndex() + (v - v1));
            }
            do {
                ListIterator listIterator2 = this.errorIterator;
                if(listIterator2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("errorIterator");
                    listIterator2 = null;
                }
                if(!listIterator2.hasPrevious()) {
                    break;
                }
                ListIterator listIterator3 = this.errorIterator;
                if(listIterator3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("errorIterator");
                    listIterator3 = null;
                }
            }
            while(!Intrinsics.areEqual(keditorGrammarError0, ((KeditorGrammarError)listIterator3.previous())));
            this.removeCurrentGrammarError();
            this.iterateToNextGrammarError();
        }
    }

    private final void fetchOriginalCDMJson() {
        String s = this.repository.getSavedCDMJson();
        this.originalCdmJson.setValue(s);
    }

    @Nullable
    public final KeditorGrammarError getCurrentGrammarError() {
        return this._currentGrammarError;
    }

    @NotNull
    public final MutableLiveData getGrammarRequest() {
        return this._grammarRequest;
    }

    @NotNull
    public final MutableLiveData getOriginalCdmJson() {
        return this.originalCdmJson;
    }

    @NotNull
    public final List getRemainingGrammarErrors() {
        return this._grammarErrors;
    }

    private final List getSavedGrammarCheckErrors() {
        GrammarCheckResponse grammarCheckResponse0 = this.repository.getGrammarCheckResult();
        if(grammarCheckResponse0 != null) {
            List list0 = grammarCheckResponse0.getSentences();
            if(list0 != null) {
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: list0) {
                    o.addAll(arrayList0, ((SentenceGrammarCheck)object0).getResult());
                }
                List list1 = new ArrayList();
                for(Object object1: arrayList0) {
                    if(!Intrinsics.areEqual(((SingleGrammarCheck)object1).getEtype(), "no_error")) {
                        list1.add(object1);
                    }
                }
                return list1;
            }
        }
        return null;
    }

    public final void initGrammarErrors(@NotNull List list0, @NotNull Function1 function10) {
        Iterator iterator3;
        Intrinsics.checkNotNullParameter(list0, "items");
        Intrinsics.checkNotNullParameter(function10, "afterInit");
        this._grammarErrors.clear();
        List list1 = this.getSavedGrammarCheckErrors();
        if(list1 != null) {
            Iterator iterator0 = list1.iterator();
            if(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                Iterator iterator1 = list0.iterator();
                while(iterator1.hasNext()) {
                    Object object1 = iterator1.next();
                    GrammarCheckTextItem grammarCheckTextItem0 = (GrammarCheckTextItem)object1;
                    int v = 0;
                    Iterator iterator2 = grammarCheckTextItem0.parseGrammarCheckTexts().iterator();
                alab1:
                    while(true) {
                        if(!iterator2.hasNext()) {
                            iterator3 = iterator1;
                            break;
                        }
                        Object object2 = iterator2.next();
                        if(v < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        String s = (String)object2;
                        int v1 = 0;
                        int v2 = 0;
                        while(v2 >= 0) {
                            int v3 = StringsKt__StringsKt.indexOf$default(s, ((SingleGrammarCheck)object0).getInput(), v1, false, 4, null);
                            if(v3 >= 0) {
                                iterator3 = iterator1;
                                this._grammarErrors.add(new KeditorGrammarError(((SingleGrammarCheck)object0), grammarCheckTextItem0, v, v3, 0, 16, null));
                                if(iterator0.hasNext()) {
                                    v1 = ((SingleGrammarCheck)object0).getInput().length() + v3;
                                    object0 = iterator0.next();
                                    v2 = v3;
                                    iterator1 = iterator3;
                                    continue;
                                }
                                else {
                                    break alab1;
                                }
                            }
                            v2 = v3;
                        }
                        ++v;
                    }
                    iterator1 = iterator3;
                }
                this.errorIterator = this._grammarErrors.listIterator();
                function10.invoke(this.getRemainingGrammarErrors());
                return;
            }
            this.errorIterator = this._grammarErrors.listIterator();
            return;
        }
        this.errorIterator = this._grammarErrors.listIterator();
        function10.invoke(this.getRemainingGrammarErrors());
    }

    public final void iterateToNextGrammarError() {
        ListIterator listIterator0 = this.errorIterator;
        ListIterator listIterator1 = null;
        if(listIterator0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("errorIterator");
            listIterator0 = null;
        }
        if(listIterator0.hasNext()) {
            ListIterator listIterator2 = this.errorIterator;
            if(listIterator2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("errorIterator");
            }
            else {
                listIterator1 = listIterator2;
            }
            KeditorGrammarError keditorGrammarError0 = (KeditorGrammarError)listIterator1.next();
            KeditorGrammarError keditorGrammarError1 = this._currentGrammarError;
            this._currentGrammarError = keditorGrammarError0;
            ChangeFocusedGrammar changeFocusedGrammar0 = new ChangeFocusedGrammar(keditorGrammarError1, keditorGrammarError0);
            this._grammarRequest.setValue(changeFocusedGrammar0);
            return;
        }
        FinishGrammarCheck finishGrammarCheck0 = new FinishGrammarCheck(true);
        this._grammarRequest.setValue(finishGrammarCheck0);
    }

    public final void onGrammarErrorClicked(@NotNull KeditorGrammarError keditorGrammarError0) {
        Intrinsics.checkNotNullParameter(keditorGrammarError0, "target");
        this.errorIterator = this._grammarErrors.listIterator();
        while(true) {
            ListIterator listIterator0 = this.errorIterator;
            ListIterator listIterator1 = null;
            if(listIterator0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("errorIterator");
                listIterator0 = null;
            }
            if(!listIterator0.hasNext()) {
                break;
            }
            ListIterator listIterator2 = this.errorIterator;
            if(listIterator2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("errorIterator");
            }
            else {
                listIterator1 = listIterator2;
            }
            KeditorGrammarError keditorGrammarError1 = (KeditorGrammarError)listIterator1.next();
            if(Intrinsics.areEqual(keditorGrammarError1, keditorGrammarError0)) {
                KeditorGrammarError keditorGrammarError2 = this._currentGrammarError;
                this._currentGrammarError = keditorGrammarError1;
                ChangeFocusedGrammar changeFocusedGrammar0 = new ChangeFocusedGrammar(keditorGrammarError2, keditorGrammarError1);
                this._grammarRequest.setValue(changeFocusedGrammar0);
                return;
            }
        }
    }

    private final void removeCurrentGrammarError() {
        ListIterator listIterator0 = this.errorIterator;
        if(listIterator0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("errorIterator");
            listIterator0 = null;
        }
        listIterator0.remove();
        KeditorGrammarError keditorGrammarError0 = this._currentGrammarError;
        if(keditorGrammarError0 != null) {
            RemoveGrammarError removeGrammarError0 = new RemoveGrammarError(keditorGrammarError0);
            this._grammarRequest.setValue(removeGrammarError0);
            this._currentGrammarError = null;
        }
    }

    public final void saveCDMData(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "cdmJson");
        this.repository.putSavedCDMJson(s);
    }

    public final void updateGrammarIndex() {
        int v = this._grammarErrors.size();
        UpdateGrammarIndex updateGrammarIndex0 = new UpdateGrammarIndex(CollectionsKt___CollectionsKt.indexOf(this._grammarErrors, this._currentGrammarError), v);
        this._grammarRequest.setValue(updateGrammarIndex0);
    }
}

