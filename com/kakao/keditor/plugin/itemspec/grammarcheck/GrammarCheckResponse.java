package com.kakao.keditor.plugin.itemspec.grammarcheck;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000E\u0010\u0002\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\f\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001B\u0010\r\u001A\u00020\u00002\u0010\b\u0002\u0010\u0002\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000E\u001A\u00020\u00072\b\u0010\u000F\u001A\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001A\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001A\u00020\u0014HÖ\u0001R\u0011\u0010\u0006\u001A\u00020\u00078F¢\u0006\u0006\u001A\u0004\b\b\u0010\tR\u0019\u0010\u0002\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000B¨\u0006\u0015"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/grammarcheck/GrammarCheckResponse;", "Ljava/io/Serializable;", "sentences", "", "Lcom/kakao/keditor/plugin/itemspec/grammarcheck/SentenceGrammarCheck;", "(Ljava/util/List;)V", "hasGrammarError", "", "getHasGrammarError", "()Z", "getSentences", "()Ljava/util/List;", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nGrammarModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrammarModel.kt\ncom/kakao/keditor/plugin/itemspec/grammarcheck/GrammarCheckResponse\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,48:1\n1360#2:49\n1446#2,5:50\n1747#2,3:55\n*S KotlinDebug\n*F\n+ 1 GrammarModel.kt\ncom/kakao/keditor/plugin/itemspec/grammarcheck/GrammarCheckResponse\n*L\n26#1:49\n26#1:50,5\n26#1:55,3\n*E\n"})
public final class GrammarCheckResponse implements Serializable {
    @Nullable
    private final List sentences;

    public GrammarCheckResponse(@Nullable List list0) {
        this.sentences = list0;
    }

    @Nullable
    public final List component1() {
        return this.sentences;
    }

    @NotNull
    public final GrammarCheckResponse copy(@Nullable List list0) {
        return new GrammarCheckResponse(list0);
    }

    public static GrammarCheckResponse copy$default(GrammarCheckResponse grammarCheckResponse0, List list0, int v, Object object0) {
        if((v & 1) != 0) {
            list0 = grammarCheckResponse0.sentences;
        }
        return grammarCheckResponse0.copy(list0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof GrammarCheckResponse ? Intrinsics.areEqual(this.sentences, ((GrammarCheckResponse)object0).sentences) : false;
    }

    public final boolean getHasGrammarError() {
        List list0 = this.sentences;
        if(list0 != null) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: list0) {
                o.addAll(arrayList0, ((SentenceGrammarCheck)object0).getResult());
            }
            if(!arrayList0.isEmpty()) {
                for(Object object1: arrayList0) {
                    if(!Intrinsics.areEqual(((SingleGrammarCheck)object1).getEtype(), "no_error")) {
                        return true;
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
        return false;
    }

    @Nullable
    public final List getSentences() {
        return this.sentences;
    }

    @Override
    public int hashCode() {
        return this.sentences == null ? 0 : this.sentences.hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        return "GrammarCheckResponse(sentences=" + this.sentences + ")";
    }
}

