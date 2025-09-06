package io.reactivex.internal.operators.flowable;

import org.reactivestreams.Publisher;

public interface FlowablePublishClassic {
    int publishBufferSize();

    Publisher publishSource();
}

