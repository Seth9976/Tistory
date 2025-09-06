package com.google.accompanist.pager;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.RequiresOptIn;
import kotlin.annotation.AnnotationRetention;

@Retention(RetentionPolicy.CLASS)
@Deprecated(message = "\naccompanist/pager is deprecated.\nThe androidx.compose equivalent of Pager is androidx.compose.foundation.pager.Pager.\nFor more migration information, please visit https://google.github.io/accompanist/pager/#migration\n")
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001B\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/google/accompanist/pager/ExperimentalPagerApi;", "", "pager_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@RequiresOptIn(message = "Accompanist Pager is experimental. The API may be changed in the future.")
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
public @interface ExperimentalPagerApi {
}

