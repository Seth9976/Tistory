package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.Pools.Pool;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import com.bumptech.glide.util.Preconditions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DecodePath {
    interface DecodeCallback {
        @NonNull
        Resource onResourceDecoded(@NonNull Resource arg1);
    }

    public final Class a;
    public final List b;
    public final ResourceTranscoder c;
    public final Pool d;
    public final String e;

    public DecodePath(Class class0, Class class1, Class class2, List list0, ResourceTranscoder resourceTranscoder0, Pool pools$Pool0) {
        this.a = class0;
        this.b = list0;
        this.c = resourceTranscoder0;
        this.d = pools$Pool0;
        this.e = "Failed DecodePath{" + class0.getSimpleName() + "->" + class1.getSimpleName() + "->" + class2.getSimpleName() + "}";
    }

    public final Resource a(DataRewinder dataRewinder0, int v, int v1, Options options0, List list0) {
        List list1 = this.b;
        int v2 = list1.size();
        Resource resource0 = null;
        for(int v3 = 0; v3 < v2; ++v3) {
            ResourceDecoder resourceDecoder0 = (ResourceDecoder)list1.get(v3);
            try {
                if(resourceDecoder0.handles(dataRewinder0.rewindAndGet(), options0)) {
                    resource0 = resourceDecoder0.decode(dataRewinder0.rewindAndGet(), v, v1, options0);
                }
            }
            catch(IOException | RuntimeException | OutOfMemoryError iOException0) {
                if(Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + resourceDecoder0, iOException0);
                }
                list0.add(iOException0);
            }
            if(resource0 != null) {
                break;
            }
        }
        if(resource0 != null) {
            return resource0;
        }
        ArrayList arrayList0 = new ArrayList(list0);
        throw new GlideException(this.e, arrayList0);
    }

    public Resource decode(DataRewinder dataRewinder0, int v, int v1, @NonNull Options options0, DecodeCallback decodePath$DecodeCallback0) throws GlideException {
        Resource resource0;
        List list0 = (List)Preconditions.checkNotNull(this.d.acquire());
        try {
            resource0 = this.a(dataRewinder0, v, v1, options0, list0);
        }
        finally {
            this.d.release(list0);
        }
        Resource resource1 = decodePath$DecodeCallback0.onResourceDecoded(resource0);
        return this.c.transcode(resource1, options0);
    }

    @Override
    public String toString() {
        return "DecodePath{ dataClass=" + this.a + ", decoders=" + this.b + ", transcoder=" + this.c + '}';
    }
}

