package org.opendaylight.syslogsvr;

import org.apache.jmeter.protocol.tcp.sampler.ReadException;
import org.apache.jmeter.protocol.tcp.sampler.TCPClientImpl;

import java.io.InputStream;

/**
 * Created by Wenbo Hu on 2016/1/5.
 */
public class NoRespTCPClient extends TCPClientImpl {
    @Override
    public String read(InputStream is) throws ReadException {
        return "";
    }
}
