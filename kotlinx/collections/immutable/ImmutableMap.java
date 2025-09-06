package kotlinx.collections.immutable;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000E\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003R$\u0010\u0004\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005X¦\u0004¢\u0006\u0006\u001A\u0004\b\n\u0010\bR\u0018\u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\u00010\fX¦\u0004¢\u0006\u0006\u001A\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"Lkotlinx/collections/immutable/ImmutableMap;", "K", "V", "", "entries", "Lkotlinx/collections/immutable/ImmutableSet;", "", "getEntries", "()Lkotlinx/collections/immutable/ImmutableSet;", "keys", "getKeys", "values", "Lkotlinx/collections/immutable/ImmutableCollection;", "getValues", "()Lkotlinx/collections/immutable/ImmutableCollection;", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface ImmutableMap extends Map, KMappedMarker {
    @NotNull
    ImmutableSet getEntries();

    @NotNull
    ImmutableSet getKeys();

    @NotNull
    ImmutableCollection getValues();
}

