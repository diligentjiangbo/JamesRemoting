package bo.jiang.james.remoting;

import bo.jiang.james.remoting.netty.NettyRemotingProcessor;

import java.nio.channels.Channel;
import java.util.concurrent.ExecutorService;

/**
 * @author shumpert.jiang
 * @date 2017/6/28 0028 17:55
 */
public interface RemotingServer extends RemotingService {
  void registerProcessor(int requestCode, NettyRemotingProcessor nettyRemotingProcessor, ExecutorService executorService);
  void registerDefaultProcessor(NettyRemotingProcessor nettyRemotingProcessor, ExecutorService executorService);
  RemotingCommand invokeSync();
  RemotingCommand invokeAsync();
}
