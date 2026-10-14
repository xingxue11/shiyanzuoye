package shiyan.shiyan10.renwu2.service;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class EncryptInputStream extends FilterInputStream {
    public EncryptInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int b = super.read();
        if(b != -1){
            b = b + 1;
        }
        return b;
    }
}
