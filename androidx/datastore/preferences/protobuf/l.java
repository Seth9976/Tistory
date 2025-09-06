package androidx.datastore.preferences.protobuf;

import java.util.Comparator;

public final class l implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        ByteIterator byteString$ByteIterator0 = ((ByteString)object0).iterator();
        ByteIterator byteString$ByteIterator1 = ((ByteString)object1).iterator();
        while(byteString$ByteIterator0.hasNext() && byteString$ByteIterator1.hasNext()) {
            int v = ((int)(byteString$ByteIterator0.nextByte() & 0xFF)).compareTo(((int)(byteString$ByteIterator1.nextByte() & 0xFF)));
            if(v != 0) {
                return v;
            }
            if(false) {
                break;
            }
        }
        return ((ByteString)object0).size().compareTo(((ByteString)object1).size());
    }
}

