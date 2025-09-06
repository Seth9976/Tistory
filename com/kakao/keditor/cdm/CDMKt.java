package com.kakao.keditor.cdm;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kakao.keditor.delegate.JsonConverterKt;
import com.kakao.keditor.exception.MissingJsonConverterException;
import com.squareup.moshi.Moshi.Builder;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0000\u001A\f\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toJson", "", "Lcom/kakao/keditor/cdm/CDM;", "keditor_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCDM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CDM.kt\ncom/kakao/keditor/cdm/CDMKt\n+ 2 JsonConverter.kt\ncom/kakao/keditor/delegate/JsonConverterKt\n*L\n1#1,42:1\n26#2,14:43\n*S KotlinDebug\n*F\n+ 1 CDM.kt\ncom/kakao/keditor/cdm/CDMKt\n*L\n42#1:43,14\n*E\n"})
public final class CDMKt {
    @NotNull
    public static final String toJson(@NotNull CDM cDM0) {
        String s;
        Intrinsics.checkNotNullParameter(cDM0, "<this>");
        Class class0 = JsonConverterKt.jsonConverterClass();
        if(Intrinsics.areEqual(class0, Gson.class)) {
            s = new GsonBuilder().create().toJson(cDM0);
            Intrinsics.checkNotNull(s);
            return s;
        }
        if(!Intrinsics.areEqual(class0, Moshi.class)) {
            throw new MissingJsonConverterException();
        }
        s = new Builder().add(new KotlinJsonAdapterFactory()).build().adapter(CDM.class).toJson(cDM0);
        Intrinsics.checkNotNull(s);
        return s;
    }
}

