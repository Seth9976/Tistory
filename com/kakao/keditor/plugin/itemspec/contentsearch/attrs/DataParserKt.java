package com.kakao.keditor.plugin.itemspec.contentsearch.attrs;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0000\n\u0000\u001A\u001F\u0010\u0000\u001A\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u0004\u0018\u00010\u0003H\u0080\b¨\u0006\u0004"}, d2 = {"toListOrNull", "", "T", "", "keditor_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDataParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataParser.kt\ncom/kakao/keditor/plugin/itemspec/contentsearch/attrs/DataParserKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,105:1\n800#2,11:106\n*S KotlinDebug\n*F\n+ 1 DataParser.kt\ncom/kakao/keditor/plugin/itemspec/contentsearch/attrs/DataParserKt\n*L\n103#1:106,11\n*E\n"})
public final class DataParserKt {
    public static final List toListOrNull(Object object0) {
        if(object0 instanceof List) {
            List list0 = new ArrayList();
            for(Object object1: ((Iterable)object0)) {
                Intrinsics.reifiedOperationMarker(3, "T");
                if(object1 != null) {
                    list0.add(object1);
                }
            }
            return list0;
        }
        return null;
    }
}

